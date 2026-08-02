package com.paypal.oslo.feature.identity.loginsecurity.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class LoginAndSecurityScreenKt$LoginAndSecurityScreen$2$3$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature, java.lang.Boolean, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature loginAndSecurityFeature, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginAndSecurityFeature, "");
        ((com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel) this.receiver).onToggleAuthenticationState(loginAndSecurityFeature, z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature loginAndSecurityFeature, java.lang.Boolean bool) {
        getHighSpeedVideoFpsRanges(loginAndSecurityFeature, bool.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    LoginAndSecurityScreenKt$LoginAndSecurityScreen$2$3$2$1(java.lang.Object obj) {
        super(2, obj, com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel.class, "onToggleAuthenticationState", "onToggleAuthenticationState(Lcom/paypal/oslo/feature/identity/loginsecurity/domain/model/LoginAndSecurityFeature;Z)V", 0);
    }
}
