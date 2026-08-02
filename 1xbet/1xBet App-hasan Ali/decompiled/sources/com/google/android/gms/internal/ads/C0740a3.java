package com.google.android.gms.internal.ads;

import B.C0072a;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.a3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740a3 implements F {

    /* renamed from: a, reason: collision with root package name */
    public final List f12619a;

    /* renamed from: b, reason: collision with root package name */
    public final C1617tm f12620b = new C1617tm(0, new byte[9400]);

    /* renamed from: c, reason: collision with root package name */
    public final SparseIntArray f12621c;

    /* renamed from: d, reason: collision with root package name */
    public final C1529ro f12622d;

    /* renamed from: e, reason: collision with root package name */
    public final C1543s1 f12623e;
    public final SparseArray f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f12624g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f12625h;
    public final V2 i;

    /* renamed from: j, reason: collision with root package name */
    public C1363o0 f12626j;

    /* renamed from: k, reason: collision with root package name */
    public H f12627k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12628l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12629m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12630n;

    /* renamed from: o, reason: collision with root package name */
    public int f12631o;

    public C0740a3(C1543s1 c1543s1, Kn kn, C1529ro c1529ro) {
        this.f12622d = c1529ro;
        this.f12623e = c1543s1;
        this.f12619a = Collections.singletonList(kn);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f12624g = sparseBooleanArray;
        this.f12625h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f = sparseArray;
        this.f12621c = new SparseIntArray();
        this.i = new V2(1);
        this.f12627k = H.f9296e;
        this.f12631o = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            this.f.put(sparseArray2.keyAt(i), (InterfaceC0874d3) sparseArray2.valueAt(i));
        }
        this.f.put(0, new Z2(new C1390oj(this)));
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void d(long j5, long j6) {
        C1363o0 c1363o0;
        List list = this.f12619a;
        int size = list.size();
        int i = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Kn kn = (Kn) list.get(i5);
            if (kn.e() != -9223372036854775807L) {
                long d5 = kn.d();
                if (d5 != -9223372036854775807L) {
                    if (d5 != 0) {
                        if (d5 == j6) {
                        }
                    }
                }
            }
            kn.f(j6);
        }
        if (j6 != 0 && (c1363o0 = this.f12626j) != null) {
            c1363o0.b(j6);
        }
        this.f12620b.g(0);
        this.f12621c.clear();
        while (true) {
            SparseArray sparseArray = this.f;
            if (i >= sparseArray.size()) {
                return;
            }
            ((InterfaceC0874d3) sparseArray.valueAt(i)).i();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(G g5) {
        byte[] bArr = this.f12620b.f15724a;
        B b3 = (B) g5;
        b3.G(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i5 = 0; i5 < 5; i5++) {
                if (bArr[(i5 * 188) + i] != 71) {
                    break;
                }
            }
            b3.k(i);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x028b, code lost:
    
        if (r4 == false) goto L157;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // com.google.android.gms.internal.ads.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(G g5, C0072a c0072a) {
        ?? r15;
        long j5;
        long j6;
        long j7;
        long j8 = ((B) g5).f7751m;
        if (this.f12628l) {
            V2 v22 = this.i;
            if (j8 != -1 && !v22.f11856c) {
                int i = this.f12631o;
                if (i <= 0) {
                    v22.b((B) g5);
                    return 0;
                }
                boolean z3 = v22.f11858e;
                C1617tm c1617tm = v22.f11855b;
                if (z3) {
                    if (v22.f11859g == -9223372036854775807L) {
                        v22.b((B) g5);
                        return 0;
                    }
                    if (v22.f11857d) {
                        long j9 = v22.f;
                        if (j9 == -9223372036854775807L) {
                            v22.b((B) g5);
                            return 0;
                        }
                        Kn kn = v22.f11854a;
                        v22.f11860h = kn.c(v22.f11859g) - kn.b(j9);
                        v22.b((B) g5);
                        return 0;
                    }
                    B b3 = (B) g5;
                    int min = (int) Math.min(112800L, b3.f7751m);
                    if (b3.f7752n != 0) {
                        c0072a.f658a = 0L;
                        return 1;
                    }
                    c1617tm.g(min);
                    b3.f7754p = 0;
                    b3.G(c1617tm.f15724a, 0, min, false);
                    int i5 = c1617tm.f15725b;
                    int i6 = c1617tm.f15726c;
                    while (true) {
                        if (i5 >= i6) {
                            j6 = -9223372036854775807L;
                            break;
                        }
                        if (c1617tm.f15724a[i5] == 71) {
                            j6 = AbstractC1668us.w(c1617tm, i5, i);
                            if (j6 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i5++;
                    }
                    v22.f = j6;
                    v22.f11857d = true;
                    return 0;
                }
                B b5 = (B) g5;
                long j10 = b5.f7751m;
                int min2 = (int) Math.min(112800L, j10);
                long j11 = j10 - min2;
                if (b5.f7752n != j11) {
                    c0072a.f658a = j11;
                    return 1;
                }
                c1617tm.g(min2);
                b5.f7754p = 0;
                b5.G(c1617tm.f15724a, 0, min2, false);
                int i7 = c1617tm.f15725b;
                int i8 = c1617tm.f15726c;
                int i9 = i8 - 188;
                while (true) {
                    if (i9 < i7) {
                        j7 = -9223372036854775807L;
                        break;
                    }
                    byte[] bArr = c1617tm.f15724a;
                    int i10 = -4;
                    int i11 = 0;
                    while (true) {
                        if (i10 > 4) {
                            break;
                        }
                        int i12 = (i10 * 188) + i9;
                        if (i12 < i7 || i12 >= i8 || bArr[i12] != 71) {
                            i11 = 0;
                        } else {
                            i11++;
                            if (i11 == 5) {
                                long w5 = AbstractC1668us.w(c1617tm, i9, i);
                                if (w5 != -9223372036854775807L) {
                                    j7 = w5;
                                    break;
                                }
                            }
                        }
                        i10++;
                    }
                    i9--;
                }
                v22.f11859g = j7;
                v22.f11858e = true;
                return 0;
            }
            if (this.f12629m) {
                j5 = 0;
            } else {
                this.f12629m = true;
                long j12 = v22.f11860h;
                if (j12 != -9223372036854775807L) {
                    j5 = 0;
                    C1363o0 c1363o0 = new C1363o0(new C1543s1(12), new G3(this.f12631o, v22.f11854a), j12, j12 + 1, 0L, j8, 188L, 940);
                    this.f12626j = c1363o0;
                    this.f12627k.x(c1363o0.f14741a);
                } else {
                    j5 = 0;
                    this.f12627k.x(new J(j12, 0L));
                }
            }
            if (this.f12630n) {
                this.f12630n = false;
                d(j5, j5);
                if (((B) g5).f7752n != j5) {
                    c0072a.f658a = j5;
                    return 1;
                }
            }
            r15 = 1;
            r15 = 1;
            C1363o0 c1363o02 = this.f12626j;
            if (c1363o02 != null && c1363o02.f14743c != null) {
                return c1363o02.a((B) g5, c0072a);
            }
        } else {
            r15 = 1;
        }
        C1617tm c1617tm2 = this.f12620b;
        byte[] bArr2 = c1617tm2.f15724a;
        if (9400 - c1617tm2.f15725b < 188) {
            int o5 = c1617tm2.o();
            if (o5 > 0) {
                System.arraycopy(bArr2, c1617tm2.f15725b, bArr2, 0, o5);
            }
            c1617tm2.h(o5, bArr2);
        }
        while (true) {
            int o6 = c1617tm2.o();
            SparseArray sparseArray = this.f;
            if (o6 >= 188) {
                int i13 = c1617tm2.f15725b;
                int i14 = c1617tm2.f15726c;
                byte[] bArr3 = c1617tm2.f15724a;
                while (i13 < i14 && bArr3[i13] != 71) {
                    i13++;
                }
                c1617tm2.j(i13);
                int i15 = i13 + 188;
                int i16 = c1617tm2.f15726c;
                if (i15 > i16) {
                    return 0;
                }
                int q5 = c1617tm2.q();
                if ((8388608 & q5) != 0) {
                    c1617tm2.j(i15);
                    return 0;
                }
                int i17 = (4194304 & q5) != 0 ? r15 : 0;
                int i18 = q5 & 32;
                int i19 = (q5 >> 8) & 8191;
                InterfaceC0874d3 interfaceC0874d3 = (q5 & 16) != 0 ? (InterfaceC0874d3) sparseArray.get(i19) : null;
                if (interfaceC0874d3 == null) {
                    c1617tm2.j(i15);
                    return 0;
                }
                int i20 = q5 & 15;
                SparseIntArray sparseIntArray = this.f12621c;
                int i21 = sparseIntArray.get(i19, i20 - 1);
                sparseIntArray.put(i19, i20);
                if (i21 == i20) {
                    c1617tm2.j(i15);
                    return 0;
                }
                if (i20 != ((i21 + r15) & 15)) {
                    interfaceC0874d3.i();
                }
                if (i18 != 0) {
                    int v4 = c1617tm2.v();
                    i17 |= (c1617tm2.v() & 64) != 0 ? 2 : 0;
                    c1617tm2.k(v4 - 1);
                }
                boolean z5 = this.f12628l;
                if (z5 || !this.f12625h.get(i19, false)) {
                    c1617tm2.i(i15);
                    interfaceC0874d3.a(i17, c1617tm2);
                    c1617tm2.i(i16);
                }
                if (this.f12628l && j8 != -1) {
                    this.f12630n = r15;
                }
                c1617tm2.j(i15);
                return 0;
            }
            int i22 = c1617tm2.f15726c;
            int e3 = ((B) g5).e(bArr2, i22, 9400 - i22);
            if (e3 == -1) {
                for (int i23 = 0; i23 < sparseArray.size(); i23++) {
                    InterfaceC0874d3 interfaceC0874d32 = (InterfaceC0874d3) sparseArray.valueAt(i23);
                    if (interfaceC0874d32 instanceof U2) {
                        U2 u22 = (U2) interfaceC0874d32;
                        if (u22.f11714c == 3 && u22.f11719j == -1) {
                            u22.a(r15, new C1617tm());
                        }
                    }
                }
                return -1;
            }
            c1617tm2.i(i22 + e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void h(H h3) {
        this.f12627k = new C0905dr(h3, this.f12623e);
    }

    @Override // com.google.android.gms.internal.ads.F
    public final List j() {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        return C1761wv.f16184o;
    }
}
