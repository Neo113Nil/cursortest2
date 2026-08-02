package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ>\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdateDebitInstrumentBillingAddressInput;", "", "", "instrumentId", "Lcom/apollographql/apollo/api/Optional;", "addressId", "Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;", "address", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateDebitInstrumentBillingAddressInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInstrumentId", "Lcom/apollographql/apollo/api/Optional;", "getAddressId", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateDebitInstrumentBillingAddressInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AddressInput> address;
    private final com.apollographql.apollo.api.Optional<java.lang.String> addressId;
    private final java.lang.String instrumentId;

    public UpdateDebitInstrumentBillingAddressInput(java.lang.String str, com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AddressInput> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.instrumentId = str;
        this.addressId = optional;
        this.address = optional2;
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public /* synthetic */ UpdateDebitInstrumentBillingAddressInput(java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getAddressId() {
        return this.addressId;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AddressInput> getAddress() {
        return this.address;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.instrumentId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.addressId;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AddressInput> optional2 = this.address;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateDebitInstrumentBillingAddressInput(instrumentId=");
        sb.append(str);
        sb.append(", addressId=");
        sb.append(optional);
        sb.append(", address=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.instrumentId.hashCode() * 31) + this.addressId.hashCode()) * 31) + this.address.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdateDebitInstrumentBillingAddressInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdateDebitInstrumentBillingAddressInput updateDebitInstrumentBillingAddressInput = (com.paypal.oslo.api.graphql.schema.type.UpdateDebitInstrumentBillingAddressInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, updateDebitInstrumentBillingAddressInput.instrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressId, updateDebitInstrumentBillingAddressInput.addressId) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, updateDebitInstrumentBillingAddressInput.address);
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateDebitInstrumentBillingAddressInput copy(java.lang.String instrumentId, com.apollographql.apollo.api.Optional<java.lang.String> addressId, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AddressInput> address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdateDebitInstrumentBillingAddressInput(instrumentId, addressId, address);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AddressInput> component3() {
        return this.address;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.addressId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdateDebitInstrumentBillingAddressInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdateDebitInstrumentBillingAddressInput updateDebitInstrumentBillingAddressInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = updateDebitInstrumentBillingAddressInput.instrumentId;
        }
        if ((i & 2) != 0) {
            optional = updateDebitInstrumentBillingAddressInput.addressId;
        }
        if ((i & 4) != 0) {
            optional2 = updateDebitInstrumentBillingAddressInput.address;
        }
        return updateDebitInstrumentBillingAddressInput.copy(str, optional, optional2);
    }
}
