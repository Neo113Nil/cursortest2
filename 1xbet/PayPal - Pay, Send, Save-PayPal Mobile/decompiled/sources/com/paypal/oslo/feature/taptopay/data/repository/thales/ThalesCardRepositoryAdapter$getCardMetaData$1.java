package com.paypal.oslo.feature.taptopay.data.repository.thales;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter", f = "ThalesCardRepositoryAdapter.kt", i = {0}, l = {132}, m = "getCardMetaData", n = {"digitizedCardId"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class ThalesCardRepositoryAdapter$getCardMetaData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getCardMetaData(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesCardRepositoryAdapter$getCardMetaData$1(com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter thalesCardRepositoryAdapter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getCardMetaData$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = thalesCardRepositoryAdapter;
    }
}
