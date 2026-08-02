package com.paypal.oslo.core.pushnotification.data.fcm;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.pushnotification.data.fcm.FcmTokenProviderImpl", f = "FcmTokenProviderImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {49}, m = "getToken", n = {"raise$iv$iv$iv", "$this$getToken_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-FcmTokenProviderImpl$getToken$2"}, nl = {50}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class FcmTokenProviderImpl$getToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.core.pushnotification.data.fcm.FcmTokenProviderImpl getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputFormats.getToken(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FcmTokenProviderImpl$getToken$1(com.paypal.oslo.core.pushnotification.data.fcm.FcmTokenProviderImpl fcmTokenProviderImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.pushnotification.data.fcm.FcmTokenProviderImpl$getToken$1> continuation) {
        super(continuation);
        this.getOutputFormats = fcmTokenProviderImpl;
    }
}
