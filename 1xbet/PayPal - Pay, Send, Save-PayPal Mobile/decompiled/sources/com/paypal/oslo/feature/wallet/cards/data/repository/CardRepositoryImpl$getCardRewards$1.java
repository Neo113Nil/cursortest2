package com.paypal.oslo.feature.wallet.cards.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl", f = "CardRepositoryImpl.kt", i = {}, l = {132}, m = "getCardRewards", n = {}, nl = {136}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class CardRepositoryImpl$getCardRewards$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getCardRewards(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardRepositoryImpl$getCardRewards$1(com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl cardRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCardRewards$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = cardRepositoryImpl;
    }
}
