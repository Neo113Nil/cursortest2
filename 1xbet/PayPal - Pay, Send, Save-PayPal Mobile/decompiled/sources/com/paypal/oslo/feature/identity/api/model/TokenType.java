package com.paypal.oslo.feature.identity.api.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/TokenType;", "", "<init>", "()V", "UserAccessTokenType", "ClientAccessTokenType", "Lcom/paypal/oslo/feature/identity/api/model/TokenType$ClientAccessTokenType;", "Lcom/paypal/oslo/feature/identity/api/model/TokenType$UserAccessTokenType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class TokenType {
    private TokenType() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/TokenType$UserAccessTokenType;", "Lcom/paypal/oslo/feature/identity/api/model/TokenType;", "Lcom/paypal/oslo/feature/identity/api/model/AuthenticationContext;", "authenticationContext", "<init>", "(Lcom/paypal/oslo/feature/identity/api/model/AuthenticationContext;)V", "component1", "()Lcom/paypal/oslo/feature/identity/api/model/AuthenticationContext;", "copy", "(Lcom/paypal/oslo/feature/identity/api/model/AuthenticationContext;)Lcom/paypal/oslo/feature/identity/api/model/TokenType$UserAccessTokenType;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/api/model/AuthenticationContext;", "getAuthenticationContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserAccessTokenType extends com.paypal.oslo.feature.identity.api.model.TokenType {
        private final com.paypal.oslo.feature.identity.api.model.AuthenticationContext authenticationContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserAccessTokenType(com.paypal.oslo.feature.identity.api.model.AuthenticationContext authenticationContext) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
            this.authenticationContext = authenticationContext;
        }

        public final com.paypal.oslo.feature.identity.api.model.AuthenticationContext getAuthenticationContext() {
            return this.authenticationContext;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.api.model.AuthenticationContext authenticationContext = this.authenticationContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserAccessTokenType(authenticationContext=");
            sb.append(authenticationContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.authenticationContext.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.api.model.TokenType.UserAccessTokenType) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationContext, ((com.paypal.oslo.feature.identity.api.model.TokenType.UserAccessTokenType) other).authenticationContext);
        }

        public final com.paypal.oslo.feature.identity.api.model.TokenType.UserAccessTokenType copy(com.paypal.oslo.feature.identity.api.model.AuthenticationContext authenticationContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
            return new com.paypal.oslo.feature.identity.api.model.TokenType.UserAccessTokenType(authenticationContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.api.model.AuthenticationContext getAuthenticationContext() {
            return this.authenticationContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.TokenType.UserAccessTokenType copy$default(com.paypal.oslo.feature.identity.api.model.TokenType.UserAccessTokenType userAccessTokenType, com.paypal.oslo.feature.identity.api.model.AuthenticationContext authenticationContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authenticationContext = userAccessTokenType.authenticationContext;
            }
            return userAccessTokenType.copy(authenticationContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/TokenType$ClientAccessTokenType;", "Lcom/paypal/oslo/feature/identity/api/model/TokenType;", "Lcom/paypal/oslo/feature/identity/api/model/AuthenticationFlowContext;", "authenticationFlowContext", "<init>", "(Lcom/paypal/oslo/feature/identity/api/model/AuthenticationFlowContext;)V", "component1", "()Lcom/paypal/oslo/feature/identity/api/model/AuthenticationFlowContext;", "copy", "(Lcom/paypal/oslo/feature/identity/api/model/AuthenticationFlowContext;)Lcom/paypal/oslo/feature/identity/api/model/TokenType$ClientAccessTokenType;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/api/model/AuthenticationFlowContext;", "getAuthenticationFlowContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClientAccessTokenType extends com.paypal.oslo.feature.identity.api.model.TokenType {
        private final com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext authenticationFlowContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientAccessTokenType(com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext authenticationFlowContext) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationFlowContext, "");
            this.authenticationFlowContext = authenticationFlowContext;
        }

        public final com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext getAuthenticationFlowContext() {
            return this.authenticationFlowContext;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext authenticationFlowContext = this.authenticationFlowContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClientAccessTokenType(authenticationFlowContext=");
            sb.append(authenticationFlowContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.authenticationFlowContext.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.api.model.TokenType.ClientAccessTokenType) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationFlowContext, ((com.paypal.oslo.feature.identity.api.model.TokenType.ClientAccessTokenType) other).authenticationFlowContext);
        }

        public final com.paypal.oslo.feature.identity.api.model.TokenType.ClientAccessTokenType copy(com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext authenticationFlowContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationFlowContext, "");
            return new com.paypal.oslo.feature.identity.api.model.TokenType.ClientAccessTokenType(authenticationFlowContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext getAuthenticationFlowContext() {
            return this.authenticationFlowContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.TokenType.ClientAccessTokenType copy$default(com.paypal.oslo.feature.identity.api.model.TokenType.ClientAccessTokenType clientAccessTokenType, com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext authenticationFlowContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authenticationFlowContext = clientAccessTokenType.authenticationFlowContext;
            }
            return clientAccessTokenType.copy(authenticationFlowContext);
        }
    }

    public /* synthetic */ TokenType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
