package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl", f = "FaceScanRepositoryImpl.kt", i = {}, l = {28}, m = "getFaceScanStatus", n = {}, nl = {70}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class FaceScanRepositoryImpl$getFaceScanStatus$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getFaceScanStatus(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FaceScanRepositoryImpl$getFaceScanStatus$1(com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl faceScanRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl$getFaceScanStatus$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = faceScanRepositoryImpl;
    }
}
