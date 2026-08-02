package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.qe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1475qe implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f15134k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f15135l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f15136m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f15137n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f15138o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f15139p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f15140q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f15141r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15142s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f15143t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC1744we f15144u;

    public RunnableC1475qe(AbstractC1744we abstractC1744we, String str, String str2, long j5, long j6, long j7, long j8, long j9, boolean z3, int i, int i5) {
        this.f15134k = str;
        this.f15135l = str2;
        this.f15136m = j5;
        this.f15137n = j6;
        this.f15138o = j7;
        this.f15139p = j8;
        this.f15140q = j9;
        this.f15141r = z3;
        this.f15142s = i;
        this.f15143t = i5;
        this.f15144u = abstractC1744we;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f15134k);
        hashMap.put("cachedSrc", this.f15135l);
        hashMap.put("bufferedDuration", Long.toString(this.f15136m));
        hashMap.put("totalDuration", Long.toString(this.f15137n));
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8741P1)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f15138o));
            hashMap.put("qoeCachedBytes", Long.toString(this.f15139p));
            hashMap.put("totalBytes", Long.toString(this.f15140q));
            P2.o.f4767B.f4776j.getClass();
            hashMap.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        hashMap.put("cacheReady", true != this.f15141r ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f15142s));
        hashMap.put("playerPreparedCount", Integer.toString(this.f15143t));
        AbstractC1744we.j(this.f15144u, hashMap);
    }
}
