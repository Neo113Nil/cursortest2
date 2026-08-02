package N;

import C.f0;
import C.s0;
import N.y;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.W;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import x2.InterfaceC10646a;

/* loaded from: classes8.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final int f18272a;

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f18273b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18274c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f18275d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f18276e;

    /* renamed from: f, reason: collision with root package name */
    private final int f18277f;

    /* renamed from: g, reason: collision with root package name */
    private final T0 f18278g;

    /* renamed from: h, reason: collision with root package name */
    private int f18279h;

    /* renamed from: i, reason: collision with root package name */
    private int f18280i;

    /* renamed from: k, reason: collision with root package name */
    private s0 f18282k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    private a f18283l;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18281j = false;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    private final HashSet f18284m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    private boolean f18285n = false;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayList f18286o = new ArrayList();

    static class a extends W {

        /* renamed from: o, reason: collision with root package name */
        final com.google.common.util.concurrent.m<Surface> f18287o;

        /* renamed from: p, reason: collision with root package name */
        b.a<Surface> f18288p;

        /* renamed from: q, reason: collision with root package name */
        private W f18289q;

        /* renamed from: r, reason: collision with root package name */
        private B f18290r;

        a(@NonNull Size size, int i11) {
            super(size, i11);
            this.f18287o = androidx.concurrent.futures.b.a(new b.c() { // from class: N.x
                @Override // androidx.concurrent.futures.b.c
                public final Object c(b.a aVar) {
                    y.a aVar2 = y.a.this;
                    aVar2.f18288p = aVar;
                    return "SettableFuture hashCode: " + aVar2.hashCode();
                }
            });
        }

        public static /* synthetic */ void q(a aVar) {
            B b11 = aVar.f18290r;
            if (b11 != null) {
                b11.k();
            }
            if (aVar.f18289q == null) {
                aVar.f18288p.d();
            }
        }

        @Override // androidx.camera.core.impl.W
        public final void d() {
            super.d();
            G.q.c(new Runnable() { // from class: N.w
                @Override // java.lang.Runnable
                public final void run() {
                    y.a.q(y.a.this);
                }
            });
        }

        @Override // androidx.camera.core.impl.W
        @NonNull
        protected final com.google.common.util.concurrent.m<Surface> o() {
            return this.f18287o;
        }

        final boolean r() {
            G.q.a();
            return this.f18289q == null && !m();
        }

        public final void s(@NonNull B b11) {
            x2.i.f("Consumer can only be linked once.", this.f18290r == null);
            this.f18290r = b11;
        }

        public final boolean t(@NonNull W w11, @NonNull Runnable runnable) throws W.a {
            G.q.a();
            w11.getClass();
            W w12 = this.f18289q;
            if (w12 == w11) {
                return false;
            }
            x2.i.f("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", w12 == null);
            x2.i.a("The provider's size(" + h() + ") must match the parent(" + w11.h() + ")", h().equals(w11.h()));
            x2.i.a(Cm.e.c("The provider's format(", i(), ") must match the parent(", ")", w11.i()), i() == w11.i());
            x2.i.f("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !m());
            this.f18289q = w11;
            I.k.j(this.f18288p, w11.j());
            w11.l();
            k().a(new H.a(w11, 2), H.c.b());
            w11.f().a(runnable, H.c.e());
            return true;
        }
    }

    public y(int i11, int i12, @NonNull T0 t02, @NonNull Matrix matrix, boolean z11, @NonNull Rect rect, int i13, int i14, boolean z12) {
        this.f18277f = i11;
        this.f18272a = i12;
        this.f18278g = t02;
        this.f18273b = matrix;
        this.f18274c = z11;
        this.f18275d = rect;
        this.f18280i = i13;
        this.f18279h = i14;
        this.f18276e = z12;
        this.f18283l = new a(t02.e(), i12);
    }

    public static /* synthetic */ void a(y yVar) {
        if (yVar.f18285n) {
            return;
        }
        yVar.s();
    }

    public static /* synthetic */ void b(y yVar, int i11, int i12) {
        boolean z11;
        boolean z12 = true;
        if (yVar.f18280i != i11) {
            yVar.f18280i = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        if (yVar.f18279h != i12) {
            yVar.f18279h = i12;
        } else {
            z12 = z11;
        }
        if (z12) {
            yVar.u();
        }
    }

    public static com.google.common.util.concurrent.m c(y yVar, final a aVar, int i11, f0.a aVar2, f0.a aVar3, Surface surface) {
        yVar.getClass();
        surface.getClass();
        try {
            aVar.l();
            B b11 = new B(surface, i11, yVar.f18278g.e(), aVar2, aVar3);
            b11.j().a(new Runnable() { // from class: N.v
                @Override // java.lang.Runnable
                public final void run() {
                    y.a.this.e();
                }
            }, H.c.b());
            aVar.s(b11);
            return I.k.h(b11);
        } catch (W.a e11) {
            return I.k.f(e11);
        }
    }

    private void f() {
        x2.i.f("Edge is already closed.", !this.f18285n);
    }

    private void u() {
        G.q.a();
        s0.d g10 = s0.d.g(this.f18275d, this.f18280i, this.f18279h, this.f18274c, this.f18273b, this.f18276e);
        s0 s0Var = this.f18282k;
        if (s0Var != null) {
            s0Var.m(g10);
        }
        Iterator it = this.f18286o.iterator();
        while (it.hasNext()) {
            ((InterfaceC10646a) it.next()).accept(g10);
        }
    }

    public final void d(@NonNull Runnable runnable) {
        G.q.a();
        f();
        this.f18284m.add(runnable);
    }

    public final void e(@NonNull E e11) {
        this.f18286o.add(e11);
    }

    public final void g() {
        G.q.a();
        this.f18283l.d();
        this.f18285n = true;
    }

    @NonNull
    public final com.google.common.util.concurrent.m<f0> h(final int i11, @NonNull final f0.a aVar, final f0.a aVar2) {
        G.q.a();
        f();
        x2.i.f("Consumer can only be linked once.", !this.f18281j);
        this.f18281j = true;
        final a aVar3 = this.f18283l;
        return I.k.n(aVar3.j(), new I.a() { // from class: N.u
            @Override // I.a, qc.o
            public final com.google.common.util.concurrent.m apply(Object obj) {
                f0.a aVar4 = aVar;
                return y.c(y.this, aVar3, i11, aVar4, aVar2, (Surface) obj);
            }
        }, H.c.e());
    }

    @NonNull
    public final s0 i(@NonNull I i11, boolean z11) {
        G.q.a();
        f();
        T0 t02 = this.f18278g;
        s0 s0Var = new s0(t02.e(), i11, z11, t02.b(), t02.c(), new r(this, 0));
        try {
            W d11 = s0Var.d();
            a aVar = this.f18283l;
            Objects.requireNonNull(aVar);
            if (aVar.t(d11, new s(aVar))) {
                aVar.k().a(new KD.b(d11, 1), H.c.b());
            }
            this.f18282k = s0Var;
            u();
            return s0Var;
        } catch (W.a e11) {
            throw new AssertionError("Surface is somehow already closed", e11);
        } catch (RuntimeException e12) {
            s0Var.n();
            throw e12;
        }
    }

    public final void j() {
        G.q.a();
        f();
        this.f18283l.d();
    }

    @NonNull
    public final Rect k() {
        return this.f18275d;
    }

    @NonNull
    public final W l() {
        G.q.a();
        f();
        x2.i.f("Consumer can only be linked once.", !this.f18281j);
        this.f18281j = true;
        return this.f18283l;
    }

    public final int m() {
        return this.f18272a;
    }

    public final int n() {
        return this.f18280i;
    }

    @NonNull
    public final Matrix o() {
        return this.f18273b;
    }

    @NonNull
    public final T0 p() {
        return this.f18278g;
    }

    public final int q() {
        return this.f18277f;
    }

    public final boolean r() {
        return this.f18274c;
    }

    public final void s() {
        G.q.a();
        f();
        if (this.f18283l.r()) {
            return;
        }
        this.f18281j = false;
        this.f18283l.d();
        this.f18283l = new a(this.f18278g.e(), this.f18272a);
        Iterator it = this.f18284m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final boolean t() {
        return this.f18276e;
    }

    public final void v(@NonNull W w11) throws W.a {
        G.q.a();
        f();
        a aVar = this.f18283l;
        Objects.requireNonNull(aVar);
        aVar.t(w11, new s(aVar));
    }
}
