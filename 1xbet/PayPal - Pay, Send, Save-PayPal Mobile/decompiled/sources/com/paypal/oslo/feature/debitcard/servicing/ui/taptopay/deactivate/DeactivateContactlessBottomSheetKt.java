package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a0\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0002\u001a?\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u0014\u001a)\u0010\u0015\u001a\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\u001a\u001b\u0010\u001a\u001a\u00020\u00012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019¨\u0006!²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"DeactivateContactlessBottomSheet", "", "cardId", "", "onResult", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/DeactivateContactlessResult;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/DeactivateContactlessSheetViewModel;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/DeactivateContactlessSheetViewModel;Landroidx/compose/runtime/Composer;II)V", "createDismissWithResultCallback", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "DeactivateContactlessSheetContent", "state", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetState;", "onEvent", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetEvent;", "onCancel", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ConfirmationContent", "onDeactivate", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LoadingContent", "(Landroidx/compose/runtime/Composer;I)V", "ErrorContent", "onRetry", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DeactivateContactlessSheetConfirmationPreview", "DeactivateContactlessSheetLoadingPreview", "DeactivateContactlessSheetErrorPreview", "DeactivateContactlessSheetErrorRetriesExhaustedPreview", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeactivateContactlessBottomSheetKt {
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ce, code lost:
    
        if (r11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01eb, code lost:
    
        if (r12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DeactivateContactlessBottomSheet(final java.lang.String str, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult, kotlin.Unit> function1, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel deactivateContactlessSheetViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel deactivateContactlessSheetViewModel2;
        com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel deactivateContactlessSheetViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel deactivateContactlessSheetViewModel4;
        int i5;
        final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel deactivateContactlessSheetViewModel5;
        java.lang.Object obj;
        java.lang.Object obj2;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1500582815);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                deactivateContactlessSheetViewModel2 = deactivateContactlessSheetViewModel;
                if (startRestartGroup.changedInstance(deactivateContactlessSheetViewModel2)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                deactivateContactlessSheetViewModel2 = deactivateContactlessSheetViewModel;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            deactivateContactlessSheetViewModel2 = deactivateContactlessSheetViewModel;
        }
        int i7 = i3;
        if (startRestartGroup.shouldExecute((i7 & 147) != 146, i7 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
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
                    deactivateContactlessSheetViewModel4 = (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i5 = i7 & (-897);
                    deactivateContactlessSheetViewModel5 = deactivateContactlessSheetViewModel4;
                }
                i4 = 0;
                i5 = i7;
                deactivateContactlessSheetViewModel5 = deactivateContactlessSheetViewModel2;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    deactivateContactlessSheetViewModel4 = deactivateContactlessSheetViewModel2;
                    i4 = 0;
                    i5 = i7 & (-897);
                    deactivateContactlessSheetViewModel5 = deactivateContactlessSheetViewModel4;
                }
                i4 = 0;
                i5 = i7;
                deactivateContactlessSheetViewModel5 = deactivateContactlessSheetViewModel2;
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1500582815, i5, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheet (DeactivateContactlessBottomSheet.kt:73)");
            }
            final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(deactivateContactlessSheetViewModel5.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            boolean z = ((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState) collectAsStateWithLifecycle.getValue()) instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Loading;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            int i8 = (i5 & 112) == 32 ? 1 : i4;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (i8 != 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.$r8$lambda$_yRVufsPfYPxU1nU98aM30CSu9Q(com.paypal.pds.components.BottomSheetController.this, function1, (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult) obj3);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
            boolean z2 = (!bottomSheetController.getVisible() || z) ? i4 : 1;
            boolean changed = startRestartGroup.changed(function12);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.$r8$lambda$b2FQ979p4qJnYylFzHyfHSWuK6w(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.view.compose.BackHandlerKt.BackHandler(z2, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, i4, i4);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            boolean changedInstance2 = startRestartGroup.changedInstance(deactivateContactlessSheetViewModel5);
            int i9 = (i5 & 14) == 4 ? 1 : i4;
            com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$DeactivateContactlessBottomSheet$2$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (((changedInstance ? 1 : 0) | (changedInstance2 ? 1 : 0) | i9) != 0 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$DeactivateContactlessBottomSheet$2$1(bottomSheetController, deactivateContactlessSheetViewModel5, str, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changedInstance3 = startRestartGroup.changedInstance(deactivateContactlessSheetViewModel5);
            boolean changed2 = startRestartGroup.changed(function12);
            com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$DeactivateContactlessBottomSheet$3$1 rememberedValue5 = startRestartGroup.rememberedValue();
            if ((changedInstance3 | changed2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$DeactivateContactlessBottomSheet$3$1(deactivateContactlessSheetViewModel5, function12, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
            com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null);
            boolean changed3 = startRestartGroup.changed(function12);
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changed3) {
                obj = rememberedValue6;
            }
            kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.$r8$lambda$tYlz2uLzJfDWEanGCwute6k0XQ4(kotlin.jvm.functions.Function1.this);
                }
            };
            startRestartGroup.updateRememberedValue(function0);
            obj = function0;
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) obj;
            boolean changed4 = startRestartGroup.changed(function12);
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (!changed4) {
                obj2 = rememberedValue7;
            }
            kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.$r8$lambda$ROzTVGoB2cl0889ruYX5iJNRqdM(kotlin.jvm.functions.Function1.this);
                }
            };
            startRestartGroup.updateRememberedValue(function03);
            obj2 = function03;
            deactivateContactlessSheetViewModel3 = deactivateContactlessSheetViewModel5;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function02, topNavConfig, null, null, null, (kotlin.jvm.functions.Function0) obj2, true ^ z, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-72192602, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.$r8$lambda$AQgCYTiCVgOWcbnr62kLBE1ni5Q(str, deactivateContactlessSheetViewModel5, function12, collectAsStateWithLifecycle, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | (com.paypal.pds.components.TopNavConfig.$stable << 6), 312);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            deactivateContactlessSheetViewModel3 = deactivateContactlessSheetViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel deactivateContactlessSheetViewModel6 = deactivateContactlessSheetViewModel3;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.m14510$r8$lambda$ohAFETsTsH3LdVgjstPEkQ6B0(str, function1, deactivateContactlessSheetViewModel6, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState deactivateContactlessSheetState, final java.lang.String str, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        boolean z;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1340939408);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(deactivateContactlessSheetState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1340939408, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetContent (DeactivateContactlessBottomSheet.kt:138)");
            }
            if (!(deactivateContactlessSheetState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Confirmation)) {
                if ((deactivateContactlessSheetState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Loading) || (deactivateContactlessSheetState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Success)) {
                    startRestartGroup.startReplaceGroup(435689002);
                    getHighResolutionOutputSizeshNQ4ISI(startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(deactivateContactlessSheetState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Error)) {
                        startRestartGroup.startReplaceGroup(152589124);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(435785474);
                    boolean z2 = (i2 & 896) == 256;
                    z = (i2 & 112) == 32;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.$r8$lambda$KfOyyPrSNSquFU1tyPZHhcYZ65M(kotlin.jvm.functions.Function1.this, str);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    getHighSpeedVideoSizes((kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
            } else {
                startRestartGroup.startReplaceGroup(435355752);
                boolean z3 = (i2 & 896) == 256;
                z = (i2 & 112) == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((z3 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.$r8$lambda$mLLHaz2XASVDFFUorHvjm0U4znY(kotlin.jvm.functions.Function1.this, str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                getHighSpeedVideoFpsRangesFor((kotlin.jvm.functions.Function0) rememberedValue2, function0, startRestartGroup, (i2 >> 6) & 112);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.$r8$lambda$KTJ0CQqPIUs9JNSkpdnvRNJZ5Ys(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.this, str, function1, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1083043596);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1083043596, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.ConfirmationContent (DeactivateContactlessBottomSheet.kt:166)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.TAP_TO_PAY_DEACTIVATE_CONTACTLESS_BOTTOM_SHEET_CONTENT);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_are_you_sure, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_deactivate_contactless_confirmation_description, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 384, 6, 1016);
            composer2 = startRestartGroup;
            com.paypal.pds.components.ButtonGroupKt.ButtonGroup(new com.paypal.pds.components.ButtonGroupItem[]{new com.paypal.pds.components.ButtonGroupItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_deactivate_button, startRestartGroup, 0), function0, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, null, 108, null), new com.paypal.pds.components.ButtonGroupItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_cancel, composer2, 0), function02, null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, null, null, 108, null)}, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 5, null), null, com.paypal.pds.components.ButtonGroupAlignment.Vertical.INSTANCE, composer2, com.paypal.pds.components.ButtonGroupAlignment.Vertical.$stable << 9, 4);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.$r8$lambda$BsB_3DyhvUN8HCXXIDdXtBshhBk(kotlin.jvm.functions.Function0.this, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-38373175);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-38373175, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.LoadingContent (DeactivateContactlessBottomSheet.kt:207)");
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
            com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.TAP_TO_PAY_DEACTIVATE_CONTACTLESS_BOTTOM_SHEET_LOADER), com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, (com.paypal.pds.components.LoaderSize.Large.$stable << 3) | 6, 12);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.m14515$r8$lambda$cWaqdAa1SrODc4LCtjf0pHZN7s(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1445443447);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1445443447, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.ErrorContent (DeactivateContactlessBottomSheet.kt:226)");
            }
            com.paypal.pds.components.EmptyStateKt.EmptyState(com.paypal.pds.core.Icon.Warning.INSTANCE, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_title, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_deactivate_contactless_confirmation_error_message, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_try_again, startRestartGroup, 0), function0, startRestartGroup, ((i2 << 18) & 3670016) | 6, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.$r8$lambda$64tvKnv3tkn3hOohGhnOzVH_4Xo(kotlin.jvm.functions.Function0.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-HfK3G-1pbo5hQ6F6GlqFdSp7gQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14509$r8$lambda$HfK3G1pbo5hQ6F6GlqFdSp7gQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(474832102);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(474832102, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetErrorPreview (DeactivateContactlessBottomSheet.kt:266)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Error error = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Error(null, 0, 1, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.$r8$lambda$Nh7PHhjUwskbexTUvInNMKfi_p0((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Camera2StreamConfigurationMap(error, "preview-card-id-3", function1, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 3504);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.m14509$r8$lambda$HfK3G1pbo5hQ6F6GlqFdSp7gQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$-ohAFETsTsH3LdVgjstPEk-Q6B0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14510$r8$lambda$ohAFETsTsH3LdVgjstPEkQ6B0(java.lang.String str, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel deactivateContactlessSheetViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DeactivateContactlessBottomSheet(str, function1, deactivateContactlessSheetViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$64tvKnv3tkn3hOohGhnOzVH_4Xo(kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9dvlRk19zZPBBKsGVyAcRFS4g98(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent deactivateContactlessSheetEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deactivateContactlessSheetEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AQgCYTiCVgOWcbnr62kLBE1ni5Q(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel deactivateContactlessSheetViewModel, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-72192602, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheet.<anonymous> (DeactivateContactlessBottomSheet.kt:115)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState deactivateContactlessSheetState = (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState) state.getValue();
            boolean changedInstance = composer.changedInstance(deactivateContactlessSheetViewModel);
            com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$DeactivateContactlessBottomSheet$6$1$1 rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$DeactivateContactlessBottomSheet$6$1$1(deactivateContactlessSheetViewModel);
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue);
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.$r8$lambda$KnlnHXUjp0BF5g6GRpDaDKGDFKA(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            Camera2StreamConfigurationMap(deactivateContactlessSheetState, str, function12, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BsB_3DyhvUN8HCXXIDdXtBshhBk(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Dd6n-iyppYUydK9WGCWrjlggwFs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14511$r8$lambda$Dd6niyppYUydK9WGCWrjlggwFs(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent deactivateContactlessSheetEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deactivateContactlessSheetEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KTJ0CQqPIUs9JNSkpdnvRNJZ5Ys(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState deactivateContactlessSheetState, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(deactivateContactlessSheetState, str, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KfOyyPrSNSquFU1tyPZHhcYZ65M(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.RetryClicked(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KnlnHXUjp0BF5g6GRpDaDKGDFKA(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult.Cancelled.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Nh7PHhjUwskbexTUvInNMKfi_p0(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent deactivateContactlessSheetEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deactivateContactlessSheetEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PZDWceO3fzjqW6KFwav_-HiHT_k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14512$r8$lambda$PZDWceO3fzjqW6KFwav_HiHT_k(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1932231991);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1932231991, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetConfirmationPreview (DeactivateContactlessBottomSheet.kt:242)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Confirmation confirmation = com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Confirmation.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.m14511$r8$lambda$Dd6niyppYUydK9WGCWrjlggwFs((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Camera2StreamConfigurationMap(confirmation, "preview-card-id-1", function1, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 3510);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.m14512$r8$lambda$PZDWceO3fzjqW6KFwav_HiHT_k(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ROzTVGoB2cl0889ruYX5iJNRqdM(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult.Cancelled.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_yRVufsPfYPxU1nU98aM30CSu9Q(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult deactivateContactlessResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deactivateContactlessResult, "");
        bottomSheetController.hideSheet();
        function1.invoke(deactivateContactlessResult);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aX0X5ru5GIzjr16wPUKj8gHV29A(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent deactivateContactlessSheetEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deactivateContactlessSheetEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$b2FQ979p4qJnYylFzHyfHSWuK6w(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult.Cancelled.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$b5-qzj3tHvSxuu2dAECHCwwoWPk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14514$r8$lambda$b5qzj3tHvSxuu2dAECHCwwoWPk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(619361027);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(619361027, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetErrorRetriesExhaustedPreview (DeactivateContactlessBottomSheet.kt:278)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Error error = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Error(null, 2, 1, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.$r8$lambda$aX0X5ru5GIzjr16wPUKj8gHV29A((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Camera2StreamConfigurationMap(error, "preview-card-id-4", function1, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 3504);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.m14514$r8$lambda$b5qzj3tHvSxuu2dAECHCwwoWPk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cWaqdAa-1SrODc4LCtjf0pHZN7s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14515$r8$lambda$cWaqdAa1SrODc4LCtjf0pHZN7s(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dCAuhIv66qJqH0DPai0QHQajvxU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1380493262);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1380493262, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetLoadingPreview (DeactivateContactlessBottomSheet.kt:254)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Loading loading = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Loading(0);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.$r8$lambda$9dvlRk19zZPBBKsGVyAcRFS4g98((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Camera2StreamConfigurationMap(loading, "preview-card-id-2", function1, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 3504);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt.$r8$lambda$dCAuhIv66qJqH0DPai0QHQajvxU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mLLHaz2XASVDFFUorHvjm0U4znY(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.DeactivateClicked(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tYlz2uLzJfDWEanGCwute6k0XQ4(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult.Cancelled.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
