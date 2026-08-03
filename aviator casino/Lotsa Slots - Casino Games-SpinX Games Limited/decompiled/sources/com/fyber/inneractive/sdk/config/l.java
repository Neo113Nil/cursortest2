package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f3618a = new java.util.HashMap();

    public final boolean a() {
        try {
            if (this.f3618a.containsKey("dsos")) {
                return java.lang.Boolean.parseBoolean((java.lang.String) this.f3618a.get("dsos"));
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
