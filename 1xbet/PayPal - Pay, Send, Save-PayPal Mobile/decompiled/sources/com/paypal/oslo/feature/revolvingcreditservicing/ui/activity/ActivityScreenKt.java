package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity;

@kotlin.Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001aQ\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\f\u001aG\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u001a\u001a\u001d\u0010\u001b\u001a\u00020\u00012\u000e\b\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010!¨\u0006\"²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u0004\u0018\u00010&X\u008a\u008e\u0002"}, d2 = {"ActivityScreen", "", "onPushNavigation", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/NavKey;", "onNavigateBack", "Lkotlin/Function0;", "viewModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityViewModel;", "onNavigateForCancelPaymentResult", "Lkotlin/Function2;", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityViewModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ActivityContent", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "onEvent", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityEvent;", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "isTransactionClickEnabled", "", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/runtime/Composer;II)V", "ActivityErrorContent", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Preview", "sections", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivitySectionUiState;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "ErrorPreview", "(Landroidx/compose/runtime/Composer;I)V", "revolvingcredit-servicing_prodRelease", "uiState", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;", "toastMessage", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivityScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void ActivityScreen(final kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel activityViewModel, final kotlin.jvm.functions.Function2<? super com.paypal.oslo.core.navigation.result.NavResultRequestId, ? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22;
        androidx.compose.runtime.ScopeUpdateScope scopeUpdateScope;
        int i3;
        com.paypal.pds.components.BottomSheetController bottomSheetController;
        int i4;
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1909755807);
        int currentMarker = startRestartGroup.getCurrentMarker();
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(activityViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        int i5 = i2;
        if (!startRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1909755807, i5, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreen (ActivityScreen.kt:79)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(activityViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue2;
            boolean changedInstance = startRestartGroup.changedInstance(activityViewModel);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$ActivityScreen$1$1(activityViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) rememberedValue3;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$ActivityScreen$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m18264invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m18264invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function23, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
            boolean paginationEnabled = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState) collectAsStateWithLifecycle.getValue()).getPaginationEnabled();
            boolean changedInstance2 = startRestartGroup.changedInstance(activityViewModel);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.$r8$lambda$D5pC3aKbsfeRl4zN15u8IySaSSw(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt.EndlessScrollPaginationTrigger(rememberScrollState, paginationEnabled, 0L, 0.0d, (kotlin.jvm.functions.Function0<kotlin.Unit>) rememberedValue5, startRestartGroup, 0, 12);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance3 = startRestartGroup.changedInstance(activityViewModel);
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.m18263$r8$lambda$sMTWnAZqFrVtdnYdQVF4C7f2us(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(unit, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue6, startRestartGroup, 6);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect> uiEffect = activityViewModel.getUiEffect();
            boolean z = (i5 & 112) == 32;
            boolean z2 = (i5 & 7168) == 2048;
            boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
            boolean z3 = (i5 & 14) == 4;
            boolean changedInstance4 = startRestartGroup.changedInstance(bottomSheetController2);
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (((z3 | z2 | z | changed) || changedInstance4) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = currentMarker;
                composer2 = startRestartGroup;
                bottomSheetController = bottomSheetController2;
                rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.$r8$lambda$asldAXaWBM7CStb9lha_xbHJeuk(kotlin.jvm.functions.Function0.this, function2, rememberNavResultRequestId, function1, bottomSheetController2, mutableState, (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue7);
            } else {
                i3 = currentMarker;
                composer2 = startRestartGroup;
                bottomSheetController = bottomSheetController2;
            }
            int i6 = i3;
            com.paypal.oslo.feature.revolvingcreditservicing.utils.ComposeUtilsKt.CollectOnLifecycle(uiEffect, null, null, (kotlin.jvm.functions.Function1) rememberedValue7, composer2, 0, 6);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            composer2.startReplaceGroup(548926482);
            androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 6);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            composer2.startReplaceGroup(-1797590580);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState activityState = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState) collectAsStateWithLifecycle.getValue();
            if ((activityState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Initial) || (activityState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Loading) || (activityState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading)) {
                i4 = 0;
                composer2.startReplaceGroup(-57983445);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.loading.LoadingContentKt.LoadingContent(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenTestTags.LOADING_CONTENT), composer2, 6, 0);
                composer2.endReplaceGroup();
            } else {
                boolean z4 = activityState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready;
                if (z4 || (activityState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.StartingCancelPayment) || (activityState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment)) {
                    composer2.startReplaceGroup(-1797210397);
                    if (z4) {
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready) activityState;
                        pair = kotlin.TuplesKt.to(ready.getUiModel(), ready.getArgs());
                    } else if (activityState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.StartingCancelPayment) {
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.StartingCancelPayment startingCancelPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.StartingCancelPayment) activityState;
                        pair = kotlin.TuplesKt.to(startingCancelPayment.getUiModel(), startingCancelPayment.getArgs());
                    } else {
                        if (!(activityState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment)) {
                            composer2.endToMarker(i6);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            scopeUpdateScope = composer2.endRestartGroup();
                            if (scopeUpdateScope != null) {
                                function22 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.m18261$r8$lambda$QbHTPCZvkNU6KADqLIcKlt3l4(kotlin.jvm.functions.Function1.this, function0, activityViewModel, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                };
                                scopeUpdateScope.updateScope(function22);
                            }
                            return;
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment cancelingPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment) activityState;
                        pair = kotlin.TuplesKt.to(cancelingPayment.getUiModel(), cancelingPayment.getArgs());
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel) pair.component1();
                    com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs) pair.component2();
                    boolean changedInstance5 = composer2.changedInstance(activityViewModel);
                    java.lang.Object rememberedValue8 = composer2.rememberedValue();
                    if (changedInstance5 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$ActivityScreen$5$1$2$1(activityViewModel);
                        composer2.updateRememberedValue(rememberedValue8);
                    }
                    i4 = 0;
                    ActivityContent(activityUiModel, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue8), null, rememberScrollState, !com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifierExtensionsKt.isUK(activityHubArgs.getCpi()), composer2, 0, 4);
                    composer2.endReplaceGroup();
                } else {
                    if (activityState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.RetryCancelingPayment) {
                        composer2.startReplaceGroup(-1796497180);
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.loading.LoadingContentKt.LoadingContent(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenTestTags.LOADING_CONTENT), composer2, 6, 0);
                        composer2.endReplaceGroup();
                    } else if (activityState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelPaymentError) {
                        composer2.startReplaceGroup(-1796223233);
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel errorUiModel = com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryErrorUiModel.PaymentCancelError.getErrorUiModel();
                        androidx.compose.ui.Modifier fillMaxSize$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        boolean changedInstance6 = composer2.changedInstance(activityViewModel);
                        java.lang.Object rememberedValue9 = composer2.rememberedValue();
                        if (changedInstance6 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.$r8$lambda$Wu4g55CiTWkZwXs3HE6kH81T038(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.this);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue9);
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorKt.Error(errorUiModel, fillMaxSize$default3, (kotlin.jvm.functions.Function0) rememberedValue9, composer2, 54, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(activityState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Error)) {
                            composer2.startReplaceGroup(-57986793);
                            composer2.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-57930573);
                        ActivityErrorContent(null, composer2, 0, 1);
                        composer2.endReplaceGroup();
                    }
                    i4 = 0;
                }
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) mutableState.getValue();
            if (uiString == null) {
                composer2.startReplaceGroup(550925360);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(550925361);
                java.lang.String asString = uiString.asString(composer2, i4);
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing48(), 0.0f, 0.0f, 13, null);
                java.lang.Object rememberedValue10 = composer2.rememberedValue();
                if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.$r8$lambda$bYLq1cHukFkPZaYrvnM3HLmxlgY(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj).booleanValue());
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue10);
                }
                com.paypal.pds.components.ToastKt.Toast(asString, m1710paddingqDBjuR0$default, null, (kotlin.jvm.functions.Function1) rememberedValue10, composer2, 3072, 4);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                composer2.endReplaceGroup();
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            boolean changedInstance7 = composer2.changedInstance(activityViewModel);
            java.lang.Object rememberedValue11 = composer2.rememberedValue();
            if (changedInstance7 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.$r8$lambda$m2jNIFgY9zPeFbL_gTog3tqJg3w(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue11);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue11;
            boolean changedInstance8 = composer2.changedInstance(activityViewModel);
            java.lang.Object rememberedValue12 = composer2.rememberedValue();
            if (changedInstance8 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.$r8$lambda$5iaeAT1eG5zWkrZwnpKyDACZajY(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue12);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.CancelPaymentBottomSheetKt.CancelPaymentBottomSheet(bottomSheetController, function02, (kotlin.jvm.functions.Function0) rememberedValue12, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState) collectAsStateWithLifecycle.getValue()) instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment, composer2, com.paypal.pds.components.BottomSheetController.$stable, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScope = composer2.endRestartGroup();
        if (scopeUpdateScope != null) {
            function22 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.m18262$r8$lambda$mwS7YwM7FEqt2MaWt2kYYtFtuo(kotlin.jvm.functions.Function1.this, function0, activityViewModel, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            };
            scopeUpdateScope.updateScope(function22);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivityContent(final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.foundation.ScrollState scrollState2;
        int i4;
        boolean z2;
        final androidx.compose.foundation.ScrollState scrollState3;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.foundation.ScrollState scrollState4;
        boolean z4;
        kotlin.jvm.functions.Function1 function12;
        boolean z5;
        java.lang.Object rememberedValue;
        boolean z6;
        java.lang.Object rememberedValue2;
        boolean z7;
        java.lang.Object rememberedValue3;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-321055314);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(activityUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    scrollState2 = scrollState;
                    if (startRestartGroup.changed(scrollState2)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    scrollState2 = scrollState;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                scrollState2 = scrollState;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            scrollState2 = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                        }
                        if (i4 != 0) {
                            i5 = i3;
                            modifier3 = modifier2;
                            scrollState4 = scrollState2;
                            z4 = true;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-321055314, i5, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityContent (ActivityScreen.kt:218)");
                            }
                            int i8 = i5;
                            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(modifier3, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), scrollState4, false, null, false, 14, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel paginationState = activityUiModel.getPaginationState();
                            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState> sections = activityUiModel.getSections();
                            if (!z4) {
                                startRestartGroup.startReplaceGroup(1143300685);
                                boolean z8 = (i8 & 112) == 32;
                                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (z8 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.$r8$lambda$9NpQ9UqEX2L1kdamVQBJfzV4Q7o(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                startRestartGroup.endReplaceGroup();
                                function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
                            } else {
                                startRestartGroup.startReplaceGroup(1143385594);
                                startRestartGroup.endReplaceGroup();
                                function12 = null;
                            }
                            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                            int i9 = i8 & 112;
                            z5 = i9 != 32;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z5 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.$r8$lambda$MtK0ipWecNq_WEfUK6QUOkc_Yfw(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue;
                            z6 = i9 != 32;
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z6 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.$r8$lambda$xBPNQUiOaN8vV152fK50rYyHasM(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionListKt.ActivityTransactionList(sections, paginationState, function12, function13, (kotlin.jvm.functions.Function1) rememberedValue2, fillMaxWidth$default, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
                            java.lang.String asString = activityUiModel.getFooterText().asString(startRestartGroup, 0);
                            java.lang.String asString2 = activityUiModel.getFooterLink().asString(startRestartGroup, 0);
                            z7 = i9 != 32;
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!z7 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.$r8$lambda$PQ0LblG_tLQ1bo4gSZRIllEgqxk(kotlin.jvm.functions.Function1.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityFooterSectionKt.ActivityFooterSection(asString, asString2, (kotlin.jvm.functions.Function0) rememberedValue3, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 5, null), startRestartGroup, 0, 0);
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            scrollState3 = scrollState4;
                            z3 = z4;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    scrollState4 = scrollState2;
                    z4 = z2;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = i5;
                    androidx.compose.ui.Modifier verticalScroll$default2 = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(modifier3, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), scrollState4, false, null, false, 14, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default2);
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
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel paginationState2 = activityUiModel.getPaginationState();
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState> sections2 = activityUiModel.getSections();
                    if (!z4) {
                    }
                    androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    int i92 = i82 & 112;
                    if (i92 != 32) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z5) {
                    }
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.$r8$lambda$MtK0ipWecNq_WEfUK6QUOkc_Yfw(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    kotlin.jvm.functions.Function1 function132 = (kotlin.jvm.functions.Function1) rememberedValue;
                    if (i92 != 32) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z6) {
                    }
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.$r8$lambda$xBPNQUiOaN8vV152fK50rYyHasM(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionListKt.ActivityTransactionList(sections2, paginationState2, function12, function132, (kotlin.jvm.functions.Function1) rememberedValue2, fillMaxWidth$default2, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
                    java.lang.String asString3 = activityUiModel.getFooterText().asString(startRestartGroup, 0);
                    java.lang.String asString22 = activityUiModel.getFooterLink().asString(startRestartGroup, 0);
                    if (i92 != 32) {
                    }
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!z7) {
                    }
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.$r8$lambda$PQ0LblG_tLQ1bo4gSZRIllEgqxk(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityFooterSectionKt.ActivityFooterSection(asString3, asString22, (kotlin.jvm.functions.Function0) rememberedValue3, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 5, null), startRestartGroup, 0, 0);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                    scrollState3 = scrollState4;
                    z3 = z4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    scrollState3 = scrollState2;
                    z3 = z2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.$r8$lambda$xXHH5V6wswbAMclaP2sloWBTYMA(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.this, function1, modifier4, scrollState3, z3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void ActivityErrorContent(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1809271347);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1809271347, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityErrorContent (ActivityScreen.kt:251)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenTestTags.ERROR_CONTENT);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier modifier4 = modifier3;
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("There was an error...", null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 6, 0, 2046);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.$r8$lambda$r2xUoXqb33esaf1iVN1j4r4lHDo(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$5AbNjuWquZZmPg3DbZA6MH9-bU0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18260$r8$lambda$5AbNjuWquZZmPg3DbZA6MH9bU0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(730542084);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(730542084, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ErrorPreview (ActivityScreen.kt:308)");
            }
            ActivityErrorContent(null, startRestartGroup, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.m18260$r8$lambda$5AbNjuWquZZmPg3DbZA6MH9bU0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5iaeAT1eG5zWkrZwnpKyDACZajY(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel activityViewModel) {
        activityViewModel.process(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnConfirmCancelPayment.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9NpQ9UqEX2L1kdamVQBJfzV4Q7o(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel transactionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionItemUiModel, "");
        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnTransactionClick(transactionItemUiModel));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$D5pC3aKbsfeRl4zN15u8IySaSSw(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel activityViewModel) {
        activityViewModel.process(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnScrollTriggersToLoadMoreActivities.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MtK0ipWecNq_WEfUK6QUOkc_Yfw(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel transactionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionItemUiModel, "");
        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnCancelTransactionClick(transactionItemUiModel));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PQ0LblG_tLQ1bo4gSZRIllEgqxk(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnGoToStatementClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QbHTPCZvkNU-6KADqLI-cKlt3l4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18261$r8$lambda$QbHTPCZvkNU6KADqLIcKlt3l4(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel activityViewModel, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivityScreen(function1, function0, activityViewModel, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VCtp26FJwuN2gsF7yPgEl_KKjFc(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent activityEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Wu4g55CiTWkZwXs3HE6kH81T038(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel activityViewModel) {
        activityViewModel.process(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnRetryCancel.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z0SgtTkdHPSySk_g4UcQWxzZkDU(final java.util.List list, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1322381038);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1322381038, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.Preview (ActivityScreen.kt:277)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) list.get(0), (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) list.get(1), (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) list.get(2), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.LoadingMore.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("For past transactions, check your"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("statements"));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.$r8$lambda$VCtp26FJwuN2gsF7yPgEl_KKjFc((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ActivityContent(activityUiModel, (kotlin.jvm.functions.Function1) rememberedValue2, com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, startRestartGroup, 54, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.$r8$lambda$Z0SgtTkdHPSySk_g4UcQWxzZkDU(list, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$asldAXaWBM7CStb9lha_xbHJeuk(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function2 function2, java.lang.String str, kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect activityUiEffect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityUiEffect, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(activityUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.NavigateBack.INSTANCE)) {
            function0.invoke();
        } else if (activityUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenTransactionDetail) {
            function2.invoke(com.paypal.oslo.core.navigation.result.NavResultRequestId.m11587boximpl(str), new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDetailDestination(((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenTransactionDetail) activityUiEffect).getDetailArgs()));
        } else if (activityUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenStatements) {
            function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementHubDestination(((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenStatements) activityUiEffect).getArg()));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(activityUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.ShowCancelPaymentSuccessToast.INSTANCE)) {
            mutableState.setValue(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payments_summary_payment_cancelled_toast, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(activityUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.ShowCancelPaymentBottomSheet.INSTANCE)) {
            bottomSheetController.showSheet();
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(activityUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.DismissCancelPaymentBottomSheet.INSTANCE)) {
            bottomSheetController.hideSheet();
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(activityUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.DismissBottomSheetAndShowSuccessToast.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            bottomSheetController.hideSheet();
            mutableState.setValue(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payments_summary_payment_cancelled_toast, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bYLq1cHukFkPZaYrvnM3HLmxlgY(androidx.compose.runtime.MutableState mutableState, boolean z) {
        if (!z) {
            mutableState.setValue(null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m2jNIFgY9zPeFbL_gTog3tqJg3w(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel activityViewModel) {
        activityViewModel.process(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnDismissCancelPaymentBottomSheet.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mwS7YwM-7FEqt2MaWt2kYYtFtuo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18262$r8$lambda$mwS7YwM7FEqt2MaWt2kYYtFtuo(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel activityViewModel, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivityScreen(function1, function0, activityViewModel, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r2xUoXqb33esaf1iVN1j4r4lHDo(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ActivityErrorContent(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sMTWnAZqFrVtdnYdQVF4-C7f2us, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m18263$r8$lambda$sMTWnAZqFrVtdnYdQVF4C7f2us(final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel activityViewModel, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$ActivityScreen$lambda$7$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.this.process(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnClearPaginationError.INSTANCE);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xBPNQUiOaN8vV152fK50rYyHasM(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState activitySectionUiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySectionUiState, "");
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnTryAgainButtonClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xXHH5V6wswbAMclaP2sloWBTYMA(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ActivityContent(activityUiModel, function1, modifier, scrollState, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
