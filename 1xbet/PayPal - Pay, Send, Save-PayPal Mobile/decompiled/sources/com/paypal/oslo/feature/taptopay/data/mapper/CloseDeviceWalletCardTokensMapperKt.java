package com.paypal.oslo.feature.taptopay.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$CloseDeviceWalletCardTokens;", "", "deviceId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalCloseCardsResult;", "toDomainResult", "(Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$CloseDeviceWalletCardTokens;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalCloseCardsResult;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CloseDeviceWalletCardTokensMapperKt {
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCloseCardsResult toDomainResult(com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CloseDeviceWalletCardTokens closeDeviceWalletCardTokens, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeDeviceWalletCardTokens, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.List<com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Status> statuses = closeDeviceWalletCardTokens.getStatuses();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(statuses, 10));
        for (com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Status status : statuses) {
            arrayList.add(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CloseCardStatus(str, status.getCardToken().getId(), status.isSuccessful()));
        }
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCloseCardsResult(arrayList);
    }
}
