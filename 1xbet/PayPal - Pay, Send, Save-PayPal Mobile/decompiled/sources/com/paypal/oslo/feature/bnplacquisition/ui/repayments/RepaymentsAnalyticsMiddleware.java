package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsAnalyticsMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsAnalyticsHelper;", "analyticsHelper", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "sessionStorage", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsAnalyticsHelper;Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsAnalyticsHelper;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RepaymentsAnalyticsMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsAnalyticsHelper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage getHighSpeedVideoFpsRangesFor;

    public RepaymentsAnalyticsMiddleware(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsAnalyticsHelper repaymentsAnalyticsHelper, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentsAnalyticsHelper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionStorage, "");
        this.getHighResolutionOutputSizeshNQ4ISI = repaymentsAnalyticsHelper;
        this.getHighSpeedVideoFpsRangesFor = sessionStorage;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent event = input.getEvent();
        if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Pressed)) {
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SkipPressed) {
                this.getHighResolutionOutputSizeshNQ4ISI.trackSkipForNowPressed(com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.Flow.INSTANCE.fromSpecifier(this.getHighSpeedVideoFpsRangesFor.getGetOutputMinFrameDuration()), this.getHighSpeedVideoFpsRangesFor.getCamera2StreamConfigurationMap(), this.getHighSpeedVideoFpsRangesFor.getGetOutputSizeshNQ4ISI());
                return;
            }
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.trackContinueButtonPressed(com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.Flow.INSTANCE.fromSpecifier(this.getHighSpeedVideoFpsRangesFor.getGetOutputMinFrameDuration()), this.getHighSpeedVideoFpsRangesFor.getCamera2StreamConfigurationMap(), this.getHighSpeedVideoFpsRangesFor.getGetOutputSizeshNQ4ISI());
    }
}
