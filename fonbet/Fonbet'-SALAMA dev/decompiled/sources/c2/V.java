package c2;

import C1.C0095a;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.crypto.tink.shaded.protobuf.C0868d;
import java.io.EOFException;
import java.util.ArrayList;
import u2.C1624a;
import u2.InterfaceC1633j;
import v2.AbstractC1664a;
import w1.C1719l1;
import w1.V0;

/* loaded from: classes.dex */
public class V implements F1.v {

    /* renamed from: A, reason: collision with root package name */
    public A1.X f10261A;

    /* renamed from: B, reason: collision with root package name */
    public A1.X f10262B;

    /* renamed from: C, reason: collision with root package name */
    public int f10263C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f10264D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f10265E;

    /* renamed from: F, reason: collision with root package name */
    public long f10266F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f10267G;

    /* renamed from: a, reason: collision with root package name */
    public final S f10268a;

    /* renamed from: d, reason: collision with root package name */
    public final E1.h f10271d;

    /* renamed from: e, reason: collision with root package name */
    public final B1.m f10272e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10273f;

    /* renamed from: g, reason: collision with root package name */
    public A1.X f10274g;

    /* renamed from: h, reason: collision with root package name */
    public C1719l1 f10275h;

    /* renamed from: p, reason: collision with root package name */
    public int f10282p;

    /* renamed from: q, reason: collision with root package name */
    public int f10283q;

    /* renamed from: r, reason: collision with root package name */
    public int f10284r;

    /* renamed from: s, reason: collision with root package name */
    public int f10285s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10289w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10292z;

    /* renamed from: b, reason: collision with root package name */
    public final C0868d f10269b = new C0868d();

    /* renamed from: i, reason: collision with root package name */
    public int f10276i = zzbbd.zzq.zzf;
    public int[] j = new int[zzbbd.zzq.zzf];

    /* renamed from: k, reason: collision with root package name */
    public long[] f10277k = new long[zzbbd.zzq.zzf];

    /* renamed from: n, reason: collision with root package name */
    public long[] f10280n = new long[zzbbd.zzq.zzf];

    /* renamed from: m, reason: collision with root package name */
    public int[] f10279m = new int[zzbbd.zzq.zzf];

    /* renamed from: l, reason: collision with root package name */
    public int[] f10278l = new int[zzbbd.zzq.zzf];

    /* renamed from: o, reason: collision with root package name */
    public F1.u[] f10281o = new F1.u[zzbbd.zzq.zzf];

    /* renamed from: c, reason: collision with root package name */
    public final B1.m f10270c = new B1.m(new R5.M(14));

    /* renamed from: t, reason: collision with root package name */
    public long f10286t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f10287u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f10288v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10291y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10290x = true;

    public V(u2.r rVar, E1.h hVar, B1.m mVar) {
        this.f10271d = hVar;
        this.f10272e = mVar;
        this.f10268a = new S(rVar);
    }

