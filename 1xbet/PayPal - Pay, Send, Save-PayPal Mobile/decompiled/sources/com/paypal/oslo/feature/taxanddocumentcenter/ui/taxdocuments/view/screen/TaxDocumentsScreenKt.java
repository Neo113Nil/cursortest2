package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\rX\u008a\u008e\u0002²\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002"}, d2 = {"TaxDocumentsScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsViewModel;Landroidx/compose/runtime/Composer;II)V", "tax-and-document-center_prodRelease", "uiState", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiState;", "selectedSectionTitle", "", "selectedSectionInfo", "multiSavingSheetData", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/MultiSavingsSheetData;", "selectedFormId", "preservedSheetData", "preservedSelectedFormId", "reconSheetData", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SheetData;", "isReconRequestLoading", "", "toastMessage"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxDocumentsScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxDocumentsScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        int i6;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel3;
        final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel4;
        int i7;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i8;
        final com.paypal.pds.components.BottomSheetController bottomSheetController;
        final androidx.compose.runtime.MutableState mutableState;
        final androidx.compose.runtime.MutableState mutableState2;
        androidx.compose.runtime.MutableState mutableState3;
        androidx.compose.runtime.MutableState mutableState4;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        final androidx.compose.runtime.MutableState mutableState5;
        java.lang.Object rememberedValue2;
        boolean changedInstance2;
        java.lang.Object rememberedValue3;
        java.lang.Object rememberedValue4;
        int i9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-648710379);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    taxDocumentsViewModel2 = taxDocumentsViewModel;
                    if (startRestartGroup.changedInstance(taxDocumentsViewModel2)) {
                        i9 = 256;
                        i3 |= i9;
                    }
                } else {
                    taxDocumentsViewModel2 = taxDocumentsViewModel;
                }
                i9 = 128;
                i3 |= i9;
            } else {
                taxDocumentsViewModel2 = taxDocumentsViewModel;
            }
            i4 = i3;
            if (!startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                    }
                    i5 = 0;
                    i6 = 1;
                    i7 = i4;
                    modifier4 = modifier2;
                    taxDocumentsViewModel4 = taxDocumentsViewModel2;
                } else {
                    androidx.compose.ui.Modifier modifier5 = i10 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
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
                        i5 = 0;
                        i6 = 1;
                        taxDocumentsViewModel3 = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i4 &= -897;
                    } else {
                        i5 = 0;
                        i6 = 1;
                        taxDocumentsViewModel3 = taxDocumentsViewModel2;
                    }
                    taxDocumentsViewModel4 = taxDocumentsViewModel3;
                    i7 = i4;
                    modifier4 = modifier5;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-648710379, i7, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreen (TaxDocumentsScreen.kt:61)");
                }
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                com.paypal.pds.components.DropdownState rememberDropdownState = com.paypal.pds.components.DropdownKt.rememberDropdownState(startRestartGroup, i5);
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(taxDocumentsViewModel4.getUiState(), null, startRestartGroup, i5, i6);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue5;
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    i8 = 2;
                    rememberedValue6 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                } else {
                    i8 = 2;
                }
                androidx.compose.runtime.MutableState mutableState6 = (androidx.compose.runtime.MutableState) rememberedValue6;
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, i8, null);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                androidx.compose.runtime.MutableState mutableState7 = (androidx.compose.runtime.MutableState) rememberedValue7;
                java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i8, null);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                final androidx.compose.runtime.MutableState mutableState8 = (androidx.compose.runtime.MutableState) rememberedValue8;
                java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i8, null);
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                final androidx.compose.runtime.MutableState mutableState9 = (androidx.compose.runtime.MutableState) rememberedValue9;
                java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i8, null);
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                androidx.compose.runtime.MutableState mutableState10 = (androidx.compose.runtime.MutableState) rememberedValue10;
                java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                if (rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i8, null);
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                androidx.compose.runtime.MutableState mutableState11 = (androidx.compose.runtime.MutableState) rememberedValue11;
                java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
                if (rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i8, null);
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                }
                final androidx.compose.runtime.MutableState mutableState12 = (androidx.compose.runtime.MutableState) rememberedValue12;
                java.lang.Object rememberedValue13 = startRestartGroup.rememberedValue();
                if (rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue13 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, i8, null);
                    startRestartGroup.updateRememberedValue(rememberedValue13);
                }
                final androidx.compose.runtime.MutableState mutableState13 = (androidx.compose.runtime.MutableState) rememberedValue13;
                java.lang.Object rememberedValue14 = startRestartGroup.rememberedValue();
                if (rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue14 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i8, null);
                    startRestartGroup.updateRememberedValue(rememberedValue14);
                }
                final androidx.compose.runtime.MutableState mutableState14 = (androidx.compose.runtime.MutableState) rememberedValue14;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance3 = startRestartGroup.changedInstance(taxDocumentsViewModel4);
                java.lang.Object rememberedValue15 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue15 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$TaxDocumentsScreen$1$1(taxDocumentsViewModel4, null);
                    startRestartGroup.updateRememberedValue(rememberedValue15);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue15, startRestartGroup, 6);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                boolean changedInstance4 = startRestartGroup.changedInstance(taxDocumentsViewModel4);
                java.lang.Object rememberedValue16 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue16 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.m20420$r8$lambda$rXRgm3wXQH9XNTdLB4cJRQonk(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue16);
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(unit2, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue16, startRestartGroup, 6);
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState taxDocumentsUiState = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState) collectAsState.getValue();
                boolean changed = startRestartGroup.changed(collectAsState);
                java.lang.Object rememberedValue17 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue17 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue17 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$TaxDocumentsScreen$3$1(collectAsState, mutableState8, mutableState10, mutableState9, mutableState11, null);
                    startRestartGroup.updateRememberedValue(rememberedValue17);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(taxDocumentsUiState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue17, startRestartGroup, 0);
                androidx.compose.runtime.MutableState mutableState15 = mutableState14;
                java.lang.String str = (java.lang.String) mutableState15.getValue();
                java.lang.Object rememberedValue18 = startRestartGroup.rememberedValue();
                if (rememberedValue18 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue18 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$TaxDocumentsScreen$4$1(mutableState14, mutableState13, mutableState12, null);
                    startRestartGroup.updateRememberedValue(rememberedValue18);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue18, startRestartGroup, 0);
                java.lang.Object rememberedValue19 = startRestartGroup.rememberedValue();
                if (rememberedValue19 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue19 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.m20417$r8$lambda$KvFhcvuvMOl_bHt0LD8CiYBSYg(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue19);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue19;
                java.lang.Object rememberedValue20 = startRestartGroup.rememberedValue();
                if (rememberedValue20 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue20 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.$r8$lambda$M4oV1FYJ5lHFBN3B25ty3SGXF1w(androidx.compose.runtime.MutableState.this, mutableState9, (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue20);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue20;
                java.lang.Object rememberedValue21 = startRestartGroup.rememberedValue();
                if (rememberedValue21 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue21 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.$r8$lambda$7cgOIh0whach9TUcNaWW6mik4CY(androidx.compose.runtime.MutableState.this, mutableState13, (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue21);
                }
                kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue21;
                java.lang.Object rememberedValue22 = startRestartGroup.rememberedValue();
                if (rememberedValue22 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue22 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.m20422$r8$lambda$w7uKjG8g1eAtNAF6IMBfPfGsPk(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue22);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue22;
                java.lang.Object rememberedValue23 = startRestartGroup.rememberedValue();
                androidx.compose.ui.Modifier modifier6 = modifier4;
                if (rememberedValue23 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue23 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.$r8$lambda$b0kSZunc8efDp0DWf8qIfSQYWec(androidx.compose.runtime.MutableState.this, mutableState13);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue23);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue23;
                java.lang.Object rememberedValue24 = startRestartGroup.rememberedValue();
                if (rememberedValue24 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue24 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.m20416$r8$lambda$JB73IVgdUVh1CH85FeSmXWT5o(androidx.compose.runtime.MutableState.this, mutableState9);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue24);
                }
                int i11 = i7;
                final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel5 = taxDocumentsViewModel4;
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsEffectHandlerKt.TaxDocumentsEffectHandler(taxDocumentsViewModel4, function1, function12, function13, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue24, context, startRestartGroup, ((i7 >> 6) & 14) | 1797552, 0);
                final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState taxDocumentsUiState2 = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState) collectAsState.getValue();
                if (taxDocumentsUiState2 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Downloading) {
                    startRestartGroup.startReplaceGroup(1625899895);
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.common.components.LoadingScreenComponentKt.LoadingScreenComponent(modifier6, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_download_loading_message, startRestartGroup, 0), startRestartGroup, (i11 >> 3) & 14, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (taxDocumentsUiState2 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.DownloadError) {
                    startRestartGroup.startReplaceGroup(1626142315);
                    boolean changedInstance5 = startRestartGroup.changedInstance(taxDocumentsViewModel5);
                    boolean changed2 = startRestartGroup.changed(taxDocumentsUiState2);
                    java.lang.Object rememberedValue25 = startRestartGroup.rememberedValue();
                    if ((changedInstance5 | changed2) || rememberedValue25 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue25 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.$r8$lambda$JLMkxSRAIj1HGPwp_znG7gDu75U(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this, taxDocumentsUiState2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue25);
                    }
                    kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue25;
                    boolean changedInstance6 = startRestartGroup.changedInstance(taxDocumentsViewModel5);
                    java.lang.Object rememberedValue26 = startRestartGroup.rememberedValue();
                    if (changedInstance6 || rememberedValue26 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue26 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.$r8$lambda$e5zHMzEUCCIJvR3_CY2I2MjlYYg(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue26);
                    }
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.common.components.ErrorScreenComponentKt.ErrorScreenComponent(function03, (kotlin.jvm.functions.Function0) rememberedValue26, null, startRestartGroup, 0, 4);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1626439977);
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState taxDocumentsUiState3 = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState) collectAsState.getValue();
                    java.lang.String str2 = (java.lang.String) mutableState15.getValue();
                    boolean z = (i11 & 14) == 4;
                    java.lang.Object rememberedValue27 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue27 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue27 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.$r8$lambda$Xlnyz_gXDIj0igxNDW7_aImLZOY(com.paypal.oslo.core.navigation.AppNavigator.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue27);
                    }
                    kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue27;
                    bottomSheetController = bottomSheetController2;
                    boolean changedInstance7 = startRestartGroup.changedInstance(bottomSheetController);
                    java.lang.Object rememberedValue28 = startRestartGroup.rememberedValue();
                    if (changedInstance7 || rememberedValue28 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        mutableState = mutableState7;
                        mutableState2 = mutableState6;
                        rememberedValue28 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.$r8$lambda$zPuHyxiamURrNvqXmydXyjYZTcM(com.paypal.pds.components.BottomSheetController.this, mutableState2, mutableState, (java.lang.String) obj, (java.lang.String) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue28);
                    } else {
                        mutableState = mutableState7;
                        mutableState2 = mutableState6;
                    }
                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue28;
                    java.lang.Object rememberedValue29 = startRestartGroup.rememberedValue();
                    if (rememberedValue29 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue29 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.m20415$r8$lambda$Jta3004kApjBCbAkSKl4_Q4(androidx.compose.runtime.MutableState.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue29);
                    }
                    mutableState3 = mutableState;
                    mutableState4 = mutableState2;
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenLayoutsKt.TaxDocumentsScreenContent(taxDocumentsUiState3, function04, rememberDropdownState, taxDocumentsViewModel5, function2, str2, (kotlin.jvm.functions.Function0) rememberedValue29, modifier6, startRestartGroup, ((i11 << 18) & 29360128) | (com.paypal.pds.components.DropdownState.$stable << 6) | 1572864 | ((i11 << 3) & 7168), 0);
                    startRestartGroup.endReplaceGroup();
                    com.paypal.pds.components.DropdownKt.DropdownBottomSheet(rememberDropdownState, startRestartGroup, com.paypal.pds.components.DropdownState.$stable);
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionInfoModalKt.TaxDocumentInfoModal(bottomSheetController, (java.lang.String) mutableState4.getValue(), (java.lang.String) mutableState3.getValue(), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable);
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData multiSavingsSheetData = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData) mutableState8.getValue();
                    java.lang.String str3 = (java.lang.String) mutableState9.getValue();
                    changedInstance = startRestartGroup.changedInstance(taxDocumentsViewModel5);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        mutableState5 = mutableState9;
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.m20419$r8$lambda$oxZnyyxFm433H7gBJY_MCJtcAQ(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this, mutableState5, mutableState8, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    } else {
                        mutableState5 = mutableState9;
                    }
                    kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.$r8$lambda$7NY2m4KrrCS44yDWN64rr3Tv140(androidx.compose.runtime.MutableState.this, mutableState5);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsSheetManagersKt.MultiSavingSheetManager(multiSavingsSheetData, str3, function14, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 3072);
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData sheetData = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData) mutableState12.getValue();
                    boolean booleanValue = ((java.lang.Boolean) mutableState13.getValue()).booleanValue();
                    changedInstance2 = startRestartGroup.changedInstance(taxDocumentsViewModel5);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.m20421$r8$lambda$tiBKCp4ljnhbAer4IEiLcDrz8(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this, (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function1 function15 = (kotlin.jvm.functions.Function1) rememberedValue3;
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.m20413$r8$lambda$61v9F5EaA75dSGYvJoc_W08y5Y(androidx.compose.runtime.MutableState.this, mutableState13);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsSheetManagersKt.ReconSheetManager(sheetData, booleanValue, function15, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 3072);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    taxDocumentsViewModel2 = taxDocumentsViewModel5;
                    modifier3 = modifier6;
                }
                mutableState3 = mutableState7;
                mutableState4 = mutableState6;
                bottomSheetController = bottomSheetController2;
                com.paypal.pds.components.DropdownKt.DropdownBottomSheet(rememberDropdownState, startRestartGroup, com.paypal.pds.components.DropdownState.$stable);
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionInfoModalKt.TaxDocumentInfoModal(bottomSheetController, (java.lang.String) mutableState4.getValue(), (java.lang.String) mutableState3.getValue(), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable);
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData multiSavingsSheetData2 = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData) mutableState8.getValue();
                java.lang.String str32 = (java.lang.String) mutableState9.getValue();
                changedInstance = startRestartGroup.changedInstance(taxDocumentsViewModel5);
                rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance) {
                }
                mutableState5 = mutableState9;
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.m20419$r8$lambda$oxZnyyxFm433H7gBJY_MCJtcAQ(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this, mutableState5, mutableState8, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                kotlin.jvm.functions.Function1 function142 = (kotlin.jvm.functions.Function1) rememberedValue;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsSheetManagersKt.MultiSavingSheetManager(multiSavingsSheetData2, str32, function142, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 3072);
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData sheetData2 = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData) mutableState12.getValue();
                boolean booleanValue2 = ((java.lang.Boolean) mutableState13.getValue()).booleanValue();
                changedInstance2 = startRestartGroup.changedInstance(taxDocumentsViewModel5);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.m20421$r8$lambda$tiBKCp4ljnhbAer4IEiLcDrz8(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this, (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                kotlin.jvm.functions.Function1 function152 = (kotlin.jvm.functions.Function1) rememberedValue3;
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsSheetManagersKt.ReconSheetManager(sheetData2, booleanValue2, function152, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 3072);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                taxDocumentsViewModel2 = taxDocumentsViewModel5;
                modifier3 = modifier6;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel6 = taxDocumentsViewModel2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.m20418$r8$lambda$RhiQMIBK13YCtcAzu8Ki6kzG0(com.paypal.oslo.core.navigation.AppNavigator.this, modifier3, taxDocumentsViewModel6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i3;
        if (!startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$61v-9F5EaA75dSGYvJoc_W08y5Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20413$r8$lambda$61v9F5EaA75dSGYvJoc_W08y5Y(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2) {
        mutableState.setValue(null);
        mutableState2.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7NY2m4KrrCS44yDWN64rr3Tv140(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2) {
        mutableState.setValue(null);
        mutableState2.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7cgOIh0whach9TUcNaWW6mik4CY(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData sheetData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sheetData, "");
        mutableState.setValue(sheetData);
        mutableState2.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$EFa-rLfgcL_Uwi_bEUuJJSzfEXw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20414$r8$lambda$EFarLfgcL_Uwi_bEUuJJSzfEXw(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$J-ta3004--kApjBCbAkSKl4_-Q4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20415$r8$lambda$Jta3004kApjBCbAkSKl4_Q4(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JB73IVgdUVh1CH85FeS-m-XWT5o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20416$r8$lambda$JB73IVgdUVh1CH85FeSmXWT5o(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2) {
        mutableState.setValue(null);
        mutableState2.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JLMkxSRAIj1HGPwp_znG7gDu75U(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState taxDocumentsUiState) {
        taxDocumentsViewModel.onEvent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RetryDownload(((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.DownloadError) taxDocumentsUiState).getDownloadUrl()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KvFhcvuvMOl_bHt-0LD8CiYBSYg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20417$r8$lambda$KvFhcvuvMOl_bHt0LD8CiYBSYg(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$M4oV1FYJ5lHFBN3B25ty3SGXF1w(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData multiSavingsSheetData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(multiSavingsSheetData, "");
        mutableState.setValue(multiSavingsSheetData);
        mutableState2.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Rhi-QMIBK13YCtcAzu-8Ki6kzG0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20418$r8$lambda$RhiQMIBK13YCtcAzu8Ki6kzG0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TaxDocumentsScreen(appNavigator, modifier, taxDocumentsViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Xlnyz_gXDIj0igxNDW7_aImLZOY(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.m20414$r8$lambda$EFarLfgcL_Uwi_bEUuJJSzfEXw((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$b0kSZunc8efDp0DWf8qIfSQYWec(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2) {
        mutableState.setValue(null);
        mutableState2.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e5zHMzEUCCIJvR3_CY2I2MjlYYg(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel) {
        taxDocumentsViewModel.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DismissDownloadError.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$oxZnyyxFm433H7gBJY_MCJtc-AQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20419$r8$lambda$oxZnyyxFm433H7gBJY_MCJtcAQ(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, java.lang.String str) {
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsAccount> savingsAccounts;
        java.lang.Object obj;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta cta;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.LinkDescription linkDescription;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData multiSavingsSheetData = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData) mutableState2.getValue();
        java.lang.String str2 = null;
        if (multiSavingsSheetData != null && (savingsAccounts = multiSavingsSheetData.getSavingsAccounts()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = savingsAccounts.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsAccount) it.next()).getCards());
            }
            java.util.Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsReportCard) obj).getDownloadId(), str)) {
                    break;
                }
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsReportCard savingsReportCard = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsReportCard) obj;
            if (savingsReportCard != null && (cta = savingsReportCard.getCta()) != null && (linkDescription = cta.getLinkDescription()) != null) {
                str2 = linkDescription.getHref();
            }
        }
        if (str2 != null) {
            taxDocumentsViewModel.onEvent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.MultiSavingFormSelected(str, str2));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rXR-gm3wXQH9XNTd-LB4cJRQonk, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m20420$r8$lambda$rXRgm3wXQH9XNTdLB4cJRQonk(final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$TaxDocumentsScreen$lambda$30$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this.resetDownloadOrchestrator();
            }
        };
    }

    /* renamed from: $r8$lambda$ti-BKCp4ljnhbAer4IEiLcD-rz8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20421$r8$lambda$tiBKCp4ljnhbAer4IEiLcDrz8(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData sheetData) {
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta cta;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sheetData, "");
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.Button primaryCta = sheetData.getPrimaryCta();
        if (primaryCta != null && (cta = primaryCta.getCta()) != null) {
            taxDocumentsViewModel.onEvent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RequestReconTaxDocument(cta));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$w7uKjG8g1eAtNAF6IMB-fPfGsPk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20422$r8$lambda$w7uKjG8g1eAtNAF6IMBfPfGsPk(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zPuHyxiamURrNvqXmydXyjYZTcM(com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        mutableState.setValue(str);
        mutableState2.setValue(str2);
        bottomSheetController.showSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState access$TaxDocumentsScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState) state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ java.lang.String access$TaxDocumentsScreen$lambda$12(androidx.compose.runtime.MutableState mutableState) {
        return (java.lang.String) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData access$TaxDocumentsScreen$lambda$15(androidx.compose.runtime.MutableState mutableState) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ java.lang.String access$TaxDocumentsScreen$lambda$18(androidx.compose.runtime.MutableState mutableState) {
        return (java.lang.String) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData access$TaxDocumentsScreen$lambda$9(androidx.compose.runtime.MutableState mutableState) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ java.lang.String access$TaxDocumentsScreen$lambda$27(androidx.compose.runtime.MutableState mutableState) {
        return (java.lang.String) mutableState.getValue();
    }
}
