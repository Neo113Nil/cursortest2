package com.paypal.oslo.feature.starpay.api;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJf\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b%\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b&\u0010\u000eR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b'\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b(\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/starpay/api/UserAddress;", "", "", "name", "address1", "address2", com.google.android.libraries.places.api.model.PlaceTypes.LOCALITY, "administrativeArea", "countryCode", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/starpay/api/UserAddress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getAddress1", "getAddress2", "getLocality", "getAdministrativeArea", "getCountryCode", "getPostalCode", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UserAddress {
    public static final int $stable = 0;
    private final java.lang.String address1;
    private final java.lang.String address2;
    private final java.lang.String administrativeArea;
    private final java.lang.String countryCode;
    private final java.lang.String locality;
    private final java.lang.String name;
    private final java.lang.String phoneNumber;
    private final java.lang.String postalCode;

    public UserAddress(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        this.name = str;
        this.address1 = str2;
        this.address2 = str3;
        this.locality = str4;
        this.administrativeArea = str5;
        this.countryCode = str6;
        this.postalCode = str7;
        this.phoneNumber = str8;
    }

    public /* synthetic */ UserAddress(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6, str7, (i & 128) != 0 ? null : str8);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getAddress1() {
        return this.address1;
    }

    public final java.lang.String getAddress2() {
        return this.address2;
    }

    public final java.lang.String getLocality() {
        return this.locality;
    }

    public final java.lang.String getAdministrativeArea() {
        return this.administrativeArea;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String getPostalCode() {
        return this.postalCode;
    }

    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.address1;
        java.lang.String str3 = this.address2;
        java.lang.String str4 = this.locality;
        java.lang.String str5 = this.administrativeArea;
        java.lang.String str6 = this.countryCode;
        java.lang.String str7 = this.postalCode;
        java.lang.String str8 = this.phoneNumber;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserAddress(name=");
        sb.append(str);
        sb.append(", address1=");
        sb.append(str2);
        sb.append(", address2=");
        sb.append(str3);
        sb.append(", locality=");
        sb.append(str4);
        sb.append(", administrativeArea=");
        sb.append(str5);
        sb.append(", countryCode=");
        sb.append(str6);
        sb.append(", postalCode=");
        sb.append(str7);
        sb.append(", phoneNumber=");
        sb.append(str8);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.address1.hashCode();
        int hashCode3 = this.address2.hashCode();
        java.lang.String str = this.locality;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.administrativeArea;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        int hashCode6 = this.countryCode.hashCode();
        int hashCode7 = this.postalCode.hashCode();
        java.lang.String str3 = this.phoneNumber;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.starpay.api.UserAddress)) {
            return false;
        }
        com.paypal.oslo.feature.starpay.api.UserAddress userAddress = (com.paypal.oslo.feature.starpay.api.UserAddress) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, userAddress.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.address1, userAddress.address1) && kotlin.jvm.internal.Intrinsics.areEqual(this.address2, userAddress.address2) && kotlin.jvm.internal.Intrinsics.areEqual(this.locality, userAddress.locality) && kotlin.jvm.internal.Intrinsics.areEqual(this.administrativeArea, userAddress.administrativeArea) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, userAddress.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.postalCode, userAddress.postalCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, userAddress.phoneNumber);
    }

    public final com.paypal.oslo.feature.starpay.api.UserAddress copy(java.lang.String name2, java.lang.String address1, java.lang.String address2, java.lang.String locality, java.lang.String administrativeArea, java.lang.String countryCode, java.lang.String postalCode, java.lang.String phoneNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postalCode, "");
        return new com.paypal.oslo.feature.starpay.api.UserAddress(name2, address1, address2, locality, administrativeArea, countryCode, postalCode, phoneNumber);
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getPostalCode() {
        return this.postalCode;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getAdministrativeArea() {
        return this.administrativeArea;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLocality() {
        return this.locality;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAddress2() {
        return this.address2;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAddress1() {
        return this.address1;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }
}
