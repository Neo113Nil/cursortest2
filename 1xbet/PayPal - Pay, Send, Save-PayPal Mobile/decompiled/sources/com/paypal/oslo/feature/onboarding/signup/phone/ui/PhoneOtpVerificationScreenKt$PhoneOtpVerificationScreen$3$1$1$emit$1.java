package com.paypal.oslo.feature.onboarding.signup.phone.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1", f = "PhoneOtpVerificationScreen.kt", i = {0}, l = {116}, m = "emit", n = {"it"}, nl = {117}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1.AnonymousClass1<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = anonymousClass1;
    }
}
