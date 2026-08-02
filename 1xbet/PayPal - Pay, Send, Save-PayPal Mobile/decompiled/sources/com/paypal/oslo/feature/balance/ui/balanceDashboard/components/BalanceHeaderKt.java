package com.paypal.oslo.feature.balance.ui.balanceDashboard.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"BalanceHeader", "", "isEstimated", "", "formattedBalance", "", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLjava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "balance_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BalanceHeaderKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BalanceHeader(final boolean z, final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(234031049);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
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
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(234031049, i3, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceHeader (BalanceHeader.kt:41)");
                }
                if (z) {
                    startRestartGroup.startReplaceGroup(1287213423);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_estimated_balance, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1287292783);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_available_balance, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                boolean changed = startRestartGroup.changed(stringResource);
                boolean z2 = (i3 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changed | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(stringResource);
                    sb.append(" ");
                    sb.append(str);
                    rememberedValue = sb.toString();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final java.lang.String str2 = (java.lang.String) rememberedValue;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier4, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.BalanceCard.HEADER);
                boolean changed2 = startRestartGroup.changed(str2);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceHeaderKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceHeaderKt.$r8$lambda$kbNodZK5JM7G8Z3aOME2ZLR4sGM(str2, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.ui.Modifier clearAndSetSemantics = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(testTag, (kotlin.jvm.functions.Function1) rememberedValue2);
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
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                androidx.compose.ui.Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 1, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, ((i3 >> 3) & 14) | 12583296, 6, 890);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceHeaderKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceHeaderKt.$r8$lambda$VfW_uakY5_u9ouwxZnrlQFwkbUk(z, str, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$VfW_uakY5_u9ouwxZnrlQFwkbUk(boolean z, java.lang.String str, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BalanceHeader(z, str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kbNodZK5JM7G8Z3aOME2ZLR4sGM(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }
}
