package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "toManageCardDetails", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountSummaryOverviewToManageCardArgsMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails toManageCardDetails(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletEligibilityReason;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus externalWalletEligibilityStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl benefitsUrl;
        java.lang.Object next;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryOverView, "");
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview = accountSummaryOverView.getAccountOverview();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs accountAPRs = accountOverview != null ? accountOverview.getAccountAPRs() : null;
        java.lang.String creditAccountId = accountSummaryOverView.getCreditAccountId();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument> creditInstruments = accountSummaryOverView.getCreditInstruments();
        if (creditInstruments != null) {
            java.util.Iterator<T> it = creditInstruments.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    char c = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument) next).getType() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.WALLET ? (char) 1 : (char) 0;
                    do {
                        java.lang.Object next2 = it.next();
                        char c2 = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument) next2).getType() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.WALLET ? (char) 1 : (char) 0;
                        if (c > c2) {
                            next = next2;
                            c = c2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            creditInstrument = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument) next;
        } else {
            creditInstrument = null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount creditLimit = accountSummaryOverView.getCreditLimit();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.LostStolenPageSummary lostStolenPageSummary = accountSummaryOverView.getLostStolenPageSummary();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails primaryCustomerProfileDetails = accountSummaryOverView.getPrimaryCustomerProfileDetails();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact = accountSummaryOverView.getCustomerServiceContact();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview2 = accountSummaryOverView.getAccountOverview();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon cardDisplayLogo = accountOverview2 != null ? accountOverview2.getCardDisplayLogo() : null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview = accountSummaryOverView.getAutopayOverview();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount temporaryCreditLimit = accountSummaryOverView.getTemporaryCreditLimit();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview walletOverview = accountSummaryOverView.getWalletOverview();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo paymentSecurityInfo = accountSummaryOverView.getPaymentSecurityInfo();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview = accountSummaryOverView.getStarPayWalletOverview();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken> provisionedWalletTokens = starPayWalletOverview != null ? starPayWalletOverview.getProvisionedWalletTokens() : null;
        if (provisionedWalletTokens == null) {
            provisionedWalletTokens = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken> list = provisionedWalletTokens;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview2 = accountSummaryOverView.getStarPayWalletOverview();
        if (starPayWalletOverview2 == null || (externalWalletEligibilityReason = starPayWalletOverview2.getExternalWalletReason()) == null) {
            externalWalletEligibilityReason = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.UNKNOWN;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletEligibilityReason2 = externalWalletEligibilityReason;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview3 = accountSummaryOverView.getStarPayWalletOverview();
        if (starPayWalletOverview3 == null || (externalWalletEligibilityStatus = starPayWalletOverview3.getExternalWalletStatus()) == null) {
            externalWalletEligibilityStatus = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus.UNKNOWN;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus externalWalletEligibilityStatus2 = externalWalletEligibilityStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferences notificationPreferences = accountSummaryOverView.getNotificationPreferences();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData pushToWalletProvisioningData = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.PushToWalletMapperKt.pushToWalletProvisioningData(accountSummaryOverView);
        boolean isWorldUser = accountSummaryOverView.getIsWorldUser();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls contentUrls = accountSummaryOverView.getContentUrls();
        java.lang.String value = (contentUrls == null || (benefitsUrl = contentUrls.getBenefitsUrl()) == null) ? null : benefitsUrl.getValue();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls contentUrls2 = accountSummaryOverView.getContentUrls();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl paymentSecurityEntrypoint = contentUrls2 != null ? contentUrls2.getPaymentSecurityEntrypoint() : null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls contentUrls3 = accountSummaryOverView.getContentUrls();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl eSignConsent = contentUrls3 != null ? contentUrls3.getESignConsent() : null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility productFeatureEligibility = accountSummaryOverView.getProductFeatureEligibility();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls contentUrls4 = accountSummaryOverView.getContentUrls();
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails(accountAPRs, creditAccountId, creditInstrument, creditLimit, lostStolenPageSummary, primaryCustomerProfileDetails, customerServiceContact, cardDisplayLogo, autopayOverview, temporaryCreditLimit, walletOverview, paymentSecurityInfo, list, externalWalletEligibilityStatus2, externalWalletEligibilityReason2, notificationPreferences, null, pushToWalletProvisioningData, isWorldUser, value, paymentSecurityEntrypoint, eSignConsent, productFeatureEligibility, contentUrls4 != null ? contentUrls4.getCardHolderTerms() : null, 65536, null);
    }
}
