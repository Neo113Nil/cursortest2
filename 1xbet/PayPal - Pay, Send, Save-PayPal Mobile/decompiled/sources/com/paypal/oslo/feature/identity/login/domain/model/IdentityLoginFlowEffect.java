package com.paypal.oslo.feature.identity.login.domain.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect;", "", "<init>", "()V", "AttemptBiometric", "AttemptPasskey", "PrefetchAuthOptions", "NavigateToFullScreenAuth", "NavigateToInContextBottomSheet", "NavigateToStepUpChallenge", "RunPostLogin", "CancelInFlightEffects", "DismissAuthUI", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$AttemptBiometric;", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$AttemptPasskey;", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$CancelInFlightEffects;", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$DismissAuthUI;", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$NavigateToFullScreenAuth;", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$NavigateToInContextBottomSheet;", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$NavigateToStepUpChallenge;", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$PrefetchAuthOptions;", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$RunPostLogin;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class IdentityLoginFlowEffect {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$AttemptBiometric;", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AttemptBiometric extends com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.AttemptBiometric INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.AttemptBiometric();

        public final int hashCode() {
            return 351006042;
        }

        private AttemptBiometric() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AttemptBiometric";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.AttemptBiometric)) {
                return false;
            }
            return true;
        }
    }

    private IdentityLoginFlowEffect() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$AttemptPasskey;", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect;", "", "userId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$AttemptPasskey;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUserId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AttemptPasskey extends com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect {
        public static final int $stable = 0;
        private final java.lang.String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AttemptPasskey(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.userId = str;
        }

        public final java.lang.String getUserId() {
            return this.userId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.userId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AttemptPasskey(userId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.userId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.AttemptPasskey) && kotlin.jvm.internal.Intrinsics.areEqual(this.userId, ((com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.AttemptPasskey) other).userId);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.AttemptPasskey copy(java.lang.String userId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.AttemptPasskey(userId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUserId() {
            return this.userId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.AttemptPasskey copy$default(com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.AttemptPasskey attemptPasskey, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = attemptPasskey.userId;
            }
            return attemptPasskey.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$PrefetchAuthOptions;", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect;", "", "credential", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$PrefetchAuthOptions;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrefetchAuthOptions extends com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect {
        public static final int $stable = 0;
        private final java.lang.String credential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrefetchAuthOptions(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.credential = str;
        }

        public final java.lang.String getCredential() {
            return this.credential;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.credential;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrefetchAuthOptions(credential=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.credential.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.PrefetchAuthOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.credential, ((com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.PrefetchAuthOptions) other).credential);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.PrefetchAuthOptions copy(java.lang.String credential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credential, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.PrefetchAuthOptions(credential);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCredential() {
            return this.credential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.PrefetchAuthOptions copy$default(com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.PrefetchAuthOptions prefetchAuthOptions, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = prefetchAuthOptions.credential;
            }
            return prefetchAuthOptions.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$NavigateToFullScreenAuth;", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect;", "Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;", "tokenType", "<init>", "(Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;)V", "component1", "()Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;", "copy", "(Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;)Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$NavigateToFullScreenAuth;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;", "getTokenType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToFullScreenAuth extends com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType tokenType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToFullScreenAuth(com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccessTokenType, "");
            this.tokenType = userAccessTokenType;
        }

        public final com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType getTokenType() {
            return this.tokenType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType = this.tokenType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToFullScreenAuth(tokenType=");
            sb.append(userAccessTokenType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.tokenType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToFullScreenAuth) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenType, ((com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToFullScreenAuth) other).tokenType);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToFullScreenAuth copy(com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType tokenType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenType, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToFullScreenAuth(tokenType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType getTokenType() {
            return this.tokenType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToFullScreenAuth copy$default(com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToFullScreenAuth navigateToFullScreenAuth, com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                userAccessTokenType = navigateToFullScreenAuth.tokenType;
            }
            return navigateToFullScreenAuth.copy(userAccessTokenType);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$NavigateToInContextBottomSheet;", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect;", "", "credential", "displayName", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "authOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$NavigateToInContextBottomSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCredential", "getDisplayName", "Ljava/util/List;", "getAuthOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToInContextBottomSheet extends com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> authOptions;
        private final java.lang.String credential;
        private final java.lang.String displayName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NavigateToInContextBottomSheet(java.lang.String str, java.lang.String str2, java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.credential = str;
            this.displayName = str2;
            this.authOptions = list;
        }

        public final java.lang.String getCredential() {
            return this.credential;
        }

        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> getAuthOptions() {
            return this.authOptions;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.credential;
            java.lang.String str2 = this.displayName;
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list = this.authOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToInContextBottomSheet(credential=");
            sb.append(str);
            sb.append(", displayName=");
            sb.append(str2);
            sb.append(", authOptions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.credential.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.authOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToInContextBottomSheet)) {
                return false;
            }
            com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToInContextBottomSheet navigateToInContextBottomSheet = (com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToInContextBottomSheet) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.credential, navigateToInContextBottomSheet.credential) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, navigateToInContextBottomSheet.displayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.authOptions, navigateToInContextBottomSheet.authOptions);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToInContextBottomSheet copy(java.lang.String credential, java.lang.String displayName, java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> authOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credential, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authOptions, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToInContextBottomSheet(credential, displayName, authOptions);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> component3() {
            return this.authOptions;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCredential() {
            return this.credential;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToInContextBottomSheet copy$default(com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToInContextBottomSheet navigateToInContextBottomSheet, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToInContextBottomSheet.credential;
            }
            if ((i & 2) != 0) {
                str2 = navigateToInContextBottomSheet.displayName;
            }
            if ((i & 4) != 0) {
                list = navigateToInContextBottomSheet.authOptions;
            }
            return navigateToInContextBottomSheet.copy(str, str2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$NavigateToStepUpChallenge;", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$NavigateToStepUpChallenge;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "getChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToStepUpChallenge extends com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challenge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToStepUpChallenge(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResult, "");
            this.challenge = challengeResult;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getChallenge() {
            return this.challenge;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult = this.challenge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToStepUpChallenge(challenge=");
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
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToStepUpChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, ((com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToStepUpChallenge) other).challenge);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToStepUpChallenge copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToStepUpChallenge(challenge);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToStepUpChallenge copy$default(com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToStepUpChallenge navigateToStepUpChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challengeResult = navigateToStepUpChallenge.challenge;
            }
            return navigateToStepUpChallenge.copy(challengeResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$RunPostLogin;", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect;", "Lcom/paypal/oslo/core/identity/domain/model/Token;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "<init>", "(Lcom/paypal/oslo/core/identity/domain/model/Token;)V", "component1", "()Lcom/paypal/oslo/core/identity/domain/model/Token;", "copy", "(Lcom/paypal/oslo/core/identity/domain/model/Token;)Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$RunPostLogin;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/identity/domain/model/Token;", "getToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RunPostLogin extends com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.identity.domain.model.Token token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RunPostLogin(com.paypal.oslo.core.identity.domain.model.Token token) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            this.token = token;
        }

        public final com.paypal.oslo.core.identity.domain.model.Token getToken() {
            return this.token;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.identity.domain.model.Token token = this.token;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RunPostLogin(token=");
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
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.RunPostLogin) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, ((com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.RunPostLogin) other).token);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.RunPostLogin copy(com.paypal.oslo.core.identity.domain.model.Token token) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.RunPostLogin(token);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.identity.domain.model.Token getToken() {
            return this.token;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.RunPostLogin copy$default(com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.RunPostLogin runPostLogin, com.paypal.oslo.core.identity.domain.model.Token token, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                token = runPostLogin.token;
            }
            return runPostLogin.copy(token);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$CancelInFlightEffects;", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CancelInFlightEffects extends com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.CancelInFlightEffects INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.CancelInFlightEffects();

        public final int hashCode() {
            return -521659420;
        }

        private CancelInFlightEffects() {
            super(null);
        }

        public final java.lang.String toString() {
            return "CancelInFlightEffects";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.CancelInFlightEffects)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$DismissAuthUI;", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissAuthUI extends com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.DismissAuthUI INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.DismissAuthUI();

        public final int hashCode() {
            return 2024058583;
        }

        private DismissAuthUI() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DismissAuthUI";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.DismissAuthUI)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ IdentityLoginFlowEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
