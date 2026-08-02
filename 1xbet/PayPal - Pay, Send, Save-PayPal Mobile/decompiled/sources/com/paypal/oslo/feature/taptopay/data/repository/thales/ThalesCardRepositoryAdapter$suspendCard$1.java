package com.paypal.oslo.feature.taptopay.data.repository.thales;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter", f = "ThalesCardRepositoryAdapter.kt", i = {0}, l = {92}, m = "suspendCard", n = {"digitizedCardId"}, nl = {93}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class ThalesCardRepositoryAdapter$suspendCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.suspendCard(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesCardRepositoryAdapter$suspendCard$1(com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter thalesCardRepositoryAdapter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$suspendCard$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = thalesCardRepositoryAdapter;
    }
}
