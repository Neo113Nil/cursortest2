package androidx.compose.foundation.text.modifiers;

import B1.AbstractC2531a;
import B1.C2533b;
import B1.InterfaceC2552v;
import B1.U;
import B1.W;
import B1.Y;
import B1.m0;
import D1.C2809k;
import D1.C2820u;
import D1.E;
import D1.E0;
import D1.InterfaceC2819t;
import D1.V;
import H0.h;
import I1.C3222a;
import I1.D;
import I1.k;
import I1.u;
import I1.z;
import K1.C3422b;
import K1.C3433m;
import K1.C3442w;
import K1.J;
import K1.K;
import K1.T;
import Kk.C3532b;
import P1.AbstractC3809p;
import V1.i;
import androidx.compose.ui.e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k1.C7460f;
import k1.C7461g;
import k1.C7465k;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.H0;
import l1.InterfaceC7802U;
import l1.InterfaceC7813c0;
import n1.AbstractC8413f;
import n1.C8415h;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b extends e.c implements E, InterfaceC2819t, E0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private C3422b f39841a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private T f39842b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private AbstractC3809p.a f39843c;

    /* renamed from: d, reason: collision with root package name */
    private Function1<? super K, Unit> f39844d;

    /* renamed from: e, reason: collision with root package name */
    private int f39845e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f39846f;

    /* renamed from: g, reason: collision with root package name */
    private int f39847g;

    /* renamed from: h, reason: collision with root package name */
    private int f39848h;

    /* renamed from: i, reason: collision with root package name */
    private List<C3422b.C0288b<C3442w>> f39849i;

    /* renamed from: j, reason: collision with root package name */
    private Function1<? super List<C7460f>, Unit> f39850j;

    /* renamed from: k, reason: collision with root package name */
    private h f39851k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC7813c0 f39852l;

    /* renamed from: m, reason: collision with root package name */
    private Function1<? super a, Unit> f39853m;

    /* renamed from: n, reason: collision with root package name */
    private Map<AbstractC2531a, Integer> f39854n;

    /* renamed from: o, reason: collision with root package name */
    private H0.e f39855o;

    /* renamed from: p, reason: collision with root package name */
    private Function1<? super List<K>, Boolean> f39856p;

    /* renamed from: q, reason: collision with root package name */
    private a f39857q;

    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C3422b f39858a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private C3422b f39859b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f39860c = false;

        /* renamed from: d, reason: collision with root package name */
        private H0.e f39861d = null;

        public a(C3422b c3422b, C3422b c3422b2) {
            this.f39858a = c3422b;
            this.f39859b = c3422b2;
        }

        public final H0.e a() {
            return this.f39861d;
        }

        @NotNull
        public final C3422b b() {
            return this.f39858a;
        }

        @NotNull
        public final C3422b c() {
            return this.f39859b;
        }

        public final boolean d() {
            return this.f39860c;
        }

        public final void e(H0.e eVar) {
            this.f39861d = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f39858a, aVar.f39858a) && Intrinsics.d(this.f39859b, aVar.f39859b) && this.f39860c == aVar.f39860c && Intrinsics.d(this.f39861d, aVar.f39861d);
        }

        public final void f(boolean z11) {
            this.f39860c = z11;
        }

        public final void g(@NotNull C3422b c3422b) {
            this.f39859b = c3422b;
        }

        public final int hashCode() {
            int a11 = C3532b.a((this.f39859b.hashCode() + (this.f39858a.hashCode() * 31)) * 31, 31, this.f39860c);
            H0.e eVar = this.f39861d;
            return a11 + (eVar == null ? 0 : eVar.hashCode());
        }

        @NotNull
        public final String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.f39858a) + ", substitution=" + ((Object) this.f39859b) + ", isShowingSubstitution=" + this.f39860c + ", layoutCache=" + this.f39861d + ')';
        }
    }

    /* renamed from: androidx.compose.foundation.text.modifiers.b$b, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    static final class C0736b extends AbstractC7737t implements Function1<List<K>, Boolean> {
        C0736b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(List<K> list) {
            K k11;
            List<K> list2 = list;
            b bVar = b.this;
            K b11 = bVar.Q1().b();
            if (b11 != null) {
                C3422b j11 = b11.k().j();
                T t2 = bVar.f39842b;
                InterfaceC7813c0 interfaceC7813c0 = bVar.f39852l;
                k11 = b11.a(new J(j11, T.F(t2, interfaceC7813c0 != null ? interfaceC7813c0.mo7invoke0d7_KjU() : C7807Z.f72259m, 0L, null, null, null, 0L, null, 0, 0L, 16777214), b11.k().g(), b11.k().e(), b11.k().h(), b11.k().f(), b11.k().b(), b11.k().d(), b11.k().c(), b11.k().a()), b11.f14997c);
                list2.add(k11);
            } else {
                k11 = null;
            }
            return Boolean.valueOf(k11 != null);
        }
    }

    /* loaded from: classes8.dex */
    static final class c extends AbstractC7737t implements Function1<C3422b, Boolean> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(C3422b c3422b) {
            b bVar = b.this;
            b.N1(bVar, c3422b);
            b.M1(bVar);
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes8.dex */
    static final class d extends AbstractC7737t implements Function1<Boolean, Boolean> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            b bVar = b.this;
            if (bVar.S1() == null) {
                return Boolean.FALSE;
            }
            Function1 function1 = bVar.f39853m;
            if (function1 != null) {
                a S12 = bVar.S1();
                Intrinsics.f(S12);
                function1.invoke(S12);
            }
            a S13 = bVar.S1();
            if (S13 != null) {
                S13.f(booleanValue);
            }
            b.M1(bVar);
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes8.dex */
    static final class e extends AbstractC7737t implements Function0<Boolean> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            b bVar = b.this;
            bVar.O1();
            b.M1(bVar);
            return Boolean.TRUE;
        }
    }

    static final class f extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f39866b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(m0 m0Var) {
            super(1);
            this.f39866b = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.d(this.f39866b, 0, 0, 0.0f);
            return Unit.f71690a;
        }
    }

    private b() {
        throw null;
    }

    public b(C3422b c3422b, T t2, AbstractC3809p.a aVar, Function1 function1, int i11, boolean z11, int i12, int i13, List list, Function1 function12, h hVar, InterfaceC7813c0 interfaceC7813c0, Function1 function13) {
        this.f39841a = c3422b;
        this.f39842b = t2;
        this.f39843c = aVar;
        this.f39844d = function1;
        this.f39845e = i11;
        this.f39846f = z11;
        this.f39847g = i12;
        this.f39848h = i13;
        this.f39849i = list;
        this.f39850j = function12;
        this.f39851k = hVar;
        this.f39852l = interfaceC7813c0;
        this.f39853m = function13;
    }

    public static final void M1(b bVar) {
        bVar.getClass();
        C2809k.f(bVar).x0();
        C2809k.f(bVar).u0();
        C2820u.a(bVar);
    }

    public static final void N1(b bVar, C3422b c3422b) {
        a aVar = bVar.f39857q;
        if (aVar == null) {
            a aVar2 = new a(bVar.f39841a, c3422b);
            H0.e eVar = new H0.e(c3422b, bVar.f39842b, bVar.f39843c, bVar.f39845e, bVar.f39846f, bVar.f39847g, bVar.f39848h, bVar.f39849i);
            eVar.i(bVar.Q1().a());
            aVar2.e(eVar);
            bVar.f39857q = aVar2;
            return;
        }
        if (Intrinsics.d(c3422b, aVar.c())) {
            return;
        }
        aVar.g(c3422b);
        H0.e a11 = aVar.a();
        if (a11 != null) {
            a11.l(c3422b, bVar.f39842b, bVar.f39843c, bVar.f39845e, bVar.f39846f, bVar.f39847g, bVar.f39848h, bVar.f39849i);
            Unit unit = Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H0.e Q1() {
        if (this.f39855o == null) {
            this.f39855o = new H0.e(this.f39841a, this.f39842b, this.f39843c, this.f39845e, this.f39846f, this.f39847g, this.f39848h, this.f39849i);
        }
        H0.e eVar = this.f39855o;
        Intrinsics.f(eVar);
        return eVar;
    }

    private final H0.e R1(Z1.d dVar) {
        H0.e a11;
        a aVar = this.f39857q;
        if (aVar != null && aVar.d() && (a11 = aVar.a()) != null) {
            a11.i(dVar);
            return a11;
        }
        H0.e Q12 = Q1();
        Q12.i(dVar);
        return Q12;
    }

    @Override // D1.E
    public final int A(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return R1(v11).h(v11.getLayoutDirection());
    }

    @Override // D1.E
    @NotNull
    public final W D(@NotNull Y y11, @NotNull U u11, long j11) {
        H0.e R12 = R1(y11);
        boolean f7 = R12.f(j11, y11.getLayoutDirection());
        K c11 = R12.c();
        c11.v().i().a();
        if (f7) {
            C2809k.d(this, 2).m2();
            Function1<? super K, Unit> function1 = this.f39844d;
            if (function1 != null) {
                function1.invoke(c11);
            }
            h hVar = this.f39851k;
            if (hVar != null) {
                hVar.h(c11);
            }
            Map<AbstractC2531a, Integer> map = this.f39854n;
            if (map == null) {
                map = new LinkedHashMap<>(2);
            }
            map.put(C2533b.a(), Integer.valueOf(Math.round(c11.g())));
            map.put(C2533b.b(), Integer.valueOf(Math.round(c11.j())));
            this.f39854n = map;
        }
        Function1<? super List<C7460f>, Unit> function12 = this.f39850j;
        if (function12 != null) {
            function12.invoke(c11.z());
        }
        int A11 = (int) (c11.A() >> 32);
        int A12 = (int) (c11.A() >> 32);
        int A13 = (int) (c11.A() & 4294967295L);
        int A14 = (int) (c11.A() & 4294967295L);
        int min = Math.min(A11, 262142);
        int min2 = A12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(A12, 262142);
        int c12 = Z1.c.c(min2 == Integer.MAX_VALUE ? min : min2);
        m0 a02 = u11.a0(Z1.c.a(min, min2, Math.min(c12, A13), A14 != Integer.MAX_VALUE ? Math.min(c12, A14) : Integer.MAX_VALUE));
        int A15 = (int) (c11.A() >> 32);
        int A16 = (int) (c11.A() & 4294967295L);
        Map<AbstractC2531a, Integer> map2 = this.f39854n;
        Intrinsics.f(map2);
        return y11.z0(A15, A16, map2, new f(a02));
    }

    @Override // D1.E
    public final int I(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return R1(v11).d(i11, v11.getLayoutDirection());
    }

    @Override // D1.E
    public final int K(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return R1(v11).d(i11, v11.getLayoutDirection());
    }

    public final void O1() {
        this.f39857q = null;
    }

    public final void P1(boolean z11, boolean z12, boolean z13, boolean z14) {
        if (z12 || z13 || z14) {
            Q1().l(this.f39841a, this.f39842b, this.f39843c, this.f39845e, this.f39846f, this.f39847g, this.f39848h, this.f39849i);
        }
        if (isAttached()) {
            if (z12 || (z11 && this.f39856p != null)) {
                C2809k.f(this).x0();
            }
            if (z12 || z13 || z14) {
                C2809k.f(this).u0();
                C2820u.a(this);
            }
            if (z11) {
                C2820u.a(this);
            }
        }
    }

    public final a S1() {
        return this.f39857q;
    }

    public final boolean T1(Function1<? super K, Unit> function1, Function1<? super List<C7460f>, Unit> function12, h hVar, Function1<? super a, Unit> function13) {
        boolean z11;
        if (this.f39844d != function1) {
            this.f39844d = function1;
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f39850j != function12) {
            this.f39850j = function12;
            z11 = true;
        }
        if (!Intrinsics.d(this.f39851k, hVar)) {
            this.f39851k = hVar;
            z11 = true;
        }
        if (this.f39853m == function13) {
            return z11;
        }
        this.f39853m = function13;
        return true;
    }

    public final boolean U1(InterfaceC7813c0 interfaceC7813c0, @NotNull T t2) {
        boolean d11 = Intrinsics.d(interfaceC7813c0, this.f39852l);
        this.f39852l = interfaceC7813c0;
        return (d11 && t2.A(this.f39842b)) ? false : true;
    }

    public final boolean V1(@NotNull T t2, List<C3422b.C0288b<C3442w>> list, int i11, int i12, boolean z11, @NotNull AbstractC3809p.a aVar, int i13) {
        boolean z12 = !this.f39842b.B(t2);
        this.f39842b = t2;
        if (!Intrinsics.d(this.f39849i, list)) {
            this.f39849i = list;
            z12 = true;
        }
        if (this.f39848h != i11) {
            this.f39848h = i11;
            z12 = true;
        }
        if (this.f39847g != i12) {
            this.f39847g = i12;
            z12 = true;
        }
        if (this.f39846f != z11) {
            this.f39846f = z11;
            z12 = true;
        }
        if (!Intrinsics.d(this.f39843c, aVar)) {
            this.f39843c = aVar;
            z12 = true;
        }
        if (this.f39845e == i13) {
            return z12;
        }
        this.f39845e = i13;
        return true;
    }

    public final boolean W1(@NotNull C3422b c3422b) {
        boolean d11 = Intrinsics.d(this.f39841a.h(), c3422b.h());
        boolean z11 = (d11 && Intrinsics.d(this.f39841a.e(), c3422b.e()) && Intrinsics.d(this.f39841a.c(), c3422b.c()) && this.f39841a.k(c3422b)) ? false : true;
        if (z11) {
            this.f39841a = c3422b;
        }
        if (!d11) {
            this.f39857q = null;
        }
        return z11;
    }

    @Override // D1.E0
    public final void applySemantics(@NotNull D d11) {
        Function1 function1 = this.f39856p;
        if (function1 == null) {
            function1 = new C0736b();
            this.f39856p = function1;
        }
        C3422b c3422b = this.f39841a;
        int i11 = z.f11793b;
        d11.b(u.B(), C7714v.a0(c3422b));
        a aVar = this.f39857q;
        if (aVar != null) {
            z.v(d11, aVar.c());
            z.s(d11, aVar.d());
        }
        d11.b(k.z(), new C3222a(null, new c()));
        d11.b(k.A(), new C3222a(null, new d()));
        d11.b(k.a(), new C3222a(null, new e()));
        z.d(d11, function1);
    }

    @Override // D1.InterfaceC2819t
    public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        boolean l11;
        if (!isAttached()) {
            return;
        }
        h hVar = this.f39851k;
        if (hVar != null) {
            hVar.c(interfaceC8410c);
        }
        D1.J j11 = (D1.J) interfaceC8410c;
        InterfaceC7802U a11 = j11.w0().a();
        K c11 = R1(interfaceC8410c).c();
        C3433m v11 = c11.v();
        boolean z11 = true;
        boolean z12 = c11.h() && this.f39845e != 3;
        if (z12) {
            C7460f a12 = C7461g.a(0L, C7465k.a((int) (c11.A() >> 32), (int) (c11.A() & 4294967295L)));
            a11.save();
            a11.r(a12);
        }
        try {
            i w11 = this.f39842b.w();
            if (w11 == null) {
                w11 = i.f27915b;
            }
            i iVar = w11;
            H0 t2 = this.f39842b.t();
            if (t2 == null) {
                t2 = H0.f72222d;
            }
            H0 h02 = t2;
            AbstractC8413f g10 = this.f39842b.g();
            if (g10 == null) {
                g10 = C8415h.f76287a;
            }
            AbstractC8413f abstractC8413f = g10;
            AbstractC7799Q e11 = this.f39842b.e();
            if (e11 != null) {
                C3433m.D(v11, a11, e11, this.f39842b.d(), h02, iVar, abstractC8413f);
            } else {
                InterfaceC7813c0 interfaceC7813c0 = this.f39852l;
                long mo7invoke0d7_KjU = interfaceC7813c0 != null ? interfaceC7813c0.mo7invoke0d7_KjU() : C7807Z.f72259m;
                if (mo7invoke0d7_KjU == 16) {
                    mo7invoke0d7_KjU = this.f39842b.f() != 16 ? this.f39842b.f() : C7807Z.f72248b;
                }
                v11.C(a11, mo7invoke0d7_KjU, h02, iVar, abstractC8413f);
            }
            if (z12) {
                a11.p();
            }
            a aVar = this.f39857q;
            if (aVar == null || !aVar.d()) {
                C3422b c3422b = this.f39841a;
                l11 = c3422b.l(c3422b.length());
            } else {
                l11 = false;
            }
            if (!l11) {
                List<C3422b.C0288b<C3442w>> list = this.f39849i;
                if (list != null && !list.isEmpty()) {
                    z11 = false;
                }
                if (z11) {
                    return;
                }
            }
            j11.F0();
        } finally {
        }
    }

    @Override // D1.E
    public final int u(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return R1(v11).g(v11.getLayoutDirection());
    }
}
