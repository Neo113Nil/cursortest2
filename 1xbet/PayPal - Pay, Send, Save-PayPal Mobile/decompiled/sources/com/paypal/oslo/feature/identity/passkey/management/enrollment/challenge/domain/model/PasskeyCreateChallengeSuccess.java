package com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallengeSuccess;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyEnrollmentOptionResult;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallenge;", "passkeyCreateChallenge", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallenge;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallenge;", "copy", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallenge;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallengeSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallenge;", "getPasskeyCreateChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PasskeyCreateChallengeSuccess extends com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyEnrollmentOptionResult {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallenge passkeyCreateChallenge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyCreateChallengeSuccess(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallenge passkeyCreateChallenge) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCreateChallenge, "");
        this.passkeyCreateChallenge = passkeyCreateChallenge;
    }

    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallenge getPasskeyCreateChallenge() {
        return this.passkeyCreateChallenge;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallenge passkeyCreateChallenge = this.passkeyCreateChallenge;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyCreateChallengeSuccess(passkeyCreateChallenge=");
        sb.append(passkeyCreateChallenge);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.passkeyCreateChallenge.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.passkeyCreateChallenge, ((com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess) other).passkeyCreateChallenge);
    }

    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess copy(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallenge passkeyCreateChallenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCreateChallenge, "");
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess(passkeyCreateChallenge);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallenge getPasskeyCreateChallenge() {
        return this.passkeyCreateChallenge;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess passkeyCreateChallengeSuccess, com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallenge passkeyCreateChallenge, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            passkeyCreateChallenge = passkeyCreateChallengeSuccess.passkeyCreateChallenge;
        }
        return passkeyCreateChallengeSuccess.copy(passkeyCreateChallenge);
    }
}
