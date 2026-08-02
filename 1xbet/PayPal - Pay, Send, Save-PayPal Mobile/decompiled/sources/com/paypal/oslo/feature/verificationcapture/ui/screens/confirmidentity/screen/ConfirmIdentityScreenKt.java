package com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a)\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\u0006\u001a\u00020\u0007X\u008a\u0084\u0002"}, d2 = {"ConfirmIdentityScreen", "", "viewModel", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/confirmidentity/viewmodel/ConfirmIdentityViewModel;", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/confirmidentity/viewmodel/ConfirmIdentityViewModel;Landroidx/compose/runtime/Composer;II)V", "ConfirmIdentityScreenContent", "uiState", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/confirmidentity/contract/ConfirmIdentityUiState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/confirmidentity/contract/ConfirmIdentityEvent;", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/confirmidentity/contract/ConfirmIdentityUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "verification-capture_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConfirmIdentityScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if ((r15 & 1) != 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfirmIdentityScreen(final com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel confirmIdentityViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1408285661);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && startRestartGroup.changedInstance(confirmIdentityViewModel)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
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
                    confirmIdentityViewModel = (com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i3 &= -15;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1408285661, i3, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreen (ConfirmIdentityScreen.kt:49)");
                }
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(confirmIdentityViewModel.getUiState(), null, startRestartGroup, 0, 1);
                com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator = (com.paypal.oslo.feature.verificationcapture.ui.util.Navigator) startRestartGroup.consume(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLocalNavigator());
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(confirmIdentityViewModel);
                boolean changedInstance2 = startRestartGroup.changedInstance(navigator);
                com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$ConfirmIdentityScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$ConfirmIdentityScreen$1$1(confirmIdentityViewModel, navigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState confirmIdentityUiState = (com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState) collectAsState.getValue();
                boolean changedInstance3 = startRestartGroup.changedInstance(confirmIdentityViewModel);
                com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$ConfirmIdentityScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$ConfirmIdentityScreen$2$1(confirmIdentityViewModel);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                ConfirmIdentityScreenContent(confirmIdentityUiState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), startRestartGroup, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt.$r8$lambda$gNWCbaF1N20M05BtY4zbegFVjv8(com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ConfirmIdentityScreenContent(final com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState confirmIdentityUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmIdentityUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(538377566);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(confirmIdentityUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(538377566, i3, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenContent (ConfirmIdentityScreen.kt:78)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing24());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), startRestartGroup, 0);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_confirm_identity_label, startRestartGroup, 0);
            int m8443getCentere0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk();
            androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.text.style.TextAlign m8436boximpl = androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8443getCentere0LSkKk);
            boolean z = false;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, fillMaxWidth$default2, null, null, m8436boximpl, null, false, 0, 0, null, null, startRestartGroup, 48, 0, 2028);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_document_capture_label, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, null, startRestartGroup, 48, 0, 2028);
            startRestartGroup.endNode();
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_document_next_label, startRestartGroup, 0);
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            boolean z2 = confirmIdentityUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState.Ready;
            boolean z3 = confirmIdentityUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState.PreparingLiveness;
            androidx.compose.ui.Modifier fillMaxWidth$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            if ((i3 & 112) == 32) {
                z = true;
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt.$r8$lambda$ZtW5fisAf_chcLsAstOm6ouBW4M(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource2, fillMaxWidth$default3, null, null, primary, large, z2, z3, startRestartGroup, 1769856, 24);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt.$r8$lambda$ZvFTbXihT49xQoiUVYrDZc5tRfc(com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZtW5fisAf_chcLsAstOm6ouBW4M(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityEvent.NextTapped.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZvFTbXihT49xQoiUVYrDZc5tRfc(com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState confirmIdentityUiState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        ConfirmIdentityScreenContent(confirmIdentityUiState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gNWCbaF1N20M05BtY4zbegFVjv8(com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel confirmIdentityViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ConfirmIdentityScreen(confirmIdentityViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
