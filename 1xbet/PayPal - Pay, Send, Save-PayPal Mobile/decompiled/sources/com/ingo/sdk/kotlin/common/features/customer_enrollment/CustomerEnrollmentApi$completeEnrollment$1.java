package com.ingo.sdk.kotlin.common.features.customer_enrollment;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentApi", f = "CustomerEnrollmentApi.kt", i = {0, 1, 1}, l = {107, 46}, m = "completeEnrollment", n = {"urlString", "urlString", "response"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes9.dex */
final class CustomerEnrollmentApi$completeEnrollment$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentApi Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.completeEnrollment(null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerEnrollmentApi$completeEnrollment$1(com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentApi customerEnrollmentApi, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentApi$completeEnrollment$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = customerEnrollmentApi;
    }
}
