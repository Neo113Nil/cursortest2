package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001aC\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012H\u0001¢\u0006\u0002\u0010\u0014\u001a3\u0010\u0015\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010\u001a\u001a\u001f\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001e¨\u0006 ²\u0006\n\u0010!\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.ScreenNames.REVIEW_PLAN_SCREEN, "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "sharedViewModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/shared/BnplAcquisitionSharedViewModel;", "viewModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/bnplacquisition/ui/shared/BnplAcquisitionSharedViewModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanViewModel;Landroidx/compose/runtime/Composer;II)V", "ReviewPlanScreenContent", "uiState", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiState;", "progress", "", "maxValue", "backgroundPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiState;FFLandroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SuccessContent", "reviewPlanUiModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ReviewPlanScreenBody", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ReviewPlanScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "ReviewPlanScreenTransitioningLoadingPreview", "bnpl-acquisition_prodRelease", "state"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReviewPlanScreenKt {
    public static final void ReviewPlanScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel2;
        final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel2;
        androidx.compose.runtime.Composer composer2;
        int i4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty2;
        androidx.compose.runtime.MutableFloatState mutableFloatState;
        androidx.compose.runtime.State state;
        com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Success success;
        androidx.compose.runtime.MutableFloatState mutableFloatState2;
        int i5;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1707983460);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                bnplAcquisitionSharedViewModel2 = bnplAcquisitionSharedViewModel;
                if (startRestartGroup.changedInstance(bnplAcquisitionSharedViewModel2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                bnplAcquisitionSharedViewModel2 = bnplAcquisitionSharedViewModel;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            bnplAcquisitionSharedViewModel2 = bnplAcquisitionSharedViewModel;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                reviewPlanViewModel2 = reviewPlanViewModel;
                if (startRestartGroup.changedInstance(reviewPlanViewModel2)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                reviewPlanViewModel2 = reviewPlanViewModel;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            reviewPlanViewModel2 = reviewPlanViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
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
                    i4 = 0;
                    bnplAcquisitionSharedViewModel2 = (com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty2, startRestartGroup, 0, 0);
                    i3 &= -113;
                } else {
                    i4 = 0;
                }
                if ((i2 & 4) != 0) {
                    androidx.view.ViewModelStoreOwner current2 = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current2 == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory2 = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current2, startRestartGroup, i4);
                    if (current2 instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    reviewPlanViewModel2 = (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel.class), current2, (java.lang.String) null, createHiltViewModelFactory2, empty, startRestartGroup, 0, 0);
                    i3 &= -897;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                i4 = 0;
            }
            final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel3 = reviewPlanViewModel2;
            com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel3 = bnplAcquisitionSharedViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1707983460, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreen (ReviewPlanScreen.kt:92)");
            }
            final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reviewPlanViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.MutableFloatState mutableFloatState3 = (androidx.compose.runtime.MutableFloatState) rememberedValue2;
            com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberAsyncImagePainter = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).data(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanTransitioningLoadingConstants.BACKGROUND_IMAGE_URL).build(), null, null, null, null, startRestartGroup, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30);
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(bnplAcquisitionSharedViewModel3);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$1$1(bnplAcquisitionSharedViewModel3, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
            boolean changedInstance2 = startRestartGroup.changedInstance(reviewPlanViewModel3);
            boolean changedInstance3 = startRestartGroup.changedInstance(bnplAcquisitionSharedViewModel3);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changedInstance2 | changedInstance3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$2$1(reviewPlanViewModel3, bnplAcquisitionSharedViewModel3, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue4;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, i4);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m12459invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m12459invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            int i7 = i3;
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, 3072);
            boolean changedInstance4 = startRestartGroup.changedInstance(bottomSheetController);
            boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
            boolean changedInstance5 = startRestartGroup.changedInstance(reviewPlanViewModel3);
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if ((changedInstance4 | changed | changedInstance5) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.$r8$lambda$4Wl5zaCoa8fRAQpX9dpjH0dgqbc(com.paypal.pds.components.BottomSheetController.this, reviewPlanViewModel3, collectAsStateWithLifecycle);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue6, startRestartGroup, 0, 1);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changed2 = startRestartGroup.changed(collectAsStateWithLifecycle);
            boolean changedInstance6 = startRestartGroup.changedInstance(bnplAcquisitionSharedViewModel3);
            boolean changedInstance7 = startRestartGroup.changedInstance(reviewPlanViewModel3);
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if ((changed2 | changedInstance6 | changedInstance7) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$4$1(bnplAcquisitionSharedViewModel3, collectAsStateWithLifecycle, reviewPlanViewModel3, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue7, startRestartGroup, 6);
            boolean z = ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState) collectAsStateWithLifecycle.getValue()) instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.TransitioningLoading;
            boolean changed3 = startRestartGroup.changed(z);
            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                mutableFloatState = mutableFloatState3;
                rememberedValue8 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$5$1(z, mutableFloatState, null);
                startRestartGroup.updateRememberedValue(rememberedValue8);
            } else {
                mutableFloatState = mutableFloatState3;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue8, startRestartGroup, 0);
            boolean changedInstance8 = startRestartGroup.changedInstance(reviewPlanViewModel3);
            boolean changedInstance9 = startRestartGroup.changedInstance(bottomSheetController);
            boolean changedInstance10 = startRestartGroup.changedInstance(bnplAcquisitionSharedViewModel3);
            boolean z2 = (i7 & 14) == 4;
            boolean changed4 = startRestartGroup.changed(rememberNavResultRequestId);
            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
            if ((changed4 || (changedInstance8 | changedInstance9 | changedInstance10 | z2)) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                state = collectAsStateWithLifecycle;
                success = null;
                mutableFloatState2 = mutableFloatState;
                rememberedValue9 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$6$1(reviewPlanViewModel3, bottomSheetController, bnplAcquisitionSharedViewModel3, appNavigator, rememberNavResultRequestId, null);
                startRestartGroup.updateRememberedValue(rememberedValue9);
            } else {
                state = collectAsStateWithLifecycle;
                mutableFloatState2 = mutableFloatState;
                success = null;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(reviewPlanViewModel3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue9, startRestartGroup, (i7 >> 6) & 14);
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState reviewPlanUiState = (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState) state.getValue();
            float floatValue = mutableFloatState2.getFloatValue();
            com.paypal.oslo.core.commonui.components.AsyncImagePainter asyncImagePainter = rememberAsyncImagePainter;
            boolean changedInstance11 = startRestartGroup.changedInstance(reviewPlanViewModel3);
            java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (changedInstance11 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$7$1(reviewPlanViewModel3);
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Success success2 = success;
            ReviewPlanScreenContent(reviewPlanUiState, floatValue, 100.0f, asyncImagePainter, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue10), startRestartGroup, 384);
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState reviewPlanUiState2 = (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState) state.getValue();
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Success success3 = reviewPlanUiState2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Success ? (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Success) reviewPlanUiState2 : success2;
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiModel uiModel = success3 != null ? success3.getUiModel() : success2;
            if (uiModel != null) {
                composer2.startReplaceGroup(63444148);
                java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(uiModel.getExitConfirmationContent().getTitle(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(uiModel.getExitConfirmationContent().getPrimaryButtonText(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                java.lang.String value3 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(uiModel.getExitConfirmationContent().getSecondaryButtonText(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                boolean changedInstance12 = composer2.changedInstance(reviewPlanViewModel3);
                java.lang.Object rememberedValue11 = composer2.rememberedValue();
                if (changedInstance12 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.$r8$lambda$7RvWo0DjQmSjC56MHceLr1EPGWc(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue11);
                }
                com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationModalKt.ExitConfirmationModal(bottomSheetController, value, value2, value3, (kotlin.jvm.functions.Function0) rememberedValue11, composer2, com.paypal.pds.components.BottomSheetController.$stable);
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                composer2.endReplaceGroup();
                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
            } else {
                composer2.startReplaceGroup(63444147);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            reviewPlanViewModel2 = reviewPlanViewModel3;
            bnplAcquisitionSharedViewModel2 = bnplAcquisitionSharedViewModel3;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.$r8$lambda$w3pbGhM4uMm73RmviVJQIjn1xcQ(com.paypal.oslo.core.navigation.AppNavigator.this, bnplAcquisitionSharedViewModel2, reviewPlanViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0304  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewPlanScreenContent(final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState reviewPlanUiState, final float f, final float f2, final androidx.compose.ui.graphics.painter.Painter painter, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPlanUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(832047144);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(reviewPlanUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? startRestartGroup.changed(painter) : startRestartGroup.changedInstance(painter) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(832047144, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenContent (ReviewPlanScreen.kt:266)");
            }
            if (reviewPlanUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.TransitioningLoading) {
                startRestartGroup.startReplaceGroup(1260446032);
                com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingKt.TransitioningLoading(f, f2, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.TransitioningLoading) reviewPlanUiState).getUiModel().getTransitioningLoadingContent(), painter, startRestartGroup, (androidx.compose.ui.graphics.painter.Painter.$stable << 9) | ((i3 >> 3) & 126) | (i3 & 7168), 0);
                startRestartGroup.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.$r8$lambda$k_C_CD0mrjQa4P5WWTlqBVdm9h4(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.this, f, f2, painter, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    endRestartGroup.updateScope(function2);
                }
                return;
            }
            startRestartGroup.startReplaceGroup(1260701658);
            startRestartGroup.endReplaceGroup();
            androidx.compose.ui.Modifier systemBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.systemBarsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2));
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, systemBarsPadding);
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
            if (kotlin.jvm.internal.Intrinsics.areEqual(reviewPlanUiState, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Initial.INSTANCE)) {
                startRestartGroup.startReplaceGroup(1236310706);
                startRestartGroup.endReplaceGroup();
            } else if (reviewPlanUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Success) {
                startRestartGroup.startReplaceGroup(-329019309);
                Camera2StreamConfigurationMap(function1, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Success) reviewPlanUiState).getUiModel(), null, startRestartGroup, (i3 >> 12) & 14, 4);
                startRestartGroup.endReplaceGroup();
            } else {
                if (reviewPlanUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Error) {
                    startRestartGroup.startReplaceGroup(-328812415);
                    com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent = ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Error) reviewPlanUiState).getErrorContent();
                    int i4 = i3 & 57344;
                    boolean z = i4 == 16384;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.$r8$lambda$G54UHY2t2HloKy3BLNeMYe5vCCU(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                    boolean z2 = i4 == 16384;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.m12457$r8$lambda$fPfKthVaz1xFn1bGJkTXhKghP0(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    composer2 = startRestartGroup;
                    com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenKt.ErrorScreen(errorContent, function0, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, composer2, 0, 28);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = startRestartGroup;
                    if (reviewPlanUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Decline) {
                        composer2.startReplaceGroup(-328494045);
                        com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent = ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Decline) reviewPlanUiState).getDeclineContent();
                        int i5 = i3 & 57344;
                        boolean z3 = i5 == 16384;
                        java.lang.Object rememberedValue3 = composer2.rememberedValue();
                        if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.m12458$r8$lambda$u3dPl9kSsqbYBiyB0id2WAWH8g(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
                        boolean z4 = i5 == 16384;
                        java.lang.Object rememberedValue4 = composer2.rememberedValue();
                        if (z4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.$r8$lambda$xRB1qnEAlWcQEvmK27sdGa9H5Fo(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue4);
                        }
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenKt.ErrorScreen(declineContent, function02, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue4, composer2, 0, 28);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(reviewPlanUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.NFCProvisioningError)) {
                            composer2.startReplaceGroup(1236310379);
                            composer2.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-328155897);
                        com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent2 = ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.NFCProvisioningError) reviewPlanUiState).getErrorContent();
                        boolean z5 = (i3 & 14) == 4;
                        int i6 = i3 & 57344;
                        boolean z6 = i6 == 16384;
                        java.lang.Object rememberedValue5 = composer2.rememberedValue();
                        if ((z6 | z5) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.$r8$lambda$e351tcMe3KLP5w5eNJIJVRZpLJM(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.this, function1);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue5);
                        }
                        kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue5;
                        boolean z7 = i6 == 16384;
                        java.lang.Object rememberedValue6 = composer2.rememberedValue();
                        if (z7 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.$r8$lambda$TzdLSBJgguS2nSRX4BBUKb85Xw0(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue6);
                        }
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenKt.ErrorScreen(errorContent2, function03, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue6, composer2, 0, 28);
                        composer2.endReplaceGroup();
                    }
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            composer2 = startRestartGroup;
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.m12456$r8$lambda$Z2dA5EZ9UB7goB3Zta07zJO4DY(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.this, f, f2, painter, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            };
            endRestartGroup.updateScope(function2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiModel reviewPlanUiModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1461122288);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(reviewPlanUiModel) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1461122288, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.SuccessContent (ReviewPlanScreen.kt:331)");
                }
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                startRestartGroup.startReplaceGroup(-1003410150);
                startRestartGroup.startReplaceGroup(212064437);
                startRestartGroup.endReplaceGroup();
                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new androidx.constraintlayout.compose.Measurer2(density);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.constraintlayout.compose.Measurer2 measurer2 = (androidx.constraintlayout.compose.Measurer2) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new androidx.constraintlayout.compose.ConstraintLayoutScope();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope = (androidx.constraintlayout.compose.ConstraintLayoutScope) rememberedValue2;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue3;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new androidx.constraintlayout.compose.ConstraintSetForInlineDsl(constraintLayoutScope);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                final androidx.constraintlayout.compose.ConstraintSetForInlineDsl constraintSetForInlineDsl = (androidx.constraintlayout.compose.ConstraintSetForInlineDsl) rememberedValue4;
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(kotlin.Unit.INSTANCE, androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue5;
                boolean changedInstance = startRestartGroup.changedInstance(measurer2);
                boolean changed = startRestartGroup.changed(257);
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if ((changedInstance | changed) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final int i5 = 257;
                    rememberedValue6 = (androidx.compose.ui.layout.MeasurePolicy) new androidx.compose.ui.layout.MeasurePolicy() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$$inlined$ConstraintLayout$2
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, final java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                            final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                            androidx.compose.runtime.MutableState.this.getValue();
                            long m8985performMeasureDjhGOtQ = measurer2.m8985performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i5);
                            mutableState.getValue();
                            int m8772getWidthimpl = androidx.compose.ui.unit.IntSize.m8772getWidthimpl(m8985performMeasureDjhGOtQ);
                            int m8771getHeightimpl = androidx.compose.ui.unit.IntSize.m8771getHeightimpl(m8985performMeasureDjhGOtQ);
                            final androidx.constraintlayout.compose.Measurer2 measurer22 = measurer2;
                            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8772getWidthimpl, m8771getHeightimpl, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$$inlined$ConstraintLayout$2.1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                    androidx.constraintlayout.compose.Measurer2.this.performLayout(placementScope, list, linkedHashMap);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            }, 4, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue6;
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$$inlined$ConstraintLayout$3
                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            invoke2();
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            androidx.compose.runtime.MutableState.this.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) r0.getValue()).booleanValue()));
                            constraintSetForInlineDsl.setKnownDirty(true);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue7;
                boolean changedInstance2 = startRestartGroup.changedInstance(measurer2);
                java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$$inlined$ConstraintLayout$4
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            androidx.constraintlayout.compose.ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, androidx.constraintlayout.compose.Measurer2.this);
                        }

                        {
                            super(1);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1706padding3ABfNKs, false, (kotlin.jvm.functions.Function1) rememberedValue8, 1, null), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1200550679, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$$inlined$ConstraintLayout$5
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        invoke(composer2, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer2, int i6) {
                        if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            androidx.compose.runtime.MutableState.this.setValue(kotlin.Unit.INSTANCE);
                            int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                            constraintLayoutScope.reset();
                            androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                            composer2.startReplaceGroup(1924611539);
                            androidx.constraintlayout.compose.ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope2.createRefs();
                            androidx.constraintlayout.compose.ConstrainedLayoutReference component1 = createRefs.component1();
                            androidx.constraintlayout.compose.ConstrainedLayoutReference component2 = createRefs.component2();
                            androidx.constraintlayout.compose.ConstrainedLayoutReference component3 = createRefs.component3();
                            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                            java.lang.Object rememberedValue9 = composer2.rememberedValue();
                            if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue9 = (kotlin.jvm.functions.Function1) com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$1$1$1.Camera2StreamConfigurationMap;
                                composer2.updateRememberedValue(rememberedValue9);
                            }
                            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(constraintLayoutScope2.constrainAs(companion, component1, (kotlin.jvm.functions.Function1) rememberedValue9), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenTestTag.TOOLBAR);
                            java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(reviewPlanUiModel.getToolBarContent().getBackButtonLabel(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                            java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(reviewPlanUiModel.getToolBarContent().getCloseButtonLabel(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                            boolean changed2 = composer2.changed(function1);
                            java.lang.Object rememberedValue10 = composer2.rememberedValue();
                            if (changed2 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue10 = (kotlin.jvm.functions.Function0) new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$1$2$1(function1);
                                composer2.updateRememberedValue(rememberedValue10);
                            }
                            com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarKt.ToolBar(value, value2, testTag, null, null, (kotlin.jvm.functions.Function0) rememberedValue10, false, composer2, 0, 88);
                            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                            boolean changed3 = composer2.changed(component1);
                            boolean changed4 = composer2.changed(component3);
                            java.lang.Object rememberedValue11 = composer2.rememberedValue();
                            if ((changed3 | changed4) || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue11 = (kotlin.jvm.functions.Function1) new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$1$3$1(component1, component3);
                                composer2.updateRememberedValue(rememberedValue11);
                            }
                            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(constraintLayoutScope2.constrainAs(companion2, component2, (kotlin.jvm.functions.Function1) rememberedValue11), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, verticalScroll$default);
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
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            com.paypal.oslo.feature.bnplacquisition.ui.common.components.HeaderKt.Header(com.paypal.oslo.core.commonui.utils.RefTextKt.value(reviewPlanUiModel.getPlanOptionReviewContent().getTitle(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenTestTag.HEADER), null, com.paypal.oslo.core.commonui.utils.RefTextKt.value(reviewPlanUiModel.getPlanOptionReviewContent().getSubtitle(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, composer2, 48, 20);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing20()), composer2, 0);
                            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.getHighSpeedVideoFpsRangesFor(reviewPlanUiModel, null, composer2, 0, 2);
                            composer2.endNode();
                            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterContent reviewPlanFooterContent = reviewPlanUiModel.getReviewPlanFooterContent();
                            boolean changed5 = composer2.changed(function1);
                            java.lang.Object rememberedValue12 = composer2.rememberedValue();
                            if (changed5 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue12 = (kotlin.jvm.functions.Function0) new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$1$5$1(function1);
                                composer2.updateRememberedValue(rememberedValue12);
                            }
                            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue12;
                            boolean changed6 = composer2.changed(function1);
                            java.lang.Object rememberedValue13 = composer2.rememberedValue();
                            if (changed6 || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue13 = (kotlin.jvm.functions.Function1) new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$1$6$1(function1);
                                composer2.updateRememberedValue(rememberedValue13);
                            }
                            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue13;
                            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                            java.lang.Object rememberedValue14 = composer2.rememberedValue();
                            if (rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue14 = (kotlin.jvm.functions.Function1) com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$1$7$1.getHighSpeedVideoFpsRangesFor;
                                composer2.updateRememberedValue(rememberedValue14);
                            }
                            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterKt.ReviewPlanFooter(reviewPlanFooterContent, function02, function12, androidx.compose.ui.platform.TestTagKt.testTag(constraintLayoutScope2.constrainAs(companion3, component3, (kotlin.jvm.functions.Function1) rememberedValue14), com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenTestTag.FOOTER), composer2, 0, 0);
                            composer2.endReplaceGroup();
                            if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                androidx.compose.runtime.EffectsKt.SideEffect(function0, composer2, 6);
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                }, startRestartGroup, 54), measurePolicy, startRestartGroup, 48, 0);
                startRestartGroup.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.$r8$lambda$1pdbABy4dVz_0Fh5ku_KW5Us3h8(kotlin.jvm.functions.Function1.this, reviewPlanUiModel, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiModel reviewPlanUiModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1046227004);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(reviewPlanUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1046227004, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenBody (ReviewPlanScreen.kt:400)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.PlanOptionReviewKt.PlanOptionReview(reviewPlanUiModel.getPlanOptionReviewContent(), null, startRestartGroup, 0, 2);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(reviewPlanUiModel.getLenderLabel(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenTestTag.LENDER_LABEL), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 384, 6, 1016);
                composer2 = startRestartGroup;
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
                com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.PaymentOptionReviewKt.PaymentOptionReview(reviewPlanUiModel.getPaymentOptionReviewContent(), null, composer2, 0, 2);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing20()), composer2, 0);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.$r8$lambda$sSmlMNLiNVSkhxdoZtuO3k4hgQU(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiModel.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1pdbABy4dVz_0Fh5ku_KW5Us3h8(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiModel reviewPlanUiModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(function1, reviewPlanUiModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4Wl5zaCoa8fRAQpX9dpjH0dgqbc(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel, androidx.compose.runtime.State state) {
        if (bottomSheetController.getVisible()) {
            bottomSheetController.hideSheet();
        } else if (((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState) state.getValue()) instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.NFCProvisioningError) {
            reviewPlanViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningErrorClosed.INSTANCE);
        } else if (((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState) state.getValue()) instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Success) {
            reviewPlanViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ClosePressed.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7RvWo0DjQmSjC56MHceLr1EPGWc(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel) {
        reviewPlanViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ConfirmExitPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7evn7tootR_Mk9Rd_ooBGwxshRM(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent reviewPlanEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPlanEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G54UHY2t2HloKy3BLNeMYe5vCCU(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ErrorBackPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MeBslJroURE2epsR3ui1jrvOQs0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1262437125);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1262437125, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenPreview (ReviewPlanScreen.kt:437)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanPreviewData reviewPlanPreviewData = com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanPreviewData.INSTANCE;
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Success success = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Success(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanPreviewData.getHighResolutionOutputSizeshNQ4ISI());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.$r8$lambda$7evn7tootR_Mk9Rd_ooBGwxshRM((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ReviewPlanScreenContent(success, 1.0f, 100.0f, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 28080);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.$r8$lambda$MeBslJroURE2epsR3ui1jrvOQs0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TzdLSBJgguS2nSRX4BBUKb85Xw0(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningErrorClosed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UQO8TqyWK0r55Gi31WMv12Sxacs(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent reviewPlanEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPlanEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Z2dA5EZ9U-B7goB3Zta07zJO4DY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12456$r8$lambda$Z2dA5EZ9UB7goB3Zta07zJO4DY(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState reviewPlanUiState, float f, float f2, androidx.compose.ui.graphics.painter.Painter painter, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        ReviewPlanScreenContent(reviewPlanUiState, f, f2, painter, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e351tcMe3KLP5w5eNJIJVRZpLJM(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState reviewPlanUiState, kotlin.jvm.functions.Function1 function1) {
        if (((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.NFCProvisioningError) reviewPlanUiState).getErrorContent().isRetryable()) {
            function1.invoke(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningRetryPressed.INSTANCE);
        } else {
            function1.invoke(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningGoToMyCardPressed.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fPfKthVaz1xFn1bGJkTXhKg-hP0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12457$r8$lambda$fPfKthVaz1xFn1bGJkTXhKghP0(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ClosePressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$k_C_CD0mrjQa4P5WWTlqBVdm9h4(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState reviewPlanUiState, float f, float f2, androidx.compose.ui.graphics.painter.Painter painter, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        ReviewPlanScreenContent(reviewPlanUiState, f, f2, painter, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$riDzmipBzktW7uA2G6SDNh3WIZw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(418811316);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(418811316, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenTransitioningLoadingPreview (ReviewPlanScreen.kt:461)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanPreviewData reviewPlanPreviewData = com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanPreviewData.INSTANCE;
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.TransitioningLoading transitioningLoading = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.TransitioningLoading(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanPreviewData.getHighResolutionOutputSizeshNQ4ISI());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.$r8$lambda$UQO8TqyWK0r55Gi31WMv12Sxacs((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ReviewPlanScreenContent(transitioningLoading, 1.0f, 100.0f, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 28080);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.$r8$lambda$riDzmipBzktW7uA2G6SDNh3WIZw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sSmlMNLiNVSkhxdoZtuO3k4hgQU(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiModel reviewPlanUiModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(reviewPlanUiModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$u3dPl9kSsqbYBiyB-0id2WAWH8g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12458$r8$lambda$u3dPl9kSsqbYBiyB0id2WAWH8g(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ClosePressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$w3pbGhM4uMm73RmviVJQIjn1xcQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ReviewPlanScreen(appNavigator, bnplAcquisitionSharedViewModel, reviewPlanViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xRB1qnEAlWcQEvmK27sdGa9H5Fo(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ClosePressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState access$ReviewPlanScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState) state.getValue();
    }
}
