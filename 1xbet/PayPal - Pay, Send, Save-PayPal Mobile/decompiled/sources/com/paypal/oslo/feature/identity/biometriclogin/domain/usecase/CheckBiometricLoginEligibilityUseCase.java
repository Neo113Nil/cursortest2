package com.paypal.oslo.feature.identity.biometriclogin.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/CheckBiometricLoginEligibilityUseCase;", "", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;", "getRememberedUserUseCase", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/repository/BiometricEligibilityRepository;", "biometricEligibilityRepository", "<init>", "(Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;Lcom/paypal/oslo/feature/identity/biometriclogin/domain/repository/BiometricEligibilityRepository;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/model/RememberedUser;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/repository/BiometricEligibilityRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckBiometricLoginEligibilityUseCase {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CheckBiometricLoginEligibilityUseCase(com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase, com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository biometricEligibilityRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRememberedUserUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricEligibilityRepository, "");
        this.getHighSpeedVideoSizes = getRememberedUserUseCase;
        this.getHighSpeedVideoFpsRanges = biometricEligibilityRepository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9 A[Catch: all -> 0x0073, RaiseCancellationException -> 0x0076, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0076, all -> 0x0073, blocks: (B:29:0x0068, B:31:0x00a3, B:34:0x00a9, B:35:0x00cc, B:41:0x00bf, B:42:0x0108, B:43:0x010d, B:45:0x0082), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r7v5, types: [arrow.core.raise.Raise] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError, com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser>> continuation) {
        com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.CheckBiometricLoginEligibilityUseCase$invoke$1 checkBiometricLoginEligibilityUseCase$invoke$1;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        int i2;
        int i3;
        int i4;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        int i5;
        arrow.core.Either either;
        arrow.core.Either right;
        java.lang.Object isEligibleForLogin;
        com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser;
        arrow.core.raise.DefaultRaise defaultRaise3;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.CheckBiometricLoginEligibilityUseCase$invoke$1) {
                checkBiometricLoginEligibilityUseCase$invoke$1 = (com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.CheckBiometricLoginEligibilityUseCase$invoke$1) continuation;
                if ((checkBiometricLoginEligibilityUseCase$invoke$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                    checkBiometricLoginEligibilityUseCase$invoke$1.getOutputFormats -= 2147483648;
                    java.lang.Object obj = checkBiometricLoginEligibilityUseCase$invoke$1.getOutputMinFrameDuration;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = checkBiometricLoginEligibilityUseCase$invoke$1.getOutputFormats;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise;
                        com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase = this.getHighSpeedVideoSizes;
                        checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges = defaultRaise;
                        checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoSizesFor = defaultRaise4;
                        checkBiometricLoginEligibilityUseCase$invoke$1.getInputFormats = defaultRaise4;
                        checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        checkBiometricLoginEligibilityUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        checkBiometricLoginEligibilityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        checkBiometricLoginEligibilityUseCase$invoke$1.getOutputFormats = 1;
                        obj = getRememberedUserUseCase.invoke(checkBiometricLoginEligibilityUseCase$invoke$1);
                        if (obj != coroutine_suspended) {
                            i2 = 0;
                            i3 = 0;
                            i4 = 0;
                            defaultRaise2 = defaultRaise4;
                            raise = defaultRaise2;
                            i5 = 0;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = checkBiometricLoginEligibilityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i7 = checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoSizes;
                        int i8 = checkBiometricLoginEligibilityUseCase$invoke$1.Camera2StreamConfigurationMap;
                        int i9 = checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        rememberedUser = (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser) checkBiometricLoginEligibilityUseCase$invoke$1.getInputSizeshNQ4ISI;
                        raise = (arrow.core.raise.Raise) checkBiometricLoginEligibilityUseCase$invoke$1.getInputFormats;
                        defaultRaise3 = (arrow.core.raise.DefaultRaise) checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            raise.bind((arrow.core.Either) obj);
                            defaultRaise3.complete();
                            return new arrow.core.Either.Right(rememberedUser);
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise3;
                            defaultRaise5.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise5));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            arrow.core.raise.DefaultRaise defaultRaise6 = defaultRaise3;
                            defaultRaise6.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    int i10 = checkBiometricLoginEligibilityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i11 = checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i12 = checkBiometricLoginEligibilityUseCase$invoke$1.Camera2StreamConfigurationMap;
                    int i13 = checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    ?? r7 = (arrow.core.raise.Raise) checkBiometricLoginEligibilityUseCase$invoke$1.getInputFormats;
                    arrow.core.raise.Raise raise2 = (arrow.core.raise.Raise) checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    defaultRaise = (arrow.core.raise.DefaultRaise) checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i2 = i10;
                    raise = raise2;
                    defaultRaise2 = r7;
                    i5 = i13;
                    i4 = i12;
                    i3 = i11;
                    either = (arrow.core.Either) obj;
                    if (!(either instanceof arrow.core.Either.Left)) {
                        right = new arrow.core.Either.Left(com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.NotEligible.INSTANCE);
                    } else {
                        if (!(either instanceof arrow.core.Either.Right)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                    }
                    com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser2 = (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser) defaultRaise2.bind(right);
                    com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository biometricEligibilityRepository = this.getHighSpeedVideoFpsRanges;
                    checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges = defaultRaise;
                    checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise);
                    checkBiometricLoginEligibilityUseCase$invoke$1.getInputFormats = raise;
                    checkBiometricLoginEligibilityUseCase$invoke$1.getInputSizeshNQ4ISI = rememberedUser2;
                    checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i5;
                    checkBiometricLoginEligibilityUseCase$invoke$1.Camera2StreamConfigurationMap = i4;
                    checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoSizes = i3;
                    checkBiometricLoginEligibilityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                    checkBiometricLoginEligibilityUseCase$invoke$1.getOutputFormats = 2;
                    isEligibleForLogin = biometricEligibilityRepository.isEligibleForLogin(checkBiometricLoginEligibilityUseCase$invoke$1);
                    if (isEligibleForLogin != coroutine_suspended) {
                        rememberedUser = rememberedUser2;
                        obj = isEligibleForLogin;
                        defaultRaise3 = defaultRaise;
                        raise.bind((arrow.core.Either) obj);
                        defaultRaise3.complete();
                        return new arrow.core.Either.Right(rememberedUser);
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            either = (arrow.core.Either) obj;
            if (!(either instanceof arrow.core.Either.Left)) {
            }
            com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser22 = (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser) defaultRaise2.bind(right);
            com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository biometricEligibilityRepository2 = this.getHighSpeedVideoFpsRanges;
            checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges = defaultRaise;
            checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise);
            checkBiometricLoginEligibilityUseCase$invoke$1.getInputFormats = raise;
            checkBiometricLoginEligibilityUseCase$invoke$1.getInputSizeshNQ4ISI = rememberedUser22;
            checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i5;
            checkBiometricLoginEligibilityUseCase$invoke$1.Camera2StreamConfigurationMap = i4;
            checkBiometricLoginEligibilityUseCase$invoke$1.getHighSpeedVideoSizes = i3;
            checkBiometricLoginEligibilityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i2;
            checkBiometricLoginEligibilityUseCase$invoke$1.getOutputFormats = 2;
            isEligibleForLogin = biometricEligibilityRepository2.isEligibleForLogin(checkBiometricLoginEligibilityUseCase$invoke$1);
            if (isEligibleForLogin != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        checkBiometricLoginEligibilityUseCase$invoke$1 = new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.CheckBiometricLoginEligibilityUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = checkBiometricLoginEligibilityUseCase$invoke$1.getOutputMinFrameDuration;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = checkBiometricLoginEligibilityUseCase$invoke$1.getOutputFormats;
    }
}
