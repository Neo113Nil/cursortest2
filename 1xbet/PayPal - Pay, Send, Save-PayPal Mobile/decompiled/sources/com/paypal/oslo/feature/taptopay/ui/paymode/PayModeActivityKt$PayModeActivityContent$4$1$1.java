package com.paypal.oslo.feature.taptopay.ui.paymode;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class PayModeActivityKt$PayModeActivityContent$4$1$1 implements kotlin.jvm.functions.Function1<com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlin.Unit> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
        java.lang.String m11592unboximpl = navResultRequestId.m11592unboximpl();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m11592unboximpl, "");
        this.getHighResolutionOutputSizeshNQ4ISI.m11575navigateForResultInternaluBl809w(m11592unboximpl, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.navigation.result.SkipScreenLockConfirmationNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt$PayModeActivityContent$4$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt$PayModeActivityContent$4$1$1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.taptopay.navigation.SkipScreenLockConfirmationDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    PayModeActivityKt$PayModeActivityContent$4$1$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
    }
}
