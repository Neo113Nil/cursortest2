package com.paypal.oslo.feature.inappcheckout.ui.entry.reducer;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/reducer/AppSwitchEntryReducer;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/usecase/LoaderTypeUseCase;", "loaderUseCase", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/usecase/LoaderTypeUseCase;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;)V", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State;", "state", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event;", "event", "reduce", "(Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State;Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event;)Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/usecase/LoaderTypeUseCase;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AppSwitchEntryReducer {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AppSwitchEntryReducer(com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase loaderTypeUseCase, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loaderTypeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        this.Camera2StreamConfigurationMap = loaderTypeUseCase;
        this.getHighSpeedVideoSizes = checkoutLogger;
    }

    public final com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State reduce(com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State state, com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoSizes, "Reducing state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", state.toString()), kotlin.TuplesKt.to("event", event.toString())), null, 4, null);
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.Initialize.INSTANCE)) {
            return new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Loading(new com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.SettingThingsUp(this.Camera2StreamConfigurationMap.invoke(), com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.PRODUCT, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.WEBVIEW_FEATURE, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.FETCHING_AUTH_CODE_AND_PREFERENCES));
        }
        if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.DeepLinkReceived)) {
            if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.OneShotAuthenticationSuccess) {
                return state;
            }
            if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.AuthenticationRequired) {
                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoSizes, "Authentication required for One Shot flow", null, null, 6, null);
                return new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.RequiresAuthentication(((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.AuthenticationRequired) event).getCheckoutAuthenticationContext(), com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU(), null);
            }
            if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.OneShotAuthenticationError) {
                com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.OneShotAuthenticationError oneShotAuthenticationError = (com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.OneShotAuthenticationError) event;
                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(this.getHighSpeedVideoSizes, com.paypal.android.logger.categories.UI.Error.INSTANCE, "One-shot authentication error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", oneShotAuthenticationError.getError().toString()), kotlin.TuplesKt.to("canGoBackToMerchant", java.lang.String.valueOf(oneShotAuthenticationError.getCanGoBackToMerchant()))), null, null, 24, null);
                return new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Error(oneShotAuthenticationError.getCanGoBackToMerchant());
            }
            if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.NavigateToFallback)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoSizes, "Navigating to fallback flow", null, null, 6, null);
            return new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Fallback(((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.NavigateToFallback) event).getUri());
        }
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData universalLinkData = ((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.DeepLinkReceived) event).getUniversalLinkData();
        if (universalLinkData instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoSizes, "Deep link received - keeping loading state", null, null, 6, null);
            return new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Loading(new com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.SettingThingsUp(this.Camera2StreamConfigurationMap.invoke(), com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.PRODUCT, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.WEBVIEW_FEATURE, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.ONE_SHOT_API_LOADING));
        }
        if (universalLinkData instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.AlreadyHandled) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoSizes, "Universal link was already handled", null, null, 6, null);
            return state;
        }
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(this.getHighSpeedVideoSizes, com.paypal.android.logger.categories.UI.Error.INSTANCE, "Universal link data is invalid or unknown", null, null, null, 28, null);
        return new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Error(false);
    }
}
