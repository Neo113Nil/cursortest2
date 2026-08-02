package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a/\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u000e\u001a)\u0010\u000f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0014\u001a1\u0010\u0015\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"CurrencyConversionSheet", "", "viewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/CurrencyConversionViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/CurrencyConversionViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CurrencyConversionContent", "uiState", "Lcom/paypal/oslo/feature/p2p/ui/review/state/CurrencyConversionUiState;", "selectedOptionIndex", "", "callbacks", "Lcom/paypal/oslo/feature/p2p/ui/review/composables/CurrencyConversionCallbacks;", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/CurrencyConversionUiState;ILcom/paypal/oslo/feature/p2p/ui/review/composables/CurrencyConversionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ConversionSegmentedControl", "onSelectOption", "Lkotlin/Function1;", "(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ConversionSuccessContent", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/CurrencyConversionUiState;ILandroidx/compose/runtime/Composer;I)V", "ConversionActions", "onConfirmConversion", "Lkotlin/Function0;", "onCancel", "(ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CurrencyConversionContentPayPalPreview", "(Landroidx/compose/runtime/Composer;I)V", "CurrencyConversionContentCardPreview", "p2p_prodRelease", "vmState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyConversionSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CurrencyConversionSheet(final com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel currencyConversionViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyConversionViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-662027245);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(currencyConversionViewModel) ? 4 : 2) | i;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(-662027245, i3, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheet (CurrencyConversionSheet.kt:67)");
                }
                final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(currencyConversionViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
                final int index = com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiStateKt.toIndex(((com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState) collectAsStateWithLifecycle.getValue()).getSelectedOption());
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$CurrencyConversionSheet$1$1(bottomSheetController, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_conversion_sheet_title, startRestartGroup, 0), false, null, 4, null);
                boolean changedInstance2 = startRestartGroup.changedInstance(currencyConversionViewModel);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt.$r8$lambda$4kyecWV5RUcO9Ak81G44JI6elOI(com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                boolean changedInstance3 = startRestartGroup.changedInstance(bottomSheetController);
                boolean changedInstance4 = startRestartGroup.changedInstance(currencyConversionViewModel);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if ((changedInstance3 | changedInstance4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt.$r8$lambda$KJd6GECS4HQDsB2zyaCLAArsKys(com.paypal.pds.components.BottomSheetController.this, currencyConversionViewModel);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, topNavConfig, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue4, true, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1538067092, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt.m17322$r8$lambda$Xsn9mUvsddZdjsw1V2MUrr91Us(index, currencyConversionViewModel, bottomSheetController, collectAsStateWithLifecycle, modifier4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), composer2, com.paypal.pds.components.BottomSheetController.$stable | 918552576 | (com.paypal.pds.components.TopNavConfig.$stable << 6), 56);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt.$r8$lambda$R40_tFC3XkFGTvJOOVPD1dYqDqw(com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState currencyConversionUiState, final int i, final com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionCallbacks currencyConversionCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2018194588);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(currencyConversionUiState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(currencyConversionCallbacks) ? 256 : 128;
        }
        int i5 = i3 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            } else {
                companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2018194588, i4, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionContent (CurrencyConversionSheet.kt:136)");
                }
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing24(), 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                int i6 = (i4 >> 3) & 14;
                getHighSpeedVideoFpsRangesFor(i, currencyConversionCallbacks.getHighResolutionOutputSizeshNQ4ISI, startRestartGroup, i6);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                getHighSpeedVideoSizes(currencyConversionUiState, i, startRestartGroup, i4 & 126);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), startRestartGroup, 0);
                getHighSpeedVideoSizes(i, currencyConversionCallbacks.getHighSpeedVideoSizes, currencyConversionCallbacks.Camera2StreamConfigurationMap, startRestartGroup, i6);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt.m17323$r8$lambda$tlAwBiMOvovzMJLSdXA517Fm1A(com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState.this, i, currencyConversionCallbacks, modifier3, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final int i, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-509702124);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-509702124, i3, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.ConversionSegmentedControl (CurrencyConversionSheet.kt:156)");
            }
            int i4 = i3 << 6;
            com.paypal.pds.components.SegmentedControlKt.SegmentedControl(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.pds.components.SegmentedControlItem[]{new com.paypal.pds.components.SegmentedControlItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_conversion_sheet_paypal_tab_title, startRestartGroup, 0), null, null, null, null, 30, null), new com.paypal.pds.components.SegmentedControlItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_conversion_sheet_card_tab_title, startRestartGroup, 0), null, null, null, null, 30, null)}), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), i, function1, startRestartGroup, (i4 & 7168) | (i4 & 896) | com.paypal.pds.components.SegmentedControlItem.$stable | 48, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt.$r8$lambda$O9YLpjsu61NTPYJnA1FX9hCYmsA(i, function1, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState currencyConversionUiState, final int i, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        java.lang.String stringResource;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2118732660);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(currencyConversionUiState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2118732660, i3, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.ConversionSuccessContent (CurrencyConversionSheet.kt:183)");
            }
            java.lang.String formattedAmount = currencyConversionUiState.getFormattedAmount();
            java.lang.String str = formattedAmount == null ? "" : formattedAmount;
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
            if (com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiStateKt.toConversionOption(i) == com.paypal.oslo.feature.p2p.domain.model.ConversionOption.PAYPAL) {
                composer2.startReplaceGroup(-324840465);
                int i4 = com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_conversion_sheet_paypal_tab_description;
                java.lang.String conversionRate = currencyConversionUiState.getConversionRate();
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i4, new java.lang.Object[]{conversionRate != null ? conversionRate : ""}, composer2, 0);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-324671019);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_conversion_sheet_card_tab_description, composer2, 0);
                composer2.endReplaceGroup();
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt.$r8$lambda$vaCPQYiREMZ9snyrPxLVosZqBTU(com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final int i, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        java.lang.String stringResource;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1692157665);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i4 = i3;
        if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1692157665, i4, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.ConversionActions (CurrencyConversionSheet.kt:212)");
            }
            if (com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiStateKt.toConversionOption(i) == com.paypal.oslo.feature.p2p.domain.model.ConversionOption.PAYPAL) {
                startRestartGroup.startReplaceGroup(-1037579935);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_conversion_sheet_confirm_paypal_button, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1037476829);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_conversion_sheet_confirm_card_button, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ButtonKt.Button(function0, stringResource, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, ((i4 >> 3) & 14) | 1769856, 408);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
            com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_conversion_sheet_cancel_button, composer2, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer2, ((i4 >> 6) & 14) | 1769856, 408);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt.$r8$lambda$z9TdrTb81voffRRFx9xqrKZc5s8(i, function0, function02, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0Ojecj2OB99Gms5xQnqCnrwFQxI(com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel currencyConversionViewModel, int i) {
        currencyConversionViewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.SelectConversionOption(com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiStateKt.toConversionOption(i)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4kyecWV5RUcO9Ak81G44JI6elOI(com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel currencyConversionViewModel) {
        currencyConversionViewModel.processEvent(com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CancelConversion.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AVnjPvvFklmoE-jTbuLn9APALrg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17320$r8$lambda$AVnjPvvFklmoEjTbuLn9APALrg(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel currencyConversionViewModel, androidx.compose.runtime.State state) {
        bottomSheetController.hideSheet();
        currencyConversionViewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ConfirmConversion(((com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState) state.getValue()).getSelectedOption()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IpdHb2Vq8dPuPQUhlXDmiF8Y48w(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-256437728);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-256437728, updateChangedFlags, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionContentPayPalPreview (CurrencyConversionSheet.kt:261)");
            }
            com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState currencyConversionUiState = new com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState(null, "£37.65 GBP", "1 GBP = 1.25 USD", com.paypal.oslo.feature.p2p.domain.model.ConversionOption.PAYPAL, null, false, null, 0, null, null, null, false, null, 8177, null);
            int index = com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiStateKt.toIndex(com.paypal.oslo.feature.p2p.domain.model.ConversionOption.PAYPAL);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            getHighSpeedVideoFpsRangesFor(currencyConversionUiState, index, new com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionCallbacks(function1, function0, (kotlin.jvm.functions.Function0) rememberedValue3), null, startRestartGroup, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt.$r8$lambda$IpdHb2Vq8dPuPQUhlXDmiF8Y48w(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KJd6GECS4HQDsB2zyaCLAArsKys(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel currencyConversionViewModel) {
        bottomSheetController.hideSheet();
        currencyConversionViewModel.processEvent(com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CancelConversion.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O9YLpjsu61NTPYJnA1FX9hCYmsA(int i, kotlin.jvm.functions.Function1 function1, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(i, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$R40_tFC3XkFGTvJOOVPD1dYqDqw(com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel currencyConversionViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CurrencyConversionSheet(currencyConversionViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Xsn9mUvs-ddZdjsw1V2MUrr91Us, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17322$r8$lambda$Xsn9mUvsddZdjsw1V2MUrr91Us(int i, final com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel currencyConversionViewModel, final com.paypal.pds.components.BottomSheetController bottomSheetController, final androidx.compose.runtime.State state, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1538067092, i2, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheet.<anonymous> (CurrencyConversionSheet.kt:97)");
            }
            com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState currencyConversionUiState = (com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState) state.getValue();
            boolean changedInstance = composer.changedInstance(currencyConversionViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt.$r8$lambda$0Ojecj2OB99Gms5xQnqCnrwFQxI(com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel.this, ((java.lang.Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(bottomSheetController);
            boolean changedInstance3 = composer.changedInstance(currencyConversionViewModel);
            boolean changed = composer.changed(state);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changedInstance2 | changedInstance3 | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt.m17320$r8$lambda$AVnjPvvFklmoEjTbuLn9APALrg(com.paypal.pds.components.BottomSheetController.this, currencyConversionViewModel, state);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changedInstance4 = composer.changedInstance(bottomSheetController);
            boolean changedInstance5 = composer.changedInstance(currencyConversionViewModel);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changedInstance4 | changedInstance5) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt.$r8$lambda$zplTM4rQvrY8BZ8wYnJMruD6fyI(com.paypal.pds.components.BottomSheetController.this, currencyConversionViewModel);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            getHighSpeedVideoFpsRangesFor(currencyConversionUiState, i, new com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionCallbacks(function1, function0, (kotlin.jvm.functions.Function0) rememberedValue3), modifier, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tlAwB-iMOvovzMJLSdXA517Fm1A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17323$r8$lambda$tlAwBiMOvovzMJLSdXA517Fm1A(com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState currencyConversionUiState, int i, com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionCallbacks currencyConversionCallbacks, androidx.compose.ui.Modifier modifier, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        getHighSpeedVideoFpsRangesFor(currencyConversionUiState, i, currencyConversionCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vaCPQYiREMZ9snyrPxLVosZqBTU(com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState currencyConversionUiState, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(currencyConversionUiState, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z9TdrTb81voffRRFx9xqrKZc5s8(int i, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(i, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$znhmcllU4Mamdo2MzLhSieg7DwA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(855595971);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(855595971, updateChangedFlags, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionContentCardPreview (CurrencyConversionSheet.kt:294)");
            }
            com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState currencyConversionUiState = new com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState(null, "£37.65 GBP", "1 GBP = 1.25 USD", com.paypal.oslo.feature.p2p.domain.model.ConversionOption.CARD, null, false, null, 0, null, null, null, false, null, 8177, null);
            int index = com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiStateKt.toIndex(com.paypal.oslo.feature.p2p.domain.model.ConversionOption.CARD);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            getHighSpeedVideoFpsRangesFor(currencyConversionUiState, index, new com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionCallbacks(function1, function0, (kotlin.jvm.functions.Function0) rememberedValue3), null, startRestartGroup, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionSheetKt.$r8$lambda$znhmcllU4Mamdo2MzLhSieg7DwA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zplTM4rQvrY8BZ8wYnJMruD6fyI(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel currencyConversionViewModel) {
        bottomSheetController.hideSheet();
        currencyConversionViewModel.processEvent(com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CancelConversion.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
