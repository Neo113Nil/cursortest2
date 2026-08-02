package com.paypal.oslo.feature.p2p.ui.currencypicker.state;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/state/CurrencyItemUiState;", "", "", "id", "countryName", "currencyCode", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/paypal/pds/components/ListItem;", "asListItem", "()Lcom/paypal/pds/components/ListItem;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/currencypicker/state/CurrencyItemUiState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getCountryName", "getCurrencyCode", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CurrencyItemUiState {
    public static final int $stable = 0;
    private final java.lang.String countryCode;
    private final java.lang.String countryName;
    private final java.lang.String currencyCode;
    private final java.lang.String id;

    public CurrencyItemUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.id = str;
        this.countryName = str2;
        this.currencyCode = str3;
        this.countryCode = str4;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getCountryName() {
        return this.countryName;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final com.paypal.pds.components.ListItem asListItem() {
        return new com.paypal.pds.components.ListItem(this.countryName, this.currencyCode, this.id, null, false, false, null, null, null, null, null, null, null, 8184, null);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.countryName;
        java.lang.String str3 = this.currencyCode;
        java.lang.String str4 = this.countryCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyItemUiState(id=");
        sb.append(str);
        sb.append(", countryName=");
        sb.append(str2);
        sb.append(", currencyCode=");
        sb.append(str3);
        sb.append(", countryCode=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + this.countryName.hashCode()) * 31) + this.currencyCode.hashCode()) * 31) + this.countryCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyItemUiState)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyItemUiState currencyItemUiState = (com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyItemUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, currencyItemUiState.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryName, currencyItemUiState.countryName) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, currencyItemUiState.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, currencyItemUiState.countryCode);
    }

    public final com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyItemUiState copy(java.lang.String id, java.lang.String countryName, java.lang.String currencyCode, java.lang.String countryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        return new com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyItemUiState(id, countryName, currencyCode, countryCode);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCountryName() {
        return this.countryName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyItemUiState copy$default(com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyItemUiState currencyItemUiState, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = currencyItemUiState.id;
        }
        if ((i & 2) != 0) {
            str2 = currencyItemUiState.countryName;
        }
        if ((i & 4) != 0) {
            str3 = currencyItemUiState.currencyCode;
        }
        if ((i & 8) != 0) {
            str4 = currencyItemUiState.countryCode;
        }
        return currencyItemUiState.copy(str, str2, str3, str4);
    }
}
