package P1;

import A1.C0045t0;
import C1.C0095a;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v2.AbstractC1664a;
import w1.C1722m0;
import w1.V0;

/* loaded from: classes.dex */
public final class C implements F1.k {

    /* renamed from: a, reason: collision with root package name */
    public final int f5124a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5125b;

    /* renamed from: c, reason: collision with root package name */
    public final C0095a f5126c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f5127d;

    /* renamed from: e, reason: collision with root package name */
    public final B.v f5128e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f5129f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f5130g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f5131h;

    /* renamed from: i, reason: collision with root package name */
    public final w f5132i;
    public I1.b j;

    /* renamed from: k, reason: collision with root package name */
    public F1.m f5133k;

    /* renamed from: l, reason: collision with root package name */
    public int f5134l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5135m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5136n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5137o;

    /* renamed from: p, reason: collision with root package name */
    public E f5138p;

    /* renamed from: q, reason: collision with root package name */
    public int f5139q;

    /* renamed from: r, reason: collision with root package name */
    public int f5140r;

    public C(int i7, v2.s sVar, B.v vVar) {
        this.f5128e = vVar;
        this.f5124a = i7;
        if (i7 == 1 || i7 == 2) {
            this.f5125b = Collections.singletonList(sVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f5125b = arrayList;
            arrayList.add(sVar);
        }
        this.f5126c = new C0095a(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f5130g = sparseBooleanArray;
        this.f5131h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f5129f = sparseArray;
        this.f5127d = new SparseIntArray();
        this.f5132i = new w(1);
        this.f5133k = F1.m.f2545g;
        this.f5140r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i8 = 0; i8 < size; i8++) {
            sparseArray.put(sparseArray2.keyAt(i8), (E) sparseArray2.valueAt(i8));
        }
        sparseArray.put(0, new A(new V0(this)));
        this.f5138p = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r2 = r2 + 1;
     */
    @Override // F1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(F1.l lVar) {
        byte[] bArr = (byte[]) this.f5126c.f1465c;
        F1.h hVar = (F1.h) lVar;
        hVar.c(bArr, 0, 940, false);
        int i7 = 0;
        while (i7 < 188) {
            for (int i8 = 0; i8 < 5; i8++) {
                if (bArr[(i8 * 188) + i7] != 71) {
                    break;
                }
            }
            hVar.q(i7);
            return true;
        }
        return false;
    }

    @Override // F1.k
    public final void e(F1.m mVar) {
        this.f5133k = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v29 */
    @Override // F1.k
    public final int f(F1.l lVar, E4.y yVar) {
        ?? r32;
        int i7;
        ?? r22;
        long j;
        int i8;
        boolean z4;
        long j3;
        long j7;
        long j8 = ((F1.h) lVar).f2533c;
        boolean z7 = this.f5135m;
        int i9 = this.f5124a;
        if (z7) {
            w wVar = this.f5132i;
            if (j8 != -1 && i9 != 2 && !wVar.f5377d) {
                int i10 = this.f5140r;
                if (i10 <= 0) {
                    wVar.a((F1.h) lVar);
                    return 0;
                }
                boolean z8 = wVar.f5379f;
                C0095a c0095a = wVar.f5376c;
                if (!z8) {
                    F1.h hVar = (F1.h) lVar;
                    long j9 = hVar.f2533c;
                    int min = (int) Math.min(112800, j9);
                    long j10 = j9 - min;
                    if (hVar.f2534d == j10) {
                        c0095a.A(min);
                        hVar.f2536f = 0;
                        hVar.c((byte[]) c0095a.f1465c, 0, min, false);
                        int i11 = c0095a.f1463a;
                        int i12 = c0095a.f1464b;
                        int i13 = i12 - 188;
                        while (true) {
                            if (i13 < i11) {
                                j7 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = (byte[]) c0095a.f1465c;
                            int i14 = -4;
                            int i15 = 0;
                            while (true) {
                                if (i14 > 4) {
                                    break;
                                }
                                int i16 = (i14 * 188) + i13;
                                if (i16 < i11 || i16 >= i12 || bArr[i16] != 71) {
                                    i15 = 0;
                                } else {
                                    i15++;
                                    if (i15 == 5) {
                                        long F7 = P6.b.F(c0095a, i13, i10);
                                        if (F7 != -9223372036854775807L) {
                                            j7 = F7;
                                            break;
                                        }
                                    }
                                }
                                i14++;
                            }
                            i13--;
                        }
                        wVar.f5381h = j7;
                        wVar.f5379f = true;
                        return 0;
                    }
                    yVar.f2247a = j10;
                } else {
                    if (wVar.f5381h == -9223372036854775807L) {
                        wVar.a((F1.h) lVar);
                        return 0;
                    }
                    if (wVar.f5378e) {
                        long j11 = wVar.f5380g;
                        if (j11 == -9223372036854775807L) {
                            wVar.a((F1.h) lVar);
                            return 0;
                        }
                        v2.s sVar = wVar.f5375b;
                        long b7 = sVar.b(wVar.f5381h) - sVar.b(j11);
                        wVar.f5382i = b7;
                        if (b7 < 0) {
                            Log.w("TsDurationReader", "Invalid duration: " + wVar.f5382i + ". Using TIME_UNSET instead.");
                            wVar.f5382i = -9223372036854775807L;
                        }
                        wVar.a((F1.h) lVar);
                        return 0;
                    }
                    F1.h hVar2 = (F1.h) lVar;
                    int min2 = (int) Math.min(112800, hVar2.f2533c);
                    long j12 = 0;
                    if (hVar2.f2534d == j12) {
                        c0095a.A(min2);
                        hVar2.f2536f = 0;
                        hVar2.c((byte[]) c0095a.f1465c, 0, min2, false);
                        int i17 = c0095a.f1463a;
                        int i18 = c0095a.f1464b;
                        while (true) {
                            if (i17 >= i18) {
                                j3 = -9223372036854775807L;
                                break;
                            }
                            if (((byte[]) c0095a.f1465c)[i17] == 71) {
                                long F8 = P6.b.F(c0095a, i17, i10);
                                if (F8 != -9223372036854775807L) {
                                    j3 = F8;
                                    break;
                                }
                            }
                            i17++;
                        }
                        wVar.f5380g = j3;
                        wVar.f5378e = true;
                        return 0;
                    }
                    yVar.f2247a = j12;
                }
                return 1;
            }
            if (this.f5136n) {
                i7 = i9;
                j = j8;
            } else {
                this.f5136n = true;
                long j13 = wVar.f5382i;
                if (j13 != -9223372036854775807L) {
                    i7 = i9;
                    j = j8;
                    I1.b bVar = new I1.b(new C1722m0(3), new B1.m(this.f5140r, wVar.f5375b), j13, j13 + 1, 0L, j8, 188L, 940);
                    this.j = bVar;
                    this.f5133k.m(bVar.f3505a);
                } else {
                    i7 = i9;
                    j = j8;
                    this.f5133k.m(new F1.n(j13));
                }
            }
            if (this.f5137o) {
                z4 = false;
                this.f5137o = false;
                g(0L, 0L);
                if (((F1.h) lVar).f2534d != 0) {
                    yVar.f2247a = 0L;
                    return 1;
                }
            } else {
                z4 = false;
            }
            r32 = 1;
            r32 = 1;
            I1.b bVar2 = this.j;
            r22 = z4;
            if (bVar2 != null) {
                r22 = z4;
                if (bVar2.f3507c != null) {
                    return bVar2.b((F1.h) lVar, yVar);
                }
            }
        } else {
            r32 = 1;
            i7 = i9;
            r22 = 0;
            j = j8;
        }
        C0095a c0095a2 = this.f5126c;
        byte[] bArr2 = (byte[]) c0095a2.f1465c;
        if (9400 - c0095a2.f1463a < 188) {
            int d7 = c0095a2.d();
            if (d7 > 0) {
                System.arraycopy(bArr2, c0095a2.f1463a, bArr2, r22, d7);
            }
            c0095a2.B(d7, bArr2);
        }
        while (c0095a2.d() < 188) {
            int i19 = c0095a2.f1464b;
            int read = ((F1.h) lVar).read(bArr2, i19, 9400 - i19);
            if (read == -1) {
                return -1;
            }
            c0095a2.C(i19 + read);
        }
        int i20 = c0095a2.f1463a;
        int i21 = c0095a2.f1464b;
        byte[] bArr3 = (byte[]) c0095a2.f1465c;
        int i22 = i20;
        while (i22 < i21 && bArr3[i22] != 71) {
            i22++;
        }
        c0095a2.D(i22);
        int i23 = i22 + 188;
        if (i23 > i21) {
            int i24 = (i22 - i20) + this.f5139q;
            this.f5139q = i24;
            i8 = i7;
            if (i8 == 2 && i24 > 376) {
                throw C0045t0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            i8 = i7;
            this.f5139q = r22;
        }
        int i25 = c0095a2.f1464b;
        if (i23 > i25) {
            return r22;
        }
        int g3 = c0095a2.g();
        if ((8388608 & g3) != 0) {
            c0095a2.D(i23);
            return r22;
        }
        int i26 = (4194304 & g3) != 0 ? r32 : r22;
        int i27 = (2096896 & g3) >> 8;
        boolean z9 = (g3 & 32) != 0 ? r32 : r22;
        E e7 = (g3 & 16) != 0 ? (E) this.f5129f.get(i27) : null;
        if (e7 == null) {
            c0095a2.D(i23);
            return r22;
        }
        if (i8 != 2) {
            int i28 = g3 & 15;
            SparseIntArray sparseIntArray = this.f5127d;
            int i29 = sparseIntArray.get(i27, i28 - 1);
            sparseIntArray.put(i27, i28);
            if (i29 == i28) {
                c0095a2.D(i23);
                return r22;
            }
            if (i28 != ((i29 + r32) & 15)) {
                e7.b();
            }
        }
        if (z9) {
            int t7 = c0095a2.t();
            i26 |= (c0095a2.t() & 64) != 0 ? 2 : r22;
            c0095a2.E(t7 - r32);
        }
        boolean z10 = this.f5135m;
        if (i8 == 2 || z10 || !this.f5131h.get(i27, r22)) {
            c0095a2.C(i23);
            e7.a(i26, c0095a2);
            c0095a2.C(i25);
        }
        if (i8 != 2 && !z10 && this.f5135m && j != -1) {
            this.f5137o = r32;
        }
        c0095a2.D(i23);
        return r22;
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        I1.b bVar;
        long j7;
        AbstractC1664a.h(this.f5124a != 2);
        List list = this.f5125b;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            v2.s sVar = (v2.s) list.get(i7);
            synchronized (sVar) {
                j7 = sVar.f17150b;
            }
            boolean z4 = j7 == -9223372036854775807L;
            if (!z4) {
                long c3 = sVar.c();
                z4 = (c3 == -9223372036854775807L || c3 == 0 || c3 == j3) ? false : true;
            }
            if (z4) {
                sVar.d(j3);
            }
        }
        if (j3 != 0 && (bVar = this.j) != null) {
            bVar.d(j3);
        }
        this.f5126c.A(0);
        this.f5127d.clear();
        int i8 = 0;
        while (true) {
            SparseArray sparseArray = this.f5129f;
            if (i8 >= sparseArray.size()) {
                this.f5139q = 0;
                return;
            } else {
                ((E) sparseArray.valueAt(i8)).b();
                i8++;
            }
        }
    }

    @Override // F1.k
    public final void release() {
    }
}
