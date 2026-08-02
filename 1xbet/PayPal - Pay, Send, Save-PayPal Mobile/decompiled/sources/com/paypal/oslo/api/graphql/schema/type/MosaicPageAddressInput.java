package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageAddressInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;", "address", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;)Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageAddressInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MosaicPageAddressInput {
    private final com.paypal.oslo.api.graphql.schema.type.AddressInput address;
    private final com.apollographql.apollo.api.Optional<java.lang.String> id;

    public MosaicPageAddressInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, com.paypal.oslo.api.graphql.schema.type.AddressInput addressInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressInput, "");
        this.id = optional;
        this.address = addressInput;
    }

    public /* synthetic */ MosaicPageAddressInput(com.apollographql.apollo.api.Optional.Absent absent, com.paypal.oslo.api.graphql.schema.type.AddressInput addressInput, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, addressInput);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getId() {
        return this.id;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AddressInput getAddress() {
        return this.address;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.id;
        com.paypal.oslo.api.graphql.schema.type.AddressInput addressInput = this.address;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MosaicPageAddressInput(id=");
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
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.MosaicPageAddressInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.MosaicPageAddressInput mosaicPageAddressInput = (com.paypal.oslo.api.graphql.schema.type.MosaicPageAddressInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, mosaicPageAddressInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, mosaicPageAddressInput.address);
    }

    public final com.paypal.oslo.api.graphql.schema.type.MosaicPageAddressInput copy(com.apollographql.apollo.api.Optional<java.lang.String> id, com.paypal.oslo.api.graphql.schema.type.AddressInput address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.api.graphql.schema.type.MosaicPageAddressInput(id, address);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AddressInput getAddress() {
        return this.address;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MosaicPageAddressInput copy$default(com.paypal.oslo.api.graphql.schema.type.MosaicPageAddressInput mosaicPageAddressInput, com.apollographql.apollo.api.Optional optional, com.paypal.oslo.api.graphql.schema.type.AddressInput addressInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = mosaicPageAddressInput.id;
        }
        if ((i & 2) != 0) {
            addressInput = mosaicPageAddressInput.address;
        }
        return mosaicPageAddressInput.copy(optional, addressInput);
    }
}
