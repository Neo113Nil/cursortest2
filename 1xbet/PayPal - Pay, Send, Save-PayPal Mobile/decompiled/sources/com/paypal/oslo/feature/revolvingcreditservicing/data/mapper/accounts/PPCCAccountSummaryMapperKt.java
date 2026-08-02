package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Data;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PPCCAccountSummaryMapperKt {
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView toDomain$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Data data, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            partialErrorHandler = null;
        }
        return toDomain(data, partialErrorHandler);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0290, code lost:
    
        if (r27.contains(com.paypal.oslo.feature.revolvingcreditservicing.data.network.fields.AccountSummaryFields.UNENROLLED_ACCOUNT_FEATURES) == true) goto L179;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Data data, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview customerProfilesOverview;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditNotificationPreference revolvingCreditNotificationPreference;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment revolvingCreditNotificationPreferencesFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferences notificationPreferences;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment revolvingCreditBillingFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.Billing billing;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.CreditLines creditLines;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.CreditLine creditLine;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        java.lang.Object currencyCode;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment revolvingCreditBillingFragment2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.Billing billing2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.CreditLines creditLines2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.CreditLine creditLine2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment3;
        java.lang.Object creditAccountId;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView mapToAccountSummaryOverview;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Page page;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment4;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment.Product product;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment revolvingCreditServicingProductFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities capabilities;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment revolvingCreditServicingContentFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment revolvingCreditServicingContentFragment2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService customerService;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment revolvingCreditServicingContentFragment3;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card card;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.ActivationPhoneNumber activationPhoneNumber;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment revolvingCreditPhoneFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment revolvingCreditAutopayFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment5;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment6;
        java.lang.Object creditAccountId2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount = data.getRevolvingCreditAccount();
        java.lang.String obj = (revolvingCreditAccount == null || (revolvingCreditAccountFragment6 = revolvingCreditAccount.getRevolvingCreditAccountFragment()) == null || (creditAccountId2 = revolvingCreditAccountFragment6.getCreditAccountId()) == null) ? null : creditAccountId2.toString();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount2 = data.getRevolvingCreditAccount();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview$default = (revolvingCreditAccount2 == null || (revolvingCreditAccountFragment5 = revolvingCreditAccount2.getRevolvingCreditAccountFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountOverviewMapperKt.toAccountOverview$default(revolvingCreditAccountFragment5, null, 1, null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditActivities revolvingCreditActivities = data.getRevolvingCreditActivities();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage financialActivityPage$default = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.activity.FinancialActivityPageMapperKt.toFinancialActivityPage$default(revolvingCreditActivities != null ? revolvingCreditActivities.getRevolvingCreditActivitiesFragment() : null, partialErrorHandler != null && partialErrorHandler.contains("revolvingCreditActivities"), (java.lang.Integer) null, 2, (java.lang.Object) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay = data.getRevolvingCreditAutopay();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview = (revolvingCreditAutopay == null || (revolvingCreditAutopayFragment = revolvingCreditAutopay.getRevolvingCreditAutopayFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.AutopayOverviewMapperKt.toAutopayOverview(revolvingCreditAutopayFragment);
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPayment> revolvingCreditPayments = data.getRevolvingCreditPayments();
        if (revolvingCreditPayments != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPayment> list = revolvingCreditPayments;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPayment) it.next()).getRevolvingCreditPaymentsFragment());
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> repaymentActivities = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountSummaryMapperKt.toRepaymentActivities(arrayList, partialErrorHandler);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = data.getRevolvingCreditServicingContent();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls contentURLs = revolvingCreditServicingContent != null ? com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.ContentUrlMapperKt.toContentURLs(revolvingCreditServicingContent) : null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent2 = data.getRevolvingCreditServicingContent();
        java.lang.String nationalNumber = (revolvingCreditServicingContent2 == null || (revolvingCreditServicingContentFragment3 = revolvingCreditServicingContent2.getRevolvingCreditServicingContentFragment()) == null || (card = revolvingCreditServicingContentFragment3.getCard()) == null || (activationPhoneNumber = card.getActivationPhoneNumber()) == null || (revolvingCreditPhoneFragment = activationPhoneNumber.getRevolvingCreditPhoneFragment()) == null) ? null : revolvingCreditPhoneFragment.getNationalNumber();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent3 = data.getRevolvingCreditServicingContent();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact = (revolvingCreditServicingContent3 == null || (revolvingCreditServicingContentFragment2 = revolvingCreditServicingContent3.getRevolvingCreditServicingContentFragment()) == null || (customerService = revolvingCreditServicingContentFragment2.getCustomerService()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CustomerServiceContactMapperKt.toCustomerServiceContact(customerService);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent4 = data.getRevolvingCreditServicingContent();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.LostStolenPageSummary lostStolenPageSummary = (revolvingCreditServicingContent4 == null || (revolvingCreditServicingContentFragment = revolvingCreditServicingContent4.getRevolvingCreditServicingContentFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.LostStolenMapperKt.toLostStolenPageSummary(revolvingCreditServicingContentFragment);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount3 = data.getRevolvingCreditAccount();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations = (revolvingCreditAccount3 == null || (revolvingCreditAccountFragment4 = revolvingCreditAccount3.getRevolvingCreditAccountFragment()) == null || (product = revolvingCreditAccountFragment4.getProduct()) == null || (revolvingCreditServicingProductFragment = product.getRevolvingCreditServicingProductFragment()) == null || (capabilities = revolvingCreditServicingProductFragment.getCapabilities()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.ProductConfigurationsMapperKt.toProductConfigurations(capabilities, revolvingCreditServicingProductFragment.getValuePropositions());
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument> revolvingCreditInstruments = data.getRevolvingCreditInstruments();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument> ppccToCreditInstruments = revolvingCreditInstruments != null ? com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditInstrumentMapperKt.ppccToCreditInstruments(revolvingCreditInstruments) : null;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditCustomerProfile> revolvingCreditCustomerProfiles = data.getRevolvingCreditCustomerProfiles();
        if (revolvingCreditCustomerProfiles != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditCustomerProfile> list2 = revolvingCreditCustomerProfiles;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditCustomerProfile) it2.next()).getRevolvingCreditCustomerProfileFragment());
            }
            customerProfilesOverview = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CustomerProfileMapperKt.toCustomerProfilesOverview(arrayList4);
        } else {
            customerProfilesOverview = null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPushProvisioning revolvingCreditPushProvisioning = data.getRevolvingCreditPushProvisioning();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview = revolvingCreditPushProvisioning != null ? com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.WalletMapperKt.toStarPayWalletOverview(revolvingCreditPushProvisioning) : null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditHistoricalPromotionalActivities revolvingCreditHistoricalPromotionalActivities = data.getRevolvingCreditHistoricalPromotionalActivities();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment revolvingCreditHistoricalPromotionalActivitiesFragment = revolvingCreditHistoricalPromotionalActivities != null ? revolvingCreditHistoricalPromotionalActivities.getRevolvingCreditHistoricalPromotionalActivitiesFragment() : null;
        java.util.List mapToInferredError = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountSummaryMapperKt.mapToInferredError((revolvingCreditHistoricalPromotionalActivitiesFragment == null || (page = revolvingCreditHistoricalPromotionalActivitiesFragment.getPage()) == null) ? null : page.getItems(), partialErrorHandler != null && partialErrorHandler.contains(com.paypal.oslo.feature.revolvingcreditservicing.data.network.fields.AccountSummaryFields.PROMOS), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.PPCCAccountSummaryMapperKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.PPCCAccountSummaryMapperKt.m18024$r8$lambda$ND_purrwTIkaKLYc5B0to6avu4((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Item) obj2);
            }
        });
        if ((partialErrorHandler != null && partialErrorHandler.contains(com.paypal.oslo.feature.revolvingcreditservicing.data.network.fields.AccountSummaryFields.NOTIFICATION_PREFERENCE)) || (revolvingCreditNotificationPreference = data.getRevolvingCreditNotificationPreference()) == null || (revolvingCreditNotificationPreferencesFragment = revolvingCreditNotificationPreference.getRevolvingCreditNotificationPreferencesFragment()) == null) {
            notificationPreferences = null;
        } else {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount4 = data.getRevolvingCreditAccount();
            java.lang.String obj2 = (revolvingCreditAccount4 == null || (revolvingCreditAccountFragment3 = revolvingCreditAccount4.getRevolvingCreditAccountFragment()) == null || (creditAccountId = revolvingCreditAccountFragment3.getCreditAccountId()) == null) ? null : creditAccountId.toString();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount5 = data.getRevolvingCreditAccount();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = (revolvingCreditAccount5 == null || (revolvingCreditAccountFragment2 = revolvingCreditAccount5.getRevolvingCreditAccountFragment()) == null || (revolvingCreditBillingFragment2 = revolvingCreditAccountFragment2.getRevolvingCreditBillingFragment()) == null || (billing2 = revolvingCreditBillingFragment2.getBilling()) == null || (creditLines2 = billing2.getCreditLines()) == null || (creditLine2 = creditLines2.getCreditLine()) == null || (revolvingCreditMoneyFragment2 = creditLine2.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment2);
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount6 = data.getRevolvingCreditAccount();
            notificationPreferences = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.notifications.NotificationPreferencesMapperKt.toNotificationPreferences(revolvingCreditNotificationPreferencesFragment, obj2, currencyAmount, (revolvingCreditAccount6 == null || (revolvingCreditAccountFragment = revolvingCreditAccount6.getRevolvingCreditAccountFragment()) == null || (revolvingCreditBillingFragment = revolvingCreditAccountFragment.getRevolvingCreditBillingFragment()) == null || (billing = revolvingCreditBillingFragment.getBilling()) == null || (creditLines = billing.getCreditLines()) == null || (creditLine = creditLines.getCreditLine()) == null || (revolvingCreditMoneyFragment = creditLine.getRevolvingCreditMoneyFragment()) == null || (currencyCode = revolvingCreditMoneyFragment.getCurrencyCode()) == null) ? null : currencyCode.toString());
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent> revolvingCreditServicingPrioritizedAccountActionComponents = data.getRevolvingCreditServicingPrioritizedAccountActionComponents();
        if (revolvingCreditServicingPrioritizedAccountActionComponents != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator<T> it3 = revolvingCreditServicingPrioritizedAccountActionComponents.iterator();
            while (it3.hasNext()) {
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction domain = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.PrioritizedAccountActionMapperKt.toDomain(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent) it3.next()).getRevolvingCreditServicingPrioritizedAccountActionFragment());
                if (domain != null) {
                    arrayList5.add(domain);
                }
            }
            arrayList2 = arrayList5;
        } else {
            arrayList2 = null;
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent> revolvingCreditServicingUnenrolledAccountFeatureComponents = data.getRevolvingCreditServicingUnenrolledAccountFeatureComponents();
        boolean z = partialErrorHandler != null;
        mapToAccountSummaryOverview = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountSummaryMapperKt.mapToAccountSummaryOverview(obj, accountOverview$default, financialActivityPage$default, autopayOverview, repaymentActivities, contentURLs, nationalNumber, customerServiceContact, lostStolenPageSummary, productConfigurations, ppccToCreditInstruments, customerProfilesOverview, null, null, (r41 & 16384) != 0 ? null : null, mapToInferredError, notificationPreferences, arrayList2, com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountSummaryMapperKt.mapToInferredError(revolvingCreditServicingUnenrolledAccountFeatureComponents, z, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.PPCCAccountSummaryMapperKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.PPCCAccountSummaryMapperKt.$r8$lambda$DGj_hv7rlj6HFiqoINcGyfOZ7eI((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent) obj3);
            }
        }), starPayWalletOverview);
        return mapToAccountSummaryOverview;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot $r8$lambda$DGj_hv7rlj6HFiqoINcGyfOZ7eI(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent revolvingCreditServicingUnenrolledAccountFeatureComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingUnenrolledAccountFeatureComponent, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.UnenrolledAccountFeatureComponentMapperKt.mapToUnenrolledAccountFeaturesSnapshot(revolvingCreditServicingUnenrolledAccountFeatureComponent.getRevolvingCreditServicingUnenrolledAccountFeatureComponentFragment());
    }

    /* renamed from: $r8$lambda$ND_purrwTIkaKLYc5B0t-o6avu4, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity m18024$r8$lambda$ND_purrwTIkaKLYc5B0to6avu4(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Item item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.specialfinancing.PromotionalActivityMapperKt.toDomain(item);
    }
}
