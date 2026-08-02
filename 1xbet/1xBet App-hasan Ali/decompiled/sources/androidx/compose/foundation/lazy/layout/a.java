package androidx.compose.foundation.lazy.layout;

import A.u;
import B.C0078g;
import B.C0084m;
import B.C0085n;
import B.C0086o;
import B.K;
import B.s;
import X3.m;
import X3.r;
import b0.o;
import b0.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.jvm.internal.l;
import r.C2321G;
import r.C2322H;
import r.O;
import r.P;
import z0.Z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C2321G f6878a;

    /* renamed from: b, reason: collision with root package name */
    public s f6879b;

    /* renamed from: c, reason: collision with root package name */
    public final C2322H f6880c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6881d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f6882e;
    public final ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6883g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f6884h;
    public final p i;

    public a() {
        long[] jArr = O.f18957a;
        this.f6878a = new C2321G();
        int i = P.f18958a;
        this.f6880c = new C2322H();
        this.f6881d = new ArrayList();
        this.f6882e = new ArrayList();
        this.f = new ArrayList();
        this.f6883g = new ArrayList();
        this.f6884h = new ArrayList();
        this.i = new Z(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* renamed from: k, reason: collision with root package name */
            public final a f6872k;

            {
                this.f6872k = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && l.a(this.f6872k, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f6872k);
            }

            public final int hashCode() {
                return this.f6872k.hashCode();
            }

            @Override // z0.Z
            public final o i() {
                C0084m c0084m = new C0084m();
                c0084m.f688y = this.f6872k;
                return c0084m;
            }

            @Override // z0.Z
            public final void k(o oVar) {
                C0084m c0084m = (C0084m) oVar;
                a aVar = c0084m.f688y;
                a aVar2 = this.f6872k;
                if (l.a(aVar, aVar2) || !c0084m.f7162k.f7175x) {
                    return;
                }
                c0084m.f688y.c();
                aVar2.getClass();
                c0084m.f688y = aVar2;
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f6872k + ')';
            }
        };
    }

    public static int e(int[] iArr, u uVar) {
        uVar.getClass();
        int i = iArr[0] + uVar.f128l;
        iArr[0] = i;
        return Math.max(0, i);
    }

    public final long a() {
        ArrayList arrayList = this.f6884h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        L1.a.t(arrayList.get(0));
        throw null;
    }

    public final void b(int i, int i5, ArrayList arrayList, K k5, A.p pVar, boolean z3, boolean z5, int i6, int i7) {
        long j5;
        ArrayList arrayList2;
        boolean z6;
        C2322H c2322h;
        long j6;
        int i8;
        s sVar = this.f6879b;
        this.f6879b = k5;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            u uVar = (u) arrayList.get(i9);
            int size2 = uVar.f120b.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((x0.Z) uVar.f120b.get(i10)).k();
            }
        }
        C2321G c2321g = this.f6878a;
        if (c2321g.i()) {
            c();
            return;
        }
        boolean z7 = z3 || !z5;
        Object[] objArr = c2321g.f18929b;
        long[] jArr = c2321g.f18928a;
        int length = jArr.length - 2;
        C2322H c2322h2 = this.f6880c;
        if (length >= 0) {
            int i11 = 0;
            j5 = 255;
            while (true) {
                long j7 = jArr[i11];
                int i12 = i11;
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    long j8 = j7;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j8 & 255) < 128) {
                            c2322h2.a(objArr[(i12 << 3) + i14]);
                        }
                        j8 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                } else {
                    i11 = i12 + 1;
                }
            }
        } else {
            j5 = 255;
        }
        int size3 = arrayList.size();
        for (int i15 = 0; i15 < size3; i15++) {
            u uVar2 = (u) arrayList.get(i15);
            c2322h2.k(uVar2.f124g);
            int size4 = uVar2.f120b.size();
            for (int i16 = 0; i16 < size4; i16++) {
                ((x0.Z) uVar2.f120b.get(i16)).k();
            }
            L1.a.t(this.f6878a.k(uVar2.f124g));
        }
        int[] iArr = {0};
        ArrayList arrayList3 = this.f6882e;
        ArrayList arrayList4 = this.f6881d;
        if (z7 && sVar != null) {
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    r.T(arrayList4, new C0085n(sVar, 1));
                }
                if (arrayList4.size() > 0) {
                    u uVar3 = (u) arrayList4.get(0);
                    e(iArr, uVar3);
                    Object g5 = c2321g.g(uVar3.f124g);
                    l.c(g5);
                    L1.a.t(g5);
                    uVar3.a(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    r.T(arrayList3, new C0085n(sVar, 0));
                }
                if (arrayList3.size() > 0) {
                    u uVar4 = (u) arrayList3.get(0);
                    e(iArr, uVar4);
                    Object g6 = c2321g.g(uVar4.f124g);
                    l.c(g6);
                    L1.a.t(g6);
                    uVar4.a(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, 1, 0);
            }
        }
        Object[] objArr2 = c2322h2.f18934b;
        long[] jArr2 = c2322h2.f18933a;
        int length2 = jArr2.length - 2;
        ArrayList arrayList5 = this.f6883g;
        ArrayList arrayList6 = this.f;
        if (length2 >= 0) {
            arrayList2 = arrayList3;
            z6 = z7;
            int i17 = 0;
            while (true) {
                long j9 = jArr2[i17];
                long[] jArr3 = jArr2;
                c2322h = c2322h2;
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8;
                    int i19 = 8 - ((~(i17 - length2)) >>> 31);
                    long j10 = j9;
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j10 & j5) < 128) {
                            Object obj = objArr2[(i17 << 3) + i20];
                            Object g7 = c2321g.g(obj);
                            l.c(g7);
                            L1.a.t(g7);
                            k5.b(obj);
                            throw null;
                        }
                        j10 >>= i18;
                        i20++;
                        i18 = 8;
                    }
                    if (i19 != i18) {
                        break;
                    }
                }
                if (i17 == length2) {
                    break;
                }
                i17++;
                c2322h2 = c2322h;
                jArr2 = jArr3;
            }
        } else {
            arrayList2 = arrayList3;
            z6 = z7;
            c2322h = c2322h2;
        }
        if (arrayList6.isEmpty()) {
            j6 = 4294967295L;
            i8 = 1;
        } else {
            if (arrayList6.size() > 1) {
                r.T(arrayList6, new C0086o(k5, 1));
            }
            int size5 = arrayList6.size();
            for (int i21 = 0; i21 < size5; i21++) {
                u uVar5 = (u) arrayList6.get(i21);
                Object g8 = c2321g.g(uVar5.f124g);
                l.c(g8);
                L1.a.t(g8);
                uVar5.c((z3 ? (int) (((u) m.Y(arrayList)).a(0) & 4294967295L) : 0) - e(iArr, uVar5), i, i5);
                if (z6) {
                    d(uVar5, true);
                    throw null;
                }
            }
            j6 = 4294967295L;
            i8 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > i8) {
                r.T(arrayList5, new C0086o(k5, 0));
            }
            int size6 = arrayList5.size();
            for (int i22 = 0; i22 < size6; i22++) {
                u uVar6 = (u) arrayList5.get(i22);
                Object g9 = c2321g.g(uVar6.f124g);
                l.c(g9);
                L1.a.t(g9);
                uVar6.c((z3 ? (int) (((u) m.e0(arrayList)).a(0) & j6) : 0 - uVar6.f128l) + e(iArr, uVar6), i, i5);
                if (z6) {
                    d(uVar6, true);
                    throw null;
                }
            }
        }
        Collections.reverse(arrayList6);
        arrayList.addAll(0, arrayList6);
        arrayList.addAll(arrayList5);
        arrayList4.clear();
        arrayList2.clear();
        arrayList6.clear();
        arrayList5.clear();
        c2322h.b();
    }

    public final void c() {
        C2321G c2321g = this.f6878a;
        if (c2321g.j()) {
            Object[] objArr = c2321g.f18930c;
            long[] jArr = c2321g.f18928a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j5 = jArr[i];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((255 & j5) < 128) {
                                L1.a.t(objArr[(i << 3) + i6]);
                                throw null;
                            }
                            j5 >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            c2321g.a();
        }
        this.f6879b = C0078g.f674b;
    }

    public final void d(u uVar, boolean z3) {
        Object g5 = this.f6878a.g(uVar.f124g);
        l.c(g5);
        L1.a.t(g5);
        throw null;
    }
}
