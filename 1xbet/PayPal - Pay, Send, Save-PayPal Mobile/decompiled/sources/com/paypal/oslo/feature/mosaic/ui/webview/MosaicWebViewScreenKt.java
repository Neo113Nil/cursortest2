package com.paypal.oslo.feature.mosaic.ui.webview;

@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u0089\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2X\b\u0002\u0010\n\u001aR\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0014H\u0001¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"MosaicWebViewScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "destination", "Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicLegacyDestination;", "configurer", "Lcom/paypal/oslo/feature/verificationcapture/api/webview/VerificationCaptureWebViewConfigurer;", "viewModel", "Lcom/paypal/oslo/feature/mosaic/ui/webview/ComplianceWebViewViewModel;", "webViewContent", "Lkotlin/Function3;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lkotlin/ParameterName;", "name", "config", "Lkotlin/Function0;", "onBackClick", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicLegacyDestination;Lcom/paypal/oslo/feature/verificationcapture/api/webview/VerificationCaptureWebViewConfigurer;Lcom/paypal/oslo/feature/mosaic/ui/webview/ComplianceWebViewViewModel;Lkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;II)V", "mosaic_prodRelease", "uiState", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicWebViewScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:51:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MosaicWebViewScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination mosaicLegacyDestination, final com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewConfigurer verificationCaptureWebViewConfigurer, com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel complianceWebViewViewModel, kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel complianceWebViewViewModel2;
        final kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function52;
        final com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel complianceWebViewViewModel3;
        com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel complianceWebViewViewModel4;
        com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel complianceWebViewViewModel5;
        kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> lambda$157382682$mosaic_prodRelease;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean changedInstance;
        boolean z;
        com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt$MosaicWebViewScreen$1$1 rememberedValue;
        boolean changedInstance2;
        com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt$MosaicWebViewScreen$2$1 rememberedValue2;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicLegacyDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureWebViewConfigurer, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1105109505);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(mosaicLegacyDestination) : startRestartGroup.changedInstance(mosaicLegacyDestination) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(verificationCaptureWebViewConfigurer) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                complianceWebViewViewModel2 = complianceWebViewViewModel;
                if (startRestartGroup.changedInstance(complianceWebViewViewModel2)) {
                    i4 = 2048;
                    i3 |= i4;
                }
            } else {
                complianceWebViewViewModel2 = complianceWebViewViewModel;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            complianceWebViewViewModel2 = complianceWebViewViewModel;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function5) ? 16384 : 8192;
        }
        int i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 9363) != 9362, i6 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                    if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    complianceWebViewViewModel4 = (com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i6 &= -7169;
                } else {
                    complianceWebViewViewModel4 = complianceWebViewViewModel2;
                }
                if (i5 != 0) {
                    complianceWebViewViewModel5 = complianceWebViewViewModel4;
                    lambda$157382682$mosaic_prodRelease = com.paypal.oslo.feature.mosaic.ui.webview.ComposableSingletons$MosaicWebViewScreenKt.INSTANCE.getLambda$157382682$mosaic_prodRelease();
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1105109505, i6, -1, "com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreen (MosaicWebViewScreen.kt:59)");
                    }
                    androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(complianceWebViewViewModel5.getUiState$mosaic_prodRelease(), null, startRestartGroup, 0, 1);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    changedInstance = startRestartGroup.changedInstance(complianceWebViewViewModel5);
                    z = (i6 & 14) != 4;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt$MosaicWebViewScreen$1$1(complianceWebViewViewModel5, appNavigator, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                    com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState complianceWebViewUiState = (com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState) collectAsState.getValue();
                    com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl mosaicWebViewBuildUrl = complianceWebViewViewModel5.getMosaicWebViewBuildUrl();
                    changedInstance2 = startRestartGroup.changedInstance(complianceWebViewViewModel5);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt$MosaicWebViewScreen$2$1(complianceWebViewViewModel5);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2);
                    int i7 = i6 << 6;
                    com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentKt.MosaicWebViewContent(complianceWebViewUiState, mosaicLegacyDestination, appNavigator, verificationCaptureWebViewConfigurer, mosaicWebViewBuildUrl, function1, lambda$157382682$mosaic_prodRelease, startRestartGroup, (com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination.$stable << 3) | (i6 & 112) | (i7 & 896) | ((i6 << 3) & 7168) | (i7 & 3670016));
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    complianceWebViewViewModel3 = complianceWebViewViewModel5;
                    function52 = lambda$157382682$mosaic_prodRelease;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i6 &= -7169;
                }
                complianceWebViewViewModel4 = complianceWebViewViewModel2;
            }
            lambda$157382682$mosaic_prodRelease = function5;
            complianceWebViewViewModel5 = complianceWebViewViewModel4;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(complianceWebViewViewModel5.getUiState$mosaic_prodRelease(), null, startRestartGroup, 0, 1);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(complianceWebViewViewModel5);
            if ((i6 & 14) != 4) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | z)) {
            }
            rememberedValue = new com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt$MosaicWebViewScreen$1$1(complianceWebViewViewModel5, appNavigator, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState complianceWebViewUiState2 = (com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState) collectAsState2.getValue();
            com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl mosaicWebViewBuildUrl2 = complianceWebViewViewModel5.getMosaicWebViewBuildUrl();
            changedInstance2 = startRestartGroup.changedInstance(complianceWebViewViewModel5);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue2 = new com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt$MosaicWebViewScreen$2$1(complianceWebViewViewModel5);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2);
            int i72 = i6 << 6;
            com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentKt.MosaicWebViewContent(complianceWebViewUiState2, mosaicLegacyDestination, appNavigator, verificationCaptureWebViewConfigurer, mosaicWebViewBuildUrl2, function12, lambda$157382682$mosaic_prodRelease, startRestartGroup, (com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination.$stable << 3) | (i6 & 112) | (i72 & 896) | ((i6 << 3) & 7168) | (i72 & 3670016));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            complianceWebViewViewModel3 = complianceWebViewViewModel5;
            function52 = lambda$157382682$mosaic_prodRelease;
        } else {
            startRestartGroup.skipToGroupEnd();
            function52 = function5;
            complianceWebViewViewModel3 = complianceWebViewViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt.m15817$r8$lambda$hqI34TigtiAXO2IVk5vjfwnMBE(com.paypal.oslo.core.navigation.AppNavigator.this, mosaicLegacyDestination, verificationCaptureWebViewConfigurer, complianceWebViewViewModel3, function52, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$hqI34TigtiAXO2-IVk5vjfwnMBE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15817$r8$lambda$hqI34TigtiAXO2IVk5vjfwnMBE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination mosaicLegacyDestination, com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewConfigurer verificationCaptureWebViewConfigurer, com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel complianceWebViewViewModel, kotlin.jvm.functions.Function5 function5, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MosaicWebViewScreen(appNavigator, mosaicLegacyDestination, verificationCaptureWebViewConfigurer, complianceWebViewViewModel, function5, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
