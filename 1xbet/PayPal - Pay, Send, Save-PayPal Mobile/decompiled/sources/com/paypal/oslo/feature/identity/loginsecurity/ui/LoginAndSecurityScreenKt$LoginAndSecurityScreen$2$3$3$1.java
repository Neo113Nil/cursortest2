package com.paypal.oslo.feature.identity.loginsecurity.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class LoginAndSecurityScreenKt$LoginAndSecurityScreen$2$3$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature loginAndSecurityFeature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginAndSecurityFeature, "");
        ((com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel) this.receiver).onSettingClick(loginAndSecurityFeature);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature loginAndSecurityFeature) {
        getHighResolutionOutputSizeshNQ4ISI(loginAndSecurityFeature);
        return kotlin.Unit.INSTANCE;
    }

    LoginAndSecurityScreenKt$LoginAndSecurityScreen$2$3$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel.class, "onSettingClick", "onSettingClick(Lcom/paypal/oslo/feature/identity/loginsecurity/domain/model/LoginAndSecurityFeature;)V", 0);
    }
}
