package com.paypal.oslo.feature.debitcard.shared.ui.addressselection;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u007f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010\u0015\u001a6\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a@\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0016\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0019²\u0006\n\u0010\u0017\u001a\u00020\u0010X\u008a\u0084\u0002"}, d2 = {"AddressSelectionComponent", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "debitInstrumentId", "", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onAddressSave", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/billingaddress/model/DebitCardAddress;", "onStateUpdate", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState;", "config", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/AddressSelectionConfig;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/viewmodel/AddressSelectionViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/AddressSelectionConfig;Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/viewmodel/AddressSelectionViewModel;Landroidx/compose/runtime/Composer;II)V", "handleErrorAction", "state", "handleSaveButtonClick", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressSelectionComponentKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0559  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddressSelectionComponent(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState, kotlin.Unit> function12, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig addressSelectionConfig, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress, kotlin.Unit> function13;
        com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig addressSelectionConfig2;
        com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel2;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState, kotlin.Unit> function14;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress, kotlin.Unit> function15;
        final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig addressSelectionConfig3;
        final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState, kotlin.Unit> function16;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress, kotlin.Unit> function17;
        com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel4;
        int i4;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState, kotlin.Unit> function18;
        com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig addressSelectionConfig4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        java.lang.String str2;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;
        int i5;
        int i6;
        kotlin.Unit unit;
        com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel5;
        int i7;
        int i8;
        kotlin.coroutines.Continuation continuation;
        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical spaceBetween;
        com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel6;
        com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig addressSelectionConfig5;
        com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel7;
        boolean z;
        boolean z2;
        boolean changed;
        boolean changedInstance;
        boolean z3;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.Composer composer3;
        int i9;
        int i10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1196617996);
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
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        int i11 = i2 & 32;
        if (i11 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function13 = function1;
        } else {
            function13 = function1;
            if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= startRestartGroup.changedInstance(function13) ? 131072 : 65536;
            }
        }
        int i12 = i2 & 64;
        if (i12 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            if ((i2 & 128) == 0) {
                addressSelectionConfig2 = addressSelectionConfig;
                if (startRestartGroup.changed(addressSelectionConfig2)) {
                    i10 = 8388608;
                    i3 |= i10;
                }
            } else {
                addressSelectionConfig2 = addressSelectionConfig;
            }
            i10 = 4194304;
            i3 |= i10;
        } else {
            addressSelectionConfig2 = addressSelectionConfig;
        }
        if ((i & 100663296) == 0) {
            if ((i2 & 256) == 0) {
                addressSelectionViewModel2 = addressSelectionViewModel;
                if (startRestartGroup.changedInstance(addressSelectionViewModel2)) {
                    i9 = 67108864;
                    i3 |= i9;
                }
            } else {
                addressSelectionViewModel2 = addressSelectionViewModel;
            }
            i9 = 33554432;
            i3 |= i9;
        } else {
            addressSelectionViewModel2 = addressSelectionViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i11 != 0) {
                    function13 = null;
                }
                if (i12 != 0) {
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt.$r8$lambda$qyIoazt2EyHwK5lNJ5HoaKiIq54((com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    function16 = (kotlin.jvm.functions.Function1) rememberedValue2;
                } else {
                    function16 = function12;
                }
                if ((i2 & 128) != 0) {
                    i3 &= -29360129;
                    addressSelectionConfig2 = new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig(false, null, false, false, false, 31, null);
                }
                if ((i2 & 256) != 0) {
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
                    com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel8 = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i4 = i3 & (-234881025);
                    addressSelectionViewModel4 = addressSelectionViewModel8;
                    function17 = function13;
                } else {
                    function17 = function13;
                    addressSelectionViewModel4 = addressSelectionViewModel2;
                    i4 = i3;
                }
                com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig addressSelectionConfig6 = addressSelectionConfig2;
                function18 = function16;
                addressSelectionConfig4 = addressSelectionConfig6;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 128) != 0) {
                    i3 &= -29360129;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                }
                function17 = function13;
                addressSelectionViewModel4 = addressSelectionViewModel2;
                addressSelectionConfig4 = addressSelectionConfig2;
                function18 = function12;
                i4 = i3;
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1196617996, i4, -1, "com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponent (AddressSelectionComponent.kt:81)");
            }
            final androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(addressSelectionViewModel4.getState(), null, startRestartGroup, 0, 1);
            java.lang.String buttonText = addressSelectionConfig4.getButtonText();
            if (buttonText == null) {
                startRestartGroup.startReplaceGroup(-1101324541);
                str2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_save, startRestartGroup, 0);
            } else {
                startRestartGroup.startReplaceGroup(-1101325192);
                str2 = buttonText;
            }
            startRestartGroup.endReplaceGroup();
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            boolean changedInstance2 = startRestartGroup.changedInstance(addressSelectionViewModel4);
            int i13 = i4 & 112;
            final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig addressSelectionConfig7 = addressSelectionConfig4;
            boolean z4 = i13 == 32;
            int i14 = i4 & 896;
            boolean z5 = i14 == 256;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (((z4 | changedInstance2) || z5) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                navResultManager = null;
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt$AddressSelectionComponent$2$1(addressSelectionViewModel4, str, debitCardProductName, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                navResultManager = null;
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue3;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, startRestartGroup, 0);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt$AddressSelectionComponent$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m14591invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m14591invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str3) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                        return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str3);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            int i15 = i4;
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel9 = addressSelectionViewModel4;
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
            boolean z6 = i13 == 32;
            boolean z7 = i14 == 256;
            boolean changedInstance3 = startRestartGroup.changedInstance(addressSelectionViewModel9);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if ((z7 | z6 | changedInstance3) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt$AddressSelectionComponent$3$1(str, debitCardProductName, addressSelectionViewModel9, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            int i16 = i15 >> 3;
            androidx.compose.runtime.EffectsKt.LaunchedEffect(str, debitCardProductName, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, i16 & 126);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changedInstance4 = startRestartGroup.changedInstance(addressSelectionViewModel9);
            int i17 = i15 & 458752;
            boolean z8 = i17 == 131072;
            int i18 = i15 & 14;
            boolean z9 = i18 == 4;
            boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId);
            boolean z10 = i14 == 256;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (((changedInstance4 | z8 | z9 | changed2) || z10) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i5 = i15;
                i6 = i17;
                unit = unit2;
                addressSelectionViewModel5 = addressSelectionViewModel9;
                i7 = i14;
                i8 = i18;
                continuation = null;
                rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt$AddressSelectionComponent$4$1(addressSelectionViewModel9, function17, appNavigator, rememberNavResultRequestId, debitCardProductName, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            } else {
                i5 = i15;
                i6 = i17;
                unit = unit2;
                addressSelectionViewModel5 = addressSelectionViewModel9;
                i7 = i14;
                i8 = i18;
                continuation = null;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 6);
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState addressSelectionState = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState) collectAsState.getValue();
            int i19 = i5;
            boolean z11 = (3670016 & i19) == 1048576;
            boolean changed3 = startRestartGroup.changed(collectAsState);
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if ((z11 | changed3) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt$AddressSelectionComponent$5$1(function18, collectAsState, continuation);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(addressSelectionState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue7, startRestartGroup, 0);
            if (!addressSelectionConfig7.isFullScreen()) {
                spaceBetween = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
            } else {
                spaceBetween = androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween();
            }
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(spaceBetween, androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState addressSelectionState2 = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState) collectAsState.getValue();
            androidx.compose.ui.Modifier weight = columnScopeInstance.weight(androidx.compose.ui.Modifier.INSTANCE, 1.0f, false);
            boolean showAddNewAddressButton = addressSelectionConfig7.getShowAddNewAddressButton();
            boolean isFullScreen = addressSelectionConfig7.isFullScreen();
            final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel10 = addressSelectionViewModel5;
            boolean changedInstance5 = startRestartGroup.changedInstance(addressSelectionViewModel10);
            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changedInstance5 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt.m14587$r8$lambda$MP_iwHHNipmfboLDDghT522HGk(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel.this, ((java.lang.Integer) obj).intValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            kotlin.jvm.functions.Function1 function19 = (kotlin.jvm.functions.Function1) rememberedValue8;
            boolean changedInstance6 = startRestartGroup.changedInstance(addressSelectionViewModel10);
            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (changedInstance6 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt.$r8$lambda$oJb9rxeAXcwj2cgWMVl0Idiljus(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue9;
            boolean changed4 = startRestartGroup.changed(collectAsState);
            boolean z12 = (i19 & 7168) == 2048;
            boolean changedInstance7 = startRestartGroup.changedInstance(addressSelectionViewModel10);
            boolean z13 = i13 == 32;
            boolean z14 = i7 == 256;
            java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (((changed4 | z12 | changedInstance7 | z13) || z14) || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                addressSelectionViewModel6 = addressSelectionViewModel10;
                rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt.m14588$r8$lambda$OlSi3j9yaNB8H99ZfDrEUDcISM(kotlin.jvm.functions.Function0.this, addressSelectionViewModel10, str, debitCardProductName, collectAsState);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            } else {
                addressSelectionViewModel6 = addressSelectionViewModel10;
            }
            function14 = function18;
            boolean z15 = false;
            final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel11 = addressSelectionViewModel6;
            java.lang.Object obj = continuation;
            com.paypal.oslo.feature.debitcard.shared.ui.components.AddressContentKt.AddressContent(addressSelectionState2, debitCardProductName, function19, function02, (kotlin.jvm.functions.Function0) rememberedValue10, function0, isFullScreen, weight, showAddNewAddressButton, startRestartGroup, (i16 & 112) | ((i19 << 6) & 458752), 0);
            if (addressSelectionConfig7.getShowButton() && !(((com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState) collectAsState.getValue()) instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error)) {
                startRestartGroup.startReplaceGroup(1065748595);
                if (((com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState) collectAsState.getValue()) instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success) {
                    com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState addressSelectionState3 = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState) collectAsState.getValue();
                    com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success success = addressSelectionState3 instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success ? (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success) addressSelectionState3 : obj;
                    if ((success != 0 ? success.getSelectedIndex() : obj) != null) {
                        z = true;
                        com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                        com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                        androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.analytics.EditBillingAddressAnalytics.INSTANCE.getBILLING_ADDRESS_SAVE_ADDRESS()), 0.0f, 1, obj), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, obj);
                        boolean z16 = ((com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState) collectAsState.getValue()) instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving;
                        z2 = (((29360128 & i19) ^ 12582912) <= 8388608 && startRestartGroup.changed(addressSelectionConfig7)) || (i19 & 12582912) == 8388608;
                        changed = startRestartGroup.changed(collectAsState);
                        changedInstance = startRestartGroup.changedInstance(addressSelectionViewModel11);
                        z3 = i6 != 131072;
                        if (i8 == 4) {
                            z15 = true;
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if ((!(changed | z2 | changedInstance | z3) && !z15) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress, kotlin.Unit> function110 = function17;
                            composer3 = startRestartGroup;
                            java.lang.Object obj2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt.$r8$lambda$8nBksk2NnDbMQdMqJSgdBlIfVg4(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig.this, addressSelectionViewModel11, function110, appNavigator, collectAsState);
                                }
                            };
                            composer3.updateRememberedValue(obj2);
                            rememberedValue = obj2;
                        } else {
                            composer3 = startRestartGroup;
                        }
                        composer2 = composer3;
                        addressSelectionViewModel7 = addressSelectionViewModel11;
                        addressSelectionConfig5 = addressSelectionConfig7;
                        com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, str2, m1708paddingVpY3zN4$default, null, null, primary, large, z, z16, composer2, 1769472, 24);
                        composer2.endReplaceGroup();
                    }
                }
                z = false;
                com.paypal.pds.components.ButtonStyle.Primary primary2 = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                com.paypal.pds.components.ButtonSize.Large large2 = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.analytics.EditBillingAddressAnalytics.INSTANCE.getBILLING_ADDRESS_SAVE_ADDRESS()), 0.0f, 1, obj), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, obj);
                boolean z162 = ((com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState) collectAsState.getValue()) instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving;
                if (((29360128 & i19) ^ 12582912) <= 8388608) {
                }
                changed = startRestartGroup.changed(collectAsState);
                changedInstance = startRestartGroup.changedInstance(addressSelectionViewModel11);
                if (i6 != 131072) {
                }
                if (i8 == 4) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changed | z2 | changedInstance | z3 | z15)) {
                }
                final kotlin.jvm.functions.Function1 function1102 = function17;
                composer3 = startRestartGroup;
                java.lang.Object obj22 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt.$r8$lambda$8nBksk2NnDbMQdMqJSgdBlIfVg4(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig.this, addressSelectionViewModel11, function1102, appNavigator, collectAsState);
                    }
                };
                composer3.updateRememberedValue(obj22);
                rememberedValue = obj22;
                composer2 = composer3;
                addressSelectionViewModel7 = addressSelectionViewModel11;
                addressSelectionConfig5 = addressSelectionConfig7;
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, str2, m1708paddingVpY3zN4$default2, null, null, primary2, large2, z, z162, composer2, 1769472, 24);
                composer2.endReplaceGroup();
            } else {
                addressSelectionConfig5 = addressSelectionConfig7;
                composer2 = startRestartGroup;
                addressSelectionViewModel7 = addressSelectionViewModel11;
                composer2.startReplaceGroup(1066695180);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            addressSelectionViewModel3 = addressSelectionViewModel7;
            addressSelectionConfig3 = addressSelectionConfig5;
            function15 = function17;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            function14 = function12;
            function15 = function13;
            addressSelectionConfig3 = addressSelectionConfig2;
            addressSelectionViewModel3 = addressSelectionViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt.m14589$r8$lambda$i9sLJqD361n54fQqr0zyInNVUo(com.paypal.oslo.core.navigation.AppNavigator.this, str, debitCardProductName, function0, modifier, function15, function14, addressSelectionConfig3, addressSelectionViewModel3, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8nBksk2NnDbMQdMqJSgdBlIfVg4(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig addressSelectionConfig, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.State state) {
        java.lang.Integer selectedIndex;
        com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState addressSelectionState = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState) state.getValue();
        if (addressSelectionConfig.getUpdateAddress()) {
            addressSelectionViewModel.onEvent(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveAddress.INSTANCE);
        } else {
            com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress debitCardAddress = null;
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success success = addressSelectionState instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success ? (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success) addressSelectionState : null;
            if (success != null && (selectedIndex = success.getSelectedIndex()) != null) {
                debitCardAddress = (com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress) kotlin.collections.CollectionsKt.getOrNull(success.getAddresses(), selectedIndex.intValue());
            }
            if (function1 != null) {
                function1.invoke(debitCardAddress);
            } else {
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt.m14590$r8$lambda$uvL5_AB_9BmelcXaL7PY6pd7q4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MP_iwHHNipm-fboLDDghT522HGk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14587$r8$lambda$MP_iwHHNipmfboLDDghT522HGk(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel, int i) {
        addressSelectionViewModel.onEvent(new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressSelected(i));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OlS-i3j9yaNB8H99ZfDrEUDcISM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14588$r8$lambda$OlSi3j9yaNB8H99ZfDrEUDcISM(kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel, java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, androidx.compose.runtime.State state) {
        com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState addressSelectionState = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState) state.getValue();
        com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error error = addressSelectionState instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error ? (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error) addressSelectionState : null;
        if (error == null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Error action clicked but state is not Error: ".concat(java.lang.String.valueOf(addressSelectionState)), null, null, null, 14, null);
        } else if (error.getErrorType() != com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.NO_NETWORK && error.getRetryCount() > 0) {
            function0.invoke();
        } else if (error.getApiRetryType() instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.ListAddresses) {
            addressSelectionViewModel.onEvent(new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadAddresses(str, debitCardProductName, ((com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.ListAddresses) error.getApiRetryType()).getNewlyAddedAddressId()));
        } else if (error.getApiRetryType() instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.SaveAddress) {
            addressSelectionViewModel.onEvent(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveAddress.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$i9sLJqD361n54fQqr0zyInN-VUo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14589$r8$lambda$i9sLJqD361n54fQqr0zyInNVUo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig addressSelectionConfig, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddressSelectionComponent(appNavigator, str, debitCardProductName, function0, modifier, function1, function12, addressSelectionConfig, addressSelectionViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oJb9rxeAXcwj2cgWMVl0Idiljus(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel) {
        addressSelectionViewModel.onEvent(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddNewAddressClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qyIoazt2EyHwK5lNJ5HoaKiIq54(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState addressSelectionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressSelectionState, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uvL-5_AB_9BmelcXaL7PY6pd7q4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14590$r8$lambda$uvL5_AB_9BmelcXaL7PY6pd7q4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState access$AddressSelectionComponent$lambda$1(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState) state.getValue();
    }
}
