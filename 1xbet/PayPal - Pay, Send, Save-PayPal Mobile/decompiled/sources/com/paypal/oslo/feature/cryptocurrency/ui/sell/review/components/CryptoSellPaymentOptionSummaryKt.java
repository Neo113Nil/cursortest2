package com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a)\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000e"}, d2 = {"CryptoSellPaymentOptionSummary", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SELECTED_OPTION, "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOption;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoSellPaymentOptionSummaryBalanceCollapsedPreview", "(Landroidx/compose/runtime/Composer;I)V", "CryptoSellPaymentOptionSummaryBalanceExpandedPreview", "CryptoSellPaymentOptionSummaryPyusdCollapsedPreview", "CryptoSellPaymentOptionSummaryNoSelectionPreview", "cryptocurrency_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoSellPaymentOptionSummaryKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoSellPaymentOptionSummary(final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption, final boolean z, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-893390950);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(cryptoSellPaymentOption) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
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
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-893390950, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSummary (CryptoSellPaymentOptionSummary.kt:49)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 48);
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
                if (z) {
                    startRestartGroup.startReplaceGroup(421806299);
                    modifier3 = modifier4;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_review_to_label, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
                    startRestartGroup.endReplaceGroup();
                } else {
                    modifier3 = modifier4;
                    if (cryptoSellPaymentOption != null) {
                        startRestartGroup.startReplaceGroup(422187382);
                        com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconKt.PaymentMethodCardWithIcon(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 11, null), com.paypal.pds.core.Icon.LogoPaypalMarkColor.INSTANCE, cryptoSellPaymentOption.getIconUrl(), null, null, com.paypal.pds.core.Color.Unspecified.INSTANCE, com.paypal.pds.core.Color.BackgroundBase.INSTANCE, startRestartGroup, 1769520, 24);
                        androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 48);
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
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_review_to_label, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                        if (!kotlin.text.StringsKt.isBlank(cryptoSellPaymentOption.getDetails())) {
                            startRestartGroup.startReplaceGroup(483964793);
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(cryptoSellPaymentOption.getDisplayNameResId(), startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 384, 6, 1018);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(484211491);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(423294764);
                        startRestartGroup.endReplaceGroup();
                    }
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSummaryKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSummaryKt.m14066$r8$lambda$0vHCnUqgekfKh_pybSf2612_Yk(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption.this, z, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* renamed from: $r8$lambda$0vHCnUqgekfKh_pybSf261-2_Yk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14066$r8$lambda$0vHCnUqgekfKh_pybSf2612_Yk(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption, boolean z, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CryptoSellPaymentOptionSummary(cryptoSellPaymentOption, z, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7Vh6TXQz0FQTJD-UoE-UztHZK4Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14067$r8$lambda$7Vh6TXQz0FQTJDUoEUztHZK4Q(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(984418926);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(984418926, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSummaryBalanceCollapsedPreview (CryptoSellPaymentOptionSummary.kt:97)");
            }
            CryptoSellPaymentOptionSummary(new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption("balance", "abc123", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.BALANCE, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_balance_display_name, "$279.41 USD available", null, 32, null), false, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSummaryKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSummaryKt.m14067$r8$lambda$7Vh6TXQz0FQTJDUoEUztHZK4Q(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$88e-sCvDSNsbfYtftCiqf8loABs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14068$r8$lambda$88esCvDSNsbfYtftCiqf8loABs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(700535980);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(700535980, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSummaryBalanceExpandedPreview (CryptoSellPaymentOptionSummary.kt:117)");
            }
            CryptoSellPaymentOptionSummary(new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption("balance", "abc123", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.BALANCE, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_balance_display_name, "$279.41 USD available", null, 32, null), true, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSummaryKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSummaryKt.m14068$r8$lambda$88esCvDSNsbfYtftCiqf8loABs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ur1dZuwM2o20ijQnJB-0cL3EUs4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14069$r8$lambda$Ur1dZuwM2o20ijQnJB0cL3EUs4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1833717334);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1833717334, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSummaryNoSelectionPreview (CryptoSellPaymentOptionSummary.kt:157)");
            }
            CryptoSellPaymentOptionSummary(null, false, null, startRestartGroup, 54, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSummaryKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSummaryKt.m14069$r8$lambda$Ur1dZuwM2o20ijQnJB0cL3EUs4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_GenQ1-j07M_SAYkJxNzSJa4-mU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14070$r8$lambda$_GenQ1j07M_SAYkJxNzSJa4mU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1815675695);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1815675695, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSummaryPyusdCollapsedPreview (CryptoSellPaymentOptionSummary.kt:137)");
            }
            CryptoSellPaymentOptionSummary(new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.PyusdItemFactoryKt.AccountSnapshotPyUsdId, "def456", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.PYUSD, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_pyusd_display_name, "100.00 PYUSD", null, 32, null), false, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSummaryKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSummaryKt.m14070$r8$lambda$_GenQ1j07M_SAYkJxNzSJa4mU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
