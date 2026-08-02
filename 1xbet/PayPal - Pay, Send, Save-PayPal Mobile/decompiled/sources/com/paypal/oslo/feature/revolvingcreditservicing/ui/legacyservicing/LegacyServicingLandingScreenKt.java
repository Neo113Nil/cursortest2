package com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"LegacyServicingLandingScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingViewModel;Landroidx/compose/runtime/Composer;I)V", "LegacyServicingLandingScreenContent", "state", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingState;", "onRetry", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "revolvingcredit-servicing_prodRelease", "uiState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LegacyServicingLandingScreenKt {
    public static final void LegacyServicingLandingScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel legacyServicingLandingViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyServicingLandingViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-137298913);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(legacyServicingLandingViewModel) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-137298913, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.LegacyServicingLandingScreen (LegacyServicingLandingScreen.kt:50)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(legacyServicingLandingViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(legacyServicingLandingViewModel);
            boolean z = (i3 & 14) == 4;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.LegacyServicingLandingScreenKt$LegacyServicingLandingScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.LegacyServicingLandingScreenKt$LegacyServicingLandingScreen$1$1(legacyServicingLandingViewModel, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState legacyServicingLandingState = (com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState) collectAsStateWithLifecycle.getValue();
            boolean changedInstance2 = startRestartGroup.changedInstance(legacyServicingLandingViewModel);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.LegacyServicingLandingScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.LegacyServicingLandingScreenKt.$r8$lambda$LOHDpemfcZ9lOyZo2YOhT6A0Gzc(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            getHighSpeedVideoFpsRanges(legacyServicingLandingState, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.LegacyServicingLandingScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.LegacyServicingLandingScreenKt.m18417$r8$lambda$MJbroecF1Kh3nimyJM2IIfUVzA(com.paypal.oslo.core.navigation.AppNavigator.this, legacyServicingLandingViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState legacyServicingLandingState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1128513641);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(legacyServicingLandingState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1128513641, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.LegacyServicingLandingScreenContent (LegacyServicingLandingScreen.kt:84)");
            }
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
            if ((legacyServicingLandingState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.Initial) || (legacyServicingLandingState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.Loading)) {
                startRestartGroup.startReplaceGroup(2060326221);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.loading.LoadingContentKt.LoadingContent(null, startRestartGroup, 0, 1);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!(legacyServicingLandingState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.Error)) {
                    startRestartGroup.startReplaceGroup(2060323457);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(-554299030);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_something_went_wrong_error_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorKt.Error(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_critical_error_description, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), stringResOnly, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_try_again, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment.CENTER, null, null, false, 224, null), androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), function0, startRestartGroup, ((i2 << 3) & 896) | 48, 0);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.LegacyServicingLandingScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.LegacyServicingLandingScreenKt.$r8$lambda$1kXBl9qSigcjNGjEDy0oA2ARxkw(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1kXBl9qSigcjNGjEDy0oA2ARxkw(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState legacyServicingLandingState, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(legacyServicingLandingState, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LOHDpemfcZ9lOyZo2YOhT6A0Gzc(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel legacyServicingLandingViewModel) {
        legacyServicingLandingViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent.OnRetryClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$M-JbroecF1Kh3nimyJM2IIfUVzA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18417$r8$lambda$MJbroecF1Kh3nimyJM2IIfUVzA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel legacyServicingLandingViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        LegacyServicingLandingScreen(appNavigator, legacyServicingLandingViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
