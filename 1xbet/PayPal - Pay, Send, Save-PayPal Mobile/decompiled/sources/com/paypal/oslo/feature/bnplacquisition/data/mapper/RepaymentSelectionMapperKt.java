package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/Repayments;", "toRepayments", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/Repayments;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/RepaymentRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/type/UpdateBNPLApplicationInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/RepaymentRequest;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RepaymentSelectionMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.Repayments toRepayments(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Data data) {
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.UpdateBnplApplication updateBnplApplication;
        com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess repaymentsSuccess;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason reason;
        com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier;
        com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.SelectedOffer selectedOffer;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment;
        com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard fundingInstrumentCard;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline applicationDecline = null;
        if (data == null || (updateBnplApplication = data.getUpdateBnplApplication()) == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess = updateBnplApplication.getOnUpdateBNPLApplicationSuccess();
        if (onUpdateBNPLApplicationSuccess != null) {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Application application = onUpdateBNPLApplicationSuccess.getApplication();
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier2 = application.getCreditProductIdentifier();
            if (creditProductIdentifier2 == null || (creditProductIdentifier = com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.INSTANCE.from(creditProductIdentifier2.name())) == null) {
                creditProductIdentifier = com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.UNKNOWN;
            }
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PaymentFundingInstrument> paymentFundingInstruments = application.getPaymentFundingInstruments();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PaymentFundingInstrument paymentFundingInstrument : paymentFundingInstruments) {
                if (paymentFundingInstrument.getOnBankAccount() != null) {
                    fundingInstrumentCard = com.paypal.oslo.feature.bnplacquisition.data.mapper.FundingInstrumentBankMapperKt.toFundingInstrumentBank(paymentFundingInstrument.getOnBankAccount().getBnplAcquisitionBankFragment());
                } else {
                    fundingInstrumentCard = paymentFundingInstrument.getOnCard() != null ? com.paypal.oslo.feature.bnplacquisition.data.mapper.FundingInstrumentCardMapperKt.toFundingInstrumentCard(paymentFundingInstrument.getOnCard().getBnplAcquisitionCardFragment()) : null;
                }
                if (fundingInstrumentCard != null) {
                    arrayList.add(fundingInstrumentCard);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Document> documents = application.getDocuments();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(documents, 10));
            java.util.Iterator<T> it = documents.iterator();
            while (it.hasNext()) {
                arrayList3.add(com.paypal.oslo.feature.bnplacquisition.data.mapper.CreditApplicationDocumentMapperKt.toDocument(((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Document) it.next()).getBnplAcquisitionDocumentFragment()));
            }
            java.util.ArrayList arrayList4 = arrayList3;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.SelectedOffer selectedOffer2 = application.getSelectedOffer();
            if (selectedOffer2 != null) {
                com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PeriodicPaymentAmount periodicPaymentAmount = selectedOffer2.getPeriodicPaymentAmount();
                com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = (periodicPaymentAmount == null || (bnplAcquisitionMoneyFragment = periodicPaymentAmount.getBnplAcquisitionMoneyFragment()) == null) ? null : com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(bnplAcquisitionMoneyFragment);
                int installmentCount = selectedOffer2.getInstallmentCount();
                java.lang.Object firstPaymentDate = selectedOffer2.getFirstPaymentDate();
                selectedOffer = new com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.SelectedOffer(money, installmentCount, firstPaymentDate instanceof java.lang.String ? (java.lang.String) firstPaymentDate : null);
            } else {
                selectedOffer = null;
            }
            repaymentsSuccess = new com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccessCreditApplication(creditProductIdentifier, arrayList2, arrayList4, selectedOffer));
        } else {
            repaymentsSuccess = null;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline = updateBnplApplication.getOnUpdateBNPLApplicationDecline();
        if (onUpdateBNPLApplicationDecline != null && (reason = onUpdateBNPLApplicationDecline.getReason()) != null) {
            applicationDecline = com.paypal.oslo.feature.bnplacquisition.data.mapper.ApplicationDeclineMapperKt.toApplicationDecline(reason);
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.Repayments(repaymentsSuccess, applicationDecline);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput toGraphQLInput(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.RepaymentRequest repaymentRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentRequest, "");
        java.lang.String experienceSessionId = repaymentRequest.getExperienceSessionId();
        com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(repaymentRequest.getSelectedOfferId());
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType> consents = repaymentRequest.getConsents();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(consents, 10));
        java.util.Iterator<T> it = consents.iterator();
        while (it.hasNext()) {
            arrayList.add(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionConsent.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType) it.next()).getValue()));
        }
        return new com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput(null, null, null, null, null, null, null, null, companion.presentIfNotNull(arrayList), experienceSessionId, null, null, null, null, null, presentIfNotNull, null, null, null, null, 1015039, null);
    }
}
