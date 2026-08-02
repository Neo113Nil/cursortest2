package com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0086B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/usecase/VerifySnaUseCase;", "", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/repository/SnaVerificationRepository;", "repository", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/usecase/ValidateChallengeUseCase;", "validateChallengeUseCase", "<init>", "(Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/repository/SnaVerificationRepository;Lcom/paypal/oslo/feature/identity/challenges/shared/domain/usecase/ValidateChallengeUseCase;)V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "evUrl", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/usecase/SnaVerificationError;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;", "invoke", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeFlowType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/repository/SnaVerificationRepository;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/usecase/ValidateChallengeUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VerifySnaUseCase {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.repository.SnaVerificationRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public VerifySnaUseCase(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.repository.SnaVerificationRepository snaVerificationRepository, com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase validateChallengeUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snaVerificationRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateChallengeUseCase, "");
        this.getHighSpeedVideoFpsRanges = snaVerificationRepository;
        this.getHighSpeedVideoFpsRangesFor = validateChallengeUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01a8 A[Catch: all -> 0x01ee, RaiseCancellationException -> 0x01f8, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x01f8, all -> 0x01ee, blocks: (B:12:0x005e, B:13:0x01a2, B:16:0x01a8, B:17:0x01cf, B:22:0x01c1, B:23:0x01e0, B:24:0x01e5, B:31:0x00da, B:34:0x00e0, B:35:0x0107, B:37:0x0119, B:40:0x0123, B:48:0x00f9, B:49:0x01e6, B:50:0x01eb, B:59:0x00a6), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0 A[Catch: all -> 0x01ee, RaiseCancellationException -> 0x01f8, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x01f8, all -> 0x01ee, blocks: (B:12:0x005e, B:13:0x01a2, B:16:0x01a8, B:17:0x01cf, B:22:0x01c1, B:23:0x01e0, B:24:0x01e5, B:31:0x00da, B:34:0x00e0, B:35:0x0107, B:37:0x0119, B:40:0x0123, B:48:0x00f9, B:49:0x01e6, B:50:0x01eb, B:59:0x00a6), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119 A[Catch: all -> 0x01ee, RaiseCancellationException -> 0x01f8, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x01f8, all -> 0x01ee, blocks: (B:12:0x005e, B:13:0x01a2, B:16:0x01a8, B:17:0x01cf, B:22:0x01c1, B:23:0x01e0, B:24:0x01e5, B:31:0x00da, B:34:0x00e0, B:35:0x0107, B:37:0x0119, B:40:0x0123, B:48:0x00f9, B:49:0x01e6, B:50:0x01eb, B:59:0x00a6), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType challengeFlowType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult>> continuation) {
        com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase$invoke$1 verifySnaUseCase$invoke$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.lang.String str2;
        int i;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge2;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType challengeFlowType2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        int i2;
        int i3;
        int i4;
        arrow.core.Either either;
        arrow.core.Either right;
        java.lang.String id;
        arrow.core.raise.Raise raise3;
        arrow.core.Either either2;
        arrow.core.Either right2;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase$invoke$1) {
                verifySnaUseCase$invoke$1 = (com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase$invoke$1) continuation;
                if ((verifySnaUseCase$invoke$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                    verifySnaUseCase$invoke$1.getOutputStallDuration -= 2147483648;
                    obj = verifySnaUseCase$invoke$1.unwrapAs;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = verifySnaUseCase$invoke$1.getOutputStallDuration;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise2;
                        com.paypal.oslo.feature.identity.challenges.stepupsna.domain.repository.SnaVerificationRepository snaVerificationRepository = this.getHighSpeedVideoFpsRanges;
                        verifySnaUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = silentAuthChallenge;
                        verifySnaUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        verifySnaUseCase$invoke$1.getInputSizeshNQ4ISI = challengeFlowType;
                        verifySnaUseCase$invoke$1.getOutputFormats = defaultRaise2;
                        verifySnaUseCase$invoke$1.getInputFormats = defaultRaise3;
                        verifySnaUseCase$invoke$1.getHighSpeedVideoSizesFor = defaultRaise3;
                        verifySnaUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        verifySnaUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        verifySnaUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        verifySnaUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        verifySnaUseCase$invoke$1.getOutputStallDuration = 1;
                        obj = snaVerificationRepository.callEvUrl(str, verifySnaUseCase$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str;
                        i = 0;
                        silentAuthChallenge2 = silentAuthChallenge;
                        challengeFlowType2 = challengeFlowType;
                        raise = defaultRaise3;
                        raise2 = raise;
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                    } else {
                        if (r4 != 1) {
                            if (r4 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i5 = verifySnaUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                            int i6 = verifySnaUseCase$invoke$1.Camera2StreamConfigurationMap;
                            int i7 = verifySnaUseCase$invoke$1.getHighSpeedVideoSizes;
                            int i8 = verifySnaUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                            raise3 = (arrow.core.raise.Raise) verifySnaUseCase$invoke$1.getHighSpeedVideoSizesFor;
                            defaultRaise2 = (arrow.core.raise.DefaultRaise) verifySnaUseCase$invoke$1.getOutputFormats;
                            kotlin.ResultKt.throwOnFailure(obj);
                            either2 = (arrow.core.Either) obj;
                            if (!(either2 instanceof arrow.core.Either.Left)) {
                                right2 = new arrow.core.Either.Left(new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.ValidationError((com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError) ((arrow.core.Either.Left) either2).getValue()));
                            } else {
                                if (!(either2 instanceof arrow.core.Either.Right)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                right2 = new arrow.core.Either.Right(((arrow.core.Either.Right) either2).getValue());
                            }
                            com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult validateChallengeResult = (com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult) raise3.bind(right2);
                            defaultRaise2.complete();
                            return new arrow.core.Either.Right(validateChallengeResult);
                        }
                        int i9 = verifySnaUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        int i10 = verifySnaUseCase$invoke$1.Camera2StreamConfigurationMap;
                        int i11 = verifySnaUseCase$invoke$1.getHighSpeedVideoSizes;
                        int i12 = verifySnaUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        arrow.core.raise.Raise raise4 = (arrow.core.raise.Raise) verifySnaUseCase$invoke$1.getHighSpeedVideoSizesFor;
                        raise = (arrow.core.raise.Raise) verifySnaUseCase$invoke$1.getInputFormats;
                        defaultRaise = (arrow.core.raise.DefaultRaise) verifySnaUseCase$invoke$1.getOutputFormats;
                        challengeFlowType2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType) verifySnaUseCase$invoke$1.getInputSizeshNQ4ISI;
                        str2 = (java.lang.String) verifySnaUseCase$invoke$1.getOutputMinFrameDuration;
                        silentAuthChallenge2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge) verifySnaUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            i = i9;
                            defaultRaise2 = defaultRaise;
                            raise2 = raise4;
                            i4 = i12;
                            i3 = i11;
                            i2 = i10;
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
                    either = (arrow.core.Either) obj;
                    if (!(either instanceof arrow.core.Either.Left)) {
                        right = new arrow.core.Either.Left(new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.NetworkError((com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError) ((arrow.core.Either.Left) either).getValue()));
                    } else {
                        if (!(either instanceof arrow.core.Either.Right)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                    }
                    java.lang.String str3 = (java.lang.String) raise2.bind(right);
                    com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber phoneNumber = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) silentAuthChallenge2.getPhoneNumbers());
                    id = phoneNumber == null ? phoneNumber.getId() : null;
                    if (id == null) {
                        id = "";
                    }
                    com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput validateChallengeInput = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput(silentAuthChallenge2.getId(), null, null, null, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false), silentAuthChallenge2.getNonce(), silentAuthChallenge2.getPartialToken(), null, new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SilentAuthValidationInput(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SILENT_AUTH, id, str3), 140, null);
                    com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase validateChallengeUseCase = this.getHighSpeedVideoFpsRangesFor;
                    verifySnaUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(silentAuthChallenge2);
                    verifySnaUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    verifySnaUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(challengeFlowType2);
                    verifySnaUseCase$invoke$1.getOutputFormats = defaultRaise2;
                    verifySnaUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise);
                    verifySnaUseCase$invoke$1.getHighSpeedVideoSizesFor = raise;
                    verifySnaUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneNumber);
                    verifySnaUseCase$invoke$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                    verifySnaUseCase$invoke$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateChallengeInput);
                    verifySnaUseCase$invoke$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    verifySnaUseCase$invoke$1.getHighSpeedVideoFpsRanges = i4;
                    verifySnaUseCase$invoke$1.getHighSpeedVideoSizes = i3;
                    verifySnaUseCase$invoke$1.Camera2StreamConfigurationMap = i2;
                    verifySnaUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i;
                    verifySnaUseCase$invoke$1.getOutputStallDuration = 2;
                    obj = validateChallengeUseCase.invoke(validateChallengeInput, challengeFlowType2, verifySnaUseCase$invoke$1);
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    raise3 = raise;
                    either2 = (arrow.core.Either) obj;
                    if (!(either2 instanceof arrow.core.Either.Left)) {
                    }
                    com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult validateChallengeResult2 = (com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult) raise3.bind(right2);
                    defaultRaise2.complete();
                    return new arrow.core.Either.Right(validateChallengeResult2);
                }
            }
            if (r4 != 0) {
            }
            either = (arrow.core.Either) obj;
            if (!(either instanceof arrow.core.Either.Left)) {
            }
            java.lang.String str32 = (java.lang.String) raise2.bind(right);
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber phoneNumber2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) silentAuthChallenge2.getPhoneNumbers());
            if (phoneNumber2 == null) {
            }
            if (id == null) {
            }
            com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput validateChallengeInput2 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput(silentAuthChallenge2.getId(), null, null, null, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false), silentAuthChallenge2.getNonce(), silentAuthChallenge2.getPartialToken(), null, new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SilentAuthValidationInput(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SILENT_AUTH, id, str32), 140, null);
            com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase validateChallengeUseCase2 = this.getHighSpeedVideoFpsRangesFor;
            verifySnaUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(silentAuthChallenge2);
            verifySnaUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
            verifySnaUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(challengeFlowType2);
            verifySnaUseCase$invoke$1.getOutputFormats = defaultRaise2;
            verifySnaUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise);
            verifySnaUseCase$invoke$1.getHighSpeedVideoSizesFor = raise;
            verifySnaUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneNumber2);
            verifySnaUseCase$invoke$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
            verifySnaUseCase$invoke$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateChallengeInput2);
            verifySnaUseCase$invoke$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str32);
            verifySnaUseCase$invoke$1.getHighSpeedVideoFpsRanges = i4;
            verifySnaUseCase$invoke$1.getHighSpeedVideoSizes = i3;
            verifySnaUseCase$invoke$1.Camera2StreamConfigurationMap = i2;
            verifySnaUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i;
            verifySnaUseCase$invoke$1.getOutputStallDuration = 2;
            obj = validateChallengeUseCase2.invoke(validateChallengeInput2, challengeFlowType2, verifySnaUseCase$invoke$1);
            if (obj != coroutine_suspended) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
            defaultRaise = r4;
        } catch (java.lang.Throwable th2) {
            th = th2;
            defaultRaise = r4;
        }
        verifySnaUseCase$invoke$1 = new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase$invoke$1(this, continuation);
        obj = verifySnaUseCase$invoke$1.unwrapAs;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = verifySnaUseCase$invoke$1.getOutputStallDuration;
    }
}
