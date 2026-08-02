package Z;

import Y.c;
import Z.m;
import Z.o;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5129y0;
import androidx.concurrent.futures.b;
import d0.InterfaceC5999j;
import d0.S;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    final Executor f35238a;

    /* renamed from: d, reason: collision with root package name */
    final w f35241d;

    /* renamed from: e, reason: collision with root package name */
    final y f35242e;

    /* renamed from: f, reason: collision with root package name */
    private final long f35243f;

    /* renamed from: i, reason: collision with root package name */
    boolean f35246i;

    /* renamed from: j, reason: collision with root package name */
    Executor f35247j;

    /* renamed from: k, reason: collision with root package name */
    a f35248k;

    /* renamed from: l, reason: collision with root package name */
    InterfaceC5999j.a f35249l;

    /* renamed from: m, reason: collision with root package name */
    private I.c<S> f35250m;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC5129y0.a<c.a> f35251n;

    /* renamed from: o, reason: collision with root package name */
    boolean f35252o;

    /* renamed from: p, reason: collision with root package name */
    private long f35253p;

    /* renamed from: q, reason: collision with root package name */
    boolean f35254q;

    /* renamed from: r, reason: collision with root package name */
    boolean f35255r;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f35256s;

    /* renamed from: t, reason: collision with root package name */
    double f35257t;

    /* renamed from: v, reason: collision with root package name */
    private final int f35259v;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<Boolean> f35239b = new AtomicReference<>(null);

    /* renamed from: c, reason: collision with root package name */
    final AtomicBoolean f35240c = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    c f35244g = c.CONFIGURED;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    c.a f35245h = c.a.INACTIVE;

    /* renamed from: u, reason: collision with root package name */
    long f35258u = 0;

    public interface a {
        void a(boolean z11);

        void b(double d11);

        void onError(@NonNull Throwable th2);
    }

    class b implements o.a {
        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c CONFIGURED;
        public static final c RELEASED;
        public static final c STARTED;

        static {
            c cVar = new c("CONFIGURED", 0);
            CONFIGURED = cVar;
            c cVar2 = new c("STARTED", 1);
            STARTED = cVar2;
            c cVar3 = new c("RELEASED", 2);
            RELEASED = cVar3;
            $VALUES = new c[]{cVar, cVar2, cVar3};
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public m(@NonNull Z.a aVar, @NonNull Executor executor, Context context) throws n {
        Executor g10 = H.c.g(executor);
        this.f35238a = g10;
        this.f35243f = TimeUnit.MILLISECONDS.toNanos(3000L);
        try {
            w wVar = new w(new q(aVar, context), aVar);
            this.f35241d = wVar;
            wVar.j(new b(), g10);
            this.f35242e = new y(aVar);
            this.f35259v = aVar.b();
        } catch (o.b | IllegalArgumentException e11) {
            throw new n("Unable to create AudioStream", e11);
        }
    }

    public static /* synthetic */ void a(m mVar, InterfaceC5999j.a aVar) {
        int ordinal = mVar.f35244g.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else if (mVar.f35249l != aVar) {
            mVar.g(aVar);
        }
    }

    public static /* synthetic */ void b(m mVar, b.a aVar) {
        mVar.getClass();
        try {
            int ordinal = mVar.f35244g.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                mVar.g(null);
                mVar.f35242e.b();
                mVar.f35241d.i();
                mVar.o();
                mVar.l(c.RELEASED);
            }
            aVar.c(null);
        } catch (Throwable th2) {
            aVar.e(th2);
        }
    }

    private void g(InterfaceC5999j.a aVar) {
        InterfaceC5999j.a aVar2 = this.f35249l;
        c.a aVar3 = null;
        if (aVar2 != null) {
            InterfaceC5129y0.a<c.a> aVar4 = this.f35251n;
            Objects.requireNonNull(aVar4);
            aVar2.d(aVar4);
            this.f35249l = null;
            this.f35251n = null;
            this.f35250m = null;
            this.f35245h = c.a.INACTIVE;
            p();
        }
        if (aVar != null) {
            this.f35249l = aVar;
            this.f35251n = new k(this, aVar);
            this.f35250m = new l(this, aVar);
            try {
                com.google.common.util.concurrent.m<c.a> b11 = aVar.b();
                if (b11.isDone()) {
                    aVar3 = b11.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (aVar3 != null) {
                this.f35245h = aVar3;
                p();
            }
            this.f35249l.c(this.f35238a, this.f35251n);
        }
    }

    private void o() {
        if (this.f35246i) {
            this.f35246i = false;
            C.S.a("AudioSource", "stopSendingAudio");
            this.f35241d.l();
        }
    }

    final boolean c() {
        x2.i.f(null, this.f35253p > 0);
        return System.nanoTime() - this.f35253p >= this.f35243f;
    }

    final void d() {
        Executor executor = this.f35247j;
        final a aVar = this.f35248k;
        if (executor == null || aVar == null) {
            return;
        }
        final boolean z11 = this.f35255r || this.f35252o || this.f35254q;
        if (Objects.equals(this.f35239b.getAndSet(Boolean.valueOf(z11)), Boolean.valueOf(z11))) {
            return;
        }
        executor.execute(new Runnable() { // from class: Z.h
            @Override // java.lang.Runnable
            public final void run() {
                m.a.this.a(z11);
            }
        });
    }

    final void e(int i11, @NonNull ByteBuffer byteBuffer) {
        byte[] bArr = this.f35256s;
        if (bArr == null || bArr.length < i11) {
            this.f35256s = new byte[i11];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.f35256s, 0, i11);
        byteBuffer.limit(byteBuffer.position()).position(position);
    }

    final void f(ByteBuffer byteBuffer) {
        Executor executor = this.f35247j;
        final a aVar = this.f35248k;
        if (this.f35259v == 2) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            double d11 = 0.0d;
            while (asShortBuffer.hasRemaining()) {
                d11 = Math.max(d11, Math.abs((int) asShortBuffer.get()));
            }
            this.f35257t = d11 / 32767.0d;
            if (executor == null || aVar == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: Z.j
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.b(m.this.f35257t);
                }
            });
        }
    }

    final void h() {
        x2.i.f(null, this.f35252o);
        try {
            this.f35241d.k();
            C.S.a("AudioSource", "Retry start AudioStream succeed");
            this.f35242e.d();
            this.f35252o = false;
        } catch (o.b e11) {
            C.S.l("AudioSource", "Retry start AudioStream failed", e11);
            this.f35253p = System.nanoTime();
        }
    }

    final void i() {
        InterfaceC5999j.a aVar = this.f35249l;
        Objects.requireNonNull(aVar);
        com.google.common.util.concurrent.m<S> e11 = aVar.e();
        I.c<S> cVar = this.f35250m;
        Objects.requireNonNull(cVar);
        I.k.b(e11, cVar, this.f35238a);
    }

    public final void j(@NonNull final Executor executor, @NonNull final a aVar) {
        this.f35238a.execute(new Runnable() { // from class: Z.i
            @Override // java.lang.Runnable
            public final void run() {
                m mVar = m.this;
                int ordinal = mVar.f35244g.ordinal();
                if (ordinal == 0) {
                    mVar.f35247j = executor;
                    mVar.f35248k = aVar;
                } else if (ordinal == 1 || ordinal == 2) {
                    throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
                }
            }
        });
    }

    public final void k(@NonNull InterfaceC5999j.a aVar) {
        this.f35238a.execute(new f(0, this, aVar));
    }

    final void l(c cVar) {
        C.S.a("AudioSource", "Transitioning internal state: " + this.f35244g + " --> " + cVar);
        this.f35244g = cVar;
    }

    public final void m(final boolean z11) {
        this.f35238a.execute(new Runnable() { // from class: Z.e
            @Override // java.lang.Runnable
            public final void run() {
                final m mVar = m.this;
                int ordinal = mVar.f35244g.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                mVar.f35239b.set(null);
                mVar.f35240c.set(false);
                mVar.l(m.c.STARTED);
                Executor executor = mVar.f35238a;
                final boolean z12 = z11;
                executor.execute(new Runnable() { // from class: Z.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        m mVar2 = m.this;
                        int ordinal2 = mVar2.f35244g.ordinal();
                        if (ordinal2 != 0 && ordinal2 != 1) {
                            if (ordinal2 == 2) {
                                throw new AssertionError("AudioSource is released");
                            }
                            return;
                        }
                        boolean z13 = mVar2.f35255r;
                        boolean z14 = z12;
                        if (z13 == z14) {
                            return;
                        }
                        mVar2.f35255r = z14;
                        if (mVar2.f35244g == m.c.STARTED) {
                            mVar2.d();
                        }
                    }
                });
                mVar.p();
            }
        });
    }

    public final void n() {
        this.f35238a.execute(new Runnable() { // from class: Z.b
            @Override // java.lang.Runnable
            public final void run() {
                m mVar = m.this;
                int ordinal = mVar.f35244g.ordinal();
                if (ordinal == 1) {
                    mVar.l(m.c.CONFIGURED);
                    mVar.p();
                } else {
                    if (ordinal != 2) {
                        return;
                    }
                    C.S.k("AudioSource", "AudioSource is released. Calling stop() is a no-op.");
                }
            }
        });
    }

    final void p() {
        if (this.f35244g != c.STARTED) {
            o();
            return;
        }
        boolean z11 = this.f35245h == c.a.ACTIVE;
        boolean z12 = !z11;
        Executor executor = this.f35247j;
        a aVar = this.f35248k;
        if (executor != null && aVar != null && this.f35240c.getAndSet(z12) != z12) {
            executor.execute(new Cm.d(aVar, z12));
        }
        if (!z11) {
            o();
            return;
        }
        if (this.f35246i) {
            return;
        }
        try {
            C.S.a("AudioSource", "startSendingAudio");
            this.f35241d.k();
            this.f35252o = false;
        } catch (o.b e11) {
            C.S.l("AudioSource", "Failed to start AudioStream", e11);
            this.f35252o = true;
            this.f35242e.c();
            this.f35253p = System.nanoTime();
            d();
        }
        this.f35246i = true;
        i();
    }
}
