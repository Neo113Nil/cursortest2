package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DeauthorizePackageTrackingInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;", "identityProvider", "Lcom/apollographql/apollo/api/Optional;", "", "deleteImportedData", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/DeauthorizePackageTrackingInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;", "getIdentityProvider", "Lcom/apollographql/apollo/api/Optional;", "getDeleteImportedData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeauthorizePackageTrackingInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> deleteImportedData;
    private final com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider identityProvider;

    public DeauthorizePackageTrackingInput(com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageTrackingIdentityProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.identityProvider = packageTrackingIdentityProvider;
        this.deleteImportedData = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider getIdentityProvider() {
        return this.identityProvider;
    }

    public /* synthetic */ DeauthorizePackageTrackingInput(com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(packageTrackingIdentityProvider, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getDeleteImportedData() {
        return this.deleteImportedData;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider = this.identityProvider;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional = this.deleteImportedData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeauthorizePackageTrackingInput(identityProvider=");
        sb.append(packageTrackingIdentityProvider);
        sb.append(", deleteImportedData=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.identityProvider.hashCode() * 31) + this.deleteImportedData.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingInput deauthorizePackageTrackingInput = (com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingInput) other;
        return this.identityProvider == deauthorizePackageTrackingInput.identityProvider && kotlin.jvm.internal.Intrinsics.areEqual(this.deleteImportedData, deauthorizePackageTrackingInput.deleteImportedData);
    }

    public final com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingInput copy(com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider identityProvider, com.apollographql.apollo.api.Optional<java.lang.Boolean> deleteImportedData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteImportedData, "");
        return new com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingInput(identityProvider, deleteImportedData);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component2() {
        return this.deleteImportedData;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider getIdentityProvider() {
        return this.identityProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingInput copy$default(com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingInput deauthorizePackageTrackingInput, com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            packageTrackingIdentityProvider = deauthorizePackageTrackingInput.identityProvider;
        }
        if ((i & 2) != 0) {
            optional = deauthorizePackageTrackingInput.deleteImportedData;
        }
        return deauthorizePackageTrackingInput.copy(packageTrackingIdentityProvider, optional);
    }
}
