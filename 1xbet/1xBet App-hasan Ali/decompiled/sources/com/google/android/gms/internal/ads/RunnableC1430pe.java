package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.pe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1430pe implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f15009k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f15010l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f15011m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f15012n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1789xe f15013o;

    public RunnableC1430pe(C1789xe c1789xe, String str, String str2, int i, int i5) {
        this.f15009k = str;
        this.f15010l = str2;
        this.f15011m = i;
        this.f15012n = i5;
        this.f15013o = c1789xe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f15009k);
        hashMap.put("cachedSrc", this.f15010l);
        hashMap.put("bytesLoaded", Integer.toString(this.f15011m));
        hashMap.put("totalBytes", Integer.toString(this.f15012n));
        hashMap.put("cacheReady", "0");
        AbstractC1744we.j(this.f15013o, hashMap);
    }
}
