package com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a/\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\u001a¡\u0001\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00102\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"AllTransactionsScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/alltransactions/mvi/AllTransactionsMviViewModel;", "onNavigateBack", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/alltransactions/mvi/AllTransactionsMviViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AllTransactionsContent", "state", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/alltransactions/mvi/AllTransactionsUiState;", "downloadState", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState;", "onRetryClick", "onYearHeaderClick", "Lkotlin/Function1;", "", "onDownloadYearClick", "onDownloadMonthClick", "Lkotlin/Function2;", "", "onRetryDownload", "onDismissDownloadError", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/alltransactions/mvi/AllTransactionsUiState;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "tax-and-document-center_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AllTransactionsScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AllTransactionsScreen(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel3;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        final com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel4;
        boolean changedInstance;
        boolean changedInstance2;
        java.lang.Object rememberedValue;
        boolean changedInstance3;
        java.lang.Object rememberedValue2;
        boolean changedInstance4;
        java.lang.Object rememberedValue3;
        boolean changedInstance5;
        java.lang.Object rememberedValue4;
        boolean changedInstance6;
        java.lang.Object rememberedValue5;
        boolean changedInstance7;
        java.lang.Object rememberedValue6;
        boolean changedInstance8;
        java.lang.Object rememberedValue7;
        boolean changedInstance9;
        java.lang.Object rememberedValue8;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-732781229);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                allTransactionsMviViewModel2 = allTransactionsMviViewModel;
                if (startRestartGroup.changedInstance(allTransactionsMviViewModel2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                allTransactionsMviViewModel2 = allTransactionsMviViewModel;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            allTransactionsMviViewModel2 = allTransactionsMviViewModel;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 147) != 146, i6 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                }
                modifier4 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier5 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
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
                    i6 &= -113;
                    modifier4 = modifier5;
                    allTransactionsMviViewModel4 = (com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-732781229, i6, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreen (AllTransactionsScreen.kt:49)");
                    }
                    androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(allTransactionsMviViewModel4.getUiState(), null, startRestartGroup, 0, 1);
                    androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(allTransactionsMviViewModel4.getDownloadState(), null, startRestartGroup, 0, 1);
                    android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    changedInstance = startRestartGroup.changedInstance(allTransactionsMviViewModel4);
                    changedInstance2 = startRestartGroup.changedInstance(context);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$AllTransactionsScreen$1$1(allTransactionsMviViewModel4, context, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(allTransactionsMviViewModel4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, (i6 >> 3) & 14);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    changedInstance3 = startRestartGroup.changedInstance(allTransactionsMviViewModel4);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.$r8$lambda$Z2QEfOynzn0rRfn3W6pUjq08nEg(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.EffectsKt.DisposableEffect(unit, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, startRestartGroup, 6);
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState allTransactionsUiState = (com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState) collectAsState.getValue();
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState downloadUiState = (com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState) collectAsState2.getValue();
                    changedInstance4 = startRestartGroup.changedInstance(allTransactionsMviViewModel4);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.m20321$r8$lambda$FsqqknT5lb9zObSYuRGZ2LuJ90(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
                    changedInstance5 = startRestartGroup.changedInstance(allTransactionsMviViewModel4);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changedInstance5 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.$r8$lambda$TTJrvWqqhW7ja5b6LWB3c48puLo(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.this, ((java.lang.Integer) obj).intValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
                    changedInstance6 = startRestartGroup.changedInstance(allTransactionsMviViewModel4);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changedInstance6 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.$r8$lambda$uY0DCsuulft3afM3UiHuv0TfK68(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.this, ((java.lang.Integer) obj).intValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
                    changedInstance7 = startRestartGroup.changedInstance(allTransactionsMviViewModel4);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changedInstance7 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.m20322$r8$lambda$KH6RkDrywBoWEasOPnvwNjRtQ(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.this, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue6;
                    changedInstance8 = startRestartGroup.changedInstance(allTransactionsMviViewModel4);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!changedInstance8 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.m20324$r8$lambda$ecv063y6bOp8jw0mbdu3DpYyfM(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue7;
                    changedInstance9 = startRestartGroup.changedInstance(allTransactionsMviViewModel4);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!changedInstance9 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.$r8$lambda$2hm6Qu3ODL1r2yTUe0UPwZk4OaY(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel5 = allTransactionsMviViewModel4;
                    AllTransactionsContent(allTransactionsUiState, downloadUiState, modifier4, function0, function02, function1, function12, function2, function03, (kotlin.jvm.functions.Function0) rememberedValue8, startRestartGroup, ((i6 << 6) & 896) | ((i6 << 3) & 7168), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    allTransactionsMviViewModel3 = allTransactionsMviViewModel5;
                } else {
                    modifier4 = modifier5;
                }
            }
            allTransactionsMviViewModel4 = allTransactionsMviViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsState3 = androidx.compose.runtime.SnapshotStateKt.collectAsState(allTransactionsMviViewModel4.getUiState(), null, startRestartGroup, 0, 1);
            androidx.compose.runtime.State collectAsState22 = androidx.compose.runtime.SnapshotStateKt.collectAsState(allTransactionsMviViewModel4.getDownloadState(), null, startRestartGroup, 0, 1);
            android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            changedInstance = startRestartGroup.changedInstance(allTransactionsMviViewModel4);
            changedInstance2 = startRestartGroup.changedInstance(context2);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | changedInstance2)) {
            }
            rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$AllTransactionsScreen$1$1(allTransactionsMviViewModel4, context2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(allTransactionsMviViewModel4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, (i6 >> 3) & 14);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changedInstance3 = startRestartGroup.changedInstance(allTransactionsMviViewModel4);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.$r8$lambda$Z2QEfOynzn0rRfn3W6pUjq08nEg(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.DisposableEffect(unit2, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, startRestartGroup, 6);
            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState allTransactionsUiState2 = (com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState) collectAsState3.getValue();
            com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState downloadUiState2 = (com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState) collectAsState22.getValue();
            changedInstance4 = startRestartGroup.changedInstance(allTransactionsMviViewModel4);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.m20321$r8$lambda$FsqqknT5lb9zObSYuRGZ2LuJ90(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) rememberedValue3;
            changedInstance5 = startRestartGroup.changedInstance(allTransactionsMviViewModel4);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changedInstance5) {
            }
            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.$r8$lambda$TTJrvWqqhW7ja5b6LWB3c48puLo(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.this, ((java.lang.Integer) obj).intValue());
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
            changedInstance6 = startRestartGroup.changedInstance(allTransactionsMviViewModel4);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changedInstance6) {
            }
            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.$r8$lambda$uY0DCsuulft3afM3UiHuv0TfK68(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.this, ((java.lang.Integer) obj).intValue());
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            kotlin.jvm.functions.Function1 function122 = (kotlin.jvm.functions.Function1) rememberedValue5;
            changedInstance7 = startRestartGroup.changedInstance(allTransactionsMviViewModel4);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changedInstance7) {
            }
            rememberedValue6 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.m20322$r8$lambda$KH6RkDrywBoWEasOPnvwNjRtQ(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.this, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue6);
            kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue6;
            changedInstance8 = startRestartGroup.changedInstance(allTransactionsMviViewModel4);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (!changedInstance8) {
            }
            rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.m20324$r8$lambda$ecv063y6bOp8jw0mbdu3DpYyfM(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue7);
            kotlin.jvm.functions.Function0 function032 = (kotlin.jvm.functions.Function0) rememberedValue7;
            changedInstance9 = startRestartGroup.changedInstance(allTransactionsMviViewModel4);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (!changedInstance9) {
            }
            rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.$r8$lambda$2hm6Qu3ODL1r2yTUe0UPwZk4OaY(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue8);
            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel52 = allTransactionsMviViewModel4;
            AllTransactionsContent(allTransactionsUiState2, downloadUiState2, modifier4, function0, function022, function13, function122, function22, function032, (kotlin.jvm.functions.Function0) rememberedValue8, startRestartGroup, ((i6 << 6) & 896) | ((i6 << 3) & 7168), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
            allTransactionsMviViewModel3 = allTransactionsMviViewModel52;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            allTransactionsMviViewModel3 = allTransactionsMviViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.m20325$r8$lambda$zzETc8SKk_FLUrqiivLBhSV0bw(androidx.compose.ui.Modifier.this, allTransactionsMviViewModel3, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AllTransactionsContent(final com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState allTransactionsUiState, final com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState downloadUiState, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function12, final kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> function2, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allTransactionsUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1907820740);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(allTransactionsUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(downloadUiState) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
            }
            if ((12582912 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
            }
            if ((100663296 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function03) ? 67108864 : 33554432;
            }
            if ((805306368 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function04) ? 536870912 : 268435456;
            }
            if (startRestartGroup.shouldExecute((306783379 & i3) == 306783378, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier2 = modifier;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1907820740, i3, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsContent (AllTransactionsScreen.kt:98)");
                }
                if (downloadUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Downloading) {
                    startRestartGroup.startReplaceGroup(585908605);
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.common.components.LoadingScreenComponentKt.LoadingScreenComponent(null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_all_transactions_loading_state_description, startRestartGroup, 0), startRestartGroup, 0, 1);
                    modifier3 = modifier4;
                    composer2 = startRestartGroup;
                } else if (downloadUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error) {
                    startRestartGroup.startReplaceGroup(586166525);
                    composer2 = startRestartGroup;
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.common.components.ErrorScreenComponentKt.ErrorScreenComponent(function03, function04, null, startRestartGroup, (i3 >> 24) & 126, 4);
                    modifier3 = modifier4;
                } else {
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    composer2 = startRestartGroup;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(downloadUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle.INSTANCE)) {
                        composer2.startReplaceGroup(586459909);
                        if ((allTransactionsUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.AccountCreationUnavailable) || (allTransactionsUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Error)) {
                            modifier3 = modifier5;
                            composer2.startReplaceGroup(586626875);
                            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer2, 48, 2);
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, background);
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
                            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportsErrorKt.TaxReportsError(function02, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter()), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), composer2, (i3 >> 12) & 14, 0);
                            com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_all_transactions_top_nav_title, composer2, 0), null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-167684718, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.$r8$lambda$w18GhlrGJX8_49PCKp8SattH4h0(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, composer2, 54), null, composer2, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 94);
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(allTransactionsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.NoStatementsYet.INSTANCE)) {
                            composer2.startReplaceGroup(587637103);
                            androidx.compose.ui.Modifier background2 = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer2, 48, 2);
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, background2);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.NoStatementsYetContentKt.NoStatementsYetContent(androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter()), null, null, composer2, 0, 6);
                            com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_all_transactions_top_nav_title, composer2, 0), null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1209605253, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.$r8$lambda$xRGjtJRRh4Xu9BflPtisT7FV0Pk(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, composer2, 54), null, composer2, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 94);
                            composer2.endNode();
                            composer2.endReplaceGroup();
                            modifier3 = modifier5;
                        } else {
                            composer2.startReplaceGroup(588443940);
                            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
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
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            if (allTransactionsUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Content) {
                                composer2.startReplaceGroup(2133606246);
                                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_all_transactions_top_nav_title, composer2, 0), null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-907559258, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.m20323$r8$lambda$OkzSPktCgIzCurKBKtPiu5b94M(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                }, composer2, 54), null, composer2, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 94);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(2133976231);
                                composer2.endReplaceGroup();
                            }
                            int i5 = i3 >> 12;
                            modifier3 = modifier5;
                            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.AllTransactionsStateHostKt.AllTransactionsStateHost(allTransactionsUiState, function1, function12, function2, composer2, (i3 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168));
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        }
                    } else {
                        composer2.startReplaceGroup(-535287836);
                        composer2.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                composer2.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.$r8$lambda$hshwR5caZW9ERiVyLpyI114Wr5k(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.this, downloadUiState, modifier2, function0, function02, function1, function12, function2, function03, function04, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if ((100663296 & i) == 0) {
        }
        if ((805306368 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((306783379 & i3) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2hm6Qu3ODL1r2yTUe0UPwZk4OaY(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel) {
        allTransactionsMviViewModel.dismissDownloadError();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FsqqknT5lb9zObSYuRGZ2Lu-J90, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20321$r8$lambda$FsqqknT5lb9zObSYuRGZ2LuJ90(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel) {
        allTransactionsMviViewModel.process(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.RetryClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KH6RkDrywBo-WEasOPnvwNjRt-Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20322$r8$lambda$KH6RkDrywBoWEasOPnvwNjRtQ(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        allTransactionsMviViewModel.process(new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.DownloadMonthClicked(i, str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Okz-SPktCgIzCurKBKtPiu5b94M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20323$r8$lambda$OkzSPktCgIzCurKBKtPiu5b94M(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-907559258, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsContent.<anonymous>.<anonymous> (AllTransactionsScreen.kt:163)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton(function0, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TTJrvWqqhW7ja5b6LWB3c48puLo(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel, int i) {
        allTransactionsMviViewModel.process(new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.YearHeaderClicked(i));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$Z2QEfOynzn0rRfn3W6pUjq08nEg(final com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        allTransactionsMviViewModel.resetDownloadOrchestrator();
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$AllTransactionsScreen$lambda$3$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.this.resetDownloadOrchestrator();
            }
        };
    }

    /* renamed from: $r8$lambda$ecv0-63y6bOp8jw0mbdu3DpYyfM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20324$r8$lambda$ecv063y6bOp8jw0mbdu3DpYyfM(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel) {
        allTransactionsMviViewModel.retryDownload();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hshwR5caZW9ERiVyLpyI114Wr5k(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState allTransactionsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState downloadUiState, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AllTransactionsContent(allTransactionsUiState, downloadUiState, modifier, function0, function02, function1, function12, function2, function03, function04, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uY0DCsuulft3afM3UiHuv0TfK68(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel, int i) {
        allTransactionsMviViewModel.process(new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.DownloadYearClicked(i));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$w18GhlrGJX8_49PCKp8SattH4h0(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-167684718, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsContent.<anonymous>.<anonymous> (AllTransactionsScreen.kt:133)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton(function0, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xRGjtJRRh4Xu9BflPtisT7FV0Pk(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1209605253, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsContent.<anonymous>.<anonymous> (AllTransactionsScreen.kt:151)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton(function0, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zzETc8-SKk_FLUrqiivLBhSV0bw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20325$r8$lambda$zzETc8SKk_FLUrqiivLBhSV0bw(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AllTransactionsScreen(modifier, allTransactionsMviViewModel, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
