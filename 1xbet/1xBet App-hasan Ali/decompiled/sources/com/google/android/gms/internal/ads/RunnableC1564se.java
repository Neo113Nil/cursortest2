package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.se, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1564se implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f15553k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f15554l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f15555m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f15556n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f15557o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f15558p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f15559q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15560r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15561s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1879ze f15562t;

    public RunnableC1564se(C1879ze c1879ze, String str, String str2, int i, int i5, long j5, long j6, boolean z3, int i6, int i7) {
        this.f15553k = str;
        this.f15554l = str2;
        this.f15555m = i;
        this.f15556n = i5;
        this.f15557o = j5;
        this.f15558p = j6;
        this.f15559q = z3;
        this.f15560r = i6;
        this.f15561s = i7;
        this.f15562t = c1879ze;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f15553k);
        hashMap.put("cachedSrc", this.f15554l);
        hashMap.put("bytesLoaded", Integer.toString(this.f15555m));
        hashMap.put("totalBytes", Integer.toString(this.f15556n));
        hashMap.put("bufferedDuration", Long.toString(this.f15557o));
        hashMap.put("totalDuration", Long.toString(this.f15558p));
        hashMap.put("cacheReady", true != this.f15559q ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f15560r));
        hashMap.put("playerPreparedCount", Integer.toString(this.f15561s));
        AbstractC1744we.j(this.f15562t, hashMap);
    }
}
