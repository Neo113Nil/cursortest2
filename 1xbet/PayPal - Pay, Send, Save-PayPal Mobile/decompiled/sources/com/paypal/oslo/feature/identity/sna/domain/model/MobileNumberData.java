package com.paypal.oslo.feature.identity.sna.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJL\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b!\u0010\rR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/domain/model/MobileNumberData;", "", "", "number", "", "isPrimary", "isVerified", "formattedNumber", "countryCode", "displayNumber", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/sna/domain/model/MobileNumberData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNumber", "Z", "getFormattedNumber", "getCountryCode", "getDisplayNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MobileNumberData {
    public static final int $stable = 0;
    private final java.lang.String countryCode;
    private final java.lang.String displayNumber;
    private final java.lang.String formattedNumber;
    private final boolean isPrimary;
    private final boolean isVerified;
    private final java.lang.String number;

    public MobileNumberData(java.lang.String str, boolean z, boolean z2, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.number = str;
        this.isPrimary = z;
        this.isVerified = z2;
        this.formattedNumber = str2;
        this.countryCode = str3;
        this.displayNumber = str4;
    }

    public final java.lang.String getNumber() {
        return this.number;
    }

    public final boolean isPrimary() {
        return this.isPrimary;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public final java.lang.String getFormattedNumber() {
        return this.formattedNumber;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MobileNumberData(java.lang.String str, boolean z, boolean z2, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, r0, r1, r2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? r2 : str4);
        boolean z3 = (i & 2) != 0 ? false : z;
        boolean z4 = (i & 4) == 0 ? z2 : false;
        java.lang.String str5 = (i & 8) != 0 ? str : str2;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String getDisplayNumber() {
        return this.displayNumber;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.number;
        boolean z = this.isPrimary;
        boolean z2 = this.isVerified;
        java.lang.String str2 = this.formattedNumber;
        java.lang.String str3 = this.countryCode;
        java.lang.String str4 = this.displayNumber;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MobileNumberData(number=");
        sb.append(str);
        sb.append(", isPrimary=");
        sb.append(z);
        sb.append(", isVerified=");
        sb.append(z2);
        sb.append(", formattedNumber=");
        sb.append(str2);
        sb.append(", countryCode=");
        sb.append(str3);
        sb.append(", displayNumber=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.number.hashCode() * 31) + java.lang.Boolean.hashCode(this.isPrimary)) * 31) + java.lang.Boolean.hashCode(this.isVerified)) * 31) + this.formattedNumber.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.displayNumber.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData)) {
            return false;
        }
        com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData mobileNumberData = (com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.number, mobileNumberData.number) && this.isPrimary == mobileNumberData.isPrimary && this.isVerified == mobileNumberData.isVerified && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedNumber, mobileNumberData.formattedNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, mobileNumberData.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayNumber, mobileNumberData.displayNumber);
    }

    public final com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData copy(java.lang.String number, boolean isPrimary, boolean isVerified, java.lang.String formattedNumber, java.lang.String countryCode, java.lang.String displayNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayNumber, "");
        return new com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData(number, isPrimary, isVerified, formattedNumber, countryCode, displayNumber);
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getDisplayNumber() {
        return this.displayNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFormattedNumber() {
        return this.formattedNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsVerified() {
        return this.isVerified;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getNumber() {
        return this.number;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData copy$default(com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData mobileNumberData, java.lang.String str, boolean z, boolean z2, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = mobileNumberData.number;
        }
        if ((i & 2) != 0) {
            z = mobileNumberData.isPrimary;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = mobileNumberData.isVerified;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            str2 = mobileNumberData.formattedNumber;
        }
        java.lang.String str5 = str2;
        if ((i & 16) != 0) {
            str3 = mobileNumberData.countryCode;
        }
        java.lang.String str6 = str3;
        if ((i & 32) != 0) {
            str4 = mobileNumberData.displayNumber;
        }
        return mobileNumberData.copy(str, z3, z4, str5, str6, str4);
    }
}
