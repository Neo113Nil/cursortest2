package B0;

import K1.C3422b;
import P1.AbstractC3809p;
import Q1.C3843l;
import Q1.C3848q;
import S0.C3991w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7784B;
import l1.C7785C;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class O0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private C2471f1 f1462a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S0.I0 f1463b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.compose.ui.platform.P1 f1464c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3843l f1465d = new C3843l();

    /* renamed from: e, reason: collision with root package name */
    private Q1.V f1466e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C3991w0 f1467f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C3991w0 f1468g;

    /* renamed from: h, reason: collision with root package name */
    private B1.B f1469h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C3991w0 f1470i;

    /* renamed from: j, reason: collision with root package name */
    private C3422b f1471j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C3991w0 f1472k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C3991w0 f1473l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C3991w0 f1474m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C3991w0 f1475n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C3991w0 f1476o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f1477p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final C3991w0 f1478q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final K0 f1479r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private Function1<? super Q1.K, Unit> f1480s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final Function1<Q1.K, Unit> f1481t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final Function1<C3848q, Unit> f1482u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final C7784B f1483v;

    /* renamed from: w, reason: collision with root package name */
    private long f1484w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final C3991w0 f1485x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final C3991w0 f1486y;

    static final class a extends AbstractC7737t implements Function1<C3848q, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C3848q c3848q) {
            O0.this.f1479r.b(c3848q.c());
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<Q1.K, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Q1.K k11) {
            long j11;
            long j12;
            Q1.K k12 = k11;
            String f7 = k12.f();
            O0 o02 = O0.this;
            C3422b w11 = o02.w();
            if (!Intrinsics.d(f7, w11 != null ? w11.h() : null)) {
                o02.A(EnumC2529z0.None);
            }
            j11 = K1.Q.f15009b;
            o02.H(j11);
            j12 = K1.Q.f15009b;
            o02.z(j12);
            o02.f1480s.invoke(k12);
            o02.o().invalidate();
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<Q1.K, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f1489b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Q1.K k11) {
            return Unit.f71690a;
        }
    }

    public O0(@NotNull C2471f1 c2471f1, @NotNull S0.I0 i02, androidx.compose.ui.platform.P1 p12) {
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        C3991w0 f13;
        C3991w0 f14;
        C3991w0 f15;
        C3991w0 f16;
        C3991w0 f17;
        C3991w0 f18;
        long j11;
        long j12;
        C3991w0 f19;
        long j13;
        C3991w0 f21;
        this.f1462a = c2471f1;
        this.f1463b = i02;
        this.f1464c = p12;
        Boolean bool = Boolean.FALSE;
        f7 = S0.n1.f(bool, S0.D1.f25195a);
        this.f1467f = f7;
        f11 = S0.n1.f(Z1.h.a(0), S0.D1.f25195a);
        this.f1468g = f11;
        f12 = S0.n1.f(null, S0.D1.f25195a);
        this.f1470i = f12;
        f13 = S0.n1.f(EnumC2529z0.None, S0.D1.f25195a);
        this.f1472k = f13;
        f14 = S0.n1.f(bool, S0.D1.f25195a);
        this.f1473l = f14;
        f15 = S0.n1.f(bool, S0.D1.f25195a);
        this.f1474m = f15;
        f16 = S0.n1.f(bool, S0.D1.f25195a);
        this.f1475n = f16;
        f17 = S0.n1.f(bool, S0.D1.f25195a);
        this.f1476o = f17;
        this.f1477p = true;
        f18 = S0.n1.f(Boolean.TRUE, S0.D1.f25195a);
        this.f1478q = f18;
        this.f1479r = new K0(p12);
        this.f1480s = c.f1489b;
        this.f1481t = new b();
        this.f1482u = new a();
        this.f1483v = C7785C.a();
        j11 = C7807Z.f72259m;
        this.f1484w = j11;
        j12 = K1.Q.f15009b;
        f19 = S0.n1.f(K1.Q.b(j12), S0.D1.f25195a);
        this.f1485x = f19;
        j13 = K1.Q.f15009b;
        f21 = S0.n1.f(K1.Q.b(j13), S0.D1.f25195a);
        this.f1486y = f21;
    }

    public final void A(@NotNull EnumC2529z0 enumC2529z0) {
        this.f1472k.setValue(enumC2529z0);
    }

    public final void B(boolean z11) {
        this.f1467f.setValue(Boolean.valueOf(z11));
    }

    public final void C(boolean z11) {
        this.f1478q.setValue(Boolean.valueOf(z11));
    }

    public final void D(Q1.V v11) {
        this.f1466e = v11;
    }

    public final void E(B1.B b11) {
        this.f1469h = b11;
    }

    public final void F(R1 r12) {
        this.f1470i.setValue(r12);
        this.f1477p = false;
    }

    public final void G(float f7) {
        this.f1468g.setValue(Z1.h.a(f7));
    }

    public final void H(long j11) {
        this.f1485x.setValue(K1.Q.b(j11));
    }

    public final void I(boolean z11) {
        this.f1476o.setValue(Boolean.valueOf(z11));
    }

    public final void J(boolean z11) {
        this.f1473l.setValue(Boolean.valueOf(z11));
    }

    public final void K(boolean z11) {
        this.f1475n.setValue(Boolean.valueOf(z11));
    }

    public final void L(boolean z11) {
        this.f1474m.setValue(Boolean.valueOf(z11));
    }

    public final void M(@NotNull C3422b c3422b, @NotNull C3422b c3422b2, @NotNull K1.T t2, boolean z11, @NotNull Z1.d dVar, @NotNull AbstractC3809p.a aVar, @NotNull Function1<? super Q1.K, Unit> function1, @NotNull M0 m02, @NotNull j1.i iVar, long j11) {
        this.f1480s = function1;
        this.f1484w = j11;
        K0 k02 = this.f1479r;
        k02.f1416b = m02;
        k02.f1417c = iVar;
        this.f1471j = c3422b;
        C2471f1 c2471f1 = this.f1462a;
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        if (!Intrinsics.d(c2471f1.j(), c3422b2) || !Intrinsics.d(c2471f1.i(), t2) || c2471f1.h() != z11 || c2471f1.f() != 1 || c2471f1.d() != Integer.MAX_VALUE || c2471f1.e() != 1 || !Intrinsics.d(c2471f1.a(), dVar) || !Intrinsics.d(c2471f1.g(), k11) || c2471f1.b() != aVar) {
            c2471f1 = new C2471f1(c3422b2, t2, z11, dVar, aVar, k11);
        }
        if (this.f1462a != c2471f1) {
            this.f1477p = true;
        }
        this.f1462a = c2471f1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c() {
        return ((K1.Q) this.f1486y.getValue()).k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final EnumC2529z0 d() {
        return (EnumC2529z0) this.f1472k.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e() {
        return ((Boolean) this.f1467f.getValue()).booleanValue();
    }

    @NotNull
    public final C7784B f() {
        return this.f1483v;
    }

    public final Q1.V g() {
        return this.f1466e;
    }

    public final androidx.compose.ui.platform.P1 h() {
        return this.f1464c;
    }

    public final B1.B i() {
        B1.B b11 = this.f1469h;
        if (b11 == null || !b11.I()) {
            return null;
        }
        return b11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final R1 j() {
        return (R1) this.f1470i.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float k() {
        return ((Z1.h) this.f1468g.getValue()).d();
    }

    @NotNull
    public final Function1<C3848q, Unit> l() {
        return this.f1482u;
    }

    @NotNull
    public final Function1<Q1.K, Unit> m() {
        return this.f1481t;
    }

    @NotNull
    public final C3843l n() {
        return this.f1465d;
    }

    @NotNull
    public final S0.I0 o() {
        return this.f1463b;
    }

    public final long p() {
        return this.f1484w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long q() {
        return ((K1.Q) this.f1485x.getValue()).k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r() {
        return ((Boolean) this.f1476o.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean s() {
        return ((Boolean) this.f1473l.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean t() {
        return ((Boolean) this.f1475n.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u() {
        return ((Boolean) this.f1474m.getValue()).booleanValue();
    }

    @NotNull
    public final C2471f1 v() {
        return this.f1462a;
    }

    public final C3422b w() {
        return this.f1471j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean x() {
        return ((Boolean) this.f1478q.getValue()).booleanValue();
    }

    public final boolean y() {
        return this.f1477p;
    }

    public final void z(long j11) {
        this.f1486y.setValue(K1.Q.b(j11));
    }
}
