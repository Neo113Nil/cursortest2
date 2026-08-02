package com.paypal.oslo.feature.wallet.cards.ui.nickname;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/cards/domain/update/model/UpdateCardError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl$onRemoveConfirm$2", f = "NicknameViewModelImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class NicknameViewModelImpl$onRemoveConfirm$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<arrow.core.Either<? extends com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError, ? extends com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState nicknameModalState;
        arrow.core.Either either = (arrow.core.Either) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            do {
                value = mutableStateFlow.getValue();
                if (either instanceof arrow.core.Either.Right) {
                    nicknameModalState = new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveSuccess(com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfoKtKt.toCardDetailInfo((com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail) ((arrow.core.Either.Right) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    nicknameModalState = com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Idle.INSTANCE;
                }
            } while (!mutableStateFlow.compareAndSet(value, nicknameModalState));
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(arrow.core.Either<? extends com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError, ? extends com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail> either, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl$onRemoveConfirm$2) create(either, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl$onRemoveConfirm$2 nicknameViewModelImpl$onRemoveConfirm$2 = new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl$onRemoveConfirm$2(this.Camera2StreamConfigurationMap, continuation);
        nicknameViewModelImpl$onRemoveConfirm$2.getHighSpeedVideoFpsRangesFor = obj;
        return nicknameViewModelImpl$onRemoveConfirm$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NicknameViewModelImpl$onRemoveConfirm$2(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl nicknameViewModelImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl$onRemoveConfirm$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = nicknameViewModelImpl;
    }
}
