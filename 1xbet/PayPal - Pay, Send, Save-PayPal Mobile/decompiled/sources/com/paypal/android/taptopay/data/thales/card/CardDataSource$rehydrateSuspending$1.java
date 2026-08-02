package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.CardDataSource", f = "CardDataSource.kt", i = {0}, l = {54}, m = "rehydrateSuspending$tap_to_pay_data_thales_release", n = {"this"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class CardDataSource$rehydrateSuspending$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.CardDataSource getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.rehydrateSuspending$tap_to_pay_data_thales_release(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardDataSource$rehydrateSuspending$1(com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.CardDataSource$rehydrateSuspending$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = cardDataSource;
    }
}
