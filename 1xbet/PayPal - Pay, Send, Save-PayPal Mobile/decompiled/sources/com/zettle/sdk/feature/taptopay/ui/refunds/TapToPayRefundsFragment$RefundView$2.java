package com.zettle.sdk.feature.taptopay.ui.refunds;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$RefundView$2", f = "TapToPayRefundsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class TapToPayRefundsFragment$RefundView$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$RefundView$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$RefundView$2(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapToPayRefundsFragment$RefundView$2(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment tapToPayRefundsFragment, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$RefundView$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = tapToPayRefundsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.access$getViewModel(this.getHighSpeedVideoFpsRanges).dispatchAction(new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Actions.RetrievePaymentInfo(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.access$getAction(this.getHighSpeedVideoFpsRanges).getPaymentReferenceId(), com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.access$getAction(this.getHighSpeedVideoFpsRanges).getAmount()));
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
