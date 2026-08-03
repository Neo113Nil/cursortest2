package com.ironsource;

/* loaded from: classes5.dex */
public class O {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.F0 f5863a;

    public O(com.ironsource.F0 f0) {
        this.f5863a = f0;
    }

    public void a(android.app.Activity activity, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        if (activity != null) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW);
        }
        this.f5863a.a(com.ironsource.C0.SHOW_AD, hashMap);
    }

    public void b(java.lang.String str) {
        a(str, (java.lang.String) null);
    }

    public void c(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("placement", str);
        this.f5863a.a(com.ironsource.C0.AD_DISMISS_SCREEN, hashMap);
    }

    public void d(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f5863a.a(com.ironsource.C0.AD_ENDED, hashMap);
    }

    public void e(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f5863a.a(com.ironsource.C0.AD_INFO_CHANGED, hashMap);
    }

    public void f(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("placement", str);
        this.f5863a.a(com.ironsource.C0.AD_LEFT_APPLICATION, hashMap);
    }

    public void g(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f5863a.a(com.ironsource.C0.AD_OPENED, hashMap);
    }

    public void h(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("placement", str);
        this.f5863a.a(com.ironsource.C0.AD_PRESENT_SCREEN, hashMap);
    }

    public void i(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f5863a.a(com.ironsource.C0.AD_STARTED, hashMap);
    }

    public void j(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("placement", str);
        this.f5863a.a(com.ironsource.C0.AD_VIEW_BOUND, hashMap);
    }

    public void k(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f5863a.a(com.ironsource.C0.AD_VISIBLE, hashMap);
    }

    public void b(java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("placement", str);
        if (!android.text.TextUtils.isEmpty(str2)) {
            hashMap.put("reason", str2);
        }
        this.f5863a.a(com.ironsource.C0.PLACEMENT_CAPPED, hashMap);
    }

    public void a(boolean z) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("status", z ? "true" : "false");
        this.f5863a.a(com.ironsource.C0.SHOW_AD_CHANCE, hashMap);
    }

    public void a(java.lang.String str, int i, java.lang.String str2, com.ironsource.Nd nd) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        hashMap.put("errorCode", java.lang.Integer.valueOf(i));
        hashMap.put("reason", str2);
        java.lang.String a2 = a(nd);
        if (a2 != null) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, a2);
        }
        this.f5863a.a(com.ironsource.C0.SHOW_AD_FAILED, hashMap);
    }

    public void a(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f5863a.a(com.ironsource.C0.AD_CLICKED, hashMap);
    }

    public void a(java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str2);
        }
        this.f5863a.a(com.ironsource.C0.AD_CLOSED, hashMap);
    }

    public void a(java.lang.String str, java.lang.String str2, int i, long j, java.lang.String str3, long j2, java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str4) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME, str2);
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT, java.lang.Integer.valueOf(i));
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j2 != 0) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j2));
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!android.text.TextUtils.isEmpty(str4)) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        this.f5863a.a(com.ironsource.C0.AD_REWARDED, hashMap, j);
    }

    public void a(java.lang.String str, java.lang.String str2, boolean z) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("isMultipleAdUnits", 1);
        hashMap.put("placement", str);
        if (!android.text.TextUtils.isEmpty(str2)) {
            hashMap.put("reason", str2);
        }
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, z ? "true" : "false");
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        this.f5863a.a(com.ironsource.C0.CHECK_PLACEMENT_CAPPED, hashMap);
    }

    public void a() {
        this.f5863a.a(com.ironsource.C0.SESSION_CAPPED, null);
    }

    private static java.lang.String a(com.ironsource.Nd nd) {
        if (nd != com.ironsource.Nd.NO_LOADED_ADS && nd != com.ironsource.Nd.MAX_ATTEMPTS_REACHED) {
            return null;
        }
        return "recover show failed: " + nd.b();
    }
}
