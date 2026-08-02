package com.paypal.oslo.feature.settings.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$NavigationModuleKt {
    public static final com.paypal.oslo.feature.settings.di.ComposableSingletons$NavigationModuleKt INSTANCE = new com.paypal.oslo.feature.settings.di.ComposableSingletons$NavigationModuleKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.feature.settings.api.navigation.LegalDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(700395, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.settings.di.ComposableSingletons$NavigationModuleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.settings.di.ComposableSingletons$NavigationModuleKt.m19254$r8$lambda$zyq6FyctR4C4XQOe8XHSRoUChM((com.paypal.oslo.feature.settings.api.navigation.LegalDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    /* renamed from: $r8$lambda$zyq6FyctR4C4XQO-e8XHSRoUChM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19254$r8$lambda$zyq6FyctR4C4XQOe8XHSRoUChM(com.paypal.oslo.feature.settings.api.navigation.LegalDestination legalDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(700395, i, -1, "com.paypal.oslo.feature.settings.di.ComposableSingletons$NavigationModuleKt.lambda$700395.<anonymous> (NavigationModule.kt:74)");
        }
        com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt.LegalL2Screen(null, null, composer, 0, 3);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.settings.api.navigation.LegalDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$700395$settings_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
