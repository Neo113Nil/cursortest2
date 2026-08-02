package com.paypal.oslo.feature.oneonboarding.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a>\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\u0002\b\nH\u0001¢\u0006\u0002\u0010\u000b\u001a<\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\u0002\b\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\"\u0010\u0013\u001a\u00020\u00012\u0013\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\u0002\b\nH\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u000eX\u008a\u0084\u0002"}, d2 = {"OneOnboardingFlow", "", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "oneOnboardingNavigator", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;", "viewModel", "Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OneOnboardingFlowContent", "state", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;", "onRetry", "(Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "OneOnboardingLoadingContent", "(Landroidx/compose/runtime/Composer;I)V", "OneOnboardingFlowActiveContent", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "OneOnboardingLoadingContentPreview", "OneOnboardingFlowActiveContentPreview", "one-onboarding_prodRelease", "uiState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OneOnboardingFlowKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner] */
    public static final void OneOnboardingFlow(final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22;
        final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel3;
        final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel4;
        ?? r10;
        kotlin.jvm.functions.Function0 function0;
        final kotlin.jvm.functions.Function0 function02;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingNavigator, "");
        ?? startRestartGroup = composer.startRestartGroup(-443631525);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(intentId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(oneOnboardingNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                oneOnboardingFlowViewModel2 = oneOnboardingFlowViewModel;
                if (startRestartGroup.changedInstance(oneOnboardingFlowViewModel2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                oneOnboardingFlowViewModel2 = oneOnboardingFlowViewModel;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            oneOnboardingFlowViewModel2 = oneOnboardingFlowViewModel;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
            function22 = function2;
        } else {
            function22 = function2;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
            }
        }
        int i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 1171) != 1170, i6 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    oneOnboardingFlowViewModel4 = (com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, (androidx.compose.runtime.Composer) startRestartGroup, 0, 0);
                    i6 &= -897;
                } else {
                    oneOnboardingFlowViewModel4 = oneOnboardingFlowViewModel2;
                }
                if (i5 != 0) {
                    function22 = null;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i6 &= -897;
                }
                oneOnboardingFlowViewModel4 = oneOnboardingFlowViewModel2;
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-443631525, i6, -1, "com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlow (OneOnboardingFlow.kt:49)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(oneOnboardingFlowViewModel4);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.m17125$r8$lambda$LCUkYGaXWz5v7QvXMcG2g1vbrQ(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 1);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance2 = startRestartGroup.changedInstance(oneOnboardingFlowViewModel4);
            boolean changedInstance3 = startRestartGroup.changedInstance(oneOnboardingNavigator);
            com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$OneOnboardingFlow$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance2 || changedInstance3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                r10 = 0;
                rememberedValue2 = new com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$OneOnboardingFlow$2$1(oneOnboardingFlowViewModel4, oneOnboardingNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            } else {
                r10 = 0;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, (androidx.compose.runtime.Composer) startRestartGroup, 6);
            final androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(oneOnboardingFlowViewModel4.getUiState(), r10, startRestartGroup, 0, 1);
            if (function22 == null) {
                startRestartGroup.startReplaceGroup(-611284254);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                boolean changedInstance4 = startRestartGroup.changedInstance(oneOnboardingFlowViewModel4);
                boolean changedInstance5 = startRestartGroup.changedInstance(intentId);
                com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$OneOnboardingFlow$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if ((changedInstance4 | changedInstance5) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$OneOnboardingFlow$3$1(oneOnboardingFlowViewModel4, intentId, r10);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, (androidx.compose.runtime.Composer) startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-611187193);
                startRestartGroup.endReplaceGroup();
            }
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState oneOnboardingUiState = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState) collectAsState.getValue();
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Error error = oneOnboardingUiState instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Error ? (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Error) oneOnboardingUiState : r10;
            final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent retryableEvent = error != null ? error.getRetryableEvent() : r10;
            if (retryableEvent == null) {
                startRestartGroup.startReplaceGroup(-611079159);
                function0 = r10;
            } else {
                startRestartGroup.startReplaceGroup(-611079158);
                boolean changedInstance6 = startRestartGroup.changedInstance(oneOnboardingFlowViewModel4);
                boolean changedInstance7 = startRestartGroup.changedInstance(retryableEvent);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if ((changedInstance6 | changedInstance7) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.m17127$r8$lambda$cdWvuj0jWY8AAF0hkkOy63qZHI(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this, retryableEvent);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                function0 = (kotlin.jvm.functions.Function0) rememberedValue4;
            }
            startRestartGroup.endReplaceGroup();
            if (function0 == null) {
                startRestartGroup.startReplaceGroup(-611007858);
                boolean changedInstance8 = startRestartGroup.changedInstance(oneOnboardingFlowViewModel4);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance8 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.$r8$lambda$9Yy_vD48IvunB10JNM1lHPKgXwQ(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
            } else {
                startRestartGroup.startReplaceGroup(-1128093207);
                function02 = function0;
            }
            startRestartGroup.endReplaceGroup();
            final androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1527114104, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.$r8$lambda$ubUJr5WCL0gBqQJDN3pSW1fj0R4(kotlin.jvm.functions.Function2.this, function02, collectAsState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54);
            if (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings) {
                startRestartGroup.startReplaceGroup(-610753534);
                java.util.Locale locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                com.paypal.oslo.feature.oneonboarding.ui.CompositionLocaleWrapperKt.CompositionLocaleWrapper(locale, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1235556684, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.$r8$lambda$dDpVSX7HDGOiq6O2Ngg6xbeX6SQ(kotlin.jvm.functions.Function2.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 48);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-610680374);
                rememberComposableLambda.invoke(startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            oneOnboardingFlowViewModel3 = oneOnboardingFlowViewModel4;
        } else {
            startRestartGroup.skipToGroupEnd();
            oneOnboardingFlowViewModel3 = oneOnboardingFlowViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23 = function22;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.$r8$lambda$DaK9gq7harOmxOllbi_xTcjZcyw(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.this, oneOnboardingNavigator, oneOnboardingFlowViewModel3, function23, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OneOnboardingFlowContent(final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState oneOnboardingUiState, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingUiState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1646263190);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(oneOnboardingUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                function2 = null;
            }
            if (i5 != 0) {
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1646263190, i3, -1, "com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowContent (OneOnboardingFlow.kt:102)");
            }
            if ((oneOnboardingUiState instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Initial) || (oneOnboardingUiState instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Loading)) {
                startRestartGroup.startReplaceGroup(1510968595);
                getHighSpeedVideoSizes(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if ((oneOnboardingUiState instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content) || (oneOnboardingUiState instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Submitting) || (oneOnboardingUiState instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.TerminalStatus)) {
                startRestartGroup.startReplaceGroup(1510973885);
                getHighSpeedVideoFpsRanges(function2, startRestartGroup, (i3 >> 3) & 14);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!(oneOnboardingUiState instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Error)) {
                    startRestartGroup.startReplaceGroup(1510965849);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(1510976538);
                com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingErrorContentKt.OneOnboardingErrorContent(((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Error) oneOnboardingUiState).getError(), function0, startRestartGroup, (i3 >> 3) & 112);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22 = function2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02 = function0;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.m17128$r8$lambda$i0iV1Y74WFFFlwimVlJQo3yluQ(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.this, function22, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(827265463);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(827265463, i, -1, "com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingLoadingContent (OneOnboardingFlow.kt:117)");
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
            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(center, centerHorizontally, startRestartGroup, 54);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.$r8$lambda$uSEeJ3_k4zR8mn0uF6Xwezw_UEU(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1744469332);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1744469332, i2, -1, "com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowActiveContent (OneOnboardingFlow.kt:134)");
            }
            if (function2 == null) {
                startRestartGroup.startReplaceGroup(381679525);
            } else {
                startRestartGroup.startReplaceGroup(1397785564);
                function2.invoke(startRestartGroup, java.lang.Integer.valueOf(i2 & 14));
            }
            startRestartGroup.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.$r8$lambda$tzDlZ6MBqXPFTpe8n6faYJvMQt8(kotlin.jvm.functions.Function2.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9Yy_vD48IvunB10JNM1lHPKgXwQ(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
        com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.closeFlow$default(oneOnboardingFlowViewModel, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DaK9gq7harOmxOllbi_xTcjZcyw(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        OneOnboardingFlow(intentId, oneOnboardingNavigator, oneOnboardingFlowViewModel, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LCUkYGaXWz5v7QvXMcG-2g1vbrQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17125$r8$lambda$LCUkYGaXWz5v7QvXMcG2g1vbrQ(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
        oneOnboardingFlowViewModel.stepBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WTzoawz7sAwm8rxYLiM70z82IPk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1141774447);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1141774447, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingLoadingContentPreview (OneOnboardingFlow.kt:144)");
            }
            getHighSpeedVideoSizes(startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.$r8$lambda$WTzoawz7sAwm8rxYLiM70z82IPk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cdWvuj0-jWY8AAF0hkkOy63qZHI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17127$r8$lambda$cdWvuj0jWY8AAF0hkkOy63qZHI(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent retryableUserIntent) {
        oneOnboardingFlowViewModel.retry(retryableUserIntent);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dDpVSX7HDGOiq6O2Ngg6xbeX6SQ(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1235556684, i, -1, "com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlow.<anonymous> (OneOnboardingFlow.kt:91)");
            }
            function2.invoke(composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$i0iV1Y74WFFFlwimV-lJQo3yluQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17128$r8$lambda$i0iV1Y74WFFFlwimVlJQo3yluQ(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState oneOnboardingUiState, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        OneOnboardingFlowContent(oneOnboardingUiState, function2, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qiiSgKoG9AH5Z6N4PK1Yf5hrhLA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-848416047);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-848416047, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowActiveContentPreview (OneOnboardingFlow.kt:154)");
            }
            OneOnboardingFlowContent(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content(new com.paypal.oslo.feature.oneonboarding.domain.Flow(new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto(null, 1, null), kotlin.collections.CollectionsKt.emptyList(), com.paypal.oslo.feature.oneonboarding.api.domain.Status.IN_REVIEW, (java.util.List) null, (java.util.Map) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null), -1), com.paypal.oslo.feature.oneonboarding.ui.ComposableSingletons$OneOnboardingFlowKt.INSTANCE.m17119getLambda$613434252$one_onboarding_prodRelease(), null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.$r8$lambda$qiiSgKoG9AH5Z6N4PK1Yf5hrhLA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tzDlZ6MBqXPFTpe8n6faYJvMQt8(kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uSEeJ3_k4zR8mn0uF6Xwezw_UEU(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ubUJr5WCL0gBqQJDN3pSW1fj0R4(kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1527114104, i, -1, "com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlow.<anonymous> (OneOnboardingFlow.kt:83)");
            }
            OneOnboardingFlowContent((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState) state.getValue(), function2, function0, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
