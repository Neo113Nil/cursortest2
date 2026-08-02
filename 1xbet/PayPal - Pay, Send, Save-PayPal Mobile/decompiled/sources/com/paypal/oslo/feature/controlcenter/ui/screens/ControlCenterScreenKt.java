package com.paypal.oslo.feature.controlcenter.ui.screens;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001aY\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0013\u001a%\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0018²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"ControlCenterScreen", "", "currentDestination", "Landroidx/navigation3/runtime/NavKey;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/controlcenter/ui/viewmodels/ControlCenterViewModel;", "(Landroidx/navigation3/runtime/NavKey;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/controlcenter/ui/viewmodels/ControlCenterViewModel;Landroidx/compose/runtime/Composer;II)V", "ControlCenterScreenContent", "uiState", "Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent;", "getTabContent", "Lcom/paypal/oslo/feature/controlcenter/api/provider/TabContentProvider;", "(Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState;Landroidx/navigation3/runtime/NavKey;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FullScreenErrorState", "onRetry", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "control-center_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ControlCenterScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ControlCenterScreen(final androidx.navigation3.runtime.NavKey navKey, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel controlCenterViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        final com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel controlCenterViewModel2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel controlCenterViewModel3;
        int i5;
        boolean changedInstance;
        com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt$ControlCenterScreen$1$1 rememberedValue;
        boolean changedInstance2;
        com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt$ControlCenterScreen$2$1 rememberedValue2;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(512866753);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(navKey) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    controlCenterViewModel2 = controlCenterViewModel;
                    if (startRestartGroup.changedInstance(controlCenterViewModel2)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    controlCenterViewModel2 = controlCenterViewModel;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                controlCenterViewModel2 = controlCenterViewModel;
            }
            i4 = i3;
            if (!startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                } else {
                    modifier3 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
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
                        com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel controlCenterViewModel4 = (com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        int i8 = i4 & (-7169);
                        controlCenterViewModel3 = controlCenterViewModel4;
                        i5 = i8;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(512866753, i5, -1, "com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreen (ControlCenterScreen.kt:73)");
                        }
                        com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState controlCenterUiState = (com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(controlCenterViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
                        changedInstance = startRestartGroup.changedInstance(controlCenterViewModel3);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt$ControlCenterScreen$1$1(controlCenterViewModel3);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue);
                        changedInstance2 = startRestartGroup.changedInstance(controlCenterViewModel3);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt$ControlCenterScreen$2$1(controlCenterViewModel3);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ControlCenterScreenContent(controlCenterUiState, navKey, appNavigator, function1, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), modifier3, startRestartGroup, ((i5 << 9) & 458752) | ((i5 << 3) & 1008), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        controlCenterViewModel2 = controlCenterViewModel3;
                        modifier2 = modifier3;
                    } else {
                        modifier2 = modifier3;
                    }
                }
                modifier3 = modifier2;
                i5 = i4;
                controlCenterViewModel3 = controlCenterViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState controlCenterUiState2 = (com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(controlCenterViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
                changedInstance = startRestartGroup.changedInstance(controlCenterViewModel3);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = new com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt$ControlCenterScreen$1$1(controlCenterViewModel3);
                startRestartGroup.updateRememberedValue(rememberedValue);
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue);
                changedInstance2 = startRestartGroup.changedInstance(controlCenterViewModel3);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue2 = new com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt$ControlCenterScreen$2$1(controlCenterViewModel3);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                ControlCenterScreenContent(controlCenterUiState2, navKey, appNavigator, function12, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), modifier3, startRestartGroup, ((i5 << 9) & 458752) | ((i5 << 3) & 1008), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                controlCenterViewModel2 = controlCenterViewModel3;
                modifier2 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt.$r8$lambda$ogaVc0U6ikXDW_OOdxsTFlGa2PU(androidx.navigation3.runtime.NavKey.this, appNavigator, modifier2, controlCenterViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i3;
        if (!startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ControlCenterScreenContent(final com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState controlCenterUiState, final androidx.navigation3.runtime.NavKey navKey, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, ? extends com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider> function12, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> emptyList;
        androidx.compose.ui.Modifier modifier4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controlCenterUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-195135459);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changed(controlCenterUiState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(navKey) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier5 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-195135459, i3, -1, "com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenContent (ControlCenterScreen.kt:107)");
                }
                if ((controlCenterUiState instanceof com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Initial) || (controlCenterUiState instanceof com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Loading)) {
                    androidx.compose.ui.Modifier modifier6 = modifier5;
                    startRestartGroup.startReplaceGroup(2105662655);
                    if (controlCenterUiState instanceof com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Loading) {
                        emptyList = ((com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Loading) controlCenterUiState).getDefaultTabs();
                    } else {
                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier6, 0.0f, 1, null), "control_center_root_column");
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    modifier4 = modifier6;
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
                    startRestartGroup.startReplaceGroup(-1888925593);
                    java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> list = emptyList;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (com.paypal.oslo.core.navigation.ui.l1.TabDestination tabDestination : list) {
                        arrayList.add(new com.paypal.oslo.core.navigation.ui.l1.TabDestination(tabDestination.getDestination(), com.paypal.oslo.feature.controlcenter.ui.configs.ControlCenterTabConfigurationKt.resolveTabLabel(tabDestination, startRestartGroup, com.paypal.oslo.core.navigation.ui.l1.TabDestination.$stable), null, 4, null));
                    }
                    startRestartGroup.endReplaceGroup();
                    int i5 = i3 >> 3;
                    composer2 = startRestartGroup;
                    com.paypal.oslo.core.navigation.ui.l1.L1ContentKt.TabbedL1Content(navKey, appNavigator, arrayList, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "tabbed_content_test_tag"), com.paypal.oslo.feature.controlcenter.ui.screens.ComposableSingletons$ControlCenterScreenKt.INSTANCE.getLambda$234526454$control_center_prodRelease(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-755117733, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function3
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt.$r8$lambda$g5Nc1W9wBXOFBNOAa4qEhVmchBg(kotlin.jvm.functions.Function1.this, appNavigator, (androidx.navigation3.runtime.NavKey) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i5 & 14) | 224256 | (i5 & 112), 0);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                } else if (controlCenterUiState instanceof com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success) {
                    startRestartGroup.startReplaceGroup(2106987006);
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), "control_center_root_column");
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
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
                    startRestartGroup.startReplaceGroup(889465822);
                    java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> tabs = ((com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success) controlCenterUiState).getTabs();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(tabs, 10));
                    for (com.paypal.oslo.core.navigation.ui.l1.TabDestination tabDestination2 : tabs) {
                        arrayList2.add(new com.paypal.oslo.core.navigation.ui.l1.TabDestination(tabDestination2.getDestination(), com.paypal.oslo.feature.controlcenter.ui.configs.ControlCenterTabConfigurationKt.resolveTabLabel(tabDestination2, startRestartGroup, com.paypal.oslo.core.navigation.ui.l1.TabDestination.$stable), null, 4, null));
                    }
                    startRestartGroup.endReplaceGroup();
                    int i6 = i3 >> 3;
                    com.paypal.oslo.core.navigation.ui.l1.L1ContentKt.TabbedL1Content(navKey, appNavigator, arrayList2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "tabbed_content_test_tag"), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1987347821, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt.m13725$r8$lambda$UN3XWJrtm15FL7ysyZjQxuv6Ng(com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.this, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(127056530, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function3
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt.m13726$r8$lambda$zels7CbFFhorj53hTzKuWKBWzs(kotlin.jvm.functions.Function1.this, appNavigator, (androidx.navigation3.runtime.NavKey) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i6 & 14) | 224256 | (i6 & 112), 0);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                    modifier4 = modifier5;
                } else {
                    androidx.compose.ui.Modifier modifier7 = modifier5;
                    if (!(controlCenterUiState instanceof com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Error)) {
                        startRestartGroup.startReplaceGroup(1453396529);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(2108396545);
                    boolean z = (i3 & 7168) == 2048;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt.$r8$lambda$vka3uVtJZNsxbWKmGXZv59YFEB4(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    getHighResolutionOutputSizeshNQ4ISI((kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier7, 0.0f, 1, null), startRestartGroup, 0, 0);
                    startRestartGroup.endReplaceGroup();
                    modifier4 = modifier7;
                    composer2 = startRestartGroup;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt.$r8$lambda$OKaJ7edWPOkVMScCZh1AEmzpoM8(com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.this, navKey, appNavigator, function1, function12, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1897166521);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1897166521, i4, -1, "com.paypal.oslo.feature.controlcenter.ui.screens.FullScreenErrorState (ControlCenterScreen.kt:199)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(modifier3, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, ((i4 >> 3) & 14) | 48, 2), "full_screen_error_container");
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
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
                androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing32());
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), "error_content_column");
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, centerHorizontally, startRestartGroup, 48);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.controlcenter.R.string.feature_control_center_error_message, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "error_message_text"), com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 432, 6, 1016);
                composer2 = startRestartGroup;
                com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.controlcenter.R.string.feature_control_center_retry, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.ErrorScreen.RETRY_BUTTON), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, (i4 & 14) | 1769856, 408);
                composer2.endNode();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt.$r8$lambda$V86V6MM7UOlCrzA9LELC4KtA1SI(kotlin.jvm.functions.Function0.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$AKltOv6TwOA-oBDOeg7EZ5TrM7U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13724$r8$lambda$AKltOv6TwOAoBDOeg7EZ5TrM7U(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt.$r8$lambda$MSHwHWkWbxalQNNrGEb2Ql6Dxi0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MSHwHWkWbxalQNNrGEb2Ql6Dxi0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.userprofile.api.navigation.UpdatePhotoDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OKaJ7edWPOkVMScCZh1AEmzpoM8(com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState controlCenterUiState, androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ControlCenterScreenContent(controlCenterUiState, navKey, appNavigator, function1, function12, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UN3XWJrtm15-FL7ysyZjQxuv6Ng, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13725$r8$lambda$UN3XWJrtm15FL7ysyZjQxuv6Ng(com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState controlCenterUiState, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1987347821, i, -1, "com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenContent.<anonymous>.<anonymous> (ControlCenterScreen.kt:162)");
            }
            com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success success = (com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success) controlCenterUiState;
            com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile = success.getUserProfile();
            boolean showAccountSwitchChevron = success.getShowAccountSwitchChevron();
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "user_profile_header_tag");
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt.m13724$r8$lambda$AKltOv6TwOAoBDOeg7EZ5TrM7U(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileHeaderKt.UserProfileHeader(userProfile, appNavigator, testTag, showAccountSwitchChevron, !success.isUpdatePhotoEnabled() ? null : (kotlin.jvm.functions.Function0) rememberedValue, composer, 384, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$V86V6MM7UOlCrzA9LELC4KtA1SI(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g5Nc1W9wBXOFBNOAa4qEhVmchBg(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.NavKey navKey, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-755117733, i, -1, "com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenContent.<anonymous>.<anonymous> (ControlCenterScreen.kt:139)");
        }
        com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider tabContentProvider = (com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider) function1.invoke(navKey);
        kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content = tabContentProvider != null ? tabContentProvider.getContent() : null;
        if (content == null) {
            composer.startReplaceGroup(1326386581);
        } else {
            composer.startReplaceGroup(181333996);
            content.invoke(appNavigator, composer, 0);
        }
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ogaVc0U6ikXDW_OOdxsTFlGa2PU(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel controlCenterViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ControlCenterScreen(navKey, appNavigator, modifier, controlCenterViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vka3uVtJZNsxbWKmGXZv59YFEB4(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.RetryLoad.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zels7CbFFhorj53hTzKuWK-BWzs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13726$r8$lambda$zels7CbFFhorj53hTzKuWKBWzs(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.NavKey navKey, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(127056530, i, -1, "com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenContent.<anonymous>.<anonymous> (ControlCenterScreen.kt:172)");
        }
        com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider tabContentProvider = (com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider) function1.invoke(navKey);
        kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content = tabContentProvider != null ? tabContentProvider.getContent() : null;
        if (content == null) {
            composer.startReplaceGroup(1274971390);
        } else {
            composer.startReplaceGroup(1842243427);
            content.invoke(appNavigator, composer, 0);
        }
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
