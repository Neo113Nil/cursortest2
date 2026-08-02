package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PayoutStoreInput;", "", "", "externalId", "Lcom/paypal/oslo/api/graphql/schema/type/PayoutProviderType;", "payoutProvider", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PayoutProviderType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/PayoutProviderType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PayoutProviderType;)Lcom/paypal/oslo/api/graphql/schema/type/PayoutStoreInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getExternalId", "Lcom/paypal/oslo/api/graphql/schema/type/PayoutProviderType;", "getPayoutProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PayoutStoreInput {
    private final java.lang.String externalId;
    private final com.paypal.oslo.api.graphql.schema.type.PayoutProviderType payoutProvider;

    public PayoutStoreInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.PayoutProviderType payoutProviderType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payoutProviderType, "");
        this.externalId = str;
        this.payoutProvider = payoutProviderType;
    }

    public final java.lang.String getExternalId() {
        return this.externalId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PayoutProviderType getPayoutProvider() {
        return this.payoutProvider;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.externalId;
        com.paypal.oslo.api.graphql.schema.type.PayoutProviderType payoutProviderType = this.payoutProvider;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayoutStoreInput(externalId=");
        sb.append(str);
        sb.append(", payoutProvider=");
        sb.append(payoutProviderType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.externalId.hashCode() * 31) + this.payoutProvider.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.PayoutStoreInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.PayoutStoreInput payoutStoreInput = (com.paypal.oslo.api.graphql.schema.type.PayoutStoreInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.externalId, payoutStoreInput.externalId) && this.payoutProvider == payoutStoreInput.payoutProvider;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PayoutStoreInput copy(java.lang.String externalId, com.paypal.oslo.api.graphql.schema.type.PayoutProviderType payoutProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payoutProvider, "");
        return new com.paypal.oslo.api.graphql.schema.type.PayoutStoreInput(externalId, payoutProvider);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PayoutProviderType getPayoutProvider() {
        return this.payoutProvider;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getExternalId() {
        return this.externalId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PayoutStoreInput copy$default(com.paypal.oslo.api.graphql.schema.type.PayoutStoreInput payoutStoreInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.PayoutProviderType payoutProviderType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = payoutStoreInput.externalId;
        }
        if ((i & 2) != 0) {
            payoutProviderType = payoutStoreInput.payoutProvider;
        }
        return payoutStoreInput.copy(str, payoutProviderType);
    }
}
