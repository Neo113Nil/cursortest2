package com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"EditBillingAddressBottomSheet", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "debitInstrumentId", "", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "title", "actionText", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "onDismiss", "Lkotlin/Function0;", "onAddressSave", "viewModel", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/viewmodel/AddressSelectionViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/viewmodel/AddressSelectionViewModel;Landroidx/compose/runtime/Composer;II)V", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EditBillingAddressBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EditBillingAddressBottomSheet(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final java.lang.String str2, final java.lang.String str3, final com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel4;
        java.lang.Object rememberedValue;
        boolean changedInstance;
        boolean z;
        boolean z2;
        java.lang.Object rememberedValue2;
        boolean changed;
        java.lang.Object rememberedValue3;
        boolean z3;
        boolean z4;
        java.lang.Object rememberedValue4;
        java.lang.Object obj;
        boolean changed2;
        java.lang.Object rememberedValue5;
        boolean changed3;
        java.lang.Object rememberedValue6;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2020114303);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(debitCardProductName.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= (i & 262144) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 131072 : 65536;
        }
        int i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            function03 = function0;
            i3 |= startRestartGroup.changedInstance(function03) ? 1048576 : 524288;
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
                function04 = function02;
            } else {
                function04 = function02;
                if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(function04) ? 8388608 : 4194304;
                }
            }
            if ((i & 100663296) == 0) {
                if ((i2 & 256) == 0 && startRestartGroup.changedInstance(addressSelectionViewModel)) {
                    i5 = 67108864;
                    i3 |= i5;
                }
                i5 = 33554432;
                i3 |= i5;
            }
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i6 != 0) {
                        java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                        if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue7);
                        }
                        function03 = (kotlin.jvm.functions.Function0) rememberedValue7;
                    }
                    if (i4 != 0) {
                        java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                        if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue8);
                        }
                        function04 = (kotlin.jvm.functions.Function0) rememberedValue8;
                    }
                    if ((i2 & 256) == 0) {
                        addressSelectionViewModel3 = addressSelectionViewModel;
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function07 = function04;
                        int i7 = i3;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(2020114303, i7, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheet (EditBillingAddressBottomSheet.kt:60)");
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Initial.INSTANCE, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                        changedInstance = startRestartGroup.changedInstance(addressSelectionViewModel3);
                        int i8 = 458752 & i7;
                        z = i8 != 131072 || ((i7 & 262144) != 0 && startRestartGroup.changedInstance(bottomSheetController));
                        int i9 = i7 & 3670016;
                        z2 = i9 != 1048576;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!(changedInstance | z | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt.$r8$lambda$Lomvs1KwVeU0QnnoyMM_cstwtT4(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel.this, bottomSheetController, function03);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        final kotlin.jvm.functions.Function0 function08 = (kotlin.jvm.functions.Function0) rememberedValue2;
                        boolean visible = bottomSheetController.getVisible();
                        changed = startRestartGroup.changed(function08);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt.$r8$lambda$sxB0EJ37fDxL5SMXWnCYfbXtLB4(kotlin.jvm.functions.Function0.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.view.compose.BackHandlerKt.BackHandler(visible, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 0);
                        boolean visible2 = bottomSheetController.getVisible();
                        z3 = i8 != 131072 || ((262144 & i7) != 0 && startRestartGroup.changedInstance(bottomSheetController));
                        z4 = i9 != 1048576;
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if ((!z3 && !z4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            obj = null;
                            rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$EditBillingAddressBottomSheet$4$1(bottomSheetController, function03, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        } else {
                            obj = null;
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(visible2), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 0);
                        androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
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
                        com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(!(mutableState.getValue() instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error) ? null : str2, false, null, 6, null);
                        changed2 = startRestartGroup.changed(function08);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changed2 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt.$r8$lambda$pRP4H9b_tYyuSeIEUcdkvQwm0QM(kotlin.jvm.functions.Function0.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        kotlin.jvm.functions.Function0 function09 = (kotlin.jvm.functions.Function0) rememberedValue5;
                        changed3 = startRestartGroup.changed(function08);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (!changed3 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt.m14367$r8$lambda$C857ovSH5dwN95ALkAjfV42iLA(kotlin.jvm.functions.Function0.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel5 = addressSelectionViewModel3;
                        kotlin.jvm.functions.Function0<kotlin.Unit> function010 = function03;
                        composer2 = startRestartGroup;
                        com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function09, topNavConfig, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue6, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1572683042, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt.m14368$r8$lambda$OY1WCgUuSx6ccyiKkl65SNPFaE(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.this, mutableState, str3, appNavigator, str, function08, function07, addressSelectionViewModel5, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, composer2, 54), composer2, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | ((i7 >> 15) & 14) | (com.paypal.pds.components.TopNavConfig.$stable << 6), 440);
                        composer2.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        addressSelectionViewModel2 = addressSelectionViewModel5;
                        function05 = function07;
                        function06 = function010;
                    } else {
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
                        addressSelectionViewModel4 = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i3 &= -234881025;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                    }
                    addressSelectionViewModel4 = addressSelectionViewModel;
                }
                addressSelectionViewModel3 = addressSelectionViewModel4;
                final kotlin.jvm.functions.Function0 function072 = function04;
                int i72 = i3;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue;
                changedInstance = startRestartGroup.changedInstance(addressSelectionViewModel3);
                int i82 = 458752 & i72;
                if (i82 != 131072) {
                }
                int i92 = i72 & 3670016;
                if (i92 != 1048576) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(changedInstance | z | z2)) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt.$r8$lambda$Lomvs1KwVeU0QnnoyMM_cstwtT4(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel.this, bottomSheetController, function03);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                final kotlin.jvm.functions.Function0 function082 = (kotlin.jvm.functions.Function0) rememberedValue2;
                boolean visible3 = bottomSheetController.getVisible();
                changed = startRestartGroup.changed(function082);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt.$r8$lambda$sxB0EJ37fDxL5SMXWnCYfbXtLB4(kotlin.jvm.functions.Function0.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                androidx.view.compose.BackHandlerKt.BackHandler(visible3, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 0);
                boolean visible22 = bottomSheetController.getVisible();
                if (i82 != 131072) {
                }
                if (i92 != 1048576) {
                }
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!(z3 | z4)) {
                }
                obj = null;
                rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$EditBillingAddressBottomSheet$4$1(bottomSheetController, function03, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(visible22), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 0);
                androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                com.paypal.pds.components.TopNavConfig topNavConfig2 = new com.paypal.pds.components.TopNavConfig(!(mutableState2.getValue() instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error) ? null : str2, false, null, 6, null);
                changed2 = startRestartGroup.changed(function082);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt.$r8$lambda$pRP4H9b_tYyuSeIEUcdkvQwm0QM(kotlin.jvm.functions.Function0.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
                kotlin.jvm.functions.Function0 function092 = (kotlin.jvm.functions.Function0) rememberedValue5;
                changed3 = startRestartGroup.changed(function082);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt.m14367$r8$lambda$C857ovSH5dwN95ALkAjfV42iLA(kotlin.jvm.functions.Function0.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
                final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel52 = addressSelectionViewModel3;
                kotlin.jvm.functions.Function0<kotlin.Unit> function0102 = function03;
                composer2 = startRestartGroup;
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function092, topNavConfig2, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue6, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1572683042, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt.m14368$r8$lambda$OY1WCgUuSx6ccyiKkl65SNPFaE(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.this, mutableState2, str3, appNavigator, str, function082, function072, addressSelectionViewModel52, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, composer2, 54), composer2, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | ((i72 >> 15) & 14) | (com.paypal.pds.components.TopNavConfig.$stable << 6), 440);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                addressSelectionViewModel2 = addressSelectionViewModel52;
                function05 = function072;
                function06 = function0102;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                addressSelectionViewModel2 = addressSelectionViewModel;
                function05 = function04;
                function06 = function03;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt.m14369$r8$lambda$w3Gt8GsW8DSy6GlVgV6J5qzh5w(com.paypal.oslo.core.navigation.AppNavigator.this, str, debitCardProductName, str2, str3, bottomSheetController, function06, function05, addressSelectionViewModel2, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        function03 = function0;
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-PAYuTO2EZwfLKq2lV-2w-ZU86g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14365$r8$lambda$PAYuTO2EZwfLKq2lV2wZU86g(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$C857ovSH-5dwN95ALkAjfV42iLA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14367$r8$lambda$C857ovSH5dwN95ALkAjfV42iLA(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Lomvs1KwVeU0QnnoyMM_cstwtT4(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        addressSelectionViewModel.onEvent(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.DismissAddressSelection.INSTANCE);
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OY1WCgUuSx6cc-yiKkl65SNPFaE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14368$r8$lambda$OY1WCgUuSx6ccyiKkl65SNPFaE(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final androidx.compose.runtime.MutableState mutableState, java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str2, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function0 function02, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1572683042, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheet.<anonymous>.<anonymous> (EditBillingAddressBottomSheet.kt:95)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.debitcard.shared.analytics.EditBillingAddressAnalytics.INSTANCE.getUserIntent(debitCardProductName))), 0.0f, 1, null);
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig addressSelectionConfig = new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig(false, str, !(mutableState.getValue() instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error), true, false, 1, null);
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt.m14365$r8$lambda$PAYuTO2EZwfLKq2lV2wZU86g(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed2 = composer.changed(function02);
            boolean changed3 = composer.changed(function0);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed2 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt.$r8$lambda$j9EHa3GnyaqXXWJOqsZ9pRiTk_8(kotlin.jvm.functions.Function0.this, function0, (com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.editbillingaddress.EditBillingAddressBottomSheetKt.$r8$lambda$_Fvi2OwaR3eGyekW2BC3wfYaTiw(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt.AddressSelectionComponent(appNavigator, str2, debitCardProductName, function03, fillMaxWidth$default, function1, (kotlin.jvm.functions.Function1) rememberedValue3, addressSelectionConfig, addressSelectionViewModel, composer, 1572864, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_Fvi2OwaR3eGyekW2BC3wfYaTiw(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState addressSelectionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressSelectionState, "");
        mutableState.setValue(addressSelectionState);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$j9EHa3GnyaqXXWJOqsZ9pRiTk_8(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress debitCardAddress) {
        function0.invoke();
        function02.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pRP4H9b_tYyuSeIEUcdkvQwm0QM(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sxB0EJ37fDxL5SMXWnCYfbXtLB4(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$w3Gt8GsW8D-Sy6GlVgV6J5qzh5w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14369$r8$lambda$w3Gt8GsW8DSy6GlVgV6J5qzh5w(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, java.lang.String str3, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EditBillingAddressBottomSheet(appNavigator, str, debitCardProductName, str2, str3, bottomSheetController, function0, function02, addressSelectionViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
