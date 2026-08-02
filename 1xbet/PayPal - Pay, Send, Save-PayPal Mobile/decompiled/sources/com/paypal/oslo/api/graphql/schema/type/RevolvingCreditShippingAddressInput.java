package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditShippingAddressInput;", "", "Lcom/apollographql/apollo/api/Optional;", "id", "Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;", "address", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditShippingAddressInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RevolvingCreditShippingAddressInput {
    private final com.paypal.oslo.api.graphql.schema.type.AddressInput address;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> id;

    public RevolvingCreditShippingAddressInput(com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional, com.paypal.oslo.api.graphql.schema.type.AddressInput addressInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressInput, "");
        this.id = optional;
        this.address = addressInput;
    }

    public /* synthetic */ RevolvingCreditShippingAddressInput(com.apollographql.apollo.api.Optional.Absent absent, com.paypal.oslo.api.graphql.schema.type.AddressInput addressInput, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, addressInput);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getId() {
        return this.id;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AddressInput getAddress() {
        return this.address;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.id;
        com.paypal.oslo.api.graphql.schema.type.AddressInput addressInput = this.address;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditShippingAddressInput(id=");
        sb.append(optional);
        sb.append(", address=");
        sb.append(addressInput);
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
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RevolvingCreditShippingAddressInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditShippingAddressInput revolvingCreditShippingAddressInput = (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditShippingAddressInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, revolvingCreditShippingAddressInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, revolvingCreditShippingAddressInput.address);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditShippingAddressInput copy(com.apollographql.apollo.api.Optional<? extends java.lang.Object> id, com.paypal.oslo.api.graphql.schema.type.AddressInput address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditShippingAddressInput(id, address);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AddressInput getAddress() {
        return this.address;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component1() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RevolvingCreditShippingAddressInput copy$default(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditShippingAddressInput revolvingCreditShippingAddressInput, com.apollographql.apollo.api.Optional optional, com.paypal.oslo.api.graphql.schema.type.AddressInput addressInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = revolvingCreditShippingAddressInput.id;
        }
        if ((i & 2) != 0) {
            addressInput = revolvingCreditShippingAddressInput.address;
        }
        return revolvingCreditShippingAddressInput.copy(optional, addressInput);
    }
}
