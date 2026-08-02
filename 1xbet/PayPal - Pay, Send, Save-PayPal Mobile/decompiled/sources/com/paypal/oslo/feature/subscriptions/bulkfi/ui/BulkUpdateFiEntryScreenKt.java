package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u007f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072H\u0010\b\u001aD\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001aC\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010!\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f¨\u0006\"²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, d2 = {"BulkUpdateFiEntryScreen", "", "viewModel", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiViewModel;", "agreementType", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "onBackClick", "Lkotlin/Function0;", "onNavigateToUpdateFi", "Lkotlin/Function2;", "", "", "Lkotlin/ParameterName;", "name", "agreementIds", "", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "agreementsMap", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiViewModel;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BulkUpdateFiEntryScreenContent", "uiState", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiEvent;", "toastState", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/UiToastState;", "(Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lcom/paypal/oslo/feature/subscriptions/shared/domain/UiToastState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BulkUpdateFiEntryScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "BulkUpdateFiEntryScreenLoadingPreview", "BulkUpdateFiEntryScreenErrorPreview", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BulkUpdateFiEntryScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0089  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.paypal.oslo.core.navigation.result.NavResultManager, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BulkUpdateFiEntryScreen(final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel bulkUpdateFiViewModel, final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel>, kotlin.Unit> function2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        ?? r7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(422961049);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(bulkUpdateFiViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(agreementType) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(422961049, i4, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreen (BulkUpdateFiEntryScreen.kt:69)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(bulkUpdateFiViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState(null, 1, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState uiToastState = (com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState) rememberedValue;
                android.content.res.Resources resources = (android.content.res.Resources) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources());
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(bulkUpdateFiViewModel);
                boolean changedInstance2 = startRestartGroup.changedInstance(agreementType);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$BulkUpdateFiEntryScreen$1$1(bulkUpdateFiViewModel, agreementType, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                boolean changedInstance3 = startRestartGroup.changedInstance(bulkUpdateFiViewModel);
                boolean z = (i4 & 7168) == 2048;
                boolean changedInstance4 = startRestartGroup.changedInstance(resources);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (((changedInstance3 | z) || changedInstance4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    r7 = 0;
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$BulkUpdateFiEntryScreen$2$1(bulkUpdateFiViewModel, uiToastState, function2, resources, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                } else {
                    r7 = 0;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(bulkUpdateFiViewModel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, i4 & 14);
                java.lang.String agreementUpdateRequestId = bulkUpdateFiViewModel.getAgreementUpdateRequestId();
                boolean changedInstance5 = startRestartGroup.changedInstance(bulkUpdateFiViewModel);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance5 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$BulkUpdateFiEntryScreen$3$1(bulkUpdateFiViewModel, r7);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue4;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(r7, startRestartGroup, 0);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$BulkUpdateFiEntryScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m19754invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m19754invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(agreementUpdateRequestId, resolveNavResultManager, function22, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, 3072);
                com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState bulkUpdateFiUiState = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState) collectAsStateWithLifecycle.getValue();
                boolean z2 = (i4 & 896) == 256;
                boolean changedInstance6 = startRestartGroup.changedInstance(bulkUpdateFiViewModel);
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if ((changedInstance6 | z2) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt.$r8$lambda$9VsUsx4aOOp1u1I47peivKyomkw(kotlin.jvm.functions.Function0.this, bulkUpdateFiViewModel, (com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                composer2 = startRestartGroup;
                BulkUpdateFiEntryScreenContent(bulkUpdateFiUiState, (kotlin.jvm.functions.Function1) rememberedValue6, agreementType, uiToastState, modifier4, composer2, (57344 & i4) | ((i4 << 3) & 896) | 3072, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt.$r8$lambda$mf13NBZFcM6Hb9Yc7zfai1JZdMw(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel.this, agreementType, function0, function2, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BulkUpdateFiEntryScreenContent(final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState bulkUpdateFiUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, final com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState uiToastState, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics bulkFiScreenAnalytics;
        int i5;
        int i6;
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance;
        int i7;
        com.paypal.oslo.feature.subscriptions.analytics.shared.ModuleAnalytics moduleAnalytics;
        com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule errorModule;
        com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule errorModule2;
        com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics.SelectionListModule selectionListModule;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiToastState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-624742434);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(bulkUpdateFiUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(agreementType) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(uiToastState) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-624742434, i4, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenContent (BulkUpdateFiEntryScreen.kt:135)");
                }
                if (startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics()) instanceof com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics) {
                    startRestartGroup.startReplaceGroup(-1572055156);
                    java.lang.Object consume = startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics());
                    if (!(consume instanceof com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics)) {
                        consume = null;
                    }
                    bulkFiScreenAnalytics = (com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics) consume;
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1571993001);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.subscriptions.LoggerKt.log;
                    com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics commonScreenAnalytics = (com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics) startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics());
                    if (commonScreenAnalytics == null || (str = commonScreenAnalytics.getClass().getSimpleName()) == null) {
                        str = "null";
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Requested analytics of type BulkFiScreenAnalytics but current analytics is of type ");
                    sb.append(str);
                    sb.append(". Returning null.");
                    com.paypal.android.logger.Logger.w$default(logger, sb.toString(), null, null, 6, null);
                    startRestartGroup.endReplaceGroup();
                    bulkFiScreenAnalytics = null;
                }
                final com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics bulkFiScreenAnalytics2 = bulkFiScreenAnalytics;
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier modifier5 = modifier4;
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
                if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                    i5 = com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_subscriptions_nav_title;
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    i5 = com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_linked_businesses_hub_title;
                }
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(i5, startRestartGroup, 0), null, null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-326867477, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt.$r8$lambda$RfdkRnEcDJGNg1C_fN1HzCV7HzU(kotlin.jvm.functions.Function1.this, bulkFiScreenAnalytics2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 1572864, 62);
                if ((bulkUpdateFiUiState instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Initial) || (bulkUpdateFiUiState instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Loading)) {
                    i6 = 0;
                    boxScopeInstance = boxScopeInstance2;
                    i7 = i4;
                    startRestartGroup.startReplaceGroup(-1750587387);
                    com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiShimmerScreenKt.BulkUpdateFiShimmerScreen(null, startRestartGroup, 0, 1);
                    startRestartGroup.endReplaceGroup();
                } else if (bulkUpdateFiUiState instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success) {
                    startRestartGroup.startReplaceGroup(-1750456567);
                    com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success success = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success) bulkUpdateFiUiState;
                    androidx.compose.ui.Modifier subscriptionsAnalyticsModule = com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsModule(androidx.compose.ui.Modifier.INSTANCE, (bulkFiScreenAnalytics2 == null || (selectionListModule = bulkFiScreenAnalytics2.getSelectionListModule()) == null) ? null : com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule.moduleCtx$default(selectionListModule, null, null, 0, null, 11, null), startRestartGroup, 6);
                    int i9 = i4 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO;
                    boxScopeInstance = boxScopeInstance2;
                    i7 = i4;
                    com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiScreenKt.BulkUpdateFiScreen(success, function1, agreementType, subscriptionsAnalyticsModule, startRestartGroup, i9, 0);
                    startRestartGroup.endReplaceGroup();
                    i6 = 0;
                    startRestartGroup = startRestartGroup;
                } else {
                    boxScopeInstance = boxScopeInstance2;
                    i7 = i4;
                    if (!(bulkUpdateFiUiState instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Error)) {
                        startRestartGroup.startReplaceGroup(2021737656);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-1749924669);
                    boolean z = (i7 & 112) == 32;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt.$r8$lambda$SMEeHpL_lnJuh_XmOyVSQ4wOZac(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                    androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                    if (bulkFiScreenAnalytics2 == null || (errorModule2 = bulkFiScreenAnalytics2.getErrorModule()) == null) {
                        i6 = 0;
                        moduleAnalytics = null;
                    } else {
                        moduleAnalytics = com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule.moduleCtx$default(errorModule2, kotlin.collections.CollectionsKt.listOf(((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Error) bulkUpdateFiUiState).getErrorContext()), null, 0, null, 10, null);
                        i6 = 0;
                    }
                    com.paypal.oslo.feature.subscriptions.shared.ui.error.ErrorScreenKt.ErrorScreen(function0, com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsModule(weight$default, moduleAnalytics, startRestartGroup, i6), (bulkFiScreenAnalytics2 == null || (errorModule = bulkFiScreenAnalytics2.getErrorModule()) == null) ? null : errorModule.tryAgainButton(), startRestartGroup, 0, 0);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                com.paypal.oslo.feature.subscriptions.shared.ui.SubscriptionToastKt.SubscriptionToast(uiToastState, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, (i7 >> 9) & 14, i6);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt.$r8$lambda$hkPgSWlD0Y403e9HZXKDmBpRxH0(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.this, function1, agreementType, uiToastState, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9VsUsx4aOOp1u1I47peivKyomkw(kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel bulkUpdateFiViewModel, com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent bulkUpdateFiUiEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiUiEvent, "");
        if (bulkUpdateFiUiEvent instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnCloseClicked) {
            function0.invoke();
        } else {
            bulkUpdateFiViewModel.onEvent(bulkUpdateFiUiEvent);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B6ZNwomVriVHAWtsS_9jLovV_Us(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent bulkUpdateFiUiEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiUiEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NyfxDFgF3OjH9V1-12Bsv8uG0Xk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19752$r8$lambda$NyfxDFgF3OjH9V112Bsv8uG0Xk(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnCloseClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RfdkRnEcDJGNg1C_fN1HzCV7HzU(final kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics bulkFiScreenAnalytics, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-326867477, i, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenContent.<anonymous>.<anonymous>.<anonymous> (BulkUpdateFiEntryScreen.kt:152)");
            }
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt.m19752$r8$lambda$NyfxDFgF3OjH9V112Bsv8uG0Xk(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton((kotlin.jvm.functions.Function0) rememberedValue, com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsItem(androidx.compose.ui.Modifier.INSTANCE, bulkFiScreenAnalytics != null ? bulkFiScreenAnalytics.closeButton() : null), null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SMEeHpL_lnJuh_XmOyVSQ4wOZac(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnRetry.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_bBlUKKoIu88li1z0guIJCwPNm0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-377439920);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-377439920, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenLoadingPreview (BulkUpdateFiEntryScreen.kt:226)");
            }
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Loading loading = com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Loading.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt.$r8$lambda$bPWG6ExRjhVBrkpIYTdWJbtcGlA((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription subscription = com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState(null, 1, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            BulkUpdateFiEntryScreenContent(loading, function1, subscription, (com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState) rememberedValue2, null, startRestartGroup, 3126, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt.$r8$lambda$_bBlUKKoIu88li1z0guIJCwPNm0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bPWG6ExRjhVBrkpIYTdWJbtcGlA(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent bulkUpdateFiUiEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiUiEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cyerHtYpoFC1ItXaTo4nUy-R1qg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19753$r8$lambda$cyerHtYpoFC1ItXaTo4nUyR1qg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-171969528);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-171969528, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenPreview (BulkUpdateFiEntryScreen.kt:213)");
            }
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success preview = com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.INSTANCE.preview();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt.$r8$lambda$B6ZNwomVriVHAWtsS_9jLovV_Us((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription subscription = com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState(null, 1, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            BulkUpdateFiEntryScreenContent(preview, function1, subscription, (com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState) rememberedValue2, null, startRestartGroup, 3120, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt.m19753$r8$lambda$cyerHtYpoFC1ItXaTo4nUyR1qg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eh9lATw3A4WcfxXCvh6HugDYDI4(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent bulkUpdateFiUiEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiUiEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hkPgSWlD0Y403e9HZXKDmBpRxH0(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState bulkUpdateFiUiState, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState uiToastState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BulkUpdateFiEntryScreenContent(bulkUpdateFiUiState, function1, agreementType, uiToastState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mf13NBZFcM6Hb9Yc7zfai1JZdMw(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel bulkUpdateFiViewModel, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function2 function2, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BulkUpdateFiEntryScreen(bulkUpdateFiViewModel, agreementType, function0, function2, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yBaf_N8npAm25EY1cKfCtPnr6yc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-122800508);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-122800508, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenErrorPreview (BulkUpdateFiEntryScreen.kt:239)");
            }
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Error error = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Error(new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Network("404", "Data not found", null, 4, null).toErrorContext());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt.$r8$lambda$eh9lATw3A4WcfxXCvh6HugDYDI4((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription subscription = com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState(null, 1, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            BulkUpdateFiEntryScreenContent(error, function1, subscription, (com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState) rememberedValue2, null, startRestartGroup, 3120, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt.$r8$lambda$yBaf_N8npAm25EY1cKfCtPnr6yc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
