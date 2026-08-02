package com.paypal.oslo.feature.cashin.ui.screens;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$CashInMainScreenKt {
    public static final com.paypal.oslo.feature.cashin.ui.screens.ComposableSingletons$CashInMainScreenKt INSTANCE = new com.paypal.oslo.feature.cashin.ui.screens.ComposableSingletons$CashInMainScreenKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-703896745, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cashin.ui.screens.ComposableSingletons$CashInMainScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.cashin.ui.screens.ComposableSingletons$CashInMainScreenKt.$r8$lambda$_V8_su5IB2iWl_B56ODn9x2E0e0((com.paypal.oslo.core.navigation.AppNavigator) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$_V8_su5IB2iWl_B56ODn9x2E0e0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        if ((i & 6) == 0) {
            i |= composer.changed(appNavigator) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-703896745, i, -1, "com.paypal.oslo.feature.cashin.ui.screens.ComposableSingletons$CashInMainScreenKt.lambda$-703896745.<anonymous> (CashInMainScreen.kt:177)");
            }
            com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.CashInMapScreen(appNavigator, null, null, null, null, composer, i & 14, 30);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-703896745$cash_in_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m13482getLambda$703896745$cash_in_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
