package E0;

import K1.C3422b;
import P1.AbstractC3809p;
import S0.A1;
import S0.C3991w0;
import S0.l1;
import S0.n1;
import c1.AbstractC5706J;
import c1.AbstractC5715f;
import c1.C5721l;
import c1.InterfaceC5704H;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class V0 implements A1<K1.K>, InterfaceC5704H {

    /* renamed from: c, reason: collision with root package name */
    private K1.M f7094c;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3991w0 f7092a = n1.f(null, c.f7114e);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f7093b = n1.f(null, b.f7107g);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private a f7095d = new a();

    private static final class a extends AbstractC5706J {

        /* renamed from: c, reason: collision with root package name */
        private D0.a f7096c;

        /* renamed from: d, reason: collision with root package name */
        private K1.Q f7097d;

        /* renamed from: e, reason: collision with root package name */
        private K1.T f7098e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f7099f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f7100g;

        /* renamed from: j, reason: collision with root package name */
        private Z1.s f7103j;

        /* renamed from: k, reason: collision with root package name */
        private AbstractC3809p.a f7104k;

        /* renamed from: m, reason: collision with root package name */
        private K1.K f7106m;

        /* renamed from: h, reason: collision with root package name */
        private float f7101h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        private float f7102i = Float.NaN;

        /* renamed from: l, reason: collision with root package name */
        private long f7105l = Z1.c.b(0, 0, 15);

        public final void A(K1.T t2) {
            this.f7098e = t2;
        }

        public final void B(D0.a aVar) {
            this.f7096c = aVar;
        }

        @Override // c1.AbstractC5706J
        public final void a(@NotNull AbstractC5706J abstractC5706J) {
            Intrinsics.g(abstractC5706J, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
            a aVar = (a) abstractC5706J;
            this.f7096c = aVar.f7096c;
            this.f7097d = aVar.f7097d;
            this.f7098e = aVar.f7098e;
            this.f7099f = aVar.f7099f;
            this.f7100g = aVar.f7100g;
            this.f7101h = aVar.f7101h;
            this.f7102i = aVar.f7102i;
            this.f7103j = aVar.f7103j;
            this.f7104k = aVar.f7104k;
            this.f7105l = aVar.f7105l;
            this.f7106m = aVar.f7106m;
        }

        @Override // c1.AbstractC5706J
        @NotNull
        public final AbstractC5706J b() {
            return new a();
        }

        public final K1.Q g() {
            return this.f7097d;
        }

        public final long h() {
            return this.f7105l;
        }

        public final float i() {
            return this.f7101h;
        }

        public final AbstractC3809p.a j() {
            return this.f7104k;
        }

        public final float k() {
            return this.f7102i;
        }

        public final Z1.s l() {
            return this.f7103j;
        }

        public final K1.K m() {
            return this.f7106m;
        }

        public final boolean n() {
            return this.f7099f;
        }

        public final boolean o() {
            return this.f7100g;
        }

        public final K1.T p() {
            return this.f7098e;
        }

        public final CharSequence q() {
            return this.f7096c;
        }

        public final void r(K1.Q q11) {
            this.f7097d = q11;
        }

        public final void s(long j11) {
            this.f7105l = j11;
        }

        public final void t(float f7) {
            this.f7101h = f7;
        }

        @NotNull
        public final String toString() {
            return "CacheRecord(visualText=" + ((Object) this.f7096c) + ", composition=" + this.f7097d + ", textStyle=" + this.f7098e + ", singleLine=" + this.f7099f + ", softWrap=" + this.f7100g + ", densityValue=" + this.f7101h + ", fontScale=" + this.f7102i + ", layoutDirection=" + this.f7103j + ", fontFamilyResolver=" + this.f7104k + ", constraints=" + ((Object) Z1.b.o(this.f7105l)) + ", layoutResult=" + this.f7106m + ')';
        }

        public final void u(AbstractC3809p.a aVar) {
            this.f7104k = aVar;
        }

        public final void v(float f7) {
            this.f7102i = f7;
        }

        public final void w(Z1.s sVar) {
            this.f7103j = sVar;
        }

        public final void x(K1.K k11) {
            this.f7106m = k11;
        }

        public final void y(boolean z11) {
            this.f7099f = z11;
        }

        public final void z(boolean z11) {
            this.f7100g = z11;
        }
    }

    private static final class b {

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private static final a f7107g = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final B1.Y f7108a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Z1.s f7109b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final AbstractC3809p.a f7110c;

        /* renamed from: d, reason: collision with root package name */
        private final long f7111d;

        /* renamed from: e, reason: collision with root package name */
        private final float f7112e;

        /* renamed from: f, reason: collision with root package name */
        private final float f7113f;

        public static final class a implements l1<b> {
            /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[RETURN] */
            @Override // S0.l1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean a(b bVar, b bVar2) {
                b bVar3 = bVar;
                b bVar4 = bVar2;
                if (bVar3 == null || bVar4 == null) {
                    return !((bVar3 == null) ^ (bVar4 == null));
                }
                if (bVar3.d() != bVar4.d() || bVar3.f() != bVar4.f() || bVar3.g() != bVar4.g() || !Intrinsics.d(bVar3.e(), bVar4.e()) || !Z1.b.e(bVar3.b(), bVar4.b())) {
                }
            }
        }

        public b(B1.Y y11, Z1.s sVar, AbstractC3809p.a aVar, long j11) {
            this.f7108a = y11;
            this.f7109b = sVar;
            this.f7110c = aVar;
            this.f7111d = j11;
            this.f7112e = y11.g();
            this.f7113f = y11.u1();
        }

        public final long b() {
            return this.f7111d;
        }

        @NotNull
        public final Z1.d c() {
            return this.f7108a;
        }

        public final float d() {
            return this.f7112e;
        }

        @NotNull
        public final AbstractC3809p.a e() {
            return this.f7110c;
        }

        public final float f() {
            return this.f7113f;
        }

        @NotNull
        public final Z1.s g() {
            return this.f7109b;
        }

        @NotNull
        public final String toString() {
            return "MeasureInputs(density=" + this.f7108a + ", densityValue=" + this.f7112e + ", fontScale=" + this.f7113f + ", layoutDirection=" + this.f7109b + ", fontFamilyResolver=" + this.f7110c + ", constraints=" + ((Object) Z1.b.o(this.f7111d)) + ')';
        }
    }

    private static final class c {

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private static final a f7114e = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final c1 f7115a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final K1.T f7116b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f7117c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f7118d;

        public static final class a implements l1<c> {
            /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[RETURN] */
            @Override // S0.l1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean a(c cVar, c cVar2) {
                c cVar3 = cVar;
                c cVar4 = cVar2;
                if (cVar3 == null || cVar4 == null) {
                    return !((cVar3 == null) ^ (cVar4 == null));
                }
                if (cVar3.d() != cVar4.d() || !Intrinsics.d(cVar3.e(), cVar4.e()) || cVar3.b() != cVar4.b() || cVar3.c() != cVar4.c()) {
                }
            }
        }

        public c(@NotNull c1 c1Var, @NotNull K1.T t2, boolean z11, boolean z12) {
            this.f7115a = c1Var;
            this.f7116b = t2;
            this.f7117c = z11;
            this.f7118d = z12;
        }

        public final boolean b() {
            return this.f7117c;
        }

        public final boolean c() {
            return this.f7118d;
        }

        @NotNull
        public final c1 d() {
            return this.f7115a;
        }

        @NotNull
        public final K1.T e() {
            return this.f7116b;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NonMeasureInputs(textFieldState=");
            sb2.append(this.f7115a);
            sb2.append(", textStyle=");
            sb2.append(this.f7116b);
            sb2.append(", singleLine=");
            sb2.append(this.f7117c);
            sb2.append(", softWrap=");
            return B4.V.d(sb2, this.f7118d, ')');
        }
    }

    private final K1.K m(c cVar, b bVar) {
        V1.i iVar;
        CharSequence q11;
        K1.K a11;
        D0.a j11 = cVar.d().j();
        a aVar = (a) C5721l.A(this.f7095d);
        K1.K m11 = aVar.m();
        if (m11 != null && (q11 = aVar.q()) != null && kotlin.text.h.v(q11, j11) && Intrinsics.d(aVar.g(), j11.b()) && aVar.n() == cVar.b() && aVar.o() == cVar.c() && aVar.l() == bVar.g() && aVar.i() == bVar.c().g() && aVar.k() == bVar.c().u1() && Z1.b.e(aVar.h(), bVar.b()) && Intrinsics.d(aVar.j(), bVar.e()) && !m11.v().i().a()) {
            K1.T p11 = aVar.p();
            boolean B11 = p11 != null ? p11.B(cVar.e()) : false;
            K1.T p12 = aVar.p();
            boolean A11 = p12 != null ? p12.A(cVar.e()) : false;
            if (B11 && A11) {
                return m11;
            }
            if (B11) {
                a11 = m11.a(new K1.J(m11.k().j(), cVar.e(), m11.k().g(), m11.k().e(), m11.k().h(), m11.k().f(), m11.k().b(), m11.k().d(), m11.k().c(), m11.k().a()), m11.f14997c);
                return a11;
            }
        }
        K1.M m12 = this.f7094c;
        if (m12 == null) {
            m12 = new K1.M(bVar.e(), bVar.c(), bVar.g(), 1);
            this.f7094c = m12;
        }
        K1.M m13 = m12;
        C3422b.a aVar2 = new C3422b.a();
        aVar2.e(j11.toString());
        if (j11.b() != null) {
            iVar = V1.i.f27916c;
            aVar2.b(new K1.D(0L, 0L, (P1.F) null, (P1.A) null, (P1.B) null, (AbstractC3809p) null, (String) null, 0L, (V1.a) null, (V1.m) null, (R1.c) null, 0L, iVar, (l1.H0) null, 61439), K1.Q.h(j11.b().k()), K1.Q.g(j11.b().k()));
        }
        K1.K b11 = K1.M.b(m13, aVar2.i(), cVar.e(), 0, cVar.c(), cVar.b() ? 1 : Integer.MAX_VALUE, bVar.b(), bVar.g(), bVar.c(), bVar.e(), 1060);
        if (!b11.equals(m11)) {
            AbstractC5715f C11 = C5721l.C();
            if (!C11.i()) {
                a aVar3 = this.f7095d;
                synchronized (C5721l.D()) {
                    a aVar4 = (a) C5721l.Q(aVar3, this, C11);
                    aVar4.B(j11);
                    aVar4.r(j11.b());
                    aVar4.y(cVar.b());
                    aVar4.z(cVar.c());
                    aVar4.A(cVar.e());
                    aVar4.w(bVar.g());
                    aVar4.t(bVar.d());
                    aVar4.v(bVar.f());
                    aVar4.s(bVar.b());
                    aVar4.u(bVar.e());
                    aVar4.x(b11);
                    Unit unit = Unit.f71690a;
                }
                C5721l.H(C11, this);
                return b11;
            }
        }
        return b11;
    }

    @Override // c1.InterfaceC5704H
    public final void b(@NotNull AbstractC5706J abstractC5706J) {
        this.f7095d = (a) abstractC5706J;
    }

    @Override // c1.InterfaceC5704H
    @NotNull
    public final AbstractC5706J k() {
        return this.f7095d;
    }

    @Override // c1.InterfaceC5704H
    @NotNull
    public final AbstractC5706J o(@NotNull AbstractC5706J abstractC5706J, @NotNull AbstractC5706J abstractC5706J2, @NotNull AbstractC5706J abstractC5706J3) {
        return abstractC5706J3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // S0.A1
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final K1.K getValue() {
        b bVar;
        c cVar = (c) this.f7092a.getValue();
        if (cVar == null || (bVar = (b) this.f7093b.getValue()) == null) {
            return null;
        }
        return m(cVar, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final K1.K v(@NotNull B1.Y y11, @NotNull Z1.s sVar, @NotNull AbstractC3809p.a aVar, long j11) {
        b bVar = new b(y11, sVar, aVar, j11);
        this.f7093b.setValue(bVar);
        c cVar = (c) this.f7092a.getValue();
        if (cVar != null) {
            return m(cVar, bVar);
        }
        throw new IllegalStateException("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
    }

    public final void w(@NotNull c1 c1Var, @NotNull K1.T t2, boolean z11, boolean z12) {
        this.f7092a.setValue(new c(c1Var, t2, z11, z12));
    }
}
