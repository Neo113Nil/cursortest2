package com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u001aA\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a7\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0001¢\u0006\u0002\u0010\u0014\u001a\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0000\u001a\r\u0010\u0018\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"ChooseDefaultPaymentContainerTestTag", "", "ChooseDefaultPaymentBackgroundTestTag", "ChooseDefaultPaymentHeaderTestTag", "ChooseDefaultPaymentIllustrationTestTag", "ChooseDefaultPaymentScreen", "", "onNavigateToHalfSheet", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "onResult", "Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/model/ChooseDefaultPaymentAppResult;", "viewModel", "Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/ChooseDefaultPaymentViewModel;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/ChooseDefaultPaymentViewModel;Landroidx/compose/runtime/Composer;II)V", "ChooseDefaultPaymentScreenContent", "onCloseClick", "Lkotlin/Function0;", "onGoToSettingsClick", "onSetupLaterClick", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "handleActivityResult", "resultCode", "", "ChooseDefaultPaymentScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "taptopay_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChooseDefaultPaymentScreenKt {
    public static final java.lang.String ChooseDefaultPaymentBackgroundTestTag = "background_container";
    public static final java.lang.String ChooseDefaultPaymentContainerTestTag = "setup_default_payment_container";
    public static final java.lang.String ChooseDefaultPaymentHeaderTestTag = "header_container";
    public static final java.lang.String ChooseDefaultPaymentIllustrationTestTag = "illustration_container";

    /* JADX WARN: Removed duplicated region for block: B:123:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChooseDefaultPaymentScreen(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult, kotlin.Unit> function12, com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel chooseDefaultPaymentViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult, kotlin.Unit> function13;
        com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel chooseDefaultPaymentViewModel2;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult, kotlin.Unit> function14;
        final com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel chooseDefaultPaymentViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult, kotlin.Unit> function15;
        int i4;
        int i5;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1067655737);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function13 = function12;
            i3 |= startRestartGroup.changedInstance(function13) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    chooseDefaultPaymentViewModel2 = chooseDefaultPaymentViewModel;
                    if (startRestartGroup.changedInstance(chooseDefaultPaymentViewModel2)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    chooseDefaultPaymentViewModel2 = chooseDefaultPaymentViewModel;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                chooseDefaultPaymentViewModel2 = chooseDefaultPaymentViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i7 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt.$r8$lambda$5b7Gc3bgbhhRAwNfft5q2DXV3x0((com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function15 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function15 = function13;
                    }
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
                        i5 = i3 & (-897);
                        chooseDefaultPaymentViewModel3 = (com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    } else {
                        i4 = 0;
                        i5 = i3;
                        chooseDefaultPaymentViewModel3 = chooseDefaultPaymentViewModel2;
                    }
                    function14 = function15;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    chooseDefaultPaymentViewModel3 = chooseDefaultPaymentViewModel2;
                    i4 = 0;
                    i5 = i3;
                    function14 = function13;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1067655737, i5, -1, "com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreen (ChooseDefaultPaymentScreen.kt:91)");
                }
                final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
                androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult startActivityForResult = new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult();
                int i8 = i5 & 112;
                int i9 = i8 == 32 ? 1 : i4;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (i9 != 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt.$r8$lambda$IGz_V97YJn2sDf1cg0ESkraz5ic(kotlin.jvm.functions.Function1.this, (androidx.view.result.ActivityResult) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, i4);
                boolean changedInstance = startRestartGroup.changedInstance(chooseDefaultPaymentViewModel3);
                boolean changedInstance2 = startRestartGroup.changedInstance(rememberLauncherForActivityResult);
                int i10 = i8 == 32 ? 1 : i4;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (((changedInstance ? 1 : 0) | (changedInstance2 ? 1 : 0) | i10) != 0 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$2$1(chooseDefaultPaymentViewModel3, rememberLauncherForActivityResult, function14, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue3;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, i4);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m20267invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20267invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance3 = startRestartGroup.changedInstance(chooseDefaultPaymentViewModel3);
                boolean z = i8 == 32;
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if ((changedInstance3 | z) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$3$1(chooseDefaultPaymentViewModel3, function14, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), 0.0f, 1, null), ChooseDefaultPaymentContainerTestTag);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                boolean z2 = i8 == 32;
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt.$r8$lambda$a621iLqj5kxhBrXd0N7LyUROvt0(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue6;
                boolean changedInstance4 = startRestartGroup.changedInstance(chooseDefaultPaymentViewModel3);
                boolean changedInstance5 = startRestartGroup.changedInstance(rememberLauncherForActivityResult);
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if ((changedInstance4 | changedInstance5) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt.m20266$r8$lambda$q6zkxLRALc5kmDjOSI1RanpSiQ(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel.this, rememberLauncherForActivityResult);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue7;
                boolean z3 = (i5 & 14) == 4;
                boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
                java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                if ((changed | z3) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt.m20265$r8$lambda$SQ23kGxjbwGvfqI2KolskpmqC0(kotlin.jvm.functions.Function1.this, rememberNavResultRequestId);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                ChooseDefaultPaymentScreenContent(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue8, startRestartGroup, 0);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                function14 = function13;
                chooseDefaultPaymentViewModel3 = chooseDefaultPaymentViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult, kotlin.Unit> function16 = function14;
                final com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel chooseDefaultPaymentViewModel4 = chooseDefaultPaymentViewModel3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt.m20262$r8$lambda$CeRWbtUc7ue_p6E_3wizipW00(kotlin.jvm.functions.Function1.this, function16, chooseDefaultPaymentViewModel4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function13 = function12;
        if ((i & 384) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void ChooseDefaultPaymentScreenContent(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-541821676);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-541821676, i2, -1, "com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenContent (ChooseDefaultPaymentScreen.kt:159)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.INSTANCE.getPRODUCT(), "setup", com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.Action.DEFAULT_PAYMENT_APP))), "background_container");
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1330448677, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt.$r8$lambda$SslcNY5sJ9LGctKPwKoNteQCYmw(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 1572870, 62);
            com.paypal.pds.components.DockKt.Dock(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1617467213, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt.m20261$r8$lambda$ZPJp8ire_ugJtYZdvSyWpUEqg(kotlin.jvm.functions.Function0.this, function03, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ComposableSingletons$ChooseDefaultPaymentScreenKt.INSTANCE.getLambda$1786718798$taptopay_prodRelease(), startRestartGroup, 27648, 6);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt.$r8$lambda$Jmt7PBz2F2osfrXX6_Dc5WNwH7o(kotlin.jvm.functions.Function0.this, function02, function03, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult handleActivityResult(int i) {
        if (i == -1) {
            return new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Completed(true);
        }
        return new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Completed(false);
    }

    /* renamed from: $r8$lambda$-ZPJp8ire_ugJt-YZdvSyWpUEqg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20261$r8$lambda$ZPJp8ire_ugJtYZdvSyWpUEqg(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1617467213, i, -1, "com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenContent.<anonymous>.<anonymous> (ChooseDefaultPaymentScreen.kt:188)");
            }
            com.paypal.pds.components.ButtonGroupKt.ButtonGroup(new com.paypal.pds.components.ButtonGroupItem[]{new com.paypal.pds.components.ButtonGroupItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_set_as_default, composer, 0), function0, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, new com.paypal.pds.core.AnalyticsScope(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.Item.INSTANCE.getCTA())), 44, null), new com.paypal.pds.components.ButtonGroupItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_setup_later, composer, 0), function02, null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, null, new com.paypal.pds.core.AnalyticsScope(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.Item.INSTANCE.getSKIP())), 44, null)}, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), com.paypal.pds.components.ButtonSize.Large.INSTANCE, null, composer, 384, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5b7Gc3bgbhhRAwNfft5q2DXV3x0(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult chooseDefaultPaymentAppResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chooseDefaultPaymentAppResult, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CeRWbtUc7-u-e_p6E_3wizipW00, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20262$r8$lambda$CeRWbtUc7ue_p6E_3wizipW00(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel chooseDefaultPaymentViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ChooseDefaultPaymentScreen(function1, function12, chooseDefaultPaymentViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ff6LgJuGrTVorCyhV16IG-dk0dM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20264$r8$lambda$Ff6LgJuGrTVorCyhV16IGdk0dM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-477838273);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-477838273, updateChangedFlags, -1, "com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenPreview (ChooseDefaultPaymentScreen.kt:253)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$$ExternalSyntheticLambda6
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ChooseDefaultPaymentScreenContent(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 438);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt.m20264$r8$lambda$Ff6LgJuGrTVorCyhV16IGdk0dM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IGz_V97YJn2sDf1cg0ESkraz5ic(kotlin.jvm.functions.Function1 function1, androidx.view.result.ActivityResult activityResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "");
        function1.invoke(handleActivityResult(activityResult.getResultCode()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Jmt7PBz2F2osfrXX6_Dc5WNwH7o(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, androidx.compose.runtime.Composer composer, int i2) {
        ChooseDefaultPaymentScreenContent(function0, function02, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SQ23kGxjbwGvfqI2KolskpmqC-0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20265$r8$lambda$SQ23kGxjbwGvfqI2KolskpmqC0(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        function1.invoke(com.paypal.oslo.core.navigation.result.NavResultRequestId.m11587boximpl(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SslcNY5sJ9LGctKPwKoNteQCYmw(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1330448677, i, -1, "com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenContent.<anonymous>.<anonymous> (ChooseDefaultPaymentScreen.kt:176)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton(function0, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.Item.INSTANCE.getDISMISS()), null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$a621iLqj5kxhBrXd0N7LyUROvt0(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Closed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$q6zkxLRALc5-kmDjOSI1RanpSiQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20266$r8$lambda$q6zkxLRALc5kmDjOSI1RanpSiQ(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel chooseDefaultPaymentViewModel, androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher) {
        chooseDefaultPaymentViewModel.setPaypalAsDefaultPaymentApp(managedActivityResultLauncher);
        return kotlin.Unit.INSTANCE;
    }
}
