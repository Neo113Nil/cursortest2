package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJF\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/EvaluateCryptocurrencyTradeAttributesInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "fiatAmount", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetQuantityInput;", "assetQuantity", "assetQuantityConvert", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/EvaluateCryptocurrencyTradeAttributesInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getFiatAmount", "getAssetQuantity", "getAssetQuantityConvert"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EvaluateCryptocurrencyTradeAttributesInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> assetQuantity;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> assetQuantityConvert;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> fiatAmount;

    public EvaluateCryptocurrencyTradeAttributesInput(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> optional2, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.fiatAmount = optional;
        this.assetQuantity = optional2;
        this.assetQuantityConvert = optional3;
    }

    public /* synthetic */ EvaluateCryptocurrencyTradeAttributesInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getFiatAmount() {
        return this.fiatAmount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> getAssetQuantity() {
        return this.assetQuantity;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> getAssetQuantityConvert() {
        return this.assetQuantityConvert;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional = this.fiatAmount;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> optional2 = this.assetQuantity;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> optional3 = this.assetQuantityConvert;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EvaluateCryptocurrencyTradeAttributesInput(fiatAmount=");
        sb.append(optional);
        sb.append(", assetQuantity=");
        sb.append(optional2);
        sb.append(", assetQuantityConvert=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.fiatAmount.hashCode() * 31) + this.assetQuantity.hashCode()) * 31) + this.assetQuantityConvert.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.EvaluateCryptocurrencyTradeAttributesInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.EvaluateCryptocurrencyTradeAttributesInput evaluateCryptocurrencyTradeAttributesInput = (com.paypal.oslo.api.graphql.schema.type.EvaluateCryptocurrencyTradeAttributesInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fiatAmount, evaluateCryptocurrencyTradeAttributesInput.fiatAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetQuantity, evaluateCryptocurrencyTradeAttributesInput.assetQuantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetQuantityConvert, evaluateCryptocurrencyTradeAttributesInput.assetQuantityConvert);
    }

    public final com.paypal.oslo.api.graphql.schema.type.EvaluateCryptocurrencyTradeAttributesInput copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> fiatAmount, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> assetQuantity, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> assetQuantityConvert) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiatAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetQuantity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetQuantityConvert, "");
        return new com.paypal.oslo.api.graphql.schema.type.EvaluateCryptocurrencyTradeAttributesInput(fiatAmount, assetQuantity, assetQuantityConvert);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> component3() {
        return this.assetQuantityConvert;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> component2() {
        return this.assetQuantity;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component1() {
        return this.fiatAmount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.EvaluateCryptocurrencyTradeAttributesInput copy$default(com.paypal.oslo.api.graphql.schema.type.EvaluateCryptocurrencyTradeAttributesInput evaluateCryptocurrencyTradeAttributesInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = evaluateCryptocurrencyTradeAttributesInput.fiatAmount;
        }
        if ((i & 2) != 0) {
            optional2 = evaluateCryptocurrencyTradeAttributesInput.assetQuantity;
        }
        if ((i & 4) != 0) {
            optional3 = evaluateCryptocurrencyTradeAttributesInput.assetQuantityConvert;
        }
        return evaluateCryptocurrencyTradeAttributesInput.copy(optional, optional2, optional3);
    }

    public EvaluateCryptocurrencyTradeAttributesInput() {
        this(null, null, null, 7, null);
    }
}
