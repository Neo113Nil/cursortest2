package com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel$triggerStepupChallenge$1", f = "StepUpViewComponentViewModel.kt", i = {0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {69, 82, 79}, m = "invokeSuspend", n = {"input", "input", "result", "this_$iv", "it", "$i$f$fold", "$i$a$-fold-StepUpViewComponentViewModel$triggerStepupChallenge$1$2", "input", "result", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-StepUpViewComponentViewModel$triggerStepupChallenge$1$1"}, nl = {70, 83, 80}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes13.dex */
final class StepUpViewComponentViewModel$triggerStepupChallenge$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.domain.StepUpViewComponentConfig getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b7, code lost:
    
        if (r4.send(r5, r13) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x011f, code lost:
    
        if (r4.send(r5, r13) == r0) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.identity.stepup.StepupChallengeHandler stepupChallengeHandler;
        com.paypal.oslo.core.identity.stepup.StepupChallengeInput stepupChallengeInput;
        kotlinx.coroutines.channels.Channel channel;
        kotlinx.coroutines.channels.Channel channel2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String stepUpContextId = this.getHighResolutionOutputSizeshNQ4ISI.getStepUpContextId();
            java.lang.String value = this.getHighSpeedVideoSizes.getValue();
            java.util.Locale locale = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = value.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            com.paypal.oslo.core.identity.stepup.StepupChallengeInput stepupChallengeInput2 = new com.paypal.oslo.core.identity.stepup.StepupChallengeInput(stepUpContextId, com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModelKt.FlowName, lowerCase, this.getHighResolutionOutputSizeshNQ4ISI.getFlowContextId());
            stepupChallengeHandler = this.getOutputFormats.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepupChallengeInput2);
            this.getHighSpeedVideoSizesFor = 1;
            obj = stepupChallengeHandler.handleStepup(stepupChallengeInput2, this);
            if (obj != coroutine_suspended) {
                stepupChallengeInput = stepupChallengeInput2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        stepupChallengeInput = (com.paypal.oslo.core.identity.stepup.StepupChallengeInput) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel stepUpViewComponentViewModel = this.getOutputFormats;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.core.identity.stepup.StepupSuccess stepupSuccess = (com.paypal.oslo.core.identity.stepup.StepupSuccess) ((arrow.core.Either.Right) either).getValue();
            channel2 = stepUpViewComponentViewModel.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentAction.StepForward stepForward = com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentAction.StepForward.INSTANCE;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepupChallengeInput);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepupSuccess);
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighSpeedVideoSizesFor = 2;
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.core.identity.stepup.StepupError stepupError = (com.paypal.oslo.core.identity.stepup.StepupError) ((arrow.core.Either.Left) either).getValue();
            if (stepupError instanceof com.paypal.oslo.core.identity.stepup.StepupError.UserCanceled) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "Step-up challenge cancelled by user", null, null, 6, null);
            } else {
                if (!(stepupError instanceof com.paypal.oslo.core.identity.stepup.StepupError.StepupFailed)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "Step-up challenge failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", ((com.paypal.oslo.core.identity.stepup.StepupError.StepupFailed) stepupError).getReason())), null, 4, null);
            }
            channel = stepUpViewComponentViewModel.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentAction.CloseFlow closeFlow = com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentAction.CloseFlow.INSTANCE;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepupChallengeInput);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepupError);
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighSpeedVideoSizesFor = 3;
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel$triggerStepupChallenge$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel$triggerStepupChallenge$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getOutputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepUpViewComponentViewModel$triggerStepupChallenge$1(com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.domain.StepUpViewComponentConfig stepUpViewComponentConfig, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel stepUpViewComponentViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel$triggerStepupChallenge$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = stepUpViewComponentConfig;
        this.getHighSpeedVideoSizes = intentId;
        this.getOutputFormats = stepUpViewComponentViewModel;
    }
}
