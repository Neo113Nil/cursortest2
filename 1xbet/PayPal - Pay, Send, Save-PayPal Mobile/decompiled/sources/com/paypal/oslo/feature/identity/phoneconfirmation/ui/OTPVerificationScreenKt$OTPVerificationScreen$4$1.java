package com.paypal.oslo.feature.identity.phoneconfirmation.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class OTPVerificationScreenKt$OTPVerificationScreen$4$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void Camera2StreamConfigurationMap() {
        ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel) this.receiver).onVerifyTapped();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        Camera2StreamConfigurationMap();
        return kotlin.Unit.INSTANCE;
    }

    OTPVerificationScreenKt$OTPVerificationScreen$4$1(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel.class, "onVerifyTapped", "onVerifyTapped()V", 0);
    }
}
