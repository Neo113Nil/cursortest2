package com.paypal.oslo.feature.inappcheckout.navigation.coordinator;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutWebViewCoordinator;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "universalLinkData", "", "navigateToWebViewCheckoutFlow", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InAppCheckoutWebViewCoordinator {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public InAppCheckoutWebViewCoordinator(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighSpeedVideoSizes = checkoutLogger;
    }

    public final void navigateToWebViewCheckoutFlow(final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData universalLinkData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalLinkData, "");
        this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator.m15471$r8$lambda$lmpYlLEn_H4t9F3EPWjQhU0l1U(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator.this, universalLinkData, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$lmpYlLEn_H4-t9F3EPWjQhU0l1U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15471$r8$lambda$lmpYlLEn_H4t9F3EPWjQhU0l1U(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator inAppCheckoutWebViewCoordinator, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData universalLinkData, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext provideBusinessFlowContext = inAppCheckoutWebViewCoordinator.getHighSpeedVideoSizes.provideBusinessFlowContext();
        com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext provideMerchantContext = inAppCheckoutWebViewCoordinator.getHighSpeedVideoSizes.provideMerchantContext();
        java.lang.String id = provideMerchantContext.getId();
        java.lang.String name2 = provideMerchantContext.getName();
        java.lang.String name3 = provideBusinessFlowContext.getName();
        java.lang.String attemptId = provideBusinessFlowContext.getAttemptId();
        navigationScope.push(new com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination(universalLinkData, id, name2, name3, attemptId == null ? "" : attemptId));
        return kotlin.Unit.INSTANCE;
    }
}
