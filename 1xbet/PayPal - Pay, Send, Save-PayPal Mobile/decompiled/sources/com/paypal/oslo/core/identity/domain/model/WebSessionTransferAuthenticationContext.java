package com.paypal.oslo.core.identity.domain.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferAuthenticationContext;", "Lcom/paypal/oslo/core/identity/domain/model/SessionTransferAuthenticationContext;", "Lcom/paypal/oslo/core/identity/domain/model/Tenant;", "tenant", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "context", "", "redirectUri", "Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;", "intent", "<init>", "(Lcom/paypal/oslo/core/identity/domain/model/Tenant;Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;Ljava/lang/String;Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;)V", "component1", "()Lcom/paypal/oslo/core/identity/domain/model/Tenant;", "component2", "()Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;", "copy", "(Lcom/paypal/oslo/core/identity/domain/model/Tenant;Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;Ljava/lang/String;Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;)Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferAuthenticationContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/identity/domain/model/Tenant;", "getTenant", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "getContext", "Ljava/lang/String;", "getRedirectUri", "Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class WebSessionTransferAuthenticationContext implements com.paypal.oslo.core.identity.domain.model.SessionTransferAuthenticationContext {
    private final com.paypal.oslo.core.identity.domain.model.AuthenticationContext context;
    private final com.paypal.oslo.core.identity.domain.model.SessionTransferIntent intent;
    private final java.lang.String redirectUri;
    private final com.paypal.oslo.core.identity.domain.model.Tenant tenant;

    public WebSessionTransferAuthenticationContext(com.paypal.oslo.core.identity.domain.model.Tenant tenant, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, java.lang.String str, com.paypal.oslo.core.identity.domain.model.SessionTransferIntent sessionTransferIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tenant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionTransferIntent, "");
        this.tenant = tenant;
        this.context = authenticationContext;
        this.redirectUri = str;
        this.intent = sessionTransferIntent;
    }

    public final com.paypal.oslo.core.identity.domain.model.Tenant getTenant() {
        return this.tenant;
    }

    @Override // com.paypal.oslo.core.identity.domain.model.SessionTransferAuthenticationContext
    public final com.paypal.oslo.core.identity.domain.model.AuthenticationContext getContext() {
        return this.context;
    }

    public final java.lang.String getRedirectUri() {
        return this.redirectUri;
    }

    public /* synthetic */ WebSessionTransferAuthenticationContext(com.paypal.oslo.core.identity.domain.model.Tenant tenant, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, java.lang.String str, com.paypal.oslo.core.identity.domain.model.SessionTransferIntent sessionTransferIntent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(tenant, authenticationContext, str, (i & 8) != 0 ? com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.WEB_SINGLE_SIGN_ON : sessionTransferIntent);
    }

    @Override // com.paypal.oslo.core.identity.domain.model.SessionTransferAuthenticationContext
    public final com.paypal.oslo.core.identity.domain.model.SessionTransferIntent getIntent() {
        return this.intent;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.identity.domain.model.Tenant tenant = this.tenant;
        com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext = this.context;
        java.lang.String str = this.redirectUri;
        com.paypal.oslo.core.identity.domain.model.SessionTransferIntent sessionTransferIntent = this.intent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WebSessionTransferAuthenticationContext(tenant=");
        sb.append(tenant);
        sb.append(", context=");
        sb.append(authenticationContext);
        sb.append(", redirectUri=");
        sb.append(str);
        sb.append(", intent=");
        sb.append(sessionTransferIntent);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.tenant.hashCode() * 31) + this.context.hashCode()) * 31) + this.redirectUri.hashCode()) * 31) + this.intent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferAuthenticationContext)) {
            return false;
        }
        com.paypal.oslo.core.identity.domain.model.WebSessionTransferAuthenticationContext webSessionTransferAuthenticationContext = (com.paypal.oslo.core.identity.domain.model.WebSessionTransferAuthenticationContext) other;
        return this.tenant == webSessionTransferAuthenticationContext.tenant && kotlin.jvm.internal.Intrinsics.areEqual(this.context, webSessionTransferAuthenticationContext.context) && kotlin.jvm.internal.Intrinsics.areEqual(this.redirectUri, webSessionTransferAuthenticationContext.redirectUri) && this.intent == webSessionTransferAuthenticationContext.intent;
    }

    public final com.paypal.oslo.core.identity.domain.model.WebSessionTransferAuthenticationContext copy(com.paypal.oslo.core.identity.domain.model.Tenant tenant, com.paypal.oslo.core.identity.domain.model.AuthenticationContext context, java.lang.String redirectUri, com.paypal.oslo.core.identity.domain.model.SessionTransferIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tenant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectUri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return new com.paypal.oslo.core.identity.domain.model.WebSessionTransferAuthenticationContext(tenant, context, redirectUri, intent);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.core.identity.domain.model.SessionTransferIntent getIntent() {
        return this.intent;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRedirectUri() {
        return this.redirectUri;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.identity.domain.model.AuthenticationContext getContext() {
        return this.context;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.identity.domain.model.Tenant getTenant() {
        return this.tenant;
    }

    public static /* synthetic */ com.paypal.oslo.core.identity.domain.model.WebSessionTransferAuthenticationContext copy$default(com.paypal.oslo.core.identity.domain.model.WebSessionTransferAuthenticationContext webSessionTransferAuthenticationContext, com.paypal.oslo.core.identity.domain.model.Tenant tenant, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, java.lang.String str, com.paypal.oslo.core.identity.domain.model.SessionTransferIntent sessionTransferIntent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tenant = webSessionTransferAuthenticationContext.tenant;
        }
        if ((i & 2) != 0) {
            authenticationContext = webSessionTransferAuthenticationContext.context;
        }
        if ((i & 4) != 0) {
            str = webSessionTransferAuthenticationContext.redirectUri;
        }
        if ((i & 8) != 0) {
            sessionTransferIntent = webSessionTransferAuthenticationContext.intent;
        }
        return webSessionTransferAuthenticationContext.copy(tenant, authenticationContext, str, sessionTransferIntent);
    }
}
