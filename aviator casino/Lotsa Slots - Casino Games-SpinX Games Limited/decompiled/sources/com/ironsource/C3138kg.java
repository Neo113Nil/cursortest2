package com.ironsource;

/* renamed from: com.ironsource.kg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3138kg {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.F0 f6350a;

    public C3138kg(com.ironsource.F0 f0) {
        this.f6350a = f0;
    }

    public void a(int i, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errorCode", java.lang.Integer.valueOf(i));
        hashMap.put("reason", str);
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str2);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_NOTIFICATION_ERROR, hashMap);
    }

    public void b(int i, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errorCode", java.lang.Integer.valueOf(i));
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_LOAD_FAILED, hashMap);
    }

    public void c() {
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_LOAD_SUCCESS, null);
    }

    public void d() {
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_SHOW, null);
    }

    public void e() {
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_SHOW_SUCCESS, null);
    }

    public void f(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_ILLEGAL_STATE, hashMap);
    }

    public void g(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_INTERNAL_ERROR, hashMap);
    }

    public void h(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_LOAD_SKIPPED, hashMap);
    }

    public void i(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, hashMap);
    }

    public void j(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, hashMap);
    }

    public void k(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, hashMap);
    }

    public void l(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_CLOSED, hashMap);
    }

    public void m(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, hashMap);
    }

    public void n(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, hashMap);
    }

    public void o(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, hashMap);
    }

    public void p(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, hashMap);
    }

    public void q(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_OPENED, hashMap);
    }

    public void r(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, hashMap);
    }

    public void s(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, hashMap);
    }

    public void t(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, hashMap);
    }

    public void u(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT, hashMap);
    }

    public void v(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_WATERFALL_OVERHEAD, hashMap);
    }

    public void c(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, hashMap);
    }

    public void d(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, hashMap);
    }

    public void e(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, hashMap);
    }

    public void b() {
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_LOAD, null);
    }

    public void a(java.lang.Long l) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, l);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_LOAD_WHILE_LOADED, hashMap);
    }

    public void b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_IMPRESSION_TIMEOUT, hashMap);
    }

    public void a(com.unity3d.mediation.LevelPlayAdError levelPlayAdError) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errorCode", java.lang.Integer.valueOf(levelPlayAdError.getErrorCode()));
        hashMap.put("reason", levelPlayAdError.getErrorMessage());
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_SHOW_FAILED, hashMap);
    }

    public void a(int i, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errorCode", java.lang.Integer.valueOf(i));
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, hashMap);
    }

    public void a(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reason", str);
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_AD_EXPIRED, hashMap);
    }

    public void a(java.lang.String str, long j) {
        java.lang.String str2;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str.isEmpty()) {
            str2 = "";
        } else {
            str2 = "provider=" + str + ";";
        }
        sb.append(str2);
        sb.append("expirationDuration=");
        sb.append(j);
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, sb.toString());
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_AD_EXPIRED, hashMap);
    }

    public void a(boolean z, long j) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "isAnimated:" + (z ? 1 : 0));
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION, hashMap);
    }

    public void a(long j) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED, hashMap);
    }

    public void a(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo, com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, java.lang.String.format(java.util.Locale.ENGLISH, "oldAdNetwork=%s;oldInstanceId=%s;oldRevenue=%.3f;oldPrecision=%s;newAdNetwork=%s;newInstanceId=%s;newRevenue=%.3f;newPrecision=%s;delta=%.3f", levelPlayAdInfo.getAdNetwork(), levelPlayAdInfo.getInstanceId(), java.lang.Double.valueOf(levelPlayAdInfo.getRevenue()), levelPlayAdInfo.getPrecision(), levelPlayAdInfo2.getAdNetwork(), levelPlayAdInfo2.getInstanceId(), java.lang.Double.valueOf(levelPlayAdInfo2.getRevenue()), levelPlayAdInfo2.getPrecision(), java.lang.Double.valueOf(levelPlayAdInfo2.getRevenue() - levelPlayAdInfo.getRevenue())));
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_AD_INFO_CHANGED, hashMap);
    }

    public void a() {
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, null);
    }

    public void a(com.ironsource.V8 v8) {
        java.util.HashMap hashMap = new java.util.HashMap();
        double o = v8.o();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, java.lang.String.format(java.util.Locale.ENGLISH, "revenue=%.3f,auctionId=%s", java.lang.Double.valueOf(o), v8.e()));
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_ILR_REVENUE, hashMap);
    }

    public void a(com.ironsource.Nd nd) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, nd.b());
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, hashMap);
    }

    public void a(long j, long j2, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, java.lang.String.format(java.util.Locale.ENGLISH, "refreshDuration=%d;notVisibleDuration=%d;reason=%s", java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), str));
        this.f6350a.a(com.ironsource.C0.TROUBLESHOOT_RELOAD, hashMap);
    }
}
