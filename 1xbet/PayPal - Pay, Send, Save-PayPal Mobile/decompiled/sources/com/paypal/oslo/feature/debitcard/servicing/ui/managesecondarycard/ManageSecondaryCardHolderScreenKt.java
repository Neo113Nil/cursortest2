package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard;

@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\u001a1\u0010\r\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\u0011\u001a \u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a;\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\u001a?\u0010\u001c\u001a\u00020\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001a2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010#\u001a/\u0010$\u001a\u00020\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010%\u001a\r\u0010&\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015¨\u0006'²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"ManageSecondaryCardHolderScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/viewmodel/ManageSecondaryCardHolderViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/viewmodel/ManageSecondaryCardHolderViewModel;Landroidx/compose/runtime/Composer;I)V", "TrackManageSecondaryCardHoldersAnalytics", "state", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState;", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Landroidx/compose/runtime/Composer;I)V", "ManageSecondaryCardHolderContent", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEvent;", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Landroidx/compose/runtime/Composer;I)V", "trackManageSecondaryCardHolderItemAnalytics", "event", "LoadingContent", "(Landroidx/compose/runtime/Composer;I)V", "ErrorContent", "errorType", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "retryCount", "", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;ILandroidx/compose/runtime/Composer;II)V", "SuccessContent", "instruments", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "canAddMoreCardholders", "", "maxAdditionalCardsAllowed", "(Ljava/util/List;ZILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CardholdersList", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ManageSecondaryCardHoldersPreview", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ManageSecondaryCardHolderScreenKt {
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean, int] */
    public static final void ManageSecondaryCardHolderScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel manageSecondaryCardHolderViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        ?? r12;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageSecondaryCardHolderViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(988053177);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(manageSecondaryCardHolderViewModel) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(988053177, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreen (ManageSecondaryCardHolderScreen.kt:94)");
            }
            final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(manageSecondaryCardHolderViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            boolean changedInstance = startRestartGroup.changedInstance(manageSecondaryCardHolderViewModel);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$1$1(manageSecondaryCardHolderViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m14435invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m14435invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
            boolean changedInstance2 = startRestartGroup.changedInstance(manageSecondaryCardHolderViewModel);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$2$1(manageSecondaryCardHolderViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue3;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$$inlined$NavResultEffect-rtGRyWw$2
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m14436invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m14436invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance3 = startRestartGroup.changedInstance(manageSecondaryCardHolderViewModel);
            boolean z = (i2 & 14) == 4;
            boolean changed = startRestartGroup.changed(rememberNavResultRequestId2);
            boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (((changed | changedInstance3 | z) || changed2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                r12 = 0;
                composer2 = startRestartGroup;
                rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$3$1(manageSecondaryCardHolderViewModel, appNavigator, rememberNavResultRequestId2, rememberNavResultRequestId, null);
                composer2.updateRememberedValue(rememberedValue5);
            } else {
                r12 = 0;
                composer2 = startRestartGroup;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, composer2, 6);
            final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent = com.paypal.oslo.feature.debitcard.shared.analytics.ManageSecondaryCardHoldersAnalytics.INSTANCE.getUserIntent(manageSecondaryCardHolderViewModel.getProductName());
            getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState) collectAsStateWithLifecycle.getValue(), userIntent, composer2, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 3);
            boolean changed3 = composer2.changed(collectAsStateWithLifecycle);
            boolean changedInstance4 = composer2.changedInstance(userIntent);
            boolean changedInstance5 = composer2.changedInstance(manageSecondaryCardHolderViewModel);
            java.lang.Object rememberedValue6 = composer2.rememberedValue();
            if ((changed3 | changedInstance4 | changedInstance5) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.m14434$r8$lambda$vHlN_U4eGZ12nu9TSsJOMJXHqQ(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.this, manageSecondaryCardHolderViewModel, collectAsStateWithLifecycle, (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue6;
            androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf(userIntent));
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), r12);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, r12));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, context);
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
            ManageSecondaryCardHolderContent((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState) collectAsStateWithLifecycle.getValue(), function1, userIntent, composer2, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 6);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.$r8$lambda$GGQqujsCho2HZoaL1G4LzO4YJP8(com.paypal.oslo.core.navigation.AppNavigator.this, manageSecondaryCardHolderViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState manageSecondaryCardState, final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1608195042);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(manageSecondaryCardState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(userIntentContext) : startRestartGroup.changedInstance(userIntentContext) ? 32 : 16;
        }
        boolean z = true;
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1608195042, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.TrackManageSecondaryCardHoldersAnalytics (ManageSecondaryCardHolderScreen.kt:167)");
            }
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(manageSecondaryCardState.getClass());
            boolean z2 = (i2 & 14) == 4;
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !startRestartGroup.changedInstance(userIntentContext))) {
                z = false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$TrackManageSecondaryCardHoldersAnalytics$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$TrackManageSecondaryCardHoldersAnalytics$1$1(manageSecondaryCardState, userIntentContext, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(orCreateKotlinClass, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.$r8$lambda$VpRUEhsm9_8ylRFmufuXYqxm8EY(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.this, userIntentContext, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ManageSecondaryCardHolderContent(final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState manageSecondaryCardState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent, kotlin.Unit> function1, final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageSecondaryCardState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-777727248);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(manageSecondaryCardState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(userIntentContext) : startRestartGroup.changedInstance(userIntentContext) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-777727248, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderContent (ManageSecondaryCardHolderScreen.kt:194)");
            }
            androidx.compose.ui.Modifier windowInsetsPadding = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, windowInsetsPadding);
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
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.$r8$lambda$iDMwTeiszXOUhAZSRkuRxwDkFfQ(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.DebitCardToolBar(null, null, true, null, (kotlin.jvm.functions.Function0) rememberedValue, null, null, startRestartGroup, 384, 107);
            if ((manageSecondaryCardState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Initial) || (manageSecondaryCardState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Loading)) {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(684023510);
                getHighSpeedVideoFpsRanges(composer2, 0);
                composer2.endReplaceGroup();
            } else if (manageSecondaryCardState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Error) {
                startRestartGroup.startReplaceGroup(-270035686);
                com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Error) manageSecondaryCardState;
                composer2 = startRestartGroup;
                getHighSpeedVideoFpsRangesFor(error.getErrorType(), function1, userIntentContext, error.getRetryCount(), startRestartGroup, i4 | (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 6) | (i3 & 896), 0);
                composer2.endReplaceGroup();
            } else {
                composer2 = startRestartGroup;
                if (!(manageSecondaryCardState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Success)) {
                    composer2.startReplaceGroup(684020511);
                    composer2.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer2.startReplaceGroup(684033800);
                com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Success) manageSecondaryCardState;
                getHighSpeedVideoSizes(success.getInstruments(), success.getCanAddMoreCardholders(), success.getMaxAdditionalCardsAllowed(), function1, composer2, (i3 << 6) & 7168);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.$r8$lambda$BJg7HfYupLjv1FQDpnb69bP0Gnc(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.this, function1, userIntentContext, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1358685882);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1358685882, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.LoadingContent (ManageSecondaryCardHolderScreen.kt:252)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.MANAGE_SECONDARY_CARDHOLDER_LOADING);
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
            com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.$r8$lambda$fPuqSZivUeMAEwqeklY_kFU1ydQ(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent, kotlin.Unit> function1, final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, int i, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        final int i6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(130529108);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(debitErrorType.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? startRestartGroup.changed(userIntentContext) : startRestartGroup.changedInstance(userIntentContext) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i5) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                i6 = i5;
            } else {
                int i8 = i7 != 0 ? 0 : i5;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(130529108, i4, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ErrorContent (ManageSecondaryCardHolderScreen.kt:269)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.MANAGE_SECONDARY_CARDHOLDER_ERROR);
                int i9 = i4 & 112;
                boolean z = i9 == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.$r8$lambda$7dF_H_q0WNrk276ti2BmGBSitPc(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                boolean z2 = i9 == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.$r8$lambda$GE_1N2YvP2xIrk5Ei6RMN168Vdg(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.DebitErrorScreen(debitErrorType, function0, (kotlin.jvm.functions.Function0) rememberedValue2, userIntentContext, testTag, false, java.lang.Integer.valueOf(i8), null, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | (i4 & 14) | 221184 | ((i4 << 3) & 7168) | ((i4 << 9) & 3670016), 128);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                i6 = i8;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.$r8$lambda$7j05F0DlDA2MgzpNhuRQoVE8rzc(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.this, function1, userIntentContext, i6, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 = i;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoSizes(final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list, final boolean z, final int i, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-116868585);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-116868585, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SuccessContent (ManageSecondaryCardHolderScreen.kt:289)");
            }
            com.paypal.pds.components.DockKt.Dock(null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(301542746, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.$r8$lambda$BYP7TqFwzmFjSuS9ttxUsJXxWUA(z, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(565239771, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.$r8$lambda$M6KiNuUeP0BID_CMwpMBTQV5soM(i, list, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 27648, 7);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.$r8$lambda$Zcw843aHBARj4QNOQU20pzX82B4(list, z, i, function1, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2015102187);
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-2015102187, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.CardholdersList (ManageSecondaryCardHolderScreen.kt:333)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.CardKt.Card(null, null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1941879535, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.$r8$lambda$eYp6cB1iFk8Kxx_lSm5LDuQDxcU(list, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306368, 503);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.$r8$lambda$JN08hogJYIohflnLqn_8rtHEk4w(list, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-X7cEg7Y0dyUTNUvRcw9E9LbiGI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14433$r8$lambda$X7cEg7Y0dyUTNUvRcw9E9LbiGI(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent manageSecondaryCardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageSecondaryCardEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7dF_H_q0WNrk276ti2BmGBSitPc(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent.RetryClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7j05F0DlDA2MgzpNhuRQoVE8rzc(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        getHighSpeedVideoFpsRangesFor(debitErrorType, function1, userIntentContext, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8Jep6e7e5NnpbwUNX1AsFYNcvYw(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent.AddCardholderClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BJg7HfYupLjv1FQDpnb69bP0Gnc(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState manageSecondaryCardState, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, int i, androidx.compose.runtime.Composer composer, int i2) {
        ManageSecondaryCardHolderContent(manageSecondaryCardState, function1, userIntentContext, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BYP7TqFwzmFjSuS9ttxUsJXxWUA(boolean z, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(301542746, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SuccessContent.<anonymous> (ManageSecondaryCardHolderScreen.kt:292)");
            }
            if (z) {
                composer.startReplaceGroup(-1811565038);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_cardholder_add_button, composer, 0);
                com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null);
                boolean changed = composer.changed(function1);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.$r8$lambda$8Jep6e7e5NnpbwUNX1AsFYNcvYw(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, m1708paddingVpY3zN4$default, null, null, primary, large, false, false, composer, 1769472, 408);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1811130232);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GE_1N2YvP2xIrk5Ei6RMN168Vdg(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent.BackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GGQqujsCho2HZoaL1G4LzO4YJP8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel manageSecondaryCardHolderViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        ManageSecondaryCardHolderScreen(appNavigator, manageSecondaryCardHolderViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JN08hogJYIohflnLqn_8rtHEk4w(java.util.List list, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(list, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$M6KiNuUeP0BID_CMwpMBTQV5soM(int i, java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(565239771, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SuccessContent.<anonymous> (ManageSecondaryCardHolderScreen.kt:305)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing20()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1708paddingVpY3zN4$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.HeaderKt.Header(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_manage_secondary_cardholders, composer, 0), (androidx.compose.ui.Modifier) null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_manage_secondary_cardholders_subtitle, new java.lang.Object[]{java.lang.Integer.valueOf(i)}, composer, 0), (java.lang.String) null, (com.paypal.pds.components.HeaderContentAlignment) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            if (list.isEmpty()) {
                composer.startReplaceGroup(-596164431);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-596309542);
                getHighSpeedVideoSizes(list, function1, composer, 0);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$VpRUEhsm9_8ylRFmufuXYqxm8EY(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState manageSecondaryCardState, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(manageSecondaryCardState, userIntentContext, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Zcw843aHBARj4QNOQU20pzX82B4(java.util.List list, boolean z, int i, kotlin.jvm.functions.Function1 function1, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(list, z, i, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_qpWK4MszRvfwFrifmtbomoIkOY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1875083841);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1875083841, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHoldersPreview (ManageSecondaryCardHolderScreen.kt:362)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Success success = new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Success(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument("1", new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState.ACTIVE, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.LOCKED, null), "BUSINESS_DEBIT_CARD", false, false, new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails(null, null, null), "", new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails("", "", "", "", com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand.MASTER_CARD, new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls(new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl("", null), new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl("", null)), new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls(new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl("", null), new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl("", null)), kotlin.collections.CollectionsKt.emptyList(), (java.util.List) null, (java.lang.Integer) null, 256, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails(null, null, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus.ARRIVED), new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardHolder("Grace", "Hamilton", null), com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus.SET, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinOrigin.USER, kotlin.collections.CollectionsKt.emptyList(), null)), 3, true);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.m14433$r8$lambda$X7cEg7Y0dyUTNUvRcw9E9LbiGI((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ManageSecondaryCardHolderContent(success, (kotlin.jvm.functions.Function1) rememberedValue, com.paypal.oslo.feature.debitcard.shared.analytics.ManageSecondaryCardHoldersAnalytics.INSTANCE.getUserIntent(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.BUSINESS_DEBIT_CARD), startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 6) | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.$r8$lambda$_qpWK4MszRvfwFrifmtbomoIkOY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eYp6cB1iFk8Kxx_lSm5LDuQDxcU(java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1941879535, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.CardholdersList.<anonymous> (ManageSecondaryCardHolderScreen.kt:337)");
            }
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            composer.startReplaceGroup(-1658013241);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) it.next();
                boolean changed = composer.changed(function1);
                boolean changedInstance = composer.changedInstance(debitInstrument);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.$r8$lambda$ySnQNeTTAjHyrWVuvKjsmnGwUHc(kotlin.jvm.functions.Function1.this, debitInstrument);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderListItemKt.ManageSecondaryCardHolderListItem(debitInstrument, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fPuqSZivUeMAEwqeklY_kFU1ydQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iDMwTeiszXOUhAZSRkuRxwDkFfQ(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent.BackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vHlN_U4eGZ12nu9TSsJOMJX-HqQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14434$r8$lambda$vHlN_U4eGZ12nu9TSsJOMJXHqQ(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel manageSecondaryCardHolderViewModel, androidx.compose.runtime.State state, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent manageSecondaryCardEvent) {
        java.lang.String str;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item cardholder_row;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageSecondaryCardEvent, "");
        com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState manageSecondaryCardState = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState) state.getValue();
        if ((manageSecondaryCardState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Initial) || (manageSecondaryCardState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Loading)) {
            str = com.paypal.oslo.feature.debitcard.shared.analytics.ManageSecondaryCardHoldersAnalytics.SCREEN_LOADING;
        } else if (manageSecondaryCardState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Error) {
            str = com.paypal.oslo.feature.debitcard.shared.analytics.ManageSecondaryCardHoldersAnalytics.SCREEN_ERROR;
        } else {
            if (!(manageSecondaryCardState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Success)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = com.paypal.oslo.feature.debitcard.shared.analytics.ManageSecondaryCardHoldersAnalytics.SCREEN_ID;
        }
        java.lang.String str2 = str;
        if (manageSecondaryCardEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent.BackClicked) {
            cardholder_row = com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardToolbarAnalytics.INSTANCE.getBACK_BUTTON();
        } else {
            if (!(manageSecondaryCardEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent.AddCardholderClicked)) {
                if (manageSecondaryCardEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent.CardHolderClicked) {
                    cardholder_row = com.paypal.oslo.feature.debitcard.shared.analytics.ManageSecondaryCardHoldersAnalytics.INSTANCE.getCARDHOLDER_ROW();
                }
                manageSecondaryCardHolderViewModel.processEvent(manageSecondaryCardEvent);
                return kotlin.Unit.INSTANCE;
            }
            cardholder_row = com.paypal.oslo.feature.debitcard.shared.analytics.ManageSecondaryCardHoldersAnalytics.INSTANCE.getADD_CARDHOLDER_BUTTON();
        }
        com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardItemPressed$default(str2, cardholder_row, userIntentContext, null, 8, null);
        manageSecondaryCardHolderViewModel.processEvent(manageSecondaryCardEvent);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ySnQNeTTAjHyrWVuvKjsmnGwUHc(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument) {
        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent.CardHolderClicked(debitInstrument.getId(), com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.INSTANCE.fromValue(debitInstrument.getProductName()), debitInstrument.getStatus().getDisplayState()));
        return kotlin.Unit.INSTANCE;
    }
}
