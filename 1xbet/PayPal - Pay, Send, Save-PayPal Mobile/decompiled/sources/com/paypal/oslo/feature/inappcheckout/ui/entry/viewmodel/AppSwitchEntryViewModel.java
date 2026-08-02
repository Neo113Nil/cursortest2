package com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel;

@kotlin.Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001Ba\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101J\u0006\u00102\u001a\u00020+J\u0010\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020)H\u0002J\u0016\u00105\u001a\u00020+2\u0006\u00104\u001a\u000206H\u0082@¢\u0006\u0002\u00107J\u001a\u00108\u001a\u00020+2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0:J\u0010\u0010=\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\"\u0010>\u001a\u00020+2\u0006\u00104\u001a\u0002062\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@H\u0082@¢\u0006\u0002\u0010AJ\u0006\u0010B\u001a\u00020+J\u0006\u0010C\u001a\u00020+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020#0%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/viewmodel/AppSwitchEntryViewModel;", "Landroidx/lifecycle/ViewModel;", "reducer", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/reducer/AppSwitchEntryReducer;", "handleUniversalLinkUseCase", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/HandleUniversalLinkUseCase;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "analyticsTracer", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "trackMonitoringEventUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/TrackMonitoringEventUseCase;", "oneShotAuthenticationHandler", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/viewmodel/OneShotAuthenticationHandler;", "authenticationResultProcessor", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/viewmodel/AuthenticationResultProcessor;", "featureGateManager", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;", "checkoutFlowHandler", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/handler/CheckoutFlowHandler;", "appSwitchSession", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "lifecycleObserver", "Lcom/paypal/oslo/feature/inappcheckout/features/lifecycleObserver/CheckoutAppLifecycleObserver;", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/ui/entry/reducer/AppSwitchEntryReducer;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/HandleUniversalLinkUseCase;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/TrackMonitoringEventUseCase;Lcom/paypal/oslo/feature/inappcheckout/ui/entry/viewmodel/OneShotAuthenticationHandler;Lcom/paypal/oslo/feature/inappcheckout/ui/entry/viewmodel/AuthenticationResultProcessor;Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;Lcom/paypal/oslo/feature/inappcheckout/ui/entry/handler/CheckoutFlowHandler;Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/features/lifecycleObserver/CheckoutAppLifecycleObserver;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "_effect", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Effect;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "currentUniversalLinkData", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "processEvent", "", "event", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event;", "onNewDeeplinkReceived", "Lkotlinx/coroutines/Job;", "intent", "Landroid/content/Intent;", "onDisposeInAppCheckoutUI", "trackAppSwitchInitiated", "universalLinkData", "executeOneShotAuthentication", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleCheckoutAuthenticationResult", "checkoutAuthenticationResult", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/UserCanceled;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;", "handleOneShotEvent", "navigateToCheckoutFlow", "oneShotResult", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationResult;", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onReturnToMerchantClick", "onErrorBackPress", "inappcheckout_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AppSwitchEntryViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect> effect;
    private final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect> getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State> getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase getHighSpeedVideoSizesFor;
    private final com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler getInputFormats;
    private final com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver getInputSizeshNQ4ISI;
    private com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData getOutputFormats;
    private final com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager getOutputMinFrameDuration;
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase getOutputSizes;
    private final com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler getOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.inappcheckout.ui.entry.reducer.AppSwitchEntryReducer getOutputStallDuration;
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getOutputStallDurationlomOqCM;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State> state;

    @javax.inject.Inject
    public AppSwitchEntryViewModel(com.paypal.oslo.feature.inappcheckout.ui.entry.reducer.AppSwitchEntryReducer appSwitchEntryReducer, com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase handleUniversalLinkUseCase, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase trackMonitoringEventUseCase, com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler oneShotAuthenticationHandler, com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor authenticationResultProcessor, com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler checkoutFlowHandler, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver checkoutAppLifecycleObserver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchEntryReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleUniversalLinkUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackMonitoringEventUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneShotAuthenticationHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationResultProcessor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutFlowHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAppLifecycleObserver, "");
        this.getOutputStallDuration = appSwitchEntryReducer;
        this.getHighSpeedVideoSizesFor = handleUniversalLinkUseCase;
        this.getOutputStallDurationlomOqCM = checkoutLogger;
        this.getHighResolutionOutputSizeshNQ4ISI = analyticsTracer;
        this.getOutputSizes = trackMonitoringEventUseCase;
        this.getOutputSizeshNQ4ISI = oneShotAuthenticationHandler;
        this.getHighSpeedVideoFpsRangesFor = authenticationResultProcessor;
        this.getOutputMinFrameDuration = featureGateManager;
        this.getInputFormats = checkoutFlowHandler;
        this.Camera2StreamConfigurationMap = appSwitchSession;
        this.getInputSizeshNQ4ISI = checkoutAppLifecycleObserver;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Idle.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.getHighSpeedVideoFpsRanges = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.getOutputFormats = com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.NotProcessed.INSTANCE;
        Camera2StreamConfigurationMap(com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.Initialize.INSTANCE);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect> getEffect() {
        return this.effect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event event) {
        com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State reduce = this.getOutputStallDuration.reduce(this.getHighSpeedVideoSizes.getValue(), event);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State> mutableStateFlow = this.getHighSpeedVideoSizes;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), reduce)) {
        }
    }

    public final kotlinx.coroutines.Job onNewDeeplinkReceived(android.content.Intent intent) {
        kotlinx.coroutines.Job launch$default;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel$onNewDeeplinkReceived$1(this, intent, null), 3, null);
        return launch$default;
    }

    public final void onDisposeInAppCheckoutUI() {
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getOutputStallDurationlomOqCM, "Tearing down SDK", null, null, 6, null);
        this.getHighResolutionOutputSizeshNQ4ISI.trackOnFragmentDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event event) {
        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.OneShotAuthenticationSuccess) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel$handleOneShotEvent$1(this, event, null), 3, null);
        } else {
            Camera2StreamConfigurationMap(event);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult oneShotAuthenticationResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome evaluate = this.getInputFormats.evaluate(oneShotAuthenticationResult);
        java.lang.String str = oneShotAuthenticationResult != null ? "one_shot" : "traditional";
        if (kotlin.jvm.internal.Intrinsics.areEqual(evaluate, com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome.Native.INSTANCE)) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger = this.getOutputStallDurationlomOqCM;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, str);
            pairArr[1] = kotlin.TuplesKt.to("hasNativeRYP", kotlin.coroutines.jvm.internal.Boxing.boxBoolean((oneShotAuthenticationResult != null ? oneShotAuthenticationResult.getNativeRYP() : null) != null));
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(checkoutLogger, "Routing to native checkout", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            java.lang.Object emit = this.getHighSpeedVideoFpsRanges.emit(new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToNativeCheckout(oneShotAuthenticationResult != null ? oneShotAuthenticationResult.getNativeRYP() : null), continuation);
            return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(evaluate, com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome.WebView.INSTANCE)) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getOutputStallDurationlomOqCM, "Routing to web view checkout", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, str)), null, 4, null);
            java.lang.Object emit2 = this.getHighSpeedVideoFpsRanges.emit(new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToWebViewCheckout(valid), continuation);
            return emit2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit2 : kotlin.Unit.INSTANCE;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(evaluate, com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome.Fallback.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getOutputStallDurationlomOqCM, "Routing to fallback flow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, str)), null, 4, null);
        Camera2StreamConfigurationMap(new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.NavigateToFallback(valid.getUniversalLink()));
        return kotlin.Unit.INSTANCE;
    }

    public final void onReturnToMerchantClick() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel$onReturnToMerchantClick$1(this, null), 3, null);
    }

    public final void onErrorBackPress() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel$onErrorBackPress$1(this, null), 3, null);
    }

    public final void handleCheckoutAuthenticationResult(arrow.core.Either<com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData> checkoutAuthenticationResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationResult, "");
        if (checkoutAuthenticationResult instanceof arrow.core.Either.Right) {
            this.getHighSpeedVideoFpsRangesFor.processAuthenticationResult((com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData) ((arrow.core.Either.Right) checkoutAuthenticationResult).getValue(), this.getOutputFormats, androidx.view.ViewModelKt.getViewModelScope(this), new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel$handleCheckoutAuthenticationResult$2$1(this));
        } else {
            if (checkoutAuthenticationResult instanceof arrow.core.Either.Left) {
                this.getHighSpeedVideoFpsRangesFor.handleAuthenticationCancelledByUser(new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel$handleCheckoutAuthenticationResult$1$1(this));
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GVXHcml3yPwGERtO4mbT58kClv4(com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel appSwitchEntryViewModel, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid, com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.OneShotAuthenticationSuccess) {
            com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult result = ((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.OneShotAuthenticationSuccess) event).getResult();
            if (result.getAuthCode() != null && result.getCheckoutPreferences() == null && !result.isNativeFlow()) {
                appSwitchEntryViewModel.getOutputSizeshNQ4ISI.fetchCheckoutPreferences(valid, result.getAuthCode(), result, androidx.view.ViewModelKt.getViewModelScope(appSwitchEntryViewModel), new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel$executeOneShotAuthentication$2$1(appSwitchEntryViewModel));
                return kotlin.Unit.INSTANCE;
            }
            if (result.getAuthCode() == null && !result.isNativeFlow()) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(appSwitchEntryViewModel), null, null, new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel$executeOneShotAuthentication$2$2(appSwitchEntryViewModel, valid, null), 3, null);
                return kotlin.Unit.INSTANCE;
            }
        }
        appSwitchEntryViewModel.getHighSpeedVideoFpsRanges(event);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$executeOneShotAuthentication(final com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel appSwitchEntryViewModel, final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid2 = valid;
        appSwitchEntryViewModel.getOutputFormats = valid2;
        appSwitchEntryViewModel.Camera2StreamConfigurationMap(new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.DeepLinkReceived(valid2));
        if (appSwitchEntryViewModel.getInputFormats.isAllFlowsDisallowedByVersionGating()) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(appSwitchEntryViewModel.getOutputStallDurationlomOqCM, "Version gating disallows both native and web flows, skipping oneshot API and routing to fallback", null, null, 6, null);
            appSwitchEntryViewModel.Camera2StreamConfigurationMap(new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.NavigateToFallback(valid.getUniversalLink()));
        } else {
            java.lang.Object executeOneShotAuthentication = appSwitchEntryViewModel.getOutputSizeshNQ4ISI.executeOneShotAuthentication(valid, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel.$r8$lambda$GVXHcml3yPwGERtO4mbT58kClv4(com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel.this, valid, (com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event) obj);
                }
            }, continuation);
            if (executeOneShotAuthentication == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return executeOneShotAuthentication;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$trackAppSwitchInitiated(com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel appSwitchEntryViewModel, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData universalLinkData) {
        java.lang.String switchInitiatedTime;
        if (universalLinkData instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid) {
            switchInitiatedTime = ((com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid) universalLinkData).getSwitchInitiatedTime();
        } else {
            switchInitiatedTime = universalLinkData instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Unknown ? ((com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Unknown) universalLinkData).getSwitchInitiatedTime() : null;
        }
        if (switchInitiatedTime != null) {
            try {
                appSwitchEntryViewModel.getOutputSizes.invoke(com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEvents.BRAINTREE_APP_SWITCH, java.lang.Long.valueOf(java.lang.Long.parseLong(switchInitiatedTime)));
            } catch (java.lang.NumberFormatException e) {
                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(appSwitchEntryViewModel.getOutputStallDurationlomOqCM, com.paypal.android.logger.categories.UI.Error.INSTANCE, "Invalid switchInitiatedTime format, ignoring", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("switchInitiatedTime", switchInitiatedTime)), null, e, 8, null);
            }
        }
        com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase.invoke$default(appSwitchEntryViewModel.getOutputSizes, com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEvents.APP_SWITCH_RECEIVED, null, 2, null);
    }
}
