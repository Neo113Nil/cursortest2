package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.gp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1038gp implements Mp {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13655a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13656b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13657c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13658d;

    /* renamed from: e, reason: collision with root package name */
    public final C1343nh f13659e;
    public final C1040gr f;

    /* renamed from: g, reason: collision with root package name */
    public final Wq f13660g;

    /* renamed from: h, reason: collision with root package name */
    public final T2.I f13661h = P2.o.f4767B.f4774g.d();
    public final C1392ol i;

    /* renamed from: j, reason: collision with root package name */
    public final C1567sh f13662j;

    public C1038gp(Context context, String str, String str2, C1343nh c1343nh, C1040gr c1040gr, Wq wq, C1392ol c1392ol, C1567sh c1567sh, long j5) {
        this.f13655a = context;
        this.f13656b = str;
        this.f13657c = str2;
        this.f13659e = c1343nh;
        this.f = c1040gr;
        this.f13660g = wq;
        this.i = c1392ol;
        this.f13662j = c1567sh;
        this.f13658d = j5;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final int a() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final E3.a d() {
        Bundle bundle = new Bundle();
        this.i.f14844a.put("seq_num", this.f13656b);
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8805b2)).booleanValue()) {
            C1392ol c1392ol = this.i;
            P2.o.f4767B.f4776j.getClass();
            c1392ol.a("tsacc", String.valueOf(System.currentTimeMillis() - this.f13658d));
            this.i.a("foreground", true != T2.L.f(this.f13655a) ? "1" : "0");
        }
        C1343nh c1343nh = this.f13659e;
        Q2.X0 x02 = this.f13660g.f12098d;
        C1878zd c1878zd = c1343nh.f14681l;
        synchronized (c1878zd.f16613d) {
            c1878zd.f16610a.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c1878zd.f16617j = elapsedRealtime;
            c1878zd.f16611b.f(x02, elapsedRealtime);
        }
        bundle.putAll(this.f.a());
        return AbstractC1400ot.c0(new C1083hp(this.f13655a, bundle, this.f13656b, this.f13657c, this.f13661h, this.f13660g.f, this.f13662j));
    }
}
