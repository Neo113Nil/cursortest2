package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountAnalyticsMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountAnalyticsHelper;", "analyticsHelper", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "sessionStorage", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountAnalyticsHelper;Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountAnalyticsHelper;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EnterAmountAnalyticsMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountAnalyticsHelper getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage getHighResolutionOutputSizeshNQ4ISI;

    public EnterAmountAnalyticsMiddleware(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountAnalyticsHelper enterAmountAnalyticsHelper, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterAmountAnalyticsHelper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionStorage, "");
        this.getHighSpeedVideoFpsRanges = enterAmountAnalyticsHelper;
        this.getHighResolutionOutputSizeshNQ4ISI = sessionStorage;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent event = input.getEvent();
        if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.LoanConstraintsLoaded) {
            this.getHighSpeedVideoFpsRanges.trackScreenShown(com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.Flow.INSTANCE.fromSpecifier(this.getHighResolutionOutputSizeshNQ4ISI.getGetOutputMinFrameDuration()), this.getHighResolutionOutputSizeshNQ4ISI.getCamera2StreamConfigurationMap());
            return;
        }
        if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Pressed) {
            com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState second = input.getStates().getSecond();
            com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Success success = second instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Success ? (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Success) second : null;
            if (success != null) {
                java.lang.String amountInput = success.getModel().getAmountInput();
                this.getHighResolutionOutputSizeshNQ4ISI.setTransactionAmount(amountInput);
                this.getHighSpeedVideoFpsRanges.trackContinueButtonPressed(com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.Flow.INSTANCE.fromSpecifier(this.getHighResolutionOutputSizeshNQ4ISI.getGetOutputMinFrameDuration()), this.getHighResolutionOutputSizeshNQ4ISI.getCamera2StreamConfigurationMap(), amountInput);
            }
        }
    }
}
