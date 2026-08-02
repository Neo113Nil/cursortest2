package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrumentCard;", "toFundingInstrumentCard", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrumentCard;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentCardMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard toFundingInstrumentCard(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment) {
        java.lang.String str;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment.PrimaryImage primaryImage;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionCardFragment, "");
        java.lang.String id = bnplAcquisitionCardFragment.getId();
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment.CardArt cardArt = bnplAcquisitionCardFragment.getCardArt();
        java.lang.Object baseCdnLinkPath = (cardArt == null || (primaryImage = cardArt.getPrimaryImage()) == null) ? null : primaryImage.getBaseCdnLinkPath();
        java.lang.String str2 = baseCdnLinkPath instanceof java.lang.String ? (java.lang.String) baseCdnLinkPath : null;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment.CardIssuer cardIssuer = bnplAcquisitionCardFragment.getCardIssuer();
        java.lang.String name2 = cardIssuer != null ? cardIssuer.getName() : null;
        java.lang.String str3 = name2 == null ? "" : name2;
        java.lang.String lastNChars = bnplAcquisitionCardFragment.getLastNChars();
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.CardType.Companion companion = com.paypal.oslo.feature.bnplacquisition.domain.model.enums.CardType.INSTANCE;
        com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass = bnplAcquisitionCardFragment.getProductClass();
        if (productClass == null || (str = productClass.name()) == null) {
            str = "UNKNOWN";
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard(id, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType.CARD, str2, str3, lastNChars, companion.from(str));
    }
}
