package com.paypal.oslo.feature.balance.ui.autoReload.amount;

@kotlin.Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ai\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0007¢\u0006\u0002\u0010\u0011\u001aQ\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a\u0017\u0010\u001e\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\u001f\u001a;\u0010 \u001a\u00020!*\u00020!2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u001a2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u001cH\u0003¢\u0006\u0002\u0010#\u001aK\u0010$\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&2\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u001aH\u0007¢\u0006\u0002\u0010'\u001a\u0015\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010+\u001a\r\u0010,\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010-¨\u0006.²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020&X\u008a\u008e\u0002"}, d2 = {"AmountScreen", "", "viewModel", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountViewModel;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "intent", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;", "currencyCode", "", "minimumAmount", "maximumAmount", "options", "", "formattedMinimum", "formattedMaximum", "formattedOptions", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "AmountScreenContent", "uiState", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountUiState;", "onCardClick", "Lkotlin/Function2;", "Lcom/paypal/pds/components/SelectionCardModel;", "", "onNumberInput", "Lkotlin/Function1;", "onSaveClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountUiState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AmountHeader", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;Landroidx/compose/runtime/Composer;I)V", "amountDisplayModifier", "Landroidx/compose/ui/Modifier;", "onCustomAmountClick", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "AmountInput", "shouldShowNumericInput", "", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountUiState;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ValidationLabel", "validation", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType;", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType;Landroidx/compose/runtime/Composer;I)V", "AmountScreenStaticPreview", "(Landroidx/compose/runtime/Composer;I)V", "balance_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AmountScreenKt {
    public static final void AmountScreen(final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel amountViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent autoReloadAmountIntent, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.util.List<java.lang.String> list, final java.lang.String str4, final java.lang.String str5, final java.util.List<java.lang.String> list2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.Unit unit;
        boolean z;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadAmountIntent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(414492038);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(amountViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(autoReloadAmountIntent) : startRestartGroup.changedInstance(autoReloadAmountIntent) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(str3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(str4) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(str5) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(list2) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(414492038, i3, -1, "com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreen (AmountScreen.kt:73)");
            }
            androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(amountViewModel.getUiState(), null, startRestartGroup, 0, 1);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(amountViewModel);
            boolean z3 = (i3 & 896) == 256 || ((i3 & 512) != 0 && startRestartGroup.changedInstance(autoReloadAmountIntent));
            boolean z4 = (i3 & 7168) == 2048;
            boolean z5 = (57344 & i3) == 16384;
            boolean z6 = (458752 & i3) == 131072;
            boolean changedInstance2 = startRestartGroup.changedInstance(list);
            boolean z7 = (i3 & 29360128) == 8388608;
            boolean z8 = (234881024 & i3) == 67108864;
            boolean changedInstance3 = startRestartGroup.changedInstance(list2);
            com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$AmountScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (((z5 | z3 | changedInstance | z4 | z6 | changedInstance2 | z7 | z8) || changedInstance3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                unit = unit2;
                z = false;
                z2 = true;
                rememberedValue = new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$AmountScreen$1$1(amountViewModel, autoReloadAmountIntent, str, str2, str3, list, str4, str5, list2, null);
                composer2 = startRestartGroup;
                composer2.updateRememberedValue(rememberedValue);
            } else {
                composer2 = startRestartGroup;
                unit = unit2;
                z = false;
                z2 = true;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, 6);
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            boolean changedInstance4 = composer2.changedInstance(amountViewModel);
            boolean z9 = (i3 & 112) == 32 ? z2 : z;
            com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$AmountScreen$2$1 rememberedValue2 = composer2.rememberedValue();
            if ((changedInstance4 | z9) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$AmountScreen$2$1(amountViewModel, appNavigator, null);
                composer2.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, 6);
            if (((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState) collectAsState.getValue()).getIntent() == null) {
                composer2.startReplaceGroup(102963868);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(102601571);
                com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState amountUiState = (com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState) collectAsState.getValue();
                boolean changedInstance5 = composer2.changedInstance(amountViewModel);
                java.lang.Object rememberedValue3 = composer2.rememberedValue();
                if (changedInstance5 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt.$r8$lambda$7L6JldDNLaHDOd9r0dDsjqMBWBk(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel.this, (com.paypal.pds.components.SelectionCardModel) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue3;
                boolean changedInstance6 = composer2.changedInstance(amountViewModel);
                java.lang.Object rememberedValue4 = composer2.rememberedValue();
                if (changedInstance6 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt.m12042$r8$lambda$Wk2SSjwEwaoEcUON8Jx4zqL4k4(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel.this, (java.lang.String) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
                boolean changedInstance7 = composer2.changedInstance(amountViewModel);
                java.lang.Object rememberedValue5 = composer2.rememberedValue();
                if (changedInstance7 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt.m12044$r8$lambda$e38d4ttPnRKSmYyUFdSEY4P_FY(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue5);
                }
                AmountScreenContent(amountUiState, function2, function1, (kotlin.jvm.functions.Function0) rememberedValue5, composer2, 0);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt.$r8$lambda$0bKQuXdmSBONQ2kQYHrRJDHyt7c(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel.this, appNavigator, autoReloadAmountIntent, str, str2, str3, list, str4, str5, list2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void AmountScreenContent(final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState amountUiState, final kotlin.jvm.functions.Function2<? super com.paypal.pds.components.SelectionCardModel, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier modifier;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-975745892);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(amountUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-975745892, i3, -1, "com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenContent (AmountScreen.kt:117)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), com.paypal.pds.core.ConstantsKt.getSize8(), 2, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Amount.SCREEN);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            AmountHeader(amountUiState.getIntent(), startRestartGroup, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 7, null), startRestartGroup, 0);
            java.lang.String amount = amountUiState.getAmount();
            java.lang.String currencyCode = amountUiState.getCurrencyCode();
            androidx.compose.ui.Alignment.Horizontal start = androidx.compose.ui.Alignment.INSTANCE.getStart();
            com.paypal.pds.core.Typography.DisplaySmall displaySmall = com.paypal.pds.core.Typography.DisplaySmall.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt.$r8$lambda$gtHSmir5BydVE32S4shiU8VKA_s(androidx.compose.runtime.MutableState.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            int i4 = i3 << 3;
            int i5 = (i3 & 896) | (i4 & 112) | 3078;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2052101644, i5, -1, "com.paypal.oslo.feature.balance.ui.autoReload.amount.amountDisplayModifier (AmountScreen.kt:191)");
            }
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(companion, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Amount.INPUT_FIELD);
            if (amountUiState.getMayInputCustomAmount()) {
                startRestartGroup.startReplaceGroup(-404112639);
                boolean changedInstance = startRestartGroup.changedInstance(amountUiState);
                boolean z = (((i5 & 896) ^ 384) > 256 && startRestartGroup.changed(function1)) || (i5 & 384) == 256;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((z | changedInstance) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt.$r8$lambda$s0nsn1kGAfyUxLDCfHtSyvchYiI(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState.this, function1, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(testTag2, false, (kotlin.jvm.functions.Function1) rememberedValue3, 1, null), null, null, false, null, null, function02, startRestartGroup, 1572864, 31);
                startRestartGroup.endReplaceGroup();
                modifier = m22100clickable_mRqjOc;
            } else {
                startRestartGroup.startReplaceGroup(-403101822);
                startRestartGroup.endReplaceGroup();
                modifier = testTag2;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            com.paypal.oslo.core.commonui.components.PayPalAmountDisplayKt.PayPalAmountDisplay(amount, currencyCode, modifier, null, false, start, displaySmall, null, null, null, null, null, startRestartGroup, 1794048, 0, 3976);
            ValidationLabel(amountUiState.getAmountValidation(), startRestartGroup, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 7, null), startRestartGroup, 0);
            AmountInput(amountUiState, ((java.lang.Boolean) mutableState.getValue()).booleanValue(), function2, function1, startRestartGroup, (i3 & 14) | (i4 & 896) | (i4 & 7168));
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize32(), 7, null), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_amount_save_button, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Amount.CONTINUE_BUTTON), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer2, ((i3 >> 9) & 14) | 1769856, 408);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt.$r8$lambda$Vh_SN8lSqUuxVrZTD8EpLhbrxGQ(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState.this, function2, function1, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AmountHeader(final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent autoReloadAmountIntent, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.lang.String str;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(30718358);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(autoReloadAmountIntent) : startRestartGroup.changedInstance(autoReloadAmountIntent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(30718358, i2, -1, "com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountHeader (AmountScreen.kt:161)");
            }
            if (autoReloadAmountIntent instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge) {
                startRestartGroup.startReplaceGroup(-544424105);
                str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_reload_label, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (autoReloadAmountIntent instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceThreshold) {
                startRestartGroup.startReplaceGroup(-544419750);
                str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_threshold_label, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (autoReloadAmountIntent instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.ScheduledRecharge) {
                startRestartGroup.startReplaceGroup(-544415371);
                str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_scheduled_amount_label, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (autoReloadAmountIntent != null) {
                    startRestartGroup.startReplaceGroup(-544426412);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(303071144);
                startRestartGroup.endReplaceGroup();
                str = "";
            }
            com.paypal.pds.components.HeaderKt.Header(str, (androidx.compose.ui.Modifier) null, (java.lang.String) null, (java.lang.String) null, (com.paypal.pds.components.HeaderContentAlignment) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 0, 126);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt.m12045$r8$lambda$fxcoMTeEuxTG3ggoyoYiaMOjyY(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AmountInput(final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState amountUiState, final boolean z, final kotlin.jvm.functions.Function2<? super com.paypal.pds.components.SelectionCardModel, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2117522895);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(amountUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2117522895, i2, -1, "com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountInput (AmountScreen.kt:229)");
            }
            if (z) {
                startRestartGroup.startReplaceGroup(-1354857299);
                com.paypal.oslo.core.commonui.components.NumericKeyboardKt.AmountKeyboard(amountUiState.getAmount(), function1, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Amount.KEYBOARD), 0, false, false, startRestartGroup, ((i2 >> 6) & 112) | 384, 56);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startReplaceGroup(-1354637168);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Amount.SELECTION_CARD);
                composer2 = startRestartGroup;
                com.paypal.pds.components.SelectionCardKt.SelectionCard(new com.paypal.pds.components.SelectionCardConfig.Grid(true, 0, 2, null), amountUiState.getOptionsUi(), function2, testTag, null, false, null, startRestartGroup, com.paypal.pds.components.SelectionCardConfig.Grid.$stable | 3072 | (i2 & 896), 112);
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
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt.m12041$r8$lambda$KFPKjy0J6YZL9ivJg3vMMg0LZQ(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState.this, z, function2, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ValidationLabel(final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType amountValidationType, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        com.paypal.pds.components.ContextualAlertStyle.Negative negative;
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountValidationType, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-896757663);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(amountValidationType) : startRestartGroup.changedInstance(amountValidationType) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-896757663, i2, -1, "com.paypal.oslo.feature.balance.ui.autoReload.amount.ValidationLabel (AmountScreen.kt:247)");
            }
            if (amountValidationType instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanThreshold) {
                startRestartGroup.startReplaceGroup(1504317481);
                str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_amount_validation_below_threshold, new java.lang.Object[]{((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanThreshold) amountValidationType).getFormattedAmount()}, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (amountValidationType instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanMinimum) {
                startRestartGroup.startReplaceGroup(1504323559);
                str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_amount_validation_below_minimum, new java.lang.Object[]{((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanMinimum) amountValidationType).getFormattedAmount()}, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (amountValidationType instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.HigherThanMaximum) {
                startRestartGroup.startReplaceGroup(1504329607);
                str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_amount_validation_above_maximum, new java.lang.Object[]{((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.HigherThanMaximum) amountValidationType).getFormattedAmount()}, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (amountValidationType instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.ValidWithWarning) {
                startRestartGroup.startReplaceGroup(1504335620);
                str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_amount_threshold_description, new java.lang.Object[]{((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.ValidWithWarning) amountValidationType).getFormattedAmount()}, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-610092227);
                startRestartGroup.endReplaceGroup();
            }
            java.lang.String str2 = str;
            if (amountValidationType instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.Valid) {
                startRestartGroup.startReplaceGroup(-609535775);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-610016275);
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Amount.ERROR_MESSAGE);
                if (amountValidationType instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.ValidWithWarning) {
                    negative = com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE;
                } else {
                    negative = com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE;
                }
                com.paypal.pds.components.ContextualAlertKt.ContextualAlert(str2, testTag, negative, startRestartGroup, com.paypal.pds.components.ContextualAlertStyle.$stable << 6, 0);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt.$r8$lambda$vZH8yH15Qd21O5FFo3D9tnW5eA8(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AmountScreenStaticPreview(androidx.compose.runtime.Composer composer, final int i) {
        com.paypal.pds.components.SelectionCardModel create;
        com.paypal.pds.components.SelectionCardModel create2;
        com.paypal.pds.components.SelectionCardModel create3;
        com.paypal.pds.components.SelectionCardModel create4;
        com.paypal.pds.components.SelectionCardModel create5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1859727783);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1859727783, i, -1, "com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenStaticPreview (AmountScreen.kt:291)");
            }
            com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge lowBalanceRecharge = new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge("50", "100");
            java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
            create = com.paypal.pds.components.SelectionCardModel.INSTANCE.create("25", (r18 & 2) != 0 ? null : "$25", (r18 & 4) != 0 ? null : null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) ((r18 & 8) != 0 ? null : null), (r18 & 16) != 0 ? false : false, (r18 & 32) == 0 ? null : null, (r18 & 64) != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : null, (r18 & 128) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : null, (r18 & 256) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : null);
            create2 = com.paypal.pds.components.SelectionCardModel.INSTANCE.create("50", (r18 & 2) != 0 ? null : "$50", (r18 & 4) != 0 ? null : null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) ((r18 & 8) != 0 ? null : null), (r18 & 16) != 0 ? false : true, (r18 & 32) == 0 ? null : null, (r18 & 64) != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : null, (r18 & 128) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : null, (r18 & 256) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : null);
            create3 = com.paypal.pds.components.SelectionCardModel.INSTANCE.create("150", (r18 & 2) != 0 ? null : "$150", (r18 & 4) != 0 ? null : null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) ((r18 & 8) != 0 ? null : null), (r18 & 16) != 0 ? false : false, (r18 & 32) == 0 ? null : null, (r18 & 64) != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : null, (r18 & 128) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : null, (r18 & 256) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : null);
            create4 = com.paypal.pds.components.SelectionCardModel.INSTANCE.create("200", (r18 & 2) != 0 ? null : "$200", (r18 & 4) != 0 ? null : null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) ((r18 & 8) != 0 ? null : null), (r18 & 16) != 0 ? false : false, (r18 & 32) == 0 ? null : null, (r18 & 64) != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : null, (r18 & 128) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : null, (r18 & 256) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : null);
            create5 = com.paypal.pds.components.SelectionCardModel.INSTANCE.create("250", (r18 & 2) != 0 ? null : "$250", (r18 & 4) != 0 ? null : null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) ((r18 & 8) != 0 ? null : null), (r18 & 16) != 0 ? false : false, (r18 & 32) == 0 ? null : null, (r18 & 64) != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : null, (r18 & 128) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : null, (r18 & 256) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : null);
            com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState amountUiState = new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState(lowBalanceRecharge, "USD", "100", "$100", "10000", "$10000", emptyList, false, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.pds.components.SelectionCardModel[]{create, create2, create3, create4, create5}), "50", null, new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanThreshold("$100"), 1152, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt.$r8$lambda$fLAGUIdriXCN1WgB163xh59NFcM((com.paypal.pds.components.SelectionCardModel) obj, ((java.lang.Integer) obj2).intValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt.$r8$lambda$padyiUDgxqEOLA1Nw0H_6SYUgiU((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            AmountScreenContent(amountUiState, function2, function1, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 3504);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt.m12040$r8$lambda$BJjuvt68lm52lIiakwModoudY(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0bKQuXdmSBONQ2kQYHrRJDHyt7c(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel amountViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent autoReloadAmountIntent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.lang.String str4, java.lang.String str5, java.util.List list2, int i, androidx.compose.runtime.Composer composer, int i2) {
        AmountScreen(amountViewModel, appNavigator, autoReloadAmountIntent, str, str2, str3, list, str4, str5, list2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7L6JldDNLaHDOd9r0dDsjqMBWBk(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel amountViewModel, com.paypal.pds.components.SelectionCardModel selectionCardModel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionCardModel, "");
        amountViewModel.handleEvent(new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnAmountSelected(selectionCardModel.getId()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BJjuvt68lm-52lIiakwM-odoudY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12040$r8$lambda$BJjuvt68lm52lIiakwModoudY(int i, androidx.compose.runtime.Composer composer, int i2) {
        AmountScreenStaticPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KFPKjy0J6YZL9ivJg3vMMg-0LZQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12041$r8$lambda$KFPKjy0J6YZL9ivJg3vMMg0LZQ(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState amountUiState, boolean z, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        AmountInput(amountUiState, z, function2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Vh_SN8lSqUuxVrZTD8EpLhbrxGQ(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState amountUiState, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        AmountScreenContent(amountUiState, function2, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$WFxpcA82nE72dXZWeCg8xnaXs_U(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.text.AnnotatedString annotatedString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotatedString, "");
        function1.invoke(annotatedString.getText());
        return true;
    }

    /* renamed from: $r8$lambda$Wk2SSjwEwaoEcUON8Jx4zqL-4k4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12042$r8$lambda$Wk2SSjwEwaoEcUON8Jx4zqL4k4(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel amountViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        amountViewModel.handleEvent(new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnNumberInput(str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZFO9PAhaut7zRSQVBHY9-aSmH7Q, reason: not valid java name */
    public static /* synthetic */ boolean m12043$r8$lambda$ZFO9PAhaut7zRSQVBHY9aSmH7Q(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState amountUiState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.text.AnnotatedString annotatedString) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotatedString, "");
        java.lang.String amount = amountUiState.getAmount();
        if (amount.length() == 0) {
            obj = annotatedString.getText();
        } else {
            java.lang.String text = annotatedString.getText();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(amount);
            sb.append(text);
            obj = sb.toString();
        }
        function1.invoke(obj);
        return true;
    }

    /* renamed from: $r8$lambda$e38d4ttPnRKSmYyUFdSEY4P_F-Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12044$r8$lambda$e38d4ttPnRKSmYyUFdSEY4P_FY(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel amountViewModel) {
        amountViewModel.handleEvent(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnSaveButtonClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fLAGUIdriXCN1WgB163xh59NFcM(com.paypal.pds.components.SelectionCardModel selectionCardModel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionCardModel, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fxcoMTeEuxTG3ggoyoY-iaMOjyY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12045$r8$lambda$fxcoMTeEuxTG3ggoyoYiaMOjyY(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent autoReloadAmountIntent, int i, androidx.compose.runtime.Composer composer, int i2) {
        AmountHeader(autoReloadAmountIntent, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gtHSmir5BydVE32S4shiU8VKA_s(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$padyiUDgxqEOLA1Nw0H_6SYUgiU(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s0nsn1kGAfyUxLDCfHtSyvchYiI(final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState amountUiState, final kotlin.jvm.functions.Function1 function1, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, new androidx.compose.ui.text.AnnotatedString(amountUiState.getAmount(), null, 2, null));
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7816setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, androidx.compose.ui.text.TextRangeKt.TextRange(amountUiState.getAmount().length()));
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt.$r8$lambda$WFxpcA82nE72dXZWeCg8xnaXs_U(kotlin.jvm.functions.Function1.this, (androidx.compose.ui.text.AnnotatedString) obj));
            }
        }, 1, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt.m12043$r8$lambda$ZFO9PAhaut7zRSQVBHY9aSmH7Q(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState.this, function1, (androidx.compose.ui.text.AnnotatedString) obj));
            }
        }, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vZH8yH15Qd21O5FFo3D9tnW5eA8(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType amountValidationType, int i, androidx.compose.runtime.Composer composer, int i2) {
        ValidationLabel(amountValidationType, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
