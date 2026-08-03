package com.ironsource;

/* loaded from: classes5.dex */
public class T1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.F0 f5970a;

    public T1(com.ironsource.F0 f0) {
        this.f5970a = f0;
    }

    public void a(java.lang.Double d) {
        java.util.HashMap hashMap;
        if (d != null) {
            hashMap = new java.util.HashMap();
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "flooring=" + d);
        } else {
            hashMap = null;
        }
        this.f5970a.a(com.ironsource.C0.AUCTION_REQUEST, hashMap);
    }

    public void b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str);
        this.f5970a.a(com.ironsource.C0.AUCTION_REQUEST_WATERFALL, hashMap);
    }

    public void c(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str);
        this.f5970a.a(com.ironsource.C0.AUCTION_RESULT_WATERFALL, hashMap);
    }

    java.lang.String a(int i, int i2, int i3, int i4) {
        return "interstitial=" + i + ";rewarded=" + i2 + ";banner=" + i3 + ";native=" + i4;
    }

    public void a(long j, int i, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        hashMap.put("errorCode", java.lang.Integer.valueOf(i));
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f5970a.a(com.ironsource.C0.AUCTION_FAILED, hashMap);
    }

    public void a(int i, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errorCode", java.lang.Integer.valueOf(i));
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f5970a.a(com.ironsource.C0.AUCTION_FAILED_NO_CANDIDATES, hashMap);
    }

    public void a(long j, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str);
        this.f5970a.a(com.ironsource.C0.AUCTION_SUCCESS, hashMap);
    }

    public void a(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("auctionId", str);
        this.f5970a.a(com.ironsource.C0.AD_FORMAT_CAPPED, hashMap);
    }
}
