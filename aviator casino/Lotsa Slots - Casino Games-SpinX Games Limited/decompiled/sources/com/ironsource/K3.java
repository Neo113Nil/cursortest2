package com.ironsource;

/* loaded from: classes5.dex */
public final class K3 implements com.ironsource.S5 {

    /* renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f5797a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.K3.a f5798a = new com.ironsource.K3.a();
        public static final boolean b = false;

        private a() {
        }
    }

    public K3(org.json.JSONObject jSONObject) {
        this.f5797a = jSONObject == null ? new org.json.JSONObject() : jSONObject;
    }

    @Override // com.ironsource.S5
    public boolean b() {
        return this.f5797a.optBoolean("clickCheck", false);
    }
}
