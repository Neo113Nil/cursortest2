package com.paypal.oslo.feature.moneymovement.api.domain;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001!B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress;", "", "", "id", "recipientName", "Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress$Address;", "address", "", "isDefault", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress$Address;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress$Address;", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress$Address;Z)Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getRecipientName", "Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress$Address;", "getAddress", "Z", "Address"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ShippingAddress {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address address;
    private final java.lang.String id;
    private final boolean isDefault;
    private final java.lang.String recipientName;

    public ShippingAddress(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address address, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        this.id = str;
        this.recipientName = str2;
        this.address = address;
        this.isDefault = z;
    }

    public /* synthetic */ ShippingAddress(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address address, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, address, (i & 8) != 0 ? false : z);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getRecipientName() {
        return this.recipientName;
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address getAddress() {
        return this.address;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJb\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\rR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress$Address;", "", "", "line1", "line2", "line3", com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleCity, "state", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress$Address;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLine1", "getLine2", "getLine3", "getCity", "getState", "getPostalCode", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Address {
        public static final int $stable = 0;
        private final java.lang.String city;
        private final java.lang.String countryCode;
        private final java.lang.String line1;
        private final java.lang.String line2;
        private final java.lang.String line3;
        private final java.lang.String postalCode;
        private final java.lang.String state;

        public Address(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
            this.line1 = str;
            this.line2 = str2;
            this.line3 = str3;
            this.city = str4;
            this.state = str5;
            this.postalCode = str6;
            this.countryCode = str7;
        }

        public final java.lang.String getLine1() {
            return this.line1;
        }

        public final java.lang.String getLine2() {
            return this.line2;
        }

        public final java.lang.String getLine3() {
            return this.line3;
        }

        public final java.lang.String getCity() {
            return this.city;
        }

        public final java.lang.String getState() {
            return this.state;
        }

        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.line1;
            java.lang.String str2 = this.line2;
            java.lang.String str3 = this.line3;
            java.lang.String str4 = this.city;
            java.lang.String str5 = this.state;
            java.lang.String str6 = this.postalCode;
            java.lang.String str7 = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Address(line1=");
            sb.append(str);
            sb.append(", line2=");
            sb.append(str2);
            sb.append(", line3=");
            sb.append(str3);
            sb.append(", city=");
            sb.append(str4);
            sb.append(", state=");
            sb.append(str5);
            sb.append(", postalCode=");
            sb.append(str6);
            sb.append(", countryCode=");
            sb.append(str7);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.line1;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.line2;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.line3;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.city;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.state;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.postalCode;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address)) {
                return false;
            }
            com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address address = (com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.line1, address.line1) && kotlin.jvm.internal.Intrinsics.areEqual(this.line2, address.line2) && kotlin.jvm.internal.Intrinsics.areEqual(this.line3, address.line3) && kotlin.jvm.internal.Intrinsics.areEqual(this.city, address.city) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, address.state) && kotlin.jvm.internal.Intrinsics.areEqual(this.postalCode, address.postalCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, address.countryCode);
        }

        public final com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address copy(java.lang.String line1, java.lang.String line2, java.lang.String line3, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address(line1, line2, line3, city, state, postalCode, countryCode);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getState() {
            return this.state;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCity() {
            return this.city;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getLine3() {
            return this.line3;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLine2() {
            return this.line2;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getLine1() {
            return this.line1;
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address copy$default(com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address address, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = address.line1;
            }
            if ((i & 2) != 0) {
                str2 = address.line2;
            }
            java.lang.String str8 = str2;
            if ((i & 4) != 0) {
                str3 = address.line3;
            }
            java.lang.String str9 = str3;
            if ((i & 8) != 0) {
                str4 = address.city;
            }
            java.lang.String str10 = str4;
            if ((i & 16) != 0) {
                str5 = address.state;
            }
            java.lang.String str11 = str5;
            if ((i & 32) != 0) {
                str6 = address.postalCode;
            }
            java.lang.String str12 = str6;
            if ((i & 64) != 0) {
                str7 = address.countryCode;
            }
            return address.copy(str, str8, str9, str10, str11, str12, str7);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.recipientName;
        com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address address = this.address;
        boolean z = this.isDefault;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ShippingAddress(id=");
        sb.append(str);
        sb.append(", recipientName=");
        sb.append(str2);
        sb.append(", address=");
        sb.append(address);
        sb.append(", isDefault=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + this.recipientName.hashCode()) * 31) + this.address.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isDefault);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress shippingAddress = (com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, shippingAddress.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.recipientName, shippingAddress.recipientName) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, shippingAddress.address) && this.isDefault == shippingAddress.isDefault;
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress copy(java.lang.String id, java.lang.String recipientName, com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address address, boolean isDefault) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recipientName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress(id, recipientName, address, isDefault);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRecipientName() {
        return this.recipientName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress copy$default(com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress shippingAddress, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address address, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = shippingAddress.id;
        }
        if ((i & 2) != 0) {
            str2 = shippingAddress.recipientName;
        }
        if ((i & 4) != 0) {
            address = shippingAddress.address;
        }
        if ((i & 8) != 0) {
            z = shippingAddress.isDefault;
        }
        return shippingAddress.copy(str, str2, address, z);
    }
}
