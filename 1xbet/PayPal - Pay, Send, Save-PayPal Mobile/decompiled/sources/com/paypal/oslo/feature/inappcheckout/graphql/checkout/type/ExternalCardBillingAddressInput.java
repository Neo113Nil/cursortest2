package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ4\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBillingAddressInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "id", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAddressInput;", "address", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBillingAddressInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getId", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExternalCardBillingAddressInput {
    public static final int $stable = 8;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddressInput> address;
    private final com.apollographql.apollo.api.Optional<java.lang.String> id;

    public ExternalCardBillingAddressInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddressInput> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.id = optional;
        this.address = optional2;
    }

    public /* synthetic */ ExternalCardBillingAddressInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getId() {
        return this.id;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddressInput> getAddress() {
        return this.address;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.id;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddressInput> optional2 = this.address;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalCardBillingAddressInput(id=");
        sb.append(optional);
        sb.append(", address=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.id.hashCode() * 31) + this.address.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput externalCardBillingAddressInput = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, externalCardBillingAddressInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, externalCardBillingAddressInput.address);
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput copy(com.apollographql.apollo.api.Optional<java.lang.String> id, com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddressInput> address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput(id, address);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddressInput> component2() {
        return this.address;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput externalCardBillingAddressInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = externalCardBillingAddressInput.id;
        }
        if ((i & 2) != 0) {
            optional2 = externalCardBillingAddressInput.address;
        }
        return externalCardBillingAddressInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExternalCardBillingAddressInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
