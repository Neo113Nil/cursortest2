package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetCBMCServicingOverviewQuery$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "", "webBaseUrl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetCBMCServicingOverviewQuery$Data;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CBMCAccountSummaryMapperKt {
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView toDomain$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.Data data, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            partialErrorHandler = null;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        return toDomain(data, partialErrorHandler, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0317, code lost:
    
        if (r30.contains(com.paypal.oslo.feature.revolvingcreditservicing.data.network.fields.AccountSummaryFields.UNENROLLED_ACCOUNT_FEATURES) != true) goto L214;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.Data data, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler, java.lang.String str) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview customerProfilesOverview;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditNotificationPreference revolvingCreditNotificationPreference;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment revolvingCreditNotificationPreferencesFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls2;
        java.lang.String str2;
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
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.Rewards rewards;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditProductFeatureOffer revolvingCreditProductFeatureOffer;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.OnRevolvingCreditProductFeatureRedeemPointsOffer onRevolvingCreditProductFeatureRedeemPointsOffer;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment4;
        java.lang.Object creditAccountId2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment5;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment.Product product;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment revolvingCreditServicingProductFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment6;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment.Product product2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment revolvingCreditServicingProductFragment2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities capabilities;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment revolvingCreditServicingContentFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment revolvingCreditServicingContentFragment2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService customerService;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment revolvingCreditServicingContentFragment3;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card card;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.ActivationPhoneNumber activationPhoneNumber;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment revolvingCreditPhoneFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment revolvingCreditAutopayFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment7;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment8;
        java.lang.Object creditAccountId3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount = data.getRevolvingCreditAccount();
        java.lang.String obj = (revolvingCreditAccount == null || (revolvingCreditAccountFragment8 = revolvingCreditAccount.getRevolvingCreditAccountFragment()) == null || (creditAccountId3 = revolvingCreditAccountFragment8.getCreditAccountId()) == null) ? null : creditAccountId3.toString();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount2 = data.getRevolvingCreditAccount();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview$default = (revolvingCreditAccount2 == null || (revolvingCreditAccountFragment7 = revolvingCreditAccount2.getRevolvingCreditAccountFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountOverviewMapperKt.toAccountOverview$default(revolvingCreditAccountFragment7, null, 1, null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditActivities revolvingCreditActivities = data.getRevolvingCreditActivities();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage financialActivityPage$default = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.activity.FinancialActivityPageMapperKt.toFinancialActivityPage$default(revolvingCreditActivities != null ? revolvingCreditActivities.getRevolvingCreditActivitiesFragment() : null, partialErrorHandler != null && partialErrorHandler.contains("revolvingCreditActivities"), (java.lang.Integer) null, 2, (java.lang.Object) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay = data.getRevolvingCreditAutopay();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview = (revolvingCreditAutopay == null || (revolvingCreditAutopayFragment = revolvingCreditAutopay.getRevolvingCreditAutopayFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.AutopayOverviewMapperKt.toAutopayOverview(revolvingCreditAutopayFragment);
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditPayment> revolvingCreditPayments = data.getRevolvingCreditPayments();
        if (revolvingCreditPayments != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditPayment> list = revolvingCreditPayments;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditPayment) it.next()).getRevolvingCreditPaymentsFragment());
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> repaymentActivities = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountSummaryMapperKt.toRepaymentActivities(arrayList, partialErrorHandler);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = data.getRevolvingCreditServicingContent();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls contentURLs = revolvingCreditServicingContent != null ? com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.ContentUrlMapperKt.toContentURLs(revolvingCreditServicingContent, str) : null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent2 = data.getRevolvingCreditServicingContent();
        java.lang.String nationalNumber = (revolvingCreditServicingContent2 == null || (revolvingCreditServicingContentFragment3 = revolvingCreditServicingContent2.getRevolvingCreditServicingContentFragment()) == null || (card = revolvingCreditServicingContentFragment3.getCard()) == null || (activationPhoneNumber = card.getActivationPhoneNumber()) == null || (revolvingCreditPhoneFragment = activationPhoneNumber.getRevolvingCreditPhoneFragment()) == null) ? null : revolvingCreditPhoneFragment.getNationalNumber();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent3 = data.getRevolvingCreditServicingContent();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact = (revolvingCreditServicingContent3 == null || (revolvingCreditServicingContentFragment2 = revolvingCreditServicingContent3.getRevolvingCreditServicingContentFragment()) == null || (customerService = revolvingCreditServicingContentFragment2.getCustomerService()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CustomerServiceContactMapperKt.toCustomerServiceContact(customerService);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent4 = data.getRevolvingCreditServicingContent();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.LostStolenPageSummary lostStolenPageSummary = (revolvingCreditServicingContent4 == null || (revolvingCreditServicingContentFragment = revolvingCreditServicingContent4.getRevolvingCreditServicingContentFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.LostStolenMapperKt.toLostStolenPageSummary(revolvingCreditServicingContentFragment);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount3 = data.getRevolvingCreditAccount();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations = (revolvingCreditAccount3 == null || (revolvingCreditAccountFragment6 = revolvingCreditAccount3.getRevolvingCreditAccountFragment()) == null || (product2 = revolvingCreditAccountFragment6.getProduct()) == null || (revolvingCreditServicingProductFragment2 = product2.getRevolvingCreditServicingProductFragment()) == null || (capabilities = revolvingCreditServicingProductFragment2.getCapabilities()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.ProductConfigurationsMapperKt.toProductConfigurations(capabilities, revolvingCreditServicingProductFragment2.getValuePropositions());
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditInstrument> revolvingCreditInstruments = data.getRevolvingCreditInstruments();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument> cbmcToCreditInstruments = revolvingCreditInstruments != null ? com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditInstrumentMapperKt.cbmcToCreditInstruments(revolvingCreditInstruments) : null;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditCustomerProfile> revolvingCreditCustomerProfiles = data.getRevolvingCreditCustomerProfiles();
        if (revolvingCreditCustomerProfiles != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditCustomerProfile> list2 = revolvingCreditCustomerProfiles;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditCustomerProfile) it2.next()).getRevolvingCreditCustomerProfileFragment());
            }
            customerProfilesOverview = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CustomerProfileMapperKt.toCustomerProfilesOverview(arrayList4);
        } else {
            customerProfilesOverview = null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditRewardsSummary revolvingCreditRewardsSummary = data.getRevolvingCreditRewardsSummary();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.OnRevolvingCreditCashbackRewardsSummary onRevolvingCreditCashbackRewardsSummary = revolvingCreditRewardsSummary != null ? revolvingCreditRewardsSummary.getOnRevolvingCreditCashbackRewardsSummary() : null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount4 = data.getRevolvingCreditAccount();
        java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition> valuePropositions = (revolvingCreditAccount4 == null || (revolvingCreditAccountFragment5 = revolvingCreditAccount4.getRevolvingCreditAccountFragment()) == null || (product = revolvingCreditAccountFragment5.getProduct()) == null || (revolvingCreditServicingProductFragment = product.getRevolvingCreditServicingProductFragment()) == null) ? null : revolvingCreditServicingProductFragment.getValuePropositions();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount5 = data.getRevolvingCreditAccount();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardSummary = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.RewardsSummaryMapperKt.toRewardSummary(onRevolvingCreditCashbackRewardsSummary, valuePropositions, (revolvingCreditAccount5 == null || (revolvingCreditAccountFragment4 = revolvingCreditAccount5.getRevolvingCreditAccountFragment()) == null || (creditAccountId2 = revolvingCreditAccountFragment4.getCreditAccountId()) == null) ? null : creditAccountId2.toString(), partialErrorHandler);
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditProductFeatureOffer> revolvingCreditProductFeatureOffers = data.getRevolvingCreditProductFeatureOffers();
        if (revolvingCreditProductFeatureOffers == null || (revolvingCreditProductFeatureOffer = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditProductFeatureOffer) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) revolvingCreditProductFeatureOffers)) == null || (onRevolvingCreditProductFeatureRedeemPointsOffer = revolvingCreditProductFeatureOffer.getOnRevolvingCreditProductFeatureRedeemPointsOffer()) == null) {
            productFeatureOffers = null;
        } else {
            boolean z = onRevolvingCreditProductFeatureRedeemPointsOffer.getStatus() == com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRedeemPointsEligibilityStatus.ELIGIBLE;
            java.lang.Boolean loyaltyProgramEnrolled = onRevolvingCreditProductFeatureRedeemPointsOffer.getLoyaltyProgramEnrolled();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RewardsCalculation rewardsCalculation = onRevolvingCreditProductFeatureRedeemPointsOffer.getRewardsCalculation();
            productFeatureOffers = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers(z, loyaltyProgramEnrolled, rewardsCalculation != null ? com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.RewardsSummaryMapperKt.toRewardsCalculation(rewardsCalculation) : null, (java.lang.String) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent5 = data.getRevolvingCreditServicingContent();
        if (revolvingCreditServicingContent5 == null || (rewards = revolvingCreditServicingContent5.getRewards()) == null) {
            rewardsContentUrls = null;
        } else {
            java.lang.Object rewardsProgramTermsAndConditionsUrl = rewards.getRewardsProgramTermsAndConditionsUrl();
            java.lang.String obj2 = rewardsProgramTermsAndConditionsUrl != null ? rewardsProgramTermsAndConditionsUrl.toString() : null;
            java.lang.Object loyaltyProgramLearnMoreUrl = rewards.getLoyaltyProgramLearnMoreUrl();
            java.lang.String obj3 = loyaltyProgramLearnMoreUrl != null ? loyaltyProgramLearnMoreUrl.toString() : null;
            java.lang.Object loyaltyProgramTermsAndConditionsUrl = rewards.getLoyaltyProgramTermsAndConditionsUrl();
            rewardsContentUrls = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls(obj2, obj3, loyaltyProgramTermsAndConditionsUrl != null ? loyaltyProgramTermsAndConditionsUrl.toString() : null);
        }
        if ((partialErrorHandler != null && partialErrorHandler.contains(com.paypal.oslo.feature.revolvingcreditservicing.data.network.fields.AccountSummaryFields.NOTIFICATION_PREFERENCE)) || (revolvingCreditNotificationPreference = data.getRevolvingCreditNotificationPreference()) == null || (revolvingCreditNotificationPreferencesFragment = revolvingCreditNotificationPreference.getRevolvingCreditNotificationPreferencesFragment()) == null) {
            rewardsContentUrls2 = rewardsContentUrls;
            notificationPreferences = null;
        } else {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount6 = data.getRevolvingCreditAccount();
            java.lang.String obj4 = (revolvingCreditAccount6 == null || (revolvingCreditAccountFragment3 = revolvingCreditAccount6.getRevolvingCreditAccountFragment()) == null || (creditAccountId = revolvingCreditAccountFragment3.getCreditAccountId()) == null) ? null : creditAccountId.toString();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount7 = data.getRevolvingCreditAccount();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = (revolvingCreditAccount7 == null || (revolvingCreditAccountFragment2 = revolvingCreditAccount7.getRevolvingCreditAccountFragment()) == null || (revolvingCreditBillingFragment2 = revolvingCreditAccountFragment2.getRevolvingCreditBillingFragment()) == null || (billing2 = revolvingCreditBillingFragment2.getBilling()) == null || (creditLines2 = billing2.getCreditLines()) == null || (creditLine2 = creditLines2.getCreditLine()) == null || (revolvingCreditMoneyFragment2 = creditLine2.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment2);
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount8 = data.getRevolvingCreditAccount();
            if (revolvingCreditAccount8 == null || (revolvingCreditAccountFragment = revolvingCreditAccount8.getRevolvingCreditAccountFragment()) == null || (revolvingCreditBillingFragment = revolvingCreditAccountFragment.getRevolvingCreditBillingFragment()) == null || (billing = revolvingCreditBillingFragment.getBilling()) == null || (creditLines = billing.getCreditLines()) == null || (creditLine = creditLines.getCreditLine()) == null || (revolvingCreditMoneyFragment = creditLine.getRevolvingCreditMoneyFragment()) == null || (currencyCode = revolvingCreditMoneyFragment.getCurrencyCode()) == null) {
                rewardsContentUrls2 = rewardsContentUrls;
                str2 = null;
            } else {
                rewardsContentUrls2 = rewardsContentUrls;
                str2 = currencyCode.toString();
            }
            notificationPreferences = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.notifications.NotificationPreferencesMapperKt.toNotificationPreferences(revolvingCreditNotificationPreferencesFragment, obj4, currencyAmount, str2);
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent> revolvingCreditServicingPrioritizedAccountActionComponents = data.getRevolvingCreditServicingPrioritizedAccountActionComponents();
        if (revolvingCreditServicingPrioritizedAccountActionComponents != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator<T> it3 = revolvingCreditServicingPrioritizedAccountActionComponents.iterator();
            while (it3.hasNext()) {
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction domain = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.PrioritizedAccountActionMapperKt.toDomain(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent) it3.next()).getRevolvingCreditServicingPrioritizedAccountActionFragment());
                if (domain != null) {
                    arrayList5.add(domain);
                }
            }
            arrayList2 = arrayList5;
        } else {
            arrayList2 = null;
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent> revolvingCreditServicingUnenrolledAccountFeatureComponents = data.getRevolvingCreditServicingUnenrolledAccountFeatureComponents();
        boolean z2 = partialErrorHandler != null;
        java.util.List mapToInferredError = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountSummaryMapperKt.mapToInferredError(revolvingCreditServicingUnenrolledAccountFeatureComponents, z2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.CBMCAccountSummaryMapperKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj5) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.CBMCAccountSummaryMapperKt.$r8$lambda$Xi2EjGyhn90FF1IsLdzk_2vkIeU((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent) obj5);
            }
        });
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditPushProvisioning revolvingCreditPushProvisioning = data.getRevolvingCreditPushProvisioning();
        return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountSummaryMapperKt.mapToAccountSummaryOverview(obj, accountOverview$default, financialActivityPage$default, autopayOverview, repaymentActivities, contentURLs, nationalNumber, customerServiceContact, lostStolenPageSummary, productConfigurations, cbmcToCreditInstruments, customerProfilesOverview, rewardSummary, productFeatureOffers, rewardsContentUrls2, null, notificationPreferences, arrayList2, mapToInferredError, revolvingCreditPushProvisioning != null ? com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.WalletMapperKt.toStarPayWalletOverview(revolvingCreditPushProvisioning) : null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot $r8$lambda$Xi2EjGyhn90FF1IsLdzk_2vkIeU(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent revolvingCreditServicingUnenrolledAccountFeatureComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingUnenrolledAccountFeatureComponent, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.UnenrolledAccountFeatureComponentMapperKt.mapToUnenrolledAccountFeaturesSnapshot(revolvingCreditServicingUnenrolledAccountFeatureComponent.getRevolvingCreditServicingUnenrolledAccountFeatureComponentFragment());
    }
}
