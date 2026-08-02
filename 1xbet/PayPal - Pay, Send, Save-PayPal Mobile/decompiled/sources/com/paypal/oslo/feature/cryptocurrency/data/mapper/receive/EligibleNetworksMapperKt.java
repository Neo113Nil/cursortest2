package com.paypal.oslo.feature.cryptocurrency.data.mapper.receive;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery$Data;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/receive/BlockchainNetwork;", "toDomain", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery$Data;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EligibleNetworksMapperKt {
    public static final arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork>> toDomain(com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.EligibleCryptocurrencyBlockchainNetworks eligibleCryptocurrencyBlockchainNetworks = data.getEligibleCryptocurrencyBlockchainNetworks();
        if (eligibleCryptocurrencyBlockchainNetworks == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
        }
        java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.BlockchainNetwork> blockchainNetworks = eligibleCryptocurrencyBlockchainNetworks.getBlockchainNetworks();
        if (blockchainNetworks.isEmpty()) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
        }
        java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.BlockchainNetwork> list = blockchainNetworks;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.BlockchainNetwork blockchainNetwork : list) {
            java.lang.String rawValue = blockchainNetwork.getName().getRawValue();
            java.lang.String blockchain = blockchainNetwork.getBlockchain();
            java.lang.String blockchain2 = blockchainNetwork.getBlockchain();
            java.lang.Boolean defaultNetwork = blockchainNetwork.getDefaultNetwork();
            boolean booleanValue = defaultNetwork != null ? defaultNetwork.booleanValue() : false;
            java.lang.Object imageURL = blockchainNetwork.getImageURL();
            arrayList.add(new com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork(rawValue, blockchain, blockchain2, booleanValue, imageURL != null ? imageURL.toString() : null));
        }
        return arrow.core.EitherKt.right(arrayList);
    }
}
