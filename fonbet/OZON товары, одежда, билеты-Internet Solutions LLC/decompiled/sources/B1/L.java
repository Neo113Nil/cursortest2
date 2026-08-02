package B1;

import B1.A0;
import B1.m0;
import B1.v0;
import B1.y0;
import C.C2702w;
import D1.AbstractC2813m;
import D1.C2804h0;
import D1.C2809k;
import D1.H;
import D1.H0;
import D1.I0;
import D1.L;
import D1.L0;
import S0.AbstractC3984t;
import S0.C3988v;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3963i;
import S0.InterfaceC3967k;
import S0.X0;
import S0.n1;
import a1.C4912a;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.z2;
import c1.AbstractC5715f;
import c1.C5710a;
import c1.C5721l;
import c1.InterfaceC5704H;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class L implements InterfaceC3963i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D1.H f2034a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC3984t f2035b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private A0 f2036c;

    /* renamed from: d, reason: collision with root package name */
    private int f2037d;

    /* renamed from: e, reason: collision with root package name */
    private int f2038e;

    /* renamed from: n, reason: collision with root package name */
    private int f2047n;

    /* renamed from: o, reason: collision with root package name */
    private int f2048o;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final HashMap<D1.H, a> f2039f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final HashMap<Object, D1.H> f2040g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final c f2041h = new c();

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final b f2042i = new b();

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final HashMap<Object, D1.H> f2043j = new HashMap<>();

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final A0.a f2044k = new A0.a(0);

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f2045l = new LinkedHashMap();

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final U0.b<Object> f2046m = new U0.b<>(new Object[16]);

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final String f2049p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Object f2050a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private Function2<? super InterfaceC3967k, ? super Integer, Unit> f2051b;

        /* renamed from: c, reason: collision with root package name */
        private X0 f2052c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2053d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f2054e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private C3991w0 f2055f;

        public a() {
            throw null;
        }

        public a(Object obj) {
            C3991w0 f7;
            C4912a c4912a = C2546o.f2136a;
            this.f2050a = obj;
            this.f2051b = c4912a;
            this.f2052c = null;
            f7 = n1.f(Boolean.TRUE, D1.f25195a);
            this.f2055f = f7;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a() {
            return ((Boolean) this.f2055f.getValue()).booleanValue();
        }

        public final X0 b() {
            return this.f2052c;
        }

        @NotNull
        public final Function2<InterfaceC3967k, Integer, Unit> c() {
            return this.f2051b;
        }

        public final boolean d() {
            return this.f2053d;
        }

        public final boolean e() {
            return this.f2054e;
        }

        public final Object f() {
            return this.f2050a;
        }

        public final void g() {
            this.f2055f.setValue(Boolean.FALSE);
        }

        public final void h(@NotNull C3991w0 c3991w0) {
            this.f2055f = c3991w0;
        }

        public final void i(X0 x02) {
            this.f2052c = x02;
        }

        public final void j(@NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
            this.f2051b = function2;
        }

        public final void k(boolean z11) {
            this.f2053d = z11;
        }

        public final void l(boolean z11) {
            this.f2054e = z11;
        }

        public final void m(Object obj) {
            this.f2050a = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements z0, Y {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ c f2056a;

        public b() {
            this.f2056a = L.this.f2041h;
        }

        @Override // Z1.d
        public final float B(int i11) {
            return this.f2056a.B(i11);
        }

        @Override // Z1.d
        public final float C(float f7) {
            return f7 / this.f2056a.g();
        }

        @Override // Z1.d
        public final long D0(long j11) {
            return this.f2056a.D0(j11);
        }

        @Override // Z1.k
        public final long F(float f7) {
            return this.f2056a.F(f7);
        }

        @Override // B1.z0
        @NotNull
        public final List<U> L0(Object obj, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
            L l11 = L.this;
            D1.H h11 = (D1.H) l11.f2040g.get(obj);
            List<U> z11 = h11 != null ? h11.z() : null;
            return z11 != null ? z11 : L.o(l11, obj, function2);
        }

        @Override // B1.InterfaceC2553w
        public final boolean R0() {
            return this.f2056a.R0();
        }

        @Override // Z1.d
        public final int Y0(float f7) {
            return this.f2056a.Y0(f7);
        }

        @Override // Z1.d
        public final float Z0(long j11) {
            return this.f2056a.Z0(j11);
        }

        @Override // B1.Y
        @NotNull
        public final W f1(int i11, int i12, @NotNull Map map, @NotNull Function1 function1) {
            return this.f2056a.f1(i11, i12, map, function1);
        }

        @Override // Z1.d
        public final float g() {
            return this.f2056a.g();
        }

        @Override // B1.InterfaceC2553w
        @NotNull
        public final Z1.s getLayoutDirection() {
            return this.f2056a.getLayoutDirection();
        }

        @Override // Z1.d
        public final long o(long j11) {
            return this.f2056a.o(j11);
        }

        @Override // Z1.k
        public final float p(long j11) {
            return this.f2056a.p(j11);
        }

        @Override // Z1.d
        public final long r(float f7) {
            return this.f2056a.r(f7);
        }

        @Override // Z1.k
        public final float u1() {
            return this.f2056a.u1();
        }

        @Override // Z1.d
        public final float v1(float f7) {
            return this.f2056a.g() * f7;
        }

        @Override // B1.Y
        @NotNull
        public final W z0(int i11, int i12, @NotNull Map<AbstractC2531a, Integer> map, @NotNull Function1<? super m0.a, Unit> function1) {
            return this.f2056a.f1(i11, i12, map, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements z0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private Z1.s f2058a = Z1.s.Rtl;

        /* renamed from: b, reason: collision with root package name */
        private float f2059b;

        /* renamed from: c, reason: collision with root package name */
        private float f2060c;

        public c() {
        }

        @Override // B1.z0
        @NotNull
        public final List<U> L0(Object obj, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
            return L.this.C(obj, function2);
        }

        @Override // B1.InterfaceC2553w
        public final boolean R0() {
            L l11 = L.this;
            return l11.f2034a.Q() == H.d.LookaheadLayingOut || l11.f2034a.Q() == H.d.LookaheadMeasuring;
        }

        @Override // B1.Y
        @NotNull
        public final W f1(int i11, int i12, @NotNull Map map, @NotNull Function1 function1) {
            if ((i11 & (-16777216)) == 0 && ((-16777216) & i12) == 0) {
                return new M(i11, i12, map, this, L.this, function1);
            }
            A1.a.b("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
            throw null;
        }

        @Override // Z1.d
        public final float g() {
            return this.f2059b;
        }

        @Override // B1.InterfaceC2553w
        @NotNull
        public final Z1.s getLayoutDirection() {
            return this.f2058a;
        }

        public final void m(float f7) {
            this.f2059b = f7;
        }

        public final void s(float f7) {
            this.f2060c = f7;
        }

        public final void t(@NotNull Z1.s sVar) {
            this.f2058a = sVar;
        }

        @Override // Z1.k
        public final float u1() {
            return this.f2060c;
        }
    }

    /* loaded from: classes8.dex */
    public static final class d implements y0.a {
        d() {
        }

        @Override // B1.y0.a
        public final void dispose() {
        }
    }

    public static final class e implements y0.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f2063b;

        e(Object obj) {
            this.f2063b = obj;
        }

        @Override // B1.y0.a
        public final int b() {
            D1.H h11 = (D1.H) L.this.f2043j.get(this.f2063b);
            if (h11 != null) {
                return h11.A().size();
            }
            return 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v10, types: [androidx.compose.ui.e$c] */
        /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v12 */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.ui.e$c] */
        /* JADX WARN: Type inference failed for: r7v9 */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v3, types: [U0.b] */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6, types: [U0.b] */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* JADX WARN: Type inference failed for: r8v9 */
        @Override // B1.y0.a
        public final void c(@NotNull Function1 function1) {
            C2804h0 c02;
            e.c h11;
            D1.H h12 = (D1.H) L.this.f2043j.get(this.f2063b);
            if (h12 == null || (c02 = h12.c0()) == null || (h11 = c02.h()) == null) {
                return;
            }
            if (!h11.getNode().isAttached()) {
                A1.a.b("visitSubtreeIf called on an unattached node");
                throw null;
            }
            U0.b bVar = new U0.b(new e.c[16]);
            e.c child$ui_release = h11.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                C2809k.a(bVar, h11.getNode());
            } else {
                bVar.b(child$ui_release);
            }
            while (bVar.p()) {
                e.c cVar = (e.c) Pk0.b.b(1, bVar);
                if ((cVar.getAggregateChildKindSet$ui_release() & 262144) != 0) {
                    for (e.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.getChild$ui_release()) {
                        if ((cVar2.getKindSet$ui_release() & 262144) != 0) {
                            ?? r82 = 0;
                            AbstractC2813m abstractC2813m = cVar2;
                            while (abstractC2813m != 0) {
                                if (abstractC2813m instanceof I0) {
                                    I0 i02 = (I0) abstractC2813m;
                                    H0 h02 = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(i02.K0()) ? (H0) function1.invoke(i02) : H0.ContinueTraversal;
                                    if (h02 == H0.CancelTraversal) {
                                        return;
                                    }
                                    if (h02 == H0.SkipSubtreeAndContinueTraversal) {
                                        break;
                                    }
                                } else if ((abstractC2813m.getKindSet$ui_release() & 262144) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                                    e.c J12 = abstractC2813m.J1();
                                    int i11 = 0;
                                    abstractC2813m = abstractC2813m;
                                    r82 = r82;
                                    while (J12 != null) {
                                        if ((J12.getKindSet$ui_release() & 262144) != 0) {
                                            i11++;
                                            r82 = r82;
                                            if (i11 == 1) {
                                                abstractC2813m = J12;
                                            } else {
                                                if (r82 == 0) {
                                                    r82 = new U0.b(new e.c[16]);
                                                }
                                                if (abstractC2813m != 0) {
                                                    r82.b(abstractC2813m);
                                                    abstractC2813m = 0;
                                                }
                                                r82.b(J12);
                                            }
                                        }
                                        J12 = J12.getChild$ui_release();
                                        abstractC2813m = abstractC2813m;
                                        r82 = r82;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC2813m = C2809k.b(r82);
                            }
                        }
                    }
                }
                C2809k.a(bVar, cVar);
            }
        }

        @Override // B1.y0.a
        public final void d(int i11, long j11) {
            L l11 = L.this;
            D1.H h11 = (D1.H) l11.f2043j.get(this.f2063b);
            if (h11 == null || !h11.z0()) {
                return;
            }
            int size = h11.A().size();
            if (i11 < 0 || i11 >= size) {
                throw new IndexOutOfBoundsException("Index (" + i11 + ") is out of bound of [0, " + size + ')');
            }
            if (h11.B0()) {
                throw new IllegalArgumentException("Pre-measure called on node that is not placed");
            }
            D1.H h12 = l11.f2034a;
            h12.f5258l = true;
            ((AndroidComposeView) D1.K.b(h11)).y0(h11.A().get(i11), j11);
            h12.f5258l = false;
        }

        @Override // B1.y0.a
        public final void dispose() {
            L l11 = L.this;
            l11.w();
            D1.H h11 = (D1.H) l11.f2043j.remove(this.f2063b);
            if (h11 != null) {
                if (l11.f2048o <= 0) {
                    throw new IllegalStateException("No pre-composed items to dispose");
                }
                int indexOf = l11.f2034a.G().indexOf(h11);
                if (indexOf < l11.f2034a.G().size() - l11.f2048o) {
                    throw new IllegalStateException("Item is not in pre-composed item range");
                }
                l11.f2047n++;
                l11.f2048o--;
                int size = (l11.f2034a.G().size() - l11.f2048o) - l11.f2047n;
                l11.y(indexOf, size);
                l11.u(size);
            }
        }
    }

    public L(@NotNull D1.H h11, @NotNull A0 a02) {
        this.f2034a = h11;
        this.f2036c = a02;
    }

    private final void D(D1.H h11, Object obj, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
        HashMap<D1.H, a> hashMap = this.f2039f;
        a aVar = hashMap.get(h11);
        if (aVar == null) {
            C4912a c4912a = C2546o.f2136a;
            aVar = new a(obj);
            hashMap.put(h11, aVar);
        }
        a aVar2 = aVar;
        X0 b11 = aVar2.b();
        boolean r11 = b11 != null ? b11.r() : true;
        if (aVar2.c() != function2 || r11 || aVar2.d()) {
            aVar2.j(function2);
            AbstractC5715f a11 = AbstractC5715f.a.a();
            Function1<Object, Unit> h12 = a11 != null ? a11.h() : null;
            AbstractC5715f b12 = AbstractC5715f.a.b(a11);
            try {
                D1.H h13 = this.f2034a;
                h13.f5258l = true;
                Function2<InterfaceC3967k, Integer, Unit> c11 = aVar2.c();
                X0 b13 = aVar2.b();
                AbstractC3984t abstractC3984t = this.f2035b;
                if (abstractC3984t == null) {
                    throw new IllegalStateException("parent composition reference not set");
                }
                boolean e11 = aVar2.e();
                C4912a c4912a2 = new C4912a(true, -1750409193, new P(aVar2, c11));
                if (b13 == null || b13.isDisposed()) {
                    int i11 = z2.f41115b;
                    b13 = new C3988v(abstractC3984t, new L0(h11));
                }
                if (e11) {
                    b13.l(c4912a2);
                } else {
                    b13.k(c4912a2);
                }
                aVar2.i(b13);
                aVar2.l(false);
                h13.f5258l = false;
                Unit unit = Unit.f71690a;
                AbstractC5715f.a.d(a11, b12, h12);
                aVar2.k(false);
            } catch (Throwable th2) {
                AbstractC5715f.a.d(a11, b12, h12);
                throw th2;
            }
        }
    }

    private final D1.H E(Object obj) {
        HashMap<D1.H, a> hashMap;
        int i11;
        C3991w0 f7;
        v0.a aVar;
        if (this.f2047n == 0) {
            return null;
        }
        D1.H h11 = this.f2034a;
        int size = h11.G().size() - this.f2048o;
        int i12 = size - this.f2047n;
        int i13 = size - 1;
        int i14 = i13;
        while (true) {
            hashMap = this.f2039f;
            if (i14 < i12) {
                i11 = -1;
                break;
            }
            a aVar2 = hashMap.get(h11.G().get(i14));
            Intrinsics.f(aVar2);
            if (Intrinsics.d(aVar2.f(), obj)) {
                i11 = i14;
                break;
            }
            i14--;
        }
        if (i11 == -1) {
            while (i13 >= i12) {
                a aVar3 = hashMap.get(h11.G().get(i13));
                Intrinsics.f(aVar3);
                a aVar4 = aVar3;
                Object f11 = aVar4.f();
                aVar = v0.f2155a;
                if (f11 == aVar || this.f2036c.b(obj, aVar4.f())) {
                    aVar4.m(obj);
                    i14 = i13;
                    i11 = i14;
                    break;
                }
                i13--;
            }
            i14 = i13;
        }
        if (i11 == -1) {
            return null;
        }
        if (i14 != i12) {
            y(i14, i12);
        }
        this.f2047n--;
        D1.H h12 = h11.G().get(i12);
        a aVar5 = hashMap.get(h12);
        Intrinsics.f(aVar5);
        a aVar6 = aVar5;
        f7 = n1.f(Boolean.TRUE, D1.f25195a);
        aVar6.h(f7);
        aVar6.l(true);
        aVar6.k(true);
        return h12;
    }

    public static final void b(L l11) {
        kotlin.collections.C.g(l11.f2045l.entrySet(), new O(l11));
    }

    public static final List o(L l11, Object obj, Function2 function2) {
        U0.b<Object> bVar = l11.f2046m;
        if (bVar.m() < l11.f2038e) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
        }
        int m11 = bVar.m();
        int i11 = l11.f2038e;
        if (m11 == i11) {
            bVar.b(obj);
        } else {
            bVar.x(i11, obj);
        }
        l11.f2038e++;
        HashMap<Object, D1.H> hashMap = l11.f2043j;
        if (!hashMap.containsKey(obj)) {
            l11.f2045l.put(obj, l11.z(obj, function2));
            D1.H h11 = l11.f2034a;
            if (h11.Q() == H.d.LayingOut) {
                h11.c1(true);
            } else {
                D1.H.d1(h11, true, 6);
            }
        }
        D1.H h12 = hashMap.get(obj);
        if (h12 == null) {
            return kotlin.collections.K.f71697a;
        }
        List<L.b> g12 = h12.V().g1();
        int size = g12.size();
        for (int i12 = 0; i12 < size; i12++) {
            g12.get(i12).s1();
        }
        return g12;
    }

    private final void x(boolean z11) {
        v0.a aVar;
        C3991w0 f7;
        this.f2048o = 0;
        this.f2043j.clear();
        D1.H h11 = this.f2034a;
        int size = h11.G().size();
        if (this.f2047n != size) {
            this.f2047n = size;
            AbstractC5715f a11 = AbstractC5715f.a.a();
            Function1<Object, Unit> h12 = a11 != null ? a11.h() : null;
            AbstractC5715f b11 = AbstractC5715f.a.b(a11);
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    D1.H h13 = h11.G().get(i11);
                    a aVar2 = this.f2039f.get(h13);
                    if (aVar2 != null && aVar2.a()) {
                        L.b V11 = h13.V();
                        H.f fVar = H.f.NotUsed;
                        V11.M1(fVar);
                        L.a T11 = h13.T();
                        if (T11 != null) {
                            T11.C1(fVar);
                        }
                        if (z11) {
                            X0 b12 = aVar2.b();
                            if (b12 != null) {
                                b12.deactivate();
                            }
                            f7 = n1.f(Boolean.FALSE, D1.f25195a);
                            aVar2.h(f7);
                        } else {
                            aVar2.g();
                        }
                        aVar = v0.f2155a;
                        aVar2.m(aVar);
                    }
                } catch (Throwable th2) {
                    AbstractC5715f.a.d(a11, b11, h12);
                    throw th2;
                }
            }
            Unit unit = Unit.f71690a;
            AbstractC5715f.a.d(a11, b11, h12);
            this.f2040g.clear();
        }
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(int i11, int i12) {
        D1.H h11 = this.f2034a;
        h11.f5258l = true;
        h11.T0(i11, i12, 1);
        h11.f5258l = false;
    }

    public final void A(AbstractC3984t abstractC3984t) {
        this.f2035b = abstractC3984t;
    }

    public final void B(@NotNull A0 a02) {
        if (this.f2036c != a02) {
            this.f2036c = a02;
            x(false);
            D1.H.f1(this.f2034a, false, 7);
        }
    }

    @NotNull
    public final List<U> C(Object obj, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
        w();
        D1.H h11 = this.f2034a;
        H.d Q11 = h11.Q();
        H.d dVar = H.d.Measuring;
        if (!(Q11 == dVar || Q11 == H.d.LayingOut || Q11 == H.d.LookaheadMeasuring || Q11 == H.d.LookaheadLayingOut)) {
            A1.a.b("subcompose can only be used inside the measure or layout blocks");
            throw null;
        }
        HashMap<Object, D1.H> hashMap = this.f2040g;
        D1.H h12 = hashMap.get(obj);
        if (h12 == null) {
            h12 = this.f2043j.remove(obj);
            if (h12 != null) {
                int i11 = this.f2048o;
                if (i11 <= 0) {
                    A1.a.b("Check failed.");
                    throw null;
                }
                this.f2048o = i11 - 1;
            } else {
                D1.H E11 = E(obj);
                if (E11 == null) {
                    int i12 = this.f2037d;
                    h12 = new D1.H(2);
                    h11.f5258l = true;
                    h11.r0(i12, h12);
                    h11.f5258l = false;
                } else {
                    h12 = E11;
                }
            }
            hashMap.put(obj, h12);
        }
        D1.H h13 = h12;
        if (C7714v.Q(this.f2037d, h11.G()) != h13) {
            int indexOf = h11.G().indexOf(h13);
            int i13 = this.f2037d;
            if (indexOf < i13) {
                throw new IllegalArgumentException(C2702w.c(obj, "Key \"", "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i13 != indexOf) {
                y(indexOf, i13);
            }
        }
        this.f2037d++;
        D(h13, obj, function2);
        return (Q11 == dVar || Q11 == H.d.LayingOut) ? h13.z() : h13.y();
    }

    @Override // S0.InterfaceC3963i
    public final void a() {
        x(true);
    }

    @Override // S0.InterfaceC3963i
    public final void g() {
        x(false);
    }

    @Override // S0.InterfaceC3963i
    public final void onRelease() {
        D1.H h11 = this.f2034a;
        h11.f5258l = true;
        HashMap<D1.H, a> hashMap = this.f2039f;
        Iterator<T> it = hashMap.values().iterator();
        while (it.hasNext()) {
            X0 b11 = ((a) it.next()).b();
            if (b11 != null) {
                b11.dispose();
            }
        }
        h11.Z0();
        h11.f5258l = false;
        hashMap.clear();
        this.f2040g.clear();
        this.f2048o = 0;
        this.f2047n = 0;
        this.f2043j.clear();
        w();
    }

    @NotNull
    public final N t(@NotNull Function2 function2) {
        return new N(this, function2, this.f2049p);
    }

    public final void u(int i11) {
        boolean z11;
        AtomicReference atomicReference;
        boolean z12 = false;
        this.f2047n = 0;
        int size = (this.f2034a.G().size() - this.f2048o) - 1;
        if (i11 <= size) {
            this.f2044k.clear();
            if (i11 <= size) {
                int i12 = i11;
                while (true) {
                    a aVar = this.f2039f.get(this.f2034a.G().get(i12));
                    Intrinsics.f(aVar);
                    this.f2044k.b(aVar.f());
                    if (i12 == size) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f2036c.a(this.f2044k);
            AbstractC5715f a11 = AbstractC5715f.a.a();
            Function1<Object, Unit> h11 = a11 != null ? a11.h() : null;
            AbstractC5715f b11 = AbstractC5715f.a.b(a11);
            z11 = false;
            while (size >= i11) {
                try {
                    D1.H h12 = this.f2034a.G().get(size);
                    a aVar2 = this.f2039f.get(h12);
                    Intrinsics.f(aVar2);
                    a aVar3 = aVar2;
                    Object f7 = aVar3.f();
                    if (this.f2044k.contains(f7)) {
                        this.f2047n++;
                        if (aVar3.a()) {
                            L.b V11 = h12.V();
                            H.f fVar = H.f.NotUsed;
                            V11.M1(fVar);
                            L.a T11 = h12.T();
                            if (T11 != null) {
                                T11.C1(fVar);
                            }
                            aVar3.g();
                            z11 = true;
                        }
                    } else {
                        D1.H h13 = this.f2034a;
                        h13.f5258l = true;
                        this.f2039f.remove(h12);
                        X0 b12 = aVar3.b();
                        if (b12 != null) {
                            b12.dispose();
                        }
                        this.f2034a.a1(size, 1);
                        h13.f5258l = false;
                    }
                    this.f2040g.remove(f7);
                    size--;
                } catch (Throwable th2) {
                    AbstractC5715f.a.d(a11, b11, h11);
                    throw th2;
                }
            }
            Unit unit = Unit.f71690a;
            AbstractC5715f.a.d(a11, b11, h11);
        } else {
            z11 = false;
        }
        if (z11) {
            synchronized (C5721l.D()) {
                atomicReference = C5721l.f56259j;
                androidx.collection.M<InterfaceC5704H> D11 = ((C5710a) atomicReference.get()).D();
                if (D11 != null) {
                    if (D11.c()) {
                        z12 = true;
                    }
                }
            }
            if (z12) {
                C5721l.b();
            }
        }
        w();
    }

    public final void v() {
        D1.H h11 = this.f2034a;
        if (this.f2047n != h11.G().size()) {
            Iterator<Map.Entry<D1.H, a>> it = this.f2039f.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().k(true);
            }
            if (h11.W()) {
                return;
            }
            D1.H.f1(h11, false, 7);
        }
    }

    public final void w() {
        int size = this.f2034a.G().size();
        HashMap<D1.H, a> hashMap = this.f2039f;
        if (hashMap.size() != size) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + hashMap.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((size - this.f2047n) - this.f2048o < 0) {
            StringBuilder f7 = P4.f.f(size, "Incorrect state. Total children ", ". Reusable children ");
            f7.append(this.f2047n);
            f7.append(". Precomposed children ");
            f7.append(this.f2048o);
            throw new IllegalArgumentException(f7.toString().toString());
        }
        HashMap<Object, D1.H> hashMap2 = this.f2043j;
        if (hashMap2.size() == this.f2048o) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f2048o + ". Map size " + hashMap2.size()).toString());
    }

    @NotNull
    public final y0.a z(Object obj, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
        D1.H h11 = this.f2034a;
        if (!h11.z0()) {
            return new d();
        }
        w();
        if (!this.f2040g.containsKey(obj)) {
            this.f2045l.remove(obj);
            HashMap<Object, D1.H> hashMap = this.f2043j;
            D1.H h12 = hashMap.get(obj);
            if (h12 == null) {
                h12 = E(obj);
                if (h12 != null) {
                    y(h11.G().indexOf(h12), h11.G().size());
                    this.f2048o++;
                } else {
                    int size = h11.G().size();
                    D1.H h13 = new D1.H(2);
                    h11.f5258l = true;
                    h11.r0(size, h13);
                    h11.f5258l = false;
                    this.f2048o++;
                    h12 = h13;
                }
                hashMap.put(obj, h12);
            }
            D(h12, obj, function2);
        }
        return new e(obj);
    }
}
