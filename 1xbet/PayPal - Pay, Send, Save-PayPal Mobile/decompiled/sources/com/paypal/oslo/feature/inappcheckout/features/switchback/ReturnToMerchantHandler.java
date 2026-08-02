package com.paypal.oslo.feature.inappcheckout.features.switchback;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0018\u0010\u0019J8\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010)R\u0014\u0010-\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010#\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010."}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/switchback/ReturnToMerchantHandler;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetCancelActionFromSwitchBackUseCase;", "getCancelAction", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/SaveCheckoutExperienceUseCase;", "saveCheckoutExperienceUseCase", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/CheckoutUrlHandler;", "checkoutUrlHandler", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/HandleUniversalLinkUseCase;", "handleUniversalLinkUseCase", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "analyticsTracer", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetCancelActionFromSwitchBackUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/SaveCheckoutExperienceUseCase;Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/CheckoutUrlHandler;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/HandleUniversalLinkUseCase;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent;", "action", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect;", "", "onEffect", "handleReturnToMerchant", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent;Lkotlin/jvm/functions/Function1;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "universalLinkData", "Landroid/net/Uri;", "webViewUri", "cancelAndSwitchBackToMerchant", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetCancelActionFromSwitchBackUseCase;", "getHighSpeedVideoFpsRangesFor", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/SaveCheckoutExperienceUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/CheckoutUrlHandler;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/HandleUniversalLinkUseCase;", "getHighSpeedVideoFpsRanges", "getInputFormats", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnToMerchantHandler {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCancelActionFromSwitchBackUseCase getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ReturnToMerchantHandler(com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCancelActionFromSwitchBackUseCase getCancelActionFromSwitchBackUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase saveCheckoutExperienceUseCase, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler checkoutUrlHandler, com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase handleUniversalLinkUseCase, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCancelActionFromSwitchBackUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saveCheckoutExperienceUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutUrlHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleUniversalLinkUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracer, "");
        this.getHighSpeedVideoFpsRangesFor = getCancelActionFromSwitchBackUseCase;
        this.Camera2StreamConfigurationMap = saveCheckoutExperienceUseCase;
        this.getHighSpeedVideoSizes = appSwitchSession;
        this.getHighResolutionOutputSizeshNQ4ISI = checkoutUrlHandler;
        this.getHighSpeedVideoFpsRanges = handleUniversalLinkUseCase;
        this.getInputSizeshNQ4ISI = checkoutLogger;
        this.getOutputMinFrameDuration = analyticsTracer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (r3 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleReturnToMerchant(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent action, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect, kotlin.Unit> onEffect) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEffect, "");
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(this.getInputSizeshNQ4ISI, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.RETURN_TO_MERCHANT_AUTOMATICALLY_MSG, com.paypal.android.logger.categories.UI.NavigationTransition.INSTANCE, null, null, 12, null);
        this.getOutputMinFrameDuration.trackAutoRedirectFlow();
        com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer = this.getOutputMinFrameDuration;
        android.net.Uri uri = action.getUri();
        if (uri != null && (str = uri.toString()) != null) {
            if (kotlin.text.StringsKt.isBlank(str)) {
                str = null;
            }
        }
        str = "UNKNOWN";
        com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer.trackOutboundLinkResolved$default(analyticsTracer, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.UNIVERSAL_LINK_TO_MERCHANT_APP_SUCCEEDED, str, null, 4, null);
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(this.getInputSizeshNQ4ISI, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.APP_SWITCH_ENDED_MSG, com.paypal.android.logger.categories.UI.NavigationTransition.INSTANCE, null, null, 12, null);
        onEffect.invoke(new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.ReturnToMerchantAutomatically(action));
    }

    public static /* synthetic */ java.lang.Object cancelAndSwitchBackToMerchant$default(com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler returnToMerchantHandler, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData universalLinkData, android.net.Uri uri, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            uri = null;
        }
        return returnToMerchantHandler.cancelAndSwitchBackToMerchant(universalLinkData, uri, function1, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
    
        if (r13 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object cancelAndSwitchBackToMerchant(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData universalLinkData, android.net.Uri uri, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler$cancelAndSwitchBackToMerchant$1 returnToMerchantHandler$cancelAndSwitchBackToMerchant$1;
        int i;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs getHighSpeedVideoFpsRanges;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect, kotlin.Unit> function12;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Cancel cancel;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler$cancelAndSwitchBackToMerchant$1) {
            returnToMerchantHandler$cancelAndSwitchBackToMerchant$1 = (com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler$cancelAndSwitchBackToMerchant$1) continuation;
            if ((returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getGetHighSpeedVideoFpsRanges();
                    if (getHighSpeedVideoFpsRanges == null) {
                        com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler checkoutUrlHandler = this.getHighResolutionOutputSizeshNQ4ISI;
                        returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(universalLinkData);
                        returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getHighResolutionOutputSizeshNQ4ISI = uri;
                        returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getHighSpeedVideoFpsRangesFor = function1;
                        returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getInputSizeshNQ4ISI = 1;
                        obj = checkoutUrlHandler.reloadCheckoutURL(universalLinkData, returnToMerchantHandler$cancelAndSwitchBackToMerchant$1);
                    }
                    if (getHighSpeedVideoFpsRanges == null) {
                        function1.invoke(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.ForceCanceling.INSTANCE);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Cancel invoke = this.getHighSpeedVideoFpsRangesFor.invoke(uri, getHighSpeedVideoFpsRanges);
                    android.net.Uri uri2 = invoke.getUri();
                    java.lang.String obj2 = uri2 != null ? uri2.toString() : null;
                    if (obj2 == null || kotlin.text.StringsKt.isBlank(obj2)) {
                        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger = this.getInputSizeshNQ4ISI;
                        com.paypal.android.logger.categories.Presentation.Error error = com.paypal.android.logger.categories.Presentation.Error.INSTANCE;
                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                        pairArr[0] = kotlin.TuplesKt.to("merchantIntegration", this.getHighSpeedVideoSizes.getMerchantIntegrationChannel().toString());
                        pairArr[1] = kotlin.TuplesKt.to("hasWebViewUri", java.lang.String.valueOf(uri != null));
                        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(checkoutLogger, error, "Cannot build switch-back URI for cancellation, finishing gracefully", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 24, null);
                        this.getOutputMinFrameDuration.trackOutboundLinkResolved(com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.UNIVERSAL_LINK_TO_MERCHANT_APP_FAILED, "UNKNOWN", "Cannot build switch-back URI for cancellation, finishing gracefully");
                        function1.invoke(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.ForceCanceling.INSTANCE);
                        return kotlin.Unit.INSTANCE;
                    }
                    returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(universalLinkData);
                    returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uri);
                    returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getHighSpeedVideoFpsRangesFor = function1;
                    returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getHighSpeedVideoFpsRanges);
                    returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getHighSpeedVideoFpsRanges = invoke;
                    returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getInputSizeshNQ4ISI = 2;
                    if (this.Camera2StreamConfigurationMap.invoke(invoke, returnToMerchantHandler$cancelAndSwitchBackToMerchant$1) != coroutine_suspended) {
                        function12 = function1;
                        cancel = invoke;
                        this.getHighSpeedVideoSizes.clear();
                        this.getHighSpeedVideoFpsRanges.reset$inappcheckout_prodRelease();
                        handleReturnToMerchant(cancel, function12);
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cancel = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Cancel) returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getHighSpeedVideoFpsRanges;
                    function12 = (kotlin.jvm.functions.Function1) returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoSizes.clear();
                    this.getHighSpeedVideoFpsRanges.reset$inappcheckout_prodRelease();
                    handleReturnToMerchant(cancel, function12);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect, kotlin.Unit> function13 = (kotlin.jvm.functions.Function1) returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getHighSpeedVideoFpsRangesFor;
                uri = (android.net.Uri) returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData universalLinkData2 = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData) returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                function1 = function13;
                universalLinkData = universalLinkData2;
                getHighSpeedVideoFpsRanges = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs) obj;
                if (getHighSpeedVideoFpsRanges == null) {
                }
            }
        }
        returnToMerchantHandler$cancelAndSwitchBackToMerchant$1 = new com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler$cancelAndSwitchBackToMerchant$1(this, continuation);
        java.lang.Object obj3 = returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = returnToMerchantHandler$cancelAndSwitchBackToMerchant$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        getHighSpeedVideoFpsRanges = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs) obj3;
        if (getHighSpeedVideoFpsRanges == null) {
        }
    }
}
