package com.ironsource;

/* loaded from: classes5.dex */
public final class N9 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.N9 f5854a = new com.ironsource.N9();
    private static final com.ironsource.C3078h9 b = new com.ironsource.C3078h9();

    public static final class a implements com.unity3d.ironsourceads.InitListener {
        a() {
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(com.ironsource.mediationsdk.logger.IronSourceError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }
    }

    private N9() {
    }

    public final void b(boolean z) {
        a(z);
        new com.ironsource.C3188nc().a(z);
    }

    public static final class b implements com.ironsource.InterfaceC3297te {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f5855a;
        final /* synthetic */ com.ironsource.C3056g5 b;
        final /* synthetic */ com.unity3d.ironsourceads.InitListener c;

        b(android.content.Context context, com.ironsource.C3056g5 c3056g5, com.unity3d.ironsourceads.InitListener initListener) {
            this.f5855a = context;
            this.b = c3056g5;
            this.c = initListener;
        }

        @Override // com.ironsource.InterfaceC3297te
        public void a(com.ironsource.C3190ne sdkConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            com.ironsource.N9.f5854a.a(this.f5855a, sdkConfig.d(), this.b, this.c);
        }

        @Override // com.ironsource.InterfaceC3297te
        public void a(com.ironsource.C3226pe error, com.ironsource.C2988c9 c2988c9) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.ironsource.N9.f5854a.a(this.c, this.b, error);
        }
    }

    public final void a(final android.content.Context context, final com.unity3d.ironsourceads.InitRequest initRequest, final com.unity3d.ironsourceads.InitListener initializationListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        com.ironsource.mediationsdk.logger.IronLog.API.info("IronSourceAds.init() appkey: " + initRequest.getAppKey() + ", legacyAdFormats: " + initRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        b.a(new java.lang.Runnable() { // from class: com.ironsource.N9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.N9.a(com.unity3d.ironsourceads.InitRequest.this, context, initializationListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.unity3d.ironsourceads.InitRequest initRequest, android.content.Context context, com.unity3d.ironsourceads.InitListener initializationListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationListener, "$initializationListener");
        com.ironsource.C3056g5 c3056g5 = new com.ironsource.C3056g5();
        com.ironsource.Ce.f5659a.c(context, new com.ironsource.C3333ve(initRequest.getAppKey(), null, kotlin.collections.ArraysKt.toMutableList(b.a(initRequest.getLegacyAdFormats())), 2, null), new com.ironsource.N9.b(context, c3056g5, initializationListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(android.content.Context context, com.ironsource.Ve ve, com.ironsource.C3056g5 c3056g5, com.unity3d.ironsourceads.InitListener initListener) {
        java.lang.String o = com.ironsource.mediationsdk.p.h().o();
        com.ironsource.X8 g = ve.g();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(g, "serverResponse.initialConfiguration");
        com.ironsource.mediationsdk.model.NetworkSettings b2 = ve.l().b("IronSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b2, "serverResponse.providerS…s.IRONSOURCE_CONFIG_NAME)");
        org.json.JSONObject interstitialSettings = b2.getInterstitialSettings();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(interstitialSettings, "networkSettings.interstitialSettings");
        g.a(new com.ironsource.X.a(interstitialSettings, com.ironsource.Jb.u.d().h()));
        g.a(com.ironsource.mediationsdk.config.ConfigFile.getConfigFile().getPluginType());
        g.b(o);
        new com.ironsource.Z(new com.ironsource.C3224pc()).a(context, g, new com.ironsource.N9.a());
        a(ve, c3056g5, initListener);
    }

    private final void a(com.ironsource.Ve ve, com.ironsource.C3056g5 c3056g5, final com.unity3d.ironsourceads.InitListener initListener) {
        com.ironsource.L1 e;
        com.ironsource.C1 b2 = ve.c().b();
        new com.ironsource.Kb().a((b2 == null || (e = b2.e()) == null) ? null : e.b(), true);
        java.lang.String sessionId = com.ironsource.mediationsdk.p.h().o();
        com.ironsource.C3099ic a2 = com.ironsource.C3099ic.e.a();
        a2.a(ve.l());
        a2.a(ve.c());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
        a2.a(sessionId);
        a2.g();
        long a3 = com.ironsource.C3056g5.a(c3056g5);
        com.ironsource.C3078h9 c3078h9 = b;
        com.ironsource.Ve.a i = ve.i();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i, "serverResponse.origin");
        c3078h9.a(a3, i);
        c3078h9.b(new java.lang.Runnable() { // from class: com.ironsource.N9$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.N9.a(com.unity3d.ironsourceads.InitListener.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.unity3d.ironsourceads.InitListener initListener) {
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("InitListener.onInitSuccess()");
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final com.unity3d.ironsourceads.InitListener initListener, com.ironsource.C3056g5 c3056g5, final com.ironsource.C3226pe c3226pe) {
        long a2 = com.ironsource.C3056g5.a(c3056g5);
        com.ironsource.C3078h9 c3078h9 = b;
        final com.ironsource.C3226pe b2 = c3078h9.b(c3226pe);
        c3078h9.a(b2, a2);
        c3078h9.b(new java.lang.Runnable() { // from class: com.ironsource.N9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.N9.a(com.ironsource.C3226pe.this, initListener, b2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3226pe error, com.unity3d.ironsourceads.InitListener initListener, com.ironsource.C3226pe eventError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventError, "$eventError");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("InitListener.onInitFailed() error " + error);
        if (initListener != null) {
            initListener.onInitFailed(b.a(eventError));
        }
    }

    private final void a(boolean z) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, java.lang.String.valueOf(z));
        com.ironsource.Jb.u.d().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.CONSENT_IADS, jSONObject));
    }

    public final void a(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(value);
        com.ironsource.mediationsdk.p.h().a(key, arrayList);
    }
}
