package com.paypal.oslo.feature.qrc.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.data.repository.SessionRepositoryImpl", f = "SessionRepositoryImpl.kt", i = {0, 0, 0}, l = {60}, m = "scanQrCode", n = {"request", "deviceMetadata", "input"}, nl = {71}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes14.dex */
final class SessionRepositoryImpl$scanQrCode$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.qrc.data.repository.SessionRepositoryImpl getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.scanQrCode(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionRepositoryImpl$scanQrCode$1(com.paypal.oslo.feature.qrc.data.repository.SessionRepositoryImpl sessionRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.data.repository.SessionRepositoryImpl$scanQrCode$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = sessionRepositoryImpl;
    }
}
