package com.paypal.oslo.feature.wallet.me.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ComposableSingletons$AccountsTabContentProviderKt {
    public static final com.paypal.oslo.feature.wallet.me.di.ComposableSingletons$AccountsTabContentProviderKt INSTANCE = new com.paypal.oslo.feature.wallet.me.di.ComposableSingletons$AccountsTabContentProviderKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1210630728, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.me.di.ComposableSingletons$AccountsTabContentProviderKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.wallet.me.di.ComposableSingletons$AccountsTabContentProviderKt.m21380$r8$lambda$l6WUVCYY8GP4wsuvhC2ecxyGnQ((com.paypal.oslo.core.navigation.AppNavigator) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    /* renamed from: $r8$lambda$l6WUVCYY8GP4wsuvhC2ecxyG-nQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21380$r8$lambda$l6WUVCYY8GP4wsuvhC2ecxyGnQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1210630728, i, -1, "com.paypal.oslo.feature.wallet.me.di.ComposableSingletons$AccountsTabContentProviderKt.lambda$-1210630728.<anonymous> (AccountsTabContentProvider.kt:25)");
            }
            com.paypal.oslo.feature.wallet.me.ui.AccountsScreenKt.AccountsScreen(null, null, composer, 0, 3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1210630728$wallet_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21381getLambda$1210630728$wallet_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
