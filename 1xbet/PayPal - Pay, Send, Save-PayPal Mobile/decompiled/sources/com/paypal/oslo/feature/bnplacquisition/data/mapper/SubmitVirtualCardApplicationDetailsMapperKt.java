package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/SubmitBnplApplicationMutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetails;", "toSubmitVirtualCardApplicationDetails", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/SubmitBnplApplicationMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetails;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/SubmitCreditApplicationRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/SubmitBNPLApplicationInput;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/type/SubmitBNPLApplicationInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/SubmitCreditApplicationRequest;)Lcom/paypal/oslo/api/graphql/schema/type/SubmitBNPLApplicationInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SubmitVirtualCardApplicationDetailsMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails toSubmitVirtualCardApplicationDetails(com.paypal.oslo.feature.bnplacquisition.graphql.SubmitBnplApplicationMutation.Data data) {
        com.paypal.oslo.feature.bnplacquisition.graphql.SubmitBnplApplicationMutation.SubmitBnplApplication submitBnplApplication;
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason reason;
        com.paypal.oslo.feature.bnplacquisition.graphql.SubmitBnplApplicationMutation.Application application;
        com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent virtualCardContent;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment bnplAcquisitionVirtualCardFragment;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline applicationDecline = null;
        if (data == null || (submitBnplApplication = data.getSubmitBnplApplication()) == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.SubmitBnplApplicationMutation.OnSubmitBNPLApplicationSuccess onSubmitBNPLApplicationSuccess = submitBnplApplication.getOnSubmitBNPLApplicationSuccess();
        if (onSubmitBNPLApplicationSuccess == null || (application = onSubmitBNPLApplicationSuccess.getApplication()) == null) {
            submitVirtualCardApplicationDetailsSuccess = null;
        } else {
            com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(application.getLoanAmount().getBnplAcquisitionMoneyFragment());
            java.lang.Object creditAccountId = application.getCreditAccountId();
            java.lang.String str = creditAccountId instanceof java.lang.String ? (java.lang.String) creditAccountId : null;
            java.lang.Object applicationId = application.getApplicationId();
            java.lang.String str2 = applicationId instanceof java.lang.String ? (java.lang.String) applicationId : null;
            com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationStatus applicationStatus = application.getApplicationStatus();
            java.lang.String name2 = applicationStatus != null ? applicationStatus.name() : null;
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier = application.getCreditProductIdentifier();
            java.lang.String name3 = creditProductIdentifier != null ? creditProductIdentifier.name() : null;
            com.paypal.oslo.feature.bnplacquisition.graphql.SubmitBnplApplicationMutation.VirtualCard virtualCard = application.getVirtualCard();
            if (virtualCard == null || (bnplAcquisitionVirtualCardFragment = virtualCard.getBnplAcquisitionVirtualCardFragment()) == null) {
                virtualCardContent = null;
            } else {
                java.lang.Object lastNChars = bnplAcquisitionVirtualCardFragment.getLastNChars();
                java.lang.String str3 = lastNChars instanceof java.lang.String ? (java.lang.String) lastNChars : null;
                com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment.CardArt cardArt = bnplAcquisitionVirtualCardFragment.getCardArt();
                java.lang.Object url = cardArt != null ? cardArt.getUrl() : null;
                java.lang.String str4 = url instanceof java.lang.String ? (java.lang.String) url : null;
                java.lang.Object createTime = bnplAcquisitionVirtualCardFragment.getCreateTime();
                java.lang.String str5 = createTime instanceof java.lang.String ? (java.lang.String) createTime : null;
                java.lang.Object expirationDuration = bnplAcquisitionVirtualCardFragment.getExpirationDuration();
                virtualCardContent = new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent(str3, str4, str5, expirationDuration instanceof java.lang.String ? (java.lang.String) expirationDuration : null, money);
            }
            submitVirtualCardApplicationDetailsSuccess = new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccessCreditApplication(str, str2, name2, name3, money, virtualCardContent));
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.SubmitBnplApplicationMutation.OnSubmitBNPLApplicationDecline onSubmitBNPLApplicationDecline = submitBnplApplication.getOnSubmitBNPLApplicationDecline();
        if (onSubmitBNPLApplicationDecline != null && (reason = onSubmitBNPLApplicationDecline.getReason()) != null) {
            applicationDecline = com.paypal.oslo.feature.bnplacquisition.data.mapper.ApplicationDeclineMapperKt.toApplicationDecline(reason);
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails(submitVirtualCardApplicationDetailsSuccess, applicationDecline);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.SubmitBNPLApplicationInput toGraphQLInput(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SubmitCreditApplicationRequest submitCreditApplicationRequest) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitCreditApplicationRequest, "");
        java.lang.String experienceSessionId = submitCreditApplicationRequest.getExperienceSessionId();
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType> consents = submitCreditApplicationRequest.getConsents();
        if (consents != null) {
            java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType> list = consents;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionConsent.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType) it.next()).name()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new com.paypal.oslo.api.graphql.schema.type.SubmitBNPLApplicationInput(null, null, null, null, null, null, null, null, companion.presentIfNotNull(arrayList), experienceSessionId, null, null, null, null, null, null, null, null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(submitCreditApplicationRequest.getSelectedFundingInstrumentId()), 261375, null);
    }
}
