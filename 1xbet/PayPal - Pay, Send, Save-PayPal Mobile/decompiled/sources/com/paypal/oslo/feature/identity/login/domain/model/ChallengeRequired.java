package com.paypal.oslo.feature.identity.login.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/ChallengeRequired;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginResult;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "challengeResult", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)Lcom/paypal/oslo/feature/identity/login/domain/model/ChallengeRequired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "getChallengeResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ChallengeRequired extends com.paypal.oslo.feature.identity.login.domain.model.LoginResult {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRequired(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResult, "");
        this.challengeResult = challengeResult;
    }

    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getChallengeResult() {
        return this.challengeResult;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult = this.challengeResult;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChallengeRequired(challengeResult=");
        sb.append(challengeResult);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.challengeResult.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeResult, ((com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired) other).challengeResult);
    }

    public final com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResult, "");
        return new com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired(challengeResult);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getChallengeResult() {
        return this.challengeResult;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired copy$default(com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired challengeRequired, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            challengeResult = challengeRequired.challengeResult;
        }
        return challengeRequired.copy(challengeResult);
    }
}
