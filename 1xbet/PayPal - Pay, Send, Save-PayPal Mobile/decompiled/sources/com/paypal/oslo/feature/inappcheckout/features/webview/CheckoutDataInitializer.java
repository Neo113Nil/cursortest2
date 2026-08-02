package com.paypal.oslo.feature.inappcheckout.features.webview;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJE\u0010\u0016\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/CheckoutDataInitializer;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/CheckoutUrlHandler;", "checkoutUrlHandler", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;", "featureGateManager", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/CheckoutUrlHandler;Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "universalLinkData", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event;", "", "onEvent", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect;", "onEffect", "handleUniversalLinkData", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/CheckoutUrlHandler;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CheckoutDataInitializer {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CheckoutDataInitializer(com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler checkoutUrlHandler, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutUrlHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        this.getHighResolutionOutputSizeshNQ4ISI = checkoutUrlHandler;
        this.getHighSpeedVideoFpsRangesFor = appSwitchSession;
        this.getHighSpeedVideoFpsRanges = featureGateManager;
        this.Camera2StreamConfigurationMap = checkoutLogger;
    }

    public final void handleUniversalLinkData(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData universalLinkData, kotlinx.coroutines.CoroutineScope scope, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event, kotlin.Unit> onEvent, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect, kotlin.Unit> onEffect) {
        java.lang.String queryParameter;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalLinkData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEvent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEffect, "");
        com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails = null;
        if (universalLinkData instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid) {
            if (this.getHighSpeedVideoFpsRanges.isOneShotEnabled() && this.getHighSpeedVideoFpsRangesFor.getGetHighSpeedVideoFpsRanges() != null) {
                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(this.Camera2StreamConfigurationMap, "Using One Shot - retrieving from session", com.paypal.android.logger.categories.Presentation.Loading.INSTANCE, null, null, 12, null);
                com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor.getGetHighSpeedVideoFpsRanges();
                if (getHighSpeedVideoFpsRanges != null && getHighSpeedVideoFpsRanges.areMainUrlsPresent()) {
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(this.Camera2StreamConfigurationMap, "Checkout URLs retrieved from session (One Shot early decision)", com.paypal.android.logger.categories.Presentation.Loading.INSTANCE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("approvalUrl", getHighSpeedVideoFpsRanges.getApprovalUrl()), kotlin.TuplesKt.to("returnUrl", getHighSpeedVideoFpsRanges.getReturnUrl()), kotlin.TuplesKt.to("cancelUrl", getHighSpeedVideoFpsRanges.getCancelUrl())), null, 8, null);
                    onEvent.invoke(new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.ReadyForCheckout(getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor.getGetHighSpeedVideoSizes()));
                    return;
                } else {
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(this.Camera2StreamConfigurationMap, com.paypal.android.logger.categories.Presentation.Error.INSTANCE, "Checkout URLs not found in session - this should not happen with One Shot early decision", null, null, null, 28, null);
                    onEvent.invoke(new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.ShowError(false, null));
                    return;
                }
            }
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(this.Camera2StreamConfigurationMap, "Using traditional flow - calling CheckoutUrlHandler", com.paypal.android.logger.categories.Presentation.Loading.INSTANCE, null, null, 12, null);
            com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken = ((com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid) universalLinkData).getCheckoutToken();
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(this.Camera2StreamConfigurationMap, "Received checkout token", com.paypal.android.logger.categories.Presentation.Loading.INSTANCE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("checkoutToken", checkoutToken.toString())), null, 8, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(scope, null, null, new com.paypal.oslo.feature.inappcheckout.features.webview.CheckoutDataInitializer$getCheckoutData$1$1(this, checkoutToken, onEvent, onEffect, null), 3, null);
            return;
        }
        if (universalLinkData instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.AlreadyHandled) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.Camera2StreamConfigurationMap, "Universal link already handled", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.UNIVERSAL_LINK, universalLinkData.toString())), null, 4, null);
            return;
        }
        if (universalLinkData instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Unknown) {
            com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Unknown unknown = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Unknown) universalLinkData;
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.Camera2StreamConfigurationMap, "Received unknown universal link", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.UNIVERSAL_LINK, unknown.toString())), null, 4, null);
            android.net.Uri universalLink = unknown.getUniversalLink();
            if (universalLink != null && (queryParameter = universalLink.getQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.Merchant.getValue())) != null) {
                merchantDetails = new com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails(queryParameter, null, null, 6, null);
            }
            onEvent.invoke(new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.ShowError(false, merchantDetails));
            return;
        }
        if (!(universalLinkData instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.NotProcessed)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.Camera2StreamConfigurationMap, "Universal link not processed. This should not happen.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.UNIVERSAL_LINK, universalLinkData.toString())), null, 4, null);
    }
}
