package com.paypal.oslo.feature.wallet.cards.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl", f = "CardRepositoryImpl.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m = "getCardDetail", n = {"cardId"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class CardRepositoryImpl$getCardDetail$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getCardDetail(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardRepositoryImpl$getCardDetail$1(com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl cardRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCardDetail$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cardRepositoryImpl;
    }
}
