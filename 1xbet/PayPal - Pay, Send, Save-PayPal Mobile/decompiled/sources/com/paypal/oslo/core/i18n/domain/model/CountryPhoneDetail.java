package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/CountryPhoneDetail;", "", "", "countryCode", "countryName", "", "countryCallingCode", "countryFlag", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/CountryPhoneDetail;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCountryCode", "getCountryName", com.visa.cbp.getEncExpo.warmup, "getCountryCallingCode", "getCountryFlag"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CountryPhoneDetail {
    private final int countryCallingCode;
    private final java.lang.String countryCode;
    private final java.lang.String countryFlag;
    private final java.lang.String countryName;

    public CountryPhoneDetail(java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.countryCode = str;
        this.countryName = str2;
        this.countryCallingCode = i;
        this.countryFlag = str3;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String getCountryName() {
        return this.countryName;
    }

    public final int getCountryCallingCode() {
        return this.countryCallingCode;
    }

    public final java.lang.String getCountryFlag() {
        return this.countryFlag;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.countryCode;
        java.lang.String str2 = this.countryName;
        int i = this.countryCallingCode;
        java.lang.String str3 = this.countryFlag;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CountryPhoneDetail(countryCode=");
        sb.append(str);
        sb.append(", countryName=");
        sb.append(str2);
        sb.append(", countryCallingCode=");
        sb.append(i);
        sb.append(", countryFlag=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.countryCode.hashCode() * 31) + this.countryName.hashCode()) * 31) + java.lang.Integer.hashCode(this.countryCallingCode)) * 31) + this.countryFlag.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail = (com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, countryPhoneDetail.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryName, countryPhoneDetail.countryName) && this.countryCallingCode == countryPhoneDetail.countryCallingCode && kotlin.jvm.internal.Intrinsics.areEqual(this.countryFlag, countryPhoneDetail.countryFlag);
    }

    public final com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail copy(java.lang.String countryCode, java.lang.String countryName, int countryCallingCode, java.lang.String countryFlag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryFlag, "");
        return new com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail(countryCode, countryName, countryCallingCode, countryFlag);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCountryFlag() {
        return this.countryFlag;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCountryCallingCode() {
        return this.countryCallingCode;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCountryName() {
        return this.countryName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail copy$default(com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = countryPhoneDetail.countryCode;
        }
        if ((i2 & 2) != 0) {
            str2 = countryPhoneDetail.countryName;
        }
        if ((i2 & 4) != 0) {
            i = countryPhoneDetail.countryCallingCode;
        }
        if ((i2 & 8) != 0) {
            str3 = countryPhoneDetail.countryFlag;
        }
        return countryPhoneDetail.copy(str, str2, i, str3);
    }
}
