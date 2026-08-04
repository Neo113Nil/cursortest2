package p018c2;

import A1.X;
import B1.l;
import B1.m;
import C1.C0095a;
import E1.g;
import E1.h;
import F1.u;
import F1.v;
import O1.c;
import R5.M;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.crypto.tink.shaded.protobuf.C0824d;
import java.io.EOFException;
import java.util.ArrayList;
import p146u2.C0942a;
import p146u2.InterfaceC0951j;
import p146u2.r;
import p151v2.a;
import p151v2.i;
import p151v2.t;
import p155w1.C1010l1;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public class V implements v {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public X f10261A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public X f10262B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f10263C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f10264D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f10265E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f10266F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f10267G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f10268a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f10271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f10272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f10273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public X f10274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C1010l1 f10275h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10282p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10285s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10289w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f10292z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0824d f10269b = new C0824d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10276i = zzbbd.zzq.zzf;
    public int[] j = new int[zzbbd.zzq.zzf];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f10277k = new long[zzbbd.zzq.zzf];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f10280n = new long[zzbbd.zzq.zzf];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f10279m = new int[zzbbd.zzq.zzf];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f10278l = new int[zzbbd.zzq.zzf];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u[] f10281o = new u[zzbbd.zzq.zzf];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f10270c = new m(new M(14));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f10286t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f10287u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f10288v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10291y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10290x = true;

    public V(r rVar, h hVar, m mVar) {
        this.f10271d = hVar;
        this.f10272e = mVar;
        this.f10268a = new S(rVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void A(int i7) {
        boolean z4;
        if (i7 >= 0) {
            try {
                if (this.f10285s + i7 <= this.f10282p) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z4 = false;
        }
        a.f(z4);
        this.f10285s += i7;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005c A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:4:0x000b, B:8:0x0019, B:13:0x002a, B:15:0x0043, B:19:0x005e, B:81:0x0112, B:73:0x00ff, B:76:0x0107, B:18:0x005c), top: B:90:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:80:0x0111  */
    /* JADX WARN: Type inference failed for: r6v31, types: [c2.U, java.lang.Object] */
    @Override // F1.v
    public final void a(X x4) {
        boolean z4;
        l lVarE;
        int iA;
        boolean z7 = true;
        X xL = l(x4);
        this.f10292z = false;
        this.f10261A = x4;
        synchronized (this) {
            try {
                this.f10291y = false;
                if (t.a(xL, this.f10262B)) {
                    z7 = false;
                } else {
                    if (((SparseArray) this.f10270c.f1015c).size() == 0) {
                        this.f10262B = xL;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.f10270c.f1015c;
                        if (((T) sparseArray.valueAt(sparseArray.size() - 1)).f10259a.equals(xL)) {
                            SparseArray sparseArray2 = (SparseArray) this.f10270c.f1015c;
                            this.f10262B = ((T) sparseArray2.valueAt(sparseArray2.size() - 1)).f10259a;
                        } else {
                            this.f10262B = xL;
                        }
                    }
                    X x7 = this.f10262B;
                    String str = x7.f283C;
                    String str2 = x7.f312z;
                    ArrayList arrayList = i.f17115a;
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
                                if (str2 != null && (lVarE = i.e(str2)) != null && (iA = lVarE.a()) != 0 && iA != 16) {
                                    z4 = true;
                                    break;
                                } else {
                                    z4 = false;
                                    break;
                                }
                                break;
                            default:
                                z4 = false;
                                break;
                        }
                    } else {
                        z4 = false;
                    }
                    this.f10264D = z4;
                    this.f10265E = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ?? r7 = this.f10273f;
        if (r7 == 0 || !z7) {
            return;
        }
        r7.b();
    }

    @Override // F1.v
    public final void c(int i7, C0095a c0095a) {
        while (true) {
            S s7 = this.f10268a;
            if (i7 <= 0) {
                s7.getClass();
                return;
            }
            int iC = s7.c(i7);
            c cVar = s7.f10257f;
            C0942a c0942a = (C0942a) cVar.f4935c;
            c0095a.f(c0942a.f16771a, ((int) (s7.f10258g - cVar.f4933a)) + c0942a.f16772b, iC);
            i7 -= iC;
            long j = s7.f10258g + ((long) iC);
            s7.f10258g = j;
            c cVar2 = s7.f10257f;
            if (j == cVar2.f4934b) {
                s7.f10257f = (c) cVar2.f4936d;
            }
        }
    }

    @Override // F1.v
    public final int d(InterfaceC0951j interfaceC0951j, int i7, boolean z4) throws EOFException {
        S s7 = this.f10268a;
        int iC = s7.c(i7);
        c cVar = s7.f10257f;
        C0942a c0942a = (C0942a) cVar.f4935c;
        int i8 = interfaceC0951j.read(c0942a.f16771a, ((int) (s7.f10258g - cVar.f4933a)) + c0942a.f16772b, iC);
        if (i8 == -1) {
            if (z4) {
                return -1;
            }
            throw new EOFException();
        }
        long j = s7.f10258g + ((long) i8);
        s7.f10258g = j;
        c cVar2 = s7.f10257f;
        if (j != cVar2.f4934b) {
            return i8;
        }
        s7.f10257f = (c) cVar2.f4936d;
        return i8;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0176 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0122, B:110:0x019c, B:112:0x01a5, B:89:0x013d, B:91:0x0141, B:93:0x0149, B:95:0x0162, B:99:0x016b, B:100:0x0170, B:102:0x0176, B:106:0x0184, B:108:0x0189, B:109:0x0199, B:92:0x0147), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0181  */
    /* JADX WARN: Code duplicated, block: B:105:0x0183  */
    /* JADX WARN: Code duplicated, block: B:108:0x0189 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0122, B:110:0x019c, B:112:0x01a5, B:89:0x013d, B:91:0x0141, B:93:0x0149, B:95:0x0162, B:99:0x016b, B:100:0x0170, B:102:0x0176, B:106:0x0184, B:108:0x0189, B:109:0x0199, B:92:0x0147), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:89:0x013d A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0122, B:110:0x019c, B:112:0x01a5, B:89:0x013d, B:91:0x0141, B:93:0x0149, B:95:0x0162, B:99:0x016b, B:100:0x0170, B:102:0x0176, B:106:0x0184, B:108:0x0189, B:109:0x0199, B:92:0x0147), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0141 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0122, B:110:0x019c, B:112:0x01a5, B:89:0x013d, B:91:0x0141, B:93:0x0149, B:95:0x0162, B:99:0x016b, B:100:0x0170, B:102:0x0176, B:106:0x0184, B:108:0x0189, B:109:0x0199, B:92:0x0147), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0147 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0122, B:110:0x019c, B:112:0x01a5, B:89:0x013d, B:91:0x0141, B:93:0x0149, B:95:0x0162, B:99:0x016b, B:100:0x0170, B:102:0x0176, B:106:0x0184, B:108:0x0189, B:109:0x0199, B:92:0x0147), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0162 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0122, B:110:0x019c, B:112:0x01a5, B:89:0x013d, B:91:0x0141, B:93:0x0149, B:95:0x0162, B:99:0x016b, B:100:0x0170, B:102:0x0176, B:106:0x0184, B:108:0x0189, B:109:0x0199, B:92:0x0147), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0168  */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    @Override // F1.v
    public void e(long j, int i7, int i8, int i9, u uVar) {
        int i10;
        h hVar;
        g gVar;
        m mVar;
        int i11;
        int i12;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z4;
        boolean z7;
        boolean z8;
        if (this.f10292z) {
            X x4 = this.f10261A;
            a.i(x4);
            a(x4);
        }
        int i13 = i7 & 1;
        boolean z9 = i13 != 0;
        if (this.f10290x) {
            if (!z9) {
                return;
            } else {
                this.f10290x = false;
            }
        }
        long j3 = j + this.f10266F;
        if (!this.f10264D) {
            i10 = i7;
        } else {
            if (j3 < this.f10286t) {
                return;
            }
            if (i13 == 0) {
                if (!this.f10265E) {
                    Log.w("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f10262B);
                    this.f10265E = true;
                }
                i10 = i7 | 1;
            } else {
                i10 = i7;
            }
        }
        if (this.f10267G) {
            if (!z9) {
                return;
            }
            synchronized (this) {
                if (this.f10282p == 0) {
                    z8 = j3 > this.f10287u;
                } else {
                    synchronized (this) {
                        long jMax = Math.max(this.f10287u, m(this.f10285s));
                        if (jMax >= j3) {
                            z8 = false;
                        } else {
                            int i14 = this.f10282p;
                            int iO = o(i14 - 1);
                            while (i14 > this.f10285s && this.f10280n[iO] >= j3) {
                                i14--;
                                iO--;
                                if (iO == -1) {
                                    iO = this.f10276i - 1;
                                }
                            }
                            i(this.f10283q + i14);
                            z8 = true;
                        }
                    }
                }
            }
            if (!z8) {
                return;
            } else {
                this.f10267G = false;
            }
        }
        long j7 = (this.f10268a.f10258g - ((long) i8)) - ((long) i9);
        synchronized (this) {
            try {
                int i15 = this.f10282p;
                if (i15 > 0) {
                    int iO2 = o(i15 - 1);
                    a.f(this.f10277k[iO2] + ((long) this.f10278l[iO2]) <= j7);
                }
                this.f10289w = (536870912 & i10) != 0;
                this.f10288v = Math.max(this.f10288v, j3);
                int iO3 = o(this.f10282p);
                this.f10280n[iO3] = j3;
                this.f10277k[iO3] = j7;
                this.f10278l[iO3] = i8;
                this.f10279m[iO3] = i10;
                this.f10281o[iO3] = uVar;
                this.j[iO3] = this.f10263C;
                if (((SparseArray) this.f10270c.f1015c).size() == 0) {
                    hVar = this.f10271d;
                    if (hVar != null) {
                        hVar.getClass();
                        gVar = g.f1903a;
                    } else {
                        gVar = g.f1903a;
                    }
                    mVar = this.f10270c;
                    i11 = this.f10283q + this.f10282p;
                    X x7 = this.f10262B;
                    x7.getClass();
                    T t7 = new T(x7, gVar);
                    i12 = mVar.f1014b;
                    sparseArray = (SparseArray) mVar.f1015c;
                    if (i12 == -1) {
                        if (sparseArray.size() == 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        a.h(z7);
                        mVar.f1014b = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i11 >= iKeyAt) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        a.f(z4);
                        if (iKeyAt == i11) {
                            ((M) mVar.f1016d).h(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i11, t7);
                } else {
                    SparseArray sparseArray2 = (SparseArray) this.f10270c.f1015c;
                    if (!((T) sparseArray2.valueAt(sparseArray2.size() - 1)).f10259a.equals(this.f10262B)) {
                        hVar = this.f10271d;
                        if (hVar != null) {
                            hVar.getClass();
                            gVar = g.f1903a;
                        } else {
                            gVar = g.f1903a;
                        }
                        mVar = this.f10270c;
                        i11 = this.f10283q + this.f10282p;
                        X x8 = this.f10262B;
                        x8.getClass();
                        T t8 = new T(x8, gVar);
                        i12 = mVar.f1014b;
                        sparseArray = (SparseArray) mVar.f1015c;
                        if (i12 == -1) {
                            if (sparseArray.size() == 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            a.h(z7);
                            mVar.f1014b = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i11 >= iKeyAt) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            a.f(z4);
                            if (iKeyAt == i11) {
                                ((M) mVar.f1016d).h(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i11, t8);
                    }
                }
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
                    u[] uVarArr = new u[i18];
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
            } catch (Throwable th) {
                throw th;
            }
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
            m mVar = this.f10270c;
            SparseArray sparseArray = (SparseArray) mVar.f1015c;
            if (i12 >= sparseArray.size() - 1) {
                break;
            }
            int i13 = i12 + 1;
            if (i8 < sparseArray.keyAt(i13)) {
                break;
            }
            ((M) mVar.f1016d).h(sparseArray.valueAt(i12));
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
        int i16 = i15 - 1;
        return this.f10277k[i16] + ((long) this.f10278l[i16]);
    }

    public final void g(long j, boolean z4) {
        long jF;
        int i7;
        S s7 = this.f10268a;
        synchronized (this) {
            try {
                int i8 = this.f10282p;
                jF = -1;
                if (i8 != 0) {
                    long[] jArr = this.f10280n;
                    int i9 = this.f10284r;
                    if (j >= jArr[i9]) {
                        if (z4 && (i7 = this.f10285s) != i8) {
                            i8 = i7 + 1;
                        }
                        int iK = k(i9, i8, j, false);
                        if (iK != -1) {
                            jF = f(iK);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        s7.b(jF);
    }

    public final void h() {
        long jF;
        S s7 = this.f10268a;
        synchronized (this) {
            int i7 = this.f10282p;
            jF = i7 == 0 ? -1L : f(i7);
        }
        s7.b(jF);
    }

    public final long i(int i7) {
        int i8 = this.f10283q;
        int i9 = this.f10282p;
        int i10 = (i8 + i9) - i7;
        boolean z4 = false;
        a.f(i10 >= 0 && i10 <= i9 - this.f10285s);
        int i11 = this.f10282p - i10;
        this.f10282p = i11;
        this.f10288v = Math.max(this.f10287u, m(i11));
        if (i10 == 0 && this.f10289w) {
            z4 = true;
        }
        this.f10289w = z4;
        m mVar = this.f10270c;
        SparseArray sparseArray = (SparseArray) mVar.f1015c;
        for (int size = sparseArray.size() - 1; size >= 0 && i7 < sparseArray.keyAt(size); size--) {
            ((M) mVar.f1016d).h(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        mVar.f1014b = sparseArray.size() > 0 ? Math.min(mVar.f1014b, sparseArray.size() - 1) : -1;
        int i12 = this.f10282p;
        if (i12 == 0) {
            return 0L;
        }
        int iO = o(i12 - 1);
        return this.f10277k[iO] + ((long) this.f10278l[iO]);
    }

    public final void j(int i7) {
        long jI = i(i7);
        S s7 = this.f10268a;
        a.f(jI <= s7.f10258g);
        s7.f10258g = jI;
        int i8 = s7.f10253b;
        if (jI != 0) {
            c cVar = s7.f10255d;
            if (jI != cVar.f4933a) {
                while (s7.f10258g > cVar.f4934b) {
                    cVar = (c) cVar.f4936d;
                }
                c cVar2 = (c) cVar.f4936d;
                cVar2.getClass();
                s7.a(cVar2);
                c cVar3 = new c(cVar.f4934b, i8);
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
        c cVar4 = new c(s7.f10258g, i8);
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

    public X l(X x4) {
        if (this.f10266F == 0 || x4.f287G == Long.MAX_VALUE) {
            return x4;
        }
        Format$Builder format$BuilderA = x4.a();
        format$BuilderA.f10541o = x4.f287G + this.f10266F;
        return new X(format$BuilderA);
    }

    public final long m(int i7) {
        long jMax = Long.MIN_VALUE;
        if (i7 == 0) {
            return Long.MIN_VALUE;
        }
        int iO = o(i7 - 1);
        for (int i8 = 0; i8 < i7; i8++) {
            jMax = Math.max(jMax, this.f10280n[iO]);
            if ((this.f10279m[iO] & 1) != 0) {
                break;
            }
            iO--;
            if (iO == -1) {
                iO = this.f10276i - 1;
            }
        }
        return jMax;
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
        int iO = o(this.f10285s);
        if (r() && j >= this.f10280n[iO]) {
            if (j > this.f10288v && z4) {
                return this.f10282p - this.f10285s;
            }
            int iK = k(iO, this.f10282p - this.f10285s, j, true);
            if (iK == -1) {
                return 0;
            }
            return iK;
        }
        return 0;
    }

    public final synchronized X q() {
        return this.f10291y ? null : this.f10262B;
    }

    public final boolean r() {
        return this.f10285s != this.f10282p;
    }

    public final synchronized boolean s(boolean z4) {
        X x4;
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
        C1010l1 c1010l1 = this.f10275h;
        if (c1010l1 == null || c1010l1.z() == 4) {
            return true;
        }
        if ((this.f10279m[i7] & 1073741824) == 0) {
            this.f10275h.getClass();
        }
        return false;
    }

    public final void u() throws E1.c {
        C1010l1 c1010l1 = this.f10275h;
        if (c1010l1 == null || c1010l1.z() != 1) {
            return;
        }
        E1.c cVarW = this.f10275h.w();
        cVarW.getClass();
        throw cVarW;
    }

    public final void v(X x4, V0 v6) {
        X x7;
        X x8 = this.f10274g;
        boolean z4 = x8 == null;
        DrmInitData drmInitData = z4 ? null : x8.f286F;
        this.f10274g = x4;
        DrmInitData drmInitData2 = x4.f286F;
        h hVar = this.f10271d;
        if (hVar != null) {
            int iB = hVar.b(x4);
            Format$Builder format$BuilderA = x4.a();
            format$BuilderA.f10527D = iB;
            x7 = new X(format$BuilderA);
        } else {
            x7 = x4;
        }
        v6.f17569c = x7;
        v6.f17568b = this.f10275h;
        if (hVar == null) {
            return;
        }
        if (z4 || !t.a(drmInitData, drmInitData2)) {
            C1010l1 c1010l1 = this.f10275h;
            m mVar = this.f10272e;
            C1010l1 c1010l1D = hVar.d(mVar, x4);
            this.f10275h = c1010l1D;
            v6.f17568b = c1010l1D;
            if (c1010l1 != null) {
                c1010l1.F(mVar);
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

    public final int x(V0 v6, D1.h hVar, int i7, boolean z4) {
        int i8;
        boolean z7 = (i7 & 2) != 0;
        C0824d c0824d = this.f10269b;
        synchronized (this) {
            try {
                hVar.f1698e = false;
                i8 = -3;
                if (r()) {
                    X x4 = ((T) this.f10270c.k(n())).f10259a;
                    if (z7 || x4 != this.f10274g) {
                        v(x4, v6);
                        i8 = -5;
                    } else {
                        int iO = o(this.f10285s);
                        if (t(iO)) {
                            hVar.f1675b = this.f10279m[iO];
                            long j = this.f10280n[iO];
                            hVar.f1699f = j;
                            if (j < this.f10286t) {
                                hVar.b(Integer.MIN_VALUE);
                            }
                            c0824d.f11761a = this.f10278l[iO];
                            c0824d.f11762b = this.f10277k[iO];
                            c0824d.f11763c = this.f10281o[iO];
                            i8 = -4;
                        } else {
                            hVar.f1698e = true;
                        }
                    }
                } else if (z4 || this.f10289w) {
                    hVar.f1675b = 4;
                    i8 = -4;
                } else {
                    X x7 = this.f10262B;
                    if (x7 != null && (z7 || x7 != this.f10274g)) {
                        v(x7, v6);
                        i8 = -5;
                    }
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
        m mVar;
        SparseArray sparseArray;
        S s7 = this.f10268a;
        s7.a(s7.f10255d);
        c cVar = s7.f10255d;
        int i7 = 0;
        a.h(((C0942a) cVar.f4935c) == null);
        cVar.f4933a = 0L;
        cVar.f4934b = s7.f10253b;
        c cVar2 = s7.f10255d;
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
            ((M) mVar.f1016d).h(sparseArray.valueAt(i7));
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
        int iO = o(0);
        if (r() && j >= this.f10280n[iO] && (j <= this.f10288v || z4)) {
            int iK = k(iO, this.f10282p - this.f10285s, j, true);
            if (iK == -1) {
                return false;
            }
            this.f10286t = j;
            this.f10285s += iK;
            return true;
        }
        return false;
    }
}
