package com.ironsource;

/* renamed from: com.ironsource.jg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3120jg {
    private com.ironsource.mediationsdk.model.NetworkSettings b;

    /* renamed from: a, reason: collision with root package name */
    private java.util.ArrayList<java.lang.String> f6329a = new java.util.ArrayList<>();
    private org.json.JSONObject c = null;
    private boolean d = true;

    C3120jg() {
    }

    public void a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        this.b = networkSettings;
    }

    public org.json.JSONObject b() {
        return this.c;
    }

    public com.ironsource.mediationsdk.model.NetworkSettings c() {
        return this.b;
    }

    public java.util.ArrayList<java.lang.String> d() {
        return this.f6329a;
    }

    public boolean e() {
        return this.d;
    }

    public void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f6329a.add(str);
    }

    public void a(org.json.JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public static com.ironsource.C3120jg a() {
        return new com.ironsource.C3120jg();
    }
}
