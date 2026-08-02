package com.paypal.oslo.feature.wallet.me.ui;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AccountsViewModelImplKt {
    public static final /* synthetic */ kotlin.Pair access$extractLinkedProducts(java.util.List list) {
        java.util.List<com.paypal.oslo.feature.wallet.me.domain.Product> list2 = list;
        com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedBanksProduct linkedBanksProduct = null;
        com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedCardsProduct linkedCardsProduct = null;
        com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedThirdPartyLoyaltyProduct linkedThirdPartyLoyaltyProduct = null;
        for (com.paypal.oslo.feature.wallet.me.domain.Product product : list2) {
            int i = com.paypal.oslo.feature.wallet.me.ui.AccountsViewModelImplKt.WhenMappings.$EnumSwitchMapping$0[product.getType().ordinal()];
            if (i == 1) {
                linkedBanksProduct = product instanceof com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedBanksProduct ? (com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedBanksProduct) product : null;
            } else if (i == 2) {
                linkedCardsProduct = product instanceof com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedCardsProduct ? (com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedCardsProduct) product : null;
            } else if (i == 3) {
                linkedThirdPartyLoyaltyProduct = product instanceof com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedThirdPartyLoyaltyProduct ? (com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedThirdPartyLoyaltyProduct) product : null;
            }
        }
        return kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.minus((java.lang.Iterable) list2, (java.lang.Iterable) kotlin.collections.SetsKt.setOfNotNull((java.lang.Object[]) new com.paypal.oslo.feature.wallet.me.domain.Product[]{linkedBanksProduct, linkedCardsProduct, linkedThirdPartyLoyaltyProduct})), new com.paypal.oslo.feature.wallet.me.ui.LinkedProducts(linkedBanksProduct, linkedCardsProduct, linkedThirdPartyLoyaltyProduct));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.me.domain.Product.Type.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.LINKED_BANKS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.LINKED_CARDS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.LINKED_3P_LOYALTY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
