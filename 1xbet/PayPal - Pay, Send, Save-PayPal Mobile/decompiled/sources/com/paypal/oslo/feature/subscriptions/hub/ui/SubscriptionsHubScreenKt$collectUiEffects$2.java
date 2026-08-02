package com.paypal.oslo.feature.subscriptions.hub.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class SubscriptionsHubScreenKt$collectUiEffects$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return Camera2StreamConfigurationMap((com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect) obj);
    }

    private java.lang.Object Camera2StreamConfigurationMap(final com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect subscriptionsHubUiEffect) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "user effect on subscriptions hub screen triggered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("effect", subscriptionsHubUiEffect.getEffectName())), null, 4, null);
        if (kotlin.jvm.internal.Intrinsics.areEqual(subscriptionsHubUiEffect, com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToAboutSubscriptions.INSTANCE)) {
            this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$collectUiEffects$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$collectUiEffects$2.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else if (subscriptionsHubUiEffect instanceof com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToSubscriptionDetails) {
            try {
                this.getHighSpeedVideoFpsRangesFor.m11575navigateForResultInternaluBl809w(((com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToSubscriptionDetails) subscriptionsHubUiEffect).m19891getRequestIdQDVFmTU(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$collectUiEffects$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$collectUiEffects$2.getHighSpeedVideoSizes(com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } catch (java.lang.IllegalStateException e) {
                com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.System(null, "Failed to navigate to subscription details", null, 5, null), "Failed to navigate to subscription details", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.Hub(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE), null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("subscriptionId", ((com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToSubscriptionDetails) subscriptionsHubUiEffect).getAgreementId())), e, 4, null);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(subscriptionsHubUiEffect, com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToBulkUpdateFi.INSTANCE)) {
            this.getHighSpeedVideoFpsRangesFor.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRanges.getAgreementUpdateRequestId(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$collectUiEffects$2$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$collectUiEffects$2.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(subscriptionsHubUiEffect, com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToLinkSubscriptions.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoFpsRangesFor.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRanges.getLinkFlowRequestId(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.result.LinkHubFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$collectUiEffects$2$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$collectUiEffects$2.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.subscriptions.shared.navigation.AboutSubscriptionsDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination(com.paypal.oslo.feature.subscriptions.api.navigation.FlowType.LINKED_SUBSCRIPTIONS.getRaw(), com.paypal.oslo.feature.subscriptions.api.navigation.DeepLinkTrafficSource.InApp.getRaw()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.subscriptions.api.navigation.LinkSubscriptionsDestination(com.paypal.oslo.feature.subscriptions.api.navigation.DeepLinkTrafficSource.InApp.getRaw()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect subscriptionsHubUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionDetailsDestination(((com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToSubscriptionDetails) subscriptionsHubUiEffect).getAgreementId(), com.paypal.oslo.feature.subscriptions.api.navigation.DeepLinkTrafficSource.InApp.getRaw(), (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    SubscriptionsHubScreenKt$collectUiEffects$2(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel subscriptionsHubViewModel) {
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.getHighSpeedVideoFpsRanges = subscriptionsHubViewModel;
    }
}
