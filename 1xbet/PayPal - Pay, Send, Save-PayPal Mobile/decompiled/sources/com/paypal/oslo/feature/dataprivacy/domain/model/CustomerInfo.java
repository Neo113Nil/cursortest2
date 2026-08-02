package com.paypal.oslo.feature.dataprivacy.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/model/CustomerInfo;", "", "", "countryCode", com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/dataprivacy/domain/model/CustomerInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCountryCode", "getLanguage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CustomerInfo {
    public static final int $stable = 0;
    private final java.lang.String countryCode;
    private final java.lang.String language;

    public CustomerInfo(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.countryCode = str;
        this.language = str2;
    }

    public /* synthetic */ CustomerInfo(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String getLanguage() {
        return this.language;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.countryCode;
        java.lang.String str2 = this.language;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomerInfo(countryCode=");
        sb.append(str);
        sb.append(", language=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.countryCode.hashCode();
        java.lang.String str = this.language;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.dataprivacy.domain.model.CustomerInfo)) {
            return false;
        }
        com.paypal.oslo.feature.dataprivacy.domain.model.CustomerInfo customerInfo = (com.paypal.oslo.feature.dataprivacy.domain.model.CustomerInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, customerInfo.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.language, customerInfo.language);
    }

    public final com.paypal.oslo.feature.dataprivacy.domain.model.CustomerInfo copy(java.lang.String countryCode, java.lang.String language) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        return new com.paypal.oslo.feature.dataprivacy.domain.model.CustomerInfo(countryCode, language);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLanguage() {
        return this.language;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public static /* synthetic */ com.paypal.oslo.feature.dataprivacy.domain.model.CustomerInfo copy$default(com.paypal.oslo.feature.dataprivacy.domain.model.CustomerInfo customerInfo, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = customerInfo.countryCode;
        }
        if ((i & 2) != 0) {
            str2 = customerInfo.language;
        }
        return customerInfo.copy(str, str2);
    }
}
