package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\r"}, d2 = {"StatementDetailsPaymentsSection", "", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/PaymentsUiModel;", "onLearnMoreClick", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/PaymentsUiModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StatementDetailsPaymentsSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "StatementDetailsPaymentsSectionCBMCPreview", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementDetailsPaymentsSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StatementDetailsPaymentsSection(final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentsUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1652969705);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(paymentsUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
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
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1652969705, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSection (StatementDetailsPaymentsSection.kt:40)");
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
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_details_section_payments, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1452486925, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSectionKt.m18655$r8$lambda$8uvfAsOK7HSQnehTRhP9RJt69Y(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel.this, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSectionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSectionKt.$r8$lambda$kZ77oDvEccAYIX0WNz6gmmf8XGw(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel.this, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$6c5830cMMfVokBgUj7dXMKMcm0Y(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8uvfAsOK7HSQ-nehTRhP9RJt69Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18655$r8$lambda$8uvfAsOK7HSQnehTRhP9RJt69Y(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1452486925, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSection.<anonymous>.<anonymous> (StatementDetailsPaymentsSection.kt:53)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.DetailRowKt.DetailRow(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_details_payment_due_date, composer, 0), paymentsUiModel.getPaymentDueDate(), null, null, null, composer, 0, 28);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.DetailRowKt.DetailRow(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_details_minimum_payment_due, composer, 0), paymentsUiModel.getMinimumPaymentDue(), null, null, null, composer, 0, 28);
            java.lang.String avoidInterestMinimumPaymentDue = paymentsUiModel.getAvoidInterestMinimumPaymentDue();
            if (avoidInterestMinimumPaymentDue == null || avoidInterestMinimumPaymentDue.length() == 0) {
                composer.startReplaceGroup(-755487947);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-756956355);
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
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
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer, 54);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_details_amount_to_avoid_interest, composer, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE.weight(androidx.compose.ui.Modifier.INSTANCE, 1.0f, false), 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 11, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 0, 6, 1020);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(paymentsUiModel.getAvoidInterestMinimumPaymentDue(), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                composer.endNode();
                final java.lang.String learnMoreUrl = paymentsUiModel.getLearnMoreUrl();
                if (learnMoreUrl == null) {
                    composer.startReplaceGroup(-126633154);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-126633153);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_learn_more, composer, 0);
                    com.paypal.pds.components.LinkSize.Medium medium = com.paypal.pds.components.LinkSize.Medium.INSTANCE;
                    androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null);
                    boolean changed = composer.changed(function1);
                    boolean changed2 = composer.changed(learnMoreUrl);
                    java.lang.Object rememberedValue = composer.rememberedValue();
                    if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSectionKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSectionKt.$r8$lambda$6c5830cMMfVokBgUj7dXMKMcm0Y(kotlin.jvm.functions.Function1.this, learnMoreUrl);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.components.LinkKt.Link(stringResource, m1708paddingVpY3zN4$default, (kotlin.jvm.functions.Function0) rememberedValue, medium, composer, com.paypal.pds.components.LinkSize.Medium.$stable << 9, 0);
                    composer.endReplaceGroup();
                }
                composer.endNode();
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DG_RdZim7Q0uIZoAzdpfYFFs4wg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1409851329);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1409851329, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSectionPreview (StatementDetailsPaymentsSection.kt:103)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel("Aug 16", "$500.00", "$450.00", "www.paypal.com/learnmore");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSectionKt.$r8$lambda$UtDFwxKegLvRWLS1C6yfGwyYScc((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            StatementDetailsPaymentsSection(paymentsUiModel, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSectionKt.$r8$lambda$DG_RdZim7Q0uIZoAzdpfYFFs4wg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Fzoz4f1hQ_LgHjPu8THYuond3Y8(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$O75-y9iVboeMWSyUNqu5B3x-J2c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18656$r8$lambda$O75y9iVboeMWSyUNqu5B3xJ2c(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1627567158);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1627567158, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSectionCBMCPreview (StatementDetailsPaymentsSection.kt:117)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel("Aug 16", "$500.00", null, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSectionKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSectionKt.$r8$lambda$Fzoz4f1hQ_LgHjPu8THYuond3Y8((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            StatementDetailsPaymentsSection(paymentsUiModel, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSectionKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSectionKt.m18656$r8$lambda$O75y9iVboeMWSyUNqu5B3xJ2c(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UtDFwxKegLvRWLS1C6yfGwyYScc(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kZ77oDvEccAYIX0WNz6gmmf8XGw(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        StatementDetailsPaymentsSection(paymentsUiModel, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
