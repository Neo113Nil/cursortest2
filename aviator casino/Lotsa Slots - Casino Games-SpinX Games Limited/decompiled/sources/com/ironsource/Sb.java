package com.ironsource;

/* loaded from: classes5.dex */
public final class Sb implements com.ironsource.Tb {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f5961a;
    private final com.ironsource.sdk.controller.e b;
    private final com.ironsource.T8 c;
    private final com.ironsource.InterfaceC2998d1 d;
    private final java.lang.String e;
    private com.ironsource.Tb.a f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.Sb.a f5962a = new com.ironsource.Sb.a();
        public static final java.lang.String b = "nativeAd.load";
        public static final java.lang.String c = "nativeAd.loadReport";
        public static final java.lang.String d = "nativeAd.register";
        public static final java.lang.String e = "nativeAd.click";
        public static final java.lang.String f = "nativeAd.privacyClick";
        public static final java.lang.String g = "nativeAd.visibilityChanged";
        public static final java.lang.String h = "nativeAd.destroy";

        private a() {
        }
    }

    public Sb(java.lang.String id, com.ironsource.sdk.controller.e controllerManager, com.ironsource.T8 imageLoader, com.ironsource.InterfaceC2998d1 adViewManagement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controllerManager, "controllerManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
        this.f5961a = id;
        this.b = controllerManager;
        this.c = imageLoader;
        this.d = adViewManagement;
        this.e = "Sb";
        controllerManager.a(id, d());
    }

    private final com.ironsource.sdk.controller.l.b d() {
        return new com.ironsource.sdk.controller.l.b() { // from class: com.ironsource.Sb$$ExternalSyntheticLambda2
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(com.ironsource.Mb mb) {
                com.ironsource.Sb.a(com.ironsource.Sb.this, mb);
            }
        };
    }

    private final org.json.JSONObject e() {
        org.json.JSONObject put = new org.json.JSONObject().put(com.ironsource.sdk.controller.f.b.g, com.ironsource.Sb.a.e).put("sdkCallback", com.ironsource.X3.h.U);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n        .pu…hods.ON_RECEIVED_MESSAGE)");
        return put;
    }

    @Override // com.ironsource.Tb
    public void a(com.ironsource.Tb.a aVar) {
        this.f = aVar;
    }

    @Override // com.ironsource.Tb
    public com.ironsource.Tb.a b() {
        return this.f;
    }

    @Override // com.ironsource.Tb
    public void c() {
        this.b.a(new com.ironsource.sdk.controller.f.c(this.f5961a, com.ironsource.Sb.a.f, new org.json.JSONObject()), (com.ironsource.sdk.controller.l.a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.Sb this$0, com.ironsource.sdk.controller.f.a it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.b(it);
    }

    @Override // com.ironsource.Tb
    public void a(final android.app.Activity activity, org.json.JSONObject loadParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.b.a(activity);
        this.b.a(new com.ironsource.sdk.controller.f.c(this.f5961a, com.ironsource.Sb.a.b, loadParams), new com.ironsource.sdk.controller.l.a() { // from class: com.ironsource.Sb$$ExternalSyntheticLambda1
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(com.ironsource.sdk.controller.f.a aVar) {
                com.ironsource.Sb.a(com.ironsource.Sb.this, activity, aVar);
            }
        });
    }

    private final void b(com.ironsource.sdk.controller.f.a aVar) {
        if (aVar.d() == null) {
            com.ironsource.sdk.utils.Logger.i(this.e, "failed to handle show on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            java.lang.String optString = aVar.d().optString("reason", "unexpected error");
            com.ironsource.sdk.utils.Logger.i(this.e, "failed to handle show on native ad: " + optString);
            return;
        }
        com.ironsource.Tb.a b = b();
        if (b != null) {
            b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.Sb this$0, android.app.Activity activity, com.ironsource.sdk.controller.f.a it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "$activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(activity, it);
    }

    private final void a(android.app.Activity activity, com.ironsource.sdk.controller.f.a aVar) {
        if (aVar.d() == null) {
            com.ironsource.Tb.a b = b();
            if (b != null) {
                b.a("failed to load native ad: missing params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            java.lang.String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            com.ironsource.Tb.a b2 = b();
            if (b2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(reason, "reason");
                b2.a(reason);
                return;
            }
            return;
        }
        com.ironsource.C8.b a2 = new com.ironsource.C8.a(this.c, this.d).a(activity, aVar.d());
        a(a2, a2.a().h());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Sb(java.lang.String str, com.ironsource.sdk.controller.e eVar, com.ironsource.T8 t8, com.ironsource.InterfaceC2998d1 interfaceC2998d1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, eVar, t8, interfaceC2998d1);
        t8 = (i & 4) != 0 ? new com.ironsource.S8(null, 1, null) : t8;
        if ((i & 8) != 0) {
            interfaceC2998d1 = com.ironsource.C3148l8.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(interfaceC2998d1, "getInstance()");
        }
    }

    private final void a(com.ironsource.C8.b bVar, final com.ironsource.C8 c8) {
        this.b.a(new com.ironsource.sdk.controller.f.c(this.f5961a, "nativeAd.loadReport." + this.f5961a, bVar.b()), new com.ironsource.sdk.controller.l.a() { // from class: com.ironsource.Sb$$ExternalSyntheticLambda4
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(com.ironsource.sdk.controller.f.a aVar) {
                com.ironsource.Sb.a(com.ironsource.Sb.this, c8, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.Sb this$0, com.ironsource.C8 adData, com.ironsource.sdk.controller.f.a it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adData, "$adData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(adData, it);
    }

    private final void a(com.ironsource.C8 c8, com.ironsource.sdk.controller.f.a aVar) {
        if (aVar.d() == null) {
            com.ironsource.Tb.a b = b();
            if (b != null) {
                b.a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            java.lang.String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            com.ironsource.Tb.a b2 = b();
            if (b2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(reason, "reason");
                b2.a(reason);
                return;
            }
            return;
        }
        com.ironsource.Tb.a b3 = b();
        if (b3 != null) {
            b3.a(c8);
        }
    }

    @Override // com.ironsource.Tb
    public void a() {
        this.b.a(new com.ironsource.sdk.controller.f.c(this.f5961a, com.ironsource.Sb.a.h, new org.json.JSONObject()), (com.ironsource.sdk.controller.l.a) null);
    }

    @Override // com.ironsource.Tb
    public void a(com.ironsource.F8 viewHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        org.json.JSONObject params = new org.json.JSONObject().put("assetViews", viewHolder.t()).put("adViewClickCommand", e());
        java.lang.String str = this.f5961a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(params, "params");
        this.b.a(new com.ironsource.sdk.controller.f.c(str, com.ironsource.Sb.a.d, params), (com.ironsource.sdk.controller.l.a) null);
    }

    @Override // com.ironsource.Tb
    public void a(com.ironsource.Ag viewVisibilityParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
        this.b.a(new com.ironsource.sdk.controller.f.c(this.f5961a, com.ironsource.Sb.a.g, viewVisibilityParams.g()), new com.ironsource.sdk.controller.l.a() { // from class: com.ironsource.Sb$$ExternalSyntheticLambda0
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(com.ironsource.sdk.controller.f.a aVar) {
                com.ironsource.Sb.b(com.ironsource.Sb.this, aVar);
            }
        });
    }

    @Override // com.ironsource.Tb
    public void a(org.json.JSONObject clickParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickParams, "clickParams");
        this.b.a(new com.ironsource.sdk.controller.f.c(this.f5961a, com.ironsource.Sb.a.e, clickParams), new com.ironsource.sdk.controller.l.a() { // from class: com.ironsource.Sb$$ExternalSyntheticLambda3
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(com.ironsource.sdk.controller.f.a aVar) {
                com.ironsource.Sb.a(com.ironsource.Sb.this, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.Sb this$0, com.ironsource.sdk.controller.f.a it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(it);
    }

    private final void a(com.ironsource.sdk.controller.f.a aVar) {
        if (aVar.d() == null) {
            com.ironsource.sdk.utils.Logger.i(this.e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            java.lang.String optString = aVar.d().optString("reason", "unexpected error");
            com.ironsource.sdk.utils.Logger.i(this.e, "failed to handle click on native ad: " + optString);
            return;
        }
        com.ironsource.Tb.a b = b();
        if (b != null) {
            b.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.Sb this$0, com.ironsource.Mb msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        if (kotlin.jvm.internal.Intrinsics.areEqual(msg.e(), com.ironsource.Sb.a.e)) {
            this$0.a(msg);
        }
    }

    private final void a(com.ironsource.Mb mb) {
        if (mb.f() == null) {
            com.ironsource.sdk.utils.Logger.i(this.e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!mb.f().optBoolean("success", false)) {
            java.lang.String optString = mb.f().optString("reason", "unexpected error");
            com.ironsource.sdk.utils.Logger.i(this.e, "failed to handle click on native ad: " + optString);
            return;
        }
        com.ironsource.Tb.a b = b();
        if (b != null) {
            b.e();
        }
    }
}
