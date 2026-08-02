package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/payair/logic/remote/model/TokenDetailsDto;", "Lcom/payair/logic/storage/StorageService;", "storageService", "Lcom/payair/model/TokenDetails;", "toTokenDetails", "(Lcom/payair/logic/remote/model/TokenDetailsDto;Lcom/payair/logic/storage/StorageService;)Lcom/payair/model/TokenDetails;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TokenDetailsDtoKt {
    public static final com.payair.model.TokenDetails toTokenDetails(com.payair.logic.remote.model.TokenDetailsDto tokenDetailsDto, com.payair.logic.storage.StorageService storageService) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenDetailsDto, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageService, "");
        java.lang.String networkTokenReference = tokenDetailsDto.getNetworkTokenReference();
        java.lang.String str2 = networkTokenReference == null ? "" : networkTokenReference;
        com.payair.model.TokenStatus fromStatusName = com.payair.model.TokenStatus.INSTANCE.fromStatusName(tokenDetailsDto.getTokenStatus());
        com.payair.model.TokenInfoModel tokenInfo = tokenDetailsDto.getTokenInfo();
        com.payair.model.TokenInfoModel tokenInfoModel = tokenInfo == null ? new com.payair.model.TokenInfoModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null) : tokenInfo;
        com.payair.model.ProductConfig productConfig = tokenDetailsDto.getProductConfig();
        com.payair.model.ProductConfig productConfig2 = productConfig == null ? new com.payair.model.ProductConfig(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 33554431, null) : productConfig;
        java.lang.String networkTokenReference2 = tokenDetailsDto.getNetworkTokenReference();
        if (networkTokenReference2 != null) {
            if (networkTokenReference2.length() <= 0) {
                networkTokenReference2 = null;
            }
            if (networkTokenReference2 != null) {
                str = storageService.getTokenAlias(networkTokenReference2);
                return new com.payair.model.TokenDetails(str2, fromStatusName, tokenInfoModel, productConfig2, str, tokenDetailsDto.getCardNetwork());
            }
        }
        str = null;
        return new com.payair.model.TokenDetails(str2, fromStatusName, tokenInfoModel, productConfig2, str, tokenDetailsDto.getCardNetwork());
    }
}
