package com.paypal.android.taptopay.data.thales.fcm;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler", f = "PushNotificationTokenHandler.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {114, 119}, m = "updateToken", n = {"this", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "ret", "retries", "this", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "ret", "retries"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes4.dex */
final class PushNotificationTokenHandler$updateToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.updateToken(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushNotificationTokenHandler$updateToken$1(com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler pushNotificationTokenHandler, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler$updateToken$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = pushNotificationTokenHandler;
    }
}
