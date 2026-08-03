package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ge, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383ge {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f5986a;

    public C0383ge() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f5986a = hashMap;
        hashMap.put("google_aid", "g");
        hashMap.put("huawei_oaid", "h");
        hashMap.put("sim_info", "si");
        hashMap.put("features_collecting", "fc");
        hashMap.put("permissions_collecting", "pc");
        hashMap.put("retry_policy", "rp");
        hashMap.put("cache_control", "cc");
        hashMap.put("attribution", "at");
        hashMap.put("startup_update", "su");
        hashMap.put("ssl_pinning", "sp");
        hashMap.put("external_attribution", "exta");
    }

    public final java.lang.String a(java.lang.String str) {
        return this.f5986a.containsKey(str) ? (java.lang.String) this.f5986a.get(str) : str;
    }
}
