package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyMarketPricesInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceTimeRange;", "priceTimeRange", "fiatCurrencyCode", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceTimeRange;Ljava/lang/Object;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceTimeRange;", "component3", "()Ljava/lang/Object;", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceTimeRange;Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyMarketPricesInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getAssetSymbol", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceTimeRange;", "getPriceTimeRange", "Ljava/lang/Object;", "getFiatCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CryptocurrencyMarketPricesInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> assetSymbol;
    private final java.lang.Object fiatCurrencyCode;
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange priceTimeRange;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptocurrencyMarketPricesInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> optional, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange cryptocurrencyPriceTimeRange, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyPriceTimeRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.assetSymbol = optional;
        this.priceTimeRange = cryptocurrencyPriceTimeRange;
        this.fiatCurrencyCode = obj;
    }

    public /* synthetic */ CryptocurrencyMarketPricesInput(com.apollographql.apollo.api.Optional.Absent absent, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange cryptocurrencyPriceTimeRange, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, cryptocurrencyPriceTimeRange, obj);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> getAssetSymbol() {
        return this.assetSymbol;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange getPriceTimeRange() {
        return this.priceTimeRange;
    }

    public final java.lang.Object getFiatCurrencyCode() {
        return this.fiatCurrencyCode;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> optional = this.assetSymbol;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange cryptocurrencyPriceTimeRange = this.priceTimeRange;
        java.lang.Object obj = this.fiatCurrencyCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyMarketPricesInput(assetSymbol=");
        sb.append(optional);
        sb.append(", priceTimeRange=");
        sb.append(cryptocurrencyPriceTimeRange);
        sb.append(", fiatCurrencyCode=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.assetSymbol.hashCode() * 31) + this.priceTimeRange.hashCode()) * 31) + this.fiatCurrencyCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CryptocurrencyMarketPricesInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyMarketPricesInput cryptocurrencyMarketPricesInput = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyMarketPricesInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, cryptocurrencyMarketPricesInput.assetSymbol) && this.priceTimeRange == cryptocurrencyMarketPricesInput.priceTimeRange && kotlin.jvm.internal.Intrinsics.areEqual(this.fiatCurrencyCode, cryptocurrencyMarketPricesInput.fiatCurrencyCode);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyMarketPricesInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> assetSymbol, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange priceTimeRange, java.lang.Object fiatCurrencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priceTimeRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiatCurrencyCode, "");
        return new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyMarketPricesInput(assetSymbol, priceTimeRange, fiatCurrencyCode);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getFiatCurrencyCode() {
        return this.fiatCurrencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange getPriceTimeRange() {
        return this.priceTimeRange;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> component1() {
        return this.assetSymbol;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyMarketPricesInput copy$default(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyMarketPricesInput cryptocurrencyMarketPricesInput, com.apollographql.apollo.api.Optional optional, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange cryptocurrencyPriceTimeRange, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            optional = cryptocurrencyMarketPricesInput.assetSymbol;
        }
        if ((i & 2) != 0) {
            cryptocurrencyPriceTimeRange = cryptocurrencyMarketPricesInput.priceTimeRange;
        }
        if ((i & 4) != 0) {
            obj = cryptocurrencyMarketPricesInput.fiatCurrencyCode;
        }
        return cryptocurrencyMarketPricesInput.copy(optional, cryptocurrencyPriceTimeRange, obj);
    }
}
