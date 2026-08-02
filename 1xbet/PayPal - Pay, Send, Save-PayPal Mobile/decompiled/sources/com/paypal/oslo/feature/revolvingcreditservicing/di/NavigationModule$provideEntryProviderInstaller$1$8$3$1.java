package com.paypal.oslo.feature.revolvingcreditservicing.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final class NavigationModule$provideEntryProviderInstaller$1$8$3$1 implements kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultRequestId, androidx.navigation3.runtime.NavKey, kotlin.Unit> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId, androidx.navigation3.runtime.NavKey navKey) {
        java.lang.String m11592unboximpl = navResultRequestId.m11592unboximpl();
        final androidx.navigation3.runtime.NavKey navKey2 = navKey;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m11592unboximpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey2, "");
        this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(m11592unboximpl, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$1$8$3$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$1$8$3$1.getHighSpeedVideoFpsRangesFor(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    NavigationModule$provideEntryProviderInstaller$1$8$3$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        this.getHighSpeedVideoSizes = appNavigator;
    }
}
