package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto;", "Lcom/payair/model/CompleteTokenizeData;", "toCompleteTokenizeData", "(Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto;)Lcom/payair/model/CompleteTokenizeData;", "Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$ProductConfigDto;", "Lcom/payair/model/ProductConfig;", "toProductConfig", "(Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$ProductConfigDto;)Lcom/payair/model/ProductConfig;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ResponseCompleteTokenizeDtoKt {
    public static final com.payair.model.CompleteTokenizeData toCompleteTokenizeData(com.payair.logic.remote.model.ResponseCompleteTokenizeDto responseCompleteTokenizeDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseCompleteTokenizeDto, "");
        java.lang.String networkTokenReference = responseCompleteTokenizeDto.getNetworkTokenReference();
        com.payair.logic.remote.model.ResponseCompleteTokenizeDto.ProductConfigDto productConfig = responseCompleteTokenizeDto.getProductConfig();
        java.util.ArrayList arrayList = null;
        com.payair.model.ProductConfig productConfig2 = productConfig != null ? toProductConfig(productConfig) : null;
        com.payair.model.TokenStatus status = responseCompleteTokenizeDto.getStatus();
        java.util.List<com.payair.logic.remote.model.AuthenticationMethodDto> authenticationMethods = responseCompleteTokenizeDto.getAuthenticationMethods();
        if (authenticationMethods != null) {
            arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(authenticationMethods, 10));
            java.util.Iterator<T> it = authenticationMethods.iterator();
            while (it.hasNext()) {
                arrayList.add(com.payair.logic.remote.model.AuthenticationMethodDtoKt.toAuthenticationMethod((com.payair.logic.remote.model.AuthenticationMethodDto) it.next()));
            }
        }
        return new com.payair.model.CompleteTokenizeData(networkTokenReference, productConfig2, status, arrayList);
    }

    public static final com.payair.model.ProductConfig toProductConfig(com.payair.logic.remote.model.ResponseCompleteTokenizeDto.ProductConfigDto productConfigDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productConfigDto, "");
        java.lang.String backgroundColor = productConfigDto.getBackgroundColor();
        java.lang.String bankAppName = productConfigDto.getBankAppName();
        java.lang.String brandLogoAssetId = productConfigDto.getBrandLogoAssetId();
        java.lang.String cardBackgroundAssetId = productConfigDto.getCardBackgroundAssetId();
        java.lang.String cardBackgroundCombinedAssetId = productConfigDto.getCardBackgroundCombinedAssetId();
        java.lang.String coBrandLogoAssetId = productConfigDto.getCoBrandLogoAssetId();
        java.lang.String coBrandName = productConfigDto.getCoBrandName();
        java.lang.String contactName = productConfigDto.getContactName();
        java.lang.String contactWebsite = productConfigDto.getContactWebsite();
        java.lang.String customerServiceEmail = productConfigDto.getCustomerServiceEmail();
        java.lang.String customerServicePhoneNr = productConfigDto.getCustomerServicePhoneNr();
        java.lang.String customerServiceUrl = productConfigDto.getCustomerServiceUrl();
        java.lang.String foregroundColor = productConfigDto.getForegroundColor();
        java.lang.String iconAssetId = productConfigDto.getIconAssetId();
        boolean isCoBranded = productConfigDto.isCoBranded();
        java.lang.String issuerLogoAssetId = productConfigDto.getIssuerLogoAssetId();
        com.payair.logic.remote.model.IssuerMobileAppDto issuerMobileApp = productConfigDto.getIssuerMobileApp();
        return new com.payair.model.ProductConfig(backgroundColor, bankAppName, brandLogoAssetId, cardBackgroundAssetId, cardBackgroundCombinedAssetId, coBrandLogoAssetId, coBrandName, contactName, contactWebsite, customerServiceEmail, customerServicePhoneNr, customerServiceUrl, foregroundColor, iconAssetId, isCoBranded, issuerLogoAssetId, issuerMobileApp != null ? com.payair.logic.remote.model.IssuerMobileAppDtoKt.toIssuerMobileApp(issuerMobileApp) : null, productConfigDto.getIssuerName(), productConfigDto.getIssuerProductConfigCode(), productConfigDto.getLabelColor(), productConfigDto.getLongDescription(), productConfigDto.getOnlineBankingLoginUrl(), productConfigDto.getPrivacyPolicyUrl(), productConfigDto.getShortDescription(), productConfigDto.getTermsAndConditionsUrl());
    }
}
