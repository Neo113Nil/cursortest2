package com.paypal.oslo.feature.mosaic.ui.legacy;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"MosaicLegacyFlowScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "destination", "Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicLegacyDestination;", "configurer", "Lcom/paypal/oslo/feature/verificationcapture/api/webview/VerificationCaptureWebViewConfigurer;", "viewModel", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/MosaicLegacyFlowViewModel;", "complianceViewModel", "Lcom/paypal/oslo/feature/mosaic/ui/webview/ComplianceWebViewViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicLegacyDestination;Lcom/paypal/oslo/feature/verificationcapture/api/webview/VerificationCaptureWebViewConfigurer;Lcom/paypal/oslo/feature/mosaic/ui/legacy/MosaicLegacyFlowViewModel;Lcom/paypal/oslo/feature/mosaic/ui/webview/ComplianceWebViewViewModel;Landroidx/compose/runtime/Composer;I)V", "mosaic_prodRelease", "uiState", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicLegacyFlowScreenKt {
    public static final void MosaicLegacyFlowScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination mosaicLegacyDestination, final com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewConfigurer verificationCaptureWebViewConfigurer, final com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel mosaicLegacyFlowViewModel, final com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel complianceWebViewViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicLegacyDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureWebViewConfigurer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicLegacyFlowViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(complianceWebViewViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-351120018);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(mosaicLegacyDestination) : startRestartGroup.changedInstance(mosaicLegacyDestination) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(verificationCaptureWebViewConfigurer) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(mosaicLegacyFlowViewModel) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(complianceWebViewViewModel) ? 16384 : 8192;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-351120018, i3, -1, "com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowScreen (MosaicLegacyFlowScreen.kt:37)");
            }
            com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState mosaicLegacyFlowUiState = (com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(mosaicLegacyFlowViewModel.getUiState$mosaic_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
            if (mosaicLegacyFlowUiState instanceof com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.Loading) {
                startRestartGroup.startReplaceGroup(-1970700775);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else if (mosaicLegacyFlowUiState instanceof com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.AdroitWebFlow) {
                startRestartGroup.startReplaceGroup(-1970460370);
                com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt.MosaicWebViewScreen(appNavigator, mosaicLegacyDestination, verificationCaptureWebViewConfigurer, complianceWebViewViewModel, null, startRestartGroup, (com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination.$stable << 3) | (i3 & 14) | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168), 16);
                startRestartGroup.endReplaceGroup();
            } else if (mosaicLegacyFlowUiState instanceof com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.MosaicWebFlow) {
                startRestartGroup.startReplaceGroup(-1970176100);
                com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt.MosaicWebViewScreen(appNavigator, mosaicLegacyDestination, verificationCaptureWebViewConfigurer, complianceWebViewViewModel, null, startRestartGroup, (com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination.$stable << 3) | (i3 & 14) | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168), 16);
                startRestartGroup.endReplaceGroup();
            } else if (mosaicLegacyFlowUiState instanceof com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.NativeFlow) {
                startRestartGroup.startReplaceGroup(-1969816004);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Native flow not yet supported, falling back to web", null, null, 6, null);
                com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt.MosaicWebViewScreen(appNavigator, mosaicLegacyDestination, verificationCaptureWebViewConfigurer, complianceWebViewViewModel, null, startRestartGroup, (com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination.$stable << 3) | (i3 & 14) | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168), 16);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1876090723);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowScreenKt.$r8$lambda$pPmN0IDKCWm2zQnbRbihfdTPZ9o(com.paypal.oslo.core.navigation.AppNavigator.this, mosaicLegacyDestination, verificationCaptureWebViewConfigurer, mosaicLegacyFlowViewModel, complianceWebViewViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pPmN0IDKCWm2zQnbRbihfdTPZ9o(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination mosaicLegacyDestination, com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewConfigurer verificationCaptureWebViewConfigurer, com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel mosaicLegacyFlowViewModel, com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel complianceWebViewViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        MosaicLegacyFlowScreen(appNavigator, mosaicLegacyDestination, verificationCaptureWebViewConfigurer, mosaicLegacyFlowViewModel, complianceWebViewViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
