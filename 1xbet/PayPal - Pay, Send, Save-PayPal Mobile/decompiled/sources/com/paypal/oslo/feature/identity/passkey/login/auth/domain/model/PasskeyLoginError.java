package com.paypal.oslo.feature.identity.passkey.login.auth.domain.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginResult;", "<init>", "()V", "UserProfileNotAvailable", "ChallengeRequestFailed", "AssertionFailed", "LoginSubmissionFailed", "FeatureDisabled", "NotEligible", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError$AssertionFailed;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError$ChallengeRequestFailed;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError$FeatureDisabled;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError$LoginSubmissionFailed;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError$NotEligible;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError$UserProfileNotAvailable;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class PasskeyLoginError extends com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginResult {
    public static final int $stable = 0;

    private PasskeyLoginError() {
        super(null);
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError$UserProfileNotAvailable;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserProfileNotAvailable extends com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.UserProfileNotAvailable INSTANCE = new com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.UserProfileNotAvailable();

        public final int hashCode() {
            return -239130170;
        }

        private UserProfileNotAvailable() {
            super(null);
        }

        public final java.lang.String toString() {
            return "UserProfileNotAvailable";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.UserProfileNotAvailable)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError$ChallengeRequestFailed;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError;", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeError;", "copy", "(Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeError;)Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError$ChallengeRequestFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChallengeRequestFailed extends com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeRequestFailed(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError passkeyLoginChallengeError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyLoginChallengeError, "");
            this.error = passkeyLoginChallengeError;
        }

        public final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError passkeyLoginChallengeError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChallengeRequestFailed(error=");
            sb.append(passkeyLoginChallengeError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.ChallengeRequestFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.ChallengeRequestFailed) other).error);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.ChallengeRequestFailed copy(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.ChallengeRequestFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.ChallengeRequestFailed copy$default(com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.ChallengeRequestFailed challengeRequestFailed, com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError passkeyLoginChallengeError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                passkeyLoginChallengeError = challengeRequestFailed.error;
            }
            return challengeRequestFailed.copy(passkeyLoginChallengeError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError$AssertionFailed;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "copy", "(Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;)Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError$AssertionFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AssertionFailed extends com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssertionFailed(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError passkeyAssertionError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyAssertionError, "");
            this.error = passkeyAssertionError;
        }

        public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError passkeyAssertionError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AssertionFailed(error=");
            sb.append(passkeyAssertionError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.AssertionFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.AssertionFailed) other).error);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.AssertionFailed copy(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.AssertionFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.AssertionFailed copy$default(com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.AssertionFailed assertionFailed, com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError passkeyAssertionError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                passkeyAssertionError = assertionFailed.error;
            }
            return assertionFailed.copy(passkeyAssertionError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError$LoginSubmissionFailed;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoginSubmissionFailed extends com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.LoginSubmissionFailed INSTANCE = new com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.LoginSubmissionFailed();

        public final int hashCode() {
            return -1402946876;
        }

        private LoginSubmissionFailed() {
            super(null);
        }

        public final java.lang.String toString() {
            return "LoginSubmissionFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.LoginSubmissionFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError$FeatureDisabled;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FeatureDisabled extends com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.FeatureDisabled INSTANCE = new com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.FeatureDisabled();

        public final int hashCode() {
            return -879886428;
        }

        private FeatureDisabled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "FeatureDisabled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.FeatureDisabled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError$NotEligible;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError;", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;", "reason", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;", "copy", "(Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;)Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError$NotEligible;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotEligible extends com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotEligible(com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason passkeyIneligibilityReason) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyIneligibilityReason, "");
            this.reason = passkeyIneligibilityReason;
        }

        public final com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason passkeyIneligibilityReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotEligible(reason=");
            sb.append(passkeyIneligibilityReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.NotEligible) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.NotEligible) other).reason);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.NotEligible copy(com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.NotEligible(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.NotEligible copy$default(com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.NotEligible notEligible, com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason passkeyIneligibilityReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                passkeyIneligibilityReason = notEligible.reason;
            }
            return notEligible.copy(passkeyIneligibilityReason);
        }
    }

    public /* synthetic */ PasskeyLoginError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
