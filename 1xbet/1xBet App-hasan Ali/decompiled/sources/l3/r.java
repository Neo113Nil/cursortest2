package l3;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.Jt;
import m3.AbstractC2095e;
import m3.B;
import m3.C2096f;

/* loaded from: classes.dex */
public final class r implements D3.c {

    /* renamed from: k, reason: collision with root package name */
    public final C2057d f17824k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17825l;

    /* renamed from: m, reason: collision with root package name */
    public final C2055b f17826m;

    /* renamed from: n, reason: collision with root package name */
    public final long f17827n;

    /* renamed from: o, reason: collision with root package name */
    public final long f17828o;

    public r(C2057d c2057d, int i, C2055b c2055b, long j5, long j6) {
        this.f17824k = c2057d;
        this.f17825l = i;
        this.f17826m = c2055b;
        this.f17827n = j5;
        this.f17828o = j6;
    }

    public static C2096f a(m mVar, AbstractC2095e abstractC2095e, int i) {
        B b3 = abstractC2095e.f18042v;
        C2096f c2096f = b3 == null ? null : b3.f18002n;
        if (c2096f != null && c2096f.f18045l) {
            int[] iArr = c2096f.f18047n;
            int i5 = 0;
            if (iArr == null) {
                int[] iArr2 = c2096f.f18049p;
                if (iArr2 != null) {
                    while (i5 < iArr2.length) {
                        if (iArr2[i5] == i) {
                            return null;
                        }
                        i5++;
                    }
                }
            } else {
                while (i5 < iArr.length) {
                    if (iArr[i5] != i) {
                        i5++;
                    }
                }
            }
            if (mVar.f17817v < c2096f.f18048o) {
                return c2096f;
            }
        }
        return null;
    }

    @Override // D3.c
    public final void b(D3.o oVar) {
        int i;
        int i5;
        int i6;
        int i7;
        int i8;
        long j5;
        long j6;
        int i9;
        if (this.f17824k.a()) {
            m3.l lVar = (m3.l) m3.k.b().f18078k;
            if (lVar == null || lVar.f18080l) {
                m mVar = (m) this.f17824k.f17795t.get(this.f17826m);
                if (mVar != null) {
                    Object obj = mVar.f17807l;
                    if (obj instanceof AbstractC2095e) {
                        AbstractC2095e abstractC2095e = (AbstractC2095e) obj;
                        int i10 = 0;
                        boolean z3 = this.f17827n > 0;
                        int i11 = abstractC2095e.f18037q;
                        if (lVar != null) {
                            z3 &= lVar.f18081m;
                            int i12 = lVar.f18082n;
                            int i13 = lVar.f18083o;
                            i = lVar.f18079k;
                            if (abstractC2095e.f18042v != null && !abstractC2095e.h()) {
                                C2096f a5 = a(mVar, abstractC2095e, this.f17825l);
                                if (a5 == null) {
                                    return;
                                }
                                boolean z5 = a5.f18046m && this.f17827n > 0;
                                i13 = a5.f18048o;
                                z3 = z5;
                            }
                            i6 = i12;
                            i5 = i13;
                        } else {
                            i = 0;
                            i5 = 100;
                            i6 = 5000;
                        }
                        C2057d c2057d = this.f17824k;
                        if (oVar.d()) {
                            i7 = 0;
                        } else {
                            if (oVar.f969d) {
                                i7 = 100;
                            } else {
                                Exception a6 = oVar.a();
                                if (a6 instanceof k3.d) {
                                    Status status = ((k3.d) a6).f17587k;
                                    int i14 = status.f7483k;
                                    j3.b bVar = status.f7486n;
                                    i10 = bVar == null ? -1 : bVar.f17502l;
                                    i7 = i14;
                                } else {
                                    i7 = 101;
                                }
                            }
                            i10 = -1;
                        }
                        if (z3) {
                            long j7 = this.f17827n;
                            long currentTimeMillis = System.currentTimeMillis();
                            i8 = i5;
                            i9 = (int) (SystemClock.elapsedRealtime() - this.f17828o);
                            j6 = currentTimeMillis;
                            j5 = j7;
                        } else {
                            i8 = i5;
                            j5 = 0;
                            j6 = 0;
                            i9 = -1;
                        }
                        Jt jt = c2057d.f17798w;
                        jt.sendMessage(jt.obtainMessage(18, new s(new m3.j(this.f17825l, i7, i10, j5, j6, null, null, i11, i9), i, i6, i8)));
                    }
                }
            }
        }
    }
}
