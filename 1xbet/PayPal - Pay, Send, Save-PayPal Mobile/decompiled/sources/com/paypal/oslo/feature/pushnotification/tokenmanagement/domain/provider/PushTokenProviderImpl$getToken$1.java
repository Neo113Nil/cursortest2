package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProviderImpl", f = "PushTokenProviderImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {53}, m = "getToken", n = {"raise$iv$iv$iv", "$this$getToken_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenProviderImpl$getToken$2"}, nl = {63}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class PushTokenProviderImpl$getToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProviderImpl getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputFormats.getToken(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushTokenProviderImpl$getToken$1(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProviderImpl pushTokenProviderImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProviderImpl$getToken$1> continuation) {
        super(continuation);
        this.getInputFormats = pushTokenProviderImpl;
    }
}
