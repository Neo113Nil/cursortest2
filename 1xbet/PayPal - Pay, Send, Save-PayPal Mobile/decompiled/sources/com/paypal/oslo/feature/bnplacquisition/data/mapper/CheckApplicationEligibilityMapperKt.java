package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CheckApplicationEligibility;", "toCheckApplicationEligibility", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CheckApplicationEligibility;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/CheckApplicationEligibilityRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/CheckBNPLApplicationEligibilityInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/CheckApplicationEligibilityRequest;)Lcom/paypal/oslo/api/graphql/schema/type/CheckBNPLApplicationEligibilityInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckApplicationEligibilityMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CheckApplicationEligibility toCheckApplicationEligibility(com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Data data) {
        com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.CheckBnplApplicationEligibility checkBnplApplicationEligibility;
        com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CheckApplicationEligibilitySuccess checkApplicationEligibilitySuccess;
        java.util.ArrayList arrayList;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Eligible> eligible;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment2;
        if (data == null || (checkBnplApplicationEligibility = data.getCheckBnplApplicationEligibility()) == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.OnBNPLAcquisitionCheckApplicationEligibilitySuccess onBNPLAcquisitionCheckApplicationEligibilitySuccess = checkBnplApplicationEligibility.getOnBNPLAcquisitionCheckApplicationEligibilitySuccess();
        if (onBNPLAcquisitionCheckApplicationEligibilitySuccess != null) {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationEligibilityEvaluationType> evaluationTypes = onBNPLAcquisitionCheckApplicationEligibilitySuccess.getEvaluationTypes();
            int i = 10;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(evaluationTypes, 10));
            java.util.Iterator<T> it = evaluationTypes.iterator();
            while (it.hasNext()) {
                arrayList3.add(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType.INSTANCE.from(((com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationEligibilityEvaluationType) it.next()).getRawValue()));
            }
            java.util.ArrayList arrayList4 = arrayList3;
            com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.ProductOfferEvaluations productOfferEvaluations = onBNPLAcquisitionCheckApplicationEligibilitySuccess.getProductOfferEvaluations();
            if (productOfferEvaluations == null || (eligible = productOfferEvaluations.getEligible()) == null) {
                arrayList = null;
            } else {
                java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Eligible> list = eligible;
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Eligible eligible2 : list) {
                    com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier from = com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.INSTANCE.from(eligible2.getCreditProductIdentifier().name());
                    java.lang.Object id = eligible2.getId();
                    java.lang.String str = id instanceof java.lang.String ? (java.lang.String) id : null;
                    java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Offer> offers = eligible2.getOffers();
                    if (offers != null) {
                        java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Offer> list2 = offers;
                        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, i));
                        for (com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Offer offer : list2) {
                            java.lang.Object id2 = offer.getId();
                            java.lang.String str2 = id2 instanceof java.lang.String ? (java.lang.String) id2 : null;
                            java.lang.Object apr = offer.getApr();
                            java.lang.String str3 = apr instanceof java.lang.String ? (java.lang.String) apr : null;
                            com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(offer.getDueTodayAmount().getBnplAcquisitionMoneyFragment());
                            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.EstimatedInstallment> estimatedInstallments = offer.getEstimatedInstallments();
                            java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(estimatedInstallments, i));
                            java.util.Iterator it2 = estimatedInstallments.iterator();
                            while (it2.hasNext()) {
                                com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.EstimatedInstallment estimatedInstallment = (com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.EstimatedInstallment) it2.next();
                                com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money2 = com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(estimatedInstallment.getTotalPayment().getBnplAcquisitionMoneyFragment());
                                java.lang.Object paymentDate = estimatedInstallment.getPaymentDate();
                                java.util.Iterator it3 = it2;
                                arrayList7.add(new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.EstimatedInstallment(paymentDate instanceof java.lang.String ? (java.lang.String) paymentDate : null, money2));
                                it2 = it3;
                            }
                            java.util.ArrayList arrayList8 = arrayList7;
                            java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionOfferHighlight> highlights = offer.getHighlights();
                            java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(highlights, 10));
                            java.util.Iterator<T> it4 = highlights.iterator();
                            while (it4.hasNext()) {
                                arrayList9.add(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight.INSTANCE.from(((com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionOfferHighlight) it4.next()).getRawValue()));
                            }
                            java.util.ArrayList arrayList10 = arrayList9;
                            int installmentCount = offer.getInstallmentCount();
                            java.lang.Object nominalInterestRate = offer.getNominalInterestRate();
                            java.lang.String str4 = nominalInterestRate instanceof java.lang.String ? (java.lang.String) nominalInterestRate : null;
                            com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.PeriodicPaymentAmount periodicPaymentAmount = offer.getPeriodicPaymentAmount();
                            com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money3 = (periodicPaymentAmount == null || (bnplAcquisitionMoneyFragment2 = periodicPaymentAmount.getBnplAcquisitionMoneyFragment()) == null) ? null : com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(bnplAcquisitionMoneyFragment2);
                            boolean preselected = offer.getPreselected();
                            com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money4 = com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(offer.getTotalAmount().getBnplAcquisitionMoneyFragment());
                            com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalInterest totalInterest = offer.getTotalInterest();
                            arrayList6.add(new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.Offer(str2, str3, money, arrayList8, arrayList10, installmentCount, str4, money3, preselected, money4, (totalInterest == null || (bnplAcquisitionMoneyFragment = totalInterest.getBnplAcquisitionMoneyFragment()) == null) ? null : com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(bnplAcquisitionMoneyFragment)));
                            i = 10;
                        }
                        arrayList2 = arrayList6;
                    } else {
                        arrayList2 = null;
                    }
                    arrayList5.add(new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer(from, str, arrayList2));
                    i = 10;
                }
                arrayList = arrayList5;
            }
            if (arrayList == null) {
                arrayList = kotlin.collections.CollectionsKt.emptyList();
            }
            checkApplicationEligibilitySuccess = new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CheckApplicationEligibilitySuccess(arrayList4, arrayList);
        } else {
            checkApplicationEligibilitySuccess = null;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.OnBNPLAcquisitionCheckApplicationEligibilityDecline onBNPLAcquisitionCheckApplicationEligibilityDecline = checkBnplApplicationEligibility.getOnBNPLAcquisitionCheckApplicationEligibilityDecline();
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CheckApplicationEligibility(checkApplicationEligibilitySuccess, onBNPLAcquisitionCheckApplicationEligibilityDecline != null ? new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CheckApplicationEligibilityDecline(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityDeclineReason.INSTANCE.from(onBNPLAcquisitionCheckApplicationEligibilityDecline.getReason().getRawValue())) : null);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.CheckBNPLApplicationEligibilityInput toGraphQLInput(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CheckApplicationEligibilityRequest checkApplicationEligibilityRequest) {
        com.apollographql.apollo.api.Optional.Absent absent;
        com.apollographql.apollo.api.Optional.Absent absent2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkApplicationEligibilityRequest, "");
        java.lang.String applicationSessionId = checkApplicationEligibilityRequest.getApplicationSessionId();
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType> evaluationTypes = checkApplicationEligibilityRequest.getEvaluationTypes();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(evaluationTypes, 10));
        java.util.Iterator<T> it = evaluationTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationEligibilityEvaluationType.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType) it.next()).getValue()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money amount = checkApplicationEligibilityRequest.getAmount();
        if (amount != null) {
            java.lang.String currencyCode = amount.getCurrencyCode();
            absent = new com.apollographql.apollo.api.Optional.Present(new com.paypal.oslo.api.graphql.schema.type.MoneyInput(currencyCode != null ? currencyCode : "", amount.getValue()));
        } else {
            absent = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        }
        if (!checkApplicationEligibilityRequest.getCreditProductIdentifiers().isEmpty()) {
            java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> creditProductIdentifiers = checkApplicationEligibilityRequest.getCreditProductIdentifiers();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(creditProductIdentifiers, 10));
            java.util.Iterator<T> it2 = creditProductIdentifiers.iterator();
            while (it2.hasNext()) {
                arrayList3.add(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier) it2.next()).name()));
            }
            absent2 = new com.apollographql.apollo.api.Optional.Present(arrayList3);
        } else {
            absent2 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        }
        return new com.paypal.oslo.api.graphql.schema.type.CheckBNPLApplicationEligibilityInput(absent, arrayList2, applicationSessionId, absent2);
    }
}
