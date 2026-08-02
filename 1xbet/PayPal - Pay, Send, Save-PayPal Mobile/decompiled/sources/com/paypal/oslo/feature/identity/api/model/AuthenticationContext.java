package com.paypal.oslo.feature.identity.api.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/AuthenticationContext;", "", "Lcom/paypal/oslo/feature/identity/api/model/AuthenticationState;", "authenticationState", "Lcom/paypal/oslo/feature/identity/api/model/AuthenticationFlowContext;", "authenticationFlowContext", "<init>", "(Lcom/paypal/oslo/feature/identity/api/model/AuthenticationState;Lcom/paypal/oslo/feature/identity/api/model/AuthenticationFlowContext;)V", "component1", "()Lcom/paypal/oslo/feature/identity/api/model/AuthenticationState;", "component2", "()Lcom/paypal/oslo/feature/identity/api/model/AuthenticationFlowContext;", "copy", "(Lcom/paypal/oslo/feature/identity/api/model/AuthenticationState;Lcom/paypal/oslo/feature/identity/api/model/AuthenticationFlowContext;)Lcom/paypal/oslo/feature/identity/api/model/AuthenticationContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/api/model/AuthenticationState;", "getAuthenticationState", "Lcom/paypal/oslo/feature/identity/api/model/AuthenticationFlowContext;", "getAuthenticationFlowContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AuthenticationContext {
    private final com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext authenticationFlowContext;
    private final com.paypal.oslo.feature.identity.api.model.AuthenticationState authenticationState;

    public AuthenticationContext(com.paypal.oslo.feature.identity.api.model.AuthenticationState authenticationState, com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext authenticationFlowContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationFlowContext, "");
        this.authenticationState = authenticationState;
        this.authenticationFlowContext = authenticationFlowContext;
    }

    public final com.paypal.oslo.feature.identity.api.model.AuthenticationState getAuthenticationState() {
        return this.authenticationState;
    }

    public final com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext getAuthenticationFlowContext() {
        return this.authenticationFlowContext;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.api.model.AuthenticationState authenticationState = this.authenticationState;
        com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext authenticationFlowContext = this.authenticationFlowContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationContext(authenticationState=");
        sb.append(authenticationState);
        sb.append(", authenticationFlowContext=");
        sb.append(authenticationFlowContext);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.authenticationState.hashCode() * 31) + this.authenticationFlowContext.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.api.model.AuthenticationContext)) {
            return false;
        }
        com.paypal.oslo.feature.identity.api.model.AuthenticationContext authenticationContext = (com.paypal.oslo.feature.identity.api.model.AuthenticationContext) other;
        return this.authenticationState == authenticationContext.authenticationState && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationFlowContext, authenticationContext.authenticationFlowContext);
    }

    public final com.paypal.oslo.feature.identity.api.model.AuthenticationContext copy(com.paypal.oslo.feature.identity.api.model.AuthenticationState authenticationState, com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext authenticationFlowContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationFlowContext, "");
        return new com.paypal.oslo.feature.identity.api.model.AuthenticationContext(authenticationState, authenticationFlowContext);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext getAuthenticationFlowContext() {
        return this.authenticationFlowContext;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.api.model.AuthenticationState getAuthenticationState() {
        return this.authenticationState;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.AuthenticationContext copy$default(com.paypal.oslo.feature.identity.api.model.AuthenticationContext authenticationContext, com.paypal.oslo.feature.identity.api.model.AuthenticationState authenticationState, com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext authenticationFlowContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            authenticationState = authenticationContext.authenticationState;
        }
        if ((i & 2) != 0) {
            authenticationFlowContext = authenticationContext.authenticationFlowContext;
        }
        return authenticationContext.copy(authenticationState, authenticationFlowContext);
    }
}
