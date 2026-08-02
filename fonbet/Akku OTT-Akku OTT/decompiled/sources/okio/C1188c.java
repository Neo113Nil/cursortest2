package okio;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001e\u0010\u001dR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"Lokio/c;", "Lokio/L;", "<init>", "()V", "", "now", "remainingNanos", "(J)J", "", "enter", "", "exit", "()Z", "cancel", "timedOut", "Lokio/J;", "sink", "(Lokio/J;)Lokio/J;", "Lokio/K;", "source", "(Lokio/K;)Lokio/K;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "block", "withTimeout", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "newTimeoutException", "", "state", "I", "next", "Lokio/c;", "timeoutAt", "J", "Companion", "b", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,382:1\n1#2:383\n*E\n"})
/* renamed from: okio.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1188c extends L {
    private static final a Companion = new a();
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static C1188c head;
    private static final ReentrantLock lock;
    private C1188c next;
    private int state;
    private long timeoutAt;

    /* renamed from: okio.c$a */
    public static final class a {
        public static final void a(a aVar, C1188c c1188c, long j, boolean z) {
            aVar.getClass();
            if (C1188c.head == null) {
                C1188c.head = new C1188c();
                b bVar = new b("Okio Watchdog");
                bVar.setDaemon(true);
                bVar.start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                c1188c.timeoutAt = Math.min(j, c1188c.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (j != 0) {
                c1188c.timeoutAt = j + nanoTime;
            } else {
                if (!z) {
                    throw new AssertionError();
                }
                c1188c.timeoutAt = c1188c.deadlineNanoTime();
            }
            long remainingNanos = c1188c.remainingNanos(nanoTime);
            C1188c c1188c2 = C1188c.head;
            Intrinsics.checkNotNull(c1188c2);
            while (c1188c2.next != null) {
                C1188c c1188c3 = c1188c2.next;
                Intrinsics.checkNotNull(c1188c3);
                if (remainingNanos < c1188c3.remainingNanos(nanoTime)) {
                    break;
                }
                c1188c2 = c1188c2.next;
                Intrinsics.checkNotNull(c1188c2);
            }
            c1188c.next = c1188c2.next;
            c1188c2.next = c1188c;
            if (c1188c2 == C1188c.head) {
                C1188c.condition.signal();
            }
        }

        public static final void b(a aVar, C1188c c1188c) {
            aVar.getClass();
            for (C1188c c1188c2 = C1188c.head; c1188c2 != null; c1188c2 = c1188c2.next) {
                if (c1188c2.next == c1188c) {
                    c1188c2.next = c1188c.next;
                    c1188c.next = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public static C1188c c() throws InterruptedException {
            C1188c c1188c = C1188c.head;
            Intrinsics.checkNotNull(c1188c);
            C1188c c1188c2 = c1188c.next;
            if (c1188c2 == null) {
                long nanoTime = System.nanoTime();
                C1188c.condition.await(C1188c.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                C1188c c1188c3 = C1188c.head;
                Intrinsics.checkNotNull(c1188c3);
                if (c1188c3.next != null || System.nanoTime() - nanoTime < C1188c.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return C1188c.head;
            }
            long remainingNanos = c1188c2.remainingNanos(System.nanoTime());
            if (remainingNanos > 0) {
                C1188c.condition.await(remainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            C1188c c1188c4 = C1188c.head;
            Intrinsics.checkNotNull(c1188c4);
            c1188c4.next = c1188c2.next;
            c1188c2.next = null;
            c1188c2.state = 2;
            return c1188c2;
        }
    }

    /* renamed from: okio.c$b */
    public static final class b extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            C1188c c;
            while (true) {
                try {
                    C1188c.Companion.getClass();
                    reentrantLock = C1188c.lock;
                    reentrantLock.lock();
                    try {
                        C1188c.Companion.getClass();
                        c = a.c();
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (c == C1188c.head) {
                    a unused2 = C1188c.Companion;
                    C1188c.head = null;
                    return;
                } else {
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    if (c != null) {
                        c.timedOut();
                    }
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,382:1\n171#2,11:383\n171#2,11:394\n171#2,11:405\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n*L\n127#1:383,11\n133#1:394,11\n137#1:405,11\n*E\n"})
    /* renamed from: okio.c$c, reason: collision with other inner class name */
    public static final class C0165c implements J {
        public final /* synthetic */ J b;

        public C0165c(J j) {
            this.b = j;
        }

        @Override // okio.J, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            J j = this.b;
            C1188c c1188c = C1188c.this;
            c1188c.enter();
            try {
                j.close();
                Unit unit = Unit.INSTANCE;
                if (c1188c.exit()) {
                    throw c1188c.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!c1188c.exit()) {
                    throw e;
                }
                throw c1188c.access$newTimeoutException(e);
            } finally {
                c1188c.exit();
            }
        }

        @Override // okio.J, java.io.Flushable
        public final void flush() {
            J j = this.b;
            C1188c c1188c = C1188c.this;
            c1188c.enter();
            try {
                j.flush();
                Unit unit = Unit.INSTANCE;
                if (c1188c.exit()) {
                    throw c1188c.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!c1188c.exit()) {
                    throw e;
                }
                throw c1188c.access$newTimeoutException(e);
            } finally {
                c1188c.exit();
            }
        }

        @Override // okio.J
        public final L timeout() {
            return C1188c.this;
        }

        public final String toString() {
            return "AsyncTimeout.sink(" + this.b + ')';
        }

        @Override // okio.J
        public final void write(C1190e source, long j) {
            Intrinsics.checkNotNullParameter(source, "source");
            C1187b.b(source.b, 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                G g = source.a;
                Intrinsics.checkNotNull(g);
                while (true) {
                    if (j2 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        break;
                    }
                    j2 += g.c - g.b;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        g = g.f;
                        Intrinsics.checkNotNull(g);
                    }
                }
                J j3 = this.b;
                C1188c c1188c = C1188c.this;
                c1188c.enter();
                try {
                    try {
                        j3.write(source, j2);
                        Unit unit = Unit.INSTANCE;
                        if (c1188c.exit()) {
                            throw c1188c.access$newTimeoutException(null);
                        }
                        j -= j2;
                    } catch (IOException e) {
                        if (!c1188c.exit()) {
                            throw e;
                        }
                        throw c1188c.access$newTimeoutException(e);
                    }
                } catch (Throwable th) {
                    c1188c.exit();
                    throw th;
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,382:1\n171#2,11:383\n171#2,11:394\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n*L\n153#1:383,11\n157#1:394,11\n*E\n"})
    /* renamed from: okio.c$d */
    public static final class d implements K {
        public final /* synthetic */ K b;

        public d(K k) {
            this.b = k;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            K k = this.b;
            C1188c c1188c = C1188c.this;
            c1188c.enter();
            try {
                k.close();
                Unit unit = Unit.INSTANCE;
                if (c1188c.exit()) {
                    throw c1188c.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!c1188c.exit()) {
                    throw e;
                }
                throw c1188c.access$newTimeoutException(e);
            } finally {
                c1188c.exit();
            }
        }

        @Override // okio.K
        public final long read(C1190e sink, long j) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            K k = this.b;
            C1188c c1188c = C1188c.this;
            c1188c.enter();
            try {
                long read = k.read(sink, j);
                if (c1188c.exit()) {
                    throw c1188c.access$newTimeoutException(null);
                }
                return read;
            } catch (IOException e) {
                if (c1188c.exit()) {
                    throw c1188c.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                c1188c.exit();
            }
        }

        @Override // okio.K
        public final L timeout() {
            return C1188c.this;
        }

        public final String toString() {
            return "AsyncTimeout.source(" + this.b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "newCondition(...)");
        condition = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long now) {
        return this.timeoutAt - now;
    }

    @PublishedApi
    public final IOException access$newTimeoutException(IOException cause) {
        return newTimeoutException(cause);
    }

    @Override // okio.L
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                a.b(Companion, this);
                this.state = 3;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void enter() {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.state = 1;
                a.a(Companion, this, timeoutNanos, hasDeadline);
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i = this.state;
            this.state = 0;
            if (i != 1) {
                return i == 2;
            }
            a.b(Companion, this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException newTimeoutException(IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public final J sink(J sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new C0165c(sink);
    }

    public final K source(K source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new d(source);
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        enter();
        try {
            try {
                T invoke = block.invoke();
                InlineMarker.finallyStart(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                InlineMarker.finallyEnd(1);
                return invoke;
            } catch (IOException e) {
                if (exit()) {
                    throw access$newTimeoutException(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            exit();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }
}
