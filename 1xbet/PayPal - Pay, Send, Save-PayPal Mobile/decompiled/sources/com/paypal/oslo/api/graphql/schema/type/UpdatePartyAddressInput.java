package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdatePartyAddressInput;", "", "", "addressId", "Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;", "address", "", "primary", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;", "component3", "()Z", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;Z)Lcom/paypal/oslo/api/graphql/schema/type/UpdatePartyAddressInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddressId", "Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;", "getAddress", "Z", "getPrimary"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdatePartyAddressInput {
    private final com.paypal.oslo.api.graphql.schema.type.AddressInput address;
    private final java.lang.String addressId;
    private final boolean primary;

    public UpdatePartyAddressInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.AddressInput addressInput, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressInput, "");
        this.addressId = str;
        this.address = addressInput;
        this.primary = z;
    }

    public final java.lang.String getAddressId() {
        return this.addressId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AddressInput getAddress() {
        return this.address;
    }

    public final boolean getPrimary() {
        return this.primary;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.addressId;
        com.paypal.oslo.api.graphql.schema.type.AddressInput addressInput = this.address;
        boolean z = this.primary;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePartyAddressInput(addressId=");
        sb.append(str);
        sb.append(", address=");
        sb.append(addressInput);
        sb.append(", primary=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.addressId.hashCode() * 31) + this.address.hashCode()) * 31) + java.lang.Boolean.hashCode(this.primary);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdatePartyAddressInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdatePartyAddressInput updatePartyAddressInput = (com.paypal.oslo.api.graphql.schema.type.UpdatePartyAddressInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.addressId, updatePartyAddressInput.addressId) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, updatePartyAddressInput.address) && this.primary == updatePartyAddressInput.primary;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdatePartyAddressInput copy(java.lang.String addressId, com.paypal.oslo.api.graphql.schema.type.AddressInput address, boolean primary) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdatePartyAddressInput(addressId, address, primary);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AddressInput getAddress() {
        return this.address;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAddressId() {
        return this.addressId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdatePartyAddressInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdatePartyAddressInput updatePartyAddressInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.AddressInput addressInput, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = updatePartyAddressInput.addressId;
        }
        if ((i & 2) != 0) {
            addressInput = updatePartyAddressInput.address;
        }
        if ((i & 4) != 0) {
            z = updatePartyAddressInput.primary;
        }
        return updatePartyAddressInput.copy(str, addressInput, z);
    }
}
