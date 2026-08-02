package com.paypal.oslo.feature.identity.changepassword.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ChangePasswordScreenKt$ChangePasswordScreen$4$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        ((com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel) this.receiver).onConfirmPasswordChange(str);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        getHighResolutionOutputSizeshNQ4ISI(str);
        return kotlin.Unit.INSTANCE;
    }

    ChangePasswordScreenKt$ChangePasswordScreen$4$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.class, "onConfirmPasswordChange", "onConfirmPasswordChange(Ljava/lang/String;)V", 0);
    }
}