    public final synchronized void A(int i7) {
        boolean z4;
        if (i7 >= 0) {
            try {
                if (this.f10285s + i7 <= this.f10282p) {
                    z4 = true;
                    AbstractC1664a.f(z4);
                    this.f10285s += i7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z4 = false;
        AbstractC1664a.f(z4);
        this.f10285s += i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x010f, code lost:
    
        if (r6 == 16) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Type inference failed for: r6v31, types: [c2.U, java.lang.Object] */
    @Override // F1.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(A1.X x4) {
        String str;
        boolean z4;
        boolean z7 = true;
        A1.X l7 = l(x4);
        this.f10292z = false;
        this.f10261A = x4;
        synchronized (this) {
            try {
                this.f10291y = false;
                if (v2.t.a(l7, this.f10262B)) {
                    z7 = false;
                } else {
                    if (!(((SparseArray) this.f10270c.f1015c).size() == 0)) {
                        SparseArray sparseArray = (SparseArray) this.f10270c.f1015c;
                        if (((T) sparseArray.valueAt(sparseArray.size() - 1)).f10259a.equals(l7)) {
                            SparseArray sparseArray2 = (SparseArray) this.f10270c.f1015c;
                            this.f10262B = ((T) sparseArray2.valueAt(sparseArray2.size() - 1)).f10259a;
                            A1.X x7 = this.f10262B;
                            str = x7.f283C;
                            String str2 = x7.f312z;
                            ArrayList arrayList = v2.i.f17109a;
                            if (str != null) {
                                switch (str) {
                                    case "audio/eac3-joc":
                                    case "audio/mpeg-L1":
                                    case "audio/mpeg-L2":
                                    case "audio/ac3":
                                    case "audio/raw":
                                    case "audio/eac3":
                                    case "audio/flac":
                                    case "audio/mpeg":
                                    case "audio/g711-alaw":
                                    case "audio/g711-mlaw":
                                        z4 = true;
                                        break;
                                    case "audio/mp4a-latm":
                                        if (str2 != null) {
                                            B1.l e7 = v2.i.e(str2);
                                            if (e7 == null) {
                                                break;
                                            } else {
                                                int a2 = e7.a();
                                                if (a2 != 0) {
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                }
                                this.f10264D = z4;
                                this.f10265E = false;
                            }
                            z4 = false;
                            this.f10264D = z4;
                            this.f10265E = false;
                        }
                    }
                    this.f10262B = l7;
                    A1.X x72 = this.f10262B;
                    str = x72.f283C;
                    String str22 = x72.f312z;
                    ArrayList arrayList2 = v2.i.f17109a;
                    if (str != null) {
                    }
                    z4 = false;
                    this.f10264D = z4;
                    this.f10265E = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ?? r62 = this.f10273f;
        if (r62 == 0 || !z7) {
            return;
        }
        r62.b();
    }

    @Override // F1.v
    public final void c(int i7, C0095a c0095a) {
        while (true) {
            S s7 = this.f10268a;
            if (i7 <= 0) {
                s7.getClass();
                return;
            }
            int c3 = s7.c(i7);
            O1.c cVar = s7.f10257f;
            C1624a c1624a = (C1624a) cVar.f4935c;
            c0095a.f(c1624a.f16765a, ((int) (s7.f10258g - cVar.f4933a)) + c1624a.f16766b, c3);
            i7 -= c3;
            long j = s7.f10258g + c3;
            s7.f10258g = j;
            O1.c cVar2 = s7.f10257f;
            if (j == cVar2.f4934b) {
                s7.f10257f = (O1.c) cVar2.f4936d;
            }
        }
    }

    @Override // F1.v
    public final int d(InterfaceC1633j interfaceC1633j, int i7, boolean z4) {
        S s7 = this.f10268a;
        int c3 = s7.c(i7);
        O1.c cVar = s7.f10257f;
        C1624a c1624a = (C1624a) cVar.f4935c;
        int read = interfaceC1633j.read(c1624a.f16765a, ((int) (s7.f10258g - cVar.f4933a)) + c1624a.f16766b, c3);
        if (read == -1) {
            if (z4) {
                return -1;
            }
            throw new EOFException();
        }
        long j = s7.f10258g + read;
        s7.f10258g = j;
        O1.c cVar2 = s7.f10257f;
        if (j != cVar2.f4934b) {
            return read;
        }
        s7.f10257f = (O1.c) cVar2.f4936d;
        return read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x013b, code lost:
    
        if (((c2.T) r0.valueAt(r0.size() - 1)).f10259a.equals(r16.f10262B) == false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // F1.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(long j, int i7, int i8, int i9, F1.u uVar) {
        int i10;
        E1.g gVar;
        boolean z4;
        if (this.f10292z) {
            A1.X x4 = this.f10261A;
            AbstractC1664a.i(x4);
            a(x4);
        }
        int i11 = i7 & 1;
        boolean z7 = i11 != 0;
        if (this.f10290x) {
            if (!z7) {
                return;
            } else {
                this.f10290x = false;
            }
        }
        long j3 = j + this.f10266F;
        if (this.f10264D) {
            if (j3 < this.f10286t) {
                return;
            }
            if (i11 == 0) {
                if (!this.f10265E) {
                    Log.w("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f10262B);
                    this.f10265E = true;
                }
                i10 = i7 | 1;
                if (this.f10267G) {
                    if (!z7) {
                        return;
                    }
                    synchronized (this) {
                        if (this.f10282p == 0) {
                            z4 = j3 > this.f10287u;
                        } else {
                            synchronized (this) {
                                long max = Math.max(this.f10287u, m(this.f10285s));
                                if (max >= j3) {
                                    z4 = false;
                                } else {
                                    int i12 = this.f10282p;
                                    int o7 = o(i12 - 1);
                                    while (i12 > this.f10285s && this.f10280n[o7] >= j3) {
                                        i12--;
                                        o7--;
                                        if (o7 == -1) {
                                            o7 = this.f10276i - 1;
                                        }
                                    }
                                    i(this.f10283q + i12);
                                    z4 = true;
                                }
                            }
                        }
                    }
                    if (!z4) {
                        return;
                    } else {
                        this.f10267G = false;
                    }
                }
                long j7 = (this.f10268a.f10258g - i8) - i9;
                synchronized (this) {
                    try {
                        int i13 = this.f10282p;
                        if (i13 > 0) {
                            int o8 = o(i13 - 1);
                            AbstractC1664a.f(this.f10277k[o8] + ((long) this.f10278l[o8]) <= j7);
                        }
                        this.f10289w = (536870912 & i10) != 0;
                        this.f10288v = Math.max(this.f10288v, j3);
                        int o9 = o(this.f10282p);
                        this.f10280n[o9] = j3;
                        this.f10277k[o9] = j7;
                        this.f10278l[o9] = i8;
                        this.f10279m[o9] = i10;
                        this.f10281o[o9] = uVar;
                        this.j[o9] = this.f10263C;
                        if (!(((SparseArray) this.f10270c.f1015c).size() == 0)) {
                            SparseArray sparseArray = (SparseArray) this.f10270c.f1015c;
                        }
                        E1.h hVar = this.f10271d;
                        if (hVar != null) {
                            hVar.getClass();
                            gVar = E1.g.f1903a;
                        } else {
                            gVar = E1.g.f1903a;
                        }
                        B1.m mVar = this.f10270c;
                        int i14 = this.f10283q + this.f10282p;
                        A1.X x7 = this.f10262B;
                        x7.getClass();
                        T t7 = new T(x7, gVar);
                        int i15 = mVar.f1014b;
                        SparseArray sparseArray2 = (SparseArray) mVar.f1015c;
                        if (i15 == -1) {
                            AbstractC1664a.h(sparseArray2.size() == 0);
                            mVar.f1014b = 0;
                        }
                        if (sparseArray2.size() > 0) {
                            int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                            AbstractC1664a.f(i14 >= keyAt);
                            if (keyAt == i14) {
                                ((R5.M) mVar.f1016d).h(sparseArray2.valueAt(sparseArray2.size() - 1));
                            }
                        }
                        sparseArray2.append(i14, t7);
                        int i16 = this.f10282p + 1;
                        this.f10282p = i16;
                        int i17 = this.f10276i;
                        if (i16 == i17) {
                            int i18 = i17 + zzbbd.zzq.zzf;
                            int[] iArr = new int[i18];
                            long[] jArr = new long[i18];
                            long[] jArr2 = new long[i18];
                            int[] iArr2 = new int[i18];
                            int[] iArr3 = new int[i18];
                            F1.u[] uVarArr = new F1.u[i18];
                            int i19 = this.f10284r;
                            int i20 = i17 - i19;
                            System.arraycopy(this.f10277k, i19, jArr, 0, i20);
                            System.arraycopy(this.f10280n, this.f10284r, jArr2, 0, i20);
                            System.arraycopy(this.f10279m, this.f10284r, iArr2, 0, i20);
                            System.arraycopy(this.f10278l, this.f10284r, iArr3, 0, i20);
                            System.arraycopy(this.f10281o, this.f10284r, uVarArr, 0, i20);
                            System.arraycopy(this.j, this.f10284r, iArr, 0, i20);
                            int i21 = this.f10284r;
                            System.arraycopy(this.f10277k, 0, jArr, i20, i21);
                            System.arraycopy(this.f10280n, 0, jArr2, i20, i21);
                            System.arraycopy(this.f10279m, 0, iArr2, i20, i21);
                            System.arraycopy(this.f10278l, 0, iArr3, i20, i21);
                            System.arraycopy(this.f10281o, 0, uVarArr, i20, i21);
                            System.arraycopy(this.j, 0, iArr, i20, i21);
                            this.f10277k = jArr;
                            this.f10280n = jArr2;
                            this.f10279m = iArr2;
                            this.f10278l = iArr3;
                            this.f10281o = uVarArr;
                            this.j = iArr;
                            this.f10284r = 0;
                            this.f10276i = i18;
                        }
                    } finally {
                    }
                }
                return;
            }
        }
        i10 = i7;
        if (this.f10267G) {
        }
        long j72 = (this.f10268a.f10258g - i8) - i9;
        synchronized (this) {
        }
    }

    public final long f(int i7) {
        this.f10287u = Math.max(this.f10287u, m(i7));
        this.f10282p -= i7;
        int i8 = this.f10283q + i7;
        this.f10283q = i8;
        int i9 = this.f10284r + i7;
        this.f10284r = i9;
        int i10 = this.f10276i;
        if (i9 >= i10) {
            this.f10284r = i9 - i10;
        }
        int i11 = this.f10285s - i7;
        this.f10285s = i11;
        int i12 = 0;
        if (i11 < 0) {
            this.f10285s = 0;
        }
        while (true) {
            B1.m mVar = this.f10270c;
            SparseArray sparseArray = (SparseArray) mVar.f1015c;
            if (i12 >= sparseArray.size() - 1) {
                break;
            }
            int i13 = i12 + 1;
            if (i8 < sparseArray.keyAt(i13)) {
                break;
            }
            ((R5.M) mVar.f1016d).h(sparseArray.valueAt(i12));
            sparseArray.removeAt(i12);
            int i14 = mVar.f1014b;
            if (i14 > 0) {
                mVar.f1014b = i14 - 1;
            }
            i12 = i13;
        }
        if (this.f10282p != 0) {
            return this.f10277k[this.f10284r];
        }
        int i15 = this.f10284r;
        if (i15 == 0) {
            i15 = this.f10276i;
        }
        return this.f10277k[i15 - 1] + this.f10278l[r7];
    }

    public final void g(long j, boolean z4) {
        long j3;
        int i7;
        S s7 = this.f10268a;
        synchronized (this) {
            try {
                int i8 = this.f10282p;
                j3 = -1;
                if (i8 != 0) {
                    long[] jArr = this.f10280n;
                    int i9 = this.f10284r;
                    if (j >= jArr[i9]) {
                        if (z4 && (i7 = this.f10285s) != i8) {
                            i8 = i7 + 1;
                        }
                        int k7 = k(i9, i8, j, false);
                        if (k7 != -1) {
                            j3 = f(k7);
                        }
                    }
                }
            } finally {
            }
        }
        s7.b(j3);
    }

    public final void h() {
        long f7;
        S s7 = this.f10268a;
        synchronized (this) {
            int i7 = this.f10282p;
            f7 = i7 == 0 ? -1L : f(i7);
        }
        s7.b(f7);
    }

    public final long i(int i7) {
        int i8 = this.f10283q;
        int i9 = this.f10282p;
        int i10 = (i8 + i9) - i7;
        boolean z4 = false;
        AbstractC1664a.f(i10 >= 0 && i10 <= i9 - this.f10285s);
        int i11 = this.f10282p - i10;
        this.f10282p = i11;
        this.f10288v = Math.max(this.f10287u, m(i11));
        if (i10 == 0 && this.f10289w) {
            z4 = true;
        }
        this.f10289w = z4;
        B1.m mVar = this.f10270c;
        SparseArray sparseArray = (SparseArray) mVar.f1015c;
        for (int size = sparseArray.size() - 1; size >= 0 && i7 < sparseArray.keyAt(size); size--) {
            ((R5.M) mVar.f1016d).h(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        mVar.f1014b = sparseArray.size() > 0 ? Math.min(mVar.f1014b, sparseArray.size() - 1) : -1;
        int i12 = this.f10282p;
        if (i12 == 0) {
            return 0L;
        }
        return this.f10277k[o(i12 - 1)] + this.f10278l[r9];
    }

    public final void j(int i7) {
        long i8 = i(i7);
        S s7 = this.f10268a;
        AbstractC1664a.f(i8 <= s7.f10258g);
        s7.f10258g = i8;
        int i9 = s7.f10253b;
        if (i8 != 0) {
            O1.c cVar = s7.f10255d;
            if (i8 != cVar.f4933a) {
                while (s7.f10258g > cVar.f4934b) {
                    cVar = (O1.c) cVar.f4936d;
                }
                O1.c cVar2 = (O1.c) cVar.f4936d;
                cVar2.getClass();
                s7.a(cVar2);
                O1.c cVar3 = new O1.c(cVar.f4934b, i9);
                cVar.f4936d = cVar3;
                if (s7.f10258g == cVar.f4934b) {
                    cVar = cVar3;
                }
                s7.f10257f = cVar;
                if (s7.f10256e == cVar2) {
                    s7.f10256e = cVar3;
                    return;
                }
                return;
            }
        }
        s7.a(s7.f10255d);
        O1.c cVar4 = new O1.c(s7.f10258g, i9);
        s7.f10255d = cVar4;
        s7.f10256e = cVar4;
        s7.f10257f = cVar4;
    }

    public final int k(int i7, int i8, long j, boolean z4) {
        int i9 = -1;
        for (int i10 = 0; i10 < i8; i10++) {
            long j3 = this.f10280n[i7];
            if (j3 > j) {
                break;
            }
            if (!z4 || (this.f10279m[i7] & 1) != 0) {
                i9 = i10;
                if (j3 == j) {
                    break;
                }
            }
            i7++;
            if (i7 == this.f10276i) {
                i7 = 0;
            }
        }
        return i9;
    }

    public A1.X l(A1.X x4) {
        if (this.f10266F == 0 || x4.f287G == Long.MAX_VALUE) {
            return x4;
        }
        Format$Builder a2 = x4.a();
        a2.f10541o = x4.f287G + this.f10266F;
        return new A1.X(a2);
    }

    public final long m(int i7) {
        long j = Long.MIN_VALUE;
        if (i7 == 0) {
            return Long.MIN_VALUE;
        }
        int o7 = o(i7 - 1);
        for (int i8 = 0; i8 < i7; i8++) {
            j = Math.max(j, this.f10280n[o7]);
            if ((this.f10279m[o7] & 1) != 0) {
                break;
            }
            o7--;
            if (o7 == -1) {
                o7 = this.f10276i - 1;
            }
        }
        return j;
    }

    public final int n() {
        return this.f10283q + this.f10285s;
    }

    public final int o(int i7) {
        int i8 = this.f10284r + i7;
        int i9 = this.f10276i;
        return i8 < i9 ? i8 : i8 - i9;
    }

    public final synchronized int p(long j, boolean z4) {
        int o7 = o(this.f10285s);
        if (r() && j >= this.f10280n[o7]) {
            if (j > this.f10288v && z4) {
                return this.f10282p - this.f10285s;
            }
            int k7 = k(o7, this.f10282p - this.f10285s, j, true);
            if (k7 == -1) {
                return 0;
            }
            return k7;
        }
        return 0;
    }

    public final synchronized A1.X q() {
        return this.f10291y ? null : this.f10262B;
    }

    public final boolean r() {
        return this.f10285s != this.f10282p;
    }

    public final synchronized boolean s(boolean z4) {
        A1.X x4;
        boolean z7 = true;
        if (r()) {
            if (((T) this.f10270c.k(n())).f10259a != this.f10274g) {
                return true;
            }
            return t(o(this.f10285s));
        }
        if (!z4 && !this.f10289w && ((x4 = this.f10262B) == null || x4 == this.f10274g)) {
            z7 = false;
        }
        return z7;
    }

    public final boolean t(int i7) {
        C1719l1 c1719l1 = this.f10275h;
        if (c1719l1 == null || c1719l1.z() == 4) {
            return true;
        }
        if ((this.f10279m[i7] & 1073741824) == 0) {
            this.f10275h.getClass();
        }
        return false;
    }

    public final void u() {
        C1719l1 c1719l1 = this.f10275h;
        if (c1719l1 == null || c1719l1.z() != 1) {
            return;
        }
        E1.c w7 = this.f10275h.w();
        w7.getClass();
        throw w7;
    }

    public final void v(A1.X x4, V0 v02) {
        A1.X x7;
        A1.X x8 = this.f10274g;
        boolean z4 = x8 == null;
        DrmInitData drmInitData = z4 ? null : x8.f286F;
        this.f10274g = x4;
        DrmInitData drmInitData2 = x4.f286F;
        E1.h hVar = this.f10271d;
        if (hVar != null) {
            int b7 = hVar.b(x4);
            Format$Builder a2 = x4.a();
            a2.f10527D = b7;
            x7 = new A1.X(a2);
        } else {
            x7 = x4;
        }
        v02.f17563c = x7;
        v02.f17562b = this.f10275h;
        if (hVar == null) {
            return;
        }
        if (z4 || !v2.t.a(drmInitData, drmInitData2)) {
            C1719l1 c1719l1 = this.f10275h;
            B1.m mVar = this.f10272e;
            C1719l1 d7 = hVar.d(mVar, x4);
            this.f10275h = d7;
            v02.f17562b = d7;
            if (c1719l1 != null) {
                c1719l1.F(mVar);
            }
        }
    }

    public final synchronized int w() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return r() ? this.j[o(this.f10285s)] : this.f10263C;
    }

    public final int x(V0 v02, D1.h hVar, int i7, boolean z4) {
        int i8;
        boolean z7 = (i7 & 2) != 0;
        C0868d c0868d = this.f10269b;
        synchronized (this) {
            try {
                hVar.f1698e = false;
                i8 = -3;
                if (r()) {
                    A1.X x4 = ((T) this.f10270c.k(n())).f10259a;
                    if (!z7 && x4 == this.f10274g) {
                        int o7 = o(this.f10285s);
                        if (t(o7)) {
                            hVar.f1675b = this.f10279m[o7];
                            long j = this.f10280n[o7];
                            hVar.f1699f = j;
                            if (j < this.f10286t) {
                                hVar.b(Integer.MIN_VALUE);
                            }
                            c0868d.f11761a = this.f10278l[o7];
                            c0868d.f11762b = this.f10277k[o7];
                            c0868d.f11763c = this.f10281o[o7];
                            i8 = -4;
                        } else {
                            hVar.f1698e = true;
                        }
                    }
                    v(x4, v02);
                    i8 = -5;
                } else {
                    if (!z4 && !this.f10289w) {
                        A1.X x7 = this.f10262B;
                        if (x7 == null || (!z7 && x7 == this.f10274g)) {
                        }
                        v(x7, v02);
                        i8 = -5;
                    }
                    hVar.f1675b = 4;
                    i8 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i8 == -4 && !hVar.f(4)) {
            boolean z8 = (i7 & 1) != 0;
            if ((i7 & 4) == 0) {
                if (z8) {
                    S s7 = this.f10268a;
                    S.f(s7.f10256e, hVar, this.f10269b, s7.f10254c);
                } else {
                    S s8 = this.f10268a;
                    s8.f10256e = S.f(s8.f10256e, hVar, this.f10269b, s8.f10254c);
                }
            }
            if (!z8) {
                this.f10285s++;
            }
        }
        return i8;
    }

    public final void y(boolean z4) {
        B1.m mVar;
        SparseArray sparseArray;
        S s7 = this.f10268a;
        s7.a(s7.f10255d);
        O1.c cVar = s7.f10255d;
        int i7 = 0;
        AbstractC1664a.h(((C1624a) cVar.f4935c) == null);
        cVar.f4933a = 0L;
        cVar.f4934b = s7.f10253b;
        O1.c cVar2 = s7.f10255d;
        s7.f10256e = cVar2;
        s7.f10257f = cVar2;
        s7.f10258g = 0L;
        s7.f10252a.b();
        this.f10282p = 0;
        this.f10283q = 0;
        this.f10284r = 0;
        this.f10285s = 0;
        this.f10290x = true;
        this.f10286t = Long.MIN_VALUE;
        this.f10287u = Long.MIN_VALUE;
        this.f10288v = Long.MIN_VALUE;
        this.f10289w = false;
        while (true) {
            mVar = this.f10270c;
            sparseArray = (SparseArray) mVar.f1015c;
            if (i7 >= sparseArray.size()) {
                break;
            }
            ((R5.M) mVar.f1016d).h(sparseArray.valueAt(i7));
            i7++;
        }
        mVar.f1014b = -1;
        sparseArray.clear();
        if (z4) {
            this.f10261A = null;
            this.f10262B = null;
            this.f10291y = true;
        }
    }

    public final synchronized boolean z(long j, boolean z4) {
        synchronized (this) {
            this.f10285s = 0;
            S s7 = this.f10268a;
            s7.f10256e = s7.f10255d;
        }
        int o7 = o(0);
        if (r() && j >= this.f10280n[o7] && (j <= this.f10288v || z4)) {
            int k7 = k(o7, this.f10282p - this.f10285s, j, true);
            if (k7 == -1) {
                return false;
            }
            this.f10286t = j;
            this.f10285s += k7;
            return true;
        }
        return false;
    }
}
