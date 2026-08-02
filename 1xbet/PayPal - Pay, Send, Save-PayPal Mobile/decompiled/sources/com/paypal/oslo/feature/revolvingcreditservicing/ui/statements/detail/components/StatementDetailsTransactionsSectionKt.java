package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a/\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001aM\u0010\n\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0016"}, d2 = {"StatementDetailsTransactionsSection", "", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel$TransactionItemUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/TransactionSectionUiState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TransactionsSectionReady", "transactions", "onTransactionClick", "Lkotlin/Function1;", "onCancelTransactionClick", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "TransactionsEmptyState", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StatementDetailsTransactionsSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "StatementDetailsTransactionsSectionEmptyPreview", "StatementDetailsTransactionsSectionHiddenPreview", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementDetailsTransactionsSectionKt {
    public static final void StatementDetailsTransactionsSection(final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<? extends java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel>> statementDetailSectionUiState, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailSectionUiState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-533319690);
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-533319690, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSection (StatementDetailsTransactionsSection.kt:58)");
            }
            if (statementDetailSectionUiState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Ready) {
                startRestartGroup.startReplaceGroup(-1419107161);
                java.util.List list = (java.util.List) ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Ready) statementDetailSectionUiState).getData();
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt.m18661$r8$lambda$MLslF6fb9w_XbWh3aTrKnxdScY((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt.m18662$r8$lambda$eAaS22KO6Ke5D6InrSzQx8JAU((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                getHighResolutionOutputSizeshNQ4ISI(list, modifier, function1, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, (i3 & 112) | 3456, 0);
                startRestartGroup.endReplaceGroup();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(statementDetailSectionUiState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Empty.INSTANCE)) {
                startRestartGroup.startReplaceGroup(-1419099090);
                getHighResolutionOutputSizeshNQ4ISI(null, startRestartGroup, 0, 1);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(statementDetailSectionUiState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Hidden.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(statementDetailSectionUiState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Error.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(-1419109440);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(-1419095558);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt.$r8$lambda$u6Hxv4HUDmhidR7eSyZAMI2jzUg(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel> list, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(443845866);
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
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
            }
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(443845866, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.TransactionsSectionReady (StatementDetailsTransactionsSection.kt:80)");
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
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_details_section_transactions, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-400613618, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt.$r8$lambda$qn1s_8uNXw2BCItegUNdKNITneY(list, function12, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306374, 502);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt.$r8$lambda$PymZYpzW9gjkBBq6s_2cSSJEqpI(list, modifier5, function1, function12, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-143582262);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-143582262, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.TransactionsEmptyState (StatementDetailsTransactionsSection.kt:113)");
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
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_details_section_transactions, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.ComposableSingletons$StatementDetailsTransactionsSectionKt.INSTANCE.m18653getLambda$1362579418$revolvingcredit_servicing_prodRelease(), composer2, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306374, 502);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt.$r8$lambda$cZuqRwRAS2zW4B5PVJXW3faA35o(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6HpW8U7RNvODRgWrLJ9b3nBi8XE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(649707073);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(649707073, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionPreview (StatementDetailsTransactionsSection.kt:169)");
            }
            StatementDetailsTransactionsSection(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Ready(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel[]{new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel("1", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Starbucks Coffee"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Dec 15"), null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("$5.67"), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Green.INSTANCE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("2%"), bool, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt$StatementDetailsTransactionsSectionPreview$mockTransaction1$1
                private final boolean isCancellable;
                private final java.lang.String referenceId;
                private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> transactionFundingInstruments;
                private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage transactionImage;
                private final java.lang.String id = "1";
                private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "$5.67");
                private final java.time.Instant creationDate = java.time.Instant.parse("2025-12-15T10:30:00Z");
                private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.PAYMENT;
                private final java.lang.String transactionName = "Starbucks Coffee";
                private final java.lang.String transactionCashbackPercentage = "2%";

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.lang.String getId() {
                    return this.id;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAmount() {
                    return this.amount;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.time.Instant getCreationDate() {
                    return this.creationDate;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                /* renamed from: isCancellable, reason: from getter */
                public final boolean getIsCancellable() {
                    return this.isCancellable;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType getTransactionType() {
                    return this.transactionType;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage getTransactionImage() {
                    return this.transactionImage;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.lang.String getTransactionName() {
                    return this.transactionName;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> getTransactionFundingInstruments() {
                    return this.transactionFundingInstruments;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.lang.String getTransactionCashbackPercentage() {
                    return this.transactionCashbackPercentage;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.lang.String getReferenceId() {
                    return this.referenceId;
                }
            }), new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Amazon.com"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Dec 12"), null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("$89.99"), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Default.INSTANCE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("3%"), bool, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt$StatementDetailsTransactionsSectionPreview$mockTransaction2$1
                private final boolean isCancellable;
                private final java.lang.String referenceId;
                private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> transactionFundingInstruments;
                private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage transactionImage;
                private final java.lang.String id = androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D;
                private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "$89.99");
                private final java.time.Instant creationDate = java.time.Instant.parse("2025-12-12T14:15:00Z");
                private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.PURCHASE;
                private final java.lang.String transactionName = "Amazon.com";
                private final java.lang.String transactionCashbackPercentage = "3%";

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.lang.String getId() {
                    return this.id;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAmount() {
                    return this.amount;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.time.Instant getCreationDate() {
                    return this.creationDate;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                /* renamed from: isCancellable, reason: from getter */
                public final boolean getIsCancellable() {
                    return this.isCancellable;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType getTransactionType() {
                    return this.transactionType;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage getTransactionImage() {
                    return this.transactionImage;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.lang.String getTransactionName() {
                    return this.transactionName;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> getTransactionFundingInstruments() {
                    return this.transactionFundingInstruments;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.lang.String getTransactionCashbackPercentage() {
                    return this.transactionCashbackPercentage;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.lang.String getReferenceId() {
                    return this.referenceId;
                }
            }), new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Late Fee"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Dec 10"), null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("$2.50"), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Default.INSTANCE, null, bool, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt$StatementDetailsTransactionsSectionPreview$mockTransaction3$1
                private final boolean isCancellable;
                private final java.lang.String referenceId;
                private final java.lang.String transactionCashbackPercentage;
                private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> transactionFundingInstruments;
                private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage transactionImage;
                private final java.lang.String id = androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D;
                private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "$2.50");
                private final java.time.Instant creationDate = java.time.Instant.parse("2025-12-10T09:00:00Z");
                private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.FEE;
                private final java.lang.String transactionName = "Late Fee";

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.lang.String getId() {
                    return this.id;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAmount() {
                    return this.amount;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.time.Instant getCreationDate() {
                    return this.creationDate;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                /* renamed from: isCancellable, reason: from getter */
                public final boolean getIsCancellable() {
                    return this.isCancellable;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType getTransactionType() {
                    return this.transactionType;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage getTransactionImage() {
                    return this.transactionImage;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.lang.String getTransactionName() {
                    return this.transactionName;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> getTransactionFundingInstruments() {
                    return this.transactionFundingInstruments;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.lang.String getTransactionCashbackPercentage() {
                    return this.transactionCashbackPercentage;
                }

                @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
                public final java.lang.String getReferenceId() {
                    return this.referenceId;
                }
            })})), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt.$r8$lambda$6HpW8U7RNvODRgWrLJ9b3nBi8XE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9dViy61Z6OKEBcFkb-3tnUuKbJg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18659$r8$lambda$9dViy61Z6OKEBcFkb3tnUuKbJg(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel transactionItemUiModel) {
        function1.invoke(transactionItemUiModel);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ItwapfqKWbw20lB26K5KpkTG-h0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18660$r8$lambda$ItwapfqKWbw20lB26K5KpkTGh0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1215491216);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1215491216, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionEmptyPreview (StatementDetailsTransactionsSection.kt:252)");
            }
            StatementDetailsTransactionsSection(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Empty.INSTANCE, null, startRestartGroup, 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt.m18660$r8$lambda$ItwapfqKWbw20lB26K5KpkTGh0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$K3ifFH5VOrQHfKlF4gQpcDagP6U(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(74762059);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(74762059, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionHiddenPreview (StatementDetailsTransactionsSection.kt:260)");
            }
            StatementDetailsTransactionsSection(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Hidden.INSTANCE, null, startRestartGroup, 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt.$r8$lambda$K3ifFH5VOrQHfKlF4gQpcDagP6U(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MLslF6f-b9w_XbWh3aTrKnxdScY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18661$r8$lambda$MLslF6fb9w_XbWh3aTrKnxdScY(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel transactionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionItemUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PymZYpzW9gjkBBq6s_2cSSJEqpI(java.util.List list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(list, modifier, function1, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Y_BBNRBB3HN4ptq_4iVt2cggbjg(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel transactionItemUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel transactionItemUiModel2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionItemUiModel2, "");
        function1.invoke(transactionItemUiModel);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cZuqRwRAS2zW4B5PVJXW3faA35o(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eAaS22KO6Ke5D-6InrSzQx-8JAU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18662$r8$lambda$eAaS22KO6Ke5D6InrSzQx8JAU(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel transactionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionItemUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qn1s_8uNXw2BCItegUNdKNITneY(java.util.List list, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-400613618, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.TransactionsSectionReady.<anonymous>.<anonymous> (StatementDetailsTransactionsSection.kt:93)");
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
            composer.startReplaceGroup(-1227182379);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel transactionItemUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel) it.next();
                java.lang.String asString = transactionItemUiModel.getTitle().asString(composer, 0);
                boolean changed = composer.changed(function1);
                boolean changedInstance = composer.changedInstance(transactionItemUiModel);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt.$r8$lambda$Y_BBNRBB3HN4ptq_4iVt2cggbjg(kotlin.jvm.functions.Function1.this, transactionItemUiModel, (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.ListItem listItem = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.TransactionItemToListItemMapperKt.toListItem(transactionItemUiModel, asString, (kotlin.jvm.functions.Function1) rememberedValue, composer, 0);
                boolean changed2 = composer.changed(function12);
                boolean changedInstance2 = composer.changedInstance(transactionItemUiModel);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if ((changed2 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt.m18659$r8$lambda$9dViy61Z6OKEBcFkb3tnUuKbJg(kotlin.jvm.functions.Function1.this, transactionItemUiModel);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.ListKt.ListItemView(listItem, null, false, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, false, composer, com.paypal.pds.components.ListItem.$stable, 118);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$u6Hxv4HUDmhidR7eSyZAMI2jzUg(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState statementDetailSectionUiState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        StatementDetailsTransactionsSection(statementDetailSectionUiState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
