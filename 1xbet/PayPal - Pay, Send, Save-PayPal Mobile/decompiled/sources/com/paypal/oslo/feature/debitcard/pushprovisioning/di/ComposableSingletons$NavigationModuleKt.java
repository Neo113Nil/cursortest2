package com.paypal.oslo.feature.debitcard.pushprovisioning.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$NavigationModuleKt {
    public static final com.paypal.oslo.feature.debitcard.pushprovisioning.di.ComposableSingletons$NavigationModuleKt INSTANCE = new com.paypal.oslo.feature.debitcard.pushprovisioning.di.ComposableSingletons$NavigationModuleKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.DebitAddToWalletDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-976314688, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.di.ComposableSingletons$NavigationModuleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.debitcard.pushprovisioning.di.ComposableSingletons$NavigationModuleKt.$r8$lambda$T4FBP5eJtIcswp0vPqNUGB4qYMY((com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.DebitAddToWalletDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$T4FBP5eJtIcswp0vPqNUGB4qYMY(com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.DebitAddToWalletDestination debitAddToWalletDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitAddToWalletDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-976314688, i, -1, "com.paypal.oslo.feature.debitcard.pushprovisioning.di.ComposableSingletons$NavigationModuleKt.lambda$-976314688.<anonymous> (NavigationModule.kt:33)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-976314688$debit_card_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.DebitAddToWalletDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m14257getLambda$976314688$debit_card_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
