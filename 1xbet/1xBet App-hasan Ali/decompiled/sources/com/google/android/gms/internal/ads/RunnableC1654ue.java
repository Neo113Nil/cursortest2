package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ue, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1654ue implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15869k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f15870l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f15871m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f15872n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f15873o;

    public RunnableC1654ue(AbstractC1744we abstractC1744we, String str, String str2, long j5) {
        this.f15871m = str;
        this.f15872n = str2;
        this.f15870l = j5;
        this.f15873o = abstractC1744we;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15869k) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("event", "precacheComplete");
                hashMap.put("src", (String) this.f15871m);
                hashMap.put("cachedSrc", (String) this.f15872n);
                hashMap.put("totalDuration", Long.toString(this.f15870l));
                AbstractC1744we.j((AbstractC1744we) this.f15873o, hashMap);
                return;
            default:
                Op op = (Op) this.f15871m;
                long j5 = this.f15870l;
                Mp mp = (Mp) this.f15872n;
                Bundle bundle = (Bundle) this.f15873o;
                op.getClass();
                P2.o oVar = P2.o.f4767B;
                oVar.f4776j.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime() - j5;
                if (((Boolean) AbstractC1146j8.f14087a.s()).booleanValue()) {
                    String canonicalName = mp.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = "";
                    }
                    T2.G.m("Signal runtime (ms) : " + canonicalName + " = " + elapsedRealtime);
                }
                A7 a7 = F7.f8805b2;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    if (((Boolean) rVar.f5056c.a(F7.f8825f2)).booleanValue()) {
                        synchronized (op) {
                            bundle.putLong("sig" + mp.a(), elapsedRealtime);
                        }
                    }
                }
                if (((Boolean) rVar.f5056c.a(F7.f8793Z1)).booleanValue()) {
                    C1390oj a5 = op.f11005e.a();
                    a5.k("action", "lat_ms");
                    a5.k("lat_grp", "sig_lat_grp");
                    a5.k("lat_id", String.valueOf(mp.a()));
                    a5.k("clat_ms", String.valueOf(elapsedRealtime));
                    if (((Boolean) rVar.f5056c.a(F7.f8799a2)).booleanValue()) {
                        synchronized (op) {
                            op.f11006g++;
                        }
                        a5.k("seq_num", oVar.f4774g.f8011c.f8515c.j());
                        synchronized (op) {
                            try {
                                if (op.f11006g == op.f11002b.size() && op.f != 0) {
                                    op.f11006g = 0;
                                    oVar.f4776j.getClass();
                                    String valueOf = String.valueOf(SystemClock.elapsedRealtime() - op.f);
                                    if (mp.a() <= 39 || mp.a() >= 52) {
                                        a5.k("lat_clsg", valueOf);
                                    } else {
                                        a5.k("lat_gmssg", valueOf);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    ((C1482ql) a5.f14828m).f15166b.execute(new RunnableC1437pl(a5, 1));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC1654ue(Op op, long j5, Mp mp, Bundle bundle) {
        this.f15871m = op;
        this.f15870l = j5;
        this.f15872n = mp;
        this.f15873o = bundle;
    }
}
