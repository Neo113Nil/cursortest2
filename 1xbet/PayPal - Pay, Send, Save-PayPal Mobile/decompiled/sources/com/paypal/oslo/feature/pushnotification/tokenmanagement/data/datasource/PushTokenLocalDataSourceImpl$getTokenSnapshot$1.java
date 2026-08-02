package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl", f = "PushTokenLocalDataSourceImpl.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {63, 68, 69, 70}, m = "getTokenSnapshot", n = {"raise$iv$iv$iv", "$this$getTokenSnapshot_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenLocalDataSourceImpl$getTokenSnapshot$2", "raise$iv$iv$iv", "$this$getTokenSnapshot_u24lambda_u240", "tokenValue", "it", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenLocalDataSourceImpl$getTokenSnapshot$2", "$i$a$-let-PushTokenLocalDataSourceImpl$getTokenSnapshot$2$1", "raise$iv$iv$iv", "$this$getTokenSnapshot_u24lambda_u240", "tokenValue", "it", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenLocalDataSourceImpl$getTokenSnapshot$2", "$i$a$-let-PushTokenLocalDataSourceImpl$getTokenSnapshot$2$1", "raise$iv$iv$iv", "$this$getTokenSnapshot_u24lambda_u240", "tokenValue", "it", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenLocalDataSourceImpl$getTokenSnapshot$2", "$i$a$-let-PushTokenLocalDataSourceImpl$getTokenSnapshot$2$1"}, nl = {65, 69, 70, 66}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes5.dex */
final class PushTokenLocalDataSourceImpl$getTokenSnapshot$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    int getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.getTokenSnapshot(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushTokenLocalDataSourceImpl$getTokenSnapshot$1(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl pushTokenLocalDataSourceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl$getTokenSnapshot$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = pushTokenLocalDataSourceImpl;
    }
}
