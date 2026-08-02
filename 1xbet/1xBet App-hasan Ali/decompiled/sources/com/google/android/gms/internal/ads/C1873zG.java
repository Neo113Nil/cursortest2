package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: com.google.android.gms.internal.ads.zG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1873zG implements InterfaceC1558sG, InterfaceC1513rG {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1558sG[] f16580k;

    /* renamed from: l, reason: collision with root package name */
    public final IdentityHashMap f16581l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f16582m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f16583n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1513rG f16584o;

    /* renamed from: p, reason: collision with root package name */
    public TG f16585p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC1558sG[] f16586q;

    /* renamed from: r, reason: collision with root package name */
    public C1066hG f16587r;

    public C1873zG(long[] jArr, InterfaceC1558sG... interfaceC1558sGArr) {
        this.f16580k = interfaceC1558sGArr;
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        C1761wv c1761wv = C1761wv.f16184o;
        this.f16587r = new C1066hG(c1761wv, c1761wv);
        this.f16581l = new IdentityHashMap();
        this.f16586q = new InterfaceC1558sG[0];
        for (int i = 0; i < interfaceC1558sGArr.length; i++) {
            long j5 = jArr[i];
            if (j5 != 0) {
                this.f16580k[i] = new SG(interfaceC1558sGArr[i], j5);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final void a(long j5) {
        this.f16587r.a(j5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final long b(long j5) {
        long b3 = this.f16586q[0].b(j5);
        int i = 1;
        while (true) {
            InterfaceC1558sG[] interfaceC1558sGArr = this.f16586q;
            if (i >= interfaceC1558sGArr.length) {
                return b3;
            }
            if (interfaceC1558sGArr[i].b(b3) != b3) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final long c(InterfaceC1200kH[] interfaceC1200kHArr, boolean[] zArr, NG[] ngArr, boolean[] zArr2, long j5) {
        int length;
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2;
        int length2 = interfaceC1200kHArr.length;
        int[] iArr3 = new int[length2];
        int[] iArr4 = new int[length2];
        int i = 0;
        int i5 = 0;
        while (true) {
            length = interfaceC1200kHArr.length;
            identityHashMap = this.f16581l;
            if (i5 >= length) {
                break;
            }
            NG ng = ngArr[i5];
            Integer num = ng == null ? null : (Integer) identityHashMap.get(ng);
            iArr3[i5] = num == null ? -1 : num.intValue();
            InterfaceC1200kH interfaceC1200kH = interfaceC1200kHArr[i5];
            if (interfaceC1200kH != null) {
                String str = interfaceC1200kH.f().f14496b;
                iArr4[i5] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr4[i5] = -1;
            }
            i5++;
        }
        identityHashMap.clear();
        NG[] ngArr2 = new NG[length];
        NG[] ngArr3 = new NG[length];
        InterfaceC1200kH[] interfaceC1200kHArr2 = new InterfaceC1200kH[length];
        InterfaceC1558sG[] interfaceC1558sGArr = this.f16580k;
        ArrayList arrayList = new ArrayList(interfaceC1558sGArr.length);
        long j6 = j5;
        int i6 = 0;
        while (i6 < interfaceC1558sGArr.length) {
            int i7 = i;
            while (i7 < interfaceC1200kHArr.length) {
                ngArr3[i7] = iArr3[i7] == i6 ? ngArr[i7] : null;
                if (iArr4[i7] == i6) {
                    InterfaceC1200kH interfaceC1200kH2 = interfaceC1200kHArr[i7];
                    interfaceC1200kH2.getClass();
                    iArr = iArr4;
                    iArr2 = iArr3;
                    C1292mb c1292mb = (C1292mb) this.f16583n.get(interfaceC1200kH2.f());
                    c1292mb.getClass();
                    interfaceC1200kHArr2[i7] = new C1828yG(interfaceC1200kH2, c1292mb);
                } else {
                    iArr = iArr4;
                    iArr2 = iArr3;
                    interfaceC1200kHArr2[i7] = null;
                }
                i7++;
                iArr4 = iArr;
                iArr3 = iArr2;
            }
            int[] iArr5 = iArr4;
            int[] iArr6 = iArr3;
            ArrayList arrayList2 = arrayList;
            InterfaceC1558sG[] interfaceC1558sGArr2 = interfaceC1558sGArr;
            int i8 = i6;
            long c5 = interfaceC1558sGArr[i6].c(interfaceC1200kHArr2, zArr, ngArr3, zArr2, j6);
            if (i8 == 0) {
                j6 = c5;
            } else if (c5 != j6) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z3 = false;
            for (int i9 = 0; i9 < interfaceC1200kHArr.length; i9++) {
                if (iArr5[i9] == i8) {
                    NG ng2 = ngArr3[i9];
                    ng2.getClass();
                    ngArr2[i9] = ng2;
                    identityHashMap.put(ng2, Integer.valueOf(i8));
                    z3 = true;
                } else if (iArr6[i9] == i8) {
                    AbstractC1668us.a0(ngArr3[i9] == null);
                }
            }
            if (z3) {
                arrayList2.add(interfaceC1558sGArr2[i8]);
            }
            i6 = i8 + 1;
            arrayList = arrayList2;
            interfaceC1558sGArr = interfaceC1558sGArr2;
            iArr4 = iArr5;
            iArr3 = iArr6;
            i = 0;
        }
        int i10 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(ngArr2, i10, ngArr, i10, length);
        this.f16586q = (InterfaceC1558sG[]) arrayList3.toArray(new InterfaceC1558sG[i10]);
        this.f16587r = new C1066hG(arrayList3, AbstractC1400ot.z(arrayList3, new C1364o1(21)));
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final long d() {
        return this.f16587r.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final void e(long j5) {
        for (InterfaceC1558sG interfaceC1558sG : this.f16586q) {
            interfaceC1558sG.e(j5);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final void f(InterfaceC1513rG interfaceC1513rG, long j5) {
        this.f16584o = interfaceC1513rG;
        ArrayList arrayList = this.f16582m;
        InterfaceC1558sG[] interfaceC1558sGArr = this.f16580k;
        Collections.addAll(arrayList, interfaceC1558sGArr);
        for (InterfaceC1558sG interfaceC1558sG : interfaceC1558sGArr) {
            interfaceC1558sG.f(this, j5);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final TG g() {
        TG tg = this.f16585p;
        tg.getClass();
        return tg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1513rG
    public final /* bridge */ /* synthetic */ void h(OG og) {
        InterfaceC1513rG interfaceC1513rG = this.f16584o;
        interfaceC1513rG.getClass();
        interfaceC1513rG.h(this);
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final long i() {
        return this.f16587r.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final long j() {
        long j5 = -9223372036854775807L;
        for (InterfaceC1558sG interfaceC1558sG : this.f16586q) {
            long j6 = interfaceC1558sG.j();
            if (j6 != -9223372036854775807L) {
                if (j5 == -9223372036854775807L) {
                    for (InterfaceC1558sG interfaceC1558sG2 : this.f16586q) {
                        if (interfaceC1558sG2 == interfaceC1558sG) {
                            break;
                        }
                        if (interfaceC1558sG2.b(j6) != j6) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j5 = j6;
                } else if (j6 != j5) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j5 != -9223372036854775807L && interfaceC1558sG.b(j5) != j5) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final void k() {
        int i = 0;
        while (true) {
            InterfaceC1558sG[] interfaceC1558sGArr = this.f16580k;
            if (i >= interfaceC1558sGArr.length) {
                return;
            }
            interfaceC1558sGArr[i].k();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final long l(long j5, LE le) {
        InterfaceC1558sG[] interfaceC1558sGArr = this.f16586q;
        return (interfaceC1558sGArr.length > 0 ? interfaceC1558sGArr[0] : this.f16580k[0]).l(j5, le);
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final boolean m(C1511rE c1511rE) {
        ArrayList arrayList = this.f16582m;
        if (arrayList.isEmpty()) {
            return this.f16587r.m(c1511rE);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC1558sG) arrayList.get(i)).m(c1511rE);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1513rG
    public final void n(InterfaceC1558sG interfaceC1558sG) {
        InterfaceC1558sG[] interfaceC1558sGArr;
        ArrayList arrayList = this.f16582m;
        arrayList.remove(interfaceC1558sG);
        if (arrayList.isEmpty()) {
            int i = 0;
            int i5 = 0;
            while (true) {
                interfaceC1558sGArr = this.f16580k;
                if (i >= interfaceC1558sGArr.length) {
                    break;
                }
                i5 += interfaceC1558sGArr[i].g().f11646a;
                i++;
            }
            C1292mb[] c1292mbArr = new C1292mb[i5];
            int i6 = 0;
            for (int i7 = 0; i7 < interfaceC1558sGArr.length; i7++) {
                TG g5 = interfaceC1558sGArr[i7].g();
                int i8 = g5.f11646a;
                int i9 = 0;
                while (i9 < i8) {
                    C1292mb a5 = g5.a(i9);
                    int i10 = a5.f14495a;
                    C1407p[] c1407pArr = new C1407p[i10];
                    for (int i11 = 0; i11 < i10; i11++) {
                        C1407p c1407p = a5.f14498d[i11];
                        c1407p.getClass();
                        C1649uH c1649uH = new C1649uH(c1407p);
                        String str = c1407p.f14894a;
                        if (str == null) {
                            str = "";
                        }
                        c1649uH.f15839a = i7 + ":" + str;
                        c1407pArr[i11] = new C1407p(c1649uH);
                    }
                    C1292mb c1292mb = new C1292mb(i7 + ":" + a5.f14496b, c1407pArr);
                    this.f16583n.put(c1292mb, a5);
                    c1292mbArr[i6] = c1292mb;
                    i9++;
                    i6++;
                }
            }
            this.f16585p = new TG(c1292mbArr);
            InterfaceC1513rG interfaceC1513rG = this.f16584o;
            interfaceC1513rG.getClass();
            interfaceC1513rG.n(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final boolean r() {
        return this.f16587r.r();
    }
}
