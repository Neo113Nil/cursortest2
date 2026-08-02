package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CheckoutDataInput;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Lcom/paypal/oslo/api/graphql/schema/type/CheckoutTokenType;", "tokenType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CheckoutTokenType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CheckoutTokenType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CheckoutTokenType;)Lcom/paypal/oslo/api/graphql/schema/type/CheckoutDataInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getToken", "Lcom/paypal/oslo/api/graphql/schema/type/CheckoutTokenType;", "getTokenType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CheckoutDataInput {
    private final java.lang.String token;
    private final com.paypal.oslo.api.graphql.schema.type.CheckoutTokenType tokenType;

    public CheckoutDataInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CheckoutTokenType checkoutTokenType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutTokenType, "");
        this.token = str;
        this.tokenType = checkoutTokenType;
    }

    public final java.lang.String getToken() {
        return this.token;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CheckoutTokenType getTokenType() {
        return this.tokenType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.token;
        com.paypal.oslo.api.graphql.schema.type.CheckoutTokenType checkoutTokenType = this.tokenType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CheckoutDataInput(token=");
        sb.append(str);
        sb.append(", tokenType=");
        sb.append(checkoutTokenType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.token.hashCode() * 31) + this.tokenType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CheckoutDataInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CheckoutDataInput checkoutDataInput = (com.paypal.oslo.api.graphql.schema.type.CheckoutDataInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.token, checkoutDataInput.token) && this.tokenType == checkoutDataInput.tokenType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CheckoutDataInput copy(java.lang.String token, com.paypal.oslo.api.graphql.schema.type.CheckoutTokenType tokenType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenType, "");
        return new com.paypal.oslo.api.graphql.schema.type.CheckoutDataInput(token, tokenType);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CheckoutTokenType getTokenType() {
        return this.tokenType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getToken() {
        return this.token;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CheckoutDataInput copy$default(com.paypal.oslo.api.graphql.schema.type.CheckoutDataInput checkoutDataInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CheckoutTokenType checkoutTokenType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = checkoutDataInput.token;
        }
        if ((i & 2) != 0) {
            checkoutTokenType = checkoutDataInput.tokenType;
        }
        return checkoutDataInput.copy(str, checkoutTokenType);
    }
}
