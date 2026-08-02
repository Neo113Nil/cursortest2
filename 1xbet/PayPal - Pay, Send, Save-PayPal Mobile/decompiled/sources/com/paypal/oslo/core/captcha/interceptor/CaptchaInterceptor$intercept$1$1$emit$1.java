package com.paypal.oslo.core.captcha.interceptor;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor$intercept$1$1", f = "CaptchaInterceptor.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4}, l = {100, 116, 121, 134, 146}, m = "emit", n = {"response", "captchaMetadata", "correlationId", "response", "captchaMetadata", "correlationId", "result", "response", "captchaMetadata", "correlationId", "result", "response", "captchaMetadata", "correlationId", "result", "response", "captchaMetadata"}, nl = {111, 148, 148, 148, 148}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"}, v = 2)
/* loaded from: classes4.dex */
final class CaptchaInterceptor$intercept$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor$intercept$1.AnonymousClass1<T> getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CaptchaInterceptor$intercept$1$1$emit$1(com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor$intercept$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor$intercept$1$1$emit$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = anonymousClass1;
    }
}
