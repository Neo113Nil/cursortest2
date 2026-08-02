package com.paypal.oslo.feature.balance.ui.autoReload.scheduled;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001ae\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0001¢\u0006\u0002\u0010\u0013\u001a-\u0010\u0014\u001a\u00020\t*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u0019H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001d¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002"}, d2 = {"AutoReloadScheduledScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledViewModel;Landroidx/compose/runtime/Composer;I)V", "AutoReloadScheduledScreenSuccess", "howOftenDescription", "", "reloadAmount", "isConsumerAccountType", "", "shouldShowTurnOffOption", "onClickFrequency", "Lkotlin/Function0;", "onClickAmount", "onClickNext", "onClickTurnOff", "(Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "toFrequencyDisplay", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "userLocale", "Ljava/util/Locale;", "formatOrdinal", "Lkotlin/Function1;", "", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;Ljava/util/Locale;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "AutoReloadScheduledScreenSuccessPreview", "(Landroidx/compose/runtime/Composer;I)V", "AutoReloadScheduledScreenSuccessMerchantPreview", "balance_prodRelease", "uiState", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoReloadScheduledScreenKt {
    public static final void AutoReloadScheduledScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel autoReloadScheduledViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadScheduledViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-878248269);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(autoReloadScheduledViewModel) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-878248269, i2, -1, "com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreen (AutoReloadScheduledScreen.kt:75)");
            }
            androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(autoReloadScheduledViewModel.getUiState(), null, startRestartGroup, 0, 1);
            boolean changedInstance = startRestartGroup.changedInstance(autoReloadScheduledViewModel);
            com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$1$1(autoReloadScheduledViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect("Initialize", (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            boolean changedInstance2 = startRestartGroup.changedInstance(autoReloadScheduledViewModel);
            boolean z = (i2 & 14) == 4;
            com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if ((z | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1(autoReloadScheduledViewModel, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect("Collection", (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            java.lang.String amountScheduledRequestId = autoReloadScheduledViewModel.getAmountScheduledRequestId();
            boolean changedInstance3 = startRestartGroup.changedInstance(autoReloadScheduledViewModel);
            com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$3$1(autoReloadScheduledViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue3;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m12106invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m12106invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(amountScheduledRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
            java.lang.String frequencyScheduledRequestId = autoReloadScheduledViewModel.getFrequencyScheduledRequestId();
            boolean changedInstance4 = startRestartGroup.changedInstance(autoReloadScheduledViewModel);
            com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$4$1 rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$4$1(autoReloadScheduledViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue5;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$$inlined$NavResultEffectrtGRyWw$2 rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$$inlined$NavResultEffect-rtGRyWw$2
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m12107invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m12107invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(frequencyScheduledRequestId, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue6, startRestartGroup, 3072);
            com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState autoReloadScheduledState = (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState) collectAsState.getValue();
            if (autoReloadScheduledState instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Initial) {
                startRestartGroup.startReplaceGroup(2112069367);
                startRestartGroup.endReplaceGroup();
            } else if ((autoReloadScheduledState instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Loading) || kotlin.jvm.internal.Intrinsics.areEqual(autoReloadScheduledState, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.LoadingTurnOff.INSTANCE)) {
                startRestartGroup.startReplaceGroup(2112072621);
                com.paypal.oslo.feature.balance.common.ui.BalanceLoadingFullscreenKt.BalanceLoadingFullscreen(null, startRestartGroup, 0, 1);
                startRestartGroup.endReplaceGroup();
            } else if (autoReloadScheduledState instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Success) {
                startRestartGroup.startReplaceGroup(1049850530);
                com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState autoReloadScheduledState2 = (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState) collectAsState.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(autoReloadScheduledState2, "");
                com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Success success = (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Success) autoReloadScheduledState2;
                com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency frequency = success.getFrequency();
                java.util.Locale userLocale = autoReloadScheduledViewModel.getUserLocale();
                boolean changedInstance5 = startRestartGroup.changedInstance(autoReloadScheduledViewModel);
                com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$5$1 rememberedValue7 = startRestartGroup.rememberedValue();
                if (changedInstance5 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$5$1(autoReloadScheduledViewModel);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue7);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2141023626, 0, -1, "com.paypal.oslo.feature.balance.ui.autoReload.scheduled.toFrequencyDisplay (AutoReloadScheduledScreen.kt:286)");
                }
                if (frequency instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly) {
                    startRestartGroup.startReplaceGroup(-1324308102);
                    int i3 = com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_scheduled_screen_frequency_weekly;
                    java.lang.String displayName = ((com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly) frequency).getDayOfWeek().getDisplayName(java.time.format.TextStyle.FULL, userLocale);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayName, "");
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i3, new java.lang.Object[]{displayName}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (frequency instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Biweekly) {
                    startRestartGroup.startReplaceGroup(-1324078888);
                    int i4 = com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_scheduled_screen_frequency_biweekly;
                    java.lang.String displayName2 = ((com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Biweekly) frequency).getDayOfWeek().getDisplayName(java.time.format.TextStyle.FULL, userLocale);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayName2, "");
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i4, new java.lang.Object[]{displayName2}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(frequency instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly)) {
                        startRestartGroup.startReplaceGroup(234373927);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-1323848961);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_scheduled_screen_frequency_monthly, new java.lang.Object[]{(java.lang.String) function1.invoke(java.lang.Integer.valueOf(((com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly) frequency).getStartDate().getDayOfMonth()))}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.String str = stringResource;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                java.lang.String formattedAmount = success.getReloadAmount().getFormattedAmount();
                boolean isConsumerAccountType = autoReloadScheduledViewModel.getIsConsumerAccountType();
                boolean shouldShowTurnOffOption = success.getShouldShowTurnOffOption();
                boolean changedInstance6 = startRestartGroup.changedInstance(autoReloadScheduledViewModel);
                java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (changedInstance6 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt.m12105$r8$lambda$wwcang84615hxvU_UjV2qB0Y(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue8;
                boolean changedInstance7 = startRestartGroup.changedInstance(autoReloadScheduledViewModel);
                java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (changedInstance7 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt.m12099$r8$lambda$7rTOMPhPOt_POU_bJT1eu6GOIk(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue9;
                boolean changedInstance8 = startRestartGroup.changedInstance(autoReloadScheduledViewModel);
                java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                if (changedInstance8 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt.$r8$lambda$2UZjoeK1cJVjNrX2exsN7DPD4aQ(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue10;
                boolean changedInstance9 = startRestartGroup.changedInstance(autoReloadScheduledViewModel);
                java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                if (changedInstance9 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt.m12097$r8$lambda$qrSklyGZbQWCsoGciV6CCh7ikc(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                AutoReloadScheduledScreenSuccess(str, formattedAmount, isConsumerAccountType, shouldShowTurnOffOption, function0, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue11, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(autoReloadScheduledState, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.InitializeError.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(2112068988);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(1051000351);
                com.paypal.oslo.feature.balance.common.BalanceErrorType balanceErrorType = com.paypal.oslo.feature.balance.common.BalanceErrorType.GENERIC;
                boolean changedInstance10 = startRestartGroup.changedInstance(autoReloadScheduledViewModel);
                java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
                if (changedInstance10 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt.$r8$lambda$TTMqDYhr5eD6yiPR5zcESuhpnAE(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                }
                com.paypal.oslo.feature.balance.common.ui.BalanceErrorScreenKt.BalanceErrorScreen(balanceErrorType, (kotlin.jvm.functions.Function0) rememberedValue12, null, startRestartGroup, 6, 4);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt.$r8$lambda$RCaZgqa35JhRdv72sxMZU5wsc0c(com.paypal.oslo.core.navigation.AppNavigator.this, autoReloadScheduledViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AutoReloadScheduledScreenSuccess(final java.lang.String str, final java.lang.String str2, final boolean z, final boolean z2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.lang.String stringResource;
        final com.paypal.pds.components.BottomSheetController bottomSheetController;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(966735575);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function04) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(966735575, i3, -1, "com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenSuccess (AutoReloadScheduledScreen.kt:191)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.FLOW_SETUP_SCHEDULED, null);
            androidx.compose.ui.Modifier windowInsetsPadding = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6));
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
            androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8(), 2, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Scheduled.SCREEN), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getAMOUNT_SELECTION_ZONE()), kotlin.collections.CollectionsKt.listOf(businessFlowContext));
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
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Scheduled.TITLE);
            if (z) {
                startRestartGroup.startReplaceGroup(898449407);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_scheduled_title, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(898550932);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_title_merchant, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, testTag, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 48, 6, 1020);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 7, null), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.balance.common.ui.CardValueEditKt.CardValueEdit(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_scheduled_frequency_label, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_scheduled_how_often, startRestartGroup, 0), str, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_edit_button, startRestartGroup, 0), function0, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Scheduled.FREQUENCY_INPUT_FIELD, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Scheduled.FREQUENCY_EDIT_BUTTON, com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getFREQUENCY_SELECTION_ZONE(), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getFREQUENCY_SELECTOR_TAP(), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.ACTION_SELECT_FREQUENCY), startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable << 21) | ((i3 << 6) & 896) | 1769472 | (i3 & 57344) | (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable << 24), 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), composer2, 0);
            com.paypal.oslo.feature.balance.common.ui.CardValueEditKt.CardValueEdit(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_scheduled_amount_label, composer2, 0), str2, null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_edit_button, composer2, 0), function02, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Scheduled.RELOAD_INPUT_FIELD, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Scheduled.RELOAD_EDIT_BUTTON, null, com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getAMOUNT_SELECTOR_TAP(), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.ACTION_SELECT_AMOUNT), composer2, (i3 & 112) | 1769856 | ((i3 >> 3) & 57344) | (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable << 24), 128);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
            com.paypal.pds.components.ButtonKt.Button(function03, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_next_button, composer2, 0), com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.Scheduled.DONE_BUTTON), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getREVIEW_BUTTON()), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.ACTION_REVIEW)), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer2, ((i3 >> 18) & 14) | 1769472, 408);
            if (z2) {
                composer2.startReplaceGroup(900980309);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 7, null), composer2, 0);
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_turn_off_button, composer2, 0);
                com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                boolean changedInstance = composer2.changedInstance(bottomSheetController2);
                java.lang.Object rememberedValue2 = composer2.rememberedValue();
                if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt.$r8$lambda$cBYIfuJ2U52OQ2bTGPh1d216bvc(com.paypal.pds.components.BottomSheetController.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                }
                bottomSheetController = bottomSheetController2;
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, stringResource2, fillMaxWidth$default, null, null, tertiary, large, false, false, composer2, 1769856, 408);
                composer2.endReplaceGroup();
            } else {
                bottomSheetController = bottomSheetController2;
                composer2.startReplaceGroup(901451199);
                composer2.endReplaceGroup();
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), composer2, 0);
            composer2.endNode();
            composer2.endNode();
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_scheduled_turn_off_title, composer2, 0);
            boolean changedInstance2 = composer2.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue3 = composer2.rememberedValue();
            if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt.m12101$r8$lambda$cAC6qEVc66TFmqaMWi7LKYjHqw(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.balance.common.ui.TurnOffConfirmationSheetKt.TurnOffConfirmationSheet(bottomSheetController, stringResource3, z, function04, (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.FLOW_TURN_OFF_SCHEDULED, composer2, com.paypal.pds.components.BottomSheetController.$stable | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 896) | ((i3 >> 12) & 7168), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt.$r8$lambda$dCOp5axL8FlNkBTl3KA2HzM6fHE(str, str2, z, z2, function0, function02, function03, function04, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AutoReloadScheduledScreenSuccessPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1910954845);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1910954845, i, -1, "com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenSuccessPreview (AutoReloadScheduledScreen.kt:311)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda17
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda18
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
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda1
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
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            AutoReloadScheduledScreenSuccess("Weekly, every Saturday", "$500.00", true, true, function0, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 14380470);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt.m12098$r8$lambda$3Awn7miOwAPyJhWh6bFNEydH38(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AutoReloadScheduledScreenSuccessMerchantPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-147270213);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-147270213, i, -1, "com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenSuccessMerchantPreview (AutoReloadScheduledScreen.kt:326)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda0
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda10
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
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda11
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
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            AutoReloadScheduledScreenSuccess("Weekly, every Saturday", "$500.00", true, true, function0, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 14380470);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt.m12103$r8$lambda$rONRZni0IFmhc14wnFyINk5Bg(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-qrSklyGZbQWCsoGciV6CCh7ikc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12097$r8$lambda$qrSklyGZbQWCsoGciV6CCh7ikc(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel autoReloadScheduledViewModel) {
        autoReloadScheduledViewModel.processIntent(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnTurnOffButtonClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2UZjoeK1cJVjNrX2exsN7DPD4aQ(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel autoReloadScheduledViewModel) {
        autoReloadScheduledViewModel.processIntent(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnNextButtonClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$3Awn7miOwAPyJhWh6b-FNEydH38, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12098$r8$lambda$3Awn7miOwAPyJhWh6bFNEydH38(int i, androidx.compose.runtime.Composer composer, int i2) {
        AutoReloadScheduledScreenSuccessPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7r-TOMPhPOt_POU_bJT1eu6GOIk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12099$r8$lambda$7rTOMPhPOt_POU_bJT1eu6GOIk(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel autoReloadScheduledViewModel) {
        autoReloadScheduledViewModel.processIntent(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.ShowScheduledAmountBottomSheet.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RCaZgqa35JhRdv72sxMZU5wsc0c(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel autoReloadScheduledViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        AutoReloadScheduledScreen(appNavigator, autoReloadScheduledViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TTMqDYhr5eD6yiPR5zcESuhpnAE(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel autoReloadScheduledViewModel) {
        autoReloadScheduledViewModel.processIntent(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.Initialize.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cAC6qE-Vc66TFmqaMWi7LKYjHqw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12101$r8$lambda$cAC6qEVc66TFmqaMWi7LKYjHqw(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cBYIfuJ2U52OQ2bTGPh1d216bvc(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.showSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dCOp5axL8FlNkBTl3KA2HzM6fHE(java.lang.String str, java.lang.String str2, boolean z, boolean z2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, int i, androidx.compose.runtime.Composer composer, int i2) {
        AutoReloadScheduledScreenSuccess(str, str2, z, z2, function0, function02, function03, function04, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rONRZn-i0IFmhc14wnFyIN-k5Bg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12103$r8$lambda$rONRZni0IFmhc14wnFyINk5Bg(int i, androidx.compose.runtime.Composer composer, int i2) {
        AutoReloadScheduledScreenSuccessMerchantPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wwcang84615hx-v-U_UjV2-qB0Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12105$r8$lambda$wwcang84615hxvU_UjV2qB0Y(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel autoReloadScheduledViewModel) {
        autoReloadScheduledViewModel.processIntent(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.ShowScheduledFrequencyBottomSheet.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
