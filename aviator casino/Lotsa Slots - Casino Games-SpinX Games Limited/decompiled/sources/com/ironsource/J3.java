package com.ironsource;

/* loaded from: classes5.dex */
public final class J3 implements com.ironsource.S5 {

    /* renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f5765a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.J3.a f5766a = new com.ironsource.J3.a();
        public static final boolean b = false;
        public static final java.lang.String c = "curlError";

        private a() {
        }
    }

    public J3(org.json.JSONObject jSONObject) {
        this.f5765a = jSONObject == null ? new org.json.JSONObject() : jSONObject;
    }

    @Override // com.ironsource.S5
    public boolean b() {
        return this.f5765a.optBoolean("enabled", false);
    }

    public final boolean d() {
        return this.f5765a.optBoolean("closeActivity", true);
    }

    public final boolean e() {
        return this.f5765a.optBoolean("reportController", true);
    }
}
