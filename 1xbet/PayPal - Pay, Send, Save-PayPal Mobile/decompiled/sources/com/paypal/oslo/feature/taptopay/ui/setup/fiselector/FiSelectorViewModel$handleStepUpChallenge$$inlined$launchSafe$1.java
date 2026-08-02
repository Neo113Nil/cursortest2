package com.paypal.oslo.feature.taptopay.ui.setup.fiselector;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/paypal/oslo/feature/taptopay/ui/setup/fiselector/FiSelectorViewModel$launchSafe$1"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel$handleStepUpChallenge$$inlined$launchSafe$1", f = "FiSelectorViewModel.kt", i = {0, 0}, l = {323}, m = "invokeSuspend", n = {"$completion", "$i$a$-launchSafe-FiSelectorViewModel$handleStepUpChallenge$1"}, nl = {324}, s = {"L$0", "I$0"}, v = 2)
/* loaded from: classes15.dex */
public final class FiSelectorViewModel$handleStepUpChallenge$$inlined$launchSafe$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel getInputSizeshNQ4ISI;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.usecase.risk.StepUpUriChallengeUseCase stepUpUriChallengeUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                stepUpUriChallengeUseCase = this.getInputFormats.getHighSpeedVideoFpsRangesFor;
                java.lang.String str = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(this);
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoSizesFor = 1;
                obj = stepUpUriChallengeUseCase.invoke(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            arrow.core.Either either = (arrow.core.Either) obj;
            if (either instanceof arrow.core.Either.Right) {
                com.paypal.oslo.feature.taptopay.domain.model.risk.StepUpAuthResult stepUpAuthResult = (com.paypal.oslo.feature.taptopay.domain.model.risk.StepUpAuthResult) ((arrow.core.Either.Right) either).getValue();
                if (kotlin.jvm.internal.Intrinsics.areEqual(stepUpAuthResult, com.paypal.oslo.feature.taptopay.domain.model.risk.StepUpAuthResult.Success.INSTANCE)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Step-up succeeded, re-fetching eligibility", null, null, 6, null);
                    this.getInputFormats.loadCardEligibility(this.getHighResolutionOutputSizeshNQ4ISI);
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(stepUpAuthResult, com.paypal.oslo.feature.taptopay.domain.model.risk.StepUpAuthResult.Failure.INSTANCE)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Step-up failed or cancelled", null, null, 6, null);
                    this.getInputFormats.getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Error(null, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType.RISK_STEP_UP_FAILED));
                }
            } else {
                if (!(either instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Step-up error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((arrow.core.Either.Left) either).getValue())), null, 4, null);
                this.getInputFormats.getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Error(null, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType.TERMINAL_ERROR));
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
            java.lang.String str2 = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str2);
            sb.append(" failed");
            logger.e(sb.toString(), e2);
            this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Error(null, this.getHighSpeedVideoSizes));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel$handleStepUpChallenge$$inlined$launchSafe$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel$handleStepUpChallenge$$inlined$launchSafe$1(this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation, this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiSelectorViewModel$handleStepUpChallenge$$inlined$launchSafe$1(java.lang.String str, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel fiSelectorViewModel, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType fiSelectorErrorType, kotlin.coroutines.Continuation continuation, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel fiSelectorViewModel2, java.lang.String str2, java.util.List list) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = str;
        this.getInputSizeshNQ4ISI = fiSelectorViewModel;
        this.getHighSpeedVideoSizes = fiSelectorErrorType;
        this.getInputFormats = fiSelectorViewModel2;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }
}
