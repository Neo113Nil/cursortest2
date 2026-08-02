package com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository.SnaVerificationRepositoryImpl", f = "SnaVerificationRepositoryImpl.kt", i = {0, 0}, l = {38}, m = "callEvUrl", n = {"evUrl", "requestBody"}, nl = {43}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class SnaVerificationRepositoryImpl$callEvUrl$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository.SnaVerificationRepositoryImpl Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.callEvUrl(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnaVerificationRepositoryImpl$callEvUrl$1(com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository.SnaVerificationRepositoryImpl snaVerificationRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository.SnaVerificationRepositoryImpl$callEvUrl$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = snaVerificationRepositoryImpl;
    }
}
