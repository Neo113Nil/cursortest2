package com.paypal.oslo.feature.debitcard.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "firstName", "lastName", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment$BillingAddress;", "billingAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment$BillingAddress;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment$BillingAddress;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment$BillingAddress;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFirstName", "getLastName", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment$BillingAddress;", "getBillingAddress", "BillingAddress", "Address"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitInstrumentCardHolderFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.BillingAddress billingAddress;
    private final java.lang.String firstName;
    private final java.lang.String lastName;

    public DebitInstrumentCardHolderFragment(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.BillingAddress billingAddress) {
        this.firstName = str;
        this.lastName = str2;
        this.billingAddress = billingAddress;
    }

    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    public final java.lang.String getLastName() {
        return this.lastName;
    }

    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment$BillingAddress;", "", "", "id", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment$Address;", "address", "", "displayAddress", "Lcom/paypal/oslo/api/graphql/schema/type/AddressNormalizationStatus;", "normalizationStatus", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment$Address;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/AddressNormalizationStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment$Address;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/AddressNormalizationStatus;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment$Address;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/AddressNormalizationStatus;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment$BillingAddress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment$Address;", "getAddress", "Ljava/util/List;", "getDisplayAddress", "Lcom/paypal/oslo/api/graphql/schema/type/AddressNormalizationStatus;", "getNormalizationStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BillingAddress {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.Address address;
        private final java.util.List<java.lang.String> displayAddress;
        private final java.lang.String id;
        private final com.paypal.oslo.api.graphql.schema.type.AddressNormalizationStatus normalizationStatus;

        public BillingAddress(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.Address address, java.util.List<java.lang.String> list, com.paypal.oslo.api.graphql.schema.type.AddressNormalizationStatus addressNormalizationStatus) {
            this.id = str;
            this.address = address;
            this.displayAddress = list;
            this.normalizationStatus = addressNormalizationStatus;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.Address getAddress() {
            return this.address;
        }

        public final java.util.List<java.lang.String> getDisplayAddress() {
            return this.displayAddress;
        }

        public final com.paypal.oslo.api.graphql.schema.type.AddressNormalizationStatus getNormalizationStatus() {
            return this.normalizationStatus;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.Address address = this.address;
            java.util.List<java.lang.String> list = this.displayAddress;
            com.paypal.oslo.api.graphql.schema.type.AddressNormalizationStatus addressNormalizationStatus = this.normalizationStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BillingAddress(id=");
            sb.append(str);
            sb.append(", address=");
            sb.append(address);
            sb.append(", displayAddress=");
            sb.append(list);
            sb.append(", normalizationStatus=");
            sb.append(addressNormalizationStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.id;
            int hashCode = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.Address address = this.address;
            int hashCode2 = address == null ? 0 : address.hashCode();
            java.util.List<java.lang.String> list = this.displayAddress;
            int hashCode3 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.api.graphql.schema.type.AddressNormalizationStatus addressNormalizationStatus = this.normalizationStatus;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (addressNormalizationStatus != null ? addressNormalizationStatus.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.BillingAddress)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.BillingAddress billingAddress = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.BillingAddress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, billingAddress.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, billingAddress.address) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayAddress, billingAddress.displayAddress) && this.normalizationStatus == billingAddress.normalizationStatus;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.BillingAddress copy(java.lang.String id, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.Address address, java.util.List<java.lang.String> displayAddress, com.paypal.oslo.api.graphql.schema.type.AddressNormalizationStatus normalizationStatus) {
            return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.BillingAddress(id, address, displayAddress, normalizationStatus);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.AddressNormalizationStatus getNormalizationStatus() {
            return this.normalizationStatus;
        }

        public final java.util.List<java.lang.String> component3() {
            return this.displayAddress;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.Address getAddress() {
            return this.address;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.BillingAddress copy$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.BillingAddress billingAddress, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.Address address, java.util.List list, com.paypal.oslo.api.graphql.schema.type.AddressNormalizationStatus addressNormalizationStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = billingAddress.id;
            }
            if ((i & 2) != 0) {
                address = billingAddress.address;
            }
            if ((i & 4) != 0) {
                list = billingAddress.displayAddress;
            }
            if ((i & 8) != 0) {
                addressNormalizationStatus = billingAddress.normalizationStatus;
            }
            return billingAddress.copy(str, address, list, addressNormalizationStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJV\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b$\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment$Address;", "", "", "addressLine1", "addressLine2", "adminArea1", "adminArea2", "countryCode", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Object;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment$Address;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddressLine1", "getAddressLine2", "getAdminArea1", "getAdminArea2", "Ljava/lang/Object;", "getCountryCode", "getPostalCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Address {
        public static final int $stable = 8;
        private final java.lang.String addressLine1;
        private final java.lang.String addressLine2;
        private final java.lang.String adminArea1;
        private final java.lang.String adminArea2;
        private final java.lang.Object countryCode;
        private final java.lang.String postalCode;

        public Address(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Object obj, java.lang.String str5) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.addressLine1 = str;
            this.addressLine2 = str2;
            this.adminArea1 = str3;
            this.adminArea2 = str4;
            this.countryCode = obj;
            this.postalCode = str5;
        }

        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }

        public final java.lang.String getAddressLine2() {
            return this.addressLine2;
        }

        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.addressLine1;
            java.lang.String str2 = this.addressLine2;
            java.lang.String str3 = this.adminArea1;
            java.lang.String str4 = this.adminArea2;
            java.lang.Object obj = this.countryCode;
            java.lang.String str5 = this.postalCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Address(addressLine1=");
            sb.append(str);
            sb.append(", addressLine2=");
            sb.append(str2);
            sb.append(", adminArea1=");
            sb.append(str3);
            sb.append(", adminArea2=");
            sb.append(str4);
            sb.append(", countryCode=");
            sb.append(obj);
            sb.append(", postalCode=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.addressLine1;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.addressLine2;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.adminArea1;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.adminArea2;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            int hashCode5 = this.countryCode.hashCode();
            java.lang.String str5 = this.postalCode;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.Address)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.Address address = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.Address) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine1, address.addressLine1) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine2, address.addressLine2) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea1, address.adminArea1) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea2, address.adminArea2) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, address.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.postalCode, address.postalCode);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.Address copy(java.lang.String addressLine1, java.lang.String addressLine2, java.lang.String adminArea1, java.lang.String adminArea2, java.lang.Object countryCode, java.lang.String postalCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.Address(addressLine1, addressLine2, adminArea1, adminArea2, countryCode, postalCode);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAddressLine2() {
            return this.addressLine2;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.Address copy$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.Address address, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Object obj, java.lang.String str5, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = address.addressLine1;
            }
            if ((i & 2) != 0) {
                str2 = address.addressLine2;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = address.adminArea1;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = address.adminArea2;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                obj = address.countryCode;
            }
            java.lang.Object obj3 = obj;
            if ((i & 32) != 0) {
                str5 = address.postalCode;
            }
            return address.copy(str, str6, str7, str8, obj3, str5);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.firstName;
        java.lang.String str2 = this.lastName;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.BillingAddress billingAddress = this.billingAddress;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentCardHolderFragment(firstName=");
        sb.append(str);
        sb.append(", lastName=");
        sb.append(str2);
        sb.append(", billingAddress=");
        sb.append(billingAddress);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.firstName;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.lastName;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.BillingAddress billingAddress = this.billingAddress;
        return (((hashCode * 31) + hashCode2) * 31) + (billingAddress != null ? billingAddress.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment debitInstrumentCardHolderFragment = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.firstName, debitInstrumentCardHolderFragment.firstName) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastName, debitInstrumentCardHolderFragment.lastName) && kotlin.jvm.internal.Intrinsics.areEqual(this.billingAddress, debitInstrumentCardHolderFragment.billingAddress);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment copy(java.lang.String firstName, java.lang.String lastName, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.BillingAddress billingAddress) {
        return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment(firstName, lastName, billingAddress);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastName() {
        return this.lastName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment copy$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment debitInstrumentCardHolderFragment, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.BillingAddress billingAddress, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = debitInstrumentCardHolderFragment.firstName;
        }
        if ((i & 2) != 0) {
            str2 = debitInstrumentCardHolderFragment.lastName;
        }
        if ((i & 4) != 0) {
            billingAddress = debitInstrumentCardHolderFragment.billingAddress;
        }
        return debitInstrumentCardHolderFragment.copy(str, str2, billingAddress);
    }
}
