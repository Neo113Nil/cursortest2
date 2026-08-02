package E;

import E.Y;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.C5106m0;
import androidx.camera.core.impl.C5113q;
import androidx.camera.core.impl.InterfaceC5104l0;
import java.util.Objects;
import x2.InterfaceC10646a;

/* renamed from: E.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2904u {

    /* renamed from: b, reason: collision with root package name */
    androidx.camera.core.u f6921b;

    /* renamed from: c, reason: collision with root package name */
    androidx.camera.core.u f6922c;

    /* renamed from: d, reason: collision with root package name */
    private C2889e f6923d;

    /* renamed from: e, reason: collision with root package name */
    private C2886b f6924e;

    /* renamed from: a, reason: collision with root package name */
    P f6920a = null;

    /* renamed from: f, reason: collision with root package name */
    private E f6925f = null;

    /* renamed from: E.u$a */
    final class a implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P f6926a;

        a(P p11) {
            this.f6926a = p11;
        }

        @Override // I.c
        public final void onFailure(@NonNull Throwable th2) {
            G.q.a();
            C2904u c2904u = C2904u.this;
            if (this.f6926a == c2904u.f6920a) {
                C.S.k("CaptureNode", "request aborted, id=" + c2904u.f6920a.d());
                if (c2904u.f6925f != null) {
                    c2904u.f6925f.i();
                }
                c2904u.f6920a = null;
            }
        }

        @Override // I.c
        public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
        }
    }

    /* renamed from: E.u$b */
    static abstract class b {

        /* renamed from: b, reason: collision with root package name */
        private C5106m0 f6929b;

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private AbstractC5111p f6928a = new a();

        /* renamed from: c, reason: collision with root package name */
        private C5106m0 f6930c = null;

        /* renamed from: E.u$b$a */
        final class a extends AbstractC5111p {
        }

        b() {
        }

        @NonNull
        final AbstractC5111p a() {
            return this.f6928a;
        }

        @NonNull
        abstract N.m<Y.a> b();

        abstract C.O c();

        abstract int d();

        abstract int e();

        abstract int f();

        abstract Size g();

        final androidx.camera.core.impl.W h() {
            return this.f6930c;
        }

        @NonNull
        abstract N.m<P> i();

        abstract Size j();

        @NonNull
        final C5106m0 k() {
            C5106m0 c5106m0 = this.f6929b;
            Objects.requireNonNull(c5106m0);
            return c5106m0;
        }

        abstract boolean l();

        final void m(@NonNull AbstractC5111p abstractC5111p) {
            this.f6928a = abstractC5111p;
        }

        final void n(@NonNull Surface surface, @NonNull Size size, int i11) {
            this.f6930c = new C5106m0(surface, size, i11);
        }

        final void o(@NonNull Surface surface) {
            x2.i.f("The surface is already set.", this.f6929b == null);
            this.f6929b = new C5106m0(surface, j(), d());
        }
    }

    C2904u() {
    }

    public static /* synthetic */ void a(C2904u c2904u, P p11) {
        c2904u.e(p11);
        c2904u.f6925f.h(p11);
    }

    public static void b(C2904u c2904u, InterfaceC5104l0 interfaceC5104l0) {
        c2904u.getClass();
        try {
            androidx.camera.core.p e11 = interfaceC5104l0.e();
            if (e11 != null) {
                if (c2904u.f6920a == null) {
                    C.S.k("CaptureNode", "Postview image is closed due to request completed or aborted");
                    e11.close();
                } else {
                    C2889e c2889e = c2904u.f6923d;
                    Objects.requireNonNull(c2889e);
                    c2889e.d().accept(new C2890f(c2904u.f6920a, e11));
                }
            }
        } catch (IllegalStateException e12) {
            C.S.d("CaptureNode", "Failed to acquire latest image of postview", e12);
        }
    }

    final void d(@NonNull androidx.camera.core.p pVar) {
        G.q.a();
        if (this.f6920a == null) {
            C.S.k("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + pVar);
            pVar.close();
            return;
        }
        if (((Integer) pVar.x0().a().c(this.f6920a.h())) == null) {
            C.S.k("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            pVar.close();
            return;
        }
        G.q.a();
        C2889e c2889e = this.f6923d;
        Objects.requireNonNull(c2889e);
        c2889e.a().accept(new C2890f(this.f6920a, pVar));
        P p11 = this.f6920a;
        this.f6920a = null;
        p11.o();
    }

    final void e(@NonNull P p11) {
        G.q.a();
        x2.i.f("only one capture stage is supported.", p11.g().size() == 1);
        G.q.a();
        x2.i.f("The ImageReader is not initialized.", this.f6921b != null);
        x2.i.f("Too many acquire images. Close image to be able to process next.", this.f6921b.i() > 0);
        this.f6920a = p11;
        I.k.b(p11.f6832j, new a(p11), H.c.b());
    }

    public final void f() {
        G.q.a();
        C2886b c2886b = this.f6924e;
        Objects.requireNonNull(c2886b);
        androidx.camera.core.u uVar = this.f6921b;
        Objects.requireNonNull(uVar);
        androidx.camera.core.u uVar2 = this.f6922c;
        c2886b.k().d();
        c2886b.k().k().a(new RunnableC2901q(uVar, 0), H.c.e());
        if (c2886b.h() != null) {
            c2886b.h().d();
            c2886b.h().k().a(new r(uVar2, 0), H.c.e());
        }
    }

    final void g(@NonNull Y.a aVar) {
        G.q.a();
        P p11 = this.f6920a;
        if (p11 == null || p11.d() != aVar.b()) {
            return;
        }
        this.f6920a.k(aVar.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final C2889e h(@NonNull C2886b c2886b) {
        InterfaceC10646a<P> interfaceC10646a;
        E e11;
        x2.i.f("CaptureNode does not support recreation yet.", this.f6924e == null && this.f6921b == null);
        this.f6924e = c2886b;
        Size j11 = c2886b.j();
        int d11 = c2886b.d();
        boolean l11 = c2886b.l();
        AbstractC5111p c2903t = new C2903t(this);
        if (l11 || c2886b.c() != null) {
            C.O c11 = c2886b.c();
            E e12 = new E(c11 != null ? c11.newInstance() : androidx.camera.core.q.a(j11.getWidth(), j11.getHeight(), d11, 4));
            this.f6925f = e12;
            interfaceC10646a = new InterfaceC10646a() { // from class: E.m
                @Override // x2.InterfaceC10646a
                public final void accept(Object obj) {
                    C2904u.a(C2904u.this, (P) obj);
                }
            };
            e11 = e12;
        } else {
            androidx.camera.core.s sVar = new androidx.camera.core.s(j11.getWidth(), j11.getHeight(), d11, 4);
            c2903t = C5113q.a(c2903t, sVar.l());
            interfaceC10646a = new InterfaceC10646a() { // from class: E.l
                @Override // x2.InterfaceC10646a
                public final void accept(Object obj) {
                    C2904u.this.e((P) obj);
                }
            };
            e11 = sVar;
        }
        c2886b.m(c2903t);
        Surface a11 = e11.a();
        Objects.requireNonNull(a11);
        c2886b.o(a11);
        this.f6921b = new androidx.camera.core.u(e11);
        e11.g(new InterfaceC5104l0.a() { // from class: E.n
            @Override // androidx.camera.core.impl.InterfaceC5104l0.a
            public final void a(InterfaceC5104l0 interfaceC5104l0) {
                C2904u c2904u = C2904u.this;
                c2904u.getClass();
                try {
                    androidx.camera.core.p e13 = interfaceC5104l0.e();
                    if (e13 != null) {
                        c2904u.d(e13);
                        return;
                    }
                    P p11 = c2904u.f6920a;
                    if (p11 != null) {
                        c2904u.g(new C2891g(p11.d(), new C.K("Failed to acquire latest image", null)));
                    }
                } catch (IllegalStateException e14) {
                    P p12 = c2904u.f6920a;
                    if (p12 != null) {
                        c2904u.g(new C2891g(p12.d(), new C.K("Failed to acquire latest image", e14)));
                    }
                }
            }
        }, H.c.e());
        if (c2886b.g() != null) {
            C.O c12 = c2886b.c();
            InterfaceC5104l0 newInstance = c12 != null ? c12.newInstance() : androidx.camera.core.q.a(c2886b.g().getWidth(), c2886b.g().getHeight(), c2886b.f(), 4);
            newInstance.g(new InterfaceC5104l0.a() { // from class: E.o
                @Override // androidx.camera.core.impl.InterfaceC5104l0.a
                public final void a(InterfaceC5104l0 interfaceC5104l0) {
                    C2904u.b(C2904u.this, interfaceC5104l0);
                }
            }, H.c.e());
            this.f6922c = new androidx.camera.core.u(newInstance);
            c2886b.n(newInstance.a(), c2886b.g(), c2886b.f());
        }
        c2886b.i().a(interfaceC10646a);
        c2886b.b().a(new InterfaceC10646a() { // from class: E.p
            @Override // x2.InterfaceC10646a
            public final void accept(Object obj) {
                C2904u.this.g((Y.a) obj);
            }
        });
        C2889e c2889e = new C2889e(new N.m(), new N.m(), c2886b.d(), c2886b.e());
        this.f6923d = c2889e;
        return c2889e;
    }
}
