package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* loaded from: classes5.dex */
public final class g implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f {
    public static final int i = 8;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7506a;
    public final kotlinx.coroutines.CoroutineScope b;
    public final kotlinx.coroutines.flow.MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n> c;
    public final kotlinx.coroutines.flow.SharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n> d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v e;
    public final android.webkit.WebView f;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> g;
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> h;

    public static final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o {
        public a() {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o
        public boolean a(java.lang.String fromUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fromUrl, "fromUrl");
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g.this.b(fromUrl);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBridgeImpl$consumeMraidJsCommand$1", f = "MraidBridge.kt", i = {0}, l = {101}, m = "invokeSuspend", n = {"cmd"}, s = {"L$0"})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7508a;
        public int b;
        public final /* synthetic */ com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.b.a> c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.b.a> vVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g gVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g.b> continuation) {
            super(2, continuation);
            this.c = vVar;
            this.d = gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g.b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n nVar;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n nVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n) ((com.moloco.sdk.internal.v.b) this.c).a();
                kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = this.d.c;
                this.f7508a = nVar2;
                this.b = 1;
                if (mutableSharedFlow.emit(nVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                nVar = nVar2;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n) this.f7508a;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.d.a(nVar);
            return kotlin.Unit.INSTANCE;
        }
    }

    public g(android.content.Context context, kotlinx.coroutines.CoroutineScope scope, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.f7506a = z;
        this.b = kotlinx.coroutines.CoroutineScopeKt.plus(scope, com.moloco.sdk.internal.scheduling.b.a().getMain());
        kotlinx.coroutines.flow.MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.c = MutableSharedFlow$default;
        this.d = MutableSharedFlow$default;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v vVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v(context, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g.a());
        this.e = vVar;
        this.f = vVar;
        this.g = vVar.c();
        this.h = vVar.getUnrecoverableError();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> H() {
        return this.g;
    }

    public final boolean b(java.lang.String str) {
        com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.b.a> a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.b.a(str);
        if (a2 instanceof com.moloco.sdk.internal.v.b) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g.b(a2, this, null), 3, null);
            return true;
        }
        if (a2 instanceof com.moloco.sdk.internal.v.a) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.b.a) ((com.moloco.sdk.internal.v.a) a2).a()).b();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public android.webkit.WebView c() {
        return this.f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        this.e.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public void j() {
        c("mraidbridge.notifyReadyEvent()");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public kotlinx.coroutines.flow.SharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n> v() {
        return this.d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> w() {
        return this.h;
    }

    public final void c(java.lang.String str) {
        this.e.loadUrl("javascript:" + str);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n nVar) {
        c("mraidbridge.nativeCallComplete(" + org.json.JSONObject.quote(nVar.a()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n command, java.lang.String msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        c("mraidbridge.notifyErrorEvent(" + org.json.JSONObject.quote(command.a()) + ", " + org.json.JSONObject.quote(msg) + ')');
    }

    public final java.lang.String b(android.graphics.Rect rect) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(rect.width());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(rect.height());
        return sb.toString();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public void a(boolean z) {
        c("mraidbridge.setIsViewable(" + z + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r placementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementType, "placementType");
        c("mraidbridge.setPlacementType(" + org.json.JSONObject.quote(placementType.c()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        c("mraidbridge.setState(" + org.json.JSONObject.quote(state.c()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public void a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        c("mraidbridge.setSupports(" + z + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA + z2 + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA + z3 + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA + z4 + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA + z5 + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s screenMetrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
        c("\n                mraidbridge.setScreenSize(" + b(screenMetrics.g()) + ");\n                mraidbridge.setMaxSize(" + b(screenMetrics.f()) + ");\n                mraidbridge.setCurrentPosition(" + a(screenMetrics.b()) + ");\n                mraidbridge.setDefaultPosition(" + a(screenMetrics.d()) + ")\n            ");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("mraidbridge.notifySizeChangeEvent(");
        sb.append(b(screenMetrics.b()));
        sb.append(')');
        c(sb.toString());
    }

    public final java.lang.String a(android.graphics.Rect rect) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(rect.left);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(rect.top);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(rect.width());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(rect.height());
        return sb.toString();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> continuation) {
        return this.e.a(str, this.f7506a, continuation);
    }
}
