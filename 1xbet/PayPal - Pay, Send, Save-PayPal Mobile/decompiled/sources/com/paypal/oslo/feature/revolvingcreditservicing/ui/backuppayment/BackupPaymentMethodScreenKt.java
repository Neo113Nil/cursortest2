package com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a[\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0003¢\u0006\u0002\u0010\u0013\u001ai\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001f²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"BackupPaymentMethodScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodViewModel;Landroidx/compose/runtime/Composer;II)V", "BackupPaymentMethodScreenContent", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "uiState", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodState;", "onFundingInstrumentClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentUiModel;", "onLinkBankClick", "Lkotlin/Function0;", "onDontSeeBankClick", "onTryAgainClick", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ScreenBody", "fundingInstruments", "", "showError", "", "(Ljava/util/List;Lcom/paypal/pds/components/BottomSheetController;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BackupPaymentMethodScreenContentInitialStatePreview", "(Landroidx/compose/runtime/Composer;I)V", "BackupPaymentMethodScreenContentLoadingStatePreview", "BackupPaymentMethodScreenContentReadyStatePreview", "BackupPaymentMethodScreenContentErrorStatePreview", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BackupPaymentMethodScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BackupPaymentMethodScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel backupPaymentMethodViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel backupPaymentMethodViewModel2;
        androidx.compose.runtime.Composer composer2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        java.lang.Object rememberedValue;
        boolean changedInstance;
        boolean changedInstance2;
        int i5;
        boolean changed;
        java.lang.Object rememberedValue2;
        final com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel backupPaymentMethodViewModel3;
        ?? r6;
        androidx.compose.runtime.Composer composer3;
        boolean changedInstance3;
        java.lang.Object rememberedValue3;
        boolean changedInstance4;
        java.lang.Object rememberedValue4;
        boolean changedInstance5;
        java.lang.Object rememberedValue5;
        boolean changedInstance6;
        java.lang.Object rememberedValue6;
        boolean changedInstance7;
        java.lang.Object rememberedValue7;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1257029967);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                backupPaymentMethodViewModel2 = backupPaymentMethodViewModel;
                if (startRestartGroup.changedInstance(backupPaymentMethodViewModel2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                backupPaymentMethodViewModel2 = backupPaymentMethodViewModel;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            backupPaymentMethodViewModel2 = backupPaymentMethodViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            } else if ((i2 & 2) != 0) {
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
                i4 = 0;
                backupPaymentMethodViewModel2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i3 &= -113;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1257029967, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreen (BackupPaymentMethodScreen.kt:60)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(backupPaymentMethodViewModel2.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
                java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(backupPaymentMethodViewModel2);
                changedInstance2 = startRestartGroup.changedInstance(bottomSheetController);
                i5 = (i3 & 14) != 4 ? 1 : i4;
                changed = startRestartGroup.changed(rememberNavResultRequestId);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (((changedInstance ? 1 : 0) | (changedInstance2 ? 1 : 0) | i5 | (changed ? 1 : 0)) == 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    backupPaymentMethodViewModel3 = backupPaymentMethodViewModel2;
                    r6 = i4;
                    composer3 = startRestartGroup;
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1(backupPaymentMethodViewModel2, bottomSheetController, appNavigator, rememberNavResultRequestId, null);
                    composer3.updateRememberedValue(rememberedValue2);
                } else {
                    backupPaymentMethodViewModel3 = backupPaymentMethodViewModel2;
                    r6 = i4;
                    composer3 = startRestartGroup;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer3, 6);
                changedInstance3 = composer3.changedInstance(backupPaymentMethodViewModel3);
                rememberedValue3 = composer3.rememberedValue();
                if (!changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.m18309$r8$lambda$Z2XJaH80LH7s6wjdP8vIZuXsIw(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.this);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue3);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(r6, (kotlin.jvm.functions.Function0) rememberedValue3, composer3, r6, 1);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState backupPaymentMethodState = (com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState) collectAsStateWithLifecycle.getValue();
                changedInstance4 = composer3.changedInstance(backupPaymentMethodViewModel3);
                rememberedValue4 = composer3.rememberedValue();
                if (!changedInstance4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.$r8$lambda$wgCbbyljpUGQz8TYw10rbUWc4PM(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel) obj);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
                changedInstance5 = composer3.changedInstance(backupPaymentMethodViewModel3);
                rememberedValue5 = composer3.rememberedValue();
                if (!changedInstance5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.$r8$lambda$_MGUO3hFaywJOJAC3d8BFDgIfzA(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.this);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue5);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue5;
                changedInstance6 = composer3.changedInstance(backupPaymentMethodViewModel3);
                rememberedValue6 = composer3.rememberedValue();
                if (!changedInstance6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.$r8$lambda$ef3oMaMZCf3xKknqYU7tJgB93yw(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.this);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue6);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue6;
                changedInstance7 = composer3.changedInstance(backupPaymentMethodViewModel3);
                rememberedValue7 = composer3.rememberedValue();
                if (!changedInstance7 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.$r8$lambda$NpYeoKRWMoiKaAbHIpJX6WFii1U(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.this);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue7);
                }
                composer2 = composer3;
                backupPaymentMethodViewModel2 = backupPaymentMethodViewModel3;
                getHighSpeedVideoFpsRanges(bottomSheetController, backupPaymentMethodState, function1, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue7, composer2, com.paypal.pds.components.BottomSheetController.$stable);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            i4 = 0;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(backupPaymentMethodViewModel2.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(backupPaymentMethodViewModel2);
            changedInstance2 = startRestartGroup.changedInstance(bottomSheetController2);
            if ((i3 & 14) != 4) {
            }
            changed = startRestartGroup.changed(rememberNavResultRequestId2);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (((changedInstance ? 1 : 0) | (changedInstance2 ? 1 : 0) | i5 | (changed ? 1 : 0)) == 0) {
            }
            backupPaymentMethodViewModel3 = backupPaymentMethodViewModel2;
            r6 = i4;
            composer3 = startRestartGroup;
            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1(backupPaymentMethodViewModel2, bottomSheetController2, appNavigator, rememberNavResultRequestId2, null);
            composer3.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer3, 6);
            changedInstance3 = composer3.changedInstance(backupPaymentMethodViewModel3);
            rememberedValue3 = composer3.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.m18309$r8$lambda$Z2XJaH80LH7s6wjdP8vIZuXsIw(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.this);
                }
            };
            composer3.updateRememberedValue(rememberedValue3);
            androidx.view.compose.BackHandlerKt.BackHandler(r6, (kotlin.jvm.functions.Function0) rememberedValue3, composer3, r6, 1);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState backupPaymentMethodState2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState) collectAsStateWithLifecycle2.getValue();
            changedInstance4 = composer3.changedInstance(backupPaymentMethodViewModel3);
            rememberedValue4 = composer3.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.$r8$lambda$wgCbbyljpUGQz8TYw10rbUWc4PM(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel) obj);
                }
            };
            composer3.updateRememberedValue(rememberedValue4);
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
            changedInstance5 = composer3.changedInstance(backupPaymentMethodViewModel3);
            rememberedValue5 = composer3.rememberedValue();
            if (!changedInstance5) {
            }
            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.$r8$lambda$_MGUO3hFaywJOJAC3d8BFDgIfzA(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.this);
                }
            };
            composer3.updateRememberedValue(rememberedValue5);
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue5;
            changedInstance6 = composer3.changedInstance(backupPaymentMethodViewModel3);
            rememberedValue6 = composer3.rememberedValue();
            if (!changedInstance6) {
            }
            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.$r8$lambda$ef3oMaMZCf3xKknqYU7tJgB93yw(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.this);
                }
            };
            composer3.updateRememberedValue(rememberedValue6);
            kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) rememberedValue6;
            changedInstance7 = composer3.changedInstance(backupPaymentMethodViewModel3);
            rememberedValue7 = composer3.rememberedValue();
            if (!changedInstance7) {
            }
            rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.$r8$lambda$NpYeoKRWMoiKaAbHIpJX6WFii1U(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.this);
                }
            };
            composer3.updateRememberedValue(rememberedValue7);
            composer2 = composer3;
            backupPaymentMethodViewModel2 = backupPaymentMethodViewModel3;
            getHighSpeedVideoFpsRanges(bottomSheetController2, backupPaymentMethodState2, function12, function03, function022, (kotlin.jvm.functions.Function0) rememberedValue7, composer2, com.paypal.pds.components.BottomSheetController.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.$r8$lambda$bgEuHghrNtzms56aliOUExSgS5A(com.paypal.oslo.core.navigation.AppNavigator.this, backupPaymentMethodViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState backupPaymentMethodState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(348968916);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(backupPaymentMethodState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(348968916, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenContent (BackupPaymentMethodScreen.kt:167)");
            }
            if ((backupPaymentMethodState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState.Initial) || (backupPaymentMethodState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState.Loading)) {
                startRestartGroup.startReplaceGroup(351690788);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.loading.LoadingContentKt.LoadingContent(null, startRestartGroup, 0, 1);
                startRestartGroup.endReplaceGroup();
            } else if (backupPaymentMethodState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState.Ready) {
                startRestartGroup.startReplaceGroup(351692372);
                int i3 = i2 << 3;
                getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState.Ready) backupPaymentMethodState).getFundingInstruments(), bottomSheetController, false, function1, function0, function02, function03, startRestartGroup, (57344 & i3) | (com.paypal.pds.components.BottomSheetController.$stable << 3) | 384 | (i3 & 112) | (i3 & 7168) | (458752 & i3) | (i3 & 3670016));
                startRestartGroup.endReplaceGroup();
            } else {
                if (!(backupPaymentMethodState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState.Error)) {
                    startRestartGroup.startReplaceGroup(351689761);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(351705348);
                int i4 = i2 << 3;
                getHighSpeedVideoFpsRangesFor(kotlin.collections.CollectionsKt.emptyList(), bottomSheetController, true, function1, function0, function02, function03, startRestartGroup, (57344 & i4) | (com.paypal.pds.components.BottomSheetController.$stable << 3) | 390 | (i4 & 112) | (i4 & 7168) | (458752 & i4) | (i4 & 3670016));
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.$r8$lambda$kxcNJGw6Yz86L1xW55XrHNAGQ5E(com.paypal.pds.components.BottomSheetController.this, backupPaymentMethodState, function1, function0, function02, function03, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel> list, final com.paypal.pds.components.BottomSheetController bottomSheetController, final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1627261860);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 1048576 : 524288;
        }
        if (!startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1627261860, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.ScreenBody (BackupPaymentMethodScreen.kt:203)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            int i3 = i2 >> 3;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt.FundingInstrumentSection(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel(list, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_add_backup_payment_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_add_backup_payment_tip_message, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), z, false, 16, null), bottomSheetController, function1, function0, function02, function03, startRestartGroup, (458752 & i3) | (i2 & 112) | (com.paypal.pds.components.BottomSheetController.$stable << 3) | (i3 & 896) | (i3 & 7168) | (57344 & i3));
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.$r8$lambda$IRwcgDRROCUa41jBiCw7RglNkIs(list, bottomSheetController, z, function1, function0, function02, function03, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3nbjQq8FOI_F6lbWz7T0qBEHPig(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IRwcgDRROCUa41jBiCw7RglNkIs(java.util.List list, com.paypal.pds.components.BottomSheetController bottomSheetController, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(list, bottomSheetController, z, function1, function0, function02, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MSyMcEv8nHss8oQ-liM6rNiAm7Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18305$r8$lambda$MSyMcEv8nHss8oQliM6rNiAm7Y(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1137716652);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1137716652, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenContentLoadingStatePreview (BackupPaymentMethodScreen.kt:246)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState.Loading loading = com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState.Loading.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.m18310$r8$lambda$iRP43zWuOGC3MFx1mrHSobtWA((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda7
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
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            getHighSpeedVideoFpsRanges(bottomSheetController, loading, function1, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 224688);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.m18305$r8$lambda$MSyMcEv8nHss8oQliM6rNiAm7Y(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NpYeoKRWMoiKaAbHIpJX6WFii1U(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel backupPaymentMethodViewModel) {
        backupPaymentMethodViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEvent.OnTryAgainClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OUA9SASDsfsZgHg3p2iMRgOzecg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1113405829);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1113405829, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenContentReadyStatePreview (BackupPaymentMethodScreen.kt:262)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState.Ready(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel("0", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Bank of America"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Checking ••8644"), "https://icon-url", null, null, null, null, false, null, null, null, null, 8176, null)));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.$r8$lambda$3nbjQq8FOI_F6lbWz7T0qBEHPig((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda2
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
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            getHighSpeedVideoFpsRanges(bottomSheetController, ready, function1, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 224640);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.$r8$lambda$OUA9SASDsfsZgHg3p2iMRgOzecg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PTOo5iV3fndTCAb5FVgWSeI4-Ks, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18306$r8$lambda$PTOo5iV3fndTCAb5FVgWSeI4Ks(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PxGCE4csqDLBDiXRakdoqkphhzc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-600711520);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-600711520, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenContentErrorStatePreview (BackupPaymentMethodScreen.kt:287)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState.Error error = com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState.Error.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.m18308$r8$lambda$WDKrAbgGufhzBDGqJcgIBLDVgA((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda11
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
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            getHighSpeedVideoFpsRanges(bottomSheetController, error, function1, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 224688);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.$r8$lambda$PxGCE4csqDLBDiXRakdoqkphhzc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$T6O3RmqD3jsXQjDzKiK1anzhyoM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-9769380);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-9769380, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenContentInitialStatePreview (BackupPaymentMethodScreen.kt:230)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState.Initial initial = com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState.Initial.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.m18306$r8$lambda$PTOo5iV3fndTCAb5FVgWSeI4Ks((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda24
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
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            getHighSpeedVideoFpsRanges(bottomSheetController, initial, function1, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 224688);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.$r8$lambda$T6O3RmqD3jsXQjDzKiK1anzhyoM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WDKrAbgGufhzBDGqJcgIB-LDVgA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18308$r8$lambda$WDKrAbgGufhzBDGqJcgIBLDVgA(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Z2XJaH80L-H7s6wjdP8vIZuXsIw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18309$r8$lambda$Z2XJaH80LH7s6wjdP8vIZuXsIw(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel backupPaymentMethodViewModel) {
        backupPaymentMethodViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEvent.OnBackPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_MGUO3hFaywJOJAC3d8BFDgIfzA(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel backupPaymentMethodViewModel) {
        backupPaymentMethodViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEvent.OnLinkBankClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bgEuHghrNtzms56aliOUExSgS5A(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel backupPaymentMethodViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BackupPaymentMethodScreen(appNavigator, backupPaymentMethodViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ef3oMaMZCf3xKknqYU7tJgB93yw(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel backupPaymentMethodViewModel) {
        backupPaymentMethodViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEvent.OnDontSeeBankClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$iRP43zWuOGC3-MFx-1mrHSobtWA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18310$r8$lambda$iRP43zWuOGC3MFx1mrHSobtWA(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kxcNJGw6Yz86L1xW55XrHNAGQ5E(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState backupPaymentMethodState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(bottomSheetController, backupPaymentMethodState, function1, function0, function02, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wgCbbyljpUGQz8TYw10rbUWc4PM(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel backupPaymentMethodViewModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        backupPaymentMethodViewModel.processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEvent.OnFundingInstrumentSelected(fundingInstrumentUiModel));
        return kotlin.Unit.INSTANCE;
    }
}
