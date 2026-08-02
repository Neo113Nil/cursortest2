package com.paypal.oslo.feature.taptopay.data.repository.thales;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter", f = "ThalesCardRepositoryAdapter.kt", i = {0}, l = {113}, m = "getCardArt", n = {"digitizedCardId"}, nl = {114}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class ThalesCardRepositoryAdapter$getCardArt$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getCardArt(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesCardRepositoryAdapter$getCardArt$1(com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter thalesCardRepositoryAdapter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getCardArt$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = thalesCardRepositoryAdapter;
    }
}
