package P1;

import A1.C0045t0;
import C1.C0095a;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p155w1.C1013m0;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class C implements F1.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0095a f5126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f5127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B.v f5128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray f5129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f5130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f5131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f5132i;
    public I1.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public F1.m f5133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public E f5138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5139q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5140r;

    public C(int i7, p151v2.s sVar, B.v vVar) {
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

    @Override // F1.k
    public final boolean a(F1.l lVar) {
        byte[] bArr = (byte[]) this.f5126c.f1465c;
        F1.h hVar = (F1.h) lVar;
        hVar.c(bArr, 0, 940, false);
        for (int i7 = 0; i7 < 188; i7++) {
            int i8 = 0;
            while (true) {
                if (i8 >= 5) {
                    hVar.q(i7);
                    return true;
                }
                if (bArr[(i8 * 188) + i7] != 71) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    @Override // F1.k
    public final void e(F1.m mVar) {
        this.f5133k = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [P1.E] */
    /* JADX WARN: Type inference failed for: r8v20 */
    @Override // F1.k
    public final int f(F1.l lVar, E4.y yVar) throws C0045t0, EOFException, InterruptedIOException {
        ?? r7;
        ?? r8;
        int i7;
        E e7;
        boolean z4;
        long j;
        long j3;
        long j7 = ((F1.h) lVar).f2533c;
        boolean z7 = this.f5135m;
        int i8 = this.f5124a;
        if (z7) {
            w wVar = this.f5132i;
            if (j7 != -1 && i8 != 2 && !wVar.f5377d) {
                int i9 = this.f5140r;
                if (i9 <= 0) {
                    wVar.a((F1.h) lVar);
                    return 0;
                }
                boolean z8 = wVar.f5379f;
                C0095a c0095a = wVar.f5376c;
                if (!z8) {
                    F1.h hVar = (F1.h) lVar;
                    long j8 = hVar.f2533c;
                    int iMin = (int) Math.min(112800, j8);
                    long j9 = j8 - ((long) iMin);
                    if (hVar.f2534d == j9) {
                        c0095a.A(iMin);
                        hVar.f2536f = 0;
                        hVar.c((byte[]) c0095a.f1465c, 0, iMin, false);
                        int i10 = c0095a.f1463a;
                        int i11 = c0095a.f1464b;
                        for (int i12 = i11 - 188; i12 >= i10; i12--) {
                            byte[] bArr = (byte[]) c0095a.f1465c;
                            int i13 = 0;
                            for (int i14 = -4; i14 <= 4; i14++) {
                                int i15 = (i14 * 188) + i12;
                                if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                                    i13 = 0;
                                } else {
                                    i13++;
                                    if (i13 == 5) {
                                        long jF = P6.b.F(c0095a, i12, i9);
                                        if (jF == -9223372036854775807L) {
                                            break;
                                        }
                                        j3 = jF;
                                        wVar.f5381h = j3;
                                        wVar.f5379f = true;
                                        return 0;
                                    }
                                }
                            }
                        }
                        j3 = -9223372036854775807L;
                        wVar.f5381h = j3;
                        wVar.f5379f = true;
                        return 0;
                    }
                    yVar.f2247a = j9;
                } else {
                    if (wVar.f5381h == -9223372036854775807L) {
                        wVar.a((F1.h) lVar);
                        return 0;
                    }
                    if (wVar.f5378e) {
                        long j10 = wVar.f5380g;
                        if (j10 == -9223372036854775807L) {
                            wVar.a((F1.h) lVar);
                            return 0;
                        }
                        p151v2.s sVar = wVar.f5375b;
                        long jB = sVar.b(wVar.f5381h) - sVar.b(j10);
                        wVar.f5382i = jB;
                        if (jB < 0) {
                            Log.w("TsDurationReader", "Invalid duration: " + wVar.f5382i + ". Using TIME_UNSET instead.");
                            wVar.f5382i = -9223372036854775807L;
                        }
                        wVar.a((F1.h) lVar);
                        return 0;
                    }
                    F1.h hVar2 = (F1.h) lVar;
                    int iMin2 = (int) Math.min(112800, hVar2.f2533c);
                    long j11 = 0;
                    if (hVar2.f2534d == j11) {
                        c0095a.A(iMin2);
                        hVar2.f2536f = 0;
                        hVar2.c((byte[]) c0095a.f1465c, 0, iMin2, false);
                        int i16 = c0095a.f1464b;
                        for (int i17 = c0095a.f1463a; i17 < i16; i17++) {
                            if (((byte[]) c0095a.f1465c)[i17] == 71) {
                                long jF2 = P6.b.F(c0095a, i17, i9);
                                if (jF2 != -9223372036854775807L) {
                                    j = jF2;
                                    wVar.f5380g = j;
                                    wVar.f5378e = true;
                                    return 0;
                                }
                            }
                        }
                        j = -9223372036854775807L;
                        wVar.f5380g = j;
                        wVar.f5378e = true;
                        return 0;
                    }
                    yVar.f2247a = j11;
                }
                return 1;
            }
            if (!this.f5136n) {
                this.f5136n = true;
                long j12 = wVar.f5382i;
                if (j12 != -9223372036854775807L) {
                    I1.b bVar = new I1.b(new C1013m0(3), new B1.m(this.f5140r, wVar.f5375b), j12, j12 + 1, 0L, j7, 188L, 940);
                    this.j = bVar;
                    this.f5133k.m(bVar.f3505a);
                } else {
                    this.f5133k.m(new F1.n(j12));
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
            r7 = 1;
            r7 = 1;
            I1.b bVar2 = this.j;
            r8 = z4;
            if (bVar2 != null && bVar2.f3507c != null) {
                r8 = z4;
                return bVar2.b((F1.h) lVar, yVar);
            }
        } else {
            r7 = 1;
            i8 = i8;
            r8 = 0;
            j7 = j7;
        }
        r8 = z4;
        C0095a c0095a2 = this.f5126c;
        byte[] bArr2 = (byte[]) c0095a2.f1465c;
        if (9400 - c0095a2.f1463a < 188) {
            int iD = c0095a2.d();
            if (iD > 0) {
                System.arraycopy(bArr2, c0095a2.f1463a, bArr2, r8, iD);
            }
            c0095a2.B(iD, bArr2);
        }
        while (c0095a2.d() < 188) {
            int i18 = c0095a2.f1464b;
            int i19 = ((F1.h) lVar).read(bArr2, i18, 9400 - i18);
            if (i19 == -1) {
                return -1;
            }
            c0095a2.C(i18 + i19);
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
        ?? r9 = 0;
        if (i23 > i21) {
            int i24 = (i22 - i20) + this.f5139q;
            this.f5139q = i24;
            i7 = i8;
            if (i7 == 2 && i24 > 376) {
                throw C0045t0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            i7 = i8;
            this.f5139q = r8;
        }
        int i25 = c0095a2.f1464b;
        if (i23 > i25) {
            return r8;
        }
        int iG = c0095a2.g();
        if ((8388608 & iG) != 0) {
            c0095a2.D(i23);
            return r8;
        }
        ?? r13 = (4194304 & iG) != 0 ? r7 : r8;
        int i26 = (2096896 & iG) >> 8;
        ?? r10 = (iG & 32) != 0 ? r7 : r8;
        if ((iG & 16) != 0) {
            e7 = (E) this.f5129f.get(i26);
        }
        if (r9 == 0) {
            r9 = e7;
            c0095a2.D(i23);
            return r8;
        }
        if (i7 != 2) {
            int i27 = iG & 15;
            SparseIntArray sparseIntArray = this.f5127d;
            int i28 = sparseIntArray.get(i26, i27 - 1);
            sparseIntArray.put(i26, i27);
            if (i28 == i27) {
                r9 = e7;
                c0095a2.D(i23);
                return r8;
            }
            if (i27 != ((i28 + r7) & 15)) {
                r9 = e7;
                r9.b();
            }
        }
        if (r10 != 0) {
            int iT = c0095a2.t();
            r13 = (r13 == true ? 1 : 0) | ((c0095a2.t() & 64) != 0 ? 2 : r8);
            c0095a2.E(iT - r7);
        }
        boolean z9 = this.f5135m;
        if (i7 == 2 || z9 || !this.f5131h.get(i26, r8)) {
            c0095a2.C(i23);
            r9.a(r13, c0095a2);
            c0095a2.C(i25);
        }
        if (i7 != 2 && !z9 && this.f5135m && j7 != -1) {
            this.f5137o = r7;
        }
        c0095a2.D(i23);
        return r8;
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        I1.b bVar;
        long j7;
        p151v2.a.h(this.f5124a != 2);
        List list = this.f5125b;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            p151v2.s sVar = (p151v2.s) list.get(i7);
            synchronized (sVar) {
                j7 = sVar.f17156b;
            }
            boolean z4 = j7 == -9223372036854775807L;
            if (!z4) {
                long jC = sVar.c();
                z4 = (jC == -9223372036854775807L || jC == 0 || jC == j3) ? false : true;
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
