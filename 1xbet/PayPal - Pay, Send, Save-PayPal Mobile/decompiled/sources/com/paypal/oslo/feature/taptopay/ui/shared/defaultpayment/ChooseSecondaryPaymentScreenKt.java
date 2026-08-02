package com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a3\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\u0010\t\u001a)\u0010\n\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"ChooseSecondaryPaymentContainerTestTag", "", "ChooseSecondaryPaymentScreen", "", "viewModel", "Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/ChooseSecondaryPaymentViewModel;", "onSetupComplete", "Lkotlin/Function0;", "onClose", "(Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/ChooseSecondaryPaymentViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ChooseSecondaryPaymentScreenContent", "onGoToSettings", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ChooseSecondaryPaymentScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "taptopay_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChooseSecondaryPaymentScreenKt {
    public static final java.lang.String ChooseSecondaryPaymentContainerTestTag = "setup_secondary_payment_container";

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChooseSecondaryPaymentScreen(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel chooseSecondaryPaymentViewModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel chooseSecondaryPaymentViewModel2;
        int i3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        int i5;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        boolean changedInstance2;
        int i6;
        java.lang.Object rememberedValue2;
        boolean changedInstance3;
        java.lang.Object rememberedValue3;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1929493322);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                chooseSecondaryPaymentViewModel2 = chooseSecondaryPaymentViewModel;
                if (startRestartGroup.changedInstance(chooseSecondaryPaymentViewModel2)) {
                    i7 = 4;
                    i3 = i7 | i;
                }
            } else {
                chooseSecondaryPaymentViewModel2 = chooseSecondaryPaymentViewModel;
            }
            i7 = 2;
            i3 = i7 | i;
        } else {
            chooseSecondaryPaymentViewModel2 = chooseSecondaryPaymentViewModel;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i8 = i3;
        if (startRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i8 &= -15;
                }
            } else if ((i2 & 1) != 0) {
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
                chooseSecondaryPaymentViewModel2 = (com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i5 = i8 & (-15);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1929493322, i5, -1, "com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreen (ChooseSecondaryPaymentScreen.kt:64)");
                }
                androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult startActivityForResult = new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult();
                changedInstance = startRestartGroup.changedInstance(chooseSecondaryPaymentViewModel2);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt.m20270$r8$lambda$Nl4oMGttJZ75UeEuftxYF9bN4k(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel.this, (androidx.view.result.ActivityResult) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, i4);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                changedInstance2 = startRestartGroup.changedInstance(chooseSecondaryPaymentViewModel2);
                i6 = (i5 & 112) != 32 ? 1 : i4;
                if ((i5 & 896) == 256) {
                    i4 = 1;
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (((changedInstance2 ? 1 : 0) | i6 | i4) == 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$ChooseSecondaryPaymentScreen$1$1(chooseSecondaryPaymentViewModel2, function0, function02, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                changedInstance3 = startRestartGroup.changedInstance(rememberLauncherForActivityResult);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt.m20271$r8$lambda$mENA2K1KRXM5AHrvcWqfmAwMWo(androidx.view.compose.ManagedActivityResultLauncher.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ChooseSecondaryPaymentScreenContent(function02, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, (i5 >> 6) & 14);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            i4 = 0;
            i5 = i8;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult startActivityForResult2 = new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult();
            changedInstance = startRestartGroup.changedInstance(chooseSecondaryPaymentViewModel2);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt.m20270$r8$lambda$Nl4oMGttJZ75UeEuftxYF9bN4k(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel.this, (androidx.view.result.ActivityResult) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            final androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult2 = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult2, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, i4);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changedInstance2 = startRestartGroup.changedInstance(chooseSecondaryPaymentViewModel2);
            if ((i5 & 112) != 32) {
            }
            if ((i5 & 896) == 256) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (((changedInstance2 ? 1 : 0) | i6 | i4) == 0) {
            }
            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$ChooseSecondaryPaymentScreen$1$1(chooseSecondaryPaymentViewModel2, function0, function02, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            changedInstance3 = startRestartGroup.changedInstance(rememberLauncherForActivityResult2);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt.m20271$r8$lambda$mENA2K1KRXM5AHrvcWqfmAwMWo(androidx.view.compose.ManagedActivityResultLauncher.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            ChooseSecondaryPaymentScreenContent(function02, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, (i5 >> 6) & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel chooseSecondaryPaymentViewModel3 = chooseSecondaryPaymentViewModel2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt.m20268$r8$lambda$6vq1FRB1DhC74X4mjhtZ_w6DE4(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel.this, function0, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ChooseSecondaryPaymentScreenContent(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(56110958);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(56110958, i2, -1, "com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenContent (ChooseSecondaryPaymentScreen.kt:98)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), 0.0f, 1, null), ChooseSecondaryPaymentContainerTestTag);
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
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1900981643, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt.$r8$lambda$MPcaUnjEImmyGoZ0PCXmMhjH80I(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 1572870, 62);
            com.paypal.pds.components.DockKt.Dock(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(494710887, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt.$r8$lambda$0dA4wz66ejJWkZ0FL_0IjRhsCo8(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ComposableSingletons$ChooseSecondaryPaymentScreenKt.INSTANCE.getLambda$1421465640$taptopay_prodRelease(), startRestartGroup, 27648, 6);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt.$r8$lambda$wCKZwq1SHjyBv8xPHWSQt9lw5xQ(kotlin.jvm.functions.Function0.this, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0dA4wz66ejJWkZ0FL_0IjRhsCo8(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(494710887, i, -1, "com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenContent.<anonymous>.<anonymous> (ChooseSecondaryPaymentScreen.kt:114)");
            }
            com.paypal.pds.components.ButtonGroupKt.ButtonGroup(new com.paypal.pds.components.ButtonGroupItem[]{new com.paypal.pds.components.ButtonGroupItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_secondary_settings_go_to_settings, composer, 0), function0, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, null, 108, null)}, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), com.paypal.pds.components.ButtonSize.Large.INSTANCE, null, composer, 384, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6vq1FRB1DhC74X4-mjhtZ_w6DE4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20268$r8$lambda$6vq1FRB1DhC74X4mjhtZ_w6DE4(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel chooseSecondaryPaymentViewModel, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ChooseSecondaryPaymentScreen(chooseSecondaryPaymentViewModel, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H4K31dq_M_Nyk3vNJIJ9mtOeytI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1622928287);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1622928287, updateChangedFlags, -1, "com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenPreview (ChooseSecondaryPaymentScreen.kt:137)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$$ExternalSyntheticLambda6
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ChooseSecondaryPaymentScreenContent(function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 54);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt.$r8$lambda$H4K31dq_M_Nyk3vNJIJ9mtOeytI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MPcaUnjEImmyGoZ0PCXmMhjH80I(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1900981643, i, -1, "com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenContent.<anonymous>.<anonymous> (ChooseSecondaryPaymentScreen.kt:106)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton(function0, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Nl4oMGttJZ75UeE-uftxYF9bN4k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20270$r8$lambda$Nl4oMGttJZ75UeEuftxYF9bN4k(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel chooseSecondaryPaymentViewModel, androidx.view.result.ActivityResult activityResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "");
        chooseSecondaryPaymentViewModel.onReturnFromSettings();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mENA2K-1KRXM5AHrvcWqfmAwMWo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20271$r8$lambda$mENA2K1KRXM5AHrvcWqfmAwMWo(androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher) {
        managedActivityResultLauncher.launch(new android.content.Intent("android.settings.NFC_PAYMENT_SETTINGS"));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wCKZwq1SHjyBv8xPHWSQt9lw5xQ(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        ChooseSecondaryPaymentScreenContent(function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
