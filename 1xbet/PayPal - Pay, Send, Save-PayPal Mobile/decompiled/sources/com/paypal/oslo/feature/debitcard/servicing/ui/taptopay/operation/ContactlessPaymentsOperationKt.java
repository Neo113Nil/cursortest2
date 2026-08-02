package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u0005H\u0000\u001a3\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u001a²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0005X\u008a\u0084\u0002"}, d2 = {"ContactlessPaymentsOperation", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "debitInstrument", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "modifier", "Landroidx/compose/ui/Modifier;", "onDeactivateContactlessClick", "Lkotlin/Function0;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/ContactlessPaymentsOperationViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/ContactlessPaymentsOperationViewModel;Landroidx/compose/runtime/Composer;II)V", "toSetupFlowDestination", "Lcom/paypal/oslo/feature/taptopay/api/navigation/SetupFlowDestination;", "ContactlessPaymentsOperationContent", "uiState", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent;", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ContactlessPaymentsOperationLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "ContactlessPaymentsOperationActivatePreview", "ContactlessPaymentsOperationDeactivatePreview", "debit-card_prodRelease", "currentDebitInstrument"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactlessPaymentsOperationKt {
    /* JADX WARN: Removed duplicated region for block: B:109:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContactlessPaymentsOperation(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel contactlessPaymentsOperationViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel contactlessPaymentsOperationViewModel2;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel contactlessPaymentsOperationViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        int i5;
        boolean z;
        com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel contactlessPaymentsOperationViewModel4;
        androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel contactlessPaymentsOperationViewModel5;
        int i6;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i7;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-643970423);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(debitInstrument) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        contactlessPaymentsOperationViewModel2 = contactlessPaymentsOperationViewModel;
                        if (startRestartGroup.changedInstance(contactlessPaymentsOperationViewModel2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        contactlessPaymentsOperationViewModel2 = contactlessPaymentsOperationViewModel;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    contactlessPaymentsOperationViewModel2 = contactlessPaymentsOperationViewModel;
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        i6 = i3;
                        modifier3 = modifier2;
                        function05 = function02;
                        contactlessPaymentsOperationViewModel5 = contactlessPaymentsOperationViewModel2;
                        i5 = 0;
                        z = 2048;
                    } else {
                        androidx.compose.ui.Modifier.Companion companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                        } else {
                            function04 = function02;
                        }
                        if ((i2 & 16) != 0) {
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
                            i5 = 0;
                            androidx.view.viewmodel.CreationExtras creationExtras = empty;
                            z = 2048;
                            contactlessPaymentsOperationViewModel4 = (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, creationExtras, startRestartGroup, 0, 0);
                            i3 &= -57345;
                        } else {
                            i5 = 0;
                            z = 2048;
                            contactlessPaymentsOperationViewModel4 = contactlessPaymentsOperationViewModel2;
                        }
                        modifier3 = companion;
                        function05 = function04;
                        contactlessPaymentsOperationViewModel5 = contactlessPaymentsOperationViewModel4;
                        i6 = i3;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-643970423, i6, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperation (ContactlessPaymentsOperation.kt:88)");
                    }
                    androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(contactlessPaymentsOperationViewModel5.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i5);
                    final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(debitInstrument, startRestartGroup, (i6 >> 3) & 14);
                    androidx.lifecycle.Lifecycle.Event event = androidx.lifecycle.Lifecycle.Event.ON_RESUME;
                    boolean changedInstance = startRestartGroup.changedInstance(contactlessPaymentsOperationViewModel5);
                    boolean changed = startRestartGroup.changed(rememberUpdatedState);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((changedInstance | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt.$r8$lambda$IDyNKCea1C3QcrZhWy7kzIFUarI(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel.this, rememberUpdatedState);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    int i10 = i6;
                    com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel contactlessPaymentsOperationViewModel6 = contactlessPaymentsOperationViewModel5;
                    composer2 = startRestartGroup;
                    androidx.view.compose.LifecycleEffectKt.LifecycleEventEffect(event, null, function06, startRestartGroup, 6, 2);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    boolean changedInstance2 = composer2.changedInstance(contactlessPaymentsOperationViewModel6);
                    boolean z2 = (i10 & 14) == 4;
                    boolean changed2 = composer2.changed(rememberNavResultRequestId);
                    boolean changedInstance3 = composer2.changedInstance(debitInstrument);
                    boolean z3 = (i10 & 7168) == 2048;
                    java.lang.Object rememberedValue3 = composer2.rememberedValue();
                    if (((z2 | changedInstance2 | changed2 | changedInstance3) || z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        i7 = i10;
                        rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$3$1(contactlessPaymentsOperationViewModel6, appNavigator, rememberNavResultRequestId, function05, debitInstrument, null);
                        composer2.updateRememberedValue(rememberedValue3);
                    } else {
                        i7 = i10;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer2, 6);
                    boolean changedInstance4 = composer2.changedInstance(contactlessPaymentsOperationViewModel6);
                    boolean changed3 = composer2.changed(rememberUpdatedState);
                    java.lang.Object rememberedValue4 = composer2.rememberedValue();
                    if ((changedInstance4 | changed3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$4$1(contactlessPaymentsOperationViewModel6, rememberUpdatedState, null);
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue4;
                    com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
                    java.lang.Object rememberedValue5 = composer2.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$$inlined$NavResultEffect-rtGRyWw$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                return m14521invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                            }

                            /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                            public final kotlinx.coroutines.flow.Flow<java.lang.Object> m14521invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                                return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue5, composer2, 3072);
                    com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState contactlessPaymentsOperationState = (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState) collectAsStateWithLifecycle.getValue();
                    boolean changedInstance5 = composer2.changedInstance(contactlessPaymentsOperationViewModel6);
                    java.lang.Object rememberedValue6 = composer2.rememberedValue();
                    if (changedInstance5 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$5$1(contactlessPaymentsOperationViewModel6);
                        composer2.updateRememberedValue(rememberedValue6);
                    }
                    getHighSpeedVideoSizes(contactlessPaymentsOperationState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue6), modifier3, composer2, i7 & 896, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    contactlessPaymentsOperationViewModel3 = contactlessPaymentsOperationViewModel6;
                    modifier2 = modifier3;
                    function03 = function05;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    function03 = function02;
                    contactlessPaymentsOperationViewModel3 = contactlessPaymentsOperationViewModel2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt.$r8$lambda$4jg72ixCuKxfUDjiGTp2XW9zVKE(com.paypal.oslo.core.navigation.AppNavigator.this, debitInstrument, modifier2, function03, contactlessPaymentsOperationViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            if ((i & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function02 = function0;
        if ((i & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination toSetupFlowDestination(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        return new com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mapper.SetupCardInfoMapperKt.toSetupCardInfo(debitInstrument), com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint.PPDC, com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.TAP_TO_PAY_ACTIVATE_SOURCE, com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.TAP_TO_PAY_MANAGE_FLOW);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState contactlessPaymentsOperationState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ClickedDeactivateContactless clickedDeactivateContactless;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1011148957);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(contactlessPaymentsOperationState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1011148957, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationContent (ContactlessPaymentsOperation.kt:162)");
                }
                if (contactlessPaymentsOperationState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Loading) {
                    startRestartGroup.startReplaceGroup(-1761751916);
                    com.paypal.pds.components.ShimmerKt.Shimmer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.platform.TestTagKt.testTag(modifier4, com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.TAP_TO_PAY_CONTACTLESS_PAYMENTS_OPERATION), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSize48()), (com.paypal.pds.components.ShimmerStyle) com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, true, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ComposableSingletons$ContactlessPaymentsOperationKt.INSTANCE.getLambda$2073656018$debit_card_prodRelease(), startRestartGroup, 3504, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (contactlessPaymentsOperationState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Ineligible) {
                    startRestartGroup.startReplaceGroup(1051560673);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(contactlessPaymentsOperationState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success)) {
                        startRestartGroup.startReplaceGroup(1051546576);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-1761259419);
                    com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success) contactlessPaymentsOperationState;
                    boolean z = success instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success.Activate;
                    if (z) {
                        str = "Activate for contactless payments";
                    } else {
                        if (!(success instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success.Deactivate)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        str = "Deactivate for contactless payments";
                    }
                    java.lang.String str2 = str;
                    if (z) {
                        clickedDeactivateContactless = com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ClickedActivateContactless.INSTANCE;
                    } else {
                        if (!(success instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success.Deactivate)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        clickedDeactivateContactless = com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ClickedDeactivateContactless.INSTANCE;
                    }
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier4, com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.TAP_TO_PAY_CONTACTLESS_PAYMENTS_OPERATION);
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m14518getLambda$1657698990$debit_card_prodRelease = com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ComposableSingletons$ContactlessPaymentsOperationKt.INSTANCE.m14518getLambda$1657698990$debit_card_prodRelease();
                    boolean z2 = (i3 & 112) == 32;
                    boolean changed = startRestartGroup.changed(clickedDeactivateContactless);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changed | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt.m14520$r8$lambda$sDloxr9tgfWUswcBdv0dQyAae4(kotlin.jvm.functions.Function1.this, clickedDeactivateContactless);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    modifier3 = modifier4;
                    com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(str2, testTag, null, null, null, false, false, null, m14518getLambda$1657698990$debit_card_prodRelease, null, null, null, false, (kotlin.jvm.functions.Function0) rememberedValue, null, null, null, null, false, startRestartGroup, 100663296, 0, 515836);
                    startRestartGroup.endReplaceGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                }
                modifier3 = modifier4;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt.$r8$lambda$L84Hy2WF9EJHHSUENKkGAlDGaiQ(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.this, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$4jg72ixCuKxfUDjiGTp2XW9zVKE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel contactlessPaymentsOperationViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ContactlessPaymentsOperation(appNavigator, debitInstrument, modifier, function0, contactlessPaymentsOperationViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EU_RHKDCe67ei54iXPhMtWQVADY(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent contactlessPaymentsOperationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactlessPaymentsOperationEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IDyNKCea1C3QcrZhWy7kzIFUarI(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel contactlessPaymentsOperationViewModel, androidx.compose.runtime.State state) {
        contactlessPaymentsOperationViewModel.processEvent(new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckRequested(((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) state.getValue()).getId()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IVhAW9zvm60MbcRAR3y2NNmcGgg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1896082500);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1896082500, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationDeactivatePreview (ContactlessPaymentsOperation.kt:229)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success.Deactivate deactivate = com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success.Deactivate.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt.$r8$lambda$NiiDX9qOEAbPLgsXgLoEs47TTKE((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoSizes(deactivate, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 54, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt.$r8$lambda$IVhAW9zvm60MbcRAR3y2NNmcGgg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$L84Hy2WF9EJHHSUENKkGAlDGaiQ(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState contactlessPaymentsOperationState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(contactlessPaymentsOperationState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NiiDX9qOEAbPLgsXgLoEs47TTKE(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent contactlessPaymentsOperationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactlessPaymentsOperationEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZmLfgHc1IicLFlPa-2efusY7z2I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14519$r8$lambda$ZmLfgHc1IicLFlPa2efusY7z2I(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(15672006);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(15672006, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationLoadingPreview (ContactlessPaymentsOperation.kt:209)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Loading loading = com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Loading.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt.$r8$lambda$zScDf9RAQ7cE5_gtTN8z3CfJeZI((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoSizes(loading, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 54, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt.m14519$r8$lambda$ZmLfgHc1IicLFlPa2efusY7z2I(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rx9vdUxDvdVBW_hdSsFt9yNSkoA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1113633029);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1113633029, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationActivatePreview (ContactlessPaymentsOperation.kt:219)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success.Activate activate = com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success.Activate.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt.$r8$lambda$EU_RHKDCe67ei54iXPhMtWQVADY((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoSizes(activate, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 54, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt.$r8$lambda$rx9vdUxDvdVBW_hdSsFt9yNSkoA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$s-Dloxr9tgfWUswcBdv0dQyAae4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14520$r8$lambda$sDloxr9tgfWUswcBdv0dQyAae4(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent contactlessPaymentsOperationEvent) {
        function1.invoke(contactlessPaymentsOperationEvent);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zScDf9RAQ7cE5_gtTN8z3CfJeZI(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent contactlessPaymentsOperationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactlessPaymentsOperationEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument access$ContactlessPaymentsOperation$lambda$2(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) state.getValue();
    }
}
