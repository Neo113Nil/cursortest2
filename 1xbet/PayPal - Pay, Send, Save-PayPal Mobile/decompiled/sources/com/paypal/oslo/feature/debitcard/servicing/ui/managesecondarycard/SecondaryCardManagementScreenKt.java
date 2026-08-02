package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\u001a\u0018\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a;\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0016H\u0003¢\u0006\u0002\u0010\u0017\u001ai\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010#2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u00162\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010$\u001a\u007f\u0010%\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010!2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010#2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010#2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u00162\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010/\u001ac\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00102\u001a\u0002032\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010#2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u00162\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u00104\u001a\u0018\u00105\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00106\u001a\u000207H\u0002\u001a6\u00108\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010#2\u0006\u00109\u001a\u0002032\b\u0010:\u001a\u0004\u0018\u00010;2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0016H\u0000\u001a\u0017\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0002\u0010@\u001a\r\u0010A\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006B²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020(X\u008a\u008e\u0002²\u0006\f\u0010>\u001a\u0004\u0018\u00010?X\u008a\u008e\u0002²\u0006\f\u0010&\u001a\u0004\u0018\u00010!X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020(X\u008a\u008e\u0002"}, d2 = {"SecondaryCardManagementScreen", "", "viewModel", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/viewmodel/SecondaryCardManagementViewModel;", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/viewmodel/SecondaryCardManagementViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/Composer;I)V", "TrackSecondaryCardManagementAnalytics", "state", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState;", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Landroidx/compose/runtime/Composer;I)V", "trackSecondaryCardItemAnalytics", "event", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserEvent;", "SecondaryCardManagementLoadingState", "(Landroidx/compose/runtime/Composer;I)V", "SecondaryCardManagementSuccessState", "uiState", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState$Success;", "onEvent", "Lkotlin/Function1;", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState$Success;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SecondaryCardManagementContent", "debitInstrument", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "sections", "", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "onDailyLimitSelect", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/limits/model/DailyLimit;", "onEditBillingAddressClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/Composer;I)V", "SecondaryCardManagementBottomSheets", "selectedDailyLimit", "shouldShowDailyLimitSheet", "", "showEditBillingAddressBottomSheet", "editBillingAddressBottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "dailyLimitBottomSheetController", "onDailyLimitDismiss", "onEditBillingAddressDismiss", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState$Success;Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/limits/model/DailyLimit;ZZLcom/paypal/pds/components/BottomSheetController;Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Landroidx/compose/runtime/Composer;II)V", "SecondaryCardManagementSectionContent", "section", "instrumentId", "", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/Composer;I)V", "navigateToCardReplacement", "replacementInfo", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "getSecondaryCardOperationClickHandler", "operationId", "toggleState", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/Toggle;", "getSecondaryCardToastComponent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "toastMessageRes", "", "(Ljava/lang/Integer;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "SecondaryCardManagementSuccessScreenPreview", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SecondaryCardManagementScreenKt {
    public static final void SecondaryCardManagementScreen(final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel secondaryCardManagementViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryCardManagementViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1067478991);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(secondaryCardManagementViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1067478991, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreen (SecondaryCardManagementScreen.kt:116)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(secondaryCardManagementViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent = com.paypal.oslo.feature.debitcard.shared.analytics.ManageSecondaryCardAnalytics.INSTANCE.getUserIntent(secondaryCardManagementViewModel.getProductName());
            boolean changedInstance = startRestartGroup.changedInstance(userIntent);
            boolean changedInstance2 = startRestartGroup.changedInstance(secondaryCardManagementViewModel);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.m14437$r8$lambda$6OhM0xaCyDVgUCd4ZyhrLl0Mo(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.this, secondaryCardManagementViewModel, (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState) collectAsStateWithLifecycle.getValue(), userIntent, startRestartGroup, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 3);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance3 = startRestartGroup.changedInstance(secondaryCardManagementViewModel);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance3 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementScreen$1$1(secondaryCardManagementViewModel, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf(userIntent));
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState manageSecondaryCardUserState = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState) collectAsStateWithLifecycle.getValue();
            if ((manageSecondaryCardUserState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Initial) || (manageSecondaryCardUserState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Loading)) {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(1506767034);
                getHighSpeedVideoSizes(composer2, 0);
                composer2.endReplaceGroup();
            } else if (manageSecondaryCardUserState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success) {
                startRestartGroup.startReplaceGroup(-534745113);
                getHighSpeedVideoSizes((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success) manageSecondaryCardUserState, appNavigator, userIntent, function1, startRestartGroup, i3 | (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 6), 0);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                if (!(manageSecondaryCardUserState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Error)) {
                    startRestartGroup.startReplaceGroup(1506763513);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(-534423364);
                com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Error) manageSecondaryCardUserState;
                com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType = error.getErrorType();
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                int retryCount = error.getRetryCount();
                boolean changedInstance4 = startRestartGroup.changedInstance(secondaryCardManagementViewModel);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.m14442$r8$lambda$YkSUyM6ynRvaMaAaa2s_SpVRnM(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                boolean changedInstance5 = startRestartGroup.changedInstance(secondaryCardManagementViewModel);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance5 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$psQGwD_mt7r9yXslcXA0WsjhAM4(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                int i4 = com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(retryCount);
                int i5 = (i4 << 9) | 24576;
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.DebitErrorScreen(errorType, function0, (kotlin.jvm.functions.Function0) rememberedValue4, userIntent, fillMaxSize$default, false, valueOf, null, composer2, i5, 160);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$fDxOreMOzDN8LyJMoB1JJs2buPo(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel.this, appNavigator, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState manageSecondaryCardUserState, final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1149235644);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(manageSecondaryCardUserState) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(1149235644, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.TrackSecondaryCardManagementAnalytics (SecondaryCardManagementScreen.kt:197)");
            }
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(manageSecondaryCardUserState.getClass());
            boolean z2 = (i2 & 14) == 4;
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !startRestartGroup.changedInstance(userIntentContext))) {
                z = false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$TrackSecondaryCardManagementAnalytics$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$TrackSecondaryCardManagementAnalytics$1$1(manageSecondaryCardUserState, userIntentContext, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(orCreateKotlinClass, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$mrHSXRPLzjObw_BVUvyn6EmLbMQ(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.this, userIntentContext, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1057645063);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1057645063, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementLoadingState (SecondaryCardManagementScreen.kt:241)");
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
            com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.DEBIT_CARD_MANAGEMENT_LOADER), com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, (com.paypal.pds.components.LoaderSize.Large.$stable << 3) | 6, 12);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$CjlQcQGzbNlarJeliH3fjs8igS0(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x057b, code lost:
    
        if (r0 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x05ef, code lost:
    
        if (r6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x060c, code lost:
    
        if (r5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0265, code lost:
    
        if (r2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0282, code lost:
    
        if (r2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L111;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success success, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent, kotlin.Unit> function12;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent, kotlin.Unit> function14;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.String stringResource;
        androidx.compose.runtime.MutableState mutableState;
        int i5;
        java.lang.Object obj4;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent, kotlin.Unit> function15;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-387210250);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(success) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(userIntentContext) : startRestartGroup.changedInstance(userIntentContext) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                function13 = function12;
            } else {
                if (i6 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj9) {
                                return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$PQDgeD97NjeGKM_5_88epspEjSI((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent) obj9);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                } else {
                    function14 = function12;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-387210250, i4, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementSuccessState (SecondaryCardManagementScreen.kt:259)");
                }
                final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = success.getDebitInstrument();
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue2;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue3;
                java.lang.Object[] objArr = new java.lang.Object[0];
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            androidx.compose.runtime.MutableState mutableStateOf$default;
                            mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                            return mutableStateOf$default;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 48);
                java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection> mapSecondaryCardToUiSections = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt.mapSecondaryCardToUiSections(debitInstrument, (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                final androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue5;
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                final androidx.compose.runtime.MutableState mutableState4 = (androidx.compose.runtime.MutableState) rememberedValue6;
                java.lang.Object[] objArr2 = new java.lang.Object[0];
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            androidx.compose.runtime.MutableState mutableStateOf$default;
                            mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                            return mutableStateOf$default;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                final androidx.compose.runtime.MutableState mutableState5 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr2, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, 48);
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction = success.getPostLoadAction();
                boolean changedInstance = startRestartGroup.changedInstance(success);
                int i7 = i4 & 7168;
                boolean z = i7 == 2048;
                com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementSuccessState$2$1 rememberedValue8 = startRestartGroup.rememberedValue();
                if ((z | changedInstance) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementSuccessState$2$1(success, function14, mutableState3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(postLoadAction, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue8, startRestartGroup, 0);
                boolean isOperationErrorVisible = success.isOperationErrorVisible();
                com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType operationErrorType = success.getOperationErrorType();
                boolean changedInstance2 = startRestartGroup.changedInstance(success);
                kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent, kotlin.Unit> function16 = function14;
                boolean z2 = (i4 & 896) == 256 || ((i4 & 512) != 0 && startRestartGroup.changedInstance(userIntentContext));
                com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementSuccessState$3$1 rememberedValue9 = startRestartGroup.rememberedValue();
                if ((changedInstance2 || z2) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    obj = null;
                    rememberedValue9 = new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementSuccessState$3$1(success, userIntentContext, null);
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                } else {
                    obj = null;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(isOperationErrorVisible), operationErrorType, (kotlin.jvm.functions.Function2) rememberedValue9, startRestartGroup, 0);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj);
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
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName = success.getProductName();
                boolean changed = startRestartGroup.changed(mutableState5);
                java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                if (!changed) {
                    obj2 = rememberedValue10;
                }
                kotlin.jvm.functions.Function1 function17 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj9) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$ToKj9h__DcBz8s3sNKflTBc5ACI(androidx.compose.runtime.MutableState.this, mutableState5, (com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit) obj9);
                    }
                };
                startRestartGroup.updateRememberedValue(function17);
                obj2 = function17;
                kotlin.jvm.functions.Function1 function18 = (kotlin.jvm.functions.Function1) obj2;
                boolean changed2 = startRestartGroup.changed(mutableState2);
                java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                if (!changed2) {
                    obj3 = rememberedValue11;
                }
                kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$us_E5ITnQd5_11hAZfade6QslSc(androidx.compose.runtime.MutableState.this);
                    }
                };
                startRestartGroup.updateRememberedValue(function0);
                obj3 = function0;
                int i8 = (i4 << 15) & 3670016;
                Camera2StreamConfigurationMap(debitInstrument, mapSecondaryCardToUiSections, productName, function18, (kotlin.jvm.functions.Function0) obj3, function16, appNavigator, startRestartGroup, ((i4 << 6) & 458752) | i8);
                androidx.compose.runtime.MutableState mutableState6 = mutableState3;
                java.lang.Integer num = (java.lang.Integer) mutableState6.getValue();
                if (num == null) {
                    startRestartGroup.startReplaceGroup(461130583);
                    startRestartGroup.endReplaceGroup();
                    stringResource = null;
                } else {
                    startRestartGroup.startReplaceGroup(461130584);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(num.intValue(), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.String str = stringResource == null ? "" : stringResource;
                boolean z3 = stringResource != null;
                java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
                if (rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$ksMWEwvUTE6BeijD4U0fS4ZtcTM(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                }
                com.paypal.oslo.feature.debitcard.shared.ui.components.ShowToastKt.ShowToast(str, z3, (kotlin.jvm.functions.Function0) rememberedValue12, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, 0.0f, 13, null), getHighSpeedVideoFpsRangesFor((java.lang.Integer) mutableState6.getValue())), startRestartGroup, 384, 0);
                if (success.isOperationInProgress()) {
                    startRestartGroup.startReplaceGroup(461578193);
                    i5 = 1;
                    androidx.compose.ui.Modifier component = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundOverlayCard.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.SECONDARY_CARD_MANAGEMENT_OPERATION_LOADER), com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getLOCK_UNLOCK_CARD());
                    com.paypal.pds.core.PDSIndication.None none = com.paypal.pds.core.PDSIndication.None.INSTANCE;
                    java.lang.Object rememberedValue13 = startRestartGroup.rememberedValue();
                    if (rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue13 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue13);
                    }
                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue13;
                    com.paypal.pds.core.PDSIndication.None none2 = none;
                    java.lang.Object rememberedValue14 = startRestartGroup.rememberedValue();
                    if (rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue14 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda24
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue14);
                    }
                    mutableState = mutableState4;
                    obj4 = null;
                    androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(component, mutableInteractionSource, none2, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue14, startRestartGroup, 1573296, 28);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m22100clickable_mRqjOc);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                } else {
                    mutableState = mutableState4;
                    i5 = 1;
                    obj4 = null;
                    startRestartGroup.startReplaceGroup(462286450);
                    startRestartGroup.endReplaceGroup();
                }
                com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType operationErrorType2 = success.getOperationErrorType();
                if (success.isOperationErrorVisible() && operationErrorType2 != null) {
                    startRestartGroup.startReplaceGroup(462463894);
                    androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i5, obj4);
                    com.paypal.pds.core.PDSIndication.None none3 = com.paypal.pds.core.PDSIndication.None.INSTANCE;
                    java.lang.Object rememberedValue15 = startRestartGroup.rememberedValue();
                    if (rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue15 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue15);
                    }
                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue15;
                    com.paypal.pds.core.PDSIndication.None none4 = none3;
                    java.lang.Object rememberedValue16 = startRestartGroup.rememberedValue();
                    if (rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue16 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda25
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue16);
                    }
                    androidx.compose.ui.Modifier m22100clickable_mRqjOc2 = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(fillMaxSize$default2, mutableInteractionSource2, none4, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue16, startRestartGroup, 1573302, 28);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m22100clickable_mRqjOc2);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor3);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier fillMaxSize$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i5, obj4);
                    boolean changedInstance3 = startRestartGroup.changedInstance(success);
                    boolean changedInstance4 = startRestartGroup.changedInstance(debitInstrument);
                    int i9 = i7 == 2048 ? i5 : 0;
                    java.lang.Object rememberedValue17 = startRestartGroup.rememberedValue();
                    if (((changedInstance3 ? 1 : 0) | (changedInstance4 ? 1 : 0) | i9) != 0 || rememberedValue17 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        function15 = function16;
                        kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda26
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$N7WIuIybAW43jd1hBaQWEeZxmd8(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success.this, debitInstrument, function15);
                            }
                        };
                        startRestartGroup.updateRememberedValue(function02);
                        obj7 = function02;
                    } else {
                        function15 = function16;
                        obj7 = rememberedValue17;
                    }
                    kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) obj7;
                    int i10 = i7 == 2048 ? i5 : 0;
                    java.lang.Object rememberedValue18 = startRestartGroup.rememberedValue();
                    if (i10 == 0) {
                        obj8 = rememberedValue18;
                    }
                    kotlin.jvm.functions.Function0 function04 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$Q68rZWXh23HBNEc_7AbRoqYVPqI(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(function04);
                    obj8 = function04;
                    com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.DebitErrorScreen(operationErrorType2, function03, (kotlin.jvm.functions.Function0) obj8, userIntentContext, fillMaxSize$default3, false, null, null, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | 24576 | ((i4 << 3) & 7168), 224);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                } else {
                    function15 = function16;
                    startRestartGroup.startReplaceGroup(463751634);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit dailyLimit = (com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit) mutableState.getValue();
                boolean booleanValue = ((java.lang.Boolean) mutableState5.getValue()).booleanValue();
                boolean booleanValue2 = ((java.lang.Boolean) mutableState2.getValue()).booleanValue();
                boolean changed3 = startRestartGroup.changed(mutableState5);
                java.lang.Object rememberedValue19 = startRestartGroup.rememberedValue();
                if (!changed3) {
                    obj5 = rememberedValue19;
                }
                kotlin.jvm.functions.Function0 function05 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$hGESrYWiO8g8vhHW8Pxrnhdt4ig(androidx.compose.runtime.MutableState.this);
                    }
                };
                startRestartGroup.updateRememberedValue(function05);
                obj5 = function05;
                kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) obj5;
                boolean changed4 = startRestartGroup.changed(mutableState2);
                java.lang.Object rememberedValue20 = startRestartGroup.rememberedValue();
                if (!changed4) {
                    obj6 = rememberedValue20;
                }
                kotlin.jvm.functions.Function0 function07 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$RFTbU8f9MlManwuAewLuSLx5Q8Q(androidx.compose.runtime.MutableState.this);
                    }
                };
                startRestartGroup.updateRememberedValue(function07);
                obj6 = function07;
                composer2 = startRestartGroup;
                kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent, kotlin.Unit> function19 = function15;
                getHighResolutionOutputSizeshNQ4ISI(success, dailyLimit, booleanValue, booleanValue2, bottomSheetController, bottomSheetController2, appNavigator, function06, (kotlin.jvm.functions.Function0) obj6, function15, userIntentContext, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 12) | (i4 & 14) | (com.paypal.pds.components.BottomSheetController.$stable << 15) | i8 | ((i4 << 18) & 1879048192), com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable | ((i4 >> 6) & 14));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function13 = function19;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj9, java.lang.Object obj10) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.m14439$r8$lambda$Ig2hDPbRQIcVriXQgq3bhJfCHk(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success.this, appNavigator, userIntentContext, function13, i, i2, (androidx.compose.runtime.Composer) obj9, ((java.lang.Integer) obj10).intValue());
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, final java.util.List<? extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection> list, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent, kotlin.Unit> function12, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer composer3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1148874750);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(debitInstrument) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(debitCardProductName.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 1048576 : 524288;
        }
        if (!startRestartGroup.shouldExecute((i2 & 599187) != 599186, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1148874750, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementContent (SecondaryCardManagementScreen.kt:390)");
            }
            int i3 = i2;
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
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize8(), 0.0f, 2, null);
            int i4 = 458752 & i3;
            boolean z = i4 == 131072;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$LvXDpdfdxcgHhh3NC0BeEbrljSM(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.DebitCardToolBar(m1708paddingVpY3zN4$default, null, true, null, (kotlin.jvm.functions.Function0) rememberedValue, null, null, startRestartGroup, 384, 106);
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, 2, null), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.SECONDARY_CARD_MANAGEMENT_LAZY_COLUMN);
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing20());
            boolean changedInstance = startRestartGroup.changedInstance(debitInstrument);
            boolean changedInstance2 = startRestartGroup.changedInstance(list);
            boolean z2 = (i3 & 896) == 256;
            boolean z3 = (i3 & 7168) == 2048;
            boolean z4 = (57344 & i3) == 16384;
            boolean z5 = i4 == 131072;
            boolean z6 = (i3 & 3670016) == 1048576;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (((changedInstance | changedInstance2 | z2 | z3 | z4 | z5) || z6) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                composer3 = startRestartGroup;
                kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$yL2N9ZnWaWhjPpouw19Qr8uVaaU(list, debitInstrument, debitCardProductName, function1, function0, function12, appNavigator, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                composer3.updateRememberedValue(function13);
                rememberedValue2 = function13;
            } else {
                composer3 = startRestartGroup;
            }
            kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue2;
            composer2 = composer3;
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(testTag, null, null, false, m1602spacedBy0680j_4, null, null, false, null, function14, composer2, 0, 494);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.m14443$r8$lambda$dOKpyUh9OWxGPngUHUcjK2eQg(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument.this, list, debitCardProductName, function1, function0, function12, appNavigator, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success success, final com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit dailyLimit, final boolean z, final boolean z2, final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.pds.components.BottomSheetController bottomSheetController2, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent, kotlin.Unit> function1, final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.Composer composer2;
        int i5;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1962988715);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(success) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(dailyLimit) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= (i & 262144) == 0 ? startRestartGroup.changed(bottomSheetController2) : startRestartGroup.changedInstance(bottomSheetController2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? startRestartGroup.changed(userIntentContext) : startRestartGroup.changedInstance(userIntentContext) ? 4 : 2);
        } else {
            i4 = i2;
        }
        boolean z3 = true;
        if (startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1962988715, i3, i4, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementBottomSheets (SecondaryCardManagementScreen.kt:445)");
            }
            if (z2) {
                startRestartGroup.startReplaceGroup(878502458);
                java.lang.String id = success.getDebitInstrument().getId();
                com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName = success.getProductName();
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_billing_address_title, startRestartGroup, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_save, startRestartGroup, 0);
                boolean z4 = (234881024 & i3) == 67108864;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda38
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$LEgQPYL3WAt9ZUZF30eYMYnQEKg(kotlin.jvm.functions.Function0.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                boolean z5 = (1879048192 & i3) == 536870912;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z5 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda39
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.m14441$r8$lambda$Jha46GnPG81mEtUdaTpHcHGu0g(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                i5 = i3;
                userIntentContext2 = userIntentContext;
                function03 = function0;
                com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt.EditBillingAddressBottomSheet(appNavigator, id, productName, stringResource, stringResource2, bottomSheetController, function04, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, ((i3 >> 18) & 14) | (com.paypal.pds.components.BottomSheetController.$stable << 15) | ((i3 << 3) & 458752), 256);
                bottomSheetController.showSheet();
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                i5 = i3;
                userIntentContext2 = userIntentContext;
                function03 = function0;
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(879135757);
                composer2.endReplaceGroup();
            }
            if (dailyLimit == null) {
                composer2.startReplaceGroup(879191215);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(879191216);
                java.lang.String title = dailyLimit.getTitle();
                java.lang.String description = dailyLimit.getDescription();
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_ok, composer2, 0);
                int i6 = i5;
                int i7 = i6 & 458752;
                boolean z6 = i7 == 131072 || ((i6 & 262144) != 0 && composer2.changedInstance(bottomSheetController2));
                boolean z7 = (29360128 & i6) == 8388608;
                java.lang.Object rememberedValue3 = composer2.rememberedValue();
                if ((z6 | z7) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda40
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$MtKlUdcxLAZwqnWauo5_p5UdQwQ(com.paypal.pds.components.BottomSheetController.this, function03);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue3;
                int i8 = i6 >> 6;
                com.paypal.oslo.feature.debitcard.shared.ui.components.SingleActionModalBottomSheetKt.SingleActionModalBottomSheet(title, description, stringResource3, bottomSheetController2, null, null, function05, composer2, (i8 & 7168) | (com.paypal.pds.components.BottomSheetController.$stable << 9), 48);
                boolean z8 = (i6 & 896) == 256;
                boolean z9 = i7 == 131072 || ((i6 & 262144) != 0 && composer2.changedInstance(bottomSheetController2));
                if ((i4 & 14) != 4 && ((i4 & 8) == 0 || !composer2.changedInstance(userIntentContext2))) {
                    z3 = false;
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementBottomSheets$3$2$1 rememberedValue4 = composer2.rememberedValue();
                if ((z9 | z8 | z3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementBottomSheets$3$2$1(z, bottomSheetController2, userIntentContext2, null);
                    composer2.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer2, i8 & 14);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$6qYl02YAKSzT1g6LvM5PdL9MmTM(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success.this, dailyLimit, z, z2, bottomSheetController, bottomSheetController2, appNavigator, function0, function02, function1, userIntentContext, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection debitCardManagementSection, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final java.lang.String str, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent, kotlin.Unit> function12, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.Toggle copy$default;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(223409525);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(debitCardManagementSection) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(debitCardProductName.ordinal()) ? 32 : 16;
        }
        int i3 = 256;
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 1048576 : 524288;
        }
        if (!startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(223409525, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementSectionContent (SecondaryCardManagementScreen.kt:496)");
            }
            int i4 = 458752;
            if (debitCardManagementSection instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.SecondaryCardArt) {
                startRestartGroup.startReplaceGroup(-1605738122);
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt secondaryCardArt = ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.SecondaryCardArt) debitCardManagementSection).getSecondaryCardArt();
                int i5 = i2 & 458752;
                boolean z = i5 == 131072;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$a4_NC7UAztzOeaspfPIE6LyLawM(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue;
                boolean z2 = i5 == 131072;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$355hrbo6F2OTnScACQCQlc35qOM(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt.ManageSecondaryCardArt(secondaryCardArt, null, function02, (kotlin.jvm.functions.Function0) rememberedValue2, false, startRestartGroup, 0, 18);
                startRestartGroup.endReplaceGroup();
            } else if (debitCardManagementSection instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardOperations) {
                startRestartGroup.startReplaceGroup(-1605345414);
                startRestartGroup.startReplaceGroup(-51783712);
                java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem> operations = ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardOperations) debitCardManagementSection).getOperations();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(operations, 10));
                for (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem cardOperationItem : operations) {
                    com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.Toggle toggle = cardOperationItem.getToggle();
                    if (toggle != null) {
                        startRestartGroup.startReplaceGroup(-1893654589);
                        boolean z3 = (i2 & i4) == 131072;
                        boolean z4 = (i2 & 896) == i3;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if ((z4 | z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$vtzB79qxz54JwrZcu_0dKTL2HdE(kotlin.jvm.functions.Function1.this, str, ((java.lang.Boolean) obj).booleanValue());
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        copy$default = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.Toggle.copy$default(toggle, false, (kotlin.jvm.functions.Function1) rememberedValue3, 1, null);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1426249886);
                        startRestartGroup.endReplaceGroup();
                        copy$default = null;
                    }
                    arrayList.add(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem.copy$default(cardOperationItem, null, null, null, null, copy$default, getSecondaryCardOperationClickHandler(cardOperationItem.getId(), copy$default, function12), 15, null));
                    i3 = 256;
                    i4 = 458752;
                }
                startRestartGroup.endReplaceGroup();
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt.DebitCardOperationsSection(arrayList, appNavigator, debitCardProductName, null, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState.Ineligible.INSTANCE, null, null, startRestartGroup, ((i2 >> 15) & 112) | 24576 | ((i2 << 3) & 896), 104);
                startRestartGroup.endReplaceGroup();
            } else if (debitCardManagementSection instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.DailyLimits) {
                startRestartGroup.startReplaceGroup(-1604143451);
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.DailyLimits dailyLimits = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.DailyLimits) debitCardManagementSection;
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt.DailyLimitWidget(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_daily_limits_title, startRestartGroup, 0), dailyLimits.getDailyLimits(), function1, null, dailyLimits.getTestTags(), startRestartGroup, (i2 >> 3) & 896, 8);
                startRestartGroup.endReplaceGroup();
            } else if (debitCardManagementSection instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.BillingAddress) {
                startRestartGroup.startReplaceGroup(-1603814262);
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.billingaddress.components.DebitCardBillingAddressContentKt.DebitCardBillingAddressContent(((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.BillingAddress) debitCardManagementSection).getAddress(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_billing_address_title, startRestartGroup, 0), function0, null, startRestartGroup, (i2 >> 6) & 896, 8);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-51727335);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$2KqWz7b7ah66suEFKNKXvoLpnik(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.this, debitCardProductName, str, function1, function0, function12, appNavigator, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> getSecondaryCardOperationClickHandler(java.lang.String str, final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.Toggle toggle, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent, kotlin.Unit> function1) {
        final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onCheckedChange;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_lock_card))) {
            if (toggle == null || (onCheckedChange = toggle.getOnCheckedChange()) == null) {
                return null;
            }
            return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.m14445$r8$lambda$u0q4b9934_e87ZxmrMGFyAGY(kotlin.jvm.functions.Function1.this, toggle);
                }
            };
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_change_pin))) {
            return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$rzEhc7BaysAil2BpDAPvdds8e1g(kotlin.jvm.functions.Function1.this);
                }
            };
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_report_lost_stolen))) {
            return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$PIJfWWhp0UeO5hLlJxpm_p4m7ds(kotlin.jvm.functions.Function1.this);
                }
            };
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_report_card))) {
            return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$mkT6zVSH1evtNcdARAyL64FAlZI(kotlin.jvm.functions.Function1.this);
                }
            };
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_cancel_card))) {
            return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$pXmasi2Uh98SkXQTB1WRkaocC1I(kotlin.jvm.functions.Function1.this);
                }
            };
        }
        return null;
    }

    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getHighSpeedVideoFpsRangesFor(java.lang.Integer num) {
        int i = com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_lock_card_success;
        if (num != null && num.intValue() == i) {
            return com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getCARD_LOCKED_SUCCESS_TOAST();
        }
        int i2 = com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_unlock_card_success;
        if (num != null && num.intValue() == i2) {
            return com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getCARD_UNLOCKED_SUCCESS_TOAST();
        }
        int i3 = com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_card_already_locked;
        if (num == null || num.intValue() != i3) {
            return (num == null || num.intValue() != com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_card_already_unlocked) ? com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getUNKNOWN_TOAST() : com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getCARD_ALREADY_UNLOCKED_TOAST();
        }
        return com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getCARD_ALREADY_LOCKED_TOAST();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2KqWz7b7ah66suEFKNKXvoLpnik(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection debitCardManagementSection, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function12, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(debitCardManagementSection, debitCardProductName, str, function1, function0, function12, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$355hrbo6F2OTnScACQCQlc35qOM(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.DidntGetYourCardClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5aJsskaIeuSklIPtIQlaEomOi8Q(java.util.List list, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function12, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i2 & 48) == 0) {
            i3 = i2 | (composer.changed(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 145) != 144, i3 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(596902802, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SecondaryCardManagementScreen.kt:418)");
            }
            getHighSpeedVideoSizes((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection) list.get(i), debitCardProductName, debitInstrument.getId(), function1, function0, function12, appNavigator, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6OhM0xaCy-DVgUCd4ZyhrL-l0Mo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14437$r8$lambda$6OhM0xaCyDVgUCd4ZyhrLl0Mo(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel secondaryCardManagementViewModel, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent manageSecondaryCardUserEvent) {
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item didnt_get_card_button;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageSecondaryCardUserEvent, "");
        if (manageSecondaryCardUserEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.BackClicked) {
            didnt_get_card_button = com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardToolbarAnalytics.INSTANCE.getBACK_BUTTON();
        } else {
            if (!(manageSecondaryCardUserEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.ActivatePinClicked)) {
                if (manageSecondaryCardUserEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.DidntGetYourCardClicked) {
                    didnt_get_card_button = com.paypal.oslo.feature.debitcard.shared.analytics.ManageSecondaryCardAnalytics.INSTANCE.getDIDNT_GET_CARD_BUTTON();
                }
                secondaryCardManagementViewModel.processEvent(manageSecondaryCardUserEvent);
                return kotlin.Unit.INSTANCE;
            }
            didnt_get_card_button = com.paypal.oslo.feature.debitcard.shared.analytics.ManageSecondaryCardAnalytics.INSTANCE.getACTIVATE_BUTTON();
        }
        com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardItemPressed$default(com.paypal.oslo.feature.debitcard.shared.analytics.ManageSecondaryCardAnalytics.SCREEN_ID, didnt_get_card_button, userIntentContext, null, 8, null);
        secondaryCardManagementViewModel.processEvent(manageSecondaryCardUserEvent);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6aFA-iUc9-vM_ougrCsPHRPB6qs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14438$r8$lambda$6aFAiUc9vM_ougrCsPHRPB6qs(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1689006665, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SecondaryCardManagementScreen.kt:411)");
            }
            com.paypal.pds.components.HeaderKt.Header(debitInstrument.getCardHolder().getFullName(), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (java.lang.String) null, (java.lang.String) null, (com.paypal.pds.components.HeaderContentAlignment) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 48, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6qYl02YAKSzT1g6LvM5PdL9MmTM(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success success, com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit dailyLimit, boolean z, boolean z2, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.pds.components.BottomSheetController bottomSheetController2, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(success, dailyLimit, z, z2, bottomSheetController, bottomSheetController2, appNavigator, function0, function02, function1, userIntentContext, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CjlQcQGzbNlarJeliH3fjs8igS0(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ig2hDPbRQ-IcVriXQgq3bhJfCHk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14439$r8$lambda$Ig2hDPbRQIcVriXQgq3bhJfCHk(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success success, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(success, appNavigator, userIntentContext, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Jha46GnPG81mEtUdaTp-HcHGu0g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14441$r8$lambda$Jha46GnPG81mEtUdaTpHcHGu0g(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.BillingAddressSaved.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LEgQPYL3WAt9ZUZF30eYMYnQEKg(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LvXDpdfdxcgHhh3NC0BeEbrljSM(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.BackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MHa8Tf1dPD5eOecZgjA5Zikr0X4(com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit dailyLimit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dailyLimit, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MtKlUdcxLAZwqnWauo5_p5UdQwQ(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        if (bottomSheetController.getVisible()) {
            bottomSheetController.hideSheet();
        }
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$N7WIuIybAW43jd1hBaQWEeZxmd8(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success success, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, kotlin.jvm.functions.Function1 function1) {
        com.paypal.oslo.core.mvi.Event event;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType operationRetryType = success.getOperationRetryType();
        int i = operationRetryType == null ? -1 : com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.WhenMappings.$EnumSwitchMapping$0[operationRetryType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                event = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent) new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.LockCardToggled(debitInstrument.getId());
            } else {
                if (i != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                event = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent) new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.UnlockCardToggled(debitInstrument.getId());
            }
            function1.invoke(event);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PIJfWWhp0UeO5hLlJxpm_p4m7ds(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.ReportLostStolenCardClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PQDgeD97NjeGKM_5_88epspEjSI(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent manageSecondaryCardUserEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageSecondaryCardUserEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q68rZWXh23HBNEc_7AbRoqYVPqI(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.OperationErrorDismissed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RFTbU8f9MlManwuAewLuSLx5Q8Q(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ToKj9h__DcBz8s3sNKflTBc5ACI(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit dailyLimit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dailyLimit, "");
        mutableState.setValue(dailyLimit);
        mutableState2.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YkSUyM6yn-RvaMaAaa2s_SpVRnM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14442$r8$lambda$YkSUyM6ynRvaMaAaa2s_SpVRnM(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel secondaryCardManagementViewModel) {
        secondaryCardManagementViewModel.processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.RetryLoadingInstrument.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$a4_NC7UAztzOeaspfPIE6LyLawM(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.ActivatePinClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dOKpyUh9OWxGPn--gUHUcjK2eQg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14443$r8$lambda$dOKpyUh9OWxGPngUHUcjK2eQg(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, java.util.List list, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function12, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(debitInstrument, list, debitCardProductName, function1, function0, function12, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fDxOreMOzDN8LyJMoB1JJs2buPo(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel secondaryCardManagementViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        SecondaryCardManagementScreen(secondaryCardManagementViewModel, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hGESrYWiO8g8vhHW8Pxrnhdt4ig(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ksMWEwvUTE6BeijD4U0fS4ZtcTM(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mkT6zVSH1evtNcdARAyL64FAlZI(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.ReportCardClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mlCuN52P7J6z4pmJ3QXAOSJeeV8(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent manageSecondaryCardUserEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageSecondaryCardUserEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mrHSXRPLzjObw_BVUvyn6EmLbMQ(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState manageSecondaryCardUserState, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(manageSecondaryCardUserState, userIntentContext, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pXmasi2Uh98SkXQTB1WRkaocC1I(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.CancelCardClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$psQGwD_mt7r9yXslcXA0WsjhAM4(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel secondaryCardManagementViewModel) {
        secondaryCardManagementViewModel.processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.DismissClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qUbndzxdRU87zWscGges_VB4MWA(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination(cardReplacementInfo));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rK_gCs43GPaM3p1cBc0XQvXJE-Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14444$r8$lambda$rK_gCs43GPaM3p1cBc0XQvXJEQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1723981507);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1723981507, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementSuccessScreenPreview (SecondaryCardManagementScreen.kt:606)");
            }
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument("card-123", new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState.ACTIVE, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.LOCKED, null), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.DISPLAY_PRODUCT_NAME, false, false, new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails("12", "2028", java.lang.Boolean.FALSE), "1234", new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.DISPLAY_PRODUCT_NAME, "PayPal Debit Mastercard", "PayPal Business Debit Mastercard", "Debit Card", com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand.UNKNOWN, new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls(new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl("", ""), new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl("", "")), new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls(new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl("", ""), new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl("", "")), kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), 3), new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails(null, null, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus.ARRIVED), new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardHolder("John", "Doe", new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBillingAddress(null, null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"123 Main St", "San Jose, CA 95131"}))), com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus.SET, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinOrigin.UNKNOWN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation[]{com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.LOCK, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.CHANGE_PIN}), new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLimits(new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount("3000.00", com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD, (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount("400.00", com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD, (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), null));
            java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection> mapSecondaryCardToUiSections = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt.mapSecondaryCardToUiSections(debitInstrument, (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.BUSINESS_DEBIT_CARD;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$MHa8Tf1dPD5eOecZgjA5Zikr0X4((com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda29
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
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$mlCuN52P7J6z4pmJ3QXAOSJeeV8((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Camera2StreamConfigurationMap(debitInstrument, mapSecondaryCardToUiSections, debitCardProductName, function1, function0, (kotlin.jvm.functions.Function1) rememberedValue3, new com.paypal.oslo.core.navigation.AppNavigator(null, null, 3, null), startRestartGroup, 224640);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.m14444$r8$lambda$rK_gCs43GPaM3p1cBc0XQvXJEQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rzEhc7BaysAil2BpDAPvdds8e1g(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.ChangePinClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$u0q4-b993-4_e87-ZxmrMGFyAGY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14445$r8$lambda$u0q4b9934_e87ZxmrMGFyAGY(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.Toggle toggle) {
        function1.invoke(java.lang.Boolean.valueOf(!toggle.isChecked()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$us_E5ITnQd5_11hAZfade6QslSc(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vtzB79qxz54JwrZcu_0dKTL2HdE(kotlin.jvm.functions.Function1 function1, java.lang.String str, boolean z) {
        if (z) {
            function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.LockCardToggled(str));
        } else {
            function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.UnlockCardToggled(str));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yL2N9ZnWaWhjPpouw19Qr8uVaaU(final java.util.List list, final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function1 function12, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1689006665, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.m14438$r8$lambda$6aFAiUc9vM_ougrCsPHRPB6qs(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument.this, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 3, null);
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, list.size(), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(596902802, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$5aJsskaIeuSklIPtIQlaEomOi8Q(list, debitCardProductName, debitInstrument, function1, function0, function12, appNavigator, (androidx.compose.foundation.lazy.LazyItemScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
            }
        }), 6, null);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType.LOCK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType.UNLOCK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
