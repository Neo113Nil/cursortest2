package com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/usecase/SnaVerificationError;", "", "<init>", "()V", "NetworkError", "ValidationError", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/usecase/SnaVerificationError$NetworkError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/usecase/SnaVerificationError$ValidationError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class SnaVerificationError {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/usecase/SnaVerificationError$NetworkError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/usecase/SnaVerificationError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "snaError", "<init>", "(Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "copy", "(Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;)Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/usecase/SnaVerificationError$NetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "getSnaError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError snaError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError snaError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snaError, "");
            this.snaError = snaError;
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError getSnaError() {
            return this.snaError;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError snaError = this.snaError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(snaError=");
            sb.append(snaError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.snaError.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.NetworkError) && kotlin.jvm.internal.Intrinsics.areEqual(this.snaError, ((com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.NetworkError) other).snaError);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.NetworkError copy(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError snaError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snaError, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.NetworkError(snaError);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError getSnaError() {
            return this.snaError;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.NetworkError copy$default(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.NetworkError networkError, com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError snaError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                snaError = networkError.snaError;
            }
            return networkError.copy(snaError);
        }
    }

    private SnaVerificationError() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/usecase/SnaVerificationError$ValidationError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/usecase/SnaVerificationError;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/error/ChallengeError;", "challengeError", "<init>", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/error/ChallengeError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/error/ChallengeError;", "copy", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/error/ChallengeError;)Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/usecase/SnaVerificationError$ValidationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/error/ChallengeError;", "getChallengeError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationError extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError challengeError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationError(com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError challengeError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeError, "");
            this.challengeError = challengeError;
        }

        public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError getChallengeError() {
            return this.challengeError;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError challengeError = this.challengeError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationError(challengeError=");
            sb.append(challengeError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.challengeError.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.ValidationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeError, ((com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.ValidationError) other).challengeError);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.ValidationError copy(com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError challengeError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeError, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.ValidationError(challengeError);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError getChallengeError() {
            return this.challengeError;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.ValidationError copy$default(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.ValidationError validationError, com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError challengeError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challengeError = validationError.challengeError;
            }
            return validationError.copy(challengeError);
        }
    }

    public /* synthetic */ SnaVerificationError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
