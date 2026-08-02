package com.paypal.oslo.feature.onboarding.steps.nav.data.repository;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl$prefetchNextSteps$2$2$1", f = "FlowStepRepositoryImpl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE}, m = "invokeSuspend", n = {}, nl = {215}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class FlowStepRepositoryImpl$prefetchNextSteps$2$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.steps.nav.domain.Step getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, "Prefetching step for transition", this.getHighSpeedVideoFpsRangesFor, null, 4, null);
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges.m16522getFlowId8NcbBzM(), this.getHighSpeedVideoFpsRanges.m16524getStepIdeVUBM90(), this.Camera2StreamConfigurationMap.sanitize(), this.getHighSpeedVideoFpsRangesFor, this);
                if (highResolutionOutputSizeshNQ4ISI == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                highResolutionOutputSizeshNQ4ISI = obj;
            }
            arrow.core.Either either = (arrow.core.Either) highResolutionOutputSizeshNQ4ISI;
            java.util.Map<java.lang.String, java.lang.Object> map = this.getHighSpeedVideoFpsRangesFor;
            if (either instanceof arrow.core.Either.Right) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, "Successfully prefetched and cached step", map, null, 4, null);
            } else if (either instanceof arrow.core.Either.Left) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, "Failed to prefetch step", map, null, null, 12, null);
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } catch (java.lang.Exception unused) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, "Error during prefetching", this.getHighSpeedVideoFpsRangesFor, null, null, 12, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl$prefetchNextSteps$2$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl$prefetchNextSteps$2$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowStepRepositoryImpl$prefetchNextSteps$2$2$1(java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl flowStepRepositoryImpl, com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step, com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl$prefetchNextSteps$2$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = map;
        this.getHighSpeedVideoSizes = flowStepRepositoryImpl;
        this.getHighSpeedVideoFpsRanges = step;
        this.Camera2StreamConfigurationMap = transition;
    }
}
