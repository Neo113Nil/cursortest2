package S0;

import S0.I;
import a1.C4912a;
import androidx.collection.X;
import androidx.recyclerview.widget.LinearLayoutManager;
import c1.AbstractC5705I;
import c1.InterfaceC5704H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3988v implements G, X0, K0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC3984t f25544a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final D1.L0 f25545b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicReference<Object> f25546c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f25547d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Set<V0> f25548e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C3947c1 f25549f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final U0.d<Object, J0> f25550g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.collection.M<J0> f25551h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.collection.M<J0> f25552i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final U0.d<Object, J<?>> f25553j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final T0.a f25554k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final T0.a f25555l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final U0.d<Object, J0> f25556m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private U0.d<J0, Object> f25557n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f25558o;

    /* renamed from: p, reason: collision with root package name */
    private C3988v f25559p;

    /* renamed from: q, reason: collision with root package name */
    private int f25560q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final C f25561r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final C3969l f25562s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f25563t;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0.v$a */
    static final class a implements U0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Set<V0> f25564a;

        /* renamed from: e, reason: collision with root package name */
        private androidx.collection.M<InterfaceC3963i> f25568e;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f25565b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList f25566c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final ArrayList f25567d = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final ArrayList f25569f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final androidx.collection.B f25570g = new androidx.collection.B();

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final androidx.collection.B f25571h = new androidx.collection.B();

        public a(@NotNull Set<V0> set) {
            this.f25564a = set;
        }

        private final void h(int i11) {
            ArrayList arrayList = this.f25569f;
            if (arrayList.isEmpty()) {
                return;
            }
            int i12 = 0;
            ArrayList arrayList2 = null;
            int i13 = 0;
            androidx.collection.B b11 = null;
            androidx.collection.B b12 = null;
            while (true) {
                androidx.collection.B b13 = this.f25571h;
                if (i13 >= b13.f38715b) {
                    break;
                }
                if (i11 <= b13.a(i13)) {
                    Object remove = arrayList.remove(i13);
                    int d11 = b13.d(i13);
                    int d12 = this.f25570g.d(i13);
                    if (arrayList2 == null) {
                        arrayList2 = C7714v.m0(remove);
                        b12 = new androidx.collection.B();
                        b12.b(d11);
                        b11 = new androidx.collection.B();
                        b11.b(d12);
                    } else {
                        Intrinsics.g(b11, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        Intrinsics.g(b12, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        arrayList2.add(remove);
                        b12.b(d11);
                        b11.b(d12);
                    }
                } else {
                    i13++;
                }
            }
            if (arrayList2 != null) {
                Intrinsics.g(b11, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                Intrinsics.g(b12, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                int size = arrayList2.size() - 1;
                while (i12 < size) {
                    int i14 = i12 + 1;
                    int size2 = arrayList2.size();
                    for (int i15 = i14; i15 < size2; i15++) {
                        int a11 = b12.a(i12);
                        int a12 = b12.a(i15);
                        if (a11 < a12 || (a12 == a11 && b11.a(i12) < b11.a(i15))) {
                            Object obj = arrayList2.get(i12);
                            arrayList2.set(i12, arrayList2.get(i15));
                            arrayList2.set(i15, obj);
                            int a13 = b11.a(i12);
                            b11.e(i12, b11.a(i15));
                            b11.e(i15, a13);
                            int a14 = b12.a(i12);
                            b12.e(i12, b12.a(i15));
                            b12.e(i15, a14);
                        }
                    }
                    i12 = i14;
                }
                this.f25566c.addAll(arrayList2);
            }
        }

        private final void i(Object obj, int i11, int i12, int i13) {
            h(i11);
            if (i13 < 0 || i13 >= i11) {
                this.f25566c.add(obj);
                return;
            }
            this.f25569f.add(obj);
            this.f25570g.b(i12);
            this.f25571h.b(i13);
        }

        @Override // S0.U0
        public final void a(@NotNull Function0<Unit> function0) {
            this.f25567d.add(function0);
        }

        @Override // S0.U0
        public final void b(@NotNull V0 v02) {
            this.f25565b.add(v02);
        }

        @Override // S0.U0
        public final void c(@NotNull V0 v02, int i11, int i12, int i13) {
            i(v02, i11, i12, i13);
        }

        public final void d(@NotNull InterfaceC3963i interfaceC3963i, int i11) {
            i(interfaceC3963i, i11, -1, -1);
        }

        public final void e() {
            Set<V0> set = this.f25564a;
            if (set.isEmpty()) {
                return;
            }
            Iterator<V0> it = set.iterator();
            while (it.hasNext()) {
                V0 next = it.next();
                it.remove();
                next.d();
            }
            Unit unit = Unit.f71690a;
        }

        public final void f() {
            h(LinearLayoutManager.INVALID_OFFSET);
            ArrayList arrayList = this.f25566c;
            boolean isEmpty = arrayList.isEmpty();
            Set<V0> set = this.f25564a;
            if (!isEmpty) {
                androidx.collection.X x11 = this.f25568e;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    Object obj = arrayList.get(size);
                    if (obj instanceof V0) {
                        set.remove(obj);
                        ((V0) obj).e();
                    }
                    if (obj instanceof InterfaceC3963i) {
                        if (x11 == null || !x11.a(obj)) {
                            ((InterfaceC3963i) obj).a();
                        } else {
                            ((InterfaceC3963i) obj).onRelease();
                        }
                    }
                }
                Unit unit = Unit.f71690a;
            }
            ArrayList arrayList2 = this.f25565b;
            if (arrayList2.isEmpty()) {
                return;
            }
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                V0 v02 = (V0) arrayList2.get(i11);
                set.remove(v02);
                v02.b();
            }
            Unit unit2 = Unit.f71690a;
        }

        public final void g() {
            ArrayList arrayList = this.f25567d;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((Function0) arrayList.get(i11)).invoke();
            }
            arrayList.clear();
            Unit unit = Unit.f71690a;
        }

        public final void j(@NotNull InterfaceC3963i interfaceC3963i, int i11) {
            androidx.collection.M<InterfaceC3963i> m11 = this.f25568e;
            if (m11 == null) {
                m11 = androidx.collection.Y.a();
                this.f25568e = m11;
            }
            m11.k(interfaceC3963i);
            i(interfaceC3963i, i11, -1, -1);
        }
    }

    public C3988v() {
        throw null;
    }

    public C3988v(AbstractC3984t abstractC3984t, D1.L0 l02) {
        this.f25544a = abstractC3984t;
        this.f25545b = l02;
        this.f25546c = new AtomicReference<>(null);
        this.f25547d = new Object();
        Set<V0> e11 = new androidx.collection.M((Object) null).e();
        this.f25548e = e11;
        C3947c1 c3947c1 = new C3947c1();
        if (abstractC3984t.d()) {
            c3947c1.i();
        }
        if (abstractC3984t.f()) {
            c3947c1.k();
        }
        this.f25549f = c3947c1;
        this.f25550g = new U0.d<>();
        this.f25551h = new androidx.collection.M<>((Object) null);
        this.f25552i = new androidx.collection.M<>((Object) null);
        this.f25553j = new U0.d<>();
        T0.a aVar = new T0.a();
        this.f25554k = aVar;
        T0.a aVar2 = new T0.a();
        this.f25555l = aVar2;
        this.f25556m = new U0.d<>();
        this.f25557n = new U0.d<>();
        this.f25561r = new C();
        C3969l c3969l = new C3969l(l02, abstractC3984t, c3947c1, e11, aVar, aVar2, this);
        abstractC3984t.n(c3969l);
        this.f25562s = c3969l;
        boolean z11 = abstractC3984t instanceof L0;
        C4912a c4912a = C3960h.f25415a;
    }

    private final void A() {
        Object obj;
        AtomicReference<Object> atomicReference = this.f25546c;
        Object andSet = atomicReference.getAndSet(null);
        obj = C3990w.f25575a;
        if (Intrinsics.d(andSet, obj)) {
            return;
        }
        if (andSet instanceof Set) {
            u(false, (Set) andSet);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                u(false, set);
            }
            return;
        }
        if (andSet == null) {
            r.k("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        }
        r.k("corrupt pendingModifications drain: " + atomicReference);
        throw null;
    }

    private final Y C(J0 j02, C3945c c3945c, Object obj) {
        int i11;
        synchronized (this.f25547d) {
            try {
                C3988v c3988v = this.f25559p;
                C3988v c3988v2 = null;
                if (c3988v != null) {
                    if (!this.f25549f.w(this.f25560q, c3945c)) {
                        c3988v = null;
                    }
                    c3988v2 = c3988v;
                }
                if (c3988v2 == null) {
                    C3969l c3969l = this.f25562s;
                    if (c3969l.B0() && c3969l.Y0(j02, obj)) {
                        return Y.IMMINENT;
                    }
                    this.f25561r.getClass();
                    this.f25544a.getClass();
                    if (obj == null) {
                        this.f25557n.h(j02);
                    } else if (obj instanceof J) {
                        Object b11 = this.f25557n.d().b(j02);
                        if (b11 != null) {
                            if (b11 instanceof androidx.collection.M) {
                                androidx.collection.M m11 = (androidx.collection.M) b11;
                                Object[] objArr = m11.f38663b;
                                long[] jArr = m11.f38662a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i12 = 0;
                                    loop0: while (true) {
                                        long j11 = jArr[i12];
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8;
                                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                                            int i15 = 0;
                                            while (i15 < i14) {
                                                if ((j11 & 255) < 128) {
                                                    i11 = i13;
                                                    if (objArr[(i12 << 3) + i15] == Z0.f25328a) {
                                                        break loop0;
                                                    }
                                                } else {
                                                    i11 = i13;
                                                }
                                                j11 >>= i11;
                                                i15++;
                                                i13 = i11;
                                            }
                                            if (i14 != i13) {
                                                break;
                                            }
                                        }
                                        if (i12 == length) {
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                            } else if (b11 == Z0.f25328a) {
                            }
                        }
                        this.f25557n.a(j02, obj);
                    } else {
                        this.f25557n.h(j02);
                    }
                }
                if (c3988v2 != null) {
                    return c3988v2.C(j02, c3945c, obj);
                }
                this.f25544a.j(this);
                return this.f25562s.B0() ? Y.DEFERRED : Y.SCHEDULED;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void D(Object obj) {
        Object b11 = this.f25550g.d().b(obj);
        if (b11 == null) {
            return;
        }
        boolean z11 = b11 instanceof androidx.collection.M;
        U0.d<Object, J0> dVar = this.f25556m;
        if (!z11) {
            J0 j02 = (J0) b11;
            if (j02.q(obj) == Y.IMMINENT) {
                dVar.a(obj, j02);
                return;
            }
            return;
        }
        androidx.collection.M m11 = (androidx.collection.M) b11;
        Object[] objArr = m11.f38663b;
        long[] jArr = m11.f38662a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        J0 j03 = (J0) objArr[(i11 << 3) + i13];
                        if (j03.q(obj) == Y.IMMINENT) {
                            dVar.a(obj, j03);
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    private final void m(Object obj, boolean z11) {
        int i11;
        Object b11 = this.f25550g.d().b(obj);
        if (b11 == null) {
            return;
        }
        boolean z12 = b11 instanceof androidx.collection.M;
        androidx.collection.M<J0> m11 = this.f25551h;
        androidx.collection.M<J0> m12 = this.f25552i;
        U0.d<Object, J0> dVar = this.f25556m;
        if (!z12) {
            J0 j02 = (J0) b11;
            if (dVar.f(obj, j02) || j02.q(obj) == Y.IGNORED) {
                return;
            }
            if (!j02.r() || z11) {
                m11.d(j02);
                return;
            } else {
                m12.d(j02);
                return;
            }
        }
        androidx.collection.M m13 = (androidx.collection.M) b11;
        Object[] objArr = m13.f38663b;
        long[] jArr = m13.f38662a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j11 = jArr[i12];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((255 & j11) < 128) {
                        J0 j03 = (J0) objArr[(i12 << 3) + i15];
                        if (!dVar.f(obj, j03)) {
                            i11 = i13;
                            if (j03.q(obj) != Y.IGNORED) {
                                if (!j03.r() || z11) {
                                    m11.d(j03);
                                } else {
                                    m12.d(j03);
                                }
                            }
                            j11 >>= i11;
                            i15++;
                            i13 = i11;
                        }
                    }
                    i11 = i13;
                    j11 >>= i11;
                    i15++;
                    i13 = i11;
                }
                if (i14 != i13) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    private final void u(boolean z11, Set set) {
        long j11;
        long j12;
        long j13;
        char c11;
        int i11;
        long[] jArr;
        String str;
        long[] jArr2;
        String str2;
        long j14;
        boolean a11;
        String str3;
        long j15;
        long[] jArr3;
        long[] jArr4;
        int i12;
        long j16;
        boolean z12;
        int i13;
        long j17;
        long[] jArr5;
        Object[] objArr;
        long[] jArr6;
        Object[] objArr2;
        char c12;
        int i14;
        int i15;
        int i16;
        boolean z13 = set instanceof U0.c;
        U0.d<Object, J<?>> dVar = this.f25553j;
        Object obj = null;
        int i17 = 8;
        if (z13) {
            androidx.collection.X b11 = ((U0.c) set).b();
            Object[] objArr3 = b11.f38663b;
            long[] jArr7 = b11.f38662a;
            int length = jArr7.length - 2;
            if (length >= 0) {
                int i18 = 0;
                j11 = 128;
                j12 = 255;
                while (true) {
                    long j18 = jArr7[i18];
                    char c13 = 7;
                    j13 = -9187201950435737472L;
                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i19 = 8 - ((~(i18 - length)) >>> 31);
                        int i21 = 0;
                        while (i21 < i19) {
                            if ((j18 & 255) < 128) {
                                Object obj2 = objArr3[(i18 << 3) + i21];
                                c12 = c13;
                                if (obj2 instanceof J0) {
                                    ((J0) obj2).q(obj);
                                } else {
                                    m(obj2, z11);
                                    Object b12 = dVar.d().b(obj2);
                                    if (b12 != null) {
                                        if (b12 instanceof androidx.collection.M) {
                                            androidx.collection.M m11 = (androidx.collection.M) b12;
                                            Object[] objArr4 = m11.f38663b;
                                            long[] jArr8 = m11.f38662a;
                                            int length2 = jArr8.length - 2;
                                            if (length2 >= 0) {
                                                int i22 = i17;
                                                i14 = length;
                                                int i23 = 0;
                                                while (true) {
                                                    long j19 = jArr8[i23];
                                                    jArr6 = jArr7;
                                                    objArr2 = objArr3;
                                                    if ((((~j19) << c12) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                                        int i25 = 0;
                                                        while (i25 < i24) {
                                                            if ((j19 & 255) < 128) {
                                                                i16 = i25;
                                                                m((J) objArr4[(i23 << 3) + i25], z11);
                                                            } else {
                                                                i16 = i25;
                                                            }
                                                            j19 >>= i22;
                                                            i25 = i16 + 1;
                                                        }
                                                        if (i24 != i22) {
                                                            break;
                                                        }
                                                    }
                                                    if (i23 == length2) {
                                                        break;
                                                    }
                                                    i23++;
                                                    objArr3 = objArr2;
                                                    jArr7 = jArr6;
                                                    i22 = 8;
                                                }
                                            }
                                        } else {
                                            jArr6 = jArr7;
                                            objArr2 = objArr3;
                                            i14 = length;
                                            m((J) b12, z11);
                                        }
                                        i15 = 8;
                                    }
                                }
                                jArr6 = jArr7;
                                objArr2 = objArr3;
                                i14 = length;
                                i15 = 8;
                            } else {
                                jArr6 = jArr7;
                                objArr2 = objArr3;
                                c12 = c13;
                                i14 = length;
                                i15 = i17;
                            }
                            j18 >>= i15;
                            i21++;
                            length = i14;
                            i17 = i15;
                            c13 = c12;
                            objArr3 = objArr2;
                            jArr7 = jArr6;
                            obj = null;
                        }
                        jArr5 = jArr7;
                        objArr = objArr3;
                        c11 = c13;
                        int i26 = length;
                        if (i19 != i17) {
                            break;
                        } else {
                            length = i26;
                        }
                    } else {
                        jArr5 = jArr7;
                        objArr = objArr3;
                        c11 = 7;
                    }
                    if (i18 == length) {
                        break;
                    }
                    i18++;
                    objArr3 = objArr;
                    jArr7 = jArr5;
                    obj = null;
                    i17 = 8;
                }
            } else {
                j11 = 128;
                j12 = 255;
                j13 = -9187201950435737472L;
                c11 = 7;
            }
        } else {
            j11 = 128;
            j12 = 255;
            j13 = -9187201950435737472L;
            c11 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof J0) {
                    ((J0) obj3).q(null);
                } else {
                    m(obj3, z11);
                    Object b13 = dVar.d().b(obj3);
                    if (b13 != null) {
                        if (b13 instanceof androidx.collection.M) {
                            androidx.collection.M m12 = (androidx.collection.M) b13;
                            Object[] objArr5 = m12.f38663b;
                            long[] jArr9 = m12.f38662a;
                            int length3 = jArr9.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j21 = jArr9[i11];
                                    if ((((~j21) << 7) & j21 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i11 - length3)) >>> 31);
                                        for (int i28 = 0; i28 < i27; i28++) {
                                            if ((j21 & 255) < 128) {
                                                m((J) objArr5[(i11 << 3) + i28], z11);
                                            }
                                            j21 >>= 8;
                                        }
                                        if (i27 != 8) {
                                            break;
                                        }
                                    }
                                    i11 = i11 != length3 ? i11 + 1 : 0;
                                }
                            }
                        } else {
                            m((J) b13, z11);
                        }
                    }
                }
            }
        }
        String str4 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        U0.d<Object, J0> dVar2 = this.f25550g;
        androidx.collection.M<J0> m13 = this.f25551h;
        if (z11) {
            androidx.collection.M<J0> m14 = this.f25552i;
            if (m14.c()) {
                androidx.collection.L<Object, Object> d11 = dVar2.d();
                long[] jArr10 = d11.f38656a;
                int length4 = jArr10.length - 2;
                if (length4 >= 0) {
                    int i29 = 0;
                    while (true) {
                        long j22 = jArr10[i29];
                        if ((((~j22) << c11) & j22 & j13) != j13) {
                            int i31 = 8 - ((~(i29 - length4)) >>> 31);
                            int i32 = 0;
                            while (i32 < i31) {
                                if ((j22 & j12) < j11) {
                                    int i33 = (i29 << 3) + i32;
                                    Object obj4 = d11.f38657b[i33];
                                    Object obj5 = d11.f38658c[i33];
                                    if (obj5 instanceof androidx.collection.M) {
                                        Intrinsics.g(obj5, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                        androidx.collection.M m15 = (androidx.collection.M) obj5;
                                        Object[] objArr6 = m15.f38663b;
                                        long[] jArr11 = m15.f38662a;
                                        int length5 = jArr11.length - 2;
                                        if (length5 >= 0) {
                                            j16 = j22;
                                            int i34 = 0;
                                            while (true) {
                                                long j23 = jArr11[i34];
                                                jArr4 = jArr10;
                                                i12 = length4;
                                                if ((((~j23) << c11) & j23 & j13) != j13) {
                                                    int i35 = 8 - ((~(i34 - length5)) >>> 31);
                                                    for (int i36 = 0; i36 < i35; i36 = i13 + 1) {
                                                        if ((j23 & j12) < j11) {
                                                            i13 = i36;
                                                            int i37 = (i34 << 3) + i13;
                                                            j17 = j23;
                                                            J0 j02 = (J0) objArr6[i37];
                                                            if (m14.a(j02) || m13.a(j02)) {
                                                                m15.m(i37);
                                                            }
                                                        } else {
                                                            i13 = i36;
                                                            j17 = j23;
                                                        }
                                                        j23 = j17 >> 8;
                                                    }
                                                    if (i35 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i34 == length5) {
                                                    break;
                                                }
                                                i34++;
                                                length4 = i12;
                                                jArr10 = jArr4;
                                            }
                                        } else {
                                            jArr4 = jArr10;
                                            i12 = length4;
                                            j16 = j22;
                                        }
                                        z12 = m15.b();
                                    } else {
                                        jArr4 = jArr10;
                                        i12 = length4;
                                        j16 = j22;
                                        Intrinsics.g(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                        J0 j03 = (J0) obj5;
                                        z12 = m14.a(j03) || m13.a(j03);
                                    }
                                    if (z12) {
                                        d11.h(i33);
                                    }
                                } else {
                                    jArr4 = jArr10;
                                    i12 = length4;
                                    j16 = j22;
                                }
                                j22 = j16 >> 8;
                                i32++;
                                length4 = i12;
                                jArr10 = jArr4;
                            }
                            jArr3 = jArr10;
                            int i38 = length4;
                            if (i31 != 8) {
                                break;
                            } else {
                                length4 = i38;
                            }
                        } else {
                            jArr3 = jArr10;
                        }
                        if (i29 == length4) {
                            break;
                        }
                        i29++;
                        jArr10 = jArr3;
                    }
                }
                m14.f();
                w();
                return;
            }
        }
        if (m13.c()) {
            androidx.collection.L<Object, Object> d12 = dVar2.d();
            long[] jArr12 = d12.f38656a;
            int length6 = jArr12.length - 2;
            if (length6 >= 0) {
                int i39 = 0;
                while (true) {
                    long j24 = jArr12[i39];
                    if ((((~j24) << c11) & j24 & j13) != j13) {
                        int i41 = 8 - ((~(i39 - length6)) >>> 31);
                        int i42 = 0;
                        while (i42 < i41) {
                            if ((j24 & j12) < j11) {
                                int i43 = (i39 << 3) + i42;
                                Object obj6 = d12.f38657b[i43];
                                Object obj7 = d12.f38658c[i43];
                                if (obj7 instanceof androidx.collection.M) {
                                    Intrinsics.g(obj7, str4);
                                    androidx.collection.M m16 = (androidx.collection.M) obj7;
                                    Object[] objArr7 = m16.f38663b;
                                    long[] jArr13 = m16.f38662a;
                                    int length7 = jArr13.length - 2;
                                    jArr2 = jArr12;
                                    if (length7 >= 0) {
                                        j14 = j24;
                                        int i44 = 0;
                                        Object[] objArr8 = objArr7;
                                        while (true) {
                                            long j25 = jArr13[i44];
                                            Object[] objArr9 = objArr8;
                                            long[] jArr14 = jArr13;
                                            if ((((~j25) << c11) & j25 & j13) != j13) {
                                                int i45 = 8 - ((~(i44 - length7)) >>> 31);
                                                int i46 = 0;
                                                while (i46 < i45) {
                                                    if ((j25 & j12) < j11) {
                                                        str3 = str4;
                                                        int i47 = (i44 << 3) + i46;
                                                        j15 = j25;
                                                        if (m13.a((J0) objArr9[i47])) {
                                                            m16.m(i47);
                                                        }
                                                    } else {
                                                        str3 = str4;
                                                        j15 = j25;
                                                    }
                                                    i46++;
                                                    str4 = str3;
                                                    j25 = j15 >> 8;
                                                }
                                                str2 = str4;
                                                if (i45 != 8) {
                                                    break;
                                                }
                                            } else {
                                                str2 = str4;
                                            }
                                            if (i44 == length7) {
                                                break;
                                            }
                                            i44++;
                                            objArr8 = objArr9;
                                            jArr13 = jArr14;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = str4;
                                        j14 = j24;
                                    }
                                    a11 = m16.b();
                                } else {
                                    jArr2 = jArr12;
                                    str2 = str4;
                                    j14 = j24;
                                    Intrinsics.g(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                    a11 = m13.a((J0) obj7);
                                }
                                if (a11) {
                                    d12.h(i43);
                                }
                            } else {
                                jArr2 = jArr12;
                                str2 = str4;
                                j14 = j24;
                            }
                            i42++;
                            j24 = j14 >> 8;
                            jArr12 = jArr2;
                            str4 = str2;
                        }
                        jArr = jArr12;
                        str = str4;
                        if (i41 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr12;
                        str = str4;
                    }
                    if (i39 == length6) {
                        break;
                    }
                    i39++;
                    jArr12 = jArr;
                    str4 = str;
                }
            }
            w();
            m13.f();
        }
    }

    private final void v(T0.a aVar) {
        T0.a aVar2;
        a aVar3;
        boolean z11;
        long[] jArr;
        int i11;
        T0.a aVar4;
        a aVar5;
        long[] jArr2;
        char c11;
        long j11;
        int i12;
        boolean z12;
        boolean z13 = true;
        D1.L0 l02 = this.f25545b;
        T0.a aVar6 = this.f25555l;
        a aVar7 = new a(this.f25548e);
        try {
            try {
                if (aVar.c()) {
                    if (aVar6.c()) {
                        aVar7.e();
                        return;
                    }
                    return;
                }
                try {
                    l02.getClass();
                    C3953e1 z14 = this.f25549f.z();
                    int i13 = 0;
                    try {
                        aVar.b(l02, z14, aVar7);
                        Unit unit = Unit.f71690a;
                        z14.I(true);
                        l02.i();
                        aVar7.f();
                        aVar7.g();
                        if (this.f25558o) {
                            try {
                                this.f25558o = false;
                                androidx.collection.L<Object, Object> d11 = this.f25550g.d();
                                long[] jArr3 = d11.f38656a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i14 = 0;
                                    while (true) {
                                        long j12 = jArr3[i14];
                                        char c12 = 7;
                                        long j13 = -9187201950435737472L;
                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i15 = 8;
                                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                                            z11 = z13;
                                            int i17 = i13;
                                            while (i17 < i16) {
                                                if ((j12 & 255) < 128) {
                                                    c11 = c12;
                                                    int i18 = (i14 << 3) + i17;
                                                    j11 = j13;
                                                    Object obj = d11.f38657b[i18];
                                                    Object obj2 = d11.f38658c[i18];
                                                    if (obj2 instanceof androidx.collection.M) {
                                                        Intrinsics.g(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                                        androidx.collection.M m11 = (androidx.collection.M) obj2;
                                                        Object[] objArr = m11.f38663b;
                                                        long[] jArr4 = m11.f38662a;
                                                        int i19 = i15;
                                                        int length2 = jArr4.length - 2;
                                                        i11 = i17;
                                                        aVar4 = aVar6;
                                                        aVar5 = aVar7;
                                                        if (length2 >= 0) {
                                                            int i21 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j14 = jArr4[i21];
                                                                    jArr2 = jArr3;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j14) << c11) & j14 & j11) != j11) {
                                                                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                                        for (int i23 = 0; i23 < i22; i23++) {
                                                                            if ((j14 & 255) < 128) {
                                                                                int i24 = (i21 << 3) + i23;
                                                                                if (!((J0) objArr[i24]).p()) {
                                                                                    m11.m(i24);
                                                                                }
                                                                            }
                                                                            j14 >>= i19;
                                                                        }
                                                                        if (i22 != i19) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i21 == length2) {
                                                                        break;
                                                                    }
                                                                    i21++;
                                                                    i19 = 8;
                                                                    jArr3 = jArr2;
                                                                    jArr4 = jArr5;
                                                                } catch (Throwable th2) {
                                                                    throw th2;
                                                                }
                                                            }
                                                        } else {
                                                            jArr2 = jArr3;
                                                        }
                                                        z12 = m11.b();
                                                    } else {
                                                        i11 = i17;
                                                        aVar4 = aVar6;
                                                        aVar5 = aVar7;
                                                        jArr2 = jArr3;
                                                        Intrinsics.g(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                                        z12 = !((J0) obj2).p() ? z11 : false;
                                                    }
                                                    if (z12) {
                                                        d11.h(i18);
                                                    }
                                                    i12 = 8;
                                                } else {
                                                    i11 = i17;
                                                    aVar4 = aVar6;
                                                    aVar5 = aVar7;
                                                    jArr2 = jArr3;
                                                    c11 = c12;
                                                    j11 = j13;
                                                    i12 = i15;
                                                }
                                                j12 >>= i12;
                                                i17 = i11 + 1;
                                                c12 = c11;
                                                i15 = i12;
                                                j13 = j11;
                                                aVar7 = aVar5;
                                                aVar6 = aVar4;
                                                jArr3 = jArr2;
                                            }
                                            aVar2 = aVar6;
                                            aVar3 = aVar7;
                                            jArr = jArr3;
                                            if (i16 != i15) {
                                                break;
                                            }
                                        } else {
                                            z11 = z13;
                                            aVar2 = aVar6;
                                            aVar3 = aVar7;
                                            jArr = jArr3;
                                        }
                                        if (i14 == length) {
                                            break;
                                        }
                                        i14++;
                                        z13 = z11;
                                        aVar7 = aVar3;
                                        aVar6 = aVar2;
                                        jArr3 = jArr;
                                        i13 = 0;
                                    }
                                } else {
                                    aVar2 = aVar6;
                                    aVar3 = aVar7;
                                }
                                w();
                                Unit unit2 = Unit.f71690a;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        } else {
                            aVar2 = aVar6;
                            aVar3 = aVar7;
                        }
                        if (aVar2.c()) {
                            aVar3.e();
                        }
                    } catch (Throwable th4) {
                        try {
                            z14.I(false);
                            throw th4;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                }
            } catch (Throwable th7) {
                th = th7;
                if (aVar6.c()) {
                    aVar7.e();
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    private final void w() {
        char c11;
        long j11;
        long j12;
        long j13;
        long[] jArr;
        long[] jArr2;
        int i11;
        long j14;
        char c12;
        long j15;
        long j16;
        int i12;
        boolean z11;
        int i13;
        long j17;
        androidx.collection.L<Object, Object> d11 = this.f25553j.d();
        long[] jArr3 = d11.f38656a;
        int length = jArr3.length - 2;
        char c13 = 7;
        long j18 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            long j19 = 128;
            while (true) {
                long j21 = jArr3[i15];
                j12 = 255;
                if ((((~j21) << c13) & j21 & j18) != j18) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j21 & 255) < j19) {
                            c12 = c13;
                            int i18 = (i15 << 3) + i17;
                            j15 = j18;
                            Object obj = d11.f38657b[i18];
                            Object obj2 = d11.f38658c[i18];
                            boolean z12 = obj2 instanceof androidx.collection.M;
                            U0.d<Object, J0> dVar = this.f25550g;
                            if (z12) {
                                Intrinsics.g(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                androidx.collection.M m11 = (androidx.collection.M) obj2;
                                Object[] objArr = m11.f38663b;
                                long[] jArr4 = m11.f38662a;
                                j16 = j19;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j14 = j21;
                                    int i19 = i14;
                                    int i21 = 0;
                                    while (true) {
                                        long j22 = jArr4[i21];
                                        jArr2 = jArr3;
                                        i11 = length;
                                        if ((((~j22) << c12) & j22 & j15) != j15) {
                                            int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j22 & 255) < j16) {
                                                    i13 = i23;
                                                    int i24 = (i21 << 3) + i13;
                                                    j17 = j22;
                                                    if (!dVar.c((J) objArr[i24])) {
                                                        m11.m(i24);
                                                    }
                                                } else {
                                                    i13 = i23;
                                                    j17 = j22;
                                                }
                                                j22 = j17 >> i19;
                                                i23 = i13 + 1;
                                            }
                                            if (i22 != i19) {
                                                break;
                                            }
                                        }
                                        if (i21 == length2) {
                                            break;
                                        }
                                        i21++;
                                        jArr3 = jArr2;
                                        length = i11;
                                        i19 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i11 = length;
                                    j14 = j21;
                                }
                                z11 = m11.b();
                            } else {
                                jArr2 = jArr3;
                                i11 = length;
                                j14 = j21;
                                j16 = j19;
                                Intrinsics.g(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                z11 = !dVar.c((J) obj2);
                            }
                            if (z11) {
                                d11.h(i18);
                            }
                            i12 = 8;
                        } else {
                            jArr2 = jArr3;
                            i11 = length;
                            j14 = j21;
                            c12 = c13;
                            j15 = j18;
                            j16 = j19;
                            i12 = i14;
                        }
                        j21 = j14 >> i12;
                        i17++;
                        i14 = i12;
                        c13 = c12;
                        j18 = j15;
                        j19 = j16;
                        jArr3 = jArr2;
                        length = i11;
                    }
                    jArr = jArr3;
                    int i25 = length;
                    c11 = c13;
                    j11 = j18;
                    j13 = j19;
                    if (i16 != i14) {
                        break;
                    } else {
                        length = i25;
                    }
                } else {
                    jArr = jArr3;
                    c11 = c13;
                    j11 = j18;
                    j13 = j19;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                c13 = c11;
                j18 = j11;
                j19 = j13;
                jArr3 = jArr;
                i14 = 8;
            }
        } else {
            c11 = 7;
            j11 = -9187201950435737472L;
            j12 = 255;
            j13 = 128;
        }
        androidx.collection.M<J0> m12 = this.f25552i;
        if (!m12.c()) {
            return;
        }
        Object[] objArr2 = m12.f38663b;
        long[] jArr5 = m12.f38662a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i26 = 0;
        while (true) {
            long j23 = jArr5[i26];
            if ((((~j23) << c11) & j23 & j11) != j11) {
                int i27 = 8 - ((~(i26 - length3)) >>> 31);
                for (int i28 = 0; i28 < i27; i28++) {
                    if ((j23 & j12) < j13) {
                        int i29 = (i26 << 3) + i28;
                        if (!((J0) objArr2[i29]).r()) {
                            m12.m(i29);
                        }
                    }
                    j23 >>= 8;
                }
                if (i27 != 8) {
                    return;
                }
            }
            if (i26 == length3) {
                return;
            } else {
                i26++;
            }
        }
    }

    private final void z() {
        Object obj;
        Object obj2;
        AtomicReference<Object> atomicReference = this.f25546c;
        obj = C3990w.f25575a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            obj2 = C3990w.f25575a;
            if (andSet.equals(obj2)) {
                r.k("pending composition has not been applied");
                throw null;
            }
            if (andSet instanceof Set) {
                u(true, (Set) andSet);
                return;
            }
            if (!(andSet instanceof Object[])) {
                r.k("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
            for (Set set : (Set[]) andSet) {
                u(true, set);
            }
        }
    }

    @NotNull
    public final C B() {
        return this.f25561r;
    }

    public final void E(@NotNull J<?> j11) {
        if (this.f25550g.c(j11)) {
            return;
        }
        this.f25553j.g(j11);
    }

    public final void F(@NotNull J0 j02, @NotNull Object obj) {
        this.f25550g.f(obj, j02);
    }

    @Override // S0.G, S0.K0
    public final void a(@NotNull Object obj) {
        J0 v02;
        boolean z11;
        boolean z12;
        int i11;
        C3969l c3969l = this.f25562s;
        if (c3969l.s0() || (v02 = c3969l.v0()) == null) {
            return;
        }
        v02.E();
        if (v02.u(obj)) {
            return;
        }
        boolean z13 = true;
        if (obj instanceof AbstractC5705I) {
            ((AbstractC5705I) obj).x(1);
        }
        this.f25550g.a(obj, v02);
        if (obj instanceof J) {
            J<?> j11 = (J) obj;
            I.a u11 = j11.u();
            U0.d<Object, J<?>> dVar = this.f25553j;
            dVar.g(obj);
            androidx.collection.O<InterfaceC5704H> i12 = u11.i();
            Object[] objArr = i12.f38640b;
            long[] jArr = i12.f38639a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j12 = jArr[i13];
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j12 & 255) < 128) {
                                i11 = i14;
                                InterfaceC5704H interfaceC5704H = (InterfaceC5704H) objArr[(i13 << 3) + i16];
                                if (interfaceC5704H instanceof AbstractC5705I) {
                                    z12 = true;
                                    ((AbstractC5705I) interfaceC5704H).x(1);
                                } else {
                                    z12 = true;
                                }
                                dVar.a(interfaceC5704H, obj);
                            } else {
                                z12 = z13;
                                i11 = i14;
                            }
                            j12 >>= i11;
                            i16++;
                            z13 = z12;
                            i14 = i11;
                        }
                        z11 = z13;
                        if (i15 != i14) {
                            break;
                        }
                    } else {
                        z11 = z13;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    z13 = z11;
                }
            }
            v02.t(j11, u11.h());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // S0.G
    public final void b(@NotNull U0.c cVar) {
        Object obj;
        boolean equals;
        U0.c cVar2;
        while (true) {
            Object obj2 = this.f25546c.get();
            if (obj2 == null) {
                equals = true;
            } else {
                obj = C3990w.f25575a;
                equals = obj2.equals(obj);
            }
            if (equals) {
                cVar2 = cVar;
            } else if (obj2 instanceof Set) {
                cVar2 = new Set[]{obj2, cVar};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f25546c).toString());
                }
                Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                cVar2 = C7705l.U((Set[]) obj2, cVar);
            }
            AtomicReference<Object> atomicReference = this.f25546c;
            while (!atomicReference.compareAndSet(obj2, cVar2)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.f25547d) {
                    A();
                    Unit unit = Unit.f71690a;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        return true;
     */
    @Override // S0.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(@NotNull Set<? extends Object> set) {
        boolean z11 = set instanceof U0.c;
        U0.d<Object, J<?>> dVar = this.f25553j;
        U0.d<Object, J0> dVar2 = this.f25550g;
        if (z11) {
            androidx.collection.X b11 = ((U0.c) set).b();
            Object[] objArr = b11.f38663b;
            long[] jArr = b11.f38662a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                loop0: while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                Object obj = objArr[(i11 << 3) + i13];
                                if (dVar2.c(obj) || dVar.c(obj)) {
                                    break loop0;
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (dVar2.c(obj2) || dVar.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // S0.G
    public final void d(@NotNull ArrayList arrayList) {
        boolean z11 = true;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            if (!((C3968k0) ((Pair) arrayList.get(i11)).e()).b().equals(this)) {
                z11 = false;
                break;
            }
            i11++;
        }
        r.u(z11);
        try {
            this.f25562s.A0(arrayList);
            Unit unit = Unit.f71690a;
        } finally {
        }
    }

    @Override // S0.X0
    public final void deactivate() {
        synchronized (this.f25547d) {
            boolean z11 = this.f25549f.q() > 0;
            if (z11 || !((X.a) this.f25548e).isEmpty()) {
                try {
                    a aVar = new a(this.f25548e);
                    if (z11) {
                        this.f25545b.getClass();
                        C3953e1 z12 = this.f25549f.z();
                        try {
                            r.l(z12, aVar);
                            Unit unit = Unit.f71690a;
                            z12.I(true);
                            this.f25545b.i();
                            aVar.f();
                        } catch (Throwable th2) {
                            z12.I(false);
                            throw th2;
                        }
                    }
                    aVar.e();
                    Unit unit2 = Unit.f71690a;
                } finally {
                }
            }
            this.f25550g.b();
            this.f25553j.b();
            this.f25557n.b();
            this.f25554k.a();
            this.f25555l.a();
            this.f25562s.c0();
            Unit unit3 = Unit.f71690a;
        }
    }

    @Override // S0.InterfaceC3982s
    public final void dispose() {
        synchronized (this.f25547d) {
            try {
                if (this.f25562s.B0()) {
                    B0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                    throw null;
                }
                if (!this.f25563t) {
                    this.f25563t = true;
                    C4912a c4912a = C3960h.f25416b;
                    T0.a x02 = this.f25562s.x0();
                    if (x02 != null) {
                        v(x02);
                    }
                    boolean z11 = this.f25549f.q() > 0;
                    if (z11 || !((X.a) this.f25548e).isEmpty()) {
                        a aVar = new a(this.f25548e);
                        if (z11) {
                            this.f25545b.getClass();
                            C3953e1 z12 = this.f25549f.z();
                            try {
                                r.t(z12, aVar);
                                Unit unit = Unit.f71690a;
                                z12.I(true);
                                this.f25545b.h();
                                this.f25545b.i();
                                aVar.f();
                            } catch (Throwable th2) {
                                z12.I(false);
                                throw th2;
                            }
                        }
                        aVar.e();
                    }
                    this.f25562s.e0();
                }
                Unit unit2 = Unit.f71690a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f25544a.r(this);
    }

    @Override // S0.G
    public final void e() {
        synchronized (this.f25547d) {
            try {
                this.f25562s.W();
                if (!((X.a) this.f25548e).isEmpty()) {
                    new a(this.f25548e).e();
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!((X.a) this.f25548e).isEmpty()) {
                            new a(this.f25548e).e();
                        }
                        throw th2;
                    } catch (Exception e11) {
                        s();
                        throw e11;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // S0.K0
    @NotNull
    public final Y f(@NotNull J0 j02, Object obj) {
        C3988v c3988v;
        if (j02.j()) {
            j02.A(true);
        }
        C3945c h11 = j02.h();
        if (h11 == null || !h11.b()) {
            return Y.IGNORED;
        }
        if (this.f25549f.A(h11)) {
            return !j02.i() ? Y.IGNORED : C(j02, h11, obj);
        }
        synchronized (this.f25547d) {
            c3988v = this.f25559p;
        }
        if (c3988v != null) {
            C3969l c3969l = c3988v.f25562s;
            if (c3969l.B0() && c3969l.Y0(j02, obj)) {
                return Y.IMMINENT;
            }
        }
        return Y.IGNORED;
    }

    @Override // S0.K0
    public final void g() {
        this.f25558o = true;
    }

    @Override // S0.G
    public final <R> R h(G g10, int i11, @NotNull Function0<? extends R> function0) {
        if (g10 == null || g10.equals(this) || i11 < 0) {
            return function0.invoke();
        }
        this.f25559p = (C3988v) g10;
        this.f25560q = i11;
        try {
            return function0.invoke();
        } finally {
            this.f25559p = null;
            this.f25560q = 0;
        }
    }

    @Override // S0.G
    public final void i() {
        synchronized (this.f25547d) {
            try {
                if (this.f25555l.d()) {
                    v(this.f25555l);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f25548e.isEmpty()) {
                            new a(this.f25548e).e();
                        }
                        throw th2;
                    } catch (Exception e11) {
                        s();
                        throw e11;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // S0.InterfaceC3982s
    public final boolean isDisposed() {
        return this.f25563t;
    }

    @Override // S0.G
    public final boolean j() {
        boolean G02;
        synchronized (this.f25547d) {
            try {
                z();
                try {
                    U0.d<J0, Object> dVar = this.f25557n;
                    this.f25557n = new U0.d<>();
                    try {
                        this.f25561r.getClass();
                        this.f25544a.getClass();
                        G02 = this.f25562s.G0(dVar);
                        if (!G02) {
                            A();
                        }
                    } catch (Exception e11) {
                        this.f25557n = dVar;
                        throw e11;
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return G02;
    }

    @Override // S0.InterfaceC3982s
    public final void k(@NotNull C4912a c4912a) {
        if (this.f25563t) {
            B0.b("The composition is disposed");
            throw null;
        }
        this.f25544a.a(this, c4912a);
    }

    @Override // S0.X0
    public final void l(@NotNull C4912a c4912a) {
        C3969l c3969l = this.f25562s;
        c3969l.W0();
        if (this.f25563t) {
            B0.b("The composition is disposed");
            throw null;
        }
        this.f25544a.a(this, c4912a);
        c3969l.n0();
    }

    @Override // S0.G
    public final void n(@NotNull Function0<Unit> function0) {
        this.f25562s.E0(function0);
    }

    @Override // S0.G
    public final void o() {
        synchronized (this.f25547d) {
            try {
                v(this.f25554k);
                A();
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f25548e.isEmpty()) {
                            new a(this.f25548e).e();
                        }
                        throw th2;
                    } catch (Exception e11) {
                        s();
                        throw e11;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // S0.G
    public final boolean p() {
        return this.f25562s.B0();
    }

    @Override // S0.G
    public final void q(@NotNull Object obj) {
        synchronized (this.f25547d) {
            try {
                D(obj);
                Object b11 = this.f25553j.d().b(obj);
                if (b11 != null) {
                    if (b11 instanceof androidx.collection.M) {
                        androidx.collection.M m11 = (androidx.collection.M) b11;
                        Object[] objArr = m11.f38663b;
                        long[] jArr = m11.f38662a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i11 = 0;
                            while (true) {
                                long j11 = jArr[i11];
                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        if ((255 & j11) < 128) {
                                            D((J) objArr[(i11 << 3) + i13]);
                                        }
                                        j11 >>= 8;
                                    }
                                    if (i12 != 8) {
                                        break;
                                    }
                                }
                                if (i11 == length) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        D((J) b11);
                    }
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // S0.InterfaceC3982s
    public final boolean r() {
        boolean z11;
        synchronized (this.f25547d) {
            z11 = this.f25557n.e() > 0;
        }
        return z11;
    }

    @Override // S0.G
    public final void s() {
        this.f25546c.set(null);
        this.f25554k.a();
        this.f25555l.a();
        Set<V0> set = this.f25548e;
        if (set.isEmpty()) {
            return;
        }
        new a(set).e();
    }

    @Override // S0.G
    public final void t() {
        synchronized (this.f25547d) {
            try {
                for (Object obj : this.f25549f.r()) {
                    J0 j02 = obj instanceof J0 ? (J0) obj : null;
                    if (j02 != null) {
                        j02.invalidate();
                    }
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void x(@NotNull C4912a c4912a) {
        try {
            synchronized (this.f25547d) {
                z();
                U0.d<J0, Object> dVar = this.f25557n;
                this.f25557n = new U0.d<>();
                try {
                    this.f25561r.getClass();
                    this.f25544a.getClass();
                    this.f25562s.Y(dVar, c4912a);
                } catch (Exception e11) {
                    this.f25557n = dVar;
                    throw e11;
                }
            }
        } finally {
        }
    }

    public final void y(@NotNull C3966j0 c3966j0) {
        a aVar = new a(this.f25548e);
        C3953e1 z11 = c3966j0.a().z();
        try {
            r.t(z11, aVar);
            Unit unit = Unit.f71690a;
            z11.I(true);
            aVar.f();
        } catch (Throwable th2) {
            z11.I(false);
            throw th2;
        }
    }
}
