package com.paypal.oslo.feature.wallet.amexandp3.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PaymentToken;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/PaymentTokenInfo;", "toDomain", "(Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PaymentToken;)Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/PaymentTokenInfo;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RetrievePaymentTokenRepositoryMapperKt {
    public static final com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo toDomain(com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentToken paymentToken) {
        com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Available available;
        com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Amount amount;
        com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Available available2;
        com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Amount amount2;
        com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PrimaryImage primaryImage;
        com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PrimaryImage primaryImage2;
        java.lang.Object baseCdnLinkPath;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentToken, "");
        java.lang.String id = paymentToken.getId();
        java.lang.String lastNChars = paymentToken.getLastNChars();
        if (lastNChars == null) {
            lastNChars = "";
        }
        java.lang.String issuerDisplayName = paymentToken.getIssuerDisplayName();
        if (issuerDisplayName == null) {
            issuerDisplayName = "";
        }
        java.lang.String productDisplayName = paymentToken.getProductDisplayName();
        if (productDisplayName == null) {
            productDisplayName = "";
        }
        java.lang.String productIdentifier = paymentToken.getProductIdentifier();
        if (productIdentifier == null) {
            productIdentifier = "";
        }
        java.lang.Object partnerSettingsUrl = paymentToken.getPartnerSettingsUrl();
        java.lang.String str = partnerSettingsUrl instanceof java.lang.String ? (java.lang.String) partnerSettingsUrl : null;
        if (str == null) {
            str = "";
        }
        com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentTokenArt paymentTokenArt = paymentToken.getPaymentTokenArt();
        java.lang.String obj = (paymentTokenArt == null || (primaryImage2 = paymentTokenArt.getPrimaryImage()) == null || (baseCdnLinkPath = primaryImage2.getBaseCdnLinkPath()) == null) ? null : baseCdnLinkPath.toString();
        java.lang.String str2 = obj == null ? "" : obj;
        com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentTokenArt paymentTokenArt2 = paymentToken.getPaymentTokenArt();
        com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt = new com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt(str2, null, null, (paymentTokenArt2 == null || (primaryImage = paymentTokenArt2.getPrimaryImage()) == null) ? null : primaryImage.getMimeType(), 6, null);
        com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.RealTimeBalance realTimeBalance = paymentToken.getRealTimeBalance();
        java.lang.Object currencyCode = (realTimeBalance == null || (available2 = realTimeBalance.getAvailable()) == null || (amount2 = available2.getAmount()) == null) ? null : amount2.getCurrencyCode();
        java.lang.String str3 = currencyCode instanceof java.lang.String ? (java.lang.String) currencyCode : null;
        java.lang.String str4 = str3 != null ? str3 : "";
        com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.RealTimeBalance realTimeBalance2 = paymentToken.getRealTimeBalance();
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo(id, lastNChars, issuerDisplayName, productDisplayName, productIdentifier, str, instrumentArt, str4, (realTimeBalance2 == null || (available = realTimeBalance2.getAvailable()) == null || (amount = available.getAmount()) == null) ? null : amount.getValue());
    }
}
