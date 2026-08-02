package com.paypal.oslo.feature.subscriptions.shared.iab.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class GenericInAppBrowserScreenKt$collectUiEffects$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual((com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiEffect) obj, com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiEffect.NavigateBack.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$collectUiEffects$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserScreenKt$collectUiEffects$2.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    GenericInAppBrowserScreenKt$collectUiEffects$2(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        this.getHighSpeedVideoSizes = appNavigator;
    }
}
