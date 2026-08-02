package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class MG implements InterfaceC0737a0 {

    /* renamed from: A, reason: collision with root package name */
    public Dp f10611A;

    /* renamed from: a, reason: collision with root package name */
    public final KG f10612a;

    /* renamed from: d, reason: collision with root package name */
    public final C1543s1 f10615d;

    /* renamed from: e, reason: collision with root package name */
    public HG f10616e;
    public C1407p f;

    /* renamed from: n, reason: collision with root package name */
    public int f10623n;

    /* renamed from: o, reason: collision with root package name */
    public int f10624o;

    /* renamed from: p, reason: collision with root package name */
    public int f10625p;

    /* renamed from: q, reason: collision with root package name */
    public int f10626q;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10630u;

    /* renamed from: x, reason: collision with root package name */
    public C1407p f10633x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10635z;

    /* renamed from: b, reason: collision with root package name */
    public final Q1 f10613b = new Q1();

    /* renamed from: g, reason: collision with root package name */
    public int f10617g = 1000;

    /* renamed from: h, reason: collision with root package name */
    public long[] f10618h = new long[1000];
    public long[] i = new long[1000];

    /* renamed from: l, reason: collision with root package name */
    public long[] f10621l = new long[1000];

    /* renamed from: k, reason: collision with root package name */
    public int[] f10620k = new int[1000];

    /* renamed from: j, reason: collision with root package name */
    public int[] f10619j = new int[1000];

    /* renamed from: m, reason: collision with root package name */
    public Z[] f10622m = new Z[1000];

    /* renamed from: c, reason: collision with root package name */
    public final G3 f10614c = new G3(new RE(12));

    /* renamed from: r, reason: collision with root package name */
    public long f10627r = Long.MIN_VALUE;

    /* renamed from: s, reason: collision with root package name */
    public long f10628s = Long.MIN_VALUE;

    /* renamed from: t, reason: collision with root package name */
    public long f10629t = Long.MIN_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10632w = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10631v = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10634y = true;

    public MG(C1425pH c1425pH, C1543s1 c1543s1, C1872zF c1872zF) {
        this.f10615d = c1543s1;
        this.f10612a = new KG(c1425pH);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0737a0
    public final int a(DE de, int i, boolean z3) {
        KG kg = this.f10612a;
        int b3 = kg.b(i);
        B.N n5 = kg.f10149d;
        C1290mH c1290mH = (C1290mH) n5.f655m;
        byte[] bArr = c1290mH.f14494a;
        long j5 = kg.f10150e - n5.f653k;
        c1290mH.getClass();
        int e3 = de.e(bArr, (int) j5, b3);
        if (e3 == -1) {
            if (z3) {
                return -1;
            }
            throw new EOFException();
        }
        long j6 = kg.f10150e + e3;
        kg.f10150e = j6;
        B.N n6 = kg.f10149d;
        if (j6 == n6.f654l) {
            kg.f10149d = (B.N) n6.f656n;
        }
        return e3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0737a0
    public final int b(DE de, int i, boolean z3) {
        return a(de, i, z3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0737a0
    public final void c(int i, C1617tm c1617tm) {
        f(c1617tm, i, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bd, code lost:
    
        if (((com.google.android.gms.internal.ads.LG) ((android.util.SparseArray) r9.f10614c.f9166m).valueAt(r10.size() - 1)).f10333a.equals(r9.f10633x) == false) goto L41;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC0737a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j5, int i, int i5, int i6, Z z3) {
        if (this.f10631v) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.f10631v = false;
            }
        }
        if (this.f10634y) {
            if (j5 < this.f10627r) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.f10635z) {
                    JB.l("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f10633x)));
                    this.f10635z = true;
                }
                i |= 1;
            }
        }
        long j6 = (this.f10612a.f10150e - i5) - i6;
        synchronized (this) {
            try {
                int i7 = this.f10623n;
                if (i7 > 0) {
                    int i8 = i(i7 - 1);
                    AbstractC1668us.S(this.i[i8] + ((long) this.f10619j[i8]) <= j6);
                }
                this.f10630u = (536870912 & i) != 0;
                this.f10629t = Math.max(this.f10629t, j5);
                int i9 = i(this.f10623n);
                this.f10621l[i9] = j5;
                this.i[i9] = j6;
                this.f10619j[i9] = i5;
                this.f10620k[i9] = i;
                this.f10622m[i9] = z3;
                this.f10618h[i9] = 0;
                if (!(((SparseArray) this.f10614c.f9166m).size() == 0)) {
                }
                C1407p c1407p = this.f10633x;
                if (c1407p == null) {
                    throw null;
                }
                this.f10615d.getClass();
                G3 g32 = this.f10614c;
                int i10 = this.f10624o + this.f10623n;
                LG lg = new LG(c1407p);
                int i11 = g32.f9165l;
                SparseArray sparseArray = (SparseArray) g32.f9166m;
                if (i11 == -1) {
                    AbstractC1668us.a0(sparseArray.size() == 0);
                    g32.f9165l = 0;
                }
                if (sparseArray.size() > 0) {
                    int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
                    AbstractC1668us.S(i10 >= keyAt);
                    if (keyAt == i10) {
                        ((RE) g32.f9167n).mo11k(sparseArray.valueAt(sparseArray.size() - 1));
                    }
                }
                sparseArray.append(i10, lg);
                int i12 = this.f10623n + 1;
                this.f10623n = i12;
                int i13 = this.f10617g;
                if (i12 == i13) {
                    int i14 = i13 + 1000;
                    long[] jArr = new long[i14];
                    long[] jArr2 = new long[i14];
                    long[] jArr3 = new long[i14];
                    int[] iArr = new int[i14];
                    int[] iArr2 = new int[i14];
                    Z[] zArr = new Z[i14];
                    int i15 = this.f10625p;
                    int i16 = i13 - i15;
                    System.arraycopy(this.i, i15, jArr2, 0, i16);
                    System.arraycopy(this.f10621l, this.f10625p, jArr3, 0, i16);
                    System.arraycopy(this.f10620k, this.f10625p, iArr, 0, i16);
                    System.arraycopy(this.f10619j, this.f10625p, iArr2, 0, i16);
                    System.arraycopy(this.f10622m, this.f10625p, zArr, 0, i16);
                    System.arraycopy(this.f10618h, this.f10625p, jArr, 0, i16);
                    int i17 = this.f10625p;
                    System.arraycopy(this.i, 0, jArr2, i16, i17);
                    System.arraycopy(this.f10621l, 0, jArr3, i16, i17);
                    System.arraycopy(this.f10620k, 0, iArr, i16, i17);
                    System.arraycopy(this.f10619j, 0, iArr2, i16, i17);
                    System.arraycopy(this.f10622m, 0, zArr, i16, i17);
                    System.arraycopy(this.f10618h, 0, jArr, i16, i17);
                    this.i = jArr2;
                    this.f10621l = jArr3;
                    this.f10620k = iArr;
                    this.f10619j = iArr2;
                    this.f10622m = zArr;
                    this.f10618h = jArr;
                    this.f10625p = 0;
                    this.f10617g = i14;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0737a0
    public final void e(C1407p c1407p) {
        boolean z3;
        synchronized (this) {
            z3 = false;
            try {
                this.f10632w = false;
                if (!Objects.equals(c1407p, this.f10633x)) {
                    if (!(((SparseArray) this.f10614c.f9166m).size() == 0)) {
                        if (((LG) ((SparseArray) this.f10614c.f9166m).valueAt(r1.size() - 1)).f10333a.equals(c1407p)) {
                            this.f10633x = ((LG) ((SparseArray) this.f10614c.f9166m).valueAt(r5.size() - 1)).f10333a;
                            boolean z5 = this.f10634y;
                            C1407p c1407p2 = this.f10633x;
                            this.f10634y = z5 & AbstractC1593t6.f(c1407p2.f14904m, c1407p2.f14901j);
                            this.f10635z = false;
                            z3 = true;
                        }
                    }
                    this.f10633x = c1407p;
                    boolean z52 = this.f10634y;
                    C1407p c1407p22 = this.f10633x;
                    this.f10634y = z52 & AbstractC1593t6.f(c1407p22.f14904m, c1407p22.f14901j);
                    this.f10635z = false;
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        HG hg = this.f10616e;
        if (hg == null || !z3) {
            return;
        }
        hg.f9392x.post(hg.f9390v);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0737a0
    public final void f(C1617tm c1617tm, int i, int i5) {
        while (true) {
            KG kg = this.f10612a;
            if (i <= 0) {
                kg.getClass();
                return;
            }
            int b3 = kg.b(i);
            B.N n5 = kg.f10149d;
            C1290mH c1290mH = (C1290mH) n5.f655m;
            byte[] bArr = c1290mH.f14494a;
            long j5 = kg.f10150e - n5.f653k;
            c1290mH.getClass();
            c1617tm.f(bArr, (int) j5, b3);
            i -= b3;
            long j6 = kg.f10150e + b3;
            kg.f10150e = j6;
            B.N n6 = kg.f10149d;
            if (j6 == n6.f654l) {
                kg.f10149d = (B.N) n6.f656n;
            }
        }
    }

    public final synchronized boolean g(long j5, boolean z3) {
        Throwable th;
        MG mg;
        long j6;
        int h3;
        try {
            try {
                l();
                int i = this.f10626q;
                int i5 = i(i);
                int i6 = this.f10626q;
                int i7 = this.f10623n;
                if ((i6 != i7) && j5 >= this.f10621l[i5]) {
                    if (j5 > this.f10629t) {
                        if (z3) {
                            z3 = true;
                        }
                    }
                    if (this.f10634y) {
                        h3 = i7 - i;
                        int i8 = 0;
                        while (true) {
                            if (i8 < h3) {
                                try {
                                    if (this.f10621l[i5] >= j5) {
                                        mg = this;
                                        j6 = j5;
                                        h3 = i8;
                                        break;
                                    }
                                    i5++;
                                    if (i5 == this.f10617g) {
                                        i5 = 0;
                                    }
                                    i8++;
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            } else {
                                mg = this;
                                j6 = j5;
                                if (!z3) {
                                    h3 = -1;
                                }
                            }
                        }
                    } else {
                        mg = this;
                        j6 = j5;
                        h3 = mg.h(i5, i7 - i, j6, true);
                    }
                    if (h3 == -1) {
                        return false;
                    }
                    mg.f10627r = j6;
                    mg.f10626q += h3;
                    return true;
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final int h(int i, int i5, long j5, boolean z3) {
        int i6 = -1;
        for (int i7 = 0; i7 < i5; i7++) {
            long j6 = this.f10621l[i];
            if (j6 > j5) {
                break;
            }
            if (!z3 || (this.f10620k[i] & 1) != 0) {
                if (j6 == j5) {
                    return i7;
                }
                i6 = i7;
            }
            i++;
            if (i == this.f10617g) {
                i = 0;
            }
        }
        return i6;
    }

    public final int i(int i) {
        int i5 = this.f10625p + i;
        int i6 = this.f10617g;
        return i5 < i6 ? i5 : i5 - i6;
    }

    public final long j(int i) {
        long j5 = this.f10628s;
        long j6 = Long.MIN_VALUE;
        int i5 = 0;
        if (i != 0) {
            int i6 = i(i - 1);
            for (int i7 = 0; i7 < i; i7++) {
                j6 = Math.max(j6, this.f10621l[i6]);
                if ((this.f10620k[i6] & 1) != 0) {
                    break;
                }
                i6--;
                if (i6 == -1) {
                    i6 = this.f10617g - 1;
                }
            }
        }
        this.f10628s = Math.max(j5, j6);
        this.f10623n -= i;
        int i8 = this.f10624o + i;
        this.f10624o = i8;
        int i9 = this.f10625p + i;
        this.f10625p = i9;
        int i10 = this.f10617g;
        if (i9 >= i10) {
            this.f10625p = i9 - i10;
        }
        int i11 = this.f10626q - i;
        this.f10626q = i11;
        if (i11 < 0) {
            this.f10626q = 0;
        }
        while (true) {
            G3 g32 = this.f10614c;
            SparseArray sparseArray = (SparseArray) g32.f9166m;
            if (i5 >= sparseArray.size() - 1) {
                break;
            }
            int i12 = i5 + 1;
            if (i8 < sparseArray.keyAt(i12)) {
                break;
            }
            ((RE) g32.f9167n).mo11k(sparseArray.valueAt(i5));
            sparseArray.removeAt(i5);
            int i13 = g32.f9165l;
            if (i13 > 0) {
                g32.f9165l = i13 - 1;
            }
            i5 = i12;
        }
        if (this.f10623n != 0) {
            return this.i[this.f10625p];
        }
        int i14 = this.f10625p;
        if (i14 == 0) {
            i14 = this.f10617g;
        }
        return this.i[i14 - 1] + this.f10619j[r12];
    }

    public final void k(C1407p c1407p, C1667ur c1667ur) {
        C1407p c1407p2 = this.f;
        C1334nG c1334nG = c1407p2 == null ? null : c1407p2.f14908q;
        this.f = c1407p;
        C1334nG c1334nG2 = c1407p.f14908q;
        C1543s1 c1543s1 = this.f10615d;
        c1543s1.getClass();
        C1334nG c1334nG3 = c1407p.f14908q;
        int i = c1334nG3 != null ? 1 : 0;
        C1649uH c1649uH = new C1649uH(c1407p);
        c1649uH.f15838H = i;
        c1667ur.f15914l = new C1407p(c1649uH);
        c1667ur.f15915m = this.f10611A;
        if (c1407p2 == null || !Objects.equals(c1334nG, c1334nG2)) {
            c1543s1.getClass();
            Dp dp = c1334nG3 != null ? new Dp(14, new C1782xF(new CF())) : null;
            this.f10611A = dp;
            c1667ur.f15915m = dp;
        }
    }

    public final synchronized void l() {
        this.f10626q = 0;
        KG kg = this.f10612a;
        kg.f10148c = kg.f10147b;
    }

    public final synchronized long m() {
        return this.f10629t;
    }

    public final synchronized C1407p n() {
        if (this.f10632w) {
            return null;
        }
        return this.f10633x;
    }

    public final void o() {
        long j5;
        KG kg = this.f10612a;
        synchronized (this) {
            int i = this.f10623n;
            j5 = i == 0 ? -1L : j(i);
        }
        kg.a(j5);
    }

    public final void p(boolean z3) {
        SparseArray sparseArray;
        KG kg = this.f10612a;
        B.N n5 = kg.f10147b;
        if (((C1290mH) n5.f655m) != null) {
            C1425pH c1425pH = kg.f;
            synchronized (c1425pH) {
                B.N n6 = n5;
                while (n6 != null) {
                    try {
                        C1290mH[] c1290mHArr = c1425pH.f14991d;
                        int i = c1425pH.f14990c;
                        c1425pH.f14990c = i + 1;
                        C1290mH c1290mH = (C1290mH) n6.f655m;
                        c1290mH.getClass();
                        c1290mHArr[i] = c1290mH;
                        c1425pH.f14989b--;
                        n6 = (B.N) n6.f656n;
                        if (n6 == null || ((C1290mH) n6.f655m) == null) {
                            n6 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c1425pH.notifyAll();
            }
            n5.f655m = null;
            n5.f656n = null;
        }
        B.N n7 = kg.f10147b;
        int i5 = 0;
        AbstractC1668us.a0(((C1290mH) n7.f655m) == null);
        n7.f653k = 0L;
        n7.f654l = 65536L;
        B.N n8 = kg.f10147b;
        kg.f10148c = n8;
        kg.f10149d = n8;
        kg.f10150e = 0L;
        kg.f.b();
        this.f10623n = 0;
        this.f10624o = 0;
        this.f10625p = 0;
        this.f10626q = 0;
        this.f10631v = true;
        this.f10627r = Long.MIN_VALUE;
        this.f10628s = Long.MIN_VALUE;
        this.f10629t = Long.MIN_VALUE;
        this.f10630u = false;
        G3 g32 = this.f10614c;
        while (true) {
            sparseArray = (SparseArray) g32.f9166m;
            if (i5 >= sparseArray.size()) {
                break;
            }
            ((RE) g32.f9167n).mo11k(sparseArray.valueAt(i5));
            i5++;
        }
        g32.f9165l = -1;
        sparseArray.clear();
        if (z3) {
            this.f10633x = null;
            this.f10632w = true;
            this.f10634y = true;
        }
    }

    public final synchronized void q(int i) {
        boolean z3 = false;
        if (i >= 0) {
            try {
                if (this.f10626q + i <= this.f10623n) {
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC1668us.S(z3);
        this.f10626q += i;
    }

    public final synchronized boolean r(boolean z3) {
        int i = this.f10626q;
        boolean z5 = false;
        if (i != this.f10623n) {
            if (((LG) this.f10614c.b(this.f10624o + i)).f10333a != this.f) {
                return true;
            }
            int i5 = i(this.f10626q);
            if (this.f10611A != null) {
                int i6 = this.f10620k[i5];
            } else {
                z5 = true;
            }
            return z5;
        }
        if (!z3 && !this.f10630u) {
            C1407p c1407p = this.f10633x;
            if (c1407p != null) {
                if (c1407p == this.f) {
                    return false;
                }
            }
            return z5;
        }
        z5 = true;
        return z5;
    }
}
