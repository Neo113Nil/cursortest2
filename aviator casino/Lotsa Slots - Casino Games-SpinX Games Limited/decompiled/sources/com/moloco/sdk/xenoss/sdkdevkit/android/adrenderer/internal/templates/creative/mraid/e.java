package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

/* loaded from: classes5.dex */
public final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.WebView f7564a;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.MraidJsEventSenderImpl$sendJs$1", f = "MraidJsEventSender.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7565a;
        public final /* synthetic */ java.lang.String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.e.a> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.e.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.e.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7565a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.e.this.f7564a.loadUrl("javascript:" + this.c);
            return kotlin.Unit.INSTANCE;
        }
    }

    public e(android.webkit.WebView webView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
        this.f7564a = webView;
    }

    public final void b(java.lang.String str) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain()), null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.e.a(str, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(java.lang.String commandString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commandString, "commandString");
        b("mraidbridge.nativeCallComplete(" + org.json.JSONObject.quote(commandString) + ')');
    }

    public final java.lang.String b(android.graphics.Rect rect) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(rect.width());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(rect.height());
        return sb.toString();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(java.lang.String commandString, java.lang.String msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commandString, "commandString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        b("mraidbridge.notifyErrorEvent(" + org.json.JSONObject.quote(commandString) + ", " + org.json.JSONObject.quote(msg) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(boolean z) {
        b("mraidbridge.setIsViewable(" + z + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r placementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementType, "placementType");
        b("mraidbridge.setPlacementType(" + org.json.JSONObject.quote(placementType.c()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        b("mraidbridge.setState(" + org.json.JSONObject.quote(state.c()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        b("mraidbridge.setSupports(" + z + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA + z2 + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA + z3 + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA + z4 + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA + z5 + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s screenMetrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
        b("\n                mraidbridge.setScreenSize(" + b(screenMetrics.g()) + ");\n                mraidbridge.setMaxSize(" + b(screenMetrics.f()) + ");\n                mraidbridge.setCurrentPosition(" + a(screenMetrics.b()) + ");\n                mraidbridge.setDefaultPosition(" + a(screenMetrics.d()) + ");\n                mraidbridge.notifySizeChangeEvent(" + b(screenMetrics.b()) + ");\n            ");
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
}
