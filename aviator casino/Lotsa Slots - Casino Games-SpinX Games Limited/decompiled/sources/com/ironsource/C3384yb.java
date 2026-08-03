package com.ironsource;

/* renamed from: com.ironsource.yb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3384yb {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.F0 f6852a;

    public C3384yb(com.ironsource.F0 f0) {
        this.f6852a = f0;
    }

    public void a(boolean z) {
        a(z, false);
    }

    public void b(int i) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errorCode", java.lang.Integer.valueOf(i));
        this.f6852a.a(com.ironsource.C0.SKIP_RELOAD_AD, hashMap);
    }

    public void c() {
        this.f6852a.a(com.ironsource.C0.PRELOAD_ADUNIT_LOAD_SUCCESS, new java.util.HashMap());
    }

    public void d() {
        this.f6852a.a(com.ironsource.C0.RELOAD_AD, new java.util.HashMap());
    }

    public void a(boolean z, boolean z2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (z) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PUBLISHER_LOAD, java.lang.Boolean.TRUE);
        }
        if (z2) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "preload");
        }
        this.f6852a.a(com.ironsource.C0.LOAD_AD, hashMap);
    }

    public void b(long j, int i, boolean z) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        hashMap.put("errorCode", java.lang.Integer.valueOf(i));
        if (z) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "preload");
        }
        this.f6852a.a(com.ironsource.C0.LOAD_AD_NO_FILL, hashMap);
    }

    public void a(int i) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sessionDepth", java.lang.Integer.valueOf(i));
        this.f6852a.a(com.ironsource.C0.DESTROY_AD, hashMap);
    }

    public void b() {
        this.f6852a.a(com.ironsource.C0.PRELOAD_ADUNIT_INITIATED, new java.util.HashMap());
    }

    public void a(long j, boolean z) {
        a(j, z, false);
    }

    public void a(long j, boolean z, boolean z2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        if (z) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PUBLISHER_LOAD, java.lang.Boolean.TRUE);
        }
        if (z2) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "preload");
        }
        this.f6852a.a(com.ironsource.C0.LOAD_AD_SUCCESS, hashMap);
    }

    public void a(long j) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        this.f6852a.a(com.ironsource.C0.RELOAD_AD_SUCCESS, hashMap);
    }

    public void a(long j, int i, boolean z) {
        a(j, i, z, false);
    }

    public void a(long j, int i, boolean z, boolean z2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        hashMap.put("errorCode", java.lang.Integer.valueOf(i));
        if (z) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PUBLISHER_LOAD, java.lang.Boolean.TRUE);
        }
        if (z2) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "preload");
        }
        this.f6852a.a(com.ironsource.C0.LOAD_AD_FAILED, hashMap);
    }

    public void a(long j, int i, java.lang.String str, boolean z) {
        a(j, i, str, z, false);
    }

    public void a(long j, int i, java.lang.String str, boolean z, boolean z2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        hashMap.put("errorCode", java.lang.Integer.valueOf(i));
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        if (z) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PUBLISHER_LOAD, java.lang.Boolean.TRUE);
        }
        if (z2) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "preload");
        }
        this.f6852a.a(com.ironsource.C0.LOAD_AD_FAILED_WITH_REASON, hashMap);
    }

    public void a(long j, int i, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        hashMap.put("errorCode", java.lang.Integer.valueOf(i));
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f6852a.a(com.ironsource.C0.RELOAD_AD_FAILED_WITH_REASON, hashMap);
    }

    public void a(boolean z, long j, boolean z2) {
        com.ironsource.C0 c0;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        if (z2) {
            hashMap.put("errorCode", java.lang.Integer.valueOf(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_RV_EXPIRED_ADS));
            hashMap.put("reason", "loaded ads are expired");
        }
        com.ironsource.F0 f0 = this.f6852a;
        if (z) {
            c0 = com.ironsource.C0.AD_AVAILABILITY_CHANGED_TRUE;
        } else {
            c0 = com.ironsource.C0.AD_AVAILABILITY_CHANGED_FALSE;
        }
        f0.a(c0, hashMap);
    }

    public void a(long j, int i) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        hashMap.put("errorCode", java.lang.Integer.valueOf(i));
        this.f6852a.a(com.ironsource.C0.RELOAD_AD_NO_FILL, hashMap);
    }

    public void a(java.lang.Boolean bool, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f6852a.a(bool.booleanValue() ? com.ironsource.C0.AD_READY_TRUE : com.ironsource.C0.AD_READY_FALSE, hashMap);
    }

    public void a() {
        this.f6852a.a(com.ironsource.C0.PRELOAD_ADUNIT_FAILED, new java.util.HashMap());
    }
}
