package com.paypal.oslo.core.pushnotification.data.fcm;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/data/fcm/FcmTokenProviderImpl;", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationTokenProvider;", "<init>", "()V", "Larrow/core/Either;", "Lcom/paypal/oslo/core/pushnotification/domain/error/PushNotificationTokenError;", "", "getToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FcmTokenProviderImpl implements com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider {
    @javax.inject.Inject
    public FcmTokenProviderImpl() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [arrow.core.raise.Raise] */
    @Override // com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getToken(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.pushnotification.domain.error.PushNotificationTokenError, java.lang.String>> continuation) {
        com.paypal.oslo.core.pushnotification.data.fcm.FcmTokenProviderImpl$getToken$1 fcmTokenProviderImpl$getToken$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.lang.Exception e;
        ?? r1;
        arrow.core.raise.DefaultRaise defaultRaise3;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.core.pushnotification.data.fcm.FcmTokenProviderImpl$getToken$1) {
            fcmTokenProviderImpl$getToken$1 = (com.paypal.oslo.core.pushnotification.data.fcm.FcmTokenProviderImpl$getToken$1) continuation;
            if ((fcmTokenProviderImpl$getToken$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                fcmTokenProviderImpl$getToken$1.getInputFormats -= 2147483648;
                java.lang.Object obj = fcmTokenProviderImpl$getToken$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fcmTokenProviderImpl$getToken$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        defaultRaise2 = defaultRaise;
                        try {
                            com.google.android.gms.tasks.Task<java.lang.String> token = com.google.firebase.messaging.FirebaseMessaging.getInstance().getToken();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(token, "");
                            fcmTokenProviderImpl$getToken$1.Camera2StreamConfigurationMap = defaultRaise;
                            fcmTokenProviderImpl$getToken$1.getHighSpeedVideoSizesFor = defaultRaise2;
                            fcmTokenProviderImpl$getToken$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            fcmTokenProviderImpl$getToken$1.getHighSpeedVideoFpsRanges = 0;
                            fcmTokenProviderImpl$getToken$1.getHighSpeedVideoSizes = 0;
                            fcmTokenProviderImpl$getToken$1.getHighSpeedVideoFpsRangesFor = 0;
                            fcmTokenProviderImpl$getToken$1.getInputFormats = 1;
                            java.lang.Object await = kotlinx.coroutines.tasks.TasksKt.await(token, fcmTokenProviderImpl$getToken$1);
                            if (await == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r1 = defaultRaise2;
                            defaultRaise3 = defaultRaise;
                            obj = await;
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            com.paypal.oslo.core.pushnotification.LoggerKt.log.e("Failed to retrieve FCM token from Firebase SDK", e);
                            defaultRaise2.raise(new com.paypal.oslo.core.pushnotification.domain.error.PushNotificationTokenError.SdkError(e));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } catch (arrow.core.raise.RaiseCancellationException e3) {
                        e = e3;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = fcmTokenProviderImpl$getToken$1.getHighSpeedVideoFpsRangesFor;
                    int i3 = fcmTokenProviderImpl$getToken$1.getHighSpeedVideoSizes;
                    int i4 = fcmTokenProviderImpl$getToken$1.getHighSpeedVideoFpsRanges;
                    int i5 = fcmTokenProviderImpl$getToken$1.getHighResolutionOutputSizeshNQ4ISI;
                    r1 = (arrow.core.raise.Raise) fcmTokenProviderImpl$getToken$1.getHighSpeedVideoSizesFor;
                    defaultRaise3 = (arrow.core.raise.DefaultRaise) fcmTokenProviderImpl$getToken$1.Camera2StreamConfigurationMap;
                    try {
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            r1 = r1;
                        } catch (java.lang.Exception e4) {
                            e = e4;
                            defaultRaise2 = r1;
                            com.paypal.oslo.core.pushnotification.LoggerKt.log.e("Failed to retrieve FCM token from Firebase SDK", e);
                            defaultRaise2.raise(new com.paypal.oslo.core.pushnotification.domain.error.PushNotificationTokenError.SdkError(e));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } catch (arrow.core.raise.RaiseCancellationException e5) {
                        e = e5;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                java.lang.String str2 = (java.lang.String) obj;
                str = str2;
                if (str != null || kotlin.text.StringsKt.isBlank(str)) {
                    r1.raise(new com.paypal.oslo.core.pushnotification.domain.error.PushNotificationTokenError.SdkError(new java.lang.IllegalStateException("FCM token is null or blank")));
                    throw new kotlin.KotlinNothingValueException();
                }
                defaultRaise3.complete();
                return new arrow.core.Either.Right(str2);
            }
        }
        fcmTokenProviderImpl$getToken$1 = new com.paypal.oslo.core.pushnotification.data.fcm.FcmTokenProviderImpl$getToken$1(this, continuation);
        java.lang.Object obj2 = fcmTokenProviderImpl$getToken$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fcmTokenProviderImpl$getToken$1.getInputFormats;
        if (i != 0) {
        }
        java.lang.String str22 = (java.lang.String) obj2;
        str = str22;
        if (str != null) {
        }
        r1.raise(new com.paypal.oslo.core.pushnotification.domain.error.PushNotificationTokenError.SdkError(new java.lang.IllegalStateException("FCM token is null or blank")));
        throw new kotlin.KotlinNothingValueException();
    }
}
