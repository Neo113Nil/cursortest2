package com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a5\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0012\u001a-\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0019"}, d2 = {"ShippingAccordionExpanded", "", "config", "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionConfig;", "readyState", "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$State$Ready;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionConfig;Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$State$Ready;Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ShippingAddressRadioItem", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/shippingaccordion/internal/ShippingOption;", "isSelected", "", "onClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/shippingaccordion/internal/ShippingOption;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NoShippingRadioItem", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ShippingAccordionExpandedPreview", "(Landroidx/compose/runtime/Composer;I)V", "ShippingAccordionExpandedEmptyPreview", "ShippingAccordionExpandedDigitalGoodsPreview", "money-movement_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShippingAccordionExpandedKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShippingAccordionExpanded(final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig shippingAccordionConfig, final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready ready, final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks shippingAccordionCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAccordionConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ready, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAccordionCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-893788352);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changed(shippingAccordionConfig) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(ready) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(shippingAccordionCallbacks) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i3 = i4;
            boolean z = true;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-893788352, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpanded (ShippingAccordionExpanded.kt:74)");
                }
                java.util.List<com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption> shippingOptions = com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingMapperKt.toShippingOptions(ready.getAddresses());
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                startRestartGroup.startReplaceGroup(1348737831);
                for (final com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption shippingOption : shippingOptions) {
                    boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(ready.getSelectedAddressId(), shippingOption.getId());
                    boolean z2 = (i3 & 896) == 256 ? z : false;
                    boolean changed = startRestartGroup.changed(shippingOption);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((z2 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt.m15758$r8$lambda$B8CKjwPkrjKtXStqeW0WmVwn4(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks.this, shippingOption);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    getHighSpeedVideoFpsRanges(shippingOption, areEqual, (kotlin.jvm.functions.Function0) rememberedValue, null, startRestartGroup, 0, 8);
                    modifier4 = modifier4;
                    z = true;
                }
                modifier3 = modifier4;
                startRestartGroup.endReplaceGroup();
                if (shippingAccordionConfig.getShowNoShipping()) {
                    startRestartGroup.startReplaceGroup(-1138483067);
                    boolean noShippingSelected = ready.getNoShippingSelected();
                    boolean z3 = (i3 & 896) == 256;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt.$r8$lambda$brhvXKocPIB0oQJYeLuvOj521WE(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    getHighSpeedVideoFpsRanges(noShippingSelected, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 0, 4);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1138311048);
                    startRestartGroup.endReplaceGroup();
                }
                if (shippingAccordionConfig.getShowAddAddress()) {
                    startRestartGroup.startReplaceGroup(-1138193341);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_shipping_address_accordion_cta, startRestartGroup, 0);
                    com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                    com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                    com.paypal.pds.core.Icon.Plus plus = com.paypal.pds.core.Icon.Plus.INSTANCE;
                    androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    boolean z4 = (i3 & 896) == 256;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (z4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt.$r8$lambda$VJKG4FiIZCrUrr4bdb8SXK9udG0(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, stringResource, fillMaxWidth$default2, plus, null, secondary, large, false, false, startRestartGroup, 1772928, 400);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1137773384);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt.$r8$lambda$DJzAt9mY8II1nRrvCiNNz6R7nIw(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig.this, ready, shippingAccordionCallbacks, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i4;
        boolean z5 = true;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption shippingOption, final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1028509843);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(shippingOption) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1028509843, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAddressRadioItem (ShippingAccordionExpanded.kt:136)");
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                androidx.compose.ui.Modifier m22102selectableXVZzFYc = com.paypal.pds.core.ModifierExtensionsKt.m22102selectableXVZzFYc(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, null), z, null, com.paypal.pds.core.PDSIndication.None.INSTANCE, false, androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7803getRadioButtono7Vup1c()), function0, startRestartGroup, (i3 & 112) | 3072 | ((i3 << 12) & 3670016), 10);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m22102selectableXVZzFYc);
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
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
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
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(shippingOption.getRecipientName(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(shippingOption.getAddressFull(), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
                composer2.endNode();
                com.paypal.pds.components.IconKt.Icon(z ? com.paypal.pds.core.Icon.RadioSelected.INSTANCE : com.paypal.pds.core.Icon.RadioEmpty.INSTANCE, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer2, 27696, 4);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt.$r8$lambda$m1TDFxQjGNn2JuLXSMfTeQ8FWuY(com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption.this, z, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1772530259);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1772530259, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.NoShippingRadioItem (ShippingAccordionExpanded.kt:194)");
                }
                androidx.compose.ui.Modifier m22102selectableXVZzFYc = com.paypal.pds.core.ModifierExtensionsKt.m22102selectableXVZzFYc(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, null), z, null, com.paypal.pds.core.PDSIndication.None.INSTANCE, false, androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7803getRadioButtono7Vup1c()), function0, startRestartGroup, ((i3 << 3) & 112) | 3072 | ((i3 << 15) & 3670016), 10);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m22102selectableXVZzFYc);
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
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("No shipping", androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 390, 6, 1016);
                com.paypal.pds.components.IconKt.Icon(z ? com.paypal.pds.core.Icon.RadioSelected.INSTANCE : com.paypal.pds.core.Icon.RadioEmpty.INSTANCE, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer2, 27696, 4);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt.$r8$lambda$mynl3WWOScibMu3dxnpinZMbGeo(z, function0, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$B8CKjwPk-rjKtXStqeW0WmVwn-4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15758$r8$lambda$B8CKjwPkrjKtXStqeW0WmVwn4(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks shippingAccordionCallbacks, com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption shippingOption) {
        shippingAccordionCallbacks.getOnSelectAddress().invoke(shippingOption.getId());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DJzAt9mY8II1nRrvCiNNz6R7nIw(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig shippingAccordionConfig, com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready ready, com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks shippingAccordionCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ShippingAccordionExpanded(shippingAccordionConfig, ready, shippingAccordionCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VJKG4FiIZCrUrr4bdb8SXK9udG0(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks shippingAccordionCallbacks) {
        shippingAccordionCallbacks.getOnAddAddress().invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$brhvXKocPIB0oQJYeLuvOj521WE(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks shippingAccordionCallbacks) {
        shippingAccordionCallbacks.getOnSelectNoShipping().invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eJScvu9np4NPQLTOYLAmkRgYksU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(646571790);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(646571790, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedPreview (ShippingAccordionExpanded.kt:232)");
            }
            ShippingAccordionExpanded(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig.INSTANCE.standard(), new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress[]{new com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress("1", "Aisha Anwarzai", new com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address("9456 Howard St.", "Apt 200", null, "Miami", "FL", "33324", "US"), true), new com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "John Smith", new com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address("123 Main St.", null, null, "Los Angeles", "CA", "90210", "US"), false)}), "1", false, true, false, 20, null), com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks.Companion.invoke$default(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks.INSTANCE, null, null, null, null, null, 31, null), null, startRestartGroup, 48, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt.$r8$lambda$eJScvu9np4NPQLTOYLAmkRgYksU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$g_gN-JBw0_j500DHJtjNR5k1Xho, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15759$r8$lambda$g_gNJBw0_j500DHJtjNR5k1Xho(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1942082064);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1942082064, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedDigitalGoodsPreview (ShippingAccordionExpanded.kt:292)");
            }
            ShippingAccordionExpanded(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig.INSTANCE.digitalGoods(), new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready(kotlin.collections.CollectionsKt.emptyList(), null, true, true, false, 18, null), com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks.Companion.invoke$default(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks.INSTANCE, null, null, null, null, null, 31, null), null, startRestartGroup, 48, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt.m15759$r8$lambda$g_gNJBw0_j500DHJtjNR5k1Xho(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m1TDFxQjGNn2JuLXSMfTeQ8FWuY(com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption shippingOption, boolean z, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(shippingOption, z, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mynl3WWOScibMu3dxnpinZMbGeo(boolean z, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(z, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$owdo03PBWQAQ1OxpHCe6vWIBiLo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2038314645);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2038314645, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedEmptyPreview (ShippingAccordionExpanded.kt:277)");
            }
            ShippingAccordionExpanded(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig.INSTANCE.standard(), new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready(kotlin.collections.CollectionsKt.emptyList(), null, false, true, false, 22, null), com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks.Companion.invoke$default(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks.INSTANCE, null, null, null, null, null, 31, null), null, startRestartGroup, 48, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionExpandedKt.$r8$lambda$owdo03PBWQAQ1OxpHCe6vWIBiLo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
