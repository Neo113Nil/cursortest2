package com.paypal.oslo.feature.identity.stepup.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/domain/usecase/FetchStepupChallengesUseCase;", "", "Lcom/paypal/oslo/feature/identity/stepup/domain/repository/StepupChallengeRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/identity/stepup/domain/repository/StepupChallengeRepository;)V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/TransactionChallengeContext;", "transactionContext", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupChallengeError;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "invoke", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/TransactionChallengeContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/stepup/domain/repository/StepupChallengeRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FetchStepupChallengesUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.stepup.domain.repository.StepupChallengeRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public FetchStepupChallengesUseCase(com.paypal.oslo.feature.identity.stepup.domain.repository.StepupChallengeRepository stepupChallengeRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupChallengeRepository, "");
        this.getHighSpeedVideoSizes = stepupChallengeRepository;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.identity.shared.domain.model.challenge.TransactionChallengeContext transactionChallengeContext, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.stepup.domain.model.StepupChallengeError, ? extends java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge>>> continuation) {
        return this.getHighSpeedVideoSizes.fetchStepupChallenges(transactionChallengeContext, continuation);
    }
}
