package com.paypal.oslo.feature.taptopay.data.repository.thales;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter", f = "ThalesCardRepositoryAdapter.kt", i = {}, l = {97}, m = "getDefaultCard", n = {}, nl = {98}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class ThalesCardRepositoryAdapter$getDefaultCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getDefaultCard(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesCardRepositoryAdapter$getDefaultCard$1(com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter thalesCardRepositoryAdapter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getDefaultCard$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = thalesCardRepositoryAdapter;
    }
}
