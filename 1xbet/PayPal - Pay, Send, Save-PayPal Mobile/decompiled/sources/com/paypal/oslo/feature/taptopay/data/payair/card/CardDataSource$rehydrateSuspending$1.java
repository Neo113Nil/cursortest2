package com.paypal.oslo.feature.taptopay.data.payair.card;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource", f = "CardDataSource.kt", i = {}, l = {62}, m = "rehydrateSuspending$taptopay_prodRelease", n = {}, nl = {63}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class CardDataSource$rehydrateSuspending$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.rehydrateSuspending$taptopay_prodRelease(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardDataSource$rehydrateSuspending$1(com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource cardDataSource, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$rehydrateSuspending$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = cardDataSource;
    }
}
