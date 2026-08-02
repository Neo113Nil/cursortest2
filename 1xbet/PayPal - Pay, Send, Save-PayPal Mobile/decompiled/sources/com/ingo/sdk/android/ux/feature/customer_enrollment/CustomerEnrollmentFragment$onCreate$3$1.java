package com.ingo.sdk.android.ux.feature.customer_enrollment;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class CustomerEnrollmentFragment$onCreate$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.ingo.sdk.kotlin.common.core.exception.Failure, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.access$renderFailure((com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment) this.receiver, failure);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        getHighSpeedVideoSizes(failure);
        return kotlin.Unit.INSTANCE;
    }

    CustomerEnrollmentFragment$onCreate$3$1(java.lang.Object obj) {
        super(1, obj, com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.class, "renderFailure", "renderFailure(Lcom/ingo/sdk/kotlin/common/core/exception/Failure;)V", 0);
    }
}
