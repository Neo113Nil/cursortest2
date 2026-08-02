package com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u000e\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u000f"}, d2 = {androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "ImageHeight", "ActionCard", "", "uiData", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/actioncard/ActionCardUiData;", "modifier", "Landroidx/compose/ui/Modifier;", "onChooseClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/actioncard/ActionCardUiData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ActionCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "shopping-rewards_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActionCardKt {
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.Dp.m8601constructorimpl(101.0f);
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(76.0f);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActionCard(final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardUiData actionCardUiData, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionCardUiData, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(891483516);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(actionCardUiData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function03 = function02;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function04 = function02;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(891483516, i3, -1, "com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCard (ActionCard.kt:45)");
                    }
                    kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function04;
                    modifier3 = modifier4;
                    com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, (androidx.compose.ui.graphics.painter.Painter) null, com.paypal.pds.components.CardStyle.Filled.INSTANCE, new com.paypal.pds.components.HeaderConfig(actionCardUiData.getTitle(), actionCardUiData.getDescription(), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-883181614, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardKt.$r8$lambda$ioSHqfkMk__24eFzuaJcf4FnWHI(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardUiData.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), 12, null), new com.paypal.pds.components.FooterConfig(null, null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-502187712, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardKt.m19603$r8$lambda$bcXIKgV6XpCx7HwUyhsH_KdAFU(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardUiData.this, function04, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), null, 95, null), function04, (com.paypal.pds.components.CardPadding) null, (com.paypal.pds.components.CardCornerRadius) null, (kotlin.Unit) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, (com.paypal.pds.components.CardStyle.Filled.$stable << 9) | 48 | (com.paypal.pds.components.HeaderConfig.$stable << 12) | (com.paypal.pds.components.FooterConfig.$stable << 15) | ((i3 << 12) & 3670016), 0, 1924);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function03 = function05;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardKt.$r8$lambda$fLVZGWwoOWIf5mcxrhPdrdNpXMc(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardUiData.this, modifier5, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function02 = function0;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Jx9jxNKTq2_8AygTYUET10KdaRk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1667075935);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1667075935, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardPreview (ActionCard.kt:83)");
            }
            com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardUiData actionCardUiData = new com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardUiData("https://www.paypalobjects.com/shopping/oslo-rewards/money-bag.png", "Use at checkout", "Your points have real spending power at millions of merchants.", new com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData("Learn More", null, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.SharedDataModelsKt.getBUTTON_STATE_ENABLED(), 2, null), new com.paypal.oslo.feature.shoppingrewards.api.rewards.useatcheckout.navigation.UseAtCheckoutDestination(new com.paypal.oslo.feature.shoppingrewards.api.rewards.useatcheckout.navigation.UseAtCheckoutDestinationData("Action Sheet Title", "Action Sheet Description", "https://www.paypalobjects.com/shopping/store-small-logos/177.jpg")));
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ActionCard(actionCardUiData, background, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 384, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardKt.$r8$lambda$Jx9jxNKTq2_8AygTYUET10KdaRk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bcXIKgV6XpCx7HwUy-hsH_KdAFU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19603$r8$lambda$bcXIKgV6XpCx7HwUyhsH_KdAFU(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardUiData actionCardUiData, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-502187712, i, -1, "com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCard.<anonymous> (ActionCard.kt:68)");
            }
            com.paypal.pds.components.ButtonKt.Button(function0, actionCardUiData.getButtonUiData().getLabel(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "action_card_cta_button"), null, null, null, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, false, false, composer, 1573248, 440);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fLVZGWwoOWIf5mcxrhPdrdNpXMc(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardUiData actionCardUiData, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ActionCard(actionCardUiData, modifier, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ioSHqfkMk__24eFzuaJcf4FnWHI(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardUiData actionCardUiData, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-883181614, i, -1, "com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCard.<anonymous> (ActionCard.kt:56)");
            }
            com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(actionCardUiData.getImageUrl(), null, androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, getHighSpeedVideoFpsRanges), getHighSpeedVideoSizes), null, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), composer, 197040, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
