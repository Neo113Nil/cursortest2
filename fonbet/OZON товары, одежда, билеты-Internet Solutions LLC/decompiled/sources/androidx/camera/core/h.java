package androidx.camera.core;

import B90.B;
import B90.C;
import C.A;
import C.E;
import C.O;
import Q.b;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C5096h0;
import androidx.camera.core.impl.C5106m0;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC5100j0;
import androidx.camera.core.impl.InterfaceC5102k0;
import androidx.camera.core.impl.InterfaceC5121u0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.b1;
import androidx.camera.core.impl.c1;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import ru.ozon.fintech.features.camera.domain.scanner.base.FintechBaseImageAnalyzer;

/* loaded from: classes8.dex */
public final class h extends w {

    /* renamed from: v, reason: collision with root package name */
    public static final d f38086v = new d();

    /* renamed from: p, reason: collision with root package name */
    final k f38087p;

    /* renamed from: q, reason: collision with root package name */
    private final Object f38088q;

    /* renamed from: r, reason: collision with root package name */
    private FintechBaseImageAnalyzer f38089r;

    /* renamed from: s, reason: collision with root package name */
    O0.b f38090s;

    /* renamed from: t, reason: collision with root package name */
    private C5106m0 f38091t;

    /* renamed from: u, reason: collision with root package name */
    private O0.c f38092u;

    public interface a {
        void analyze(@NonNull p pVar);

