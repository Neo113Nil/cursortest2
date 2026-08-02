package com.paypal.oslo.feature.taptopay.ui.setup.bridge;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.setup.bridge.PpdcAcquisitionBridgeScreenKt$PpdcAcquisitionBridgeScreen$2$1", f = "PpdcAcquisitionBridgeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class PpdcAcquisitionBridgeScreenKt$PpdcAcquisitionBridgeScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult inContextAcquisitionNavResult = (com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PPDC InContextAcquisitionNavResult", null, null, 6, null);
        this.getHighSpeedVideoSizes.setValue(java.lang.Boolean.valueOf(true));
        com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome outcome = inContextAcquisitionNavResult.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Success) {
            com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.CardExtensionsKt.toSetupCardInfo(((com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Success) outcome).getDebitCardData());
            com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.core.commonui.utils.RefText subtitle = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.CardExtensionsKt.getSubtitle(setupCardInfo);
            java.lang.String value = subtitle != null ? com.paypal.oslo.core.commonui.utils.RefTextKt.value(subtitle, this.getHighSpeedVideoFpsRangesFor) : null;
            setupFlowCoordinator.onIntent(new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.CardSelected(setupCardInfo, false, false, value == null ? "" : value, true));
        } else {
            if (!(outcome instanceof com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Failure)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Failure failure = (com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Failure) outcome;
            com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason failureReason = failure.getFailureReason();
            if (failureReason instanceof com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Cancelled) {
                com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason failureReason2 = failure.getFailureReason();
                kotlin.jvm.internal.Intrinsics.checkNotNull(failureReason2, "");
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PPDC in-context acquisition cancelled: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Cancelled) failureReason2).getCancellationReason())), null, null, 6, null);
                this.getHighSpeedVideoFpsRanges.onIntent(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.GoBack.INSTANCE);
            } else {
                if (!(failureReason instanceof com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PPDC in-context acquisition failed: ".concat(java.lang.String.valueOf(failure.getFailureReason())), null, null, 6, null);
                this.getHighSpeedVideoFpsRanges.onIntent(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.Close.INSTANCE);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult inContextAcquisitionNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.setup.bridge.PpdcAcquisitionBridgeScreenKt$PpdcAcquisitionBridgeScreen$2$1) create(inContextAcquisitionNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.ui.setup.bridge.PpdcAcquisitionBridgeScreenKt$PpdcAcquisitionBridgeScreen$2$1 ppdcAcquisitionBridgeScreenKt$PpdcAcquisitionBridgeScreen$2$1 = new com.paypal.oslo.feature.taptopay.ui.setup.bridge.PpdcAcquisitionBridgeScreenKt$PpdcAcquisitionBridgeScreen$2$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        ppdcAcquisitionBridgeScreenKt$PpdcAcquisitionBridgeScreen$2$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return ppdcAcquisitionBridgeScreenKt$PpdcAcquisitionBridgeScreen$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PpdcAcquisitionBridgeScreenKt$PpdcAcquisitionBridgeScreen$2$1(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, android.content.Context context, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.setup.bridge.PpdcAcquisitionBridgeScreenKt$PpdcAcquisitionBridgeScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = setupFlowCoordinator;
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighSpeedVideoSizes = mutableState;
    }
}
