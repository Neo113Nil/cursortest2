package com.paypal.oslo.feature.home.ui.navigation;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/navigation/HomeNavigationRouter;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/home/ui/navigation/CollectionType;", "collectionType", "", "ctaPrompt", "Lcom/paypal/oslo/feature/home/ui/navigation/HomeNavigationEvent;", "routeToCollection", "(Lcom/paypal/oslo/feature/home/ui/navigation/CollectionType;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/ui/navigation/HomeNavigationEvent;", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams;", "params", "routeToCollectionItem", "(Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams;)Lcom/paypal/oslo/feature/home/ui/navigation/HomeNavigationEvent;", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$NBAParams;", "p0", "Landroidx/navigation3/runtime/NavKey;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$NBAParams;)Landroidx/navigation3/runtime/NavKey;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HomeNavigationRouter {
    public static final int $stable = 0;

    @javax.inject.Inject
    public HomeNavigationRouter() {
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.ui.navigation.HomeNavigationEvent routeToCollection$default(com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter homeNavigationRouter, com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return homeNavigationRouter.routeToCollection(collectionType, str);
    }

    private static androidx.navigation3.runtime.NavKey getHighSpeedVideoSizes(com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams p0) {
        java.lang.String ctaUrl = p0.getCtaUrl();
        return ctaUrl != null ? new com.paypal.oslo.core.webview.navigation.SecureWebViewDestination(new com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData(ctaUrl, "home_nba", null, true, false, false, 52, null)) : null;
    }

    public final com.paypal.oslo.feature.home.ui.navigation.HomeNavigationEvent routeToCollection(com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType, java.lang.String ctaPrompt) {
        com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination searchAndIntelligenceDestination;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectionType, "");
        switch (com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter.WhenMappings.$EnumSwitchMapping$0[collectionType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                searchAndIntelligenceDestination = new com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination(new com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Prompt(ctaPrompt == null ? "" : ctaPrompt, false));
                break;
            case 7:
                searchAndIntelligenceDestination = com.paypal.oslo.core.navigation.MeWalletDestination.INSTANCE;
                break;
            case 8:
            case 9:
            case 10:
                searchAndIntelligenceDestination = null;
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        if (searchAndIntelligenceDestination != null) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.home.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = kotlin.TuplesKt.to("variant", collectionType.name());
            if (ctaPrompt == null) {
                ctaPrompt = "";
            }
            pairArr[1] = kotlin.TuplesKt.to("ctaPrompt", ctaPrompt);
            pairArr[2] = kotlin.TuplesKt.to("destination", com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouterKt.access$getDestinationType(searchAndIntelligenceDestination));
            com.paypal.android.logger.Logger.i$default(logger, "Navigate to collection", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        }
        if (searchAndIntelligenceDestination != null) {
            return new com.paypal.oslo.feature.home.ui.navigation.HomeNavigationEvent(searchAndIntelligenceDestination);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        if (r7.equals("consumer-rewards") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        r1 = new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDestination(new com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US, (java.lang.String) null, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        if (r7.equals(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.PyusdItemFactoryKt.AccountSnapshotPyUsdId) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
    
        r1 = com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoHubDestination.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cc, code lost:
    
        if (r7.equals("cashback") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        if (r7.equals("crypto") != false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.home.ui.navigation.HomeNavigationEvent routeToCollectionItem(com.paypal.oslo.feature.home.ui.navigation.NavigationParams params) {
        com.paypal.oslo.core.webview.navigation.SecureWebViewDestination secureWebViewDestination;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        int i = 2;
        java.lang.String str = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr5 = 0;
        if (params instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams) {
            com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams shoppingParams = (com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams) params;
            secureWebViewDestination = new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.ShoppingIABDestination(shoppingParams.getItemId(), shoppingParams.getStoreUrl(), shoppingParams.getItemName(), shoppingParams.getMerchantLogoUrl(), shoppingParams.getBenefitTypes(), shoppingParams.getBenefitsMetadata());
        } else if (params instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams) {
            com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams accountParams = (com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams) params;
            java.lang.String accountType = accountParams.getAccountType();
            if (accountType == null) {
                accountType = accountParams.getAccountId();
            }
            switch (accountType.hashCode()) {
                case -2136502509:
                    if (accountType.equals("paypal-credit")) {
                        secureWebViewDestination = new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingDestination(new com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.LegacyServicingNavigationArgs(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PPC_US_V2));
                        break;
                    }
                    secureWebViewDestination = null;
                    break;
                case -2042353753:
                    if (accountType.equals("credit-card-us")) {
                        secureWebViewDestination = new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDestination(new com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US, (java.lang.String) null, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                        break;
                    }
                    secureWebViewDestination = null;
                    break;
                case -1912706777:
                    if (accountType.equals("pay-later")) {
                        secureWebViewDestination = new com.paypal.oslo.feature.bnplservicing.api.navigation.PayLaterHubDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                        break;
                    }
                    secureWebViewDestination = null;
                    break;
                case -1614558294:
                    if (accountType.equals("ebay-mastercard")) {
                        secureWebViewDestination = new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingDestination(new com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.LegacyServicingNavigationArgs(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.SYF_US_EBAYMC));
                        break;
                    }
                    secureWebViewDestination = null;
                    break;
                case -1351683903:
                    break;
                case -339185956:
                    if (accountType.equals("balance")) {
                        secureWebViewDestination = com.paypal.oslo.feature.balance.api.navigation.BalanceDashboardDestination.INSTANCE;
                        break;
                    }
                    secureWebViewDestination = null;
                    break;
                case 24489626:
                    break;
                case 107155165:
                    break;
                case 954705997:
                    break;
                case 1100650276:
                    if (accountType.equals("rewards")) {
                        secureWebViewDestination = new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryEarnDestination((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                        break;
                    }
                    secureWebViewDestination = null;
                    break;
                case 1227299046:
                    if (accountType.equals("smart-connect")) {
                        secureWebViewDestination = new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingDestination(new com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.LegacyServicingNavigationArgs(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.SYF_US_SMTCNCT));
                        break;
                    }
                    secureWebViewDestination = null;
                    break;
                case 1406833972:
                    if (accountType.equals(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AddPaymentMethodItemFactoryKt.AddPaymentMethodSnapshotId)) {
                        secureWebViewDestination = com.paypal.oslo.feature.wallet.api.navigation.AddFIToWalletDestination.INSTANCE;
                        break;
                    }
                    secureWebViewDestination = null;
                    break;
                case 1570368396:
                    if (accountType.equals("paypal-mastercard")) {
                        secureWebViewDestination = new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingDestination(new com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.LegacyServicingNavigationArgs(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.SYF_US_PPMC));
                        break;
                    }
                    secureWebViewDestination = null;
                    break;
                case 1872948409:
                    if (accountType.equals("savings")) {
                        secureWebViewDestination = com.paypal.oslo.feature.savings.api.navigation.SavingsHomeDestination.INSTANCE;
                        break;
                    }
                    secureWebViewDestination = null;
                    break;
                default:
                    secureWebViewDestination = null;
                    break;
            }
        } else if (params instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams) {
            com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams nBAParams = (com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams) params;
            com.paypal.oslo.feature.home.domain.model.NbaCtaType ctaType = nBAParams.getCtaType();
            int i2 = ctaType == null ? -1 : com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter.WhenMappings.$EnumSwitchMapping$1[ctaType.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    java.lang.String nativeId = nBAParams.getNativeId();
                    if (nativeId != null) {
                        int hashCode = nativeId.hashCode();
                        if (hashCode != 76275) {
                            if (hashCode != 76196126) {
                                if (hashCode == 859011578 && nativeId.equals("PayModeRouterDestination")) {
                                    secureWebViewDestination = new com.paypal.oslo.feature.taptopay.api.navigation.PayModeRouterDestination("home_nba", (java.lang.String) null, (java.lang.String) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                                }
                            } else if (nativeId.equals("PL2GO")) {
                                secureWebViewDestination = new com.paypal.oslo.feature.bnplacquisition.api.navigation.EnterAmountDestination(str, (com.paypal.oslo.feature.bnplacquisition.api.navigation.EnterAmountDestination.EntryPoint) (objArr5 == true ? 1 : 0), i, (kotlin.jvm.internal.DefaultConstructorMarker) (objArr4 == true ? 1 : 0));
                            }
                        } else if (nativeId.equals("MGM")) {
                            secureWebViewDestination = com.paypal.oslo.feature.onboarding.api.navigation.MGMInviteFriendsDestination.INSTANCE;
                        }
                    }
                    secureWebViewDestination = getHighSpeedVideoSizes(nBAParams);
                } else if (i2 == 2) {
                    secureWebViewDestination = getHighSpeedVideoSizes(nBAParams);
                } else {
                    if (i2 != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    secureWebViewDestination = new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.ShoppingIABDestination((java.lang.String) null, nBAParams.getCtaUrl(), (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata) null, 61, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                }
            } else if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) nBAParams.getNbaId(), (java.lang.CharSequence) "pl2go", false, 2, (java.lang.Object) null)) {
                secureWebViewDestination = new com.paypal.oslo.feature.bnplacquisition.api.navigation.EnterAmountDestination((java.lang.String) (objArr3 == true ? 1 : 0), (com.paypal.oslo.feature.bnplacquisition.api.navigation.EnterAmountDestination.EntryPoint) (objArr2 == true ? 1 : 0), i, (kotlin.jvm.internal.DefaultConstructorMarker) (objArr == true ? 1 : 0));
            } else {
                java.lang.String ctaUrl = nBAParams.getCtaUrl();
                secureWebViewDestination = ctaUrl != null ? new com.paypal.oslo.feature.home.api.navigation.HomeWebViewDestination(ctaUrl, nBAParams.getTitle(), "home_nba") : null;
            }
        } else {
            if (!(params instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.String url = ((com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams) params).getUrl();
            secureWebViewDestination = url != null ? new com.paypal.oslo.core.webview.navigation.SecureWebViewDestination(new com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData(url, "home_ads", null, false, true, false, 36, null)) : null;
        }
        if (secureWebViewDestination != null) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.home.LoggerKt.log, "Navigate to item", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("variant", params.getVariant()), kotlin.TuplesKt.to("id", params.getId()), kotlin.TuplesKt.to("name", params.getName()), kotlin.TuplesKt.to("destination", com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouterKt.access$getDestinationType(secureWebViewDestination))), null, 4, null);
        } else {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.home.LoggerKt.log, "Navigation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("variant", params.getVariant()), kotlin.TuplesKt.to("id", params.getId()), kotlin.TuplesKt.to("reason", "no matching destination")), null, 4, null);
        }
        if (secureWebViewDestination != null) {
            return new com.paypal.oslo.feature.home.ui.navigation.HomeNavigationEvent(secureWebViewDestination);
        }
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.home.ui.navigation.CollectionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.MERCHANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.HERO_PRODUCT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.NEXT_BEST_ACTION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.LARGE_TILE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.FANNED_CAROUSEL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.ADS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.ACCOUNTS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.DECK_CARD.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.SPOTLIGHT_NBA.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.OFFER_NBA.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.home.domain.model.NbaCtaType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.home.domain.model.NbaCtaType.NATIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.paypal.oslo.feature.home.domain.model.NbaCtaType.SECURE_WEBVIEW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.paypal.oslo.feature.home.domain.model.NbaCtaType.IAB.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
