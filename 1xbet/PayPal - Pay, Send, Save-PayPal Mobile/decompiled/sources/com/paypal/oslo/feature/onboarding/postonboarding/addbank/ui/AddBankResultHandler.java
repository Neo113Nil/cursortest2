package com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/addbank/ui/AddBankResultHandler;", "", "Lcom/paypal/oslo/feature/onboarding/postonboarding/addbank/navigation/AddBankDestination;", "destination", "Lkotlin/Function0;", "", "onNext", "onSkip", "onBack", "onClose", "<init>", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/addbank/navigation/AddBankDestination;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/AddBankFlowNavResult;", "result", "handleResult", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/AddBankFlowNavResult;)V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputMinFrameDuration", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", "Ljava/lang/String;", "", "", "Ljava/util/Map;", "getOutputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddBankResultHandler {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.String> getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    public AddBankResultHandler(com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination addBankDestination, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoSizes = function02;
        this.getHighSpeedVideoFpsRangesFor = function03;
        this.Camera2StreamConfigurationMap = function04;
        this.getHighSpeedVideoFpsRanges = addBankDestination.getStep().m16523getInitialFlowId8NcbBzM();
        this.getOutputFormats = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, addBankDestination.mo15903getFlowId8NcbBzM()), kotlin.TuplesKt.to("stepId", addBankDestination.getStep().m16524getStepIdeVUBM90()));
    }

    public final void handleResult(com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome outcome = result.getOutcome();
        if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Success)) {
            if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Error)) {
                if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Cancelled)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.CancellationReason reason = ((com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Cancelled) outcome).getReason();
                if (kotlin.jvm.internal.Intrinsics.areEqual(reason, com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.CancellationReason.UserNavigatedBack.INSTANCE)) {
                    this.getHighSpeedVideoFpsRangesFor.invoke();
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(reason, com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE)) {
                    if (com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16023equalsimpl0(this.getHighSpeedVideoFpsRanges, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.navigation.FlowsKt.getPostOnboardingFlowId())) {
                        this.getHighSpeedVideoSizes.invoke();
                        return;
                    } else {
                        this.Camera2StreamConfigurationMap.invoke();
                        return;
                    }
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(reason, com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.CancellationReason.UserSkippedFlow.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizes.invoke();
                return;
            }
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.onboarding.LoggerKt.log;
            java.util.Map<java.lang.String, java.lang.String> map = this.getOutputFormats;
            java.lang.String errorMessage = ((com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Error) outcome).getErrorMessage();
            if (errorMessage == null) {
                errorMessage = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
            }
            com.paypal.android.logger.Logger.e$default(logger, "Add bank error", kotlin.collections.MapsKt.plus(map, kotlin.TuplesKt.to("error_message", errorMessage)), null, null, 12, null);
            this.getHighSpeedVideoSizes.invoke();
            return;
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, "Add bank successful", kotlin.collections.MapsKt.plus(this.getOutputFormats, kotlin.TuplesKt.to("bank_count", java.lang.String.valueOf(((com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Success) outcome).getLinkedBankAccounts().size()))), null, 4, null);
        this.getHighResolutionOutputSizeshNQ4ISI.invoke();
    }
}
