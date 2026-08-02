package com.paypal.oslo.feature.subscriptions.businesseshub.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class BusinessesHubScreenKt$collectBusinessHubUiEffects$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel getHighSpeedVideoSizes;

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        final com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect businessesHubUiEffect = (com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect) obj;
        if (kotlin.jvm.internal.Intrinsics.areEqual(businessesHubUiEffect, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect.NavigateToLinkBusinesses.INSTANCE)) {
            com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt.onNavigateToLinkBusinesses(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(businessesHubUiEffect, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect.NavigateToBulkFi.INSTANCE)) {
            this.getHighSpeedVideoFpsRanges.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoSizes.getAgreementUpdateRequestId(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$collectBusinessHubUiEffects$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$collectBusinessHubUiEffects$2.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else if (businessesHubUiEffect instanceof com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect.NavigateToBusinessDetails) {
            this.getHighSpeedVideoFpsRanges.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoSizes.getAgreementUpdateRequestId(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$collectBusinessHubUiEffects$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$collectBusinessHubUiEffects$2.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(businessesHubUiEffect, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect.NavigateBack.INSTANCE)) {
            this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$collectBusinessHubUiEffects$2$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$collectBusinessHubUiEffects$2.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(businessesHubUiEffect, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect.NavigateToAboutBusinesses.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$collectBusinessHubUiEffects$2$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$collectBusinessHubUiEffects$2.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect businessesHubUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionDetailsDestination(((com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect.NavigateToBusinessDetails) businessesHubUiEffect).getAgreementId(), com.paypal.oslo.feature.subscriptions.api.navigation.DeepLinkTrafficSource.InApp.getRaw(), (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.subscriptions.shared.navigation.AboutBusinessesBottomSheetDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination(com.paypal.oslo.feature.subscriptions.api.navigation.FlowType.LINKED_BUSINESSES.getRaw(), com.paypal.oslo.feature.subscriptions.api.navigation.DeepLinkTrafficSource.InApp.getRaw()));
        return kotlin.Unit.INSTANCE;
    }

    BusinessesHubScreenKt$collectBusinessHubUiEffects$2(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel) {
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighSpeedVideoSizes = businessesHubViewModel;
    }
}
