package com.paypal.oslo.feature.identity.userverification.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class UserVerificationScreenKt$UserVerificationScreen$9$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        ((com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel) this.receiver).onEmailOrPhoneChange(str);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        getHighSpeedVideoFpsRanges(str);
        return kotlin.Unit.INSTANCE;
    }

    UserVerificationScreenKt$UserVerificationScreen$9$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel.class, "onEmailOrPhoneChange", "onEmailOrPhoneChange(Ljava/lang/String;)V", 0);
    }
}
