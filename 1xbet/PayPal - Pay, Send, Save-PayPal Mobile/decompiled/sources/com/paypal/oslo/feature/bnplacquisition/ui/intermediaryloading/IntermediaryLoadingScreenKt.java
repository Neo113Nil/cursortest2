package com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.ScreenNames.INTERMEDIARY_LOADING_SCREEN, "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "paylaterSource", "", "viewModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingViewModel;", "sharedViewModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/shared/BnplAcquisitionSharedViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingViewModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/shared/BnplAcquisitionSharedViewModel;Landroidx/compose/runtime/Composer;II)V", "IntermediaryLoadingContent", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "IntermediaryLoadingScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "bnpl-acquisition_prodRelease", "uiState", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class IntermediaryLoadingScreenKt {
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    public static final void IntermediaryLoadingScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel intermediaryLoadingViewModel, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel intermediaryLoadingViewModel2;
        final com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel2;
        androidx.compose.runtime.Composer composer2;
        java.lang.String str2;
        boolean z;
        final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel intermediaryLoadingViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty2;
        ?? r2;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;
        com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$1$1 intermediaryLoadingScreenKt$IntermediaryLoadingScreen$1$1;
        androidx.compose.ui.Modifier modifier;
        com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$2$1 intermediaryLoadingScreenKt$IntermediaryLoadingScreen$2$1;
        int i4;
        com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel3;
        androidx.compose.runtime.Composer composer3;
        int i5;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-273997123);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                intermediaryLoadingViewModel2 = intermediaryLoadingViewModel;
                if (startRestartGroup.changedInstance(intermediaryLoadingViewModel2)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                intermediaryLoadingViewModel2 = intermediaryLoadingViewModel;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            intermediaryLoadingViewModel2 = intermediaryLoadingViewModel;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                bnplAcquisitionSharedViewModel2 = bnplAcquisitionSharedViewModel;
                if (startRestartGroup.changedInstance(bnplAcquisitionSharedViewModel2)) {
                    i5 = 2048;
                    i3 |= i5;
                }
            } else {
                bnplAcquisitionSharedViewModel2 = bnplAcquisitionSharedViewModel;
            }
            i5 = 1024;
            i3 |= i5;
        } else {
            bnplAcquisitionSharedViewModel2 = bnplAcquisitionSharedViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 1155) != 1154, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                java.lang.String str3 = (i2 & 2) != 0 ? null : str;
                if ((i2 & 4) != 0) {
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                    if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty2 = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        empty2 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    z = false;
                    i3 &= -897;
                    intermediaryLoadingViewModel2 = (com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty2, startRestartGroup, 0, 0);
                } else {
                    z = false;
                }
                if ((i2 & 8) != 0) {
                    androidx.view.ViewModelStoreOwner current2 = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current2 == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory2 = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current2, startRestartGroup, z ? 1 : 0);
                    if (current2 instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    bnplAcquisitionSharedViewModel2 = (com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel.class), current2, (java.lang.String) null, createHiltViewModelFactory2, empty, startRestartGroup, 0, 0);
                    i3 &= -7169;
                }
                intermediaryLoadingViewModel3 = intermediaryLoadingViewModel2;
                str2 = str3;
                r2 = z;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                str2 = str;
                intermediaryLoadingViewModel3 = intermediaryLoadingViewModel2;
                r2 = 0;
            }
            int i7 = i3;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-273997123, i7, -1, "com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreen (IntermediaryLoadingScreen.kt:43)");
            }
            final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(intermediaryLoadingViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, r2);
            boolean changedInstance = startRestartGroup.changedInstance(intermediaryLoadingViewModel3);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                navResultManager = null;
                intermediaryLoadingScreenKt$IntermediaryLoadingScreen$1$1 = new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$1$1(intermediaryLoadingViewModel3, null);
                startRestartGroup.updateRememberedValue(intermediaryLoadingScreenKt$IntermediaryLoadingScreen$1$1);
            } else {
                intermediaryLoadingScreenKt$IntermediaryLoadingScreen$1$1 = rememberedValue;
                navResultManager = null;
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) intermediaryLoadingScreenKt$IntermediaryLoadingScreen$1$1;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, startRestartGroup, r2);
            com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m12406invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m12406invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str4) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
                        return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str4);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance2 = startRestartGroup.changedInstance(bnplAcquisitionSharedViewModel2);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                modifier = null;
                intermediaryLoadingScreenKt$IntermediaryLoadingScreen$2$1 = new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$2$1(bnplAcquisitionSharedViewModel2, null);
                startRestartGroup.updateRememberedValue(intermediaryLoadingScreenKt$IntermediaryLoadingScreen$2$1);
            } else {
                intermediaryLoadingScreenKt$IntermediaryLoadingScreen$2$1 = rememberedValue3;
                modifier = null;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) intermediaryLoadingScreenKt$IntermediaryLoadingScreen$2$1, startRestartGroup, 6);
            boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
            boolean changedInstance3 = startRestartGroup.changedInstance(intermediaryLoadingViewModel3);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changed | changedInstance3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt.m12404$r8$lambda$HnvWEPOYyyjM2QEiv1WSOh04dE(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel.this, collectAsStateWithLifecycle);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.view.compose.BackHandlerKt.BackHandler(r2, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, r2, 1);
            boolean changedInstance4 = startRestartGroup.changedInstance(intermediaryLoadingViewModel3);
            boolean z2 = (i7 & 14) == 4 ? true : r2;
            boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId);
            boolean changedInstance5 = startRestartGroup.changedInstance(bnplAcquisitionSharedViewModel2);
            com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1 rememberedValue5 = startRestartGroup.rememberedValue();
            if (((changedInstance4 | z2 | changed2) || changedInstance5) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i4 = i7;
                bnplAcquisitionSharedViewModel3 = bnplAcquisitionSharedViewModel2;
                composer3 = startRestartGroup;
                rememberedValue5 = new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1(intermediaryLoadingViewModel3, appNavigator, rememberNavResultRequestId, bnplAcquisitionSharedViewModel2, null);
                composer3.updateRememberedValue(rememberedValue5);
            } else {
                i4 = i7;
                bnplAcquisitionSharedViewModel3 = bnplAcquisitionSharedViewModel2;
                composer3 = startRestartGroup;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(intermediaryLoadingViewModel3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, composer3, (i4 >> 6) & 14);
            com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState intermediaryLoadingUiState = (com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState) collectAsStateWithLifecycle.getValue();
            if (intermediaryLoadingUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState.Loading) {
                composer3.startReplaceGroup(-1318148583);
                getHighSpeedVideoFpsRanges(modifier, composer3, 0, 1);
                composer3.endReplaceGroup();
                composer2 = composer3;
                intermediaryLoadingViewModel2 = intermediaryLoadingViewModel3;
            } else if (intermediaryLoadingUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState.Error) {
                composer3.startReplaceGroup(2087150620);
                com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent = ((com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState.Error) intermediaryLoadingUiState).getErrorContent();
                boolean changedInstance6 = composer3.changedInstance(intermediaryLoadingViewModel3);
                java.lang.Object rememberedValue6 = composer3.rememberedValue();
                if (changedInstance6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt.$r8$lambda$F2uyUmS_LwhevjypWIlG9DJxJBA(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel.this);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue6);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue6;
                boolean changedInstance7 = composer3.changedInstance(intermediaryLoadingViewModel3);
                java.lang.Object rememberedValue7 = composer3.rememberedValue();
                if (changedInstance7 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt.m12403$r8$lambda$DTTytQeq5HtcZ9FTA_i3wI6KxI(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel.this);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue7);
                }
                composer2 = composer3;
                intermediaryLoadingViewModel2 = intermediaryLoadingViewModel3;
                com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenKt.ErrorScreen(errorContent, function0, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue7, composer2, 0, 28);
                composer2.endReplaceGroup();
            } else {
                androidx.compose.runtime.Composer composer4 = composer3;
                composer4.startReplaceGroup(-1318150650);
                composer4.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            bnplAcquisitionSharedViewModel2 = bnplAcquisitionSharedViewModel3;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            str2 = str;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final java.lang.String str4 = str2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt.$r8$lambda$sVvBnMkP4DMuQEPx7goGunShfZE(com.paypal.oslo.core.navigation.AppNavigator.this, str4, intermediaryLoadingViewModel2, bnplAcquisitionSharedViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2082124811);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2082124811, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingContent (IntermediaryLoadingScreen.kt:110)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.LoaderContentKt.LoaderContent(modifier, startRestartGroup, i3 & 14, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt.m12405$r8$lambda$JRVOVOxXl9pdf3DhK25KPobqVo(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$DTTytQeq5-HtcZ9FTA_i3wI6KxI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12403$r8$lambda$DTTytQeq5HtcZ9FTA_i3wI6KxI(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel intermediaryLoadingViewModel) {
        intermediaryLoadingViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ClosePressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EZozW2JQ4JL914l40QfrTTN6ifo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1874535259);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1874535259, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenPreview (IntermediaryLoadingScreen.kt:116)");
            }
            getHighSpeedVideoFpsRanges(null, startRestartGroup, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt.$r8$lambda$EZozW2JQ4JL914l40QfrTTN6ifo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F2uyUmS_LwhevjypWIlG9DJxJBA(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel intermediaryLoadingViewModel) {
        intermediaryLoadingViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ErrorBackPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HnvWEPOYy-yjM2QEiv1WSOh04dE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12404$r8$lambda$HnvWEPOYyyjM2QEiv1WSOh04dE(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel intermediaryLoadingViewModel, androidx.compose.runtime.State state) {
        if (((com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState) state.getValue()) instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState.Error) {
            intermediaryLoadingViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ErrorBackPressed.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JRVOVOxXl9pdf3DhK25-KPobqVo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12405$r8$lambda$JRVOVOxXl9pdf3DhK25KPobqVo(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sVvBnMkP4DMuQEPx7goGunShfZE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel intermediaryLoadingViewModel, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        IntermediaryLoadingScreen(appNavigator, str, intermediaryLoadingViewModel, bnplAcquisitionSharedViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
