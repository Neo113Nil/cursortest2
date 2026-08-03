package com.ironsource;

/* loaded from: classes5.dex */
public abstract class R3 implements com.ironsource.InterfaceC3272s7 {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.InterfaceC3254r7 f5945a;

    protected R3(org.json.JSONObject jSONObject, android.content.Context context) {
        this.f5945a = a(jSONObject, context);
        com.ironsource.sdk.utils.Logger.i("R3", "created ConnectivityAdapter with strategy " + this.f5945a.getClass().getSimpleName());
    }

    public org.json.JSONObject a(android.content.Context context) {
        return this.f5945a.c(context);
    }

    @Override // com.ironsource.InterfaceC3272s7
    public void a() {
    }

    @Override // com.ironsource.InterfaceC3272s7
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
    }

    public void b(android.content.Context context) {
        this.f5945a.b(context);
    }

    @Override // com.ironsource.InterfaceC3272s7
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
    }

    public void c(android.content.Context context) {
        this.f5945a.a(context);
    }

    public void b() {
        this.f5945a.a();
    }

    private com.ironsource.InterfaceC3254r7 a(org.json.JSONObject jSONObject, android.content.Context context) {
        if (jSONObject.optInt(com.ironsource.X3.j.g0) == 1) {
            return new com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy(this);
        }
        boolean c = com.ironsource.E1.c(context, "android.permission.ACCESS_NETWORK_STATE");
        if (android.os.Build.VERSION.SDK_INT >= 23 && c) {
            return new com.ironsource.C3081hc(this);
        }
        return new com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy(this);
    }
}
