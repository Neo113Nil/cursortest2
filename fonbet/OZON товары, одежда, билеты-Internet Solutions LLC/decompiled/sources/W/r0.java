package W;

import C.s0;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5086c0;
import androidx.camera.core.impl.Y0;
import androidx.concurrent.futures.b;
import d0.InterfaceC5999j;
import java.util.Objects;
import java.util.concurrent.Executor;
import x2.InterfaceC10646a;

/* loaded from: classes8.dex */
final class r0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f33119a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f33120b;

    /* renamed from: c, reason: collision with root package name */
    private final D3.h f33121c;

    /* renamed from: d, reason: collision with root package name */
    private d0.J f33122d = null;

    /* renamed from: e, reason: collision with root package name */
    private Surface f33123e = null;

    /* renamed from: f, reason: collision with root package name */
    private C.s0 f33124f = null;

    /* renamed from: g, reason: collision with root package name */
    private Executor f33125g = null;

    /* renamed from: h, reason: collision with root package name */
    private C f33126h = null;

    /* renamed from: i, reason: collision with root package name */
    private b f33127i = b.NOT_INITIALIZED;

    /* renamed from: j, reason: collision with root package name */
    private com.google.common.util.concurrent.m<Void> f33128j = I.k.f(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: k, reason: collision with root package name */
    private b.a<Void> f33129k = null;

    /* renamed from: l, reason: collision with root package name */
    private com.google.common.util.concurrent.m<InterfaceC5999j> f33130l = I.k.f(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: m, reason: collision with root package name */
    private b.a<InterfaceC5999j> f33131m = null;

    final class a implements I.c<InterfaceC5999j> {
        a() {
        }

        @Override // I.c
        public final void onFailure(@NonNull Throwable th2) {
            C.S.l("VideoEncoderSession", "VideoEncoder configuration failed.", th2);
            r0.this.p();
        }

        @Override // I.c
        public final /* bridge */ /* synthetic */ void onSuccess(InterfaceC5999j interfaceC5999j) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b INITIALIZING;
        public static final b NOT_INITIALIZED;
        public static final b PENDING_RELEASE;
        public static final b READY;
        public static final b RELEASED;

        static {
            b bVar = new b("NOT_INITIALIZED", 0);
            NOT_INITIALIZED = bVar;
            b bVar2 = new b("INITIALIZING", 1);
            INITIALIZING = bVar2;
            b bVar3 = new b("PENDING_RELEASE", 2);
            PENDING_RELEASE = bVar3;
            b bVar4 = new b("READY", 3);
            READY = bVar4;
            b bVar5 = new b("RELEASED", 4);
            RELEASED = bVar5;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    r0(@NonNull D3.h hVar, @NonNull Executor executor, @NonNull Executor executor2) {
        this.f33119a = executor2;
        this.f33120b = executor;
        this.f33121c = hVar;
    }

    public static String a(r0 r0Var, C.s0 s0Var, Y0 y02, Y.f fVar, AbstractC4847s abstractC4847s, b.a aVar) {
        r0Var.getClass();
        C.A e11 = s0Var.e();
        c0.n b11 = c0.k.b(abstractC4847s, e11, fVar);
        u0 c11 = abstractC4847s.c();
        Size g10 = s0Var.g();
        Range<Integer> f7 = s0Var.f();
        InterfaceC5086c0.c c12 = b11.c();
        d0.W w11 = (d0.W) (c12 != null ? new c0.m(b11.a(), y02, c11, g10, c12, e11, f7) : new c0.l(b11.a(), y02, c11, g10, e11, f7)).get();
        try {
            D3.h hVar = r0Var.f33121c;
            Executor executor = r0Var.f33119a;
            hVar.getClass();
            d0.J j11 = new d0.J(executor, w11);
            r0Var.f33122d = j11;
            InterfaceC5999j.b q11 = j11.q();
            if (q11 instanceof InterfaceC5999j.c) {
                ((InterfaceC5999j.c) q11).a(r0Var.f33120b, new o0(r0Var, aVar, s0Var));
            } else {
                aVar.e(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (d0.U e12) {
            C.S.d("VideoEncoderSession", "Unable to initialize video encoder.", e12);
            aVar.e(e12);
        }
        return "ConfigureVideoEncoderFuture " + r0Var;
    }

    public static void b(r0 r0Var, s0.c cVar) {
        r0Var.getClass();
        C.S.a("VideoEncoderSession", "Surface can be closed: " + cVar.b().hashCode());
        Surface b11 = cVar.b();
        if (b11 != r0Var.f33123e) {
            b11.release();
            return;
        }
        r0Var.f33123e = null;
        r0Var.f33131m.c(r0Var.f33122d);
        r0Var.h();
    }

    public static void c(r0 r0Var, Surface surface) {
        r0Var.f33126h.f32858a.K(surface);
    }

    public static /* synthetic */ String d(r0 r0Var, b.a aVar) {
        r0Var.f33129k = aVar;
        return "ReleasedFuture " + r0Var;
    }

    public static /* synthetic */ String f(r0 r0Var, b.a aVar) {
        r0Var.f33131m = aVar;
        return "ReadyToReleaseFuture " + r0Var;
    }

    public static /* synthetic */ void g(final r0 r0Var, b.a aVar, C.s0 s0Var, final Surface surface) {
        Executor executor;
        int ordinal = r0Var.f33127i.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (s0Var.j()) {
                    C.S.a("VideoEncoderSession", "Not provide surface, " + Objects.toString(s0Var, "EMPTY") + " is already serviced.");
                    aVar.c(null);
                    r0Var.h();
                    return;
                }
                r0Var.f33123e = surface;
                C.S.a("VideoEncoderSession", "provide surface: " + surface);
                s0Var.k(surface, r0Var.f33120b, new InterfaceC10646a() { // from class: W.p0
                    @Override // x2.InterfaceC10646a
                    public final void accept(Object obj) {
                        r0.b(r0.this, (s0.c) obj);
                    }
                });
                r0Var.f33127i = b.READY;
                aVar.c(r0Var.f33122d);
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    if (r0Var.f33126h != null && (executor = r0Var.f33125g) != null) {
                        executor.execute(new Runnable() { // from class: W.q0
                            @Override // java.lang.Runnable
                            public final void run() {
                                r0.c(r0.this, surface);
                            }
                        });
                    }
                    C.S.k("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                    return;
                }
                if (ordinal != 4) {
                    throw new IllegalStateException("State " + r0Var.f33127i + " is not handled");
                }
            }
        }
        C.S.a("VideoEncoderSession", "Not provide surface in " + r0Var.f33127i);
        aVar.c(null);
    }

    private void h() {
        int ordinal = this.f33127i.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            p();
            return;
        }
        if (ordinal == 2 || ordinal == 3) {
            C.S.a("VideoEncoderSession", "closeInternal in " + this.f33127i + " state");
            this.f33127i = b.PENDING_RELEASE;
            return;
        }
        if (ordinal == 4) {
            C.S.a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.f33127i + " is not handled");
    }

    @NonNull
    final com.google.common.util.concurrent.m<InterfaceC5999j> i(@NonNull final C.s0 s0Var, @NonNull final Y0 y02, @NonNull final AbstractC4847s abstractC4847s, final Y.f fVar) {
        if (this.f33127i.ordinal() != 0) {
            return I.k.f(new IllegalStateException("configure() shouldn't be called in " + this.f33127i));
        }
        this.f33127i = b.INITIALIZING;
        this.f33124f = s0Var;
        C.S.a("VideoEncoderSession", "Create VideoEncoderSession: " + this);
        this.f33128j = androidx.concurrent.futures.b.a(new b.c() { // from class: W.l0
            @Override // androidx.concurrent.futures.b.c
            public final Object c(b.a aVar) {
                return r0.d(r0.this, aVar);
            }
        });
        this.f33130l = androidx.concurrent.futures.b.a(new b.c() { // from class: W.m0
            @Override // androidx.concurrent.futures.b.c
            public final Object c(b.a aVar) {
                return r0.f(r0.this, aVar);
            }
        });
        com.google.common.util.concurrent.m a11 = androidx.concurrent.futures.b.a(new b.c() { // from class: W.n0
            @Override // androidx.concurrent.futures.b.c
            public final Object c(b.a aVar) {
                return r0.a(r0.this, s0Var, y02, fVar, abstractC4847s, aVar);
            }
        });
        I.k.b(a11, new a(), this.f33120b);
        return I.k.i(a11);
    }

    final Surface j() {
        if (this.f33127i != b.READY) {
            return null;
        }
        return this.f33123e;
    }

    @NonNull
    final com.google.common.util.concurrent.m<InterfaceC5999j> k() {
        return I.k.i(this.f33130l);
    }

    final InterfaceC5999j l() {
        return this.f33122d;
    }

    final boolean m(@NonNull C.s0 s0Var) {
        int ordinal = this.f33127i.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            throw new IllegalStateException("State " + this.f33127i + " is not handled");
                        }
                    }
                }
            }
            if (this.f33124f == s0Var) {
                return true;
            }
        }
        return false;
    }

    final void n(@NonNull Executor executor, @NonNull C c11) {
        this.f33125g = executor;
        this.f33126h = c11;
    }

    @NonNull
    final com.google.common.util.concurrent.m<Void> o() {
        h();
        return I.k.i(this.f33128j);
    }

    final void p() {
        int ordinal = this.f33127i.ordinal();
        if (ordinal == 0) {
            this.f33127i = b.RELEASED;
            return;
        }
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            if (ordinal != 4) {
                throw new IllegalStateException("State " + this.f33127i + " is not handled");
            }
            C.S.a("VideoEncoderSession", "terminateNow in " + this.f33127i + ", No-op");
            return;
        }
        this.f33127i = b.RELEASED;
        this.f33131m.c(this.f33122d);
        this.f33124f = null;
        if (this.f33122d == null) {
            C.S.k("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f33129k.c(null);
            return;
        }
        C.S.a("VideoEncoderSession", "VideoEncoder is releasing: " + this.f33122d);
        this.f33122d.v();
        this.f33122d.r().a(new Runnable() { // from class: W.k0
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.f33129k.c(null);
            }
        }, this.f33120b);
        this.f33122d = null;
    }

    @NonNull
    public final String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f33124f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
