package com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/usecase/EnrollmentPasskeyEligibilityUseCase;", "", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/usecase/SystemPasskeyEligibilityUseCase;", "systemPasskeyEligibilityUseCase", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/repository/RememberedLoginRepository;", "rememberedLoginRepository", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/usecase/SystemPasskeyEligibilityUseCase;Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/repository/RememberedLoginRepository;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/usecase/SystemPasskeyEligibilityUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/repository/RememberedLoginRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EnrollmentPasskeyEligibilityUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public EnrollmentPasskeyEligibilityUseCase(com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase systemPasskeyEligibilityUseCase, com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository rememberedLoginRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemPasskeyEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rememberedLoginRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = systemPasskeyEligibilityUseCase;
        this.getHighSpeedVideoSizes = rememberedLoginRepository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r8v4, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r9v4, types: [arrow.core.raise.Raise] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.EnrollmentPasskeyEligibilityUseCase$invoke$1 enrollmentPasskeyEligibilityUseCase$invoke$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        int i2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        int i3;
        int i4;
        int i5;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise4;
        com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser;
        java.util.List<com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyAllowedCredential> allowedCredentials;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.EnrollmentPasskeyEligibilityUseCase$invoke$1) {
                enrollmentPasskeyEligibilityUseCase$invoke$1 = (com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.EnrollmentPasskeyEligibilityUseCase$invoke$1) continuation;
                if ((enrollmentPasskeyEligibilityUseCase$invoke$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    enrollmentPasskeyEligibilityUseCase$invoke$1.getInputSizeshNQ4ISI -= 2147483648;
                    obj = enrollmentPasskeyEligibilityUseCase$invoke$1.getInputFormats;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = enrollmentPasskeyEligibilityUseCase$invoke$1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        i2 = 0;
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        defaultRaise2 = defaultRaise;
                        com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase systemPasskeyEligibilityUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                        enrollmentPasskeyEligibilityUseCase$invoke$1.Camera2StreamConfigurationMap = defaultRaise;
                        enrollmentPasskeyEligibilityUseCase$invoke$1.getOutputFormats = defaultRaise2;
                        enrollmentPasskeyEligibilityUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise2;
                        enrollmentPasskeyEligibilityUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        enrollmentPasskeyEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        enrollmentPasskeyEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        enrollmentPasskeyEligibilityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        enrollmentPasskeyEligibilityUseCase$invoke$1.getInputSizeshNQ4ISI = 1;
                        obj = systemPasskeyEligibilityUseCase.invoke(enrollmentPasskeyEligibilityUseCase$invoke$1);
                        if (obj != coroutine_suspended) {
                            i3 = 0;
                            i4 = 0;
                            i5 = 0;
                            defaultRaise3 = defaultRaise2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = enrollmentPasskeyEligibilityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i7 = enrollmentPasskeyEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        int i8 = enrollmentPasskeyEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        int i9 = enrollmentPasskeyEligibilityUseCase$invoke$1.getHighSpeedVideoSizes;
                        raise = (arrow.core.raise.Raise) enrollmentPasskeyEligibilityUseCase$invoke$1.getOutputFormats;
                        defaultRaise4 = (arrow.core.raise.DefaultRaise) enrollmentPasskeyEligibilityUseCase$invoke$1.Camera2StreamConfigurationMap;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            rememberedUser = (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser) ((arrow.core.Either) obj).getOrNull();
                            if (rememberedUser == null && (allowedCredentials = rememberedUser.getAllowedCredentials()) != null && (!allowedCredentials.isEmpty())) {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                defaultRaise4.complete();
                                return new arrow.core.Either.Right(unit);
                            }
                            raise.raise(com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.NoPasskeyEnrolled.INSTANCE);
                            throw new kotlin.KotlinNothingValueException();
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise = defaultRaise4;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise = defaultRaise4;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    i2 = enrollmentPasskeyEligibilityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    i3 = enrollmentPasskeyEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    i4 = enrollmentPasskeyEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    i5 = enrollmentPasskeyEligibilityUseCase$invoke$1.getHighSpeedVideoSizes;
                    ?? r8 = (arrow.core.raise.Raise) enrollmentPasskeyEligibilityUseCase$invoke$1.getOutputMinFrameDuration;
                    ?? r9 = (arrow.core.raise.Raise) enrollmentPasskeyEligibilityUseCase$invoke$1.getOutputFormats;
                    defaultRaise = (arrow.core.raise.DefaultRaise) enrollmentPasskeyEligibilityUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise3 = r8;
                    defaultRaise2 = r9;
                    defaultRaise3.bind((arrow.core.Either) obj);
                    com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository rememberedLoginRepository = this.getHighSpeedVideoSizes;
                    enrollmentPasskeyEligibilityUseCase$invoke$1.Camera2StreamConfigurationMap = defaultRaise;
                    enrollmentPasskeyEligibilityUseCase$invoke$1.getOutputFormats = defaultRaise2;
                    enrollmentPasskeyEligibilityUseCase$invoke$1.getOutputMinFrameDuration = null;
                    enrollmentPasskeyEligibilityUseCase$invoke$1.getHighSpeedVideoSizes = i5;
                    enrollmentPasskeyEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i4;
                    enrollmentPasskeyEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges = i3;
                    enrollmentPasskeyEligibilityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                    enrollmentPasskeyEligibilityUseCase$invoke$1.getInputSizeshNQ4ISI = 2;
                    obj = rememberedLoginRepository.getRememberedUser(enrollmentPasskeyEligibilityUseCase$invoke$1);
                    if (obj != coroutine_suspended) {
                        raise = defaultRaise2;
                        defaultRaise4 = defaultRaise;
                        rememberedUser = (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser) ((arrow.core.Either) obj).getOrNull();
                        if (rememberedUser == null) {
                        }
                        raise.raise(com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.NoPasskeyEnrolled.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            defaultRaise3.bind((arrow.core.Either) obj);
            com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository rememberedLoginRepository2 = this.getHighSpeedVideoSizes;
            enrollmentPasskeyEligibilityUseCase$invoke$1.Camera2StreamConfigurationMap = defaultRaise;
            enrollmentPasskeyEligibilityUseCase$invoke$1.getOutputFormats = defaultRaise2;
            enrollmentPasskeyEligibilityUseCase$invoke$1.getOutputMinFrameDuration = null;
            enrollmentPasskeyEligibilityUseCase$invoke$1.getHighSpeedVideoSizes = i5;
            enrollmentPasskeyEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i4;
            enrollmentPasskeyEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges = i3;
            enrollmentPasskeyEligibilityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i2;
            enrollmentPasskeyEligibilityUseCase$invoke$1.getInputSizeshNQ4ISI = 2;
            obj = rememberedLoginRepository2.getRememberedUser(enrollmentPasskeyEligibilityUseCase$invoke$1);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        enrollmentPasskeyEligibilityUseCase$invoke$1 = new com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.EnrollmentPasskeyEligibilityUseCase$invoke$1(this, continuation);
        obj = enrollmentPasskeyEligibilityUseCase$invoke$1.getInputFormats;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = enrollmentPasskeyEligibilityUseCase$invoke$1.getInputSizeshNQ4ISI;
    }
}
