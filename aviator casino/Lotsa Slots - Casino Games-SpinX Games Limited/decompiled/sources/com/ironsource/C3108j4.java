package com.ironsource;

/* renamed from: com.ironsource.j4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3108j4 implements com.ironsource.InterfaceC3290t7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3055g4 f6322a;
    private final kotlin.jvm.functions.Function1<com.ironsource.C3381y8, java.lang.Object> b;
    private final com.ironsource.InterfaceC3380y7 c;
    private final com.ironsource.InterfaceC3216p4 d;
    private final java.lang.String e;
    private com.ironsource.C3381y8 f;
    private long g;
    private final com.ironsource.C2992cd h;
    private java.lang.String i;

    /* renamed from: com.ironsource.j4$a */
    /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.Result<? extends com.ironsource.C3381y8>, kotlin.Unit> {
        a(java.lang.Object obj) {
            super(1, obj, com.ironsource.C3108j4.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(java.lang.Object obj) {
            ((com.ironsource.C3108j4) this.receiver).b(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.Result<? extends com.ironsource.C3381y8> result) {
            a(result.getValue());
            return kotlin.Unit.INSTANCE;
        }
    }

    /* renamed from: com.ironsource.j4$b */
    /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.Result<? extends org.json.JSONObject>, kotlin.Unit> {
        b(java.lang.Object obj) {
            super(1, obj, com.ironsource.C3108j4.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(java.lang.Object obj) {
            ((com.ironsource.C3108j4) this.receiver).a(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.Result<? extends org.json.JSONObject> result) {
            a(result.getValue());
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3108j4(com.ironsource.C3055g4 config, kotlin.jvm.functions.Function1<? super com.ironsource.C3381y8, ? extends java.lang.Object> onFinish, com.ironsource.InterfaceC3380y7 downloadManager, com.ironsource.InterfaceC3216p4 currentTimeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f6322a = config;
        this.b = onFinish;
        this.c = downloadManager;
        this.d = currentTimeProvider;
        this.e = "j4";
        this.f = new com.ironsource.C3381y8(config.d(), "mobileController_0.html");
        this.g = currentTimeProvider.a();
        this.h = new com.ironsource.C2992cd(config.a());
        this.i = "";
    }

    @Override // com.ironsource.InterfaceC3290t7
    public com.ironsource.C3381y8 c() {
        return this.f;
    }

    public final kotlin.jvm.functions.Function1<com.ironsource.C3381y8, java.lang.Object> d() {
        return this.b;
    }

    public final com.ironsource.InterfaceC3216p4 a() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC3290t7
    public void b() {
        this.g = this.d.a();
        new com.ironsource.C2978c(new com.ironsource.C2996d(this.h), this.f6322a.d() + "/temp", this.c, new com.ironsource.C3108j4.b(this)).m();
    }

    @Override // com.ironsource.InterfaceC3290t7
    public boolean a(com.ironsource.C3381y8 file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        java.lang.String name = file.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "file.name");
        return new kotlin.text.Regex("mobileController(_\\d+)?\\.html").matches(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(java.lang.Object obj) {
        if (kotlin.Result.m10804isFailureimpl(obj)) {
            obj = null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        if (jSONObject != null && !kotlin.jvm.internal.Intrinsics.areEqual(jSONObject.optString("htmlBuildNumber"), "")) {
            com.ironsource.sdk.utils.SDKUtils.updateControllerConfig("abTestMap", jSONObject);
            java.lang.String string = jSONObject.getString("htmlBuildNumber");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "abTestMapAsJson.getString(\"htmlBuildNumber\")");
            this.i = string;
            com.ironsource.C3091i4 a2 = a(string);
            if (a2.j()) {
                com.ironsource.C3381y8 k = a2.k();
                this.f = k;
                this.b.invoke(k);
                return;
            }
            a2.m();
            return;
        }
        a("0").m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(java.lang.Object obj) {
        if (kotlin.Result.m10805isSuccessimpl(obj)) {
            com.ironsource.C3381y8 c3381y8 = (com.ironsource.C3381y8) (kotlin.Result.m10804isFailureimpl(obj) ? null : obj);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(c3381y8 != null ? c3381y8.getAbsolutePath() : null, this.f.getAbsolutePath())) {
                try {
                    com.ironsource.sdk.utils.IronSourceStorageUtils.deleteFile(this.f);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(c3381y8);
                    kotlin.io.FilesKt.copyTo$default(c3381y8, this.f, true, 0, 4, null);
                } catch (java.lang.Exception e) {
                    com.ironsource.C3180n4.d().a(e);
                    android.util.Log.e(this.e, "Unable to copy downloaded mobileController.html to cache folder: " + e.getMessage());
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(c3381y8);
                this.f = c3381y8;
            }
            new com.ironsource.InterfaceC3073h4.b(this.f6322a.b(), this.g, this.d).a();
        } else {
            new com.ironsource.InterfaceC3073h4.a(this.f6322a.b()).a();
        }
        kotlin.jvm.functions.Function1<com.ironsource.C3381y8, java.lang.Object> function1 = this.b;
        if (kotlin.Result.m10804isFailureimpl(obj)) {
            obj = null;
        }
        function1.invoke(obj);
    }

    private final com.ironsource.C3091i4 a(java.lang.String str) {
        return new com.ironsource.C3091i4(new com.ironsource.C3353wg(this.h, str), this.f6322a.d() + "/mobileController_" + str + ".html", this.c, new com.ironsource.C3108j4.a(this));
    }
}
