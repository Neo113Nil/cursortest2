package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R%\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/StoresInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "", "storeIds", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/StoresInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getStoreIds"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StoresInput {
    private final com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> storeIds;

    /* JADX WARN: Multi-variable type inference failed */
    public StoresInput(com.apollographql.apollo.api.Optional<? extends java.util.List<java.lang.String>> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.storeIds = optional;
    }

    public /* synthetic */ StoresInput(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> getStoreIds() {
        return this.storeIds;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> optional = this.storeIds;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StoresInput(storeIds=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.storeIds.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.api.graphql.schema.type.StoresInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.storeIds, ((com.paypal.oslo.api.graphql.schema.type.StoresInput) other).storeIds);
    }

    public final com.paypal.oslo.api.graphql.schema.type.StoresInput copy(com.apollographql.apollo.api.Optional<? extends java.util.List<java.lang.String>> storeIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeIds, "");
        return new com.paypal.oslo.api.graphql.schema.type.StoresInput(storeIds);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> component1() {
        return this.storeIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.StoresInput copy$default(com.paypal.oslo.api.graphql.schema.type.StoresInput storesInput, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = storesInput.storeIds;
        }
        return storesInput.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoresInput() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
