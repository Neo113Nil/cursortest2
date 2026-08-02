package com.paypal.oslo.feature.wallet.me.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnRevolvingCreditCardComponent;", "Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;", "manager", "Lcom/paypal/oslo/feature/wallet/me/domain/revolvingcredit/RevolvingCreditProduct;", "asProduct", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnRevolvingCreditCardComponent;Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;)Lcom/paypal/oslo/feature/wallet/me/domain/revolvingcredit/RevolvingCreditProduct;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RevolvingCreditComponentMapperKtKt {
    public static final com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct asProduct(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnRevolvingCreditCardComponent onRevolvingCreditCardComponent, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager) {
        com.paypal.oslo.feature.wallet.me.domain.Product.Type type;
        com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditNextBestAction revolvingCreditNextBestAction;
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.CardDisplayLogo cardDisplayLogo;
        java.lang.Object url;
        com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditNextBestAction.PastDue pastDue;
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Product5 product;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onRevolvingCreditCardComponent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletFeatureManager, "");
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.RevolvingCreditProductOverview revolvingCreditProductOverview = onRevolvingCreditCardComponent.getRevolvingCreditProductOverview();
        com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditOverview revolvingCreditOverview = null;
        r1 = null;
        java.lang.String str = null;
        revolvingCreditOverview = null;
        revolvingCreditOverview = null;
        if (revolvingCreditProductOverview == null || revolvingCreditProductOverview.getAccount() == null) {
            return null;
        }
        switch (com.paypal.oslo.feature.wallet.me.data.repository.RevolvingCreditComponentMapperKtKt.WhenMappings.$EnumSwitchMapping$0[onRevolvingCreditCardComponent.getRevolvingCreditProductOverview().getCreditProductIdentifier().ordinal()]) {
            case 1:
                type = com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_CASHBACK_MASTERCARD;
                break;
            case 2:
                type = com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_MASTERCARD;
                break;
            case 3:
                type = com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US;
                break;
            case 4:
                type = com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_UK;
                break;
            case 5:
                type = com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_EBAY_MASTERCARD;
                break;
            case 6:
                type = com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_EXTRAS_MASTERCARD;
                break;
            case 7:
                type = com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_SMART_CONNECT;
                break;
            case 8:
                type = com.paypal.oslo.feature.wallet.me.domain.Product.Type.UNKNOWN;
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.RevolvingCreditProductOverview revolvingCreditProductOverview2 = onRevolvingCreditCardComponent.getRevolvingCreditProductOverview();
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Account account = revolvingCreditProductOverview2.getAccount();
        if (((account == null || (product = account.getProduct()) == null) ? null : product.getCardDisplayName()) != null) {
            com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Billing billing = revolvingCreditProductOverview2.getAccount().getBilling();
            if ((billing != null ? billing.getCurrentBalance() : null) != null && revolvingCreditProductOverview2.getAccount().getBilling().getOpenToBuy() != null) {
                boolean areRevolvingCreditAlertsEnabled = walletFeatureManager.areRevolvingCreditAlertsEnabled();
                if (areRevolvingCreditAlertsEnabled) {
                    com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.NextBestAction1 nextBestAction = revolvingCreditProductOverview2.getNextBestAction();
                    if (nextBestAction != null) {
                        if (nextBestAction.getOnRevolvingCreditMinimumPaymentDue() == null) {
                            pastDue = nextBestAction.getOnRevolvingCreditPastDue() != null ? com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditNextBestAction.PastDue.INSTANCE : null;
                        } else {
                            com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnRevolvingCreditMinimumPaymentDue onRevolvingCreditMinimumPaymentDue = nextBestAction.getOnRevolvingCreditMinimumPaymentDue();
                            com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.MinimumPaymentDue minimumPaymentDue = onRevolvingCreditMinimumPaymentDue.getMinimumPaymentDue();
                            pastDue = new com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditNextBestAction.MinimumPaymentDue(new com.paypal.oslo.feature.wallet.common.domain.model.Money(minimumPaymentDue.getOnMoney().getCurrencyCode().toString(), minimumPaymentDue.getOnMoney().getValue()), onRevolvingCreditMinimumPaymentDue.getNextPaymentDueTime().toString());
                        }
                        revolvingCreditNextBestAction = pastDue;
                        java.lang.String obj = revolvingCreditProductOverview2.getAccount().getCreditAccountId().toString();
                        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.CurrentBalance1 currentBalance = revolvingCreditProductOverview2.getAccount().getBilling().getCurrentBalance();
                        com.paypal.oslo.feature.wallet.common.domain.model.Money money = new com.paypal.oslo.feature.wallet.common.domain.model.Money(currentBalance.getCurrencyCode().toString(), currentBalance.getValue());
                        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OpenToBuy openToBuy = revolvingCreditProductOverview2.getAccount().getBilling().getOpenToBuy();
                        com.paypal.oslo.feature.wallet.common.domain.model.Money money2 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(openToBuy.getCurrencyCode().toString(), openToBuy.getValue());
                        java.lang.String cardDisplayName = revolvingCreditProductOverview2.getAccount().getProduct().getCardDisplayName();
                        cardDisplayLogo = revolvingCreditProductOverview2.getAccount().getProduct().getCardDisplayLogo();
                        if (cardDisplayLogo != null && (url = cardDisplayLogo.getUrl()) != null) {
                            str = url.toString();
                        }
                        revolvingCreditOverview = new com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditOverview(obj, cardDisplayName, money, money2, str, revolvingCreditNextBestAction);
                    }
                } else if (areRevolvingCreditAlertsEnabled) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                revolvingCreditNextBestAction = null;
                java.lang.String obj2 = revolvingCreditProductOverview2.getAccount().getCreditAccountId().toString();
                com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.CurrentBalance1 currentBalance2 = revolvingCreditProductOverview2.getAccount().getBilling().getCurrentBalance();
                com.paypal.oslo.feature.wallet.common.domain.model.Money money3 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(currentBalance2.getCurrencyCode().toString(), currentBalance2.getValue());
                com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OpenToBuy openToBuy2 = revolvingCreditProductOverview2.getAccount().getBilling().getOpenToBuy();
                com.paypal.oslo.feature.wallet.common.domain.model.Money money22 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(openToBuy2.getCurrencyCode().toString(), openToBuy2.getValue());
                java.lang.String cardDisplayName2 = revolvingCreditProductOverview2.getAccount().getProduct().getCardDisplayName();
                cardDisplayLogo = revolvingCreditProductOverview2.getAccount().getProduct().getCardDisplayLogo();
                if (cardDisplayLogo != null) {
                    str = url.toString();
                }
                revolvingCreditOverview = new com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditOverview(obj2, cardDisplayName2, money3, money22, str, revolvingCreditNextBestAction);
            }
        }
        return new com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct(type, true, revolvingCreditOverview);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.PAYPAL_CREDIT_CARD_US.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.PPC_US_V2.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.PP_UK_PPC.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.SYF_US_EBAYMC.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.SYF_US_PPMC.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.SYF_US_SMTCNCT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.UNKNOWN__.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
