package com.google.android.gms.internal.ads;

import java.util.Optional;

/* renamed from: com.google.android.gms.internal.ads.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1317n implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14559k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f14560l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f14561m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f14562n;

    public RunnableC1317n(A3 a32, String str, long j5) {
        this.f14561m = str;
        this.f14560l = j5;
        this.f14562n = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Optional filter;
        Optional map;
        Optional map2;
        Optional empty;
        long j5 = this.f14560l;
        Object obj = this.f14561m;
        Object obj2 = this.f14562n;
        switch (this.f14559k) {
            case 0:
                C0709Wb c0709Wb = (C0709Wb) obj;
                c0709Wb.getClass();
                int i = AbstractC1260lo.f14419a;
                C1109iE c1109iE = ((SurfaceHolderCallbackC0974fE) c0709Wb.f12041m).f13463k;
                SE se = c1109iE.f13883A;
                OE l5 = se.l();
                se.i(l5, 26, new Hq(l5, obj2, j5));
                if (c1109iE.f13896P == obj2) {
                    Fz fz = new Fz(29);
                    Fk fk = c1109iE.f13921v;
                    fk.c(26, fz);
                    fk.b();
                    break;
                }
                break;
            case 1:
                A3 a32 = (A3) obj2;
                a32.f7519k.a((String) obj, j5);
                a32.f7519k.b(a32.toString());
                break;
            default:
                Optional optional = (Optional) obj2;
                C1174js c1174js = (C1174js) obj;
                U4 u42 = c1174js.f14184n;
                if (u42 != null) {
                    J2.c a5 = J2.c.a(c1174js.f14177e.f4936l);
                    filter = optional.filter(new C1623ts(0));
                    map = filter.map(new C1078hk(3));
                    map2 = map.map(new C1078hk(4));
                    empty = Optional.empty();
                    u42.r(a5, empty, "pano_ts", this.f14560l, map2);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC1317n(C0709Wb c0709Wb, Object obj, long j5) {
        this.f14561m = c0709Wb;
        this.f14562n = obj;
        this.f14560l = j5;
    }

    public /* synthetic */ RunnableC1317n(C1174js c1174js, long j5, Optional optional) {
        this.f14561m = c1174js;
        this.f14560l = j5;
        this.f14562n = optional;
    }
}
