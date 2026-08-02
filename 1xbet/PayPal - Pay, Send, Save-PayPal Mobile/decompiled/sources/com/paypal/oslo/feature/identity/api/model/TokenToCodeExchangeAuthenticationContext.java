package com.paypal.oslo.feature.identity.api.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/TokenToCodeExchangeAuthenticationContext;", "Lcom/paypal/oslo/core/identity/domain/model/SessionTransferAuthenticationContext;", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "context", "Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;", "intent", "<init>", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;)V", "component1", "()Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "component2", "()Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;", "copy", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;)Lcom/paypal/oslo/feature/identity/api/model/TokenToCodeExchangeAuthenticationContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "getContext", "Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TokenToCodeExchangeAuthenticationContext implements com.paypal.oslo.core.identity.domain.model.SessionTransferAuthenticationContext {
    private final com.paypal.oslo.core.identity.domain.model.AuthenticationContext context;
    private final com.paypal.oslo.core.identity.domain.model.SessionTransferIntent intent;

    public TokenToCodeExchangeAuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, com.paypal.oslo.core.identity.domain.model.SessionTransferIntent sessionTransferIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionTransferIntent, "");
        this.context = authenticationContext;
        this.intent = sessionTransferIntent;
    }

    @Override // com.paypal.oslo.core.identity.domain.model.SessionTransferAuthenticationContext
    public final com.paypal.oslo.core.identity.domain.model.AuthenticationContext getContext() {
        return this.context;
    }

    @Override // com.paypal.oslo.core.identity.domain.model.SessionTransferAuthenticationContext
    public final com.paypal.oslo.core.identity.domain.model.SessionTransferIntent getIntent() {
        return this.intent;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext = this.context;
        com.paypal.oslo.core.identity.domain.model.SessionTransferIntent sessionTransferIntent = this.intent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenToCodeExchangeAuthenticationContext(context=");
        sb.append(authenticationContext);
        sb.append(", intent=");
        sb.append(sessionTransferIntent);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.context.hashCode() * 31) + this.intent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext)) {
            return false;
        }
        com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext tokenToCodeExchangeAuthenticationContext = (com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.context, tokenToCodeExchangeAuthenticationContext.context) && this.intent == tokenToCodeExchangeAuthenticationContext.intent;
    }

    public final com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext copy(com.paypal.oslo.core.identity.domain.model.AuthenticationContext context, com.paypal.oslo.core.identity.domain.model.SessionTransferIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return new com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext(context, intent);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.identity.domain.model.SessionTransferIntent getIntent() {
        return this.intent;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.identity.domain.model.AuthenticationContext getContext() {
        return this.context;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext copy$default(com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext tokenToCodeExchangeAuthenticationContext, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, com.paypal.oslo.core.identity.domain.model.SessionTransferIntent sessionTransferIntent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            authenticationContext = tokenToCodeExchangeAuthenticationContext.context;
        }
        if ((i & 2) != 0) {
            sessionTransferIntent = tokenToCodeExchangeAuthenticationContext.intent;
        }
        return tokenToCodeExchangeAuthenticationContext.copy(authenticationContext, sessionTransferIntent);
    }
}
