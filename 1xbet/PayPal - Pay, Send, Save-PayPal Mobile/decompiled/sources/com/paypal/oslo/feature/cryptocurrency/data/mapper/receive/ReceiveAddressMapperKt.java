package com.paypal.oslo.feature.cryptocurrency.data.mapper.receive;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$Data;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/receive/ReceiveAddress;", "toDomain", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$Data;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReceiveAddressMapperKt {
    public static final arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.receive.ReceiveAddress> toDomain(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Data data) {
        com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork blockchainNetwork;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress generateCryptocurrencyAddress = data.getGenerateCryptocurrencyAddress();
        if (generateCryptocurrencyAddress == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
        }
        com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress blockchainAddress = generateCryptocurrencyAddress.getBlockchainAddress();
        java.lang.String value = blockchainAddress.getValue();
        if (value == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
        }
        java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork> blockchainNetworks = blockchainAddress.getBlockchainNetworks();
        if (blockchainNetworks == null || (blockchainNetwork = (com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) blockchainNetworks)) == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
        }
        java.lang.String blockchain = blockchainNetwork.getBlockchain();
        java.lang.Object imageURL = blockchainNetwork.getImageURL();
        java.lang.String obj = imageURL != null ? imageURL.toString() : null;
        java.lang.String rawValue = generateCryptocurrencyAddress.getAssetSymbol().getRawValue();
        java.lang.String transactionTrackingId = generateCryptocurrencyAddress.getTransactionTrackingId();
        java.lang.String memo = blockchainAddress.getMemo();
        java.lang.Boolean displayMemo = blockchainAddress.getDisplayMemo();
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.cryptocurrency.domain.model.receive.ReceiveAddress(value, rawValue, blockchain, transactionTrackingId, memo, displayMemo != null ? displayMemo.booleanValue() : false, obj));
    }
}
