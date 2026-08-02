package com.paypal.oslo.feature.balance.ui.balanceDashboard.nextBestAction;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/nba/NbaRecommendation;", androidx.core.app.NotificationCompat.CATEGORY_RECOMMENDATION, "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "Lkotlin/Function1;", "", "", "onOpenExternalUrl", "handleNbaAction", "(Lcom/paypal/oslo/feature/balance/domain/model/nba/NbaRecommendation;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NbaActionHandlerKt {
    public static /* synthetic */ void handleNbaAction$default(com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation nbaRecommendation, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.nextBestAction.NbaActionHandlerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.balanceDashboard.nextBestAction.NbaActionHandlerKt.$r8$lambda$bPQn407XnOLRTe9ouKwF3XN9S1Y((java.lang.String) obj2);
                }
            };
        }
        handleNbaAction(nbaRecommendation, appNavigator, function1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void handleNbaAction(final com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation nbaRecommendation, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        final com.paypal.oslo.feature.shoppingrewards.api.rewards.category.navigation.CategorySelectionDestination categorySelectionDestination;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nbaRecommendation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.lang.String destinationId = nbaRecommendation.getDestinationId();
        if (destinationId != null) {
            switch (destinationId.hashCode()) {
                case -1750432885:
                    if (destinationId.equals("category_selection")) {
                        categorySelectionDestination = com.paypal.oslo.feature.shoppingrewards.api.rewards.category.navigation.CategorySelectionDestination.INSTANCE;
                        break;
                    }
                    categorySelectionDestination = null;
                    break;
                case -586249541:
                    if (destinationId.equals(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.CARD_CONNECT_FEATURE)) {
                        categorySelectionDestination = new com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDestination(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.CONSUMER_DEBIT_CARD, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 30, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                        break;
                    }
                    categorySelectionDestination = null;
                    break;
                case -148934573:
                    if (destinationId.equals("smart_route")) {
                        categorySelectionDestination = new com.paypal.oslo.feature.smartroute.api.navigation.SmartRouteDistributionDestination("nba");
                        break;
                    }
                    categorySelectionDestination = null;
                    break;
                case 1369547730:
                    if (destinationId.equals("create_pin")) {
                        categorySelectionDestination = new com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDestination(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.CONSUMER_DEBIT_CARD, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 30, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                        break;
                    }
                    categorySelectionDestination = null;
                    break;
                case 2144721174:
                    if (destinationId.equals(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.FILE_TAXES)) {
                        categorySelectionDestination = new com.paypal.oslo.feature.taxfiling.api.navigation.TaxFilingDestination("nba");
                        break;
                    }
                    categorySelectionDestination = null;
                    break;
                default:
                    categorySelectionDestination = null;
                    break;
            }
            if (categorySelectionDestination != null) {
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.nextBestAction.NbaActionHandlerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.balance.ui.balanceDashboard.nextBestAction.NbaActionHandlerKt.$r8$lambda$NnSKgGrvj7Rm4p_MdkCblHkn1pE(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
                return;
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Unmapped NBA destinationId", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("destinationId", destinationId), kotlin.TuplesKt.to("trackingId", nbaRecommendation.getTrackingId())), null, 4, null);
        }
        final java.lang.String url = nbaRecommendation.getUrl();
        if (url == null) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.balance.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = kotlin.TuplesKt.to("trackingId", nbaRecommendation.getTrackingId());
            java.lang.String destinationId2 = nbaRecommendation.getDestinationId();
            pairArr[1] = kotlin.TuplesKt.to("destinationId", destinationId2 != null ? destinationId2 : "");
            pairArr[2] = kotlin.TuplesKt.to("hasUrl", java.lang.Boolean.valueOf(nbaRecommendation.getUrl() != null));
            com.paypal.android.logger.Logger.w$default(logger, "NBA recommendation target resolution failed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return;
        }
        java.lang.String navigationType = nbaRecommendation.getNavigationType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(navigationType, "INTERNAL") || (!kotlin.jvm.internal.Intrinsics.areEqual(navigationType, "EXTERNAL") && com.paypal.oslo.feature.balance.ui.balanceDashboard.nextBestAction.NbaUrlClassifier.INSTANCE.isInternal(url))) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.nextBestAction.NbaActionHandlerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.balance.ui.balanceDashboard.nextBestAction.NbaActionHandlerKt.$r8$lambda$k_DWRXZYxXlaOA6PNFN1ok914p0(url, nbaRecommendation, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return;
        }
        java.lang.String trackingId = nbaRecommendation.getTrackingId();
        if (kotlin.text.StringsKt.startsWith(url, "https://", true) || kotlin.text.StringsKt.startsWith(url, "http://", true)) {
            function1.invoke(url);
        } else {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.balance.LoggerKt.log, "NBA external URL has non-http(s) scheme, ignoring", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("trackingId", trackingId), kotlin.TuplesKt.to("scheme", kotlin.text.StringsKt.substringBefore(url, "://", ""))), null, 4, null);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NnSKgGrvj7Rm4p_MdkCblHkn1pE(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bPQn407XnOLRTe9ouKwF3XN9S1Y(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$k_DWRXZYxXlaOA6PNFN1ok914p0(java.lang.String str, com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation nbaRecommendation, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        java.lang.Boolean isAuthenticationRequired = nbaRecommendation.isAuthenticationRequired();
        navigationScope.push(new com.paypal.oslo.feature.settings.api.navigation.L2SettingsWebViewDestination(str, (java.lang.String) null, "nba", isAuthenticationRequired != null ? isAuthenticationRequired.booleanValue() : true, false, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }
}
