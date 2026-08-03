package com.unity3d.ads.adplayer;

/* compiled from: FullScreenWebViewDisplay.kt */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0011\u0010\u001d\u001a\u00020\u001eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u00020\u001e2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020\u001eH\u0014J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020\u001eH\u0014J\b\u0010.\u001a\u00020\u001eH\u0014J\u0010\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020(H\u0016J\"\u00101\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u001b2\b\b\u0002\u00103\u001a\u00020(H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064²\u0006\n\u00105\u001a\u000206X\u008a\u0084\u0002"}, d2 = {"Lcom/unity3d/ads/adplayer/FullScreenWebViewDisplay;", "Landroidx/activity/ComponentActivity;", "Lcom/unity3d/services/core/di/IServiceComponent;", "()V", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "getAdObject", "()Lcom/unity3d/ads/core/data/model/AdObject;", "adObject$delegate", "Lkotlin/Lazy;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "getDispatchers", "()Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers$delegate", "opportunityId", "", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getSendDiagnosticEvent", "()Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent$delegate", "showOptions", "", "", "startForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "listenToAdPlayerEvents", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWebView", "webView", "Landroid/webkit/WebView;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "", "keyCode", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", com.ironsource.X3.i.t0, com.ironsource.X3.i.u0, "onWindowFocusChanged", "hasFocus", "openUrl", "intent", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT, "unity-ads_defaultRelease", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FullScreenWebViewDisplay extends androidx.activity.ComponentActivity implements com.unity3d.services.core.di.IServiceComponent {

    /* renamed from: dispatchers$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy dispatchers;

    /* renamed from: sendDiagnosticEvent$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy sendDiagnosticEvent;
    private java.util.Map<java.lang.String, ? extends java.lang.Object> showOptions;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> startForResult;
    private java.lang.String opportunityId = "";

    /* renamed from: adObject$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy adObject = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.model.AdObject>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$adObject$2
        {
            super(0);
        }

        private static final com.unity3d.ads.core.data.repository.AdRepository invoke$lambda$0(kotlin.Lazy<? extends com.unity3d.ads.core.data.repository.AdRepository> lazy) {
            return lazy.getValue();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final com.unity3d.ads.core.data.model.AdObject invoke() {
            java.lang.Object m10798constructorimpl;
            java.lang.String str;
            final com.unity3d.ads.adplayer.FullScreenWebViewDisplay fullScreenWebViewDisplay = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.this;
            final java.lang.String str2 = "";
            kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.repository.AdRepository>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$adObject$2$invoke$$inlined$inject$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.data.repository.AdRepository, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.unity3d.ads.core.data.repository.AdRepository invoke() {
                    com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.AdRepository.class));
                }
            });
            com.unity3d.ads.adplayer.FullScreenWebViewDisplay fullScreenWebViewDisplay2 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.this;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.unity3d.ads.core.data.repository.AdRepository invoke$lambda$0 = invoke$lambda$0(lazy);
                str = fullScreenWebViewDisplay2.opportunityId;
                java.util.UUID fromString = java.util.UUID.fromString(str);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromString, "fromString(opportunityId)");
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(invoke$lambda$0.getAd(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(fromString)));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
                m10798constructorimpl = null;
            }
            return (com.unity3d.ads.core.data.model.AdObject) m10798constructorimpl;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startForResult$lambda$7(androidx.activity.result.ActivityResult activityResult) {
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        return keyCode == 4;
    }

    public FullScreenWebViewDisplay() {
        final java.lang.String str = "";
        final com.unity3d.ads.adplayer.FullScreenWebViewDisplay fullScreenWebViewDisplay = this;
        this.sendDiagnosticEvent = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.SendDiagnosticEvent>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.SendDiagnosticEvent invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class));
            }
        });
        this.dispatchers = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.services.core.domain.ISDKDispatchers>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.services.core.domain.ISDKDispatchers, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.services.core.domain.ISDKDispatchers invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class));
            }
        });
        androidx.activity.result.ActivityResultLauncher<android.content.Intent> registerForActivityResult = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult(), new androidx.activity.result.ActivityResultCallback() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay.startForResult$lambda$7((androidx.activity.result.ActivityResult) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…n to this activity.\n    }");
        this.startForResult = registerForActivityResult;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public com.unity3d.services.core.di.IServiceProvider getServiceProvider() {
        return com.unity3d.services.core.di.IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    private final com.unity3d.ads.core.domain.SendDiagnosticEvent getSendDiagnosticEvent() {
        return (com.unity3d.ads.core.domain.SendDiagnosticEvent) this.sendDiagnosticEvent.getValue();
    }

    private final com.unity3d.ads.core.data.model.AdObject getAdObject() {
        return (com.unity3d.ads.core.data.model.AdObject) this.adObject.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.unity3d.services.core.domain.ISDKDispatchers getDispatchers() {
        return (com.unity3d.services.core.domain.ISDKDispatchers) this.dispatchers.getValue();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        kotlinx.coroutines.CoroutineScope scope;
        java.lang.Object m10798constructorimpl;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map;
        super.onCreate(savedInstanceState);
        java.lang.String stringExtra = getIntent().getStringExtra("opportunityId");
        if (stringExtra == null) {
            stringExtra = "not_provided";
        }
        this.opportunityId = stringExtra;
        if (kotlin.jvm.internal.Intrinsics.areEqual(stringExtra, "not_provided")) {
            setResult(0);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$1(this, null), 3, null);
            finish();
            return;
        }
        com.unity3d.ads.core.data.model.AdObject adObject = getAdObject();
        com.unity3d.ads.adplayer.AdPlayer adPlayer = adObject != null ? adObject.getAdPlayer() : null;
        if (adPlayer == null || (scope = adPlayer.getScope()) == null || !kotlinx.coroutines.CoroutineScopeKt.isActive(scope)) {
            setResult(0);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$2(this, null), 3, null);
            finish();
            return;
        }
        boolean hasExtra = getIntent().hasExtra("orientation");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(hasExtra);
        valueOf.getClass();
        if (!hasExtra) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            setRequestedOrientation(getIntent().getIntExtra("orientation", -1));
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("showOptions");
        if (stringExtra2 != null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay fullScreenWebViewDisplay = this;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(com.unity3d.ads.core.extensions.JSONObjectExtensionsKt.toBuiltInMap(new org.json.JSONObject(stringExtra2)));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
                m10798constructorimpl = null;
            }
            map = (java.util.Map) m10798constructorimpl;
        } else {
            map = null;
        }
        this.showOptions = map;
        com.unity3d.ads.adplayer.FullScreenWebViewDisplay fullScreenWebViewDisplay2 = this;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(fullScreenWebViewDisplay2), null, null, new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$6(this, null), 3, null);
        androidx.activity.OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "onBackPressedDispatcher");
        androidx.activity.OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, fullScreenWebViewDisplay2, false, new kotlin.jvm.functions.Function1<androidx.activity.OnBackPressedCallback, kotlin.Unit>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$7
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.activity.OnBackPressedCallback addCallback) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.activity.OnBackPressedCallback onBackPressedCallback) {
                invoke2(onBackPressedCallback);
                return kotlin.Unit.INSTANCE;
            }
        }, 2, null);
    }

    static /* synthetic */ void openUrl$default(com.unity3d.ads.adplayer.FullScreenWebViewDisplay fullScreenWebViewDisplay, java.lang.String str, android.content.Intent intent, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        fullScreenWebViewDisplay.openUrl(str, intent, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openUrl(java.lang.String opportunityId, android.content.Intent intent, boolean useActivityForResult) {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.ads.adplayer.FullScreenWebViewDisplay fullScreenWebViewDisplay = this;
            if (intent.resolveActivity(getPackageManager()) != null && useActivityForResult) {
                this.startForResult.launch(intent);
            } else {
                intent.setFlags(268435456);
                startActivity(intent);
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(this), getDispatchers().getDefault(), null, new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$openUrl$1(opportunityId, kotlin.Result.m10805isSuccessimpl(m10798constructorimpl), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadWebView(android.webkit.WebView webView) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(getDispatchers().getMain()), null, null, new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1(webView, this, null), 3, null);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onResume$1(this, null), 3, null);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$1(this, null), 3, null);
        if (isFinishing()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$2(this, null), 3, null);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (isFinishing()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onDestroy$1(this, null), 3, null);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onWindowFocusChanged$1(this, hasFocus, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object listenToAdPlayerEvents(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.flow.SharedFlow onSubscription = kotlinx.coroutines.flow.FlowKt.onSubscription(com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages(), new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this, cancellableContinuationImpl, null));
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(new kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.DisplayMessage>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;
                final /* synthetic */ com.unity3d.ads.adplayer.FullScreenWebViewDisplay this$0;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2", f = "FullScreenWebViewDisplay.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.unity3d.ads.adplayer.FullScreenWebViewDisplay fullScreenWebViewDisplay) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = fullScreenWebViewDisplay;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.lang.String str;
                    if (continuation instanceof com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj2 = anonymousClass1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                java.lang.String opportunityId = ((com.unity3d.ads.adplayer.DisplayMessage) obj).getOpportunityId();
                                str = this.this$0.opportunityId;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(opportunityId, str)) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.DisplayMessage> flowCollector, kotlin.coroutines.Continuation continuation2) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2(flowCollector, this), continuation2);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this, null)), androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(this));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }
}
