package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase", f = "SyncPushNotificationTokenUseCase.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, l = {143, 144, 146, 150, 160, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m = "invoke", n = {"raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-SyncPushNotificationTokenUseCase$invoke$2", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "subscriptionBackendSnapshot", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-SyncPushNotificationTokenUseCase$invoke$2", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "subscriptionBackendSnapshot", "validToken", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-SyncPushNotificationTokenUseCase$invoke$2", "pushConsent", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "subscriptionBackendSnapshot", "validToken", "deviceId", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-SyncPushNotificationTokenUseCase$invoke$2", "pushConsent", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "subscriptionBackendSnapshot", "validToken", "deviceId", "cloudIdentity", "currentSnapshot", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-SyncPushNotificationTokenUseCase$invoke$2", "pushConsent", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "subscriptionBackendSnapshot", "validToken", "deviceId", "cloudIdentity", "currentSnapshot", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-SyncPushNotificationTokenUseCase$invoke$2", "pushConsent"}, nl = {144, 145, 147, 151, 167, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$3", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3", "Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class SyncPushNotificationTokenUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    boolean getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.unwrapAs.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SyncPushNotificationTokenUseCase$invoke$1(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase syncPushNotificationTokenUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase$invoke$1> continuation) {
        super(continuation);
        this.unwrapAs = syncPushNotificationTokenUseCase;
    }
}
