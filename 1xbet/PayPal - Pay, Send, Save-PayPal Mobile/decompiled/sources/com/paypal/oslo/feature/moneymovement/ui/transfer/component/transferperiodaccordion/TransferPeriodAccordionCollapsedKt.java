package com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"TransferPeriodAccordionCollapsed", "", "selectedPeriodOption", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/transferperiodaccordion/internal/TransferPeriodOption;", "enabled", "", "modifier", "Landroidx/compose/ui/Modifier;", "onExpand", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/transferperiodaccordion/internal/TransferPeriodOption;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "money-movement_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransferPeriodAccordionCollapsedKt {
    /* JADX WARN: Removed duplicated region for block: B:109:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TransferPeriodAccordionCollapsed(final com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodOption transferPeriodOption, final boolean z, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.pds.core.Icon.Clock clock;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(502412126);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(transferPeriodOption) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    function03 = function02;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function05 = i4 != 0 ? null : function02;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(502412126, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordionCollapsed (TransferPeriodAccordionCollapsed.kt:54)");
                    }
                    androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(modifier3, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f))), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                    boolean z2 = z && function05 != null;
                    int i6 = i3 & 7168;
                    boolean z3 = i6 == 2048;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z3 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordionCollapsedKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordionCollapsedKt.$r8$lambda$7gP5vpq_GlzJQOqBPseXuYMbYBE(kotlin.jvm.functions.Function0.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function06 = function05;
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(background, null, null, z2, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 27), com.paypal.pds.core.ConstantsKt.getSpacing16());
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                    if (transferPeriodOption == null || (clock = transferPeriodOption.getIcon()) == null) {
                        clock = com.paypal.pds.core.Icon.Clock.INSTANCE;
                    }
                    com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(clock), null, com.paypal.pds.components.AvatarSize.Large.INSTANCE, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 58);
                    androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    java.lang.String displayName = transferPeriodOption != null ? transferPeriodOption.getDisplayName() : null;
                    if (displayName == null) {
                        displayName = "";
                    }
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(displayName, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                    java.lang.String feeText = transferPeriodOption != null ? transferPeriodOption.getFeeText() : null;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(feeText == null ? "" : feeText, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                    startRestartGroup.endNode();
                    if (!z) {
                        function04 = function06;
                    } else if (function06 != null) {
                        startRestartGroup.startReplaceGroup(1644224032);
                        com.paypal.pds.core.Icon.ChevronDown chevronDown = com.paypal.pds.core.Icon.ChevronDown.INSTANCE;
                        com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                        com.paypal.pds.components.ButtonStyle.TertiaryContained tertiaryContained = com.paypal.pds.components.ButtonStyle.TertiaryContained.INSTANCE;
                        com.paypal.pds.core.Icon.ChevronDown chevronDown2 = chevronDown;
                        boolean z4 = i6 == 2048;
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (z4 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordionCollapsedKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordionCollapsedKt.$r8$lambda$4gcO2q3oBU9zfNuBfN34XPS8zyQ(kotlin.jvm.functions.Function0.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        function04 = function06;
                        com.paypal.pds.components.IconButtonKt.IconButton(chevronDown2, (kotlin.jvm.functions.Function0) rememberedValue2, null, tertiaryContained, large, "Expand", null, false, false, startRestartGroup, 224262, 452);
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                        function03 = function04;
                    } else {
                        function04 = function06;
                    }
                    startRestartGroup.startReplaceGroup(1644487656);
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier4;
                    function03 = function04;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordionCollapsedKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordionCollapsedKt.m15770$r8$lambda$PD7FBAX8eSyJFEXv_LG1eJpff4(com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodOption.this, z, modifier5, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function02 = function0;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4gcO2q3oBU9zfNuBfN34XPS8zyQ(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7gP5vpq_GlzJQOqBPseXuYMbYBE(kotlin.jvm.functions.Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PD7FBA-X8eSyJFEXv_LG1eJpff4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15770$r8$lambda$PD7FBAX8eSyJFEXv_LG1eJpff4(com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodOption transferPeriodOption, boolean z, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TransferPeriodAccordionCollapsed(transferPeriodOption, z, modifier, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
