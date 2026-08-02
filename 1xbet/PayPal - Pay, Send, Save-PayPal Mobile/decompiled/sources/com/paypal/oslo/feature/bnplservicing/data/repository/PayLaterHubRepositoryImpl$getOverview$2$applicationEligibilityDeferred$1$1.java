package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/application/ApplicationEligibility;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getOverview$2$applicationEligibilityDeferred$1$1", f = "PayLaterHubRepositoryImpl.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, nl = {96}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class PayLaterHubRepositoryImpl$getOverview$2$applicationEligibilityDeferred$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, ? extends com.paypal.oslo.feature.bnplservicing.domain.model.application.ApplicationEligibility>>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.application.input.ApplicationEligibilityInput getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object access$getApplicationEligibility = com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl.access$getApplicationEligibility(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this);
        return access$getApplicationEligibility == coroutine_suspended ? coroutine_suspended : access$getApplicationEligibility;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, ? extends com.paypal.oslo.feature.bnplservicing.domain.model.application.ApplicationEligibility>> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getOverview$2$applicationEligibilityDeferred$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getOverview$2$applicationEligibilityDeferred$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayLaterHubRepositoryImpl$getOverview$2$applicationEligibilityDeferred$1$1(com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl payLaterHubRepositoryImpl, com.paypal.oslo.feature.bnplservicing.domain.model.application.input.ApplicationEligibilityInput applicationEligibilityInput, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getOverview$2$applicationEligibilityDeferred$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = payLaterHubRepositoryImpl;
        this.getHighSpeedVideoFpsRangesFor = applicationEligibilityInput;
    }
}
