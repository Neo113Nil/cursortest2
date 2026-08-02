package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0086B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0014\u0010!\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/usecase/SubscribeToPushNotificationUseCase;", "", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/repository/PushNotificationTokenRepository;", "repository", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushTokenProvider;", "tokenProvider", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushConsentProvider;", "consentProvider", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;", "deviceIdProvider", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/CloudIdentityProvider;", "cloudIdentityProvider", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/usecase/UpdateAdobePushConsentUseCase;", "updateAdobePushConsentUseCase", "<init>", "(Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/repository/PushNotificationTokenRepository;Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushTokenProvider;Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushConsentProvider;Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/CloudIdentityProvider;Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/usecase/UpdateAdobePushConsentUseCase;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/error/PushNotificationTokenError;", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/repository/PushNotificationTokenRepository;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushTokenProvider;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushConsentProvider;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/CloudIdentityProvider;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/usecase/UpdateAdobePushConsentUseCase;", "getOutputMinFrameDuration"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SubscribeToPushNotificationUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.CloudIdentityProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase getOutputMinFrameDuration;

    @javax.inject.Inject
    public SubscribeToPushNotificationUseCase(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository pushNotificationTokenRepository, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider pushTokenProvider, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProvider pushConsentProvider, com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider deviceIdProvider, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.CloudIdentityProvider cloudIdentityProvider, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase updateAdobePushConsentUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationTokenRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushTokenProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushConsentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceIdProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudIdentityProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAdobePushConsentUseCase, "");
        this.getHighSpeedVideoSizes = pushNotificationTokenRepository;
        this.Camera2StreamConfigurationMap = pushTokenProvider;
        this.getHighSpeedVideoFpsRanges = pushConsentProvider;
        this.getHighSpeedVideoFpsRangesFor = deviceIdProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = cloudIdentityProvider;
        this.getOutputMinFrameDuration = updateAdobePushConsentUseCase;
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00f0: MOVE (r15 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:66:0x00f0 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00f4: MOVE (r15 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:64:0x00f4 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014e A[Catch: all -> 0x0096, RaiseCancellationException -> 0x0099, TryCatch #5 {RaiseCancellationException -> 0x0099, all -> 0x0096, blocks: (B:54:0x0091, B:24:0x01ac, B:21:0x0179, B:59:0x00d1, B:16:0x014a, B:18:0x014e, B:39:0x020f, B:40:0x0219, B:13:0x0121, B:10:0x0100), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x020f A[Catch: all -> 0x0096, RaiseCancellationException -> 0x0099, TRY_ENTER, TryCatch #5 {RaiseCancellationException -> 0x0099, all -> 0x0096, blocks: (B:54:0x0091, B:24:0x01ac, B:21:0x0179, B:59:0x00d1, B:16:0x014a, B:18:0x014e, B:39:0x020f, B:40:0x0219, B:13:0x0121, B:10:0x0100), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SubscribeToPushNotificationUseCase$invoke$1 subscribeToPushNotificationUseCase$invoke$1;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.raise.DefaultRaise defaultRaise4;
        int i2;
        int i3;
        int i4;
        int i5;
        arrow.core.raise.DefaultRaise defaultRaise5;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise6;
        int i6;
        int i7;
        int i8;
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken pushNotificationToken;
        arrow.core.raise.Raise raise2;
        boolean z;
        int i9;
        java.lang.String str;
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken pushNotificationToken2;
        arrow.core.raise.Raise raise3;
        int i10;
        int i11;
        int i12;
        int i13;
        java.lang.String str2;
        arrow.core.raise.Raise raise4;
        arrow.core.raise.Raise raise5;
        arrow.core.raise.DefaultRaise defaultRaise7;
        java.lang.Object subscribeToBackend;
        java.lang.String str3;
        java.lang.Object deviceId;
        try {
            if (continuation instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SubscribeToPushNotificationUseCase$invoke$1) {
                subscribeToPushNotificationUseCase$invoke$1 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SubscribeToPushNotificationUseCase$invoke$1) continuation;
                if ((subscribeToPushNotificationUseCase$invoke$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                    subscribeToPushNotificationUseCase$invoke$1.getOutputSizes -= 2147483648;
                    java.lang.Object obj = subscribeToPushNotificationUseCase$invoke$1.getOutputStallDurationlomOqCM;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = subscribeToPushNotificationUseCase$invoke$1.getOutputSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise6 = new arrow.core.raise.DefaultRaise(false);
                        defaultRaise5 = defaultRaise6;
                        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider pushTokenProvider = this.Camera2StreamConfigurationMap;
                        subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes = defaultRaise6;
                        subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor = defaultRaise5;
                        subscribeToPushNotificationUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise5;
                        subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        subscribeToPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        subscribeToPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        subscribeToPushNotificationUseCase$invoke$1.getOutputSizes = 1;
                        java.lang.Object token = pushTokenProvider.getToken(subscribeToPushNotificationUseCase$invoke$1);
                        if (token != coroutine_suspended) {
                            i3 = 0;
                            i4 = 0;
                            i5 = 0;
                            raise = defaultRaise5;
                            obj = token;
                            i2 = 0;
                        }
                        return coroutine_suspended;
                    }
                    try {
                        if (i != 1) {
                            if (i == 2) {
                                i2 = subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                i6 = subscribeToPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                i7 = subscribeToPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap;
                                i8 = subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                pushNotificationToken = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken) subscribeToPushNotificationUseCase$invoke$1.getOutputMinFrameDuration;
                                raise2 = (arrow.core.raise.Raise) subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor;
                                defaultRaise6 = (arrow.core.raise.DefaultRaise) subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes;
                                kotlin.ResultKt.throwOnFailure(obj);
                                str3 = (java.lang.String) obj;
                                if (str3 != null) {
                                    raise2.raise(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError.DeviceIdGenerationFailed.INSTANCE);
                                    throw new kotlin.KotlinNothingValueException();
                                }
                                boolean isPushPermissionGranted = this.getHighSpeedVideoFpsRanges.isPushPermissionGranted();
                                com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.CloudIdentityProvider cloudIdentityProvider = this.getHighResolutionOutputSizeshNQ4ISI;
                                subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes = defaultRaise6;
                                subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor = raise2;
                                subscribeToPushNotificationUseCase$invoke$1.getOutputMinFrameDuration = pushNotificationToken;
                                subscribeToPushNotificationUseCase$invoke$1.getInputSizeshNQ4ISI = str3;
                                subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges = i8;
                                subscribeToPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap = i7;
                                subscribeToPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i6;
                                subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i2;
                                subscribeToPushNotificationUseCase$invoke$1.getOutputSizeshNQ4ISI = isPushPermissionGranted;
                                subscribeToPushNotificationUseCase$invoke$1.getOutputSizes = 3;
                                java.lang.Object cloudIdentity = cloudIdentityProvider.getCloudIdentity(subscribeToPushNotificationUseCase$invoke$1);
                                if (cloudIdentity != coroutine_suspended) {
                                    com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken pushNotificationToken3 = pushNotificationToken;
                                    str = str3;
                                    obj = cloudIdentity;
                                    i9 = i2;
                                    z = isPushPermissionGranted;
                                    raise3 = raise2;
                                    pushNotificationToken2 = pushNotificationToken3;
                                    java.lang.String str4 = (java.lang.String) obj;
                                    com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository pushNotificationTokenRepository = this.getHighSpeedVideoSizes;
                                    com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscribeRequest tokenSubscribeRequest = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscribeRequest(pushNotificationToken2.getValue(), z, str, str4);
                                    subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes = defaultRaise6;
                                    subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor = raise3;
                                    subscribeToPushNotificationUseCase$invoke$1.getOutputMinFrameDuration = raise3;
                                    subscribeToPushNotificationUseCase$invoke$1.getInputSizeshNQ4ISI = pushNotificationToken2;
                                    subscribeToPushNotificationUseCase$invoke$1.getInputFormats = str;
                                    subscribeToPushNotificationUseCase$invoke$1.getOutputFormats = str4;
                                    subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges = i8;
                                    subscribeToPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap = i7;
                                    subscribeToPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i6;
                                    subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i9;
                                    subscribeToPushNotificationUseCase$invoke$1.getOutputSizeshNQ4ISI = z;
                                    subscribeToPushNotificationUseCase$invoke$1.getOutputSizes = 4;
                                    subscribeToBackend = pushNotificationTokenRepository.subscribeToBackend(tokenSubscribeRequest, subscribeToPushNotificationUseCase$invoke$1);
                                    if (subscribeToBackend != coroutine_suspended) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                            if (i == 3) {
                                z = subscribeToPushNotificationUseCase$invoke$1.getOutputSizeshNQ4ISI;
                                i9 = subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                i6 = subscribeToPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                i7 = subscribeToPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap;
                                i8 = subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                str = (java.lang.String) subscribeToPushNotificationUseCase$invoke$1.getInputSizeshNQ4ISI;
                                pushNotificationToken2 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken) subscribeToPushNotificationUseCase$invoke$1.getOutputMinFrameDuration;
                                raise3 = (arrow.core.raise.Raise) subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor;
                                arrow.core.raise.DefaultRaise defaultRaise8 = (arrow.core.raise.DefaultRaise) subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes;
                                kotlin.ResultKt.throwOnFailure(obj);
                                defaultRaise6 = defaultRaise8;
                                java.lang.String str42 = (java.lang.String) obj;
                                com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository pushNotificationTokenRepository2 = this.getHighSpeedVideoSizes;
                                com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscribeRequest tokenSubscribeRequest2 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscribeRequest(pushNotificationToken2.getValue(), z, str, str42);
                                subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes = defaultRaise6;
                                subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor = raise3;
                                subscribeToPushNotificationUseCase$invoke$1.getOutputMinFrameDuration = raise3;
                                subscribeToPushNotificationUseCase$invoke$1.getInputSizeshNQ4ISI = pushNotificationToken2;
                                subscribeToPushNotificationUseCase$invoke$1.getInputFormats = str;
                                subscribeToPushNotificationUseCase$invoke$1.getOutputFormats = str42;
                                subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges = i8;
                                subscribeToPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap = i7;
                                subscribeToPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i6;
                                subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i9;
                                subscribeToPushNotificationUseCase$invoke$1.getOutputSizeshNQ4ISI = z;
                                subscribeToPushNotificationUseCase$invoke$1.getOutputSizes = 4;
                                subscribeToBackend = pushNotificationTokenRepository2.subscribeToBackend(tokenSubscribeRequest2, subscribeToPushNotificationUseCase$invoke$1);
                                if (subscribeToBackend != coroutine_suspended) {
                                    i10 = i9;
                                    i11 = i6;
                                    i12 = i7;
                                    i13 = i8;
                                    raise4 = raise3;
                                    str2 = str42;
                                    obj = subscribeToBackend;
                                    raise3.bind((arrow.core.Either) obj);
                                    com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot(pushNotificationToken2.getValue(), z, str, str2);
                                    com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository pushNotificationTokenRepository3 = this.getHighSpeedVideoSizes;
                                    subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes = defaultRaise6;
                                    subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise4);
                                    subscribeToPushNotificationUseCase$invoke$1.getOutputMinFrameDuration = raise4;
                                    subscribeToPushNotificationUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pushNotificationToken2);
                                    subscribeToPushNotificationUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                                    subscribeToPushNotificationUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                    subscribeToPushNotificationUseCase$invoke$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenSubscriptionBackendSnapshot);
                                    subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges = i13;
                                    subscribeToPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap = i12;
                                    subscribeToPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i11;
                                    subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i10;
                                    subscribeToPushNotificationUseCase$invoke$1.getOutputSizeshNQ4ISI = z;
                                    subscribeToPushNotificationUseCase$invoke$1.getOutputSizes = 5;
                                    obj = pushNotificationTokenRepository3.saveTokenSubscriptionBackendSnapshot(tokenSubscriptionBackendSnapshot, subscribeToPushNotificationUseCase$invoke$1);
                                    if (obj != coroutine_suspended) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                            if (i != 4) {
                                if (i != 5) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                boolean z2 = subscribeToPushNotificationUseCase$invoke$1.getOutputSizeshNQ4ISI;
                                int i14 = subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                int i15 = subscribeToPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                int i16 = subscribeToPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap;
                                int i17 = subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                raise5 = (arrow.core.raise.Raise) subscribeToPushNotificationUseCase$invoke$1.getOutputMinFrameDuration;
                                defaultRaise7 = (arrow.core.raise.DefaultRaise) subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    raise5.bind((arrow.core.Either) obj);
                                    this.getOutputMinFrameDuration.invoke();
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    defaultRaise7.complete();
                                    return new arrow.core.Either.Right(unit);
                                } catch (arrow.core.raise.RaiseCancellationException e) {
                                    e = e;
                                    defaultRaise2 = defaultRaise7;
                                    defaultRaise2.complete();
                                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    defaultRaise = defaultRaise7;
                                    defaultRaise.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                }
                            }
                            z = subscribeToPushNotificationUseCase$invoke$1.getOutputSizeshNQ4ISI;
                            i10 = subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                            i11 = subscribeToPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                            i12 = subscribeToPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap;
                            i13 = subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                            str2 = (java.lang.String) subscribeToPushNotificationUseCase$invoke$1.getOutputFormats;
                            str = (java.lang.String) subscribeToPushNotificationUseCase$invoke$1.getInputFormats;
                            pushNotificationToken2 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken) subscribeToPushNotificationUseCase$invoke$1.getInputSizeshNQ4ISI;
                            raise3 = (arrow.core.raise.Raise) subscribeToPushNotificationUseCase$invoke$1.getOutputMinFrameDuration;
                            raise4 = (arrow.core.raise.Raise) subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor;
                            defaultRaise6 = (arrow.core.raise.DefaultRaise) subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj);
                            raise3.bind((arrow.core.Either) obj);
                            com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot2 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot(pushNotificationToken2.getValue(), z, str, str2);
                            com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository pushNotificationTokenRepository32 = this.getHighSpeedVideoSizes;
                            subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes = defaultRaise6;
                            subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise4);
                            subscribeToPushNotificationUseCase$invoke$1.getOutputMinFrameDuration = raise4;
                            subscribeToPushNotificationUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pushNotificationToken2);
                            subscribeToPushNotificationUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            subscribeToPushNotificationUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            subscribeToPushNotificationUseCase$invoke$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenSubscriptionBackendSnapshot2);
                            subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges = i13;
                            subscribeToPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap = i12;
                            subscribeToPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i11;
                            subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i10;
                            subscribeToPushNotificationUseCase$invoke$1.getOutputSizeshNQ4ISI = z;
                            subscribeToPushNotificationUseCase$invoke$1.getOutputSizes = 5;
                            obj = pushNotificationTokenRepository32.saveTokenSubscriptionBackendSnapshot(tokenSubscriptionBackendSnapshot2, subscribeToPushNotificationUseCase$invoke$1);
                            if (obj != coroutine_suspended) {
                                raise5 = raise4;
                                defaultRaise7 = defaultRaise6;
                                raise5.bind((arrow.core.Either) obj);
                                this.getOutputMinFrameDuration.invoke();
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                defaultRaise7.complete();
                                return new arrow.core.Either.Right(unit2);
                            }
                            return coroutine_suspended;
                        }
                        i2 = subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        i3 = subscribeToPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        i4 = subscribeToPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap;
                        i5 = subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        defaultRaise5 = (arrow.core.raise.Raise) subscribeToPushNotificationUseCase$invoke$1.getOutputMinFrameDuration;
                        raise = (arrow.core.raise.Raise) subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor;
                        arrow.core.raise.DefaultRaise defaultRaise9 = (arrow.core.raise.DefaultRaise) subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise6 = defaultRaise9;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise2 = defaultRaise4;
                        defaultRaise2.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                    com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken pushNotificationToken4 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken) defaultRaise5.bind((arrow.core.Either) obj);
                    com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider deviceIdProvider = this.getHighSpeedVideoFpsRangesFor;
                    subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes = defaultRaise6;
                    subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor = raise;
                    subscribeToPushNotificationUseCase$invoke$1.getOutputMinFrameDuration = pushNotificationToken4;
                    subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges = i5;
                    subscribeToPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap = i4;
                    subscribeToPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                    subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i2;
                    subscribeToPushNotificationUseCase$invoke$1.getOutputSizes = 2;
                    deviceId = deviceIdProvider.getDeviceId(subscribeToPushNotificationUseCase$invoke$1);
                    if (deviceId != coroutine_suspended) {
                        raise2 = raise;
                        int i18 = i5;
                        pushNotificationToken = pushNotificationToken4;
                        obj = deviceId;
                        i6 = i3;
                        i7 = i4;
                        i8 = i18;
                        str3 = (java.lang.String) obj;
                        if (str3 != null) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken pushNotificationToken42 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.PushNotificationToken) defaultRaise5.bind((arrow.core.Either) obj);
            com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider deviceIdProvider2 = this.getHighSpeedVideoFpsRangesFor;
            subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizes = defaultRaise6;
            subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoSizesFor = raise;
            subscribeToPushNotificationUseCase$invoke$1.getOutputMinFrameDuration = pushNotificationToken42;
            subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges = i5;
            subscribeToPushNotificationUseCase$invoke$1.Camera2StreamConfigurationMap = i4;
            subscribeToPushNotificationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i3;
            subscribeToPushNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i2;
            subscribeToPushNotificationUseCase$invoke$1.getOutputSizes = 2;
            deviceId = deviceIdProvider2.getDeviceId(subscribeToPushNotificationUseCase$invoke$1);
            if (deviceId != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            e = e3;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        subscribeToPushNotificationUseCase$invoke$1 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SubscribeToPushNotificationUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = subscribeToPushNotificationUseCase$invoke$1.getOutputStallDurationlomOqCM;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscribeToPushNotificationUseCase$invoke$1.getOutputSizes;
    }
}
