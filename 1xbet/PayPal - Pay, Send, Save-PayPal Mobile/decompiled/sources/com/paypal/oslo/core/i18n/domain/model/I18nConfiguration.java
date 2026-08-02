package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/I18nConfiguration;", "", "", "", "preferredLanguageList", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "<init>", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2-ALGuh4w", "()Ljava/lang/String;", "component2", "copy-_ygcFeA", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/I18nConfiguration;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getPreferredLanguageList", "Ljava/lang/String;", "getCountry-ALGuh4w"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class I18nConfiguration {
    private final java.lang.String country;
    private final java.util.List<java.lang.String> preferredLanguageList;

    private I18nConfiguration(java.util.List<java.lang.String> list, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.preferredLanguageList = list;
        this.country = str;
    }

    public final java.util.List<java.lang.String> getPreferredLanguageList() {
        return this.preferredLanguageList;
    }

    /* renamed from: getCountry-ALGuh4w, reason: not valid java name */
    public final java.lang.String m11425getCountryALGuh4w() {
        return this.country;
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.String> list = this.preferredLanguageList;
        java.lang.String m11368toStringimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11368toStringimpl(this.country);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("I18nConfiguration(preferredLanguageList=");
        sb.append(list);
        sb.append(", country=");
        sb.append(m11368toStringimpl);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.preferredLanguageList.hashCode() * 31) + com.paypal.oslo.core.i18n.domain.model.CountryCode.m11367hashCodeimpl(this.country);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.I18nConfiguration)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.I18nConfiguration i18nConfiguration = (com.paypal.oslo.core.i18n.domain.model.I18nConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.preferredLanguageList, i18nConfiguration.preferredLanguageList) && com.paypal.oslo.core.i18n.domain.model.CountryCode.m11366equalsimpl0(this.country, i18nConfiguration.country);
    }

    /* renamed from: copy-_ygcFeA, reason: not valid java name */
    public final com.paypal.oslo.core.i18n.domain.model.I18nConfiguration m11424copy_ygcFeA(java.util.List<java.lang.String> preferredLanguageList, java.lang.String country) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferredLanguageList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        return new com.paypal.oslo.core.i18n.domain.model.I18nConfiguration(preferredLanguageList, country, null);
    }

    /* renamed from: component2-ALGuh4w, reason: not valid java name and from getter */
    public final java.lang.String getCountry() {
        return this.country;
    }

    public final java.util.List<java.lang.String> component1() {
        return this.preferredLanguageList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-_ygcFeA$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.I18nConfiguration m11422copy_ygcFeA$default(com.paypal.oslo.core.i18n.domain.model.I18nConfiguration i18nConfiguration, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = i18nConfiguration.preferredLanguageList;
        }
        if ((i & 2) != 0) {
            str = i18nConfiguration.country;
        }
        return i18nConfiguration.m11424copy_ygcFeA(list, str);
    }

    public /* synthetic */ I18nConfiguration(java.util.List list, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str);
    }
}
