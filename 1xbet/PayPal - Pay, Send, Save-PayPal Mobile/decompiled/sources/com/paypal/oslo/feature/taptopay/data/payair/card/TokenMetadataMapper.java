package com.paypal.oslo.feature.taptopay.data.payair.card;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/payair/card/TokenMetadataMapper;", "Lcom/paypal/oslo/feature/taptopay/domain/core/Mapper;", "Lcom/payair/model/TokenDetailsWithAsset;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardMetadata;", "<init>", "()V", "input", "map", "(Lcom/payair/model/TokenDetailsWithAsset;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardMetadata;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TokenMetadataMapper implements com.paypal.oslo.feature.taptopay.domain.core.Mapper<com.payair.model.TokenDetailsWithAsset, com.paypal.oslo.feature.taptopay.domain.model.card.CardMetadata> {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.taptopay.domain.core.Mapper
    public final com.paypal.oslo.feature.taptopay.domain.model.card.CardMetadata map(com.payair.model.TokenDetailsWithAsset input) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String customerServiceEmail = input.getTokenDetails().getProductConfig().getCustomerServiceEmail();
        java.lang.String issuerName = input.getTokenDetails().getProductConfig().getIssuerName();
        java.lang.String customerServiceUrl = input.getTokenDetails().getProductConfig().getCustomerServiceUrl();
        java.lang.String customerServicePhoneNr = input.getTokenDetails().getProductConfig().getCustomerServicePhoneNr();
        java.lang.String privacyPolicyUrl = input.getTokenDetails().getProductConfig().getPrivacyPolicyUrl();
        java.lang.String longDescription = input.getTokenDetails().getProductConfig().getLongDescription();
        java.lang.String shortDescription = input.getTokenDetails().getProductConfig().getShortDescription();
        java.lang.String accountExpiryMonth = input.getTokenDetails().getTokenInfo().getAccountExpiryMonth();
        if (accountExpiryMonth == null) {
            accountExpiryMonth = "";
        }
        java.lang.String accountExpiryYear = input.getTokenDetails().getTokenInfo().getAccountExpiryYear();
        if (accountExpiryYear == null) {
            accountExpiryYear = "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(accountExpiryMonth);
        sb.append(accountExpiryYear);
        java.lang.String obj = sb.toString();
        java.lang.String accountPanSuffix = input.getTokenDetails().getTokenInfo().getAccountPanSuffix();
        java.lang.String issuerProductConfigCode = input.getTokenDetails().getProductConfig().getIssuerProductConfigCode();
        java.lang.String shortDescription2 = input.getTokenDetails().getProductConfig().getShortDescription();
        java.lang.String termsAndConditionsUrl = input.getTokenDetails().getProductConfig().getTermsAndConditionsUrl();
        java.lang.String networkTokenReference = input.getTokenDetails().getNetworkTokenReference();
        java.lang.String tokenExpiryMonth = input.getTokenDetails().getTokenInfo().getTokenExpiryMonth();
        if (tokenExpiryMonth == null) {
            tokenExpiryMonth = "";
        }
        java.lang.String tokenExpiryYear = input.getTokenDetails().getTokenInfo().getTokenExpiryYear();
        if (tokenExpiryYear == null) {
            tokenExpiryYear = "";
            str = tokenExpiryYear;
        } else {
            str = "";
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(tokenExpiryMonth);
        sb2.append(tokenExpiryYear);
        java.lang.String obj2 = sb2.toString();
        java.lang.String tokenPanSuffix = input.getTokenDetails().getTokenInfo().getTokenPanSuffix();
        return new com.paypal.oslo.feature.taptopay.domain.model.card.CardMetadata(customerServiceEmail, issuerName, customerServiceUrl, customerServicePhoneNr, privacyPolicyUrl, longDescription, shortDescription, obj, accountPanSuffix, issuerProductConfigCode, shortDescription2, termsAndConditionsUrl, networkTokenReference, obj2, tokenPanSuffix == null ? str : tokenPanSuffix, com.paypal.oslo.feature.taptopay.data.payair.card.TokenMetadataMapperKt.toTokenTspId(input.getTokenDetails().getScheme()));
    }
}
