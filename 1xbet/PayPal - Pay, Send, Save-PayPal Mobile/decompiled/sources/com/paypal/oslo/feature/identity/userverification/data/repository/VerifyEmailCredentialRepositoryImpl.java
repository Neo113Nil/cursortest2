package com.paypal.oslo.feature.identity.userverification.data.repository;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/data/repository/VerifyEmailCredentialRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/userverification/domain/repository/VerifyCredentialRepository;", "Lcom/paypal/oslo/feature/onboarding/api/EmailChecker;", "emailChecker", "<init>", "(Lcom/paypal/oslo/feature/onboarding/api/EmailChecker;)V", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/VerifyCredentialRequest;", "verifyCredentialRequest", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult;", "verify", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/VerifyCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/onboarding/api/EmailChecker;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VerifyEmailCredentialRepositoryImpl implements com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.onboarding.api.EmailChecker getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public VerifyEmailCredentialRepositoryImpl(com.paypal.oslo.feature.onboarding.api.EmailChecker emailChecker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailChecker, "");
        this.getHighSpeedVideoFpsRangesFor = emailChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object verify(com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest verifyCredentialRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError, ? extends com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult>> continuation) {
        com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImpl$verify$1 verifyEmailCredentialRepositoryImpl$verify$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImpl$verify$1) {
            verifyEmailCredentialRepositoryImpl$verify$1 = (com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImpl$verify$1) continuation;
            if ((verifyEmailCredentialRepositoryImpl$verify$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                verifyEmailCredentialRepositoryImpl$verify$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = verifyEmailCredentialRepositoryImpl$verify$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = verifyEmailCredentialRepositoryImpl$verify$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.onboarding.api.EmailChecker emailChecker = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.String access$toEmail = com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImplKt.access$toEmail(verifyCredentialRequest);
                    verifyEmailCredentialRepositoryImpl$verify$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(verifyCredentialRequest);
                    verifyEmailCredentialRepositoryImpl$verify$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = emailChecker.mo15856checkEmailE4ilnuY(access$toEmail, verifyEmailCredentialRepositoryImpl$verify$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImplKt.access$toVerifyCredentialError((com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    return new arrow.core.Either.Right(com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImplKt.access$toVerifyCredentialResult((com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess) ((arrow.core.Either.Right) right).getValue()));
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        verifyEmailCredentialRepositoryImpl$verify$1 = new com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImpl$verify$1(this, continuation);
        java.lang.Object obj2 = verifyEmailCredentialRepositoryImpl$verify$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = verifyEmailCredentialRepositoryImpl$verify$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }
}
