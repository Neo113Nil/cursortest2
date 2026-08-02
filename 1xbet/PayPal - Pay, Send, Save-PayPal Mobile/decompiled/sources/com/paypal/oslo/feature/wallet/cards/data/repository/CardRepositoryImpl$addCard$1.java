package com.paypal.oslo.feature.wallet.cards.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl", f = "CardRepositoryImpl.kt", i = {0, 0}, l = {91}, m = com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OPERATION_NAME, n = {"card", "input"}, nl = {96}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class CardRepositoryImpl$addCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.addCard(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardRepositoryImpl$addCard$1(com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl cardRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$addCard$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cardRepositoryImpl;
    }
}
