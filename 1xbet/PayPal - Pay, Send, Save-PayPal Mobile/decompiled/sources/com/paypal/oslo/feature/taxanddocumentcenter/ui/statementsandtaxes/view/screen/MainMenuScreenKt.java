package com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.screen;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\n\u001a3\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"MainMenuScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/viewmodel/MainMenuViewModel;", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/viewmodel/MainMenuViewModel;Landroidx/compose/runtime/Composer;II)V", "RenderMainMenuScreenContent", "state", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MainMenuState;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/viewmodel/MainMenuViewModel;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MainMenuState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "onMenuItemClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuCardType;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MainMenuState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "tax-and-document-center_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MainMenuScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MainMenuScreen(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel mainMenuViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel mainMenuViewModel2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel mainMenuViewModel3;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(34325403);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                mainMenuViewModel2 = mainMenuViewModel;
                if (startRestartGroup.changedInstance(mainMenuViewModel2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                mainMenuViewModel2 = mainMenuViewModel;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            mainMenuViewModel2 = mainMenuViewModel;
        }
        int i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 19) != 18, i6 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                }
                modifier3 = modifier2;
            } else {
                modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
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
                    i6 &= -113;
                    mainMenuViewModel3 = (com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(34325403, i6, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.screen.MainMenuScreen (MainMenuScreen.kt:32)");
                    }
                    androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(mainMenuViewModel3.getState(), null, startRestartGroup, 0, 1);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
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
                    RenderMainMenuScreenContent(mainMenuViewModel3, (com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MainMenuState) collectAsState.getValue(), (androidx.compose.ui.Modifier) null, startRestartGroup, (i6 >> 3) & 14, 4);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    mainMenuViewModel2 = mainMenuViewModel3;
                }
            }
            mainMenuViewModel3 = mainMenuViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(mainMenuViewModel3.getState(), null, startRestartGroup, 0, 1);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            RenderMainMenuScreenContent(mainMenuViewModel3, (com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MainMenuState) collectAsState2.getValue(), (androidx.compose.ui.Modifier) null, startRestartGroup, (i6 >> 3) & 14, 4);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            mainMenuViewModel2 = mainMenuViewModel3;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.screen.MainMenuScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.screen.MainMenuScreenKt.$r8$lambda$Q7ZR4fwQTWsfMzqzWaLmscR7rdM(androidx.compose.ui.Modifier.this, mainMenuViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void RenderMainMenuScreenContent(final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel mainMenuViewModel, final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MainMenuState mainMenuState, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainMenuViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainMenuState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1622597575);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(mainMenuViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(mainMenuState) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1622597575, i3, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.screen.RenderMainMenuScreenContent (MainMenuScreen.kt:49)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(mainMenuViewModel);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.screen.MainMenuScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.screen.MainMenuScreenKt.m20362$r8$lambda$5ThyMy2pC6JzjzNIEXEXOhxyJI(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel.this, (com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            RenderMainMenuScreenContent(mainMenuState, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType, kotlin.Unit>) rememberedValue, modifier, startRestartGroup, ((i3 >> 3) & 14) | (i3 & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.screen.MainMenuScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.screen.MainMenuScreenKt.m20361$r8$lambda$R4TyWNPPljzBQWHrG8MnbqAVVI(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel.this, mainMenuState, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void RenderMainMenuScreenContent(final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MainMenuState mainMenuState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainMenuState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-672121548);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(mainMenuState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i5 = i3;
        if (!startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-672121548, i5, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.screen.RenderMainMenuScreenContent (MainMenuScreen.kt:68)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(modifier, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, ((i5 >> 6) & 14) | 48, 2), "main_menu_container");
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
            com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.compose.MainMenuComposeKt.RenderMainMenuScreenUI(mainMenuState, function1, startRestartGroup, i5 & 126);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.screen.MainMenuScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.screen.MainMenuScreenKt.m20363$r8$lambda$ZBaxxrrcQdUGgrQ4XJ0KTn3GLs(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MainMenuState.this, function1, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-R4TyWNPPljzBQWHrG8MnbqAVVI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20361$r8$lambda$R4TyWNPPljzBQWHrG8MnbqAVVI(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel mainMenuViewModel, com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MainMenuState mainMenuState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderMainMenuScreenContent(mainMenuViewModel, mainMenuState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5ThyMy2pC6Jzjz-NIEXEXOhxyJI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20362$r8$lambda$5ThyMy2pC6JzjzNIEXEXOhxyJI(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel mainMenuViewModel, com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType menuCardType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuCardType, "");
        mainMenuViewModel.processIntent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.intent.MainMenuIntent.MenuItemClicked(menuCardType));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q7ZR4fwQTWsfMzqzWaLmscR7rdM(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel mainMenuViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MainMenuScreen(modifier, mainMenuViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZBaxxrrcQdUGgrQ-4XJ0KTn3GLs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20363$r8$lambda$ZBaxxrrcQdUGgrQ4XJ0KTn3GLs(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MainMenuState mainMenuState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderMainMenuScreenContent(mainMenuState, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType, kotlin.Unit>) function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
