package com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u001a9\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/checkoutbottomsheet/CheckoutBottomSheetUiData;", "uiData", "Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "Lkotlin/Function0;", "", "onCtaClick", "onDismiss", "CheckoutBottomSheet", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/checkoutbottomsheet/CheckoutBottomSheetUiData;Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "onCloseClick", "CheckoutBottomSheetContent", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/checkoutbottomsheet/CheckoutBottomSheetUiData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/checkoutbottomsheet/CheckoutBottomSheetUiData;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CheckoutBottomSheetKt {
    private static final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData Camera2StreamConfigurationMap = new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData(com.paypal.pds.core.Icon.Cart.INSTANCE, "Ready to checkout?", "Complete your purchase and earn cashback rewards on this order.", "Checkout Now");
    private static final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData(com.paypal.pds.core.Icon.Cart.INSTANCE, "Your cart is ready — complete your purchase to unlock exclusive cashback", "Finish checking out now to ensure your reward is applied. Offer valid for a limited time and may not be combined with other promotions.", "Complete My Purchase");

    public static final void CheckoutBottomSheet(final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData checkoutBottomSheetUiData, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutBottomSheetUiData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1077143160);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(checkoutBottomSheetUiData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1077143160, i2, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheet (CheckoutBottomSheet.kt:54)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function02, null, null, null, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2065038047, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt.$r8$lambda$ckHlwKrXPFwB8ePPddTwUYNC_lw(com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData.this, bottomSheetController, function02, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 905969664 | ((i2 >> 3) & 14) | ((i2 >> 6) & 112), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt.m19423$r8$lambda$hOa74SbrclGZ85t2DWAgDskENY(com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData.this, bottomSheetController, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CheckoutBottomSheetContent(final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData checkoutBottomSheetUiData, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutBottomSheetUiData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-953838147);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(checkoutBottomSheetUiData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-953838147, i3, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetContent (CheckoutBottomSheet.kt:86)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopEnd(), false);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.XMark.INSTANCE, function0, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_shared_a11y_close, startRestartGroup, 0), null, false, false, startRestartGroup, (i3 & 112) | 27654, 452);
            composer2.endNode();
            com.paypal.pds.components.IconKt.Icon(checkoutBottomSheetUiData.getIcon(), null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer2, 27696, 4);
            com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.BottomSheetBodyContentKt.BottomSheetBodyContent(checkoutBottomSheetUiData.getTitle(), checkoutBottomSheetUiData.getSubtitle(), checkoutBottomSheetUiData.getCtaText(), function02, null, composer2, (i3 << 3) & 7168, 16);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt.m19422$r8$lambda$eaPXkAP17hD0Rgao6UaaUwfeG8(com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData.this, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Bk6H6Q2SfJ6HnBI9u_5a6bgv8kk(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Kb5ff7ub61QKRK4UvUbsgPx5e-4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19420$r8$lambda$Kb5ff7ub61QKRK4UvUbsgPx5e4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-138740895);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-138740895, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetContentPreview (CheckoutBottomSheet.kt:128)");
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData checkoutBottomSheetUiData = Camera2StreamConfigurationMap;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt$$ExternalSyntheticLambda4
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            CheckoutBottomSheetContent(checkoutBottomSheetUiData, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 438);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt.m19420$r8$lambda$Kb5ff7ub61QKRK4UvUbsgPx5e4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$URMI_WX9fK76ZP9Hdvs3w9LBNmQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1374720136);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1374720136, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetPreview (CheckoutBottomSheet.kt:154)");
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData checkoutBottomSheetUiData = Camera2StreamConfigurationMap;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            CheckoutBottomSheet(checkoutBottomSheetUiData, bottomSheetController, function0, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 3) | 3462);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt.$r8$lambda$URMI_WX9fK76ZP9Hdvs3w9LBNmQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ckHlwKrXPFwB8ePPddTwUYNC_lw(com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData checkoutBottomSheetUiData, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2065038047, i, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheet.<anonymous> (CheckoutBottomSheet.kt:60)");
            }
            boolean changedInstance = composer.changedInstance(bottomSheetController);
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt.$r8$lambda$Bk6H6Q2SfJ6HnBI9u_5a6bgv8kk(com.paypal.pds.components.BottomSheetController.this, function0);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            CheckoutBottomSheetContent(checkoutBottomSheetUiData, (kotlin.jvm.functions.Function0) rememberedValue, function02, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dCieOnt7pbkwe00AA-Zb7UpWzvM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19421$r8$lambda$dCieOnt7pbkwe00AAZb7UpWzvM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1709468278);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1709468278, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetContentLongTextPreview (CheckoutBottomSheet.kt:141)");
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData checkoutBottomSheetUiData = getHighSpeedVideoFpsRanges;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt$$ExternalSyntheticLambda7
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            CheckoutBottomSheetContent(checkoutBottomSheetUiData, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 438);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetKt.m19421$r8$lambda$dCieOnt7pbkwe00AAZb7UpWzvM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$e-aPXkAP17hD0Rgao6UaaUwfeG8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19422$r8$lambda$eaPXkAP17hD0Rgao6UaaUwfeG8(com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData checkoutBottomSheetUiData, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        CheckoutBottomSheetContent(checkoutBottomSheetUiData, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hOa74SbrclGZ85t-2DWAgDskENY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19423$r8$lambda$hOa74SbrclGZ85t2DWAgDskENY(com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData checkoutBottomSheetUiData, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        CheckoutBottomSheet(checkoutBottomSheetUiData, bottomSheetController, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
