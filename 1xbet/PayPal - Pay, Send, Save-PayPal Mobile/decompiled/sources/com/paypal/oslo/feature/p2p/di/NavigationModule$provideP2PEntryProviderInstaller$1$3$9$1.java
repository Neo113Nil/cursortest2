package com.paypal.oslo.feature.p2p.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final class NavigationModule$provideP2PEntryProviderInstaller$1$3$9$1 implements kotlin.jvm.functions.Function2<java.lang.Boolean, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlin.Unit> {
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
        java.lang.String m11592unboximpl = navResultRequestId.m11592unboximpl();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m11592unboximpl, "");
        final com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config createAddFIConfig = com.paypal.oslo.feature.p2p.navigation.AddFINavigationUtilsKt.createAddFIConfig(true, this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(m11592unboximpl, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$3$9$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$3$9$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config config, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.P2P, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), config));
        return kotlin.Unit.INSTANCE;
    }

    NavigationModule$provideP2PEntryProviderInstaller$1$3$9$1(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = appNavigator;
    }
}
