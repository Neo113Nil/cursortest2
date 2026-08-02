package com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateResult;", "<init>", "()V", "NotEligible", "ChallengeRequestFailed", "AttestationFailed", "NetworkError", "TimeoutError", "UnauthorizedError", "NotFoundError", "ServerInternalError", "AuthenticationError", "ValidationError", "UnsupportedPlatform", "MissingData", "SecurityError", "UnknownError", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$AttestationFailed;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$AuthenticationError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$ChallengeRequestFailed;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$MissingData;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$NetworkError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$NotEligible;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$NotFoundError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$SecurityError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$ServerInternalError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$TimeoutError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$UnauthorizedError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$UnknownError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$UnsupportedPlatform;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$ValidationError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class PasskeyCreateError extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateResult {
    public static final int $stable = 0;

    private PasskeyCreateError() {
        super(null);
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$NotEligible;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;", "reason", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;", "copy", "(Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$NotEligible;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotEligible extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError {
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
            return (other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NotEligible) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NotEligible) other).reason);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NotEligible copy(com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NotEligible(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NotEligible copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NotEligible notEligible, com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason passkeyIneligibilityReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                passkeyIneligibilityReason = notEligible.reason;
            }
            return notEligible.copy(passkeyIneligibilityReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$ChallengeRequestFailed;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallengeError;", "passkeyCreateChallengeError", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallengeError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallengeError;", "copy", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallengeError;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$ChallengeRequestFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallengeError;", "getPasskeyCreateChallengeError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChallengeRequestFailed extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeError passkeyCreateChallengeError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeRequestFailed(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeError passkeyCreateChallengeError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCreateChallengeError, "");
            this.passkeyCreateChallengeError = passkeyCreateChallengeError;
        }

        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeError getPasskeyCreateChallengeError() {
            return this.passkeyCreateChallengeError;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeError passkeyCreateChallengeError = this.passkeyCreateChallengeError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChallengeRequestFailed(passkeyCreateChallengeError=");
            sb.append(passkeyCreateChallengeError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.passkeyCreateChallengeError.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ChallengeRequestFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.passkeyCreateChallengeError, ((com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ChallengeRequestFailed) other).passkeyCreateChallengeError);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ChallengeRequestFailed copy(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeError passkeyCreateChallengeError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCreateChallengeError, "");
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ChallengeRequestFailed(passkeyCreateChallengeError);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeError getPasskeyCreateChallengeError() {
            return this.passkeyCreateChallengeError;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ChallengeRequestFailed copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ChallengeRequestFailed challengeRequestFailed, com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeError passkeyCreateChallengeError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                passkeyCreateChallengeError = challengeRequestFailed.passkeyCreateChallengeError;
            }
            return challengeRequestFailed.copy(passkeyCreateChallengeError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$AttestationFailed;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationError;", "passkeyAttestationError", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationError;", "copy", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationError;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$AttestationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationError;", "getPasskeyAttestationError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AttestationFailed extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError passkeyAttestationError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AttestationFailed(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError passkeyAttestationError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyAttestationError, "");
            this.passkeyAttestationError = passkeyAttestationError;
        }

        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError getPasskeyAttestationError() {
            return this.passkeyAttestationError;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError passkeyAttestationError = this.passkeyAttestationError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AttestationFailed(passkeyAttestationError=");
            sb.append(passkeyAttestationError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.passkeyAttestationError.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.AttestationFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.passkeyAttestationError, ((com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.AttestationFailed) other).passkeyAttestationError);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.AttestationFailed copy(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError passkeyAttestationError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyAttestationError, "");
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.AttestationFailed(passkeyAttestationError);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError getPasskeyAttestationError() {
            return this.passkeyAttestationError;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.AttestationFailed copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.AttestationFailed attestationFailed, com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError passkeyAttestationError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                passkeyAttestationError = attestationFailed.passkeyAttestationError;
            }
            return attestationFailed.copy(passkeyAttestationError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$NetworkError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$NetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        public NetworkError(java.lang.Throwable th) {
            super(null);
            this.cause = th;
        }

        public /* synthetic */ NetworkError(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.cause;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NetworkError) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NetworkError) other).cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NetworkError copy(java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NetworkError(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NetworkError copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NetworkError networkError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = networkError.cause;
            }
            return networkError.copy(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NetworkError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$TimeoutError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$TimeoutError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TimeoutError extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        public TimeoutError(java.lang.Throwable th) {
            super(null);
            this.cause = th;
        }

        public /* synthetic */ TimeoutError(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TimeoutError(cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.cause;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.TimeoutError) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.TimeoutError) other).cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.TimeoutError copy(java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.TimeoutError(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.TimeoutError copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.TimeoutError timeoutError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = timeoutError.cause;
            }
            return timeoutError.copy(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TimeoutError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$UnauthorizedError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnauthorizedError extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.UnauthorizedError INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.UnauthorizedError();

        public final int hashCode() {
            return -780304737;
        }

        private UnauthorizedError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "UnauthorizedError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.UnauthorizedError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$NotFoundError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotFoundError extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NotFoundError INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NotFoundError();

        public final int hashCode() {
            return -1557737084;
        }

        private NotFoundError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NotFoundError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NotFoundError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$ServerInternalError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "", "statusCode", "<init>", "(Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Integer;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$ServerInternalError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getStatusCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ServerInternalError extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError {
        public static final int $stable = 0;
        private final java.lang.Integer statusCode;

        public ServerInternalError(java.lang.Integer num) {
            super(null);
            this.statusCode = num;
        }

        public /* synthetic */ ServerInternalError(java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num);
        }

        public final java.lang.Integer getStatusCode() {
            return this.statusCode;
        }

        public final java.lang.String toString() {
            java.lang.Integer num = this.statusCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ServerInternalError(statusCode=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Integer num = this.statusCode;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ServerInternalError) && kotlin.jvm.internal.Intrinsics.areEqual(this.statusCode, ((com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ServerInternalError) other).statusCode);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ServerInternalError copy(java.lang.Integer statusCode) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ServerInternalError(statusCode);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getStatusCode() {
            return this.statusCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ServerInternalError copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ServerInternalError serverInternalError, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = serverInternalError.statusCode;
            }
            return serverInternalError.copy(num);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ServerInternalError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$AuthenticationError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticationError extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.AuthenticationError INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.AuthenticationError();

        public final int hashCode() {
            return -1392858917;
        }

        private AuthenticationError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AuthenticationError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.AuthenticationError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$ValidationError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "", "field", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$ValidationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getField"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationError extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError {
        public static final int $stable = 0;
        private final java.lang.String field;

        public ValidationError(java.lang.String str) {
            super(null);
            this.field = str;
        }

        public /* synthetic */ ValidationError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getField() {
            return this.field;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.field;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationError(field=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.field;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ValidationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.field, ((com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ValidationError) other).field);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ValidationError copy(java.lang.String field) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ValidationError(field);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getField() {
            return this.field;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ValidationError copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ValidationError validationError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = validationError.field;
            }
            return validationError.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ValidationError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$UnsupportedPlatform;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnsupportedPlatform extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.UnsupportedPlatform INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.UnsupportedPlatform();

        public final int hashCode() {
            return 1470416947;
        }

        private UnsupportedPlatform() {
            super(null);
        }

        public final java.lang.String toString() {
            return "UnsupportedPlatform";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.UnsupportedPlatform)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$MissingData;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MissingData extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.MissingData INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.MissingData();

        public final int hashCode() {
            return 1233140635;
        }

        private MissingData() {
            super(null);
        }

        public final java.lang.String toString() {
            return "MissingData";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.MissingData)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$SecurityError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$SecurityError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SecurityError extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        public SecurityError(java.lang.Throwable th) {
            super(null);
            this.cause = th;
        }

        public /* synthetic */ SecurityError(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SecurityError(cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.cause;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.SecurityError) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.SecurityError) other).cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.SecurityError copy(java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.SecurityError(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.SecurityError copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.SecurityError securityError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = securityError.cause;
            }
            return securityError.copy(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SecurityError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$UnknownError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "", "errorCode", "", "cause", "", "path", "<init>", "(Ljava/lang/Integer;Ljava/lang/Throwable;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/Throwable;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Ljava/lang/Throwable;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError$UnknownError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Integer;", "getErrorCode", "Ljava/lang/Throwable;", "getCause", "Ljava/lang/String;", "getPath"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownError extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;
        private final java.lang.Integer errorCode;
        private final java.lang.String path;

        public UnknownError(java.lang.Integer num, java.lang.Throwable th, java.lang.String str) {
            super(null);
            this.errorCode = num;
            this.cause = th;
            this.path = str;
        }

        public /* synthetic */ UnknownError(java.lang.Integer num, java.lang.Throwable th, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : str);
        }

        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String getPath() {
            return this.path;
        }

        public final java.lang.String toString() {
            java.lang.Integer num = this.errorCode;
            java.lang.Throwable th = this.cause;
            java.lang.String str = this.path;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownError(errorCode=");
            sb.append(num);
            sb.append(", cause=");
            sb.append(th);
            sb.append(", path=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Integer num = this.errorCode;
            int hashCode = num == null ? 0 : num.hashCode();
            java.lang.Throwable th = this.cause;
            int hashCode2 = th == null ? 0 : th.hashCode();
            java.lang.String str = this.path;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.UnknownError)) {
                return false;
            }
            com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.UnknownError unknownError = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.UnknownError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, unknownError.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, unknownError.cause) && kotlin.jvm.internal.Intrinsics.areEqual(this.path, unknownError.path);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.UnknownError copy(java.lang.Integer errorCode, java.lang.Throwable cause, java.lang.String path) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.UnknownError(errorCode, cause, path);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPath() {
            return this.path;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.UnknownError copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.UnknownError unknownError, java.lang.Integer num, java.lang.Throwable th, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = unknownError.errorCode;
            }
            if ((i & 2) != 0) {
                th = unknownError.cause;
            }
            if ((i & 4) != 0) {
                str = unknownError.path;
            }
            return unknownError.copy(num, th, str);
        }

        public UnknownError() {
            this(null, null, null, 7, null);
        }
    }

    public /* synthetic */ PasskeyCreateError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
