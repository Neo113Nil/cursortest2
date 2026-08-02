package com.paypal.oslo.feature.cryptocurrency.ui.settings;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a3\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a/\u0010\u0012\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u001e²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"CryptoSettingsScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/cryptocurrency/ui/settings/CryptoSettingsViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/cryptocurrency/ui/settings/CryptoSettingsViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoSettingsScreenContent", "uiState", "Lcom/paypal/oslo/feature/cryptocurrency/ui/settings/model/CryptoSettingsUiState;", "onItemClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/settings/model/CryptoSettingsItemId;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/settings/model/CryptoSettingsUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadingContent", "(Landroidx/compose/runtime/Composer;I)V", "SettingsListContent", "items", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/settings/model/CryptoSettingsItemUiData;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ErrorContent", "message", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "CryptoSettingsScreenLoadingPreview", "CryptoSettingsScreenSuccessPreview", "CryptoSettingsScreenErrorPreview", "cryptocurrency_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoSettingsScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoSettingsScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel cryptoSettingsViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSettingsViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1124045697);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(cryptoSettingsViewModel) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1124045697, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreen (CryptoSettingsScreen.kt:53)");
                }
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(cryptoSettingsViewModel.getUiState(), null, startRestartGroup, 0, 1);
                androidx.view.LifecycleOwner lifecycleOwner = (androidx.view.LifecycleOwner) startRestartGroup.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                boolean changedInstance = startRestartGroup.changedInstance(lifecycleOwner);
                boolean changed = startRestartGroup.changed(collectAsState);
                boolean changedInstance2 = startRestartGroup.changedInstance(cryptoSettingsViewModel);
                com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$CryptoSettingsScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | changed | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$CryptoSettingsScreen$1$1(lifecycleOwner, cryptoSettingsViewModel, collectAsState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(lifecycleOwner, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState cryptoSettingsUiState = (com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState) collectAsState.getValue();
                boolean z = (i3 & 14) == 4;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt.$r8$lambda$zznQOrQGeD8HTRAbat59aD86P2o(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                CryptoSettingsScreenContent(cryptoSettingsUiState, (kotlin.jvm.functions.Function1) rememberedValue2, modifier3, startRestartGroup, i3 & 896, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt.$r8$lambda$RNhtoJ8oeANLdfjSLcsTMAHJ8j0(com.paypal.oslo.core.navigation.AppNavigator.this, cryptoSettingsViewModel, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoSettingsScreenContent(final com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState cryptoSettingsUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSettingsUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(63513158);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(cryptoSettingsUiState) ? 4 : 2) | i;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(63513158, i4, -1, "com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenContent (CryptoSettingsScreen.kt:85)");
                }
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_title, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                if ((cryptoSettingsUiState instanceof com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.Initial) || (cryptoSettingsUiState instanceof com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.Loading)) {
                    startRestartGroup.startReplaceGroup(1679490774);
                    getHighSpeedVideoFpsRanges(startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (cryptoSettingsUiState instanceof com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.Success) {
                    startRestartGroup.startReplaceGroup(1679590439);
                    getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.Success) cryptoSettingsUiState).getItems(), function1, startRestartGroup, i4 & 112);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(cryptoSettingsUiState instanceof com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.Error)) {
                        startRestartGroup.startReplaceGroup(-1746941301);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(1679792063);
                    getHighSpeedVideoSizes(((com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.Error) cryptoSettingsUiState).getMessage(), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt.$r8$lambda$8m9cLtSZC0kX688WmIU4PPv2mjQ(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.this, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    private static final void getHighSpeedVideoFpsRanges(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(661907987);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(661907987, i, -1, "com.paypal.oslo.feature.cryptocurrency.ui.settings.LoadingContent (CryptoSettingsScreen.kt:117)");
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
            com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt.$r8$lambda$g7ajqA4i581_B5YGjA3fHngFU54(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemUiData> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(947359495);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(947359495, i2, -1, "com.paypal.oslo.feature.cryptocurrency.ui.settings.SettingsListContent (CryptoSettingsScreen.kt:130)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean changedInstance = startRestartGroup.changedInstance(list);
            boolean z = (i2 & 112) == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt.m14076$r8$lambda$CBzEjnIxsVUJoEaAFhQPtISVVo(list, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(fillMaxWidth$default, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 6, 510);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt.m14078$r8$lambda$D7TJqUXAcPpCxKdUzBthwjQoc(list, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.lang.String str2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1108201994);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1108201994, i2, -1, "com.paypal.oslo.feature.cryptocurrency.ui.settings.ErrorContent (CryptoSettingsScreen.kt:150)");
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
            if (str == null) {
                startRestartGroup.startReplaceGroup(640590931);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_error_generic_title, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
                str2 = stringResource;
            } else {
                startRestartGroup.startReplaceGroup(640590590);
                startRestartGroup.endReplaceGroup();
                str2 = str;
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt.$r8$lambda$3vI31cnj3wlWwybLt2AEn6JsV2g(str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-CBzEjnIxsVUJoEaAFhQPtISVVo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14076$r8$lambda$CBzEjnIxsVUJoEaAFhQPtISVVo(final java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt.m14080$r8$lambda$fJNerv7R0mbfkSh6IDnnbjsfLY((com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemUiData) obj);
            }
        };
        final com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$SettingsListContent$lambda$0$0$$inlined$items$default$1 cryptoSettingsScreenKt$SettingsListContent$lambda$0$0$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$SettingsListContent$lambda$0$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemUiData cryptoSettingsItemUiData) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return invoke((com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemUiData) obj);
            }
        };
        lazyListScope.items(list.size(), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$SettingsListContent$lambda$0$0$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$SettingsListContent$lambda$0$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$SettingsListContent$lambda$0$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                final com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemUiData cryptoSettingsItemUiData = (com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemUiData) list.get(i);
                composer.startReplaceGroup(-1182471695);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(cryptoSettingsItemUiData.getTitleResId(), composer, 0);
                java.lang.String formatAssetList = com.paypal.oslo.feature.cryptocurrency.ui.settings.formatter.CryptoSettingsAssetListFormatterKt.formatAssetList(cryptoSettingsItemUiData.getAssets(), composer, 0);
                com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus badgeStatus = cryptoSettingsItemUiData.getBadgeStatus();
                boolean showChevron = cryptoSettingsItemUiData.getShowChevron();
                boolean changed = composer.changed(function1);
                boolean changed2 = composer.changed(cryptoSettingsItemUiData);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final kotlin.jvm.functions.Function1 function13 = function1;
                    rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$SettingsListContent$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* synthetic */ kotlin.Unit invoke() {
                            function13.invoke(cryptoSettingsItemUiData.getId());
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemComponentKt.CryptoSettingsItemComponent(stringResource, (kotlin.jvm.functions.Function0) rememberedValue, null, formatAssetList, badgeStatus, showChevron, composer, 0, 4);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$3k1cC3LF-NvVrnQNKg94hPVfM3g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14077$r8$lambda$3k1cC3LFNvVrnQNKg94hPVfM3g(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(706897259);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(706897259, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenSuccessPreview (CryptoSettingsScreen.kt:178)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.Success success = new com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.Success(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemUiData[]{new com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemUiData(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId.RECURRING_BUYS, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_recurring_purchases, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Bitcoin", "Ethereum", "Litecoin"}), com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.On.INSTANCE, false, 16, null), new com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemUiData(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId.PRICE_ALERTS, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_price_alerts, kotlin.collections.CollectionsKt.listOf("Bitcoin"), com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.On.INSTANCE, false, 16, null), new com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemUiData(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId.PYUSD_REWARDS, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_pyusd_rewards, null, com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.Off.INSTANCE, false, 20, null), new com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemUiData(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId.ADDRESS_BOOK, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_address_book, null, com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.None.INSTANCE, false, 20, null)}));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt.$r8$lambda$lVX2bMmjFuZ87HOtCH1w8gAk2mc((com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CryptoSettingsScreenContent(success, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt.m14077$r8$lambda$3k1cC3LFNvVrnQNKg94hPVfM3g(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3vI31cnj3wlWwybLt2AEn6JsV2g(java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8m9cLtSZC0kX688WmIU4PPv2mjQ(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState cryptoSettingsUiState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CryptoSettingsScreenContent(cryptoSettingsUiState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$D7TJ-qUXA-cPpCxKdUzBthwjQoc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14078$r8$lambda$D7TJqUXAcPpCxKdUzBthwjQoc(java.util.List list, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(list, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FqUXZjr-VOzHJ6v6FAraDHLB3eI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14079$r8$lambda$FqUXZjrVOzHJ6v6FAraDHLB3eI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.cryptocurrency.navigation.PYUSDRewardsSettingsDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RNhtoJ8oeANLdfjSLcsTMAHJ8j0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel cryptoSettingsViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CryptoSettingsScreen(appNavigator, cryptoSettingsViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_WtPEryHzeOIMpzlrt3Cfs5ySnY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(781113170);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(781113170, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenLoadingPreview (CryptoSettingsScreen.kt:166)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.Loading loading = com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.Loading.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt.m14081$r8$lambda$ygMNmTScwb9L0wowMUEB_HZDws((com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CryptoSettingsScreenContent(loading, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 54, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt.$r8$lambda$_WtPEryHzeOIMpzlrt3Cfs5ySnY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fJNerv7R0mbfkSh-6IDnnbjsfLY, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m14080$r8$lambda$fJNerv7R0mbfkSh6IDnnbjsfLY(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemUiData cryptoSettingsItemUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSettingsItemUiData, "");
        return cryptoSettingsItemUiData.getId().name();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g7ajqA4i581_B5YGjA3fHngFU54(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iBVy4v01vO_jTPnA0yiOJicMi0g(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId cryptoSettingsItemId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSettingsItemId, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$j2xi5h0i9xLd6vIya2rz8xdvcfs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1199361926);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1199361926, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenErrorPreview (CryptoSettingsScreen.kt:215)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.Error error = new com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.Error("Unable to load settings");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt.$r8$lambda$iBVy4v01vO_jTPnA0yiOJicMi0g((com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CryptoSettingsScreenContent(error, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt.$r8$lambda$j2xi5h0i9xLd6vIya2rz8xdvcfs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lVX2bMmjFuZ87HOtCH1w8gAk2mc(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId cryptoSettingsItemId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSettingsItemId, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ygMNmTScwb9L0wowMUEB_HZD-ws, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14081$r8$lambda$ygMNmTScwb9L0wowMUEB_HZDws(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId cryptoSettingsItemId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSettingsItemId, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zznQOrQGeD8HTRAbat59aD86P2o(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId cryptoSettingsItemId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSettingsItemId, "");
        if (cryptoSettingsItemId == com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId.PYUSD_REWARDS) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt.m14079$r8$lambda$FqUXZjrVOzHJ6v6FAraDHLB3eI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState access$CryptoSettingsScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState) state.getValue();
    }
}
