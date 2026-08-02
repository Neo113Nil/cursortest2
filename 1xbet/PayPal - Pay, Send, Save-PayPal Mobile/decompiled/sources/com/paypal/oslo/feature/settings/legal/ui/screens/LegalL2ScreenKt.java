package com.paypal.oslo.feature.settings.legal.ui.screens;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a3\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\r\u001aA\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0014\u001a+\u0010\u0015\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u001a²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"LegalL2Screen", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalViewModel;", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalViewModel;Landroidx/compose/runtime/Composer;II)V", "LegalScreenContent", "state", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState;", "onIntent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent;", "(Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LegalSuccessScreen", "items", "", "Lcom/paypal/oslo/feature/settings/legal/ui/model/LegalItemUiData;", "showFooter", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LegalFooterComponent", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LegalScreenContentLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "LegalScreenContentSuccessPreview", "settings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LegalL2ScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if ((r14 & 2) != 0) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LegalL2Screen(final androidx.compose.ui.Modifier modifier, final com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel legalViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1321851378);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changedInstance(legalViewModel)) ? 32 : 16;
        }
        int i5 = i3;
        if (startRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = androidx.compose.ui.Modifier.INSTANCE;
                }
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
                    legalViewModel = (com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i5 &= -113;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1321851378, i5, -1, "com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2Screen (LegalL2Screen.kt:46)");
                }
                com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState legalState = (com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(legalViewModel.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
                boolean changedInstance = startRestartGroup.changedInstance(legalViewModel);
                com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$LegalL2Screen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$LegalL2Screen$1$1(legalViewModel);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                LegalScreenContent(legalState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue), modifier, startRestartGroup, (i5 << 6) & 896, 0);
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
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt.$r8$lambda$nt44jFmfuu8_IUMX4XCEwtrWFzM(androidx.compose.ui.Modifier.this, legalViewModel, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LegalScreenContent(final com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState legalState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2094727633);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(legalState) ? 4 : 2) | i;
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
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier5 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2094727633, i3, -1, "com.paypal.oslo.feature.settings.legal.ui.screens.LegalScreenContent (LegalL2Screen.kt:60)");
                }
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier5);
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
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_agreements_title, startRestartGroup, 0), null, null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(563107702, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt.$r8$lambda$G_plpAASnVDLf9LW52pB_l2hry0(kotlin.jvm.functions.Function1.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 1572864, 62);
                com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState screenState = legalState.getScreenState();
                if (screenState instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState.Loading) {
                    startRestartGroup.startReplaceGroup(47302665);
                    com.paypal.oslo.feature.settings.ui.components.LoadingScreenComponentKt.LoadingScreenComponent(null, null, startRestartGroup, 48, 1);
                    startRestartGroup.endReplaceGroup();
                    modifier4 = modifier5;
                    composer2 = startRestartGroup;
                } else {
                    if (!(screenState instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState.Ready)) {
                        startRestartGroup.startReplaceGroup(47300521);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(1466501316);
                    modifier4 = modifier5;
                    composer2 = startRestartGroup;
                    getHighSpeedVideoSizes(legalState.getItems(), function1, legalState.getShowFooter(), null, startRestartGroup, i3 & 112, 8);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt.m19262$r8$lambda$JJsW2ivJeXlwRmz0TtgIcTAIq4(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.this, function1, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent, kotlin.Unit> function1, final boolean z, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(63651247);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(63651247, i3, -1, "com.paypal.oslo.feature.settings.legal.ui.screens.LegalSuccessScreen (LegalL2Screen.kt:92)");
                }
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
                androidx.compose.ui.Modifier weight = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE.weight(androidx.compose.ui.Modifier.INSTANCE, 1.0f, true);
                boolean changedInstance = startRestartGroup.changedInstance(list);
                int i5 = i3 & 112;
                boolean z2 = i5 == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z2 | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt.$r8$lambda$BYOgshod5I_BRbSw7q4EXjH70O4(list, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                modifier3 = modifier4;
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(weight, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 510);
                if (z) {
                    startRestartGroup.startReplaceGroup(-214679402);
                    boolean z3 = i5 == 32;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt.$r8$lambda$M2yCQMxJjiVgERj5g4wXdMY2rrw(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    LegalFooterComponent((kotlin.jvm.functions.Function1) rememberedValue2, androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-214457411);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt.$r8$lambda$9mmp8pKsmhoreo2PGoxE3jaFtpw(list, function1, z, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LegalFooterComponent(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1907076748);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1907076748, i3, -1, "com.paypal.oslo.feature.settings.legal.ui.screens.LegalFooterComponent (LegalL2Screen.kt:121)");
                }
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_agreements_footer_text, startRestartGroup, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_agreements_footer_link_text, startRestartGroup, 0);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(stringResource);
                sb.append(" ");
                sb.append(stringResource2);
                com.paypal.pds.core.RichText richText = com.paypal.pds.core.RichTextKt.toRichText(sb.toString(), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(stringResource2, "legal_hub")));
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier3, "legal_footer");
                com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                boolean z = (i3 & 14) == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt.$r8$lambda$MkkB9raM1Q9QY683wcY93qQbgxc(kotlin.jvm.functions.Function1.this, (java.lang.String) obj, (java.lang.String) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, testTag, contentMuted, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue, bodyMedium, null, composer2, 384, 48, 5112);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt.m19263$r8$lambda$PVndADG4yMDIyehuXdFIpskK28(kotlin.jvm.functions.Function1.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8w3LPOm7BVytZH1mWsG99eZtGcg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-329142035);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-329142035, updateChangedFlags, -1, "com.paypal.oslo.feature.settings.legal.ui.screens.LegalScreenContentLoadingPreview (LegalL2Screen.kt:142)");
            }
            com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState legalState = new com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState.Loading.INSTANCE, null, false, 6, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt.$r8$lambda$kCOSzjjEKKs2V85OCMH4XRYdZ28((com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            LegalScreenContent(legalState, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt.$r8$lambda$8w3LPOm7BVytZH1mWsG99eZtGcg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9mmp8pKsmhoreo2PGoxE3jaFtpw(java.util.List list, kotlin.jvm.functions.Function1 function1, boolean z, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(list, function1, z, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BYOgshod5I_BRbSw7q4EXjH70O4(final java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$LegalSuccessScreen$lambda$0$0$0$$inlined$items$default$1 legalL2ScreenKt$LegalSuccessScreen$lambda$0$0$0$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$LegalSuccessScreen$lambda$0$0$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData legalItemUiData) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return invoke((com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData) obj);
            }
        };
        lazyListScope.items(list.size(), null, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$LegalSuccessScreen$lambda$0$0$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$LegalSuccessScreen$lambda$0$0$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData legalItemUiData = (com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData) list.get(i);
                composer.startReplaceGroup(1809054366);
                java.lang.String title = legalItemUiData.getTitle();
                java.lang.String subtitle = legalItemUiData.getSubtitle();
                boolean showDivider = legalItemUiData.getShowDivider();
                boolean showChevron = legalItemUiData.getShowChevron();
                boolean isBlank = kotlin.text.StringsKt.isBlank(legalItemUiData.getUrl());
                boolean changed = composer.changed(function1);
                boolean changed2 = composer.changed(legalItemUiData);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final kotlin.jvm.functions.Function1 function12 = function1;
                    rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$LegalSuccessScreen$1$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* synthetic */ kotlin.Unit invoke() {
                            function12.invoke(new com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLinkClicked(legalItemUiData));
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.settings.ui.components.SettingsItemComponentKt.SettingsItemComponent(title, (kotlin.jvm.functions.Function0) rememberedValue, null, subtitle, null, showDivider, showChevron, !isBlank, false, null, null, composer, 0, 0, 1812);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G_plpAASnVDLf9LW52pB_l2hry0(final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(563107702, i, -1, "com.paypal.oslo.feature.settings.legal.ui.screens.LegalScreenContent.<anonymous>.<anonymous> (LegalL2Screen.kt:67)");
            }
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt.$r8$lambda$tRX66WLFMKznzghssDSjRZrrDY4(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton((kotlin.jvm.functions.Function0) rememberedValue, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JJsW2ivJeXlw-Rmz0TtgIcTAIq4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19262$r8$lambda$JJsW2ivJeXlwRmz0TtgIcTAIq4(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState legalState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LegalScreenContent(legalState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$M2yCQMxJjiVgERj5g4wXdMY2rrw(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent legalEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalEvent, "");
        function1.invoke(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLegalHubClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MkkB9raM1Q9QY683wcY93qQbgxc(kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function1.invoke(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLegalHubClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PV-ndADG4yMDIyehuXdFIpskK28, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19263$r8$lambda$PVndADG4yMDIyehuXdFIpskK28(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LegalFooterComponent(function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_qIbs79PJKK1HqA7B-FK2VYjD8g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19264$r8$lambda$_qIbs79PJKK1HqA7BFK2VYjD8g(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1022191622);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1022191622, updateChangedFlags, -1, "com.paypal.oslo.feature.settings.legal.ui.screens.LegalScreenContentSuccessPreview (LegalL2Screen.kt:151)");
            }
            com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState legalState = new com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState.Ready.INSTANCE, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData[]{new com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData("user_agreement", "User Agreement", null, "test1", false, false, 52, null), new com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData("purchase_protection", "PayPal's Purchase Protection Program", null, "test2", false, false, 52, null), new com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewDisclaimerHelper.SELLER_PROTECTION_LINK_TAG, "PayPal's Seller Protection Program", null, "test3", false, false, 52, null)}), true);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt.$r8$lambda$zWNSrSRcWbl5pBaP8LeHPndyhpY((com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            LegalScreenContent(legalState, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.legal.ui.screens.LegalL2ScreenKt.m19264$r8$lambda$_qIbs79PJKK1HqA7BFK2VYjD8g(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kCOSzjjEKKs2V85OCMH4XRYdZ28(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent legalEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nt44jFmfuu8_IUMX4XCEwtrWFzM(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel legalViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LegalL2Screen(modifier, legalViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tRX66WLFMKznzghssDSjRZrrDY4(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnBackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zWNSrSRcWbl5pBaP8LeHPndyhpY(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent legalEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalEvent, "");
        return kotlin.Unit.INSTANCE;
    }
}
