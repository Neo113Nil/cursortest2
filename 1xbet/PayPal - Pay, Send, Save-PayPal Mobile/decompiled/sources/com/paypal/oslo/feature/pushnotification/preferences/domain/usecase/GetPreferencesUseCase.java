package com.paypal.oslo.feature.pushnotification.preferences.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/preferences/domain/usecase/GetPreferencesUseCase;", "", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/repository/PushPreferenceRepository;", "repository", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;", "deviceIdProvider", "<init>", "(Lcom/paypal/oslo/feature/pushnotification/preferences/domain/repository/PushPreferenceRepository;Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/error/PreferencesError;", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PreferencesList;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/repository/PushPreferenceRepository;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetPreferencesUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.preferences.domain.repository.PushPreferenceRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetPreferencesUseCase(com.paypal.oslo.feature.pushnotification.preferences.domain.repository.PushPreferenceRepository pushPreferenceRepository, com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider deviceIdProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushPreferenceRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceIdProvider, "");
        this.getHighSpeedVideoSizes = pushPreferenceRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = deviceIdProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[Catch: all -> 0x0068, RaiseCancellationException -> 0x006b, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x006b, all -> 0x0068, blocks: (B:29:0x0064, B:30:0x0095, B:32:0x0099, B:36:0x00d5, B:37:0x00df, B:39:0x0077), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5 A[Catch: all -> 0x0068, RaiseCancellationException -> 0x006b, TRY_ENTER, TryCatch #4 {RaiseCancellationException -> 0x006b, all -> 0x0068, blocks: (B:29:0x0064, B:30:0x0095, B:32:0x0099, B:36:0x00d5, B:37:0x00df, B:39:0x0077), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pushnotification.preferences.domain.error.PreferencesError, com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList>> continuation) {
        com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.GetPreferencesUseCase$invoke$1 getPreferencesUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        int i2;
        arrow.core.raise.Raise raise;
        int i3;
        int i4;
        int i5;
        java.lang.String str;
        arrow.core.raise.Raise raise2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        try {
            if (continuation instanceof com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.GetPreferencesUseCase$invoke$1) {
                getPreferencesUseCase$invoke$1 = (com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.GetPreferencesUseCase$invoke$1) continuation;
                if ((getPreferencesUseCase$invoke$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                    getPreferencesUseCase$invoke$1.getHighSpeedVideoSizesFor -= 2147483648;
                    java.lang.Object obj = getPreferencesUseCase$invoke$1.getOutputMinFrameDuration;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = getPreferencesUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        i2 = 0;
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider deviceIdProvider = this.getHighResolutionOutputSizeshNQ4ISI;
                        getPreferencesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = defaultRaise;
                        getPreferencesUseCase$invoke$1.getOutputFormats = defaultRaise3;
                        getPreferencesUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        getPreferencesUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        getPreferencesUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        getPreferencesUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        getPreferencesUseCase$invoke$1.getHighSpeedVideoSizesFor = 1;
                        java.lang.Object deviceId = deviceIdProvider.getDeviceId(getPreferencesUseCase$invoke$1);
                        if (deviceId != coroutine_suspended) {
                            raise = defaultRaise3;
                            i3 = 0;
                            i4 = 0;
                            obj = deviceId;
                            i5 = 0;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = getPreferencesUseCase$invoke$1.Camera2StreamConfigurationMap;
                        int i7 = getPreferencesUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        int i8 = getPreferencesUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        int i9 = getPreferencesUseCase$invoke$1.getHighSpeedVideoSizes;
                        raise2 = (arrow.core.raise.Raise) getPreferencesUseCase$invoke$1.getInputSizeshNQ4ISI;
                        defaultRaise2 = (arrow.core.raise.DefaultRaise) getPreferencesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList preferencesList = (com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList) raise2.bind((arrow.core.Either) obj);
                            defaultRaise2.complete();
                            return new arrow.core.Either.Right(preferencesList);
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
                    i2 = getPreferencesUseCase$invoke$1.Camera2StreamConfigurationMap;
                    i5 = getPreferencesUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    i3 = getPreferencesUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    i4 = getPreferencesUseCase$invoke$1.getHighSpeedVideoSizes;
                    raise = (arrow.core.raise.Raise) getPreferencesUseCase$invoke$1.getOutputFormats;
                    defaultRaise = (arrow.core.raise.DefaultRaise) getPreferencesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str = (java.lang.String) obj;
                    if (str != null) {
                        raise.raise(com.paypal.oslo.feature.pushnotification.preferences.domain.error.PreferencesError.Business.DeviceIdGenerationFailed.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.oslo.feature.pushnotification.preferences.domain.repository.PushPreferenceRepository pushPreferenceRepository = this.getHighSpeedVideoSizes;
                    getPreferencesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = defaultRaise;
                    getPreferencesUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise);
                    getPreferencesUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    getPreferencesUseCase$invoke$1.getInputSizeshNQ4ISI = raise;
                    getPreferencesUseCase$invoke$1.getHighSpeedVideoSizes = i4;
                    getPreferencesUseCase$invoke$1.getHighSpeedVideoFpsRanges = i3;
                    getPreferencesUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i5;
                    getPreferencesUseCase$invoke$1.Camera2StreamConfigurationMap = i2;
                    getPreferencesUseCase$invoke$1.getHighSpeedVideoSizesFor = 2;
                    obj = pushPreferenceRepository.getPreferencesList(str, getPreferencesUseCase$invoke$1);
                    if (obj != coroutine_suspended) {
                        raise2 = raise;
                        defaultRaise2 = defaultRaise;
                        com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList preferencesList2 = (com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList) raise2.bind((arrow.core.Either) obj);
                        defaultRaise2.complete();
                        return new arrow.core.Either.Right(preferencesList2);
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
        getPreferencesUseCase$invoke$1 = new com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.GetPreferencesUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getPreferencesUseCase$invoke$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getPreferencesUseCase$invoke$1.getHighSpeedVideoSizesFor;
    }
}
