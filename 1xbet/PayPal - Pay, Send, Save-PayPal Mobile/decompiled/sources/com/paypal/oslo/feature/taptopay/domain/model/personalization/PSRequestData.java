package com.paypal.oslo.feature.taptopay.domain.model.personalization;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJH\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/PSRequestData;", "", "", "countryCode", "accountId", "", "touchPoints", "locale", "appVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/PSRequestData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCountryCode", "getAccountId", "Ljava/util/List;", "getTouchPoints", "getLocale", "getAppVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PSRequestData {
    public static final int $stable = 8;
    private final java.lang.String accountId;
    private final java.lang.String appVersion;
    private final java.lang.String countryCode;
    private final java.lang.String locale;
    private final java.util.List<java.lang.String> touchPoints;

    public PSRequestData(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.countryCode = str;
        this.accountId = str2;
        this.touchPoints = list;
        this.locale = str3;
        this.appVersion = str4;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    public final java.util.List<java.lang.String> getTouchPoints() {
        return this.touchPoints;
    }

    public final java.lang.String getLocale() {
        return this.locale;
    }

    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.countryCode;
        java.lang.String str2 = this.accountId;
        java.util.List<java.lang.String> list = this.touchPoints;
        java.lang.String str3 = this.locale;
        java.lang.String str4 = this.appVersion;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PSRequestData(countryCode=");
        sb.append(str);
        sb.append(", accountId=");
        sb.append(str2);
        sb.append(", touchPoints=");
        sb.append(list);
        sb.append(", locale=");
        sb.append(str3);
        sb.append(", appVersion=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.countryCode.hashCode() * 31) + this.accountId.hashCode()) * 31) + this.touchPoints.hashCode()) * 31) + this.locale.hashCode()) * 31) + this.appVersion.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.personalization.PSRequestData)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.domain.model.personalization.PSRequestData pSRequestData = (com.paypal.oslo.feature.taptopay.domain.model.personalization.PSRequestData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, pSRequestData.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, pSRequestData.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.touchPoints, pSRequestData.touchPoints) && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, pSRequestData.locale) && kotlin.jvm.internal.Intrinsics.areEqual(this.appVersion, pSRequestData.appVersion);
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.personalization.PSRequestData copy(java.lang.String countryCode, java.lang.String accountId, java.util.List<java.lang.String> touchPoints, java.lang.String locale, java.lang.String appVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchPoints, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appVersion, "");
        return new com.paypal.oslo.feature.taptopay.domain.model.personalization.PSRequestData(countryCode, accountId, touchPoints, locale, appVersion);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLocale() {
        return this.locale;
    }

    public final java.util.List<java.lang.String> component3() {
        return this.touchPoints;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.personalization.PSRequestData copy$default(com.paypal.oslo.feature.taptopay.domain.model.personalization.PSRequestData pSRequestData, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = pSRequestData.countryCode;
        }
        if ((i & 2) != 0) {
            str2 = pSRequestData.accountId;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            list = pSRequestData.touchPoints;
        }
        java.util.List list2 = list;
        if ((i & 8) != 0) {
            str3 = pSRequestData.locale;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            str4 = pSRequestData.appVersion;
        }
        return pSRequestData.copy(str, str5, list2, str6, str4);
    }
}
