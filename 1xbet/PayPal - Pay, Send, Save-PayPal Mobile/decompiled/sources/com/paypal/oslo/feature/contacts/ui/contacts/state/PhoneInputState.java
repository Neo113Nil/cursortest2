package com.paypal.oslo.feature.contacts.ui.contacts.state;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012Jn\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0019R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010\u001bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b2\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b3\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/state/PhoneInputState;", "", "", "searchQuery", "unFormattedPhone", "Lcom/paypal/oslo/feature/contacts/ui/contacts/model/SearchQueryType;", "searchQueryType", "", "showCountryPicker", "Lcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;", "selectedCountry", "", "recentCountries", "allCountries", "userCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/ui/contacts/model/SearchQueryType;ZLcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/contacts/ui/contacts/model/SearchQueryType;", "component4", "()Z", "component5", "()Lcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;", "component6", "()Ljava/util/List;", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/ui/contacts/model/SearchQueryType;ZLcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/contacts/ui/contacts/state/PhoneInputState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSearchQuery", "getUnFormattedPhone", "Lcom/paypal/oslo/feature/contacts/ui/contacts/model/SearchQueryType;", "getSearchQueryType", "Z", "getShowCountryPicker", "Lcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;", "getSelectedCountry", "Ljava/util/List;", "getRecentCountries", "getAllCountries", "getUserCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PhoneInputState {
    public static final int $stable = 0;
    private final java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> allCountries;
    private final java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> recentCountries;
    private final java.lang.String searchQuery;
    private final com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType searchQueryType;
    private final com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi selectedCountry;
    private final boolean showCountryPicker;
    private final java.lang.String unFormattedPhone;
    private final java.lang.String userCountryCode;

    public PhoneInputState(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType searchQueryType, boolean z, com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi, java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> list, java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> list2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchQueryType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.searchQuery = str;
        this.unFormattedPhone = str2;
        this.searchQueryType = searchQueryType;
        this.showCountryPicker = z;
        this.selectedCountry = countryUi;
        this.recentCountries = list;
        this.allCountries = list2;
        this.userCountryCode = str3;
    }

    public /* synthetic */ PhoneInputState(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType searchQueryType, boolean z, com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi, java.util.List list, java.util.List list2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType.OTHER : searchQueryType, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : countryUi, (i & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 128) == 0 ? str3 : "");
    }

    public final java.lang.String getSearchQuery() {
        return this.searchQuery;
    }

    public final java.lang.String getUnFormattedPhone() {
        return this.unFormattedPhone;
    }

    public final com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType getSearchQueryType() {
        return this.searchQueryType;
    }

    public final boolean getShowCountryPicker() {
        return this.showCountryPicker;
    }

    public final com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi getSelectedCountry() {
        return this.selectedCountry;
    }

    public final java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> getRecentCountries() {
        return this.recentCountries;
    }

    public final java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> getAllCountries() {
        return this.allCountries;
    }

    public final java.lang.String getUserCountryCode() {
        return this.userCountryCode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.searchQuery;
        java.lang.String str2 = this.unFormattedPhone;
        com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType searchQueryType = this.searchQueryType;
        boolean z = this.showCountryPicker;
        com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi = this.selectedCountry;
        java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> list = this.recentCountries;
        java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> list2 = this.allCountries;
        java.lang.String str3 = this.userCountryCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneInputState(searchQuery=");
        sb.append(str);
        sb.append(", unFormattedPhone=");
        sb.append(str2);
        sb.append(", searchQueryType=");
        sb.append(searchQueryType);
        sb.append(", showCountryPicker=");
        sb.append(z);
        sb.append(", selectedCountry=");
        sb.append(countryUi);
        sb.append(", recentCountries=");
        sb.append(list);
        sb.append(", allCountries=");
        sb.append(list2);
        sb.append(", userCountryCode=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.searchQuery.hashCode();
        int hashCode2 = this.unFormattedPhone.hashCode();
        int hashCode3 = this.searchQueryType.hashCode();
        int hashCode4 = java.lang.Boolean.hashCode(this.showCountryPicker);
        com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi = this.selectedCountry;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (countryUi == null ? 0 : countryUi.hashCode())) * 31) + this.recentCountries.hashCode()) * 31) + this.allCountries.hashCode()) * 31) + this.userCountryCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.contacts.ui.contacts.state.PhoneInputState)) {
            return false;
        }
        com.paypal.oslo.feature.contacts.ui.contacts.state.PhoneInputState phoneInputState = (com.paypal.oslo.feature.contacts.ui.contacts.state.PhoneInputState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.searchQuery, phoneInputState.searchQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.unFormattedPhone, phoneInputState.unFormattedPhone) && this.searchQueryType == phoneInputState.searchQueryType && this.showCountryPicker == phoneInputState.showCountryPicker && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCountry, phoneInputState.selectedCountry) && kotlin.jvm.internal.Intrinsics.areEqual(this.recentCountries, phoneInputState.recentCountries) && kotlin.jvm.internal.Intrinsics.areEqual(this.allCountries, phoneInputState.allCountries) && kotlin.jvm.internal.Intrinsics.areEqual(this.userCountryCode, phoneInputState.userCountryCode);
    }

    public final com.paypal.oslo.feature.contacts.ui.contacts.state.PhoneInputState copy(java.lang.String searchQuery, java.lang.String unFormattedPhone, com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType searchQueryType, boolean showCountryPicker, com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi selectedCountry, java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> recentCountries, java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> allCountries, java.lang.String userCountryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchQuery, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unFormattedPhone, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchQueryType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentCountries, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allCountries, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userCountryCode, "");
        return new com.paypal.oslo.feature.contacts.ui.contacts.state.PhoneInputState(searchQuery, unFormattedPhone, searchQueryType, showCountryPicker, selectedCountry, recentCountries, allCountries, userCountryCode);
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getUserCountryCode() {
        return this.userCountryCode;
    }

    public final java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> component7() {
        return this.allCountries;
    }

    public final java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> component6() {
        return this.recentCountries;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi getSelectedCountry() {
        return this.selectedCountry;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowCountryPicker() {
        return this.showCountryPicker;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType getSearchQueryType() {
        return this.searchQueryType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUnFormattedPhone() {
        return this.unFormattedPhone;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSearchQuery() {
        return this.searchQuery;
    }

    public PhoneInputState() {
        this(null, null, null, false, null, null, null, null, 255, null);
    }
}
