package com.paypal.oslo.feature.settings.ui.provider;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$SettingsTabContentProviderKt {
    public static final com.paypal.oslo.feature.settings.ui.provider.ComposableSingletons$SettingsTabContentProviderKt INSTANCE = new com.paypal.oslo.feature.settings.ui.provider.ComposableSingletons$SettingsTabContentProviderKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1799682690, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.settings.ui.provider.ComposableSingletons$SettingsTabContentProviderKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.settings.ui.provider.ComposableSingletons$SettingsTabContentProviderKt.$r8$lambda$9b3UgyPlm_j2eDHQ6KAha2JlDK4((com.paypal.oslo.core.navigation.AppNavigator) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$9b3UgyPlm_j2eDHQ6KAha2JlDK4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        if ((i & 6) == 0) {
            i |= composer.changed(appNavigator) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1799682690, i, -1, "com.paypal.oslo.feature.settings.ui.provider.ComposableSingletons$SettingsTabContentProviderKt.lambda$-1799682690.<anonymous> (SettingsTabContentProvider.kt:24)");
            }
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.SettingsScreen((com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), appNavigator, null, null, composer, (i << 3) & 112, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1799682690$settings_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19297getLambda$1799682690$settings_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
