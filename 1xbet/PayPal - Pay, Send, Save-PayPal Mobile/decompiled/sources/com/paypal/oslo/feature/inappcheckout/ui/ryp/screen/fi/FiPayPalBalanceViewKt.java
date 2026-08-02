package com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi;

@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u0015\u001a\"\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002\u001a\u0016\u0010\u001a\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001cH\u0002\u001a\u001a\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002\u001a\u001f\u0010\u001e\u001a\u00020\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001f\u001a\u00020\bH\u0003¢\u0006\u0002\u0010 ¨\u0006!"}, d2 = {"FiPayPalBalanceView", "", "state", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/uimodel/FiData;", "selectedInstrument", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "onBalanceSelect", "Lkotlin/Function1;", "", "(Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/uimodel/FiData;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "PayPalBalanceLogo", "balanceSubType", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BalanceSubType;", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BalanceSubType;Landroidx/compose/runtime/Composer;I)V", "PayPalBalanceDisclaimer", "contingencyName", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;", "type", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrumentType;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrumentType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "shouldShowBalanceDisclaimer", "hasInEligibleInstruments", "currentFiIdSelected", "", "checkEligibleFundingInstruments", "fundingInstruments", "", "isPayPalCreditSelected", "getBalanceDisclaimerText", "isCredit", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;ZLandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FiPayPalBalanceViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void FiPayPalBalanceView(final com.paypal.oslo.feature.inappcheckout.ui.ryp.uimodel.FiData fiData, final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        boolean z;
        java.lang.String rememberStringValue;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1113239729);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(fiData) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(fundingInstrument) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1113239729, i2, -1, "com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiPayPalBalanceView (FiPayPalBalanceView.kt:55)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> fundingInstruments = fiData.getFundingInstruments();
                if (!(fundingInstruments instanceof java.util.Collection) || !fundingInstruments.isEmpty()) {
                    java.util.Iterator<T> it = fundingInstruments.iterator();
                    while (it.hasNext()) {
                        if (((com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument) it.next()).getUsability().getStatus() == com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus.USABLE) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                rememberedValue = java.lang.Boolean.valueOf(!z2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            boolean booleanValue = ((java.lang.Boolean) rememberedValue).booleanValue();
            java.lang.String id = fundingInstrument != null ? fundingInstrument.getId() : null;
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency = fiData.getContingency();
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName name2 = contingency != null ? contingency.getName() : null;
            boolean z3 = name2 == com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName.ADD_INSTRUMENT || name2 == com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName.UPDATE_CARD_INSTRUMENT;
            java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> fundingInstruments2 = fiData.getFundingInstruments();
            if (!(fundingInstruments2 instanceof java.util.Collection) || !fundingInstruments2.isEmpty()) {
                for (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument2 : fundingInstruments2) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(fundingInstrument2.getId(), id) && fundingInstrument2.getType() == com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType.PAYPAL_CREDIT) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            boolean z4 = z3 || booleanValue || z;
            androidx.compose.ui.Modifier wrapContentHeight$default = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize8(), com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 4, null), 0.0f, 1, null), null, false, 3, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
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
            com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutCheckboxKt.InAppCheckoutCheckbox(!z4, fiData.isBalanceSelected(), function1, null, startRestartGroup, i2 & 896, 8);
            Camera2StreamConfigurationMap(fiData.getBalanceSubType(), startRestartGroup, 0);
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null);
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
            if (fiData.getBalanceSubType() == com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType.PPDC) {
                startRestartGroup.startReplaceGroup(1547647716);
                rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_ppdc_heading, new java.lang.Object[0], startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1547789944);
                rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_pp_balance_heading, new java.lang.Object[0], startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(rememberStringValue, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 48, 6, 1004);
            if (fiData.getBalanceSubType() == com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType.PPDC) {
                startRestartGroup.startReplaceGroup(1548271219);
                contingencyName = null;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_ppdc_use_available_balance, new java.lang.Object[0], startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 432, 6, 1000);
                startRestartGroup.endReplaceGroup();
            } else {
                contingencyName = null;
                startRestartGroup.startReplaceGroup(1548707947);
                startRestartGroup.endReplaceGroup();
            }
            if (z4) {
                startRestartGroup.startReplaceGroup(1548763065);
                com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency2 = fiData.getContingency();
                com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName name3 = contingency2 != null ? contingency2.getName() : contingencyName;
                java.lang.Enum type = fundingInstrument != null ? fundingInstrument.getType() : contingencyName;
                androidx.compose.ui.Modifier weight$default2 = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, contingencyName), 1.0f, false, 2, null);
                composer2 = startRestartGroup;
                getHighResolutionOutputSizeshNQ4ISI(name3, type, weight$default2, startRestartGroup, 0, 0);
                composer2.endReplaceGroup();
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(1549057131);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiPayPalBalanceViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiPayPalBalanceViewKt.$r8$lambda$r79XyiDVZTsZ12IH5HCfcd0e0hU(com.paypal.oslo.feature.inappcheckout.ui.ryp.uimodel.FiData.this, fundingInstrument, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType balanceSubType, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.lang.String str;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(875732884);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(balanceSubType == null ? -1 : balanceSubType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(875732884, i2, -1, "com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.PayPalBalanceLogo (FiPayPalBalanceView.kt:129)");
            }
            java.lang.String str2 = balanceSubType == com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType.PPDC ? com.paypal.oslo.feature.inappcheckout.Constants.PPDC_BALANCE_LOGO_URL : null;
            if (balanceSubType == com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType.PPDC) {
                str = com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.PAYPAL_CREDIT_TYPE_LOGO;
            } else {
                str = com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.PAYPAL_BALANCE_TYPE_LOGO;
            }
            com.paypal.oslo.feature.inappcheckout.ui.common.FiImageKt.FiImage(str2, com.paypal.oslo.feature.inappcheckout.R.drawable.feature_inappcheckout_ppbl_logo, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(54.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(36.0f)), str), startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiPayPalBalanceViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiPayPalBalanceViewKt.$r8$lambda$LNK1JZV2NoYDNSFj7HZ9B2dWQbc(com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName, final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType fundingInstrumentType, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(843831965);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(contingencyName == null ? -1 : contingencyName.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(fundingInstrumentType == null ? -1 : fundingInstrumentType.ordinal()) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(843831965, i4, -1, "com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.PayPalBalanceDisclaimer (FiPayPalBalanceView.kt:164)");
                }
                boolean z = fundingInstrumentType == com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType.PAYPAL_CREDIT;
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Warning.INSTANCE, null, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), com.paypal.pds.core.ConstantsKt.getSize4()), com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE, startRestartGroup, 27702, 0);
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(Camera2StreamConfigurationMap(contingencyName, z, startRestartGroup, i4 & 14), androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), 1.0f, false, 2, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, 1004);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiPayPalBalanceViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiPayPalBalanceViewKt.$r8$lambda$WHtDury90yAI_lykfO8c_XQyDLA(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName.this, fundingInstrumentType, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final java.lang.String Camera2StreamConfigurationMap(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName, boolean z, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String rememberStringValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(331119153, i, -1, "com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.getBalanceDisclaimerText (FiPayPalBalanceView.kt:209)");
        }
        android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        if (z) {
            composer.startReplaceGroup(-1169032237);
            rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_balance_checkbox_disclaimer, new java.lang.Object[0], composer, 0);
            composer.endReplaceGroup();
        } else if (contingencyName == com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName.ADD_INSTRUMENT) {
            composer.startReplaceGroup(-1168845493);
            rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_ppbl_empty_wallet_disclaimer_text, new java.lang.Object[0], composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1168674869);
            rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_ppbl_expired_card_disclaimer_text, new java.lang.Object[0], composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberStringValue;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LNK1JZV2NoYDNSFj7HZ9B2dWQbc(com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType balanceSubType, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(balanceSubType, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WHtDury90yAI_lykfO8c_XQyDLA(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType fundingInstrumentType, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(contingencyName, fundingInstrumentType, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r79XyiDVZTsZ12IH5HCfcd0e0hU(com.paypal.oslo.feature.inappcheckout.ui.ryp.uimodel.FiData fiData, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        FiPayPalBalanceView(fiData, fundingInstrument, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
