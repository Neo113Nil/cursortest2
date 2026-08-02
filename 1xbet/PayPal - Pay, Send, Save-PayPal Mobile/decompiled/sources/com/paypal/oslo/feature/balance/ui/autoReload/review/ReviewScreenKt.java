package com.paypal.oslo.feature.balance.ui.autoReload.review;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a1\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0013\u001a[\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0002\u0010\u001b\u001a\u0015\u0010\u001c\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u001d\u001a\u0015\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 H\u0003¢\u0006\u0002\u0010!\u001a\r\u0010\"\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010#\u001a\r\u0010$\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010#\u001a\r\u0010%\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010#\u001a\r\u0010&\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010#\u001a\r\u0010'\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010#\u001a\r\u0010(\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010#¨\u0006)²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u008e\u0002"}, d2 = {"ReviewScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewViewModel;", "reloadStrategy", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;", "currencyCode", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadFlowType;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewViewModel;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadFlowType;Landroidx/compose/runtime/Composer;I)V", "ReviewScreenContent", "uiState", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewUiStateStore;", "onChangeOrAddClick", "Lkotlin/Function0;", "onAuthorizeClick", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewUiStateStore;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ReviewScreenError", "errorState", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState$Error;", "onReload", "onDismissError", "onDismissSheet", "onCloseFlow", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState$Error;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "getReloadStrategy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewUiStateStore;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "getReviewDisclaimer", "reviewDisclaimerType", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewDisclaimerType;", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewDisclaimerType;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "ReviewScreenLowBalancePreview", "(Landroidx/compose/runtime/Composer;I)V", "ReviewScreenScheduledWeeklyPreview", "ReviewScreenScheduledBiweeklyPreview", "ReviewScreenScheduledMonthlyPreview", "ReviewScreenNoFiSelectedPreview", "ReviewScreenNoFiAlertPreview", "balance_prodRelease", "addFlowFailMessage", "showToast", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReviewScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.paypal.oslo.core.navigation.result.NavResultManager, java.lang.Object, java.lang.String, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v4 */
    public static final void ReviewScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel, final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reviewReloadStrategy, final java.lang.String str, final com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType autoReloadFlowType, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        kotlin.Unit unit;
        final androidx.compose.runtime.MutableState mutableState;
        ?? r11;
        java.lang.Object obj;
        ?? r12;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewReloadStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowType, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-613950652);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(reviewViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(reviewReloadStrategy) : startRestartGroup.changedInstance(reviewReloadStrategy) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(autoReloadFlowType.ordinal()) ? 16384 : 8192;
        }
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-613950652, i4, -1, "com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreen (ReviewScreen.kt:105)");
            }
            android.content.res.Resources resources = (android.content.res.Resources) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources());
            androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(reviewViewModel.getUiState(), null, startRestartGroup, 0, 1);
            java.lang.String addBankRequestId = reviewViewModel.getAddBankRequestId();
            java.lang.String addCardRequestId = reviewViewModel.getAddCardRequestId();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue2;
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(reviewViewModel);
            boolean z = (i4 & 896) == 256 || ((i4 & 512) != 0 && startRestartGroup.changedInstance(reviewReloadStrategy));
            boolean z2 = (i4 & 7168) == 2048;
            boolean z3 = (57344 & i4) == 16384;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (((z | changedInstance | z2) || z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = i4;
                unit = unit2;
                mutableState = mutableState3;
                r11 = 0;
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$ReviewScreen$1$1(reviewViewModel, reviewReloadStrategy, str, autoReloadFlowType, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                unit = unit2;
                i3 = i4;
                mutableState = mutableState3;
                r11 = 0;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            boolean changedInstance2 = startRestartGroup.changedInstance(reviewViewModel);
            int i5 = i3 & 14;
            boolean z4 = i5 == 4 ? true : r11;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changedInstance2 || z4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                obj = null;
                rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$ReviewScreen$2$1(reviewViewModel, appNavigator, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            } else {
                obj = null;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
            boolean changedInstance3 = startRestartGroup.changedInstance(resources);
            boolean changedInstance4 = startRestartGroup.changedInstance(reviewViewModel);
            boolean z5 = i5 == 4 ? true : r11;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (((changedInstance3 | changedInstance4) || z5) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                r12 = obj;
                rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$ReviewScreen$3$1(resources, reviewViewModel, appNavigator, mutableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            } else {
                r12 = obj;
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue5;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(r12, startRestartGroup, r11);
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$ReviewScreen$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m12093invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m12093invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str3) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str3);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(addCardRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue6, startRestartGroup, 3072);
            boolean changedInstance5 = startRestartGroup.changedInstance(resources);
            boolean changedInstance6 = startRestartGroup.changedInstance(reviewViewModel);
            boolean z6 = i5 == 4 ? true : r11;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if ((changedInstance5 | changedInstance6 | z6) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$ReviewScreen$4$1(resources, reviewViewModel, appNavigator, mutableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue7;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(r12, startRestartGroup, r11);
            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$ReviewScreen$$inlined$NavResultEffect-rtGRyWw$2
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m12094invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m12094invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str3) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str3);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(addBankRequestId, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue8, startRestartGroup, 3072);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, r11);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r11));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            androidx.compose.ui.Modifier m1726height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, r12), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, r12), androidx.compose.ui.unit.Dp.m8601constructorimpl(72.0f));
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r11));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1726height3ABfNKs);
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
            if (((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore) collectAsState.getValue()).getShowFiSelectionSheet()) {
                startRestartGroup.startReplaceGroup(-1107699409);
                com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                com.paypal.pds.core.Icon.ArrowLeft arrowLeft = com.paypal.pds.core.Icon.ArrowLeft.INSTANCE;
                boolean changedInstance7 = startRestartGroup.changedInstance(reviewViewModel);
                java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (changedInstance7 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.m12092$r8$lambda$lmxdm10BY8fzeefY34uiLhQZgQ(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                com.paypal.pds.components.IconButtonKt.IconButton(arrowLeft, (kotlin.jvm.functions.Function0) rememberedValue9, null, tertiary, null, null, null, false, false, startRestartGroup, 3078, 500);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1107480828);
                startRestartGroup.endReplaceGroup();
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, r11);
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary2 = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.core.Icon.Close close = com.paypal.pds.core.Icon.Close.INSTANCE;
            boolean z7 = i5 == 4 ? true : r11;
            java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (z7 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.m12091$r8$lambda$iMxMzo0RGmQV_LP5godm8mwnDs(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(close, (kotlin.jvm.functions.Function0) rememberedValue10, null, tertiary2, null, null, null, false, false, startRestartGroup, 3078, 500);
            startRestartGroup.endNode();
            if (((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore) collectAsState.getValue()).getShowFiSelectionSheet()) {
                startRestartGroup.startReplaceGroup(2129501963);
                if (reviewReloadStrategy instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance) {
                    str2 = com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.FLOW_SETUP_LOW_BALANCE;
                } else {
                    str2 = com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.FLOW_SETUP_SCHEDULED;
                }
                com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(str2, r12);
                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                boolean changedInstance8 = startRestartGroup.changedInstance(businessFlowContext);
                java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                if (changedInstance8 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$ReviewScreen$5$2$1(businessFlowContext, r12);
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue11, startRestartGroup, 6);
                java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> fundingInstrumentOptions = ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore) collectAsState.getValue()).getFundingInstrumentOptions();
                java.lang.String selectedFundingInstrumentId = ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore) collectAsState.getValue()).getSelectedFundingInstrumentId();
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf(businessFlowContext);
                java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore) collectAsState.getValue()).getReloadStrategy().getRechargeAmount().getAmount());
                if (bigDecimalOrNull == null) {
                    bigDecimalOrNull = new java.math.BigDecimal("25");
                }
                java.math.BigDecimal bigDecimal = bigDecimalOrNull;
                boolean z8 = ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore) collectAsState.getValue()).getReloadStrategy() instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance;
                boolean isBusinessAccount = reviewViewModel.getIsBusinessAccount();
                boolean changedInstance9 = startRestartGroup.changedInstance(reviewViewModel);
                java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
                if (changedInstance9 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.m12087$r8$lambda$_ugxkke_fW9IMtKhIhob__sBlE(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.this, (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj2, (java.util.List) obj3);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                }
                com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt.m12050FiSelectionBottomSheetfUX17CQ(appNavigator, fundingInstrumentOptions, selectedFundingInstrumentId, bigDecimal, z8, isBusinessAccount, (kotlin.jvm.functions.Function2) rememberedValue12, addBankRequestId, addCardRequestId, listOf, startRestartGroup, i5 | (com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext.$stable << 27), 0);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else if (((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore) collectAsState.getValue()).getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Error) {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(2131192052);
                com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState state = ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore) collectAsState.getValue()).getState();
                kotlin.jvm.internal.Intrinsics.checkNotNull(state, "");
                com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Error error = (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Error) state;
                boolean changedInstance10 = composer2.changedInstance(reviewViewModel);
                java.lang.Object rememberedValue13 = composer2.rememberedValue();
                if (changedInstance10 || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue13 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.$r8$lambda$bGzLuGpZvq3rCdoEfR7FLu4ZMV8(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue13);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue13;
                boolean changedInstance11 = composer2.changedInstance(reviewViewModel);
                java.lang.Object rememberedValue14 = composer2.rememberedValue();
                if (changedInstance11 || rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue14 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.m12085$r8$lambda$OFuDlPENyjZ4S3il1p4otkvcfk(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue14);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue14;
                boolean changedInstance12 = composer2.changedInstance(reviewViewModel);
                java.lang.Object rememberedValue15 = composer2.rememberedValue();
                if (changedInstance12 || rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue15 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.$r8$lambda$9pY1sAxY9U97IYwaIHCpymRXE0Y(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue15);
                }
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue15;
                boolean z9 = i5 == 4 ? true : r11;
                java.lang.Object rememberedValue16 = composer2.rememberedValue();
                if (z9 || rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue16 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.$r8$lambda$X5HOzewk7CxODDVSnZD2BcihI8U(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue16);
                }
                kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue16;
                boolean z10 = i5 == 4 ? true : r11;
                java.lang.Object rememberedValue17 = composer2.rememberedValue();
                if (z10 || rememberedValue17 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue17 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.m12086$r8$lambda$U5nQnFmMYHYcyRbFitb3diWEWo(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue17);
                }
                ReviewScreenError(error, function0, function02, function03, function04, (kotlin.jvm.functions.Function0) rememberedValue17, composer2, 0);
                composer2.endReplaceGroup();
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(2131771287);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), r11);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, r11));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, companion2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore reviewUiStateStore = (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore) collectAsState.getValue();
                boolean changedInstance13 = composer2.changedInstance(reviewViewModel);
                java.lang.Object rememberedValue18 = composer2.rememberedValue();
                if (changedInstance13 || rememberedValue18 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue18 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.$r8$lambda$vNoX65c83mqxNptNBB6don0vjZI(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue18);
                }
                kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue18;
                boolean changedInstance14 = composer2.changedInstance(reviewViewModel);
                java.lang.Object rememberedValue19 = composer2.rememberedValue();
                if (changedInstance14 || rememberedValue19 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue19 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.$r8$lambda$DyS4Vj_sgrArtyhi0_acH1lJSdY(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue19);
                }
                ReviewScreenContent(reviewUiStateStore, function05, (kotlin.jvm.functions.Function0) rememberedValue19, composer2, r11);
                if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                    composer2.startReplaceGroup(293655783);
                    androidx.compose.ui.Modifier clip = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Review.TOAST), 0.0f, 1, r12), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 10, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing56()));
                    java.lang.String str3 = (java.lang.String) mutableState2.getValue();
                    java.lang.Object rememberedValue20 = composer2.rememberedValue();
                    if (rememberedValue20 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue20 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.m12090$r8$lambda$gdRSCQkU_qO50V9hCuqSiSnX9U(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj2).booleanValue());
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue20);
                    }
                    com.paypal.pds.components.ToastKt.Toast(str3, clip, null, (kotlin.jvm.functions.Function1) rememberedValue20, composer2, 3072, 4);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(294249278);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.$r8$lambda$ze8hUKDwibouUBFZj2c5ur0brR4(com.paypal.oslo.core.navigation.AppNavigator.this, reviewViewModel, reviewReloadStrategy, str, autoReloadFlowType, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0630 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0768  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewScreenContent(final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore reviewUiStateStore, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        final int i3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String stringResource;
        int i4;
        int i5;
        java.lang.String stringResource2;
        java.lang.String str3;
        java.util.Iterator<T> it;
        java.lang.Object obj;
        com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption;
        java.util.List emptyList;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption fundingInstrumentBankOption;
        java.lang.String str7;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType bankType;
        java.lang.String name2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewUiStateStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(261960882);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(reviewUiStateStore) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i6 = i2;
        int i7 = 0;
        if (!startRestartGroup.shouldExecute((i6 & 147) != 146, i6 & 1)) {
            composer2 = startRestartGroup;
            i3 = i;
            function03 = function02;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(261960882, i6, -1, "com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenContent (ReviewScreen.kt:258)");
            }
            androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            if (reviewUiStateStore.getReloadStrategy() instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance) {
                str = com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.FLOW_SETUP_LOW_BALANCE;
            } else {
                str = com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.FLOW_SETUP_SCHEDULED;
            }
            androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), com.paypal.pds.core.ConstantsKt.getSize8(), 2, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Review.SCREEN), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getREVIEW_ZONE()), kotlin.collections.CollectionsKt.plus((java.util.Collection) com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.ACTION_REVIEW), (java.lang.Iterable) kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(str, null))));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, context);
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
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE.weight(androidx.compose.ui.Modifier.INSTANCE, 1.0f, false), rememberScrollState, null, false, null, false, 28, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_title, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize8(), 7, null), startRestartGroup, 0);
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Review.AMOUNT_SECTION);
            int i8 = i6 & 14;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1244287772, i8, -1, "com.paypal.oslo.feature.balance.ui.autoReload.review.getReloadStrategy (ReviewScreen.kt:451)");
            }
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reloadStrategy = reviewUiStateStore.getReloadStrategy();
            if (reloadStrategy instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance) {
                startRestartGroup.startReplaceGroup(-1759636372);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_low_balance_description, new java.lang.Object[]{reviewUiStateStore.getFormattedThresholdAmount(), reviewUiStateStore.getFormattedRechargeAmount()}, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                boolean z = reloadStrategy instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled;
                if (z && (((com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled) reviewUiStateStore.getReloadStrategy()).getFrequency() instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly)) {
                    startRestartGroup.startReplaceGroup(-1759627394);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_review_sheet_strategy_scheduled_weekly, new java.lang.Object[]{reviewUiStateStore.getFormattedRechargeAmount(), reviewUiStateStore.getFormattedDayOfWeek(), reviewUiStateStore.getFormattedStartDate()}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (z && (((com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled) reviewUiStateStore.getReloadStrategy()).getFrequency() instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Biweekly)) {
                    startRestartGroup.startReplaceGroup(-1759616800);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_review_sheet_strategy_scheduled_biweekly, new java.lang.Object[]{reviewUiStateStore.getFormattedRechargeAmount(), reviewUiStateStore.getFormattedDayOfWeek(), reviewUiStateStore.getFormattedStartDate()}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (z && (((com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled) reviewUiStateStore.getReloadStrategy()).getFrequency() instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly)) {
                    startRestartGroup.startReplaceGroup(-1759606213);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_review_sheet_strategy_scheduled_monthly, new java.lang.Object[]{reviewUiStateStore.getFormattedRechargeAmount(), reviewUiStateStore.getFormattedStartDate()}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1286972058);
                    startRestartGroup.endReplaceGroup();
                    str2 = "";
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, testTag, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 48, 6, 1020);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 7, null), startRestartGroup, 0);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_from_section, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Review.FUNDING_INSTRUMENT_SECTION), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 48, 6, 1020);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize8(), 7, null), startRestartGroup, 0);
                    if (!(reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) && ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) reviewUiStateStore.getState()).getStep() == com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.FUNDING_INSTRUMENTS) {
                        startRestartGroup.startReplaceGroup(-817566011);
                        com.paypal.oslo.feature.balance.common.ui.BalanceLoadingHalfSheetKt.BalanceLoadingHalfSheet(startRestartGroup, 0);
                        i4 = 1;
                        i5 = i6;
                    } else if (reviewUiStateStore.getFundingInstrumentUi() == null) {
                        startRestartGroup.startReplaceGroup(-817329543);
                        com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi fundingInstrumentUi = reviewUiStateStore.getFundingInstrumentUi();
                        i4 = 1;
                        i5 = i6;
                        com.paypal.oslo.feature.balance.ui.autoReload.review.ChangeFundingInstrumentComponentKt.ChangeFundingInstrumentComponent(fundingInstrumentUi.getFiName(), fundingInstrumentUi.getFiDescription(), fundingInstrumentUi.getFiImageUrl(), fundingInstrumentUi.getFiType(), !fundingInstrumentUi.isFiInstant() && reviewUiStateStore.getHasFiInstantOptionAvailable(), function0, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Review.CHANGE_FI_BUTTON), startRestartGroup, ((i6 << 12) & 458752) | 1572864, 0);
                        i7 = 0;
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize8(), 7, null), startRestartGroup, 0);
                        if (fundingInstrumentUi.isFiInstant()) {
                            startRestartGroup.startReplaceGroup(-816688866);
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_instant_label, new java.lang.Object[]{reviewUiStateStore.getReloadStrategy().getRechargeAmount().getFormattedAmount()}, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-816295445);
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_review_sheet_standard_label, new java.lang.Object[]{reviewUiStateStore.getReloadStrategy().getRechargeAmount().getFormattedAmount()}, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                            startRestartGroup.endReplaceGroup();
                        }
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 7, null), startRestartGroup, 0);
                        androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Review.DISCLAIMER_SECTION);
                        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType disclaimerType = reviewUiStateStore.getDisclaimerType();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-93831750, 0, -1, "com.paypal.oslo.feature.balance.ui.autoReload.review.getReviewDisclaimer (ReviewScreen.kt:482)");
                        }
                        switch (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.WhenMappings.$EnumSwitchMapping$2[disclaimerType.ordinal()]) {
                            case 1:
                                startRestartGroup.startReplaceGroup(22005457);
                                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_disclaimer_scheduled_bank, startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                                str3 = stringResource2;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str3, testTag2, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 48, 6, 1020);
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.endNode();
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 7, null), startRestartGroup, i7);
                                it = reviewUiStateStore.getFundingInstrumentOptions().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj = null;
                                    } else {
                                        obj = it.next();
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj).getInstrumentId(), reviewUiStateStore.getSelectedFundingInstrumentId())) {
                                        }
                                    }
                                }
                                fundingInstrumentOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj;
                                java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> autoReloadUserIntent = com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.ACTION_CONFIRM);
                                if (fundingInstrumentOption == null) {
                                    java.util.List emptyList2 = kotlin.collections.CollectionsKt.emptyList();
                                    java.lang.String instrumentId = fundingInstrumentOption.getInstrumentId();
                                    boolean z2 = fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption;
                                    if (z2) {
                                        str5 = "bank";
                                    } else if (fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption) {
                                        java.lang.String productClass = ((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption) fundingInstrumentOption).getProductClass();
                                        if (productClass != null) {
                                            str6 = productClass.toLowerCase(java.util.Locale.ROOT);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "");
                                        } else {
                                            str6 = null;
                                        }
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        sb.append(str6);
                                        sb.append("_card");
                                        str5 = sb.toString();
                                    } else if (fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) {
                                        str5 = "savings";
                                    } else {
                                        str4 = "";
                                        fundingInstrumentBankOption = !z2 ? (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) fundingInstrumentOption : null;
                                        if (fundingInstrumentBankOption != null || (bankType = fundingInstrumentBankOption.getBankType()) == null || (name2 = bankType.name()) == null) {
                                            str7 = null;
                                        } else {
                                            java.lang.String lowerCase = name2.toLowerCase(java.util.Locale.ROOT);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                                            str7 = lowerCase;
                                        }
                                        com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption fundingInstrumentCardOption = !(fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption) ? (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption) fundingInstrumentOption : null;
                                        emptyList = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.FundingInstrumentContext(emptyList2, instrumentId, null, str4, str7, "", fundingInstrumentCardOption == null ? fundingInstrumentCardOption.getBrand() : null, reviewUiStateStore.getReloadStrategy().getRechargeAmount().getAmount()));
                                    }
                                    str4 = str5;
                                    if (!z2) {
                                    }
                                    if (fundingInstrumentBankOption != null) {
                                    }
                                    str7 = null;
                                    if (!(fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption)) {
                                    }
                                    emptyList = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.FundingInstrumentContext(emptyList2, instrumentId, null, str4, str7, "", fundingInstrumentCardOption == null ? fundingInstrumentCardOption.getBrand() : null, reviewUiStateStore.getReloadStrategy().getRechargeAmount().getAmount()));
                                } else {
                                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                                }
                                androidx.compose.ui.Modifier context2 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i4, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Review.CONFIRM_BUTTON), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getCONFIRM_BUTTON()), kotlin.collections.CollectionsKt.plus((java.util.Collection) autoReloadUserIntent, (java.lang.Iterable) emptyList));
                                composer2 = startRestartGroup;
                                i3 = i;
                                function03 = function02;
                                com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_authorize_button, startRestartGroup, i7), context2, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, (reviewUiStateStore.getBalanceId().length() > 0 || (reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading)) ? i7 : i4, ((reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) || ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) reviewUiStateStore.getState()).getStep() != com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.CREATE_AUTO_RELOAD) ? i7 : i4, composer2, ((i5 >> 6) & 14) | 1769472, 24);
                                composer2.endNode();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    break;
                                }
                                break;
                            case 2:
                                startRestartGroup.startReplaceGroup(22009009);
                                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_disclaimer_scheduled_card, startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                                str3 = stringResource2;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str3, testTag2, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 48, 6, 1020);
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.endNode();
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 7, null), startRestartGroup, i7);
                                it = reviewUiStateStore.getFundingInstrumentOptions().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                    }
                                }
                                fundingInstrumentOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj;
                                java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> autoReloadUserIntent2 = com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.ACTION_CONFIRM);
                                if (fundingInstrumentOption == null) {
                                }
                                androidx.compose.ui.Modifier context22 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i4, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Review.CONFIRM_BUTTON), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getCONFIRM_BUTTON()), kotlin.collections.CollectionsKt.plus((java.util.Collection) autoReloadUserIntent2, (java.lang.Iterable) emptyList));
                                if (reviewUiStateStore.getBalanceId().length() > 0) {
                                    break;
                                }
                                if (reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) {
                                    break;
                                }
                                composer2 = startRestartGroup;
                                i3 = i;
                                function03 = function02;
                                com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_authorize_button, startRestartGroup, i7), context22, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, (reviewUiStateStore.getBalanceId().length() > 0 || (reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading)) ? i7 : i4, ((reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) || ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) reviewUiStateStore.getState()).getStep() != com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.CREATE_AUTO_RELOAD) ? i7 : i4, composer2, ((i5 >> 6) & 14) | 1769472, 24);
                                composer2.endNode();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                break;
                            case 3:
                                startRestartGroup.startReplaceGroup(22012879);
                                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_disclaimer_bank_instant, startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                                str3 = stringResource2;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str3, testTag2, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 48, 6, 1020);
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.endNode();
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 7, null), startRestartGroup, i7);
                                it = reviewUiStateStore.getFundingInstrumentOptions().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                    }
                                }
                                fundingInstrumentOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj;
                                java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> autoReloadUserIntent22 = com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.ACTION_CONFIRM);
                                if (fundingInstrumentOption == null) {
                                }
                                androidx.compose.ui.Modifier context222 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i4, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Review.CONFIRM_BUTTON), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getCONFIRM_BUTTON()), kotlin.collections.CollectionsKt.plus((java.util.Collection) autoReloadUserIntent22, (java.lang.Iterable) emptyList));
                                composer2 = startRestartGroup;
                                i3 = i;
                                function03 = function02;
                                com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_authorize_button, startRestartGroup, i7), context222, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, (reviewUiStateStore.getBalanceId().length() > 0 || (reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading)) ? i7 : i4, ((reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) || ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) reviewUiStateStore.getState()).getStep() != com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.CREATE_AUTO_RELOAD) ? i7 : i4, composer2, ((i5 >> 6) & 14) | 1769472, 24);
                                composer2.endNode();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                break;
                            case 4:
                                startRestartGroup.startReplaceGroup(22016720);
                                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_disclaimer_bank_standard, startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                                str3 = stringResource2;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str3, testTag2, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 48, 6, 1020);
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.endNode();
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 7, null), startRestartGroup, i7);
                                it = reviewUiStateStore.getFundingInstrumentOptions().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                    }
                                }
                                fundingInstrumentOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj;
                                java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> autoReloadUserIntent222 = com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.ACTION_CONFIRM);
                                if (fundingInstrumentOption == null) {
                                }
                                androidx.compose.ui.Modifier context2222 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i4, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Review.CONFIRM_BUTTON), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getCONFIRM_BUTTON()), kotlin.collections.CollectionsKt.plus((java.util.Collection) autoReloadUserIntent222, (java.lang.Iterable) emptyList));
                                composer2 = startRestartGroup;
                                i3 = i;
                                function03 = function02;
                                com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_authorize_button, startRestartGroup, i7), context2222, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, (reviewUiStateStore.getBalanceId().length() > 0 || (reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading)) ? i7 : i4, ((reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) || ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) reviewUiStateStore.getState()).getStep() != com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.CREATE_AUTO_RELOAD) ? i7 : i4, composer2, ((i5 >> 6) & 14) | 1769472, 24);
                                composer2.endNode();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                break;
                            case 5:
                                startRestartGroup.startReplaceGroup(22020301);
                                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_disclaimer_debit_card, startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                                str3 = stringResource2;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str3, testTag2, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 48, 6, 1020);
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.endNode();
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 7, null), startRestartGroup, i7);
                                it = reviewUiStateStore.getFundingInstrumentOptions().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                    }
                                }
                                fundingInstrumentOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj;
                                java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> autoReloadUserIntent2222 = com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.ACTION_CONFIRM);
                                if (fundingInstrumentOption == null) {
                                }
                                androidx.compose.ui.Modifier context22222 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i4, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Review.CONFIRM_BUTTON), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getCONFIRM_BUTTON()), kotlin.collections.CollectionsKt.plus((java.util.Collection) autoReloadUserIntent2222, (java.lang.Iterable) emptyList));
                                composer2 = startRestartGroup;
                                i3 = i;
                                function03 = function02;
                                com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_authorize_button, startRestartGroup, i7), context22222, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, (reviewUiStateStore.getBalanceId().length() > 0 || (reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading)) ? i7 : i4, ((reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) || ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) reviewUiStateStore.getState()).getStep() != com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.CREATE_AUTO_RELOAD) ? i7 : i4, composer2, ((i5 >> 6) & 14) | 1769472, 24);
                                composer2.endNode();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                break;
                            case 6:
                                startRestartGroup.startReplaceGroup(22023882);
                                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_disclaimer_savings, startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                                str3 = stringResource2;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str3, testTag2, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 48, 6, 1020);
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.endNode();
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 7, null), startRestartGroup, i7);
                                it = reviewUiStateStore.getFundingInstrumentOptions().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                    }
                                }
                                fundingInstrumentOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj;
                                java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> autoReloadUserIntent22222 = com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.ACTION_CONFIRM);
                                if (fundingInstrumentOption == null) {
                                }
                                androidx.compose.ui.Modifier context222222 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i4, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Review.CONFIRM_BUTTON), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getCONFIRM_BUTTON()), kotlin.collections.CollectionsKt.plus((java.util.Collection) autoReloadUserIntent22222, (java.lang.Iterable) emptyList));
                                composer2 = startRestartGroup;
                                i3 = i;
                                function03 = function02;
                                com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_authorize_button, startRestartGroup, i7), context222222, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, (reviewUiStateStore.getBalanceId().length() > 0 || (reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading)) ? i7 : i4, ((reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) || ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) reviewUiStateStore.getState()).getStep() != com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.CREATE_AUTO_RELOAD) ? i7 : i4, composer2, ((i5 >> 6) & 14) | 1769472, 24);
                                composer2.endNode();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                break;
                            case 7:
                                startRestartGroup.startReplaceGroup(682852004);
                                startRestartGroup.endReplaceGroup();
                                str3 = "";
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str3, testTag2, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 48, 6, 1020);
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.endNode();
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 7, null), startRestartGroup, i7);
                                it = reviewUiStateStore.getFundingInstrumentOptions().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                    }
                                }
                                fundingInstrumentOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj;
                                java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> autoReloadUserIntent222222 = com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.ACTION_CONFIRM);
                                if (fundingInstrumentOption == null) {
                                }
                                androidx.compose.ui.Modifier context2222222 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i4, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Review.CONFIRM_BUTTON), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getCONFIRM_BUTTON()), kotlin.collections.CollectionsKt.plus((java.util.Collection) autoReloadUserIntent222222, (java.lang.Iterable) emptyList));
                                composer2 = startRestartGroup;
                                i3 = i;
                                function03 = function02;
                                com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_authorize_button, startRestartGroup, i7), context2222222, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, (reviewUiStateStore.getBalanceId().length() > 0 || (reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading)) ? i7 : i4, ((reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) || ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) reviewUiStateStore.getState()).getStep() != com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.CREATE_AUTO_RELOAD) ? i7 : i4, composer2, ((i5 >> 6) & 14) | 1769472, 24);
                                composer2.endNode();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                break;
                            default:
                                startRestartGroup.startReplaceGroup(22004453);
                                startRestartGroup.endReplaceGroup();
                                throw new kotlin.NoWhenBranchMatchedException();
                        }
                    } else {
                        i4 = 1;
                        i5 = i6;
                        startRestartGroup.startReplaceGroup(-815492762);
                        com.paypal.oslo.feature.balance.ui.autoReload.review.AddFundingInstrumentComponentKt.AddFundingInstrumentComponent(function0, startRestartGroup, (i5 >> 3) & 14);
                        if (reviewUiStateStore.getShowNoFiSelectedAlert()) {
                            startRestartGroup.startReplaceGroup(-815339281);
                            com.paypal.pds.components.ContextualAlertKt.ContextualAlert(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_no_fi_alert, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null), com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, startRestartGroup, com.paypal.pds.components.ContextualAlertStyle.Negative.$stable << 6, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-815051260);
                            startRestartGroup.endReplaceGroup();
                        }
                    }
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 7, null), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 7, null), startRestartGroup, i7);
                    it = reviewUiStateStore.getFundingInstrumentOptions().iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    fundingInstrumentOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj;
                    java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> autoReloadUserIntent2222222 = com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.ACTION_CONFIRM);
                    if (fundingInstrumentOption == null) {
                    }
                    androidx.compose.ui.Modifier context22222222 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i4, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Review.CONFIRM_BUTTON), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getCONFIRM_BUTTON()), kotlin.collections.CollectionsKt.plus((java.util.Collection) autoReloadUserIntent2222222, (java.lang.Iterable) emptyList));
                    composer2 = startRestartGroup;
                    i3 = i;
                    function03 = function02;
                    com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_authorize_button, startRestartGroup, i7), context22222222, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, (reviewUiStateStore.getBalanceId().length() > 0 || (reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading)) ? i7 : i4, ((reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) || ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) reviewUiStateStore.getState()).getStep() != com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.CREATE_AUTO_RELOAD) ? i7 : i4, composer2, ((i5 >> 6) & 14) | 1769472, 24);
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            str2 = stringResource;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, testTag, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 48, 6, 1020);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 7, null), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_review_from_section, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Review.FUNDING_INSTRUMENT_SECTION), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 48, 6, 1020);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize8(), 7, null), startRestartGroup, 0);
            if (!(reviewUiStateStore.getState() instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading)) {
            }
            if (reviewUiStateStore.getFundingInstrumentUi() == null) {
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.$r8$lambda$cstrHu58UJBBFXKobHKE6Cqbg0w(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore.this, function0, function03, i3, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static final void ReviewScreenError(final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Error error, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, final kotlin.jvm.functions.Function0<kotlin.Unit> function05, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        int i3;
        com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function05, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-165317003);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(error) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function04) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function05) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-165317003, i2, -1, "com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenError (ReviewScreen.kt:413)");
            }
            final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum errorType = error.getErrorType();
            boolean z = (i2 & 14) == 4;
            boolean z2 = (57344 & i2) == 16384;
            boolean z3 = (i2 & 7168) == 2048;
            boolean changedInstance = startRestartGroup.changedInstance(context);
            boolean z4 = (i2 & 896) == 256;
            boolean z5 = (i2 & 112) == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (((z | z2 | z3 | changedInstance | z4) || z5) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = 0;
                balanceErrorBottomSheetEnum = errorType;
                kotlin.jvm.functions.Function0 function06 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.$r8$lambda$jgwZcHGnsEi439xdX77lLhZAnHY(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Error.this, function04, function03, context, function02, function0);
                    }
                };
                startRestartGroup.updateRememberedValue(function06);
                rememberedValue = function06;
            } else {
                balanceErrorBottomSheetEnum = errorType;
                i3 = 0;
            }
            com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetKt.BalanceErrorContent(balanceErrorBottomSheetEnum, (kotlin.jvm.functions.Function0) rememberedValue, error.getErrorType() == com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.GENERIC_AUTO_RELOAD_ERROR ? function05 : function04, startRestartGroup, i3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.$r8$lambda$vABqzapcb1OHOuTZejTK6clBn10(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Error.this, function0, function02, function03, function04, function05, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ReviewScreenLowBalancePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1745505005);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1745505005, i, -1, "com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenLowBalancePreview (ReviewScreen.kt:512)");
            }
            com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore reviewUiStateStore = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore(new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance(new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi("50", "$50"), new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi("25", "$25"), (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, null, null, null, null, true, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.LOW_BALANCE_BANK_INSTANT, "", new com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi("Bank of America", "Checking ••8644", "", null, true, 8, null), false, false, null, null, null, 127230, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ReviewScreenContent(reviewUiStateStore, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.$r8$lambda$sJUVtqeJDgEk29K7zmu3tXNLrU4(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ReviewScreenScheduledWeeklyPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2011435563);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2011435563, i, -1, "com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenScheduledWeeklyPreview (ReviewScreen.kt:536)");
            }
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi("25", "$25");
            com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly weekly = new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly(java.time.DayOfWeek.MONDAY);
            java.time.LocalDate now = java.time.LocalDate.now();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(now, "");
            com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore reviewUiStateStore = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore(new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled(reloadAmountUi, weekly, now, (java.lang.String) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, null, "Dec 14th", "Monday", null, false, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.SCHEDULED_BANK, null, new com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi("Wells Fargo Bank", "Checking ••8645", "", null, false, 8, null), false, false, null, null, null, 128158, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ReviewScreenContent(reviewUiStateStore, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.m12084$r8$lambda$43x2FHcCklvrYGjNnRsdwnty5Q(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ReviewScreenScheduledBiweeklyPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1280494204);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1280494204, i, -1, "com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenScheduledBiweeklyPreview (ReviewScreen.kt:562)");
            }
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi("25", "$25");
            com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly weekly = new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly(java.time.DayOfWeek.TUESDAY);
            java.time.LocalDate now = java.time.LocalDate.now();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(now, "");
            com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore reviewUiStateStore = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore(new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled(reloadAmountUi, weekly, now, (java.lang.String) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, null, "Dec 15th", "Tuesday", null, true, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.SCHEDULED_BANK, null, new com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi("Citibank", "Checking ••8646", "", null, false, 8, null), false, false, null, null, null, 128158, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ReviewScreenContent(reviewUiStateStore, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.$r8$lambda$P73vEjmMJpMBUbOYZHq3R1S53Rs(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ReviewScreenScheduledMonthlyPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(15456181);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(15456181, i, -1, "com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenScheduledMonthlyPreview (ReviewScreen.kt:589)");
            }
            java.time.LocalDate now = java.time.LocalDate.now();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(now, "");
            com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly monthly = new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly(now);
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi("25", "$25");
            java.time.LocalDate now2 = java.time.LocalDate.now();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(now2, "");
            com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore reviewUiStateStore = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore(new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled(reloadAmountUi, monthly, now2, (java.lang.String) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, null, "Dec 24th", null, null, true, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.SCHEDULED_CARD, null, new com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi("Chase Debit Card", "VISA ••8644", "", null, true, 8, null), false, false, null, null, null, 128222, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ReviewScreenContent(reviewUiStateStore, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.$r8$lambda$D7026sBsGcBLPX6irmqvfmojgTg(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ReviewScreenNoFiSelectedPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1851994922);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1851994922, i, -1, "com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenNoFiSelectedPreview (ReviewScreen.kt:615)");
            }
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi("25", "$25");
            java.time.LocalDate now = java.time.LocalDate.now();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(now, "");
            com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly monthly = new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly(now);
            java.time.LocalDate now2 = java.time.LocalDate.now();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(now2, "");
            com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore reviewUiStateStore = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore(new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled(reloadAmountUi, monthly, now2, (java.lang.String) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, null, null, null, null, true, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.LOW_BALANCE_BANK_INSTANT, null, null, false, false, null, null, null, 128254, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ReviewScreenContent(reviewUiStateStore, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.$r8$lambda$9SygcqJVg4Ho0rbqzj31PupZo0k(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ReviewScreenNoFiAlertPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1294218335);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1294218335, i, -1, "com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenNoFiAlertPreview (ReviewScreen.kt:635)");
            }
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi("25", "$25");
            java.time.LocalDate now = java.time.LocalDate.now();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(now, "");
            com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly monthly = new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly(now);
            java.time.LocalDate now2 = java.time.LocalDate.now();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(now2, "");
            com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore reviewUiStateStore = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore(new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled(reloadAmountUi, monthly, now2, (java.lang.String) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, null, null, null, null, true, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.LOW_BALANCE_BANK_INSTANT, null, null, false, true, null, null, null, 120062, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ReviewScreenContent(reviewUiStateStore, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.$r8$lambda$ac1OcJPxdGNErSc0BaMMvfft2vo(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$0-u6KsFjaDh4EMWlKhojBhVTw6k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12083$r8$lambda$0u6KsFjaDh4EMWlKhojBhVTw6k(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$43x2FHcCklvrYGjNnR-sdwnty5Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12084$r8$lambda$43x2FHcCklvrYGjNnRsdwnty5Q(int i, androidx.compose.runtime.Composer composer, int i2) {
        ReviewScreenScheduledWeeklyPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9SygcqJVg4Ho0rbqzj31PupZo0k(int i, androidx.compose.runtime.Composer composer, int i2) {
        ReviewScreenNoFiSelectedPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9pY1sAxY9U97IYwaIHCpymRXE0Y(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel) {
        reviewViewModel.handleIntent(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnDismissError.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$D7026sBsGcBLPX6irmqvfmojgTg(int i, androidx.compose.runtime.Composer composer, int i2) {
        ReviewScreenScheduledMonthlyPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DyS4Vj_sgrArtyhi0_acH1lJSdY(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel) {
        reviewViewModel.handleIntent(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnAuthorizeClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JtTVKV7mY7avwKfwJ2Mcvi5IvEQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OFuDlPENyjZ4S3il1p4-otkvcfk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12085$r8$lambda$OFuDlPENyjZ4S3il1p4otkvcfk(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel) {
        reviewViewModel.handleIntent(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.Initialize.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$P73vEjmMJpMBUbOYZHq3R1S53Rs(int i, androidx.compose.runtime.Composer composer, int i2) {
        ReviewScreenScheduledBiweeklyPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QNFvBc_pc9FVmt_QuNeAaW1FR8M(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.navigation.AutoReloadFlowDestination.class));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$U5nQnFmMY-HYcyRbFitb3diWEWo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12086$r8$lambda$U5nQnFmMYHYcyRbFitb3diWEWo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.$r8$lambda$QNFvBc_pc9FVmt_QuNeAaW1FR8M((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$X5HOzewk7CxODDVSnZD2BcihI8U(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.m12083$r8$lambda$0u6KsFjaDh4EMWlKhojBhVTw6k((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_ugxkke_f-W9IMtKhIhob__sBlE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12087$r8$lambda$_ugxkke_fW9IMtKhIhob__sBlE(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel, com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentOption, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        reviewViewModel.handleIntent(new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnFiChanged(fundingInstrumentOption, list));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ac1OcJPxdGNErSc0BaMMvfft2vo(int i, androidx.compose.runtime.Composer composer, int i2) {
        ReviewScreenNoFiAlertPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bGzLuGpZvq3rCdoEfR7FLu4ZMV8(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel) {
        reviewViewModel.handleIntent(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnAuthorizeClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cstrHu58UJBBFXKobHKE6Cqbg0w(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore reviewUiStateStore, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        ReviewScreenContent(reviewUiStateStore, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gdRSCQkU_-qO50V9hCuqSiSnX9U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12090$r8$lambda$gdRSCQkU_qO50V9hCuqSiSnX9U(androidx.compose.runtime.MutableState mutableState, boolean z) {
        if (!z) {
            mutableState.setValue(java.lang.Boolean.FALSE);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$iMx-Mzo0RGmQV_LP5godm8mwnDs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12091$r8$lambda$iMxMzo0RGmQV_LP5godm8mwnDs(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.$r8$lambda$JtTVKV7mY7avwKfwJ2Mcvi5IvEQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jgwZcHGnsEi439xdX77lLhZAnHY(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Error error, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, android.content.Context context, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04) {
        switch (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.WhenMappings.$EnumSwitchMapping$1[error.getErrorType().ordinal()]) {
            case 1:
            case 2:
                function0.invoke();
                break;
            case 3:
            case 4:
                function02.invoke();
                break;
            case 5:
                com.paypal.oslo.feature.balance.utils.UrlUtils.launchUrlInBrowser$balance_prodRelease$default(com.paypal.oslo.feature.balance.utils.UrlUtils.INSTANCE, "https://www.paypal.com/us/smarthelp/contact-us", context, null, 4, null);
                function02.invoke();
                break;
            case 6:
            case 7:
                int i = com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.WhenMappings.$EnumSwitchMapping$0[error.getStep().ordinal()];
                if (i == 1 || i == 2) {
                    function03.invoke();
                    break;
                } else {
                    if (i != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    function04.invoke();
                    break;
                }
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lmxdm10BY8fze-efY34uiLhQZgQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12092$r8$lambda$lmxdm10BY8fzeefY34uiLhQZgQ(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel) {
        reviewViewModel.handleIntent(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnDismissFiSelection.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sJUVtqeJDgEk29K7zmu3tXNLrU4(int i, androidx.compose.runtime.Composer composer, int i2) {
        ReviewScreenLowBalancePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vABqzapcb1OHOuTZejTK6clBn10(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Error error, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, int i, androidx.compose.runtime.Composer composer, int i2) {
        ReviewScreenError(error, function0, function02, function03, function04, function05, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vNoX65c83mqxNptNBB6don0vjZI(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel) {
        reviewViewModel.handleIntent(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnChangeOrAddClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ze8hUKDwibouUBFZj2c5ur0brR4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reviewReloadStrategy, java.lang.String str, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType autoReloadFlowType, int i, androidx.compose.runtime.Composer composer, int i2) {
        ReviewScreen(appNavigator, reviewViewModel, reviewReloadStrategy, str, autoReloadFlowType, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.values().length];
            try {
                iArr[com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.FUNDING_INSTRUMENTS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.BALANCE_ID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.CREATE_AUTO_RELOAD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.values().length];
            try {
                iArr2[com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.GENERIC_AUTO_RELOAD_ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.NSF.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.FI_DECLINED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.FUNDS_ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.RISK_DECLINED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.GENERIC_ERROR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.GENERIC_API_ERROR.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.values().length];
            try {
                iArr3[com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.SCHEDULED_BANK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.SCHEDULED_CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.LOW_BALANCE_BANK_INSTANT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.LOW_BALANCE_BANK_STANDARD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr3[com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.LOW_BALANCE_CARD.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr3[com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.LOW_BALANCE_SAVINGS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr3[com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.NONE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
