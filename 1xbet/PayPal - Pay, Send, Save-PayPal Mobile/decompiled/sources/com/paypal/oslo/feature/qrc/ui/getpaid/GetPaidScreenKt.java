package com.paypal.oslo.feature.qrc.ui.getpaid;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a)\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u000b\u001a)\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0006\u001a\u00020\u0007X\u008a\u0084\u0002"}, d2 = {"GetPaidScreen", "", "viewModel", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidViewModel;", "(Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidViewModel;Landroidx/compose/runtime/Composer;II)V", "GetPaidScreenContent", "uiState", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent;", "(Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "GetPaidContent", "uiModel", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiModel;", "(Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "GetPaidScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "qrc_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetPaidScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if ((r14 & 1) != 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GetPaidScreen(final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel getPaidViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(776809917);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && startRestartGroup.changedInstance(getPaidViewModel)) ? 4 : 2) | i;
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
                    getPaidViewModel = (com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i3 &= -15;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(776809917, i3, -1, "com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreen (GetPaidScreen.kt:65)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(getPaidViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(getPaidViewModel);
                com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt$GetPaidScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt$GetPaidScreen$1$1(getPaidViewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState getPaidUiState = (com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState) collectAsStateWithLifecycle.getValue();
                boolean changedInstance2 = startRestartGroup.changedInstance(getPaidViewModel);
                com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt$GetPaidScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt$GetPaidScreen$2$1(getPaidViewModel);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                GetPaidScreenContent(getPaidUiState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), startRestartGroup, 0);
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
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt.$r8$lambda$RZTioF_9dmsUzFJx3JQoWTtEVI4(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void GetPaidScreenContent(final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState getPaidUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaidUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2095777878);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(getPaidUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2095777878, i2, -1, "com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenContent (GetPaidScreen.kt:82)");
            }
            if (getPaidUiState instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Initial) {
                startRestartGroup.startReplaceGroup(620973084);
                startRestartGroup.endReplaceGroup();
            } else if (getPaidUiState instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Content) {
                startRestartGroup.startReplaceGroup(621103222);
                getHighSpeedVideoFpsRanges(((com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Content) getPaidUiState).getUiModel(), function1, startRestartGroup, i2 & 112);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(297124554);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt.m17798$r8$lambda$tThxoMZOcywV3UFddqW38LJuP4(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel getPaidUiModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1980590518);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(getPaidUiModel) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(1980590518, i3, -1, "com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidContent (GetPaidScreen.kt:100)");
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(180.0f), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 5, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Initials(getPaidUiModel.getUserInitials()), null, com.paypal.pds.components.AvatarSize.XLarge.INSTANCE, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.XLarge.$stable << 6, 58);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(getPaidUiModel.getUserName(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 384, 6, 1002);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null), null, null, com.paypal.pds.components.CardStyle.Filled.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1561969170, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt.m17797$r8$lambda$HPdAyJwFyglOkAtvZ9DLWipsZQ(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Filled.$stable << 9) | 805306368, 502);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.core.Icon.ArrowDownTray arrowDownTray = com.paypal.pds.core.Icon.ArrowDownTray.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_get_paid_desc_download_button_content, startRestartGroup, 0);
            com.paypal.pds.core.Icon.ArrowDownTray arrowDownTray2 = arrowDownTray;
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt.$r8$lambda$labjycuS4pVeAFNjrin4nEIaiHo(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.IconButtonKt.IconButton(arrowDownTray2, (kotlin.jvm.functions.Function0) rememberedValue, null, secondary, null, stringResource, null, false, false, startRestartGroup, 3078, 468);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing64()), composer2, 0);
            com.paypal.pds.core.Icon.Info info = com.paypal.pds.core.Icon.Info.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Secondary secondary2 = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            com.paypal.pds.core.Icon.Info info2 = info;
            boolean z2 = i4 == 32;
            java.lang.Object rememberedValue2 = composer2.rememberedValue();
            if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt.$r8$lambda$47_4YuvHIVL9ye0yx5UsYWrrXiU(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(info2, (kotlin.jvm.functions.Function0) rememberedValue2, null, secondary2, null, null, null, false, false, composer2, 3078, 500);
            composer2.endNode();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt.$r8$lambda$nS3oGozTkRwPta7IeY94cgjUTNg(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$47_4YuvHIVL9ye0yx5UsYWrrXiU(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.InfoClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4P7yIWLDgBEisxjT2nmJ8Esk5vc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-920238893);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-920238893, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenPreview (GetPaidScreen.kt:192)");
            }
            com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Content content = new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Content(new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel("John Doe", "JD", null, ""));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt.$r8$lambda$4kwr8jKiKeqVQGU6IWfELM_dO1I((com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            GetPaidScreenContent(content, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidScreenKt.$r8$lambda$4P7yIWLDgBEisxjT2nmJ8Esk5vc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4kwr8jKiKeqVQGU6IWfELM_dO1I(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent getPaidEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaidEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HPdAyJwFyglOkAtvZ9DLWipsZ-Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17797$r8$lambda$HPdAyJwFyglOkAtvZ9DLWipsZQ(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel getPaidUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1561969170, i, -1, "com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidContent.<anonymous>.<anonymous> (GetPaidScreen.kt:137)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(320.0f)), com.paypal.pds.core.ConstantsKt.getSpacing24());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1706padding3ABfNKs);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            android.graphics.Bitmap qrCodeBitmap = getPaidUiModel.getQrCodeBitmap();
            if (qrCodeBitmap == null) {
                composer.startReplaceGroup(162029203);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(162029204);
                androidx.compose.foundation.ImageKt.m1335Image5hnEew(androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(qrCodeBitmap), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_get_paid_desc_qr_code_image_content, new java.lang.Object[]{getPaidUiModel.getUserName()}, composer, 0), androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(300.0f)), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12())), null, androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), 0.0f, null, 0, composer, 24576, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RZTioF_9dmsUzFJx3JQoWTtEVI4(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel getPaidViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        GetPaidScreen(getPaidViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$labjycuS4pVeAFNjrin4nEIaiHo(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.DownloadClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nS3oGozTkRwPta7IeY94cgjUTNg(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel getPaidUiModel, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(getPaidUiModel, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tThxoMZOcywV3UFd-dqW38LJuP4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17798$r8$lambda$tThxoMZOcywV3UFddqW38LJuP4(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState getPaidUiState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        GetPaidScreenContent(getPaidUiState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
