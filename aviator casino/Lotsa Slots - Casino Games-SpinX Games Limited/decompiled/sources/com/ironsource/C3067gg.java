package com.ironsource;

/* renamed from: com.ironsource.gg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3067gg {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.F0 f6277a;

    public C3067gg(com.ironsource.F0 f0) {
        this.f6277a = f0;
    }

    public void a(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f6277a.a(com.ironsource.C0.COLLECT_TOKENS_FAILED, hashMap);
    }

    public void b(long j) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        this.f6277a.a(com.ironsource.C0.COLLECT_TOKENS_COMPLETED, hashMap);
    }

    public void b(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f6277a.a(com.ironsource.C0.INSTANCE_COLLECT_TOKEN, hashMap);
    }

    public void a() {
        a(new java.util.HashMap());
    }

    public void a(long j) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "timeout=" + j);
        a(hashMap);
    }

    public void b(java.util.Map<java.lang.String, java.lang.Object> map, long j) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f6277a.a(com.ironsource.C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, hashMap);
    }

    public void a(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.f6277a.a(com.ironsource.C0.COLLECT_TOKEN, map);
    }

    public void a(java.util.Map<java.lang.String, java.lang.Object> map, long j) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f6277a.a(com.ironsource.C0.INSTANCE_COLLECT_TOKEN_SUCCESS, hashMap);
    }

    public void a(java.util.Map<java.lang.String, java.lang.Object> map, long j, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f6277a.a(com.ironsource.C0.INSTANCE_COLLECT_TOKEN_FAILED, hashMap);
    }
}
