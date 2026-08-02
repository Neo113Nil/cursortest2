package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00060\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/datasource/PushTokenLocalDataSourceImpl;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/datasource/PushTokenLocalDataSource;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;)V", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/model/TokenSubscriptionBackendSnapshot;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/error/StorageError;", "", "saveTokenSnapshot", "(Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/model/TokenSubscriptionBackendSnapshot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTokenSnapshot", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearToken", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PushTokenLocalDataSourceImpl implements com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSource {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoSizes;
    private static final com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl.Companion Companion = new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl.Companion(null);
    public static final int $stable = 8;
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted Camera2StreamConfigurationMap = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted("fcm_token_value");
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted("fcm_is_subscribed");
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted("device_id_value");
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted getHighSpeedVideoSizes = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted("cloud_identity_value");

    @javax.inject.Inject
    public PushTokenLocalDataSourceImpl(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        this.getHighSpeedVideoSizes = appStorage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x019a, code lost:
    
        if (r5.remove(r6, r2) == r3) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0156 A[Catch: IOException -> 0x01aa, all -> 0x01c2, RaiseCancellationException -> 0x01cc, TryCatch #8 {IOException -> 0x01aa, blocks: (B:31:0x0150, B:33:0x0156, B:37:0x017b), top: B:30:0x0150 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017b A[Catch: IOException -> 0x01aa, all -> 0x01c2, RaiseCancellationException -> 0x01cc, TRY_LEAVE, TryCatch #8 {IOException -> 0x01aa, blocks: (B:31:0x0150, B:33:0x0156, B:37:0x017b), top: B:30:0x0150 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object saveTokenSnapshot(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl$saveTokenSnapshot$1 pushTokenLocalDataSourceImpl$saveTokenSnapshot$1;
        java.lang.Object coroutine_suspended;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise3;
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot2;
        int i2;
        int i3;
        int i4;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted;
        boolean consent;
        int i5;
        int i6;
        int i7;
        arrow.core.raise.Raise raise2;
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot3;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted2;
        java.lang.String deviceId;
        int i8;
        int i9;
        int i10;
        arrow.core.raise.Raise raise3;
        try {
            if (continuation instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl$saveTokenSnapshot$1) {
                pushTokenLocalDataSourceImpl$saveTokenSnapshot$1 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl$saveTokenSnapshot$1) continuation;
                if ((pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                    pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getInputFormats -= 2147483648;
                    java.lang.Object obj = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getOutputMinFrameDuration;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getInputFormats;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        i = 0;
                        defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
                        defaultRaise3 = defaultRaise2;
                        try {
                            com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage3 = this.getHighSpeedVideoSizes;
                            com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted3 = Camera2StreamConfigurationMap;
                            java.lang.String token = tokenSubscriptionBackendSnapshot.getToken();
                            tokenSubscriptionBackendSnapshot2 = tokenSubscriptionBackendSnapshot;
                            pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.Camera2StreamConfigurationMap = tokenSubscriptionBackendSnapshot2;
                            pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizesFor = defaultRaise2;
                            pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getOutputFormats = defaultRaise3;
                            pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRanges = 0;
                            pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRangesFor = 0;
                            pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizes = 0;
                            pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getInputFormats = 1;
                            if (appStorage3.setString(encrypted3, token, pushTokenLocalDataSourceImpl$saveTokenSnapshot$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i2 = 0;
                            i3 = 0;
                            i4 = 0;
                        } catch (java.io.IOException e) {
                            e = e;
                            raise = defaultRaise3;
                        }
                    } else if (r4 == 1) {
                        int i11 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizes;
                        i2 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRangesFor;
                        i3 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI;
                        i4 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRanges;
                        defaultRaise3 = (arrow.core.raise.Raise) pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getOutputFormats;
                        arrow.core.raise.DefaultRaise defaultRaise4 = (arrow.core.raise.DefaultRaise) pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizesFor;
                        tokenSubscriptionBackendSnapshot2 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot) pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.Camera2StreamConfigurationMap;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            i = i11;
                            defaultRaise2 = defaultRaise4;
                        } catch (arrow.core.raise.RaiseCancellationException e2) {
                            e = e2;
                            defaultRaise = defaultRaise4;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.io.IOException e3) {
                            e = e3;
                            raise = defaultRaise3;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise = defaultRaise4;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    } else if (r4 == 2) {
                        int i12 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizes;
                        i5 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRangesFor;
                        i6 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI;
                        i7 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRanges;
                        raise2 = (arrow.core.raise.Raise) pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getOutputFormats;
                        arrow.core.raise.DefaultRaise defaultRaise5 = (arrow.core.raise.DefaultRaise) pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizesFor;
                        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot4 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot) pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.Camera2StreamConfigurationMap;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            i = i12;
                            defaultRaise2 = defaultRaise5;
                            tokenSubscriptionBackendSnapshot3 = tokenSubscriptionBackendSnapshot4;
                            try {
                                appStorage2 = this.getHighSpeedVideoSizes;
                                encrypted2 = getHighSpeedVideoFpsRanges;
                                deviceId = tokenSubscriptionBackendSnapshot3.getDeviceId();
                                pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.Camera2StreamConfigurationMap = tokenSubscriptionBackendSnapshot3;
                                pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizesFor = defaultRaise2;
                                pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getOutputFormats = raise2;
                                pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRanges = i7;
                                pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI = i6;
                                pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRangesFor = i5;
                                pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizes = i;
                                pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getInputFormats = 3;
                                if (appStorage2.setString(encrypted2, deviceId, pushTokenLocalDataSourceImpl$saveTokenSnapshot$1) != coroutine_suspended) {
                                    i8 = i5;
                                    i9 = i6;
                                    i10 = i7;
                                    raise3 = raise2;
                                    if (tokenSubscriptionBackendSnapshot3.getCloudIdentity() == null) {
                                    }
                                }
                                return coroutine_suspended;
                            } catch (java.io.IOException e4) {
                                e = e4;
                                raise = raise2;
                            }
                        } catch (arrow.core.raise.RaiseCancellationException e5) {
                            e = e5;
                            defaultRaise = defaultRaise5;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.io.IOException e6) {
                            e = e6;
                            raise = raise2;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            defaultRaise = defaultRaise5;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    } else {
                        if (r4 == 3) {
                            int i13 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizes;
                            i8 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRangesFor;
                            i9 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI;
                            i10 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRanges;
                            raise3 = (arrow.core.raise.Raise) pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getOutputFormats;
                            defaultRaise = (arrow.core.raise.DefaultRaise) pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizesFor;
                            tokenSubscriptionBackendSnapshot3 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot) pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.Camera2StreamConfigurationMap;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                i = i13;
                                defaultRaise2 = defaultRaise;
                                try {
                                    if (tokenSubscriptionBackendSnapshot3.getCloudIdentity() == null) {
                                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage4 = this.getHighSpeedVideoSizes;
                                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted4 = getHighSpeedVideoSizes;
                                        java.lang.String cloudIdentity = tokenSubscriptionBackendSnapshot3.getCloudIdentity();
                                        pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenSubscriptionBackendSnapshot3);
                                        pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizesFor = defaultRaise2;
                                        pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getOutputFormats = raise3;
                                        pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRanges = i10;
                                        pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI = i9;
                                        pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRangesFor = i8;
                                        pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizes = i;
                                        pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getInputFormats = 4;
                                        if (appStorage4.setString(encrypted4, cloudIdentity, pushTokenLocalDataSourceImpl$saveTokenSnapshot$1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                        defaultRaise2.complete();
                                        return new arrow.core.Either.Right(unit);
                                    }
                                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage5 = this.getHighSpeedVideoSizes;
                                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted5 = getHighSpeedVideoSizes;
                                    pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenSubscriptionBackendSnapshot3);
                                    pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizesFor = defaultRaise2;
                                    pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getOutputFormats = raise3;
                                    pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRanges = i10;
                                    pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI = i9;
                                    pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRangesFor = i8;
                                    pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizes = i;
                                    pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getInputFormats = 5;
                                } catch (java.io.IOException e7) {
                                    e = e7;
                                    raise = raise3;
                                }
                            } catch (arrow.core.raise.RaiseCancellationException e8) {
                                e = e8;
                                defaultRaise.complete();
                                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                            } catch (java.io.IOException e9) {
                                e = e9;
                                raise = raise3;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                defaultRaise.complete();
                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                            }
                        } else {
                            if (r4 != 4 && r4 != 5) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i14 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizes;
                            int i15 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRangesFor;
                            int i16 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI;
                            int i17 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRanges;
                            raise = (arrow.core.raise.Raise) pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getOutputFormats;
                            defaultRaise2 = (arrow.core.raise.DefaultRaise) pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizesFor;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                defaultRaise2.complete();
                                return new arrow.core.Either.Right(unit2);
                            } catch (java.io.IOException e10) {
                                e = e10;
                            }
                        }
                        raise.raise(new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.WriteError(e));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    appStorage = this.getHighSpeedVideoSizes;
                    encrypted = getHighSpeedVideoFpsRangesFor;
                    consent = tokenSubscriptionBackendSnapshot2.getConsent();
                    pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.Camera2StreamConfigurationMap = tokenSubscriptionBackendSnapshot2;
                    pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizesFor = defaultRaise2;
                    pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getOutputFormats = defaultRaise3;
                    pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRanges = i4;
                    pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                    pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRangesFor = i2;
                    pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizes = i;
                    pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getInputFormats = 2;
                    if (appStorage.setBoolean(encrypted, consent, pushTokenLocalDataSourceImpl$saveTokenSnapshot$1) != coroutine_suspended) {
                        i5 = i2;
                        i6 = i3;
                        i7 = i4;
                        raise2 = defaultRaise3;
                        tokenSubscriptionBackendSnapshot3 = tokenSubscriptionBackendSnapshot2;
                        appStorage2 = this.getHighSpeedVideoSizes;
                        encrypted2 = getHighSpeedVideoFpsRanges;
                        deviceId = tokenSubscriptionBackendSnapshot3.getDeviceId();
                        pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.Camera2StreamConfigurationMap = tokenSubscriptionBackendSnapshot3;
                        pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizesFor = defaultRaise2;
                        pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getOutputFormats = raise2;
                        pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRanges = i7;
                        pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI = i6;
                        pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRangesFor = i5;
                        pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizes = i;
                        pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getInputFormats = 3;
                        if (appStorage2.setString(encrypted2, deviceId, pushTokenLocalDataSourceImpl$saveTokenSnapshot$1) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            if (r4 != 0) {
            }
            appStorage = this.getHighSpeedVideoSizes;
            encrypted = getHighSpeedVideoFpsRangesFor;
            consent = tokenSubscriptionBackendSnapshot2.getConsent();
            pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.Camera2StreamConfigurationMap = tokenSubscriptionBackendSnapshot2;
            pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizesFor = defaultRaise2;
            pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getOutputFormats = defaultRaise3;
            pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRanges = i4;
            pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI = i3;
            pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoFpsRangesFor = i2;
            pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getHighSpeedVideoSizes = i;
            pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getInputFormats = 2;
            if (appStorage.setBoolean(encrypted, consent, pushTokenLocalDataSourceImpl$saveTokenSnapshot$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (arrow.core.raise.RaiseCancellationException e11) {
            e = e11;
            defaultRaise = r4;
        } catch (java.lang.Throwable th4) {
            th = th4;
            defaultRaise = r4;
        }
        pushTokenLocalDataSourceImpl$saveTokenSnapshot$1 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl$saveTokenSnapshot$1(this, continuation);
        java.lang.Object obj2 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getOutputMinFrameDuration;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = pushTokenLocalDataSourceImpl$saveTokenSnapshot$1.getInputFormats;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(4:(2:3|(7:5|6|7|(1:(1:(1:(1:(8:13|14|15|16|(1:18)(1:24)|19|20|21)(2:37|38))(9:39|40|41|42|43|(1:45)|46|(6:48|16|(0)(0)|19|20|21)|49))(13:53|54|55|56|57|58|(2:76|77)(1:60)|61|62|63|64|(5:66|43|(0)|46|(0))|49))(4:94|95|96|97))(6:117|118|119|120|(1:122)|49)|98|99|(3:101|(9:103|57|58|(0)(0)|61|62|63|64|(0))|49)(3:105|20|21)))|98|99|(0)(0))|132|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x024a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00f5, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00f2, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0098, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0095, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012c A[Catch: all -> 0x021e, RaiseCancellationException -> 0x0221, IOException -> 0x0224, TRY_LEAVE, TryCatch #13 {RaiseCancellationException -> 0x0221, IOException -> 0x0224, all -> 0x021e, blocks: (B:99:0x0128, B:101:0x012c), top: B:98:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v32, types: [arrow.core.raise.DefaultRaise] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [arrow.core.raise.DefaultRaise] */
    /* JADX WARN: Type inference failed for: r8v6, types: [arrow.core.raise.DefaultRaise] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTokenSnapshot(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot>> continuation) {
        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl$getTokenSnapshot$1 pushTokenLocalDataSourceImpl$getTokenSnapshot$1;
        int i;
        ?? r8;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        int i2;
        int i3;
        int i4;
        arrow.core.raise.DefaultRaise defaultRaise3;
        ?? r12;
        java.lang.String str;
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot;
        arrow.core.raise.DefaultRaise defaultRaise4;
        java.lang.String str2;
        arrow.core.raise.Raise raise;
        int i5;
        java.lang.String str3;
        java.lang.String str4;
        int i6;
        int i7;
        int i8;
        arrow.core.raise.DefaultRaise defaultRaise5;
        java.lang.Boolean bool;
        ?? r0;
        java.lang.Object string;
        int i9;
        java.lang.String str5;
        int i10;
        int i11;
        int i12;
        java.lang.String str6;
        java.lang.Object string2;
        int i13;
        arrow.core.raise.Raise raise2;
        java.lang.String str7;
        java.lang.String str8;
        try {
            if (continuation instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl$getTokenSnapshot$1) {
                pushTokenLocalDataSourceImpl$getTokenSnapshot$1 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl$getTokenSnapshot$1) continuation;
                if ((pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputStallDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizeshNQ4ISI;
                    r8 = 1;
                    r8 = 1;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        defaultRaise2 = defaultRaise;
                        try {
                            com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getHighSpeedVideoSizes;
                            com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted = Camera2StreamConfigurationMap;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputFormats = defaultRaise;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputMinFrameDuration = defaultRaise2;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoSizes = 0;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRanges = 0;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRangesFor = 0;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizeshNQ4ISI = 1;
                            obj = appStorage.getString(encrypted, pushTokenLocalDataSourceImpl$getTokenSnapshot$1);
                            if (obj != coroutine_suspended) {
                                i2 = 0;
                                i3 = 0;
                                i4 = 0;
                                defaultRaise3 = defaultRaise;
                                r12 = 0;
                            }
                            return coroutine_suspended;
                        } catch (java.io.IOException e) {
                            e = e;
                            defaultRaise2.raise(new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.ReadError(e));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                i13 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoSizesFor;
                                int i14 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.Camera2StreamConfigurationMap;
                                int i15 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRangesFor;
                                int i16 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI;
                                int i17 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRanges;
                                int i18 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoSizes;
                                str8 = (java.lang.String) pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputMinFrameDurationlomOqCM;
                                str7 = (java.lang.String) pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizes;
                                raise2 = (arrow.core.raise.Raise) pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputMinFrameDuration;
                                defaultRaise4 = (arrow.core.raise.DefaultRaise) pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputFormats;
                                try {
                                    try {
                                        kotlin.ResultKt.throwOnFailure(obj);
                                        tokenSubscriptionBackendSnapshot = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot(str7, i13 == 0, str8, (java.lang.String) obj);
                                        defaultRaise4.complete();
                                        return new arrow.core.Either.Right(tokenSubscriptionBackendSnapshot);
                                    } catch (java.io.IOException e2) {
                                        e = e2;
                                        defaultRaise2 = raise2;
                                        defaultRaise2.raise(new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.ReadError(e));
                                        throw new kotlin.KotlinNothingValueException();
                                    }
                                } catch (arrow.core.raise.RaiseCancellationException e3) {
                                    e = e3;
                                    r8 = defaultRaise4;
                                    r8.complete();
                                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r8));
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    r8 = defaultRaise4;
                                    r8.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                }
                            }
                            i10 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoSizesFor;
                            i11 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.Camera2StreamConfigurationMap;
                            i6 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRangesFor;
                            i3 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI;
                            int i19 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRanges;
                            int i20 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoSizes;
                            java.lang.String str9 = (java.lang.String) pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizes;
                            str5 = (java.lang.String) pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getInputSizeshNQ4ISI;
                            str2 = (java.lang.String) pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getInputFormats;
                            defaultRaise2 = (arrow.core.raise.Raise) pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputMinFrameDuration;
                            r8 = (arrow.core.raise.DefaultRaise) pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputFormats;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                i9 = i19;
                                str3 = str9;
                                r8 = r8;
                                i12 = i20;
                                str6 = (java.lang.String) obj;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.getHighSpeedVideoSizes;
                                com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted2 = getHighSpeedVideoSizes;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputFormats = r8;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputMinFrameDuration = defaultRaise2;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizes = str3;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputMinFrameDurationlomOqCM = str6;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoSizes = i12;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRanges = i9;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRangesFor = i6;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.Camera2StreamConfigurationMap = i11;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoSizesFor = i10;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizeshNQ4ISI = 4;
                                string2 = appStorage2.getString(encrypted2, pushTokenLocalDataSourceImpl$getTokenSnapshot$1);
                                if (string2 != coroutine_suspended) {
                                    i13 = i10;
                                    raise2 = defaultRaise2;
                                    defaultRaise4 = r8;
                                    str7 = str3;
                                    str8 = str6;
                                    obj = string2;
                                    tokenSubscriptionBackendSnapshot = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot(str7, i13 == 0, str8, (java.lang.String) obj);
                                    defaultRaise4.complete();
                                    return new arrow.core.Either.Right(tokenSubscriptionBackendSnapshot);
                                }
                                return coroutine_suspended;
                            } catch (java.io.IOException e4) {
                                e = e4;
                                defaultRaise2.raise(new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.ReadError(e));
                                throw new kotlin.KotlinNothingValueException();
                            }
                        }
                        i7 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.Camera2StreamConfigurationMap;
                        int i21 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRangesFor;
                        int i22 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i23 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRanges;
                        int i24 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoSizes;
                        str3 = (java.lang.String) pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizes;
                        java.lang.String str10 = (java.lang.String) pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getInputSizeshNQ4ISI;
                        java.lang.String str11 = (java.lang.String) pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getInputFormats;
                        raise = (arrow.core.raise.Raise) pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputMinFrameDuration;
                        arrow.core.raise.DefaultRaise defaultRaise6 = (arrow.core.raise.DefaultRaise) pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputFormats;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            i6 = i21;
                            i5 = i23;
                            r8 = defaultRaise6;
                            str2 = str11;
                            str4 = str10;
                            i8 = i24;
                            i3 = i22;
                            try {
                                bool = (java.lang.Boolean) obj;
                                if (bool == null) {
                                    try {
                                        r0 = bool.booleanValue();
                                    } catch (java.io.IOException e5) {
                                        e = e5;
                                        defaultRaise6 = r8;
                                        defaultRaise2 = raise;
                                        defaultRaise2.raise(new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.ReadError(e));
                                        throw new kotlin.KotlinNothingValueException();
                                    }
                                } else {
                                    r0 = 0;
                                }
                                com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage3 = this.getHighSpeedVideoSizes;
                                com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted3 = getHighSpeedVideoFpsRanges;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputFormats = r8;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputMinFrameDuration = raise;
                                defaultRaise5 = r8;
                            } catch (arrow.core.raise.RaiseCancellationException e6) {
                                e = e6;
                            } catch (java.io.IOException e7) {
                                e = e7;
                                defaultRaise5 = r8;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                            }
                        } catch (arrow.core.raise.RaiseCancellationException e8) {
                            e = e8;
                            r8 = defaultRaise6;
                            r8.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r8));
                        } catch (java.io.IOException e9) {
                            e = e9;
                            defaultRaise2 = raise;
                            defaultRaise2.raise(new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.ReadError(e));
                            throw new kotlin.KotlinNothingValueException();
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            r8 = defaultRaise6;
                            r8.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                        try {
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizes = str3;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoSizes = i8;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRanges = i5;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRangesFor = i6;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.Camera2StreamConfigurationMap = i7;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoSizesFor = r0;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizeshNQ4ISI = 3;
                            string = appStorage3.getString(encrypted3, pushTokenLocalDataSourceImpl$getTokenSnapshot$1);
                            if (string != coroutine_suspended) {
                                i9 = i5;
                                defaultRaise2 = raise;
                                r8 = defaultRaise5;
                                str5 = str4;
                                int i25 = i7;
                                i10 = r0;
                                obj = string;
                                i11 = i25;
                                i12 = i8;
                                str6 = (java.lang.String) obj;
                                if (str6 == null) {
                                }
                                com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage22 = this.getHighSpeedVideoSizes;
                                com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted22 = getHighSpeedVideoSizes;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputFormats = r8;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputMinFrameDuration = defaultRaise2;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizes = str3;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputMinFrameDurationlomOqCM = str6;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoSizes = i12;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRanges = i9;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRangesFor = i6;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.Camera2StreamConfigurationMap = i11;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoSizesFor = i10;
                                pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizeshNQ4ISI = 4;
                                string2 = appStorage22.getString(encrypted22, pushTokenLocalDataSourceImpl$getTokenSnapshot$1);
                                if (string2 != coroutine_suspended) {
                                }
                            }
                            return coroutine_suspended;
                        } catch (arrow.core.raise.RaiseCancellationException e10) {
                            e = e10;
                            r8 = defaultRaise5;
                            r8.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r8));
                        } catch (java.io.IOException e11) {
                            e = e11;
                            defaultRaise2 = raise;
                            defaultRaise6 = defaultRaise5;
                            defaultRaise2.raise(new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.ReadError(e));
                            throw new kotlin.KotlinNothingValueException();
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            r8 = defaultRaise5;
                            r8.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    i2 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRangesFor;
                    int i26 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i27 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRanges;
                    int i28 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoSizes;
                    arrow.core.raise.Raise raise3 = (arrow.core.raise.Raise) pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputMinFrameDuration;
                    defaultRaise = (arrow.core.raise.DefaultRaise) pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise3 = defaultRaise;
                        r12 = i28;
                        i3 = i26;
                        defaultRaise2 = raise3;
                        i4 = i27;
                    } catch (java.io.IOException e12) {
                        e = e12;
                        defaultRaise2 = raise3;
                        defaultRaise2.raise(new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.ReadError(e));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    str = (java.lang.String) obj;
                    if (str == null) {
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage4 = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted4 = getHighSpeedVideoFpsRangesFor;
                        pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputFormats = defaultRaise3;
                        pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputMinFrameDuration = defaultRaise2;
                        pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizes = str;
                        pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoSizes = r12;
                        pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRanges = i4;
                        pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                        pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRangesFor = i2;
                        pushTokenLocalDataSourceImpl$getTokenSnapshot$1.Camera2StreamConfigurationMap = 0;
                        pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizeshNQ4ISI = 2;
                        java.lang.Object obj2 = appStorage4.getBoolean(encrypted4, pushTokenLocalDataSourceImpl$getTokenSnapshot$1);
                        if (obj2 != coroutine_suspended) {
                            str2 = str;
                            raise = defaultRaise2;
                            i5 = i4;
                            r8 = defaultRaise3;
                            str3 = str2;
                            str4 = str3;
                            obj = obj2;
                            i6 = i2;
                            i7 = 0;
                            i8 = r12;
                            bool = (java.lang.Boolean) obj;
                            if (bool == null) {
                            }
                            com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage32 = this.getHighSpeedVideoSizes;
                            com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted32 = getHighSpeedVideoFpsRanges;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputFormats = r8;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputMinFrameDuration = raise;
                            defaultRaise5 = r8;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizes = str3;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoSizes = i8;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRanges = i5;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoFpsRangesFor = i6;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.Camera2StreamConfigurationMap = i7;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getHighSpeedVideoSizesFor = r0;
                            pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizeshNQ4ISI = 3;
                            string = appStorage32.getString(encrypted32, pushTokenLocalDataSourceImpl$getTokenSnapshot$1);
                            if (string != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    tokenSubscriptionBackendSnapshot = null;
                    defaultRaise4 = defaultRaise3;
                    defaultRaise4.complete();
                    return new arrow.core.Either.Right(tokenSubscriptionBackendSnapshot);
                }
            }
            str = (java.lang.String) obj;
            if (str == null) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e13) {
            e = e13;
            r8 = defaultRaise3;
            r8.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r8));
        } catch (java.io.IOException e14) {
            e = e14;
            defaultRaise2.raise(new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.ReadError(e));
            throw new kotlin.KotlinNothingValueException();
        } catch (java.lang.Throwable th5) {
            th = th5;
            r8 = defaultRaise3;
            r8.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        pushTokenLocalDataSourceImpl$getTokenSnapshot$1 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl$getTokenSnapshot$1(this, continuation);
        java.lang.Object obj3 = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushTokenLocalDataSourceImpl$getTokenSnapshot$1.getOutputSizeshNQ4ISI;
        r8 = 1;
        r8 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object clearToken(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl$clearToken$1 pushTokenLocalDataSourceImpl$clearToken$1;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        int i2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        int i3;
        int i4;
        int i5;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted;
        int i6;
        int i7;
        int i8;
        arrow.core.raise.Raise raise2;
        arrow.core.raise.DefaultRaise defaultRaise4;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted2;
        int i9;
        int i10;
        int i11;
        arrow.core.raise.Raise raise3;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage3;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted3;
        arrow.core.raise.DefaultRaise defaultRaise5;
        try {
            try {
                if (continuation instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl$clearToken$1) {
                    pushTokenLocalDataSourceImpl$clearToken$1 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl$clearToken$1) continuation;
                    if ((pushTokenLocalDataSourceImpl$clearToken$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                        pushTokenLocalDataSourceImpl$clearToken$1.getInputFormats -= 2147483648;
                        java.lang.Object obj = pushTokenLocalDataSourceImpl$clearToken$1.getInputSizeshNQ4ISI;
                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = pushTokenLocalDataSourceImpl$clearToken$1.getInputFormats;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            i2 = 0;
                            defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
                            defaultRaise3 = defaultRaise2;
                            com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage4 = this.getHighSpeedVideoSizes;
                            com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted4 = Camera2StreamConfigurationMap;
                            pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizes = defaultRaise2;
                            pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizesFor = defaultRaise3;
                            pushTokenLocalDataSourceImpl$clearToken$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRanges = 0;
                            pushTokenLocalDataSourceImpl$clearToken$1.Camera2StreamConfigurationMap = 0;
                            pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRangesFor = 0;
                            pushTokenLocalDataSourceImpl$clearToken$1.getInputFormats = 1;
                            if (appStorage4.remove(encrypted4, pushTokenLocalDataSourceImpl$clearToken$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i3 = 0;
                            i4 = 0;
                            i5 = 0;
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    i2 = pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRangesFor;
                                    i6 = pushTokenLocalDataSourceImpl$clearToken$1.Camera2StreamConfigurationMap;
                                    i7 = pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRanges;
                                    i8 = pushTokenLocalDataSourceImpl$clearToken$1.getHighResolutionOutputSizeshNQ4ISI;
                                    raise2 = (arrow.core.raise.Raise) pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizesFor;
                                    defaultRaise4 = (arrow.core.raise.DefaultRaise) pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizes;
                                    try {
                                        kotlin.ResultKt.throwOnFailure(obj);
                                        appStorage2 = this.getHighSpeedVideoSizes;
                                        encrypted2 = getHighSpeedVideoFpsRanges;
                                        pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizes = defaultRaise4;
                                        pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizesFor = raise2;
                                        pushTokenLocalDataSourceImpl$clearToken$1.getHighResolutionOutputSizeshNQ4ISI = i8;
                                        pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRanges = i7;
                                        pushTokenLocalDataSourceImpl$clearToken$1.Camera2StreamConfigurationMap = i6;
                                        pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRangesFor = i2;
                                        pushTokenLocalDataSourceImpl$clearToken$1.getInputFormats = 3;
                                        if (appStorage2.remove(encrypted2, pushTokenLocalDataSourceImpl$clearToken$1) != coroutine_suspended) {
                                            i9 = i6;
                                            i10 = i7;
                                            i11 = i8;
                                            raise3 = raise2;
                                            defaultRaise = defaultRaise4;
                                            appStorage3 = this.getHighSpeedVideoSizes;
                                            encrypted3 = getHighSpeedVideoSizes;
                                            pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizes = defaultRaise;
                                            pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizesFor = raise3;
                                            pushTokenLocalDataSourceImpl$clearToken$1.getHighResolutionOutputSizeshNQ4ISI = i11;
                                            pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRanges = i10;
                                            pushTokenLocalDataSourceImpl$clearToken$1.Camera2StreamConfigurationMap = i9;
                                            pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRangesFor = i2;
                                            pushTokenLocalDataSourceImpl$clearToken$1.getInputFormats = 4;
                                            if (appStorage3.remove(encrypted3, pushTokenLocalDataSourceImpl$clearToken$1) != coroutine_suspended) {
                                            }
                                        }
                                        return coroutine_suspended;
                                    } catch (arrow.core.raise.RaiseCancellationException e) {
                                        e = e;
                                        defaultRaise = defaultRaise4;
                                        defaultRaise.complete();
                                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                                    } catch (java.io.IOException e2) {
                                        e = e2;
                                        raise = raise2;
                                        raise.raise(new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.WriteError(e));
                                        throw new kotlin.KotlinNothingValueException();
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        defaultRaise = defaultRaise4;
                                        defaultRaise.complete();
                                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                    }
                                }
                                if (i != 3) {
                                    if (i != 4) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    int i12 = pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRangesFor;
                                    int i13 = pushTokenLocalDataSourceImpl$clearToken$1.Camera2StreamConfigurationMap;
                                    int i14 = pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRanges;
                                    int i15 = pushTokenLocalDataSourceImpl$clearToken$1.getHighResolutionOutputSizeshNQ4ISI;
                                    raise = (arrow.core.raise.Raise) pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizesFor;
                                    defaultRaise5 = (arrow.core.raise.DefaultRaise) pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizes;
                                    try {
                                        try {
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                            defaultRaise5.complete();
                                            return new arrow.core.Either.Right(unit);
                                        } catch (java.io.IOException e3) {
                                            e = e3;
                                            raise.raise(new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.WriteError(e));
                                            throw new kotlin.KotlinNothingValueException();
                                        }
                                    } catch (arrow.core.raise.RaiseCancellationException e4) {
                                        e = e4;
                                        defaultRaise = defaultRaise5;
                                        defaultRaise.complete();
                                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        defaultRaise = defaultRaise5;
                                        defaultRaise.complete();
                                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                    }
                                }
                                i2 = pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRangesFor;
                                i9 = pushTokenLocalDataSourceImpl$clearToken$1.Camera2StreamConfigurationMap;
                                i10 = pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRanges;
                                i11 = pushTokenLocalDataSourceImpl$clearToken$1.getHighResolutionOutputSizeshNQ4ISI;
                                raise3 = (arrow.core.raise.Raise) pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizesFor;
                                defaultRaise = (arrow.core.raise.DefaultRaise) pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizes;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    appStorage3 = this.getHighSpeedVideoSizes;
                                    encrypted3 = getHighSpeedVideoSizes;
                                    pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizes = defaultRaise;
                                    pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizesFor = raise3;
                                    pushTokenLocalDataSourceImpl$clearToken$1.getHighResolutionOutputSizeshNQ4ISI = i11;
                                    pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRanges = i10;
                                    pushTokenLocalDataSourceImpl$clearToken$1.Camera2StreamConfigurationMap = i9;
                                    pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRangesFor = i2;
                                    pushTokenLocalDataSourceImpl$clearToken$1.getInputFormats = 4;
                                    if (appStorage3.remove(encrypted3, pushTokenLocalDataSourceImpl$clearToken$1) != coroutine_suspended) {
                                        defaultRaise5 = defaultRaise;
                                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                        defaultRaise5.complete();
                                        return new arrow.core.Either.Right(unit2);
                                    }
                                    return coroutine_suspended;
                                } catch (arrow.core.raise.RaiseCancellationException e5) {
                                    e = e5;
                                    defaultRaise.complete();
                                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                                } catch (java.io.IOException e6) {
                                    e = e6;
                                    raise = raise3;
                                    raise.raise(new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.WriteError(e));
                                    throw new kotlin.KotlinNothingValueException();
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    defaultRaise.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                }
                            }
                            i2 = pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRangesFor;
                            i3 = pushTokenLocalDataSourceImpl$clearToken$1.Camera2StreamConfigurationMap;
                            i4 = pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRanges;
                            i5 = pushTokenLocalDataSourceImpl$clearToken$1.getHighResolutionOutputSizeshNQ4ISI;
                            defaultRaise3 = (arrow.core.raise.Raise) pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizesFor;
                            defaultRaise2 = (arrow.core.raise.DefaultRaise) pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        appStorage = this.getHighSpeedVideoSizes;
                        encrypted = getHighSpeedVideoFpsRangesFor;
                        pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizes = defaultRaise2;
                        pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizesFor = defaultRaise3;
                        pushTokenLocalDataSourceImpl$clearToken$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                        pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRanges = i4;
                        pushTokenLocalDataSourceImpl$clearToken$1.Camera2StreamConfigurationMap = i3;
                        pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRangesFor = i2;
                        pushTokenLocalDataSourceImpl$clearToken$1.getInputFormats = 2;
                        if (appStorage.remove(encrypted, pushTokenLocalDataSourceImpl$clearToken$1) != coroutine_suspended) {
                            i6 = i3;
                            i7 = i4;
                            i8 = i5;
                            raise2 = defaultRaise3;
                            defaultRaise4 = defaultRaise2;
                            appStorage2 = this.getHighSpeedVideoSizes;
                            encrypted2 = getHighSpeedVideoFpsRanges;
                            pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizes = defaultRaise4;
                            pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizesFor = raise2;
                            pushTokenLocalDataSourceImpl$clearToken$1.getHighResolutionOutputSizeshNQ4ISI = i8;
                            pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRanges = i7;
                            pushTokenLocalDataSourceImpl$clearToken$1.Camera2StreamConfigurationMap = i6;
                            pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRangesFor = i2;
                            pushTokenLocalDataSourceImpl$clearToken$1.getInputFormats = 3;
                            if (appStorage2.remove(encrypted2, pushTokenLocalDataSourceImpl$clearToken$1) != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                if (i != 0) {
                }
                appStorage = this.getHighSpeedVideoSizes;
                encrypted = getHighSpeedVideoFpsRangesFor;
                pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizes = defaultRaise2;
                pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoSizesFor = defaultRaise3;
                pushTokenLocalDataSourceImpl$clearToken$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRanges = i4;
                pushTokenLocalDataSourceImpl$clearToken$1.Camera2StreamConfigurationMap = i3;
                pushTokenLocalDataSourceImpl$clearToken$1.getHighSpeedVideoFpsRangesFor = i2;
                pushTokenLocalDataSourceImpl$clearToken$1.getInputFormats = 2;
                if (appStorage.remove(encrypted, pushTokenLocalDataSourceImpl$clearToken$1) != coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (java.io.IOException e7) {
                e = e7;
                raise = defaultRaise3;
            }
        } catch (arrow.core.raise.RaiseCancellationException e8) {
            e = e8;
            defaultRaise = defaultRaise2;
        } catch (java.lang.Throwable th4) {
            th = th4;
            defaultRaise = defaultRaise2;
        }
        pushTokenLocalDataSourceImpl$clearToken$1 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl$clearToken$1(this, continuation);
        java.lang.Object obj2 = pushTokenLocalDataSourceImpl$clearToken$1.getInputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushTokenLocalDataSourceImpl$clearToken$1.getInputFormats;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/datasource/PushTokenLocalDataSourceImpl$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Encrypted;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Encrypted;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
