package com.ironsource;

/* loaded from: classes5.dex */
public final class N5 implements com.ironsource.Kc {

    /* renamed from: a, reason: collision with root package name */
    private boolean f5850a = true;
    private java.lang.String b = com.ironsource.O5.j;

    public static final class a implements com.ironsource.InterfaceC3040f7 {
        a() {
        }

        @Override // com.ironsource.InterfaceC3040f7
        public void a(boolean z) {
            if (z) {
                return;
            }
            com.ironsource.mediationsdk.logger.IronLog.API.error("failed to send impression data");
        }
    }

    private final org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.ironsource.Va.o, "android");
        android.content.Context applicationContext = com.ironsource.environment.ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", com.ironsource.mediationsdk.utils.IronSourceUtils.b(applicationContext));
            com.ironsource.P9 d = com.ironsource.mediationsdk.utils.IronSourceUtils.d(applicationContext);
            if (d != null) {
                jSONObject.put("advId", d.c());
                jSONObject.put("advIdType", d.d());
            }
        }
        java.lang.String i = com.ironsource.mediationsdk.p.h().i();
        if (i != null) {
            jSONObject.put(com.ironsource.X3.j.g, i);
        }
        return jSONObject;
    }

    @Override // com.ironsource.Kc
    public void a() {
    }

    public final void a(java.lang.String dataSource, org.json.JSONObject impressionData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        if (!this.f5850a) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            org.json.JSONObject b = b();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("externalMediationSource", dataSource);
            jSONObject.putOpt("externalMediationData", impressionData);
            jSONObject.putOpt("clientParams", b);
            com.ironsource.mediationsdk.logger.IronLog.API.info("impressionData: " + jSONObject);
            com.ironsource.C3022e7.a(this.b, jSONObject.toString(), new com.ironsource.N5.a());
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.API.error("exception " + e.getMessage() + " sending impression data");
        }
    }

    @Override // com.ironsource.Kc
    public void g(java.lang.String str) {
    }

    @Override // com.ironsource.Kc
    public void a(java.util.List<com.ironsource.mediationsdk.IronSource.a> list, boolean z, com.ironsource.N3 n3) {
        if (n3 != null) {
            com.ironsource.C1 b = n3.b();
            com.ironsource.M1 f = b != null ? b.f() : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(f);
            this.f5850a = f.l();
            this.b = n3.b().f().d();
        }
    }
}
