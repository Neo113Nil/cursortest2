package androidx.compose.foundation.lazy.layout;

import D1.AbstractC2794c0;
import D1.C2820u;
import D1.InterfaceC2819t;
import D1.J;
import androidx.collection.L;
import androidx.collection.M;
import androidx.collection.W;
import androidx.collection.Y;
import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.foundation.lazy.layout.h;
import androidx.compose.ui.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7823h0;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;
import x0.C10605j;
import x0.C10612q;
import x0.C10613r;
import x0.C10614s;
import x0.C10615t;
import x0.C10616u;
import x0.InterfaceC10575D;
import x0.InterfaceC10576E;

/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends InterfaceC10575D> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L<Object, LazyLayoutItemAnimator<T>.b> f39578a;

    /* renamed from: b, reason: collision with root package name */
    private h f39579b;

    /* renamed from: c, reason: collision with root package name */
    private int f39580c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M<Object> f39581d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList f39582e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList f39583f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayList f39584g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ArrayList f39585h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ArrayList f39586i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC2819t f39587j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e f39588k;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "LD1/c0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class DisplayingDisappearingItemsElement extends AbstractC2794c0<a> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final LazyLayoutItemAnimator<?> f39589a;

        public DisplayingDisappearingItemsElement(@NotNull LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.f39589a = lazyLayoutItemAnimator;
        }

        @Override // D1.AbstractC2794c0
        /* renamed from: create */
        public final a getF41119a() {
            return new a(this.f39589a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && Intrinsics.d(this.f39589a, ((DisplayingDisappearingItemsElement) obj).f39589a);
        }

        public final int hashCode() {
            return this.f39589a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.f39589a + ')';
        }

        @Override // D1.AbstractC2794c0
        public final void update(a aVar) {
            aVar.I1(this.f39589a);
        }
    }

    private static final class a extends e.c implements InterfaceC2819t {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private LazyLayoutItemAnimator<?> f39590a;

        public a(@NotNull LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.f39590a = lazyLayoutItemAnimator;
        }

        public final void I1(@NotNull LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            if (Intrinsics.d(this.f39590a, lazyLayoutItemAnimator) || !getNode().isAttached()) {
                return;
            }
            this.f39590a.j();
            ((LazyLayoutItemAnimator) lazyLayoutItemAnimator).f39587j = this;
            this.f39590a = lazyLayoutItemAnimator;
        }

        @Override // D1.InterfaceC2819t
        public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
            ArrayList arrayList = ((LazyLayoutItemAnimator) this.f39590a).f39586i;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                androidx.compose.foundation.lazy.layout.b bVar = (androidx.compose.foundation.lazy.layout.b) arrayList.get(i11);
                o1.d j11 = bVar.j();
                if (j11 != null) {
                    float i12 = (int) (bVar.i() >> 32);
                    float r11 = i12 - ((int) (j11.r() >> 32));
                    float i13 = ((int) (bVar.i() & 4294967295L)) - ((int) (j11.r() & 4294967295L));
                    J j12 = (J) interfaceC8410c;
                    j12.w0().f().g(r11, i13);
                    try {
                        j11.f(j12.w0().a(), j12.w0().c());
                    } finally {
                        j12.w0().f().g(-r11, -i13);
                    }
                }
            }
            ((J) interfaceC8410c).F0();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f39590a, ((a) obj).f39590a);
        }

        public final int hashCode() {
            return this.f39590a.hashCode();
        }

        @Override // androidx.compose.ui.e.c
        public final void onAttach() {
            ((LazyLayoutItemAnimator) this.f39590a).f39587j = this;
        }

        @Override // androidx.compose.ui.e.c
        public final void onDetach() {
            this.f39590a.j();
        }

        @NotNull
        public final String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.f39590a + ')';
        }
    }

    private final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private androidx.compose.foundation.lazy.layout.b[] f39591a;

        /* renamed from: b, reason: collision with root package name */
        private Z1.b f39592b;

        /* renamed from: c, reason: collision with root package name */
        private int f39593c;

        /* renamed from: d, reason: collision with root package name */
        private int f39594d;

        /* renamed from: e, reason: collision with root package name */
        private int f39595e;

        /* renamed from: f, reason: collision with root package name */
        private int f39596f;

        /* renamed from: g, reason: collision with root package name */
        private int f39597g;

        /* loaded from: classes8.dex */
        static final class a extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LazyLayoutItemAnimator<T> f39599b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LazyLayoutItemAnimator<T> lazyLayoutItemAnimator) {
                super(0);
                this.f39599b = lazyLayoutItemAnimator;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                InterfaceC2819t interfaceC2819t = ((LazyLayoutItemAnimator) this.f39599b).f39587j;
                if (interfaceC2819t != null) {
                    C2820u.a(interfaceC2819t);
                }
                return Unit.f71690a;
            }
        }

        public b() {
            androidx.compose.foundation.lazy.layout.b[] bVarArr;
            bVarArr = C10616u.f104789a;
            this.f39591a = bVarArr;
            this.f39595e = 1;
        }

        public static void k(b bVar, InterfaceC10575D interfaceC10575D, xe.M m11, InterfaceC7823h0 interfaceC7823h0, int i11, int i12) {
            LazyLayoutItemAnimator.this.getClass();
            long l11 = interfaceC10575D.l(0);
            bVar.j(interfaceC10575D, m11, interfaceC7823h0, i11, i12, (int) (!interfaceC10575D.d() ? l11 & 4294967295L : l11 >> 32));
        }

        @NotNull
        public final androidx.compose.foundation.lazy.layout.b[] a() {
            return this.f39591a;
        }

        public final Z1.b b() {
            return this.f39592b;
        }

        public final int c() {
            return this.f39593c;
        }

        public final int d() {
            return this.f39594d;
        }

        public final int e() {
            return this.f39597g;
        }

        public final int f() {
            return this.f39596f;
        }

        public final int g() {
            return this.f39595e;
        }

        public final void h(int i11) {
            this.f39594d = i11;
        }

        public final void i(int i11) {
            this.f39595e = i11;
        }

        public final void j(@NotNull T t2, @NotNull xe.M m11, @NotNull InterfaceC7823h0 interfaceC7823h0, int i11, int i12, int i13) {
            androidx.compose.foundation.lazy.layout.b[] bVarArr = this.f39591a;
            int length = bVarArr.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    this.f39596f = i11;
                    this.f39597g = i12;
                    break;
                } else {
                    androidx.compose.foundation.lazy.layout.b bVar = bVarArr[i14];
                    if (bVar != null && bVar.q()) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            int length2 = this.f39591a.length;
            for (int b11 = t2.b(); b11 < length2; b11++) {
                androidx.compose.foundation.lazy.layout.b bVar2 = this.f39591a[b11];
                if (bVar2 != null) {
                    bVar2.r();
                }
            }
            if (this.f39591a.length != t2.b()) {
                Object[] copyOf = Arrays.copyOf(this.f39591a, t2.b());
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                this.f39591a = (androidx.compose.foundation.lazy.layout.b[]) copyOf;
            }
            this.f39592b = Z1.b.a(t2.c());
            this.f39593c = i13;
            this.f39594d = t2.n();
            this.f39595e = t2.m();
            int b12 = t2.b();
            for (int i15 = 0; i15 < b12; i15++) {
                Object k11 = t2.k(i15);
                if ((k11 instanceof C10605j ? (C10605j) k11 : null) == null) {
                    androidx.compose.foundation.lazy.layout.b bVar3 = this.f39591a[i15];
                    if (bVar3 != null) {
                        bVar3.r();
                    }
                    this.f39591a[i15] = null;
                } else if (this.f39591a[i15] == null) {
                    this.f39591a[i15] = new androidx.compose.foundation.lazy.layout.b(m11, interfaceC7823h0, new a(LazyLayoutItemAnimator.this));
                }
            }
        }
    }

    public LazyLayoutItemAnimator() {
        long[] jArr = W.f38661a;
        this.f39578a = new L<>((Object) null);
        this.f39581d = Y.a();
        this.f39582e = new ArrayList();
        this.f39583f = new ArrayList();
        this.f39584g = new ArrayList();
        this.f39585h = new ArrayList();
        this.f39586i = new ArrayList();
        this.f39588k = new DisplayingDisappearingItemsElement(this);
    }

    private static void g(InterfaceC10575D interfaceC10575D, int i11, b bVar) {
        int i12 = 0;
        long l11 = interfaceC10575D.l(0);
        long b11 = interfaceC10575D.d() ? Z1.m.b(0, i11, 1, l11) : Z1.m.b(i11, 0, 2, l11);
        androidx.compose.foundation.lazy.layout.b[] a11 = bVar.a();
        int length = a11.length;
        int i13 = 0;
        while (i12 < length) {
            androidx.compose.foundation.lazy.layout.b bVar2 = a11[i12];
            int i14 = i13 + 1;
            if (bVar2 != null) {
                bVar2.u(Z1.m.e(b11, Z1.m.d(interfaceC10575D.l(i13), l11)));
            }
            i12++;
            i13 = i14;
        }
    }

    private final void i(Object obj) {
        androidx.compose.foundation.lazy.layout.b[] a11;
        LazyLayoutItemAnimator<T>.b g10 = this.f39578a.g(obj);
        if (g10 == null || (a11 = g10.a()) == null) {
            return;
        }
        for (androidx.compose.foundation.lazy.layout.b bVar : a11) {
            if (bVar != null) {
                bVar.r();
            }
        }
    }

    private final void k(T t2, boolean z11) {
        LazyLayoutItemAnimator<T>.b b11 = this.f39578a.b(t2.getKey());
        Intrinsics.f(b11);
        androidx.compose.foundation.lazy.layout.b[] a11 = b11.a();
        int length = a11.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            androidx.compose.foundation.lazy.layout.b bVar = a11[i11];
            int i13 = i12 + 1;
            if (bVar != null) {
                long l11 = t2.l(i12);
                int i14 = androidx.compose.foundation.lazy.layout.b.f39607q;
                b.a.a();
                bVar.u(l11);
            }
            i11++;
            i12 = i13;
        }
    }

    private static int l(int[] iArr, InterfaceC10575D interfaceC10575D) {
        int n11 = interfaceC10575D.n();
        int m11 = interfaceC10575D.m() + n11;
        int i11 = 0;
        while (n11 < m11) {
            int j11 = interfaceC10575D.j() + iArr[n11];
            iArr[n11] = j11;
            i11 = Math.max(i11, j11);
            n11++;
        }
        return i11;
    }

    public final androidx.compose.foundation.lazy.layout.b d(int i11, @NotNull Object obj) {
        androidx.compose.foundation.lazy.layout.b[] a11;
        LazyLayoutItemAnimator<T>.b b11 = this.f39578a.b(obj);
        if (b11 == null || (a11 = b11.a()) == null) {
            return null;
        }
        return a11[i11];
    }

    public final long e() {
        ArrayList arrayList = this.f39586i;
        int size = arrayList.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.foundation.lazy.layout.b bVar = (androidx.compose.foundation.lazy.layout.b) arrayList.get(i11);
            o1.d j12 = bVar.j();
            if (j12 != null) {
                j11 = Z1.r.a(Math.max((int) (j11 >> 32), ((int) (bVar.m() >> 32)) + ((int) (j12.q() >> 32))), Math.max((int) (j11 & 4294967295L), ((int) (bVar.m() & 4294967295L)) + ((int) (j12.q() & 4294967295L))));
            }
        }
        return j11;
    }

    @NotNull
    public final androidx.compose.ui.e f() {
        return this.f39588k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i11, int i12, int i13, @NotNull ArrayList arrayList, @NotNull h hVar, @NotNull InterfaceC10576E interfaceC10576E, boolean z11, boolean z12, int i14, boolean z13, int i15, int i16, @NotNull xe.M m11, @NotNull InterfaceC7823h0 interfaceC7823h0) {
        L<Object, LazyLayoutItemAnimator<T>.b> l11;
        Object obj;
        int i17;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        h hVar2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i18;
        M<Object> m12;
        int i19;
        int i21;
        int i22;
        int i23;
        int e11;
        int f7;
        ArrayList arrayList7;
        ArrayList arrayList8;
        long j11;
        int i24;
        M<Object> m13;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        long j12;
        h hVar3 = this.f39579b;
        this.f39579b = hVar;
        int size = arrayList.size();
        int i31 = 0;
        loop0: while (true) {
            l11 = this.f39578a;
            if (i31 < size) {
                InterfaceC10575D interfaceC10575D = (InterfaceC10575D) arrayList.get(i31);
                int b11 = interfaceC10575D.b();
                obj = null;
                for (int i32 = 0; i32 < b11; i32++) {
                    i17 = 1;
                    Object k11 = interfaceC10575D.k(i32);
                    if ((k11 instanceof C10605j ? (C10605j) k11 : null) != null) {
                        break loop0;
                    }
                }
                i31++;
            } else {
                obj = null;
                i17 = 1;
                if (l11.f38660e == 0) {
                    j();
                    return;
                }
            }
        }
        int i33 = this.f39580c;
        InterfaceC10575D interfaceC10575D2 = (InterfaceC10575D) C7714v.M(arrayList);
        this.f39580c = interfaceC10575D2 != null ? interfaceC10575D2.getIndex() : 0;
        long a11 = z11 ? Z1.n.a(0, i11) : Z1.n.a(i11, 0);
        int i34 = (z12 || !z13) ? i17 : 0;
        Object[] objArr = l11.f38657b;
        long[] jArr = l11.f38656a;
        int length = jArr.length - 2;
        M<Object> m14 = this.f39581d;
        if (length >= 0) {
            int i35 = 0;
            while (true) {
                long j13 = jArr[i35];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i36 = 8 - ((~(i35 - length)) >>> 31);
                    for (int i37 = 0; i37 < i36; i37++) {
                        if ((j13 & 255) < 128) {
                            j12 = j13;
                            m14.d(objArr[(i35 << 3) + i37]);
                        } else {
                            j12 = j13;
                        }
                        j13 = j12 >> 8;
                    }
                    if (i36 != 8) {
                        break;
                    }
                }
                if (i35 == length) {
                    break;
                } else {
                    i35++;
                }
            }
        }
        int size2 = arrayList.size();
        int i38 = 0;
        while (true) {
            arrayList2 = this.f39586i;
            arrayList3 = this.f39583f;
            arrayList4 = this.f39582e;
            if (i38 >= size2) {
                break;
            }
            InterfaceC10575D interfaceC10575D3 = (InterfaceC10575D) arrayList.get(i38);
            m14.l(interfaceC10575D3.getKey());
            int b12 = interfaceC10575D3.b();
            int i39 = size2;
            int i41 = 0;
            while (true) {
                if (i41 >= b12) {
                    i27 = i38;
                    i(interfaceC10575D3.getKey());
                    break;
                }
                i27 = i38;
                Object k12 = interfaceC10575D3.k(i41);
                int i42 = i41;
                if ((k12 instanceof C10605j ? (C10605j) k12 : obj) != null) {
                    LazyLayoutItemAnimator<T>.b b13 = l11.b(interfaceC10575D3.getKey());
                    int b14 = hVar3 != null ? hVar3.b(interfaceC10575D3.getKey()) : -1;
                    int i43 = (b14 != -1 || hVar3 == null) ? 0 : i17;
                    if (b13 == null) {
                        LazyLayoutItemAnimator<T>.b bVar = new b();
                        b.k(bVar, interfaceC10575D3, m11, interfaceC7823h0, i15, i16);
                        l11.i(interfaceC10575D3.getKey(), bVar);
                        if (interfaceC10575D3.getIndex() == b14 || b14 == -1) {
                            long l12 = interfaceC10575D3.l(0);
                            g(interfaceC10575D3, (int) (interfaceC10575D3.d() ? l12 & 4294967295L : l12 >> 32), bVar);
                            if (i43 != 0) {
                                androidx.compose.foundation.lazy.layout.b[] a12 = bVar.a();
                                for (androidx.compose.foundation.lazy.layout.b bVar2 : a12) {
                                    if (bVar2 != null) {
                                        bVar2.f();
                                        Unit unit = Unit.f71690a;
                                    }
                                }
                            }
                        } else if (b14 < i33) {
                            arrayList4.add(interfaceC10575D3);
                        } else {
                            arrayList3.add(interfaceC10575D3);
                        }
                    } else if (i34 != 0) {
                        b.k(b13, interfaceC10575D3, m11, interfaceC7823h0, i15, i16);
                        androidx.compose.foundation.lazy.layout.b[] a13 = b13.a();
                        int length2 = a13.length;
                        int i44 = 0;
                        while (i44 < length2) {
                            androidx.compose.foundation.lazy.layout.b bVar3 = a13[i44];
                            androidx.compose.foundation.lazy.layout.b[] bVarArr = a13;
                            int i45 = i43;
                            if (bVar3 != null) {
                                long m15 = bVar3.m();
                                int i46 = androidx.compose.foundation.lazy.layout.b.f39607q;
                                i28 = length2;
                                i29 = i44;
                                if (!Z1.m.c(m15, b.a.a())) {
                                    bVar3.u(Z1.m.e(bVar3.m(), a11));
                                }
                            } else {
                                i28 = length2;
                                i29 = i44;
                            }
                            i44 = i29 + 1;
                            a13 = bVarArr;
                            length2 = i28;
                            i43 = i45;
                        }
                        if (i43 != 0) {
                            for (androidx.compose.foundation.lazy.layout.b bVar4 : b13.a()) {
                                if (bVar4 != null) {
                                    if (bVar4.o()) {
                                        arrayList2.remove(bVar4);
                                        InterfaceC2819t interfaceC2819t = this.f39587j;
                                        if (interfaceC2819t != null) {
                                            C2820u.a(interfaceC2819t);
                                            Unit unit2 = Unit.f71690a;
                                        }
                                    }
                                    bVar4.f();
                                }
                            }
                        }
                        k(interfaceC10575D3, false);
                    }
                } else {
                    i41 = i42 + 1;
                    i38 = i27;
                }
            }
            i38 = i27 + 1;
            size2 = i39;
        }
        int i47 = i14;
        int[] iArr = new int[i47];
        for (int i48 = 0; i48 < i47; i48++) {
            iArr[i48] = 0;
        }
        if (i34 != 0 && hVar3 != null) {
            if (arrayList4.isEmpty()) {
                i26 = i17;
            } else {
                if (arrayList4.size() > i17) {
                    C7714v.G0(new C10614s(hVar3), arrayList4);
                }
                int size3 = arrayList4.size();
                for (int i49 = 0; i49 < size3; i49++) {
                    InterfaceC10575D interfaceC10575D4 = (InterfaceC10575D) arrayList4.get(i49);
                    int l13 = i15 - l(iArr, interfaceC10575D4);
                    LazyLayoutItemAnimator<T>.b b15 = l11.b(interfaceC10575D4.getKey());
                    Intrinsics.f(b15);
                    g(interfaceC10575D4, l13, b15);
                    k(interfaceC10575D4, false);
                }
                i26 = 1;
                C7705l.y(iArr, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > i26) {
                    C7714v.G0(new C10612q(hVar3), arrayList3);
                }
                int size4 = arrayList3.size();
                for (int i51 = 0; i51 < size4; i51++) {
                    InterfaceC10575D interfaceC10575D5 = (InterfaceC10575D) arrayList3.get(i51);
                    int l14 = (i16 + l(iArr, interfaceC10575D5)) - interfaceC10575D5.j();
                    LazyLayoutItemAnimator<T>.b b16 = l11.b(interfaceC10575D5.getKey());
                    Intrinsics.f(b16);
                    g(interfaceC10575D5, l14, b16);
                    k(interfaceC10575D5, false);
                }
                C7705l.y(iArr, 0);
            }
        }
        Object[] objArr2 = m14.f38663b;
        long[] jArr2 = m14.f38662a;
        int length3 = jArr2.length - 2;
        ArrayList arrayList9 = this.f39585h;
        ArrayList arrayList10 = this.f39584g;
        if (length3 >= 0) {
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
            int i52 = 0;
            while (true) {
                long j14 = jArr2[i52];
                i18 = i34;
                long[] jArr3 = jArr2;
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i53 = 8 - ((~(i52 - length3)) >>> 31);
                    int i54 = 0;
                    while (i54 < i53) {
                        if ((j14 & 255) < 128) {
                            j11 = j14;
                            Object obj2 = objArr2[(i52 << 3) + i54];
                            LazyLayoutItemAnimator<T>.b b17 = l11.b(obj2);
                            Intrinsics.f(b17);
                            LazyLayoutItemAnimator<T>.b bVar5 = b17;
                            i24 = i54;
                            m13 = m14;
                            int b18 = hVar.b(obj2);
                            bVar5.i(Math.min(i47, bVar5.g()));
                            bVar5.h(Math.min(i47 - bVar5.g(), bVar5.d()));
                            if (b18 == -1) {
                                androidx.compose.foundation.lazy.layout.b[] a14 = bVar5.a();
                                int length4 = a14.length;
                                int i55 = 0;
                                boolean z14 = false;
                                int i56 = 0;
                                while (i55 < length4) {
                                    int i57 = i55;
                                    androidx.compose.foundation.lazy.layout.b bVar6 = a14[i57];
                                    int i58 = i56 + 1;
                                    if (bVar6 != null) {
                                        if (!bVar6.o()) {
                                            if (bVar6.n()) {
                                                bVar6.r();
                                                bVar5.a()[i56] = obj;
                                                arrayList2.remove(bVar6);
                                                InterfaceC2819t interfaceC2819t2 = this.f39587j;
                                                if (interfaceC2819t2 != null) {
                                                    C2820u.a(interfaceC2819t2);
                                                    Unit unit3 = Unit.f71690a;
                                                }
                                            } else {
                                                if (bVar6.j() != null) {
                                                    bVar6.g();
                                                }
                                                if (bVar6.o()) {
                                                    arrayList2.add(bVar6);
                                                    InterfaceC2819t interfaceC2819t3 = this.f39587j;
                                                    if (interfaceC2819t3 != null) {
                                                        C2820u.a(interfaceC2819t3);
                                                        Unit unit4 = Unit.f71690a;
                                                    }
                                                } else {
                                                    bVar6.r();
                                                    bVar5.a()[i56] = obj;
                                                }
                                            }
                                        }
                                        z14 = true;
                                        i55 = i57 + 1;
                                        i56 = i58;
                                    }
                                    i55 = i57 + 1;
                                    i56 = i58;
                                }
                                if (!z14) {
                                    i(obj2);
                                }
                                arrayList8 = arrayList2;
                            } else {
                                Z1.b b19 = bVar5.b();
                                Intrinsics.f(b19);
                                InterfaceC10575D a15 = interfaceC10576E.a(b18, bVar5.d(), bVar5.g(), b19.p());
                                a15.g();
                                androidx.compose.foundation.lazy.layout.b[] a16 = bVar5.a();
                                int length5 = a16.length;
                                arrayList8 = arrayList2;
                                int i59 = 0;
                                while (true) {
                                    if (i59 < length5) {
                                        androidx.compose.foundation.lazy.layout.b bVar7 = a16[i59];
                                        int i61 = length5;
                                        if (bVar7 != null) {
                                            boolean p11 = bVar7.p();
                                            i25 = i59;
                                            if (p11) {
                                                break;
                                            }
                                        } else {
                                            i25 = i59;
                                        }
                                        i59 = i25 + 1;
                                        length5 = i61;
                                    } else if (hVar3 != null && b18 == hVar3.b(obj2)) {
                                        i(obj2);
                                    }
                                }
                                bVar5.j(a15, m11, interfaceC7823h0, i15, i16, bVar5.c());
                                if (b18 < this.f39580c) {
                                    arrayList10.add(a15);
                                } else {
                                    arrayList9.add(a15);
                                }
                            }
                        } else {
                            arrayList8 = arrayList2;
                            j11 = j14;
                            i24 = i54;
                            m13 = m14;
                        }
                        j14 = j11 >> 8;
                        i47 = i14;
                        i54 = i24 + 1;
                        arrayList2 = arrayList8;
                        m14 = m13;
                    }
                    hVar2 = hVar;
                    arrayList7 = arrayList2;
                    m12 = m14;
                    i19 = 1;
                    if (i53 != 8) {
                        break;
                    }
                } else {
                    hVar2 = hVar;
                    arrayList7 = arrayList2;
                    m12 = m14;
                    i19 = 1;
                }
                if (i52 == length3) {
                    break;
                }
                i52 += i19;
                i47 = i14;
                arrayList2 = arrayList7;
                i34 = i18;
                jArr2 = jArr3;
                m14 = m12;
            }
        } else {
            hVar2 = hVar;
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
            i18 = i34;
            m12 = m14;
            i19 = 1;
        }
        if (arrayList10.isEmpty()) {
            i21 = i12;
            i22 = i13;
            i23 = i19;
        } else {
            if (arrayList10.size() > i19) {
                C7714v.G0(new C10615t(hVar2), arrayList10);
            }
            int size5 = arrayList10.size();
            for (int i62 = 0; i62 < size5; i62++) {
                InterfaceC10575D interfaceC10575D6 = (InterfaceC10575D) arrayList10.get(i62);
                LazyLayoutItemAnimator<T>.b b21 = l11.b(interfaceC10575D6.getKey());
                Intrinsics.f(b21);
                LazyLayoutItemAnimator<T>.b bVar8 = b21;
                int l15 = l(iArr, interfaceC10575D6);
                if (z12) {
                    InterfaceC10575D interfaceC10575D7 = (InterfaceC10575D) C7714v.K(arrayList);
                    long l16 = interfaceC10575D7.l(0);
                    f7 = (int) (interfaceC10575D7.d() ? l16 & 4294967295L : l16 >> 32);
                } else {
                    f7 = bVar8.f();
                }
                interfaceC10575D6.f(f7 - l15, bVar8.c(), i12, i13);
                if (i18 != 0) {
                    k(interfaceC10575D6, true);
                }
            }
            i21 = i12;
            i22 = i13;
            i23 = 1;
            C7705l.y(iArr, 0);
        }
        if (!arrayList9.isEmpty()) {
            if (arrayList9.size() > i23) {
                C7714v.G0(new C10613r(hVar2), arrayList9);
            }
            int size6 = arrayList9.size();
            for (int i63 = 0; i63 < size6; i63++) {
                InterfaceC10575D interfaceC10575D8 = (InterfaceC10575D) arrayList9.get(i63);
                LazyLayoutItemAnimator<T>.b b22 = l11.b(interfaceC10575D8.getKey());
                Intrinsics.f(b22);
                LazyLayoutItemAnimator<T>.b bVar9 = b22;
                int l17 = l(iArr, interfaceC10575D8);
                if (z12) {
                    InterfaceC10575D interfaceC10575D9 = (InterfaceC10575D) C7714v.X(arrayList);
                    long l18 = interfaceC10575D9.l(0);
                    e11 = (int) (interfaceC10575D9.d() ? l18 & 4294967295L : l18 >> 32);
                } else {
                    e11 = bVar9.e() - interfaceC10575D8.j();
                }
                interfaceC10575D8.f(e11 + l17, bVar9.c(), i21, i22);
                if (i18 != 0) {
                    k(interfaceC10575D8, true);
                }
            }
        }
        Intrinsics.checkNotNullParameter(arrayList10, "<this>");
        Collections.reverse(arrayList10);
        Unit unit5 = Unit.f71690a;
        arrayList.addAll(0, arrayList10);
        arrayList.addAll(arrayList9);
        arrayList6.clear();
        arrayList5.clear();
        arrayList10.clear();
        arrayList9.clear();
        m12.f();
    }

    public final void j() {
        L<Object, LazyLayoutItemAnimator<T>.b> l11 = this.f39578a;
        if (l11.f38660e != 0) {
            Object[] objArr = l11.f38658c;
            long[] jArr = l11.f38656a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                for (androidx.compose.foundation.lazy.layout.b bVar : ((b) objArr[(i11 << 3) + i13]).a()) {
                                    if (bVar != null) {
                                        bVar.r();
                                    }
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
                    } else {
                        i11++;
                    }
                }
            }
            l11.c();
        }
        this.f39579b = h.a.f39647a;
        this.f39580c = -1;
    }
}
