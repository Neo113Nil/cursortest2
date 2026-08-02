package com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a3\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u0006\u001a\u00020\u0007X\u008a\u0084\u0002"}, d2 = {"VerificationCaptureTutorialScreen", "", "viewModel", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/viewmodel/VerificationCaptureTutorialViewModel;", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/viewmodel/VerificationCaptureTutorialViewModel;Landroidx/compose/runtime/Composer;II)V", "VerificationCaptureTutorialScreenContent", "uiState", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialUiState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "verification-capture_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VerificationCaptureTutorialScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerificationCaptureTutorialScreen(final com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.viewmodel.VerificationCaptureTutorialViewModel verificationCaptureTutorialViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        boolean changedInstance;
        boolean changedInstance2;
        com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$1$1 rememberedValue;
        boolean changedInstance3;
        com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$2$1 rememberedValue2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1169190702);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && startRestartGroup.changedInstance(verificationCaptureTutorialViewModel)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            } else if ((i2 & 1) != 0) {
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
                verificationCaptureTutorialViewModel = (com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.viewmodel.VerificationCaptureTutorialViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.viewmodel.VerificationCaptureTutorialViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i4 = i3 & (-15);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1169190702, i4, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreen (VerificationCaptureTutorialScreen.kt:52)");
                }
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(verificationCaptureTutorialViewModel.getUiState(), null, startRestartGroup, 0, 1);
                com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator = (com.paypal.oslo.feature.verificationcapture.ui.util.Navigator) startRestartGroup.consume(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLocalNavigator());
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(verificationCaptureTutorialViewModel);
                changedInstance2 = startRestartGroup.changedInstance(navigator);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$1$1(verificationCaptureTutorialViewModel, navigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialUiState verificationCaptureTutorialUiState = (com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialUiState) collectAsState.getValue();
                changedInstance3 = startRestartGroup.changedInstance(verificationCaptureTutorialViewModel);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$2$1(verificationCaptureTutorialViewModel);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                VerificationCaptureTutorialScreenContent(verificationCaptureTutorialUiState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), null, startRestartGroup, 0, 4);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            i4 = i3;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(verificationCaptureTutorialViewModel.getUiState(), null, startRestartGroup, 0, 1);
            com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator2 = (com.paypal.oslo.feature.verificationcapture.ui.util.Navigator) startRestartGroup.consume(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLocalNavigator());
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(verificationCaptureTutorialViewModel);
            changedInstance2 = startRestartGroup.changedInstance(navigator2);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | changedInstance2)) {
            }
            rememberedValue = new com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$1$1(verificationCaptureTutorialViewModel, navigator2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialUiState verificationCaptureTutorialUiState2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialUiState) collectAsState2.getValue();
            changedInstance3 = startRestartGroup.changedInstance(verificationCaptureTutorialViewModel);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue2 = new com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$2$1(verificationCaptureTutorialViewModel);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            VerificationCaptureTutorialScreenContent(verificationCaptureTutorialUiState2, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), null, startRestartGroup, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt.m20689$r8$lambda$KPTHO1cxXUngHf0chb09Lr9ilE(com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.viewmodel.VerificationCaptureTutorialViewModel.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerificationCaptureTutorialScreenContent(final com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialUiState verificationCaptureTutorialUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureTutorialUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-391122622);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(verificationCaptureTutorialUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-391122622, i4, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenContent (VerificationCaptureTutorialScreen.kt:93)");
                }
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing24());
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
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_tutorial_take_photo_label, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, null, startRestartGroup, 48, 0, 2028);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_tutorial_place_id_label, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, null, startRestartGroup, 48, 0, 2028);
                startRestartGroup.endNode();
                androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_document_next_label, startRestartGroup, 0);
                com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                boolean z = verificationCaptureTutorialUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialUiState.Ready;
                boolean z2 = verificationCaptureTutorialUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialUiState.CheckingPermissions;
                androidx.compose.ui.Modifier fillMaxWidth$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                int i6 = i4 & 112;
                boolean z3 = i6 == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt.$r8$lambda$PyaXsylEuKuKwuZt1rxgFW6J47g(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, fillMaxWidth$default3, null, null, primary, large, z, z2, startRestartGroup, 1769856, 24);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_cancel_label, startRestartGroup, 0);
                com.paypal.pds.components.ButtonSize.Large large2 = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                androidx.compose.ui.Modifier fillMaxWidth$default4 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                boolean z4 = i6 == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt.$r8$lambda$aHe53njOiZjU4nWP5OkSk6WcCjU(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, stringResource2, fillMaxWidth$default4, null, null, secondary, large2, z, false, startRestartGroup, 1769856, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt.$r8$lambda$WjwBSVX50ZUUAgOXnb2hckoeLYM(com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialUiState.this, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$KPTHO1cx-XUngHf0chb09Lr9ilE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20689$r8$lambda$KPTHO1cxXUngHf0chb09Lr9ilE(com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.viewmodel.VerificationCaptureTutorialViewModel verificationCaptureTutorialViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        VerificationCaptureTutorialScreen(verificationCaptureTutorialViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PyaXsylEuKuKwuZt1rxgFW6J47g(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent.ContinueTapped.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WjwBSVX50ZUUAgOXnb2hckoeLYM(com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialUiState verificationCaptureTutorialUiState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        VerificationCaptureTutorialScreenContent(verificationCaptureTutorialUiState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aHe53njOiZjU4nWP5OkSk6WcCjU(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent.CancelTapped.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
