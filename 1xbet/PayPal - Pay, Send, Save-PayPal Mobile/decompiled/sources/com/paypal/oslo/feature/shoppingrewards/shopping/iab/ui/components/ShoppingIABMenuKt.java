package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "Lkotlin/Function0;", "", "onReload", "onShare", "ShoppingIABMenu", "(Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShoppingIABMenuKt {
    public static final void ShoppingIABMenu(final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-838387113);
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
        boolean z = false;
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-838387113, i2, -1, "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABMenu (ShoppingIABMenu.kt:52)");
            }
            com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig("", false, null, 6, null);
            int i3 = i2 & 14;
            if (i3 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController))) {
                z = true;
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABMenuKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABMenuKt.$r8$lambda$CfonF28CPYkFCv2iZ7ua3yALsBE(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, null, topNavConfig, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(919717104, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABMenuKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABMenuKt.$r8$lambda$bQDYrTxNCYQssQEiNN7_qNOe7F8(kotlin.jvm.functions.Function0.this, bottomSheetController, function02, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, i3 | com.paypal.pds.components.BottomSheetController.$stable | 805306368 | (com.paypal.pds.components.TopNavConfig.$stable << 6), 442);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABMenuKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABMenuKt.m19661$r8$lambda$tVKfuaIaLn_fwiFMuXLm6eAQ(com.paypal.pds.components.BottomSheetController.this, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CfonF28CPYkFCv2iZ7ua3yALsBE(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IY8gfJs9YeGoZyjE95fus6439fE(kotlin.jvm.functions.Function0 function0, com.paypal.pds.components.BottomSheetController bottomSheetController) {
        function0.invoke();
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ti5gJm9Ilkm-62xQONsgpCgGm10, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19660$r8$lambda$Ti5gJm9Ilkm62xQONsgpCgGm10(kotlin.jvm.functions.Function0 function0, com.paypal.pds.components.BottomSheetController bottomSheetController) {
        function0.invoke();
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bQDYrTxNCYQssQEiNN7_qNOe7F8(final kotlin.jvm.functions.Function0 function0, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(919717104, i, -1, "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABMenu.<anonymous> (ShoppingIABMenu.kt:58)");
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), 2, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f)), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1710paddingqDBjuR0$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABTestTags.MENU_BOTTOM_RELOAD_BUTTON);
            com.paypal.pds.components.CardStyle.Outlined outlined = com.paypal.pds.components.CardStyle.Outlined.INSTANCE;
            boolean changed = composer.changed(function0);
            boolean changedInstance = composer.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABMenuKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABMenuKt.$r8$lambda$IY8gfJs9YeGoZyjE95fus6439fE(kotlin.jvm.functions.Function0.this, bottomSheetController);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.CardKt.Card(testTag, null, null, outlined, (kotlin.jvm.functions.Function0) rememberedValue, null, null, null, null, com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ComposableSingletons$ShoppingIABMenuKt.INSTANCE.m19656getLambda$202367002$shopping_rewards_prodRelease(), composer, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306368, 486);
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
            com.paypal.pds.components.CardStyle.Outlined outlined2 = com.paypal.pds.components.CardStyle.Outlined.INSTANCE;
            boolean changed2 = composer.changed(function02);
            boolean changedInstance2 = composer.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed2 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABMenuKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABMenuKt.m19660$r8$lambda$Ti5gJm9Ilkm62xQONsgpCgGm10(kotlin.jvm.functions.Function0.this, bottomSheetController);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.CardKt.Card(weight$default, null, null, outlined2, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, null, null, com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ComposableSingletons$ShoppingIABMenuKt.INSTANCE.getLambda$124657679$shopping_rewards_prodRelease(), composer, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306368, 486);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$t-VKfuaI-aLn_fwiFMuXLm6-eAQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19661$r8$lambda$tVKfuaIaLn_fwiFMuXLm6eAQ(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        ShoppingIABMenu(bottomSheetController, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
