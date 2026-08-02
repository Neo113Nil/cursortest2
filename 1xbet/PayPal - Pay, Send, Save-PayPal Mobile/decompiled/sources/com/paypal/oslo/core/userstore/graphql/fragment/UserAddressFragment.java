package com.paypal.oslo.core.userstore.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\u00011BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JX\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\u0010R \u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0017R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "id", "", "primary", "confirmed", "addresseeName", "billing", "Lcom/paypal/oslo/api/graphql/schema/type/AddressConfirmationAuthority;", "confirmationAuthority", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment$Address;", "address", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;ZLcom/paypal/oslo/api/graphql/schema/type/AddressConfirmationAuthority;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment$Address;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/AddressConfirmationAuthority;", "component7", "()Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment$Address;", "copy", "(Ljava/lang/String;ZZLjava/lang/String;ZLcom/paypal/oslo/api/graphql/schema/type/AddressConfirmationAuthority;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment$Address;)Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Z", "getPrimary", "getConfirmed", "getAddresseeName", "getBilling", "getBilling$annotations", "()V", "Lcom/paypal/oslo/api/graphql/schema/type/AddressConfirmationAuthority;", "getConfirmationAuthority", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment$Address;", "getAddress", "Address"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserAddressFragment implements com.apollographql.apollo.api.Fragment.Data {
    private final com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address address;
    private final java.lang.String addresseeName;
    private final boolean billing;
    private final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority confirmationAuthority;
    private final boolean confirmed;
    private final java.lang.String id;
    private final boolean primary;

    @kotlin.Deprecated(message = "Use 'defaultBilling' field instead.")
    public static /* synthetic */ void getBilling$annotations() {
    }

    public UserAddressFragment(java.lang.String str, boolean z, boolean z2, java.lang.String str2, boolean z3, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority, com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressConfirmationAuthority, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        this.id = str;
        this.primary = z;
        this.confirmed = z2;
        this.addresseeName = str2;
        this.billing = z3;
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

    public final boolean getBilling() {
        return this.billing;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority getConfirmationAuthority() {
        return this.confirmationAuthority;
    }

    public final com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address getAddress() {
        return this.address;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000fJz\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b*\u0010\u000fR\u001a\u0010\n\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b-\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment$Address;", "", "", "addressLine1", "addressLine2", "addressLine3", "adminArea1", "adminArea2", "adminArea3", "adminArea4", "countryCode", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Object;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment$Address;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddressLine1", "getAddressLine2", "getAddressLine3", "getAdminArea1", "getAdminArea2", "getAdminArea3", "getAdminArea4", "Ljava/lang/Object;", "getCountryCode", "getPostalCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Address {
        private final java.lang.String addressLine1;
        private final java.lang.String addressLine2;
        private final java.lang.String addressLine3;
        private final java.lang.String adminArea1;
        private final java.lang.String adminArea2;
        private final java.lang.String adminArea3;
        private final java.lang.String adminArea4;
        private final java.lang.Object countryCode;
        private final java.lang.String postalCode;

        public Address(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Object obj, java.lang.String str8) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.addressLine1 = str;
            this.addressLine2 = str2;
            this.addressLine3 = str3;
            this.adminArea1 = str4;
            this.adminArea2 = str5;
            this.adminArea3 = str6;
            this.adminArea4 = str7;
            this.countryCode = obj;
            this.postalCode = str8;
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

        public final java.lang.String getAdminArea3() {
            return this.adminArea3;
        }

        public final java.lang.String getAdminArea4() {
            return this.adminArea4;
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
            java.lang.String str3 = this.addressLine3;
            java.lang.String str4 = this.adminArea1;
            java.lang.String str5 = this.adminArea2;
            java.lang.String str6 = this.adminArea3;
            java.lang.String str7 = this.adminArea4;
            java.lang.Object obj = this.countryCode;
            java.lang.String str8 = this.postalCode;
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
            sb.append(", adminArea3=");
            sb.append(str6);
            sb.append(", adminArea4=");
            sb.append(str7);
            sb.append(", countryCode=");
            sb.append(obj);
            sb.append(", postalCode=");
            sb.append(str8);
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
            java.lang.String str6 = this.adminArea3;
            int hashCode6 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.adminArea4;
            int hashCode7 = str7 == null ? 0 : str7.hashCode();
            int hashCode8 = this.countryCode.hashCode();
            java.lang.String str8 = this.postalCode;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str8 != null ? str8.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address)) {
                return false;
            }
            com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address address = (com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine1, address.addressLine1) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine2, address.addressLine2) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine3, address.addressLine3) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea1, address.adminArea1) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea2, address.adminArea2) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea3, address.adminArea3) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea4, address.adminArea4) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, address.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.postalCode, address.postalCode);
        }

        public final com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address copy(java.lang.String addressLine1, java.lang.String addressLine2, java.lang.String addressLine3, java.lang.String adminArea1, java.lang.String adminArea2, java.lang.String adminArea3, java.lang.String adminArea4, java.lang.Object countryCode, java.lang.String postalCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address(addressLine1, addressLine2, addressLine3, adminArea1, adminArea2, adminArea3, adminArea4, countryCode, postalCode);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getAdminArea4() {
            return this.adminArea4;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getAdminArea3() {
            return this.adminArea3;
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
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        boolean z = this.primary;
        boolean z2 = this.confirmed;
        java.lang.String str2 = this.addresseeName;
        boolean z3 = this.billing;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority = this.confirmationAuthority;
        com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address address = this.address;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserAddressFragment(id=");
        sb.append(str);
        sb.append(", primary=");
        sb.append(z);
        sb.append(", confirmed=");
        sb.append(z2);
        sb.append(", addresseeName=");
        sb.append(str2);
        sb.append(", billing=");
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
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.billing)) * 31) + this.confirmationAuthority.hashCode()) * 31) + this.address.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment)) {
            return false;
        }
        com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment userAddressFragment = (com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, userAddressFragment.id) && this.primary == userAddressFragment.primary && this.confirmed == userAddressFragment.confirmed && kotlin.jvm.internal.Intrinsics.areEqual(this.addresseeName, userAddressFragment.addresseeName) && this.billing == userAddressFragment.billing && this.confirmationAuthority == userAddressFragment.confirmationAuthority && kotlin.jvm.internal.Intrinsics.areEqual(this.address, userAddressFragment.address);
    }

    public final com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment copy(java.lang.String id, boolean primary, boolean confirmed, java.lang.String addresseeName, boolean billing, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority confirmationAuthority, com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmationAuthority, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment(id, primary, confirmed, addresseeName, billing, confirmationAuthority, address);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address getAddress() {
        return this.address;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority getConfirmationAuthority() {
        return this.confirmationAuthority;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getBilling() {
        return this.billing;
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

    public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment copy$default(com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment userAddressFragment, java.lang.String str, boolean z, boolean z2, java.lang.String str2, boolean z3, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority, com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address address, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = userAddressFragment.id;
        }
        if ((i & 2) != 0) {
            z = userAddressFragment.primary;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = userAddressFragment.confirmed;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            str2 = userAddressFragment.addresseeName;
        }
        java.lang.String str3 = str2;
        if ((i & 16) != 0) {
            z3 = userAddressFragment.billing;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            addressConfirmationAuthority = userAddressFragment.confirmationAuthority;
        }
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority2 = addressConfirmationAuthority;
        if ((i & 64) != 0) {
            address = userAddressFragment.address;
        }
        return userAddressFragment.copy(str, z4, z5, str3, z6, addressConfirmationAuthority2, address);
    }
}
