package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"CreditDetailsSection", "", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CreditDetailsSectionUiModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CreditDetailsSectionUiModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CreditDetailsSectionUiModelPreview", "(Landroidx/compose/runtime/Composer;I)V", "CreditDetailsSectionUiModelPartialPreview", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CreditDetailsSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CreditDetailsSection(final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CreditDetailsSectionUiModel creditDetailsSectionUiModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditDetailsSectionUiModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2048339937);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(creditDetailsSectionUiModel) ? 4 : 2) | i;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2048339937, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CreditDetailsSection (CreditDetailsSection.kt:39)");
                }
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 7, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                com.paypal.pds.components.SectionHeaderKt.SectionHeader(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 7, null), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_account_credit_details_title, startRestartGroup, 0), null, null, startRestartGroup, 0, 12);
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-463022469, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CreditDetailsSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CreditDetailsSectionKt.$r8$lambda$xEJh85FYAcgq1K22gjBQ1zYOlwk(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CreditDetailsSectionUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CreditDetailsSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CreditDetailsSectionKt.$r8$lambda$ntxqdGfxdfMzySRg3RngtjKj53s(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CreditDetailsSectionUiModel.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$dL_6IWwoRm5GHMsdojJp4XwdYIE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(429662605);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(429662605, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CreditDetailsSectionUiModelPartialPreview (CreditDetailsSection.kt:110)");
            }
            CreditDetailsSection(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CreditDetailsSectionUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("$5,000"), (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) null, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) null, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("26.99%"), (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) null, 46, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CreditDetailsSectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CreditDetailsSectionKt.$r8$lambda$dL_6IWwoRm5GHMsdojJp4XwdYIE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ntxqdGfxdfMzySRg3RngtjKj53s(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CreditDetailsSectionUiModel creditDetailsSectionUiModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CreditDetailsSection(creditDetailsSectionUiModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x4_EE_OUrSUesISTCn9PFkAxDOg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1026945058);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1026945058, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CreditDetailsSectionUiModelPreview (CreditDetailsSection.kt:96)");
            }
            CreditDetailsSection(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CreditDetailsSectionUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("$5,000"), (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("13.99%"), (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("24.99%"), (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) null, 42, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CreditDetailsSectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CreditDetailsSectionKt.$r8$lambda$x4_EE_OUrSUesISTCn9PFkAxDOg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xEJh85FYAcgq1K22gjBQ1zYOlwk(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CreditDetailsSectionUiModel creditDetailsSectionUiModel, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String asString;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-463022469, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CreditDetailsSection.<anonymous>.<anonymous> (CreditDetailsSection.kt:54)");
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
            if (creditDetailsSectionUiModel.getShowError()) {
                composer.startReplaceGroup(2009580913);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorKt.Error(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_something_went_wrong_error_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment.TOP, null, null, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, null), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), null, composer, 0, 4);
            } else {
                composer.startReplaceGroup(2010197534);
                java.lang.String asString2 = creditDetailsSectionUiModel.getCreditLimitTitle().asString(composer, 0);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString creditLimit = creditDetailsSectionUiModel.getCreditLimit();
                if (creditLimit == null) {
                    composer.startReplaceGroup(2010327206);
                    asString = null;
                } else {
                    composer.startReplaceGroup(-1736266053);
                    asString = creditLimit.asString(composer, 0);
                }
                composer.endReplaceGroup();
                com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(asString2, null, null, asString, null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, composer, 0, 384, 520182);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString purchaseApr = creditDetailsSectionUiModel.getPurchaseApr();
                if (purchaseApr == null) {
                    composer.startReplaceGroup(2010447951);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(2010447952);
                    com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(creditDetailsSectionUiModel.getPurchaseAprTitle().asString(composer, 0), null, null, purchaseApr.asString(composer, 0), null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, composer, 0, 384, 520182);
                    composer.endReplaceGroup();
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString cashAdvanceApr = creditDetailsSectionUiModel.getCashAdvanceApr();
                if (cashAdvanceApr == null) {
                    composer.startReplaceGroup(2010747628);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(2010747629);
                    com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(creditDetailsSectionUiModel.getCashAdvanceAprTitle().asString(composer, 0), null, null, cashAdvanceApr.asString(composer, 0), null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, composer, 0, 384, 520182);
                    composer.endReplaceGroup();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
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
