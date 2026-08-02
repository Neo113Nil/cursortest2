package com.paypal.oslo.feature.onboarding.signup.password.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1$1", f = "PasswordScreen.kt", i = {0}, l = {71}, m = "emit", n = {"action"}, nl = {75}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class PasswordScreenKt$PasswordScreen$1$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1.AnonymousClass1<T> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PasswordScreenKt$PasswordScreen$1$1$1$emit$1(com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1$1$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = anonymousClass1;
    }
}
