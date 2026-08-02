package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class Gn implements InterfaceC1259ln {

    /* renamed from: a, reason: collision with root package name */
    public final C0594Ff f9260a;

    /* renamed from: b, reason: collision with root package name */
    public final An f9261b;

    /* renamed from: c, reason: collision with root package name */
    public final C0606Hd f9262c;

    /* renamed from: d, reason: collision with root package name */
    public final Oh f9263d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f9264e;
    public final C1392ol f;

    public Gn(C0594Ff c0594Ff, An an, Oh oh, ScheduledExecutorService scheduledExecutorService, C0606Hd c0606Hd, C1392ol c1392ol) {
        this.f9260a = c0594Ff;
        this.f9261b = an;
        this.f9263d = oh;
        this.f9264e = scheduledExecutorService;
        this.f9262c = c0606Hd;
        this.f = c1392ol;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final boolean a(Sq sq, Lq lq) {
        InterfaceC1059h9 a5 = ((Wq) sq.f11595a.f11722l).a();
        boolean a6 = this.f9261b.a(sq, lq);
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Bb)).booleanValue()) {
            String str = a5 != null ? "1" : "0";
            C1392ol c1392ol = this.f;
            c1392ol.f14844a.put("has_dbl", str);
            c1392ol.f14844a.put("crdb", true == a6 ? "1" : "0");
        }
        return a5 != null && a6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final E3.a b(Sq sq, Lq lq) {
        return this.f9262c.d(new CallableC0564Bh(this, sq, lq, 3));
    }
}
