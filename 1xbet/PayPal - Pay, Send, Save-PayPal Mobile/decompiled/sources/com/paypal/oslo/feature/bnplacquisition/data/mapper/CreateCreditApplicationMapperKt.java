package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplication;", "toCreateCreditApplication", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplication;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Application;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;", "toCreateCreditApplicationSuccess", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Application;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/UpdateApplicationAndFetchPersonalInfoRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/UpdateApplicationAndFetchPersonalInfoRequest;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CreateCreditApplicationMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplication toCreateCreditApplication(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Data data) {
        com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.InitializeBnplApplication initializeBnplApplication;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason reason;
        com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Application application;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline applicationDecline = null;
        if (data == null || (initializeBnplApplication = data.getInitializeBnplApplication()) == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationSuccess onInitializeBNPLApplicationSuccess = initializeBnplApplication.getOnInitializeBNPLApplicationSuccess();
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess = (onInitializeBNPLApplicationSuccess == null || (application = onInitializeBNPLApplicationSuccess.getApplication()) == null) ? null : toCreateCreditApplicationSuccess(application);
        com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationDecline onInitializeBNPLApplicationDecline = initializeBnplApplication.getOnInitializeBNPLApplicationDecline();
        if (onInitializeBNPLApplicationDecline != null && (reason = onInitializeBNPLApplicationDecline.getReason()) != null) {
            applicationDecline = com.paypal.oslo.feature.bnplacquisition.data.mapper.ApplicationDeclineMapperKt.toApplicationDecline(reason);
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplication(createCreditApplicationSuccess, applicationDecline);
    }

    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess toCreateCreditApplicationSuccess(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Application application) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment;
        com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank fundingInstrumentBank;
        com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard fundingInstrumentCard;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment2;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank fundingInstrumentBank2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        java.lang.Object creditAccountId = application.getCreditAccountId();
        com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard fundingInstrumentCard2 = null;
        java.lang.String str = creditAccountId instanceof java.lang.String ? (java.lang.String) creditAccountId : null;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Document> documents = application.getDocuments();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(documents, 10));
        java.util.Iterator<T> it = documents.iterator();
        while (it.hasNext()) {
            arrayList2.add(com.paypal.oslo.feature.bnplacquisition.data.mapper.CreditApplicationDocumentMapperKt.toDocument(((com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Document) it.next()).getBnplAcquisitionDocumentFragment()));
        }
        java.util.ArrayList arrayList3 = arrayList2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserInfo userInfo = com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileMapperKt.toUserInfo(application.getUserProfile());
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(application.getLoanAmount().getBnplAcquisitionMoneyFragment());
        java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.PaymentFundingInstrument> paymentFundingInstruments = application.getPaymentFundingInstruments();
        if (paymentFundingInstruments != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.PaymentFundingInstrument paymentFundingInstrument : paymentFundingInstruments) {
                com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount onBankAccount = paymentFundingInstrument.getOnBankAccount();
                if (onBankAccount == null || (bnplAcquisitionBankFragment2 = onBankAccount.getBnplAcquisitionBankFragment()) == null || (fundingInstrumentBank2 = com.paypal.oslo.feature.bnplacquisition.data.mapper.FundingInstrumentBankMapperKt.toFundingInstrumentBank(bnplAcquisitionBankFragment2)) == null) {
                    com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard onCard = paymentFundingInstrument.getOnCard();
                    fundingInstrumentCard = (onCard == null || (bnplAcquisitionCardFragment2 = onCard.getBnplAcquisitionCardFragment()) == null) ? null : com.paypal.oslo.feature.bnplacquisition.data.mapper.FundingInstrumentCardMapperKt.toFundingInstrumentCard(bnplAcquisitionCardFragment2);
                } else {
                    fundingInstrumentCard = fundingInstrumentBank2;
                }
                if (fundingInstrumentCard != null) {
                    arrayList4.add(fundingInstrumentCard);
                }
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument = application.getSelectedPaymentFundingInstrument();
        if (selectedPaymentFundingInstrument != null) {
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount1 onBankAccount2 = selectedPaymentFundingInstrument.getOnBankAccount();
            if (onBankAccount2 == null || (bnplAcquisitionBankFragment = onBankAccount2.getBnplAcquisitionBankFragment()) == null || (fundingInstrumentBank = com.paypal.oslo.feature.bnplacquisition.data.mapper.FundingInstrumentBankMapperKt.toFundingInstrumentBank(bnplAcquisitionBankFragment)) == null) {
                com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard1 onCard2 = selectedPaymentFundingInstrument.getOnCard();
                if (onCard2 != null && (bnplAcquisitionCardFragment = onCard2.getBnplAcquisitionCardFragment()) != null) {
                    fundingInstrumentCard2 = com.paypal.oslo.feature.bnplacquisition.data.mapper.FundingInstrumentCardMapperKt.toFundingInstrumentCard(bnplAcquisitionCardFragment);
                }
            } else {
                fundingInstrumentCard2 = fundingInstrumentBank;
            }
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess(arrayList3, userInfo, money, str, null, null, arrayList, fundingInstrumentCard2, 48, null);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput toGraphQLInput(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.UpdateApplicationAndFetchPersonalInfoRequest updateApplicationAndFetchPersonalInfoRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateApplicationAndFetchPersonalInfoRequest, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput(null, null, null, null, null, null, null, null, null, updateApplicationAndFetchPersonalInfoRequest.getExperienceSessionId(), null, null, null, null, null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(updateApplicationAndFetchPersonalInfoRequest.getOfferId()), null, null, null, null, 1015295, null);
    }
}
