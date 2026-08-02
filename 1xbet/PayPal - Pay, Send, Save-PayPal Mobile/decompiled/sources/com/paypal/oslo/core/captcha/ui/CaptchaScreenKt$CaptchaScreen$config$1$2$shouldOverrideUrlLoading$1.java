package com.paypal.oslo.core.captcha.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class CaptchaScreenKt$CaptchaScreen$config$1$2$shouldOverrideUrlLoading$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.core.captcha.CaptchaChallengeResult, kotlin.Unit> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.core.captcha.CaptchaChallengeResult captchaChallengeResult) {
        com.paypal.oslo.core.captcha.CaptchaChallengeResult captchaChallengeResult2 = captchaChallengeResult;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captchaChallengeResult2, "");
        com.paypal.oslo.core.captcha.ui.CaptchaScreenKt.access$CaptchaScreen$reportResult(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, captchaChallengeResult2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CaptchaScreenKt$CaptchaScreen$config$1$2$shouldOverrideUrlLoading$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState) {
        super(1, kotlin.jvm.internal.Intrinsics.Kotlin.class, "reportResult", "CaptchaScreen$reportResult(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/MutableState;Lcom/paypal/oslo/core/captcha/CaptchaChallengeResult;)V", 0);
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighSpeedVideoSizes = mutableState;
    }
}
