package com.paypal.oslo.feature.identity.challenges.shared.domain.usecase;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/shared/domain/usecase/NotifyChallengeUseCase;", "", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/repository/NotifyChallengeRepository;", "notifyChallengeRepository", "<init>", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/repository/NotifyChallengeRepository;)V", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/NotifyChallengeInput;", "input", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/error/ChallengeError;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/NotifyChallengeResult;", "invoke", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/NotifyChallengeInput;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeFlowType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/repository/NotifyChallengeRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotifyChallengeUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.challenges.shared.domain.repository.NotifyChallengeRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public NotifyChallengeUseCase(com.paypal.oslo.feature.identity.challenges.shared.domain.repository.NotifyChallengeRepository notifyChallengeRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifyChallengeRepository, "");
        this.getHighSpeedVideoFpsRanges = notifyChallengeRepository;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyChallengeInput notifyChallengeInput, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType challengeFlowType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult>> continuation) {
        int i = com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.NotifyChallengeUseCase.WhenMappings.$EnumSwitchMapping$0[challengeFlowType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.getHighSpeedVideoFpsRanges.notifyChallengeWithAuthenticate(notifyChallengeInput, continuation);
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return this.getHighSpeedVideoFpsRanges.notifyChallengeWithTransactional(notifyChallengeInput, continuation);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.LOGIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.SWITCH_ACCOUNT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.PASSWORD_RESET.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.TRANSACTION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
