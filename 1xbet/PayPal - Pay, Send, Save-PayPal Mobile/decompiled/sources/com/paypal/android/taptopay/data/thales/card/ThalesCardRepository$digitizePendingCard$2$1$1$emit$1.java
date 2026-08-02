package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1$1", f = "ThalesCardRepository.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes10.dex */
final class ThalesCardRepository$digitizePendingCard$2$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1.AnonymousClass1<T> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ThalesCardRepository$digitizePendingCard$2$1$1$emit$1(com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1$1$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = anonymousClass1;
    }
}
