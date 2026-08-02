package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ4\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MerchantSortingInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantCatalogSortBy;", "sortBy", "Lcom/paypal/oslo/api/graphql/schema/type/SortOrder;", "sortOrder", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/MerchantSortingInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getSortBy", "getSortOrder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MerchantSortingInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MerchantCatalogSortBy> sortBy;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SortOrder> sortOrder;

    /* JADX WARN: Multi-variable type inference failed */
    public MerchantSortingInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.MerchantCatalogSortBy> optional, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.SortOrder> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.sortBy = optional;
        this.sortOrder = optional2;
    }

    public /* synthetic */ MerchantSortingInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MerchantCatalogSortBy> getSortBy() {
        return this.sortBy;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SortOrder> getSortOrder() {
        return this.sortOrder;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MerchantCatalogSortBy> optional = this.sortBy;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SortOrder> optional2 = this.sortOrder;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MerchantSortingInput(sortBy=");
        sb.append(optional);
        sb.append(", sortOrder=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.sortBy.hashCode() * 31) + this.sortOrder.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput merchantSortingInput = (com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sortBy, merchantSortingInput.sortBy) && kotlin.jvm.internal.Intrinsics.areEqual(this.sortOrder, merchantSortingInput.sortOrder);
    }

    public final com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.MerchantCatalogSortBy> sortBy, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.SortOrder> sortOrder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sortBy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sortOrder, "");
        return new com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput(sortBy, sortOrder);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SortOrder> component2() {
        return this.sortOrder;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MerchantCatalogSortBy> component1() {
        return this.sortBy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput copy$default(com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput merchantSortingInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = merchantSortingInput.sortBy;
        }
        if ((i & 2) != 0) {
            optional2 = merchantSortingInput.sortOrder;
        }
        return merchantSortingInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MerchantSortingInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
