package com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel$onNewDeeplinkReceived$1", f = "AppSwitchEntryViewModel.kt", i = {0, 1}, l = {110, 113}, m = "invokeSuspend", n = {"universalLinkData", "universalLinkData"}, nl = {112, 116}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes13.dex */
final class AppSwitchEntryViewModel$onNewDeeplinkReceived$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Intent getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bf, code lost:
    
        if (com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel.access$executeOneShotAuthentication(r13.Camera2StreamConfigurationMap, r12, r13) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e2, code lost:
    
        if (r14 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver checkoutAppLifecycleObserver;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase handleUniversalLinkUseCase;
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger;
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger2;
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger3;
        com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer;
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger4;
        com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer2;
        com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager;
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger5;
        java.lang.Object Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger6;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            checkoutAppLifecycleObserver = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
            checkoutAppLifecycleObserver.startMonitoring();
            handleUniversalLinkUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor;
            com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData invoke = handleUniversalLinkUseCase.invoke(this.getHighSpeedVideoFpsRangesFor);
            checkoutLogger = this.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM;
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(checkoutLogger, "deepLink_data: Universal link data received", com.paypal.android.logger.categories.UI.NavigationDeepLink.INSTANCE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DEEP_LINK_DATA_KEY, invoke.toString())), null, 8, null);
            if (invoke instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid) {
                checkoutLogger4 = this.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM;
                com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid) invoke;
                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(checkoutLogger4, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.APP_SWITCH_UNIVERSAL_LINK_RECEIVED_MSG, com.paypal.android.logger.categories.UI.Interaction.INSTANCE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DEEP_LINK_DATA_KEY, valid.toString())), null, 8, null);
                analyticsTracer2 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                analyticsTracer2.trackSwitchToAppSuccess(valid.getSource());
                com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel.access$trackAppSwitchInitiated(this.Camera2StreamConfigurationMap, invoke);
                featureGateManager = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
                if (featureGateManager.isOneShotEnabled()) {
                    checkoutLogger6 = this.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM;
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(checkoutLogger6, "Using One Shot early decision flow", null, null, 6, null);
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoke);
                    this.getHighSpeedVideoSizes = 1;
                } else {
                    checkoutLogger5 = this.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM;
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(checkoutLogger5, "Using traditional flow (experiment flag decision)", null, null, 6, null);
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoke);
                    this.getHighSpeedVideoSizes = 2;
                    Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(valid, null, this);
                }
            } else {
                if (invoke instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Unknown) {
                    analyticsTracer = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                    analyticsTracer.trackUnableToDecodeToken(((com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Unknown) invoke).getSource());
                    com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel.access$trackAppSwitchInitiated(this.Camera2StreamConfigurationMap, invoke);
                    return kotlin.Unit.INSTANCE;
                }
                if (invoke instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.AlreadyHandled) {
                    checkoutLogger3 = this.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM;
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(checkoutLogger3, "deepLink_data: Universal link already handled, ignoring", com.paypal.android.logger.categories.UI.Interaction.INSTANCE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DEEP_LINK_DATA_KEY, invoke.toString())), null, 8, null);
                    return kotlin.Unit.INSTANCE;
                }
                if (invoke instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.NotProcessed) {
                    checkoutLogger2 = this.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM;
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(checkoutLogger2, "Universal link was not handled. This should not happen.", null, null, 6, null);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel$onNewDeeplinkReceived$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel$onNewDeeplinkReceived$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSwitchEntryViewModel$onNewDeeplinkReceived$1(com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel appSwitchEntryViewModel, android.content.Intent intent, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel$onNewDeeplinkReceived$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = appSwitchEntryViewModel;
        this.getHighSpeedVideoFpsRangesFor = intent;
    }
}
