package com.paypal.oslo.feature.identity.userverification.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class UserVerificationScreenKt$UserVerificationScreen$13$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges() {
        ((com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel) this.receiver).resetState();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        getHighSpeedVideoFpsRanges();
        return kotlin.Unit.INSTANCE;
    }

    UserVerificationScreenKt$UserVerificationScreen$13$1(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel.class, "resetState", "resetState()V", 0);
    }
}
