package com.paypal.oslo.feature.cryptocurrency.ui.settings.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0014"}, d2 = {"CryptoSettingsItemComponent", "", "title", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "subtitle", "badgeStatus", "Lcom/paypal/oslo/feature/cryptocurrency/ui/settings/model/CryptoSettingsBadgeStatus;", "showChevron", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/ui/settings/model/CryptoSettingsBadgeStatus;ZLandroidx/compose/runtime/Composer;II)V", "CryptoSettingsBadge", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/settings/model/CryptoSettingsBadgeStatus;Landroidx/compose/runtime/Composer;I)V", "CryptoSettingsItemWithOnBadgePreview", "(Landroidx/compose/runtime/Composer;I)V", "CryptoSettingsItemWithOffBadgePreview", "CryptoSettingsItemNoBadgePreview", "cryptocurrency_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoSettingsItemComponentKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoSettingsItemComponent(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus cryptoSettingsBadgeStatus, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str3;
        int i5;
        int i6;
        boolean z2;
        int i7;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus cryptoSettingsBadgeStatus2;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str4;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.None none = cryptoSettingsBadgeStatus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1756803526);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str3 = str2;
                i3 |= startRestartGroup.changed(str3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= (32768 & i) == 0 ? startRestartGroup.changed(none) : startRestartGroup.changedInstance(none) ? 16384 : 8192;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                    i7 = i3;
                    if (startRestartGroup.shouldExecute((74899 & i7) == 74898, i7 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        cryptoSettingsBadgeStatus2 = none;
                        modifier3 = modifier2;
                        str4 = str3;
                        z3 = z2;
                    } else {
                        androidx.compose.ui.Modifier modifier4 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        java.lang.String str5 = i4 != 0 ? null : str3;
                        if (i5 != 0) {
                            none = com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.None.INSTANCE;
                        }
                        com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus cryptoSettingsBadgeStatus3 = none;
                        boolean z4 = i6 != 0 ? true : z2;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1756803526, i7, -1, "com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemComponent (CryptoSettingsItemComponent.kt:60)");
                        }
                        androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(modifier4, null, null, false, null, null, function0, startRestartGroup, ((i7 >> 6) & 14) | ((i7 << 15) & 3670016), 31);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m22100clickable_mRqjOc);
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
                        androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null), 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
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
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, i7 & 14, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                        java.lang.String str6 = (str5 == null || kotlin.text.StringsKt.isBlank(str5)) ? null : str5;
                        if (str6 != null) {
                            composer2 = startRestartGroup;
                            composer2.startReplaceGroup(845532382);
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str6, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            composer2.endReplaceGroup();
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.startReplaceGroup(845532381);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8());
                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, centerVertically, composer2, 48);
                        int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, companion);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor4);
                        } else {
                            composer2.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        Camera2StreamConfigurationMap(cryptoSettingsBadgeStatus3, composer2, (i7 >> 12) & 14);
                        if (z4) {
                            composer2.startReplaceGroup(1147032813);
                            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.ChevronRight.INSTANCE, null, null, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, composer2, 24630, 12);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1147245194);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        composer2.endNode();
                        androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f)), 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BorderMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer2, 54, 2), composer2, 0);
                        composer2.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        cryptoSettingsBadgeStatus2 = cryptoSettingsBadgeStatus3;
                        modifier3 = modifier4;
                        str4 = str5;
                        z3 = z4;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemComponentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemComponentKt.$r8$lambda$GpybQEMRcQeLibz3pPNUehHTFek(str, function0, modifier3, str4, cryptoSettingsBadgeStatus2, z3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                z2 = z;
                i7 = i3;
                if (startRestartGroup.shouldExecute((74899 & i7) == 74898, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str3 = str2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            z2 = z;
            i7 = i3;
            if (startRestartGroup.shouldExecute((74899 & i7) == 74898, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str3 = str2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        z2 = z;
        i7 = i3;
        if (startRestartGroup.shouldExecute((74899 & i7) == 74898, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus cryptoSettingsBadgeStatus, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1507195688);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(cryptoSettingsBadgeStatus) : startRestartGroup.changedInstance(cryptoSettingsBadgeStatus) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1507195688, i2, -1, "com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsBadge (CryptoSettingsItemComponent.kt:114)");
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(cryptoSettingsBadgeStatus, com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.On.INSTANCE)) {
                startRestartGroup.startReplaceGroup(1278764327);
                com.paypal.pds.components.BadgeKt.Badge(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_status_on, startRestartGroup, 0), null, com.paypal.pds.components.BadgeStyle.Positive.INSTANCE, null, null, null, null, startRestartGroup, 384, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
                startRestartGroup.endReplaceGroup();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(cryptoSettingsBadgeStatus, com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.Off.INSTANCE)) {
                startRestartGroup.startReplaceGroup(1278983559);
                com.paypal.pds.components.BadgeKt.Badge(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_status_off, startRestartGroup, 0), null, com.paypal.pds.components.BadgeStyle.Warning.INSTANCE, null, null, null, null, startRestartGroup, 384, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
                startRestartGroup.endReplaceGroup();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(cryptoSettingsBadgeStatus, com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.None.INSTANCE)) {
                startRestartGroup.startReplaceGroup(1279199629);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1011080211);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemComponentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemComponentKt.m14083$r8$lambda$lsasQJqy7acfOfusYUhqqrzvgc(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GpybQEMRcQeLibz3pPNUehHTFek(java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus cryptoSettingsBadgeStatus, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CryptoSettingsItemComponent(str, function0, modifier, str2, cryptoSettingsBadgeStatus, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aHNB6QL5xudtHwGhWf0yiaNHCy8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(828666473);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(828666473, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemWithOnBadgePreview (CryptoSettingsItemComponent.kt:137)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.On on = com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.On.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemComponentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CryptoSettingsItemComponent("Recurring purchases", (kotlin.jvm.functions.Function0) rememberedValue, null, "Bitcoin, Ethereum + 2 more", on, false, startRestartGroup, 27702, 36);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemComponentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemComponentKt.$r8$lambda$aHNB6QL5xudtHwGhWf0yiaNHCy8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bmRAUdlFw3OTRxkG5Oj3QF5x2Tg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1518860955);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1518860955, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemNoBadgePreview (CryptoSettingsItemComponent.kt:164)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.None none = com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.None.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemComponentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CryptoSettingsItemComponent("Address book", (kotlin.jvm.functions.Function0) rememberedValue, null, null, none, false, startRestartGroup, 24630, 44);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemComponentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemComponentKt.$r8$lambda$bmRAUdlFw3OTRxkG5Oj3QF5x2Tg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lsasQJqy7acfOfusYU-hqqrzvgc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14083$r8$lambda$lsasQJqy7acfOfusYUhqqrzvgc(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus cryptoSettingsBadgeStatus, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(cryptoSettingsBadgeStatus, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xjjSUTkPEOTRg_NvxWpDuGGWIvI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1727977213);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1727977213, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemWithOffBadgePreview (CryptoSettingsItemComponent.kt:151)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.Off off = com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.Off.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemComponentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CryptoSettingsItemComponent("Price alerts", (kotlin.jvm.functions.Function0) rememberedValue, null, null, off, false, startRestartGroup, 24630, 44);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemComponentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.settings.components.CryptoSettingsItemComponentKt.$r8$lambda$xjjSUTkPEOTRg_NvxWpDuGGWIvI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
