package com.paypal.oslo.feature.p2p.ui.currencypicker.composables;

@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b28\b\u0002\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\r2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013H\u0001¢\u0006\u0002\u0010\u0015\u001a=\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\u0010\u001e¨\u0006\u001f²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"CurrencyPickerScreen", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "", "currencyPickerComponents", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/CurrencyPickerComponents;", "sharedTransitionScope", "Landroidx/compose/animation/SharedTransitionScope;", "animatedContentScope", "Landroidx/compose/animation/AnimatedContentScope;", "viewModel", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/viewmodel/CurrencyPickerViewModel;", "onCurrencySelect", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currencyId", "currencyCode", "onNavigateToXoom", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;", "(Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/CurrencyPickerComponents;Landroidx/compose/animation/SharedTransitionScope;Landroidx/compose/animation/AnimatedContentScope;Lcom/paypal/oslo/feature/p2p/ui/currencypicker/viewmodel/CurrencyPickerViewModel;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "CurrencyPickerScreenContent", "state", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/state/CurrencyPickerState;", "animatedScope", "tabSelectorCallbacks", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/CurrencyTabSelectorCallbacks;", "searchCurrencyCallbacks", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyCallbacks;", "(Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/CurrencyPickerComponents;Lcom/paypal/oslo/feature/p2p/ui/currencypicker/state/CurrencyPickerState;Landroidx/compose/animation/SharedTransitionScope;Landroidx/compose/animation/AnimatedContentScope;Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/CurrencyTabSelectorCallbacks;Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyCallbacks;Landroidx/compose/runtime/Composer;I)V", "p2p_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyPickerScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CurrencyPickerScreen(final java.lang.String str, final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents currencyPickerComponents, final androidx.compose.animation.SharedTransitionScope sharedTransitionScope, final androidx.compose.animation.AnimatedContentScope animatedContentScope, final com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.domain.model.CurrencyItem, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function22;
        int i4;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.domain.model.CurrencyItem, kotlin.Unit> function12;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.domain.model.CurrencyItem, kotlin.Unit> function13;
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function23;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function24;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.domain.model.CurrencyItem, kotlin.Unit> function14;
        androidx.view.Lifecycle lifecycle;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedTransitionScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedContentScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1539167452);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(currencyPickerComponents) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(sharedTransitionScope) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(animatedContentScope) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(currencyPickerViewModel) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            function22 = function2;
            i3 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
                if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    function13 = function12;
                    function23 = function22;
                } else {
                    if (i5 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt.m17284$r8$lambda$feOhoEdxPh4qgRZpR9NTFoEbic((java.lang.String) obj, (java.lang.String) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function24 = (kotlin.jvm.functions.Function2) rememberedValue;
                    } else {
                        function24 = function22;
                    }
                    if (i4 != 0) {
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt.m17285$r8$lambda$kY8uWQiwdEB12Q0GNlvW6PUwvM((com.paypal.oslo.feature.p2p.domain.model.CurrencyItem) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue2;
                    } else {
                        function14 = function12;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1539167452, i3, -1, "com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreen (CurrencyPickerScreen.kt:60)");
                    }
                    int i6 = i3;
                    androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(currencyPickerViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    androidx.view.LifecycleOwner lifecycleOwner = (androidx.view.LifecycleOwner) startRestartGroup.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    androidx.view.Lifecycle lifecycle2 = lifecycleOwner.getLifecycle();
                    boolean changedInstance = startRestartGroup.changedInstance(lifecycleOwner);
                    boolean changedInstance2 = startRestartGroup.changedInstance(currencyPickerViewModel);
                    boolean z = (458752 & i6) == 131072;
                    boolean z2 = (3670016 & i6) == 1048576;
                    com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                    if (((changedInstance | changedInstance2 | z) || z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        lifecycle = lifecycle2;
                        rememberedValue3 = new com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1(lifecycleOwner, currencyPickerViewModel, function14, function24, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    } else {
                        lifecycle = lifecycle2;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(lifecycle, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                    boolean changedInstance3 = startRestartGroup.changedInstance(currencyPickerViewModel);
                    int i7 = i6 & 14;
                    boolean z3 = i7 == 4;
                    com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$4$1 rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((changedInstance3 | z3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$4$1(currencyPickerViewModel, str, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, i7);
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyCallbacks() { // from class: com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$searchCurrencyCallbacks$1$1
                            @Override // com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyCallbacks
                            public final void onQueryChanged(java.lang.String query) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
                                com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.this.processEvent(new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.SearchQueryChanged(query));
                            }

                            @Override // com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyCallbacks
                            public final void onCurrencySelected(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem item) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
                                com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.this.processEvent(new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClicked(com.paypal.oslo.feature.p2p.ui.currencypicker.extensions.CurrencyItemExtensionKt.requireId(item), com.paypal.oslo.feature.p2p.ui.currencypicker.extensions.CurrencyItemExtensionKt.requireCurrencyCode(item)));
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$searchCurrencyCallbacks$1$1 currencyPickerScreenKt$CurrencyPickerScreen$searchCurrencyCallbacks$1$1 = (com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$searchCurrencyCallbacks$1$1) rememberedValue5;
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorCallbacks() { // from class: com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$tabSelectorCallbacks$1$1
                            @Override // com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorCallbacks
                            public final void onTabSelected(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyType, "");
                                com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.this.processEvent(new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.TabChanged(currencyType));
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    CurrencyPickerScreenContent(currencyPickerComponents, (com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState) collectAsStateWithLifecycle.getValue(), sharedTransitionScope, animatedContentScope, (com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$tabSelectorCallbacks$1$1) rememberedValue6, currencyPickerScreenKt$CurrencyPickerScreen$searchCurrencyCallbacks$1$1, startRestartGroup, (i6 & 7168) | (i6 & 896) | ((i6 >> 3) & 14) | 221184);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function23 = function24;
                    function13 = function14;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt.m17283$r8$lambda$OxfLqReaGo4rl4RWSc6NUT4X9k(str, currencyPickerComponents, sharedTransitionScope, animatedContentScope, currencyPickerViewModel, function23, function13, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function22 = function2;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        function12 = function1;
        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void CurrencyPickerScreenContent(final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents currencyPickerComponents, final com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState currencyPickerState, final androidx.compose.animation.SharedTransitionScope sharedTransitionScope, final androidx.compose.animation.AnimatedContentScope animatedContentScope, final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorCallbacks currencyTabSelectorCallbacks, final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyCallbacks searchCurrencyCallbacks, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedTransitionScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedContentScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyTabSelectorCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchCurrencyCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-309020172);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(currencyPickerComponents) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(currencyPickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(sharedTransitionScope) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(animatedContentScope) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(currencyTabSelectorCallbacks) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(searchCurrencyCallbacks) ? 131072 : 65536;
        }
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-309020172, i4, -1, "com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenContent (CurrencyPickerScreen.kt:130)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
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
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            if (currencyPickerState.isCryptoEnabled()) {
                startRestartGroup.startReplaceGroup(-1949521741);
                int i5 = i4 << 3;
                i3 = i4;
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents.ComposeDefaultImpls.CurrencyTabSelector$default(new com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorData(currencyPickerState.getTabItems(startRestartGroup, (i4 >> 3) & 14), currencyPickerState.getSelectedTab()), currencyTabSelectorCallbacks, null, sharedTransitionScope, animatedContentScope, currencyPickerComponents, startRestartGroup, (i5 & 57344) | ((i4 >> 9) & 112) | (i5 & 7168) | ((i4 << 15) & 458752), 4);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
                composer2.endReplaceGroup();
            } else {
                i3 = i4;
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-1949038358);
                composer2.endReplaceGroup();
            }
            com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents.ComposeDefaultImpls.SearchCurrency$default(new com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyData(currencyPickerState.getSearchQuery(), currencyPickerState.getSearchBarPlaceholder(composer2, (i3 >> 3) & 14), new com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.FlatList(currencyPickerState.getCurrencies()), currencyPickerState.isLoading()), searchCurrencyCallbacks, new com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyConfig(true), null, currencyPickerComponents, composer2, ((i3 >> 12) & 112) | 384 | ((i3 << 12) & 57344), 8);
            composer2.endNode();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt.$r8$lambda$YQT_dB5ySqlYs1gG1j1bfKNT28A(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents.this, currencyPickerState, sharedTransitionScope, animatedContentScope, currencyTabSelectorCallbacks, searchCurrencyCallbacks, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$OxfLqReaGo4-rl4RWSc6NUT4X9k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17283$r8$lambda$OxfLqReaGo4rl4RWSc6NUT4X9k(java.lang.String str, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents currencyPickerComponents, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.animation.AnimatedContentScope animatedContentScope, com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CurrencyPickerScreen(str, currencyPickerComponents, sharedTransitionScope, animatedContentScope, currencyPickerViewModel, function2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YQT_dB5ySqlYs1gG1j1bfKNT28A(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents currencyPickerComponents, com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState currencyPickerState, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.animation.AnimatedContentScope animatedContentScope, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorCallbacks currencyTabSelectorCallbacks, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyCallbacks searchCurrencyCallbacks, int i, androidx.compose.runtime.Composer composer, int i2) {
        CurrencyPickerScreenContent(currencyPickerComponents, currencyPickerState, sharedTransitionScope, animatedContentScope, currencyTabSelectorCallbacks, searchCurrencyCallbacks, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$feOhoEdxPh4qgRZpR9-NTFoEbic, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17284$r8$lambda$feOhoEdxPh4qgRZpR9NTFoEbic(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kY8uWQiwdEB12-Q0GNlvW6PUwvM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17285$r8$lambda$kY8uWQiwdEB12Q0GNlvW6PUwvM(com.paypal.oslo.feature.p2p.domain.model.CurrencyItem currencyItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyItem, "");
        return kotlin.Unit.INSTANCE;
    }
}
