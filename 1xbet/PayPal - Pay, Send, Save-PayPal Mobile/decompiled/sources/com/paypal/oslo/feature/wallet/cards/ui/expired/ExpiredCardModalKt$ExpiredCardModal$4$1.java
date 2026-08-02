package com.paypal.oslo.feature.wallet.cards.ui.expired;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$ExpiredCardModal$4$1", f = "ExpiredCardModal.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ExpiredCardModalKt$ExpiredCardModal$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.getHighSpeedVideoSizes.getVisible()) {
            this.getHighSpeedVideoFpsRanges.onReset();
            this.getHighSpeedVideoFpsRanges.initialize(this.getHighSpeedVideoFpsRangesFor);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$ExpiredCardModal$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$ExpiredCardModal$4$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpiredCardModalKt$ExpiredCardModal$4$1(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel expiredCardViewModel, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$ExpiredCardModal$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = bottomSheetController;
        this.getHighSpeedVideoFpsRanges = expiredCardViewModel;
        this.getHighSpeedVideoFpsRangesFor = cardBrand;
    }
}
