package com.paypal.oslo.feature.onboarding.signup.phone.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$4$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges() {
        ((com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel) this.receiver).onOtpInputChange();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        getHighSpeedVideoFpsRanges();
        return kotlin.Unit.INSTANCE;
    }

    PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$4$1(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel.class, "onOtpInputChange", "onOtpInputChange()V", 0);
    }
}
