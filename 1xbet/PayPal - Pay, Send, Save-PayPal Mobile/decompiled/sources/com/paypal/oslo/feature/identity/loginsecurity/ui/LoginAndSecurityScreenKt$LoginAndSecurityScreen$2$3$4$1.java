package com.paypal.oslo.feature.identity.loginsecurity.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class LoginAndSecurityScreenKt$LoginAndSecurityScreen$2$3$4$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void Camera2StreamConfigurationMap() {
        ((com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel) this.receiver).onFingerprintConfirmationConfirm();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        Camera2StreamConfigurationMap();
        return kotlin.Unit.INSTANCE;
    }

    LoginAndSecurityScreenKt$LoginAndSecurityScreen$2$3$4$1(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel.class, "onFingerprintConfirmationConfirm", "onFingerprintConfirmationConfirm()V", 0);
    }
}
