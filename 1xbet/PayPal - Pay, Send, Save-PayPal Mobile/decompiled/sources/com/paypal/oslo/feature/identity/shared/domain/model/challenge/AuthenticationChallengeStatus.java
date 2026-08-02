package com.paypal.oslo.feature.identity.shared.domain.model.challenge;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/AuthenticationChallengeStatus;", "", "<init>", "()V", "Notify", "Validate", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/AuthenticationChallengeStatus$Notify;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/AuthenticationChallengeStatus$Validate;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AuthenticationChallengeStatus {
    public static final int $stable = 0;

    private AuthenticationChallengeStatus() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/AuthenticationChallengeStatus$Notify;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/AuthenticationChallengeStatus;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/NotifyChallengeResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/NotifyChallengeResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/NotifyChallengeResult;", "copy", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/NotifyChallengeResult;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/AuthenticationChallengeStatus$Notify;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/NotifyChallengeResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Notify extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Notify(com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult notifyChallengeResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifyChallengeResult, "");
            this.result = notifyChallengeResult;
        }

        public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult notifyChallengeResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Notify(result=");
            sb.append(notifyChallengeResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Notify) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Notify) other).result);
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Notify copy(com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Notify(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Notify copy$default(com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Notify notify, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult notifyChallengeResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                notifyChallengeResult = notify.result;
            }
            return notify.copy(notifyChallengeResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/AuthenticationChallengeStatus$Validate;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/AuthenticationChallengeStatus;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;", "copy", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/AuthenticationChallengeStatus$Validate;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Validate extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Validate(com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult validateChallengeResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateChallengeResult, "");
            this.result = validateChallengeResult;
        }

        public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult validateChallengeResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Validate(result=");
            sb.append(validateChallengeResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Validate) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Validate) other).result);
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Validate copy(com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Validate(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Validate copy$default(com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Validate validate, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult validateChallengeResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                validateChallengeResult = validate.result;
            }
            return validate.copy(validateChallengeResult);
        }
    }

    public /* synthetic */ AuthenticationChallengeStatus(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
