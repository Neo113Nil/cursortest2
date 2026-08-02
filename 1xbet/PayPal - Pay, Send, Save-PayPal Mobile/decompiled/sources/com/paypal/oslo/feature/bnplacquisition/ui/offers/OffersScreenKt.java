package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a?\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0002\u0010\u0013\u001a1\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000fH\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"PreviewInstallmentAmount", "", com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.ScreenNames.OFFERS_SCREEN, "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "sharedViewModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/shared/BnplAcquisitionSharedViewModel;", "viewModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/bnplacquisition/ui/shared/BnplAcquisitionSharedViewModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersViewModel;Landroidx/compose/runtime/Composer;II)V", "OffersContent", "uiState", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "experienceSessionId", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "SuccessContent", "uiModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;", "showError", "", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "OffersScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "bnpl-acquisition_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OffersScreenKt {
    /* JADX WARN: Type inference failed for: r5v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    public static final void OffersScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel2;
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel3;
        final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel3;
        boolean z;
        int i4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty2;
        ?? r5;
        int i5;
        com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel4;
        com.paypal.pds.components.BottomSheetController bottomSheetController;
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel4;
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$OffersScreen$5$1 offersScreenKt$OffersScreen$5$1;
        int i6;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2127221736);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                bnplAcquisitionSharedViewModel2 = bnplAcquisitionSharedViewModel;
                if (startRestartGroup.changedInstance(bnplAcquisitionSharedViewModel2)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                bnplAcquisitionSharedViewModel2 = bnplAcquisitionSharedViewModel;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            bnplAcquisitionSharedViewModel2 = bnplAcquisitionSharedViewModel;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                offersViewModel2 = offersViewModel;
                if (startRestartGroup.changedInstance(offersViewModel2)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                offersViewModel2 = offersViewModel;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            offersViewModel2 = offersViewModel;
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
                    z = false;
                    i4 = 1;
                    bnplAcquisitionSharedViewModel2 = (com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty2, startRestartGroup, 0, 0);
                    i3 &= -113;
                } else {
                    z = false;
                    i4 = 1;
                }
                r5 = z;
                if ((i2 & 4) != 0) {
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
                    offersViewModel2 = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel.class), current2, (java.lang.String) null, createHiltViewModelFactory2, empty, startRestartGroup, 0, 0);
                    i3 &= -897;
                    r5 = z;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                r5 = 0;
                i4 = 1;
            }
            final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel5 = offersViewModel2;
            com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel5 = bnplAcquisitionSharedViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2127221736, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreen (OffersScreen.kt:102)");
            }
            final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(offersViewModel5.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController3 = (com.paypal.pds.components.BottomSheetController) rememberedValue2;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(bnplAcquisitionSharedViewModel5);
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$OffersScreen$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$OffersScreen$1$1(bnplAcquisitionSharedViewModel5, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
            boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController2);
            boolean changedInstance3 = startRestartGroup.changedInstance(bottomSheetController3);
            boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
            boolean changedInstance4 = startRestartGroup.changedInstance(offersViewModel5);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changedInstance2 | changedInstance3 | changed | changedInstance4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.$r8$lambda$laJgSnkVcpIvpxWjJBQqK7Gy1_I(com.paypal.pds.components.BottomSheetController.this, bottomSheetController3, offersViewModel5, collectAsStateWithLifecycle);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.view.compose.BackHandlerKt.BackHandler(r5, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, r5, i4);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changedInstance5 = startRestartGroup.changedInstance(bnplAcquisitionSharedViewModel5);
            boolean changedInstance6 = startRestartGroup.changedInstance(offersViewModel5);
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$OffersScreen$3$1 rememberedValue5 = startRestartGroup.rememberedValue();
            if ((changedInstance5 | changedInstance6) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$OffersScreen$3$1(bnplAcquisitionSharedViewModel5, offersViewModel5, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            boolean changed2 = startRestartGroup.changed(collectAsStateWithLifecycle);
            boolean changedInstance7 = startRestartGroup.changedInstance(offersViewModel5);
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$OffersScreen$4$1 rememberedValue6 = startRestartGroup.rememberedValue();
            if ((changed2 | changedInstance7) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$OffersScreen$4$1(collectAsStateWithLifecycle, offersViewModel5, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 6);
            boolean changedInstance8 = startRestartGroup.changedInstance(offersViewModel5);
            boolean changedInstance9 = startRestartGroup.changedInstance(bnplAcquisitionSharedViewModel5);
            if ((i3 & 14) != 4) {
                i4 = r5;
            }
            boolean changedInstance10 = startRestartGroup.changedInstance(bottomSheetController2);
            boolean changedInstance11 = startRestartGroup.changedInstance(bottomSheetController3);
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (((changedInstance8 ? 1 : 0) | (changedInstance9 ? 1 : 0) | i4 | (changedInstance10 ? 1 : 0) | (changedInstance11 ? 1 : 0)) != 0 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i5 = i3;
                bnplAcquisitionSharedViewModel4 = bnplAcquisitionSharedViewModel5;
                bottomSheetController = bottomSheetController2;
                offersViewModel4 = offersViewModel5;
                composer2 = startRestartGroup;
                offersScreenKt$OffersScreen$5$1 = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$OffersScreen$5$1(offersViewModel5, bnplAcquisitionSharedViewModel5, appNavigator, bottomSheetController2, bottomSheetController3, null);
                composer2.updateRememberedValue(offersScreenKt$OffersScreen$5$1);
            } else {
                bnplAcquisitionSharedViewModel4 = bnplAcquisitionSharedViewModel5;
                composer2 = startRestartGroup;
                offersScreenKt$OffersScreen$5$1 = rememberedValue7;
                bottomSheetController = bottomSheetController2;
                i5 = i3;
                offersViewModel4 = offersViewModel5;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(offersViewModel4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) offersScreenKt$OffersScreen$5$1, composer2, (i5 >> 6) & 14);
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState offersUiState = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState) collectAsStateWithLifecycle.getValue();
            boolean changedInstance12 = composer2.changedInstance(offersViewModel4);
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$OffersScreen$6$1 rememberedValue8 = composer2.rememberedValue();
            if (changedInstance12 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$OffersScreen$6$1(offersViewModel4);
                composer2.updateRememberedValue(rememberedValue8);
            }
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel = null;
            com.paypal.pds.components.BottomSheetController bottomSheetController4 = bottomSheetController;
            final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel6 = offersViewModel4;
            OffersContent(offersUiState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue8), bnplAcquisitionSharedViewModel4.getAnalyticsFlowName$bnpl_acquisition_prodRelease(), bnplAcquisitionSharedViewModel4.getExperienceSessionId$bnpl_acquisition_prodRelease(), composer2, 0, 0);
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState offersUiState2 = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState) collectAsStateWithLifecycle.getValue();
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success success = offersUiState2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success ? (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success) offersUiState2 : null;
            if (success != null) {
                offersUiModel = success.getUiModel();
            }
            if (offersUiModel != null) {
                composer2.startReplaceGroup(183522478);
                java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(offersUiModel.getExitConfirmationContent().getTitle(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(offersUiModel.getExitConfirmationContent().getPrimaryButtonText(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                java.lang.String value3 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(offersUiModel.getExitConfirmationContent().getSecondaryButtonText(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                boolean changedInstance13 = composer2.changedInstance(offersViewModel6);
                java.lang.Object rememberedValue9 = composer2.rememberedValue();
                if (changedInstance13 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.$r8$lambda$6BZqaTBYWWCmMeD_MGVy1THD1jk(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue9);
                }
                com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationModalKt.ExitConfirmationModal(bottomSheetController4, value, value2, value3, (kotlin.jvm.functions.Function0) rememberedValue9, composer2, com.paypal.pds.components.BottomSheetController.$stable);
                com.paypal.oslo.feature.bnplacquisition.ui.common.components.EmoneyInfoModalKt.EmoneyInfoModal(com.paypal.oslo.core.commonui.utils.RefTextKt.value(offersUiModel.getEmoneyModalContent(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable), bottomSheetController3, composer2, com.paypal.pds.components.BottomSheetController.$stable << 3);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(183522477);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            offersViewModel3 = offersViewModel6;
            bnplAcquisitionSharedViewModel3 = bnplAcquisitionSharedViewModel4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            bnplAcquisitionSharedViewModel3 = bnplAcquisitionSharedViewModel2;
            offersViewModel3 = offersViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.$r8$lambda$XGGOv7lPhzqZm5Ji7vq7AzmBOpQ(com.paypal.oslo.core.navigation.AppNavigator.this, bnplAcquisitionSharedViewModel3, offersViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OffersContent(final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState offersUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent, kotlin.Unit> function1, java.lang.String str, java.lang.String str2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str3;
        int i4;
        java.lang.String str4;
        final java.lang.String str5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str6;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offersUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1641634557);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(offersUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            str3 = str;
            i3 |= startRestartGroup.changed(str3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str4 = str2;
                i3 |= startRestartGroup.changed(str4) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    str5 = str4;
                } else {
                    java.lang.String str7 = i5 != 0 ? "application" : str3;
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1641634557, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersContent (OffersScreen.kt:232)");
                    }
                    java.lang.String str8 = str4;
                    java.lang.String str9 = str7;
                    androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.systemBarsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2)), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.BUY_NOW_PAY_LATER, com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.UserIntent.FEATURE, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersAnalyticsConstants.ACTION), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(str9, str8)}));
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
                    if (kotlin.jvm.internal.Intrinsics.areEqual(offersUiState, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Initial.INSTANCE) || (offersUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Loading)) {
                        str6 = str8;
                        startRestartGroup.startReplaceGroup(-1168244592);
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.LoaderContentKt.LoaderContent(null, startRestartGroup, 0, 1);
                        startRestartGroup.endReplaceGroup();
                    } else if (offersUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success) {
                        startRestartGroup.startReplaceGroup(-1168151530);
                        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success) offersUiState;
                        getHighSpeedVideoFpsRanges(success.getUiModel(), success.getShowError(), function1, startRestartGroup, (i3 << 3) & 896);
                        startRestartGroup.endReplaceGroup();
                        str6 = str8;
                    } else if (offersUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Error) {
                        startRestartGroup.startReplaceGroup(-1167910412);
                        com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent = ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Error) offersUiState).getErrorContent();
                        int i6 = i3 & 112;
                        boolean z2 = i6 == 32;
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.m12410$r8$lambda$8jBMn1XgHF2B4xWiiUNWvFA4L8(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                        z = i6 == 32;
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.$r8$lambda$bOpkVhUnwaQ2hQEVTqivTvgQwAk(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        str6 = str8;
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenKt.ErrorScreen(errorContent, function0, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 28);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        str6 = str8;
                        if (!(offersUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Decline)) {
                            startRestartGroup.startReplaceGroup(-591876609);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        startRestartGroup.startReplaceGroup(-1167603512);
                        com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent = ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Decline) offersUiState).getDeclineContent();
                        int i7 = i3 & 112;
                        boolean z3 = i7 == 32;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.$r8$lambda$KuSlBT44hkDSS0oa9PiGz24U68w(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
                        z = i7 == 32;
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (z || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.m12411$r8$lambda$915PpIkxUiTHM2C_ULwGbNsLg(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenKt.ErrorScreen(declineContent, function02, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 0, 28);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    str3 = str9;
                    str5 = str6;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final java.lang.String str10 = str3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.m12409$r8$lambda$LeXcp2fZdgAHKJ1lhFMYdRg0sE(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.this, function1, str10, str5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str4 = str2;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str3 = str;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str4 = str2;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel, final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1322184703);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(offersUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1322184703, i2, -1, "com.paypal.oslo.feature.bnplacquisition.ui.offers.SuccessContent (OffersScreen.kt:296)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
            java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(offersUiModel.getToolBarContent().getBackButtonLabel(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(offersUiModel.getToolBarContent().getCloseButtonLabel(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            boolean z2 = (i2 & 896) == 256;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.$r8$lambda$H_dbnkqH6WVXwGD0_kvrURg7Dk8(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarKt.ToolBar(value, value2, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue, false, startRestartGroup, 0, 92);
            com.paypal.pds.components.DockKt.Dock(null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(266168296, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.$r8$lambda$Vy8Lk5AK2JeLvow2OkJwqPORixI(z, offersUiModel, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1918107641, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.$r8$lambda$2zeNxihDe04lo1DVwsEZ9emj68A(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel.this, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 27648, 7);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.$r8$lambda$5bl1Hk_vhyry2U7sMLlm4eGBVvk(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel.this, z, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-LeXcp2fZdgAHKJ1lhFMYdRg0sE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12409$r8$lambda$LeXcp2fZdgAHKJ1lhFMYdRg0sE(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState offersUiState, kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        OffersContent(offersUiState, function1, str, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2zeNxihDe04lo1DVwsEZ9emj68A(final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.util.ArrayList arrayList;
        java.lang.String value;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1918107641, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.offers.SuccessContent.<anonymous>.<anonymous> (OffersScreen.kt:326)");
            }
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
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
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            java.lang.String amount = offersUiModel.getAmount();
            java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(offersUiModel.getHeaderTitle(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            com.paypal.oslo.core.commonui.utils.RefText headerSubtitle = offersUiModel.getHeaderSubtitle();
            if (headerSubtitle == null) {
                composer.startReplaceGroup(1540861257);
                composer.endReplaceGroup();
                str = null;
            } else {
                composer.startReplaceGroup(-1889957448);
                java.lang.String value3 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(headerSubtitle, composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                composer.endReplaceGroup();
                str = value3;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.HeaderKt.Header(value2, null, amount, str, null, composer, 0, 18);
            if (offersUiModel.getShowSubtitleInfoButton()) {
                composer.startReplaceGroup(1540952243);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer, 0);
                com.paypal.oslo.core.commonui.utils.RefText subtitleButtonText = offersUiModel.getSubtitleButtonText();
                if (subtitleButtonText == null) {
                    composer.startReplaceGroup(1541174729);
                    composer.endReplaceGroup();
                    value = null;
                } else {
                    composer.startReplaceGroup(-1889947336);
                    value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(subtitleButtonText, composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                    composer.endReplaceGroup();
                }
                java.lang.String str5 = value == null ? "" : value;
                com.paypal.pds.core.Icon.Info info = com.paypal.pds.core.Icon.Info.INSTANCE;
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 2, null);
                boolean changed = composer.changed(function1);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.m12412$r8$lambda$eYXPe97MieV7EUzxxFTUy67ShE(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                str2 = "";
                com.paypal.pds.components.InlineButtonKt.InlineButton((kotlin.jvm.functions.Function0) rememberedValue, str5, m1708paddingVpY3zN4$default, null, info, false, composer, 24576, 40);
                composer.endReplaceGroup();
            } else {
                str2 = "";
                composer.startReplaceGroup(1541380849);
                composer.endReplaceGroup();
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing20()), composer, 0);
            composer.startReplaceGroup(-1889935018);
            java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem> offers = offersUiModel.getOffers();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(offers, 10));
            for (com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem offerItem : offers) {
                java.lang.String id = offerItem.getId();
                java.lang.String value4 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(offerItem.getTitle(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                java.lang.String value5 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(offerItem.getSubtitle(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                java.lang.String value6 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(offerItem.getTotalLabel(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                java.lang.String totalValue = offerItem.getTotalValue();
                com.paypal.oslo.core.commonui.utils.RefText badgeText = offerItem.getBadgeText();
                if (badgeText == null) {
                    composer.startReplaceGroup(1403303257);
                    composer.endReplaceGroup();
                    str3 = null;
                } else {
                    composer.startReplaceGroup(1153646504);
                    java.lang.String value7 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(badgeText, composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                    composer.endReplaceGroup();
                    str3 = value7;
                }
                com.paypal.oslo.core.commonui.utils.RefText aprLabel = offerItem.getAprLabel();
                if (aprLabel == null) {
                    composer.startReplaceGroup(1403366745);
                    composer.endReplaceGroup();
                    str4 = null;
                } else {
                    composer.startReplaceGroup(1153648552);
                    java.lang.String value8 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(aprLabel, composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                    composer.endReplaceGroup();
                    str4 = value8;
                }
                java.lang.String str6 = str4 == null ? str2 : str4;
                java.lang.String totalInterest = offerItem.getTotalInterest();
                java.lang.String str7 = totalInterest == null ? str2 : totalInterest;
                boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(offerItem.getId(), offersUiModel.getSelectedOfferId());
                composer.startReplaceGroup(-1889913772);
                java.util.List<com.paypal.oslo.core.commonui.utils.RefText> detailFields = offerItem.getDetailFields();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(detailFields, 10));
                java.util.Iterator<T> it = detailFields.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanDetailField(com.paypal.oslo.core.commonui.utils.RefTextKt.value((com.paypal.oslo.core.commonui.utils.RefText) it.next(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable), str2));
                }
                java.util.ArrayList arrayList4 = arrayList3;
                composer.endReplaceGroup();
                java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.offers.PaymentTimelineItem> timelineItems = offerItem.getTimelineItems();
                if (timelineItems == null) {
                    composer.startReplaceGroup(1403773279);
                    composer.endReplaceGroup();
                    arrayList = null;
                } else {
                    composer.startReplaceGroup(1403773280);
                    java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.offers.PaymentTimelineItem> list = timelineItems;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (com.paypal.oslo.feature.bnplacquisition.ui.offers.PaymentTimelineItem paymentTimelineItem : list) {
                        arrayList5.add(new com.paypal.pds.components.TimelineHorizontalItem(paymentTimelineItem.getState(), paymentTimelineItem.getAmountText(), com.paypal.oslo.core.commonui.utils.RefTextKt.value(paymentTimelineItem.getDateLabel(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, null, 24, null));
                    }
                    composer.endReplaceGroup();
                    arrayList = arrayList5;
                }
                arrayList2.add(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionItem(id, value4, value5, value6, totalValue, str6, str7, str3, arrayList4, arrayList, areEqual, offerItem.getAnalyticsComponentId()));
            }
            java.util.ArrayList arrayList6 = arrayList2;
            composer.endReplaceGroup();
            boolean changedInstance = composer.changedInstance(offersUiModel);
            boolean changed2 = composer.changed(function1);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changedInstance | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.$r8$lambda$CfotQOOgwAILllwdTFB1M3C9Hnw(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel.this, function1, ((java.lang.Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsKt.PlanOptions(arrayList6, (kotlin.jvm.functions.Function1) rememberedValue2, null, composer, 0, 4);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(offersUiModel.getFooter(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 2, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1016);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5bl1Hk_vhyry2U7sMLlm4eGBVvk(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel, boolean z, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(offersUiModel, z, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6BZqaTBYWWCmMeD_MGVy1THD1jk(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel) {
        offersViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ConfirmExitPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8jBMn1XgHF2B4-xWiiUNWvFA4L8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12410$r8$lambda$8jBMn1XgHF2B4xWiiUNWvFA4L8(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ErrorBackPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$915PpIkxUiTHM-2C_ULwGbNsL-g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12411$r8$lambda$915PpIkxUiTHM2C_ULwGbNsLg(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.DeclineClosePressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CfotQOOgwAILllwdTFB1M3C9Hnw(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel, kotlin.jvm.functions.Function1 function1, int i) {
        function1.invoke(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.OfferSelected(offersUiModel.getOffers().get(i).getId()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GhHDmwjsg0eb5OTQx3sHYSo5HOI(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Pressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H_dbnkqH6WVXwGD0_kvrURg7Dk8(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ClosePressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KuSlBT44hkDSS0oa9PiGz24U68w(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.DeclineClosePressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Vy8Lk5AK2JeLvow2OkJwqPORixI(boolean z, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(266168296, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.offers.SuccessContent.<anonymous>.<anonymous> (OffersScreen.kt:308)");
            }
            if (z) {
                composer.startReplaceGroup(910121339);
                com.paypal.pds.components.ContextualAlertKt.ContextualAlert(com.paypal.oslo.core.commonui.utils.RefTextKt.value(offersUiModel.getChoosePlanError(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 7, null), com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, composer, com.paypal.pds.components.ContextualAlertStyle.Negative.$stable << 6, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(910458650);
                composer.endReplaceGroup();
            }
            java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(offersUiModel.getContinueButtonText(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.$r8$lambda$GhHDmwjsg0eb5OTQx3sHYSo5HOI(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, value, fillMaxWidth$default, null, null, primary, large, false, false, composer, 1769856, 408);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XGGOv7lPhzqZm5Ji7vq7AzmBOpQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        OffersScreen(appNavigator, bnplAcquisitionSharedViewModel, offersViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bOpkVhUnwaQ2hQEVTqivTvgQwAk(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ClosePressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eYXPe9-7MieV7EUzxxFTUy67ShE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12412$r8$lambda$eYXPe97MieV7EUzxxFTUy67ShE(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.EmoneyInfoPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h5OBlnu_IhS95ZIfRgAn2okGokI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2073673873);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2073673873, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenPreview (OffersScreen.kt:397)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersPreviewData offersPreviewData = com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersPreviewData.INSTANCE;
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersPreviewData.getHighSpeedVideoFpsRangesFor();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.$r8$lambda$i_nrcqF_rkoWnGmzwX567QcBdTM((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor, false, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.$r8$lambda$h5OBlnu_IhS95ZIfRgAn2okGokI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$i_nrcqF_rkoWnGmzwX567QcBdTM(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent offersEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offersEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$laJgSnkVcpIvpxWjJBQqK7Gy1_I(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.pds.components.BottomSheetController bottomSheetController2, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel, androidx.compose.runtime.State state) {
        if (bottomSheetController.getVisible()) {
            bottomSheetController.hideSheet();
        } else if (bottomSheetController2.getVisible()) {
            bottomSheetController2.hideSheet();
        } else if (((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState) state.getValue()) instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success) {
            offersViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ClosePressed.INSTANCE);
        } else if (((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState) state.getValue()) instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Error) {
            offersViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ErrorBackPressed.INSTANCE);
        } else if (((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState) state.getValue()) instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Decline) {
            offersViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.DeclineClosePressed.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState access$OffersScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState) state.getValue();
    }
}
