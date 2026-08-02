package com.paypal.oslo.feature.businesscustomers.ui.customerprofile;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/PersonalInfo;", "", "", "email", "phone", "billingAddress", "shippingAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/PersonalInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEmail", "getPhone", "getBillingAddress", "getShippingAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PersonalInfo {
    public static final int $stable = 0;
    private final java.lang.String billingAddress;
    private final java.lang.String email;
    private final java.lang.String phone;
    private final java.lang.String shippingAddress;

    public PersonalInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.email = str;
        this.phone = str2;
        this.billingAddress = str3;
        this.shippingAddress = str4;
    }

    public /* synthetic */ PersonalInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.String getPhone() {
        return this.phone;
    }

    public final java.lang.String getBillingAddress() {
        return this.billingAddress;
    }

    public final java.lang.String getShippingAddress() {
        return this.shippingAddress;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.email;
        java.lang.String str2 = this.phone;
        java.lang.String str3 = this.billingAddress;
        java.lang.String str4 = this.shippingAddress;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PersonalInfo(email=");
        sb.append(str);
        sb.append(", phone=");
        sb.append(str2);
        sb.append(", billingAddress=");
        sb.append(str3);
        sb.append(", shippingAddress=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.email;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.phone;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.billingAddress;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.shippingAddress;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.PersonalInfo)) {
            return false;
        }
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.PersonalInfo personalInfo = (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.PersonalInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.email, personalInfo.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.phone, personalInfo.phone) && kotlin.jvm.internal.Intrinsics.areEqual(this.billingAddress, personalInfo.billingAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.shippingAddress, personalInfo.shippingAddress);
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.PersonalInfo copy(java.lang.String email, java.lang.String phone, java.lang.String billingAddress, java.lang.String shippingAddress) {
        return new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.PersonalInfo(email, phone, billingAddress, shippingAddress);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getShippingAddress() {
        return this.shippingAddress;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBillingAddress() {
        return this.billingAddress;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPhone() {
        return this.phone;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerprofile.PersonalInfo copy$default(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.PersonalInfo personalInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = personalInfo.email;
        }
        if ((i & 2) != 0) {
            str2 = personalInfo.phone;
        }
        if ((i & 4) != 0) {
            str3 = personalInfo.billingAddress;
        }
        if ((i & 8) != 0) {
            str4 = personalInfo.shippingAddress;
        }
        return personalInfo.copy(str, str2, str3, str4);
    }

    public PersonalInfo() {
        this(null, null, null, null, 15, null);
    }
}
