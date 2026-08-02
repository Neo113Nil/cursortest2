package com.paypal.oslo.feature.wallet.common.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0002\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u0012\u001a\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0015\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u0012\u001a\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"TestTagFundingInstrumentRoot", "", "TestTagFundingInstrumentName", "TestTagFundingInstrumentSecondaryText", "TestTagFundingInstrumentTrailingLabel", "TestTagFundingInstrumentMessage", "TestTagFundingInstrumentFallbackIcon", "FundingInstrumentRow", "", "fundingInstrumentUiModel", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;", "modifier", "Landroidx/compose/ui/Modifier;", "isInteractive", "", "contentDescriptionPrefix", "(Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "getSecondaryTextForFi", "(Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "getAccessibleSecondaryTextForFi", "getTransferSpeedText", "fi", "FundingInstrumentFallbackIcon", "type", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "(Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FundingInstrumentPreview", "(Landroidx/compose/runtime/Composer;I)V", "FundingInstrumentWithLimitPreview", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FundingInstrumentRowKt {
    public static final java.lang.String TestTagFundingInstrumentFallbackIcon = "funding_instrument_fallback_icon";
    public static final java.lang.String TestTagFundingInstrumentMessage = "funding_instrument_message";
    public static final java.lang.String TestTagFundingInstrumentName = "funding_instrument_name";
    public static final java.lang.String TestTagFundingInstrumentRoot = "funding_instrument_row_root";
    public static final java.lang.String TestTagFundingInstrumentSecondaryText = "funding_instrument_secondary_text";
    public static final java.lang.String TestTagFundingInstrumentTrailingLabel = "funding_instrument_trailing_label";

    /* JADX WARN: Removed duplicated region for block: B:104:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FundingInstrumentRow(final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.ui.Modifier modifier, boolean z, java.lang.String str, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        java.lang.String str2;
        androidx.compose.ui.Modifier.Companion companion;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1883268618);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(fundingInstrumentUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    str2 = str;
                    i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                    if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        z3 = z2;
                    } else {
                        companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        final boolean z4 = i4 != 0 ? true : z2;
                        kotlin.Unit unit = null;
                        java.lang.String str3 = i5 != 0 ? null : str2;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1883268618, i3, -1, "com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentRow (FundingInstrumentRow.kt:94)");
                        }
                        int i7 = i3 & 14;
                        java.lang.String secondaryTextForFi = getSecondaryTextForFi(fundingInstrumentUiModel, startRestartGroup, i7);
                        final java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{str3, fundingInstrumentUiModel.getName(), getAccessibleSecondaryTextForFi(fundingInstrumentUiModel)}), ", ", null, null, 0, null, null, 62, null);
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(companion, TestTagFundingInstrumentRoot);
                        boolean changed = startRestartGroup.changed(joinToString$default);
                        boolean z5 = (i3 & 896) == 256;
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((changed | z5) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentRowKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentRowKt.$r8$lambda$9oq6oadFMw7ZA3pNYvF_U6mGTYk(joinToString$default, z4, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.ui.Modifier clearAndSetSemantics = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(testTag, (kotlin.jvm.functions.Function1) rememberedValue);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 48);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        if (fundingInstrumentUiModel.getThumbnail() != null) {
                            startRestartGroup.startReplaceGroup(554510522);
                            com.paypal.oslo.feature.wallet.common.ui.CardImageKt.CardImage(fundingInstrumentUiModel.getThumbnail(), "", (androidx.compose.ui.Modifier) null, startRestartGroup, 48, 4);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(554688741);
                            FundingInstrumentFallbackIcon(fundingInstrumentUiModel.getType(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagFundingInstrumentFallbackIcon), startRestartGroup, 48, 0);
                            startRestartGroup.endReplaceGroup();
                        }
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                        androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
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
                        java.lang.String name2 = fundingInstrumentUiModel.getName();
                        com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                        java.lang.String str4 = str3;
                        boolean z6 = z4;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(name2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagFundingInstrumentName), null, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 2, 0, null, bodyMedium, startRestartGroup, 12779568, 6, 860);
                        if (secondaryTextForFi == null) {
                            startRestartGroup.startReplaceGroup(-2136156132);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-2136156131);
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(secondaryTextForFi, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagFundingInstrumentSecondaryText), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 2, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 12779952, 6, 856);
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            startRestartGroup.endReplaceGroup();
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        }
                        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage message = fundingInstrumentUiModel.getMessage();
                        if (message == null) {
                            startRestartGroup.startReplaceGroup(-2135696154);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-2135696153);
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.wallet.common.ui.UiTextKt.asString(message.getText(), startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagFundingInstrumentMessage), com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 432, 6, 1016);
                            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                            startRestartGroup.endReplaceGroup();
                            unit = kotlin.Unit.INSTANCE;
                        }
                        if (unit == null) {
                            startRestartGroup.startReplaceGroup(-2135349604);
                            if (fundingInstrumentUiModel.getTrailingLabel() == null) {
                                startRestartGroup.startReplaceGroup(275783534);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(275783535);
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(getTransferSpeedText(fundingInstrumentUiModel, startRestartGroup, i7), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagFundingInstrumentTrailingLabel), com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 432, 6, 1016);
                                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                startRestartGroup.endReplaceGroup();
                                kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                            }
                            kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-761630655);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endNode();
                        startRestartGroup.endNode();
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        str2 = str4;
                        z3 = z6;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = companion;
                        final java.lang.String str5 = str2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentRowKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentRowKt.$r8$lambda$VOlRYGfCxEy4ZOckLsGZGzgQxdk(com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel.this, modifier3, z3, str5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                str2 = str;
                if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str2 = str;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str2 = str;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final java.lang.String getSecondaryTextForFi(com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(702467184, i, -1, "com.paypal.oslo.feature.wallet.common.ui.getSecondaryTextForFi (FundingInstrumentRow.kt:177)");
        }
        switch (com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentRowKt.WhenMappings.$EnumSwitchMapping$0[fundingInstrumentUiModel.getSubType().ordinal()]) {
            case 1:
                composer.startReplaceGroup(761104409);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_credit_masked, new java.lang.Object[]{fundingInstrumentUiModel.getLastNChars()}, composer, 0);
                composer.endReplaceGroup();
                break;
            case 2:
                composer.startReplaceGroup(761110200);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_debit_masked, new java.lang.Object[]{fundingInstrumentUiModel.getLastNChars()}, composer, 0);
                composer.endReplaceGroup();
                break;
            case 3:
                composer.startReplaceGroup(761115927);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_card_masked, new java.lang.Object[]{fundingInstrumentUiModel.getLastNChars()}, composer, 0);
                composer.endReplaceGroup();
                break;
            case 4:
                composer.startReplaceGroup(761121760);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_checking_bank_masked, new java.lang.Object[]{fundingInstrumentUiModel.getLastNChars()}, composer, 0);
                composer.endReplaceGroup();
                break;
            case 5:
                composer.startReplaceGroup(761127839);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_savings_bank_masked, new java.lang.Object[]{fundingInstrumentUiModel.getLastNChars()}, composer, 0);
                composer.endReplaceGroup();
                break;
            case 6:
                composer.startReplaceGroup(761133783);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_bank_masked, new java.lang.Object[]{fundingInstrumentUiModel.getLastNChars()}, composer, 0);
                composer.endReplaceGroup();
                break;
            default:
                composer.startReplaceGroup(2120458509);
                composer.endReplaceGroup();
                stringResource = null;
                break;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final java.lang.String getAccessibleSecondaryTextForFi(com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        switch (com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentRowKt.WhenMappings.$EnumSwitchMapping$0[fundingInstrumentUiModel.getSubType().ordinal()]) {
            case 1:
                str = "Credit";
                break;
            case 2:
                str = "Debit";
                break;
            case 3:
                str = com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD;
                break;
            case 4:
                str = "Checking";
                break;
            case 5:
                str = com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_SAVINGS;
                break;
            case 6:
                str = "Bank";
                break;
            default:
                str = null;
                break;
        }
        if (str == null) {
            return null;
        }
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.text.StringsKt.toList(fundingInstrumentUiModel.getLastNChars()), " ", null, null, 0, null, null, 62, null);
        if (kotlin.text.StringsKt.isBlank(joinToString$default)) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" ending in ");
        sb.append(joinToString$default);
        return sb.toString();
    }

    public static final java.lang.String getTransferSpeedText(com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-290411298, i, -1, "com.paypal.oslo.feature.wallet.common.ui.getTransferSpeedText (FundingInstrumentRow.kt:243)");
        }
        int i2 = com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentRowKt.WhenMappings.$EnumSwitchMapping$1[fundingInstrumentUiModel.getTransferSpeed().ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(87621273);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_speed_standard, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceGroup(87619511);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(87624248);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_speed_instant, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final void FundingInstrumentFallbackIcon(final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(580514957);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(fundingInstrumentType.ordinal()) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(580514957, i3, -1, "com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentFallbackIcon (FundingInstrumentRow.kt:257)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(modifier, com.paypal.pds.core.ConstantsKt.getSize48(), com.paypal.pds.core.ConstantsKt.getSize32()), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4())), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            if (fundingInstrumentType == com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.BANK) {
                startRestartGroup.startReplaceGroup(-1758647568);
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Bank.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_fallback_icon_content_description, startRestartGroup, 0), null, null, null, startRestartGroup, 6, 28);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1758447184);
                androidx.compose.foundation.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_card_fallback_icon, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_fallback_icon_content_description, startRestartGroup, 0), boxScopeInstance.matchParentSize(androidx.compose.ui.Modifier.INSTANCE), (androidx.compose.ui.Alignment) null, androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | 24576, 104);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentRowKt.$r8$lambda$WaFiqb7SjIrPJNVADXSAVf602jc(com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9oq6oadFMw7ZA3pNYvF_U6mGTYk(java.lang.String str, boolean z, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        if (z) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PrdwJy1AUlEqjIUZvhqoNJA-qVA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21211$r8$lambda$PrdwJy1AUlEqjIUZvhqoNJAqVA(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel copy;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-402389645);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-402389645, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentPreview (FundingInstrumentRow.kt:287)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
            copy = r11.copy((r30 & 1) != 0 ? r11.planId : null, (r30 & 2) != 0 ? r11.id : null, (r30 & 4) != 0 ? r11.thumbnail : null, (r30 & 8) != 0 ? r11.type : com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.CARD, (r30 & 16) != 0 ? r11.subType : null, (r30 & 32) != 0 ? r11.name : null, (r30 & 64) != 0 ? r11.secondaryText : null, (r30 & 128) != 0 ? r11.trailingLabel : null, (r30 & 256) != 0 ? r11.message : null, (r30 & 512) != 0 ? r11.lastNChars : null, (r30 & 1024) != 0 ? r11.transferSpeed : null, (r30 & 2048) != 0 ? r11.fee : null, (r30 & 4096) != 0 ? r11.maxLimit : null, (r30 & 8192) != 0 ? com.paypal.oslo.feature.wallet.common.model.PreviewData.INSTANCE.getSampleFundingInstrumentUiModel().isPreferred : null);
            FundingInstrumentRow(copy, m1706padding3ABfNKs, false, null, startRestartGroup, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentRowKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentRowKt.m21211$r8$lambda$PrdwJy1AUlEqjIUZvhqoNJAqVA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VOlRYGfCxEy4ZOckLsGZGzgQxdk(com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.ui.Modifier modifier, boolean z, java.lang.String str, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FundingInstrumentRow(fundingInstrumentUiModel, modifier, z, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WaFiqb7SjIrPJNVADXSAVf602jc(com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FundingInstrumentFallbackIcon(fundingInstrumentType, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jW-qandoISw8rwLAAyzGqGBFNIk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21212$r8$lambda$jWqandoISw8rwLAAyzGqGBFNIk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1775351862);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1775351862, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentWithLimitPreview (FundingInstrumentRow.kt:302)");
            }
            FundingInstrumentRow(com.paypal.oslo.feature.wallet.common.model.PreviewData.INSTANCE.getSampleFundingInstrumentUiModel(), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), false, null, startRestartGroup, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentRowKt.m21212$r8$lambda$jWqandoISw8rwLAAyzGqGBFNIk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType.CREDIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType.DEBIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType.CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType.CHECKING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType.SAVINGS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType.BANK.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.values().length];
            try {
                iArr2[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.STANDARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.INSTANT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
