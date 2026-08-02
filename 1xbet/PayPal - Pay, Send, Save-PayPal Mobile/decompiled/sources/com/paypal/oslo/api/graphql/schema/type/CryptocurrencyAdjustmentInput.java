package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAdjustmentInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAdjustmentType;", "type", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "assetSymbols", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "amount", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAdjustmentType;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAdjustmentType;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAdjustmentType;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAdjustmentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAdjustmentType;", "getType", "Ljava/util/List;", "getAssetSymbols", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CryptocurrencyAdjustmentInput {
    private final com.paypal.oslo.api.graphql.schema.type.MoneyInput amount;
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> assetSymbols;
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAdjustmentType type;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptocurrencyAdjustmentInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAdjustmentType cryptocurrencyAdjustmentType, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> list, com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyAdjustmentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyInput, "");
        this.type = cryptocurrencyAdjustmentType;
        this.assetSymbols = list;
        this.amount = moneyInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAdjustmentType getType() {
        return this.type;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> getAssetSymbols() {
        return this.assetSymbols;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MoneyInput getAmount() {
        return this.amount;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAdjustmentType cryptocurrencyAdjustmentType = this.type;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> list = this.assetSymbols;
        com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyAdjustmentInput(type=");
        sb.append(cryptocurrencyAdjustmentType);
        sb.append(", assetSymbols=");
        sb.append(list);
        sb.append(", amount=");
        sb.append(moneyInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.type.hashCode() * 31) + this.assetSymbols.hashCode()) * 31) + this.amount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAdjustmentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAdjustmentInput cryptocurrencyAdjustmentInput = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAdjustmentInput) other;
        return this.type == cryptocurrencyAdjustmentInput.type && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbols, cryptocurrencyAdjustmentInput.assetSymbols) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, cryptocurrencyAdjustmentInput.amount);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAdjustmentInput copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAdjustmentType type, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> assetSymbols, com.paypal.oslo.api.graphql.schema.type.MoneyInput amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbols, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAdjustmentInput(type, assetSymbols, amount);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MoneyInput getAmount() {
        return this.amount;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> component2() {
        return this.assetSymbols;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAdjustmentType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAdjustmentInput copy$default(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAdjustmentInput cryptocurrencyAdjustmentInput, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAdjustmentType cryptocurrencyAdjustmentType, java.util.List list, com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cryptocurrencyAdjustmentType = cryptocurrencyAdjustmentInput.type;
        }
        if ((i & 2) != 0) {
            list = cryptocurrencyAdjustmentInput.assetSymbols;
        }
        if ((i & 4) != 0) {
            moneyInput = cryptocurrencyAdjustmentInput.amount;
        }
        return cryptocurrencyAdjustmentInput.copy(cryptocurrencyAdjustmentType, list, moneyInput);
    }
}
