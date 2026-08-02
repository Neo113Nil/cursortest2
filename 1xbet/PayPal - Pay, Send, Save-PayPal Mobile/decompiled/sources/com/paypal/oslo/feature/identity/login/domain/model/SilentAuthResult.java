package com.paypal.oslo.feature.identity.login.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;", "", "<init>", "()V", "Success", "ChallengeRequired", "NotEligible", "UserCancelled", "Failed", "Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult$ChallengeRequired;", "Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult$Failed;", "Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult$NotEligible;", "Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult$Success;", "Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult$UserCancelled;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class SilentAuthResult {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult$Success;", "Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;", "Lcom/paypal/oslo/core/identity/domain/model/Token;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "<init>", "(Lcom/paypal/oslo/core/identity/domain/model/Token;)V", "component1", "()Lcom/paypal/oslo/core/identity/domain/model/Token;", "copy", "(Lcom/paypal/oslo/core/identity/domain/model/Token;)Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/identity/domain/model/Token;", "getToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.identity.domain.model.Token token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.core.identity.domain.model.Token token) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            this.token = token;
        }

        public final com.paypal.oslo.core.identity.domain.model.Token getToken() {
            return this.token;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.identity.domain.model.Token token = this.token;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(token=");
            sb.append(token);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, ((com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Success) other).token);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Success copy(com.paypal.oslo.core.identity.domain.model.Token token) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Success(token);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.identity.domain.model.Token getToken() {
            return this.token;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Success copy$default(com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Success success, com.paypal.oslo.core.identity.domain.model.Token token, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                token = success.token;
            }
            return success.copy(token);
        }
    }

    private SilentAuthResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult$ChallengeRequired;", "Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult$ChallengeRequired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "getChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChallengeRequired extends com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challenge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeRequired(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResult, "");
            this.challenge = challengeResult;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getChallenge() {
            return this.challenge;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult = this.challenge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChallengeRequired(challenge=");
            sb.append(challengeResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.challenge.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.ChallengeRequired) && kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, ((com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.ChallengeRequired) other).challenge);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.ChallengeRequired copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.ChallengeRequired(challenge);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.ChallengeRequired copy$default(com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.ChallengeRequired challengeRequired, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challengeResult = challengeRequired.challenge;
            }
            return challengeRequired.copy(challengeResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult$NotEligible;", "Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotEligible extends com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.NotEligible INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.NotEligible();

        public final int hashCode() {
            return -231313471;
        }

        private NotEligible() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NotEligible";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.NotEligible)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult$UserCancelled;", "Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserCancelled extends com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.UserCancelled INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.UserCancelled();

        public final int hashCode() {
            return -2072937987;
        }

        private UserCancelled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "UserCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.UserCancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult$Failed;", "Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult$Failed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failed extends com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult {
        public static final int $stable = 8;
        private final java.lang.Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            this.error = th;
        }

        public final java.lang.Throwable getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(error=");
            sb.append(th);
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
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Failed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Failed) other).error);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Failed copy(java.lang.Throwable error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Failed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Failed copy$default(com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Failed failed, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = failed.error;
            }
            return failed.copy(th);
        }
    }

    public /* synthetic */ SilentAuthResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
