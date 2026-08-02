package com.paypal.oslo.feature.taptopay.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class NavigationModule$provideSetupFlowEntries$1$13$1$1$1 implements kotlin.jvm.functions.Function1<com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlin.Unit> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
        java.lang.String m11592unboximpl = navResultRequestId.m11592unboximpl();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m11592unboximpl, "");
        this.getHighSpeedVideoFpsRanges.m11575navigateForResultInternaluBl809w(m11592unboximpl, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentHalfSheetNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.di.NavigationModule$provideSetupFlowEntries$1$13$1$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.di.NavigationModule$provideSetupFlowEntries$1$13$1$1$1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.taptopay.navigation.ChooseDefaultPaymentHalfSheetDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    NavigationModule$provideSetupFlowEntries$1$13$1$1$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        this.getHighSpeedVideoFpsRanges = appNavigator;
    }
}
