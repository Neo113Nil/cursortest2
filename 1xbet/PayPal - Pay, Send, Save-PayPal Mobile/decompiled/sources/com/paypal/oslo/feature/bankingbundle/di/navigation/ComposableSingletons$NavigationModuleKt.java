package com.paypal.oslo.feature.bankingbundle.di.navigation;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$NavigationModuleKt {
    public static final com.paypal.oslo.feature.bankingbundle.di.navigation.ComposableSingletons$NavigationModuleKt INSTANCE = new com.paypal.oslo.feature.bankingbundle.di.navigation.ComposableSingletons$NavigationModuleKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleHomeDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2143882362, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.ComposableSingletons$NavigationModuleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.bankingbundle.di.navigation.ComposableSingletons$NavigationModuleKt.$r8$lambda$hYxn7kyn_IinZfxs96ctlVqQDUc((com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleHomeDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$hYxn7kyn_IinZfxs96ctlVqQDUc(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleHomeDestination bankingBundleHomeDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleHomeDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2143882362, i, -1, "com.paypal.oslo.feature.bankingbundle.di.navigation.ComposableSingletons$NavigationModuleKt.lambda$-2143882362.<anonymous> (NavigationModule.kt:61)");
        }
        com.paypal.oslo.feature.bankingbundle.ui.BankingBundleHomeScreenKt.BankingBundleHomeScreen(null, composer, 0, 1);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-2143882362$banking_bundle_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleHomeDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m12202getLambda$2143882362$banking_bundle_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
