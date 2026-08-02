package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$3$1", f = "UseAtCheckoutBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.UseAtCheckoutUiData getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRangesFor.onLoad(this.getHighSpeedVideoFpsRanges);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$3$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$3$1(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutViewModel useAtCheckoutViewModel, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.UseAtCheckoutUiData useAtCheckoutUiData, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = useAtCheckoutViewModel;
        this.getHighSpeedVideoFpsRanges = useAtCheckoutUiData;
    }
}
