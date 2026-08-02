package com.paypal.oslo.feature.identity.userverification.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/usecase/VerifyCredentialUseCase;", "", "Lcom/paypal/oslo/feature/identity/userverification/domain/repository/VerifyCredentialRepository;", "emailVerifyCredentialRepository", "verifyCredentialRepository", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/feature/identity/userverification/domain/repository/VerifyCredentialRepository;Lcom/paypal/oslo/feature/identity/userverification/domain/repository/VerifyCredentialRepository;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/VerifyCredentialRequest;", "verifyCredentialRequest", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult;", "invoke", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/VerifyCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/userverification/domain/repository/VerifyCredentialRepository;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VerifyCredentialUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public VerifyCredentialUseCase(com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository verifyCredentialRepository, com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository verifyCredentialRepository2, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verifyCredentialRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verifyCredentialRepository2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoFpsRanges = verifyCredentialRepository;
        this.getHighSpeedVideoFpsRangesFor = verifyCredentialRepository2;
        this.getHighResolutionOutputSizeshNQ4ISI = featureGate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9, types: [arrow.core.raise.DefaultRaise] */
    /* JADX WARN: Type inference failed for: r7v8, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r8v4, types: [arrow.core.raise.Raise] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest verifyCredentialRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError, ? extends com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult>> continuation) {
        com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase$invoke$1 verifyCredentialUseCase$invoke$1;
        ?? coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        int i2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.raise.DefaultRaise defaultRaise4;
        arrow.core.raise.Raise raise;
        boolean checkGate;
        arrow.core.raise.DefaultRaise defaultRaise5;
        arrow.core.raise.Raise raise2;
        java.lang.Object verify;
        int i3;
        int i4;
        int i5;
        arrow.core.raise.DefaultRaise defaultRaise6;
        arrow.core.raise.DefaultRaise defaultRaise7;
        com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult verifyCredentialResult;
        arrow.core.raise.DefaultRaise defaultRaise8;
        arrow.core.raise.Raise raise3;
        try {
            try {
                if (continuation instanceof com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase$invoke$1) {
                    verifyCredentialUseCase$invoke$1 = (com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase$invoke$1) continuation;
                    if ((verifyCredentialUseCase$invoke$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                        verifyCredentialUseCase$invoke$1.getOutputStallDurationlomOqCM -= 2147483648;
                        java.lang.Object obj = verifyCredentialUseCase$invoke$1.getOutputSizes;
                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = verifyCredentialUseCase$invoke$1.getOutputStallDurationlomOqCM;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            i2 = 0;
                            arrow.core.raise.DefaultRaise defaultRaise9 = new arrow.core.raise.DefaultRaise(false);
                            defaultRaise3 = defaultRaise9;
                            if (com.paypal.oslo.feature.identity.userverification.domain.validator.CredentialValidatorKt.isValidCredential(verifyCredentialRequest.getPublicCredential())) {
                                com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential = verifyCredentialRequest.getPublicCredential();
                                if (publicCredential instanceof com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential) {
                                    checkGate = this.getHighResolutionOutputSizeshNQ4ISI.checkGate(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.INSTANCE.getCheckEmailSupportEnabled());
                                    if (checkGate) {
                                        com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository verifyCredentialRepository = this.getHighSpeedVideoFpsRanges;
                                        verifyCredentialUseCase$invoke$1.getHighSpeedVideoSizes = verifyCredentialRequest;
                                        verifyCredentialUseCase$invoke$1.getHighSpeedVideoSizesFor = defaultRaise9;
                                        verifyCredentialUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise3;
                                        verifyCredentialUseCase$invoke$1.getInputFormats = defaultRaise3;
                                        verifyCredentialUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                                        verifyCredentialUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                                        verifyCredentialUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                        verifyCredentialUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                                        verifyCredentialUseCase$invoke$1.getOutputFormats = checkGate;
                                        verifyCredentialUseCase$invoke$1.getOutputStallDurationlomOqCM = 1;
                                        verify = verifyCredentialRepository.verify(verifyCredentialRequest, verifyCredentialUseCase$invoke$1);
                                        if (verify != coroutine_suspended) {
                                            i3 = 0;
                                            i4 = 0;
                                            i5 = 0;
                                            defaultRaise6 = defaultRaise9;
                                            defaultRaise7 = defaultRaise3;
                                            verifyCredentialResult = (com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult) defaultRaise7.bind((arrow.core.Either) verify);
                                            if (!(verifyCredentialResult instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.VerifyCredentialSuccess)) {
                                            }
                                            coroutine_suspended = defaultRaise6;
                                            coroutine_suspended.complete();
                                            return new arrow.core.Either.Right(verifyCredentialResult);
                                        }
                                    } else {
                                        com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository verifyCredentialRepository2 = this.getHighSpeedVideoFpsRangesFor;
                                        verifyCredentialUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(verifyCredentialRequest);
                                        verifyCredentialUseCase$invoke$1.getHighSpeedVideoSizesFor = defaultRaise9;
                                        verifyCredentialUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                                        verifyCredentialUseCase$invoke$1.getInputFormats = defaultRaise3;
                                        verifyCredentialUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                                        verifyCredentialUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                                        verifyCredentialUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                        verifyCredentialUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                                        verifyCredentialUseCase$invoke$1.getOutputFormats = checkGate;
                                        verifyCredentialUseCase$invoke$1.getOutputStallDurationlomOqCM = 3;
                                        java.lang.Object verify2 = verifyCredentialRepository2.verify(verifyCredentialRequest, verifyCredentialUseCase$invoke$1);
                                        if (verify2 != coroutine_suspended) {
                                            defaultRaise5 = defaultRaise9;
                                            obj = verify2;
                                            raise2 = defaultRaise3;
                                            verifyCredentialResult = (com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult) raise2.bind((arrow.core.Either) obj);
                                            coroutine_suspended = defaultRaise5;
                                            coroutine_suspended.complete();
                                            return new arrow.core.Either.Right(verifyCredentialResult);
                                        }
                                    }
                                } else {
                                    if (!(publicCredential instanceof com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential)) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository verifyCredentialRepository3 = this.getHighSpeedVideoFpsRangesFor;
                                    verifyCredentialUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(verifyCredentialRequest);
                                    verifyCredentialUseCase$invoke$1.getHighSpeedVideoSizesFor = defaultRaise9;
                                    verifyCredentialUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                                    verifyCredentialUseCase$invoke$1.getInputFormats = defaultRaise3;
                                    verifyCredentialUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                                    verifyCredentialUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                                    verifyCredentialUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                    verifyCredentialUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                                    verifyCredentialUseCase$invoke$1.getOutputStallDurationlomOqCM = 4;
                                    java.lang.Object verify3 = verifyCredentialRepository3.verify(verifyCredentialRequest, verifyCredentialUseCase$invoke$1);
                                    if (verify3 != coroutine_suspended) {
                                        defaultRaise4 = defaultRaise9;
                                        obj = verify3;
                                        raise = defaultRaise3;
                                        verifyCredentialResult = (com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult) raise.bind((arrow.core.Either) obj);
                                        coroutine_suspended = defaultRaise4;
                                        coroutine_suspended.complete();
                                        return new arrow.core.Either.Right(verifyCredentialResult);
                                    }
                                }
                                return coroutine_suspended;
                            }
                            defaultRaise3.raise(com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.InvalidCredential.INSTANCE);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        if (i != 1) {
                            if (i == 2) {
                                boolean z = verifyCredentialUseCase$invoke$1.getOutputFormats;
                                int i6 = verifyCredentialUseCase$invoke$1.Camera2StreamConfigurationMap;
                                int i7 = verifyCredentialUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                int i8 = verifyCredentialUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                int i9 = verifyCredentialUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                raise3 = (arrow.core.raise.Raise) verifyCredentialUseCase$invoke$1.getInputSizeshNQ4ISI;
                                arrow.core.raise.DefaultRaise defaultRaise10 = (arrow.core.raise.DefaultRaise) verifyCredentialUseCase$invoke$1.getHighSpeedVideoSizesFor;
                                kotlin.ResultKt.throwOnFailure(obj);
                                defaultRaise8 = defaultRaise10;
                                verifyCredentialResult = (com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult) raise3.bind((arrow.core.Either) obj);
                                coroutine_suspended = defaultRaise8;
                                coroutine_suspended.complete();
                                return new arrow.core.Either.Right(verifyCredentialResult);
                            }
                            if (i == 3) {
                                boolean z2 = verifyCredentialUseCase$invoke$1.getOutputFormats;
                                int i10 = verifyCredentialUseCase$invoke$1.Camera2StreamConfigurationMap;
                                int i11 = verifyCredentialUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                int i12 = verifyCredentialUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                int i13 = verifyCredentialUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                raise2 = (arrow.core.raise.Raise) verifyCredentialUseCase$invoke$1.getInputFormats;
                                arrow.core.raise.DefaultRaise defaultRaise11 = (arrow.core.raise.DefaultRaise) verifyCredentialUseCase$invoke$1.getHighSpeedVideoSizesFor;
                                kotlin.ResultKt.throwOnFailure(obj);
                                defaultRaise5 = defaultRaise11;
                                verifyCredentialResult = (com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult) raise2.bind((arrow.core.Either) obj);
                                coroutine_suspended = defaultRaise5;
                                coroutine_suspended.complete();
                                return new arrow.core.Either.Right(verifyCredentialResult);
                            }
                            if (i != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i14 = verifyCredentialUseCase$invoke$1.Camera2StreamConfigurationMap;
                            int i15 = verifyCredentialUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                            int i16 = verifyCredentialUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                            int i17 = verifyCredentialUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                            raise = (arrow.core.raise.Raise) verifyCredentialUseCase$invoke$1.getInputFormats;
                            arrow.core.raise.DefaultRaise defaultRaise12 = (arrow.core.raise.DefaultRaise) verifyCredentialUseCase$invoke$1.getHighSpeedVideoSizesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                            defaultRaise4 = defaultRaise12;
                            verifyCredentialResult = (com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult) raise.bind((arrow.core.Either) obj);
                            coroutine_suspended = defaultRaise4;
                            coroutine_suspended.complete();
                            return new arrow.core.Either.Right(verifyCredentialResult);
                        }
                        boolean z3 = verifyCredentialUseCase$invoke$1.getOutputFormats;
                        i2 = verifyCredentialUseCase$invoke$1.Camera2StreamConfigurationMap;
                        int i18 = verifyCredentialUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i19 = verifyCredentialUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        int i20 = verifyCredentialUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        ?? r7 = (arrow.core.raise.Raise) verifyCredentialUseCase$invoke$1.getInputFormats;
                        ?? r8 = (arrow.core.raise.Raise) verifyCredentialUseCase$invoke$1.getOutputMinFrameDuration;
                        arrow.core.raise.DefaultRaise defaultRaise13 = (arrow.core.raise.DefaultRaise) verifyCredentialUseCase$invoke$1.getHighSpeedVideoSizesFor;
                        com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest verifyCredentialRequest2 = (com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest) verifyCredentialUseCase$invoke$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        checkGate = z3;
                        verifyCredentialRequest = verifyCredentialRequest2;
                        defaultRaise6 = defaultRaise13;
                        defaultRaise7 = r7;
                        i4 = i19;
                        verify = obj;
                        defaultRaise3 = r8;
                        i5 = i20;
                        i3 = i18;
                        try {
                            verifyCredentialResult = (com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult) defaultRaise7.bind((arrow.core.Either) verify);
                            if (!(verifyCredentialResult instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.VerifyCredentialSuccess) && ((com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.VerifyCredentialSuccess) verifyCredentialResult).getAuthOptions().isEmpty()) {
                                com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository verifyCredentialRepository4 = this.getHighSpeedVideoFpsRangesFor;
                                verifyCredentialUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(verifyCredentialRequest);
                                verifyCredentialUseCase$invoke$1.getHighSpeedVideoSizesFor = defaultRaise6;
                                verifyCredentialUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                                verifyCredentialUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(verifyCredentialResult);
                                verifyCredentialUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise3;
                                verifyCredentialUseCase$invoke$1.getHighSpeedVideoFpsRanges = i5;
                                verifyCredentialUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i4;
                                verifyCredentialUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                                verifyCredentialUseCase$invoke$1.Camera2StreamConfigurationMap = i2;
                                verifyCredentialUseCase$invoke$1.getOutputFormats = checkGate;
                                verifyCredentialUseCase$invoke$1.getOutputStallDurationlomOqCM = 2;
                                java.lang.Object verify4 = verifyCredentialRepository4.verify(verifyCredentialRequest, verifyCredentialUseCase$invoke$1);
                                if (verify4 != coroutine_suspended) {
                                    defaultRaise8 = defaultRaise6;
                                    arrow.core.raise.DefaultRaise defaultRaise14 = defaultRaise3;
                                    obj = verify4;
                                    raise3 = defaultRaise14;
                                    verifyCredentialResult = (com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult) raise3.bind((arrow.core.Either) obj);
                                    coroutine_suspended = defaultRaise8;
                                    coroutine_suspended.complete();
                                    return new arrow.core.Either.Right(verifyCredentialResult);
                                }
                                return coroutine_suspended;
                            }
                            coroutine_suspended = defaultRaise6;
                            coroutine_suspended.complete();
                            return new arrow.core.Either.Right(verifyCredentialResult);
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise2 = defaultRaise6;
                            defaultRaise2.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise = defaultRaise6;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                }
                if (i != 0) {
                }
            } catch (arrow.core.raise.RaiseCancellationException e2) {
                e = e2;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            e = e3;
            defaultRaise2 = coroutine_suspended;
        } catch (java.lang.Throwable th3) {
            th = th3;
            defaultRaise = coroutine_suspended;
        }
        verifyCredentialUseCase$invoke$1 = new com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = verifyCredentialUseCase$invoke$1.getOutputSizes;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = verifyCredentialUseCase$invoke$1.getOutputStallDurationlomOqCM;
    }
}
