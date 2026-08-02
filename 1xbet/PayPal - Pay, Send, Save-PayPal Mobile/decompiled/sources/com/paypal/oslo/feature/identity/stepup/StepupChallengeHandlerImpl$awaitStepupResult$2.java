package com.paypal.oslo.feature.identity.stepup;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2", f = "StepupChallengeHandlerImpl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class StepupChallengeHandlerImpl$awaitStepupResult$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.stepup.StepupError, com.paypal.oslo.core.identity.stepup.StepupSuccess>> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = 1;
                obj = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(300000L, new com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2$navResult$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.paypal.oslo.feature.identity.api.navigation.result.StepupNavResult stepupNavResult = (com.paypal.oslo.feature.identity.api.navigation.result.StepupNavResult) obj;
            if (stepupNavResult == null) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Step-up navigation timed out - no result received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("requestId", this.getHighSpeedVideoSizes), kotlin.TuplesKt.to("timeoutMs", kotlin.coroutines.jvm.internal.Boxing.boxLong(300000L))), null, 4, null);
                this.getHighSpeedVideoFpsRangesFor.complete(arrow.core.EitherKt.left(new com.paypal.oslo.core.identity.stepup.StepupError.StepupFailed("TIMEOUT")));
            } else {
                kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.stepup.StepupError, com.paypal.oslo.core.identity.stepup.StepupSuccess>> completableDeferred = this.getHighSpeedVideoFpsRangesFor;
                arrow.core.Either<com.paypal.oslo.core.identity.stepup.StepupError, com.paypal.oslo.core.identity.stepup.StepupSuccess> stepupResult = stepupNavResult.getStepupResult();
                com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl.m15359access$logResulthN0UB1M(this.getHighSpeedVideoFpsRanges, stepupResult, this.getHighSpeedVideoSizes);
                completableDeferred.complete(stepupResult);
            }
        } finally {
            try {
                appNavigator = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
                appNavigator.getNavResultManager().m11580cleanupRequestDpEMydE(this.getHighSpeedVideoSizes);
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th) {
            }
        }
        appNavigator = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
        appNavigator.getNavResultManager().m11580cleanupRequestDpEMydE(this.getHighSpeedVideoSizes);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupChallengeHandlerImpl$awaitStepupResult$2(java.lang.String str, kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.stepup.StepupError, com.paypal.oslo.core.identity.stepup.StepupSuccess>> completableDeferred, com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl stepupChallengeHandlerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = completableDeferred;
        this.getHighSpeedVideoFpsRanges = stepupChallengeHandlerImpl;
    }
}
