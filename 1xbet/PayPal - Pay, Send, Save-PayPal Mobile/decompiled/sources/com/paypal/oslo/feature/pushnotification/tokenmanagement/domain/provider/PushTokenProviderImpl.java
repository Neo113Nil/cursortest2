package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushTokenProviderImpl;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushTokenProvider;", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationTokenProvider;", "pushTokenProvider", "<init>", "(Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationTokenProvider;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/error/PushNotificationTokenError;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/model/PushNotificationToken;", "getToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationTokenProvider;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PushTokenProviderImpl implements com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PushTokenProviderImpl(com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider pushNotificationTokenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationTokenProvider, "");
        this.Camera2StreamConfigurationMap = pushNotificationTokenProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f A[Catch: all -> 0x003e, RaiseCancellationException -> 0x0041, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0041, all -> 0x003e, blocks: (B:11:0x003a, B:12:0x0079, B:15:0x007f, B:16:0x00a4, B:21:0x0097, B:22:0x00ba, B:23:0x00bf), top: B:10:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getToken(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken>> continuation) {
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProviderImpl$getToken$1 pushTokenProviderImpl$getToken$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.Either either;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProviderImpl$getToken$1) {
            pushTokenProviderImpl$getToken$1 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProviderImpl$getToken$1) continuation;
            if ((pushTokenProviderImpl$getToken$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                pushTokenProviderImpl$getToken$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = pushTokenProviderImpl$getToken$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushTokenProviderImpl$getToken$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider pushNotificationTokenProvider = this.Camera2StreamConfigurationMap;
                        pushTokenProviderImpl$getToken$1.getHighSpeedVideoFpsRangesFor = defaultRaise;
                        pushTokenProviderImpl$getToken$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        pushTokenProviderImpl$getToken$1.getHighSpeedVideoSizesFor = defaultRaise3;
                        pushTokenProviderImpl$getToken$1.Camera2StreamConfigurationMap = 0;
                        pushTokenProviderImpl$getToken$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        pushTokenProviderImpl$getToken$1.getHighSpeedVideoSizes = 0;
                        pushTokenProviderImpl$getToken$1.getHighSpeedVideoFpsRanges = 0;
                        pushTokenProviderImpl$getToken$1.getOutputFormats = 1;
                        java.lang.Object token = pushNotificationTokenProvider.getToken(pushTokenProviderImpl$getToken$1);
                        if (token == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise3;
                        defaultRaise2 = defaultRaise;
                        obj = token;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
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
                    int i2 = pushTokenProviderImpl$getToken$1.getHighSpeedVideoFpsRanges;
                    int i3 = pushTokenProviderImpl$getToken$1.getHighSpeedVideoSizes;
                    int i4 = pushTokenProviderImpl$getToken$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = pushTokenProviderImpl$getToken$1.Camera2StreamConfigurationMap;
                    raise = (arrow.core.raise.Raise) pushTokenProviderImpl$getToken$1.getHighSpeedVideoSizesFor;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) pushTokenProviderImpl$getToken$1.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushTokenErrorMapperKt.toPushTokenDomainError((com.paypal.oslo.core.pushnotification.domain.error.PushNotificationTokenError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken pushNotificationToken = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken((java.lang.String) raise.bind(right));
                defaultRaise2.complete();
                return new arrow.core.Either.Right(pushNotificationToken);
            }
        }
        pushTokenProviderImpl$getToken$1 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProviderImpl$getToken$1(this, continuation);
        java.lang.Object obj2 = pushTokenProviderImpl$getToken$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushTokenProviderImpl$getToken$1.getOutputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken pushNotificationToken2 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken((java.lang.String) raise.bind(right));
        defaultRaise2.complete();
        return new arrow.core.Either.Right(pushNotificationToken2);
    }
}
