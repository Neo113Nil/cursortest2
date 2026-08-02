package com.paypal.oslo.feature.settings.closeaccount.ui.screen;

@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a[\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00012\b\b\u0001\u0010\n\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\u00012\b\b\u0001\u0010\n\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\u001a\u0017\u0010\u001d\u001a\u00020\u00012\b\b\u0001\u0010\n\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002"}, d2 = {"CloseYourAccountScreen", "", "viewModel", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/viewmodel/CloseYourAccountViewModel;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "(Lcom/paypal/oslo/feature/settings/closeaccount/ui/viewmodel/CloseYourAccountViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/Composer;I)V", "CloseYourAccountContent", "topBar", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiTopBar;", "items", "", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiItem;", "footer", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;", "isCloseAccountLoading", "", "onIntent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent;", "modifier", "Landroidx/compose/ui/Modifier;", "userInput", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserInput;", "(Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiTopBar;Ljava/util/List;Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserInput;Landroidx/compose/runtime/Composer;II)V", "CloseYourAccountPersonalUserPreview", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseYourAccountStepContent;", "(Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseYourAccountStepContent;Landroidx/compose/runtime/Composer;I)V", "CloseYourAccountContentBusinessUserPreview", "CloseYourAccountIneligibleUserPreview", "settings_prodRelease", "state", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseYourAccountScreenKt {
    public static final void CloseYourAccountScreen(final com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel closeYourAccountViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeYourAccountViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-739057873);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(closeYourAccountViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        int i3 = i2;
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-739057873, i3, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreen (CloseYourAccountScreen.kt:52)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(closeYourAccountViewModel.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(closeYourAccountViewModel);
            boolean z = (i3 & 112) == 32;
            com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1(closeYourAccountViewModel, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            com.paypal.oslo.feature.settings.closeaccount.ui.model.ScreenState screenState = ((com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState) collectAsStateWithLifecycle.getValue()).getScreenState();
            if (screenState instanceof com.paypal.oslo.feature.settings.closeaccount.ui.model.ScreenState.Error) {
                startRestartGroup.startReplaceGroup(-1564976280);
                boolean changedInstance2 = startRestartGroup.changedInstance(closeYourAccountViewModel);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt.m19253$r8$lambda$ydV83nC0NO5DGiPChEgaD41P0(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenKt.SettingsErrorScreen(null, null, null, null, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 127);
                startRestartGroup.endReplaceGroup();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(screenState, com.paypal.oslo.feature.settings.closeaccount.ui.model.ScreenState.Initial.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(screenState, com.paypal.oslo.feature.settings.closeaccount.ui.model.ScreenState.Loading.INSTANCE)) {
                startRestartGroup.startReplaceGroup(-1564969785);
                com.paypal.oslo.feature.settings.ui.components.LoadingScreenComponentKt.LoadingScreenComponent(null, null, startRestartGroup, 0, 3);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(screenState, com.paypal.oslo.feature.settings.closeaccount.ui.model.ScreenState.Ready.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(-1564977706);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(-1269361294);
                com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar topBar = ((com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState) collectAsStateWithLifecycle.getValue()).getTopBar();
                java.util.List<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> content = ((com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState) collectAsStateWithLifecycle.getValue()).getContent();
                com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter footer = ((com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState) collectAsStateWithLifecycle.getValue()).getFooter();
                boolean changedInstance3 = startRestartGroup.changedInstance(closeYourAccountViewModel);
                com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$3$1(closeYourAccountViewModel);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                CloseYourAccountContent(topBar, content, footer, ((com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState) collectAsStateWithLifecycle.getValue()).isCloseAccountLoading(), (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3), null, ((com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState) collectAsStateWithLifecycle.getValue()).getUserInput(), startRestartGroup, 0, 32);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt.m19252$r8$lambda$l8_GUbR6PPecvX4mdidEIUpUWU(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.this, appNavigator, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CloseYourAccountContent(final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar closeAccountUiTopBar, final java.util.List<? extends com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> list, final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter closeAccountUiFooter, final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput4;
        int i4;
        androidx.compose.ui.Modifier modifier4;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountUiTopBar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountUiFooter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2055268721);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(closeAccountUiTopBar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(closeAccountUiFooter) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    closeAccountUserInput2 = closeAccountUserInput;
                    if (startRestartGroup.changedInstance(closeAccountUserInput2)) {
                        i5 = 1048576;
                        i3 |= i5;
                    }
                } else {
                    closeAccountUserInput2 = closeAccountUserInput;
                }
                i5 = 524288;
                i3 |= i5;
            } else {
                closeAccountUserInput2 = closeAccountUserInput;
            }
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    companion = modifier2;
                } else {
                    companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 64) != 0) {
                        closeAccountUserInput4 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput(null, null, null, 7, null);
                        i4 = i3 & (-3670017);
                        modifier4 = companion;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-2055268721, i4, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContent (CloseYourAccountScreen.kt:109)");
                        }
                        int i7 = i4;
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        int i8 = i7 >> 6;
                        com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.CloseYourAccountTopBar(closeAccountUiTopBar.getShowBackButton(), closeAccountUiTopBar.getTitle(), function1, null, startRestartGroup, i8 & 896, 8);
                        androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                        int i9 = i7 >> 3;
                        int i10 = i7 >> 9;
                        int i11 = i10 & 112;
                        com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.CloseYourAccountMapper(list, function1, weight$default, closeAccountUserInput4, startRestartGroup, (i9 & 14) | i11 | (i10 & 7168), 0);
                        com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.CloseYourAccountFooter(closeAccountUiFooter, function1, z, androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing32()), startRestartGroup, (i8 & 14) | i11 | (i9 & 896), 0);
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        closeAccountUserInput3 = closeAccountUserInput4;
                    }
                }
                i4 = i3;
                modifier4 = companion;
                closeAccountUserInput4 = closeAccountUserInput2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i72 = i4;
                androidx.compose.ui.Modifier modifier52 = modifier4;
                androidx.compose.ui.Modifier background2 = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                int i82 = i72 >> 6;
                com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.CloseYourAccountTopBar(closeAccountUiTopBar.getShowBackButton(), closeAccountUiTopBar.getTitle(), function1, null, startRestartGroup, i82 & 896, 8);
                androidx.compose.ui.Modifier weight$default2 = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                int i92 = i72 >> 3;
                int i102 = i72 >> 9;
                int i112 = i102 & 112;
                com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.CloseYourAccountMapper(list, function1, weight$default2, closeAccountUserInput4, startRestartGroup, (i92 & 14) | i112 | (i102 & 7168), 0);
                com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.CloseYourAccountFooter(closeAccountUiFooter, function1, z, androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing32()), startRestartGroup, (i82 & 14) | i112 | (i92 & 896), 0);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                closeAccountUserInput3 = closeAccountUserInput4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                closeAccountUserInput3 = closeAccountUserInput2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt.$r8$lambda$jJxW2E36ktOEOJm6Ak8_5fJa0ig(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar.this, list, closeAccountUiFooter, z, function1, modifier3, closeAccountUserInput3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((1572864 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1ZCENbiGD0UEinZgdsDPhXMVoWo(final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent closeYourAccountStepContent, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1143214362);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(closeYourAccountStepContent) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1143214362, i3, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentBusinessUserPreview (CloseYourAccountScreen.kt:162)");
            }
            com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar closeAccountUiTopBar = new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar(true, "");
            java.util.List<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> items = closeYourAccountStepContent.getItems();
            com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter footer = closeYourAccountStepContent.getFooter();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt.$r8$lambda$hXc0goHi7YJ82hC874yqbNkrCAQ((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CloseYourAccountContent(closeAccountUiTopBar, items, footer, false, (kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 27648, 96);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt.$r8$lambda$1ZCENbiGD0UEinZgdsDPhXMVoWo(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Oxll3jtBVeYCoK6v2vKhv0oFrMs(final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent closeYourAccountStepContent, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1967777097);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(closeYourAccountStepContent) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1967777097, i3, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountIneligibleUserPreview (CloseYourAccountScreen.kt:178)");
            }
            com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar closeAccountUiTopBar = new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar(true, "");
            java.util.List<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> items = closeYourAccountStepContent.getItems();
            com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter footer = closeYourAccountStepContent.getFooter();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt.m19251$r8$lambda$Y47oLqVXciQKP3h116LvsZW8YE((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CloseYourAccountContent(closeAccountUiTopBar, items, footer, false, (kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 27648, 96);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt.$r8$lambda$Oxll3jtBVeYCoK6v2vKhv0oFrMs(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Y47oLqVXciQKP3h116LvsZW-8YE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19251$r8$lambda$Y47oLqVXciQKP3h116LvsZW8YE(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent userIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gK7zxwOvaobFK7lifsNh59gqpVc(final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent closeYourAccountStepContent, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(984163827);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(closeYourAccountStepContent) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(984163827, i3, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountPersonalUserPreview (CloseYourAccountScreen.kt:146)");
            }
            com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar closeAccountUiTopBar = new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar(true, "");
            java.util.List<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> items = closeYourAccountStepContent.getItems();
            com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter footer = closeYourAccountStepContent.getFooter();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt.$r8$lambda$qltwHXMY7hDCNc0QlF_WVmRLS_c((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CloseYourAccountContent(closeAccountUiTopBar, items, footer, false, (kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 27648, 96);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt.$r8$lambda$gK7zxwOvaobFK7lifsNh59gqpVc(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hXc0goHi7YJ82hC874yqbNkrCAQ(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent userIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jJxW2E36ktOEOJm6Ak8_5fJa0ig(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar closeAccountUiTopBar, java.util.List list, com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter closeAccountUiFooter, boolean z, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CloseYourAccountContent(closeAccountUiTopBar, list, closeAccountUiFooter, z, function1, modifier, closeAccountUserInput, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$l8_GUbR6PPecvX4mdidEIU-pUWU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19252$r8$lambda$l8_GUbR6PPecvX4mdidEIUpUWU(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel closeYourAccountViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        CloseYourAccountScreen(closeYourAccountViewModel, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qltwHXMY7hDCNc0QlF_WVmRLS_c(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent userIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ydV83nC0NO5DGi-PChEgaD4-1P0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19253$r8$lambda$ydV83nC0NO5DGiPChEgaD41P0(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel closeYourAccountViewModel) {
        closeYourAccountViewModel.onIntent$settings_prodRelease(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnClosePressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
