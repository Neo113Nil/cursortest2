package com.paypal.oslo.feature.onboarding.signup.email.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class EmailOtpVerificationScreenKt$EmailOtpVerificationScreen$6$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void Camera2StreamConfigurationMap() {
        ((com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel) this.receiver).resendOtp();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        Camera2StreamConfigurationMap();
        return kotlin.Unit.INSTANCE;
    }

    EmailOtpVerificationScreenKt$EmailOtpVerificationScreen$6$1(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel.class, "resendOtp", "resendOtp()V", 0);
    }
}
