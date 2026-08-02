package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/PushToWalletProvisioningData;", "pushToWalletProvisioningData", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/PushToWalletProvisioningData;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PushToWalletMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData pushToWalletProvisioningData(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerName name2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerName name3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryOverView, "");
        java.lang.String str = null;
        if (accountSummaryOverView.getProductConfigurations() == null) {
            return null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview = accountSummaryOverView.getAccountOverview();
        java.lang.String cardDisplayName = accountOverview != null ? accountOverview.getCardDisplayName() : null;
        java.lang.String str2 = cardDisplayName == null ? "" : cardDisplayName;
        java.lang.String creditAccountId = accountSummaryOverView.getCreditAccountId();
        java.lang.String str3 = creditAccountId == null ? "" : creditAccountId;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails primaryCustomerProfileDetails = accountSummaryOverView.getPrimaryCustomerProfileDetails();
        java.lang.String givenName = (primaryCustomerProfileDetails == null || (name3 = primaryCustomerProfileDetails.getName()) == null) ? null : name3.getGivenName();
        java.lang.String str4 = givenName == null ? "" : givenName;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails primaryCustomerProfileDetails2 = accountSummaryOverView.getPrimaryCustomerProfileDetails();
        java.lang.String surname = (primaryCustomerProfileDetails2 == null || (name2 = primaryCustomerProfileDetails2.getName()) == null) ? null : name2.getSurname();
        java.lang.String str5 = surname == null ? "" : surname;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview2 = accountSummaryOverView.getAccountOverview();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork cardNetwork = accountOverview2 != null ? accountOverview2.getCardNetwork() : null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview3 = accountSummaryOverView.getAccountOverview();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider tokenServiceProvider = accountOverview3 != null ? accountOverview3.getTokenServiceProvider() : null;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument> creditInstruments = accountSummaryOverView.getCreditInstruments();
        if (creditInstruments != null && (creditInstrument = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) creditInstruments)) != null) {
            str = creditInstrument.getLastDigits();
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData(str2, str3, str4, str5, cardNetwork, tokenServiceProvider, str == null ? "" : str, accountSummaryOverView.getPrimaryCustomerProfileDetails());
    }
}
