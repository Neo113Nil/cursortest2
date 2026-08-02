package com.paypal.oslo.feature.cryptocurrency.ui.receive.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/receive/BlockchainNetwork;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/NetworkOption;", "toNetworkOption", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/receive/BlockchainNetwork;)Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/NetworkOption;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NetworkOptionMapperKt {
    public static final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.NetworkOption toNetworkOption(com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork blockchainNetwork) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockchainNetwork, "");
        java.lang.String id = blockchainNetwork.getId();
        java.lang.String name2 = blockchainNetwork.getName();
        java.lang.String imageUrl = blockchainNetwork.getImageUrl();
        return new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.NetworkOption(id, name2, imageUrl != null ? imageUrl : "", blockchainNetwork.isDefault());
    }
}
