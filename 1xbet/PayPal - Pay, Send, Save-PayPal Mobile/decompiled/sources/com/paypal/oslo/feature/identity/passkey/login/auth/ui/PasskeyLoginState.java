package com.paypal.oslo.feature.identity.passkey.login.auth.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState;", "", "<init>", "()V", "Idle", "Loading", "Cancelled", "Success", "ChallengeRequired", "FallbackToPassword", "Error", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState$Cancelled;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState$ChallengeRequired;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState$Error;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState$FallbackToPassword;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState$Idle;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState$Loading;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class PasskeyLoginState {
    public static final int $stable = 0;

    private PasskeyLoginState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState$Idle;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle extends com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Idle INSTANCE = new com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Idle();

        public final int hashCode() {
            return -482988316;
        }

        private Idle() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState$Loading;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Loading INSTANCE = new com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Loading();

        public final int hashCode() {
            return -1892100052;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState$Cancelled;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cancelled extends com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Cancelled INSTANCE = new com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Cancelled();

        public final int hashCode() {
            return 1835934785;
        }

        private Cancelled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Cancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Cancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState$Success;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState;", "Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;", "postAuthOperations", "<init>", "(Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", "getToken", "Ljava/util/List;", "getPostAuthOperations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations;
        private final com.paypal.oslo.feature.identity.foundation.model.UserAccessToken token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccessToken, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.token = userAccessToken;
            this.postAuthOperations = list;
        }

        public final com.paypal.oslo.feature.identity.foundation.model.UserAccessToken getToken() {
            return this.token;
        }

        public /* synthetic */ Success(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(userAccessToken, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> getPostAuthOperations() {
            return this.postAuthOperations;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken = this.token;
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list = this.postAuthOperations;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(token=");
            sb.append(userAccessToken);
            sb.append(", postAuthOperations=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.token.hashCode() * 31) + this.postAuthOperations.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Success success = (com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.token, success.token) && kotlin.jvm.internal.Intrinsics.areEqual(this.postAuthOperations, success.postAuthOperations);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Success copy(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken token, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAuthOperations, "");
            return new com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Success(token, postAuthOperations);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> component2() {
            return this.postAuthOperations;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.foundation.model.UserAccessToken getToken() {
            return this.token;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Success copy$default(com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Success success, com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                userAccessToken = success.token;
            }
            if ((i & 2) != 0) {
                list = success.postAuthOperations;
            }
            return success.copy(userAccessToken, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState$ChallengeRequired;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "challengeResult", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState$ChallengeRequired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "getChallengeResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChallengeRequired extends com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState {
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
            return (other instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.ChallengeRequired) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeResult, ((com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.ChallengeRequired) other).challengeResult);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.ChallengeRequired copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResult, "");
            return new com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.ChallengeRequired(challengeResult);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getChallengeResult() {
            return this.challengeResult;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.ChallengeRequired copy$default(com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.ChallengeRequired challengeRequired, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challengeResult = challengeRequired.challengeResult;
            }
            return challengeRequired.copy(challengeResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState$FallbackToPassword;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FallbackToPassword extends com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.FallbackToPassword INSTANCE = new com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.FallbackToPassword();

        public final int hashCode() {
            return -2138790456;
        }

        private FallbackToPassword() {
            super(null);
        }

        public final java.lang.String toString() {
            return "FallbackToPassword";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.FallbackToPassword)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState$Error;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState;", "", "messageResId", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMessageResId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState {
        public static final int $stable = 0;
        private final int messageResId;

        public Error(int i) {
            super(null);
            this.messageResId = i;
        }

        public final int getMessageResId() {
            return this.messageResId;
        }

        public final java.lang.String toString() {
            int i = this.messageResId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(messageResId=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.messageResId);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Error) && this.messageResId == ((com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Error) other).messageResId;
        }

        public final com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Error copy(int messageResId) {
            return new com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Error(messageResId);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMessageResId() {
            return this.messageResId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Error copy$default(com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Error error, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = error.messageResId;
            }
            return error.copy(i);
        }
    }

    public /* synthetic */ PasskeyLoginState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
