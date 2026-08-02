package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a=\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a \u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u001a²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"ReportCardReasonSelectionScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/viewmodel/ReportCardReasonSelectionViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/viewmodel/ReportCardReasonSelectionViewModel;Landroidx/compose/runtime/Composer;II)V", "ReportCardReasonSelectionContent", "cardLastFourDigits", "", "state", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionEvent;", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionState;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Landroidx/compose/runtime/Composer;II)V", "handleNavigateToReportFlow", "reason", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/ReportCardReason;", "replacementInfo", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "ReportCardReasonSelectionScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "ReportCardReasonSelectionScreenWithSelectionPreview", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReportCardReasonSelectionScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0100  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReportCardReasonSelectionScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel reportCardReasonSelectionViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel reportCardReasonSelectionViewModel2;
        final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel reportCardReasonSelectionViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        ?? r15;
        java.lang.Object rememberedValue;
        boolean changedInstance;
        boolean changedInstance2;
        boolean z;
        com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1 rememberedValue2;
        boolean changedInstance3;
        com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$2$1$1 rememberedValue3;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2016883151);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                reportCardReasonSelectionViewModel2 = reportCardReasonSelectionViewModel;
                if (startRestartGroup.changedInstance(reportCardReasonSelectionViewModel2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                reportCardReasonSelectionViewModel2 = reportCardReasonSelectionViewModel;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            reportCardReasonSelectionViewModel2 = reportCardReasonSelectionViewModel;
        }
        int i5 = i3;
        if (startRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
            } else if ((i2 & 2) != 0) {
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
                r15 = 0;
                i5 &= -113;
                reportCardReasonSelectionViewModel3 = (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2016883151, i5, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreen (ReportCardReasonSelectionScreen.kt:83)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reportCardReasonSelectionViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = com.paypal.oslo.feature.debitcard.shared.analytics.ReportCardReasonSelectionAnalytics.INSTANCE.getUserIntent(reportCardReasonSelectionViewModel3.getReplacementInfo().getProductName());
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext) rememberedValue;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(userIntentContext);
                changedInstance2 = startRestartGroup.changedInstance(reportCardReasonSelectionViewModel3);
                z = (i5 & 14) != 4 ? true : r15;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(changedInstance | changedInstance2 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1(userIntentContext, reportCardReasonSelectionViewModel3, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf(userIntentContext));
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), r15);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r15));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, context);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                java.lang.String cardLastFourDigits = reportCardReasonSelectionViewModel3.getReplacementInfo().getCardLastFourDigits();
                com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionState reportCardReasonSelectionState = (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionState) collectAsStateWithLifecycle.getValue();
                changedInstance3 = startRestartGroup.changedInstance(reportCardReasonSelectionViewModel3);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$2$1$1(reportCardReasonSelectionViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ReportCardReasonSelectionContent(cardLastFourDigits, reportCardReasonSelectionState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3), userIntentContext, startRestartGroup, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9, 0);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            r15 = 0;
            reportCardReasonSelectionViewModel3 = reportCardReasonSelectionViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reportCardReasonSelectionViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext2 = (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext) rememberedValue;
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(userIntentContext2);
            changedInstance2 = startRestartGroup.changedInstance(reportCardReasonSelectionViewModel3);
            if ((i5 & 14) != 4) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!(changedInstance | changedInstance2 | z)) {
            }
            rememberedValue2 = new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1(userIntentContext2, reportCardReasonSelectionViewModel3, appNavigator, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            androidx.compose.ui.Modifier context2 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf(userIntentContext2));
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), r15);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r15));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, context2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            java.lang.String cardLastFourDigits2 = reportCardReasonSelectionViewModel3.getReplacementInfo().getCardLastFourDigits();
            com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionState reportCardReasonSelectionState2 = (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionState) collectAsStateWithLifecycle2.getValue();
            changedInstance3 = startRestartGroup.changedInstance(reportCardReasonSelectionViewModel3);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue3 = new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$2$1$1(reportCardReasonSelectionViewModel3);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            ReportCardReasonSelectionContent(cardLastFourDigits2, reportCardReasonSelectionState2, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3), userIntentContext2, startRestartGroup, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            reportCardReasonSelectionViewModel3 = reportCardReasonSelectionViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.$r8$lambda$OmxL1RZpz0keI93K9_5dOnGShlE(com.paypal.oslo.core.navigation.AppNavigator.this, reportCardReasonSelectionViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ReportCardReasonSelectionContent(final java.lang.String str, final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionState reportCardReasonSelectionState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEvent, kotlin.Unit> function1, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext2;
        com.paypal.pds.components.SelectionCardModel create;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportCardReasonSelectionState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(946744627);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changed(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(reportCardReasonSelectionState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? startRestartGroup.changed(userIntentContext) : startRestartGroup.changedInstance(userIntentContext) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            userIntentContext2 = userIntentContext;
        } else {
            final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext3 = i4 != 0 ? null : userIntentContext;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(946744627, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionContent (ReportCardReasonSelectionScreen.kt:136)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason[]{com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason.LOST_OR_STOLEN, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason.DAMAGED});
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final java.util.List list = (java.util.List) rememberedValue;
            final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason selectedReason = reportCardReasonSelectionState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionState.Success ? ((com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionState.Success) reportCardReasonSelectionState).getSelectedReason() : null;
            startRestartGroup.startReplaceGroup(-711461575);
            java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason reportCardReason : list2) {
                create = com.paypal.pds.components.SelectionCardModel.INSTANCE.create(reportCardReason.name(), (r18 & 2) != 0 ? null : com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.ReportCardReasonExtensionsKt.label(reportCardReason, startRestartGroup, 0), (r18 & 4) != 0 ? null : com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.ReportCardReasonExtensionsKt.description(reportCardReason, startRestartGroup, 0), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) ((r18 & 8) != 0 ? null : null), (r18 & 16) != 0 ? false : selectedReason == reportCardReason, (r18 & 32) == 0 ? null : null, (r18 & 64) != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : null, (r18 & 128) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : null, (r18 & 256) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : null);
                arrayList.add(create);
            }
            final java.util.ArrayList arrayList2 = arrayList;
            startRestartGroup.endReplaceGroup();
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
            boolean z = (i3 & 896) == 256;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.m14481$r8$lambda$ia5MuAQziCvhHsN8eD3i0a8lKc(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.DebitCardToolBar(null, null, true, null, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, startRestartGroup, 384, 107);
            final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext4 = userIntentContext3;
            composer2 = startRestartGroup;
            com.paypal.pds.components.DockKt.Dock(null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(340414572, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.m14480$r8$lambda$b5WuCC_7P1ZYBu4bWkGfHmvKQ8(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason.this, function1, userIntentContext3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(186641517, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.$r8$lambda$3VCkxojnXMNjr4gCUZ7QfYmu4lA(str, arrayList2, list, userIntentContext4, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 27648, 7);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            userIntentContext2 = userIntentContext4;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.$r8$lambda$q0MY9u60Hwqs5WbTLFB0rbl7GpA(str, reportCardReasonSelectionState, function1, userIntentContext2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$13vbzPPBV8u5Ze95JFDuhs5xSes(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination(cardReplacementInfo));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3VCkxojnXMNjr4gCUZ7QfYmu4lA(java.lang.String str, java.util.List list, final java.util.List list2, final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(186641517, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionContent.<anonymous>.<anonymous> (ReportCardReasonSelectionScreen.kt:174)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
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
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_report_card_reason_title, new java.lang.Object[]{str}, composer, 0);
            final java.lang.String replaceCardDigitsForAccessibility = com.paypal.oslo.feature.debitcard.shared.ui.utils.AccessibilityUtilsKt.replaceCardDigitsForAccessibility(stringResource, str);
            com.paypal.pds.core.Typography.HeadingMedium headingMedium = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE;
            com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed = composer.changed(replaceCardDigitsForAccessibility);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.$r8$lambda$ALr0fGwtHq7K7L_7ghEQF8o3264(replaceCardDigitsForAccessibility, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), contentBase, null, null, null, false, 0, 0, null, headingMedium, composer, 384, 6, 1016);
            com.paypal.pds.components.SelectionCardConfig.Vertical vertical = new com.paypal.pds.components.SelectionCardConfig.Vertical(false, 1, null);
            boolean changedInstance = composer.changedInstance(list2);
            boolean changedInstance2 = composer.changedInstance(userIntentContext);
            boolean changed2 = composer.changed(function1);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changedInstance | changedInstance2 | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.m14479$r8$lambda$R2mY52soX4pKUBo8bmHIn4V4b4(list2, userIntentContext, function1, (com.paypal.pds.components.SelectionCardModel) obj, ((java.lang.Integer) obj2).intValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.SelectionCardKt.SelectionCard(vertical, list, (kotlin.jvm.functions.Function2) rememberedValue2, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.analytics.ReportCardReasonSelectionAnalytics.INSTANCE.getREASON_SELECTION_CARD()), null, false, null, composer, com.paypal.pds.components.SelectionCardConfig.Vertical.$stable, 112);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ALr0fGwtHq7K7L_7ghEQF8o3264(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LYIyNtD6J1TNDvakPMc4PA-qrPU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14478$r8$lambda$LYIyNtD6J1TNDvakPMc4PAqrPU(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEvent.NextButtonClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OmxL1RZpz0keI93K9_5dOnGShlE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel reportCardReasonSelectionViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ReportCardReasonSelectionScreen(appNavigator, reportCardReasonSelectionViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$R2mY5-2soX4pKUBo8bmHIn4V4b4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14479$r8$lambda$R2mY52soX4pKUBo8bmHIn4V4b4(java.util.List list, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.SelectionCardModel selectionCardModel, int i) {
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item reason_lost_or_stolen;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionCardModel, "");
        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason reportCardReason = (com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason) list.get(i);
        int i2 = com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.WhenMappings.$EnumSwitchMapping$0[reportCardReason.ordinal()];
        if (i2 == 1) {
            reason_lost_or_stolen = com.paypal.oslo.feature.debitcard.shared.analytics.ReportCardReasonSelectionAnalytics.INSTANCE.getREASON_LOST_OR_STOLEN();
        } else {
            if (i2 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            reason_lost_or_stolen = com.paypal.oslo.feature.debitcard.shared.analytics.ReportCardReasonSelectionAnalytics.INSTANCE.getREASON_DAMAGED();
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item = reason_lost_or_stolen;
        if (userIntentContext != null) {
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardItemPressed$default(com.paypal.oslo.feature.debitcard.shared.analytics.ReportCardReasonSelectionAnalytics.SCREEN_ID, item, userIntentContext, null, 8, null);
        }
        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEvent.ReasonSelected(reportCardReason));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$R7DTJcBmKeOWQaLUENA_TwVJQP0(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        copy = cardReplacementInfo.copy((r20 & 1) != 0 ? cardReplacementInfo.debitInstrumentId : null, (r20 & 2) != 0 ? cardReplacementInfo.productName : null, (r20 & 4) != 0 ? cardReplacementInfo.cardLastFourDigits : null, (r20 & 8) != 0 ? cardReplacementInfo.displayAddress : null, (r20 & 16) != 0 ? cardReplacementInfo.cardArtUrl : null, (r20 & 32) != 0 ? cardReplacementInfo.billingAddressId : null, (r20 & 64) != 0 ? cardReplacementInfo.expectedArrivalDate : null, (r20 & 128) != 0 ? cardReplacementInfo.flowType : com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementFlowType.DAMAGED, (r20 & 256) != 0 ? cardReplacementInfo.primary : false);
        navigationScope.push(new com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination(copy));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$b4K4tQfZYbX2Vd762RGlWGasFTA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(878489371);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(878489371, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenWithSelectionPreview (ReportCardReasonSelectionScreen.kt:280)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionState.Success success = new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionState.Success(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason.DAMAGED);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.$r8$lambda$smqhJPtlwOiALjqMarhy2oQX7lY((com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ReportCardReasonSelectionContent("8458", success, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 390, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.$r8$lambda$b4K4tQfZYbX2Vd762RGlWGasFTA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$b5WuC-C_7P1ZYBu4bWkGfHmvKQ8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14480$r8$lambda$b5WuCC_7P1ZYBu4bWkGfHmvKQ8(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason reportCardReason, final kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(340414572, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionContent.<anonymous>.<anonymous> (ReportCardReasonSelectionScreen.kt:220)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_next, composer, 0);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            boolean z = reportCardReason != null;
            androidx.compose.ui.Modifier item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.debitcard.shared.analytics.ReportCardReasonSelectionAnalytics.INSTANCE.getNEXT_BUTTON());
            if (userIntentContext != null) {
                item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(item, kotlin.collections.CollectionsKt.listOf(userIntentContext));
            }
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.m14478$r8$lambda$LYIyNtD6J1TNDvakPMc4PAqrPU(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, item, null, null, primary, large, z, false, composer, 1769472, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ia5Mu-AQziCvhHsN8eD3i0a8lKc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14481$r8$lambda$ia5MuAQziCvhHsN8eD3i0a8lKc(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEvent.BackPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m2evaNYHkwEQhSfVogPPSuYrY1s(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEvent reportCardReasonSelectionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportCardReasonSelectionEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$q0MY9u60Hwqs5WbTLFB0rbl7GpA(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionState reportCardReasonSelectionState, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ReportCardReasonSelectionContent(str, reportCardReasonSelectionState, function1, userIntentContext, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$q_Sqsjoo-3SPX2aWvSrtiGUVYTU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14482$r8$lambda$q_Sqsjoo3SPX2aWvSrtiGUVYTU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2131815773);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2131815773, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenPreview (ReportCardReasonSelectionScreen.kt:270)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionState.Initial initial = com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionState.Initial.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.$r8$lambda$m2evaNYHkwEQhSfVogPPSuYrY1s((com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ReportCardReasonSelectionContent("8458", initial, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 438, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.m14482$r8$lambda$q_Sqsjoo3SPX2aWvSrtiGUVYTU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$smqhJPtlwOiALjqMarhy2oQX7lY(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEvent reportCardReasonSelectionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportCardReasonSelectionEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$handleNavigateToReportFlow(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason reportCardReason, final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        int i = com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.WhenMappings.$EnumSwitchMapping$0[reportCardReason.ordinal()];
        if (i == 1) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.$r8$lambda$13vbzPPBV8u5Ze95JFDuhs5xSes(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.$r8$lambda$R7DTJcBmKeOWQaLUENA_TwVJQP0(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason.LOST_OR_STOLEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason.DAMAGED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
