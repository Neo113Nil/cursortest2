package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\b\u0010\u0007\u001a\u00020\bH\u0002\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"FundingInstrumentRow", "", "fundingInstrument", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentUiModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentUiModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_PLACEHOLDER, "Landroidx/compose/ui/graphics/painter/BrushPainter;", "FundingInstrumentRowScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FundingInstrumentRowKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FundingInstrumentRow(final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(491881803);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(fundingInstrumentUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(491881803, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentRow (FundingInstrumentRow.kt:55)");
                }
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(fundingInstrumentUiModel.getIcon(), null, androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize48(), com.paypal.pds.core.ConstantsKt.getSize32()), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSize4())), getHighSpeedVideoFpsRanges(), getHighSpeedVideoFpsRanges(), null, startRestartGroup, (androidx.compose.ui.graphics.painter.BrushPainter.$stable << 9) | 48 | (androidx.compose.ui.graphics.painter.BrushPainter.$stable << 12), 32);
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 0.0f, 0.0f, 14, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(fundingInstrumentUiModel.getPaymentMethodName().asString(startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 384, 6, 1018);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(fundingInstrumentUiModel.getPaymentMethodDetails().asString(composer2, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 384, 6, 1018);
                java.lang.String backupPaymentMethod = fundingInstrumentUiModel.getBackupPaymentMethod();
                if (backupPaymentMethod != null) {
                    composer2.startReplaceGroup(1061014990);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_backup_payment_method, new java.lang.Object[]{backupPaymentMethod}, composer2, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 384, 6, 1018);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    composer2.endReplaceGroup();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } else {
                    composer2.startReplaceGroup(1061014989);
                    composer2.endReplaceGroup();
                }
                java.lang.String errorMsg = fundingInstrumentUiModel.getErrorMsg();
                if (errorMsg != null) {
                    composer2.startReplaceGroup(1061415634);
                    androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, companion);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Critical.INSTANCE, null, null, null, com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, composer2, 24630, 12);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), composer2, 0);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(errorMsg, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 384, 6, 1018);
                    composer2.endNode();
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    composer2.endReplaceGroup();
                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                } else {
                    composer2.startReplaceGroup(1061415633);
                    composer2.endReplaceGroup();
                }
                java.lang.String inlineLink = fundingInstrumentUiModel.getInlineLink();
                if (inlineLink != null) {
                    composer2.startReplaceGroup(1062017871);
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null);
                    java.lang.Object rememberedValue = composer2.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentRowKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit5;
                                unit5 = kotlin.Unit.INSTANCE;
                                return unit5;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.components.LinkKt.Link(inlineLink, m1710paddingqDBjuR0$default2, (kotlin.jvm.functions.Function0) rememberedValue, null, composer2, 384, 8);
                    kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                    composer2.endReplaceGroup();
                    kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                } else {
                    composer2.startReplaceGroup(1062017870);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (fundingInstrumentUiModel.isChecked() || fundingInstrumentUiModel.getInlineButton() != null) {
                    composer2.startReplaceGroup(-48334266);
                    androidx.compose.ui.Alignment.Horizontal end = androidx.compose.ui.Alignment.INSTANCE.getEnd();
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default3 = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 0.0f, 14, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), end, composer2, 48);
                    int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1710paddingqDBjuR0$default3);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    if (fundingInstrumentUiModel.isChecked()) {
                        composer2.startReplaceGroup(473927462);
                        com.paypal.pds.core.Icon.CheckmarkCircleFill checkmarkCircleFill = com.paypal.pds.core.Icon.CheckmarkCircleFill.INSTANCE;
                        com.paypal.pds.core.Icon.CheckmarkCircleFill checkmarkCircleFill2 = checkmarkCircleFill;
                        com.paypal.pds.components.IconKt.Icon(checkmarkCircleFill2, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_menu_list_accessibility_string_selected, composer2, 0), androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize24()), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer2, 24582, 8);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(474320108);
                        composer2.endReplaceGroup();
                    }
                    java.lang.String inlineButton = fundingInstrumentUiModel.getInlineButton();
                    if (inlineButton != null) {
                        composer2.startReplaceGroup(474375939);
                        com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                        java.lang.Object rememberedValue2 = composer2.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentRowKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit7;
                                    unit7 = kotlin.Unit.INSTANCE;
                                    return unit7;
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, inlineButton, null, null, null, tertiary, null, false, false, composer2, 196614, 476);
                        kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                        composer2.endReplaceGroup();
                        kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                    } else {
                        composer2.startReplaceGroup(474375938);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-47473861);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentRowKt.$r8$lambda$OHm3ojEpZzZGZLrTZPejy3MFeGs(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final androidx.compose.ui.graphics.painter.BrushPainter getHighSpeedVideoFpsRanges() {
        return new androidx.compose.ui.graphics.painter.BrushPainter(androidx.compose.ui.graphics.Brush.Companion.m5945linearGradientmHitzGk$default(androidx.compose.ui.graphics.Brush.INSTANCE, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.graphics.Color[]{androidx.compose.ui.graphics.Color.m5986boximpl(androidx.compose.ui.graphics.ColorKt.Color(4294967295L)), androidx.compose.ui.graphics.Color.m5986boximpl(androidx.compose.ui.graphics.ColorKt.Color(4292730333L))}), 0L, 0L, 0, 14, (java.lang.Object) null));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OHm3ojEpZzZGZLrTZPejy3MFeGs(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FundingInstrumentRow(fundingInstrumentUiModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XTOAqTJpq8ZqOgeRaild0tRvHYQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1290819475);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1290819475, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentRowScreenPreview (FundingInstrumentRow.kt:168)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            FundingInstrumentRow(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel("0", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("PayPal Balance"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("$151.68 available"), "https://...", "Bank Account", "Something went wrong", com.google.common.net.HttpHeaders.LINK, "Button", true, null, null, null, null, 7680, null), null, startRestartGroup, 0, 2);
            FundingInstrumentRow(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel("0", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Bank Account"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("····1234"), "https://...", null, null, null, null, false, null, null, null, null, 8176, null), null, startRestartGroup, 0, 2);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentRowKt.$r8$lambda$XTOAqTJpq8ZqOgeRaild0tRvHYQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
