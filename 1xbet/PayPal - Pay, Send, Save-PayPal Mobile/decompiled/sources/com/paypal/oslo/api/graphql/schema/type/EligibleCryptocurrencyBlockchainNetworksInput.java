package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/EligibleCryptocurrencyBlockchainNetworksInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/apollographql/apollo/api/Optional;", "", "blockchain", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTransferAction;", "intent", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/EligibleCryptocurrencyBlockchainNetworksInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol", "Lcom/apollographql/apollo/api/Optional;", "getBlockchain", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EligibleCryptocurrencyBlockchainNetworksInput {
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
    private final com.apollographql.apollo.api.Optional<java.lang.String> blockchain;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction> intent;

    /* JADX WARN: Multi-variable type inference failed */
    public EligibleCryptocurrencyBlockchainNetworksInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyAssetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.assetSymbol = cryptocurrencyAssetSymbol;
        this.blockchain = optional;
        this.intent = optional2;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
        return this.assetSymbol;
    }

    public /* synthetic */ EligibleCryptocurrencyBlockchainNetworksInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptocurrencyAssetSymbol, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getBlockchain() {
        return this.blockchain;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction> getIntent() {
        return this.intent;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = this.assetSymbol;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.blockchain;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction> optional2 = this.intent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibleCryptocurrencyBlockchainNetworksInput(assetSymbol=");
        sb.append(cryptocurrencyAssetSymbol);
        sb.append(", blockchain=");
        sb.append(optional);
        sb.append(", intent=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.assetSymbol.hashCode() * 31) + this.blockchain.hashCode()) * 31) + this.intent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.EligibleCryptocurrencyBlockchainNetworksInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.EligibleCryptocurrencyBlockchainNetworksInput eligibleCryptocurrencyBlockchainNetworksInput = (com.paypal.oslo.api.graphql.schema.type.EligibleCryptocurrencyBlockchainNetworksInput) other;
        return this.assetSymbol == eligibleCryptocurrencyBlockchainNetworksInput.assetSymbol && kotlin.jvm.internal.Intrinsics.areEqual(this.blockchain, eligibleCryptocurrencyBlockchainNetworksInput.blockchain) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, eligibleCryptocurrencyBlockchainNetworksInput.intent);
    }

    public final com.paypal.oslo.api.graphql.schema.type.EligibleCryptocurrencyBlockchainNetworksInput copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol, com.apollographql.apollo.api.Optional<java.lang.String> blockchain, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction> intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockchain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return new com.paypal.oslo.api.graphql.schema.type.EligibleCryptocurrencyBlockchainNetworksInput(assetSymbol, blockchain, intent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction> component3() {
        return this.intent;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.blockchain;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
        return this.assetSymbol;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.EligibleCryptocurrencyBlockchainNetworksInput copy$default(com.paypal.oslo.api.graphql.schema.type.EligibleCryptocurrencyBlockchainNetworksInput eligibleCryptocurrencyBlockchainNetworksInput, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cryptocurrencyAssetSymbol = eligibleCryptocurrencyBlockchainNetworksInput.assetSymbol;
        }
        if ((i & 2) != 0) {
            optional = eligibleCryptocurrencyBlockchainNetworksInput.blockchain;
        }
        if ((i & 4) != 0) {
            optional2 = eligibleCryptocurrencyBlockchainNetworksInput.intent;
        }
        return eligibleCryptocurrencyBlockchainNetworksInput.copy(cryptocurrencyAssetSymbol, optional, optional2);
    }
}
