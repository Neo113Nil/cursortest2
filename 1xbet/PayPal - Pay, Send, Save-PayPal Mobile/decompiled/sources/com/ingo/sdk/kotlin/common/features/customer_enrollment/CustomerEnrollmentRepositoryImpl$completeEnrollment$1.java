package com.ingo.sdk.kotlin.common.features.customer_enrollment;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepositoryImpl", f = "CustomerEnrollmentRepository.kt", i = {0, 0, 0}, l = {18, 19}, m = "completeEnrollment", n = {"ssn", "dob", "mobilePhoneNumber"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes9.dex */
final class CustomerEnrollmentRepositoryImpl$completeEnrollment$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepositoryImpl getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputFormats.completeEnrollment(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerEnrollmentRepositoryImpl$completeEnrollment$1(com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepositoryImpl customerEnrollmentRepositoryImpl, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepositoryImpl$completeEnrollment$1> continuation) {
        super(continuation);
        this.getInputFormats = customerEnrollmentRepositoryImpl;
    }
}
