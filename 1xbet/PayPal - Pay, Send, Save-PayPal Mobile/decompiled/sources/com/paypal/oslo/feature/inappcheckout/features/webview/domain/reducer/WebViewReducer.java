package com.paypal.oslo.feature.inappcheckout.features.webview.domain.reducer;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/reducer/WebViewReducer;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/usecase/LoaderTypeUseCase;", "loaderUseCase", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetXORLoadingHeadersUseCase;", "getXORLoadingHeadersUseCase", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "analyticsTracer", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/usecase/LoaderTypeUseCase;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetXORLoadingHeadersUseCase;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State;", "state", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event;", "event", "reduce", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State;Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/usecase/LoaderTypeUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetXORLoadingHeadersUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WebViewReducer {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetXORLoadingHeadersUseCase Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public WebViewReducer(com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase loaderTypeUseCase, com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetXORLoadingHeadersUseCase getXORLoadingHeadersUseCase, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loaderTypeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getXORLoadingHeadersUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracer, "");
        this.getHighResolutionOutputSizeshNQ4ISI = loaderTypeUseCase;
        this.Camera2StreamConfigurationMap = getXORLoadingHeadersUseCase;
        this.getHighSpeedVideoSizes = checkoutLogger;
        this.getHighSpeedVideoFpsRangesFor = analyticsTracer;
    }

    public final com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State reduce(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State state, com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event event) {
        com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Success success;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoSizes, "Reducing state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", state.toString()), kotlin.TuplesKt.to("event", event.toString())), null, 4, null);
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.Initialize.INSTANCE)) {
            return state.copy(new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Loading(new com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.SettingThingsUp(this.getHighResolutionOutputSizeshNQ4ISI.invoke(), com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.PRODUCT, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.WEBVIEW_FEATURE, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.FETCHING_AUTH_CODE_AND_PREFERENCES)));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.SafeCancel.INSTANCE)) {
            return state.copy(new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Loading(new com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Canceling(this.getHighResolutionOutputSizeshNQ4ISI.invoke(), com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.PRODUCT, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.WEBVIEW_FEATURE, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.SAVING_CHECKOUT_EXPERIENCE)));
        }
        if (event instanceof com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.ReadyForCheckout) {
            com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.ReadyForCheckout readyForCheckout = (com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.ReadyForCheckout) event;
            if (readyForCheckout.getCheckoutURLs() == null) {
                success = new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.NonRecoverableError(false, readyForCheckout.getMerchantDetails());
            } else {
                this.getHighSpeedVideoFpsRangesFor.trackReadyToLoadApprovalURL(readyForCheckout.getCheckoutURLs().getApprovalUrl());
                success = new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Success(readyForCheckout.getCheckoutURLs(), this.Camera2StreamConfigurationMap.invoke(), new com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.WithoutText(this.getHighResolutionOutputSizeshNQ4ISI.invoke(), com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.PRODUCT, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.WEBVIEW_FEATURE, ""));
            }
            return state.copy(success);
        }
        if (!(event instanceof com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.ShowError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.ShowError showError = (com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.ShowError) event;
        return state.copy(new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.NonRecoverableError(showError.getCanGoBackToMerchant(), showError.getMerchantDetails()));
    }
}
