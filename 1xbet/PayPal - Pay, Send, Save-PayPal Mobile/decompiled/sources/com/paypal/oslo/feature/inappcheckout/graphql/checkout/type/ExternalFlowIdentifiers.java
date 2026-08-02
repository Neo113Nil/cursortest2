package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalFlowIdentifiers;", "", "Lcom/apollographql/apollo/api/Optional;", "", "instantVault", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalFlowIdentifiers;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getInstantVault"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExternalFlowIdentifiers {
    public static final int $stable = 8;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> instantVault;

    public ExternalFlowIdentifiers(com.apollographql.apollo.api.Optional<java.lang.Boolean> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.instantVault = optional;
    }

    public /* synthetic */ ExternalFlowIdentifiers(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getInstantVault() {
        return this.instantVault;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional = this.instantVault;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalFlowIdentifiers(instantVault=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.instantVault.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFlowIdentifiers) && kotlin.jvm.internal.Intrinsics.areEqual(this.instantVault, ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFlowIdentifiers) other).instantVault);
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFlowIdentifiers copy(com.apollographql.apollo.api.Optional<java.lang.Boolean> instantVault) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instantVault, "");
        return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFlowIdentifiers(instantVault);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component1() {
        return this.instantVault;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFlowIdentifiers copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFlowIdentifiers externalFlowIdentifiers, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = externalFlowIdentifiers.instantVault;
        }
        return externalFlowIdentifiers.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExternalFlowIdentifiers() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
