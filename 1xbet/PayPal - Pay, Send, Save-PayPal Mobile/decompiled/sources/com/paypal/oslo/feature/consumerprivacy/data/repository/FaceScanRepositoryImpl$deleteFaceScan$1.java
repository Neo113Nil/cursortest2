package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl", f = "FaceScanRepositoryImpl.kt", i = {}, l = {45}, m = "deleteFaceScan", n = {}, nl = {70}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class FaceScanRepositoryImpl$deleteFaceScan$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.deleteFaceScan(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FaceScanRepositoryImpl$deleteFaceScan$1(com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl faceScanRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl$deleteFaceScan$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = faceScanRepositoryImpl;
    }
}
