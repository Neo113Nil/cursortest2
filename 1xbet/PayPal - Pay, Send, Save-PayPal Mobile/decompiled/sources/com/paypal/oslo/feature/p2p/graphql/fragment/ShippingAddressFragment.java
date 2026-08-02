package com.paypal.oslo.feature.p2p.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/ShippingAddressFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "id", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "Lcom/paypal/oslo/feature/p2p/graphql/fragment/ShippingAddressFragment$Address;", "address", "<init>", "(Ljava/lang/Object;ZLcom/paypal/oslo/feature/p2p/graphql/fragment/ShippingAddressFragment$Address;)V", "component1", "()Ljava/lang/Object;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/ShippingAddressFragment$Address;", "copy", "(Ljava/lang/Object;ZLcom/paypal/oslo/feature/p2p/graphql/fragment/ShippingAddressFragment$Address;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/ShippingAddressFragment;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getId", "Z", "getDefault", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/ShippingAddressFragment$Address;", "getAddress", "Address"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ShippingAddressFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment.Address address;
    private final boolean default;
    private final java.lang.Object id;

    public ShippingAddressFragment(java.lang.Object obj, boolean z, com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        this.id = obj;
        this.default = z;
        this.address = address;
    }

    public final java.lang.Object getId() {
        return this.id;
    }

    public final boolean getDefault() {
        return this.default;
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment.Address getAddress() {
        return this.address;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014Jb\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b$\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b%\u0010\rR\u001a\u0010\t\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/ShippingAddressFragment$Address;", "", "", "addressLine1", "addressLine2", "addressLine3", "adminArea1", "adminArea2", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/ShippingAddressFragment$Address;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddressLine1", "getAddressLine2", "getAddressLine3", "getAdminArea1", "getAdminArea2", "getPostalCode", "Ljava/lang/Object;", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Address {
        public static final int $stable = 8;
        private final java.lang.String addressLine1;
        private final java.lang.String addressLine2;
        private final java.lang.String addressLine3;
        private final java.lang.String adminArea1;
        private final java.lang.String adminArea2;
        private final java.lang.Object countryCode;
        private final java.lang.String postalCode;

        public Address(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.addressLine1 = str;
            this.addressLine2 = str2;
            this.addressLine3 = str3;
            this.adminArea1 = str4;
            this.adminArea2 = str5;
            this.postalCode = str6;
            this.countryCode = obj;
        }

        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }

        public final java.lang.String getAddressLine2() {
            return this.addressLine2;
        }

        public final java.lang.String getAddressLine3() {
            return this.addressLine3;
        }

        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.addressLine1;
            java.lang.String str2 = this.addressLine2;
            java.lang.String str3 = this.addressLine3;
            java.lang.String str4 = this.adminArea1;
            java.lang.String str5 = this.adminArea2;
            java.lang.String str6 = this.postalCode;
            java.lang.Object obj = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Address(addressLine1=");
            sb.append(str);
            sb.append(", addressLine2=");
            sb.append(str2);
            sb.append(", addressLine3=");
            sb.append(str3);
            sb.append(", adminArea1=");
            sb.append(str4);
            sb.append(", adminArea2=");
            sb.append(str5);
            sb.append(", postalCode=");
            sb.append(str6);
            sb.append(", countryCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.addressLine1;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.addressLine2;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.addressLine3;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.adminArea1;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.adminArea2;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.postalCode;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment.Address)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment.Address address = (com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment.Address) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine1, address.addressLine1) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine2, address.addressLine2) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine3, address.addressLine3) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea1, address.adminArea1) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea2, address.adminArea2) && kotlin.jvm.internal.Intrinsics.areEqual(this.postalCode, address.postalCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, address.countryCode);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment.Address copy(java.lang.String addressLine1, java.lang.String addressLine2, java.lang.String addressLine3, java.lang.String adminArea1, java.lang.String adminArea2, java.lang.String postalCode, java.lang.Object countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment.Address(addressLine1, addressLine2, addressLine3, adminArea1, adminArea2, postalCode, countryCode);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAddressLine3() {
            return this.addressLine3;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAddressLine2() {
            return this.addressLine2;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment.Address copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment.Address address, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = address.addressLine1;
            }
            if ((i & 2) != 0) {
                str2 = address.addressLine2;
            }
            java.lang.String str7 = str2;
            if ((i & 4) != 0) {
                str3 = address.addressLine3;
            }
            java.lang.String str8 = str3;
            if ((i & 8) != 0) {
                str4 = address.adminArea1;
            }
            java.lang.String str9 = str4;
            if ((i & 16) != 0) {
                str5 = address.adminArea2;
            }
            java.lang.String str10 = str5;
            if ((i & 32) != 0) {
                str6 = address.postalCode;
            }
            java.lang.String str11 = str6;
            if ((i & 64) != 0) {
                obj = address.countryCode;
            }
            return address.copy(str, str7, str8, str9, str10, str11, obj);
        }
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.id;
        boolean z = this.default;
        com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment.Address address = this.address;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ShippingAddressFragment(id=");
        sb.append(obj);
        sb.append(", default=");
        sb.append(z);
        sb.append(", address=");
        sb.append(address);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + java.lang.Boolean.hashCode(this.default)) * 31) + this.address.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment shippingAddressFragment = (com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, shippingAddressFragment.id) && this.default == shippingAddressFragment.default && kotlin.jvm.internal.Intrinsics.areEqual(this.address, shippingAddressFragment.address);
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment copy(java.lang.Object id, boolean r3, com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment(id, r3, address);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment.Address getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDefault() {
        return this.default;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment shippingAddressFragment, java.lang.Object obj, boolean z, com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment.Address address, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = shippingAddressFragment.id;
        }
        if ((i & 2) != 0) {
            z = shippingAddressFragment.default;
        }
        if ((i & 4) != 0) {
            address = shippingAddressFragment.address;
        }
        return shippingAddressFragment.copy(obj, z, address);
    }
}
