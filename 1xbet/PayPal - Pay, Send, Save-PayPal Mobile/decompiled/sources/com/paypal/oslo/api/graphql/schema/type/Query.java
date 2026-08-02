package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/Query;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Query {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.Query.Companion INSTANCE = new com.paypal.oslo.api.graphql.schema.type.Query.Companion(null);
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __closeAccountEligibility_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __activities_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __activitySearchSuggestions_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __activityDetails_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addressVerification_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addressSuggestions_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __agenticGreetings_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __agenticStarters_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __agenticSession_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __agenticMessage_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __agenticMessages_sessionId = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("sessionId").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __agenticCommerceItemVariants_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __balanceAutoReload_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __balanceBundleEligibility_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cardConnectEligibility_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __debitInstruments_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __debitInstrumentApplications_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __debitInstrumentProduct_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __debitInstrumentCardCredential_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __debitInstrumentEligibility_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __debitInstrumentAddresses_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __financialInstrumentPreference_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __debitInstrumentTokenEligibilities_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __debitInstrumentPin_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __virtualBankAccountEligibility_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __virtualBankAccounts_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __smartRoutePreferences_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cashInRetailers_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cashInActivation_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cashInStores_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __pushNotificationPreferences_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __notifications_eligibleForPushNotificationsOptIn = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("eligibleForPushNotificationsOptIn").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __paymentTransferAttempt_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __paymentDestinations_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __paymentRequest_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __paymentTransfer_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __paymentTransferFxQuote_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __onboardingFlowSteps_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __placeSuggestions_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __place_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __publicCredentialMetadata_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __publicCredentialMetadataByToken_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bnplAutopaySetupOverview_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bnplServicingPlanOverview_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bnplPlansOverview_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bnplMakePaymentOverview_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bnplPlans_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bnplPlan_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bnplCreditFacilities_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bnplAddressSuggestions_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bnplLoanConstraints_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bnplPrequalificationSummary_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bnplProvisionedCardOverview_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bnplApplicationEligibility_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bnplApplicationPaymentFundingInstruments_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bnplVirtualCardOverview_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditAccount_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditPushProvisioning_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditProductFeatureEligibility_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditProductFeatureOffers_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditActivities_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditAutopay_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditRewardsSummary_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditInstruments_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditPaymentConstraints_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditServicingContent_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditStatementSummaries_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditStatement_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditSupportedPaymentFundingInstrumentTypes_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditEligiblePaymentFundingInstruments_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditPayments_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditCustomerProfiles_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditServicingUnenrolledAccountFeatureComponents_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditNotificationPreference_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditNotificationPreferences_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditServicingPrioritizedAccountActionComponents_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditHistoricalPromotionalActivities_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditAssociatedFinancialInstruments_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditPaymentSecurityEnrollment_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditLineIncreaseOffer_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditInstrumentPin_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditLineIncreaseOfferPreference_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __revolvingCreditAcquisitionApplication_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cryptocurrencyAddressBook_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cryptocurrencyRecurringSubscription_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cryptocurrencyRecurringSubscriptions_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cryptocurrencyHoldings_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cryptocurrencyMarketPrices_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cryptocurrencyPreferences_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __eligibleCryptocurrencyBlockchainNetworks_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cryptocurrencyConfigurations_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __connectedAppsAndSitesConsentHistories_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __connectedAppsAndSitesConsumerDataRightsConsentHistories_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deviceWalletEligibility_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __homeFeed_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __charities_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __mosaicPage_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __mosaicPageAddressValidation_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __mosaicPageEligibility_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __identityLinks_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __stepUpIdentityChallenges_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __authenticationAlert_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __linkedAuthenticationProfiles_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __authenticationCredentialChallenge_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __invoice_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __invoiceConditionalRules_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __merchantItems_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __merchantTaxes_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __moneybox_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __moneyboxes_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __balanceHoldPolicies_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __moneyManagementNextBestActions_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __shipmentPackage_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __packageEmailLinks_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __orderDetails_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __authorizePackageTrackingURL_emailProvider = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("emailProvider").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __packageTrackingUserPreferences_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __activityShipmentPackages_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __fulfillmentSlaPolicy_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __moneyPool_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __moneyPools_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __moneyPoolMediaFiles_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __subjectAccessRequests_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __promotionOffers_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __redeemablePointBalance_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __loyaltyMemberships_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __payoutStore_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __transactionRewardSummary_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __rewardedOffers_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __publicProfile_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __contacts_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __contactSearch_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __contact_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __contactById_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __recentSearches_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __qrCodeSession_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __consumerPresentedQrCodeEligibility_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __paypalWorldCheckoutOptions_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __savingsAccounts_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __savingsAccountFeatures_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __savingsAccountEligibility_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __articleContent_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __recommendedArticles_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __alerts_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __searchArticles_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __ipsArticles_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __helpArticle_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __recommendedHelpArticles_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __helpAlerts_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __searchHelpArticles_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __inProductSupportHelpArticles_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __helpTopics_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __helpTopic_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __helpContactTopics_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __helpContactTopic_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __shoppingCollection_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __products_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __stores_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __consumerAgreements_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __consumerAgreement_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __consumerAgreementFundingInstruments_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __consumerAgreementsByFundingInstrument_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __consumerAgreementIncentives_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __taxReports_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __walletComponents_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __balance_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bankAccount_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bankAccounts_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __openBankingAggregator_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __openBankingInstitutions_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __externalBankAccounts_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __openBankingCapability_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bank_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cards_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __card_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __autodetectCards_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cardDefinitions_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cardReward_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __transferCapabilitiesEvaluation_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __transfersMetadata_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __depositOptions_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __depositOptionEvaluation_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deposit_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __withdrawalOption_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __paymentToken_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __paymentTokens_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __paymentTokenRealTimeBalance_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __provisionableInstitutions_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __thirdPartyLoyaltyCard_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __thirdPartyLoyaltyCards_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __thirdPartyLoyaltyProgram_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __thirdPartyLoyaltyPrograms_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition ____type_name = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("name").build();
    private static final com.apollographql.apollo.api.ObjectType type = new com.apollographql.apollo.api.ObjectType.Builder("Query").build();

    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b\u0084\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u001a\u0010/\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u001a\u00101\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u001a\u00105\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u001a\u00107\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u001a\u0010;\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u001a\u0010=\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u001a\u0010A\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u001a\u0010C\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u001a\u0010E\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u001a\u0010G\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u001a\u0010I\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u001a\u0010K\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u001a\u0010M\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\bR\u001a\u0010O\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR\u001a\u0010Q\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\bR\u001a\u0010S\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\bR\u001a\u0010U\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u001a\u0010W\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\bR\u001a\u0010Y\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bZ\u0010\bR\u001a\u0010[\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\bR\u001a\u0010]\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b^\u0010\bR\u001a\u0010_\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\b`\u0010\bR\u001a\u0010a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bb\u0010\bR\u001a\u0010c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\bd\u0010\bR\u001a\u0010e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\bf\u0010\bR\u001a\u0010g\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR\u001a\u0010i\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010\u0006\u001a\u0004\bj\u0010\bR\u001a\u0010k\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010\u0006\u001a\u0004\bl\u0010\bR\u001a\u0010m\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\bn\u0010\bR\u001a\u0010o\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\bp\u0010\bR\u001a\u0010q\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010\u0006\u001a\u0004\br\u0010\bR\u001a\u0010s\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010\u0006\u001a\u0004\bt\u0010\bR\u001a\u0010u\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bu\u0010\u0006\u001a\u0004\bv\u0010\bR\u001a\u0010w\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bw\u0010\u0006\u001a\u0004\bx\u0010\bR\u001a\u0010y\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\by\u0010\u0006\u001a\u0004\bz\u0010\bR\u001a\u0010{\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010\u0006\u001a\u0004\b|\u0010\bR\u001a\u0010}\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b}\u0010\u0006\u001a\u0004\b~\u0010\bR\u001b\u0010\u007f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u007f\u0010\u0006\u001a\u0005\b\u0080\u0001\u0010\bR\u001d\u0010\u0081\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0006\u001a\u0005\b\u0082\u0001\u0010\bR\u001d\u0010\u0083\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0006\u001a\u0005\b\u0084\u0001\u0010\bR\u001d\u0010\u0085\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0006\u001a\u0005\b\u0086\u0001\u0010\bR\u001d\u0010\u0087\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0006\u001a\u0005\b\u0088\u0001\u0010\bR\u001d\u0010\u0089\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0006\u001a\u0005\b\u008a\u0001\u0010\bR\u001d\u0010\u008b\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0006\u001a\u0005\b\u008c\u0001\u0010\bR\u001d\u0010\u008d\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0006\u001a\u0005\b\u008e\u0001\u0010\bR\u001d\u0010\u008f\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0006\u001a\u0005\b\u0090\u0001\u0010\bR\u001d\u0010\u0091\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0006\u001a\u0005\b\u0092\u0001\u0010\bR\u001d\u0010\u0093\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u0006\u001a\u0005\b\u0094\u0001\u0010\bR\u001d\u0010\u0095\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0006\u001a\u0005\b\u0096\u0001\u0010\bR\u001d\u0010\u0097\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0006\u001a\u0005\b\u0098\u0001\u0010\bR\u001d\u0010\u0099\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0006\u001a\u0005\b\u009a\u0001\u0010\bR\u001d\u0010\u009b\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0006\u001a\u0005\b\u009c\u0001\u0010\bR\u001d\u0010\u009d\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0006\u001a\u0005\b\u009e\u0001\u0010\bR\u001d\u0010\u009f\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0006\u001a\u0005\b \u0001\u0010\bR\u001d\u0010¡\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0006\u001a\u0005\b¢\u0001\u0010\bR\u001d\u0010£\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b£\u0001\u0010\u0006\u001a\u0005\b¤\u0001\u0010\bR\u001d\u0010¥\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¥\u0001\u0010\u0006\u001a\u0005\b¦\u0001\u0010\bR\u001d\u0010§\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b§\u0001\u0010\u0006\u001a\u0005\b¨\u0001\u0010\bR\u001d\u0010©\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b©\u0001\u0010\u0006\u001a\u0005\bª\u0001\u0010\bR\u001d\u0010«\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b«\u0001\u0010\u0006\u001a\u0005\b¬\u0001\u0010\bR\u001d\u0010\u00ad\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\u0006\u001a\u0005\b®\u0001\u0010\bR\u001d\u0010¯\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¯\u0001\u0010\u0006\u001a\u0005\b°\u0001\u0010\bR\u001d\u0010±\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b±\u0001\u0010\u0006\u001a\u0005\b²\u0001\u0010\bR\u001d\u0010³\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b³\u0001\u0010\u0006\u001a\u0005\b´\u0001\u0010\bR\u001d\u0010µ\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bµ\u0001\u0010\u0006\u001a\u0005\b¶\u0001\u0010\bR\u001d\u0010·\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b·\u0001\u0010\u0006\u001a\u0005\b¸\u0001\u0010\bR\u001d\u0010¹\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¹\u0001\u0010\u0006\u001a\u0005\bº\u0001\u0010\bR\u001d\u0010»\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b»\u0001\u0010\u0006\u001a\u0005\b¼\u0001\u0010\bR\u001d\u0010½\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b½\u0001\u0010\u0006\u001a\u0005\b¾\u0001\u0010\bR\u001d\u0010¿\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¿\u0001\u0010\u0006\u001a\u0005\bÀ\u0001\u0010\bR\u001d\u0010Á\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÁ\u0001\u0010\u0006\u001a\u0005\bÂ\u0001\u0010\bR\u001d\u0010Ã\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÃ\u0001\u0010\u0006\u001a\u0005\bÄ\u0001\u0010\bR\u001d\u0010Å\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÅ\u0001\u0010\u0006\u001a\u0005\bÆ\u0001\u0010\bR\u001d\u0010Ç\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÇ\u0001\u0010\u0006\u001a\u0005\bÈ\u0001\u0010\bR\u001d\u0010É\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÉ\u0001\u0010\u0006\u001a\u0005\bÊ\u0001\u0010\bR\u001d\u0010Ë\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bË\u0001\u0010\u0006\u001a\u0005\bÌ\u0001\u0010\bR\u001d\u0010Í\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÍ\u0001\u0010\u0006\u001a\u0005\bÎ\u0001\u0010\bR\u001d\u0010Ï\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÏ\u0001\u0010\u0006\u001a\u0005\bÐ\u0001\u0010\bR\u001d\u0010Ñ\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÑ\u0001\u0010\u0006\u001a\u0005\bÒ\u0001\u0010\bR\u001d\u0010Ó\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÓ\u0001\u0010\u0006\u001a\u0005\bÔ\u0001\u0010\bR\u001d\u0010Õ\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÕ\u0001\u0010\u0006\u001a\u0005\bÖ\u0001\u0010\bR\u001d\u0010×\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b×\u0001\u0010\u0006\u001a\u0005\bØ\u0001\u0010\bR\u001d\u0010Ù\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÙ\u0001\u0010\u0006\u001a\u0005\bÚ\u0001\u0010\bR\u001d\u0010Û\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÛ\u0001\u0010\u0006\u001a\u0005\bÜ\u0001\u0010\bR\u001d\u0010Ý\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÝ\u0001\u0010\u0006\u001a\u0005\bÞ\u0001\u0010\bR\u001d\u0010ß\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bß\u0001\u0010\u0006\u001a\u0005\bà\u0001\u0010\bR\u001d\u0010á\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bá\u0001\u0010\u0006\u001a\u0005\bâ\u0001\u0010\bR\u001d\u0010ã\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bã\u0001\u0010\u0006\u001a\u0005\bä\u0001\u0010\bR\u001d\u0010å\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bå\u0001\u0010\u0006\u001a\u0005\bæ\u0001\u0010\bR\u001d\u0010ç\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bç\u0001\u0010\u0006\u001a\u0005\bè\u0001\u0010\bR\u001d\u0010é\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bé\u0001\u0010\u0006\u001a\u0005\bê\u0001\u0010\bR\u001d\u0010ë\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bë\u0001\u0010\u0006\u001a\u0005\bì\u0001\u0010\bR\u001d\u0010í\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bí\u0001\u0010\u0006\u001a\u0005\bî\u0001\u0010\bR\u001d\u0010ï\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bï\u0001\u0010\u0006\u001a\u0005\bð\u0001\u0010\bR\u001d\u0010ñ\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bñ\u0001\u0010\u0006\u001a\u0005\bò\u0001\u0010\bR\u001d\u0010ó\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bó\u0001\u0010\u0006\u001a\u0005\bô\u0001\u0010\bR\u001d\u0010õ\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bõ\u0001\u0010\u0006\u001a\u0005\bö\u0001\u0010\bR\u001d\u0010÷\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b÷\u0001\u0010\u0006\u001a\u0005\bø\u0001\u0010\bR\u001d\u0010ù\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bù\u0001\u0010\u0006\u001a\u0005\bú\u0001\u0010\bR\u001d\u0010û\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bû\u0001\u0010\u0006\u001a\u0005\bü\u0001\u0010\bR\u001d\u0010ý\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bý\u0001\u0010\u0006\u001a\u0005\bþ\u0001\u0010\bR\u001d\u0010ÿ\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÿ\u0001\u0010\u0006\u001a\u0005\b\u0080\u0002\u0010\bR\u001d\u0010\u0081\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0002\u0010\u0006\u001a\u0005\b\u0082\u0002\u0010\bR\u001d\u0010\u0083\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0083\u0002\u0010\u0006\u001a\u0005\b\u0084\u0002\u0010\bR\u001d\u0010\u0085\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0085\u0002\u0010\u0006\u001a\u0005\b\u0086\u0002\u0010\bR\u001d\u0010\u0087\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0087\u0002\u0010\u0006\u001a\u0005\b\u0088\u0002\u0010\bR\u001d\u0010\u0089\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0089\u0002\u0010\u0006\u001a\u0005\b\u008a\u0002\u0010\bR\u001d\u0010\u008b\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008b\u0002\u0010\u0006\u001a\u0005\b\u008c\u0002\u0010\bR\u001d\u0010\u008d\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008d\u0002\u0010\u0006\u001a\u0005\b\u008e\u0002\u0010\bR\u001d\u0010\u008f\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008f\u0002\u0010\u0006\u001a\u0005\b\u0090\u0002\u0010\bR\u001d\u0010\u0091\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0091\u0002\u0010\u0006\u001a\u0005\b\u0092\u0002\u0010\bR\u001d\u0010\u0093\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0093\u0002\u0010\u0006\u001a\u0005\b\u0094\u0002\u0010\bR\u001d\u0010\u0095\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0095\u0002\u0010\u0006\u001a\u0005\b\u0096\u0002\u0010\bR\u001d\u0010\u0097\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0097\u0002\u0010\u0006\u001a\u0005\b\u0098\u0002\u0010\bR\u001d\u0010\u0099\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0099\u0002\u0010\u0006\u001a\u0005\b\u009a\u0002\u0010\bR\u001d\u0010\u009b\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009b\u0002\u0010\u0006\u001a\u0005\b\u009c\u0002\u0010\bR\u001d\u0010\u009d\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009d\u0002\u0010\u0006\u001a\u0005\b\u009e\u0002\u0010\bR\u001d\u0010\u009f\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009f\u0002\u0010\u0006\u001a\u0005\b \u0002\u0010\bR\u001d\u0010¡\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¡\u0002\u0010\u0006\u001a\u0005\b¢\u0002\u0010\bR\u001d\u0010£\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b£\u0002\u0010\u0006\u001a\u0005\b¤\u0002\u0010\bR\u001d\u0010¥\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¥\u0002\u0010\u0006\u001a\u0005\b¦\u0002\u0010\bR\u001d\u0010§\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b§\u0002\u0010\u0006\u001a\u0005\b¨\u0002\u0010\bR\u001d\u0010©\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b©\u0002\u0010\u0006\u001a\u0005\bª\u0002\u0010\bR\u001d\u0010«\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b«\u0002\u0010\u0006\u001a\u0005\b¬\u0002\u0010\bR\u001d\u0010\u00ad\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u00ad\u0002\u0010\u0006\u001a\u0005\b®\u0002\u0010\bR\u001d\u0010¯\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¯\u0002\u0010\u0006\u001a\u0005\b°\u0002\u0010\bR\u001d\u0010±\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b±\u0002\u0010\u0006\u001a\u0005\b²\u0002\u0010\bR\u001d\u0010³\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b³\u0002\u0010\u0006\u001a\u0005\b´\u0002\u0010\bR\u001d\u0010µ\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bµ\u0002\u0010\u0006\u001a\u0005\b¶\u0002\u0010\bR\u001d\u0010·\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b·\u0002\u0010\u0006\u001a\u0005\b¸\u0002\u0010\bR\u001d\u0010¹\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¹\u0002\u0010\u0006\u001a\u0005\bº\u0002\u0010\bR\u001d\u0010»\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b»\u0002\u0010\u0006\u001a\u0005\b¼\u0002\u0010\bR\u001d\u0010½\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b½\u0002\u0010\u0006\u001a\u0005\b¾\u0002\u0010\bR\u001d\u0010¿\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¿\u0002\u0010\u0006\u001a\u0005\bÀ\u0002\u0010\bR\u001d\u0010Á\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÁ\u0002\u0010\u0006\u001a\u0005\bÂ\u0002\u0010\bR\u001d\u0010Ã\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÃ\u0002\u0010\u0006\u001a\u0005\bÄ\u0002\u0010\bR\u001d\u0010Å\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÅ\u0002\u0010\u0006\u001a\u0005\bÆ\u0002\u0010\bR\u001d\u0010Ç\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÇ\u0002\u0010\u0006\u001a\u0005\bÈ\u0002\u0010\bR\u001d\u0010É\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÉ\u0002\u0010\u0006\u001a\u0005\bÊ\u0002\u0010\bR\u001d\u0010Ë\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bË\u0002\u0010\u0006\u001a\u0005\bÌ\u0002\u0010\bR\u001d\u0010Í\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÍ\u0002\u0010\u0006\u001a\u0005\bÎ\u0002\u0010\bR\u001d\u0010Ï\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÏ\u0002\u0010\u0006\u001a\u0005\bÐ\u0002\u0010\bR\u001d\u0010Ñ\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÑ\u0002\u0010\u0006\u001a\u0005\bÒ\u0002\u0010\bR\u001d\u0010Ó\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÓ\u0002\u0010\u0006\u001a\u0005\bÔ\u0002\u0010\bR\u001d\u0010Õ\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÕ\u0002\u0010\u0006\u001a\u0005\bÖ\u0002\u0010\bR\u001d\u0010×\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b×\u0002\u0010\u0006\u001a\u0005\bØ\u0002\u0010\bR\u001d\u0010Ù\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÙ\u0002\u0010\u0006\u001a\u0005\bÚ\u0002\u0010\bR\u001d\u0010Û\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÛ\u0002\u0010\u0006\u001a\u0005\bÜ\u0002\u0010\bR\u001d\u0010Ý\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÝ\u0002\u0010\u0006\u001a\u0005\bÞ\u0002\u0010\bR\u001d\u0010ß\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bß\u0002\u0010\u0006\u001a\u0005\bà\u0002\u0010\bR\u001d\u0010á\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bá\u0002\u0010\u0006\u001a\u0005\bâ\u0002\u0010\bR\u001d\u0010ã\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bã\u0002\u0010\u0006\u001a\u0005\bä\u0002\u0010\bR\u001d\u0010å\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bå\u0002\u0010\u0006\u001a\u0005\bæ\u0002\u0010\bR\u001d\u0010ç\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bç\u0002\u0010\u0006\u001a\u0005\bè\u0002\u0010\bR\u001d\u0010é\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bé\u0002\u0010\u0006\u001a\u0005\bê\u0002\u0010\bR\u001d\u0010ë\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bë\u0002\u0010\u0006\u001a\u0005\bì\u0002\u0010\bR\u001d\u0010í\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bí\u0002\u0010\u0006\u001a\u0005\bî\u0002\u0010\bR\u001d\u0010ï\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bï\u0002\u0010\u0006\u001a\u0005\bð\u0002\u0010\bR\u001d\u0010ñ\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bñ\u0002\u0010\u0006\u001a\u0005\bò\u0002\u0010\bR\u001d\u0010ó\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bó\u0002\u0010\u0006\u001a\u0005\bô\u0002\u0010\bR\u001d\u0010õ\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bõ\u0002\u0010\u0006\u001a\u0005\bö\u0002\u0010\bR\u001d\u0010÷\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b÷\u0002\u0010\u0006\u001a\u0005\bø\u0002\u0010\bR\u001d\u0010ù\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bù\u0002\u0010\u0006\u001a\u0005\bú\u0002\u0010\bR\u001d\u0010û\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bû\u0002\u0010\u0006\u001a\u0005\bü\u0002\u0010\bR\u001d\u0010ý\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bý\u0002\u0010\u0006\u001a\u0005\bþ\u0002\u0010\bR\u001d\u0010ÿ\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÿ\u0002\u0010\u0006\u001a\u0005\b\u0080\u0003\u0010\bR\u001d\u0010\u0081\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0003\u0010\u0006\u001a\u0005\b\u0082\u0003\u0010\bR\u001d\u0010\u0083\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0083\u0003\u0010\u0006\u001a\u0005\b\u0084\u0003\u0010\bR\u001d\u0010\u0085\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0085\u0003\u0010\u0006\u001a\u0005\b\u0086\u0003\u0010\bR\u001d\u0010\u0087\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0087\u0003\u0010\u0006\u001a\u0005\b\u0088\u0003\u0010\bR \u0010\u008a\u0003\u001a\u00030\u0089\u00038\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008a\u0003\u0010\u008b\u0003\u001a\u0006\b\u008c\u0003\u0010\u008d\u0003"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/Query$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "__closeAccountEligibility_input", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "get__closeAccountEligibility_input", "()Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "__activities_input", "get__activities_input", "__activitySearchSuggestions_input", "get__activitySearchSuggestions_input", "__activityDetails_input", "get__activityDetails_input", "__addressVerification_input", "get__addressVerification_input", "__addressSuggestions_input", "get__addressSuggestions_input", "__agenticGreetings_input", "get__agenticGreetings_input", "__agenticStarters_input", "get__agenticStarters_input", "__agenticSession_id", "get__agenticSession_id", "__agenticMessage_id", "get__agenticMessage_id", "__agenticMessages_sessionId", "get__agenticMessages_sessionId", "__agenticCommerceItemVariants_input", "get__agenticCommerceItemVariants_input", "__balanceAutoReload_input", "get__balanceAutoReload_input", "__balanceBundleEligibility_input", "get__balanceBundleEligibility_input", "__cardConnectEligibility_input", "get__cardConnectEligibility_input", "__debitInstruments_input", "get__debitInstruments_input", "__debitInstrumentApplications_input", "get__debitInstrumentApplications_input", "__debitInstrumentProduct_input", "get__debitInstrumentProduct_input", "__debitInstrumentCardCredential_input", "get__debitInstrumentCardCredential_input", "__debitInstrumentEligibility_input", "get__debitInstrumentEligibility_input", "__debitInstrumentAddresses_input", "get__debitInstrumentAddresses_input", "__financialInstrumentPreference_input", "get__financialInstrumentPreference_input", "__debitInstrumentTokenEligibilities_input", "get__debitInstrumentTokenEligibilities_input", "__debitInstrumentPin_input", "get__debitInstrumentPin_input", "__virtualBankAccountEligibility_input", "get__virtualBankAccountEligibility_input", "__virtualBankAccounts_input", "get__virtualBankAccounts_input", "__smartRoutePreferences_input", "get__smartRoutePreferences_input", "__cashInRetailers_input", "get__cashInRetailers_input", "__cashInActivation_input", "get__cashInActivation_input", "__cashInStores_input", "get__cashInStores_input", "__pushNotificationPreferences_input", "get__pushNotificationPreferences_input", "__notifications_eligibleForPushNotificationsOptIn", "get__notifications_eligibleForPushNotificationsOptIn", "__paymentTransferAttempt_id", "get__paymentTransferAttempt_id", "__paymentDestinations_id", "get__paymentDestinations_id", "__paymentRequest_input", "get__paymentRequest_input", "__paymentTransfer_input", "get__paymentTransfer_input", "__paymentTransferFxQuote_input", "get__paymentTransferFxQuote_input", "__onboardingFlowSteps_input", "get__onboardingFlowSteps_input", "__placeSuggestions_input", "get__placeSuggestions_input", "__place_id", "get__place_id", "__publicCredentialMetadata_input", "get__publicCredentialMetadata_input", "__publicCredentialMetadataByToken_id", "get__publicCredentialMetadataByToken_id", "__bnplAutopaySetupOverview_input", "get__bnplAutopaySetupOverview_input", "__bnplServicingPlanOverview_input", "get__bnplServicingPlanOverview_input", "__bnplPlansOverview_input", "get__bnplPlansOverview_input", "__bnplMakePaymentOverview_input", "get__bnplMakePaymentOverview_input", "__bnplPlans_input", "get__bnplPlans_input", "__bnplPlan_input", "get__bnplPlan_input", "__bnplCreditFacilities_input", "get__bnplCreditFacilities_input", "__bnplAddressSuggestions_input", "get__bnplAddressSuggestions_input", "__bnplLoanConstraints_input", "get__bnplLoanConstraints_input", "__bnplPrequalificationSummary_input", "get__bnplPrequalificationSummary_input", "__bnplProvisionedCardOverview_input", "get__bnplProvisionedCardOverview_input", "__bnplApplicationEligibility_input", "get__bnplApplicationEligibility_input", "__bnplApplicationPaymentFundingInstruments_input", "get__bnplApplicationPaymentFundingInstruments_input", "__bnplVirtualCardOverview_input", "get__bnplVirtualCardOverview_input", "__revolvingCreditAccount_input", "get__revolvingCreditAccount_input", "__revolvingCreditPushProvisioning_input", "get__revolvingCreditPushProvisioning_input", "__revolvingCreditProductFeatureEligibility_input", "get__revolvingCreditProductFeatureEligibility_input", "__revolvingCreditProductFeatureOffers_input", "get__revolvingCreditProductFeatureOffers_input", "__revolvingCreditActivities_input", "get__revolvingCreditActivities_input", "__revolvingCreditAutopay_input", "get__revolvingCreditAutopay_input", "__revolvingCreditRewardsSummary_input", "get__revolvingCreditRewardsSummary_input", "__revolvingCreditInstruments_input", "get__revolvingCreditInstruments_input", "__revolvingCreditPaymentConstraints_input", "get__revolvingCreditPaymentConstraints_input", "__revolvingCreditServicingContent_input", "get__revolvingCreditServicingContent_input", "__revolvingCreditStatementSummaries_input", "get__revolvingCreditStatementSummaries_input", "__revolvingCreditStatement_input", "get__revolvingCreditStatement_input", "__revolvingCreditSupportedPaymentFundingInstrumentTypes_input", "get__revolvingCreditSupportedPaymentFundingInstrumentTypes_input", "__revolvingCreditEligiblePaymentFundingInstruments_input", "get__revolvingCreditEligiblePaymentFundingInstruments_input", "__revolvingCreditPayments_input", "get__revolvingCreditPayments_input", "__revolvingCreditCustomerProfiles_input", "get__revolvingCreditCustomerProfiles_input", "__revolvingCreditServicingUnenrolledAccountFeatureComponents_input", "get__revolvingCreditServicingUnenrolledAccountFeatureComponents_input", "__revolvingCreditNotificationPreference_input", "get__revolvingCreditNotificationPreference_input", "__revolvingCreditNotificationPreferences_input", "get__revolvingCreditNotificationPreferences_input", "__revolvingCreditServicingPrioritizedAccountActionComponents_input", "get__revolvingCreditServicingPrioritizedAccountActionComponents_input", "__revolvingCreditHistoricalPromotionalActivities_input", "get__revolvingCreditHistoricalPromotionalActivities_input", "__revolvingCreditAssociatedFinancialInstruments_input", "get__revolvingCreditAssociatedFinancialInstruments_input", "__revolvingCreditPaymentSecurityEnrollment_input", "get__revolvingCreditPaymentSecurityEnrollment_input", "__revolvingCreditLineIncreaseOffer_input", "get__revolvingCreditLineIncreaseOffer_input", "__revolvingCreditInstrumentPin_input", "get__revolvingCreditInstrumentPin_input", "__revolvingCreditLineIncreaseOfferPreference_input", "get__revolvingCreditLineIncreaseOfferPreference_input", "__revolvingCreditAcquisitionApplication_input", "get__revolvingCreditAcquisitionApplication_input", "__cryptocurrencyAddressBook_input", "get__cryptocurrencyAddressBook_input", "__cryptocurrencyRecurringSubscription_input", "get__cryptocurrencyRecurringSubscription_input", "__cryptocurrencyRecurringSubscriptions_input", "get__cryptocurrencyRecurringSubscriptions_input", "__cryptocurrencyHoldings_input", "get__cryptocurrencyHoldings_input", "__cryptocurrencyMarketPrices_input", "get__cryptocurrencyMarketPrices_input", "__cryptocurrencyPreferences_input", "get__cryptocurrencyPreferences_input", "__eligibleCryptocurrencyBlockchainNetworks_input", "get__eligibleCryptocurrencyBlockchainNetworks_input", "__cryptocurrencyConfigurations_input", "get__cryptocurrencyConfigurations_input", "__connectedAppsAndSitesConsentHistories_input", "get__connectedAppsAndSitesConsentHistories_input", "__connectedAppsAndSitesConsumerDataRightsConsentHistories_input", "get__connectedAppsAndSitesConsumerDataRightsConsentHistories_input", "__deviceWalletEligibility_input", "get__deviceWalletEligibility_input", "__homeFeed_input", "get__homeFeed_input", "__charities_input", "get__charities_input", "__mosaicPage_input", "get__mosaicPage_input", "__mosaicPageAddressValidation_input", "get__mosaicPageAddressValidation_input", "__mosaicPageEligibility_input", "get__mosaicPageEligibility_input", "__identityLinks_input", "get__identityLinks_input", "__stepUpIdentityChallenges_input", "get__stepUpIdentityChallenges_input", "__authenticationAlert_input", "get__authenticationAlert_input", "__linkedAuthenticationProfiles_input", "get__linkedAuthenticationProfiles_input", "__authenticationCredentialChallenge_input", "get__authenticationCredentialChallenge_input", "__invoice_id", "get__invoice_id", "__invoiceConditionalRules_id", "get__invoiceConditionalRules_id", "__merchantItems_input", "get__merchantItems_input", "__merchantTaxes_input", "get__merchantTaxes_input", "__moneybox_id", "get__moneybox_id", "__moneyboxes_input", "get__moneyboxes_input", "__balanceHoldPolicies_input", "get__balanceHoldPolicies_input", "__moneyManagementNextBestActions_input", "get__moneyManagementNextBestActions_input", "__shipmentPackage_input", "get__shipmentPackage_input", "__packageEmailLinks_input", "get__packageEmailLinks_input", "__orderDetails_input", "get__orderDetails_input", "__authorizePackageTrackingURL_emailProvider", "get__authorizePackageTrackingURL_emailProvider", "__packageTrackingUserPreferences_input", "get__packageTrackingUserPreferences_input", "__activityShipmentPackages_input", "get__activityShipmentPackages_input", "__fulfillmentSlaPolicy_input", "get__fulfillmentSlaPolicy_input", "__moneyPool_id", "get__moneyPool_id", "__moneyPools_input", "get__moneyPools_input", "__moneyPoolMediaFiles_input", "get__moneyPoolMediaFiles_input", "__subjectAccessRequests_input", "get__subjectAccessRequests_input", "__promotionOffers_input", "get__promotionOffers_input", "__redeemablePointBalance_input", "get__redeemablePointBalance_input", "__loyaltyMemberships_input", "get__loyaltyMemberships_input", "__payoutStore_input", "get__payoutStore_input", "__transactionRewardSummary_input", "get__transactionRewardSummary_input", "__rewardedOffers_input", "get__rewardedOffers_input", "__publicProfile_input", "get__publicProfile_input", "__contacts_input", "get__contacts_input", "__contactSearch_input", "get__contactSearch_input", "__contact_id", "get__contact_id", "__contactById_input", "get__contactById_input", "__recentSearches_input", "get__recentSearches_input", "__qrCodeSession_input", "get__qrCodeSession_input", "__consumerPresentedQrCodeEligibility_input", "get__consumerPresentedQrCodeEligibility_input", "__paypalWorldCheckoutOptions_input", "get__paypalWorldCheckoutOptions_input", "__savingsAccounts_input", "get__savingsAccounts_input", "__savingsAccountFeatures_input", "get__savingsAccountFeatures_input", "__savingsAccountEligibility_input", "get__savingsAccountEligibility_input", "__articleContent_input", "get__articleContent_input", "__recommendedArticles_input", "get__recommendedArticles_input", "__alerts_input", "get__alerts_input", "__searchArticles_input", "get__searchArticles_input", "__ipsArticles_input", "get__ipsArticles_input", "__helpArticle_input", "get__helpArticle_input", "__recommendedHelpArticles_input", "get__recommendedHelpArticles_input", "__helpAlerts_input", "get__helpAlerts_input", "__searchHelpArticles_input", "get__searchHelpArticles_input", "__inProductSupportHelpArticles_input", "get__inProductSupportHelpArticles_input", "__helpTopics_input", "get__helpTopics_input", "__helpTopic_input", "get__helpTopic_input", "__helpContactTopics_input", "get__helpContactTopics_input", "__helpContactTopic_id", "get__helpContactTopic_id", "__shoppingCollection_id", "get__shoppingCollection_id", "__products_input", "get__products_input", "__stores_input", "get__stores_input", "__consumerAgreements_input", "get__consumerAgreements_input", "__consumerAgreement_id", "get__consumerAgreement_id", "__consumerAgreementFundingInstruments_input", "get__consumerAgreementFundingInstruments_input", "__consumerAgreementsByFundingInstrument_input", "get__consumerAgreementsByFundingInstrument_input", "__consumerAgreementIncentives_input", "get__consumerAgreementIncentives_input", "__taxReports_input", "get__taxReports_input", "__walletComponents_input", "get__walletComponents_input", "__balance_input", "get__balance_input", "__bankAccount_id", "get__bankAccount_id", "__bankAccounts_input", "get__bankAccounts_input", "__openBankingAggregator_input", "get__openBankingAggregator_input", "__openBankingInstitutions_input", "get__openBankingInstitutions_input", "__externalBankAccounts_input", "get__externalBankAccounts_input", "__openBankingCapability_input", "get__openBankingCapability_input", "__bank_input", "get__bank_input", "__cards_input", "get__cards_input", "__card_id", "get__card_id", "__autodetectCards_input", "get__autodetectCards_input", "__cardDefinitions_input", "get__cardDefinitions_input", "__cardReward_id", "get__cardReward_id", "__transferCapabilitiesEvaluation_input", "get__transferCapabilitiesEvaluation_input", "__transfersMetadata_id", "get__transfersMetadata_id", "__depositOptions_input", "get__depositOptions_input", "__depositOptionEvaluation_input", "get__depositOptionEvaluation_input", "__deposit_id", "get__deposit_id", "__withdrawalOption_input", "get__withdrawalOption_input", "__paymentToken_id", "get__paymentToken_id", "__paymentTokens_input", "get__paymentTokens_input", "__paymentTokenRealTimeBalance_id", "get__paymentTokenRealTimeBalance_id", "__provisionableInstitutions_input", "get__provisionableInstitutions_input", "__thirdPartyLoyaltyCard_id", "get__thirdPartyLoyaltyCard_id", "__thirdPartyLoyaltyCards_input", "get__thirdPartyLoyaltyCards_input", "__thirdPartyLoyaltyProgram_id", "get__thirdPartyLoyaltyProgram_id", "__thirdPartyLoyaltyPrograms_input", "get__thirdPartyLoyaltyPrograms_input", "____type_name", "get____type_name", "Lcom/apollographql/apollo/api/ObjectType;", "type", "Lcom/apollographql/apollo/api/ObjectType;", "getType", "()Lcom/apollographql/apollo/api/ObjectType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__closeAccountEligibility_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__closeAccountEligibility_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__activities_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__activities_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__activitySearchSuggestions_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__activitySearchSuggestions_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__activityDetails_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__activityDetails_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addressVerification_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__addressVerification_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addressSuggestions_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__addressSuggestions_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__agenticGreetings_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__agenticGreetings_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__agenticStarters_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__agenticStarters_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__agenticSession_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__agenticSession_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__agenticMessage_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__agenticMessage_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__agenticMessages_sessionId() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__agenticMessages_sessionId;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__agenticCommerceItemVariants_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__agenticCommerceItemVariants_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__balanceAutoReload_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__balanceAutoReload_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__balanceBundleEligibility_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__balanceBundleEligibility_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cardConnectEligibility_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__cardConnectEligibility_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__debitInstruments_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__debitInstruments_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__debitInstrumentApplications_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__debitInstrumentApplications_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__debitInstrumentProduct_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__debitInstrumentProduct_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__debitInstrumentCardCredential_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__debitInstrumentCardCredential_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__debitInstrumentEligibility_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__debitInstrumentEligibility_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__debitInstrumentAddresses_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__debitInstrumentAddresses_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__financialInstrumentPreference_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__financialInstrumentPreference_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__debitInstrumentTokenEligibilities_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__debitInstrumentTokenEligibilities_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__debitInstrumentPin_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__debitInstrumentPin_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__virtualBankAccountEligibility_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__virtualBankAccountEligibility_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__virtualBankAccounts_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__virtualBankAccounts_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__smartRoutePreferences_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__smartRoutePreferences_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cashInRetailers_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__cashInRetailers_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cashInActivation_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__cashInActivation_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cashInStores_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__cashInStores_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__pushNotificationPreferences_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__pushNotificationPreferences_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__notifications_eligibleForPushNotificationsOptIn() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__notifications_eligibleForPushNotificationsOptIn;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__paymentTransferAttempt_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__paymentTransferAttempt_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__paymentDestinations_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__paymentDestinations_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__paymentRequest_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__paymentRequest_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__paymentTransfer_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__paymentTransfer_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__paymentTransferFxQuote_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__paymentTransferFxQuote_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__onboardingFlowSteps_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__onboardingFlowSteps_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__placeSuggestions_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__placeSuggestions_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__place_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__place_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__publicCredentialMetadata_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__publicCredentialMetadata_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__publicCredentialMetadataByToken_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__publicCredentialMetadataByToken_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bnplAutopaySetupOverview_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__bnplAutopaySetupOverview_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bnplServicingPlanOverview_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__bnplServicingPlanOverview_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bnplPlansOverview_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__bnplPlansOverview_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bnplMakePaymentOverview_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__bnplMakePaymentOverview_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bnplPlans_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__bnplPlans_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bnplPlan_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__bnplPlan_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bnplCreditFacilities_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__bnplCreditFacilities_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bnplAddressSuggestions_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__bnplAddressSuggestions_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bnplLoanConstraints_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__bnplLoanConstraints_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bnplPrequalificationSummary_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__bnplPrequalificationSummary_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bnplProvisionedCardOverview_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__bnplProvisionedCardOverview_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bnplApplicationEligibility_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__bnplApplicationEligibility_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bnplApplicationPaymentFundingInstruments_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__bnplApplicationPaymentFundingInstruments_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bnplVirtualCardOverview_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__bnplVirtualCardOverview_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditAccount_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditAccount_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditPushProvisioning_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditPushProvisioning_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditProductFeatureEligibility_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditProductFeatureEligibility_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditProductFeatureOffers_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditProductFeatureOffers_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditActivities_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditActivities_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditAutopay_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditAutopay_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditRewardsSummary_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditRewardsSummary_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditInstruments_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditInstruments_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditPaymentConstraints_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditPaymentConstraints_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditServicingContent_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditServicingContent_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditStatementSummaries_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditStatementSummaries_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditStatement_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditStatement_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditSupportedPaymentFundingInstrumentTypes_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditSupportedPaymentFundingInstrumentTypes_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditEligiblePaymentFundingInstruments_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditEligiblePaymentFundingInstruments_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditPayments_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditPayments_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditCustomerProfiles_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditCustomerProfiles_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditServicingUnenrolledAccountFeatureComponents_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditServicingUnenrolledAccountFeatureComponents_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditNotificationPreference_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditNotificationPreference_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditNotificationPreferences_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditNotificationPreferences_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditServicingPrioritizedAccountActionComponents_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditServicingPrioritizedAccountActionComponents_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditHistoricalPromotionalActivities_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditHistoricalPromotionalActivities_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditAssociatedFinancialInstruments_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditAssociatedFinancialInstruments_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditPaymentSecurityEnrollment_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditPaymentSecurityEnrollment_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditLineIncreaseOffer_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditLineIncreaseOffer_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditInstrumentPin_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditInstrumentPin_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditLineIncreaseOfferPreference_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditLineIncreaseOfferPreference_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__revolvingCreditAcquisitionApplication_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__revolvingCreditAcquisitionApplication_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cryptocurrencyAddressBook_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__cryptocurrencyAddressBook_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cryptocurrencyRecurringSubscription_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__cryptocurrencyRecurringSubscription_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cryptocurrencyRecurringSubscriptions_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__cryptocurrencyRecurringSubscriptions_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cryptocurrencyHoldings_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__cryptocurrencyHoldings_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cryptocurrencyMarketPrices_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__cryptocurrencyMarketPrices_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cryptocurrencyPreferences_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__cryptocurrencyPreferences_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__eligibleCryptocurrencyBlockchainNetworks_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__eligibleCryptocurrencyBlockchainNetworks_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cryptocurrencyConfigurations_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__cryptocurrencyConfigurations_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__connectedAppsAndSitesConsentHistories_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__connectedAppsAndSitesConsentHistories_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__connectedAppsAndSitesConsumerDataRightsConsentHistories_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__connectedAppsAndSitesConsumerDataRightsConsentHistories_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deviceWalletEligibility_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__deviceWalletEligibility_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__homeFeed_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__homeFeed_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__charities_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__charities_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__mosaicPage_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__mosaicPage_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__mosaicPageAddressValidation_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__mosaicPageAddressValidation_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__mosaicPageEligibility_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__mosaicPageEligibility_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__identityLinks_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__identityLinks_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__stepUpIdentityChallenges_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__stepUpIdentityChallenges_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__authenticationAlert_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__authenticationAlert_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__linkedAuthenticationProfiles_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__linkedAuthenticationProfiles_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__authenticationCredentialChallenge_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__authenticationCredentialChallenge_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__invoice_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__invoice_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__invoiceConditionalRules_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__invoiceConditionalRules_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__merchantItems_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__merchantItems_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__merchantTaxes_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__merchantTaxes_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__moneybox_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__moneybox_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__moneyboxes_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__moneyboxes_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__balanceHoldPolicies_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__balanceHoldPolicies_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__moneyManagementNextBestActions_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__moneyManagementNextBestActions_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__shipmentPackage_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__shipmentPackage_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__packageEmailLinks_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__packageEmailLinks_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__orderDetails_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__orderDetails_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__authorizePackageTrackingURL_emailProvider() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__authorizePackageTrackingURL_emailProvider;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__packageTrackingUserPreferences_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__packageTrackingUserPreferences_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__activityShipmentPackages_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__activityShipmentPackages_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__fulfillmentSlaPolicy_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__fulfillmentSlaPolicy_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__moneyPool_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__moneyPool_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__moneyPools_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__moneyPools_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__moneyPoolMediaFiles_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__moneyPoolMediaFiles_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__subjectAccessRequests_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__subjectAccessRequests_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__promotionOffers_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__promotionOffers_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__redeemablePointBalance_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__redeemablePointBalance_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__loyaltyMemberships_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__loyaltyMemberships_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__payoutStore_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__payoutStore_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__transactionRewardSummary_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__transactionRewardSummary_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__rewardedOffers_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__rewardedOffers_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__publicProfile_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__publicProfile_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__contacts_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__contacts_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__contactSearch_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__contactSearch_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__contact_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__contact_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__contactById_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__contactById_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__recentSearches_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__recentSearches_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__qrCodeSession_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__qrCodeSession_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__consumerPresentedQrCodeEligibility_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__consumerPresentedQrCodeEligibility_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__paypalWorldCheckoutOptions_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__paypalWorldCheckoutOptions_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__savingsAccounts_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__savingsAccounts_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__savingsAccountFeatures_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__savingsAccountFeatures_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__savingsAccountEligibility_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__savingsAccountEligibility_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__articleContent_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__articleContent_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__recommendedArticles_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__recommendedArticles_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__alerts_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__alerts_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__searchArticles_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__searchArticles_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__ipsArticles_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__ipsArticles_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__helpArticle_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__helpArticle_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__recommendedHelpArticles_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__recommendedHelpArticles_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__helpAlerts_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__helpAlerts_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__searchHelpArticles_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__searchHelpArticles_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__inProductSupportHelpArticles_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__inProductSupportHelpArticles_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__helpTopics_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__helpTopics_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__helpTopic_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__helpTopic_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__helpContactTopics_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__helpContactTopics_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__helpContactTopic_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__helpContactTopic_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__shoppingCollection_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__shoppingCollection_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__products_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__products_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__stores_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__stores_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__consumerAgreements_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__consumerAgreements_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__consumerAgreement_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__consumerAgreement_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__consumerAgreementFundingInstruments_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__consumerAgreementFundingInstruments_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__consumerAgreementsByFundingInstrument_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__consumerAgreementsByFundingInstrument_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__consumerAgreementIncentives_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__consumerAgreementIncentives_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__taxReports_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__taxReports_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__walletComponents_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__walletComponents_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__balance_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__balance_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bankAccount_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__bankAccount_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bankAccounts_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__bankAccounts_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__openBankingAggregator_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__openBankingAggregator_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__openBankingInstitutions_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__openBankingInstitutions_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__externalBankAccounts_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__externalBankAccounts_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__openBankingCapability_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__openBankingCapability_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bank_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__bank_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cards_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__cards_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__card_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__card_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__autodetectCards_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__autodetectCards_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cardDefinitions_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__cardDefinitions_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cardReward_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__cardReward_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__transferCapabilitiesEvaluation_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__transferCapabilitiesEvaluation_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__transfersMetadata_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__transfersMetadata_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__depositOptions_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__depositOptions_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__depositOptionEvaluation_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__depositOptionEvaluation_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deposit_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__deposit_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__withdrawalOption_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__withdrawalOption_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__paymentToken_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__paymentToken_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__paymentTokens_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__paymentTokens_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__paymentTokenRealTimeBalance_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__paymentTokenRealTimeBalance_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__provisionableInstitutions_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__provisionableInstitutions_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__thirdPartyLoyaltyCard_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__thirdPartyLoyaltyCard_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__thirdPartyLoyaltyCards_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__thirdPartyLoyaltyCards_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__thirdPartyLoyaltyProgram_id() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__thirdPartyLoyaltyProgram_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__thirdPartyLoyaltyPrograms_input() {
            return com.paypal.oslo.api.graphql.schema.type.Query.__thirdPartyLoyaltyPrograms_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get____type_name() {
            return com.paypal.oslo.api.graphql.schema.type.Query.____type_name;
        }

        public final com.apollographql.apollo.api.ObjectType getType() {
            return com.paypal.oslo.api.graphql.schema.type.Query.type;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
