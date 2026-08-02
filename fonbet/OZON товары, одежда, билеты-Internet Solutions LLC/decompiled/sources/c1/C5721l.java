package c1;

import S0.C3954f;
import S0.H1;
import S0.v1;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: c1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5721l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<C5718i, Unit> f56250a = a.f56263b;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final v1<AbstractC5715f> f56251b = new v1<>();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f56252c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static C5718i f56253d;

    /* renamed from: e, reason: collision with root package name */
    private static int f56254e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final C5717h f56255f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final C5697A<InterfaceC5704H> f56256g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static Object f56257h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static Object f56258i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final AtomicReference<C5710a> f56259j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final AbstractC5715f f56260k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static C3954f f56261l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f56262m = 0;

    /* renamed from: c1.l$a */
    static final class a extends AbstractC7737t implements Function1<C5718i, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f56263b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(C5718i c5718i) {
            return Unit.f71690a;
        }
    }

    static {
        C5718i c5718i;
        C5718i c5718i2;
        c5718i = C5718i.f56238e;
        f56253d = c5718i;
        f56254e = 2;
        f56255f = new C5717h();
        f56256g = new C5697A<>();
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        f56257h = k11;
        f56258i = k11;
        int i11 = f56254e;
        f56254e = i11 + 1;
        c5718i2 = C5718i.f56238e;
        C5710a c5710a = new C5710a(i11, c5718i2);
        f56253d = f56253d.q(c5710a.f());
        AtomicReference<C5710a> atomicReference = new AtomicReference<>(c5710a);
        f56259j = atomicReference;
        f56260k = atomicReference.get();
        f56261l = new C3954f(0);
    }

    @NotNull
    public static final <T extends AbstractC5706J> T A(@NotNull T t2) {
        T t11;
        AbstractC5715f C11 = C();
        T t12 = (T) L(t2, C11.f(), C11.g());
        if (t12 != null) {
            return t12;
        }
        synchronized (f56252c) {
            AbstractC5715f C12 = C();
            t11 = (T) L(t2, C12.f(), C12.g());
        }
        if (t11 != null) {
            return t11;
        }
        K();
        throw null;
    }

    @NotNull
    public static final <T extends AbstractC5706J> T B(@NotNull T t2, @NotNull AbstractC5715f abstractC5715f) {
        T t11 = (T) L(t2, abstractC5715f.f(), abstractC5715f.g());
        if (t11 != null) {
            return t11;
        }
        K();
        throw null;
    }

    @NotNull
    public static final AbstractC5715f C() {
        AbstractC5715f a11 = f56251b.a();
        return a11 == null ? f56259j.get() : a11;
    }

    @NotNull
    public static final Object D() {
        return f56252c;
    }

    static Function1 E(Function1 function1, Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new C5722m(function1, function12);
    }

    @NotNull
    public static final <T extends AbstractC5706J> T F(@NotNull T t2, @NotNull InterfaceC5704H interfaceC5704H) {
        C5718i c5718i;
        AbstractC5706J k11 = interfaceC5704H.k();
        int b11 = f56255f.b(f56254e) - 1;
        c5718i = C5718i.f56238e;
        T t11 = null;
        AbstractC5706J abstractC5706J = null;
        while (true) {
            if (k11 != null) {
                if (k11.d() == 0) {
                    break;
                }
                int d11 = k11.d();
                if (d11 != 0 && d11 <= b11 && !c5718i.m(d11)) {
                    if (abstractC5706J == null) {
                        abstractC5706J = k11;
                    } else if (k11.d() >= abstractC5706J.d()) {
                        t11 = (T) abstractC5706J;
                    }
                }
                k11 = k11.c();
            } else {
                break;
            }
        }
        t11 = (T) k11;
        if (t11 != null) {
            t11.f(Integer.MAX_VALUE);
            return t11;
        }
        T t12 = (T) t2.b();
        t12.f(Integer.MAX_VALUE);
        t12.e(interfaceC5704H.k());
        interfaceC5704H.b(t12);
        return t12;
    }

    @NotNull
    public static final <T extends AbstractC5706J> T G(@NotNull T t2, @NotNull InterfaceC5704H interfaceC5704H, @NotNull AbstractC5715f abstractC5715f) {
        T t11;
        synchronized (f56252c) {
            t11 = (T) F(t2, interfaceC5704H);
            t11.a(t2);
            t11.f(abstractC5715f.f());
        }
        return t11;
    }

    public static final void H(@NotNull AbstractC5715f abstractC5715f, @NotNull InterfaceC5704H interfaceC5704H) {
        abstractC5715f.w(abstractC5715f.j() + 1);
        Function1<Object, Unit> k11 = abstractC5715f.k();
        if (k11 != null) {
            k11.invoke(interfaceC5704H);
        }
    }

    @NotNull
    public static final AbstractC5706J I(@NotNull AbstractC5706J abstractC5706J, @NotNull AbstractC5705I abstractC5705I, @NotNull AbstractC5715f abstractC5715f, @NotNull AbstractC5706J abstractC5706J2) {
        AbstractC5706J F11;
        if (abstractC5715f.i()) {
            abstractC5715f.p(abstractC5705I);
        }
        int f7 = abstractC5715f.f();
        if (abstractC5706J2.d() == f7) {
            return abstractC5706J2;
        }
        synchronized (f56252c) {
            F11 = F(abstractC5706J, abstractC5705I);
        }
        F11.f(f7);
        if (abstractC5706J2.d() != 1) {
            abstractC5715f.p(abstractC5705I);
        }
        return F11;
    }

    private static final boolean J(InterfaceC5704H interfaceC5704H) {
        AbstractC5706J abstractC5706J;
        int b11 = f56255f.b(f56254e);
        AbstractC5706J abstractC5706J2 = null;
        AbstractC5706J abstractC5706J3 = null;
        int i11 = 0;
        for (AbstractC5706J k11 = interfaceC5704H.k(); k11 != null; k11 = k11.c()) {
            int d11 = k11.d();
            if (d11 != 0) {
                if (d11 >= b11) {
                    i11++;
                } else if (abstractC5706J2 == null) {
                    i11++;
                    abstractC5706J2 = k11;
                } else {
                    if (k11.d() < abstractC5706J2.d()) {
                        abstractC5706J = abstractC5706J2;
                        abstractC5706J2 = k11;
                    } else {
                        abstractC5706J = k11;
                    }
                    if (abstractC5706J3 == null) {
                        abstractC5706J3 = interfaceC5704H.k();
                        AbstractC5706J abstractC5706J4 = abstractC5706J3;
                        while (true) {
                            if (abstractC5706J3 == null) {
                                abstractC5706J3 = abstractC5706J4;
                                break;
                            }
                            if (abstractC5706J3.d() >= b11) {
                                break;
                            }
                            if (abstractC5706J4.d() < abstractC5706J3.d()) {
                                abstractC5706J4 = abstractC5706J3;
                            }
                            abstractC5706J3 = abstractC5706J3.c();
                        }
                    }
                    abstractC5706J2.f(0);
                    abstractC5706J2.a(abstractC5706J3);
                    abstractC5706J2 = abstractC5706J;
                }
            }
        }
        return i11 > 1;
    }

    private static final void K() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends AbstractC5706J> T L(T t2, int i11, C5718i c5718i) {
        T t11 = null;
        while (t2 != null) {
            int d11 = t2.d();
            if (d11 != 0 && d11 <= i11 && !c5718i.m(d11) && (t11 == null || t11.d() < t2.d())) {
                t11 = t2;
            }
            t2 = (T) t2.c();
        }
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    @NotNull
    public static final <T extends AbstractC5706J> T M(@NotNull T t2, @NotNull InterfaceC5704H interfaceC5704H) {
        T t11;
        AbstractC5715f C11 = C();
        Function1<Object, Unit> h11 = C11.h();
        if (h11 != null) {
            h11.invoke(interfaceC5704H);
        }
        T t12 = (T) L(t2, C11.f(), C11.g());
        if (t12 != null) {
            return t12;
        }
        synchronized (f56252c) {
            AbstractC5715f C12 = C();
            AbstractC5706J k11 = interfaceC5704H.k();
            Intrinsics.g(k11, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            t11 = (T) L(k11, C12.f(), C12.g());
            if (t11 == null) {
                K();
                throw null;
            }
        }
        return t11;
    }

    public static final void N(int i11) {
        f56255f.c(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T O(AbstractC5715f abstractC5715f, Function1<? super C5718i, ? extends T> function1) {
        T invoke = function1.invoke(f56253d.l(abstractC5715f.f()));
        synchronized (f56252c) {
            int i11 = f56254e;
            f56254e = i11 + 1;
            C5718i l11 = f56253d.l(abstractC5715f.f());
            f56253d = l11;
            f56259j.set(new C5710a(i11, l11));
            abstractC5715f.d();
            f56253d = f56253d.q(i11);
            Unit unit = Unit.f71690a;
        }
        return invoke;
    }

    public static final int P(int i11, @NotNull C5718i c5718i) {
        int a11;
        int n11 = c5718i.n(i11);
        synchronized (f56252c) {
            a11 = f56255f.a(n11);
        }
        return a11;
    }

    @NotNull
    public static final <T extends AbstractC5706J> T Q(@NotNull T t2, @NotNull InterfaceC5704H interfaceC5704H, @NotNull AbstractC5715f abstractC5715f) {
        T t11;
        if (abstractC5715f.i()) {
            abstractC5715f.p(interfaceC5704H);
        }
        int f7 = abstractC5715f.f();
        T t12 = (T) L(t2, f7, abstractC5715f.g());
        if (t12 == null) {
            K();
            throw null;
        }
        if (t12.d() == abstractC5715f.f()) {
            return t12;
        }
        synchronized (f56252c) {
            t11 = (T) L(interfaceC5704H.k(), f7, abstractC5715f.g());
            if (t11 == null) {
                K();
                throw null;
            }
            if (t11.d() != f7) {
                AbstractC5706J F11 = F(t11, interfaceC5704H);
                F11.a(t11);
                F11.f(abstractC5715f.f());
                t11 = (T) F11;
            }
        }
        if (t12.d() != 1) {
            abstractC5715f.p(interfaceC5704H);
        }
        return t11;
    }

    public static final void b() {
        y(C5720k.f56249b);
    }

    public static final AbstractC5715f d(AbstractC5715f abstractC5715f, Function1 function1) {
        boolean z11 = abstractC5715f instanceof C5711b;
        if (z11 || abstractC5715f == null) {
            return new C5708L(z11 ? (C5711b) abstractC5715f : null, function1, null, false, true);
        }
        return new C5709M(abstractC5715f, function1, true);
    }

    public static final Function1 k(Function1 function1, Function1 function12, boolean z11) {
        if (!z11) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new C5722m(function1, function12);
    }

    public static final Function1 l(Function1 function1, Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new C5723n(function1, function12);
    }

    public static final HashMap m(C5711b c5711b, C5711b c5711b2, C5718i c5718i) {
        long[] jArr;
        int i11;
        long[] jArr2;
        int i12;
        int i13;
        androidx.collection.M<InterfaceC5704H> D11 = c5711b2.D();
        int f7 = c5711b.f();
        if (D11 != null) {
            C5718i o11 = c5711b2.g().q(c5711b2.f()).o(c5711b2.E());
            Object[] objArr = D11.f38663b;
            long[] jArr3 = D11.f38662a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i14 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j11 = jArr3[i14];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8;
                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((255 & j11) < 128) {
                                InterfaceC5704H interfaceC5704H = (InterfaceC5704H) objArr[(i14 << 3) + i17];
                                AbstractC5706J k11 = interfaceC5704H.k();
                                AbstractC5706J L11 = L(k11, f7, c5718i);
                                if (L11 == null) {
                                    i13 = i15;
                                } else {
                                    i13 = i15;
                                    AbstractC5706J L12 = L(k11, f7, o11);
                                    if (L12 != null && !L11.equals(L12)) {
                                        jArr2 = jArr3;
                                        i12 = f7;
                                        AbstractC5706J L13 = L(k11, c5711b2.f(), c5711b2.g());
                                        if (L13 == null) {
                                            K();
                                            throw null;
                                        }
                                        AbstractC5706J o12 = interfaceC5704H.o(L12, L11, L13);
                                        if (o12 == null) {
                                            return null;
                                        }
                                        if (hashMap == null) {
                                            hashMap = new HashMap();
                                        }
                                        hashMap.put(L11, o12);
                                        hashMap = hashMap;
                                    }
                                }
                                jArr2 = jArr3;
                                i12 = f7;
                            } else {
                                jArr2 = jArr3;
                                i12 = f7;
                                i13 = i15;
                            }
                            j11 >>= i13;
                            i17++;
                            i15 = i13;
                            jArr3 = jArr2;
                            f7 = i12;
                        }
                        jArr = jArr3;
                        i11 = f7;
                        if (i16 != i15) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        i11 = f7;
                    }
                    if (i14 == length) {
                        return hashMap;
                    }
                    i14++;
                    jArr3 = jArr;
                    f7 = i11;
                }
            }
        }
        return null;
    }

    public static final void n(InterfaceC5704H interfaceC5704H) {
        if (J(interfaceC5704H)) {
            f56256g.a(interfaceC5704H);
        }
    }

    public static final /* synthetic */ void o() {
        K();
        throw null;
    }

    public static final AbstractC5715f v(Function1 function1) {
        return (AbstractC5715f) y(new o(function1));
    }

    public static final void w(AbstractC5715f abstractC5715f) {
        int b11;
        if (f56253d.m(abstractC5715f.f())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: id=");
        sb2.append(abstractC5715f.f());
        sb2.append(", disposed=");
        sb2.append(abstractC5715f.e());
        sb2.append(", applied=");
        C5711b c5711b = abstractC5715f instanceof C5711b ? (C5711b) abstractC5715f : null;
        sb2.append(c5711b != null ? Boolean.valueOf(c5711b.C()) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (f56252c) {
            b11 = f56255f.b(-1);
        }
        sb2.append(b11);
        throw new IllegalStateException(sb2.toString().toString());
    }

    @NotNull
    public static final C5718i x(@NotNull C5718i c5718i, int i11, int i12) {
        while (i11 < i12) {
            c5718i = c5718i.q(i11);
            i11++;
        }
        return c5718i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    public static final <T> T y(Function1<? super C5718i, ? extends T> function1) {
        C5710a c5710a;
        androidx.collection.M<InterfaceC5704H> D11;
        T t2;
        AbstractC5715f abstractC5715f = f56260k;
        Intrinsics.g(abstractC5715f, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (f56252c) {
            try {
                c5710a = f56259j.get();
                D11 = c5710a.D();
                if (D11 != null) {
                    f56261l.addAndGet(1);
                }
                t2 = (T) O(c5710a, function1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (D11 != null) {
            try {
                ?? r62 = f56257h;
                int size = r62.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((Function2) r62.get(i11)).invoke(new U0.c(D11), c5710a);
                }
            } finally {
                f56261l.addAndGet(-1);
            }
        }
        synchronized (f56252c) {
            try {
                z();
                if (D11 != null) {
                    Object[] objArr = D11.f38663b;
                    long[] jArr = D11.f38662a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j11 = jArr[i12];
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i13 = 8 - ((~(i12 - length)) >>> 31);
                                for (int i14 = 0; i14 < i13; i14++) {
                                    if ((255 & j11) < 128) {
                                        InterfaceC5704H interfaceC5704H = (InterfaceC5704H) objArr[(i12 << 3) + i14];
                                        if (J(interfaceC5704H)) {
                                            f56256g.a(interfaceC5704H);
                                        }
                                    }
                                    j11 >>= 8;
                                }
                                if (i13 != 8) {
                                    break;
                                }
                            }
                            if (i12 == length) {
                                break;
                            }
                            i12++;
                        }
                    }
                    Unit unit = Unit.f71690a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z() {
        C5697A<InterfaceC5704H> c5697a = f56256g;
        int c11 = c5697a.c();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= c11) {
                break;
            }
            H1<InterfaceC5704H> h12 = c5697a.d()[i11];
            InterfaceC5704H interfaceC5704H = h12 != null ? h12.get() : null;
            if (interfaceC5704H != null && J(interfaceC5704H)) {
                if (i12 != i11) {
                    c5697a.d()[i12] = h12;
                    c5697a.b()[i12] = c5697a.b()[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < c11; i13++) {
            c5697a.d()[i13] = null;
            c5697a.b()[i13] = 0;
        }
        if (i12 != c11) {
            c5697a.e(i12);
        }
    }
}
