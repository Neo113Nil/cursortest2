package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetQuantityInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "", "quantity", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetQuantityInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol", "Ljava/lang/String;", "getQuantity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CryptocurrencyAssetQuantityInput {
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
    private final java.lang.String quantity;

    public CryptocurrencyAssetQuantityInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyAssetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.assetSymbol = cryptocurrencyAssetSymbol;
        this.quantity = str;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
        return this.assetSymbol;
    }

    public final java.lang.String getQuantity() {
        return this.quantity;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = this.assetSymbol;
        java.lang.String str = this.quantity;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyAssetQuantityInput(assetSymbol=");
        sb.append(cryptocurrencyAssetSymbol);
        sb.append(", quantity=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.assetSymbol.hashCode() * 31) + this.quantity.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput cryptocurrencyAssetQuantityInput = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput) other;
        return this.assetSymbol == cryptocurrencyAssetQuantityInput.assetSymbol && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, cryptocurrencyAssetQuantityInput.quantity);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol, java.lang.String quantity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quantity, "");
        return new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput(assetSymbol, quantity);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getQuantity() {
        return this.quantity;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
        return this.assetSymbol;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput copy$default(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput cryptocurrencyAssetQuantityInput, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cryptocurrencyAssetSymbol = cryptocurrencyAssetQuantityInput.assetSymbol;
        }
        if ((i & 2) != 0) {
            str = cryptocurrencyAssetQuantityInput.quantity;
        }
        return cryptocurrencyAssetQuantityInput.copy(cryptocurrencyAssetSymbol, str);
    }
}
