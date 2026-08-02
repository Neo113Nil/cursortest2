package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository", f = "LocalPayPalCardDatabaseRepository.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE}, m = "getCardIdGroups", n = {}, nl = {306}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class LocalPayPalCardDatabaseRepository$getCardIdGroups$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getCardIdGroups(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalPayPalCardDatabaseRepository$getCardIdGroups$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository localPayPalCardDatabaseRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardIdGroups$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = localPayPalCardDatabaseRepository;
    }
}
