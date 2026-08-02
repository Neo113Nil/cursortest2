package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.il, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1123il implements Hr {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13978k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final Object f13979l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f13980m;

    public C1123il(C1773x6 c1773x6, Map map) {
        this.f13979l = map;
        this.f13980m = c1773x6;
    }

    @Override // com.google.android.gms.internal.ads.Hr
    public final void k(Dr dr, String str) {
        switch (this.f13978k) {
            case 0:
                Map map = (Map) this.f13979l;
                if (map.containsKey(dr)) {
                    ((C1773x6) this.f13980m).b(((C1079hl) map.get(dr)).f13784b);
                    return;
                }
                return;
            default:
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.P5)).booleanValue() && Dr.f8391o == dr) {
                    Qm qm = (Qm) this.f13979l;
                    if (qm.c() != 0) {
                        P2.o.f4767B.f4776j.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime() - qm.c();
                        synchronized (qm) {
                            synchronized (qm.f11256j) {
                                qm.f11253e = elapsedRealtime;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Hr
    public final void o(Dr dr, String str) {
        switch (this.f13978k) {
            case 0:
                Map map = (Map) this.f13979l;
                if (map.containsKey(dr)) {
                    ((C1773x6) this.f13980m).b(((C1079hl) map.get(dr)).f13783a);
                    return;
                }
                return;
            default:
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.P5)).booleanValue()) {
                    if (Dr.f8391o == dr) {
                        Qm qm = (Qm) this.f13979l;
                        P2.o.f4767B.f4776j.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        synchronized (qm) {
                            synchronized (qm.i) {
                                qm.f11252d = elapsedRealtime;
                            }
                        }
                        return;
                    }
                    if (Dr.f8386H == dr || Dr.f8390n == dr) {
                        Qm qm2 = (Qm) this.f13979l;
                        P2.o.f4767B.f4776j.getClass();
                        qm2.e(SystemClock.elapsedRealtime());
                        Rm rm = (Rm) this.f13980m;
                        ((C1390oj) rm.f475b).g(new E4.a(rm, ((Qm) this.f13979l).d()));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Hr
    public final void q(Dr dr, String str, Throwable th) {
        switch (this.f13978k) {
            case 0:
                Map map = (Map) this.f13979l;
                if (map.containsKey(dr)) {
                    ((C1773x6) this.f13980m).b(((C1079hl) map.get(dr)).f13785c);
                    return;
                }
                return;
            default:
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.P5)).booleanValue() && Dr.f8391o == dr) {
                    Qm qm = (Qm) this.f13979l;
                    if (qm.c() != 0) {
                        P2.o.f4767B.f4776j.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime() - qm.c();
                        synchronized (qm) {
                            synchronized (qm.f11256j) {
                                qm.f11253e = elapsedRealtime;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Hr
    public final void y(String str) {
        int i = this.f13978k;
    }

    public C1123il(Qm qm, Rm rm) {
        this.f13979l = qm;
        this.f13980m = rm;
    }

    private final void a(String str) {
    }

    private final void b(String str) {
    }
}
