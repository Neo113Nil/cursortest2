package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\u001a=\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a1\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0001¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0018²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u0084\u0002"}, d2 = {"TestAuthorizeBankModalLegalConsent", "", "TestAuthorizeBankModalPositiveButton", "TestAuthorizeBankModalNegativeButton", "AnnotationUserAgreement", "AnnotationPrivacyPolicy", "AddBankAuthorizeModal", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "bankParams", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/AddBankManualParams;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel;", "onCancelClick", "Lkotlin/Function0;", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/AddBankManualParams;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AddBankAuthorizeModalContent", "onAuthorizeClick", "(Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AddBankAuthorizeModalContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease", "addBankOutcome", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$Outcome;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddBankAuthorizeModalKt {
    public static final java.lang.String AnnotationPrivacyPolicy = "privacy_policy";
    public static final java.lang.String AnnotationUserAgreement = "user_agreement";
    public static final java.lang.String TestAuthorizeBankModalLegalConsent = "authorize_bank_modal_legal_consent";
    public static final java.lang.String TestAuthorizeBankModalNegativeButton = "authorize_bank_modal_negative_button";
    public static final java.lang.String TestAuthorizeBankModalPositiveButton = "authorize_bank_modal_positive_button";

    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddBankAuthorizeModal(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams addBankManualParams, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel manualAddBankViewModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel manualAddBankViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel manualAddBankViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        int i5;
        final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel manualAddBankViewModel4;
        int i6;
        boolean changed;
        int i7;
        boolean z;
        boolean changedInstance;
        boolean z2;
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$AddBankAuthorizeModal$1$1 rememberedValue;
        int i8;
        boolean z3;
        boolean changedInstance2;
        java.lang.Object rememberedValue2;
        int i9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankManualParams, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-742065207);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(addBankManualParams) : startRestartGroup.changedInstance(addBankManualParams) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                manualAddBankViewModel2 = manualAddBankViewModel;
                if (startRestartGroup.changedInstance(manualAddBankViewModel2)) {
                    i9 = 2048;
                    i3 |= i9;
                }
            } else {
                manualAddBankViewModel2 = manualAddBankViewModel;
            }
            i9 = 1024;
            i3 |= i9;
        } else {
            manualAddBankViewModel2 = manualAddBankViewModel;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
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
                    i5 = i3 & (-7169);
                    manualAddBankViewModel4 = (com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i6 = 256;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-742065207, i5, -1, "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModal (AddBankAuthorizeModal.kt:75)");
                    }
                    androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(manualAddBankViewModel4.getAddBankResult(), null, startRestartGroup, i4, 1);
                    com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome = (com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome) collectAsState.getValue();
                    changed = startRestartGroup.changed(collectAsState);
                    i7 = i5 & 14;
                    z = i7 != 4 || ((i5 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController));
                    changedInstance = startRestartGroup.changedInstance(manualAddBankViewModel4);
                    z2 = (i5 & 896) != i6;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if ((!(changed | z | changedInstance) && !z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        i8 = i7;
                        composer2 = startRestartGroup;
                        rememberedValue = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$AddBankAuthorizeModal$1$1(collectAsState, bottomSheetController, manualAddBankViewModel4, appNavigator, null);
                        composer2.updateRememberedValue(rememberedValue);
                    } else {
                        i8 = i7;
                        composer2 = startRestartGroup;
                    }
                    z3 = false;
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(outcome, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, 0);
                    changedInstance2 = composer2.changedInstance(manualAddBankViewModel4);
                    if ((i5 & 112) != 32 || ((i5 & 64) != 0 && composer2.changedInstance(addBankManualParams))) {
                        z3 = true;
                    }
                    rememberedValue2 = composer2.rememberedValue();
                    if (!(z3 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt.m20793$r8$lambda$deS_UHb0iZ3fwoCBMCoa5H232s(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.this, addBankManualParams);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    AddBankAuthorizeModalContent(bottomSheetController, (kotlin.jvm.functions.Function0) rememberedValue2, function0, composer2, com.paypal.pds.components.BottomSheetController.$stable | i8 | ((i5 >> 6) & 896));
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    manualAddBankViewModel3 = manualAddBankViewModel4;
                }
                i4 = 0;
                i6 = 256;
                i5 = i3;
                manualAddBankViewModel4 = manualAddBankViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(manualAddBankViewModel4.getAddBankResult(), null, startRestartGroup, i4, 1);
                com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome2 = (com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome) collectAsState2.getValue();
                changed = startRestartGroup.changed(collectAsState2);
                i7 = i5 & 14;
                if (i7 != 4) {
                }
                changedInstance = startRestartGroup.changedInstance(manualAddBankViewModel4);
                if ((i5 & 896) != i6) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changed | z | changedInstance | z2)) {
                }
                i8 = i7;
                composer2 = startRestartGroup;
                rememberedValue = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$AddBankAuthorizeModal$1$1(collectAsState2, bottomSheetController, manualAddBankViewModel4, appNavigator, null);
                composer2.updateRememberedValue(rememberedValue);
                z3 = false;
                androidx.compose.runtime.EffectsKt.LaunchedEffect(outcome2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, 0);
                changedInstance2 = composer2.changedInstance(manualAddBankViewModel4);
                if ((i5 & 112) != 32) {
                }
                z3 = true;
                rememberedValue2 = composer2.rememberedValue();
                if (!(z3 | changedInstance2)) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt.m20793$r8$lambda$deS_UHb0iZ3fwoCBMCoa5H232s(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.this, addBankManualParams);
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
                AddBankAuthorizeModalContent(bottomSheetController, (kotlin.jvm.functions.Function0) rememberedValue2, function0, composer2, com.paypal.pds.components.BottomSheetController.$stable | i8 | ((i5 >> 6) & 896));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                manualAddBankViewModel3 = manualAddBankViewModel4;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    manualAddBankViewModel4 = manualAddBankViewModel2;
                    i4 = 0;
                    i6 = 256;
                    i5 = i3 & (-7169);
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.runtime.State collectAsState22 = androidx.compose.runtime.SnapshotStateKt.collectAsState(manualAddBankViewModel4.getAddBankResult(), null, startRestartGroup, i4, 1);
                    com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome22 = (com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome) collectAsState22.getValue();
                    changed = startRestartGroup.changed(collectAsState22);
                    i7 = i5 & 14;
                    if (i7 != 4) {
                    }
                    changedInstance = startRestartGroup.changedInstance(manualAddBankViewModel4);
                    if ((i5 & 896) != i6) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changed | z | changedInstance | z2)) {
                    }
                    i8 = i7;
                    composer2 = startRestartGroup;
                    rememberedValue = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$AddBankAuthorizeModal$1$1(collectAsState22, bottomSheetController, manualAddBankViewModel4, appNavigator, null);
                    composer2.updateRememberedValue(rememberedValue);
                    z3 = false;
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(outcome22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, 0);
                    changedInstance2 = composer2.changedInstance(manualAddBankViewModel4);
                    if ((i5 & 112) != 32) {
                    }
                    z3 = true;
                    rememberedValue2 = composer2.rememberedValue();
                    if (!(z3 | changedInstance2)) {
                    }
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt.m20793$r8$lambda$deS_UHb0iZ3fwoCBMCoa5H232s(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.this, addBankManualParams);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                    AddBankAuthorizeModalContent(bottomSheetController, (kotlin.jvm.functions.Function0) rememberedValue2, function0, composer2, com.paypal.pds.components.BottomSheetController.$stable | i8 | ((i5 >> 6) & 896));
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    manualAddBankViewModel3 = manualAddBankViewModel4;
                }
                i4 = 0;
                i6 = 256;
                i5 = i3;
                manualAddBankViewModel4 = manualAddBankViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsState222 = androidx.compose.runtime.SnapshotStateKt.collectAsState(manualAddBankViewModel4.getAddBankResult(), null, startRestartGroup, i4, 1);
                com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome222 = (com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome) collectAsState222.getValue();
                changed = startRestartGroup.changed(collectAsState222);
                i7 = i5 & 14;
                if (i7 != 4) {
                }
                changedInstance = startRestartGroup.changedInstance(manualAddBankViewModel4);
                if ((i5 & 896) != i6) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changed | z | changedInstance | z2)) {
                }
                i8 = i7;
                composer2 = startRestartGroup;
                rememberedValue = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$AddBankAuthorizeModal$1$1(collectAsState222, bottomSheetController, manualAddBankViewModel4, appNavigator, null);
                composer2.updateRememberedValue(rememberedValue);
                z3 = false;
                androidx.compose.runtime.EffectsKt.LaunchedEffect(outcome222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, 0);
                changedInstance2 = composer2.changedInstance(manualAddBankViewModel4);
                if ((i5 & 112) != 32) {
                }
                z3 = true;
                rememberedValue2 = composer2.rememberedValue();
                if (!(z3 | changedInstance2)) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt.m20793$r8$lambda$deS_UHb0iZ3fwoCBMCoa5H232s(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.this, addBankManualParams);
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
                AddBankAuthorizeModalContent(bottomSheetController, (kotlin.jvm.functions.Function0) rememberedValue2, function0, composer2, com.paypal.pds.components.BottomSheetController.$stable | i8 | ((i5 >> 6) & 896));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                manualAddBankViewModel3 = manualAddBankViewModel4;
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            manualAddBankViewModel3 = manualAddBankViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt.m20792$r8$lambda$Jdsa7sRlywCNUmfoVFOHnlIsUg(com.paypal.pds.components.BottomSheetController.this, addBankManualParams, appNavigator, manualAddBankViewModel3, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AddBankAuthorizeModalContent(final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1860444414);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
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
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1860444414, i2, -1, "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalContent (AddBankAuthorizeModal.kt:115)");
            }
            final java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_user_agreement, startRestartGroup, 0), "user_agreement"), kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_add_bank_privacy_statement, startRestartGroup, 0), AnnotationPrivacyPolicy)});
            final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_user_agreement_url, startRestartGroup, 0);
            final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_privacy_policy_url, startRestartGroup, 0);
            final androidx.compose.ui.platform.UriHandler uriHandler = (androidx.compose.ui.platform.UriHandler) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalUriHandler());
            boolean changedInstance = startRestartGroup.changedInstance(uriHandler);
            boolean changed = startRestartGroup.changed(stringResource);
            boolean changed2 = startRestartGroup.changed(stringResource2);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt.m20791$r8$lambda$8Aog9teglTkzz36OShKCFRkUo(androidx.compose.ui.platform.UriHandler.this, stringResource, stringResource2, (java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, null, new com.paypal.pds.components.TopNavConfig(null, false, null, 5, null), null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_add_bank_authorize_title, startRestartGroup, 0), null, function02, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1972345577, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt.$r8$lambda$FHWHS6Iet1aZRQyQnw9w422IxqI(listOf, function2, function0, function02, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 905969664 | (i2 & 14) | (com.paypal.pds.components.TopNavConfig.$stable << 6) | ((i2 << 12) & 3670016), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt.$r8$lambda$gVHrYF9i_sAz5x2kkTBKq5jKIrU(com.paypal.pds.components.BottomSheetController.this, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5HDjmPDrxtBueXbgHMjAaTEG7bw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-750763650);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-750763650, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalContentPreview (AddBankAuthorizeModal.kt:191)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            bottomSheetController.showSheet();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            AddBankAuthorizeModalContent(bottomSheetController, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt.$r8$lambda$5HDjmPDrxtBueXbgHMjAaTEG7bw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8A-og9teglTkzz36OShKCFRk-Uo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20791$r8$lambda$8Aog9teglTkzz36OShKCFRkUo(androidx.compose.ui.platform.UriHandler uriHandler, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str4, "user_agreement")) {
            uriHandler.openUri(str);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(str4, AnnotationPrivacyPolicy)) {
            uriHandler.openUri(str2);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FHWHS6Iet1aZRQyQnw9w422IxqI(java.util.List list, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1972345577, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalContent.<anonymous> (AddBankAuthorizeModal.kt:146)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1708paddingVpY3zN4$default);
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
            com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(com.paypal.pds.core.RichTextKt.toRichText(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_add_bank_authorize_description, composer, 0), list), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), TestAuthorizeBankModalLegalConsent), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, function2, null, null, composer, 384, 0, 7160);
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_add_bank_authorize_button_label, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null), TestAuthorizeBankModalPositiveButton), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer, 1769472, 408);
            com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_cancel, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 0.0f, 13, null), TestAuthorizeBankModalNegativeButton), null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer, 1769472, 408);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Jdsa-7sRlywCNUmfoVFOHnlIsUg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20792$r8$lambda$Jdsa7sRlywCNUmfoVFOHnlIsUg(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams addBankManualParams, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel manualAddBankViewModel, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddBankAuthorizeModal(bottomSheetController, addBankManualParams, appNavigator, manualAddBankViewModel, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$deS_UHb0iZ3fwoCBM-Coa5H232s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20793$r8$lambda$deS_UHb0iZ3fwoCBMCoa5H232s(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel manualAddBankViewModel, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams addBankManualParams) {
        manualAddBankViewModel.addBankAccount(addBankManualParams);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gVHrYF9i_sAz5x2kkTBKq5jKIrU(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        AddBankAuthorizeModalContent(bottomSheetController, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome access$AddBankAuthorizeModal$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome) state.getValue();
    }
}
