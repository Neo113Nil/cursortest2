package com.paypal.oslo.feature.taxanddocumentcenter.di.navigation;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$NavigationModuleKt {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.ComposableSingletons$NavigationModuleKt INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.ComposableSingletons$NavigationModuleKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.StatementsAndTaxesDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-658325534, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.ComposableSingletons$NavigationModuleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.ComposableSingletons$NavigationModuleKt.$r8$lambda$bpSzf029pGoaf4aH7CuToYJIp64((com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.StatementsAndTaxesDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$bpSzf029pGoaf4aH7CuToYJIp64(com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.StatementsAndTaxesDestination statementsAndTaxesDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementsAndTaxesDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-658325534, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.ComposableSingletons$NavigationModuleKt.lambda$-658325534.<anonymous> (NavigationModule.kt:45)");
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.screen.MainMenuScreenKt.MainMenuScreen(null, null, composer, 0, 3);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-658325534$tax_and_document_center_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.StatementsAndTaxesDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m20291getLambda$658325534$tax_and_document_center_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
