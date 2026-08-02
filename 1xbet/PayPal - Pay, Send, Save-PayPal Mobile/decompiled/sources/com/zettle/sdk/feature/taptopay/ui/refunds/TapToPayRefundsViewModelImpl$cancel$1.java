package com.zettle.sdk.feature.taptopay.ui.refunds;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$cancel$1", f = "TapToPayRefundsViewModelImpl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class TapToPayRefundsViewModelImpl$cancel$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = 1;
            if (mutableSharedFlow.emit(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects.Canceled.INSTANCE, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$cancel$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$cancel$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapToPayRefundsViewModelImpl$cancel$1(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl tapToPayRefundsViewModelImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$cancel$1> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoSizes = tapToPayRefundsViewModelImpl;
    }
}
