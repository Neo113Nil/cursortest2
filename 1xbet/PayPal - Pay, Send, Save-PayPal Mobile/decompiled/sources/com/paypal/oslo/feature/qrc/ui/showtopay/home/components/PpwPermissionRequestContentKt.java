package com.paypal.oslo.feature.qrc.ui.showtopay.home.components;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"PpwPermissionRequestContent", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "onPermissionGrant", "Lkotlin/Function0;", "onDismiss", "permissionController", "Lcom/paypal/oslo/core/permission/ui/controller/PermissionController;", "(Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/core/permission/ui/controller/PermissionController;Landroidx/compose/runtime/Composer;II)V", "LocationPermissionBottomSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "qrc_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PpwPermissionRequestContentKt {
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if ((r28 & 8) != 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PpwPermissionRequestContent(final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController3;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1628345077);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                permissionController2 = permissionController;
                if (startRestartGroup.changedInstance(permissionController2)) {
                    i4 = 2048;
                    i3 |= i4;
                }
            } else {
                permissionController2 = permissionController;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            permissionController2 = permissionController;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
                    permissionController2 = com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt.rememberPermissionController(startRestartGroup, 0);
                    i3 &= -7169;
                }
                final com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController4 = permissionController2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1628345077, i3, -1, "com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContent (PpwPermissionRequestContent.kt:47)");
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
                composer2 = startRestartGroup;
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function02, new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null), null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_ppw_show_to_pay_title_location_permission_bottom_sheet, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_ppw_show_to_pay_desc_location_permission_bottom_sheet, startRestartGroup, 0), function02, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1075008466, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt.$r8$lambda$VLOj4QRX5PfmawQ_gQpGo_9NgAM(kotlinx.coroutines.CoroutineScope.this, permissionController4, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 918552576 | (i3 & 14) | ((i3 >> 3) & 112) | (com.paypal.pds.components.TopNavConfig.$stable << 6) | ((i3 << 12) & 3670016), 8);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                permissionController3 = permissionController4;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            permissionController3 = permissionController2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt.m17949$r8$lambda$hyerVQVZ_KetwYyiM2WfRgPrJ0(com.paypal.pds.components.BottomSheetController.this, function0, function02, permissionController3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H_hFw5PyjKpyPnaWkrXTFyl85RQ(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VLOj4QRX5PfmawQ_gQpGo_9NgAM(final kotlinx.coroutines.CoroutineScope coroutineScope, final com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1075008466, i, -1, "com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContent.<anonymous> (PpwPermissionRequestContent.kt:60)");
            }
            androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing20(), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1707paddingVpY3zN4);
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
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_ppw_show_to_pay_button_create_qr, composer, 0);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean changedInstance = composer.changedInstance(coroutineScope);
            boolean changedInstance2 = composer.changedInstance(permissionController);
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changedInstance2 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt.m17950$r8$lambda$xEl9fKtknPkyPgT1XC_GdUE2iI(kotlinx.coroutines.CoroutineScope.this, permissionController, function0);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, fillMaxWidth$default, null, null, primary, large, false, false, composer, 1769856, 408);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_dqRx7ywSz34TJFIl_ySEAGHzWA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1523532344);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1523532344, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.showtopay.home.components.LocationPermissionBottomSheetPreview (PpwPermissionRequestContent.kt:95)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt$LocationPermissionBottomSheetPreview$1$1$1(bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt.$r8$lambda$H_hFw5PyjKpyPnaWkrXTFyl85RQ(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean changedInstance3 = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt.$r8$lambda$tst3lXycYkQPhdwtiKwIUcplWLc(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            PpwPermissionRequestContent(bottomSheetController, function0, (kotlin.jvm.functions.Function0) rememberedValue4, null, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt.$r8$lambda$_dqRx7ywSz34TJFIl_ySEAGHzWA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hyerV-QVZ_KetwYyiM2WfRgPrJ0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17949$r8$lambda$hyerVQVZ_KetwYyiM2WfRgPrJ0(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PpwPermissionRequestContent(bottomSheetController, function0, function02, permissionController, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tst3lXycYkQPhdwtiKwIUcplWLc(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xEl9fKt-knPkyPgT1XC_GdUE2iI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17950$r8$lambda$xEl9fKtknPkyPgT1XC_GdUE2iI(kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, kotlin.jvm.functions.Function0 function0) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt$PpwPermissionRequestContent$1$1$1$1$1(permissionController, function0, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }
}
