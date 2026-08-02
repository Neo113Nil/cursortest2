package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository", f = "LocalPayPalCardDatabaseRepository.kt", i = {0, 1, 1}, l = {126, 137}, m = "deleteCardIdGroup", n = {"id", "id", "cardIdGroup"}, nl = {127, 141}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class LocalPayPalCardDatabaseRepository$deleteCardIdGroup$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.deleteCardIdGroup(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalPayPalCardDatabaseRepository$deleteCardIdGroup$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository localPayPalCardDatabaseRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteCardIdGroup$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = localPayPalCardDatabaseRepository;
    }
}
