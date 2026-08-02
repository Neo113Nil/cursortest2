package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a'\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0013"}, d2 = {com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.PLAN_CARD, "", "title", "", "items", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/PlanCardItem;", "modifier", "Landroidx/compose/ui/Modifier;", "itemTitleStyle", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/PlanCardItemTitleStyle;", "(Ljava/lang/String;Ljava/util/List;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/PlanCardItemTitleStyle;Landroidx/compose/runtime/Composer;II)V", "PlanCardItemRow", "item", "titleStyle", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/PlanCardItem;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/PlanCardItemTitleStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PlanCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "PlanCardBodySmallPreview", "bnpl-acquisition_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanCardKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlanCard(final java.lang.String str, final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItem> list, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle planCardItemTitleStyle, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle planCardItemTitleStyle2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1398345478);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
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
                i3 |= startRestartGroup.changed(planCardItemTitleStyle == null ? -1 : planCardItemTitleStyle.ordinal()) ? 2048 : 1024;
            }
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                planCardItemTitleStyle2 = planCardItemTitleStyle;
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                final com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle planCardItemTitleStyle3 = i4 != 0 ? com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle.BodySmall : planCardItemTitleStyle;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1398345478, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCard (PlanCard.kt:81)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier3, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.PLAN_CARD);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                com.paypal.pds.components.SectionHeaderKt.SectionHeader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.SECTION_HEADER), str, null, null, startRestartGroup, ((i3 << 3) & 112) | 6, 12);
                com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle planCardItemTitleStyle4 = planCardItemTitleStyle3;
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.CardKt.Card(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1060192342, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardKt.$r8$lambda$xlFWhs2lfnFBKdtUTaaEZAFTsTs(list, planCardItemTitleStyle3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), composer2, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306374, 502);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                planCardItemTitleStyle2 = planCardItemTitleStyle4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardKt.$r8$lambda$1RvBYJ1kBGv2OQYpGNP1ZWNLKIQ(str, list, modifier2, planCardItemTitleStyle2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItem planCardItem, final com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle planCardItemTitleStyle, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1090241734);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(planCardItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(planCardItemTitleStyle.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1090241734, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemRow (PlanCard.kt:115)");
                }
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
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
                com.paypal.pds.components.IconKt.Icon(planCardItem.getLeadingIcon(), null, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.ITEM_ICON), com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 28080, 0);
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                java.lang.String title = planCardItem.getTitle();
                com.paypal.pds.core.Typography textStyle = planCardItemTitleStyle.getTextStyle();
                modifier3 = modifier4;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(title, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.ITEM_TITLE), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, textStyle, startRestartGroup, 432, 0, 1016);
                java.lang.String description = planCardItem.getDescription();
                if (description != null) {
                    startRestartGroup.startReplaceGroup(-1181009566);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(description, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.ITEM_DESCRIPTION), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 432, 6, 1016);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1181009567);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardKt.m12347$r8$lambda$VyCOz5HpbUzVmS3cISLCOktNHE(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItem.this, planCardItemTitleStyle, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1RvBYJ1kBGv2OQYpGNP1ZWNLKIQ(java.lang.String str, java.util.List list, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle planCardItemTitleStyle, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PlanCard(str, list, modifier, planCardItemTitleStyle, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RZEYVEzipo85WlQ6KeScJPQonac(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(815390114);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(815390114, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardBodySmallPreview (PlanCard.kt:174)");
            }
            PlanCard("How to use this plan", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItem[]{new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItem("Pay for your purchase by holding your device over the checkout reader.", null, com.paypal.pds.core.Icon.NoIcon.INSTANCE, 2, null), new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItem("View your loan and manage payments from PayPal.", null, com.paypal.pds.core.Icon.NoIcon.INSTANCE, 2, null)}), null, null, startRestartGroup, 6, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardKt.$r8$lambda$RZEYVEzipo85WlQ6KeScJPQonac(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VyCOz5HpbUzVmS-3cISLCOktNHE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12347$r8$lambda$VyCOz5HpbUzVmS3cISLCOktNHE(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItem planCardItem, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle planCardItemTitleStyle, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(planCardItem, planCardItemTitleStyle, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ezyWOw4ZvWuF11r0M0CzezVzbG0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1364346809);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1364346809, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardPreview (PlanCard.kt:155)");
            }
            PlanCard("Your Pay Monthly plan", kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItem("$200/mo. for 3 months", "Starting 1 month after purchase", com.paypal.pds.core.Icon.NoIcon.INSTANCE)), null, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle.BodyMedium, startRestartGroup, 3078, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardKt.$r8$lambda$ezyWOw4ZvWuF11r0M0CzezVzbG0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xlFWhs2lfnFBKdtUTaaEZAFTsTs(java.util.List list, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle planCardItemTitleStyle, androidx.compose.runtime.Composer composer, int i) {
        int i2 = 0;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1060192342, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCard.<anonymous>.<anonymous> (PlanCard.kt:95)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            composer.startReplaceGroup(-713851160);
            for (java.lang.Object obj : list) {
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItem) obj, planCardItemTitleStyle, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "PlanCardItem_".concat(java.lang.String.valueOf(i2))), composer, 0, 0);
                i2++;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
