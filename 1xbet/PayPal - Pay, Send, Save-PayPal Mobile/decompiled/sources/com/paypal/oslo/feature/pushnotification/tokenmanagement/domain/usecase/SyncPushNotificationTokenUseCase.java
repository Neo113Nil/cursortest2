package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0086B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010!\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/usecase/SyncPushNotificationTokenUseCase;", "", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/repository/PushNotificationTokenRepository;", "repository", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushTokenProvider;", "tokenProvider", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushConsentProvider;", "consentProvider", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;", "deviceIdProvider", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/CloudIdentityProvider;", "cloudIdentityProvider", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/usecase/UpdateAdobePushConsentUseCase;", "updateAdobePushConsentUseCase", "<init>", "(Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/repository/PushNotificationTokenRepository;Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushTokenProvider;Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushConsentProvider;Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/CloudIdentityProvider;Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/usecase/UpdateAdobePushConsentUseCase;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/error/PushNotificationTokenError;", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/repository/PushNotificationTokenRepository;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushTokenProvider;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushConsentProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/CloudIdentityProvider;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/usecase/UpdateAdobePushConsentUseCase;", "getOutputMinFrameDuration"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SyncPushNotificationTokenUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.CloudIdentityProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase getOutputMinFrameDuration;

    @javax.inject.Inject
    public SyncPushNotificationTokenUseCase(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository pushNotificationTokenRepository, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider pushTokenProvider, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProvider pushConsentProvider, com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider deviceIdProvider, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.CloudIdentityProvider cloudIdentityProvider, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase updateAdobePushConsentUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationTokenRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushTokenProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushConsentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceIdProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudIdentityProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAdobePushConsentUseCase, "");
        this.getHighSpeedVideoFpsRanges = pushNotificationTokenRepository;
        this.getHighSpeedVideoSizes = pushTokenProvider;
        this.getHighSpeedVideoFpsRangesFor = pushConsentProvider;
        this.Camera2StreamConfigurationMap = deviceIdProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = cloudIdentityProvider;
        this.getOutputMinFrameDuration = updateAdobePushConsentUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01dc, code lost:
    
        if (r0 == r3) goto L125;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0222 A[Catch: all -> 0x02f5, RaiseCancellationException -> 0x02f8, TRY_LEAVE, TryCatch #13 {RaiseCancellationException -> 0x02f8, all -> 0x02f5, blocks: (B:35:0x0095, B:68:0x020c, B:71:0x0222, B:130:0x0166), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase$invoke$1 syncPushNotificationTokenUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        int i2;
        int i3;
        arrow.core.raise.DefaultRaise defaultRaise4;
        arrow.core.raise.Raise raise;
        int i4;
        int i5;
        java.lang.Object token;
        arrow.core.raise.Raise raise2;
        arrow.core.raise.DefaultRaise defaultRaise5;
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot;
        int i6;
        int i7;
        int i8;
        int i9;
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken pushNotificationToken;
        boolean isPushPermissionGranted;
        arrow.core.raise.Raise raise3;
        java.lang.String str;
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot2;
        int i10;
        boolean z;
        arrow.core.raise.DefaultRaise defaultRaise6;
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken pushNotificationToken2;
        int i11;
        int i12;
        int i13;
        int i14;
        java.lang.String str2;
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot3;
        arrow.core.raise.Raise raise4;
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot4;
        arrow.core.raise.DefaultRaise defaultRaise7;
        arrow.core.raise.DefaultRaise defaultRaise8;
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase syncPushNotificationTokenUseCase;
        arrow.core.raise.DefaultRaise defaultRaise9;
        arrow.core.raise.Raise raise5;
        try {
            try {
                if (continuation instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase$invoke$1) {
                    syncPushNotificationTokenUseCase$invoke$1 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase$invoke$1) continuation;
                    if ((syncPushNotificationTokenUseCase$invoke$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                        syncPushNotificationTokenUseCase$invoke$1.getOutputStallDurationlomOqCM -= 2147483648;
                        java.lang.Object obj = syncPushNotificationTokenUseCase$invoke$1.getOutputStallDuration;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = syncPushNotificationTokenUseCase$invoke$1.getOutputStallDurationlomOqCM;
                        switch (i) {
                            case 0:
                                kotlin.ResultKt.throwOnFailure(obj);
                                arrow.core.raise.DefaultRaise defaultRaise10 = new arrow.core.raise.DefaultRaise(false);
                                defaultRaise3 = defaultRaise10;
                                com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository pushNotificationTokenRepository = this.getHighSpeedVideoFpsRanges;
                                syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = defaultRaise10;
                                syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise3;
                                syncPushNotificationTokenUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise3;
                                syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                                syncPushNotificationTokenUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                                syncPushNotificationTokenUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                                syncPushNotificationTokenUseCase$invoke$1.getOutputStallDurationlomOqCM = 1;
                                java.lang.Object tokenSubscriptionBackendSnapshot5 = pushNotificationTokenRepository.getTokenSubscriptionBackendSnapshot(syncPushNotificationTokenUseCase$invoke$1);
                                if (tokenSubscriptionBackendSnapshot5 != coroutine_suspended) {
                                    i2 = 0;
                                    i3 = 0;
                                    defaultRaise4 = defaultRaise10;
                                    raise = defaultRaise3;
                                    i4 = 0;
                                    obj = tokenSubscriptionBackendSnapshot5;
                                    i5 = 0;
                                    com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot6 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot) defaultRaise3.bind((arrow.core.Either) obj);
                                    com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider pushTokenProvider = this.getHighSpeedVideoSizes;
                                    syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = defaultRaise4;
                                    syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDuration = raise;
                                    syncPushNotificationTokenUseCase$invoke$1.getInputSizeshNQ4ISI = raise;
                                    syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizesFor = tokenSubscriptionBackendSnapshot6;
                                    syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRanges = i3;
                                    syncPushNotificationTokenUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                                    syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizes = i5;
                                    syncPushNotificationTokenUseCase$invoke$1.Camera2StreamConfigurationMap = i4;
                                    syncPushNotificationTokenUseCase$invoke$1.getOutputStallDurationlomOqCM = 2;
                                    token = pushTokenProvider.getToken(syncPushNotificationTokenUseCase$invoke$1);
                                    if (token != coroutine_suspended) {
                                        raise2 = raise;
                                        defaultRaise5 = defaultRaise4;
                                        tokenSubscriptionBackendSnapshot = tokenSubscriptionBackendSnapshot6;
                                        obj = token;
                                        i6 = i3;
                                        i7 = i2;
                                        i8 = i5;
                                        i9 = i4;
                                        pushNotificationToken = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken) raise.bind((arrow.core.Either) obj);
                                        isPushPermissionGranted = this.getHighSpeedVideoFpsRangesFor.isPushPermissionGranted();
                                        com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider deviceIdProvider = this.Camera2StreamConfigurationMap;
                                        syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = defaultRaise5;
                                        syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDuration = raise2;
                                        syncPushNotificationTokenUseCase$invoke$1.getInputSizeshNQ4ISI = tokenSubscriptionBackendSnapshot;
                                        syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizesFor = pushNotificationToken;
                                        syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRanges = i6;
                                        syncPushNotificationTokenUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i7;
                                        syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizes = i8;
                                        syncPushNotificationTokenUseCase$invoke$1.Camera2StreamConfigurationMap = i9;
                                        syncPushNotificationTokenUseCase$invoke$1.getOutputSizeshNQ4ISI = isPushPermissionGranted;
                                        syncPushNotificationTokenUseCase$invoke$1.getOutputStallDurationlomOqCM = 3;
                                        obj = deviceIdProvider.getDeviceId(syncPushNotificationTokenUseCase$invoke$1);
                                        break;
                                    }
                                }
                                return coroutine_suspended;
                            case 1:
                                i4 = syncPushNotificationTokenUseCase$invoke$1.Camera2StreamConfigurationMap;
                                i5 = syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizes;
                                i2 = syncPushNotificationTokenUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                i3 = syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                defaultRaise3 = (arrow.core.raise.Raise) syncPushNotificationTokenUseCase$invoke$1.getInputSizeshNQ4ISI;
                                raise = (arrow.core.raise.Raise) syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDuration;
                                defaultRaise4 = (arrow.core.raise.DefaultRaise) syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot62 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot) defaultRaise3.bind((arrow.core.Either) obj);
                                    com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider pushTokenProvider2 = this.getHighSpeedVideoSizes;
                                    syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = defaultRaise4;
                                    syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDuration = raise;
                                    syncPushNotificationTokenUseCase$invoke$1.getInputSizeshNQ4ISI = raise;
                                    syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizesFor = tokenSubscriptionBackendSnapshot62;
                                    syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRanges = i3;
                                    syncPushNotificationTokenUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                                    syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizes = i5;
                                    syncPushNotificationTokenUseCase$invoke$1.Camera2StreamConfigurationMap = i4;
                                    syncPushNotificationTokenUseCase$invoke$1.getOutputStallDurationlomOqCM = 2;
                                    token = pushTokenProvider2.getToken(syncPushNotificationTokenUseCase$invoke$1);
                                    if (token != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                } catch (arrow.core.raise.RaiseCancellationException e) {
                                    e = e;
                                    defaultRaise2 = defaultRaise4;
                                    defaultRaise2.complete();
                                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    defaultRaise = defaultRaise4;
                                    defaultRaise.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                }
                            case 2:
                                i4 = syncPushNotificationTokenUseCase$invoke$1.Camera2StreamConfigurationMap;
                                i5 = syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizes;
                                i2 = syncPushNotificationTokenUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                i3 = syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot7 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot) syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizesFor;
                                raise = (arrow.core.raise.Raise) syncPushNotificationTokenUseCase$invoke$1.getInputSizeshNQ4ISI;
                                arrow.core.raise.Raise raise6 = (arrow.core.raise.Raise) syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDuration;
                                arrow.core.raise.DefaultRaise defaultRaise11 = (arrow.core.raise.DefaultRaise) syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    defaultRaise5 = defaultRaise11;
                                    raise2 = raise6;
                                    tokenSubscriptionBackendSnapshot = tokenSubscriptionBackendSnapshot7;
                                    i6 = i3;
                                    i7 = i2;
                                    i8 = i5;
                                    i9 = i4;
                                    pushNotificationToken = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken) raise.bind((arrow.core.Either) obj);
                                    isPushPermissionGranted = this.getHighSpeedVideoFpsRangesFor.isPushPermissionGranted();
                                    com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider deviceIdProvider2 = this.Camera2StreamConfigurationMap;
                                    syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = defaultRaise5;
                                    syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDuration = raise2;
                                    syncPushNotificationTokenUseCase$invoke$1.getInputSizeshNQ4ISI = tokenSubscriptionBackendSnapshot;
                                    syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizesFor = pushNotificationToken;
                                    syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRanges = i6;
                                    syncPushNotificationTokenUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i7;
                                    syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizes = i8;
                                    syncPushNotificationTokenUseCase$invoke$1.Camera2StreamConfigurationMap = i9;
                                    syncPushNotificationTokenUseCase$invoke$1.getOutputSizeshNQ4ISI = isPushPermissionGranted;
                                    syncPushNotificationTokenUseCase$invoke$1.getOutputStallDurationlomOqCM = 3;
                                    obj = deviceIdProvider2.getDeviceId(syncPushNotificationTokenUseCase$invoke$1);
                                    break;
                                } catch (arrow.core.raise.RaiseCancellationException e2) {
                                    e = e2;
                                    defaultRaise2 = defaultRaise11;
                                    defaultRaise2.complete();
                                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    defaultRaise = defaultRaise11;
                                    defaultRaise.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                }
                            case 3:
                                isPushPermissionGranted = syncPushNotificationTokenUseCase$invoke$1.getOutputSizeshNQ4ISI;
                                i9 = syncPushNotificationTokenUseCase$invoke$1.Camera2StreamConfigurationMap;
                                i8 = syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizes;
                                i7 = syncPushNotificationTokenUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                i6 = syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                pushNotificationToken = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken) syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizesFor;
                                tokenSubscriptionBackendSnapshot = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot) syncPushNotificationTokenUseCase$invoke$1.getInputSizeshNQ4ISI;
                                raise2 = (arrow.core.raise.Raise) syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDuration;
                                defaultRaise5 = (arrow.core.raise.DefaultRaise) syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                kotlin.ResultKt.throwOnFailure(obj);
                                java.lang.String str3 = (java.lang.String) obj;
                                if (str3 == null) {
                                    try {
                                        raise2.raise(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError.DeviceIdGenerationFailed.INSTANCE);
                                        throw new kotlin.KotlinNothingValueException();
                                    } catch (arrow.core.raise.RaiseCancellationException e3) {
                                        e = e3;
                                        defaultRaise2 = defaultRaise5;
                                        defaultRaise2.complete();
                                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        defaultRaise = defaultRaise5;
                                        defaultRaise.complete();
                                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                    }
                                }
                                com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.CloudIdentityProvider cloudIdentityProvider = this.getHighResolutionOutputSizeshNQ4ISI;
                                syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = defaultRaise5;
                                syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDuration = raise2;
                                syncPushNotificationTokenUseCase$invoke$1.getInputSizeshNQ4ISI = tokenSubscriptionBackendSnapshot;
                                syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizesFor = pushNotificationToken;
                                syncPushNotificationTokenUseCase$invoke$1.getOutputFormats = str3;
                                syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRanges = i6;
                                syncPushNotificationTokenUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i7;
                                syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizes = i8;
                                syncPushNotificationTokenUseCase$invoke$1.Camera2StreamConfigurationMap = i9;
                                syncPushNotificationTokenUseCase$invoke$1.getOutputSizeshNQ4ISI = isPushPermissionGranted;
                                syncPushNotificationTokenUseCase$invoke$1.getOutputStallDurationlomOqCM = 4;
                                java.lang.Object cloudIdentity = cloudIdentityProvider.getCloudIdentity(syncPushNotificationTokenUseCase$invoke$1);
                                if (cloudIdentity != coroutine_suspended) {
                                    raise3 = raise2;
                                    str = str3;
                                    obj = cloudIdentity;
                                    tokenSubscriptionBackendSnapshot2 = tokenSubscriptionBackendSnapshot;
                                    i10 = i9;
                                    z = isPushPermissionGranted;
                                    defaultRaise6 = defaultRaise5;
                                    pushNotificationToken2 = pushNotificationToken;
                                    i11 = i6;
                                    i12 = i7;
                                    i13 = i8;
                                    i14 = i10;
                                    str2 = (java.lang.String) obj;
                                    tokenSubscriptionBackendSnapshot3 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot(pushNotificationToken2.getValue(), z, str, str2);
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(tokenSubscriptionBackendSnapshot2, tokenSubscriptionBackendSnapshot3)) {
                                        defaultRaise7 = defaultRaise6;
                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                        defaultRaise7.complete();
                                        return new arrow.core.Either.Right(unit);
                                    }
                                    com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository pushNotificationTokenRepository2 = this.getHighSpeedVideoFpsRanges;
                                    try {
                                        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscribeRequest tokenSubscribeRequest = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscribeRequest(pushNotificationToken2.getValue(), z, str, str2);
                                        syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = defaultRaise6;
                                        syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDuration = raise3;
                                        syncPushNotificationTokenUseCase$invoke$1.getInputSizeshNQ4ISI = raise3;
                                        syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenSubscriptionBackendSnapshot2);
                                        syncPushNotificationTokenUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pushNotificationToken2);
                                        syncPushNotificationTokenUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                                        syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                        syncPushNotificationTokenUseCase$invoke$1.getOutputSizes = tokenSubscriptionBackendSnapshot3;
                                        syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRanges = i11;
                                        syncPushNotificationTokenUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i12;
                                        syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizes = i13;
                                        syncPushNotificationTokenUseCase$invoke$1.Camera2StreamConfigurationMap = i14;
                                        syncPushNotificationTokenUseCase$invoke$1.getOutputSizeshNQ4ISI = z;
                                        syncPushNotificationTokenUseCase$invoke$1.getOutputStallDurationlomOqCM = 5;
                                        java.lang.Object subscribeToBackend = pushNotificationTokenRepository2.subscribeToBackend(tokenSubscribeRequest, syncPushNotificationTokenUseCase$invoke$1);
                                        coroutine_suspended = coroutine_suspended;
                                        if (subscribeToBackend == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        raise4 = raise3;
                                        tokenSubscriptionBackendSnapshot4 = tokenSubscriptionBackendSnapshot3;
                                        obj = subscribeToBackend;
                                        defaultRaise8 = defaultRaise6;
                                        try {
                                            raise4.bind((arrow.core.Either) obj);
                                            syncPushNotificationTokenUseCase = this;
                                            try {
                                                com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository pushNotificationTokenRepository3 = syncPushNotificationTokenUseCase.getHighSpeedVideoFpsRanges;
                                                syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = defaultRaise8;
                                                defaultRaise9 = defaultRaise8;
                                            } catch (arrow.core.raise.RaiseCancellationException e4) {
                                                e = e4;
                                                defaultRaise2 = defaultRaise8;
                                                defaultRaise2.complete();
                                                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                                            } catch (java.lang.Throwable th4) {
                                                th = th4;
                                                defaultRaise = defaultRaise8;
                                                defaultRaise.complete();
                                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                            }
                                        } catch (arrow.core.raise.RaiseCancellationException e5) {
                                            e = e5;
                                        } catch (java.lang.Throwable th5) {
                                            th = th5;
                                        }
                                        try {
                                            syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise3);
                                            syncPushNotificationTokenUseCase$invoke$1.getInputSizeshNQ4ISI = raise3;
                                            syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenSubscriptionBackendSnapshot2);
                                            syncPushNotificationTokenUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pushNotificationToken2);
                                            syncPushNotificationTokenUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                                            syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                            syncPushNotificationTokenUseCase$invoke$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenSubscriptionBackendSnapshot4);
                                            syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRanges = i11;
                                            syncPushNotificationTokenUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i12;
                                            syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizes = i13;
                                            syncPushNotificationTokenUseCase$invoke$1.Camera2StreamConfigurationMap = i14;
                                            syncPushNotificationTokenUseCase$invoke$1.getOutputSizeshNQ4ISI = z;
                                            syncPushNotificationTokenUseCase$invoke$1.getOutputStallDurationlomOqCM = 6;
                                            obj = pushNotificationTokenRepository3.saveTokenSubscriptionBackendSnapshot(tokenSubscriptionBackendSnapshot4, syncPushNotificationTokenUseCase$invoke$1);
                                            if (obj != coroutine_suspended) {
                                                defaultRaise7 = defaultRaise9;
                                                raise5 = raise3;
                                                try {
                                                    raise5.bind((arrow.core.Either) obj);
                                                    syncPushNotificationTokenUseCase.getOutputMinFrameDuration.invoke();
                                                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                                    defaultRaise7.complete();
                                                    return new arrow.core.Either.Right(unit2);
                                                } catch (arrow.core.raise.RaiseCancellationException e6) {
                                                    e = e6;
                                                    defaultRaise2 = defaultRaise7;
                                                    defaultRaise2.complete();
                                                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                                                } catch (java.lang.Throwable th6) {
                                                    th = th6;
                                                    defaultRaise = defaultRaise7;
                                                    defaultRaise.complete();
                                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                                }
                                            }
                                            return coroutine_suspended;
                                        } catch (arrow.core.raise.RaiseCancellationException e7) {
                                            e = e7;
                                            defaultRaise2 = defaultRaise9;
                                            defaultRaise2.complete();
                                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                                        } catch (java.lang.Throwable th7) {
                                            th = th7;
                                            defaultRaise = defaultRaise9;
                                            defaultRaise.complete();
                                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                        }
                                    } catch (arrow.core.raise.RaiseCancellationException e8) {
                                        e = e8;
                                        defaultRaise2 = defaultRaise6;
                                        defaultRaise2.complete();
                                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                                    } catch (java.lang.Throwable th8) {
                                        th = th8;
                                        defaultRaise = defaultRaise6;
                                        defaultRaise.complete();
                                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                    }
                                }
                                return coroutine_suspended;
                            case 4:
                                boolean z2 = syncPushNotificationTokenUseCase$invoke$1.getOutputSizeshNQ4ISI;
                                int i15 = syncPushNotificationTokenUseCase$invoke$1.Camera2StreamConfigurationMap;
                                i8 = syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizes;
                                i7 = syncPushNotificationTokenUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                i6 = syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                java.lang.String str4 = (java.lang.String) syncPushNotificationTokenUseCase$invoke$1.getOutputFormats;
                                com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken pushNotificationToken3 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken) syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizesFor;
                                com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot8 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot) syncPushNotificationTokenUseCase$invoke$1.getInputSizeshNQ4ISI;
                                arrow.core.raise.Raise raise7 = (arrow.core.raise.Raise) syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDuration;
                                arrow.core.raise.DefaultRaise defaultRaise12 = (arrow.core.raise.DefaultRaise) syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    raise3 = raise7;
                                    pushNotificationToken2 = pushNotificationToken3;
                                    i10 = i15;
                                    z = z2;
                                    defaultRaise6 = defaultRaise12;
                                    tokenSubscriptionBackendSnapshot2 = tokenSubscriptionBackendSnapshot8;
                                    str = str4;
                                    i11 = i6;
                                    i12 = i7;
                                    i13 = i8;
                                    i14 = i10;
                                    str2 = (java.lang.String) obj;
                                    tokenSubscriptionBackendSnapshot3 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot(pushNotificationToken2.getValue(), z, str, str2);
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(tokenSubscriptionBackendSnapshot2, tokenSubscriptionBackendSnapshot3)) {
                                    }
                                } catch (arrow.core.raise.RaiseCancellationException e9) {
                                    e = e9;
                                    defaultRaise2 = defaultRaise12;
                                    defaultRaise2.complete();
                                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                                } catch (java.lang.Throwable th9) {
                                    th = th9;
                                    defaultRaise = defaultRaise12;
                                    defaultRaise.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                }
                                break;
                            case 5:
                                boolean z3 = syncPushNotificationTokenUseCase$invoke$1.getOutputSizeshNQ4ISI;
                                int i16 = syncPushNotificationTokenUseCase$invoke$1.Camera2StreamConfigurationMap;
                                int i17 = syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizes;
                                int i18 = syncPushNotificationTokenUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                int i19 = syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot9 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot) syncPushNotificationTokenUseCase$invoke$1.getOutputSizes;
                                str2 = (java.lang.String) syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
                                str = (java.lang.String) syncPushNotificationTokenUseCase$invoke$1.getInputFormats;
                                pushNotificationToken2 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken) syncPushNotificationTokenUseCase$invoke$1.getOutputFormats;
                                tokenSubscriptionBackendSnapshot2 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot) syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizesFor;
                                arrow.core.raise.Raise raise8 = (arrow.core.raise.Raise) syncPushNotificationTokenUseCase$invoke$1.getInputSizeshNQ4ISI;
                                arrow.core.raise.Raise raise9 = (arrow.core.raise.Raise) syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDuration;
                                arrow.core.raise.DefaultRaise defaultRaise13 = (arrow.core.raise.DefaultRaise) syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                kotlin.ResultKt.throwOnFailure(obj);
                                tokenSubscriptionBackendSnapshot4 = tokenSubscriptionBackendSnapshot9;
                                i11 = i19;
                                i12 = i18;
                                i13 = i17;
                                i14 = i16;
                                z = z3;
                                raise4 = raise8;
                                raise3 = raise9;
                                defaultRaise8 = defaultRaise13;
                                raise4.bind((arrow.core.Either) obj);
                                syncPushNotificationTokenUseCase = this;
                                com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository pushNotificationTokenRepository32 = syncPushNotificationTokenUseCase.getHighSpeedVideoFpsRanges;
                                syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = defaultRaise8;
                                defaultRaise9 = defaultRaise8;
                                syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise3);
                                syncPushNotificationTokenUseCase$invoke$1.getInputSizeshNQ4ISI = raise3;
                                syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenSubscriptionBackendSnapshot2);
                                syncPushNotificationTokenUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pushNotificationToken2);
                                syncPushNotificationTokenUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                                syncPushNotificationTokenUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                syncPushNotificationTokenUseCase$invoke$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenSubscriptionBackendSnapshot4);
                                syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRanges = i11;
                                syncPushNotificationTokenUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i12;
                                syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizes = i13;
                                syncPushNotificationTokenUseCase$invoke$1.Camera2StreamConfigurationMap = i14;
                                syncPushNotificationTokenUseCase$invoke$1.getOutputSizeshNQ4ISI = z;
                                syncPushNotificationTokenUseCase$invoke$1.getOutputStallDurationlomOqCM = 6;
                                obj = pushNotificationTokenRepository32.saveTokenSubscriptionBackendSnapshot(tokenSubscriptionBackendSnapshot4, syncPushNotificationTokenUseCase$invoke$1);
                                if (obj != coroutine_suspended) {
                                }
                                return coroutine_suspended;
                            case 6:
                                boolean z4 = syncPushNotificationTokenUseCase$invoke$1.getOutputSizeshNQ4ISI;
                                int i20 = syncPushNotificationTokenUseCase$invoke$1.Camera2StreamConfigurationMap;
                                int i21 = syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoSizes;
                                int i22 = syncPushNotificationTokenUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                int i23 = syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                raise5 = (arrow.core.raise.Raise) syncPushNotificationTokenUseCase$invoke$1.getInputSizeshNQ4ISI;
                                defaultRaise7 = (arrow.core.raise.DefaultRaise) syncPushNotificationTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    syncPushNotificationTokenUseCase = this;
                                    raise5.bind((arrow.core.Either) obj);
                                    syncPushNotificationTokenUseCase.getOutputMinFrameDuration.invoke();
                                    kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                                    defaultRaise7.complete();
                                    return new arrow.core.Either.Right(unit22);
                                } catch (arrow.core.raise.RaiseCancellationException e10) {
                                    e = e10;
                                    defaultRaise2 = defaultRaise7;
                                    defaultRaise2.complete();
                                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                                } catch (java.lang.Throwable th10) {
                                    th = th10;
                                    defaultRaise = defaultRaise7;
                                    defaultRaise.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                }
                            default:
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                }
                switch (i) {
                }
            } catch (arrow.core.raise.RaiseCancellationException e11) {
                e = e11;
            } catch (java.lang.Throwable th11) {
                th = th11;
            }
        } catch (arrow.core.raise.RaiseCancellationException e12) {
            e = e12;
            defaultRaise2 = i;
        } catch (java.lang.Throwable th12) {
            th = th12;
            defaultRaise = i;
        }
        syncPushNotificationTokenUseCase$invoke$1 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = syncPushNotificationTokenUseCase$invoke$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = syncPushNotificationTokenUseCase$invoke$1.getOutputStallDurationlomOqCM;
    }
}