        default Size getDefaultTargetResolution() {
            return null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c implements b1.a<h, C5096h0, c> {

        /* renamed from: a, reason: collision with root package name */
        private final C5123v0 f38093a;

        public c() {
            this(C5123v0.R());
        }

        @NonNull
        static c d(@NonNull T t2) {
            return new c(C5123v0.S(t2));
        }

        @Override // C.B
        @NonNull
        public final InterfaceC5121u0 a() {
            return this.f38093a;
        }

        @NonNull
        public final h c() {
            C5096h0 b11 = b();
            InterfaceC5102k0.G(b11);
            return new h(b11);
        }

        @Override // androidx.camera.core.impl.b1.a
        @NonNull
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final C5096h0 b() {
            return new C5096h0(A0.Q(this.f38093a));
        }

        @NonNull
        public final void f() {
            this.f38093a.U(C5096h0.f38303H, 0);
        }

        @NonNull
        public final void g(@NonNull Size size) {
            this.f38093a.U(InterfaceC5102k0.f38347q, size);
        }

        @NonNull
        public final void h() {
            A a11 = A.f4076d;
            if (!a11.equals(a11)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            this.f38093a.U(InterfaceC5100j0.f38331k, a11);
        }

        @NonNull
        public final void i(@NonNull Q.b bVar) {
            this.f38093a.U(InterfaceC5102k0.f38350t, bVar);
        }

        @NonNull
        public final void j() {
            this.f38093a.U(b1.f38271z, 1);
        }

        @NonNull
        @Deprecated
        public final void k() {
            this.f38093a.U(InterfaceC5102k0.f38342l, 0);
        }

        private c(C5123v0 c5123v0) {
            Object obj;
            this.f38093a = c5123v0;
            Object obj2 = null;
            try {
                obj = c5123v0.a(J.m.f12652c);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls = (Class) obj;
            if (cls != null && !cls.equals(h.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f38093a.U(b1.f38264D, c1.b.IMAGE_ANALYSIS);
            T.a<Class<?>> aVar = J.m.f12652c;
            C5123v0 c5123v02 = this.f38093a;
            c5123v02.U(aVar, h.class);
            try {
                obj2 = c5123v02.a(J.m.f12651b);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                c5123v02.U(J.m.f12651b, h.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private static final C5096h0 f38094a;

        static {
            Size size = new Size(640, 480);
            b.a aVar = new b.a();
            aVar.d(Q.a.f22724a);
            aVar.f(new Q.c(M.c.f17201c, 1));
            Q.b a11 = aVar.a();
            c cVar = new c();
            cVar.g(size);
            cVar.j();
            cVar.k();
            cVar.i(a11);
            cVar.h();
            f38094a = cVar.b();
        }

        @NonNull
        public static C5096h0 a() {
            return f38094a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    h(@NonNull C5096h0 c5096h0) {
        super(c5096h0);
        this.f38088q = new Object();
        if (((Integer) ((C5096h0) i()).c(C5096h0.f38303H, 0)).intValue() == 1) {
            this.f38087p = new l();
        } else {
            this.f38087p = new m((Executor) c5096h0.c(J.n.f12653d, H.c.c()));
        }
        this.f38087p.l(X());
        this.f38087p.m(((Boolean) ((C5096h0) i()).c(C5096h0.f38308M, Boolean.FALSE)).booleanValue());
    }

    @Override // androidx.camera.core.w
    public final void G() {
        this.f38087p.f38428s = true;
    }

    /* JADX WARN: Type inference failed for: r6v18, types: [androidx.camera.core.impl.b1, androidx.camera.core.impl.b1<?>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.camera.core.impl.J0, androidx.camera.core.impl.b1] */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.camera.core.impl.J0, androidx.camera.core.impl.b1] */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.camera.core.impl.b1, androidx.camera.core.impl.b1<?>] */
    @Override // androidx.camera.core.w
    @NonNull
    protected final b1<?> I(@NonNull H h11, @NonNull b1.a<?, ?, ?> aVar) {
        Size defaultTargetResolution;
        Boolean bool = (Boolean) ((C5096h0) i()).c(C5096h0.f38307L, null);
        boolean a11 = h11.l().a(OnePixelShiftQuirk.class);
        k kVar = this.f38087p;
        if (bool != null) {
            a11 = bool.booleanValue();
        }
        kVar.k(a11);
        synchronized (this.f38088q) {
            try {
                FintechBaseImageAnalyzer fintechBaseImageAnalyzer = this.f38089r;
                defaultTargetResolution = fintechBaseImageAnalyzer != null ? fintechBaseImageAnalyzer.getDefaultTargetResolution() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (defaultTargetResolution == null) {
            return aVar.b();
        }
        Object a12 = aVar.a();
        T.a<Integer> aVar2 = InterfaceC5102k0.f38343m;
        Object obj = 0;
        A0 a02 = (A0) a12;
        a02.getClass();
        try {
            obj = a02.a(aVar2);
        } catch (IllegalArgumentException unused) {
        }
        if (h11.g(((Integer) obj).intValue()) % 180 == 90) {
            defaultTargetResolution = new Size(defaultTargetResolution.getHeight(), defaultTargetResolution.getWidth());
        }
        ?? b11 = aVar.b();
        T.a<Size> aVar3 = InterfaceC5102k0.f38346p;
        if (!b11.d(aVar3)) {
            ((C5123v0) aVar.a()).U(aVar3, defaultTargetResolution);
        }
        ?? b12 = aVar.b();
        T.a aVar4 = InterfaceC5102k0.f38350t;
        if (b12.d(aVar4)) {
            Q.b bVar = (Q.b) b().c(aVar4, null);
            b.a aVar5 = bVar == null ? new b.a() : b.a.b(bVar);
            if (bVar == null || bVar.d() == null) {
                aVar5.f(new Q.c(defaultTargetResolution, 1));
            }
            if (bVar == null) {
                aVar5.e(new C(defaultTargetResolution));
            }
            ((C5123v0) aVar.a()).U(aVar4, aVar5.a());
        }
        return aVar.b();
    }

    @Override // androidx.camera.core.w
    @NonNull
    protected final T0 L(@NonNull T t2) {
        this.f38090s.e(t2);
        Object[] objArr = {this.f38090s.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        S(Collections.unmodifiableList(arrayList));
        T0.a g10 = d().g();
        g10.d(t2);
        return g10.a();
    }

    @Override // androidx.camera.core.w
    @NonNull
    protected final T0 M(@NonNull T0 t02, T0 t03) {
        C5096h0 c5096h0 = (C5096h0) i();
        h();
        O0.b W11 = W(c5096h0, t02);
        this.f38090s = W11;
        Object[] objArr = {W11.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        S(Collections.unmodifiableList(arrayList));
        return t02;
    }

    @Override // androidx.camera.core.w
    public final void N() {
        V();
        k kVar = this.f38087p;
        kVar.f38428s = false;
        kVar.e();
    }

    @Override // androidx.camera.core.w
    public final void P(@NonNull Matrix matrix) {
        super.P(matrix);
        this.f38087p.p(matrix);
    }

    @Override // androidx.camera.core.w
    public final void Q(@NonNull Rect rect) {
        super.Q(rect);
        this.f38087p.q(rect);
    }

    final void V() {
        G.q.a();
        O0.c cVar = this.f38092u;
        if (cVar != null) {
            cVar.b();
            this.f38092u = null;
        }
        C5106m0 c5106m0 = this.f38091t;
        if (c5106m0 != null) {
            c5106m0.d();
            this.f38091t = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final O0.b W(@NonNull C5096h0 c5096h0, @NonNull T0 t02) {
        u uVar;
        boolean z11;
        u uVar2;
        I f7;
        C5106m0 c5106m0;
        O0.c cVar;
        G.q.a();
        Size e11 = t02.e();
        Executor executor = (Executor) c5096h0.c(J.n.f12653d, H.c.c());
        executor.getClass();
        Executor executor2 = executor;
        boolean z12 = true;
        int intValue = ((Integer) ((C5096h0) i()).c(C5096h0.f38303H, 0)).intValue() == 1 ? ((Integer) ((C5096h0) i()).c(C5096h0.f38304I, 6)).intValue() : 4;
        T.a<O> aVar = C5096h0.f38305J;
        if (((O) c5096h0.c(aVar, null)) != null) {
            O o11 = (O) c5096h0.c(aVar, null);
            e11.getWidth();
            e11.getHeight();
            l();
            uVar = new u(o11.newInstance());
        } else {
            uVar = new u(q.a(e11.getWidth(), e11.getHeight(), l(), intValue));
        }
        if (f() != null) {
            I f11 = f();
            if (((Boolean) ((C5096h0) i()).c(C5096h0.f38308M, Boolean.FALSE)).booleanValue() && p(f11, false) % 180 != 0) {
                z11 = true;
                int height = !z11 ? e11.getHeight() : e11.getWidth();
                int width = !z11 ? e11.getWidth() : e11.getHeight();
                int i11 = X() != 2 ? 1 : 35;
                boolean z13 = l() != 35 && X() == 2;
                if (l() == 35 || ((f() == null || p(f(), false) == 0) && !Boolean.TRUE.equals((Boolean) ((C5096h0) i()).c(C5096h0.f38307L, null)))) {
                    z12 = false;
                }
                uVar2 = (!z13 || z12) ? new u(q.a(height, width, i11, uVar.c())) : null;
                k kVar = this.f38087p;
                if (uVar2 != null) {
                    kVar.n(uVar2);
                }
                f7 = f();
                if (f7 != null) {
                    kVar.o(p(f7, false));
                }
                uVar.g(kVar, executor2);
                O0.b m11 = O0.b.m(c5096h0, t02.e());
                if (t02.d() != null) {
                    m11.e(t02.d());
                }
                c5106m0 = this.f38091t;
                if (c5106m0 != null) {
                    c5106m0.d();
                }
                C5106m0 c5106m02 = new C5106m0(uVar.a(), e11, l());
                this.f38091t = c5106m02;
                c5106m02.k().a(new E(0, uVar, uVar2), H.c.e());
                m11.q(t02.c());
                m11.i(this.f38091t, t02.b(), -1);
                cVar = this.f38092u;
                if (cVar != null) {
                    cVar.b();
                }
                O0.c cVar2 = new O0.c(new O0.d() { // from class: androidx.camera.core.g
                    @Override // androidx.camera.core.impl.O0.d
                    public final void a(O0 o02, O0.g gVar) {
                        h hVar = h.this;
                        if (hVar.f() == null) {
                            return;
                        }
                        hVar.V();
                        hVar.f38087p.e();
                        hVar.h();
                        C5096h0 c5096h02 = (C5096h0) hVar.i();
                        T0 d11 = hVar.d();
                        d11.getClass();
                        O0.b W11 = hVar.W(c5096h02, d11);
                        hVar.f38090s = W11;
                        Object[] objArr = {W11.k()};
                        ArrayList arrayList = new ArrayList(1);
                        Object obj = objArr[0];
                        Objects.requireNonNull(obj);
                        arrayList.add(obj);
                        hVar.S(Collections.unmodifiableList(arrayList));
                        hVar.D();
                    }
                });
                this.f38092u = cVar2;
                m11.p(cVar2);
                return m11;
            }
        }
        z11 = false;
        if (!z11) {
        }
        if (!z11) {
        }
        if (X() != 2) {
        }
        if (l() != 35) {
        }
        if (l() == 35) {
        }
        z12 = false;
        if (z13) {
        }
        k kVar2 = this.f38087p;
        if (uVar2 != null) {
        }
        f7 = f();
        if (f7 != null) {
        }
        uVar.g(kVar2, executor2);
        O0.b m112 = O0.b.m(c5096h0, t02.e());
        if (t02.d() != null) {
        }
        c5106m0 = this.f38091t;
        if (c5106m0 != null) {
        }
        C5106m0 c5106m022 = new C5106m0(uVar.a(), e11, l());
        this.f38091t = c5106m022;
        c5106m022.k().a(new E(0, uVar, uVar2), H.c.e());
        m112.q(t02.c());
        m112.i(this.f38091t, t02.b(), -1);
        cVar = this.f38092u;
        if (cVar != null) {
        }
        O0.c cVar22 = new O0.c(new O0.d() { // from class: androidx.camera.core.g
            @Override // androidx.camera.core.impl.O0.d
            public final void a(O0 o02, O0.g gVar) {
                h hVar = h.this;
                if (hVar.f() == null) {
                    return;
                }
                hVar.V();
                hVar.f38087p.e();
                hVar.h();
                C5096h0 c5096h02 = (C5096h0) hVar.i();
                T0 d11 = hVar.d();
                d11.getClass();
                O0.b W11 = hVar.W(c5096h02, d11);
                hVar.f38090s = W11;
                Object[] objArr = {W11.k()};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                hVar.S(Collections.unmodifiableList(arrayList));
                hVar.D();
            }
        });
        this.f38092u = cVar22;
        m112.p(cVar22);
        return m112;
    }

    public final int X() {
        return ((Integer) ((C5096h0) i()).c(C5096h0.f38306K, 1)).intValue();
    }

    public final void Y(@NonNull Executor executor, @NonNull FintechBaseImageAnalyzer fintechBaseImageAnalyzer) {
        synchronized (this.f38088q) {
            try {
                this.f38087p.j(executor, new B(fintechBaseImageAnalyzer));
                if (this.f38089r == null) {
                    B();
                }
                this.f38089r = fintechBaseImageAnalyzer;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.w
    public final b1<?> j(boolean z11, @NonNull c1 c1Var) {
        f38086v.getClass();
        T a11 = c1Var.a(d.a().N(), 1);
        if (z11) {
            a11 = T.O(a11, d.a());
        }
        if (a11 == null) {
            return null;
        }
        return c.d(a11).b();
    }

    @NonNull
    public final String toString() {
        return "ImageAnalysis:".concat(n());
    }

    @Override // androidx.camera.core.w
    @NonNull
    public final b1.a<?, ?, ?> w(@NonNull T t2) {
        return c.d(t2);
    }
}
