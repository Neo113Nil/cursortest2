package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrumentBank;", "toFundingInstrumentBank", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrumentBank;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentBankMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank toFundingInstrumentBank(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment) {
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment.InstitutionImage institutionImage;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionBankFragment, "");
        java.lang.String id = bnplAcquisitionBankFragment.getId();
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType from = com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType.INSTANCE.from(bnplAcquisitionBankFragment.getType().name());
        java.lang.String lastNChars = bnplAcquisitionBankFragment.getLastNChars();
        java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment.InstitutionImage> institutionImages = bnplAcquisitionBankFragment.getInstitutionImages();
        java.lang.Object url = (institutionImages == null || (institutionImage = (com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment.InstitutionImage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) institutionImages)) == null) ? null : institutionImage.getUrl();
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank(id, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType.BANK, from, lastNChars, url instanceof java.lang.String ? (java.lang.String) url : null, bnplAcquisitionBankFragment.getBankIssuer().getName());
    }
}
