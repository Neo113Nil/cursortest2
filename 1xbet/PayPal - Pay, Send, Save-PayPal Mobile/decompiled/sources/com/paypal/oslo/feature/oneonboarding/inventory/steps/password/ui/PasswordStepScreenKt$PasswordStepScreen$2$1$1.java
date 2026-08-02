package com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PasswordStepScreenKt$PasswordStepScreen$2$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        ((com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel) this.receiver).onPasswordChange(str);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        getHighSpeedVideoSizes(str);
        return kotlin.Unit.INSTANCE;
    }

    PasswordStepScreenKt$PasswordStepScreen$2$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel.class, "onPasswordChange", "onPasswordChange(Ljava/lang/String;)V", 0);
    }
}
