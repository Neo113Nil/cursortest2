package com.paypal.oslo.feature.mosaic.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.mosaic.data.repository.MosaicEligibilityRepositoryImpl", f = "MosaicEligibilityRepositoryImpl.kt", i = {0, 0, 0}, l = {36}, m = "getEligibility", n = {"processName", "encryptedProcessId", "input"}, nl = {52}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes13.dex */
final class MosaicEligibilityRepositoryImpl$getEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.mosaic.data.repository.MosaicEligibilityRepositoryImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.getEligibility(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MosaicEligibilityRepositoryImpl$getEligibility$1(com.paypal.oslo.feature.mosaic.data.repository.MosaicEligibilityRepositoryImpl mosaicEligibilityRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.mosaic.data.repository.MosaicEligibilityRepositoryImpl$getEligibility$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = mosaicEligibilityRepositoryImpl;
    }
}
