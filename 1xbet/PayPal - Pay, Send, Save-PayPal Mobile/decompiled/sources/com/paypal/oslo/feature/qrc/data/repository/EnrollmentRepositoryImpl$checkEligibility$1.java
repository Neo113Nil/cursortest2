package com.paypal.oslo.feature.qrc.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl", f = "EnrollmentRepositoryImpl.kt", i = {0}, l = {42}, m = "checkEligibility", n = {"request"}, nl = {48}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class EnrollmentRepositoryImpl$checkEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.checkEligibility(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnrollmentRepositoryImpl$checkEligibility$1(com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl enrollmentRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl$checkEligibility$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = enrollmentRepositoryImpl;
    }
}
