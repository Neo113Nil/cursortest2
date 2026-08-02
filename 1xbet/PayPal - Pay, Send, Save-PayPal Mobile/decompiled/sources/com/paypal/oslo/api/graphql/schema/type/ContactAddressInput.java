package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ContactAddressInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;", "address", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/ContactAddressType;", "type", "Lcom/paypal/oslo/api/graphql/schema/type/CustomerNameInput;", "recipientName", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ContactAddressInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;", "getAddress", "Lcom/apollographql/apollo/api/Optional;", "getType", "getRecipientName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ContactAddressInput {
    private final com.paypal.oslo.api.graphql.schema.type.AddressInput address;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CustomerNameInput> recipientName;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ContactAddressType> type;

    /* JADX WARN: Multi-variable type inference failed */
    public ContactAddressInput(com.paypal.oslo.api.graphql.schema.type.AddressInput addressInput, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ContactAddressType> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CustomerNameInput> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.address = addressInput;
        this.type = optional;
        this.recipientName = optional2;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AddressInput getAddress() {
        return this.address;
    }

    public /* synthetic */ ContactAddressInput(com.paypal.oslo.api.graphql.schema.type.AddressInput addressInput, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(addressInput, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ContactAddressType> getType() {
        return this.type;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CustomerNameInput> getRecipientName() {
        return this.recipientName;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.AddressInput addressInput = this.address;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ContactAddressType> optional = this.type;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CustomerNameInput> optional2 = this.recipientName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactAddressInput(address=");
        sb.append(addressInput);
        sb.append(", type=");
        sb.append(optional);
        sb.append(", recipientName=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.address.hashCode() * 31) + this.type.hashCode()) * 31) + this.recipientName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ContactAddressInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ContactAddressInput contactAddressInput = (com.paypal.oslo.api.graphql.schema.type.ContactAddressInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.address, contactAddressInput.address) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, contactAddressInput.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.recipientName, contactAddressInput.recipientName);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ContactAddressInput copy(com.paypal.oslo.api.graphql.schema.type.AddressInput address, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ContactAddressType> type, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CustomerNameInput> recipientName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recipientName, "");
        return new com.paypal.oslo.api.graphql.schema.type.ContactAddressInput(address, type, recipientName);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CustomerNameInput> component3() {
        return this.recipientName;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ContactAddressType> component2() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AddressInput getAddress() {
        return this.address;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ContactAddressInput copy$default(com.paypal.oslo.api.graphql.schema.type.ContactAddressInput contactAddressInput, com.paypal.oslo.api.graphql.schema.type.AddressInput addressInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            addressInput = contactAddressInput.address;
        }
        if ((i & 2) != 0) {
            optional = contactAddressInput.type;
        }
        if ((i & 4) != 0) {
            optional2 = contactAddressInput.recipientName;
        }
        return contactAddressInput.copy(addressInput, optional, optional2);
    }
}
