package com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"PaymentTypeAccordionExpanded", "", "config", "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionConfig;", "readyState", "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State$Ready;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionConfig;Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State$Ready;Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "money-movement_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentTypeAccordionExpandedKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentTypeAccordionExpanded(final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig paymentTypeAccordionConfig, final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready ready, final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks paymentTypeAccordionCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTypeAccordionConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ready, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTypeAccordionCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2071070928);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changed(paymentTypeAccordionConfig) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= startRestartGroup.changed(ready) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= startRestartGroup.changed(paymentTypeAccordionCallbacks) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i5 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i3 = i5;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2071070928, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionExpanded (PaymentTypeAccordionExpanded.kt:58)");
                }
                java.util.List<com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.internal.TypeOption> typeOptions = com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.internal.TypeMapperKt.toTypeOptions(ready.getTypes());
                modifier3 = modifier4;
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(modifier4, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f))), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 5, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(paymentTypeAccordionConfig.getLabel(), androidx.compose.foundation.layout.RowScope.weight$default(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                if (paymentTypeAccordionConfig.getShowCollapseChevron()) {
                    startRestartGroup.startReplaceGroup(997966428);
                    com.paypal.pds.core.Icon.ChevronUp chevronUp = com.paypal.pds.core.Icon.ChevronUp.INSTANCE;
                    boolean z = (i3 & 896) == 256;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionExpandedKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionExpandedKt.$r8$lambda$l5ANUpjGvdIss4T9fyXWDCWXrjI(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    i4 = i3;
                    com.paypal.pds.components.IconButtonKt.IconButton(chevronUp, (kotlin.jvm.functions.Function0) rememberedValue, null, com.paypal.pds.components.ButtonStyle.TertiaryContained.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_paymenttype_collapse, startRestartGroup, 0), null, false, false, startRestartGroup, 27654, 452);
                    startRestartGroup.endReplaceGroup();
                } else {
                    i4 = i3;
                    startRestartGroup.startReplaceGroup(998331608);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing0()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-465476349);
                for (final com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.internal.TypeOption typeOption : typeOptions) {
                    boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(typeOption.getId(), ready.getSelectedTypeId());
                    boolean showInfoLinks = paymentTypeAccordionConfig.getShowInfoLinks();
                    int i7 = i4;
                    int i8 = i7 & 896;
                    boolean z2 = i8 == 256;
                    boolean changed = startRestartGroup.changed(typeOption);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((z2 | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionExpandedKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionExpandedKt.m15707$r8$lambda$r3rkoND4BYQaL_PVvh5RdBmj80(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks.this, typeOption);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    boolean z3 = i8 == 256;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionExpandedKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionExpandedKt.$r8$lambda$qYJkGwFuq8XxpICd9VZqK2Rj2PQ(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks.this, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.TypeRadioItemKt.TypeRadioItem(typeOption, areEqual, showInfoLinks, function0, (kotlin.jvm.functions.Function1) rememberedValue3, null, startRestartGroup, 0, 32);
                    i4 = i7;
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionExpandedKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionExpandedKt.$r8$lambda$z6aYPUgMGye0m3ldY81LHAsVOE4(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig.this, ready, paymentTypeAccordionCallbacks, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i5;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$l5ANUpjGvdIss4T9fyXWDCWXrjI(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks paymentTypeAccordionCallbacks) {
        paymentTypeAccordionCallbacks.getOnCollapse().invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qYJkGwFuq8XxpICd9VZqK2Rj2PQ(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks paymentTypeAccordionCallbacks, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        paymentTypeAccordionCallbacks.getOnInfoLinkClick().invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$r3rkoND4BYQaL_PVvh5Rd-Bmj80, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15707$r8$lambda$r3rkoND4BYQaL_PVvh5RdBmj80(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks paymentTypeAccordionCallbacks, com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.internal.TypeOption typeOption) {
        paymentTypeAccordionCallbacks.getOnSelectType().invoke(typeOption.getId());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z6aYPUgMGye0m3ldY81LHAsVOE4(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig paymentTypeAccordionConfig, com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready ready, com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks paymentTypeAccordionCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PaymentTypeAccordionExpanded(paymentTypeAccordionConfig, ready, paymentTypeAccordionCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
