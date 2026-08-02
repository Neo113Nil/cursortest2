package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetPreferenceIntentInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetPreferenceType;", "intent", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetPreferenceType;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetPreferenceType;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetPreferenceType;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetPreferenceIntentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetPreferenceType;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CryptocurrencyAssetPreferenceIntentInput {
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType intent;

    public CryptocurrencyAssetPreferenceIntentInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType cryptocurrencyAssetPreferenceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyAssetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyAssetPreferenceType, "");
        this.assetSymbol = cryptocurrencyAssetSymbol;
        this.intent = cryptocurrencyAssetPreferenceType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
        return this.assetSymbol;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType getIntent() {
        return this.intent;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = this.assetSymbol;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType cryptocurrencyAssetPreferenceType = this.intent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyAssetPreferenceIntentInput(assetSymbol=");
        sb.append(cryptocurrencyAssetSymbol);
        sb.append(", intent=");
        sb.append(cryptocurrencyAssetPreferenceType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.assetSymbol.hashCode() * 31) + this.intent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceIntentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceIntentInput cryptocurrencyAssetPreferenceIntentInput = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceIntentInput) other;
        return this.assetSymbol == cryptocurrencyAssetPreferenceIntentInput.assetSymbol && this.intent == cryptocurrencyAssetPreferenceIntentInput.intent;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceIntentInput copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceIntentInput(assetSymbol, intent);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType getIntent() {
        return this.intent;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
        return this.assetSymbol;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceIntentInput copy$default(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceIntentInput cryptocurrencyAssetPreferenceIntentInput, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType cryptocurrencyAssetPreferenceType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cryptocurrencyAssetSymbol = cryptocurrencyAssetPreferenceIntentInput.assetSymbol;
        }
        if ((i & 2) != 0) {
            cryptocurrencyAssetPreferenceType = cryptocurrencyAssetPreferenceIntentInput.intent;
        }
        return cryptocurrencyAssetPreferenceIntentInput.copy(cryptocurrencyAssetSymbol, cryptocurrencyAssetPreferenceType);
    }
}
