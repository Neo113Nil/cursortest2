package com.paypal.oslo.feature.onboarding.signup.ui.component;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.ui.component.OtpVerificationContentKt$OtpVerificationContent$2$1", f = "OtpVerificationContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class OtpVerificationContentKt$OtpVerificationContent$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!this.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoFpsRanges != null && (str = this.getHighSpeedVideoSizes) != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(str);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.ui.component.OtpVerificationContentKt$OtpVerificationContent$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.ui.component.OtpVerificationContentKt$OtpVerificationContent$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OtpVerificationContentKt$OtpVerificationContent$2$1(boolean z, com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay otpErrorDisplay, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.ui.component.OtpVerificationContentKt$OtpVerificationContent$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoFpsRanges = otpErrorDisplay;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }
}
