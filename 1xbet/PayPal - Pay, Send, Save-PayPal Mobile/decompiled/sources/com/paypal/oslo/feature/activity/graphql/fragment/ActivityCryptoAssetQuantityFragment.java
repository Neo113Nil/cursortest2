package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetQuantityFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "", "quantity", "quantityInSubunits", "", "decimals", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetQuantityFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol", "Ljava/lang/String;", "getQuantity", "getQuantityInSubunits", "Ljava/lang/Integer;", "getDecimals"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityCryptoAssetQuantityFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
    private final java.lang.Integer decimals;
    private final java.lang.String quantity;
    private final java.lang.String quantityInSubunits;

    public ActivityCryptoAssetQuantityFragment(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyAssetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.assetSymbol = cryptocurrencyAssetSymbol;
        this.quantity = str;
        this.quantityInSubunits = str2;
        this.decimals = num;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
        return this.assetSymbol;
    }

    public final java.lang.String getQuantity() {
        return this.quantity;
    }

    public final java.lang.String getQuantityInSubunits() {
        return this.quantityInSubunits;
    }

    public final java.lang.Integer getDecimals() {
        return this.decimals;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = this.assetSymbol;
        java.lang.String str = this.quantity;
        java.lang.String str2 = this.quantityInSubunits;
        java.lang.Integer num = this.decimals;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityCryptoAssetQuantityFragment(assetSymbol=");
        sb.append(cryptocurrencyAssetSymbol);
        sb.append(", quantity=");
        sb.append(str);
        sb.append(", quantityInSubunits=");
        sb.append(str2);
        sb.append(", decimals=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.assetSymbol.hashCode();
        int hashCode2 = this.quantity.hashCode();
        java.lang.String str = this.quantityInSubunits;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.Integer num = this.decimals;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment activityCryptoAssetQuantityFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment) other;
        return this.assetSymbol == activityCryptoAssetQuantityFragment.assetSymbol && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, activityCryptoAssetQuantityFragment.quantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.quantityInSubunits, activityCryptoAssetQuantityFragment.quantityInSubunits) && kotlin.jvm.internal.Intrinsics.areEqual(this.decimals, activityCryptoAssetQuantityFragment.decimals);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol, java.lang.String quantity, java.lang.String quantityInSubunits, java.lang.Integer decimals) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quantity, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment(assetSymbol, quantity, quantityInSubunits, decimals);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Integer getDecimals() {
        return this.decimals;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getQuantityInSubunits() {
        return this.quantityInSubunits;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getQuantity() {
        return this.quantity;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
        return this.assetSymbol;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment activityCryptoAssetQuantityFragment, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cryptocurrencyAssetSymbol = activityCryptoAssetQuantityFragment.assetSymbol;
        }
        if ((i & 2) != 0) {
            str = activityCryptoAssetQuantityFragment.quantity;
        }
        if ((i & 4) != 0) {
            str2 = activityCryptoAssetQuantityFragment.quantityInSubunits;
        }
        if ((i & 8) != 0) {
            num = activityCryptoAssetQuantityFragment.decimals;
        }
        return activityCryptoAssetQuantityFragment.copy(cryptocurrencyAssetSymbol, str, str2, num);
    }
}
