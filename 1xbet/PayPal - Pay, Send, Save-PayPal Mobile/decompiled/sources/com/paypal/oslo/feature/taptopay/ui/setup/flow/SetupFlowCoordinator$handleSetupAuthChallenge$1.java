package com.paypal.oslo.feature.taptopay.ui.setup.flow;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$handleSetupAuthChallenge$1", f = "SetupFlowCoordinator.kt", i = {}, l = {690}, m = "invokeSuspend", n = {}, nl = {691}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class SetupFlowCoordinator$handleSetupAuthChallenge$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SetupAuthChallenge getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.usecase.risk.StepUpUriChallengeUseCase stepUpUriChallengeUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            stepUpUriChallengeUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = stepUpUriChallengeUseCase.invoke(this.getHighSpeedVideoFpsRanges.getContextId(), this);
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
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Step-up auth succeeded, restarting provisioning", null, null, 6, null);
                this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap();
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(stepUpAuthResult, com.paypal.oslo.feature.taptopay.domain.model.risk.StepUpAuthResult.Failure.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Step-up auth failed/cancelled, closing flow", null, null, 6, null);
                this.Camera2StreamConfigurationMap.getNavigator().navigate(new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Close(this.Camera2StreamConfigurationMap.resolveNavResult$taptopay_prodRelease()), "step-up auth failed");
            }
        } else {
            if (!(either instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Step-up auth error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((arrow.core.Either.Left) either).getValue())), null, 4, null);
            this.Camera2StreamConfigurationMap.getNavigator().navigate(new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Close(this.Camera2StreamConfigurationMap.resolveNavResult$taptopay_prodRelease()), "step-up auth error");
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$handleSetupAuthChallenge$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$handleSetupAuthChallenge$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetupFlowCoordinator$handleSetupAuthChallenge$1(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SetupAuthChallenge setupAuthChallenge, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$handleSetupAuthChallenge$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = setupFlowCoordinator;
        this.getHighSpeedVideoFpsRanges = setupAuthChallenge;
    }
}
