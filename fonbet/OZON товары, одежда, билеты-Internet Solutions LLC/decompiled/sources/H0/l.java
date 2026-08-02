package H0;

import B1.AbstractC2531a;
import B1.C2533b;
import B1.InterfaceC2552v;
import B1.U;
import B1.W;
import B1.Y;
import B1.m0;
import B4.V;
import D1.C2809k;
import D1.C2820u;
import D1.E;
import D1.E0;
import D1.InterfaceC2819t;
import D1.J;
import I1.C3222a;
import I1.D;
import I1.u;
import I1.z;
import K1.C3421a;
import K1.C3422b;
import K1.InterfaceC3436p;
import K1.K;
import K1.T;
import Kk.C3532b;
import P1.AbstractC3809p;
import androidx.compose.ui.e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
public final class l extends e.c implements E, InterfaceC2819t, E0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private String f10424a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private T f10425b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private AbstractC3809p.a f10426c;

    /* renamed from: d, reason: collision with root package name */
    private int f10427d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10428e;

    /* renamed from: f, reason: collision with root package name */
    private int f10429f;

    /* renamed from: g, reason: collision with root package name */
    private int f10430g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC7813c0 f10431h;

    /* renamed from: i, reason: collision with root package name */
    private Map<AbstractC2531a, Integer> f10432i;

    /* renamed from: j, reason: collision with root package name */
    private H0.f f10433j;

    /* renamed from: k, reason: collision with root package name */
    private Function1<? super List<K>, Boolean> f10434k;

    /* renamed from: l, reason: collision with root package name */
    private a f10435l;

    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f10436a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private String f10437b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f10438c = false;

        /* renamed from: d, reason: collision with root package name */
        private H0.f f10439d = null;

        public a(String str, String str2) {
            this.f10436a = str;
            this.f10437b = str2;
        }

        public final H0.f a() {
            return this.f10439d;
        }

        @NotNull
        public final String b() {
            return this.f10437b;
        }

        public final boolean c() {
            return this.f10438c;
        }

        public final void d(H0.f fVar) {
            this.f10439d = fVar;
        }

        public final void e(boolean z11) {
            this.f10438c = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f10436a, aVar.f10436a) && Intrinsics.d(this.f10437b, aVar.f10437b) && this.f10438c == aVar.f10438c && Intrinsics.d(this.f10439d, aVar.f10439d);
        }

        public final void f(@NotNull String str) {
            this.f10437b = str;
        }

        public final int hashCode() {
            int a11 = C3532b.a(G.g.a(this.f10436a.hashCode() * 31, 31, this.f10437b), 31, this.f10438c);
            H0.f fVar = this.f10439d;
            return a11 + (fVar == null ? 0 : fVar.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextSubstitution(layoutCache=");
            sb2.append(this.f10439d);
            sb2.append(", isShowingSubstitution=");
            return V.d(sb2, this.f10438c, ')');
        }
    }

    static final class b extends AbstractC7737t implements Function1<List<K>, Boolean> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(List<K> list) {
            List<K> list2 = list;
            l lVar = l.this;
            H0.f Q12 = lVar.Q1();
            T t2 = lVar.f10425b;
            InterfaceC7813c0 interfaceC7813c0 = lVar.f10431h;
            K m11 = Q12.m(T.F(t2, interfaceC7813c0 != null ? interfaceC7813c0.mo7invoke0d7_KjU() : C7807Z.f72259m, 0L, null, null, null, 0L, null, 0, 0L, 16777214));
            if (m11 != null) {
                list2.add(m11);
            } else {
                m11 = null;
            }
            return Boolean.valueOf(m11 != null);
        }
    }

    static final class c extends AbstractC7737t implements Function1<C3422b, Boolean> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(C3422b c3422b) {
            String h11 = c3422b.h();
            l lVar = l.this;
            l.O1(lVar, h11);
            l.N1(lVar);
            return Boolean.TRUE;
        }
    }

    static final class d extends AbstractC7737t implements Function1<Boolean, Boolean> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l lVar = l.this;
            if (lVar.f10435l == null) {
                return Boolean.FALSE;
            }
            a aVar = lVar.f10435l;
            if (aVar != null) {
                aVar.e(booleanValue);
            }
            l.N1(lVar);
            return Boolean.TRUE;
        }
    }

    static final class e extends AbstractC7737t implements Function0<Boolean> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            l lVar = l.this;
            l.I1(lVar);
            l.N1(lVar);
            return Boolean.TRUE;
        }
    }

    static final class f extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f10444b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(m0 m0Var) {
            super(1);
            this.f10444b = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.d(this.f10444b, 0, 0, 0.0f);
            return Unit.f71690a;
        }
    }

    public l(String str, T t2, AbstractC3809p.a aVar, int i11, boolean z11, int i12, int i13, InterfaceC7813c0 interfaceC7813c0) {
        this.f10424a = str;
        this.f10425b = t2;
        this.f10426c = aVar;
        this.f10427d = i11;
        this.f10428e = z11;
        this.f10429f = i12;
        this.f10430g = i13;
        this.f10431h = interfaceC7813c0;
    }

    public static final void I1(l lVar) {
        lVar.f10435l = null;
    }

    public static final void N1(l lVar) {
        lVar.getClass();
        C2809k.f(lVar).x0();
        C2809k.f(lVar).u0();
        C2820u.a(lVar);
    }

    public static final void O1(l lVar, String str) {
        a aVar = lVar.f10435l;
        if (aVar == null) {
            a aVar2 = new a(lVar.f10424a, str);
            H0.f fVar = new H0.f(str, lVar.f10425b, lVar.f10426c, lVar.f10427d, lVar.f10428e, lVar.f10429f, lVar.f10430g);
            fVar.k(lVar.Q1().a());
            aVar2.d(fVar);
            lVar.f10435l = aVar2;
            return;
        }
        if (Intrinsics.d(str, aVar.b())) {
            return;
        }
        aVar.f(str);
        H0.f a11 = aVar.a();
        if (a11 != null) {
            a11.n(str, lVar.f10425b, lVar.f10426c, lVar.f10427d, lVar.f10428e, lVar.f10429f, lVar.f10430g);
            Unit unit = Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H0.f Q1() {
        if (this.f10433j == null) {
            this.f10433j = new H0.f(this.f10424a, this.f10425b, this.f10426c, this.f10427d, this.f10428e, this.f10429f, this.f10430g);
        }
        H0.f fVar = this.f10433j;
        Intrinsics.f(fVar);
        return fVar;
    }

    private final H0.f R1(Z1.d dVar) {
        H0.f a11;
        a aVar = this.f10435l;
        if (aVar != null && aVar.c() && (a11 = aVar.a()) != null) {
            a11.k(dVar);
            return a11;
        }
        H0.f Q12 = Q1();
        Q12.k(dVar);
        return Q12;
    }

    @Override // D1.E
    public final int A(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return R1(v11).j(v11.getLayoutDirection());
    }

    @Override // D1.E
    @NotNull
    public final W D(@NotNull Y y11, @NotNull U u11, long j11) {
        H0.f R12 = R1(y11);
        boolean h11 = R12.h(j11, y11.getLayoutDirection());
        R12.d();
        InterfaceC3436p e11 = R12.e();
        Intrinsics.f(e11);
        long c11 = R12.c();
        if (h11) {
            C2809k.d(this, 2).m2();
            Map<AbstractC2531a, Integer> map = this.f10432i;
            if (map == null) {
                map = new LinkedHashMap<>(2);
            }
            C3421a c3421a = (C3421a) e11;
            map.put(C2533b.a(), Integer.valueOf(Math.round(c3421a.g())));
            map.put(C2533b.b(), Integer.valueOf(Math.round(c3421a.j())));
            this.f10432i = map;
        }
        int i11 = (int) (c11 >> 32);
        int i12 = (int) (c11 & 4294967295L);
        int min = Math.min(i11, 262142);
        int min2 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, 262142);
        int c12 = Z1.c.c(min2 == Integer.MAX_VALUE ? min : min2);
        m0 a02 = u11.a0(Z1.c.a(min, min2, Math.min(c12, i12), i12 != Integer.MAX_VALUE ? Math.min(c12, i12) : Integer.MAX_VALUE));
        Map<AbstractC2531a, Integer> map2 = this.f10432i;
        Intrinsics.f(map2);
        return y11.z0(i11, i12, map2, new f(a02));
    }

    @Override // D1.E
    public final int I(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return R1(v11).f(i11, v11.getLayoutDirection());
    }

    @Override // D1.E
    public final int K(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return R1(v11).f(i11, v11.getLayoutDirection());
    }

    public final void P1(boolean z11, boolean z12, boolean z13) {
        if (z12 || z13) {
            Q1().n(this.f10424a, this.f10425b, this.f10426c, this.f10427d, this.f10428e, this.f10429f, this.f10430g);
        }
        if (isAttached()) {
            if (z12 || (z11 && this.f10434k != null)) {
                C2809k.f(this).x0();
            }
            if (z12 || z13) {
                C2809k.f(this).u0();
                C2820u.a(this);
            }
            if (z11) {
                C2820u.a(this);
            }
        }
    }

    public final boolean S1(InterfaceC7813c0 interfaceC7813c0, @NotNull T t2) {
        boolean d11 = Intrinsics.d(interfaceC7813c0, this.f10431h);
        this.f10431h = interfaceC7813c0;
        return (d11 && t2.A(this.f10425b)) ? false : true;
    }

    public final boolean T1(@NotNull T t2, int i11, int i12, boolean z11, @NotNull AbstractC3809p.a aVar, int i13) {
        boolean z12 = !this.f10425b.B(t2);
        this.f10425b = t2;
        if (this.f10430g != i11) {
            this.f10430g = i11;
            z12 = true;
        }
        if (this.f10429f != i12) {
            this.f10429f = i12;
            z12 = true;
        }
        if (this.f10428e != z11) {
            this.f10428e = z11;
            z12 = true;
        }
        if (!Intrinsics.d(this.f10426c, aVar)) {
            this.f10426c = aVar;
            z12 = true;
        }
        if (this.f10427d == i13) {
            return z12;
        }
        this.f10427d = i13;
        return true;
    }

    public final boolean U1(@NotNull String str) {
        if (Intrinsics.d(this.f10424a, str)) {
            return false;
        }
        this.f10424a = str;
        this.f10435l = null;
        return true;
    }

    @Override // D1.E0
    public final void applySemantics(@NotNull D d11) {
        Function1 function1 = this.f10434k;
        if (function1 == null) {
            function1 = new b();
            this.f10434k = function1;
        }
        C3422b c3422b = new C3422b(6, this.f10424a, null);
        int i11 = z.f11793b;
        d11.b(u.B(), C7714v.a0(c3422b));
        a aVar = this.f10435l;
        if (aVar != null) {
            z.s(d11, aVar.c());
            z.v(d11, new C3422b(6, aVar.b(), null));
        }
        d11.b(I1.k.z(), new C3222a(null, new c()));
        d11.b(I1.k.A(), new C3222a(null, new d()));
        d11.b(I1.k.a(), new C3222a(null, new e()));
        z.d(d11, function1);
    }

    @Override // D1.InterfaceC2819t
    public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        InterfaceC7802U interfaceC7802U;
        InterfaceC7802U interfaceC7802U2;
        if (!isAttached()) {
            return;
        }
        H0.f R12 = R1(interfaceC8410c);
        InterfaceC3436p e11 = R12.e();
        if (e11 == null) {
            throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.f10433j + ", textSubstitution=" + this.f10435l + ')').toString());
        }
        InterfaceC7802U a11 = ((J) interfaceC8410c).w0().a();
        boolean b11 = R12.b();
        if (b11) {
            float c11 = (int) (R12.c() >> 32);
            float c12 = (int) (R12.c() & 4294967295L);
            a11.save();
            interfaceC7802U = a11;
            a11 = null;
            interfaceC7802U.e(0.0f, 0.0f, c11, c12, 1);
        } else {
            interfaceC7802U = a11;
        }
        try {
            V1.i w11 = this.f10425b.w();
            if (w11 == null) {
                w11 = V1.i.f27915b;
            }
            V1.i iVar = w11;
            H0 t2 = this.f10425b.t();
            if (t2 == null) {
                t2 = H0.f72222d;
            }
            H0 h02 = t2;
            AbstractC8413f g10 = this.f10425b.g();
            if (g10 == null) {
                g10 = C8415h.f76287a;
            }
            AbstractC8413f abstractC8413f = g10;
            AbstractC7799Q e12 = this.f10425b.e();
            try {
                if (e12 != null) {
                    a11 = interfaceC7802U;
                    ((C3421a) e11).F(a11, e12, this.f10425b.d(), h02, iVar, abstractC8413f);
                    interfaceC7802U2 = a11;
                } else {
                    InterfaceC7813c0 interfaceC7813c0 = this.f10431h;
                    long mo7invoke0d7_KjU = interfaceC7813c0 != null ? interfaceC7813c0.mo7invoke0d7_KjU() : C7807Z.f72259m;
                    if (mo7invoke0d7_KjU == 16) {
                        mo7invoke0d7_KjU = this.f10425b.f() != 16 ? this.f10425b.f() : C7807Z.f72248b;
                    }
                    long j11 = mo7invoke0d7_KjU;
                    a11 = interfaceC7802U;
                    ((C3421a) e11).E(a11, j11, h02, iVar, abstractC8413f);
                    interfaceC7802U2 = a11;
                }
                if (b11) {
                    interfaceC7802U2.p();
                }
            } catch (Throwable th2) {
                th = th2;
                interfaceC7802U = a11;
                if (b11) {
                    interfaceC7802U.p();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // D1.E
    public final int u(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return R1(v11).i(v11.getLayoutDirection());
    }
}
