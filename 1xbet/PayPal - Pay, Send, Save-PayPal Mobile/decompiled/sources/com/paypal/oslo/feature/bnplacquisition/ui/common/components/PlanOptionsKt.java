package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aH\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0019"}, d2 = {"PlanOptions", "", "items", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/PlanOptionItem;", "onPlanSelect", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PlanOptionContent", "item", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/PlanOptionItem;Landroidx/compose/runtime/Composer;I)V", "AprRow", "aprLabel", "", "interestValue", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "PlanOptionsPreview", "(Landroidx/compose/runtime/Composer;I)V", "PlanOptionsWithDetailFieldsPreview", "bnpl-acquisition_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanOptionsKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlanOptions(final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionItem> list, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.pds.components.SelectionCardModel create;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-966923497);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
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
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-966923497, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptions (PlanOptions.kt:132)");
                }
                com.paypal.pds.components.SelectionCardConfig.Vertical vertical = new com.paypal.pds.components.SelectionCardConfig.Vertical(false);
                startRestartGroup.startReplaceGroup(-1500536824);
                java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionItem> list2 = list;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (final com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionItem planOptionItem : list2) {
                    create = com.paypal.pds.components.SelectionCardModel.INSTANCE.create(planOptionItem.getPlanId(), (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) ((r18 & 8) != 0 ? null : androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1324174270, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsKt.$r8$lambda$EdnYtQLxZFzLbPy7PeSrUwxlVUs(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionItem.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54)), (r18 & 16) != 0 ? false : planOptionItem.isSelected(), (r18 & 32) == 0 ? null : null, (r18 & 64) != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : null, (r18 & 128) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : null, (r18 & 256) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : null);
                    arrayList.add(create);
                }
                java.util.ArrayList arrayList2 = arrayList;
                startRestartGroup.endReplaceGroup();
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier3, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsTestTag.PLAN_OPTION);
                com.paypal.pds.components.SelectionCardConfig.Vertical vertical2 = vertical;
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsKt.$r8$lambda$OShKHVWllUfC2nOvfCVS9y6biN8(kotlin.jvm.functions.Function1.this, (com.paypal.pds.components.SelectionCardModel) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.SelectionCardKt.SelectionCard(vertical2, arrayList2, (kotlin.jvm.functions.Function2) rememberedValue, testTag, null, false, null, startRestartGroup, com.paypal.pds.components.SelectionCardConfig.Vertical.$stable | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 80);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsKt.$r8$lambda$LxPTgyfhNBJnoqUNmZCqjv3ACPQ(list, function1, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* JADX WARN: Removed duplicated region for block: B:54:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x046a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionItem planOptionItem, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        int i2;
        java.lang.Object obj;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1403366572);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changedInstance(planOptionItem) ? 4 : 2) | i : i;
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1403366572, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionContent (PlanOptions.kt:169)");
            }
            androidx.compose.ui.Modifier animateContentSize$default = androidx.compose.animation.AnimationModifierKt.animateContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), null, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, animateContentSize$default);
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
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(planOptionItem.getTitle(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.RowScope.weight$default(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsTestTag.TITLE), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
            java.lang.String badgeText = planOptionItem.getBadgeText();
            if (badgeText != null) {
                composer2.startReplaceGroup(1370518955);
                com.paypal.pds.components.BadgeKt.Badge(badgeText, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsTestTag.BADGE), com.paypal.pds.components.BadgeStyle.Info.INSTANCE, com.paypal.pds.components.BadgeEmphasis.High, null, null, null, composer2, 3504, 112);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                composer2.endReplaceGroup();
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            } else {
                composer2.startReplaceGroup(1370518954);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(planOptionItem.getSubtitle(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsTestTag.SUBTITLE), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 432, 6, 1016);
            if (planOptionItem.isSelected()) {
                composer2.startReplaceGroup(-1148165463);
                if (!planOptionItem.getDetailFields().isEmpty()) {
                    composer2.startReplaceGroup(-1148146832);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
                    androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing2()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default2);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceGroup(-747989047);
                    int i4 = 0;
                    for (java.lang.Object obj2 : planOptionItem.getDetailFields()) {
                        if (i4 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanDetailField planDetailField = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanDetailField) obj2;
                        java.lang.String label = planDetailField.getLabel();
                        java.lang.String value = planDetailField.getValue();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(label);
                        sb.append(" ");
                        sb.append(value);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(sb.toString(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "PlanOptionDetailField_".concat(java.lang.String.valueOf(i4))), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 384, 6, 1016);
                        i4++;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
                    i2 = 1;
                    com.paypal.pds.components.DividerKt.Divider(null, composer2, 0, 1);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
                    getHighSpeedVideoSizes(planOptionItem.getAprLabel(), planOptionItem.getInterestValue(), composer2, 0);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
                    composer2.endReplaceGroup();
                } else {
                    i2 = 1;
                    if (planOptionItem.getTimelineItems() != null) {
                        composer2.startReplaceGroup(-1146953704);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
                        com.paypal.pds.components.TimelineKt.TimelineHorizontal(planOptionItem.getTimelineItems(), null, composer2, 0, 2);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing20()), composer2, 0);
                        com.paypal.pds.components.DividerKt.Divider(null, composer2, 0, 1);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1146557896);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing20()), composer2, 0);
                        getHighSpeedVideoSizes(planOptionItem.getAprLabel(), planOptionItem.getInterestValue(), composer2, 0);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
                        obj = null;
                        com.paypal.pds.components.DividerKt.Divider(null, composer2, 0, 1);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
                        composer2.endReplaceGroup();
                        androidx.compose.ui.Modifier fillMaxWidth$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, obj);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer2, 54);
                        int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default3);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                            composer2.createNode(constructor4);
                        } else {
                            composer2.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(planOptionItem.getTotalText(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, composer2, 384, 6, 1018);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(planOptionItem.getTotalValue(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsTestTag.TOTAL), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, composer2, 432, 6, 1016);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    }
                }
                obj = null;
                androidx.compose.ui.Modifier fillMaxWidth$default32 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, obj);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy22 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer2, 54);
                int hashCode42 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap42 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier42 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default32);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor42 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                androidx.compose.runtime.Composer m5299constructorimpl42 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl42, rowMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl42, currentCompositionLocalMap42, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl42, java.lang.Integer.valueOf(hashCode42), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl42, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl42, materializeModifier42, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(planOptionItem.getTotalText(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, composer2, 384, 6, 1018);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(planOptionItem.getTotalValue(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsTestTag.TOTAL), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, composer2, 432, 6, 1016);
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1145425652);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsKt.$r8$lambda$kDOV5js4NH2SZ_s8HL9OGpRxFVk(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionItem.this, i, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final java.lang.String str, final java.lang.String str2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(901527113);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(901527113, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.AprRow (PlanOptions.kt:275)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsTestTag.APR), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, (i3 & 14) | 432, 6, 1016);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, ((i3 >> 3) & 14) | 384, 6, 1018);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsKt.$r8$lambda$tVGb7qA__DT72NPMrrqfIJoB9Dk(str, str2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0bnzMJML7gs9Ohes1WFfXrDDa5A(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1198623751);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1198623751, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsPreview (PlanOptions.kt:345)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionItem[]{new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionItem("1", "$139.15/mo. for 3 months", "$0 due at purchase", "Total", "$471.46", "Interest amount (26% APR)", "$17.45", null, null, null, true, null, 2944, null), new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionItem(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "$100/mo every 2 weeks", "First payment due at purchase", "Total", "$712.55", "Interest amount (26% APR)", "$17.45", "0% APR", null, null, false, null, 2816, null), new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionItem(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "$50/mo every 4 weeks", "First payment due at purchase", "Total", "$627.55", "Interest amount (0% APR)", "$0.00", null, null, null, false, null, 2944, null)});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PlanOptions(listOf, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsKt.$r8$lambda$0bnzMJML7gs9Ohes1WFfXrDDa5A(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EdnYtQLxZFzLbPy7PeSrUwxlVUs(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionItem planOptionItem, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1324174270, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptions.<anonymous>.<anonymous> (PlanOptions.kt:140)");
            }
            Camera2StreamConfigurationMap(planOptionItem, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LxPTgyfhNBJnoqUNmZCqjv3ACPQ(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PlanOptions(list, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OShKHVWllUfC2nOvfCVS9y6biN8(kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.SelectionCardModel selectionCardModel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionCardModel, "");
        function1.invoke(java.lang.Integer.valueOf(i));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SSLTDin-gF1nOTtOLxX0v2GG5tI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12350$r8$lambda$SSLTDingF1nOTtOLxX0v2GG5tI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1471681655);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1471681655, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsWithDetailFieldsPreview (PlanOptions.kt:389)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionItem[]{new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionItem("1", "219,98 €/month", "3 Installments", "Total", "659,94 €", "Interest amount", "59,94 €", null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanDetailField[]{new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanDetailField("Fixed interest", "7,99% p.a."), new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanDetailField("Annual percentage rate", "9,99% p.a.")}), null, true, null, 2560, null), new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionItem(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "109,99 €/month", "6 Installments", "Total", "659,94 €", "Interest amount", "0,00 €", null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanDetailField[]{new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanDetailField("Fixed interest", "0,00% p.a."), new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanDetailField("Annual percentage rate", "0,00% p.a.")}), null, false, null, 2560, null)});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PlanOptions(listOf, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionsKt.m12350$r8$lambda$SSLTDingF1nOTtOLxX0v2GG5tI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kDOV5js4NH2SZ_s8HL9OGpRxFVk(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanOptionItem planOptionItem, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(planOptionItem, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tVGb7qA__DT72NPMrrqfIJoB9Dk(java.lang.String str, java.lang.String str2, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(str, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
