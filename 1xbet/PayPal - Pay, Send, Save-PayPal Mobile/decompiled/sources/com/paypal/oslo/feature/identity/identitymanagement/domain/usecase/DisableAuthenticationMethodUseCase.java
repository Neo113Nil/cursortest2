package com.paypal.oslo.feature.identity.identitymanagement.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/identitymanagement/domain/usecase/DisableAuthenticationMethodUseCase;", "", "Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/usecase/DeviceUnbindingUseCase;", "deviceUnbindingUseCase", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "tokenStorage", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceAuthPreferenceStorage;", "preferenceStorage", "<init>", "(Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/usecase/DeviceUnbindingUseCase;Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceAuthPreferenceStorage;)V", "Lcom/paypal/oslo/feature/identity/api/AuthenticationMethod;", "authenticationMethod", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/api/model/IdentityManagementError;", "", "invoke", "(Lcom/paypal/oslo/feature/identity/api/AuthenticationMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/usecase/DeviceUnbindingUseCase;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceAuthPreferenceStorage;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DisableAuthenticationMethodUseCase {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.Companion Companion = new com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String INVALID_SERVER_RESPONSE_MESSAGE = "Invalid server response";

    @java.lang.Deprecated
    public static final java.lang.String NETWORK_ERROR_CODE = "NETWORK";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.deviceunbinding.domain.usecase.DeviceUnbindingUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public DisableAuthenticationMethodUseCase(com.paypal.oslo.feature.identity.deviceunbinding.domain.usecase.DeviceUnbindingUseCase deviceUnbindingUseCase, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage deviceAuthPreferenceStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceUnbindingUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindingTokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceAuthPreferenceStorage, "");
        this.getHighSpeedVideoSizes = deviceUnbindingUseCase;
        this.getHighSpeedVideoFpsRangesFor = deviceBindingTokenStorage;
        this.getHighSpeedVideoFpsRanges = deviceAuthPreferenceStorage;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014e A[Catch: all -> 0x0358, RaiseCancellationException -> 0x035d, TRY_LEAVE, TryCatch #13 {RaiseCancellationException -> 0x035d, all -> 0x0358, blocks: (B:71:0x0147, B:73:0x014e), top: B:70:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.AuthenticationMethod authenticationMethod, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.api.model.IdentityManagementError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase$invoke$1 disableAuthenticationMethodUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingInput deviceUnbindingInput;
        com.paypal.oslo.feature.identity.api.AuthenticationMethod authenticationMethod2;
        int i2;
        int i3;
        int i4;
        int i5;
        arrow.core.Either either;
        com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NotEnabled notEnabled;
        com.paypal.oslo.feature.identity.api.model.IdentityManagementError identityManagementError;
        com.paypal.oslo.feature.identity.api.model.LLSDisableError.NotEnabled notEnabled2;
        com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingOutput deviceUnbindingOutput;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        com.paypal.oslo.feature.identity.api.AuthenticationMethod authenticationMethod3;
        int i6;
        arrow.core.raise.DefaultRaise defaultRaise2;
        int i7;
        int i8;
        int i9;
        int i10;
        com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod;
        int i11;
        java.lang.Object obj4;
        arrow.core.raise.DefaultRaise defaultRaise3;
        java.lang.Object disabledByUser;
        java.lang.Object obj5;
        com.paypal.oslo.feature.identity.api.AuthenticationMethod authenticationMethod4;
        java.lang.String message;
        try {
            try {
                if (continuation instanceof com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase$invoke$1) {
                    disableAuthenticationMethodUseCase$invoke$1 = (com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase$invoke$1) continuation;
                    if ((disableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                        disableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                        java.lang.Object obj6 = disableAuthenticationMethodUseCase$invoke$1.getOutputSizeshNQ4ISI;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = disableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj6);
                            defaultRaise = new arrow.core.raise.DefaultRaise(false);
                            try {
                                arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise;
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Disabling authentication method", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("method", authenticationMethod.name())), null, 4, null);
                                com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingInput deviceUnbindingInput2 = new com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingInput(com.paypal.oslo.feature.identity.identitymanagement.domain.mapper.AuthenticationMethodMapperKt.toDeviceAuthMethod(authenticationMethod));
                                com.paypal.oslo.feature.identity.deviceunbinding.domain.usecase.DeviceUnbindingUseCase deviceUnbindingUseCase = this.getHighSpeedVideoSizes;
                                disableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDuration = authenticationMethod;
                                disableAuthenticationMethodUseCase$invoke$1.getOutputFormats = defaultRaise;
                                disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizesFor = defaultRaise4;
                                disableAuthenticationMethodUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceUnbindingInput2);
                                disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                                disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                                disableAuthenticationMethodUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                disableAuthenticationMethodUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                                disableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = 1;
                                java.lang.Object invoke = deviceUnbindingUseCase.invoke(deviceUnbindingInput2, disableAuthenticationMethodUseCase$invoke$1);
                                if (invoke != coroutine_suspended) {
                                    raise = defaultRaise4;
                                    deviceUnbindingInput = deviceUnbindingInput2;
                                    obj6 = invoke;
                                    authenticationMethod2 = authenticationMethod;
                                    i2 = 0;
                                    i3 = 0;
                                    i4 = 0;
                                    i5 = 0;
                                }
                                return coroutine_suspended;
                            } catch (arrow.core.raise.RaiseCancellationException e) {
                                e = e;
                                defaultRaise.complete();
                                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                            } catch (java.lang.Throwable th) {
                                th = th;
                                defaultRaise.complete();
                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                            }
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i12 = disableAuthenticationMethodUseCase$invoke$1.getInputSizeshNQ4ISI;
                                int i13 = disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                int i14 = disableAuthenticationMethodUseCase$invoke$1.Camera2StreamConfigurationMap;
                                int i15 = disableAuthenticationMethodUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                int i16 = disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                int i17 = disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizes;
                                defaultRaise3 = (arrow.core.raise.DefaultRaise) disableAuthenticationMethodUseCase$invoke$1.getOutputFormats;
                                authenticationMethod4 = (com.paypal.oslo.feature.identity.api.AuthenticationMethod) disableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDuration;
                                try {
                                    try {
                                        kotlin.ResultKt.throwOnFailure(obj6);
                                        obj = "error";
                                        obj3 = "method";
                                        try {
                                            obj4 = obj3;
                                        } catch (java.lang.Exception e2) {
                                            e = e2;
                                            obj4 = obj3;
                                        }
                                    } catch (java.lang.Exception e3) {
                                        e = e3;
                                        obj = "error";
                                        obj4 = "method";
                                        authenticationMethod3 = authenticationMethod4;
                                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                                        pairArr[0] = kotlin.TuplesKt.to(obj4, authenticationMethod3.name());
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        pairArr[1] = kotlin.TuplesKt.to(obj, message);
                                        com.paypal.android.logger.Logger.w$default(logger, "Failed to save disabled authentication preference", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                        defaultRaise3.complete();
                                        return new arrow.core.Either.Right(unit);
                                    }
                                    try {
                                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Saved user preference - method disabled by user", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj4, authenticationMethod4.name())), null, 4, null);
                                    } catch (java.lang.Exception e4) {
                                        e = e4;
                                        authenticationMethod3 = authenticationMethod4;
                                        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.identity.LoggerKt.log;
                                        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                                        pairArr2[0] = kotlin.TuplesKt.to(obj4, authenticationMethod3.name());
                                        message = e.getMessage();
                                        if (message == null) {
                                        }
                                        pairArr2[1] = kotlin.TuplesKt.to(obj, message);
                                        com.paypal.android.logger.Logger.w$default(logger2, "Failed to save disabled authentication preference", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                        defaultRaise3.complete();
                                        return new arrow.core.Either.Right(unit2);
                                    }
                                    kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                                    defaultRaise3.complete();
                                    return new arrow.core.Either.Right(unit22);
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
                            int i18 = disableAuthenticationMethodUseCase$invoke$1.getInputSizeshNQ4ISI;
                            int i19 = disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                            int i20 = disableAuthenticationMethodUseCase$invoke$1.Camera2StreamConfigurationMap;
                            int i21 = disableAuthenticationMethodUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                            int i22 = disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                            int i23 = disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizes;
                            deviceAuthMethod = (com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) disableAuthenticationMethodUseCase$invoke$1.getOutputStallDurationlomOqCM;
                            deviceUnbindingOutput = (com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingOutput) disableAuthenticationMethodUseCase$invoke$1.getOutputStallDuration;
                            either = (arrow.core.Either) disableAuthenticationMethodUseCase$invoke$1.getOutputSizes;
                            deviceUnbindingInput = (com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingInput) disableAuthenticationMethodUseCase$invoke$1.getInputFormats;
                            arrow.core.raise.Raise raise2 = (arrow.core.raise.Raise) disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizesFor;
                            arrow.core.raise.DefaultRaise defaultRaise5 = (arrow.core.raise.DefaultRaise) disableAuthenticationMethodUseCase$invoke$1.getOutputFormats;
                            authenticationMethod3 = (com.paypal.oslo.feature.identity.api.AuthenticationMethod) disableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDuration;
                            kotlin.ResultKt.throwOnFailure(obj6);
                            i11 = i18;
                            obj2 = coroutine_suspended;
                            obj3 = "method";
                            i6 = i23;
                            i8 = i22;
                            i10 = i21;
                            i7 = i20;
                            i9 = i19;
                            raise = raise2;
                            obj = "error";
                            defaultRaise2 = defaultRaise5;
                            try {
                                com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage deviceAuthPreferenceStorage = this.getHighSpeedVideoFpsRanges;
                                disableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDuration = authenticationMethod3;
                                disableAuthenticationMethodUseCase$invoke$1.getOutputFormats = defaultRaise2;
                                disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise);
                                disableAuthenticationMethodUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceUnbindingInput);
                                disableAuthenticationMethodUseCase$invoke$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                                disableAuthenticationMethodUseCase$invoke$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceUnbindingOutput);
                                disableAuthenticationMethodUseCase$invoke$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceAuthMethod);
                                disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizes = i6;
                                disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i8;
                                disableAuthenticationMethodUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i10;
                                disableAuthenticationMethodUseCase$invoke$1.Camera2StreamConfigurationMap = i7;
                                disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRanges = i9;
                                disableAuthenticationMethodUseCase$invoke$1.getInputSizeshNQ4ISI = i11;
                                disableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = 3;
                                disabledByUser = deviceAuthPreferenceStorage.setDisabledByUser(deviceAuthMethod, true, disableAuthenticationMethodUseCase$invoke$1);
                                obj5 = obj2;
                            } catch (arrow.core.raise.RaiseCancellationException e6) {
                                e = e6;
                                defaultRaise = defaultRaise2;
                                defaultRaise.complete();
                                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                            } catch (java.lang.Exception e7) {
                                e = e7;
                                obj4 = obj3;
                                defaultRaise3 = defaultRaise2;
                                com.paypal.android.logger.Logger logger22 = com.paypal.oslo.feature.identity.LoggerKt.log;
                                kotlin.Pair[] pairArr22 = new kotlin.Pair[2];
                                pairArr22[0] = kotlin.TuplesKt.to(obj4, authenticationMethod3.name());
                                message = e.getMessage();
                                if (message == null) {
                                }
                                pairArr22[1] = kotlin.TuplesKt.to(obj, message);
                                com.paypal.android.logger.Logger.w$default(logger22, "Failed to save disabled authentication preference", kotlin.collections.MapsKt.mapOf(pairArr22), null, 4, null);
                                kotlin.Unit unit222 = kotlin.Unit.INSTANCE;
                                defaultRaise3.complete();
                                return new arrow.core.Either.Right(unit222);
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                defaultRaise = defaultRaise2;
                                defaultRaise.complete();
                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                            }
                            if (disabledByUser != obj5) {
                                return obj5;
                            }
                            authenticationMethod4 = authenticationMethod3;
                            defaultRaise3 = defaultRaise2;
                            obj4 = obj3;
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Saved user preference - method disabled by user", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj4, authenticationMethod4.name())), null, 4, null);
                            kotlin.Unit unit2222 = kotlin.Unit.INSTANCE;
                            defaultRaise3.complete();
                            return new arrow.core.Either.Right(unit2222);
                        }
                        int i24 = disableAuthenticationMethodUseCase$invoke$1.Camera2StreamConfigurationMap;
                        i2 = disableAuthenticationMethodUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i25 = disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        int i26 = disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizes;
                        deviceUnbindingInput = (com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingInput) disableAuthenticationMethodUseCase$invoke$1.getInputFormats;
                        raise = (arrow.core.raise.Raise) disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizesFor;
                        arrow.core.raise.DefaultRaise defaultRaise6 = (arrow.core.raise.DefaultRaise) disableAuthenticationMethodUseCase$invoke$1.getOutputFormats;
                        authenticationMethod2 = (com.paypal.oslo.feature.identity.api.AuthenticationMethod) disableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDuration;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj6);
                            i4 = i25;
                            i5 = i26;
                            i3 = i24;
                            defaultRaise = defaultRaise6;
                        } catch (arrow.core.raise.RaiseCancellationException e8) {
                            e = e8;
                            defaultRaise = defaultRaise6;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            defaultRaise = defaultRaise6;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                        either = (arrow.core.Either) obj6;
                        if (!(either instanceof arrow.core.Either.Right)) {
                            deviceUnbindingOutput = (com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingOutput) ((arrow.core.Either.Right) either).getValue();
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Successfully disabled authentication method", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("method", authenticationMethod2.name())), null, 4, null);
                            com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod2 = com.paypal.oslo.feature.identity.identitymanagement.domain.mapper.AuthenticationMethodMapperKt.toDeviceAuthMethod(authenticationMethod2);
                            obj = "error";
                            com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage = this.getHighSpeedVideoFpsRangesFor;
                            disableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDuration = authenticationMethod2;
                            disableAuthenticationMethodUseCase$invoke$1.getOutputFormats = defaultRaise;
                            arrow.core.raise.DefaultRaise defaultRaise7 = defaultRaise;
                            disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise);
                            disableAuthenticationMethodUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceUnbindingInput);
                            disableAuthenticationMethodUseCase$invoke$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                            disableAuthenticationMethodUseCase$invoke$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceUnbindingOutput);
                            disableAuthenticationMethodUseCase$invoke$1.getOutputStallDurationlomOqCM = deviceAuthMethod2;
                            disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizes = i5;
                            disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i4;
                            disableAuthenticationMethodUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                            disableAuthenticationMethodUseCase$invoke$1.Camera2StreamConfigurationMap = i3;
                            disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                            disableAuthenticationMethodUseCase$invoke$1.getInputSizeshNQ4ISI = 0;
                            disableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = 2;
                            if (deviceBindingTokenStorage.clearBindingToken(deviceAuthMethod2, disableAuthenticationMethodUseCase$invoke$1) != coroutine_suspended) {
                                obj2 = coroutine_suspended;
                                obj3 = "method";
                                authenticationMethod3 = authenticationMethod2;
                                i6 = i5;
                                defaultRaise2 = defaultRaise7;
                                i7 = i3;
                                i8 = i4;
                                i9 = 0;
                                i10 = i2;
                                deviceAuthMethod = deviceAuthMethod2;
                                i11 = 0;
                                com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage deviceAuthPreferenceStorage2 = this.getHighSpeedVideoFpsRanges;
                                disableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDuration = authenticationMethod3;
                                disableAuthenticationMethodUseCase$invoke$1.getOutputFormats = defaultRaise2;
                                disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise);
                                disableAuthenticationMethodUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceUnbindingInput);
                                disableAuthenticationMethodUseCase$invoke$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                                disableAuthenticationMethodUseCase$invoke$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceUnbindingOutput);
                                disableAuthenticationMethodUseCase$invoke$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceAuthMethod);
                                disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizes = i6;
                                disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i8;
                                disableAuthenticationMethodUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i10;
                                disableAuthenticationMethodUseCase$invoke$1.Camera2StreamConfigurationMap = i7;
                                disableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRanges = i9;
                                disableAuthenticationMethodUseCase$invoke$1.getInputSizeshNQ4ISI = i11;
                                disableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = 3;
                                disabledByUser = deviceAuthPreferenceStorage2.setDisabledByUser(deviceAuthMethod, true, disableAuthenticationMethodUseCase$invoke$1);
                                obj5 = obj2;
                                if (disabledByUser != obj5) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (either instanceof arrow.core.Either.Left) {
                            com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError deviceUnbindingError = (com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError) ((arrow.core.Either.Left) either).getValue();
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Failed to disable authentication method", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("method", authenticationMethod2.name()), kotlin.TuplesKt.to("error", deviceUnbindingError.getDescription())), null, null, 12, null);
                            int i27 = com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.WhenMappings.$EnumSwitchMapping$0[authenticationMethod2.ordinal()];
                            if (i27 == 1) {
                                if (deviceUnbindingError instanceof com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.MethodNotEligible) {
                                    notEnabled = com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NotEnabled.INSTANCE;
                                } else if (deviceUnbindingError instanceof com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Network) {
                                    notEnabled = new com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NetworkError(((com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Network) deviceUnbindingError).getMessage(), NETWORK_ERROR_CODE);
                                } else if (deviceUnbindingError instanceof com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Server) {
                                    notEnabled = new com.paypal.oslo.feature.identity.api.model.BiometricDisableError.UnknownError(((com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Server) deviceUnbindingError).getMessage());
                                } else {
                                    if (!(deviceUnbindingError instanceof com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.InvalidServerResponse)) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    notEnabled = new com.paypal.oslo.feature.identity.api.model.BiometricDisableError.UnknownError(INVALID_SERVER_RESPONSE_MESSAGE);
                                }
                                identityManagementError = notEnabled;
                            } else {
                                if (i27 != 2) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                if (deviceUnbindingError instanceof com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.MethodNotEligible) {
                                    notEnabled2 = com.paypal.oslo.feature.identity.api.model.LLSDisableError.NotEnabled.INSTANCE;
                                } else if (deviceUnbindingError instanceof com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Network) {
                                    notEnabled2 = new com.paypal.oslo.feature.identity.api.model.LLSDisableError.NetworkError(((com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Network) deviceUnbindingError).getMessage(), NETWORK_ERROR_CODE);
                                } else if (deviceUnbindingError instanceof com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Server) {
                                    notEnabled2 = new com.paypal.oslo.feature.identity.api.model.LLSDisableError.UnknownError(((com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Server) deviceUnbindingError).getMessage());
                                } else {
                                    if (!(deviceUnbindingError instanceof com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.InvalidServerResponse)) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    notEnabled2 = new com.paypal.oslo.feature.identity.api.model.LLSDisableError.UnknownError(INVALID_SERVER_RESPONSE_MESSAGE);
                                }
                                identityManagementError = notEnabled2;
                            }
                            raise.raise(identityManagementError);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                either = (arrow.core.Either) obj6;
                if (!(either instanceof arrow.core.Either.Right)) {
                }
            } catch (arrow.core.raise.RaiseCancellationException e9) {
                e = e9;
                arrow.core.raise.DefaultRaise defaultRaise8 = defaultRaise;
                defaultRaise = defaultRaise8;
                defaultRaise.complete();
                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
            } catch (java.lang.Throwable th5) {
                th = th5;
                arrow.core.raise.DefaultRaise defaultRaise9 = defaultRaise;
                defaultRaise = defaultRaise9;
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
            if (i != 0) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e10) {
            e = e10;
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        disableAuthenticationMethodUseCase$invoke$1 = new com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase$invoke$1(this, continuation);
        java.lang.Object obj62 = disableAuthenticationMethodUseCase$invoke$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = disableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/identitymanagement/domain/usecase/DisableAuthenticationMethodUseCase$Companion;", "", "<init>", "()V", "", "NETWORK_ERROR_CODE", "Ljava/lang/String;", "INVALID_SERVER_RESPONSE_MESSAGE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.api.AuthenticationMethod.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.api.AuthenticationMethod.BIOMETRIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.api.AuthenticationMethod.LLS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
