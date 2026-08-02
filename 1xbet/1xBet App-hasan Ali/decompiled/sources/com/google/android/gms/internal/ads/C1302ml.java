package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.ml, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1302ml implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14529a;

    /* renamed from: b, reason: collision with root package name */
    public final CD f14530b;

    /* renamed from: c, reason: collision with root package name */
    public final CD f14531c;

    /* renamed from: d, reason: collision with root package name */
    public final CD f14532d;

    public /* synthetic */ C1302ml(CD cd, CD cd2, CD cd3, int i) {
        this.f14529a = i;
        this.f14530b = cd;
        this.f14531c = cd2;
        this.f14532d = cd3;
    }

    public Oo a() {
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        return new Oo(c0606Hd, this.f14530b.d(), this.f14531c.d(), this.f14532d.d(), 2);
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f14529a) {
            case 0:
                return new C1257ll((C1392ol) this.f14530b.d(), (C1616tl) this.f14531c.d(), ((Integer) this.f14532d.d()).intValue());
            case 1:
                return new C0905dr((C0817br) this.f14530b.d(), (C0855cl) this.f14531c.d(), (C1482ql) this.f14532d.d(), 20, false);
            case 2:
                return a();
            case 3:
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                C1441pp c1441pp = new C1441pp(c0606Hd, 2);
                C1396op c1396op = (C1396op) this.f14530b.d();
                List list = (List) this.f14531c.d();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f14532d.d();
                if (list.contains("24")) {
                    return new C1890zp(c1396op, ((Integer) Q2.r.f5053d.f5056c.a(F7.Mb)).intValue(), scheduledExecutorService);
                }
                return new C1890zp(c1441pp, ((Integer) Q2.r.f5053d.f5056c.a(F7.Mb)).intValue(), scheduledExecutorService);
            default:
                return new Jq((Fq) this.f14530b.d(), (Bq) this.f14531c.d(), (Tq) this.f14532d.d());
        }
    }
}
