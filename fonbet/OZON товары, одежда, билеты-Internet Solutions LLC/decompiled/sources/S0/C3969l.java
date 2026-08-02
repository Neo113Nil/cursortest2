package S0;

import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.recyclerview.widget.m;
import c1.C5721l;
import d1.C6022a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3969l implements InterfaceC3967k {

    /* renamed from: A, reason: collision with root package name */
    private int f25438A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f25439B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final C3971m f25440C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final z1<J0> f25441D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f25442E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private C3944b1 f25443F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private C3947c1 f25444G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private C3953e1 f25445H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f25446I;

    /* renamed from: J, reason: collision with root package name */
    private A0 f25447J;

    /* renamed from: K, reason: collision with root package name */
    private T0.a f25448K;

    /* renamed from: L, reason: collision with root package name */
    @NotNull
    private final T0.b f25449L;

    /* renamed from: M, reason: collision with root package name */
    @NotNull
    private C3945c f25450M;

    /* renamed from: N, reason: collision with root package name */
    @NotNull
    private T0.c f25451N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f25452O;

    /* renamed from: P, reason: collision with root package name */
    private int f25453P;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D1.L0 f25454a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC3984t f25455b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3947c1 f25456c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Set<V0> f25457d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private T0.a f25458e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private T0.a f25459f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C3988v f25460g;

    /* renamed from: i, reason: collision with root package name */
    private C3997z0 f25462i;

    /* renamed from: j, reason: collision with root package name */
    private int f25463j;

    /* renamed from: k, reason: collision with root package name */
    private int f25464k;

    /* renamed from: l, reason: collision with root package name */
    private int f25465l;

    /* renamed from: n, reason: collision with root package name */
    private int[] f25467n;

    /* renamed from: o, reason: collision with root package name */
    private androidx.collection.A f25468o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f25469p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f25470q;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private A0 f25473t;

    /* renamed from: u, reason: collision with root package name */
    private U0.a<A0> f25474u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f25475v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final W f25476w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f25477x;

    /* renamed from: y, reason: collision with root package name */
    private int f25478y;

    /* renamed from: z, reason: collision with root package name */
    private int f25479z;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final z1<C3997z0> f25461h = new z1<>();

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final W f25466m = new W();

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final ArrayList f25471r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final W f25472s = new W();

    /* renamed from: S0.l$a */
    private static final class a implements Y0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f25480a;

        public a(@NotNull b bVar) {
            this.f25480a = bVar;
        }

        @NotNull
        public final b a() {
            return this.f25480a;
        }

        @Override // S0.V0
        public final void b() {
        }

        @Override // S0.V0
        public final void d() {
            this.f25480a.s();
        }

        @Override // S0.V0
        public final void e() {
            this.f25480a.s();
        }
    }

    /* renamed from: S0.l$b */
    private final class b extends AbstractC3984t {

        /* renamed from: a, reason: collision with root package name */
        private final int f25481a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25482b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25483c;

        /* renamed from: d, reason: collision with root package name */
        private HashSet f25484d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final LinkedHashSet f25485e = new LinkedHashSet();

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final C3991w0 f25486f;

        public b(int i11, boolean z11, boolean z12, C c11) {
            a1.e eVar;
            this.f25481a = i11;
            this.f25482b = z11;
            this.f25483c = z12;
            eVar = a1.e.f36181g;
            this.f25486f = n1.f(eVar, S0.f25310a);
        }

        @Override // S0.AbstractC3984t
        public final void a(@NotNull C3988v c3988v, @NotNull C4912a c4912a) {
            C3969l.this.f25455b.a(c3988v, c4912a);
        }

        @Override // S0.AbstractC3984t
        public final void b(@NotNull C3968k0 c3968k0) {
            C3969l.this.f25455b.b(c3968k0);
        }

        @Override // S0.AbstractC3984t
        public final void c() {
            C3969l c3969l = C3969l.this;
            c3969l.f25479z--;
        }

        @Override // S0.AbstractC3984t
        public final boolean d() {
            return C3969l.this.f25455b.d();
        }

        @Override // S0.AbstractC3984t
        public final boolean e() {
            return this.f25482b;
        }

        @Override // S0.AbstractC3984t
        public final boolean f() {
            return this.f25483c;
        }

        @Override // S0.AbstractC3984t
        @NotNull
        public final A0 g() {
            return (A0) this.f25486f.getValue();
        }

        @Override // S0.AbstractC3984t
        public final int h() {
            return this.f25481a;
        }

        @Override // S0.AbstractC3984t
        @NotNull
        public final CoroutineContext i() {
            return C3969l.this.f25455b.i();
        }

        @Override // S0.AbstractC3984t
        public final void j(@NotNull G g10) {
            C3969l c3969l = C3969l.this;
            c3969l.f25455b.j(c3969l.t0());
            c3969l.f25455b.j(g10);
        }

        @Override // S0.AbstractC3984t
        public final void k(@NotNull C3968k0 c3968k0, @NotNull C3966j0 c3966j0) {
            C3969l.this.f25455b.k(c3968k0, c3966j0);
        }

        @Override // S0.AbstractC3984t
        public final C3966j0 l(@NotNull C3968k0 c3968k0) {
            return C3969l.this.f25455b.l(c3968k0);
        }

        @Override // S0.AbstractC3984t
        public final void m(@NotNull Set<Object> set) {
            HashSet hashSet = this.f25484d;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f25484d = hashSet;
            }
            hashSet.add(set);
        }

        @Override // S0.AbstractC3984t
        public final void n(@NotNull C3969l c3969l) {
            this.f25485e.add(c3969l);
        }

        @Override // S0.AbstractC3984t
        public final void o(@NotNull C3988v c3988v) {
            C3969l.this.f25455b.o(c3988v);
        }

        @Override // S0.AbstractC3984t
        public final void p() {
            C3969l.this.f25479z++;
        }

        @Override // S0.AbstractC3984t
        public final void q(@NotNull C3969l c3969l) {
            HashSet hashSet = this.f25484d;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c3969l.f25456c);
                }
            }
            LinkedHashSet linkedHashSet = this.f25485e;
            kotlin.jvm.internal.U.a(linkedHashSet);
            linkedHashSet.remove(c3969l);
        }

        @Override // S0.AbstractC3984t
        public final void r(@NotNull C3988v c3988v) {
            C3969l.this.f25455b.r(c3988v);
        }

        public final void s() {
            LinkedHashSet<C3969l> linkedHashSet = this.f25485e;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            HashSet hashSet = this.f25484d;
            if (hashSet != null) {
                for (C3969l c3969l : linkedHashSet) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(c3969l.f25456c);
                    }
                }
            }
            linkedHashSet.clear();
        }

        @NotNull
        public final LinkedHashSet t() {
            return this.f25485e;
        }

        public final void u(@NotNull A0 a02) {
            this.f25486f.setValue(a02);
        }
    }

    public C3969l(@NotNull D1.L0 l02, @NotNull AbstractC3984t abstractC3984t, @NotNull C3947c1 c3947c1, @NotNull Set set, @NotNull T0.a aVar, @NotNull T0.a aVar2, @NotNull C3988v c3988v) {
        a1.e eVar;
        this.f25454a = l02;
        this.f25455b = abstractC3984t;
        this.f25456c = c3947c1;
        this.f25457d = set;
        this.f25458e = aVar;
        this.f25459f = aVar2;
        this.f25460g = c3988v;
        eVar = a1.e.f36181g;
        this.f25473t = eVar;
        this.f25476w = new W();
        this.f25478y = -1;
        this.f25439B = abstractC3984t.f() || abstractC3984t.d();
        this.f25440C = new C3971m(this);
        this.f25441D = new z1<>();
        C3944b1 x11 = c3947c1.x();
        x11.c();
        this.f25443F = x11;
        C3947c1 c3947c12 = new C3947c1();
        if (abstractC3984t.f()) {
            c3947c12.k();
        }
        if (abstractC3984t.d()) {
            c3947c12.i();
        }
        this.f25444G = c3947c12;
        C3953e1 z11 = c3947c12.z();
        z11.I(true);
        this.f25445H = z11;
        this.f25449L = new T0.b(this, aVar);
        C3944b1 x12 = this.f25444G.x();
        try {
            C3945c a11 = x12.a(0);
            x12.c();
            this.f25450M = a11;
            this.f25451N = new T0.c();
        } catch (Throwable th2) {
            x12.c();
            throw th2;
        }
    }

    private final int F0(int i11) {
        int M11 = this.f25443F.M(i11) + 1;
        int i12 = 0;
        while (M11 < i11) {
            if (!this.f25443F.F(M11)) {
                i12++;
            }
            M11 += this.f25443F.D(M11);
        }
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r7 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <R> R H0(G g10, G g11, Integer num, List<? extends Pair<J0, ? extends Object>> list, Function0<? extends R> function0) {
        R invoke;
        boolean z11 = this.f25442E;
        int i11 = this.f25463j;
        try {
            this.f25442E = true;
            this.f25463j = 0;
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Pair<J0, ? extends Object> pair = list.get(i12);
                J0 a11 = pair.a();
                Object b11 = pair.b();
                if (b11 != null) {
                    Y0(a11, b11);
                } else {
                    Y0(a11, null);
                }
            }
            if (g10 != null) {
                invoke = (R) g10.h(g11, num != null ? num.intValue() : -1, function0);
            }
            invoke = function0.invoke();
            this.f25442E = z11;
            this.f25463j = i11;
            return invoke;
        } catch (Throwable th2) {
            this.f25442E = z11;
            this.f25463j = i11;
            throw th2;
        }
    }

    private final void I0() {
        boolean z11 = this.f25442E;
        this.f25442E = true;
        int t2 = this.f25443F.t();
        int D11 = this.f25443F.D(t2) + t2;
        int i11 = this.f25463j;
        int i12 = this.f25453P;
        int i13 = this.f25464k;
        int i14 = this.f25465l;
        ArrayList arrayList = this.f25471r;
        X c11 = r.c(arrayList, this.f25443F.j(), D11);
        int i15 = t2;
        boolean z12 = false;
        while (c11 != null) {
            int b11 = c11.b();
            r.g(b11, arrayList);
            if (c11.d()) {
                this.f25443F.N(b11);
                int j11 = this.f25443F.j();
                K0(i15, j11, t2);
                int M11 = this.f25443F.M(j11);
                while (M11 != t2 && !this.f25443F.I(M11)) {
                    M11 = this.f25443F.M(M11);
                }
                int i16 = this.f25443F.I(M11) ? 0 : i11;
                if (M11 != j11) {
                    int c12 = (c1(M11) - this.f25443F.L(j11)) + i16;
                    while (i16 < c12 && M11 != b11) {
                        M11++;
                        while (M11 < b11) {
                            int D12 = this.f25443F.D(M11) + M11;
                            if (b11 >= D12) {
                                int i17 = c12;
                                i16 += this.f25443F.I(M11) ? 1 : c1(M11);
                                M11 = D12;
                                c12 = i17;
                            }
                        }
                        break;
                    }
                }
                this.f25463j = i16;
                this.f25465l = F0(j11);
                int M12 = this.f25443F.M(j11);
                this.f25453P = Z(M12, F0(M12), t2, i12);
                this.f25447J = null;
                c11.c().f(this);
                this.f25447J = null;
                this.f25443F.O(t2);
                i15 = j11;
                z12 = true;
            } else {
                J0 c13 = c11.c();
                z1<J0> z1Var = this.f25441D;
                z1Var.h(c13);
                c11.c().w();
                z1Var.g();
            }
            c11 = r.c(arrayList, this.f25443F.j(), D11);
        }
        if (z12) {
            K0(i15, t2, t2);
            this.f25443F.Q();
            int c14 = c1(t2);
            this.f25463j = i11 + c14;
            this.f25464k = i13 + c14;
            this.f25465l = i14;
        } else {
            this.f25464k = this.f25443F.u();
            this.f25443F.Q();
        }
        this.f25453P = i12;
        this.f25442E = z11;
    }

    private final void J0(A0 a02) {
        U0.a<A0> aVar = this.f25474u;
        if (aVar == null) {
            aVar = new U0.a<>(0);
            this.f25474u = aVar;
        }
        aVar.b(this.f25443F.j(), a02);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void K0(int i11, int i12, int i13) {
        C3944b1 c3944b1 = this.f25443F;
        if (i11 != i12) {
            if (i11 != i13 && i12 != i13) {
                if (c3944b1.M(i11) == i12) {
                    i13 = i12;
                } else if (c3944b1.M(i12) != i11) {
                    if (c3944b1.M(i11) == c3944b1.M(i12)) {
                        i13 = c3944b1.M(i11);
                    } else {
                        int i14 = i11;
                        int i15 = 0;
                        while (i14 > 0 && i14 != i13) {
                            i14 = c3944b1.M(i14);
                            i15++;
                        }
                        int i16 = i12;
                        int i17 = 0;
                        while (i16 > 0 && i16 != i13) {
                            i16 = c3944b1.M(i16);
                            i17++;
                        }
                        int i18 = i15 - i17;
                        int i19 = i11;
                        for (int i21 = 0; i21 < i18; i21++) {
                            i19 = c3944b1.M(i19);
                        }
                        int i22 = i17 - i15;
                        int i23 = i12;
                        for (int i24 = 0; i24 < i22; i24++) {
                            i23 = c3944b1.M(i23);
                        }
                        i13 = i19;
                        for (int i25 = i23; i13 != i25; i25 = c3944b1.M(i25)) {
                            i13 = c3944b1.M(i13);
                        }
                    }
                }
            }
            while (i11 > 0 && i11 != i13) {
                if (!c3944b1.I(i11)) {
                    this.f25449L.x();
                }
                i11 = c3944b1.M(i11);
            }
            g0(i12, i13);
        }
        i13 = i11;
        while (i11 > 0) {
            if (!c3944b1.I(i11)) {
            }
            i11 = c3944b1.M(i11);
        }
        g0(i12, i13);
    }

    private final void L() {
        X();
        this.f25461h.a();
        this.f25466m.a();
        this.f25472s.a();
        this.f25476w.a();
        this.f25474u = null;
        this.f25451N.a();
        this.f25453P = 0;
        this.f25479z = 0;
        this.f25470q = false;
        this.f25452O = false;
        this.f25477x = false;
        this.f25442E = false;
        this.f25478y = -1;
        if (!this.f25443F.h()) {
            this.f25443F.c();
        }
        if (this.f25445H.R()) {
            return;
        }
        r0();
    }

    private final void L0(int i11) {
        M0(this, i11, false, 0);
        this.f25449L.i();
    }

    private static final int M0(C3969l c3969l, int i11, boolean z11, int i12) {
        int i13;
        C3944b1 c3944b1 = c3969l.f25443F;
        boolean E11 = c3944b1.E(i11);
        T0.b bVar = c3969l.f25449L;
        if (E11) {
            int B11 = c3944b1.B(i11);
            Object C11 = c3944b1.C(i11);
            AbstractC3984t abstractC3984t = c3969l.f25455b;
            if (B11 == 126665345 && (C11 instanceof C3964i0)) {
                C3964i0 c3964i0 = (C3964i0) C11;
                Object A11 = c3944b1.A(i11, 0);
                C3945c a11 = c3944b1.a(i11);
                ArrayList b11 = r.b(c3969l.f25471r, i11, c3944b1.D(i11) + i11);
                ArrayList arrayList = new ArrayList(b11.size());
                int size = b11.size();
                for (int i14 = 0; i14 < size; i14++) {
                    X x11 = (X) b11.get(i14);
                    arrayList.add(new Pair(x11.c(), x11.a()));
                }
                C3947c1 c3947c1 = c3969l.f25456c;
                A0 b02 = c3969l.b0(i11);
                C3988v c3988v = c3969l.f25460g;
                C3968k0 c3968k0 = new C3968k0(c3964i0, A11, c3988v, c3947c1, a11, arrayList, b02);
                abstractC3984t.b(c3968k0);
                bVar.B();
                bVar.D(c3988v, abstractC3984t, c3968k0);
                if (!z11) {
                    return c3944b1.L(i11);
                }
                bVar.j(i12, i11);
                return 0;
            }
            i13 = 1;
            if (B11 == 206 && Intrinsics.d(C11, r.s())) {
                Object A12 = c3944b1.A(i11, 0);
                a aVar = A12 instanceof a ? (a) A12 : null;
                if (aVar != null) {
                    for (C3969l c3969l2 : aVar.a().t()) {
                        T0.b bVar2 = c3969l2.f25449L;
                        C3947c1 c3947c12 = c3969l2.f25456c;
                        if (c3947c12.l()) {
                            T0.a aVar2 = new T0.a();
                            c3969l2.f25448K = aVar2;
                            C3944b1 x12 = c3947c12.x();
                            try {
                                c3969l2.f25443F = x12;
                                T0.a m11 = bVar2.m();
                                try {
                                    bVar2.J(aVar2);
                                    c3969l2.L0(0);
                                    bVar2.C();
                                    bVar2.J(m11);
                                    Unit unit = Unit.f71690a;
                                } finally {
                                }
                            } finally {
                                x12.c();
                            }
                        }
                        abstractC3984t.o(c3969l2.f25460g);
                    }
                }
                return c3944b1.L(i11);
            }
            if (!c3944b1.I(i11)) {
                return c3944b1.L(i11);
            }
        } else {
            i13 = 1;
            if (c3944b1.d(i11)) {
                int D11 = c3944b1.D(i11) + i11;
                int i15 = 0;
                for (int i16 = i11 + 1; i16 < D11; i16 += c3944b1.D(i16)) {
                    boolean I11 = c3944b1.I(i16);
                    if (I11) {
                        bVar.i();
                        bVar.t(c3944b1.K(i16));
                    }
                    i15 += M0(c3969l, i16, I11 || z11, I11 ? 0 : i12 + i15);
                    if (I11) {
                        bVar.i();
                        bVar.x();
                    }
                }
                if (!c3944b1.I(i11)) {
                    return i15;
                }
            } else if (!c3944b1.I(i11)) {
                return c3944b1.L(i11);
            }
        }
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void P0(Object obj, int i11, int i12, Object obj2) {
        int rotateLeft;
        C3997z0 c3997z0 = null;
        if (this.f25470q) {
            r.j("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        int i13 = this.f25465l;
        if (obj != null) {
            rotateLeft = Integer.rotateLeft((obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode()) ^ Integer.rotateLeft(this.f25453P, 3), 3);
        } else {
            if (obj2 != null && i11 == 207 && !obj2.equals(InterfaceC3967k.a.a())) {
                this.f25453P = i13 ^ Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(this.f25453P, 3), 3);
                if (obj == null) {
                    this.f25465l++;
                }
                boolean z11 = i12 == 0;
                if (!this.f25452O) {
                    this.f25443F.b();
                    int U10 = this.f25445H.U();
                    if (z11) {
                        this.f25445H.R0(i11, InterfaceC3967k.a.a());
                    } else if (obj2 != null) {
                        C3953e1 c3953e1 = this.f25445H;
                        if (obj == null) {
                            obj = InterfaceC3967k.a.a();
                        }
                        c3953e1.N0(i11, obj, obj2);
                    } else {
                        C3953e1 c3953e12 = this.f25445H;
                        if (obj == null) {
                            obj = InterfaceC3967k.a.a();
                        }
                        c3953e12.P0(i11, obj);
                    }
                    C3997z0 c3997z02 = this.f25462i;
                    if (c3997z02 != null) {
                        C3940a0 c3940a0 = new C3940a0(-1, i11, (-2) - U10, -1);
                        c3997z02.h(c3940a0, this.f25463j - c3997z02.d());
                        c3997z02.g(c3940a0);
                    }
                    q0(z11, null);
                    return;
                }
                boolean z12 = i12 == 1 && this.f25477x;
                if (this.f25462i == null) {
                    int m11 = this.f25443F.m();
                    if (!z12 && m11 == i11 && Intrinsics.d(obj, this.f25443F.n())) {
                        V0(obj2, z11);
                    } else {
                        this.f25462i = new C3997z0(this.f25463j, this.f25443F.g());
                    }
                }
                C3997z0 c3997z03 = this.f25462i;
                if (c3997z03 != null) {
                    C3940a0 c11 = c3997z03.c(i11, obj);
                    if (z12 || c11 == null) {
                        this.f25443F.b();
                        this.f25452O = true;
                        this.f25447J = null;
                        if (this.f25445H.R()) {
                            C3953e1 z13 = this.f25444G.z();
                            this.f25445H = z13;
                            z13.G0();
                            this.f25446I = false;
                            this.f25447J = null;
                        }
                        this.f25445H.H();
                        int U11 = this.f25445H.U();
                        if (z11) {
                            this.f25445H.R0(i11, InterfaceC3967k.a.a());
                        } else if (obj2 != null) {
                            C3953e1 c3953e13 = this.f25445H;
                            if (obj == null) {
                                obj = InterfaceC3967k.a.a();
                            }
                            c3953e13.N0(i11, obj, obj2);
                        } else {
                            C3953e1 c3953e14 = this.f25445H;
                            if (obj == null) {
                                obj = InterfaceC3967k.a.a();
                            }
                            c3953e14.P0(i11, obj);
                        }
                        this.f25450M = this.f25445H.E(U11);
                        C3940a0 c3940a02 = new C3940a0(-1, i11, (-2) - U11, -1);
                        c3997z03.h(c3940a02, this.f25463j - c3997z03.d());
                        c3997z03.g(c3940a02);
                        c3997z0 = new C3997z0(z11 ? 0 : this.f25463j, new ArrayList());
                    } else {
                        c3997z03.g(c11);
                        int b11 = c11.b();
                        this.f25463j = c3997z03.f(c11) + c3997z03.d();
                        int l11 = c3997z03.l(c11);
                        int a11 = l11 - c3997z03.a();
                        c3997z03.j(l11, c3997z03.a());
                        T0.b bVar = this.f25449L;
                        bVar.v(b11);
                        this.f25443F.N(b11);
                        if (a11 > 0) {
                            bVar.s(a11);
                        }
                        V0(obj2, z11);
                    }
                }
                q0(z11, c3997z0);
                return;
            }
            rotateLeft = i13 ^ Integer.rotateLeft(Integer.rotateLeft(this.f25453P, 3) ^ i11, 3);
        }
        this.f25453P = rotateLeft;
        if (obj == null) {
        }
        if (i12 == 0) {
        }
        if (!this.f25452O) {
        }
    }

    private final void R0(int i11, C3983s0 c3983s0) {
        P0(c3983s0, i11, 0, null);
    }

    public static final void S(C3969l c3969l, C3964i0 c3964i0, A0 a02, Object obj) {
        c3969l.G(126665345, c3964i0);
        c3969l.D0();
        c3969l.b1(obj);
        int i11 = c3969l.f25453P;
        try {
            c3969l.f25453P = 126665345;
            if (c3969l.f25452O) {
                C3953e1.m0(c3969l.f25445H);
            }
            boolean z11 = (c3969l.f25452O || Intrinsics.d(c3969l.f25443F.k(), a02)) ? false : true;
            if (z11) {
                c3969l.J0(a02);
            }
            c3969l.P0(r.n(), 202, 0, a02);
            c3969l.f25447J = null;
            boolean z12 = c3969l.f25475v;
            c3969l.f25475v = z11;
            C3942b.b(c3969l, new C4912a(true, 316014703, new C3977p(c3964i0, obj)));
            c3969l.f25475v = z12;
            c3969l.i0(false);
            c3969l.f25447J = null;
            c3969l.f25453P = i11;
            c3969l.i0(false);
        } catch (Throwable th2) {
            c3969l.i0(false);
            c3969l.f25447J = null;
            c3969l.f25453P = i11;
            c3969l.i0(false);
            throw th2;
        }
    }

    private final void V0(Object obj, boolean z11) {
        if (z11) {
            this.f25443F.S();
            return;
        }
        if (obj != null && this.f25443F.k() != obj) {
            this.f25449L.P(obj);
        }
        this.f25443F.R();
    }

    private final void X() {
        this.f25462i = null;
        this.f25463j = 0;
        this.f25464k = 0;
        this.f25453P = 0;
        this.f25470q = false;
        this.f25449L.I();
        this.f25441D.a();
        this.f25467n = null;
        this.f25468o = null;
    }

    private final void X0() {
        this.f25465l = 0;
        C3947c1 c3947c1 = this.f25456c;
        this.f25443F = c3947c1.x();
        P0(null, 100, 0, null);
        AbstractC3984t abstractC3984t = this.f25455b;
        abstractC3984t.p();
        this.f25473t = abstractC3984t.g();
        this.f25476w.j(this.f25475v ? 1 : 0);
        this.f25475v = n(this.f25473t);
        this.f25447J = null;
        if (!this.f25469p) {
            this.f25469p = abstractC3984t.e();
        }
        if (!this.f25439B) {
            this.f25439B = abstractC3984t.f();
        }
        Set<Object> set = (Set) B.a(this.f25473t, C6022a.a());
        if (set != null) {
            set.add(c3947c1);
            abstractC3984t.m(set);
        }
        P0(null, abstractC3984t.h(), 0, null);
    }

    private final int Z(int i11, int i12, int i13, int i14) {
        int hashCode;
        Object y11;
        if (i11 == i13) {
            return i14;
        }
        C3944b1 c3944b1 = this.f25443F;
        if (c3944b1.F(i11)) {
            Object C11 = c3944b1.C(i11);
            hashCode = C11 != null ? C11 instanceof Enum ? ((Enum) C11).ordinal() : C11 instanceof C3964i0 ? 126665345 : C11.hashCode() : 0;
        } else {
            int B11 = c3944b1.B(i11);
            hashCode = (B11 != 207 || (y11 = c3944b1.y(i11)) == null || y11.equals(InterfaceC3967k.a.a())) ? B11 : y11.hashCode();
        }
        if (hashCode == 126665345) {
            return hashCode;
        }
        int M11 = this.f25443F.M(i11);
        if (M11 != i13) {
            i14 = Z(M11, F0(M11), i13, i14);
        }
        if (this.f25443F.F(i11)) {
            i12 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i14, 3) ^ hashCode, 3) ^ i12;
    }

    private final void Z0(int i11, int i12) {
        if (c1(i11) != i12) {
            if (i11 < 0) {
                androidx.collection.A a11 = this.f25468o;
                if (a11 == null) {
                    a11 = new androidx.collection.A();
                    this.f25468o = a11;
                }
                a11.g(i11, i12);
                return;
            }
            int[] iArr = this.f25467n;
            if (iArr == null) {
                iArr = new int[this.f25443F.w()];
                C7705l.y(iArr, -1);
                this.f25467n = iArr;
            }
            iArr[i11] = i12;
        }
    }

    private final A0 a0() {
        A0 a02 = this.f25447J;
        return a02 != null ? a02 : b0(this.f25443F.t());
    }

    private final void a1(int i11, int i12) {
        int c12 = c1(i11);
        if (c12 != i12) {
            int i13 = i12 - c12;
            z1<C3997z0> z1Var = this.f25461h;
            int b11 = z1Var.b() - 1;
            while (i11 != -1) {
                int c13 = c1(i11) + i13;
                Z0(i11, c13);
                int i14 = b11;
                while (true) {
                    if (-1 < i14) {
                        C3997z0 f7 = z1Var.f(i14);
                        if (f7 != null && f7.m(i11, c13)) {
                            b11 = i14 - 1;
                            break;
                        }
                        i14--;
                    } else {
                        break;
                    }
                }
                if (i11 < 0) {
                    i11 = this.f25443F.t();
                } else if (this.f25443F.I(i11)) {
                    return;
                } else {
                    i11 = this.f25443F.M(i11);
                }
            }
        }
    }

    private final A0 b0(int i11) {
        A0 a02;
        if (this.f25452O && this.f25446I) {
            int W11 = this.f25445H.W();
            while (W11 > 0) {
                if (this.f25445H.c0(W11) == 202 && Intrinsics.d(this.f25445H.d0(W11), r.n())) {
                    Object a03 = this.f25445H.a0(W11);
                    Intrinsics.g(a03, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    A0 a04 = (A0) a03;
                    this.f25447J = a04;
                    return a04;
                }
                W11 = this.f25445H.v0(W11);
            }
        }
        if (this.f25443F.w() > 0) {
            while (i11 > 0) {
                if (this.f25443F.B(i11) == 202 && Intrinsics.d(this.f25443F.C(i11), r.n())) {
                    U0.a<A0> aVar = this.f25474u;
                    if (aVar == null || (a02 = aVar.a(i11)) == null) {
                        Object y11 = this.f25443F.y(i11);
                        Intrinsics.g(y11, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        a02 = (A0) y11;
                    }
                    this.f25447J = a02;
                    return a02;
                }
                i11 = this.f25443F.M(i11);
            }
        }
        A0 a05 = this.f25473t;
        this.f25447J = a05;
        return a05;
    }

    private final int c1(int i11) {
        int i12;
        if (i11 >= 0) {
            int[] iArr = this.f25467n;
            return (iArr == null || (i12 = iArr[i11]) < 0) ? this.f25443F.L(i11) : i12;
        }
        androidx.collection.A a11 = this.f25468o;
        if (a11 == null || a11.a(i11) < 0) {
            return 0;
        }
        return a11.b(i11);
    }

    private final void f0(U0.d dVar, C4912a c4912a) {
        boolean z11;
        C3979q c3979q;
        Object obj;
        int i11;
        Object obj2 = null;
        if (this.f25442E) {
            r.j("Reentrant composition is not supported");
            throw null;
        }
        this.f25438A = C5721l.C().f();
        this.f25474u = null;
        androidx.collection.L<Object, Object> d11 = dVar.d();
        Object[] objArr = d11.f38657b;
        Object[] objArr2 = d11.f38658c;
        long[] jArr = d11.f38656a;
        int length = jArr.length - 2;
        ArrayList arrayList = this.f25471r;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    obj = obj2;
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j11 & 255) < 128) {
                            int i16 = (i12 << 3) + i15;
                            Object obj3 = objArr[i16];
                            Object obj4 = objArr2[i16];
                            Intrinsics.g(obj3, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            J0 j02 = (J0) obj3;
                            C3945c h11 = j02.h();
                            if (h11 != null) {
                                int a11 = h11.a();
                                i11 = i13;
                                if (obj4 == Z0.f25328a) {
                                    obj4 = obj;
                                }
                                arrayList.add(new X(j02, a11, obj4));
                            } else {
                                i11 = i13;
                            }
                        } else {
                            i11 = i13;
                        }
                        j11 >>= i11;
                        i15++;
                        i13 = i11;
                    }
                    z11 = true;
                    if (i14 != i13) {
                        break;
                    }
                } else {
                    obj = obj2;
                    z11 = true;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                obj2 = obj;
            }
        } else {
            z11 = true;
        }
        c3979q = r.f25515f;
        C7714v.G0(c3979q, arrayList);
        this.f25463j = 0;
        this.f25442E = z11;
        try {
            X0();
            Object D02 = D0();
            if (D02 != c4912a && c4912a != null) {
                b1(c4912a);
            }
            C3971m c3971m = this.f25440C;
            U0.b<K> b11 = o1.b();
            try {
                b11.b(c3971m);
                if (c4912a != null) {
                    R0(m.e.DEFAULT_DRAG_ANIMATION_DURATION, r.o());
                    C3942b.b(this, c4912a);
                    i0(false);
                } else if (!this.f25475v || D02 == null || D02.equals(InterfaceC3967k.a.a())) {
                    O0();
                } else {
                    R0(m.e.DEFAULT_DRAG_ANIMATION_DURATION, r.o());
                    kotlin.jvm.internal.U.g(2, D02);
                    C3942b.b(this, (Function2) D02);
                    i0(false);
                }
                b11.u(b11.m() - 1);
                o0();
                this.f25442E = false;
                arrayList.clear();
                r.u(this.f25445H.R());
                r0();
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                b11.u(b11.m() - 1);
                throw th2;
            }
        } catch (Throwable th3) {
            this.f25442E = false;
            arrayList.clear();
            L();
            r.u(this.f25445H.R());
            r0();
            throw th3;
        }
    }

    private final void g0(int i11, int i12) {
        if (i11 <= 0 || i11 == i12) {
            return;
        }
        g0(this.f25443F.M(i11), i12);
        if (this.f25443F.I(i11)) {
            this.f25449L.t(this.f25443F.K(i11));
        }
    }

    private final void i0(boolean z11) {
        int hashCode;
        W w11;
        W w12;
        ArrayList arrayList;
        ArrayList arrayList2;
        HashSet hashSet;
        int hashCode2;
        W w13 = this.f25466m;
        int g10 = w13.g() - 1;
        if (this.f25452O) {
            int W11 = this.f25445H.W();
            int c02 = this.f25445H.c0(W11);
            Object d02 = this.f25445H.d0(W11);
            Object a02 = this.f25445H.a0(W11);
            if (d02 != null) {
                hashCode2 = Integer.hashCode(d02 instanceof Enum ? ((Enum) d02).ordinal() : d02.hashCode()) ^ Integer.rotateRight(this.f25453P, 3);
            } else if (a02 == null || c02 != 207 || a02.equals(InterfaceC3967k.a.a())) {
                hashCode2 = Integer.rotateRight(g10 ^ this.f25453P, 3) ^ Integer.hashCode(c02);
            } else {
                this.f25453P = Integer.rotateRight(Integer.rotateRight(g10 ^ this.f25453P, 3) ^ Integer.hashCode(a02.hashCode()), 3);
            }
            this.f25453P = Integer.rotateRight(hashCode2, 3);
        } else {
            int t2 = this.f25443F.t();
            int B11 = this.f25443F.B(t2);
            Object C11 = this.f25443F.C(t2);
            Object y11 = this.f25443F.y(t2);
            if (C11 != null) {
                hashCode = Integer.hashCode(C11 instanceof Enum ? ((Enum) C11).ordinal() : C11.hashCode()) ^ Integer.rotateRight(this.f25453P, 3);
            } else if (y11 == null || B11 != 207 || y11.equals(InterfaceC3967k.a.a())) {
                hashCode = Integer.rotateRight(g10 ^ this.f25453P, 3) ^ Integer.hashCode(B11);
            } else {
                this.f25453P = Integer.rotateRight(Integer.rotateRight(g10 ^ this.f25453P, 3) ^ Integer.hashCode(y11.hashCode()), 3);
            }
            this.f25453P = Integer.rotateRight(hashCode, 3);
        }
        int i11 = this.f25464k;
        C3997z0 c3997z0 = this.f25462i;
        ArrayList arrayList3 = this.f25471r;
        T0.b bVar = this.f25449L;
        if (c3997z0 == null || ((ArrayList) c3997z0.b()).size() <= 0) {
            w11 = w13;
        } else {
            List<C3940a0> b11 = c3997z0.b();
            ArrayList e11 = c3997z0.e();
            HashSet hashSet2 = new HashSet(e11.size());
            int size = e11.size();
            for (int i12 = 0; i12 < size; i12++) {
                hashSet2.add(e11.get(i12));
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = e11.size();
            ArrayList arrayList4 = (ArrayList) b11;
            int size3 = arrayList4.size();
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i14 < size3) {
                C3940a0 c3940a0 = (C3940a0) arrayList4.get(i14);
                if (hashSet2.contains(c3940a0)) {
                    w12 = w13;
                    arrayList = arrayList4;
                    if (!linkedHashSet.contains(c3940a0)) {
                        if (i15 < size2) {
                            C3940a0 c3940a02 = (C3940a0) e11.get(i15);
                            if (c3940a02 != c3940a0) {
                                int f7 = c3997z0.f(c3940a02);
                                linkedHashSet.add(c3940a02);
                                if (f7 != i13) {
                                    int n11 = c3997z0.n(c3940a02);
                                    arrayList2 = e11;
                                    hashSet = hashSet2;
                                    bVar.u(f7 + c3997z0.d(), i13 + c3997z0.d(), n11);
                                    c3997z0.i(f7, i13, n11);
                                } else {
                                    arrayList2 = e11;
                                    hashSet = hashSet2;
                                }
                            } else {
                                arrayList2 = e11;
                                hashSet = hashSet2;
                                i14++;
                            }
                            i15++;
                            i13 += c3997z0.n(c3940a02);
                            arrayList4 = arrayList;
                            w13 = w12;
                            e11 = arrayList2;
                            hashSet2 = hashSet;
                        } else {
                            arrayList4 = arrayList;
                            w13 = w12;
                        }
                    }
                } else {
                    w12 = w13;
                    arrayList = arrayList4;
                    bVar.G(c3997z0.f(c3940a0) + c3997z0.d(), c3940a0.c());
                    c3997z0.m(c3940a0.b(), 0);
                    bVar.v(c3940a0.b());
                    this.f25443F.N(c3940a0.b());
                    L0(this.f25443F.j());
                    bVar.F();
                    this.f25443F.P();
                    r.h(arrayList3, c3940a0.b(), this.f25443F.D(c3940a0.b()) + c3940a0.b());
                }
                i14++;
                arrayList4 = arrayList;
                w13 = w12;
            }
            w11 = w13;
            bVar.i();
            if (arrayList4.size() > 0) {
                bVar.v(this.f25443F.l());
                this.f25443F.Q();
            }
        }
        int i16 = this.f25463j;
        while (!this.f25443F.G()) {
            int j11 = this.f25443F.j();
            L0(this.f25443F.j());
            bVar.F();
            bVar.G(i16, this.f25443F.P());
            r.h(arrayList3, j11, this.f25443F.j());
        }
        boolean z12 = this.f25452O;
        if (z12) {
            if (z11) {
                this.f25451N.c();
                i11 = 1;
            }
            this.f25443F.e();
            int W12 = this.f25445H.W();
            this.f25445H.M();
            if (!this.f25443F.s()) {
                int i17 = (-2) - W12;
                this.f25445H.N();
                this.f25445H.I(true);
                C3945c c3945c = this.f25450M;
                if (this.f25451N.e()) {
                    bVar.q(c3945c, this.f25444G);
                } else {
                    bVar.r(c3945c, this.f25444G, this.f25451N);
                    this.f25451N = new T0.c();
                }
                this.f25452O = false;
                if (!this.f25456c.isEmpty()) {
                    Z0(i17, 0);
                    a1(i17, i11);
                }
            }
        } else {
            if (z11) {
                bVar.x();
            }
            int v11 = this.f25443F.v();
            if (v11 > 0) {
                bVar.N(v11);
            }
            bVar.g();
            int t11 = this.f25443F.t();
            if (i11 != c1(t11)) {
                a1(t11, i11);
            }
            if (z11) {
                i11 = 1;
            }
            this.f25443F.f();
            bVar.i();
        }
        C3997z0 g11 = this.f25461h.g();
        if (g11 != null && !z12) {
            g11.k(g11.a() + 1);
        }
        this.f25462i = g11;
        this.f25463j = w11.i() + i11;
        this.f25465l = w11.i();
        this.f25464k = w11.i() + i11;
    }

    private final void o0() {
        i0(false);
        this.f25455b.c();
        i0(false);
        T0.b bVar = this.f25449L;
        bVar.k();
        bVar.l();
        if (!this.f25461h.c()) {
            r.j("Start/end imbalance");
            throw null;
        }
        X();
        this.f25443F.c();
        this.f25475v = this.f25476w.i() != 0;
    }

    private final void q0(boolean z11, C3997z0 c3997z0) {
        this.f25461h.h(this.f25462i);
        this.f25462i = c3997z0;
        int i11 = this.f25464k;
        W w11 = this.f25466m;
        w11.j(i11);
        w11.j(this.f25465l);
        w11.j(this.f25463j);
        if (z11) {
            this.f25463j = 0;
        }
        this.f25464k = 0;
        this.f25465l = 0;
    }

    private final void r0() {
        C3947c1 c3947c1 = new C3947c1();
        if (this.f25439B) {
            c3947c1.k();
        }
        if (this.f25455b.d()) {
            c3947c1.i();
        }
        this.f25444G = c3947c1;
        C3953e1 z11 = c3947c1.z();
        z11.I(true);
        this.f25445H = z11;
    }

    private final void z0(ArrayList arrayList) {
        C3947c1 g10;
        C3945c a11;
        int i11;
        C3944b1 c3944b1;
        C3944b1 c3944b12;
        int[] iArr;
        U0.a<A0> aVar;
        C3947c1 c3947c1;
        int[] iArr2;
        U0.a<A0> aVar2;
        boolean z11;
        G b11;
        G b12;
        Integer valueOf;
        AbstractC3984t abstractC3984t;
        int i12;
        C3947c1 a12;
        C3947c1 c3947c12 = this.f25456c;
        AbstractC3984t abstractC3984t2 = this.f25455b;
        T0.a aVar3 = this.f25459f;
        T0.b bVar = this.f25449L;
        T0.a m11 = bVar.m();
        try {
            bVar.J(aVar3);
            bVar.H();
            int size = arrayList.size();
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                Pair pair = (Pair) arrayList.get(i14);
                C3968k0 c3968k0 = (C3968k0) pair.a();
                C3968k0 c3968k02 = (C3968k0) pair.b();
                C3945c a13 = c3968k0.a();
                int c11 = c3968k0.g().c(a13);
                a1.d dVar = new a1.d(i13);
                bVar.e(dVar, a13);
                if (c3968k02 == null) {
                    if (Intrinsics.d(c3968k0.g(), this.f25444G)) {
                        r.u(this.f25445H.R());
                        r0();
                    }
                    C3944b1 x11 = c3968k0.g().x();
                    try {
                        x11.N(c11);
                        bVar.w(c11);
                        T0.a aVar4 = new T0.a();
                        H0(null, null, null, kotlin.collections.K.f71697a, new C3973n(this, aVar4, x11, c3968k0));
                        bVar.p(aVar4, dVar);
                        Unit unit = Unit.f71690a;
                        x11.c();
                        c3947c1 = c3947c12;
                        abstractC3984t = abstractC3984t2;
                        i11 = size;
                        i12 = i14;
                    } catch (Throwable th2) {
                        x11.c();
                        throw th2;
                    }
                } else {
                    C3966j0 l11 = abstractC3984t2.l(c3968k02);
                    if (l11 == null || (g10 = l11.a()) == null) {
                        g10 = c3968k02.g();
                    }
                    if (l11 == null || (a12 = l11.a()) == null || (a11 = a12.b()) == null) {
                        a11 = c3968k02.a();
                    }
                    ArrayList a14 = r.a(a11, g10);
                    if (a14.isEmpty()) {
                        i11 = size;
                    } else {
                        bVar.b(a14, dVar);
                        i11 = size;
                        if (Intrinsics.d(c3968k0.g(), c3947c12)) {
                            int c12 = c3947c12.c(a13);
                            Z0(c12, c1(c12) + a14.size());
                        }
                    }
                    bVar.c(l11, abstractC3984t2, c3968k02, c3968k0);
                    C3944b1 x12 = g10.x();
                    try {
                        c3944b12 = this.f25443F;
                        iArr = this.f25467n;
                        aVar = this.f25474u;
                        c3947c1 = c3947c12;
                        this.f25467n = null;
                        this.f25474u = null;
                    } catch (Throwable th3) {
                        th = th3;
                        c3944b1 = x12;
                    }
                    try {
                        this.f25443F = x12;
                        int c13 = g10.c(a11);
                        x12.N(c13);
                        bVar.w(c13);
                        T0.a aVar5 = new T0.a();
                        T0.a m12 = bVar.m();
                        try {
                            bVar.J(aVar5);
                            boolean n11 = bVar.n();
                            try {
                                bVar.K(false);
                                b11 = c3968k02.b();
                                b12 = c3968k0.b();
                                valueOf = Integer.valueOf(x12.j());
                            } catch (Throwable th4) {
                                th = th4;
                                iArr2 = iArr;
                                z11 = n11;
                                c3944b1 = x12;
                            }
                            try {
                                aVar2 = aVar;
                                c3944b1 = x12;
                                abstractC3984t = abstractC3984t2;
                                iArr2 = iArr;
                                i12 = i14;
                                z11 = n11;
                                try {
                                    H0(b11, b12, valueOf, c3968k02.d(), new C3975o(this, c3968k0));
                                    try {
                                        bVar.K(z11);
                                        try {
                                            bVar.J(m12);
                                            bVar.p(aVar5, dVar);
                                            Unit unit2 = Unit.f71690a;
                                            try {
                                                this.f25443F = c3944b12;
                                                this.f25467n = iArr2;
                                                this.f25474u = aVar2;
                                                c3944b1.c();
                                            } catch (Throwable th5) {
                                                th = th5;
                                                c3944b1.c();
                                                throw th;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            this.f25443F = c3944b12;
                                            this.f25467n = iArr2;
                                            this.f25474u = aVar2;
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        bVar.J(m12);
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    bVar.K(z11);
                                    throw th;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                iArr2 = iArr;
                                c3944b1 = x12;
                                z11 = n11;
                                aVar2 = aVar;
                                bVar.K(z11);
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            iArr2 = iArr;
                            c3944b1 = x12;
                            aVar2 = aVar;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        iArr2 = iArr;
                        c3944b1 = x12;
                        aVar2 = aVar;
                    }
                }
                bVar.M();
                i14 = i12 + 1;
                size = i11;
                c3947c12 = c3947c1;
                abstractC3984t2 = abstractC3984t;
                i13 = 0;
            }
            bVar.h();
            bVar.w(0);
            bVar.J(m11);
        } catch (Throwable th12) {
            bVar.J(m11);
            throw th12;
        }
    }

    @Override // S0.InterfaceC3967k
    public final void A() {
        if (this.f25477x && this.f25443F.t() == this.f25478y) {
            this.f25478y = -1;
            this.f25477x = false;
        }
        i0(false);
    }

    public final void A0(@NotNull ArrayList arrayList) {
        try {
            z0(arrayList);
            X();
        } catch (Throwable th2) {
            L();
            throw th2;
        }
    }

    @Override // S0.InterfaceC3967k
    public final void B(int i11) {
        P0(null, i11, 0, null);
    }

    public final boolean B0() {
        return this.f25442E;
    }

    @Override // S0.InterfaceC3967k
    public final Object C() {
        if (!this.f25452O) {
            Object J11 = this.f25443F.J();
            return (!this.f25477x || (J11 instanceof Y0)) ? J11 instanceof W0 ? ((W0) J11).b() : J11 : InterfaceC3967k.a.a();
        }
        if (!this.f25470q) {
            return InterfaceC3967k.a.a();
        }
        r.j("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }

    @NotNull
    public final Object C0(Integer num, Object obj) {
        Object p11;
        p11 = r.p(this.f25443F.n(), obj, num);
        return p11 == null ? new Z(obj, num) : p11;
    }

    @Override // S0.InterfaceC3967k
    @NotNull
    public final C3947c1 D() {
        return this.f25456c;
    }

    public final Object D0() {
        if (!this.f25452O) {
            Object J11 = this.f25443F.J();
            return (!this.f25477x || (J11 instanceof Y0)) ? J11 : InterfaceC3967k.a.a();
        }
        if (!this.f25470q) {
            return InterfaceC3967k.a.a();
        }
        r.j("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }

    @Override // S0.InterfaceC3967k
    public final void E(@NotNull I0 i02) {
        J0 j02 = i02 instanceof J0 ? (J0) i02 : null;
        if (j02 == null) {
            return;
        }
        j02.E();
    }

    public final void E0(@NotNull Function0<Unit> function0) {
        if (this.f25442E) {
            r.j("Preparing a composition while composing is not supported");
            throw null;
        }
        this.f25442E = true;
        try {
            ((N0) function0).invoke();
        } finally {
            this.f25442E = false;
        }
    }

    @Override // S0.InterfaceC3967k
    public final boolean F(Object obj) {
        if (D0() == obj) {
            return false;
        }
        b1(obj);
        return true;
    }

    @Override // S0.InterfaceC3967k
    public final void G(int i11, Object obj) {
        P0(obj, i11, 0, null);
    }

    public final boolean G0(@NotNull U0.d<J0, Object> dVar) {
        T0.a aVar = this.f25458e;
        if (!aVar.c()) {
            r.j("Expected applyChanges() to have been called");
            throw null;
        }
        if (dVar.e() <= 0 && this.f25471r.isEmpty()) {
            return false;
        }
        f0(dVar, null);
        return aVar.d();
    }

    @Override // S0.InterfaceC3967k
    public final <T> void H(@NotNull Function0<? extends T> function0) {
        if (!this.f25470q) {
            r.j("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f25470q = false;
        if (!this.f25452O) {
            r.j("createNode() can only be called when inserting");
            throw null;
        }
        int e11 = this.f25466m.e();
        C3953e1 c3953e1 = this.f25445H;
        C3945c E11 = c3953e1.E(c3953e1.W());
        this.f25464k++;
        this.f25451N.b(function0, e11, E11);
    }

    @Override // S0.InterfaceC3967k
    public final int I() {
        return this.f25453P;
    }

    @Override // S0.InterfaceC3967k
    public final void J() {
        i0(false);
    }

    @Override // S0.InterfaceC3967k
    public final void K() {
        i0(false);
    }

    public final void N0(@NotNull C3944b1 c3944b1) {
        this.f25443F = c3944b1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O0() {
        int rotateLeft;
        if (this.f25471r.isEmpty()) {
            this.f25464k = this.f25443F.P() + this.f25464k;
            return;
        }
        C3944b1 c3944b1 = this.f25443F;
        int m11 = c3944b1.m();
        Object n11 = c3944b1.n();
        Object k11 = c3944b1.k();
        int i11 = this.f25465l;
        if (n11 != null) {
            rotateLeft = Integer.rotateLeft((n11 instanceof Enum ? ((Enum) n11).ordinal() : n11.hashCode()) ^ Integer.rotateLeft(this.f25453P, 3), 3);
        } else {
            if (k11 != null && m11 == 207 && !k11.equals(InterfaceC3967k.a.a())) {
                this.f25453P = Integer.rotateLeft(k11.hashCode() ^ Integer.rotateLeft(this.f25453P, 3), 3) ^ i11;
                V0(null, c3944b1.H());
                I0();
                c3944b1.f();
                if (n11 == null) {
                    if (n11 instanceof Enum) {
                        this.f25453P = Integer.rotateRight(Integer.hashCode(((Enum) n11).ordinal()) ^ Integer.rotateRight(this.f25453P, 3), 3);
                        return;
                    } else {
                        this.f25453P = Integer.rotateRight(Integer.hashCode(n11.hashCode()) ^ Integer.rotateRight(this.f25453P, 3), 3);
                        return;
                    }
                }
                if (k11 == null || m11 != 207 || k11.equals(InterfaceC3967k.a.a())) {
                    this.f25453P = Integer.rotateRight(Integer.rotateRight(this.f25453P ^ i11, 3) ^ Integer.hashCode(m11), 3);
                    return;
                } else {
                    this.f25453P = Integer.rotateRight(Integer.hashCode(k11.hashCode()) ^ Integer.rotateRight(this.f25453P ^ i11, 3), 3);
                    return;
                }
            }
            rotateLeft = Integer.rotateLeft(Integer.rotateLeft(this.f25453P, 3) ^ m11, 3) ^ i11;
        }
        this.f25453P = rotateLeft;
        V0(null, c3944b1.H());
        I0();
        c3944b1.f();
        if (n11 == null) {
        }
    }

    public final void Q0() {
        P0(null, -127, 0, null);
    }

    public final void S0() {
        P0(null, 125, 1, null);
        this.f25470q = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r4 == r0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T0(@NotNull H0<?> h02) {
        G1<?> g12;
        A0 a02 = a0();
        R0(201, r.q());
        Object C11 = C();
        if (Intrinsics.d(C11, InterfaceC3967k.a.a())) {
            g12 = null;
        } else {
            Intrinsics.g(C11, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            g12 = (G1) C11;
        }
        AbstractC3992x<?> b11 = h02.b();
        G1<?> b12 = b11.b(h02, g12);
        boolean equals = b12.equals(g12);
        if (!equals) {
            x(b12);
        }
        boolean z11 = true;
        if (!this.f25452O) {
            C3944b1 c3944b1 = this.f25443F;
            Object y11 = c3944b1.y(c3944b1.j());
            Intrinsics.g(y11, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            A0 a03 = (A0) y11;
            a02 = (!(b() && equals) && (h02.a() || !a02.containsKey(b11))) ? a02.g(b11, b12) : a03;
            if (!this.f25477x) {
            }
            if (z11 && !this.f25452O) {
                J0(a02);
            }
            this.f25476w.j(this.f25475v ? 1 : 0);
            this.f25475v = z11;
            this.f25447J = a02;
            P0(r.n(), 202, 0, a02);
        }
        if (h02.a() || !a02.containsKey(b11)) {
            a02 = a02.g(b11, b12);
        }
        this.f25446I = true;
        z11 = false;
        if (z11) {
            J0(a02);
        }
        this.f25476w.j(this.f25475v ? 1 : 0);
        this.f25475v = z11;
        this.f25447J = a02;
        P0(r.n(), 202, 0, a02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0, r1) != false) goto L5;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [X0.f, a1.e$a] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X0.f, a1.e$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0(@NotNull H0<?>[] h0Arr) {
        A0 build;
        a1.e eVar;
        A0 a02 = a0();
        R0(201, r.q());
        boolean z11 = true;
        if (this.f25452O) {
            eVar = a1.e.f36181g;
            A0 b11 = B.b(h0Arr, a02, eVar);
            ?? d11 = a02.d();
            d11.putAll(b11);
            build = d11.build();
            R0(204, r.r());
            D0();
            b1(build);
            D0();
            b1(b11);
            i0(false);
            this.f25446I = true;
        } else {
            Object z12 = this.f25443F.z(0);
            Intrinsics.g(z12, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            A0 a03 = (A0) z12;
            Object z13 = this.f25443F.z(1);
            Intrinsics.g(z13, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            A0 a04 = (A0) z13;
            A0 b12 = B.b(h0Arr, a02, a04);
            if (!b() || this.f25477x || !a04.equals(b12)) {
                ?? d12 = a02.d();
                d12.putAll(b12);
                build = d12.build();
                R0(204, r.r());
                D0();
                b1(build);
                D0();
                b1(b12);
                i0(false);
                if (!this.f25477x) {
                }
                if (z11 && !this.f25452O) {
                    J0(build);
                }
                this.f25476w.j(this.f25475v ? 1 : 0);
                this.f25475v = z11;
                this.f25447J = build;
                P0(r.n(), 202, 0, build);
            }
            this.f25464k = this.f25443F.P() + this.f25464k;
            build = a03;
        }
        z11 = false;
        if (z11) {
            J0(build);
        }
        this.f25476w.j(this.f25475v ? 1 : 0);
        this.f25475v = z11;
        this.f25447J = build;
        P0(r.n(), 202, 0, build);
    }

    public final void W() {
        this.f25474u = null;
    }

    public final void W0() {
        this.f25478y = 100;
        this.f25477x = true;
    }

    public final void Y(@NotNull U0.d dVar, @NotNull C4912a c4912a) {
        if (this.f25458e.c()) {
            f0(dVar, c4912a);
        } else {
            r.j("Expected applyChanges() to have been called");
            throw null;
        }
    }

    public final boolean Y0(@NotNull J0 j02, Object obj) {
        C3945c h11 = j02.h();
        if (h11 == null) {
            return false;
        }
        int c11 = this.f25443F.x().c(h11);
        if (!this.f25442E || c11 < this.f25443F.j()) {
            return false;
        }
        r.f(this.f25471r, c11, j02, obj);
        return true;
    }

    @Override // S0.InterfaceC3967k
    public final void a(boolean z11) {
        if (this.f25464k != 0) {
            r.j("No nodes can be emitted before calling dactivateToEndGroup");
            throw null;
        }
        if (this.f25452O) {
            return;
        }
        if (!z11) {
            this.f25464k = this.f25443F.u();
            this.f25443F.Q();
            return;
        }
        int j11 = this.f25443F.j();
        int i11 = this.f25443F.i();
        this.f25449L.d();
        r.h(this.f25471r, j11, i11);
        this.f25443F.Q();
    }

    @Override // S0.InterfaceC3967k
    public final boolean b() {
        J0 v02;
        return (this.f25452O || this.f25477x || this.f25475v || (v02 = v0()) == null || v02.m()) ? false : true;
    }

    public final void b1(Object obj) {
        if (this.f25452O) {
            this.f25445H.U0(obj);
            return;
        }
        boolean q11 = this.f25443F.q();
        T0.b bVar = this.f25449L;
        if (!q11) {
            C3944b1 c3944b1 = this.f25443F;
            bVar.a(c3944b1.a(c3944b1.t()), obj);
            return;
        }
        int p11 = this.f25443F.p() - 1;
        if (!bVar.o()) {
            bVar.R(p11, obj);
        } else {
            C3944b1 c3944b12 = this.f25443F;
            bVar.O(obj, c3944b12.a(c3944b12.t()), p11);
        }
    }

    @Override // S0.InterfaceC3967k
    public final <V, T> void c(V v11, @NotNull Function2<? super T, ? super V, Unit> function2) {
        if (this.f25452O) {
            this.f25451N.f(v11, function2);
        } else {
            this.f25449L.Q(v11, function2);
        }
    }

    public final void c0() {
        this.f25441D.a();
        this.f25471r.clear();
        this.f25458e.a();
        this.f25474u = null;
    }

    @Override // S0.InterfaceC3967k
    @NotNull
    public final A0 d() {
        return a0();
    }

    public final void d0() {
        this.f25477x = false;
    }

    @Override // S0.InterfaceC3967k
    public final void e() {
        if (!this.f25470q) {
            r.j("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f25470q = false;
        if (this.f25452O) {
            r.j("useNode() called while inserting");
            throw null;
        }
        C3944b1 c3944b1 = this.f25443F;
        Object K11 = c3944b1.K(c3944b1.t());
        T0.b bVar = this.f25449L;
        bVar.t(K11);
        if (this.f25477x && (K11 instanceof InterfaceC3963i)) {
            bVar.S((InterfaceC3963i) K11);
        }
    }

    public final void e0() {
        this.f25455b.q(this);
        c0();
        this.f25454a.h();
        Unit unit = Unit.f71690a;
    }

    @Override // S0.InterfaceC3967k
    public final void f() {
        i0(true);
    }

    @Override // S0.InterfaceC3967k
    public final void g(@NotNull Function0<Unit> function0) {
        this.f25449L.L(function0);
    }

    @Override // S0.InterfaceC3967k
    public final void h(Object obj) {
        if (!this.f25452O && this.f25443F.m() == 207 && !Intrinsics.d(this.f25443F.k(), obj) && this.f25478y < 0) {
            this.f25478y = this.f25443F.j();
            this.f25477x = true;
        }
        P0(null, 207, 0, obj);
    }

    public final void h0() {
        this.f25477x = this.f25478y >= 0;
    }

    @Override // S0.InterfaceC3967k
    public final void i() {
        P0(null, 125, 2, null);
        this.f25470q = true;
    }

    @Override // S0.InterfaceC3967k
    public final void j() {
        if (this.f25464k != 0) {
            r.j("No nodes can be emitted before calling skipAndEndGroup");
            throw null;
        }
        J0 v02 = v0();
        if (v02 != null) {
            v02.x();
        }
        if (!this.f25471r.isEmpty()) {
            I0();
        } else {
            this.f25464k = this.f25443F.u();
            this.f25443F.Q();
        }
    }

    public final void j0() {
        i0(false);
        J0 v02 = v0();
        if (v02 == null || !v02.o()) {
            return;
        }
        v02.z();
    }

    @Override // S0.InterfaceC3967k
    public final void k() {
        i0(false);
    }

    public final void k0() {
        i0(false);
        i0(false);
        this.f25475v = this.f25476w.i() != 0;
        this.f25447J = null;
    }

    @Override // S0.InterfaceC3967k
    @NotNull
    public final AbstractC3984t l() {
        R0(206, r.s());
        if (this.f25452O) {
            C3953e1.m0(this.f25445H);
        }
        Object D02 = D0();
        a aVar = D02 instanceof a ? (a) D02 : null;
        if (aVar == null) {
            aVar = new a(new b(this.f25453P, this.f25469p, this.f25439B, this.f25460g.B()));
            b1(aVar);
        }
        aVar.a().u(a0());
        i0(false);
        return aVar.a();
    }

    public final void l0() {
        i0(false);
        i0(false);
        this.f25475v = this.f25476w.i() != 0;
        this.f25447J = null;
    }

    @Override // S0.InterfaceC3967k
    public final <T> T m(@NotNull AbstractC3992x<T> abstractC3992x) {
        return (T) B.a(a0(), abstractC3992x);
    }

    public final J0 m0() {
        C3945c a11;
        Function1<InterfaceC3982s, Unit> g10;
        z1<J0> z1Var = this.f25441D;
        J0 j02 = null;
        J0 g11 = z1Var.d() ? z1Var.g() : null;
        if (g11 != null) {
            g11.C(false);
        }
        if (g11 != null && (g10 = g11.g(this.f25438A)) != null) {
            this.f25449L.f(g10, this.f25460g);
        }
        if (g11 != null && !g11.n() && (g11.o() || this.f25469p)) {
            if (g11.h() == null) {
                if (this.f25452O) {
                    C3953e1 c3953e1 = this.f25445H;
                    a11 = c3953e1.E(c3953e1.W());
                } else {
                    C3944b1 c3944b1 = this.f25443F;
                    a11 = c3944b1.a(c3944b1.t());
                }
                g11.y(a11);
            }
            g11.A(false);
            j02 = g11;
        }
        i0(false);
        return j02;
    }

    @Override // S0.InterfaceC3967k
    public final boolean n(Object obj) {
        if (Intrinsics.d(D0(), obj)) {
            return false;
        }
        b1(obj);
        return true;
    }

    public final void n0() {
        if (this.f25442E || this.f25478y != 100) {
            B0.a("Cannot disable reuse from root if it was caused by other groups");
            throw null;
        }
        this.f25478y = -1;
        this.f25477x = false;
    }

    @Override // S0.InterfaceC3967k
    public final void o(int i11) {
        if (this.f25462i != null) {
            P0(null, i11, 0, null);
            return;
        }
        if (this.f25470q) {
            r.j("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        this.f25453P = this.f25465l ^ Integer.rotateLeft(Integer.rotateLeft(this.f25453P, 3) ^ i11, 3);
        this.f25465l++;
        C3944b1 c3944b1 = this.f25443F;
        if (this.f25452O) {
            c3944b1.b();
            this.f25445H.P0(i11, InterfaceC3967k.a.a());
            q0(false, null);
            return;
        }
        if (c3944b1.m() == i11 && !c3944b1.r()) {
            c3944b1.R();
            q0(false, null);
            return;
        }
        if (!c3944b1.G()) {
            int i12 = this.f25463j;
            int j11 = c3944b1.j();
            L0(this.f25443F.j());
            T0.b bVar = this.f25449L;
            bVar.F();
            bVar.G(i12, c3944b1.P());
            r.h(this.f25471r, j11, c3944b1.j());
        }
        c3944b1.b();
        this.f25452O = true;
        this.f25447J = null;
        if (this.f25445H.R()) {
            C3953e1 z11 = this.f25444G.z();
            this.f25445H = z11;
            z11.G0();
            this.f25446I = false;
            this.f25447J = null;
        }
        C3953e1 c3953e1 = this.f25445H;
        c3953e1.H();
        int U10 = c3953e1.U();
        c3953e1.P0(i11, InterfaceC3967k.a.a());
        this.f25450M = c3953e1.E(U10);
        q0(false, null);
    }

    @Override // S0.InterfaceC3967k
    public final boolean p(boolean z11) {
        Object D02 = D0();
        if ((D02 instanceof Boolean) && z11 == ((Boolean) D02).booleanValue()) {
            return false;
        }
        b1(Boolean.valueOf(z11));
        return true;
    }

    public final void p0(int i11) {
        if (i11 < 0) {
            int i12 = -i11;
            C3953e1 c3953e1 = this.f25445H;
            while (true) {
                int W11 = c3953e1.W();
                if (W11 <= i12) {
                    return;
                } else {
                    i0(c3953e1.l0(W11));
                }
            }
        } else {
            if (this.f25452O) {
                C3953e1 c3953e12 = this.f25445H;
                while (this.f25452O) {
                    i0(c3953e12.l0(c3953e12.W()));
                }
            }
            C3944b1 c3944b1 = this.f25443F;
            while (true) {
                int t2 = c3944b1.t();
                if (t2 <= i11) {
                    return;
                } else {
                    i0(c3944b1.I(t2));
                }
            }
        }
    }

    @Override // S0.InterfaceC3967k
    public final boolean q(float f7) {
        Object D02 = D0();
        if ((D02 instanceof Float) && f7 == ((Number) D02).floatValue()) {
            return false;
        }
        b1(Float.valueOf(f7));
        return true;
    }

    @Override // S0.InterfaceC3967k
    public final boolean r(int i11) {
        Object D02 = D0();
        if ((D02 instanceof Integer) && i11 == ((Number) D02).intValue()) {
            return false;
        }
        b1(Integer.valueOf(i11));
        return true;
    }

    @Override // S0.InterfaceC3967k
    public final boolean s(long j11) {
        Object D02 = D0();
        if ((D02 instanceof Long) && j11 == ((Number) D02).longValue()) {
            return false;
        }
        b1(Long.valueOf(j11));
        return true;
    }

    public final boolean s0() {
        return this.f25479z > 0;
    }

    @Override // S0.InterfaceC3967k
    public final boolean t() {
        return this.f25452O;
    }

    @NotNull
    public final G t0() {
        return this.f25460g;
    }

    @Override // S0.InterfaceC3967k
    @NotNull
    public final C3969l u(int i11) {
        J0 j02;
        boolean z11;
        o(i11);
        boolean z12 = this.f25452O;
        C3988v c3988v = this.f25460g;
        z1<J0> z1Var = this.f25441D;
        if (z12) {
            J0 j03 = new J0(c3988v);
            z1Var.h(j03);
            b1(j03);
            j03.F(this.f25438A);
            return this;
        }
        X g10 = r.g(this.f25443F.t(), this.f25471r);
        Object J11 = this.f25443F.J();
        if (Intrinsics.d(J11, InterfaceC3967k.a.a())) {
            j02 = new J0(c3988v);
            b1(j02);
        } else {
            Intrinsics.g(J11, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            j02 = (J0) J11;
        }
        if (g10 == null) {
            boolean l11 = j02.l();
            if (l11) {
                j02.B();
            }
            if (!l11) {
                z11 = false;
                j02.C(z11);
                z1Var.h(j02);
                j02.F(this.f25438A);
                return this;
            }
        }
        z11 = true;
        j02.C(z11);
        z1Var.h(j02);
        j02.F(this.f25438A);
        return this;
    }

    public final int u0() {
        return this.f25452O ? -this.f25445H.W() : this.f25443F.t();
    }

    @Override // S0.InterfaceC3967k
    @NotNull
    public final InterfaceC3951e<?> v() {
        return this.f25454a;
    }

    public final J0 v0() {
        if (this.f25479z != 0) {
            return null;
        }
        z1<J0> z1Var = this.f25441D;
        if (z1Var.d()) {
            return z1Var.e();
        }
        return null;
    }

    @Override // S0.InterfaceC3967k
    @NotNull
    public final CoroutineContext w() {
        return this.f25455b.i();
    }

    public final boolean w0() {
        J0 v02;
        return !b() || this.f25475v || ((v02 = v0()) != null && v02.k());
    }

    @Override // S0.InterfaceC3967k
    public final void x(Object obj) {
        int i11;
        int i12;
        if (obj instanceof V0) {
            if (this.f25452O) {
                this.f25449L.E((V0) obj);
            }
            this.f25457d.add(obj);
            V0 v02 = (V0) obj;
            C3945c c3945c = null;
            if (this.f25452O) {
                C3953e1 c3953e1 = this.f25445H;
                if (c3953e1.U() > c3953e1.W() + 1) {
                    int U10 = this.f25445H.U() - 1;
                    int v03 = this.f25445H.v0(U10);
                    while (true) {
                        int i13 = v03;
                        i12 = U10;
                        U10 = i13;
                        if (U10 == this.f25445H.W() || U10 < 0) {
                            break;
                        } else {
                            v03 = this.f25445H.v0(U10);
                        }
                    }
                    c3945c = this.f25445H.E(i12);
                }
            } else {
                C3944b1 c3944b1 = this.f25443F;
                if (c3944b1.j() > c3944b1.t() + 1) {
                    int j11 = this.f25443F.j() - 1;
                    int M11 = this.f25443F.M(j11);
                    while (true) {
                        int i14 = M11;
                        i11 = j11;
                        j11 = i14;
                        if (j11 == this.f25443F.t() || j11 < 0) {
                            break;
                        } else {
                            M11 = this.f25443F.M(j11);
                        }
                    }
                    c3945c = this.f25443F.a(i11);
                }
            }
            obj = new W0(v02, c3945c);
        }
        b1(obj);
    }

    public final T0.a x0() {
        return this.f25448K;
    }

    @Override // S0.InterfaceC3967k
    public final void y() {
        this.f25469p = true;
        this.f25439B = true;
        this.f25456c.k();
        this.f25444G.k();
        this.f25445H.Z0();
    }

    @NotNull
    public final C3944b1 y0() {
        return this.f25443F;
    }

    @Override // S0.InterfaceC3967k
    public final J0 z() {
        return v0();
    }
}
