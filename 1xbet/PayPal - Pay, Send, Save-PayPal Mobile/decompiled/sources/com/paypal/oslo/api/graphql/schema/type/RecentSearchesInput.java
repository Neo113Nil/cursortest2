package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RecentSearchesInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "networkType", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;)Lcom/paypal/oslo/api/graphql/schema/type/RecentSearchesInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "getNetworkType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RecentSearchesInput {
    private final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType networkType;

    public RecentSearchesInput(com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactNetworkType, "");
        this.networkType = contactNetworkType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType getNetworkType() {
        return this.networkType;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType = this.networkType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RecentSearchesInput(networkType=");
        sb.append(contactNetworkType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.networkType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.api.graphql.schema.type.RecentSearchesInput) && this.networkType == ((com.paypal.oslo.api.graphql.schema.type.RecentSearchesInput) other).networkType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RecentSearchesInput copy(com.paypal.oslo.api.graphql.schema.type.ContactNetworkType networkType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
        return new com.paypal.oslo.api.graphql.schema.type.RecentSearchesInput(networkType);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType getNetworkType() {
        return this.networkType;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RecentSearchesInput copy$default(com.paypal.oslo.api.graphql.schema.type.RecentSearchesInput recentSearchesInput, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            contactNetworkType = recentSearchesInput.networkType;
        }
        return recentSearchesInput.copy(contactNetworkType);
    }
}
