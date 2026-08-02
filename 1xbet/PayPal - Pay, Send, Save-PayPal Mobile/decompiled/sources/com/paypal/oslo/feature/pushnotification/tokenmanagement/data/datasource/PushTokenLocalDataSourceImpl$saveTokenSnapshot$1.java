package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl", f = "PushTokenLocalDataSourceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4}, l = {48, 49, 50, 52, 54}, m = "saveTokenSnapshot", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "raise$iv$iv$iv", "$this$saveTokenSnapshot_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenLocalDataSourceImpl$saveTokenSnapshot$2", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "raise$iv$iv$iv", "$this$saveTokenSnapshot_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenLocalDataSourceImpl$saveTokenSnapshot$2", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "raise$iv$iv$iv", "$this$saveTokenSnapshot_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenLocalDataSourceImpl$saveTokenSnapshot$2", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "raise$iv$iv$iv", "$this$saveTokenSnapshot_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenLocalDataSourceImpl$saveTokenSnapshot$2", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "raise$iv$iv$iv", "$this$saveTokenSnapshot_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenLocalDataSourceImpl$saveTokenSnapshot$2"}, nl = {49, 50, 51, 54, 56}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class PushTokenLocalDataSourceImpl$saveTokenSnapshot$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.saveTokenSnapshot(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushTokenLocalDataSourceImpl$saveTokenSnapshot$1(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl pushTokenLocalDataSourceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl$saveTokenSnapshot$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = pushTokenLocalDataSourceImpl;
    }
}
