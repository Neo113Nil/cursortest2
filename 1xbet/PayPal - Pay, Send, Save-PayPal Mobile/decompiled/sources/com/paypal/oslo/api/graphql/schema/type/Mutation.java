package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/Mutation;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Mutation {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.Mutation.Companion INSTANCE = new com.paypal.oslo.api.graphql.schema.type.Mutation.Companion(null);
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __closeAccount_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __reportSpamActivity_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __initiateInstantRefund_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __logActivityAction_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createAccountActivityLog_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createAgenticSession_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __sendAgenticMessage_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __closeAgenticSession_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __disableBalanceAutoReload_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createBalanceAutoReload_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateBalanceAutoReload_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createCardConnectSession_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createDebitInstrument_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __activatePhysicalDebitInstrument_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __setDebitInstrumentPin_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateDebitInstrumentBillingAddress_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __closeDebitInstrument_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deactivateDebitInstrument_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __unlockDebitInstrument_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __reportDebitCardLost_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __reissueDebitInstrument_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __replaceVirtualDebitInstrument_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __validateDebitInstrumentAddress_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __evaluateDebitInstrumentFundingOptions_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createDebitInstrumentDigitizationData_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __provisionDebitInstrument_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addDebitInstrumentAddress_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __requestPhysicalDebitInstrument_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __setFinancialInstrumentPreference_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __removeFinancialInstrumentPreference_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __setDebitInstrumentFundingOptions_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __removeDebitInstrumentFundingOptions_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __provisionVirtualBankAccount_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __linkDirectDepositAccountToPayrollProvider_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateDirectDebitStatus_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateSmartRoutePreferences_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __subscribeToPushNotifications_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __unsubscribeFromPushNotifications_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePushNotificationPreferences_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __processPushNotificationAction_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateNotificationsTrackingStatus_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePaymentTransferAttemptAmountAndIntent_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePaymentTransferAttemptNote_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePaymentTransferAttemptTransferType_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePaymentTransferAttemptReceiver_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePaymentTransferAttemptRecipient_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __executePaymentTransfer_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __completePendingPaymentTransfer_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __resolvePlanContingencyForTransferAttempt_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __resolvePaymentContingencyForTransferAttempt_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __startPaymentTransferAttemptForSubflow_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePaymentTransferAttemptCurrencyConversionProvider_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addFinancialInstrumentsToPaymentTransferAttempt_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cancelPaymentRequest_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cancelPaymentTransfer_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __requestOnboardingPhoneConfirmationCode_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __confirmOnboardingPhoneConfirmationCode_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __requestOnboardingEmailConfirmationCode_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __confirmOnboardingEmailConfirmationCode_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createAccount_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __onboard_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __setBnplAutopay_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cancelBnplAutopay_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createBnplPreSnoozeContract_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __makeBnplPayment_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __enrollInBnplPlanProgram_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __checkBnplApplicationEligibility_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __closeBnplLoan_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createBnplApplicationSession_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __evaluateBnplProductOffers_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __evaluateBnplProvisionEligibilityAndReplaceCard_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __initializeBnplApplication_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __prepareBnplDigitizationData_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __submitBnplApplication_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateBnplApplication_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cancelRevolvingCreditPayment_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __redeemRevolvingCreditReward_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateRevolvingCreditAutopay_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __makeRevolvingCreditPayment_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateRevolvingCreditInstrumentStatus_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __setRevolvingCreditInstrumentStatus_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateRevolvingCreditNotificationPreference_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateRevolvingCreditLineIncreaseOfferStatus_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateRevolvingCreditCustomerProfile_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __activateRevolvingCreditCard_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __enrollInRevolvingCreditPaymentSecurity_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __prepareRevolvingCreditDigitizationData_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addRevolvingCreditCustomerProfile_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __reissueRevolvingCreditInstrument_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __requestRevolvingCreditLineIncrease_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateRevolvingCreditLineIncreaseOfferPreference_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateRevolvingCreditApplication_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __continueRevolvingCreditApplication_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __submitRevolvingCreditApplication_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __verifyRevolvingCreditIdentity_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cancelRevolvingCreditApplication_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deleteCryptocurrencyAddressBookEntry_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createCryptocurrencyAddressBookEntry_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateCryptocurrencyAddressBookEntry_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __rolloverCryptocurrency_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __pauseCryptocurrencyRecurringSubscription_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __resumeCryptocurrencyRecurringSubscription_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cancelCryptocurrencyRecurringSubscription_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createCryptocurrencyPreference_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateCryptocurrencyPreferences_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __resolveCryptocurrencyTradeContingencies_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateCryptocurrencyAlertSettings_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __executeCryptocurrencyTrade_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateCryptocurrencyRecurringTradeSubscription_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createCryptocurrencyRecurringTradeSubscription_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __evaluateCryptocurrencyEligibleFundingOptions_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __generateCryptocurrencyQuote_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __evaluateCryptocurrencyTrade_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __generateCryptocurrencyAddress_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __validateCryptocurrencyAddress_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __executeCryptocurrencyTransfer_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __evaluateEligibleCryptocurrencyAssets_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __processCryptocurrencyOrders_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePersonalizedAds_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePersonalizedOffers_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePersonalizedShoppingConsent_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateFaceScanStatus_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateShareWithThirdParties_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateAllowFindByIdentifiers_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateAllowPaymentRequests_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePaymentRequestsFrom_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateAllowFindViaPayPalMe_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateAllowFindByName_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateAllowFindByUsername_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateAllowFindByEmailAndPhone_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateAllowRequestMoneyByEmail_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateAllowRequestMoneyByPhone_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateAllowRequestMoneyByName_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateAllowRequestMoneyByUsername_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateAllowSendMoneyByEmail_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateAllowSendMoneyByPhone_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateAllowSendMoneyByName_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateAllowSendMoneyByUsername_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateAllowVenmoDiscovery_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deleteAuthConsent_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __removeProviderConsentWithData_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deactivateAuthConsent_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __prepareCardForDigitization_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __suspendDeviceWalletCardToken_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __resumeDeviceWalletCardToken_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __syncDeviceWalletCardToken_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __closeDeviceWalletCardToken_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __closeDeviceWalletCardTokens_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __redeemPointsToCharity_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __submitMosaicPageForm_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __authenticate_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deliverStepUpIdentityChallenge_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __validateStepUpIdentityChallenge_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __bindAuthenticationDevice_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __unbindAuthenticationDevice_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createPasskeyRegistrationOption_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createPasskey_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deletePasskey_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __requestPhoneConfirmationCode_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __confirmPhoneConfirmationCode_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __confirmEmail_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __changePassword_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __endAuthenticationSession_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __exchangeAccessTokenForAuthorizationCode_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __exchangeAuthorizationCodeForAccessToken_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __registerDevice_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __validateAlert_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __validateConnect_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addPartyBillingAddress_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addPartyEmail_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deletePartyEmail_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __makePrimaryPartyEmail_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __replacePrimaryPartyEmail_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePartyEmail_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __initiateEmailConfirmation_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __reinitiateEmailConfirmation_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __verifyPartyEmailWithOtp_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __verifyPartyEmailWithGoogleSignIn_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __reconfirmPartyEmail_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePartyProfilePicture_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addPartyPhone_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __replacePartyPhone_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deletePartyPhone_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePartyPhone_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __replacePrimaryPartyPhone_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __initiatePartyPhoneConfirmation_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __reinitiatePartyPhoneConfirmation_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __verifyPartyPhone_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateUserConsent_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePartyAddress_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deletePartyAddress_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __makePrimaryPartyAddress_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __replacePrimaryPartyAddress_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createInvoice_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateInvoice_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deleteInvoice_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deleteInvoiceV2_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __sendInvoice_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cancelInvoice_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cancelInvoiceV2_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __saveInvoiceReminder_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __saveInvoiceReminderV2_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __saveInvoicePayment_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __saveInvoiceRefund_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createMerchantItem_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateMerchantItem_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateMerchantItemV2_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deleteMerchantItem_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deleteMerchantItemV2_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createMerchantTax_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateMerchantTax_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateMerchantTaxV2_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deleteMerchantTax_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deleteMerchantTaxV2_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createMoneybox_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateMoneybox_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deleteMoneybox_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __transferMoneybox_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createMoneyboxTransferSchedule_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateMoneyboxTransferSchedule_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __pauseMoneyboxTransferSchedule_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deleteMoneyboxTransferSchedule_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __disableBalanceAutoTransfer_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __acknowledgeMoneyboxTargetReached_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __authorizePackageTracking_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deauthorizePackageTracking_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deauthorizePackageTrackingForAllProviders_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __markPackageAsDelivered_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePackageNickname_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deletePackage_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __savePackageTrackingUserPreference_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createMoneyPool_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateMoneyPool_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __closeMoneyPool_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createSubjectAccessRequest_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __enrollInPromotionOffer_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __enrollInLoyaltyProgram_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __redeemPointsToBalance_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __redeemPointsToSavings_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __blockContact_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createContact_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateContact_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __unblockContact_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __favoriteContact_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __unfavoriteContact_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deleteContact_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createRecentSearch_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deleteRecentSearch_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deleteRecentSearches_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __scanQrCode_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cancelQrCodePayment_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __enrollConsumerPresentedQrCode_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __confirmQrCodePayment_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __generateConsumerPresentedQrCode_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __provisionSavingsAccount_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateSavingsApplication_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateSavingsAccount_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __disableConsumerAgreement_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePreferredFundingInstruments_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createTaxReconciliationReport_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __requestTaxReportSelfCorrection_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __requestTaxDocument_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __initiateExternalBankAccess_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __confirmBankAccount_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateBankAccount_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addBankAccount_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __removeBankAccount_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __linkExternalBankAccounts_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addCard_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateCard_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __removeCard_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __confirmCard_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __generateThreeDsSupplementalData_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateCardsBillingAddress_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateTransfersMetadata_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addDeposit_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __withdrawFunds_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __resolveDepositContingencies_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cancelTransfer_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __setPaymentPreference_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updatePaymentPreference_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __removePaymentToken_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __setProvisionFlowMetadata_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __createThirdPartyLoyaltyCard_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateThirdPartyLoyaltyCard_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __patchThirdPartyLoyaltyCard_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deleteThirdPartyLoyaltyCard_id = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("id").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __uploadThirdPartyLoyaltyCardCustomImage_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __deleteThirdPartyLoyaltyCardCustomImage_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.ObjectType type = new com.apollographql.apollo.api.ObjectType.Builder("Mutation").build();

    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\bÄ\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u001a\u0010/\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u001a\u00101\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u001a\u00105\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u001a\u00107\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u001a\u0010;\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u001a\u0010=\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u001a\u0010A\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u001a\u0010C\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u001a\u0010E\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u001a\u0010G\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u001a\u0010I\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u001a\u0010K\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u001a\u0010M\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\bR\u001a\u0010O\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR\u001a\u0010Q\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\bR\u001a\u0010S\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\bR\u001a\u0010U\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u001a\u0010W\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\bR\u001a\u0010Y\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bZ\u0010\bR\u001a\u0010[\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\bR\u001a\u0010]\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b^\u0010\bR\u001a\u0010_\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\b`\u0010\bR\u001a\u0010a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bb\u0010\bR\u001a\u0010c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\bd\u0010\bR\u001a\u0010e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\bf\u0010\bR\u001a\u0010g\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR\u001a\u0010i\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010\u0006\u001a\u0004\bj\u0010\bR\u001a\u0010k\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010\u0006\u001a\u0004\bl\u0010\bR\u001a\u0010m\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\bn\u0010\bR\u001a\u0010o\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\bp\u0010\bR\u001a\u0010q\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010\u0006\u001a\u0004\br\u0010\bR\u001a\u0010s\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010\u0006\u001a\u0004\bt\u0010\bR\u001a\u0010u\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bu\u0010\u0006\u001a\u0004\bv\u0010\bR\u001a\u0010w\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bw\u0010\u0006\u001a\u0004\bx\u0010\bR\u001a\u0010y\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\by\u0010\u0006\u001a\u0004\bz\u0010\bR\u001a\u0010{\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010\u0006\u001a\u0004\b|\u0010\bR\u001a\u0010}\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b}\u0010\u0006\u001a\u0004\b~\u0010\bR\u001b\u0010\u007f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u007f\u0010\u0006\u001a\u0005\b\u0080\u0001\u0010\bR\u001d\u0010\u0081\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0006\u001a\u0005\b\u0082\u0001\u0010\bR\u001d\u0010\u0083\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0006\u001a\u0005\b\u0084\u0001\u0010\bR\u001d\u0010\u0085\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0006\u001a\u0005\b\u0086\u0001\u0010\bR\u001d\u0010\u0087\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0006\u001a\u0005\b\u0088\u0001\u0010\bR\u001d\u0010\u0089\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0006\u001a\u0005\b\u008a\u0001\u0010\bR\u001d\u0010\u008b\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0006\u001a\u0005\b\u008c\u0001\u0010\bR\u001d\u0010\u008d\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0006\u001a\u0005\b\u008e\u0001\u0010\bR\u001d\u0010\u008f\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0006\u001a\u0005\b\u0090\u0001\u0010\bR\u001d\u0010\u0091\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0006\u001a\u0005\b\u0092\u0001\u0010\bR\u001d\u0010\u0093\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u0006\u001a\u0005\b\u0094\u0001\u0010\bR\u001d\u0010\u0095\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0006\u001a\u0005\b\u0096\u0001\u0010\bR\u001d\u0010\u0097\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0006\u001a\u0005\b\u0098\u0001\u0010\bR\u001d\u0010\u0099\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0006\u001a\u0005\b\u009a\u0001\u0010\bR\u001d\u0010\u009b\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0006\u001a\u0005\b\u009c\u0001\u0010\bR\u001d\u0010\u009d\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0006\u001a\u0005\b\u009e\u0001\u0010\bR\u001d\u0010\u009f\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0006\u001a\u0005\b \u0001\u0010\bR\u001d\u0010¡\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0006\u001a\u0005\b¢\u0001\u0010\bR\u001d\u0010£\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b£\u0001\u0010\u0006\u001a\u0005\b¤\u0001\u0010\bR\u001d\u0010¥\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¥\u0001\u0010\u0006\u001a\u0005\b¦\u0001\u0010\bR\u001d\u0010§\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b§\u0001\u0010\u0006\u001a\u0005\b¨\u0001\u0010\bR\u001d\u0010©\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b©\u0001\u0010\u0006\u001a\u0005\bª\u0001\u0010\bR\u001d\u0010«\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b«\u0001\u0010\u0006\u001a\u0005\b¬\u0001\u0010\bR\u001d\u0010\u00ad\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\u0006\u001a\u0005\b®\u0001\u0010\bR\u001d\u0010¯\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¯\u0001\u0010\u0006\u001a\u0005\b°\u0001\u0010\bR\u001d\u0010±\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b±\u0001\u0010\u0006\u001a\u0005\b²\u0001\u0010\bR\u001d\u0010³\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b³\u0001\u0010\u0006\u001a\u0005\b´\u0001\u0010\bR\u001d\u0010µ\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bµ\u0001\u0010\u0006\u001a\u0005\b¶\u0001\u0010\bR\u001d\u0010·\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b·\u0001\u0010\u0006\u001a\u0005\b¸\u0001\u0010\bR\u001d\u0010¹\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¹\u0001\u0010\u0006\u001a\u0005\bº\u0001\u0010\bR\u001d\u0010»\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b»\u0001\u0010\u0006\u001a\u0005\b¼\u0001\u0010\bR\u001d\u0010½\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b½\u0001\u0010\u0006\u001a\u0005\b¾\u0001\u0010\bR\u001d\u0010¿\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¿\u0001\u0010\u0006\u001a\u0005\bÀ\u0001\u0010\bR\u001d\u0010Á\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÁ\u0001\u0010\u0006\u001a\u0005\bÂ\u0001\u0010\bR\u001d\u0010Ã\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÃ\u0001\u0010\u0006\u001a\u0005\bÄ\u0001\u0010\bR\u001d\u0010Å\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÅ\u0001\u0010\u0006\u001a\u0005\bÆ\u0001\u0010\bR\u001d\u0010Ç\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÇ\u0001\u0010\u0006\u001a\u0005\bÈ\u0001\u0010\bR\u001d\u0010É\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÉ\u0001\u0010\u0006\u001a\u0005\bÊ\u0001\u0010\bR\u001d\u0010Ë\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bË\u0001\u0010\u0006\u001a\u0005\bÌ\u0001\u0010\bR\u001d\u0010Í\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÍ\u0001\u0010\u0006\u001a\u0005\bÎ\u0001\u0010\bR\u001d\u0010Ï\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÏ\u0001\u0010\u0006\u001a\u0005\bÐ\u0001\u0010\bR\u001d\u0010Ñ\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÑ\u0001\u0010\u0006\u001a\u0005\bÒ\u0001\u0010\bR\u001d\u0010Ó\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÓ\u0001\u0010\u0006\u001a\u0005\bÔ\u0001\u0010\bR\u001d\u0010Õ\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÕ\u0001\u0010\u0006\u001a\u0005\bÖ\u0001\u0010\bR\u001d\u0010×\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b×\u0001\u0010\u0006\u001a\u0005\bØ\u0001\u0010\bR\u001d\u0010Ù\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÙ\u0001\u0010\u0006\u001a\u0005\bÚ\u0001\u0010\bR\u001d\u0010Û\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÛ\u0001\u0010\u0006\u001a\u0005\bÜ\u0001\u0010\bR\u001d\u0010Ý\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÝ\u0001\u0010\u0006\u001a\u0005\bÞ\u0001\u0010\bR\u001d\u0010ß\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bß\u0001\u0010\u0006\u001a\u0005\bà\u0001\u0010\bR\u001d\u0010á\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bá\u0001\u0010\u0006\u001a\u0005\bâ\u0001\u0010\bR\u001d\u0010ã\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bã\u0001\u0010\u0006\u001a\u0005\bä\u0001\u0010\bR\u001d\u0010å\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bå\u0001\u0010\u0006\u001a\u0005\bæ\u0001\u0010\bR\u001d\u0010ç\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bç\u0001\u0010\u0006\u001a\u0005\bè\u0001\u0010\bR\u001d\u0010é\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bé\u0001\u0010\u0006\u001a\u0005\bê\u0001\u0010\bR\u001d\u0010ë\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bë\u0001\u0010\u0006\u001a\u0005\bì\u0001\u0010\bR\u001d\u0010í\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bí\u0001\u0010\u0006\u001a\u0005\bî\u0001\u0010\bR\u001d\u0010ï\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bï\u0001\u0010\u0006\u001a\u0005\bð\u0001\u0010\bR\u001d\u0010ñ\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bñ\u0001\u0010\u0006\u001a\u0005\bò\u0001\u0010\bR\u001d\u0010ó\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bó\u0001\u0010\u0006\u001a\u0005\bô\u0001\u0010\bR\u001d\u0010õ\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bõ\u0001\u0010\u0006\u001a\u0005\bö\u0001\u0010\bR\u001d\u0010÷\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b÷\u0001\u0010\u0006\u001a\u0005\bø\u0001\u0010\bR\u001d\u0010ù\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bù\u0001\u0010\u0006\u001a\u0005\bú\u0001\u0010\bR\u001d\u0010û\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bû\u0001\u0010\u0006\u001a\u0005\bü\u0001\u0010\bR\u001d\u0010ý\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bý\u0001\u0010\u0006\u001a\u0005\bþ\u0001\u0010\bR\u001d\u0010ÿ\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÿ\u0001\u0010\u0006\u001a\u0005\b\u0080\u0002\u0010\bR\u001d\u0010\u0081\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0002\u0010\u0006\u001a\u0005\b\u0082\u0002\u0010\bR\u001d\u0010\u0083\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0083\u0002\u0010\u0006\u001a\u0005\b\u0084\u0002\u0010\bR\u001d\u0010\u0085\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0085\u0002\u0010\u0006\u001a\u0005\b\u0086\u0002\u0010\bR\u001d\u0010\u0087\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0087\u0002\u0010\u0006\u001a\u0005\b\u0088\u0002\u0010\bR\u001d\u0010\u0089\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0089\u0002\u0010\u0006\u001a\u0005\b\u008a\u0002\u0010\bR\u001d\u0010\u008b\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008b\u0002\u0010\u0006\u001a\u0005\b\u008c\u0002\u0010\bR\u001d\u0010\u008d\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008d\u0002\u0010\u0006\u001a\u0005\b\u008e\u0002\u0010\bR\u001d\u0010\u008f\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008f\u0002\u0010\u0006\u001a\u0005\b\u0090\u0002\u0010\bR\u001d\u0010\u0091\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0091\u0002\u0010\u0006\u001a\u0005\b\u0092\u0002\u0010\bR\u001d\u0010\u0093\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0093\u0002\u0010\u0006\u001a\u0005\b\u0094\u0002\u0010\bR\u001d\u0010\u0095\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0095\u0002\u0010\u0006\u001a\u0005\b\u0096\u0002\u0010\bR\u001d\u0010\u0097\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0097\u0002\u0010\u0006\u001a\u0005\b\u0098\u0002\u0010\bR\u001d\u0010\u0099\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0099\u0002\u0010\u0006\u001a\u0005\b\u009a\u0002\u0010\bR\u001d\u0010\u009b\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009b\u0002\u0010\u0006\u001a\u0005\b\u009c\u0002\u0010\bR\u001d\u0010\u009d\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009d\u0002\u0010\u0006\u001a\u0005\b\u009e\u0002\u0010\bR\u001d\u0010\u009f\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009f\u0002\u0010\u0006\u001a\u0005\b \u0002\u0010\bR\u001d\u0010¡\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¡\u0002\u0010\u0006\u001a\u0005\b¢\u0002\u0010\bR\u001d\u0010£\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b£\u0002\u0010\u0006\u001a\u0005\b¤\u0002\u0010\bR\u001d\u0010¥\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¥\u0002\u0010\u0006\u001a\u0005\b¦\u0002\u0010\bR\u001d\u0010§\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b§\u0002\u0010\u0006\u001a\u0005\b¨\u0002\u0010\bR\u001d\u0010©\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b©\u0002\u0010\u0006\u001a\u0005\bª\u0002\u0010\bR\u001d\u0010«\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b«\u0002\u0010\u0006\u001a\u0005\b¬\u0002\u0010\bR\u001d\u0010\u00ad\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u00ad\u0002\u0010\u0006\u001a\u0005\b®\u0002\u0010\bR\u001d\u0010¯\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¯\u0002\u0010\u0006\u001a\u0005\b°\u0002\u0010\bR\u001d\u0010±\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b±\u0002\u0010\u0006\u001a\u0005\b²\u0002\u0010\bR\u001d\u0010³\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b³\u0002\u0010\u0006\u001a\u0005\b´\u0002\u0010\bR\u001d\u0010µ\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bµ\u0002\u0010\u0006\u001a\u0005\b¶\u0002\u0010\bR\u001d\u0010·\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b·\u0002\u0010\u0006\u001a\u0005\b¸\u0002\u0010\bR\u001d\u0010¹\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¹\u0002\u0010\u0006\u001a\u0005\bº\u0002\u0010\bR\u001d\u0010»\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b»\u0002\u0010\u0006\u001a\u0005\b¼\u0002\u0010\bR\u001d\u0010½\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b½\u0002\u0010\u0006\u001a\u0005\b¾\u0002\u0010\bR\u001d\u0010¿\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¿\u0002\u0010\u0006\u001a\u0005\bÀ\u0002\u0010\bR\u001d\u0010Á\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÁ\u0002\u0010\u0006\u001a\u0005\bÂ\u0002\u0010\bR\u001d\u0010Ã\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÃ\u0002\u0010\u0006\u001a\u0005\bÄ\u0002\u0010\bR\u001d\u0010Å\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÅ\u0002\u0010\u0006\u001a\u0005\bÆ\u0002\u0010\bR\u001d\u0010Ç\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÇ\u0002\u0010\u0006\u001a\u0005\bÈ\u0002\u0010\bR\u001d\u0010É\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÉ\u0002\u0010\u0006\u001a\u0005\bÊ\u0002\u0010\bR\u001d\u0010Ë\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bË\u0002\u0010\u0006\u001a\u0005\bÌ\u0002\u0010\bR\u001d\u0010Í\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÍ\u0002\u0010\u0006\u001a\u0005\bÎ\u0002\u0010\bR\u001d\u0010Ï\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÏ\u0002\u0010\u0006\u001a\u0005\bÐ\u0002\u0010\bR\u001d\u0010Ñ\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÑ\u0002\u0010\u0006\u001a\u0005\bÒ\u0002\u0010\bR\u001d\u0010Ó\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÓ\u0002\u0010\u0006\u001a\u0005\bÔ\u0002\u0010\bR\u001d\u0010Õ\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÕ\u0002\u0010\u0006\u001a\u0005\bÖ\u0002\u0010\bR\u001d\u0010×\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b×\u0002\u0010\u0006\u001a\u0005\bØ\u0002\u0010\bR\u001d\u0010Ù\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÙ\u0002\u0010\u0006\u001a\u0005\bÚ\u0002\u0010\bR\u001d\u0010Û\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÛ\u0002\u0010\u0006\u001a\u0005\bÜ\u0002\u0010\bR\u001d\u0010Ý\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÝ\u0002\u0010\u0006\u001a\u0005\bÞ\u0002\u0010\bR\u001d\u0010ß\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bß\u0002\u0010\u0006\u001a\u0005\bà\u0002\u0010\bR\u001d\u0010á\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bá\u0002\u0010\u0006\u001a\u0005\bâ\u0002\u0010\bR\u001d\u0010ã\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bã\u0002\u0010\u0006\u001a\u0005\bä\u0002\u0010\bR\u001d\u0010å\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bå\u0002\u0010\u0006\u001a\u0005\bæ\u0002\u0010\bR\u001d\u0010ç\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bç\u0002\u0010\u0006\u001a\u0005\bè\u0002\u0010\bR\u001d\u0010é\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bé\u0002\u0010\u0006\u001a\u0005\bê\u0002\u0010\bR\u001d\u0010ë\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bë\u0002\u0010\u0006\u001a\u0005\bì\u0002\u0010\bR\u001d\u0010í\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bí\u0002\u0010\u0006\u001a\u0005\bî\u0002\u0010\bR\u001d\u0010ï\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bï\u0002\u0010\u0006\u001a\u0005\bð\u0002\u0010\bR\u001d\u0010ñ\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bñ\u0002\u0010\u0006\u001a\u0005\bò\u0002\u0010\bR\u001d\u0010ó\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bó\u0002\u0010\u0006\u001a\u0005\bô\u0002\u0010\bR\u001d\u0010õ\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bõ\u0002\u0010\u0006\u001a\u0005\bö\u0002\u0010\bR\u001d\u0010÷\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b÷\u0002\u0010\u0006\u001a\u0005\bø\u0002\u0010\bR\u001d\u0010ù\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bù\u0002\u0010\u0006\u001a\u0005\bú\u0002\u0010\bR\u001d\u0010û\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bû\u0002\u0010\u0006\u001a\u0005\bü\u0002\u0010\bR\u001d\u0010ý\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bý\u0002\u0010\u0006\u001a\u0005\bþ\u0002\u0010\bR\u001d\u0010ÿ\u0002\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÿ\u0002\u0010\u0006\u001a\u0005\b\u0080\u0003\u0010\bR\u001d\u0010\u0081\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0003\u0010\u0006\u001a\u0005\b\u0082\u0003\u0010\bR\u001d\u0010\u0083\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0083\u0003\u0010\u0006\u001a\u0005\b\u0084\u0003\u0010\bR\u001d\u0010\u0085\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0085\u0003\u0010\u0006\u001a\u0005\b\u0086\u0003\u0010\bR\u001d\u0010\u0087\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0087\u0003\u0010\u0006\u001a\u0005\b\u0088\u0003\u0010\bR\u001d\u0010\u0089\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0089\u0003\u0010\u0006\u001a\u0005\b\u008a\u0003\u0010\bR\u001d\u0010\u008b\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008b\u0003\u0010\u0006\u001a\u0005\b\u008c\u0003\u0010\bR\u001d\u0010\u008d\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008d\u0003\u0010\u0006\u001a\u0005\b\u008e\u0003\u0010\bR\u001d\u0010\u008f\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008f\u0003\u0010\u0006\u001a\u0005\b\u0090\u0003\u0010\bR\u001d\u0010\u0091\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0091\u0003\u0010\u0006\u001a\u0005\b\u0092\u0003\u0010\bR\u001d\u0010\u0093\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0093\u0003\u0010\u0006\u001a\u0005\b\u0094\u0003\u0010\bR\u001d\u0010\u0095\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0095\u0003\u0010\u0006\u001a\u0005\b\u0096\u0003\u0010\bR\u001d\u0010\u0097\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0097\u0003\u0010\u0006\u001a\u0005\b\u0098\u0003\u0010\bR\u001d\u0010\u0099\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0099\u0003\u0010\u0006\u001a\u0005\b\u009a\u0003\u0010\bR\u001d\u0010\u009b\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009b\u0003\u0010\u0006\u001a\u0005\b\u009c\u0003\u0010\bR\u001d\u0010\u009d\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009d\u0003\u0010\u0006\u001a\u0005\b\u009e\u0003\u0010\bR\u001d\u0010\u009f\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009f\u0003\u0010\u0006\u001a\u0005\b \u0003\u0010\bR\u001d\u0010¡\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¡\u0003\u0010\u0006\u001a\u0005\b¢\u0003\u0010\bR\u001d\u0010£\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b£\u0003\u0010\u0006\u001a\u0005\b¤\u0003\u0010\bR\u001d\u0010¥\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¥\u0003\u0010\u0006\u001a\u0005\b¦\u0003\u0010\bR\u001d\u0010§\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b§\u0003\u0010\u0006\u001a\u0005\b¨\u0003\u0010\bR\u001d\u0010©\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b©\u0003\u0010\u0006\u001a\u0005\bª\u0003\u0010\bR\u001d\u0010«\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b«\u0003\u0010\u0006\u001a\u0005\b¬\u0003\u0010\bR\u001d\u0010\u00ad\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u00ad\u0003\u0010\u0006\u001a\u0005\b®\u0003\u0010\bR\u001d\u0010¯\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¯\u0003\u0010\u0006\u001a\u0005\b°\u0003\u0010\bR\u001d\u0010±\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b±\u0003\u0010\u0006\u001a\u0005\b²\u0003\u0010\bR\u001d\u0010³\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b³\u0003\u0010\u0006\u001a\u0005\b´\u0003\u0010\bR\u001d\u0010µ\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bµ\u0003\u0010\u0006\u001a\u0005\b¶\u0003\u0010\bR\u001d\u0010·\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b·\u0003\u0010\u0006\u001a\u0005\b¸\u0003\u0010\bR\u001d\u0010¹\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¹\u0003\u0010\u0006\u001a\u0005\bº\u0003\u0010\bR\u001d\u0010»\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b»\u0003\u0010\u0006\u001a\u0005\b¼\u0003\u0010\bR\u001d\u0010½\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b½\u0003\u0010\u0006\u001a\u0005\b¾\u0003\u0010\bR\u001d\u0010¿\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¿\u0003\u0010\u0006\u001a\u0005\bÀ\u0003\u0010\bR\u001d\u0010Á\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÁ\u0003\u0010\u0006\u001a\u0005\bÂ\u0003\u0010\bR\u001d\u0010Ã\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÃ\u0003\u0010\u0006\u001a\u0005\bÄ\u0003\u0010\bR\u001d\u0010Å\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÅ\u0003\u0010\u0006\u001a\u0005\bÆ\u0003\u0010\bR\u001d\u0010Ç\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÇ\u0003\u0010\u0006\u001a\u0005\bÈ\u0003\u0010\bR\u001d\u0010É\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÉ\u0003\u0010\u0006\u001a\u0005\bÊ\u0003\u0010\bR\u001d\u0010Ë\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bË\u0003\u0010\u0006\u001a\u0005\bÌ\u0003\u0010\bR\u001d\u0010Í\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÍ\u0003\u0010\u0006\u001a\u0005\bÎ\u0003\u0010\bR\u001d\u0010Ï\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÏ\u0003\u0010\u0006\u001a\u0005\bÐ\u0003\u0010\bR\u001d\u0010Ñ\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÑ\u0003\u0010\u0006\u001a\u0005\bÒ\u0003\u0010\bR\u001d\u0010Ó\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÓ\u0003\u0010\u0006\u001a\u0005\bÔ\u0003\u0010\bR\u001d\u0010Õ\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÕ\u0003\u0010\u0006\u001a\u0005\bÖ\u0003\u0010\bR\u001d\u0010×\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b×\u0003\u0010\u0006\u001a\u0005\bØ\u0003\u0010\bR\u001d\u0010Ù\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÙ\u0003\u0010\u0006\u001a\u0005\bÚ\u0003\u0010\bR\u001d\u0010Û\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÛ\u0003\u0010\u0006\u001a\u0005\bÜ\u0003\u0010\bR\u001d\u0010Ý\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÝ\u0003\u0010\u0006\u001a\u0005\bÞ\u0003\u0010\bR\u001d\u0010ß\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bß\u0003\u0010\u0006\u001a\u0005\bà\u0003\u0010\bR\u001d\u0010á\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bá\u0003\u0010\u0006\u001a\u0005\bâ\u0003\u0010\bR\u001d\u0010ã\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bã\u0003\u0010\u0006\u001a\u0005\bä\u0003\u0010\bR\u001d\u0010å\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bå\u0003\u0010\u0006\u001a\u0005\bæ\u0003\u0010\bR\u001d\u0010ç\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bç\u0003\u0010\u0006\u001a\u0005\bè\u0003\u0010\bR\u001d\u0010é\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bé\u0003\u0010\u0006\u001a\u0005\bê\u0003\u0010\bR\u001d\u0010ë\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bë\u0003\u0010\u0006\u001a\u0005\bì\u0003\u0010\bR\u001d\u0010í\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bí\u0003\u0010\u0006\u001a\u0005\bî\u0003\u0010\bR\u001d\u0010ï\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bï\u0003\u0010\u0006\u001a\u0005\bð\u0003\u0010\bR\u001d\u0010ñ\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bñ\u0003\u0010\u0006\u001a\u0005\bò\u0003\u0010\bR\u001d\u0010ó\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bó\u0003\u0010\u0006\u001a\u0005\bô\u0003\u0010\bR\u001d\u0010õ\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bõ\u0003\u0010\u0006\u001a\u0005\bö\u0003\u0010\bR\u001d\u0010÷\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b÷\u0003\u0010\u0006\u001a\u0005\bø\u0003\u0010\bR\u001d\u0010ù\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bù\u0003\u0010\u0006\u001a\u0005\bú\u0003\u0010\bR\u001d\u0010û\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bû\u0003\u0010\u0006\u001a\u0005\bü\u0003\u0010\bR\u001d\u0010ý\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bý\u0003\u0010\u0006\u001a\u0005\bþ\u0003\u0010\bR\u001d\u0010ÿ\u0003\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÿ\u0003\u0010\u0006\u001a\u0005\b\u0080\u0004\u0010\bR\u001d\u0010\u0081\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0004\u0010\u0006\u001a\u0005\b\u0082\u0004\u0010\bR\u001d\u0010\u0083\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0083\u0004\u0010\u0006\u001a\u0005\b\u0084\u0004\u0010\bR\u001d\u0010\u0085\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0085\u0004\u0010\u0006\u001a\u0005\b\u0086\u0004\u0010\bR\u001d\u0010\u0087\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0087\u0004\u0010\u0006\u001a\u0005\b\u0088\u0004\u0010\bR\u001d\u0010\u0089\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0089\u0004\u0010\u0006\u001a\u0005\b\u008a\u0004\u0010\bR\u001d\u0010\u008b\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008b\u0004\u0010\u0006\u001a\u0005\b\u008c\u0004\u0010\bR\u001d\u0010\u008d\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008d\u0004\u0010\u0006\u001a\u0005\b\u008e\u0004\u0010\bR\u001d\u0010\u008f\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008f\u0004\u0010\u0006\u001a\u0005\b\u0090\u0004\u0010\bR\u001d\u0010\u0091\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0091\u0004\u0010\u0006\u001a\u0005\b\u0092\u0004\u0010\bR\u001d\u0010\u0093\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0093\u0004\u0010\u0006\u001a\u0005\b\u0094\u0004\u0010\bR\u001d\u0010\u0095\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0095\u0004\u0010\u0006\u001a\u0005\b\u0096\u0004\u0010\bR\u001d\u0010\u0097\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0097\u0004\u0010\u0006\u001a\u0005\b\u0098\u0004\u0010\bR\u001d\u0010\u0099\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0099\u0004\u0010\u0006\u001a\u0005\b\u009a\u0004\u0010\bR\u001d\u0010\u009b\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009b\u0004\u0010\u0006\u001a\u0005\b\u009c\u0004\u0010\bR\u001d\u0010\u009d\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009d\u0004\u0010\u0006\u001a\u0005\b\u009e\u0004\u0010\bR\u001d\u0010\u009f\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009f\u0004\u0010\u0006\u001a\u0005\b \u0004\u0010\bR\u001d\u0010¡\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¡\u0004\u0010\u0006\u001a\u0005\b¢\u0004\u0010\bR\u001d\u0010£\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b£\u0004\u0010\u0006\u001a\u0005\b¤\u0004\u0010\bR\u001d\u0010¥\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¥\u0004\u0010\u0006\u001a\u0005\b¦\u0004\u0010\bR\u001d\u0010§\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b§\u0004\u0010\u0006\u001a\u0005\b¨\u0004\u0010\bR\u001d\u0010©\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b©\u0004\u0010\u0006\u001a\u0005\bª\u0004\u0010\bR\u001d\u0010«\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b«\u0004\u0010\u0006\u001a\u0005\b¬\u0004\u0010\bR\u001d\u0010\u00ad\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u00ad\u0004\u0010\u0006\u001a\u0005\b®\u0004\u0010\bR\u001d\u0010¯\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¯\u0004\u0010\u0006\u001a\u0005\b°\u0004\u0010\bR\u001d\u0010±\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b±\u0004\u0010\u0006\u001a\u0005\b²\u0004\u0010\bR\u001d\u0010³\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b³\u0004\u0010\u0006\u001a\u0005\b´\u0004\u0010\bR\u001d\u0010µ\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bµ\u0004\u0010\u0006\u001a\u0005\b¶\u0004\u0010\bR\u001d\u0010·\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b·\u0004\u0010\u0006\u001a\u0005\b¸\u0004\u0010\bR\u001d\u0010¹\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¹\u0004\u0010\u0006\u001a\u0005\bº\u0004\u0010\bR\u001d\u0010»\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b»\u0004\u0010\u0006\u001a\u0005\b¼\u0004\u0010\bR\u001d\u0010½\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b½\u0004\u0010\u0006\u001a\u0005\b¾\u0004\u0010\bR\u001d\u0010¿\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¿\u0004\u0010\u0006\u001a\u0005\bÀ\u0004\u0010\bR\u001d\u0010Á\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÁ\u0004\u0010\u0006\u001a\u0005\bÂ\u0004\u0010\bR\u001d\u0010Ã\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÃ\u0004\u0010\u0006\u001a\u0005\bÄ\u0004\u0010\bR\u001d\u0010Å\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÅ\u0004\u0010\u0006\u001a\u0005\bÆ\u0004\u0010\bR\u001d\u0010Ç\u0004\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bÇ\u0004\u0010\u0006\u001a\u0005\bÈ\u0004\u0010\bR \u0010Ê\u0004\u001a\u00030É\u00048\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\bÊ\u0004\u0010Ë\u0004\u001a\u0006\bÌ\u0004\u0010Í\u0004"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/Mutation$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "__closeAccount_input", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "get__closeAccount_input", "()Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "__reportSpamActivity_input", "get__reportSpamActivity_input", "__initiateInstantRefund_input", "get__initiateInstantRefund_input", "__logActivityAction_input", "get__logActivityAction_input", "__createAccountActivityLog_input", "get__createAccountActivityLog_input", "__createAgenticSession_input", "get__createAgenticSession_input", "__sendAgenticMessage_input", "get__sendAgenticMessage_input", "__closeAgenticSession_input", "get__closeAgenticSession_input", "__disableBalanceAutoReload_input", "get__disableBalanceAutoReload_input", "__createBalanceAutoReload_input", "get__createBalanceAutoReload_input", "__updateBalanceAutoReload_input", "get__updateBalanceAutoReload_input", "__createCardConnectSession_input", "get__createCardConnectSession_input", "__createDebitInstrument_input", "get__createDebitInstrument_input", "__activatePhysicalDebitInstrument_input", "get__activatePhysicalDebitInstrument_input", "__setDebitInstrumentPin_input", "get__setDebitInstrumentPin_input", "__updateDebitInstrumentBillingAddress_input", "get__updateDebitInstrumentBillingAddress_input", "__closeDebitInstrument_input", "get__closeDebitInstrument_input", "__deactivateDebitInstrument_input", "get__deactivateDebitInstrument_input", "__unlockDebitInstrument_input", "get__unlockDebitInstrument_input", "__reportDebitCardLost_input", "get__reportDebitCardLost_input", "__reissueDebitInstrument_input", "get__reissueDebitInstrument_input", "__replaceVirtualDebitInstrument_input", "get__replaceVirtualDebitInstrument_input", "__validateDebitInstrumentAddress_input", "get__validateDebitInstrumentAddress_input", "__evaluateDebitInstrumentFundingOptions_input", "get__evaluateDebitInstrumentFundingOptions_input", "__createDebitInstrumentDigitizationData_input", "get__createDebitInstrumentDigitizationData_input", "__provisionDebitInstrument_input", "get__provisionDebitInstrument_input", "__addDebitInstrumentAddress_input", "get__addDebitInstrumentAddress_input", "__requestPhysicalDebitInstrument_input", "get__requestPhysicalDebitInstrument_input", "__setFinancialInstrumentPreference_input", "get__setFinancialInstrumentPreference_input", "__removeFinancialInstrumentPreference_input", "get__removeFinancialInstrumentPreference_input", "__setDebitInstrumentFundingOptions_input", "get__setDebitInstrumentFundingOptions_input", "__removeDebitInstrumentFundingOptions_input", "get__removeDebitInstrumentFundingOptions_input", "__provisionVirtualBankAccount_input", "get__provisionVirtualBankAccount_input", "__linkDirectDepositAccountToPayrollProvider_input", "get__linkDirectDepositAccountToPayrollProvider_input", "__updateDirectDebitStatus_input", "get__updateDirectDebitStatus_input", "__updateSmartRoutePreferences_input", "get__updateSmartRoutePreferences_input", "__subscribeToPushNotifications_input", "get__subscribeToPushNotifications_input", "__unsubscribeFromPushNotifications_input", "get__unsubscribeFromPushNotifications_input", "__updatePushNotificationPreferences_input", "get__updatePushNotificationPreferences_input", "__processPushNotificationAction_input", "get__processPushNotificationAction_input", "__updateNotificationsTrackingStatus_input", "get__updateNotificationsTrackingStatus_input", "__updatePaymentTransferAttemptAmountAndIntent_input", "get__updatePaymentTransferAttemptAmountAndIntent_input", "__updatePaymentTransferAttemptNote_input", "get__updatePaymentTransferAttemptNote_input", "__updatePaymentTransferAttemptTransferType_input", "get__updatePaymentTransferAttemptTransferType_input", "__updatePaymentTransferAttemptReceiver_input", "get__updatePaymentTransferAttemptReceiver_input", "__updatePaymentTransferAttemptRecipient_input", "get__updatePaymentTransferAttemptRecipient_input", "__executePaymentTransfer_input", "get__executePaymentTransfer_input", "__completePendingPaymentTransfer_input", "get__completePendingPaymentTransfer_input", "__resolvePlanContingencyForTransferAttempt_input", "get__resolvePlanContingencyForTransferAttempt_input", "__resolvePaymentContingencyForTransferAttempt_input", "get__resolvePaymentContingencyForTransferAttempt_input", "__startPaymentTransferAttemptForSubflow_input", "get__startPaymentTransferAttemptForSubflow_input", "__updatePaymentTransferAttemptCurrencyConversionProvider_input", "get__updatePaymentTransferAttemptCurrencyConversionProvider_input", "__addFinancialInstrumentsToPaymentTransferAttempt_input", "get__addFinancialInstrumentsToPaymentTransferAttempt_input", "__cancelPaymentRequest_input", "get__cancelPaymentRequest_input", "__cancelPaymentTransfer_input", "get__cancelPaymentTransfer_input", "__requestOnboardingPhoneConfirmationCode_input", "get__requestOnboardingPhoneConfirmationCode_input", "__confirmOnboardingPhoneConfirmationCode_input", "get__confirmOnboardingPhoneConfirmationCode_input", "__requestOnboardingEmailConfirmationCode_input", "get__requestOnboardingEmailConfirmationCode_input", "__confirmOnboardingEmailConfirmationCode_input", "get__confirmOnboardingEmailConfirmationCode_input", "__createAccount_input", "get__createAccount_input", "__onboard_input", "get__onboard_input", "__setBnplAutopay_input", "get__setBnplAutopay_input", "__cancelBnplAutopay_input", "get__cancelBnplAutopay_input", "__createBnplPreSnoozeContract_input", "get__createBnplPreSnoozeContract_input", "__makeBnplPayment_input", "get__makeBnplPayment_input", "__enrollInBnplPlanProgram_input", "get__enrollInBnplPlanProgram_input", "__checkBnplApplicationEligibility_input", "get__checkBnplApplicationEligibility_input", "__closeBnplLoan_input", "get__closeBnplLoan_input", "__createBnplApplicationSession_input", "get__createBnplApplicationSession_input", "__evaluateBnplProductOffers_input", "get__evaluateBnplProductOffers_input", "__evaluateBnplProvisionEligibilityAndReplaceCard_input", "get__evaluateBnplProvisionEligibilityAndReplaceCard_input", "__initializeBnplApplication_input", "get__initializeBnplApplication_input", "__prepareBnplDigitizationData_input", "get__prepareBnplDigitizationData_input", "__submitBnplApplication_input", "get__submitBnplApplication_input", "__updateBnplApplication_input", "get__updateBnplApplication_input", "__cancelRevolvingCreditPayment_input", "get__cancelRevolvingCreditPayment_input", "__redeemRevolvingCreditReward_input", "get__redeemRevolvingCreditReward_input", "__updateRevolvingCreditAutopay_input", "get__updateRevolvingCreditAutopay_input", "__makeRevolvingCreditPayment_input", "get__makeRevolvingCreditPayment_input", "__updateRevolvingCreditInstrumentStatus_input", "get__updateRevolvingCreditInstrumentStatus_input", "__setRevolvingCreditInstrumentStatus_input", "get__setRevolvingCreditInstrumentStatus_input", "__updateRevolvingCreditNotificationPreference_input", "get__updateRevolvingCreditNotificationPreference_input", "__updateRevolvingCreditLineIncreaseOfferStatus_input", "get__updateRevolvingCreditLineIncreaseOfferStatus_input", "__updateRevolvingCreditCustomerProfile_input", "get__updateRevolvingCreditCustomerProfile_input", "__activateRevolvingCreditCard_input", "get__activateRevolvingCreditCard_input", "__enrollInRevolvingCreditPaymentSecurity_input", "get__enrollInRevolvingCreditPaymentSecurity_input", "__prepareRevolvingCreditDigitizationData_input", "get__prepareRevolvingCreditDigitizationData_input", "__addRevolvingCreditCustomerProfile_input", "get__addRevolvingCreditCustomerProfile_input", "__reissueRevolvingCreditInstrument_input", "get__reissueRevolvingCreditInstrument_input", "__requestRevolvingCreditLineIncrease_input", "get__requestRevolvingCreditLineIncrease_input", "__updateRevolvingCreditLineIncreaseOfferPreference_input", "get__updateRevolvingCreditLineIncreaseOfferPreference_input", "__updateRevolvingCreditApplication_input", "get__updateRevolvingCreditApplication_input", "__continueRevolvingCreditApplication_input", "get__continueRevolvingCreditApplication_input", "__submitRevolvingCreditApplication_input", "get__submitRevolvingCreditApplication_input", "__verifyRevolvingCreditIdentity_input", "get__verifyRevolvingCreditIdentity_input", "__cancelRevolvingCreditApplication_input", "get__cancelRevolvingCreditApplication_input", "__deleteCryptocurrencyAddressBookEntry_input", "get__deleteCryptocurrencyAddressBookEntry_input", "__createCryptocurrencyAddressBookEntry_input", "get__createCryptocurrencyAddressBookEntry_input", "__updateCryptocurrencyAddressBookEntry_input", "get__updateCryptocurrencyAddressBookEntry_input", "__rolloverCryptocurrency_input", "get__rolloverCryptocurrency_input", "__pauseCryptocurrencyRecurringSubscription_input", "get__pauseCryptocurrencyRecurringSubscription_input", "__resumeCryptocurrencyRecurringSubscription_input", "get__resumeCryptocurrencyRecurringSubscription_input", "__cancelCryptocurrencyRecurringSubscription_input", "get__cancelCryptocurrencyRecurringSubscription_input", "__createCryptocurrencyPreference_input", "get__createCryptocurrencyPreference_input", "__updateCryptocurrencyPreferences_input", "get__updateCryptocurrencyPreferences_input", "__resolveCryptocurrencyTradeContingencies_input", "get__resolveCryptocurrencyTradeContingencies_input", "__updateCryptocurrencyAlertSettings_input", "get__updateCryptocurrencyAlertSettings_input", "__executeCryptocurrencyTrade_input", "get__executeCryptocurrencyTrade_input", "__updateCryptocurrencyRecurringTradeSubscription_input", "get__updateCryptocurrencyRecurringTradeSubscription_input", "__createCryptocurrencyRecurringTradeSubscription_input", "get__createCryptocurrencyRecurringTradeSubscription_input", "__evaluateCryptocurrencyEligibleFundingOptions_input", "get__evaluateCryptocurrencyEligibleFundingOptions_input", "__generateCryptocurrencyQuote_input", "get__generateCryptocurrencyQuote_input", "__evaluateCryptocurrencyTrade_input", "get__evaluateCryptocurrencyTrade_input", "__generateCryptocurrencyAddress_input", "get__generateCryptocurrencyAddress_input", "__validateCryptocurrencyAddress_input", "get__validateCryptocurrencyAddress_input", "__executeCryptocurrencyTransfer_input", "get__executeCryptocurrencyTransfer_input", "__evaluateEligibleCryptocurrencyAssets_input", "get__evaluateEligibleCryptocurrencyAssets_input", "__processCryptocurrencyOrders_input", "get__processCryptocurrencyOrders_input", "__updatePersonalizedAds_input", "get__updatePersonalizedAds_input", "__updatePersonalizedOffers_input", "get__updatePersonalizedOffers_input", "__updatePersonalizedShoppingConsent_input", "get__updatePersonalizedShoppingConsent_input", "__updateFaceScanStatus_input", "get__updateFaceScanStatus_input", "__updateShareWithThirdParties_input", "get__updateShareWithThirdParties_input", "__updateAllowFindByIdentifiers_input", "get__updateAllowFindByIdentifiers_input", "__updateAllowPaymentRequests_input", "get__updateAllowPaymentRequests_input", "__updatePaymentRequestsFrom_input", "get__updatePaymentRequestsFrom_input", "__updateAllowFindViaPayPalMe_input", "get__updateAllowFindViaPayPalMe_input", "__updateAllowFindByName_input", "get__updateAllowFindByName_input", "__updateAllowFindByUsername_input", "get__updateAllowFindByUsername_input", "__updateAllowFindByEmailAndPhone_input", "get__updateAllowFindByEmailAndPhone_input", "__updateAllowRequestMoneyByEmail_input", "get__updateAllowRequestMoneyByEmail_input", "__updateAllowRequestMoneyByPhone_input", "get__updateAllowRequestMoneyByPhone_input", "__updateAllowRequestMoneyByName_input", "get__updateAllowRequestMoneyByName_input", "__updateAllowRequestMoneyByUsername_input", "get__updateAllowRequestMoneyByUsername_input", "__updateAllowSendMoneyByEmail_input", "get__updateAllowSendMoneyByEmail_input", "__updateAllowSendMoneyByPhone_input", "get__updateAllowSendMoneyByPhone_input", "__updateAllowSendMoneyByName_input", "get__updateAllowSendMoneyByName_input", "__updateAllowSendMoneyByUsername_input", "get__updateAllowSendMoneyByUsername_input", "__updateAllowVenmoDiscovery_input", "get__updateAllowVenmoDiscovery_input", "__deleteAuthConsent_input", "get__deleteAuthConsent_input", "__removeProviderConsentWithData_input", "get__removeProviderConsentWithData_input", "__deactivateAuthConsent_input", "get__deactivateAuthConsent_input", "__prepareCardForDigitization_input", "get__prepareCardForDigitization_input", "__suspendDeviceWalletCardToken_input", "get__suspendDeviceWalletCardToken_input", "__resumeDeviceWalletCardToken_input", "get__resumeDeviceWalletCardToken_input", "__syncDeviceWalletCardToken_input", "get__syncDeviceWalletCardToken_input", "__closeDeviceWalletCardToken_input", "get__closeDeviceWalletCardToken_input", "__closeDeviceWalletCardTokens_input", "get__closeDeviceWalletCardTokens_input", "__redeemPointsToCharity_input", "get__redeemPointsToCharity_input", "__submitMosaicPageForm_input", "get__submitMosaicPageForm_input", "__authenticate_input", "get__authenticate_input", "__deliverStepUpIdentityChallenge_input", "get__deliverStepUpIdentityChallenge_input", "__validateStepUpIdentityChallenge_input", "get__validateStepUpIdentityChallenge_input", "__bindAuthenticationDevice_input", "get__bindAuthenticationDevice_input", "__unbindAuthenticationDevice_input", "get__unbindAuthenticationDevice_input", "__createPasskeyRegistrationOption_input", "get__createPasskeyRegistrationOption_input", "__createPasskey_input", "get__createPasskey_input", "__deletePasskey_input", "get__deletePasskey_input", "__requestPhoneConfirmationCode_input", "get__requestPhoneConfirmationCode_input", "__confirmPhoneConfirmationCode_input", "get__confirmPhoneConfirmationCode_input", "__confirmEmail_input", "get__confirmEmail_input", "__changePassword_input", "get__changePassword_input", "__endAuthenticationSession_input", "get__endAuthenticationSession_input", "__exchangeAccessTokenForAuthorizationCode_input", "get__exchangeAccessTokenForAuthorizationCode_input", "__exchangeAuthorizationCodeForAccessToken_input", "get__exchangeAuthorizationCodeForAccessToken_input", "__registerDevice_input", "get__registerDevice_input", "__validateAlert_input", "get__validateAlert_input", "__validateConnect_input", "get__validateConnect_input", "__addPartyBillingAddress_input", "get__addPartyBillingAddress_input", "__addPartyEmail_input", "get__addPartyEmail_input", "__deletePartyEmail_input", "get__deletePartyEmail_input", "__makePrimaryPartyEmail_input", "get__makePrimaryPartyEmail_input", "__replacePrimaryPartyEmail_input", "get__replacePrimaryPartyEmail_input", "__updatePartyEmail_input", "get__updatePartyEmail_input", "__initiateEmailConfirmation_input", "get__initiateEmailConfirmation_input", "__reinitiateEmailConfirmation_input", "get__reinitiateEmailConfirmation_input", "__verifyPartyEmailWithOtp_input", "get__verifyPartyEmailWithOtp_input", "__verifyPartyEmailWithGoogleSignIn_input", "get__verifyPartyEmailWithGoogleSignIn_input", "__reconfirmPartyEmail_input", "get__reconfirmPartyEmail_input", "__updatePartyProfilePicture_input", "get__updatePartyProfilePicture_input", "__addPartyPhone_input", "get__addPartyPhone_input", "__replacePartyPhone_input", "get__replacePartyPhone_input", "__deletePartyPhone_input", "get__deletePartyPhone_input", "__updatePartyPhone_input", "get__updatePartyPhone_input", "__replacePrimaryPartyPhone_input", "get__replacePrimaryPartyPhone_input", "__initiatePartyPhoneConfirmation_input", "get__initiatePartyPhoneConfirmation_input", "__reinitiatePartyPhoneConfirmation_input", "get__reinitiatePartyPhoneConfirmation_input", "__verifyPartyPhone_input", "get__verifyPartyPhone_input", "__updateUserConsent_input", "get__updateUserConsent_input", "__updatePartyAddress_input", "get__updatePartyAddress_input", "__deletePartyAddress_input", "get__deletePartyAddress_input", "__makePrimaryPartyAddress_input", "get__makePrimaryPartyAddress_input", "__replacePrimaryPartyAddress_input", "get__replacePrimaryPartyAddress_input", "__createInvoice_input", "get__createInvoice_input", "__updateInvoice_input", "get__updateInvoice_input", "__deleteInvoice_id", "get__deleteInvoice_id", "__deleteInvoiceV2_id", "get__deleteInvoiceV2_id", "__sendInvoice_input", "get__sendInvoice_input", "__cancelInvoice_input", "get__cancelInvoice_input", "__cancelInvoiceV2_input", "get__cancelInvoiceV2_input", "__saveInvoiceReminder_input", "get__saveInvoiceReminder_input", "__saveInvoiceReminderV2_input", "get__saveInvoiceReminderV2_input", "__saveInvoicePayment_input", "get__saveInvoicePayment_input", "__saveInvoiceRefund_input", "get__saveInvoiceRefund_input", "__createMerchantItem_input", "get__createMerchantItem_input", "__updateMerchantItem_input", "get__updateMerchantItem_input", "__updateMerchantItemV2_input", "get__updateMerchantItemV2_input", "__deleteMerchantItem_id", "get__deleteMerchantItem_id", "__deleteMerchantItemV2_id", "get__deleteMerchantItemV2_id", "__createMerchantTax_input", "get__createMerchantTax_input", "__updateMerchantTax_input", "get__updateMerchantTax_input", "__updateMerchantTaxV2_input", "get__updateMerchantTaxV2_input", "__deleteMerchantTax_id", "get__deleteMerchantTax_id", "__deleteMerchantTaxV2_id", "get__deleteMerchantTaxV2_id", "__createMoneybox_input", "get__createMoneybox_input", "__updateMoneybox_input", "get__updateMoneybox_input", "__deleteMoneybox_input", "get__deleteMoneybox_input", "__transferMoneybox_input", "get__transferMoneybox_input", "__createMoneyboxTransferSchedule_input", "get__createMoneyboxTransferSchedule_input", "__updateMoneyboxTransferSchedule_input", "get__updateMoneyboxTransferSchedule_input", "__pauseMoneyboxTransferSchedule_input", "get__pauseMoneyboxTransferSchedule_input", "__deleteMoneyboxTransferSchedule_input", "get__deleteMoneyboxTransferSchedule_input", "__disableBalanceAutoTransfer_input", "get__disableBalanceAutoTransfer_input", "__acknowledgeMoneyboxTargetReached_input", "get__acknowledgeMoneyboxTargetReached_input", "__authorizePackageTracking_input", "get__authorizePackageTracking_input", "__deauthorizePackageTracking_input", "get__deauthorizePackageTracking_input", "__deauthorizePackageTrackingForAllProviders_input", "get__deauthorizePackageTrackingForAllProviders_input", "__markPackageAsDelivered_input", "get__markPackageAsDelivered_input", "__updatePackageNickname_input", "get__updatePackageNickname_input", "__deletePackage_input", "get__deletePackage_input", "__savePackageTrackingUserPreference_input", "get__savePackageTrackingUserPreference_input", "__createMoneyPool_input", "get__createMoneyPool_input", "__updateMoneyPool_input", "get__updateMoneyPool_input", "__closeMoneyPool_input", "get__closeMoneyPool_input", "__createSubjectAccessRequest_input", "get__createSubjectAccessRequest_input", "__enrollInPromotionOffer_input", "get__enrollInPromotionOffer_input", "__enrollInLoyaltyProgram_input", "get__enrollInLoyaltyProgram_input", "__redeemPointsToBalance_input", "get__redeemPointsToBalance_input", "__redeemPointsToSavings_input", "get__redeemPointsToSavings_input", "__blockContact_input", "get__blockContact_input", "__createContact_input", "get__createContact_input", "__updateContact_input", "get__updateContact_input", "__unblockContact_input", "get__unblockContact_input", "__favoriteContact_input", "get__favoriteContact_input", "__unfavoriteContact_input", "get__unfavoriteContact_input", "__deleteContact_input", "get__deleteContact_input", "__createRecentSearch_input", "get__createRecentSearch_input", "__deleteRecentSearch_id", "get__deleteRecentSearch_id", "__deleteRecentSearches_input", "get__deleteRecentSearches_input", "__scanQrCode_input", "get__scanQrCode_input", "__cancelQrCodePayment_input", "get__cancelQrCodePayment_input", "__enrollConsumerPresentedQrCode_input", "get__enrollConsumerPresentedQrCode_input", "__confirmQrCodePayment_input", "get__confirmQrCodePayment_input", "__generateConsumerPresentedQrCode_input", "get__generateConsumerPresentedQrCode_input", "__provisionSavingsAccount_input", "get__provisionSavingsAccount_input", "__updateSavingsApplication_input", "get__updateSavingsApplication_input", "__updateSavingsAccount_input", "get__updateSavingsAccount_input", "__disableConsumerAgreement_id", "get__disableConsumerAgreement_id", "__updatePreferredFundingInstruments_input", "get__updatePreferredFundingInstruments_input", "__createTaxReconciliationReport_input", "get__createTaxReconciliationReport_input", "__requestTaxReportSelfCorrection_input", "get__requestTaxReportSelfCorrection_input", "__requestTaxDocument_input", "get__requestTaxDocument_input", "__initiateExternalBankAccess_input", "get__initiateExternalBankAccess_input", "__confirmBankAccount_input", "get__confirmBankAccount_input", "__updateBankAccount_input", "get__updateBankAccount_input", "__addBankAccount_input", "get__addBankAccount_input", "__removeBankAccount_input", "get__removeBankAccount_input", "__linkExternalBankAccounts_input", "get__linkExternalBankAccounts_input", "__addCard_input", "get__addCard_input", "__updateCard_input", "get__updateCard_input", "__removeCard_id", "get__removeCard_id", "__confirmCard_input", "get__confirmCard_input", "__generateThreeDsSupplementalData_input", "get__generateThreeDsSupplementalData_input", "__updateCardsBillingAddress_input", "get__updateCardsBillingAddress_input", "__updateTransfersMetadata_input", "get__updateTransfersMetadata_input", "__addDeposit_input", "get__addDeposit_input", "__withdrawFunds_input", "get__withdrawFunds_input", "__resolveDepositContingencies_input", "get__resolveDepositContingencies_input", "__cancelTransfer_input", "get__cancelTransfer_input", "__setPaymentPreference_input", "get__setPaymentPreference_input", "__updatePaymentPreference_input", "get__updatePaymentPreference_input", "__removePaymentToken_input", "get__removePaymentToken_input", "__setProvisionFlowMetadata_input", "get__setProvisionFlowMetadata_input", "__createThirdPartyLoyaltyCard_input", "get__createThirdPartyLoyaltyCard_input", "__updateThirdPartyLoyaltyCard_input", "get__updateThirdPartyLoyaltyCard_input", "__patchThirdPartyLoyaltyCard_input", "get__patchThirdPartyLoyaltyCard_input", "__deleteThirdPartyLoyaltyCard_id", "get__deleteThirdPartyLoyaltyCard_id", "__uploadThirdPartyLoyaltyCardCustomImage_input", "get__uploadThirdPartyLoyaltyCardCustomImage_input", "__deleteThirdPartyLoyaltyCardCustomImage_input", "get__deleteThirdPartyLoyaltyCardCustomImage_input", "Lcom/apollographql/apollo/api/ObjectType;", "type", "Lcom/apollographql/apollo/api/ObjectType;", "getType", "()Lcom/apollographql/apollo/api/ObjectType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__closeAccount_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__closeAccount_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__reportSpamActivity_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__reportSpamActivity_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__initiateInstantRefund_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__initiateInstantRefund_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__logActivityAction_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__logActivityAction_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createAccountActivityLog_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createAccountActivityLog_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createAgenticSession_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createAgenticSession_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__sendAgenticMessage_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__sendAgenticMessage_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__closeAgenticSession_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__closeAgenticSession_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__disableBalanceAutoReload_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__disableBalanceAutoReload_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createBalanceAutoReload_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createBalanceAutoReload_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateBalanceAutoReload_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateBalanceAutoReload_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createCardConnectSession_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createCardConnectSession_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createDebitInstrument_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createDebitInstrument_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__activatePhysicalDebitInstrument_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__activatePhysicalDebitInstrument_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__setDebitInstrumentPin_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__setDebitInstrumentPin_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateDebitInstrumentBillingAddress_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateDebitInstrumentBillingAddress_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__closeDebitInstrument_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__closeDebitInstrument_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deactivateDebitInstrument_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deactivateDebitInstrument_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__unlockDebitInstrument_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__unlockDebitInstrument_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__reportDebitCardLost_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__reportDebitCardLost_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__reissueDebitInstrument_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__reissueDebitInstrument_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__replaceVirtualDebitInstrument_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__replaceVirtualDebitInstrument_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__validateDebitInstrumentAddress_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__validateDebitInstrumentAddress_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__evaluateDebitInstrumentFundingOptions_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__evaluateDebitInstrumentFundingOptions_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createDebitInstrumentDigitizationData_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createDebitInstrumentDigitizationData_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__provisionDebitInstrument_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__provisionDebitInstrument_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addDebitInstrumentAddress_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__addDebitInstrumentAddress_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__requestPhysicalDebitInstrument_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__requestPhysicalDebitInstrument_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__setFinancialInstrumentPreference_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__setFinancialInstrumentPreference_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__removeFinancialInstrumentPreference_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__removeFinancialInstrumentPreference_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__setDebitInstrumentFundingOptions_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__setDebitInstrumentFundingOptions_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__removeDebitInstrumentFundingOptions_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__removeDebitInstrumentFundingOptions_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__provisionVirtualBankAccount_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__provisionVirtualBankAccount_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__linkDirectDepositAccountToPayrollProvider_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__linkDirectDepositAccountToPayrollProvider_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateDirectDebitStatus_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateDirectDebitStatus_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateSmartRoutePreferences_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateSmartRoutePreferences_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__subscribeToPushNotifications_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__subscribeToPushNotifications_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__unsubscribeFromPushNotifications_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__unsubscribeFromPushNotifications_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePushNotificationPreferences_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePushNotificationPreferences_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__processPushNotificationAction_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__processPushNotificationAction_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateNotificationsTrackingStatus_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateNotificationsTrackingStatus_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePaymentTransferAttemptAmountAndIntent_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePaymentTransferAttemptAmountAndIntent_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePaymentTransferAttemptNote_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePaymentTransferAttemptNote_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePaymentTransferAttemptTransferType_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePaymentTransferAttemptTransferType_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePaymentTransferAttemptReceiver_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePaymentTransferAttemptReceiver_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePaymentTransferAttemptRecipient_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePaymentTransferAttemptRecipient_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__executePaymentTransfer_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__executePaymentTransfer_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__completePendingPaymentTransfer_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__completePendingPaymentTransfer_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__resolvePlanContingencyForTransferAttempt_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__resolvePlanContingencyForTransferAttempt_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__resolvePaymentContingencyForTransferAttempt_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__resolvePaymentContingencyForTransferAttempt_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__startPaymentTransferAttemptForSubflow_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__startPaymentTransferAttemptForSubflow_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePaymentTransferAttemptCurrencyConversionProvider_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePaymentTransferAttemptCurrencyConversionProvider_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addFinancialInstrumentsToPaymentTransferAttempt_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__addFinancialInstrumentsToPaymentTransferAttempt_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cancelPaymentRequest_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__cancelPaymentRequest_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cancelPaymentTransfer_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__cancelPaymentTransfer_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__requestOnboardingPhoneConfirmationCode_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__requestOnboardingPhoneConfirmationCode_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__confirmOnboardingPhoneConfirmationCode_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__confirmOnboardingPhoneConfirmationCode_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__requestOnboardingEmailConfirmationCode_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__requestOnboardingEmailConfirmationCode_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__confirmOnboardingEmailConfirmationCode_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__confirmOnboardingEmailConfirmationCode_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createAccount_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createAccount_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__onboard_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__onboard_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__setBnplAutopay_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__setBnplAutopay_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cancelBnplAutopay_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__cancelBnplAutopay_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createBnplPreSnoozeContract_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createBnplPreSnoozeContract_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__makeBnplPayment_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__makeBnplPayment_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__enrollInBnplPlanProgram_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__enrollInBnplPlanProgram_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__checkBnplApplicationEligibility_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__checkBnplApplicationEligibility_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__closeBnplLoan_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__closeBnplLoan_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createBnplApplicationSession_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createBnplApplicationSession_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__evaluateBnplProductOffers_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__evaluateBnplProductOffers_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__evaluateBnplProvisionEligibilityAndReplaceCard_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__evaluateBnplProvisionEligibilityAndReplaceCard_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__initializeBnplApplication_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__initializeBnplApplication_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__prepareBnplDigitizationData_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__prepareBnplDigitizationData_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__submitBnplApplication_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__submitBnplApplication_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateBnplApplication_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateBnplApplication_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cancelRevolvingCreditPayment_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__cancelRevolvingCreditPayment_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__redeemRevolvingCreditReward_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__redeemRevolvingCreditReward_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateRevolvingCreditAutopay_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateRevolvingCreditAutopay_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__makeRevolvingCreditPayment_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__makeRevolvingCreditPayment_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateRevolvingCreditInstrumentStatus_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateRevolvingCreditInstrumentStatus_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__setRevolvingCreditInstrumentStatus_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__setRevolvingCreditInstrumentStatus_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateRevolvingCreditNotificationPreference_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateRevolvingCreditNotificationPreference_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateRevolvingCreditLineIncreaseOfferStatus_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateRevolvingCreditLineIncreaseOfferStatus_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateRevolvingCreditCustomerProfile_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateRevolvingCreditCustomerProfile_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__activateRevolvingCreditCard_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__activateRevolvingCreditCard_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__enrollInRevolvingCreditPaymentSecurity_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__enrollInRevolvingCreditPaymentSecurity_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__prepareRevolvingCreditDigitizationData_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__prepareRevolvingCreditDigitizationData_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addRevolvingCreditCustomerProfile_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__addRevolvingCreditCustomerProfile_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__reissueRevolvingCreditInstrument_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__reissueRevolvingCreditInstrument_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__requestRevolvingCreditLineIncrease_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__requestRevolvingCreditLineIncrease_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateRevolvingCreditLineIncreaseOfferPreference_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateRevolvingCreditLineIncreaseOfferPreference_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateRevolvingCreditApplication_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateRevolvingCreditApplication_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__continueRevolvingCreditApplication_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__continueRevolvingCreditApplication_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__submitRevolvingCreditApplication_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__submitRevolvingCreditApplication_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__verifyRevolvingCreditIdentity_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__verifyRevolvingCreditIdentity_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cancelRevolvingCreditApplication_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__cancelRevolvingCreditApplication_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deleteCryptocurrencyAddressBookEntry_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deleteCryptocurrencyAddressBookEntry_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createCryptocurrencyAddressBookEntry_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createCryptocurrencyAddressBookEntry_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateCryptocurrencyAddressBookEntry_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateCryptocurrencyAddressBookEntry_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__rolloverCryptocurrency_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__rolloverCryptocurrency_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__pauseCryptocurrencyRecurringSubscription_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__pauseCryptocurrencyRecurringSubscription_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__resumeCryptocurrencyRecurringSubscription_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__resumeCryptocurrencyRecurringSubscription_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cancelCryptocurrencyRecurringSubscription_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__cancelCryptocurrencyRecurringSubscription_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createCryptocurrencyPreference_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createCryptocurrencyPreference_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateCryptocurrencyPreferences_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateCryptocurrencyPreferences_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__resolveCryptocurrencyTradeContingencies_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__resolveCryptocurrencyTradeContingencies_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateCryptocurrencyAlertSettings_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateCryptocurrencyAlertSettings_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__executeCryptocurrencyTrade_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__executeCryptocurrencyTrade_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateCryptocurrencyRecurringTradeSubscription_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateCryptocurrencyRecurringTradeSubscription_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createCryptocurrencyRecurringTradeSubscription_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createCryptocurrencyRecurringTradeSubscription_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__evaluateCryptocurrencyEligibleFundingOptions_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__evaluateCryptocurrencyEligibleFundingOptions_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__generateCryptocurrencyQuote_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__generateCryptocurrencyQuote_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__evaluateCryptocurrencyTrade_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__evaluateCryptocurrencyTrade_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__generateCryptocurrencyAddress_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__generateCryptocurrencyAddress_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__validateCryptocurrencyAddress_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__validateCryptocurrencyAddress_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__executeCryptocurrencyTransfer_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__executeCryptocurrencyTransfer_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__evaluateEligibleCryptocurrencyAssets_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__evaluateEligibleCryptocurrencyAssets_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__processCryptocurrencyOrders_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__processCryptocurrencyOrders_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePersonalizedAds_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePersonalizedAds_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePersonalizedOffers_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePersonalizedOffers_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePersonalizedShoppingConsent_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePersonalizedShoppingConsent_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateFaceScanStatus_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateFaceScanStatus_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateShareWithThirdParties_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateShareWithThirdParties_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateAllowFindByIdentifiers_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateAllowFindByIdentifiers_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateAllowPaymentRequests_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateAllowPaymentRequests_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePaymentRequestsFrom_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePaymentRequestsFrom_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateAllowFindViaPayPalMe_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateAllowFindViaPayPalMe_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateAllowFindByName_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateAllowFindByName_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateAllowFindByUsername_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateAllowFindByUsername_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateAllowFindByEmailAndPhone_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateAllowFindByEmailAndPhone_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateAllowRequestMoneyByEmail_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateAllowRequestMoneyByEmail_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateAllowRequestMoneyByPhone_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateAllowRequestMoneyByPhone_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateAllowRequestMoneyByName_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateAllowRequestMoneyByName_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateAllowRequestMoneyByUsername_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateAllowRequestMoneyByUsername_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateAllowSendMoneyByEmail_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateAllowSendMoneyByEmail_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateAllowSendMoneyByPhone_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateAllowSendMoneyByPhone_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateAllowSendMoneyByName_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateAllowSendMoneyByName_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateAllowSendMoneyByUsername_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateAllowSendMoneyByUsername_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateAllowVenmoDiscovery_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateAllowVenmoDiscovery_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deleteAuthConsent_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deleteAuthConsent_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__removeProviderConsentWithData_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__removeProviderConsentWithData_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deactivateAuthConsent_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deactivateAuthConsent_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__prepareCardForDigitization_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__prepareCardForDigitization_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__suspendDeviceWalletCardToken_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__suspendDeviceWalletCardToken_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__resumeDeviceWalletCardToken_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__resumeDeviceWalletCardToken_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__syncDeviceWalletCardToken_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__syncDeviceWalletCardToken_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__closeDeviceWalletCardToken_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__closeDeviceWalletCardToken_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__closeDeviceWalletCardTokens_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__closeDeviceWalletCardTokens_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__redeemPointsToCharity_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__redeemPointsToCharity_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__submitMosaicPageForm_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__submitMosaicPageForm_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__authenticate_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__authenticate_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deliverStepUpIdentityChallenge_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deliverStepUpIdentityChallenge_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__validateStepUpIdentityChallenge_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__validateStepUpIdentityChallenge_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__bindAuthenticationDevice_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__bindAuthenticationDevice_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__unbindAuthenticationDevice_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__unbindAuthenticationDevice_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createPasskeyRegistrationOption_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createPasskeyRegistrationOption_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createPasskey_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createPasskey_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deletePasskey_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deletePasskey_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__requestPhoneConfirmationCode_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__requestPhoneConfirmationCode_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__confirmPhoneConfirmationCode_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__confirmPhoneConfirmationCode_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__confirmEmail_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__confirmEmail_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__changePassword_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__changePassword_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__endAuthenticationSession_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__endAuthenticationSession_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__exchangeAccessTokenForAuthorizationCode_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__exchangeAccessTokenForAuthorizationCode_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__exchangeAuthorizationCodeForAccessToken_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__exchangeAuthorizationCodeForAccessToken_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__registerDevice_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__registerDevice_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__validateAlert_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__validateAlert_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__validateConnect_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__validateConnect_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addPartyBillingAddress_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__addPartyBillingAddress_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addPartyEmail_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__addPartyEmail_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deletePartyEmail_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deletePartyEmail_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__makePrimaryPartyEmail_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__makePrimaryPartyEmail_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__replacePrimaryPartyEmail_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__replacePrimaryPartyEmail_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePartyEmail_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePartyEmail_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__initiateEmailConfirmation_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__initiateEmailConfirmation_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__reinitiateEmailConfirmation_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__reinitiateEmailConfirmation_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__verifyPartyEmailWithOtp_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__verifyPartyEmailWithOtp_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__verifyPartyEmailWithGoogleSignIn_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__verifyPartyEmailWithGoogleSignIn_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__reconfirmPartyEmail_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__reconfirmPartyEmail_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePartyProfilePicture_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePartyProfilePicture_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addPartyPhone_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__addPartyPhone_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__replacePartyPhone_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__replacePartyPhone_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deletePartyPhone_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deletePartyPhone_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePartyPhone_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePartyPhone_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__replacePrimaryPartyPhone_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__replacePrimaryPartyPhone_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__initiatePartyPhoneConfirmation_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__initiatePartyPhoneConfirmation_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__reinitiatePartyPhoneConfirmation_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__reinitiatePartyPhoneConfirmation_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__verifyPartyPhone_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__verifyPartyPhone_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateUserConsent_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateUserConsent_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePartyAddress_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePartyAddress_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deletePartyAddress_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deletePartyAddress_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__makePrimaryPartyAddress_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__makePrimaryPartyAddress_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__replacePrimaryPartyAddress_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__replacePrimaryPartyAddress_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createInvoice_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createInvoice_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateInvoice_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateInvoice_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deleteInvoice_id() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deleteInvoice_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deleteInvoiceV2_id() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deleteInvoiceV2_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__sendInvoice_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__sendInvoice_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cancelInvoice_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__cancelInvoice_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cancelInvoiceV2_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__cancelInvoiceV2_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__saveInvoiceReminder_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__saveInvoiceReminder_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__saveInvoiceReminderV2_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__saveInvoiceReminderV2_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__saveInvoicePayment_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__saveInvoicePayment_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__saveInvoiceRefund_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__saveInvoiceRefund_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createMerchantItem_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createMerchantItem_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateMerchantItem_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateMerchantItem_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateMerchantItemV2_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateMerchantItemV2_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deleteMerchantItem_id() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deleteMerchantItem_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deleteMerchantItemV2_id() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deleteMerchantItemV2_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createMerchantTax_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createMerchantTax_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateMerchantTax_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateMerchantTax_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateMerchantTaxV2_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateMerchantTaxV2_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deleteMerchantTax_id() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deleteMerchantTax_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deleteMerchantTaxV2_id() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deleteMerchantTaxV2_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createMoneybox_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createMoneybox_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateMoneybox_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateMoneybox_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deleteMoneybox_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deleteMoneybox_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__transferMoneybox_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__transferMoneybox_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createMoneyboxTransferSchedule_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createMoneyboxTransferSchedule_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateMoneyboxTransferSchedule_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateMoneyboxTransferSchedule_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__pauseMoneyboxTransferSchedule_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__pauseMoneyboxTransferSchedule_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deleteMoneyboxTransferSchedule_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deleteMoneyboxTransferSchedule_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__disableBalanceAutoTransfer_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__disableBalanceAutoTransfer_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__acknowledgeMoneyboxTargetReached_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__acknowledgeMoneyboxTargetReached_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__authorizePackageTracking_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__authorizePackageTracking_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deauthorizePackageTracking_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deauthorizePackageTracking_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deauthorizePackageTrackingForAllProviders_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deauthorizePackageTrackingForAllProviders_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__markPackageAsDelivered_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__markPackageAsDelivered_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePackageNickname_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePackageNickname_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deletePackage_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deletePackage_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__savePackageTrackingUserPreference_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__savePackageTrackingUserPreference_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createMoneyPool_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createMoneyPool_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateMoneyPool_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateMoneyPool_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__closeMoneyPool_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__closeMoneyPool_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createSubjectAccessRequest_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createSubjectAccessRequest_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__enrollInPromotionOffer_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__enrollInPromotionOffer_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__enrollInLoyaltyProgram_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__enrollInLoyaltyProgram_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__redeemPointsToBalance_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__redeemPointsToBalance_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__redeemPointsToSavings_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__redeemPointsToSavings_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__blockContact_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__blockContact_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createContact_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createContact_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateContact_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateContact_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__unblockContact_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__unblockContact_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__favoriteContact_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__favoriteContact_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__unfavoriteContact_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__unfavoriteContact_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deleteContact_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deleteContact_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createRecentSearch_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createRecentSearch_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deleteRecentSearch_id() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deleteRecentSearch_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deleteRecentSearches_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deleteRecentSearches_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__scanQrCode_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__scanQrCode_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cancelQrCodePayment_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__cancelQrCodePayment_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__enrollConsumerPresentedQrCode_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__enrollConsumerPresentedQrCode_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__confirmQrCodePayment_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__confirmQrCodePayment_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__generateConsumerPresentedQrCode_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__generateConsumerPresentedQrCode_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__provisionSavingsAccount_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__provisionSavingsAccount_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateSavingsApplication_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateSavingsApplication_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateSavingsAccount_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateSavingsAccount_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__disableConsumerAgreement_id() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__disableConsumerAgreement_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePreferredFundingInstruments_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePreferredFundingInstruments_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createTaxReconciliationReport_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createTaxReconciliationReport_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__requestTaxReportSelfCorrection_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__requestTaxReportSelfCorrection_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__requestTaxDocument_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__requestTaxDocument_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__initiateExternalBankAccess_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__initiateExternalBankAccess_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__confirmBankAccount_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__confirmBankAccount_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateBankAccount_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateBankAccount_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addBankAccount_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__addBankAccount_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__removeBankAccount_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__removeBankAccount_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__linkExternalBankAccounts_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__linkExternalBankAccounts_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addCard_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__addCard_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateCard_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateCard_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__removeCard_id() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__removeCard_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__confirmCard_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__confirmCard_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__generateThreeDsSupplementalData_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__generateThreeDsSupplementalData_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateCardsBillingAddress_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateCardsBillingAddress_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateTransfersMetadata_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateTransfersMetadata_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addDeposit_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__addDeposit_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__withdrawFunds_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__withdrawFunds_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__resolveDepositContingencies_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__resolveDepositContingencies_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cancelTransfer_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__cancelTransfer_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__setPaymentPreference_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__setPaymentPreference_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updatePaymentPreference_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updatePaymentPreference_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__removePaymentToken_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__removePaymentToken_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__setProvisionFlowMetadata_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__setProvisionFlowMetadata_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__createThirdPartyLoyaltyCard_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__createThirdPartyLoyaltyCard_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateThirdPartyLoyaltyCard_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__updateThirdPartyLoyaltyCard_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__patchThirdPartyLoyaltyCard_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__patchThirdPartyLoyaltyCard_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deleteThirdPartyLoyaltyCard_id() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deleteThirdPartyLoyaltyCard_id;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__uploadThirdPartyLoyaltyCardCustomImage_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__uploadThirdPartyLoyaltyCardCustomImage_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__deleteThirdPartyLoyaltyCardCustomImage_input() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.__deleteThirdPartyLoyaltyCardCustomImage_input;
        }

        public final com.apollographql.apollo.api.ObjectType getType() {
            return com.paypal.oslo.api.graphql.schema.type.Mutation.type;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
