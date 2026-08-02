package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"ShoppingIABNavigationBar", "", "navBarInfo", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabNavBarInfo;", "hasBack", "", "hasForward", "onNavigationEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/NavigationBarEvent;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabNavBarInfo;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "shopping-rewards_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShoppingIABNavigationBarKt {
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShoppingIABNavigationBar(final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabNavBarInfo iabNavBarInfo, final boolean z, final boolean z2, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.NavigationBarEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iabNavBarInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1790373703);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(iabNavBarInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1790373703, i3, -1, "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABNavigationBar (ShoppingIABNavigationBar.kt:56)");
                }
                final androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback = (androidx.compose.ui.hapticfeedback.HapticFeedback) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback());
                androidx.compose.ui.Modifier modifier4 = modifier3;
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                com.paypal.pds.core.Icon.ChevronLeft chevronLeft = com.paypal.pds.core.Icon.ChevronLeft.INSTANCE;
                com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_iab_webview_a11y_back, startRestartGroup, 0);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1744sizeInqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize48(), com.paypal.pds.core.ConstantsKt.getSize48(), 0.0f, 0.0f, 12, null), com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABTestTags.NAV_BACK_BUTTON);
                com.paypal.pds.core.Icon.ChevronLeft chevronLeft2 = chevronLeft;
                boolean changedInstance = startRestartGroup.changedInstance(hapticFeedback);
                int i5 = i3 & 7168;
                boolean z3 = i5 == 2048;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABNavigationBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABNavigationBarKt.$r8$lambda$xApJspb7VihaBdsV8LiQIVnaKWY(androidx.compose.ui.hapticfeedback.HapticFeedback.this, function1);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.IconButtonKt.IconButton(chevronLeft2, (kotlin.jvm.functions.Function0) rememberedValue, testTag, tertiary, small, stringResource, null, z, false, startRestartGroup, ((i3 << 18) & 29360128) | 27654, 320);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                com.paypal.pds.core.Icon.ChevronRight chevronRight = com.paypal.pds.core.Icon.ChevronRight.INSTANCE;
                com.paypal.pds.components.ButtonStyle.Tertiary tertiary2 = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                com.paypal.pds.components.ButtonSize.Small small2 = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_iab_webview_a11y_forward, startRestartGroup, 0);
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1744sizeInqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize48(), com.paypal.pds.core.ConstantsKt.getSize48(), 0.0f, 0.0f, 12, null), com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABTestTags.NAV_FORWARD_BUTTON);
                com.paypal.pds.core.Icon.ChevronRight chevronRight2 = chevronRight;
                boolean changedInstance2 = startRestartGroup.changedInstance(hapticFeedback);
                boolean z4 = i5 == 2048;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance2 | z4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABNavigationBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABNavigationBarKt.m19663$r8$lambda$aDGEp4Ca8OaufJBRi5_mFqF9tE(androidx.compose.ui.hapticfeedback.HapticFeedback.this, function1);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.IconButtonKt.IconButton(chevronRight2, (kotlin.jvm.functions.Function0) rememberedValue2, testTag2, tertiary2, small2, stringResource2, null, z2, false, startRestartGroup, ((i3 << 15) & 29360128) | 27654, 320);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                if (iabNavBarInfo.getHasMenuBtn()) {
                    startRestartGroup.startReplaceGroup(787066579);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                    com.paypal.pds.core.Icon.Overflow overflow = com.paypal.pds.core.Icon.Overflow.INSTANCE;
                    com.paypal.pds.components.ButtonStyle.Tertiary tertiary3 = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                    com.paypal.pds.components.ButtonSize.Small small3 = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
                    java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_iab_webview_a11y_menu, startRestartGroup, 0);
                    androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1744sizeInqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize48(), com.paypal.pds.core.ConstantsKt.getSize48(), 0.0f, 0.0f, 12, null), com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABTestTags.NAV_MENU_BUTTON);
                    com.paypal.pds.core.Icon.Overflow overflow2 = overflow;
                    boolean changedInstance3 = startRestartGroup.changedInstance(hapticFeedback);
                    boolean z5 = i5 == 2048;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((changedInstance3 | z5) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABNavigationBarKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABNavigationBarKt.m19662$r8$lambda$A1jzzsIgYEZeeoovf6vnRdpds0(androidx.compose.ui.hapticfeedback.HapticFeedback.this, function1);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    com.paypal.pds.components.IconButtonKt.IconButton(overflow2, (kotlin.jvm.functions.Function0) rememberedValue3, testTag3, tertiary3, small3, stringResource3, null, false, false, startRestartGroup, 27654, 448);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(787891117);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABNavigationBarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.components.ShoppingIABNavigationBarKt.$r8$lambda$1Oym4n4WJLyBI4JoTFYXp_dLm8c(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabNavBarInfo.this, z, z2, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1Oym4n4WJLyBI4JoTFYXp_dLm8c(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabNavBarInfo iabNavBarInfo, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ShoppingIABNavigationBar(iabNavBarInfo, z, z2, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$A1jzzsIgYEZee-oovf6vnRdpds0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19662$r8$lambda$A1jzzsIgYEZeeoovf6vnRdpds0(androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback, kotlin.jvm.functions.Function1 function1) {
        hapticFeedback.mo6704performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6716getKeyboardTap5zf0vsI());
        function1.invoke(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.NavigationBarEvent.Menu.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aDGEp4Ca-8OaufJBRi5_mFqF9tE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19663$r8$lambda$aDGEp4Ca8OaufJBRi5_mFqF9tE(androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback, kotlin.jvm.functions.Function1 function1) {
        hapticFeedback.mo6704performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6716getKeyboardTap5zf0vsI());
        function1.invoke(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.NavigationBarEvent.Forward.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xApJspb7VihaBdsV8LiQIVnaKWY(androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback, kotlin.jvm.functions.Function1 function1) {
        hapticFeedback.mo6704performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6716getKeyboardTap5zf0vsI());
        function1.invoke(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.NavigationBarEvent.Back.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
