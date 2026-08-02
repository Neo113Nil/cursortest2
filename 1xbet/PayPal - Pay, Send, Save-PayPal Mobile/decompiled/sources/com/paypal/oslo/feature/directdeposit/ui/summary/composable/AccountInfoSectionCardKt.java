package com.paypal.oslo.feature.directdeposit.ui.summary.composable;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ak\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0013"}, d2 = {"AccountInfoSectionCard", "", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, "", "routingNumber", "isAccountNumberVisible", "", "maskedAccountNumber", "onCopyAccountClick", "Lkotlin/Function0;", "onCopyRoutingClick", "onToggleVisibility", "modifier", "Landroidx/compose/ui/Modifier;", "isLoading", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "AccountRoutingCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "AccountRoutingCardVisiblePreview", "directdeposit_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountInfoSectionCardKt {
    /* JADX WARN: Removed duplicated region for block: B:116:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountInfoSectionCard(final java.lang.String str, final java.lang.String str2, final boolean z, final java.lang.String str3, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.ui.Modifier modifier, boolean z2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z3;
        androidx.compose.runtime.Composer composer2;
        final boolean z4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String formatNumber;
        java.lang.String stringResource;
        com.paypal.pds.core.Icon.View view;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1458923553);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 1048576 : 524288;
        }
        int i5 = i2 & 128;
        if (i5 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            i4 = i2 & 256;
            if (i4 == 0) {
                i3 |= 100663296;
            } else if ((100663296 & i) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 67108864 : 33554432;
                if (!startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    z4 = z3;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    boolean z5 = i4 != 0 ? false : z3;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1458923553, i3, -1, "com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountInfoSectionCard (AccountInfoSectionCard.kt:60)");
                    }
                    int i6 = i3;
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16())), androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f), com.paypal.pds.core.Color.BorderBase.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 432, 0), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.pds.core.ConstantsKt.getSpacing16()), "directDepositScreenInfoCard");
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 48);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                    androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_account_number_label, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenAccountSectionLabel"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
                    if (z5) {
                        startRestartGroup.startReplaceGroup(-1263680773);
                        com.paypal.pds.components.ShimmerKt.Shimmer((com.paypal.pds.components.ShimmerStyle) com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, true, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenAccountSectionValue"), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) com.paypal.oslo.feature.directdeposit.ui.summary.composable.ComposableSingletons$AccountInfoSectionCardKt.INSTANCE.m14746getLambda$719019455$directdeposit_prodRelease(), startRestartGroup, 3510, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1263061982);
                        if (z) {
                            formatNumber = com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountNumberFormatter.INSTANCE.formatNumber(str);
                        } else {
                            formatNumber = com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountNumberFormatter.INSTANCE.formatNumber(str3);
                        }
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(formatNumber, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenAccountSectionValue"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
                        startRestartGroup.endReplaceGroup();
                    }
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                    com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                    com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
                    if (z) {
                        startRestartGroup.startReplaceGroup(-1262202631);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_account_hide_button, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1262075655);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_account_show_button, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (z) {
                        view = com.paypal.pds.core.Icon.Hide.INSTANCE;
                    } else {
                        view = com.paypal.pds.core.Icon.View.INSTANCE;
                    }
                    com.paypal.pds.components.ButtonKt.Button(function03, stringResource, androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f), com.paypal.pds.core.Color.BorderBase.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 438, 0), "directDepositScreenAccountSectionVisibilityToggle"), view, null, tertiary, small, false, false, startRestartGroup, ((i6 >> 18) & 14) | 1769472, 400);
                    startRestartGroup.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                    com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_account_copy_button, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenAccountSectionCopyButton"), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, false, false, startRestartGroup, ((i6 >> 12) & 14) | 1769856, 408);
                    startRestartGroup.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 48);
                    int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor4);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.ui.Modifier weight$default2 = androidx.compose.foundation.layout.RowScope.weight$default(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode5 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor5);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl5, java.lang.Integer.valueOf(hashCode5), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_account_routing_label, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenRoutingSectionLabel"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
                    if (z5) {
                        startRestartGroup.startReplaceGroup(-1386760686);
                        com.paypal.pds.components.ShimmerKt.Shimmer((com.paypal.pds.components.ShimmerStyle) com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, true, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenRoutingSectionValue"), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) com.paypal.oslo.feature.directdeposit.ui.summary.composable.ComposableSingletons$AccountInfoSectionCardKt.INSTANCE.getLambda$1794937322$directdeposit_prodRelease(), startRestartGroup, 3510, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1386128410);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.directdeposit.ui.summary.composable.RoutingNumberFormatter.INSTANCE.formatRoutingNumber(str2), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenRoutingSectionValue"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                    com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_account_copy_button, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenRoutingSectionCopyButton"), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, false, false, startRestartGroup, ((i6 >> 15) & 14) | 1769856, 408);
                    startRestartGroup.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_account_caption, startRestartGroup, 0);
                    com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenDisclaimerLabel"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, bodyMedium, composer2, 432, 6, 1016);
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z5;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountInfoSectionCardKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountInfoSectionCardKt.$r8$lambda$kvz8akD4BEo1Czznie5baj7aZ9E(str, str2, z, str3, function0, function02, function03, modifier2, z4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z3 = z2;
            if (!startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 256;
        if (i4 == 0) {
        }
        z3 = z2;
        if (!startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1QmvTtHiv937AygtQlqvYtk1pqk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(375041460);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(375041460, updateChangedFlags, -1, "com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountRoutingCardVisiblePreview (AccountInfoSectionCard.kt:233)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountInfoSectionCardKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountInfoSectionCardKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountInfoSectionCardKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            AccountInfoSectionCard("1234567890", "021000021", true, "••••••7890", function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, null, false, startRestartGroup, 1797558, 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountInfoSectionCardKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountInfoSectionCardKt.$r8$lambda$1QmvTtHiv937AygtQlqvYtk1pqk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CKl7oHCIC82ulWnK7LrPUApQlL8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1460604592);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1460604592, updateChangedFlags, -1, "com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountRoutingCardPreview (AccountInfoSectionCard.kt:217)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountInfoSectionCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountInfoSectionCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountInfoSectionCardKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            AccountInfoSectionCard("1234567890", "021000021", false, "••••••7890", function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, null, false, startRestartGroup, 1797558, 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountInfoSectionCardKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountInfoSectionCardKt.$r8$lambda$CKl7oHCIC82ulWnK7LrPUApQlL8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kvz8akD4BEo1Czznie5baj7aZ9E(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, androidx.compose.ui.Modifier modifier, boolean z2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AccountInfoSectionCard(str, str2, z, str3, function0, function02, function03, modifier, z2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
