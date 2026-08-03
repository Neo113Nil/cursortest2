package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

/* loaded from: classes5.dex */
public final class c extends androidx.webkit.WebViewClientCompat implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c.a m = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c.a(null);
    public static final int n = 8;
    public static final java.lang.String o = "WebViewClientImpl";

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f7546a;
    public final com.moloco.sdk.internal.services.s b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h c;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> d;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> e;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> f;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> g;
    public final kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> h;
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> i;
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> j;
    public final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> k;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a l;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.WebViewClientImpl$shouldOverrideUrlLoading$1$1$1", f = "WebViewClientImpl.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7547a;
        public final /* synthetic */ java.lang.String c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c.b> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7547a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.services.s sVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c.this.b;
                java.lang.String str = this.c;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar = this.d;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h e = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c.this.e();
                kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c.this.j;
                this.f7547a = 1;
                if (sVar.a(str, aVar, e, mutableSharedFlow, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public /* synthetic */ c(kotlinx.coroutines.CoroutineScope coroutineScope, com.moloco.sdk.internal.services.s sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, sVar, (i & 4) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a() : hVar);
    }

    public static /* synthetic */ void j() {
    }

    public final void c() {
        this.d.setValue(java.lang.Boolean.TRUE);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h e() {
        return this.c;
    }

    public final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> f() {
        return this.k;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a i() {
        return this.l;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> l() {
        return this.i;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> m() {
        return this.e;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> o() {
        return this.g;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        super.onPageFinished(webView, str);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = this.d;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        mutableStateFlow.setValue(bool);
        this.f.setValue(bool);
    }

    @Override // android.webkit.WebViewClient
    @kotlin.Deprecated(message = "Deprecated in Android API 23")
    public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.h.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.c);
        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, o, "onReceivedError " + str, null, false, 12, null);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        this.h.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.d);
        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, o, "onRenderProcessGone", null, false, 12, null);
        return true;
    }

    @Override // android.webkit.WebViewClient
    @kotlin.Deprecated(message = "Deprecated in Android API 24")
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar;
        if (str == null || (aVar = this.l) == null) {
            return true;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f7546a, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c.b(str, aVar, null), 3, null);
        return true;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a adTouch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTouch, "adTouch");
        this.l = adTouch;
    }

    public c(kotlinx.coroutines.CoroutineScope scope, com.moloco.sdk.internal.services.s clickthroughService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h buttonTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        this.f7546a = scope;
        this.b = clickthroughService;
        this.c = buttonTracker;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.d = MutableStateFlow;
        this.e = MutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.f = MutableStateFlow2;
        this.g = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.h = MutableStateFlow3;
        this.i = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow3);
        kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.j = MutableSharedFlow$default;
        this.k = MutableSharedFlow$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c button) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "button");
        this.c.a(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a buttonType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.c.a(buttonType);
    }
}
