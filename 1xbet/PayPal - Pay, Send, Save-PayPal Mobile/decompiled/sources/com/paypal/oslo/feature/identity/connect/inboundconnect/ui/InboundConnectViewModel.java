package com.paypal.oslo.feature.identity.connect.inboundconnect.ui;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 <2\u00020\u0001:\u0001<B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0011J\u001a\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'J\b\u0010(\u001a\u00020)H\u0002J\u0012\u0010*\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J\u0018\u0010+\u001a\u00020!2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u0015\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020'H\u0000¢\u0006\u0002\b.J\u0010\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020\u001cH\u0002J\u001a\u00101\u001a\u00020'2\u0006\u00100\u001a\u00020\u001c2\b\b\u0002\u00102\u001a\u00020'H\u0002J\u001d\u00109\u001a\u00020!2\u0006\u00100\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\b:J\b\u0010;\u001a\u00020!H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00106¨\u0006="}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectViewModel;", "Landroidx/lifecycle/ViewModel;", "inboundConnectUseCase", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/usecase/InboundConnectUseCase;", "featureGate", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "analyticsHelperFactory", "Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectAnalyticsHelper$Factory;", "reducer", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectReducer;", "<init>", "(Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/usecase/InboundConnectUseCase;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectAnalyticsHelper$Factory;Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectReducer;)V", "analyticsHelper", "Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectAnalyticsHelper;", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectUiState;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectUiEffect;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "_inboundConnectRequest", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/model/InboundConnectRequest;", "inboundConnectRequest", "getInboundConnectRequest", "()Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/model/InboundConnectRequest;", "processEvent", "", "event", "initialize", "destination", "Lcom/paypal/oslo/feature/identity/api/navigation/InboundConnectDestination;", "fullDeeplinkUrl", "", "isFeatureAvailable", "", "isInitializationAllowed", "performInitialization", "userCancelEvent", "connectUrl", "userCancelEvent$identity_prodRelease", "retrieveConnectUrl", "request", "buildErrorRedirectUrl", "error", "analyticsMiddleware", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "getAnalyticsMiddleware", "()Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "sideEffectsMiddleware", "getSideEffectsMiddleware", "trackInitializationAnalytics", "trackInitializationAnalytics$identity_prodRelease", "onCleared", "Companion", "identity_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InboundConnectViewModel extends androidx.view.ViewModel {
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate Camera2StreamConfigurationMap;
    private com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase getHighSpeedVideoFpsRanges;
    private com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper.Factory getHighSpeedVideoSizes;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiEffect> getInputFormats;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState> uiState;
    public static final int $stable = 8;

    @javax.inject.Inject
    public InboundConnectViewModel(com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase inboundConnectUseCase, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper.Factory factory, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectReducer inboundConnectReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboundConnectUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboundConnectReducer, "");
        this.getHighSpeedVideoFpsRanges = inboundConnectUseCase;
        this.Camera2StreamConfigurationMap = featureGate;
        this.getHighSpeedVideoSizes = factory;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("InboundConnectViewModel.store", com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Loading.INSTANCE, inboundConnectReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent>() { // from class: com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel$analyticsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent> input) {
                com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper connectAnalyticsHelper;
                com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper connectAnalyticsHelper2;
                com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper connectAnalyticsHelper3;
                com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper connectAnalyticsHelper4;
                com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper connectAnalyticsHelper5;
                com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper connectAnalyticsHelper6;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Initialize) {
                    connectAnalyticsHelper6 = com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.this.getHighSpeedVideoFpsRangesFor;
                    if (connectAnalyticsHelper6 != null) {
                        connectAnalyticsHelper6.trackDeeplinkTriggered$identity_prodRelease();
                    }
                    com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Initialize initialize = (com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Initialize) event;
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect flow initialized", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("clientId", initialize.getRequest().getClientId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, initialize.getRequest().getScope())), 2, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.ConnectUrlRetrieved) {
                    connectAnalyticsHelper5 = com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.this.getHighSpeedVideoFpsRangesFor;
                    if (connectAnalyticsHelper5 != null) {
                        connectAnalyticsHelper5.trackWebViewUrlReceived$identity_prodRelease(((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.ConnectUrlRetrieved) event).getConnectUrl());
                    }
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect URL retrieved successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("urlLength", java.lang.Integer.valueOf(((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.ConnectUrlRetrieved) event).getConnectUrl().length()))), null, 4, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.UrlRetrievalFailed) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect URL retrieval failed, redirecting with error", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorRedirectUrl", ((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.UrlRetrievalFailed) event).getErrorRedirectUrl())), 2, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.WebViewInitialized) {
                    connectAnalyticsHelper4 = com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.this.getHighSpeedVideoFpsRangesFor;
                    if (connectAnalyticsHelper4 != null) {
                        connectAnalyticsHelper4.trackWebViewShown$identity_prodRelease();
                    }
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect WebView initialized and ready", null, null, 6, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Dismiss) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect dismissed", null, null, 6, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadStarted) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect WebView started loading page", null, null, 6, null);
                    connectAnalyticsHelper3 = com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.this.getHighSpeedVideoFpsRangesFor;
                    if (connectAnalyticsHelper3 != null) {
                        connectAnalyticsHelper3.trackWebViewPageLoadStarted$identity_prodRelease(((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadStarted) event).getUrl());
                        return;
                    }
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadFinished) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect WebView finished loading page", null, null, 6, null);
                    connectAnalyticsHelper2 = com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.this.getHighSpeedVideoFpsRangesFor;
                    if (connectAnalyticsHelper2 != null) {
                        connectAnalyticsHelper2.trackWebViewPageLoadFinished$identity_prodRelease(((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadFinished) event).getUrl());
                        return;
                    }
                    return;
                }
                if (!(event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.RedirectUrlIntercepted)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect OAuth redirect URL intercepted", null, null, 6, null);
                connectAnalyticsHelper = com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.this.getHighSpeedVideoFpsRangesFor;
                if (connectAnalyticsHelper != null) {
                    connectAnalyticsHelper.trackRedirectUrlIntercepted$identity_prodRelease(((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.RedirectUrlIntercepted) event).getRedirectUrl());
                }
            }
        }, new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent>() { // from class: com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Initialize) {
                    com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.access$retrieveConnectUrl(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.this, ((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Initialize) event).getRequest());
                }
            }
        }}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getInputFormats = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    /* renamed from: getInboundConnectRequest, reason: from getter */
    public final com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void processEvent(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getInputFormats.onEvent(event);
    }

    public static /* synthetic */ void initialize$default(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel inboundConnectViewModel, com.paypal.oslo.feature.identity.api.navigation.InboundConnectDestination inboundConnectDestination, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        inboundConnectViewModel.initialize(inboundConnectDestination, str);
    }

    public final void initialize(com.paypal.oslo.feature.identity.api.navigation.InboundConnectDestination destination, java.lang.String fullDeeplinkUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect already initialized - ignoring duplicate initialize call", null, null, 6, null);
            return;
        }
        java.lang.String str = fullDeeplinkUrl;
        if (str == null || str.length() == 0) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect initialization skipped - deeplink URL missing", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isNull", java.lang.Boolean.valueOf(fullDeeplinkUrl == null))), null, 4, null);
            processEvent(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Dismiss.INSTANCE);
            return;
        }
        if (fullDeeplinkUrl == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect initialized via deeplink", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fullDeeplinkUrl", fullDeeplinkUrl)), 2, null);
        com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest inboundConnectRequest = com.paypal.oslo.feature.identity.connect.inboundconnect.utils.InboundConnectMapperExtensionsKt.toInboundConnectRequest(destination, fullDeeplinkUrl);
        this.getHighResolutionOutputSizeshNQ4ISI = inboundConnectRequest;
        trackInitializationAnalytics$identity_prodRelease(inboundConnectRequest, fullDeeplinkUrl);
        processEvent(new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Initialize(inboundConnectRequest));
        if (com.paypal.oslo.feature.identity.connect.shared.ConnectFeatureFlagsKt.isInboundConnectEnabled(this.Camera2StreamConfigurationMap)) {
            return;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect flow disabled by feature flag", null, null, 6, null);
        com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest inboundConnectRequest2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (inboundConnectRequest2 == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        processEvent(new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.UrlRetrievalFailed(getHighResolutionOutputSizeshNQ4ISI(inboundConnectRequest2, com.paypal.oslo.feature.identity.connect.shared.utils.ConnectConstants.FEATURE_DISABLED_ERROR)));
    }

    public final void userCancelEvent$identity_prodRelease(java.lang.String connectUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectUrl, "");
        com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper connectAnalyticsHelper = this.getHighSpeedVideoFpsRangesFor;
        if (connectAnalyticsHelper != null) {
            connectAnalyticsHelper.trackUserCanceled$identity_prodRelease("UserCancelled", connectUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest inboundConnectRequest, java.lang.String str) {
        if (kotlin.text.StringsKt.isBlank(inboundConnectRequest.getRedirectUri())) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Cannot build error redirect URL - redirect URI is blank", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(str.getClass()).getSimpleName())), null, 4, null);
            return "";
        }
        java.lang.String redirectUri = inboundConnectRequest.getRedirectUri();
        java.lang.String str2 = com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) redirectUri, (java.lang.CharSequence) com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION, false, 2, (java.lang.Object) null)) {
            str2 = "&";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(inboundConnectRequest.getRedirectUri());
        sb.append(str2);
        sb.append("error=");
        sb.append(str);
        sb.append("&error_description=Something went wrong");
        return sb.toString();
    }

    public final void trackInitializationAnalytics$identity_prodRelease(com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest request, java.lang.String fullDeeplinkUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullDeeplinkUrl, "");
        com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper create = this.getHighSpeedVideoSizes.create(request.getMetadataId(), request.getClientId(), fullDeeplinkUrl);
        this.getHighSpeedVideoFpsRangesFor = create;
        if (create != null) {
            create.trackScreenShown$identity_prodRelease();
        }
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        super.onCleared();
        com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper connectAnalyticsHelper = this.getHighSpeedVideoFpsRangesFor;
        if (connectAnalyticsHelper != null) {
            connectAnalyticsHelper.trackScreenDismissed$identity_prodRelease();
        }
    }

    public static final /* synthetic */ void access$retrieveConnectUrl(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel inboundConnectViewModel, com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest inboundConnectRequest) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect URL retrieval triggered", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("redirectUri", inboundConnectRequest.getRedirectUri())), 2, null);
        com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper connectAnalyticsHelper = inboundConnectViewModel.getHighSpeedVideoFpsRangesFor;
        if (connectAnalyticsHelper != null) {
            connectAnalyticsHelper.trackUrlRetrievalStarted$identity_prodRelease();
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(inboundConnectViewModel), null, null, new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel$retrieveConnectUrl$1(inboundConnectViewModel, inboundConnectRequest, null), 3, null);
    }
}
