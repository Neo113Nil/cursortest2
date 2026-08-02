package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl", f = "PushTokenLocalDataSourceImpl.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, l = {81, 82, 83, 84}, m = "clearToken", n = {"raise$iv$iv$iv", "$this$clearToken_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenLocalDataSourceImpl$clearToken$2", "raise$iv$iv$iv", "$this$clearToken_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenLocalDataSourceImpl$clearToken$2", "raise$iv$iv$iv", "$this$clearToken_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenLocalDataSourceImpl$clearToken$2", "raise$iv$iv$iv", "$this$clearToken_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenLocalDataSourceImpl$clearToken$2"}, nl = {82, 83, 84, 85}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class PushTokenLocalDataSourceImpl$clearToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.clearToken(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushTokenLocalDataSourceImpl$clearToken$1(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl pushTokenLocalDataSourceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl$clearToken$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = pushTokenLocalDataSourceImpl;
    }
}
