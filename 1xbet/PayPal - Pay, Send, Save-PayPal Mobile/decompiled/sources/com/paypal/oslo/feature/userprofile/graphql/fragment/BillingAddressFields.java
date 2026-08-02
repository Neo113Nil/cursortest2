package com.paypal.oslo.feature.userprofile.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001/BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JX\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b*\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0017R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/fragment/BillingAddressFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "id", "", "primary", "confirmed", "addresseeName", "defaultBilling", "Lcom/paypal/oslo/api/graphql/schema/type/AddressConfirmationAuthority;", "confirmationAuthority", "Lcom/paypal/oslo/feature/userprofile/graphql/fragment/BillingAddressFields$Address;", "address", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;ZLcom/paypal/oslo/api/graphql/schema/type/AddressConfirmationAuthority;Lcom/paypal/oslo/feature/userprofile/graphql/fragment/BillingAddressFields$Address;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/AddressConfirmationAuthority;", "component7", "()Lcom/paypal/oslo/feature/userprofile/graphql/fragment/BillingAddressFields$Address;", "copy", "(Ljava/lang/String;ZZLjava/lang/String;ZLcom/paypal/oslo/api/graphql/schema/type/AddressConfirmationAuthority;Lcom/paypal/oslo/feature/userprofile/graphql/fragment/BillingAddressFields$Address;)Lcom/paypal/oslo/feature/userprofile/graphql/fragment/BillingAddressFields;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Z", "getPrimary", "getConfirmed", "getAddresseeName", "getDefaultBilling", "Lcom/paypal/oslo/api/graphql/schema/type/AddressConfirmationAuthority;", "getConfirmationAuthority", "Lcom/paypal/oslo/feature/userprofile/graphql/fragment/BillingAddressFields$Address;", "getAddress", "Address"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BillingAddressFields implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields.Address address;
    private final java.lang.String addresseeName;
    private final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority confirmationAuthority;
    private final boolean confirmed;
    private final boolean defaultBilling;
    private final java.lang.String id;
    private final boolean primary;

    public BillingAddressFields(java.lang.String str, boolean z, boolean z2, java.lang.String str2, boolean z3, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority, com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressConfirmationAuthority, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        this.id = str;
        this.primary = z;
        this.confirmed = z2;
        this.addresseeName = str2;
        this.defaultBilling = z3;
        this.confirmationAuthority = addressConfirmationAuthority;
        this.address = address;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final boolean getPrimary() {
        return this.primary;
    }

    public final boolean getConfirmed() {
        return this.confirmed;
    }

    public final java.lang.String getAddresseeName() {
        return this.addresseeName;
    }

    public final boolean getDefaultBilling() {
        return this.defaultBilling;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority getConfirmationAuthority() {
        return this.confirmationAuthority;
    }

    public final com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields.Address getAddress() {
        return this.address;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/fragment/BillingAddressFields$Address;", "", "", "__typename", "Lcom/paypal/oslo/feature/userprofile/graphql/fragment/AddressFields;", "addressFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/userprofile/graphql/fragment/AddressFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/userprofile/graphql/fragment/AddressFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/userprofile/graphql/fragment/AddressFields;)Lcom/paypal/oslo/feature/userprofile/graphql/fragment/BillingAddressFields$Address;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/userprofile/graphql/fragment/AddressFields;", "getAddressFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Address {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.userprofile.graphql.fragment.AddressFields addressFields;

        public Address(java.lang.String str, com.paypal.oslo.feature.userprofile.graphql.fragment.AddressFields addressFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressFields, "");
            this.__typename = str;
            this.addressFields = addressFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.userprofile.graphql.fragment.AddressFields getAddressFields() {
            return this.addressFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.userprofile.graphql.fragment.AddressFields addressFields = this.addressFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Address(__typename=");
            sb.append(str);
            sb.append(", addressFields=");
            sb.append(addressFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.addressFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields.Address)) {
                return false;
            }
            com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields.Address address = (com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields.Address) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, address.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressFields, address.addressFields);
        }

        public final com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields.Address copy(java.lang.String __typename, com.paypal.oslo.feature.userprofile.graphql.fragment.AddressFields addressFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressFields, "");
            return new com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields.Address(__typename, addressFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.userprofile.graphql.fragment.AddressFields getAddressFields() {
            return this.addressFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields.Address copy$default(com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields.Address address, java.lang.String str, com.paypal.oslo.feature.userprofile.graphql.fragment.AddressFields addressFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = address.__typename;
            }
            if ((i & 2) != 0) {
                addressFields = address.addressFields;
            }
            return address.copy(str, addressFields);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        boolean z = this.primary;
        boolean z2 = this.confirmed;
        java.lang.String str2 = this.addresseeName;
        boolean z3 = this.defaultBilling;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority = this.confirmationAuthority;
        com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields.Address address = this.address;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BillingAddressFields(id=");
        sb.append(str);
        sb.append(", primary=");
        sb.append(z);
        sb.append(", confirmed=");
        sb.append(z2);
        sb.append(", addresseeName=");
        sb.append(str2);
        sb.append(", defaultBilling=");
        sb.append(z3);
        sb.append(", confirmationAuthority=");
        sb.append(addressConfirmationAuthority);
        sb.append(", address=");
        sb.append(address);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.primary);
        int hashCode3 = java.lang.Boolean.hashCode(this.confirmed);
        java.lang.String str = this.addresseeName;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.defaultBilling)) * 31) + this.confirmationAuthority.hashCode()) * 31) + this.address.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields)) {
            return false;
        }
        com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields billingAddressFields = (com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, billingAddressFields.id) && this.primary == billingAddressFields.primary && this.confirmed == billingAddressFields.confirmed && kotlin.jvm.internal.Intrinsics.areEqual(this.addresseeName, billingAddressFields.addresseeName) && this.defaultBilling == billingAddressFields.defaultBilling && this.confirmationAuthority == billingAddressFields.confirmationAuthority && kotlin.jvm.internal.Intrinsics.areEqual(this.address, billingAddressFields.address);
    }

    public final com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields copy(java.lang.String id, boolean primary, boolean confirmed, java.lang.String addresseeName, boolean defaultBilling, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority confirmationAuthority, com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmationAuthority, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields(id, primary, confirmed, addresseeName, defaultBilling, confirmationAuthority, address);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields.Address getAddress() {
        return this.address;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority getConfirmationAuthority() {
        return this.confirmationAuthority;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getDefaultBilling() {
        return this.defaultBilling;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAddresseeName() {
        return this.addresseeName;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getConfirmed() {
        return this.confirmed;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields copy$default(com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields billingAddressFields, java.lang.String str, boolean z, boolean z2, java.lang.String str2, boolean z3, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority, com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields.Address address, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = billingAddressFields.id;
        }
        if ((i & 2) != 0) {
            z = billingAddressFields.primary;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = billingAddressFields.confirmed;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            str2 = billingAddressFields.addresseeName;
        }
        java.lang.String str3 = str2;
        if ((i & 16) != 0) {
            z3 = billingAddressFields.defaultBilling;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            addressConfirmationAuthority = billingAddressFields.confirmationAuthority;
        }
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority2 = addressConfirmationAuthority;
        if ((i & 64) != 0) {
            address = billingAddressFields.address;
        }
        return billingAddressFields.copy(str, z4, z5, str3, z6, addressConfirmationAuthority2, address);
    }
}
