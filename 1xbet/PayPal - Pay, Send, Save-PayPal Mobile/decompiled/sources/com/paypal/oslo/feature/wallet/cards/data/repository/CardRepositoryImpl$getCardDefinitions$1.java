package com.paypal.oslo.feature.wallet.cards.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl", f = "CardRepositoryImpl.kt", i = {0}, l = {193}, m = "getCardDefinitions", n = {"request"}, nl = {197}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class CardRepositoryImpl$getCardDefinitions$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getCardDefinitions(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardRepositoryImpl$getCardDefinitions$1(com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl cardRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCardDefinitions$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cardRepositoryImpl;
    }
}
