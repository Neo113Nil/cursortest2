package com.paypal.oslo.feature.wallet.cards.ui.nickname;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$NicknameModal$3$1", f = "NicknameModal.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class NicknameModalKt$NicknameModal$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo cardDetailInfo;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState access$NicknameModal$lambda$1 = com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.access$NicknameModal$lambda$1(this.getHighSpeedVideoFpsRanges);
        if (access$NicknameModal$lambda$1 instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Success) {
            cardDetailInfo = ((com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Success) access$NicknameModal$lambda$1).getCardDetailInfo();
        } else {
            cardDetailInfo = access$NicknameModal$lambda$1 instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveSuccess ? ((com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveSuccess) access$NicknameModal$lambda$1).getCardDetailInfo() : null;
        }
        boolean z = cardDetailInfo != null || (access$NicknameModal$lambda$1 instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Dismissed);
        if (cardDetailInfo != null) {
            this.getHighSpeedVideoFpsRangesFor.invoke(cardDetailInfo);
        }
        if (z) {
            this.getHighSpeedVideoSizes.hideSheet();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$NicknameModal$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$NicknameModal$3$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NicknameModalKt$NicknameModal$3$1(com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState> state, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$NicknameModal$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = bottomSheetController;
        this.getHighSpeedVideoFpsRanges = state;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
