package com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository.OtpGenerationRepositoryImpl", f = "OtpGenerationRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {72}, m = "generateOTP", n = {"request", "raise$iv$iv$iv", "$this$generateOTP_u24lambda_u240", "config", "input", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-OtpGenerationRepositoryImpl$generateOTP$2"}, nl = {82}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class OtpGenerationRepositoryImpl$generateOTP$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository.OtpGenerationRepositoryImpl getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.generateOTP(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OtpGenerationRepositoryImpl$generateOTP$1(com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository.OtpGenerationRepositoryImpl otpGenerationRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository.OtpGenerationRepositoryImpl$generateOTP$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = otpGenerationRepositoryImpl;
    }
}
