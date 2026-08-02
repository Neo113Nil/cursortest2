package com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/usecase/CompletePhoneConfirmationUseCase;", "", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/repository/PhoneConfirmationCompletionRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/repository/PhoneConfirmationCompletionRepository;)V", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/OTPVerificationInput;", "input", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/OTPVerificationOutput;", "invoke", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/OTPVerificationInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/repository/PhoneConfirmationCompletionRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CompletePhoneConfirmationUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.phoneconfirmation.domain.repository.PhoneConfirmationCompletionRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CompletePhoneConfirmationUseCase(com.paypal.oslo.feature.identity.phoneconfirmation.domain.repository.PhoneConfirmationCompletionRepository phoneConfirmationCompletionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneConfirmationCompletionRepository, "");
        this.getHighSpeedVideoFpsRanges = phoneConfirmationCompletionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationInput oTPVerificationInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError, com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationOutput>> continuation) {
        com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.CompletePhoneConfirmationUseCase$invoke$1 completePhoneConfirmationUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        if (continuation instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.CompletePhoneConfirmationUseCase$invoke$1) {
            completePhoneConfirmationUseCase$invoke$1 = (com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.CompletePhoneConfirmationUseCase$invoke$1) continuation;
            if ((completePhoneConfirmationUseCase$invoke$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                completePhoneConfirmationUseCase$invoke$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = completePhoneConfirmationUseCase$invoke$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = completePhoneConfirmationUseCase$invoke$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        if (oTPVerificationInput.getPhoneContact().isValid()) {
                            if (oTPVerificationInput.getDeviceId().length() > 0) {
                                if (oTPVerificationInput.isValidOTPFormat()) {
                                    com.paypal.oslo.feature.identity.phoneconfirmation.domain.repository.PhoneConfirmationCompletionRepository phoneConfirmationCompletionRepository = this.getHighSpeedVideoFpsRanges;
                                    completePhoneConfirmationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(oTPVerificationInput);
                                    completePhoneConfirmationUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise;
                                    completePhoneConfirmationUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                                    completePhoneConfirmationUseCase$invoke$1.getInputFormats = defaultRaise3;
                                    completePhoneConfirmationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                    completePhoneConfirmationUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                                    completePhoneConfirmationUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                                    completePhoneConfirmationUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                                    completePhoneConfirmationUseCase$invoke$1.getHighSpeedVideoSizesFor = 1;
                                    java.lang.Object completePhoneConfirmation = phoneConfirmationCompletionRepository.completePhoneConfirmation(oTPVerificationInput, completePhoneConfirmationUseCase$invoke$1);
                                    if (completePhoneConfirmation == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    defaultRaise2 = defaultRaise;
                                    obj = completePhoneConfirmation;
                                    raise = defaultRaise3;
                                } else {
                                    defaultRaise3.raise(new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidOTPCode("Expected 6 digits"));
                                    throw new kotlin.KotlinNothingValueException();
                                }
                            } else {
                                defaultRaise3.raise(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidDeviceId.INSTANCE);
                                throw new kotlin.KotlinNothingValueException();
                            }
                        } else {
                            defaultRaise3.raise(com.paypal.oslo.feature.identity.phoneconfirmation.domain.PhoneConfirmationValidation.INSTANCE.invalidPhoneContactError());
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = completePhoneConfirmationUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i3 = completePhoneConfirmationUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    int i4 = completePhoneConfirmationUseCase$invoke$1.Camera2StreamConfigurationMap;
                    int i5 = completePhoneConfirmationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    raise = (arrow.core.raise.Raise) completePhoneConfirmationUseCase$invoke$1.getInputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) completePhoneConfirmationUseCase$invoke$1.getInputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationOutput oTPVerificationOutput = (com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationOutput) raise.bind((arrow.core.Either) obj);
                defaultRaise2.complete();
                return new arrow.core.Either.Right(oTPVerificationOutput);
            }
        }
        completePhoneConfirmationUseCase$invoke$1 = new com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.CompletePhoneConfirmationUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = completePhoneConfirmationUseCase$invoke$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = completePhoneConfirmationUseCase$invoke$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationOutput oTPVerificationOutput2 = (com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationOutput) raise.bind((arrow.core.Either) obj2);
        defaultRaise2.complete();
        return new arrow.core.Either.Right(oTPVerificationOutput2);
    }
}
