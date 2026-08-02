package com.paypal.oslo.feature.identity.stepup.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/domain/usecase/ProcessStepupUseCase;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "challengeResult", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult;", "invoke", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProcessStepupUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ProcessStepupUseCase() {
    }

    public final com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult invoke(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResult, "");
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> availableChallenges = challengeResult.getAvailableChallenges();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : availableChallenges) {
            if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj).isEligible()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> arrayList2 = arrayList;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy priorityStrategy = challengeResult.getChallengeContext().getPriorityStrategy();
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge access$findNotifiedOtpChallenge = com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCaseKt.access$findNotifiedOtpChallenge(arrayList2);
        if (arrayList2.isEmpty()) {
            return com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.NoChallengesAvailable.INSTANCE;
        }
        if (access$findNotifiedOtpChallenge != null) {
            return new com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.SingleChallenge(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData(access$findNotifiedOtpChallenge, false, (java.util.Map) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
        if (priorityStrategy == com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy.SilentAuthFirst) {
            java.util.ArrayList arrayList3 = arrayList2;
            if (!arrayList3.isEmpty()) {
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) it.next()).getType() == com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SILENT_AUTH) {
                        for (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge : arrayList2) {
                            if (challenge.getType() == com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SILENT_AUTH) {
                                return new com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.AutoResolveSilentAuth(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData(challenge, false, (java.util.Map) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                            }
                        }
                        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
            }
        }
        if (arrayList2.size() == 1) {
            return new com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.SingleChallenge(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) kotlin.collections.CollectionsKt.first((java.util.List) arrayList2), false, (java.util.Map) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
        java.util.ArrayList arrayList4 = arrayList2;
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        java.util.Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            arrayList5.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) it2.next(), false, (java.util.Map) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
        return new com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.MultipleChoices(arrayList5);
    }
}
