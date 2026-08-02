package com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aP\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"ShoppingRewardsDialog", "", "title", "", "modifier", "Landroidx/compose/ui/Modifier;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "buttonSlots", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "onDismissRequest", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ClearDimBehindEffect", "(Landroidx/compose/runtime/Composer;I)V", "shopping-rewards_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShoppingRewardsDialogKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShoppingRewardsDialog(final java.lang.String str, androidx.compose.ui.Modifier modifier, java.lang.String str2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str3;
        int i5;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22;
        int i6;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i7;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str4;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1148206150);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str3 = str2;
                i3 |= startRestartGroup.changed(str3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function22 = function2;
                    i3 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function02 = function0;
                        i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
                        i7 = i3;
                        if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            str4 = str3;
                            function23 = function22;
                            function03 = function02;
                        } else {
                            androidx.compose.ui.Modifier modifier4 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            java.lang.String str5 = i4 != 0 ? null : str3;
                            if (i5 != 0) {
                                function22 = com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.ComposableSingletons$ShoppingRewardsDialogKt.INSTANCE.m19416getLambda$859622973$shopping_rewards_prodRelease();
                            }
                            if (i6 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.ShoppingRewardsDialogKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function02 = (kotlin.jvm.functions.Function0) rememberedValue;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1148206150, i7, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.ShoppingRewardsDialog (ShoppingRewardsDialog.kt:62)");
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(str);
                            if (str5 != null) {
                                sb.append(". ".concat(java.lang.String.valueOf(str5)));
                            }
                            final java.lang.String obj = sb.toString();
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function04 = function02;
                            final androidx.compose.ui.Modifier modifier5 = modifier4;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24 = function22;
                            final java.lang.String str6 = str5;
                            androidx.compose.ui.window.AndroidDialog_androidKt.Dialog(function02, new androidx.compose.ui.window.DialogProperties(true, true, null, false, false, null, 36, null), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1966589059, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.ShoppingRewardsDialogKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.ShoppingRewardsDialogKt.$r8$lambda$DdTd_si5I5kQ85TQVXkKRCgu5Ho(kotlin.jvm.functions.Function0.this, modifier5, obj, function24, str, str6, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            }, startRestartGroup, 54), startRestartGroup, ((i7 >> 12) & 14) | 432, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            function23 = function22;
                            function03 = function02;
                            modifier3 = modifier4;
                            str4 = str5;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.ShoppingRewardsDialogKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.ShoppingRewardsDialogKt.m19417$r8$lambda$CnR483Yt9XPRBhwIu55m3pPSgA(str, modifier3, str4, function23, function03, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function02 = function0;
                    i7 = i3;
                    if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function22 = function2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function02 = function0;
                i7 = i3;
                if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            str3 = str2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function22 = function2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function02 = function0;
            i7 = i3;
            if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str3 = str2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function22 = function2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function02 = function0;
        i7 = i3;
        if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void ClearDimBehindEffect(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1331307194);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1331307194, i, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.ClearDimBehindEffect (ShoppingRewardsDialog.kt:130)");
            }
            android.view.ViewParent parent = ((android.view.View) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView())).getParent();
            androidx.compose.ui.window.DialogWindowProvider dialogWindowProvider = parent instanceof androidx.compose.ui.window.DialogWindowProvider ? (androidx.compose.ui.window.DialogWindowProvider) parent : null;
            final android.view.Window getHighSpeedVideoFpsRangesFor = dialogWindowProvider != null ? dialogWindowProvider.getGetHighSpeedVideoFpsRangesFor() : null;
            boolean changedInstance = startRestartGroup.changedInstance(getHighSpeedVideoFpsRangesFor);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.ShoppingRewardsDialogKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.ShoppingRewardsDialogKt.$r8$lambda$Ge8Bf7RF5Z_B2vf0xzWhF64V6yM(getHighSpeedVideoFpsRangesFor);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.ShoppingRewardsDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.ShoppingRewardsDialogKt.m19418$r8$lambda$RRgueKRSnS3to2uvLBDHk5vzsg(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$CnR483Yt9XPRBh-wIu55m3pPSgA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19417$r8$lambda$CnR483Yt9XPRBhwIu55m3pPSgA(java.lang.String str, androidx.compose.ui.Modifier modifier, java.lang.String str2, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ShoppingRewardsDialog(str, modifier, str2, function2, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DdTd_si5I5kQ85TQVXkKRCgu5Ho(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, final java.lang.String str, kotlin.jvm.functions.Function2 function2, java.lang.String str2, java.lang.String str3, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1966589059, i, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.ShoppingRewardsDialog.<anonymous> (ShoppingRewardsDialog.kt:76)");
            }
            ClearDimBehindEffect(composer, 0);
            androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundElevatedScrim.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer, 54, 2), "dialog_scrim"), null, com.paypal.pds.core.PDSIndication.None.INSTANCE, false, null, null, function0, composer, 384, 29);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m22100clickable_mRqjOc);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(modifier, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundElevatedModal.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24(), composer, 48, 0), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 5, null);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.ShoppingRewardsDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier m22100clickable_mRqjOc2 = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(m1710paddingqDBjuR0$default, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, composer, 1572864, 31);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m22100clickable_mRqjOc2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24());
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed = composer.changed(str);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.ShoppingRewardsDialogKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.ShoppingRewardsDialogKt.$r8$lambda$R3rPHZzixSLDalAzG5QCIgQUZno(str, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.ui.Modifier semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(companion2, true, (kotlin.jvm.functions.Function1) rememberedValue2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, semantics);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.pds.components.HeaderKt.Header(str2, (androidx.compose.ui.Modifier) null, str3, (java.lang.String) null, com.paypal.pds.components.HeaderContentAlignment.Center, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 24576, 106);
            composer.endNode();
            function2.invoke(composer, 0);
            composer.endNode();
            composer.endNode();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ge8Bf7RF5Z_B2vf0xzWhF64V6yM(android.view.Window window) {
        if (window != null) {
            window.clearFlags(2);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$R3rPHZzixSLDalAzG5QCIgQUZno(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RRgueKRSn-S3to2uvLBDHk5vzsg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19418$r8$lambda$RRgueKRSnS3to2uvLBDHk5vzsg(int i, androidx.compose.runtime.Composer composer, int i2) {
        ClearDimBehindEffect(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
