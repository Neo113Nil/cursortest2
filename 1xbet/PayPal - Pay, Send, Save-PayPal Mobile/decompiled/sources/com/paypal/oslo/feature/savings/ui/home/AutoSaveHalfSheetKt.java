package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001aY\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0001¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u0018\u001a1\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0001¢\u0006\u0002\u0010\u001c\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u001d²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"MIN_LOADER_HEIGHT", "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "AutoSaveHalfSheet", "", "controller", "Lcom/paypal/pds/components/BottomSheetController;", "onAction", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/savings/ui/home/AutoSaveHalfSheetAction;", "viewModel", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/SavingsAutoSaveViewModel;", "(Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/SavingsAutoSaveViewModel;Landroidx/compose/runtime/Composer;II)V", "AutoSaveSheetContent", "uiState", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState;", "onSetUpClick", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "onManageClick", "onRetry", "Lkotlin/Function0;", "onDismiss", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AutoSaveLoadingContent", "(Landroidx/compose/runtime/Composer;I)V", "AutoSaveErrorContent", "errorType", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveErrorType;", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveErrorType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutoSaveHalfSheetKt {
    private static final float Camera2StreamConfigurationMap = com.paypal.pds.core.ConstantsKt.getSpacing128();

    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AutoSaveHalfSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction, kotlin.Unit> function1, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        int i5;
        final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel4;
        int i6;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        boolean changed;
        int i7;
        java.lang.Object rememberedValue2;
        int i8;
        java.lang.Object rememberedValue3;
        int i9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1254690235);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                savingsAutoSaveViewModel2 = savingsAutoSaveViewModel;
                if (startRestartGroup.changedInstance(savingsAutoSaveViewModel2)) {
                    i9 = 256;
                    i3 |= i9;
                }
            } else {
                savingsAutoSaveViewModel2 = savingsAutoSaveViewModel;
            }
            i9 = 128;
            i3 |= i9;
        } else {
            savingsAutoSaveViewModel2 = savingsAutoSaveViewModel;
        }
        int i10 = i3;
        if (startRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i10 &= -897;
                }
            } else if ((i2 & 4) != 0) {
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
                i5 = i10 & (-897);
                savingsAutoSaveViewModel4 = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1254690235, i5, -1, "com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheet (AutoSaveHalfSheet.kt:79)");
                }
                final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(savingsAutoSaveViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                boolean visible = bottomSheetController.getVisible();
                int i11 = i5 & 14;
                i6 = (i11 != 4 || ((i5 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController))) ? 1 : i4;
                changedInstance = startRestartGroup.changedInstance(savingsAutoSaveViewModel4);
                rememberedValue = startRestartGroup.rememberedValue();
                if ((i6 | (changedInstance ? 1 : 0)) == 0 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$AutoSaveHalfSheet$1$1(bottomSheetController, savingsAutoSaveViewModel4, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(visible), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i4);
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState autoSaveUiState = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState) collectAsStateWithLifecycle.getValue();
                changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                int i12 = i5 & 112;
                i7 = i12 != 32 ? 1 : i4;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (((changed ? 1 : 0) | i7) == 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$AutoSaveHalfSheet$2$1(function1, collectAsStateWithLifecycle, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(autoSaveUiState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i4);
                com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save, startRestartGroup, i4), false, null, 6, null);
                i8 = i12 != 32 ? 1 : i4;
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (i8 == 0 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt.m18832$r8$lambda$jNpj1xXTJVArzDspH4ZyEyVUmY(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel5 = savingsAutoSaveViewModel4;
                composer2 = startRestartGroup;
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, (kotlin.jvm.functions.Function0) rememberedValue3, topNavConfig, null, null, null, null, false, true, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1778506274, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt.$r8$lambda$w1SNtHVWtm75J9JBaw4fk2oRxOw(kotlin.jvm.functions.Function1.this, savingsAutoSaveViewModel4, collectAsStateWithLifecycle, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 905969664 | i11 | (com.paypal.pds.components.TopNavConfig.$stable << 6), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                savingsAutoSaveViewModel3 = savingsAutoSaveViewModel5;
            }
            i4 = 0;
            i5 = i10;
            savingsAutoSaveViewModel4 = savingsAutoSaveViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            final androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(savingsAutoSaveViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            boolean visible2 = bottomSheetController.getVisible();
            int i112 = i5 & 14;
            if (i112 != 4) {
            }
            changedInstance = startRestartGroup.changedInstance(savingsAutoSaveViewModel4);
            rememberedValue = startRestartGroup.rememberedValue();
            if ((i6 | (changedInstance ? 1 : 0)) == 0) {
            }
            rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$AutoSaveHalfSheet$1$1(bottomSheetController, savingsAutoSaveViewModel4, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(visible2), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i4);
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState autoSaveUiState2 = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState) collectAsStateWithLifecycle2.getValue();
            changed = startRestartGroup.changed(collectAsStateWithLifecycle2);
            int i122 = i5 & 112;
            if (i122 != 32) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (((changed ? 1 : 0) | i7) == 0) {
            }
            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$AutoSaveHalfSheet$2$1(function1, collectAsStateWithLifecycle2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(autoSaveUiState2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i4);
            com.paypal.pds.components.TopNavConfig topNavConfig2 = new com.paypal.pds.components.TopNavConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save, startRestartGroup, i4), false, null, 6, null);
            if (i122 != 32) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (i8 == 0) {
            }
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt.m18832$r8$lambda$jNpj1xXTJVArzDspH4ZyEyVUmY(kotlin.jvm.functions.Function1.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel52 = savingsAutoSaveViewModel4;
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, (kotlin.jvm.functions.Function0) rememberedValue3, topNavConfig2, null, null, null, null, false, true, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1778506274, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt.$r8$lambda$w1SNtHVWtm75J9JBaw4fk2oRxOw(kotlin.jvm.functions.Function1.this, savingsAutoSaveViewModel4, collectAsStateWithLifecycle2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 905969664 | i112 | (com.paypal.pds.components.TopNavConfig.$stable << 6), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            savingsAutoSaveViewModel3 = savingsAutoSaveViewModel52;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            savingsAutoSaveViewModel3 = savingsAutoSaveViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt.m18833$r8$lambda$pdAvb9TFtyKk7eJd593QfZtAvE(com.paypal.pds.components.BottomSheetController.this, function1, savingsAutoSaveViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AutoSaveSheetContent(final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState autoSaveUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoSaveUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1495411482);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(autoSaveUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1495411482, i2, -1, "com.paypal.oslo.feature.savings.ui.home.AutoSaveSheetContent (AutoSaveHalfSheet.kt:128)");
            }
            if ((autoSaveUiState instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Loading) || (autoSaveUiState instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.MoveToAutoSaveSetup)) {
                startRestartGroup.startReplaceGroup(-1891992446);
                AutoSaveLoadingContent(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (autoSaveUiState instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.GoalsLoaded) {
                startRestartGroup.startReplaceGroup(-1891815157);
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveGoalsContentKt.AutoSaveGoalsContent(((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.GoalsLoaded) autoSaveUiState).getGoals(), function1, function12, null, startRestartGroup, i2 & 1008, 8);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!(autoSaveUiState instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Error)) {
                    startRestartGroup.startReplaceGroup(-1723602739);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(-1891591275);
                AutoSaveErrorContent(((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Error) autoSaveUiState).getErrorType(), function0, function02, startRestartGroup, (i2 >> 6) & 1008);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt.m18830$r8$lambda$ACxF2qhvittvL5TMR5WrSv8GhE(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.this, function1, function12, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AutoSaveLoadingContent(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-624647720);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-624647720, i, -1, "com.paypal.oslo.feature.savings.ui.home.AutoSaveLoadingContent (AutoSaveHalfSheet.kt:154)");
            }
            androidx.compose.ui.Modifier m1728heightInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m1728heightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), Camera2StreamConfigurationMap, 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1728heightInVpY3zN4$default);
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
            com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.Modifier.INSTANCE, null, null, null, startRestartGroup, 6, 14);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt.$r8$lambda$qfFIGCcPLo8TdxcgIVQC34c0WtE(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AutoSaveErrorContent(final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType autoSaveErrorType, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoSaveErrorType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1730424648);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(autoSaveErrorType) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1730424648, i2, -1, "com.paypal.oslo.feature.savings.ui.home.AutoSaveErrorContent (AutoSaveHalfSheet.kt:171)");
            }
            if (autoSaveErrorType instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType.NetworkError) {
                startRestartGroup.startReplaceGroup(1411956685);
                com.paypal.oslo.feature.savings.ui.basescreen.SavingsAccountErrorScreenKt.SavingsAccountErrorScreen(com.paypal.pds.core.Icon.Information.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_service_unavailable, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_retry, startRestartGroup, 0), function0, null, null, null, startRestartGroup, ((i2 << 6) & 7168) | 6, 112);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!(autoSaveErrorType instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType.GraphQLError) && !(autoSaveErrorType instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType.UnknownError) && !(autoSaveErrorType instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType.NoGoalsFound)) {
                    startRestartGroup.startReplaceGroup(-785738533);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(1412402062);
                com.paypal.oslo.feature.savings.ui.basescreen.SavingsAccountErrorScreenKt.SavingsAccountErrorScreen(com.paypal.pds.core.Icon.Information.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_service_unavailable, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_ok, startRestartGroup, 0), function02, null, null, null, startRestartGroup, ((i2 << 3) & 7168) | 6, 112);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt.m18831$r8$lambda$apSSVTnarpWiu45SdcQKUMLeig(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType.this, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$1L4Ci6olPDkA1Ek9BgBo-btSEXs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18829$r8$lambda$1L4Ci6olPDkA1Ek9BgBobtSEXs(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel) {
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel.fetchGoals$default(savingsAutoSaveViewModel, false, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ACxF2qhvittvL-5TMR5WrSv8GhE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18830$r8$lambda$ACxF2qhvittvL5TMR5WrSv8GhE(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState autoSaveUiState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        AutoSaveSheetContent(autoSaveUiState, function1, function12, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$apSSVTnarpWiu45SdcQKU-MLeig, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18831$r8$lambda$apSSVTnarpWiu45SdcQKUMLeig(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType autoSaveErrorType, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        AutoSaveErrorContent(autoSaveErrorType, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g5HTbzVtr8SMfBAHYVhtN84pzdo(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.Dismiss.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jNpj1xXTJVArzDspH4ZyEyVUm-Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18832$r8$lambda$jNpj1xXTJVArzDspH4ZyEyVUmY(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.Dismiss.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lvbdL_BYmHmBAvyOB3GF6DQy9Hs(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        function1.invoke(new com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.SetUp(goalSummaryDTO));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pdAvb9TFtyKk7eJd593Q-fZtAvE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18833$r8$lambda$pdAvb9TFtyKk7eJd593QfZtAvE(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AutoSaveHalfSheet(bottomSheetController, function1, savingsAutoSaveViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qfFIGCcPLo8TdxcgIVQC34c0WtE(int i, androidx.compose.runtime.Composer composer, int i2) {
        AutoSaveLoadingContent(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$w1SNtHVWtm75J9JBaw4fk2oRxOw(final kotlin.jvm.functions.Function1 function1, final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel, androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1778506274, i, -1, "com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheet.<anonymous> (AutoSaveHalfSheet.kt:106)");
            }
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState autoSaveUiState = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState) state.getValue();
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt.$r8$lambda$lvbdL_BYmHmBAvyOB3GF6DQy9Hs(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changed2 = composer.changed(function1);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt.m18834$r8$lambda$wVlnbu0lqtD22NP_57FHaMM5Og(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue2;
            boolean changedInstance = composer.changedInstance(savingsAutoSaveViewModel);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt.m18829$r8$lambda$1L4Ci6olPDkA1Ek9BgBobtSEXs(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean changed3 = composer.changed(function1);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt.$r8$lambda$g5HTbzVtr8SMfBAHYVhtN84pzdo(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            AutoSaveSheetContent(autoSaveUiState, function12, function13, function0, (kotlin.jvm.functions.Function0) rememberedValue4, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wVlnbu-0lqtD22NP_57FHaMM5Og, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18834$r8$lambda$wVlnbu0lqtD22NP_57FHaMM5Og(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        function1.invoke(new com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.Manage(goalSummaryDTO));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState access$AutoSaveHalfSheet$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState) state.getValue();
    }
}
