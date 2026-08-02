package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCUKServicingOverviewQuery$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCUKServicingOverviewQuery$Data;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PPCUKAccountSummaryMapperKt {
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView toDomain$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.Data data, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            partialErrorHandler = null;
        }
        return toDomain(data, partialErrorHandler);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.Data data, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview customerProfilesOverview;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView mapToAccountSummaryOverview;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesUKFragment.Page page;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment.Product product;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment revolvingCreditServicingProductFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities capabilities;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment revolvingCreditServicingContentFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService customerService;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment revolvingCreditAutopayFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PersistentDebt persistentDebt;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.CustomerService customerService2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.PhoneNumber phoneNumber;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment revolvingCreditPhoneFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.Payments payments;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.PersistentDebtContent persistentDebtContent;
        java.lang.Object learnMoreUrl;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment3;
        java.lang.Object creditAccountId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount = data.getRevolvingCreditAccount();
        java.lang.String obj = (revolvingCreditAccount == null || (revolvingCreditAccountFragment3 = revolvingCreditAccount.getRevolvingCreditAccountFragment()) == null || (creditAccountId = revolvingCreditAccountFragment3.getCreditAccountId()) == null) ? null : creditAccountId.toString();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount2 = data.getRevolvingCreditAccount();
        if (revolvingCreditAccount2 == null || (revolvingCreditAccountFragment2 = revolvingCreditAccount2.getRevolvingCreditAccountFragment()) == null) {
            accountOverview = null;
        } else {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment.PersistentDebt persistentDebt2 = data.getRevolvingCreditAccount().getRevolvingCreditAccountFragment().getPersistentDebt();
            if (persistentDebt2 != null) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = data.getRevolvingCreditServicingContent();
                java.lang.String obj2 = (revolvingCreditServicingContent == null || (payments = revolvingCreditServicingContent.getPayments()) == null || (persistentDebtContent = payments.getPersistentDebtContent()) == null || (learnMoreUrl = persistentDebtContent.getLearnMoreUrl()) == null) ? null : learnMoreUrl.toString();
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent2 = data.getRevolvingCreditServicingContent();
                persistentDebt = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.PersistentDebtMapperKt.toDomain(persistentDebt2, obj2, (revolvingCreditServicingContent2 == null || (customerService2 = revolvingCreditServicingContent2.getCustomerService()) == null || (phoneNumber = customerService2.getPhoneNumber()) == null || (revolvingCreditPhoneFragment = phoneNumber.getRevolvingCreditPhoneFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CustomerServiceContactMapperKt.toDomain(revolvingCreditPhoneFragment));
            } else {
                persistentDebt = null;
            }
            accountOverview = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountOverviewMapperKt.toAccountOverview(revolvingCreditAccountFragment2, persistentDebt);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditActivities revolvingCreditActivities = data.getRevolvingCreditActivities();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage financialActivityPage$default = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.activity.FinancialActivityPageMapperKt.toFinancialActivityPage$default(revolvingCreditActivities != null ? revolvingCreditActivities.getRevolvingCreditActivitiesFragment() : null, partialErrorHandler != null && partialErrorHandler.contains("revolvingCreditActivities"), (java.lang.Integer) null, 2, (java.lang.Object) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay = data.getRevolvingCreditAutopay();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview = (revolvingCreditAutopay == null || (revolvingCreditAutopayFragment = revolvingCreditAutopay.getRevolvingCreditAutopayFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.AutopayOverviewMapperKt.toAutopayOverview(revolvingCreditAutopayFragment);
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditPayment> revolvingCreditPayments = data.getRevolvingCreditPayments();
        if (revolvingCreditPayments != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditPayment> list = revolvingCreditPayments;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditPayment) it.next()).getRevolvingCreditPaymentsFragment());
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> repaymentActivities = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountSummaryMapperKt.toRepaymentActivities(arrayList, partialErrorHandler);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent3 = data.getRevolvingCreditServicingContent();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls contentURLs = revolvingCreditServicingContent3 != null ? com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.ContentUrlMapperKt.toContentURLs(revolvingCreditServicingContent3) : null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent4 = data.getRevolvingCreditServicingContent();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact = (revolvingCreditServicingContent4 == null || (revolvingCreditServicingContentFragment = revolvingCreditServicingContent4.getRevolvingCreditServicingContentFragment()) == null || (customerService = revolvingCreditServicingContentFragment.getCustomerService()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CustomerServiceContactMapperKt.toCustomerServiceContact(customerService);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount3 = data.getRevolvingCreditAccount();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations = (revolvingCreditAccount3 == null || (revolvingCreditAccountFragment = revolvingCreditAccount3.getRevolvingCreditAccountFragment()) == null || (product = revolvingCreditAccountFragment.getProduct()) == null || (revolvingCreditServicingProductFragment = product.getRevolvingCreditServicingProductFragment()) == null || (capabilities = revolvingCreditServicingProductFragment.getCapabilities()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.ProductConfigurationsMapperKt.toProductConfigurations(capabilities, revolvingCreditServicingProductFragment.getValuePropositions());
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditInstrument> revolvingCreditInstruments = data.getRevolvingCreditInstruments();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument> ppcukToCreditInstruments = revolvingCreditInstruments != null ? com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditInstrumentMapperKt.ppcukToCreditInstruments(revolvingCreditInstruments) : null;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditCustomerProfile> revolvingCreditCustomerProfiles = data.getRevolvingCreditCustomerProfiles();
        if (revolvingCreditCustomerProfiles != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditCustomerProfile> list2 = revolvingCreditCustomerProfiles;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditCustomerProfile) it2.next()).getRevolvingCreditCustomerProfileFragment());
            }
            customerProfilesOverview = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CustomerProfileMapperKt.toCustomerProfilesOverview(arrayList4);
        } else {
            customerProfilesOverview = null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditHistoricalPromotionalActivities revolvingCreditHistoricalPromotionalActivities = data.getRevolvingCreditHistoricalPromotionalActivities();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesUKFragment revolvingCreditHistoricalPromotionalActivitiesUKFragment = revolvingCreditHistoricalPromotionalActivities != null ? revolvingCreditHistoricalPromotionalActivities.getRevolvingCreditHistoricalPromotionalActivitiesUKFragment() : null;
        java.util.List mapToInferredError = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountSummaryMapperKt.mapToInferredError((revolvingCreditHistoricalPromotionalActivitiesUKFragment == null || (page = revolvingCreditHistoricalPromotionalActivitiesUKFragment.getPage()) == null) ? null : page.getItems(), partialErrorHandler != null && partialErrorHandler.contains(com.paypal.oslo.feature.revolvingcreditservicing.data.network.fields.AccountSummaryFields.PROMOS), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.PPCUKAccountSummaryMapperKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.PPCUKAccountSummaryMapperKt.m18025$r8$lambda$BSxDI7dbSRA2CGXP72kjcceNL8((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesUKFragment.Item) obj3);
            }
        });
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent> revolvingCreditServicingPrioritizedAccountActionComponents = data.getRevolvingCreditServicingPrioritizedAccountActionComponents();
        if (revolvingCreditServicingPrioritizedAccountActionComponents != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator<T> it3 = revolvingCreditServicingPrioritizedAccountActionComponents.iterator();
            while (it3.hasNext()) {
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction domain = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.PrioritizedAccountActionMapperKt.toDomain(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent) it3.next()).getRevolvingCreditServicingPrioritizedAccountActionFragment());
                if (domain != null) {
                    arrayList5.add(domain);
                }
            }
            arrayList2 = arrayList5;
        } else {
            arrayList2 = null;
        }
        mapToAccountSummaryOverview = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountSummaryMapperKt.mapToAccountSummaryOverview(obj, accountOverview, financialActivityPage$default, autopayOverview, repaymentActivities, contentURLs, null, customerServiceContact, null, productConfigurations, ppcukToCreditInstruments, customerProfilesOverview, null, null, (r41 & 16384) != 0 ? null : null, mapToInferredError, null, arrayList2, com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountSummaryMapperKt.mapToInferredError(data.getRevolvingCreditServicingUnenrolledAccountFeatureComponents(), partialErrorHandler != null && partialErrorHandler.contains(com.paypal.oslo.feature.revolvingcreditservicing.data.network.fields.AccountSummaryFields.UNENROLLED_ACCOUNT_FEATURES), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.PPCUKAccountSummaryMapperKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.PPCUKAccountSummaryMapperKt.m18026$r8$lambda$ZS6e7FEtRDJKgGRFNNA4oCRfbs((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent) obj3);
            }
        }), null);
        return mapToAccountSummaryOverview;
    }

    /* renamed from: $r8$lambda$BSx-DI7dbSRA2CGXP72kjcceNL8, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity m18025$r8$lambda$BSxDI7dbSRA2CGXP72kjcceNL8(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesUKFragment.Item item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.specialfinancing.PromotionalActivityMapperKt.toDomain(item);
    }

    /* renamed from: $r8$lambda$ZS6-e7FEtRDJKgGRFNNA4oCRfbs, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot m18026$r8$lambda$ZS6e7FEtRDJKgGRFNNA4oCRfbs(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent revolvingCreditServicingUnenrolledAccountFeatureComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingUnenrolledAccountFeatureComponent, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.UnenrolledAccountFeatureComponentMapperKt.mapToUnenrolledAccountFeaturesSnapshot(revolvingCreditServicingUnenrolledAccountFeatureComponent.getRevolvingCreditServicingUnenrolledAccountFeatureComponentFragment());
    }
}
