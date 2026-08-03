package com.ironsource;

/* loaded from: classes5.dex */
public final class Z implements com.ironsource.Y {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3206oc f6107a;

    public static final class a implements com.ironsource.Lc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.X8 f6108a;
        final /* synthetic */ com.unity3d.ironsourceads.InitListener b;

        a(com.ironsource.X8 x8, com.unity3d.ironsourceads.InitListener initListener) {
            this.f6108a = x8;
            this.b = initListener;
        }

        @Override // com.ironsource.Lc
        public void onFail(com.ironsource.C3220p8 error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + error);
            this.b.onInitFailed(com.ironsource.C3306u5.f6757a.a(new com.ironsource.mediationsdk.logger.IronSourceError(error.a(), error.b())));
        }

        @Override // com.ironsource.Lc
        public void onSuccess() {
            com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            com.ironsource.X e = this.f6108a.e();
            ironLog.verbose("controllerURL = " + (e != null ? e.a() : null));
            com.ironsource.X e2 = this.f6108a.e();
            ironLog.verbose("controllerConfig = " + (e2 != null ? e2.b() : null));
            com.ironsource.X e3 = this.f6108a.e();
            ironLog.verbose("debugMode = " + (e3 != null ? java.lang.Integer.valueOf(e3.c()) : null));
            ironLog.verbose("applicationKey = " + this.f6108a.d());
            ironLog.verbose("userId = " + this.f6108a.h());
            this.b.onInitSuccess();
        }
    }

    public Z(com.ironsource.InterfaceC3206oc networkInitApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInitApi, "networkInitApi");
        this.f6107a = networkInitApi;
    }

    @Override // com.ironsource.Y
    public void a(android.content.Context context, com.ironsource.X8 initConfig, com.unity3d.ironsourceads.InitListener initListener) {
        org.json.JSONObject b;
        java.lang.String a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initConfig, "initConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initListener, "initListener");
        com.ironsource.InterfaceC3206oc interfaceC3206oc = this.f6107a;
        com.ironsource.X e = initConfig.e();
        interfaceC3206oc.a(e != null ? e.c() : 0);
        com.ironsource.X e2 = initConfig.e();
        if (e2 != null && (a2 = e2.a()) != null) {
            this.f6107a.b(a2);
        }
        com.ironsource.X e3 = initConfig.e();
        if (e3 != null && (b = e3.b()) != null) {
            com.ironsource.InterfaceC3206oc interfaceC3206oc2 = this.f6107a;
            java.lang.String jSONObject = b.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "applicationConfig.toString()");
            interfaceC3206oc2.a(jSONObject);
        }
        java.util.Map<java.lang.String, java.lang.String> a3 = new com.ironsource.C3170mc().a();
        this.f6107a.a(new com.ironsource.Z.a(initConfig, initListener));
        this.f6107a.a(context, initConfig.d(), initConfig.h(), a3);
    }
}
