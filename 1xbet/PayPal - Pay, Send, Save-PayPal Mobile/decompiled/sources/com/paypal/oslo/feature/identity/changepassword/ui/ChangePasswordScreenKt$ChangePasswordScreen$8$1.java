package com.paypal.oslo.feature.identity.changepassword.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ChangePasswordScreenKt$ChangePasswordScreen$8$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(boolean z) {
        ((com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel) this.receiver).onConfirmPasswordFocusChange(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
        Camera2StreamConfigurationMap(bool.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    ChangePasswordScreenKt$ChangePasswordScreen$8$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.class, "onConfirmPasswordFocusChange", "onConfirmPasswordFocusChange(Z)V", 0);
    }
}
