package com.unity3d.services;

/* compiled from: UnityAdsSDK.kt */
@kotlin.Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bJ\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0015\u001a\u00020\bJ.\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\"\u0010\u001f\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u000f\u001a\u00020\"R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002²\u0006\n\u0010.\u001a\u00020/X\u008a\u0084\u0002²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002²\u0006\n\u00100\u001a\u000201X\u008a\u0084\u0002²\u0006\n\u00102\u001a\u000203X\u008a\u0084\u0002²\u0006\n\u00100\u001a\u000201X\u008a\u0084\u0002²\u0006\n\u00104\u001a\u000205X\u008a\u0084\u0002²\u0006\n\u00106\u001a\u000207X\u008a\u0084\u0002²\u0006\n\u00108\u001a\u000209X\u008a\u0084\u0002²\u0006\n\u0010:\u001a\u00020;X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002²\u0006\n\u0010<\u001a\u00020=X\u008a\u0084\u0002²\u0006\n\u0010>\u001a\u00020?X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002²\u0006\n\u00108\u001a\u000209X\u008a\u0084\u0002"}, d2 = {"Lcom/unity3d/services/UnityAdsSDK;", "Lcom/unity3d/services/core/di/IServiceComponent;", "serviceProvider", "Lcom/unity3d/services/core/di/IServiceProvider;", "(Lcom/unity3d/services/core/di/IServiceProvider;)V", "initializationJob", "Lkotlinx/coroutines/Job;", "fetchToken", "", "sync", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishOMIDSession", "opportunityId", "getServiceProvider", "getToken", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/IUnityAdsTokenListener;", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.KEY_GAME_ID, "source", "load", "placementId", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "Lcom/unity3d/ads/IUnityAdsLoadListener;", "bannerSize", "Lcom/unity3d/services/banners/UnityBannerSize;", "sendBannerDestroyed", "", com.ironsource.C3232q2.v, "showOptions", "Lcom/unity3d/ads/UnityAdsShowOptions;", "Lcom/unity3d/ads/core/data/model/Listeners;", "unity-ads_defaultRelease", "shouldAllowInitialization", "Lcom/unity3d/ads/core/domain/ShouldAllowInitialization;", "alternativeFlowReader", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "initializeSDK", "Lcom/unity3d/services/core/domain/task/InitializeSDK;", "initializeBoldSDK", "Lcom/unity3d/ads/core/domain/InitializeBoldSDK;", "getGameId", "Lcom/unity3d/ads/core/domain/GetGameId;", "context", "Landroid/content/Context;", "tokenNumberProvider", "Lcom/unity3d/ads/core/domain/TokenNumberProvider;", "getAsyncHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetAsyncHeaderBiddingToken;", "getHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "getAdObject", "Lcom/unity3d/ads/core/domain/GetAdObject;", "omFinishSession", "Lcom/unity3d/ads/core/domain/om/OmFinishSession;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnityAdsSDK implements com.unity3d.services.core.di.IServiceComponent {
    private kotlinx.coroutines.Job initializationJob;
    private final com.unity3d.services.core.di.IServiceProvider serviceProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public UnityAdsSDK(com.unity3d.services.core.di.IServiceProvider serviceProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
        this.serviceProvider = serviceProvider;
    }

    public /* synthetic */ UnityAdsSDK(com.unity3d.services.core.di.ServiceProvider serviceProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.unity3d.services.core.di.ServiceProvider.INSTANCE : serviceProvider);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public com.unity3d.services.core.di.IServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    public static /* synthetic */ kotlinx.coroutines.Job initialize$default(com.unity3d.services.UnityAdsSDK unityAdsSDK, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "api";
        }
        return unityAdsSDK.initialize(str, str2);
    }

    public final kotlinx.coroutines.Job initialize(java.lang.String gameId, java.lang.String source) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.CompletableJob Job$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        synchronized (this) {
            kotlinx.coroutines.Job job = this.initializationJob;
            if (job != null && job.isActive()) {
                return job;
            }
            final com.unity3d.services.UnityAdsSDK unityAdsSDK = this;
            final java.lang.String str = "";
            if (!initialize$lambda$4$lambda$0(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.ShouldAllowInitialization>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$4$$inlined$inject$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.ShouldAllowInitialization, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.unity3d.ads.core.domain.ShouldAllowInitialization invoke() {
                    com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.ShouldAllowInitialization.class));
                }
            })).invoke(gameId)) {
                Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
                return Job$default;
            }
            final com.unity3d.services.UnityAdsSDK unityAdsSDK2 = this;
            final java.lang.String str2 = "";
            kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.configuration.AlternativeFlowReader>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$4$$inlined$inject$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.configuration.AlternativeFlowReader, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.unity3d.ads.core.configuration.AlternativeFlowReader invoke() {
                    com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.AlternativeFlowReader.class));
                }
            });
            final com.unity3d.services.UnityAdsSDK unityAdsSDK3 = this;
            final java.lang.String str3 = "";
            kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.services.core.domain.task.InitializeSDK>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$4$$inlined$inject$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.services.core.domain.task.InitializeSDK, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.unity3d.services.core.domain.task.InitializeSDK invoke() {
                    com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str3, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeSDK.class));
                }
            });
            final com.unity3d.services.UnityAdsSDK unityAdsSDK4 = this;
            final java.lang.String str4 = "";
            kotlin.Lazy lazy3 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.InitializeBoldSDK>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$4$$inlined$inject$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.InitializeBoldSDK, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.unity3d.ads.core.domain.InitializeBoldSDK invoke() {
                    com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str4, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.InitializeBoldSDK.class));
                }
            });
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) getServiceProvider().getRegistry().getService(com.unity3d.services.core.di.ServiceProvider.NAMED_INIT_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class));
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.unity3d.services.UnityAdsSDK$initialize$1$newInitializationJob$1(source, gameId, coroutineScope, lazy, lazy3, lazy2, null), 3, null);
            this.initializationJob = launch$default;
            return launch$default;
        }
    }

    private static final com.unity3d.ads.core.domain.ShouldAllowInitialization initialize$lambda$4$lambda$0(kotlin.Lazy<? extends com.unity3d.ads.core.domain.ShouldAllowInitialization> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.unity3d.ads.core.configuration.AlternativeFlowReader initialize$lambda$4$lambda$1(kotlin.Lazy<? extends com.unity3d.ads.core.configuration.AlternativeFlowReader> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.unity3d.services.core.domain.task.InitializeSDK initialize$lambda$4$lambda$2(kotlin.Lazy<com.unity3d.services.core.domain.task.InitializeSDK> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.unity3d.ads.core.domain.InitializeBoldSDK initialize$lambda$4$lambda$3(kotlin.Lazy<? extends com.unity3d.ads.core.domain.InitializeBoldSDK> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ kotlinx.coroutines.Job load$default(com.unity3d.services.UnityAdsSDK unityAdsSDK, java.lang.String str, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener, com.unity3d.services.banners.UnityBannerSize unityBannerSize, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            unityBannerSize = null;
        }
        return unityAdsSDK.load(str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize);
    }

    private static final com.unity3d.ads.core.domain.GetGameId load$lambda$5(kotlin.Lazy<? extends com.unity3d.ads.core.domain.GetGameId> lazy) {
        return lazy.getValue();
    }

    public final kotlinx.coroutines.Job load(java.lang.String placementId, com.unity3d.ads.UnityAdsLoadOptions loadOptions, com.unity3d.ads.IUnityAdsLoadListener listener, com.unity3d.services.banners.UnityBannerSize bannerSize) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        final com.unity3d.services.UnityAdsSDK unityAdsSDK = this;
        final java.lang.String str = "";
        initialize(load$lambda$5(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetGameId>() { // from class: com.unity3d.services.UnityAdsSDK$load$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetGameId, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.GetGameId invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetGameId.class));
            }
        })).invoke(), "load");
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) unityAdsSDK.getServiceProvider().getRegistry().getService(com.unity3d.services.core.di.ServiceProvider.NAMED_LOAD_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class));
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.unity3d.services.UnityAdsSDK$load$1(this, placementId, loadOptions, listener, bannerSize, coroutineScope, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<android.content.Context>() { // from class: com.unity3d.services.UnityAdsSDK$load$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.content.Context, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final android.content.Context invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class));
            }
        }), null), 3, null);
        return launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.content.Context load$lambda$6(kotlin.Lazy<? extends android.content.Context> lazy) {
        return lazy.getValue();
    }

    public final kotlinx.coroutines.Job show(java.lang.String placementId, com.unity3d.ads.UnityAdsShowOptions showOptions, com.unity3d.ads.core.data.model.Listeners listener) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        com.unity3d.services.UnityAdsSDK unityAdsSDK = this;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) unityAdsSDK.getServiceProvider().getRegistry().getService(com.unity3d.services.core.di.ServiceProvider.NAMED_SHOW_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class));
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.unity3d.services.UnityAdsSDK$show$1((com.unity3d.ads.core.domain.LegacyShowUseCase) unityAdsSDK.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.LegacyShowUseCase.class)), placementId, showOptions, listener, coroutineScope, null), 3, null);
        return launch$default;
    }

    public final java.lang.String getToken() {
        java.lang.Object runBlocking$default;
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.unity3d.services.UnityAdsSDK$getToken$1(this, null), 1, null);
        return (java.lang.String) runBlocking$default;
    }

    public final kotlinx.coroutines.Job getToken(com.unity3d.ads.IUnityAdsTokenListener listener) {
        return getToken(null, listener);
    }

    private static final com.unity3d.ads.core.domain.GetGameId getToken$lambda$7(kotlin.Lazy<? extends com.unity3d.ads.core.domain.GetGameId> lazy) {
        return lazy.getValue();
    }

    public final kotlinx.coroutines.Job getToken(com.unity3d.ads.TokenConfiguration tokenConfiguration, com.unity3d.ads.IUnityAdsTokenListener listener) {
        kotlinx.coroutines.Job launch$default;
        final com.unity3d.services.UnityAdsSDK unityAdsSDK = this;
        final java.lang.String str = "";
        initialize(getToken$lambda$7(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetGameId>() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetGameId, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.GetGameId invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetGameId.class));
            }
        })).invoke(), "get_token");
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.TokenNumberProvider>() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.TokenNumberProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.TokenNumberProvider invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.TokenNumberProvider.class));
            }
        });
        kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken>() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken.class));
            }
        });
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) unityAdsSDK.getServiceProvider().getRegistry().getService(com.unity3d.services.core.di.ServiceProvider.NAMED_GET_TOKEN_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class));
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.unity3d.services.UnityAdsSDK$getToken$2(tokenConfiguration, listener, coroutineScope, lazy2, lazy, null), 3, null);
        return launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.unity3d.ads.core.domain.TokenNumberProvider getToken$lambda$8(kotlin.Lazy<? extends com.unity3d.ads.core.domain.TokenNumberProvider> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken getToken$lambda$9(kotlin.Lazy<? extends com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object fetchToken(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Object runBlocking$default;
        final com.unity3d.services.UnityAdsSDK unityAdsSDK = this;
        final java.lang.String str5 = "";
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.TokenNumberProvider>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.TokenNumberProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.TokenNumberProvider invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.TokenNumberProvider.class));
            }
        });
        kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetHeaderBiddingToken>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetHeaderBiddingToken, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.GetHeaderBiddingToken invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetHeaderBiddingToken.class));
            }
        });
        kotlin.Lazy lazy3 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetInitializationState>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetInitializationState, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.GetInitializationState invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetInitializationState.class));
            }
        });
        kotlin.Lazy lazy4 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.SendDiagnosticEvent>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.SendDiagnosticEvent invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class));
            }
        });
        kotlin.Lazy lazy5 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.log.Logger>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.log.Logger, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.log.Logger invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.log.Logger.class));
            }
        });
        long m12261markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$13(lazy4), "native_gateway_token_started", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sync", str), kotlin.TuplesKt.to("state", com.unity3d.ads.core.domain.GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$12(lazy3), false, 1, null).toString())), null, null, null, 58, null);
        if (com.unity3d.ads.core.domain.GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$12(lazy3), false, 1, null) == com.unity3d.ads.core.data.model.InitializationState.INITIALIZED) {
            try {
                runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.unity3d.services.UnityAdsSDK$fetchToken$token$1(lazy2, lazy, null), 1, null);
                str4 = (java.lang.String) runBlocking$default;
                str2 = null;
                str3 = null;
            } catch (java.lang.Exception e) {
                java.lang.String shortenedStackTrace$default = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null);
                str2 = "uncaught_exception";
                str3 = shortenedStackTrace$default;
                str4 = null;
            }
        } else {
            str2 = "not_initialized";
            str3 = null;
            str4 = null;
        }
        com.unity3d.ads.core.domain.SendDiagnosticEvent fetchToken$lambda$13 = fetchToken$lambda$13(lazy4);
        java.lang.String str6 = str4 == null ? "native_gateway_token_failure_time" : "native_gateway_token_success_time";
        java.lang.Double boxDouble = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(m12261markNowz9LOYto)));
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("sync", str);
        createMapBuilder.put("state", com.unity3d.ads.core.domain.GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$12(lazy3), false, 1, null).toString());
        if (str2 != null) {
        }
        if (str3 != null) {
            createMapBuilder.put("reason_debug", str3);
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$13, str6, boxDouble, kotlin.collections.MapsKt.build(createMapBuilder), null, null, kotlin.coroutines.jvm.internal.Boxing.boxInt(fetchToken$lambda$10(lazy).invoke()), 24, null);
        if (str4 == null) {
            com.unity3d.ads.core.log.Logger.DefaultImpls.error$default(fetchToken$lambda$14(lazy5), "Returned nil token due to: " + str2, null, 2, null);
        } else {
            fetchToken$lambda$14(lazy5).info("Generated a valid token.");
        }
        return str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.unity3d.ads.core.domain.TokenNumberProvider fetchToken$lambda$10(kotlin.Lazy<? extends com.unity3d.ads.core.domain.TokenNumberProvider> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.unity3d.ads.core.domain.GetHeaderBiddingToken fetchToken$lambda$11(kotlin.Lazy<? extends com.unity3d.ads.core.domain.GetHeaderBiddingToken> lazy) {
        return lazy.getValue();
    }

    private static final com.unity3d.ads.core.domain.GetInitializationState fetchToken$lambda$12(kotlin.Lazy<? extends com.unity3d.ads.core.domain.GetInitializationState> lazy) {
        return lazy.getValue();
    }

    private static final com.unity3d.ads.core.domain.SendDiagnosticEvent fetchToken$lambda$13(kotlin.Lazy<? extends com.unity3d.ads.core.domain.SendDiagnosticEvent> lazy) {
        return lazy.getValue();
    }

    private static final com.unity3d.ads.core.log.Logger fetchToken$lambda$14(kotlin.Lazy<? extends com.unity3d.ads.core.log.Logger> lazy) {
        return lazy.getValue();
    }

    private static final com.unity3d.ads.core.configuration.AlternativeFlowReader finishOMIDSession$lambda$18(kotlin.Lazy<? extends com.unity3d.ads.core.configuration.AlternativeFlowReader> lazy) {
        return lazy.getValue();
    }

    public final kotlinx.coroutines.Job finishOMIDSession(java.lang.String opportunityId) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.CompletableJob Job$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        final com.unity3d.services.UnityAdsSDK unityAdsSDK = this;
        final java.lang.String str = "";
        if (!finishOMIDSession$lambda$18(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.configuration.AlternativeFlowReader>() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.configuration.AlternativeFlowReader, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.configuration.AlternativeFlowReader invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.AlternativeFlowReader.class));
            }
        })).invoke()) {
            Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
            Job$default.complete();
            return Job$default;
        }
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetAdObject>() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetAdObject, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.GetAdObject invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetAdObject.class));
            }
        });
        kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.om.OmFinishSession>() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.om.OmFinishSession, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.om.OmFinishSession invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.OmFinishSession.class));
            }
        });
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) unityAdsSDK.getServiceProvider().getRegistry().getService(com.unity3d.services.core.di.ServiceProvider.NAMED_OMID_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class));
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.unity3d.services.UnityAdsSDK$finishOMIDSession$2(opportunityId, coroutineScope, lazy, lazy2, null), 3, null);
        return launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.unity3d.ads.core.domain.GetAdObject finishOMIDSession$lambda$20(kotlin.Lazy<? extends com.unity3d.ads.core.domain.GetAdObject> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.unity3d.ads.core.domain.om.OmFinishSession finishOMIDSession$lambda$21(kotlin.Lazy<? extends com.unity3d.ads.core.domain.om.OmFinishSession> lazy) {
        return lazy.getValue();
    }

    private static final com.unity3d.ads.core.configuration.AlternativeFlowReader sendBannerDestroyed$lambda$22(kotlin.Lazy<? extends com.unity3d.ads.core.configuration.AlternativeFlowReader> lazy) {
        return lazy.getValue();
    }

    public final void sendBannerDestroyed() {
        final com.unity3d.services.UnityAdsSDK unityAdsSDK = this;
        final java.lang.String str = "";
        if (sendBannerDestroyed$lambda$22(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.configuration.AlternativeFlowReader>() { // from class: com.unity3d.services.UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.configuration.AlternativeFlowReader, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.configuration.AlternativeFlowReader invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.AlternativeFlowReader.class));
            }
        })).invoke()) {
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendBannerDestroyed$lambda$23(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.SendDiagnosticEvent>() { // from class: com.unity3d.services.UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$2
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
            })), "native_banner_destroyed", null, null, null, null, null, 62, null);
        }
    }

    private static final com.unity3d.ads.core.domain.SendDiagnosticEvent sendBannerDestroyed$lambda$23(kotlin.Lazy<? extends com.unity3d.ads.core.domain.SendDiagnosticEvent> lazy) {
        return lazy.getValue();
    }
}
