package com.ironsource;

/* loaded from: classes5.dex */
public class W8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.F0 f6043a;

    public W8(com.ironsource.F0 f0) {
        this.f6043a = f0;
    }

    public void a(java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str + "|" + str2);
        this.f6043a.a(com.ironsource.C0.INIT_STARTED, hashMap);
    }

    public void a(long j) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        this.f6043a.a(com.ironsource.C0.INIT_ENDED, hashMap);
    }

    public void a() {
        this.f6043a.a(com.ironsource.C0.INIT_SUCCESS, null);
    }

    public void a(int i, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errorCode", java.lang.Integer.valueOf(i));
        hashMap.put("reason", str);
        this.f6043a.a(com.ironsource.C0.INIT_FAILED, hashMap);
    }
}
