package Z;

import Aq.RunnableC2442a;
import C.S;
import Hy.RunnableC3170a;
import Z.o;
import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ozon.fintech.ui.input.CounterView;

/* loaded from: classes8.dex */
public final class w implements o {

    /* renamed from: g, reason: collision with root package name */
    private final q f35297g;

    /* renamed from: h, reason: collision with root package name */
    private final int f35298h;

    /* renamed from: i, reason: collision with root package name */
    private final int f35299i;

    /* renamed from: j, reason: collision with root package name */
    private final int f35300j;

    /* renamed from: l, reason: collision with root package name */
    private int f35302l;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f35291a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f35292b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentLinkedQueue f35293c = new ConcurrentLinkedQueue();

    /* renamed from: d, reason: collision with root package name */
    private final Executor f35294d = H.c.g(H.c.a());

    /* renamed from: e, reason: collision with root package name */
    private final Object f35295e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private a f35296f = null;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f35301k = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f35303a;

        /* renamed from: b, reason: collision with root package name */
        private final int f35304b;

        /* renamed from: c, reason: collision with root package name */
        private final ByteBuffer f35305c;

        /* renamed from: d, reason: collision with root package name */
        private long f35306d;

        a(@NonNull ByteBuffer byteBuffer, @NonNull o.c cVar, int i11, int i12) {
            byteBuffer.rewind();
            int limit = byteBuffer.limit() - byteBuffer.position();
            if (limit != cVar.a()) {
                StringBuilder f7 = P4.f.f(limit, "Byte buffer size is not match with packet info: ", " != ");
                f7.append(cVar.a());
                throw new IllegalStateException(f7.toString());
            }
            this.f35303a = i11;
            this.f35304b = i12;
            this.f35305c = byteBuffer;
            this.f35306d = cVar.b();
        }

        public final int a() {
            return this.f35305c.remaining();
        }

        public final o.c b(@NonNull ByteBuffer byteBuffer) {
            int remaining;
            long j11 = this.f35306d;
            ByteBuffer byteBuffer2 = this.f35305c;
            int position = byteBuffer2.position();
            int position2 = byteBuffer.position();
            if (byteBuffer2.remaining() > byteBuffer.remaining()) {
                remaining = byteBuffer.remaining();
                this.f35306d += r.a(this.f35304b, r.b(this.f35303a, remaining));
                ByteBuffer duplicate = byteBuffer2.duplicate();
                duplicate.position(position).limit(position + remaining);
                byteBuffer.put(duplicate).limit(position2 + remaining).position(position2);
            } else {
                remaining = byteBuffer2.remaining();
                byteBuffer.put(byteBuffer2).limit(position2 + remaining).position(position2);
            }
            byteBuffer2.position(position + remaining);
            return new t(remaining, j11);
        }
    }

    public w(@NonNull q qVar, @NonNull Z.a aVar) {
        this.f35297g = qVar;
        int d11 = aVar.d();
        this.f35298h = d11;
        int f7 = aVar.f();
        this.f35299i = f7;
        x2.i.a("mBytesPerFrame must be greater than 0.", ((long) d11) > 0);
        x2.i.a("mSampleRate must be greater than 0.", ((long) f7) > 0);
        this.f35300j = CounterView.COUNTER_MAX_DEFAULT;
        this.f35302l = d11 * UserVerificationMethods.USER_VERIFY_ALL;
    }

    public static /* synthetic */ void a(w wVar) {
        wVar.f35301k.set(false);
        wVar.f35297g.i();
        synchronized (wVar.f35295e) {
            wVar.f35296f = null;
            wVar.f35293c.clear();
        }
    }

    public static void b(w wVar) {
        wVar.getClass();
        try {
            wVar.f35297g.h();
            if (wVar.f35301k.getAndSet(true)) {
                return;
            }
            wVar.h();
        } catch (o.b e11) {
            throw new RuntimeException(e11);
        }
    }

    public static /* synthetic */ void c(w wVar) {
        wVar.f35301k.set(false);
        wVar.f35297g.f();
        synchronized (wVar.f35295e) {
            wVar.f35296f = null;
            wVar.f35293c.clear();
        }
    }

    public static void d(w wVar, int i11) {
        int i12 = wVar.f35302l;
        if (i12 == i11) {
            return;
        }
        int i13 = wVar.f35298h;
        wVar.f35302l = (i11 / i13) * i13;
        StringBuilder f7 = P4.f.f(i12, "Update buffer size from ", " to ");
        f7.append(wVar.f35302l);
        S.a("BufferedAudioStream", f7.toString());
    }

    private void g() {
        x2.i.f("AudioStream has been released.", !this.f35292b.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f35301k.get()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f35302l);
            a aVar = new a(allocateDirect, this.f35297g.read(allocateDirect), this.f35298h, this.f35299i);
            int i11 = this.f35300j;
            synchronized (this.f35295e) {
                try {
                    this.f35293c.offer(aVar);
                    while (this.f35293c.size() > i11) {
                        this.f35293c.poll();
                        S.k("BufferedAudioStream", "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f35301k.get()) {
                this.f35294d.execute(new YJ.e(this, 1));
            }
        }
    }

    public final void i() {
        if (this.f35292b.getAndSet(true)) {
            return;
        }
        this.f35294d.execute(new KD.b(this, 2));
    }

    public final void j(o.a aVar, Executor executor) {
        x2.i.f("AudioStream can not be started when setCallback.", !this.f35291a.get());
        g();
        this.f35294d.execute(new RunnableC2442a(this, aVar, executor, 1));
    }

    public final void k() throws o.b, IllegalStateException {
        g();
        AtomicBoolean atomicBoolean = this.f35291a;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new RunnableC3170a(this, 4), null);
        this.f35294d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e11) {
            atomicBoolean.set(false);
            throw new o.b(e11);
        }
    }

    public final void l() throws IllegalStateException {
        g();
        if (this.f35291a.getAndSet(false)) {
            this.f35294d.execute(new u(this, 0));
        }
    }

    @Override // Z.o
    @NonNull
    @SuppressLint({"BanThreadSleep"})
    public final o.c read(@NonNull ByteBuffer byteBuffer) {
        boolean z11;
        g();
        x2.i.f("AudioStream has not been started.", this.f35291a.get());
        final int remaining = byteBuffer.remaining();
        this.f35294d.execute(new Runnable() { // from class: Z.v
            @Override // java.lang.Runnable
            public final void run() {
                w.d(w.this, remaining);
            }
        });
        o.c tVar = new t(0, 0L);
        do {
            synchronized (this.f35295e) {
                try {
                    a aVar = this.f35296f;
                    this.f35296f = null;
                    if (aVar == null) {
                        aVar = (a) this.f35293c.poll();
                    }
                    if (aVar != null) {
                        tVar = aVar.b(byteBuffer);
                        if (aVar.a() > 0) {
                            this.f35296f = aVar;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            z11 = tVar.a() <= 0 && this.f35291a.get() && !this.f35292b.get();
            if (z11) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e11) {
                    S.l("BufferedAudioStream", "Interruption while waiting for audio data", e11);
                }
            }
        } while (z11);
        return tVar;
    }
}
