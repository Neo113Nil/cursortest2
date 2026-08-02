package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b0\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0096@¢\u0006\u0004\b\u0011\u0010\u0010J&\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00140\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/repository/PushTokenRepositoryImpl;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/repository/PushNotificationTokenRepository;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/datasource/PushTokenLocalDataSource;", "pushTokenLocalDataSource", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/service/PushTokenDataService;", "pushTokenDataService", "<init>", "(Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/datasource/PushTokenLocalDataSource;Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/service/PushTokenDataService;)V", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/model/TokenSubscriptionBackendSnapshot;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/error/PushNotificationTokenError;", "", "saveTokenSubscriptionBackendSnapshot", "(Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/model/TokenSubscriptionBackendSnapshot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTokenSubscriptionBackendSnapshot", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearBackendStateSnapshot", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/model/TokenSubscribeRequest;", "tokenSubscribeRequest", "", "subscribeToBackend", "(Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/model/TokenSubscribeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceId", "pushToken", "unsubscribeFromBackend", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/datasource/PushTokenLocalDataSource;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/service/PushTokenDataService;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PushTokenRepositoryImpl implements com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataService getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSource getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PushTokenRepositoryImpl(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSource pushTokenLocalDataSource, com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataService pushTokenDataService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushTokenLocalDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushTokenDataService, "");
        this.getHighSpeedVideoFpsRanges = pushTokenLocalDataSource;
        this.getHighSpeedVideoFpsRangesFor = pushTokenDataService;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0088 A[Catch: all -> 0x0042, RaiseCancellationException -> 0x0045, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0045, all -> 0x0042, blocks: (B:11:0x003e, B:12:0x0082, B:15:0x0088, B:16:0x00ad, B:21:0x00a0, B:22:0x00bd, B:23:0x00c2), top: B:10:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object saveTokenSubscriptionBackendSnapshot(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1 pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.Either either;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1) {
            pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1) continuation;
            if ((pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSource pushTokenLocalDataSource = this.getHighSpeedVideoFpsRanges;
                        pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenSubscriptionBackendSnapshot);
                        pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getInputFormats = defaultRaise;
                        pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getOutputFormats = defaultRaise3;
                        pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getHighSpeedVideoSizes = 0;
                        pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getHighSpeedVideoFpsRangesFor = 0;
                        pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getHighSpeedVideoFpsRanges = 0;
                        pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getOutputMinFrameDuration = 1;
                        java.lang.Object saveTokenSnapshot = pushTokenLocalDataSource.saveTokenSnapshot(tokenSubscriptionBackendSnapshot, pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1);
                        if (saveTokenSnapshot == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = saveTokenSnapshot;
                        raise = defaultRaise3;
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
                    int i2 = pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getHighSpeedVideoFpsRanges;
                    int i4 = pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getHighSpeedVideoFpsRangesFor;
                    int i5 = pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getHighSpeedVideoSizes;
                    raise = (arrow.core.raise.Raise) pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getOutputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getInputFormats;
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
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.PushTokenErrorMapperKt.toPushTokenError((com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                raise.bind(right);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                defaultRaise2.complete();
                return new arrow.core.Either.Right(unit);
            }
        }
        pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1(this, continuation);
        java.lang.Object obj2 = pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        raise.bind(right);
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        defaultRaise2.complete();
        return new arrow.core.Either.Right(unit2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f A[Catch: all -> 0x003e, RaiseCancellationException -> 0x0041, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0041, all -> 0x003e, blocks: (B:11:0x003a, B:12:0x0079, B:15:0x007f, B:16:0x00a4, B:21:0x0097, B:22:0x00b5, B:23:0x00ba), top: B:10:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTokenSubscriptionBackendSnapshot(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot>> continuation) {
        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1 pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.Either either;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1) {
            pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1) continuation;
            if ((pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSource pushTokenLocalDataSource = this.getHighSpeedVideoFpsRanges;
                        pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.Camera2StreamConfigurationMap = defaultRaise;
                        pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getOutputMinFrameDuration = defaultRaise3;
                        pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getHighSpeedVideoFpsRangesFor = 0;
                        pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getHighSpeedVideoSizes = 0;
                        pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getHighSpeedVideoFpsRanges = 0;
                        pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getInputSizeshNQ4ISI = 1;
                        java.lang.Object tokenSnapshot = pushTokenLocalDataSource.getTokenSnapshot(pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1);
                        if (tokenSnapshot == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise3;
                        defaultRaise2 = defaultRaise;
                        obj = tokenSnapshot;
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
                    int i2 = pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getHighSpeedVideoFpsRanges;
                    int i4 = pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getHighSpeedVideoSizes;
                    int i5 = pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getHighSpeedVideoFpsRangesFor;
                    raise = (arrow.core.raise.Raise) pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getOutputMinFrameDuration;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.Camera2StreamConfigurationMap;
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
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.PushTokenErrorMapperKt.toPushTokenError((com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot) raise.bind(right);
                defaultRaise2.complete();
                return new arrow.core.Either.Right(tokenSubscriptionBackendSnapshot);
            }
        }
        pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1(this, continuation);
        java.lang.Object obj2 = pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot2 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot) raise.bind(right);
        defaultRaise2.complete();
        return new arrow.core.Either.Right(tokenSubscriptionBackendSnapshot2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f A[Catch: all -> 0x003e, RaiseCancellationException -> 0x0041, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0041, all -> 0x003e, blocks: (B:11:0x003a, B:12:0x0079, B:15:0x007f, B:16:0x00a4, B:21:0x0097, B:22:0x00b4, B:23:0x00b9), top: B:10:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object clearBackendStateSnapshot(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$clearBackendStateSnapshot$1 pushTokenRepositoryImpl$clearBackendStateSnapshot$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.Either either;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$clearBackendStateSnapshot$1) {
            pushTokenRepositoryImpl$clearBackendStateSnapshot$1 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$clearBackendStateSnapshot$1) continuation;
            if ((pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getInputFormats -= 2147483648;
                java.lang.Object obj = pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSource pushTokenLocalDataSource = this.getHighSpeedVideoFpsRanges;
                        pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getHighSpeedVideoFpsRanges = defaultRaise;
                        pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getOutputFormats = defaultRaise3;
                        pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getHighSpeedVideoSizes = 0;
                        pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getHighSpeedVideoFpsRangesFor = 0;
                        pushTokenRepositoryImpl$clearBackendStateSnapshot$1.Camera2StreamConfigurationMap = 0;
                        pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getInputFormats = 1;
                        java.lang.Object clearToken = pushTokenLocalDataSource.clearToken(pushTokenRepositoryImpl$clearBackendStateSnapshot$1);
                        if (clearToken == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise3;
                        defaultRaise2 = defaultRaise;
                        obj = clearToken;
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
                    int i2 = pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = pushTokenRepositoryImpl$clearBackendStateSnapshot$1.Camera2StreamConfigurationMap;
                    int i4 = pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getHighSpeedVideoFpsRangesFor;
                    int i5 = pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getHighSpeedVideoSizes;
                    raise = (arrow.core.raise.Raise) pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getOutputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getHighSpeedVideoFpsRanges;
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
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.PushTokenErrorMapperKt.toPushTokenError((com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                raise.bind(right);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                defaultRaise2.complete();
                return new arrow.core.Either.Right(unit);
            }
        }
        pushTokenRepositoryImpl$clearBackendStateSnapshot$1 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$clearBackendStateSnapshot$1(this, continuation);
        java.lang.Object obj2 = pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushTokenRepositoryImpl$clearBackendStateSnapshot$1.getInputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        raise.bind(right);
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        defaultRaise2.complete();
        return new arrow.core.Either.Right(unit2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009b A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x0095, B:15:0x009b, B:16:0x00c0, B:18:0x00cc, B:20:0x00d4, B:22:0x00dc, B:25:0x00eb, B:26:0x00f5, B:29:0x00b3, B:30:0x00f6, B:31:0x00fb), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object subscribeToBackend(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscribeRequest tokenSubscribeRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$subscribeToBackend$1 pushTokenRepositoryImpl$subscribeToBackend$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.SubscribeResponse subscribeResponse;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$subscribeToBackend$1) {
            pushTokenRepositoryImpl$subscribeToBackend$1 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$subscribeToBackend$1) continuation;
            if ((pushTokenRepositoryImpl$subscribeToBackend$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                pushTokenRepositoryImpl$subscribeToBackend$1.getHighSpeedVideoSizesFor -= 2147483648;
                com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$subscribeToBackend$1 pushTokenRepositoryImpl$subscribeToBackend$12 = pushTokenRepositoryImpl$subscribeToBackend$1;
                java.lang.Object obj = pushTokenRepositoryImpl$subscribeToBackend$12.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushTokenRepositoryImpl$subscribeToBackend$12.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataService pushTokenDataService = this.getHighSpeedVideoFpsRangesFor;
                        java.lang.String token = tokenSubscribeRequest.getToken();
                        boolean consent = tokenSubscribeRequest.getConsent();
                        java.lang.String deviceId = tokenSubscribeRequest.getDeviceId();
                        java.lang.String cloudIdentity = tokenSubscribeRequest.getCloudIdentity();
                        pushTokenRepositoryImpl$subscribeToBackend$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenSubscribeRequest);
                        pushTokenRepositoryImpl$subscribeToBackend$12.getOutputMinFrameDuration = defaultRaise;
                        pushTokenRepositoryImpl$subscribeToBackend$12.getOutputFormats = defaultRaise3;
                        pushTokenRepositoryImpl$subscribeToBackend$12.getInputSizeshNQ4ISI = defaultRaise3;
                        pushTokenRepositoryImpl$subscribeToBackend$12.getHighSpeedVideoFpsRanges = 0;
                        pushTokenRepositoryImpl$subscribeToBackend$12.getHighSpeedVideoFpsRangesFor = 0;
                        pushTokenRepositoryImpl$subscribeToBackend$12.getHighSpeedVideoSizes = 0;
                        pushTokenRepositoryImpl$subscribeToBackend$12.Camera2StreamConfigurationMap = 0;
                        pushTokenRepositoryImpl$subscribeToBackend$12.getHighSpeedVideoSizesFor = 1;
                        java.lang.Object subscribePushToken = pushTokenDataService.subscribePushToken(token, consent, deviceId, cloudIdentity, pushTokenRepositoryImpl$subscribeToBackend$12);
                        if (subscribePushToken == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        raise = defaultRaise3;
                        obj = subscribePushToken;
                        raise2 = raise;
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
                    int i2 = pushTokenRepositoryImpl$subscribeToBackend$12.Camera2StreamConfigurationMap;
                    int i3 = pushTokenRepositoryImpl$subscribeToBackend$12.getHighSpeedVideoSizes;
                    int i4 = pushTokenRepositoryImpl$subscribeToBackend$12.getHighSpeedVideoFpsRangesFor;
                    int i5 = pushTokenRepositoryImpl$subscribeToBackend$12.getHighSpeedVideoFpsRanges;
                    raise2 = (arrow.core.raise.Raise) pushTokenRepositoryImpl$subscribeToBackend$12.getInputSizeshNQ4ISI;
                    raise = (arrow.core.raise.Raise) pushTokenRepositoryImpl$subscribeToBackend$12.getOutputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) pushTokenRepositoryImpl$subscribeToBackend$12.getOutputMinFrameDuration;
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
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.PushTokenErrorMapperKt.toPushTokenError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                subscribeResponse = (com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.SubscribeResponse) raise2.bind(right);
                if (subscribeResponse.getStatus() != null || subscribeResponse.getStatus() == com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus.INACTIVE || subscribeResponse.getStatus() == com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus.UNKNOWN__) {
                    raise.raise(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError.Business.SubscriptionFailed.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                java.lang.String cloudId = subscribeResponse.getCloudId();
                defaultRaise2.complete();
                return new arrow.core.Either.Right(cloudId);
            }
        }
        pushTokenRepositoryImpl$subscribeToBackend$1 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$subscribeToBackend$1(this, continuation);
        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$subscribeToBackend$1 pushTokenRepositoryImpl$subscribeToBackend$122 = pushTokenRepositoryImpl$subscribeToBackend$1;
        java.lang.Object obj2 = pushTokenRepositoryImpl$subscribeToBackend$122.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushTokenRepositoryImpl$subscribeToBackend$122.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        subscribeResponse = (com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.SubscribeResponse) raise2.bind(right);
        if (subscribeResponse.getStatus() != null) {
        }
        raise.raise(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError.Business.SubscriptionFailed.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008f A[Catch: all -> 0x0046, RaiseCancellationException -> 0x0049, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0049, all -> 0x0046, blocks: (B:11:0x0042, B:12:0x0089, B:15:0x008f, B:16:0x00b4, B:18:0x00c0, B:21:0x00cd, B:22:0x00d7, B:25:0x00a7, B:26:0x00d8, B:27:0x00dd), top: B:10:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c0 A[Catch: all -> 0x0046, RaiseCancellationException -> 0x0049, TryCatch #3 {RaiseCancellationException -> 0x0049, all -> 0x0046, blocks: (B:11:0x0042, B:12:0x0089, B:15:0x008f, B:16:0x00b4, B:18:0x00c0, B:21:0x00cd, B:22:0x00d7, B:25:0x00a7, B:26:0x00d8, B:27:0x00dd), top: B:10:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cd A[Catch: all -> 0x0046, RaiseCancellationException -> 0x0049, TryCatch #3 {RaiseCancellationException -> 0x0049, all -> 0x0046, blocks: (B:11:0x0042, B:12:0x0089, B:15:0x008f, B:16:0x00b4, B:18:0x00c0, B:21:0x00cd, B:22:0x00d7, B:25:0x00a7, B:26:0x00d8, B:27:0x00dd), top: B:10:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object unsubscribeFromBackend(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$unsubscribeFromBackend$1 pushTokenRepositoryImpl$unsubscribeFromBackend$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$unsubscribeFromBackend$1) {
            pushTokenRepositoryImpl$unsubscribeFromBackend$1 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$unsubscribeFromBackend$1) continuation;
            if ((pushTokenRepositoryImpl$unsubscribeFromBackend$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                pushTokenRepositoryImpl$unsubscribeFromBackend$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = pushTokenRepositoryImpl$unsubscribeFromBackend$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushTokenRepositoryImpl$unsubscribeFromBackend$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataService pushTokenDataService = this.getHighSpeedVideoFpsRangesFor;
                        pushTokenRepositoryImpl$unsubscribeFromBackend$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        pushTokenRepositoryImpl$unsubscribeFromBackend$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        pushTokenRepositoryImpl$unsubscribeFromBackend$1.getHighSpeedVideoSizesFor = defaultRaise;
                        pushTokenRepositoryImpl$unsubscribeFromBackend$1.getInputFormats = defaultRaise3;
                        pushTokenRepositoryImpl$unsubscribeFromBackend$1.getInputSizeshNQ4ISI = defaultRaise3;
                        pushTokenRepositoryImpl$unsubscribeFromBackend$1.getHighSpeedVideoSizes = 0;
                        pushTokenRepositoryImpl$unsubscribeFromBackend$1.Camera2StreamConfigurationMap = 0;
                        pushTokenRepositoryImpl$unsubscribeFromBackend$1.getHighSpeedVideoFpsRanges = 0;
                        pushTokenRepositoryImpl$unsubscribeFromBackend$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        pushTokenRepositoryImpl$unsubscribeFromBackend$1.getOutputMinFrameDuration = 1;
                        java.lang.Object unSubscribePushToken = pushTokenDataService.unSubscribePushToken(str, str2, pushTokenRepositoryImpl$unsubscribeFromBackend$1);
                        if (unSubscribePushToken == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        raise = defaultRaise3;
                        obj = unSubscribePushToken;
                        raise2 = raise;
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
                    int i2 = pushTokenRepositoryImpl$unsubscribeFromBackend$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = pushTokenRepositoryImpl$unsubscribeFromBackend$1.getHighSpeedVideoFpsRanges;
                    int i4 = pushTokenRepositoryImpl$unsubscribeFromBackend$1.Camera2StreamConfigurationMap;
                    int i5 = pushTokenRepositoryImpl$unsubscribeFromBackend$1.getHighSpeedVideoSizes;
                    raise2 = (arrow.core.raise.Raise) pushTokenRepositoryImpl$unsubscribeFromBackend$1.getInputSizeshNQ4ISI;
                    raise = (arrow.core.raise.Raise) pushTokenRepositoryImpl$unsubscribeFromBackend$1.getInputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) pushTokenRepositoryImpl$unsubscribeFromBackend$1.getHighSpeedVideoSizesFor;
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
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.PushTokenErrorMapperKt.toPushTokenError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (((com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.UnsubscribeResponse) raise2.bind(right)).getSuccess()) {
                    raise.raise(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError.Business.UnSubscribeFailed.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                defaultRaise2.complete();
                return new arrow.core.Either.Right(unit);
            }
        }
        pushTokenRepositoryImpl$unsubscribeFromBackend$1 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$unsubscribeFromBackend$1(this, continuation);
        java.lang.Object obj2 = pushTokenRepositoryImpl$unsubscribeFromBackend$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushTokenRepositoryImpl$unsubscribeFromBackend$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (((com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.UnsubscribeResponse) raise2.bind(right)).getSuccess()) {
        }
    }
}
