package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DeauthorizePackageTrackingForAllProvidersInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "deleteImportedData", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/DeauthorizePackageTrackingForAllProvidersInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getDeleteImportedData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeauthorizePackageTrackingForAllProvidersInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> deleteImportedData;

    public DeauthorizePackageTrackingForAllProvidersInput(com.apollographql.apollo.api.Optional<java.lang.Boolean> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.deleteImportedData = optional;
    }

    public /* synthetic */ DeauthorizePackageTrackingForAllProvidersInput(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getDeleteImportedData() {
        return this.deleteImportedData;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional = this.deleteImportedData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeauthorizePackageTrackingForAllProvidersInput(deleteImportedData=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.deleteImportedData.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingForAllProvidersInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.deleteImportedData, ((com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingForAllProvidersInput) other).deleteImportedData);
    }

    public final com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingForAllProvidersInput copy(com.apollographql.apollo.api.Optional<java.lang.Boolean> deleteImportedData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteImportedData, "");
        return new com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingForAllProvidersInput(deleteImportedData);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component1() {
        return this.deleteImportedData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingForAllProvidersInput copy$default(com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingForAllProvidersInput deauthorizePackageTrackingForAllProvidersInput, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = deauthorizePackageTrackingForAllProvidersInput.deleteImportedData;
        }
        return deauthorizePackageTrackingForAllProvidersInput.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeauthorizePackageTrackingForAllProvidersInput() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
