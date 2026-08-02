package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/usecase/UnsubscribeFromPushNotificationUseCase;", "", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/repository/PushNotificationTokenRepository;", "repository", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;", "deviceIdProvider", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushTokenProvider;", "tokenProvider", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushManager;", "adobePushManager", "<init>", "(Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/repository/PushNotificationTokenRepository;Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushTokenProvider;Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushManager;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/error/PushNotificationTokenError;", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/repository/PushNotificationTokenRepository;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushTokenProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UnsubscribeFromPushNotificationUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public UnsubscribeFromPushNotificationUseCase(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository pushNotificationTokenRepository, com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider deviceIdProvider, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider pushTokenProvider, com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager adobePushManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationTokenRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceIdProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushTokenProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adobePushManager, "");
        this.getHighSpeedVideoFpsRangesFor = pushNotificationTokenRepository;
        this.getHighSpeedVideoSizes = deviceIdProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = pushTokenProvider;
        this.getHighSpeedVideoFpsRanges = adobePushManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1 A[Catch: all -> 0x00c0, RaiseCancellationException -> 0x00c3, TRY_LEAVE, TryCatch #6 {RaiseCancellationException -> 0x00c3, all -> 0x00c0, blocks: (B:43:0x00b7, B:45:0x00ed, B:47:0x00f1, B:50:0x019e, B:51:0x01a8, B:53:0x00ce), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019e A[Catch: all -> 0x00c0, RaiseCancellationException -> 0x00c3, TRY_ENTER, TryCatch #6 {RaiseCancellationException -> 0x00c3, all -> 0x00c0, blocks: (B:43:0x00b7, B:45:0x00ed, B:47:0x00f1, B:50:0x019e, B:51:0x01a8, B:53:0x00ce), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UnsubscribeFromPushNotificationUseCase$invoke$1 unsubscribeFromPushNotificationUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.raise.Raise raise;
        int i2;
        int i3;
        int i4;
        int i5;
        java.lang.String str;
        arrow.core.raise.DefaultRaise defaultRaise4;
        arrow.core.raise.Raise raise2;
        java.lang.String str2;
        int i6;
        int i7;
        int i8;
        java.lang.Object unsubscribeFromBackend;
        arrow.core.raise.Raise raise3;
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken pushNotificationToken;
        int i9;
        int i10;
        int i11;
        arrow.core.raise.Raise raise4;
        arrow.core.raise.DefaultRaise defaultRaise5;
        try {
            try {
                if (continuation instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UnsubscribeFromPushNotificationUseCase$invoke$1) {
                    unsubscribeFromPushNotificationUseCase$invoke$1 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UnsubscribeFromPushNotificationUseCase$invoke$1) continuation;
                    if ((unsubscribeFromPushNotificationUseCase$invoke$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                        unsubscribeFromPushNotificationUseCase$invoke$1.getOutputFormats -= 2147483648;
                        java.lang.Object obj = unsubscribeFromPushNotificationUseCase$invoke$1.getOutputStallDuration;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = unsubscribeFromPushNotificationUseCase$invoke$1.getOutputFormats;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
                            arrow.core.raise.DefaultRaise defaultRaise6 = defaultRaise3;
                            com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider deviceIdProvider = this.getHighSpeedVideoSizes;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges = defaultRaise3;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise6;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                            unsubscribeFromPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getOutputFormats = 1;
                            java.lang.Object deviceId = deviceIdProvider.getDeviceId(unsubscribeFromPushNotificationUseCase$invoke$1);
                            if (deviceId != coroutine_suspended) {
                                raise = defaultRaise6;
                                obj = deviceId;
                                i2 = 0;
                                i3 = 0;
                                i4 = 0;
                                i5 = 0;
                            }
                            return coroutine_suspended;
                        }
                        if (i != 1) {
                            if (i == 2) {
                                i2 = unsubscribeFromPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                i6 = unsubscribeFromPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap;
                                i7 = unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes;
                                i8 = unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                raise = (arrow.core.raise.Raise) unsubscribeFromPushNotificationUseCase$invoke$1.getInputSizeshNQ4ISI;
                                str2 = (java.lang.String) unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor;
                                raise2 = (arrow.core.raise.Raise) unsubscribeFromPushNotificationUseCase$invoke$1.getOutputMinFrameDuration;
                                defaultRaise4 = (arrow.core.raise.DefaultRaise) unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                kotlin.ResultKt.throwOnFailure(obj);
                                com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken pushNotificationToken2 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken) raise.bind((arrow.core.Either) obj);
                                com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository pushNotificationTokenRepository = this.getHighSpeedVideoFpsRangesFor;
                                java.lang.String value = pushNotificationToken2.getValue();
                                unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges = defaultRaise4;
                                unsubscribeFromPushNotificationUseCase$invoke$1.getOutputMinFrameDuration = raise2;
                                unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                unsubscribeFromPushNotificationUseCase$invoke$1.getInputSizeshNQ4ISI = raise2;
                                unsubscribeFromPushNotificationUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pushNotificationToken2);
                                unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i8;
                                unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes = i7;
                                unsubscribeFromPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap = i6;
                                unsubscribeFromPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                                unsubscribeFromPushNotificationUseCase$invoke$1.getOutputFormats = 3;
                                unsubscribeFromBackend = pushNotificationTokenRepository.unsubscribeFromBackend(str2, value, unsubscribeFromPushNotificationUseCase$invoke$1);
                                if (unsubscribeFromBackend != coroutine_suspended) {
                                    raise3 = raise2;
                                    int i12 = i8;
                                    pushNotificationToken = pushNotificationToken2;
                                    obj = unsubscribeFromBackend;
                                    i9 = i6;
                                    i10 = i7;
                                    i11 = i12;
                                    raise3.bind((arrow.core.Either) obj);
                                    com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository pushNotificationTokenRepository2 = this.getHighSpeedVideoFpsRangesFor;
                                    unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges = defaultRaise4;
                                    unsubscribeFromPushNotificationUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise2);
                                    unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                    unsubscribeFromPushNotificationUseCase$invoke$1.getInputSizeshNQ4ISI = raise2;
                                    unsubscribeFromPushNotificationUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pushNotificationToken);
                                    unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i11;
                                    unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes = i10;
                                    unsubscribeFromPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap = i9;
                                    unsubscribeFromPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                                    unsubscribeFromPushNotificationUseCase$invoke$1.getOutputFormats = 4;
                                    obj = pushNotificationTokenRepository2.clearBackendStateSnapshot(unsubscribeFromPushNotificationUseCase$invoke$1);
                                    if (obj != coroutine_suspended) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                            if (i != 3) {
                                if (i != 4) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i13 = unsubscribeFromPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                int i14 = unsubscribeFromPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap;
                                int i15 = unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes;
                                int i16 = unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                raise4 = (arrow.core.raise.Raise) unsubscribeFromPushNotificationUseCase$invoke$1.getInputSizeshNQ4ISI;
                                defaultRaise5 = (arrow.core.raise.DefaultRaise) unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    raise4.bind((arrow.core.Either) obj);
                                    this.getHighSpeedVideoFpsRanges.updateConsent(false);
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    defaultRaise5.complete();
                                    return new arrow.core.Either.Right(unit);
                                } catch (arrow.core.raise.RaiseCancellationException e) {
                                    e = e;
                                    defaultRaise2 = defaultRaise5;
                                    defaultRaise2.complete();
                                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    defaultRaise = defaultRaise5;
                                    defaultRaise.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                }
                            }
                            i2 = unsubscribeFromPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                            i9 = unsubscribeFromPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap;
                            i10 = unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes;
                            i11 = unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                            pushNotificationToken = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken) unsubscribeFromPushNotificationUseCase$invoke$1.getInputFormats;
                            raise3 = (arrow.core.raise.Raise) unsubscribeFromPushNotificationUseCase$invoke$1.getInputSizeshNQ4ISI;
                            str2 = (java.lang.String) unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor;
                            raise2 = (arrow.core.raise.Raise) unsubscribeFromPushNotificationUseCase$invoke$1.getOutputMinFrameDuration;
                            defaultRaise4 = (arrow.core.raise.DefaultRaise) unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            raise3.bind((arrow.core.Either) obj);
                            com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository pushNotificationTokenRepository22 = this.getHighSpeedVideoFpsRangesFor;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges = defaultRaise4;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise2);
                            unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            unsubscribeFromPushNotificationUseCase$invoke$1.getInputSizeshNQ4ISI = raise2;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pushNotificationToken);
                            unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i11;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes = i10;
                            unsubscribeFromPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap = i9;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getOutputFormats = 4;
                            obj = pushNotificationTokenRepository22.clearBackendStateSnapshot(unsubscribeFromPushNotificationUseCase$invoke$1);
                            if (obj != coroutine_suspended) {
                                raise4 = raise2;
                                defaultRaise5 = defaultRaise4;
                                raise4.bind((arrow.core.Either) obj);
                                this.getHighSpeedVideoFpsRanges.updateConsent(false);
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                defaultRaise5.complete();
                                return new arrow.core.Either.Right(unit2);
                            }
                            return coroutine_suspended;
                        }
                        i2 = unsubscribeFromPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        i3 = unsubscribeFromPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap;
                        i4 = unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes;
                        int i17 = unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        arrow.core.raise.Raise raise5 = (arrow.core.raise.Raise) unsubscribeFromPushNotificationUseCase$invoke$1.getOutputMinFrameDuration;
                        defaultRaise3 = (arrow.core.raise.DefaultRaise) unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        i5 = i17;
                        raise = raise5;
                        str = (java.lang.String) obj;
                        if (str != null) {
                            raise.raise(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError.DeviceIdGenerationFailed.INSTANCE);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider pushTokenProvider = this.getHighResolutionOutputSizeshNQ4ISI;
                        unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges = defaultRaise3;
                        unsubscribeFromPushNotificationUseCase$invoke$1.getOutputMinFrameDuration = raise;
                        unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor = str;
                        unsubscribeFromPushNotificationUseCase$invoke$1.getInputSizeshNQ4ISI = raise;
                        unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i5;
                        unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes = i4;
                        unsubscribeFromPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap = i3;
                        unsubscribeFromPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                        unsubscribeFromPushNotificationUseCase$invoke$1.getOutputFormats = 2;
                        java.lang.Object token = pushTokenProvider.getToken(unsubscribeFromPushNotificationUseCase$invoke$1);
                        if (token != coroutine_suspended) {
                            defaultRaise4 = defaultRaise3;
                            raise2 = raise;
                            int i18 = i5;
                            str2 = str;
                            obj = token;
                            i6 = i3;
                            i7 = i4;
                            i8 = i18;
                            com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken pushNotificationToken22 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken) raise.bind((arrow.core.Either) obj);
                            com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository pushNotificationTokenRepository3 = this.getHighSpeedVideoFpsRangesFor;
                            java.lang.String value2 = pushNotificationToken22.getValue();
                            unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges = defaultRaise4;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getOutputMinFrameDuration = raise2;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            unsubscribeFromPushNotificationUseCase$invoke$1.getInputSizeshNQ4ISI = raise2;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pushNotificationToken22);
                            unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i8;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes = i7;
                            unsubscribeFromPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap = i6;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                            unsubscribeFromPushNotificationUseCase$invoke$1.getOutputFormats = 3;
                            unsubscribeFromBackend = pushNotificationTokenRepository3.unsubscribeFromBackend(str2, value2, unsubscribeFromPushNotificationUseCase$invoke$1);
                            if (unsubscribeFromBackend != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                if (i != 0) {
                }
                str = (java.lang.String) obj;
                if (str != null) {
                }
            } catch (arrow.core.raise.RaiseCancellationException e2) {
                e = e2;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            e = e3;
            defaultRaise2 = defaultRaise4;
        } catch (java.lang.Throwable th3) {
            th = th3;
            defaultRaise = defaultRaise4;
        }
        unsubscribeFromPushNotificationUseCase$invoke$1 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UnsubscribeFromPushNotificationUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = unsubscribeFromPushNotificationUseCase$invoke$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = unsubscribeFromPushNotificationUseCase$invoke$1.getOutputFormats;
    }
}
