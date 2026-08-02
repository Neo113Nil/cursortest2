package com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\u000b"}, d2 = {"ShippingAccordionCollapsed", "", "readyState", "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$State$Ready;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$State$Ready;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ShippingAccordionCollapsedWithSelectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "ShippingAccordionCollapsedNoShippingPreview", "ShippingAccordionCollapsedNoSelectionPreview", "money-movement_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShippingAccordionCollapsedKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShippingAccordionCollapsed(final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready ready, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ready, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(426664648);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(ready) ? 4 : 2) | i;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(426664648, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionCollapsed (ShippingAccordionCollapsed.kt:55)");
                }
                com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress selectedAddress = ready.getSelectedAddress();
                com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption shippingOption = selectedAddress != null ? com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingMapperKt.toShippingOption(selectedAddress) : null;
                boolean noShippingSelected = ready.getNoShippingSelected();
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
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
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.Package.INSTANCE), null, com.paypal.pds.components.AvatarSize.Large.INSTANCE, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 58);
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                if (noShippingSelected) {
                    startRestartGroup.startReplaceGroup(-921067716);
                    com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                    com.paypal.pds.core.Typography.BodyMedium bodyMedium2 = bodyMedium;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("No shipping", androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), ready.getEnabled() ? com.paypal.pds.core.Color.ContentBase.INSTANCE : com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, bodyMedium2, startRestartGroup, 12779574, 6, 856);
                    composer2.endReplaceGroup();
                } else if (shippingOption != null) {
                    startRestartGroup.startReplaceGroup(-920596733);
                    if (!kotlin.text.StringsKt.isBlank(shippingOption.getRecipientName())) {
                        startRestartGroup.startReplaceGroup(-920422575);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(shippingOption.getRecipientName(), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), ready.getEnabled() ? com.paypal.pds.core.Color.ContentBase.INSTANCE : com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 12779568, 6, 856);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-919986560);
                        startRestartGroup.endReplaceGroup();
                    }
                    java.lang.String addressSummary = shippingOption.getAddressSummary();
                    com.paypal.pds.core.Typography.BodyMedium bodyMedium3 = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(addressSummary, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, bodyMedium3, startRestartGroup, 12779952, 6, 856);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(-919319192);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Select address", androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 12779958, 6, 856);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionCollapsedKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionCollapsedKt.$r8$lambda$a7J8km5E6gdLuigVjKHo02HMXJg(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$4L8i3728ycr7HTG1xBAIXP4gElA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(876327563);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(876327563, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionCollapsedNoSelectionPreview (ShippingAccordionCollapsed.kt:188)");
            }
            ShippingAccordionCollapsed(new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready(kotlin.collections.CollectionsKt.emptyList(), null, false, false, false, 22, null), null, startRestartGroup, 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionCollapsedKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionCollapsedKt.$r8$lambda$4L8i3728ycr7HTG1xBAIXP4gElA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$a7J8km5E6gdLuigVjKHo02HMXJg(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready ready, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ShippingAccordionCollapsed(ready, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dz1pdSc7UMISg9G6Gv1dBR5Qir8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1772512251);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1772512251, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionCollapsedNoShippingPreview (ShippingAccordionCollapsed.kt:174)");
            }
            ShippingAccordionCollapsed(new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready(kotlin.collections.CollectionsKt.emptyList(), null, true, false, false, 18, null), null, startRestartGroup, 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionCollapsedKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionCollapsedKt.$r8$lambda$dz1pdSc7UMISg9G6Gv1dBR5Qir8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$teDrmwk_35KG9erpNEsR73jP_js(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2093742374);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2093742374, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionCollapsedWithSelectionPreview (ShippingAccordionCollapsed.kt:145)");
            }
            ShippingAccordionCollapsed(new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress("1", "Aisha Anwarzai", new com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address("9456 Howard St.", null, null, "Miami", "FL", "33324", "US"), true)), "1", false, false, false, 20, null), null, startRestartGroup, 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionCollapsedKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionCollapsedKt.$r8$lambda$teDrmwk_35KG9erpNEsR73jP_js(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
