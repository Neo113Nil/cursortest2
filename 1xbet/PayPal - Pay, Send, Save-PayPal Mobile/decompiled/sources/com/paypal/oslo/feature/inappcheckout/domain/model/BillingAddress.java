package com.paypal.oslo.feature.inappcheckout.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJD\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/BillingAddress;", "", "", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS, "addressLine2", com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleCity, "state", "zipCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/BillingAddress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getStreetAddress", "getAddressLine2", "getCity", "getState", "getZipCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BillingAddress {
    public static final int $stable = 0;
    private final java.lang.String addressLine2;
    private final java.lang.String city;
    private final java.lang.String state;
    private final java.lang.String streetAddress;
    private final java.lang.String zipCode;

    public BillingAddress(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.streetAddress = str;
        this.addressLine2 = str2;
        this.city = str3;
        this.state = str4;
        this.zipCode = str5;
    }

    public /* synthetic */ BillingAddress(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5);
    }

    public final java.lang.String getStreetAddress() {
        return this.streetAddress;
    }

    public final java.lang.String getAddressLine2() {
        return this.addressLine2;
    }

    public final java.lang.String getCity() {
        return this.city;
    }

    public final java.lang.String getState() {
        return this.state;
    }

    public final java.lang.String getZipCode() {
        return this.zipCode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.streetAddress;
        java.lang.String str2 = this.addressLine2;
        java.lang.String str3 = this.city;
        java.lang.String str4 = this.state;
        java.lang.String str5 = this.zipCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BillingAddress(streetAddress=");
        sb.append(str);
        sb.append(", addressLine2=");
        sb.append(str2);
        sb.append(", city=");
        sb.append(str3);
        sb.append(", state=");
        sb.append(str4);
        sb.append(", zipCode=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.streetAddress.hashCode();
        int hashCode2 = this.addressLine2.hashCode();
        int hashCode3 = this.city.hashCode();
        java.lang.String str = this.state;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.zipCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress billingAddress = (com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.streetAddress, billingAddress.streetAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine2, billingAddress.addressLine2) && kotlin.jvm.internal.Intrinsics.areEqual(this.city, billingAddress.city) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, billingAddress.state) && kotlin.jvm.internal.Intrinsics.areEqual(this.zipCode, billingAddress.zipCode);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress copy(java.lang.String streetAddress, java.lang.String addressLine2, java.lang.String city, java.lang.String state, java.lang.String zipCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressLine2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(city, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zipCode, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress(streetAddress, addressLine2, city, state, zipCode);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getZipCode() {
        return this.zipCode;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCity() {
        return this.city;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAddressLine2() {
        return this.addressLine2;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getStreetAddress() {
        return this.streetAddress;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress copy$default(com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress billingAddress, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = billingAddress.streetAddress;
        }
        if ((i & 2) != 0) {
            str2 = billingAddress.addressLine2;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = billingAddress.city;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = billingAddress.state;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = billingAddress.zipCode;
        }
        return billingAddress.copy(str, str6, str7, str8, str5);
    }

    public BillingAddress() {
        this(null, null, null, null, null, 31, null);
    }
}
