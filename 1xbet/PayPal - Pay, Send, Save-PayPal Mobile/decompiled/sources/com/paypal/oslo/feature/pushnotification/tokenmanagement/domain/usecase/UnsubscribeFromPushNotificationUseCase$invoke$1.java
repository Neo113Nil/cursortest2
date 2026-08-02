package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UnsubscribeFromPushNotificationUseCase", f = "UnsubscribeFromPushNotificationUseCase.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3}, l = {95, 99, 100, 104}, m = "invoke", n = {"raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-UnsubscribeFromPushNotificationUseCase$invoke$2", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "deviceId", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-UnsubscribeFromPushNotificationUseCase$invoke$2", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "deviceId", "pushToken", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-UnsubscribeFromPushNotificationUseCase$invoke$2", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "deviceId", "pushToken", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-UnsubscribeFromPushNotificationUseCase$invoke$2"}, nl = {96, 100, 103, 105}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$4", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class UnsubscribeFromPushNotificationUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UnsubscribeFromPushNotificationUseCase getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnsubscribeFromPushNotificationUseCase$invoke$1(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UnsubscribeFromPushNotificationUseCase unsubscribeFromPushNotificationUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UnsubscribeFromPushNotificationUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = unsubscribeFromPushNotificationUseCase;
    }
}
