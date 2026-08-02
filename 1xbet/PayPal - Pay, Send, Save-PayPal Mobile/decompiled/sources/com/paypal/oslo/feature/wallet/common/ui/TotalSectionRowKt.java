package com.paypal.oslo.feature.wallet.common.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0000\"\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"TotalSectionRow", "", "item", "Lcom/paypal/oslo/feature/wallet/common/model/TotalSectionItem;", "icon", "Lcom/paypal/pds/core/Icon;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/wallet/common/model/TotalSectionItem;Lcom/paypal/pds/core/Icon;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "currencySymbols", "", "", "removeCurrencyCodeIfSymbolPresent", "", "text", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TotalSectionRowKt {
    private static final java.util.Set<java.lang.Character> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{java.lang.Character.valueOf(kotlin.text.Typography.dollar), java.lang.Character.valueOf(kotlin.text.Typography.euro), java.lang.Character.valueOf(kotlin.text.Typography.pound), 165, 8377, 8361, 8362, 8363, 8369, 8383, 3647, 8378, 8381, 8372});

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TotalSectionRow(final com.paypal.oslo.feature.wallet.common.model.TotalSectionItem totalSectionItem, final com.paypal.pds.core.Icon icon, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        androidx.compose.runtime.ScopeUpdateScope scopeUpdateScope;
        androidx.compose.ui.Modifier modifier4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalSectionItem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2121419749);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(totalSectionItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(icon) ? 32 : 16;
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
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier5 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2121419749, i3, -1, "com.paypal.oslo.feature.wallet.common.ui.TotalSectionRow (TotalSectionRow.kt:54)");
                }
                if (totalSectionItem.getTitle().length() == 0 || totalSectionItem.getSubtitle().length() == 0) {
                    final androidx.compose.ui.Modifier modifier6 = modifier5;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScope = startRestartGroup.endRestartGroup();
                    if (scopeUpdateScope != null) {
                        function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.TotalSectionRowKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.common.ui.TotalSectionRowKt.m21217$r8$lambda$kz9JSe9DfIcsGqPmsp0PuNf3fc(com.paypal.oslo.feature.wallet.common.model.TotalSectionItem.this, icon, modifier6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        scopeUpdateScope.updateScope(function2);
                        return;
                    }
                    return;
                }
                java.lang.String removeCurrencyCodeIfSymbolPresent = removeCurrencyCodeIfSymbolPresent(totalSectionItem.getSubtitle());
                java.lang.String title = totalSectionItem.getTitle();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(title);
                sb.append(", ");
                sb.append(removeCurrencyCodeIfSymbolPresent);
                final java.lang.String obj = sb.toString();
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                boolean changed = startRestartGroup.changed(obj);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.common.ui.TotalSectionRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.common.ui.TotalSectionRowKt.$r8$lambda$GsiU3lMQiQMJG7MGIB5m1XRImR0(obj, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier clearAndSetSemantics = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(fillMaxWidth$default, (kotlin.jvm.functions.Function1) rememberedValue);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, clearAndSetSemantics);
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
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(totalSectionItem.getTitle(), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                if (totalSectionItem.getShouldShowSubtitleIcon()) {
                    startRestartGroup.startReplaceGroup(686124848);
                    modifier4 = modifier5;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.IconKt.Icon(icon, null, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 11, null), com.paypal.pds.components.IconSize.XSmall.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, startRestartGroup, ((i3 >> 3) & 14) | 27696, 0);
                    composer2.endReplaceGroup();
                } else {
                    modifier4 = modifier5;
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(686404933);
                    composer2.endReplaceGroup();
                }
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(totalSectionItem.getSubtitle(), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                composer2.endNode();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScope = composer2.endRestartGroup();
            if (scopeUpdateScope == null) {
                function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.TotalSectionRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.wallet.common.ui.TotalSectionRowKt.m21216$r8$lambda$nejd31LeHQpRGjCbPLWEMOnulM(com.paypal.oslo.feature.wallet.common.model.TotalSectionItem.this, icon, modifier3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                };
                scopeUpdateScope.updateScope(function2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        scopeUpdateScope = composer2.endRestartGroup();
        if (scopeUpdateScope == null) {
        }
    }

    public static final java.lang.String removeCurrencyCodeIfSymbolPresent(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        for (int i = 0; i < str2.length(); i++) {
            if (getHighResolutionOutputSizeshNQ4ISI.contains(java.lang.Character.valueOf(str2.charAt(i)))) {
                return new kotlin.text.Regex("\\s+[A-Z]{3}$").replace(str2, "");
            }
        }
        return str;
    }

    /* renamed from: $r8$lambda$-nejd31LeHQpRGjCbPLWEMOnulM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21216$r8$lambda$nejd31LeHQpRGjCbPLWEMOnulM(com.paypal.oslo.feature.wallet.common.model.TotalSectionItem totalSectionItem, com.paypal.pds.core.Icon icon, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TotalSectionRow(totalSectionItem, icon, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GsiU3lMQiQMJG7MGIB5m1XRImR0(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kz9JSe9DfIcs-GqPmsp0PuNf3fc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21217$r8$lambda$kz9JSe9DfIcsGqPmsp0PuNf3fc(com.paypal.oslo.feature.wallet.common.model.TotalSectionItem totalSectionItem, com.paypal.pds.core.Icon icon, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TotalSectionRow(totalSectionItem, icon, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
