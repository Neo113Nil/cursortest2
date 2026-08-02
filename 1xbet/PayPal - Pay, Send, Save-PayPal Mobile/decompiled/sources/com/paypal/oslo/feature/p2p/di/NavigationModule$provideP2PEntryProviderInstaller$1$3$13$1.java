package com.paypal.oslo.feature.p2p.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final class NavigationModule$provideP2PEntryProviderInstaller$1$3$13$1 implements kotlin.jvm.functions.Function4<java.lang.String, java.lang.String, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlin.jvm.functions.Function0<? extends kotlin.Unit>, kotlin.Unit> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str, java.lang.String str2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId, kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0) {
        com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType publicProfileFlowType;
        final java.lang.String str3 = str;
        final java.lang.String str4 = str2;
        java.lang.String m11592unboximpl = navResultRequestId.m11592unboximpl();
        final kotlin.jvm.functions.Function0<? extends kotlin.Unit> function02 = function0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m11592unboximpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        if (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.INSTANCE.safeValueOf(this.getHighSpeedVideoFpsRanges.getIntent()) == com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.SEND) {
            publicProfileFlowType = com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType.SEND;
        } else {
            publicProfileFlowType = com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType.REQUEST;
        }
        final com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType publicProfileFlowType2 = publicProfileFlowType;
        final com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
        appNavigator.m11575navigateForResultInternaluBl809w(m11592unboximpl, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.publicprofile.api.navigation.result.ContactRemovedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$3$13$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$3$13$1.getHighResolutionOutputSizeshNQ4ISI(str3, str4, publicProfileFlowType2, function02, appNavigator, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType publicProfileFlowType, final kotlin.jvm.functions.Function0 function0, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileDestination(str, str2, publicProfileFlowType, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$3$13$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$3$13$1.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function0.this, appNavigator);
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function0 function0, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        function0.invoke();
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$3$13$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$3$13$1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    NavigationModule$provideP2PEntryProviderInstaller$1$3$13$1(com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination reviewDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        this.getHighSpeedVideoFpsRanges = reviewDestination;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
    }
}
