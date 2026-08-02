package okio;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n+ 2 -JvmPlatform.kt\nokio/_JvmPlatformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 5 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 6 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,444:1\n40#2:445\n40#2:447\n40#2:448\n40#2:449\n40#2:450\n40#2:451\n40#2:452\n40#2:453\n40#2:457\n40#2:459\n1#3:446\n63#4:454\n63#4:455\n63#4:456\n51#5:458\n85#6:460\n85#6:461\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n*L\n69#1:445\n81#1:447\n92#1:448\n105#1:449\n119#1:450\n129#1:451\n139#1:452\n151#1:453\n221#1:457\n287#1:459\n169#1:454\n195#1:455\n202#1:456\n248#1:458\n345#1:460\n374#1:461\n*E\n"})
/* renamed from: okio.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1195j implements Closeable {
    public final boolean a;
    public boolean b;
    public int c;
    public final ReentrantLock d = new ReentrantLock();

    @SourceDebugExtension({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n40#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n*L\n410#1:446\n*E\n"})
    /* renamed from: okio.j$a */
    public static final class a implements J {
        public final AbstractC1195j a;
        public long b;
        public boolean c;

        public a(AbstractC1195j fileHandle) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.a = fileHandle;
            this.b = 0L;
        }

        @Override // okio.J, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.c) {
                return;
            }
            this.c = true;
            AbstractC1195j abstractC1195j = this.a;
            ReentrantLock reentrantLock = abstractC1195j.d;
            reentrantLock.lock();
            try {
                int i = abstractC1195j.c - 1;
                abstractC1195j.c = i;
                if (i == 0 && abstractC1195j.b) {
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    abstractC1195j.d();
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // okio.J, java.io.Flushable
        public final void flush() {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            this.a.l();
        }

        @Override // okio.J
        public final L timeout() {
            return L.NONE;
        }

        @Override // okio.J
        public final void write(C1190e source, long j) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.b;
            AbstractC1195j abstractC1195j = this.a;
            abstractC1195j.getClass();
            C1187b.b(source.b, 0L, j);
            long j3 = j2 + j;
            long j4 = j2;
            while (j4 < j3) {
                G g = source.a;
                Intrinsics.checkNotNull(g);
                int min = (int) Math.min(j3 - j4, g.c - g.b);
                abstractC1195j.t(j4, g.a, g.b, min);
                int i = g.b + min;
                g.b = i;
                long j5 = min;
                j4 += j5;
                source.b -= j5;
                if (i == g.c) {
                    source.a = g.a();
                    H.a(g);
                }
            }
            this.b += j;
        }
    }

    @SourceDebugExtension({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n40#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n*L\n436#1:446\n*E\n"})
    /* renamed from: okio.j$b */
    public static final class b implements K {
        public final AbstractC1195j a;
        public long b;
        public boolean c;

        public b(AbstractC1195j fileHandle, long j) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.a = fileHandle;
            this.b = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.c) {
                return;
            }
            this.c = true;
            AbstractC1195j abstractC1195j = this.a;
            ReentrantLock reentrantLock = abstractC1195j.d;
            reentrantLock.lock();
            try {
                int i = abstractC1195j.c - 1;
                abstractC1195j.c = i;
                if (i == 0 && abstractC1195j.b) {
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    abstractC1195j.d();
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // okio.K
        public final long read(C1190e sink, long j) {
            long j2;
            long j3;
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            long j4 = this.b;
            if (j < 0) {
                throw new IllegalArgumentException(androidx.core.database.a.c(j, "byteCount < 0: ").toString());
            }
            long j5 = j + j4;
            long j6 = j4;
            while (true) {
                if (j6 >= j5) {
                    j2 = -1;
                    break;
                }
                G a0 = sink.a0(1);
                j2 = -1;
                long j7 = j5;
                int q = this.a.q(j6, a0.a, a0.c, (int) Math.min(j5 - j6, 8192 - r10));
                if (q == -1) {
                    if (a0.b == a0.c) {
                        sink.a = a0.a();
                        H.a(a0);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                    }
                } else {
                    a0.c += q;
                    long j8 = q;
                    j6 += j8;
                    sink.b += j8;
                    j5 = j7;
                }
            }
            j3 = j6 - j4;
            if (j3 != j2) {
                this.b += j3;
            }
            return j3;
        }

        @Override // okio.K
        public final L timeout() {
            return L.NONE;
        }
    }

    public AbstractC1195j(boolean z) {
        this.a = z;
    }

    public static a u(AbstractC1195j abstractC1195j) throws IOException {
        if (!abstractC1195j.a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = abstractC1195j.d;
        reentrantLock.lock();
        try {
            if (abstractC1195j.b) {
                throw new IllegalStateException("closed");
            }
            abstractC1195j.c++;
            reentrantLock.unlock();
            return new a(abstractC1195j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                return;
            }
            this.b = true;
            if (this.c != 0) {
                return;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            d();
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract void d() throws IOException;

    public final void flush() throws IOException {
        if (!this.a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            l();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public abstract void l() throws IOException;

    public abstract int q(long j, byte[] bArr, int i, int i2) throws IOException;

    public abstract long s() throws IOException;

    public final long size() throws IOException {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return s();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public abstract void t(long j, byte[] bArr, int i, int i2) throws IOException;

    public final b x(long j) throws IOException {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            this.c++;
            reentrantLock.unlock();
            return new b(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
