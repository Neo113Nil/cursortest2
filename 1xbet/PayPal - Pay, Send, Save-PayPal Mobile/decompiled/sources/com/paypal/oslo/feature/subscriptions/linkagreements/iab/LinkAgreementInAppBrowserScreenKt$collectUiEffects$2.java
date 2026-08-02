package com.paypal.oslo.feature.subscriptions.linkagreements.iab;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class LinkAgreementInAppBrowserScreenKt$collectUiEffects$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        final com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiEffect linkAgreementInAppBrowserUiEffect = (com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiEffect) obj;
        if (!(linkAgreementInAppBrowserUiEffect instanceof com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiEffect.NavigateBack)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt$collectUiEffects$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt$collectUiEffects$2.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiEffect linkAgreementInAppBrowserUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.subscriptions.shared.navigation.result.LinkAgreementNavResult(((com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiEffect.NavigateBack) linkAgreementInAppBrowserUiEffect).getRefreshNeeded()));
        return kotlin.Unit.INSTANCE;
    }

    LinkAgreementInAppBrowserScreenKt$collectUiEffects$2(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        this.getHighSpeedVideoSizes = appNavigator;
    }
}
