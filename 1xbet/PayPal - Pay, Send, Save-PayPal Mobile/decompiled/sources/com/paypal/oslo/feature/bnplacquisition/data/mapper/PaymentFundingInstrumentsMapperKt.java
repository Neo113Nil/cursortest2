package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$Data;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;", "toFundingInstruments", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$Data;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentFundingInstrumentsMapperKt {
    public static final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> toFundingInstruments(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Data data) {
        com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.BnplApplicationPaymentFundingInstruments bnplApplicationPaymentFundingInstruments;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Item> items;
        com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard fundingInstrumentCard;
        java.util.ArrayList arrayList = null;
        if (data != null && (bnplApplicationPaymentFundingInstruments = data.getBnplApplicationPaymentFundingInstruments()) != null && (items = bnplApplicationPaymentFundingInstruments.getItems()) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Item item : items) {
                if (item.getOnBankAccount() != null) {
                    fundingInstrumentCard = com.paypal.oslo.feature.bnplacquisition.data.mapper.FundingInstrumentBankMapperKt.toFundingInstrumentBank(item.getOnBankAccount().getBnplAcquisitionBankFragment());
                } else {
                    fundingInstrumentCard = item.getOnCard() != null ? com.paypal.oslo.feature.bnplacquisition.data.mapper.FundingInstrumentCardMapperKt.toFundingInstrumentCard(item.getOnCard().getBnplAcquisitionCardFragment()) : null;
                }
                if (fundingInstrumentCard != null) {
                    arrayList2.add(fundingInstrumentCard);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }
}
