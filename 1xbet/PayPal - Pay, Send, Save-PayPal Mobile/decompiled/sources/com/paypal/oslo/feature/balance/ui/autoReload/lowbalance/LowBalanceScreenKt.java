package com.paypal.oslo.feature.balance.ui.autoReload.lowbalance;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a}\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0002\u0010\u0015\u001a;\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0002\u0010\u001c\u001a\u001b\u0010\u001d\u001a\u00020\u00012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010!\u001a\r\u0010\"\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010!¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002"}, d2 = {"LowBalanceReloadScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceViewModel;", "xSellInfo", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/XSellInfo;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceViewModel;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/XSellInfo;Landroidx/compose/runtime/Composer;II)V", "LowBalanceReloadScreenSuccess", "thresholdFormattedAmount", "", "rechargeFormattedAmount", "isConsumerAccountType", "", "shouldShowTurnOffOption", "onClickReloadAmount", "Lkotlin/Function0;", "onClickThresholdAmount", "onClickNext", "onClickTurnOff", "(Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceViewModel;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/XSellInfo;Landroidx/compose/runtime/Composer;II)V", "AmountCard", "headerText", "formattedAmount", "labelTestTag", "buttonTestTag", "onClickEdit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LowBalanceScreenError", "onAction", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LowBalanceReloadScreenSuccessPreview", "(Landroidx/compose/runtime/Composer;I)V", "LowBalanceReloadScreenSuccessMerchantPreview", "balance_prodRelease", "uiState", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceStateStore;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LowBalanceScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LowBalanceReloadScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel, com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo xSellInfo, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo xSellInfo2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        int i6;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lowBalanceViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2108964104);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(lowBalanceViewModel) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            xSellInfo2 = xSellInfo;
            i3 |= startRestartGroup.changed(xSellInfo2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo xSellInfo3 = i7 != 0 ? null : xSellInfo2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2108964104, i4, -1, "com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceReloadScreen (LowBalanceScreen.kt:79)");
                }
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(lowBalanceViewModel.getState(), null, startRestartGroup, 0, 1);
                java.lang.String rechargeAmountRequestId = lowBalanceViewModel.getRechargeAmountRequestId();
                java.lang.String thresholdAmountRequestId = lowBalanceViewModel.getThresholdAmountRequestId();
                boolean changedInstance = startRestartGroup.changedInstance(lowBalanceViewModel);
                int i8 = i4 & 896;
                boolean z = i8 == 256;
                com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$1$1(lowBalanceViewModel, xSellInfo3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect("Initialize", (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                boolean changedInstance2 = startRestartGroup.changedInstance(lowBalanceViewModel);
                boolean z2 = (i4 & 14) == 4;
                boolean changed = startRestartGroup.changed(thresholdAmountRequestId);
                boolean changed2 = startRestartGroup.changed(rechargeAmountRequestId);
                com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (((changedInstance2 | z2 | changed) || changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    i5 = 6;
                    i6 = i8;
                    str = thresholdAmountRequestId;
                    str2 = rechargeAmountRequestId;
                    rememberedValue2 = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1(lowBalanceViewModel, appNavigator, thresholdAmountRequestId, rechargeAmountRequestId, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                } else {
                    i6 = i8;
                    str = thresholdAmountRequestId;
                    str2 = rechargeAmountRequestId;
                    i5 = 6;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect("Collection", (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i5);
                boolean changedInstance3 = startRestartGroup.changedInstance(lowBalanceViewModel);
                com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$3$1(lowBalanceViewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue3;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m12079invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m12079invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str3) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str3);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                xSellInfo2 = xSellInfo3;
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
                boolean changedInstance4 = startRestartGroup.changedInstance(lowBalanceViewModel);
                com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$4$1 rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$4$1(lowBalanceViewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue5;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$$inlined$NavResultEffectrtGRyWw$2 rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$$inlined$NavResultEffect-rtGRyWw$2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m12080invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m12080invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str3) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str3);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue6, startRestartGroup, 3072);
                com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState state = ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore) collectAsState.getValue()).getState();
                if (state instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Initial) {
                    startRestartGroup.startReplaceGroup(-509940020);
                    startRestartGroup.endReplaceGroup();
                } else if (state instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Loading) {
                    startRestartGroup.startReplaceGroup(-509938622);
                    com.paypal.oslo.feature.balance.common.ui.BalanceLoadingFullscreenKt.BalanceLoadingFullscreen(null, startRestartGroup, 0, 1);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (state instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Ready) {
                        startRestartGroup.startReplaceGroup(1371860347);
                        java.lang.String formattedAmount = ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore) collectAsState.getValue()).getThresholdAmount().getFormattedAmount();
                        java.lang.String formattedAmount2 = ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore) collectAsState.getValue()).getRechargeAmount().getFormattedAmount();
                        boolean isConsumerAccountType = lowBalanceViewModel.getIsConsumerAccountType();
                        boolean isAutoReloadEnabled = ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore) collectAsState.getValue()).isAutoReloadEnabled();
                        boolean changedInstance5 = startRestartGroup.changedInstance(lowBalanceViewModel);
                        java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                        if (changedInstance5 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt.m12077$r8$lambda$E6dOK8gY9euD4EgRdpgu2pZOZA(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue7);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue7;
                        boolean changedInstance6 = startRestartGroup.changedInstance(lowBalanceViewModel);
                        java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                        if (changedInstance6 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda17
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt.$r8$lambda$_4b2QNm2SH6kVNDYJK77JpSHxLY(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue8);
                        }
                        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue8;
                        boolean changedInstance7 = startRestartGroup.changedInstance(lowBalanceViewModel);
                        java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                        if (changedInstance7 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda18
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt.$r8$lambda$3yb02QnKRNuAOja4_hC0iSl7aB8(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue9);
                        }
                        kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue9;
                        boolean changedInstance8 = startRestartGroup.changedInstance(lowBalanceViewModel);
                        java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                        if (changedInstance8 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda19
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt.$r8$lambda$Ot9cG6EwzoUSS0KK7EqAaZyx11Q(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue10);
                        }
                        composer2 = startRestartGroup;
                        LowBalanceReloadScreenSuccess(formattedAmount, formattedAmount2, isConsumerAccountType, isAutoReloadEnabled, function0, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue10, lowBalanceViewModel, xSellInfo2, composer2, (i4 << 21) & 2113929216, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2 = startRestartGroup;
                        if (!(state instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Error)) {
                            composer2.startReplaceGroup(-509940792);
                            composer2.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-509907690);
                        boolean changedInstance9 = composer2.changedInstance(lowBalanceViewModel);
                        boolean z3 = i6 == 256;
                        java.lang.Object rememberedValue11 = composer2.rememberedValue();
                        if ((changedInstance9 | z3) || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda20
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt.$r8$lambda$MXNpJHvZ43DyyE_HBwXeHVqKiHU(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel.this, xSellInfo2);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue11);
                        }
                        LowBalanceScreenError((kotlin.jvm.functions.Function0) rememberedValue11, composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                composer2 = startRestartGroup;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo xSellInfo4 = xSellInfo2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt.$r8$lambda$rRq8ba12sPAOAg0fbkVYxB2BHvc(com.paypal.oslo.core.navigation.AppNavigator.this, lowBalanceViewModel, xSellInfo4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        xSellInfo2 = xSellInfo;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LowBalanceReloadScreenSuccess(final java.lang.String str, final java.lang.String str2, final boolean z, final boolean z2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel, com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo xSellInfo, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel2;
        final com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo xSellInfo2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        int i5;
        java.lang.String stringResource;
        java.lang.String stringResource2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1399909833);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function04) ? 8388608 : 4194304;
        }
        int i6 = i2 & 256;
        if (i6 != 0) {
            i3 |= 100663296;
        } else if ((100663296 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(lowBalanceViewModel) ? 67108864 : 33554432;
            i4 = i2 & 512;
            if (i4 == 0) {
                i3 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i3 |= startRestartGroup.changed(xSellInfo) ? 536870912 : 268435456;
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                lowBalanceViewModel2 = lowBalanceViewModel;
                xSellInfo2 = xSellInfo;
            } else {
                com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel3 = i6 != 0 ? null : lowBalanceViewModel;
                com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo xSellInfo3 = i4 != 0 ? null : xSellInfo;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1399909833, i3, -1, "com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceReloadScreenSuccess (LowBalanceScreen.kt:190)");
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
                com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.FLOW_SETUP_LOW_BALANCE, null);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6)), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.LowBalance.SCREEN);
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
                androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8(), 2, null), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getAMOUNT_SELECTION_ZONE()), kotlin.collections.CollectionsKt.listOf(businessFlowContext));
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, context);
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
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                if (xSellInfo3 == null) {
                    startRestartGroup.startReplaceGroup(1048194260);
                    startRestartGroup.endReplaceGroup();
                    obj = null;
                } else {
                    startRestartGroup.startReplaceGroup(1048194261);
                    java.lang.String xSellFormattedAmount = lowBalanceViewModel3 != null ? lowBalanceViewModel3.getXSellFormattedAmount() : null;
                    java.lang.Integer valueOf = kotlin.text.StringsKt.equals(xSellInfo3.getTransferSpeed(), "INSTANT", true) ? java.lang.Integer.valueOf(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_xsell_banner_instant) : kotlin.text.StringsKt.equals(xSellInfo3.getTransferSpeed(), "STANDARD", true) ? java.lang.Integer.valueOf(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_xsell_banner_standard) : null;
                    if (xSellFormattedAmount == null || valueOf == null) {
                        obj = null;
                        startRestartGroup.startReplaceGroup(1960035178);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1959708438);
                        obj = null;
                        com.paypal.pds.components.BannerKt.Banner(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.components.BannerStyle.Positive.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(valueOf.intValue(), new java.lang.Object[]{xSellFormattedAmount}, startRestartGroup, 0), (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 54, 120);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
                if (z) {
                    startRestartGroup.startReplaceGroup(1049162453);
                    i5 = 0;
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_title, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    i5 = 0;
                    startRestartGroup.startReplaceGroup(1049265900);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_title_merchant, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.String str3 = stringResource;
                if (z) {
                    startRestartGroup.startReplaceGroup(1049430479);
                    stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_description, startRestartGroup, i5);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1049540467);
                    stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_low_balance_screen_description_merchant, startRestartGroup, i5);
                    startRestartGroup.endReplaceGroup();
                }
                com.paypal.pds.components.HeaderKt.Header(str3, (androidx.compose.ui.Modifier) null, stringResource2, (java.lang.String) null, (com.paypal.pds.components.HeaderContentAlignment) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 7, null), startRestartGroup, 0);
                int i7 = i3;
                AmountCard(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_threshold_label, startRestartGroup, 0), str, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.LowBalance.THRESHOLD_INPUT_FIELD, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.LowBalance.THRESHOLD_EDIT_BUTTON, function02, startRestartGroup, ((i3 << 3) & 112) | 3456 | ((i3 >> 3) & 57344));
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), startRestartGroup, 0);
                AmountCard(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_reload_label, startRestartGroup, 0), str2, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.LowBalance.RELOAD_INPUT_FIELD, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.LowBalance.RELOAD_EDIT_BUTTON, function0, startRestartGroup, (i7 & 112) | 3456 | (i7 & 57344));
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                com.paypal.pds.components.ButtonKt.Button(function03, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_next_button, startRestartGroup, 0), com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.LowBalance.CONTINUE_BUTTON), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getREVIEW_BUTTON()), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.ACTION_REVIEW)), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, ((i7 >> 18) & 14) | 1769472, 408);
                if (z2) {
                    startRestartGroup.startReplaceGroup(1051309265);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 7, null), startRestartGroup, 0);
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.LowBalance.SKIP_BUTTON);
                    java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_turn_off_button, startRestartGroup, 0);
                    boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreenSuccess$1$1$2$1(bottomSheetController);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue2), stringResource3, testTag2, null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, 1769856, 408);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1051837815);
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), startRestartGroup, 0);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_turn_off_title, startRestartGroup, 0);
                boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt.$r8$lambda$rKZYnc_mf8A348ubpjmvLO53_r8(com.paypal.pds.components.BottomSheetController.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.balance.common.ui.TurnOffConfirmationSheetKt.TurnOffConfirmationSheet(bottomSheetController, stringResource4, z, function04, (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.FLOW_TURN_OFF_LOW_BALANCE, composer2, com.paypal.pds.components.BottomSheetController.$stable | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i7 & 896) | ((i7 >> 12) & 7168), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                lowBalanceViewModel2 = lowBalanceViewModel3;
                xSellInfo2 = xSellInfo3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt.$r8$lambda$a0TQnf2iijCuEyjUm3mSlCrNzTQ(str, str2, z, z2, function0, function02, function03, function04, lowBalanceViewModel2, xSellInfo2, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 = i2 & 512;
        if (i4 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void AmountCard(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1792509503);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1792509503, i2, -1, "com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.AmountCard (LowBalanceScreen.kt:298)");
            }
            com.paypal.pds.components.SectionHeaderKt.SectionHeader(null, str, null, null, startRestartGroup, (i2 << 3) & 112, 13);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 7, null), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(921860903, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt.$r8$lambda$Rc9En810giSmRQWB8LkmjxI13UE(str3, str2, str4, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), composer2, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306374, 502);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt.$r8$lambda$kzgvLor6avNEhwhJRi0SC2mr_Q8(str, str2, str3, str4, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LowBalanceScreenError(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2005892303);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2005892303, i2, -1, "com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenError (LowBalanceScreen.kt:329)");
            }
            com.paypal.oslo.feature.balance.common.ui.BalanceErrorScreenKt.BalanceErrorScreen(com.paypal.oslo.feature.balance.common.BalanceErrorType.GENERIC, function0, null, startRestartGroup, ((i2 << 3) & 112) | 6, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt.m12076$r8$lambda$8MJCFTM6NL0t60zWkSeKTWw4E(kotlin.jvm.functions.Function0.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LowBalanceReloadScreenSuccessPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1104384737);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1104384737, i, -1, "com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceReloadScreenSuccessPreview (LowBalanceScreen.kt:338)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda2
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            LowBalanceReloadScreenSuccess("$25", "$50", true, true, function0, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue4, null, null, startRestartGroup, 14380470, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt.$r8$lambda$_hscqAPKsJo92iZAJhVkwzXofaE(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LowBalanceReloadScreenSuccessMerchantPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-343286217);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-343286217, i, -1, "com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceReloadScreenSuccessMerchantPreview (LowBalanceScreen.kt:353)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda0
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            LowBalanceReloadScreenSuccess("$25", "$50", false, true, function0, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue4, null, null, startRestartGroup, 14380470, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt.$r8$lambda$2RzmXa5TNUKu8j308tiyfNGq9YY(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2RzmXa5TNUKu8j308tiyfNGq9YY(int i, androidx.compose.runtime.Composer composer, int i2) {
        LowBalanceReloadScreenSuccessMerchantPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3yb02QnKRNuAOja4_hC0iSl7aB8(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel) {
        lowBalanceViewModel.processIntent(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnNextButtonClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8MJCFTM6NL0t6-0-zWkSeKTWw4E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12076$r8$lambda$8MJCFTM6NL0t60zWkSeKTWw4E(kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        LowBalanceScreenError(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$E6dOK8gY9-euD4EgRdpgu2pZOZA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12077$r8$lambda$E6dOK8gY9euD4EgRdpgu2pZOZA(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel) {
        lowBalanceViewModel.processIntent(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnReloadAmountClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MXNpJHvZ43DyyE_HBwXeHVqKiHU(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel, com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo xSellInfo) {
        lowBalanceViewModel.initialize(xSellInfo != null ? java.lang.Double.valueOf(xSellInfo.getAmount()) : null, xSellInfo != null ? xSellInfo.getCurrencyCode() : null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ot9cG6EwzoUSS0KK7EqAaZyx11Q(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel) {
        lowBalanceViewModel.processIntent(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffButtonClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Rc9En810giSmRQWB8LkmjxI13UE(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(921860903, i, -1, "com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.AmountCard.<anonymous> (LowBalanceScreen.kt:306)");
            }
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.RowScope.weight$default(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), str), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 0, 6, 1020);
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_edit_button, composer, 0), com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, str3), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getAMOUNT_SELECTOR_TAP()), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.ACTION_SELECT_AMOUNT)), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, null, false, false, composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 472);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_4b2QNm2SH6kVNDYJK77JpSHxLY(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel) {
        lowBalanceViewModel.processIntent(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnThresholdAmountClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_hscqAPKsJo92iZAJhVkwzXofaE(int i, androidx.compose.runtime.Composer composer, int i2) {
        LowBalanceReloadScreenSuccessPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$a0TQnf2iijCuEyjUm3mSlCrNzTQ(java.lang.String str, java.lang.String str2, boolean z, boolean z2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel, com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo xSellInfo, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LowBalanceReloadScreenSuccess(str, str2, z, z2, function0, function02, function03, function04, lowBalanceViewModel, xSellInfo, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kzgvLor6avNEhwhJRi0SC2mr_Q8(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        AmountCard(str, str2, str3, str4, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rKZYnc_mf8A348ubpjmvLO53_r8(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rRq8ba12sPAOAg0fbkVYxB2BHvc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel, com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo xSellInfo, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LowBalanceReloadScreen(appNavigator, lowBalanceViewModel, xSellInfo, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
