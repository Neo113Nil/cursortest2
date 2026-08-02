package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a%\u0010\n\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u0010"}, d2 = {"StatementsDetailsSpecialFinancingSection", "", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/specialfinancing/uimodel/SpecialFinancingItemUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/SpecialFinancingSectionUiState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SpecialFinancingReady", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SpecialFinancingSectionReadyPreview", "(Landroidx/compose/runtime/Composer;I)V", "SpecialFinancingSectionEmptyPreview", "SpecialFinancingSectionHiddenPreview", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementsDetailsSpecialFinancingSectionKt {
    public static final void StatementsDetailsSpecialFinancingSection(final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<? extends java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel>> statementDetailSectionUiState, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailSectionUiState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1435301350);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(statementDetailSectionUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1435301350, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementsDetailsSpecialFinancingSection (StatementsDetailsSpecialFinancingSection.kt:36)");
            }
            if (statementDetailSectionUiState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Ready) {
                startRestartGroup.startReplaceGroup(-640088834);
                Camera2StreamConfigurationMap((java.util.List) ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Ready) statementDetailSectionUiState).getData(), modifier, startRestartGroup, i3 & 112, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(statementDetailSectionUiState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Empty.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(statementDetailSectionUiState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Error.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(statementDetailSectionUiState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Hidden.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(-640090761);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(-640081250);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementsDetailsSpecialFinancingSectionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementsDetailsSpecialFinancingSectionKt.$r8$lambda$_w76qQo1lJvBIx_jYF9AUdjnyKY(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> list, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(324566466);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(324566466, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.SpecialFinancingReady (StatementsDetailsSpecialFinancingSection.kt:53)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_details_section_special_financing, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                composer2 = startRestartGroup;
                com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-307490586, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementsDetailsSpecialFinancingSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementsDetailsSpecialFinancingSectionKt.$r8$lambda$AwQutSiKzVUpqVh6QWKeeUFrTmI(list, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306374, 502);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementsDetailsSpecialFinancingSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementsDetailsSpecialFinancingSectionKt.m18663$r8$lambda$GL9lLrrrHaFO3Zb9WKh5Rj8H6k(list, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$AwQutSiKzVUpqVh6QWKeeUFrTmI(java.util.List list, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-307490586, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.SpecialFinancingReady.<anonymous>.<anonymous> (StatementsDetailsSpecialFinancingSection.kt:68)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12());
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
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
            composer.startReplaceGroup(-545306721);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel specialFinancingItemUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel) it.next();
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementsDetailsSpecialFinancingSectionKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.components.SpecialFinancingRowKt.SpecialFinancingRow(specialFinancingItemUiModel, null, (kotlin.jvm.functions.Function0) rememberedValue, composer, 384, 2);
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

    /* renamed from: $r8$lambda$GL9lLrrrH-aFO3Zb9WKh5Rj8H6k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18663$r8$lambda$GL9lLrrrHaFO3Zb9WKh5Rj8H6k(java.util.List list, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(list, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NtnSETZihZcWzAnIs0BxvgnoTS0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(263982690);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(263982690, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.SpecialFinancingSectionEmptyPreview (StatementsDetailsSpecialFinancingSection.kt:121)");
            }
            StatementsDetailsSpecialFinancingSection(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Empty.INSTANCE, null, startRestartGroup, 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementsDetailsSpecialFinancingSectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementsDetailsSpecialFinancingSectionKt.$r8$lambda$NtnSETZihZcWzAnIs0BxvgnoTS0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_w76qQo1lJvBIx_jYF9AUdjnyKY(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState statementDetailSectionUiState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        StatementsDetailsSpecialFinancingSection(statementDetailSectionUiState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$d8mqdDDsP4QAol1E5fvnv09okS4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(341388627);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(341388627, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.SpecialFinancingSectionHiddenPreview (StatementsDetailsSpecialFinancingSection.kt:129)");
            }
            StatementsDetailsSpecialFinancingSection(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Hidden.INSTANCE, null, startRestartGroup, 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementsDetailsSpecialFinancingSectionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementsDetailsSpecialFinancingSectionKt.$r8$lambda$d8mqdDDsP4QAol1E5fvnv09okS4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$j2_0Lif9oyDCi5tB4q9KLdPPRZo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-109732276);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-109732276, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.SpecialFinancingSectionReadyPreview (StatementsDetailsSpecialFinancingSection.kt:84)");
            }
            StatementsDetailsSpecialFinancingSection(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Ready(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel[]{new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel("1", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Best Buy Purchase"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Expires on December 26, 2024"), null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("$350.00"), "", "$500.00", "December 26, 2024", "", true, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Remaining \nbalance")), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Home Depot"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Expires on March 15, 2025"), null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("$800.00"), "", "$1,200.00", "March 15, 2025", "", false, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Remaining \nbalance"))})), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementsDetailsSpecialFinancingSectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementsDetailsSpecialFinancingSectionKt.$r8$lambda$j2_0Lif9oyDCi5tB4q9KLdPPRZo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
