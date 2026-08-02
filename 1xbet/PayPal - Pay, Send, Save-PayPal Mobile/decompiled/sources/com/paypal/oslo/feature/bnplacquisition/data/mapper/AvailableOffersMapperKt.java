package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/AvailableOfferDetails;", "toAvailableOffers", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/AvailableOfferDetails;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/AvailableOffersRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/type/UpdateBNPLApplicationInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/AvailableOffersRequest;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvailableOffersMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.AvailableOfferDetails toAvailableOffers(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Data data) {
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.UpdateBnplApplication updateBnplApplication;
        com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccess availableOfferDetailsSuccess;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason reason;
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Application application;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment2;
        if (data == null || (updateBnplApplication = data.getUpdateBnplApplication()) == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess = updateBnplApplication.getOnUpdateBNPLApplicationSuccess();
        if (onUpdateBNPLApplicationSuccess == null || (application = onUpdateBNPLApplicationSuccess.getApplication()) == null) {
            availableOfferDetailsSuccess = null;
        } else {
            com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(application.getLoanAmount().getBnplAcquisitionMoneyFragment());
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.ProductOfferEvaluation> productOfferEvaluations = application.getProductOfferEvaluations();
            int i = 10;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(productOfferEvaluations, 10));
            for (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.ProductOfferEvaluation productOfferEvaluation : productOfferEvaluations) {
                com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier from = com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.INSTANCE.from(productOfferEvaluation.getCreditProductIdentifier().name());
                java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Offer> offers = productOfferEvaluation.getOffers();
                if (offers != null) {
                    java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Offer> list = offers;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, i));
                    for (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Offer offer : list) {
                        java.lang.Object id = offer.getId();
                        java.lang.String str = id instanceof java.lang.String ? (java.lang.String) id : null;
                        java.lang.Object apr = offer.getApr();
                        java.lang.String str2 = apr instanceof java.lang.String ? (java.lang.String) apr : null;
                        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money2 = com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(offer.getDueTodayAmount().getBnplAcquisitionMoneyFragment());
                        java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.EstimatedInstallment> estimatedInstallments = offer.getEstimatedInstallments();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(estimatedInstallments, i));
                        for (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.EstimatedInstallment estimatedInstallment : estimatedInstallments) {
                            java.lang.Object paymentDate = estimatedInstallment.getPaymentDate();
                            arrayList4.add(new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.EstimatedInstallment(paymentDate instanceof java.lang.String ? (java.lang.String) paymentDate : null, com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(estimatedInstallment.getTotalPayment().getBnplAcquisitionMoneyFragment())));
                        }
                        java.util.ArrayList arrayList5 = arrayList4;
                        java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionOfferHighlight> highlights = offer.getHighlights();
                        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(highlights, 10));
                        java.util.Iterator<T> it = highlights.iterator();
                        while (it.hasNext()) {
                            arrayList6.add(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight.INSTANCE.from(((com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionOfferHighlight) it.next()).name()));
                        }
                        java.util.ArrayList arrayList7 = arrayList6;
                        int installmentCount = offer.getInstallmentCount();
                        java.lang.Object nominalInterestRate = offer.getNominalInterestRate();
                        java.lang.String str3 = nominalInterestRate instanceof java.lang.String ? (java.lang.String) nominalInterestRate : null;
                        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.PeriodicPaymentAmount periodicPaymentAmount = offer.getPeriodicPaymentAmount();
                        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money3 = (periodicPaymentAmount == null || (bnplAcquisitionMoneyFragment2 = periodicPaymentAmount.getBnplAcquisitionMoneyFragment()) == null) ? null : com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(bnplAcquisitionMoneyFragment2);
                        boolean preselected = offer.getPreselected();
                        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money4 = com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(offer.getTotalAmount().getBnplAcquisitionMoneyFragment());
                        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalInterest totalInterest = offer.getTotalInterest();
                        arrayList3.add(new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.Offer(str, str2, money2, arrayList5, arrayList7, installmentCount, str3, money3, preselected, money4, (totalInterest == null || (bnplAcquisitionMoneyFragment = totalInterest.getBnplAcquisitionMoneyFragment()) == null) ? null : com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(bnplAcquisitionMoneyFragment)));
                        i = 10;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                i = 10;
                arrayList2.add(new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.ProductOfferEvaluation(from, arrayList, null, 4, null));
            }
            availableOfferDetailsSuccess = new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication(money, arrayList2));
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline = updateBnplApplication.getOnUpdateBNPLApplicationDecline();
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.AvailableOfferDetails(availableOfferDetailsSuccess, (onUpdateBNPLApplicationDecline == null || (reason = onUpdateBNPLApplicationDecline.getReason()) == null) ? null : com.paypal.oslo.feature.bnplacquisition.data.mapper.ApplicationDeclineMapperKt.toApplicationDecline(reason));
    }

    public static final com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput toGraphQLInput(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.AvailableOffersRequest availableOffersRequest) {
        com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput;
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableOffersRequest, "");
        java.lang.String experienceSessionId = availableOffersRequest.getExperienceSessionId();
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneType type = availableOffersRequest.getPhoneNumber().getType();
        java.util.ArrayList arrayList = null;
        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull((type == null || (value = type.getValue()) == null) ? null : com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionPhoneType.INSTANCE.safeValueOf(value));
        com.apollographql.apollo.api.Optional presentIfNotNull2 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(availableOffersRequest.getPhoneNumber().getValue());
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address = availableOffersRequest.getAddress();
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        com.apollographql.apollo.api.Optional presentIfNotNull3 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(address.getAddressLine1());
        com.apollographql.apollo.api.Optional presentIfNotNull4 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(address.getAddressLine2());
        com.apollographql.apollo.api.Optional presentIfNotNull5 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(address.getState());
        com.apollographql.apollo.api.Optional presentIfNotNull6 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(address.getCity());
        com.apollographql.apollo.api.Optional presentIfNotNull7 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(address.getPostalCode());
        java.lang.String countryCode = address.getCountryCode();
        com.apollographql.apollo.api.Optional presentIfNotNull8 = companion2.presentIfNotNull(new com.paypal.oslo.api.graphql.schema.type.AddressInput(presentIfNotNull3, presentIfNotNull4, null, presentIfNotNull5, presentIfNotNull6, null, null, presentIfNotNull7, countryCode == null ? "" : countryCode, 100, null));
        com.apollographql.apollo.api.Optional presentIfNotNull9 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(availableOffersRequest.getDateOfBirth());
        com.apollographql.apollo.api.Optional presentIfNotNull10 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(availableOffersRequest.getNationalIdentification());
        com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
        if (availableOffersRequest.getAnnualIncome() != null) {
            java.lang.String currencyCode = availableOffersRequest.getAnnualIncome().getCurrencyCode();
            moneyInput = new com.paypal.oslo.api.graphql.schema.type.MoneyInput(currencyCode != null ? currencyCode : "", availableOffersRequest.getAnnualIncome().getValue());
        } else {
            moneyInput = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull11 = companion3.presentIfNotNull(moneyInput);
        com.apollographql.apollo.api.Optional.Companion companion4 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType> consents = availableOffersRequest.getConsents();
        if (consents != null) {
            java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType> list = consents;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionConsent.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType) it.next()).getValue()));
            }
            arrayList = arrayList2;
        }
        return new com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput(presentIfNotNull8, presentIfNotNull11, null, presentIfNotNull9, null, null, null, null, companion4.presentIfNotNull(arrayList), experienceSessionId, null, null, null, presentIfNotNull10, null, null, null, presentIfNotNull, presentIfNotNull2, null, 646388, null);
    }
}
