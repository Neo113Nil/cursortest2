package com.ingo.sdk.kotlin.common.features.customer_enrollment;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentUseCase", f = "CustomerEnrollmentUseCase.kt", i = {}, l = {19}, m = "run", n = {}, s = {})
/* loaded from: classes9.dex */
final class CustomerEnrollmentUseCase$run$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentUseCase getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.run((com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentParameters) null, (kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerEnrollmentUseCase$run$1(com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentUseCase customerEnrollmentUseCase, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentUseCase$run$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = customerEnrollmentUseCase;
    }
}
