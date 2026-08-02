package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetails;", "toReviewPlanDetails", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetails;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Application;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;", "toReviewPlanDetailsSuccess", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Application;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/UpdateApplicationAndFetchReviewDetailsRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/UpdateApplicationAndFetchReviewDetailsRequest;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReviewPlanMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetails toReviewPlanDetails(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Data data) {
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication updateBnplApplication;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason reason;
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application application;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline applicationDecline = null;
        if (data == null || (updateBnplApplication = data.getUpdateBnplApplication()) == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess = updateBnplApplication.getOnUpdateBNPLApplicationSuccess();
        com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewPlanDetailsSuccess = (onUpdateBNPLApplicationSuccess == null || (application = onUpdateBNPLApplicationSuccess.getApplication()) == null) ? null : toReviewPlanDetailsSuccess(application);
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline = updateBnplApplication.getOnUpdateBNPLApplicationDecline();
        if (onUpdateBNPLApplicationDecline != null && (reason = onUpdateBNPLApplicationDecline.getReason()) != null) {
            applicationDecline = com.paypal.oslo.feature.bnplacquisition.data.mapper.ApplicationDeclineMapperKt.toApplicationDecline(reason);
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetails(reviewPlanDetailsSuccess, applicationDecline);
    }

    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess toReviewPlanDetailsSuccess(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application application) {
        com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.SelectedOfferDetails selectedOfferDetails;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment;
        com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank fundingInstrumentBank;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier = application.getCreditProductIdentifier();
        com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard fundingInstrumentCard = null;
        java.lang.String name2 = creditProductIdentifier != null ? creditProductIdentifier.name() : null;
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer selectedOffer = application.getSelectedOffer();
        if (selectedOffer != null) {
            int installmentCount = selectedOffer.getInstallmentCount();
            java.lang.Object apr = selectedOffer.getApr();
            java.lang.String str = apr instanceof java.lang.String ? (java.lang.String) apr : null;
            java.lang.Object nominalInterestRate = selectedOffer.getNominalInterestRate();
            java.lang.String str2 = nominalInterestRate instanceof java.lang.String ? (java.lang.String) nominalInterestRate : null;
            com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(selectedOffer.getDueTodayAmount().getBnplAcquisitionMoneyFragment());
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount periodicPaymentAmount = selectedOffer.getPeriodicPaymentAmount();
            com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money2 = (periodicPaymentAmount == null || (bnplAcquisitionMoneyFragment2 = periodicPaymentAmount.getBnplAcquisitionMoneyFragment()) == null) ? null : com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(bnplAcquisitionMoneyFragment2);
            com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money3 = com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(selectedOffer.getTotalAmount().getBnplAcquisitionMoneyFragment());
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest totalInterest = selectedOffer.getTotalInterest();
            selectedOfferDetails = new com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.SelectedOfferDetails(installmentCount, str, str2, money, money2, money3, (totalInterest == null || (bnplAcquisitionMoneyFragment = totalInterest.getBnplAcquisitionMoneyFragment()) == null) ? null : com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(bnplAcquisitionMoneyFragment));
        } else {
            selectedOfferDetails = null;
        }
        java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document> documents = application.getDocuments();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(documents, 10));
        java.util.Iterator<T> it = documents.iterator();
        while (it.hasNext()) {
            arrayList.add(com.paypal.oslo.feature.bnplacquisition.data.mapper.CreditApplicationDocumentMapperKt.toDocument(((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document) it.next()).getBnplAcquisitionDocumentFragment()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument = application.getSelectedPaymentFundingInstrument();
        if (selectedPaymentFundingInstrument != null) {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount onBankAccount = selectedPaymentFundingInstrument.getOnBankAccount();
            if (onBankAccount == null || (bnplAcquisitionBankFragment = onBankAccount.getBnplAcquisitionBankFragment()) == null || (fundingInstrumentBank = com.paypal.oslo.feature.bnplacquisition.data.mapper.FundingInstrumentBankMapperKt.toFundingInstrumentBank(bnplAcquisitionBankFragment)) == null) {
                com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard onCard = selectedPaymentFundingInstrument.getOnCard();
                if (onCard != null && (bnplAcquisitionCardFragment = onCard.getBnplAcquisitionCardFragment()) != null) {
                    fundingInstrumentCard = com.paypal.oslo.feature.bnplacquisition.data.mapper.FundingInstrumentCardMapperKt.toFundingInstrumentCard(bnplAcquisitionCardFragment);
                }
            } else {
                fundingInstrumentCard = fundingInstrumentBank;
            }
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess(name2, selectedOfferDetails, arrayList2, fundingInstrumentCard);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput toGraphQLInput(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.UpdateApplicationAndFetchReviewDetailsRequest updateApplicationAndFetchReviewDetailsRequest) {
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateApplicationAndFetchReviewDetailsRequest, "");
        java.lang.String experienceSessionId = updateApplicationAndFetchReviewDetailsRequest.getExperienceSessionId();
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneType type = updateApplicationAndFetchReviewDetailsRequest.getPhoneNumber().getType();
        java.util.ArrayList arrayList = null;
        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull((type == null || (value = type.getValue()) == null) ? null : com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionPhoneType.INSTANCE.safeValueOf(value));
        com.apollographql.apollo.api.Optional presentIfNotNull2 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(updateApplicationAndFetchReviewDetailsRequest.getPhoneNumber().getValue());
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address = updateApplicationAndFetchReviewDetailsRequest.getAddress();
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        com.apollographql.apollo.api.Optional presentIfNotNull3 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(address.getAddressLine1());
        com.apollographql.apollo.api.Optional presentIfNotNull4 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(address.getAddressLine2());
        com.apollographql.apollo.api.Optional presentIfNotNull5 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(address.getState());
        com.apollographql.apollo.api.Optional presentIfNotNull6 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(address.getCity());
        com.apollographql.apollo.api.Optional presentIfNotNull7 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(address.getPostalCode());
        java.lang.String countryCode = address.getCountryCode();
        com.apollographql.apollo.api.Optional presentIfNotNull8 = companion2.presentIfNotNull(new com.paypal.oslo.api.graphql.schema.type.AddressInput(presentIfNotNull3, presentIfNotNull4, null, presentIfNotNull5, presentIfNotNull6, null, null, presentIfNotNull7, countryCode == null ? "" : countryCode, 100, null));
        com.apollographql.apollo.api.Optional presentIfNotNull9 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(updateApplicationAndFetchReviewDetailsRequest.getSelectedPaymentFundingInstrumentId());
        com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType> consents = updateApplicationAndFetchReviewDetailsRequest.getConsents();
        if (consents != null) {
            java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType> list = consents;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionConsent.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType) it.next()).getValue()));
            }
            arrayList = arrayList2;
        }
        return new com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput(presentIfNotNull8, null, null, null, null, null, null, null, companion3.presentIfNotNull(arrayList), experienceSessionId, null, null, null, null, null, null, null, presentIfNotNull, presentIfNotNull2, presentIfNotNull9, 130302, null);
    }
}
