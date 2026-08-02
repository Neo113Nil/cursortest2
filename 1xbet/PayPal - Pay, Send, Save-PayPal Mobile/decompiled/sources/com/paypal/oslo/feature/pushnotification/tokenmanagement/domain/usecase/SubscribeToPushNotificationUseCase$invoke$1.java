package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SubscribeToPushNotificationUseCase", f = "SubscribeToPushNotificationUseCase.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, l = {128, 129, 134, 135, 144}, m = "invoke", n = {"raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-SubscribeToPushNotificationUseCase$invoke$2", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "newToken", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-SubscribeToPushNotificationUseCase$invoke$2", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "newToken", "deviceId", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-SubscribeToPushNotificationUseCase$invoke$2", "pushConsent", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "newToken", "deviceId", "cloudIdentity", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-SubscribeToPushNotificationUseCase$invoke$2", "pushConsent", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "newToken", "deviceId", "cloudIdentity", "newSubscriptionSnapshot", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-SubscribeToPushNotificationUseCase$invoke$2", "pushConsent"}, nl = {129, 130, 135, 137, 145}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "Z$0"}, v = 2)
/* loaded from: classes13.dex */
final class SubscribeToPushNotificationUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SubscribeToPushNotificationUseCase getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    boolean getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribeToPushNotificationUseCase$invoke$1(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SubscribeToPushNotificationUseCase subscribeToPushNotificationUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SubscribeToPushNotificationUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = subscribeToPushNotificationUseCase;
    }
}
