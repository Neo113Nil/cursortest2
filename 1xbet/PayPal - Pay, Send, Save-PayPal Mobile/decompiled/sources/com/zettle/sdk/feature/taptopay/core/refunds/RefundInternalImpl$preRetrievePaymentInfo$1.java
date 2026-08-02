package com.zettle.sdk.feature.taptopay.core.refunds;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$preRetrievePaymentInfo$1", f = "RefundInternalImpl.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class RefundInternalImpl$preRetrievePaymentInfo$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalytics refundAnalytics;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            refundAnalytics = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = 1;
            if (refundAnalytics.track(this.getHighSpeedVideoFpsRangesFor.getEffects(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$preRetrievePaymentInfo$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$preRetrievePaymentInfo$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefundInternalImpl$preRetrievePaymentInfo$1(com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl refundInternalImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$preRetrievePaymentInfo$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = refundInternalImpl;
    }
}
