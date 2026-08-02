package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.mvi;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/mvi/PayLaterHubAnalyticsMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "Lcom/paypal/oslo/feature/bnplservicing/analytics/PayLaterHubAnalyticsHelper;", "analyticsHelper", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/analytics/PayLaterHubAnalyticsHelper;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplservicing/analytics/PayLaterHubAnalyticsHelper;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PayLaterHubAnalyticsMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper getHighSpeedVideoSizes;

    public PayLaterHubAnalyticsMiddleware(com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper payLaterHubAnalyticsHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubAnalyticsHelper, "");
        this.getHighSpeedVideoSizes = payLaterHubAnalyticsHelper;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        if (input.getEvent() instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.LoadData) {
            this.getHighSpeedVideoSizes.trackScreenLoaded();
        }
    }
}
