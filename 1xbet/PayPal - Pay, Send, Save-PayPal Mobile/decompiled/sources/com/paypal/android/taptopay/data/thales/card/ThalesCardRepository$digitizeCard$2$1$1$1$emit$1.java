package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizeCard$2$1$1$1", f = "ThalesCardRepository.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes10.dex */
final class ThalesCardRepository$digitizeCard$2$1$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizeCard$2$1.AnonymousClass1.C01061<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ThalesCardRepository$digitizeCard$2$1$1$1$emit$1(com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizeCard$2$1.AnonymousClass1.C01061<? super T> c01061, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizeCard$2$1$1$1$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = c01061;
    }
}
