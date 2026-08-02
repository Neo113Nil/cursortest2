package com.paypal.oslo.feature.pushnotification.preferences.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/preferences/domain/usecase/UpdatePreferencesUseCase;", "", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/repository/PushPreferenceRepository;", "repository", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;", "deviceIdProvider", "<init>", "(Lcom/paypal/oslo/feature/pushnotification/preferences/domain/repository/PushPreferenceRepository;Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;)V", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PreferencesList;", "pushNotificationPreferences", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/error/PreferencesError;", "", "invoke", "(Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PreferencesList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/repository/PushPreferenceRepository;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UpdatePreferencesUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.preferences.domain.repository.PushPreferenceRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public UpdatePreferencesUseCase(com.paypal.oslo.feature.pushnotification.preferences.domain.repository.PushPreferenceRepository pushPreferenceRepository, com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider deviceIdProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushPreferenceRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceIdProvider, "");
        this.Camera2StreamConfigurationMap = pushPreferenceRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = deviceIdProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[Catch: all -> 0x0076, RaiseCancellationException -> 0x0079, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0079, all -> 0x0076, blocks: (B:29:0x006c, B:31:0x00a5, B:33:0x00a9, B:37:0x00e9, B:38:0x00f3, B:40:0x0085), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9 A[Catch: all -> 0x0076, RaiseCancellationException -> 0x0079, TRY_ENTER, TryCatch #4 {RaiseCancellationException -> 0x0079, all -> 0x0076, blocks: (B:29:0x006c, B:31:0x00a5, B:33:0x00a9, B:37:0x00e9, B:38:0x00f3, B:40:0x0085), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList preferencesList, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pushnotification.preferences.domain.error.PreferencesError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase$invoke$1 updatePreferencesUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        int i2;
        java.lang.Object deviceId;
        com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList preferencesList2;
        int i3;
        int i4;
        arrow.core.raise.Raise raise;
        int i5;
        java.lang.String str;
        arrow.core.raise.DefaultRaise defaultRaise2;
        try {
            if (continuation instanceof com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase$invoke$1) {
                updatePreferencesUseCase$invoke$1 = (com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase$invoke$1) continuation;
                if ((updatePreferencesUseCase$invoke$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                    updatePreferencesUseCase$invoke$1.getOutputFormats -= 2147483648;
                    java.lang.Object obj = updatePreferencesUseCase$invoke$1.getOutputStallDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = updatePreferencesUseCase$invoke$1.getOutputFormats;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        i2 = 0;
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider deviceIdProvider = this.getHighResolutionOutputSizeshNQ4ISI;
                        updatePreferencesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = preferencesList;
                        updatePreferencesUseCase$invoke$1.getInputFormats = defaultRaise;
                        updatePreferencesUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise3;
                        updatePreferencesUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        updatePreferencesUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        updatePreferencesUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        updatePreferencesUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        updatePreferencesUseCase$invoke$1.getOutputFormats = 1;
                        deviceId = deviceIdProvider.getDeviceId(updatePreferencesUseCase$invoke$1);
                        if (deviceId != coroutine_suspended) {
                            preferencesList2 = preferencesList;
                            i3 = 0;
                            i4 = 0;
                            raise = defaultRaise3;
                            i5 = 0;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = updatePreferencesUseCase$invoke$1.getHighSpeedVideoSizes;
                        int i7 = updatePreferencesUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        int i8 = updatePreferencesUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        int i9 = updatePreferencesUseCase$invoke$1.Camera2StreamConfigurationMap;
                        raise = (arrow.core.raise.Raise) updatePreferencesUseCase$invoke$1.getOutputMinFrameDuration;
                        defaultRaise2 = (arrow.core.raise.DefaultRaise) updatePreferencesUseCase$invoke$1.getInputFormats;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            raise.bind((arrow.core.Either) obj);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            defaultRaise2.complete();
                            return new arrow.core.Either.Right(unit);
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise2;
                            defaultRaise4.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise4));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise2;
                            defaultRaise5.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    int i10 = updatePreferencesUseCase$invoke$1.getHighSpeedVideoSizes;
                    i5 = updatePreferencesUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    int i11 = updatePreferencesUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    int i12 = updatePreferencesUseCase$invoke$1.Camera2StreamConfigurationMap;
                    arrow.core.raise.Raise raise2 = (arrow.core.raise.Raise) updatePreferencesUseCase$invoke$1.getInputSizeshNQ4ISI;
                    defaultRaise = (arrow.core.raise.DefaultRaise) updatePreferencesUseCase$invoke$1.getInputFormats;
                    preferencesList2 = (com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList) updatePreferencesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i2 = i10;
                    raise = raise2;
                    i4 = i12;
                    i3 = i11;
                    deviceId = obj;
                    str = (java.lang.String) deviceId;
                    if (str != null) {
                        raise.raise(com.paypal.oslo.feature.pushnotification.preferences.domain.error.PreferencesError.Business.DeviceIdGenerationFailed.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.oslo.feature.pushnotification.preferences.domain.repository.PushPreferenceRepository pushPreferenceRepository = this.Camera2StreamConfigurationMap;
                    updatePreferencesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(preferencesList2);
                    updatePreferencesUseCase$invoke$1.getInputFormats = defaultRaise;
                    updatePreferencesUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise);
                    updatePreferencesUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    updatePreferencesUseCase$invoke$1.getOutputMinFrameDuration = raise;
                    updatePreferencesUseCase$invoke$1.Camera2StreamConfigurationMap = i4;
                    updatePreferencesUseCase$invoke$1.getHighSpeedVideoFpsRanges = i3;
                    updatePreferencesUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i5;
                    updatePreferencesUseCase$invoke$1.getHighSpeedVideoSizes = i2;
                    updatePreferencesUseCase$invoke$1.getOutputFormats = 2;
                    obj = pushPreferenceRepository.updatePreferences(str, preferencesList2, updatePreferencesUseCase$invoke$1);
                    if (obj != coroutine_suspended) {
                        defaultRaise2 = defaultRaise;
                        raise.bind((arrow.core.Either) obj);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        defaultRaise2.complete();
                        return new arrow.core.Either.Right(unit2);
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            str = (java.lang.String) deviceId;
            if (str != null) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        updatePreferencesUseCase$invoke$1 = new com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = updatePreferencesUseCase$invoke$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updatePreferencesUseCase$invoke$1.getOutputFormats;
    }
}
