package com.paypal.oslo.feature.onboarding.postonboarding.addfi.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/addfi/ui/AddCardResultHandler;", "", "Lcom/paypal/oslo/feature/onboarding/postonboarding/addfi/navigation/AddFiDestination;", "destination", "Lkotlin/Function0;", "", "onNext", "onSkip", "onBack", "onClose", "<init>", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/addfi/navigation/AddFiDestination;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "result", "handleResult", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/onboarding/postonboarding/addfi/navigation/AddFiDestination;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddCardResultHandler {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.onboarding.postonboarding.addfi.navigation.AddFiDestination getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;

    public AddCardResultHandler(com.paypal.oslo.feature.onboarding.postonboarding.addfi.navigation.AddFiDestination addFiDestination, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFiDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        this.getHighResolutionOutputSizeshNQ4ISI = addFiDestination;
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.Camera2StreamConfigurationMap = function02;
        this.getHighSpeedVideoSizes = function03;
        this.getHighSpeedVideoFpsRanges = function04;
    }

    public final void handleResult(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome outcome = result.getOutcome();
        if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success)) {
            if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled)) {
                if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.onboarding.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, this.getHighResolutionOutputSizeshNQ4ISI.mo15903getFlowId8NcbBzM());
                pairArr[1] = kotlin.TuplesKt.to("stepId", this.getHighResolutionOutputSizeshNQ4ISI.getStep().m16524getStepIdeVUBM90());
                java.lang.String errorMsg = ((com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error) outcome).getErrorMsg();
                if (errorMsg == null) {
                    errorMsg = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
                }
                pairArr[2] = kotlin.TuplesKt.to("errorMsg", errorMsg);
                com.paypal.android.logger.Logger.e$default(logger, "Add card error", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
                this.Camera2StreamConfigurationMap.invoke();
                return;
            }
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason reason = ((com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled) outcome).getReason();
            if (reason instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserNavigatedBack) {
                this.getHighSpeedVideoSizes.invoke();
                return;
            } else if (reason instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserClosedFlow) {
                this.getHighSpeedVideoFpsRanges.invoke();
                return;
            } else {
                if (!(reason instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserSkippedFlow)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.Camera2StreamConfigurationMap.invoke();
                return;
            }
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, "Add card successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, this.getHighResolutionOutputSizeshNQ4ISI.mo15903getFlowId8NcbBzM()), kotlin.TuplesKt.to("stepId", this.getHighResolutionOutputSizeshNQ4ISI.getStep().m16524getStepIdeVUBM90()), kotlin.TuplesKt.to("cardId", ((com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success) outcome).getCard().getId())), null, 4, null);
        this.getHighSpeedVideoFpsRangesFor.invoke();
    }
}
