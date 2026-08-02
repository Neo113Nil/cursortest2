package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0011\u0010\u0017J!\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u000f\u0010\u001aR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VccAnalyticsMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VccAnalyticsHelper;", "analyticsHelper", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "sessionStorage", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VccAnalyticsHelper;Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "Camera2StreamConfigurationMap", "()V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiModel;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiModel;)V", "", "(Ljava/lang/String;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "p1", "(Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VccAnalyticsHelper;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VccAnalyticsMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsHelper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage getHighResolutionOutputSizeshNQ4ISI;

    public VccAnalyticsMiddleware(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsHelper vccAnalyticsHelper, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vccAnalyticsHelper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionStorage, "");
        this.getHighSpeedVideoFpsRanges = vccAnalyticsHelper;
        this.getHighResolutionOutputSizeshNQ4ISI = sessionStorage;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent event = input.getEvent();
        if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.EvaluateEligibilityAndReplaceCardSuccessDomainModelLoaded) {
            Camera2StreamConfigurationMap();
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.EvaluateEligibilityAndReplaceCardSuccessDomainModelLoaded evaluateEligibilityAndReplaceCardSuccessDomainModelLoaded = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.EvaluateEligibilityAndReplaceCardSuccessDomainModelLoaded) event;
            getHighSpeedVideoFpsRangesFor(evaluateEligibilityAndReplaceCardSuccessDomainModelLoaded.getUiModel());
            if (evaluateEligibilityAndReplaceCardSuccessDomainModelLoaded.getShouldShowRelinkingToast()) {
                getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsConstants.INSTANCE.getRELINK_SUCCESS_TOAST().getName());
                return;
            }
            return;
        }
        if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ProvisionedCardOverviewSuccessDomainModelLoaded) {
            Camera2StreamConfigurationMap();
            getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ProvisionedCardOverviewSuccessDomainModelLoaded) event).getUiModel());
            getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsConstants.INSTANCE.getPROVISIONING_SUCCESS_TOAST().getName());
            return;
        }
        if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ClosePressed)) {
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ConfirmExitPressed) {
                getHighSpeedVideoFpsRanges();
                return;
            }
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.DeclineClosePressed) {
                getHighSpeedVideoFpsRanges();
                return;
            }
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ErrorClosePressed) {
                getHighSpeedVideoFpsRanges();
                return;
            }
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ScreenLockCancelled) {
                getHighSpeedVideoFpsRanges();
                return;
            }
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.AddToWalletPressed) {
                Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsConstants.INSTANCE.getADD_TO_WALLET_BUTTON().getName(), com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsConstants.INSTANCE.getUSE_CARD());
                return;
            }
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.PayWithWalletPressed) {
                Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsConstants.INSTANCE.getPAY_WITH_WALLET_BUTTON().getName(), com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsConstants.INSTANCE.getUSE_CARD());
                return;
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ChangeAmountPressed) {
                Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsConstants.INSTANCE.getCHANGE_AMOUNT_BUTTON().getName(), com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsConstants.INSTANCE.getMANAGE_CARD());
                return;
            } else {
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.CancelPressed) {
                    Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsConstants.INSTANCE.getCANCEL_LOAN_BUTTON().getName(), com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsConstants.INSTANCE.getMANAGE_CARD());
                    return;
                }
                return;
            }
        }
        Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsConstants.INSTANCE.getCLOSE_SCREEN_BUTTON().getName(), null);
    }

    private final void Camera2StreamConfigurationMap() {
        this.getHighSpeedVideoFpsRanges.trackScreenShown(com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.Flow.INSTANCE.fromSpecifier(this.getHighResolutionOutputSizeshNQ4ISI.getGetOutputMinFrameDuration()), this.getHighResolutionOutputSizeshNQ4ISI.getCamera2StreamConfigurationMap());
    }

    private final void getHighSpeedVideoFpsRanges() {
        this.getHighSpeedVideoFpsRanges.trackScreenExit(com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.Flow.INSTANCE.fromSpecifier(this.getHighResolutionOutputSizeshNQ4ISI.getGetOutputMinFrameDuration()), this.getHighResolutionOutputSizeshNQ4ISI.getCamera2StreamConfigurationMap());
    }

    private final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel p0) {
        java.lang.String fromSpecifier = com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.Flow.INSTANCE.fromSpecifier(this.getHighResolutionOutputSizeshNQ4ISI.getGetOutputMinFrameDuration());
        java.lang.String camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.getCamera2StreamConfigurationMap();
        this.getHighSpeedVideoFpsRanges.trackModuleShown(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsConstants.INSTANCE.getUSE_CARD(), fromSpecifier, camera2StreamConfigurationMap);
        if (!p0.isAddToWallet() || this.getHighResolutionOutputSizeshNQ4ISI.getGetOutputMinFrameDuration() == com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier.SELF_SERVICING) {
            this.getHighSpeedVideoFpsRanges.trackModuleShown(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsConstants.INSTANCE.getMANAGE_CARD(), fromSpecifier, camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRanges.trackModuleShown(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsConstants.INSTANCE.getHOW_TO_USE(), fromSpecifier, camera2StreamConfigurationMap);
            if (p0.getPaymentPlan() != null) {
                this.getHighSpeedVideoFpsRanges.trackModuleShown(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsConstants.INSTANCE.getMORE_INFORMATION(), fromSpecifier, camera2StreamConfigurationMap);
            }
        }
    }

    private final void getHighSpeedVideoFpsRanges(java.lang.String p0) {
        this.getHighSpeedVideoFpsRanges.trackComponentShown(p0, com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.Flow.INSTANCE.fromSpecifier(this.getHighResolutionOutputSizeshNQ4ISI.getGetOutputMinFrameDuration()), this.getHighResolutionOutputSizeshNQ4ISI.getCamera2StreamConfigurationMap());
    }

    private final void Camera2StreamConfigurationMap(java.lang.String p0, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module p1) {
        this.getHighSpeedVideoFpsRanges.trackItemPressed(p0, p1, com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.Flow.INSTANCE.fromSpecifier(this.getHighResolutionOutputSizeshNQ4ISI.getGetOutputMinFrameDuration()), this.getHighResolutionOutputSizeshNQ4ISI.getCamera2StreamConfigurationMap());
    }
}
