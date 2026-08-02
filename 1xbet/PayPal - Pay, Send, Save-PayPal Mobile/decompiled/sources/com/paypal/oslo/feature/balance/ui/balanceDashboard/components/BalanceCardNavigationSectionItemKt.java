package com.paypal.oslo.feature.balance.ui.balanceDashboard.components;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0016"}, d2 = {"BalanceCardNavigationSectionItem", "", "title", "", "accessibilityLabel", "modifier", "Landroidx/compose/ui/Modifier;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "badgeText", "badgeStyle", "Lcom/paypal/pds/components/BadgeStyle;", "showChevron", "", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/components/BadgeStyle;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BalanceCardNavigationSectionItemBasicPreview", "(Landroidx/compose/runtime/Composer;I)V", "BalanceCardNavigationSectionItemWithPositiveBadgePreview", "BalanceCardNavigationSectionItemWithWarningBadgePreview", "BalanceCardNavigationSectionItemWithDescriptionPreview", "BalanceCardNavigationSectionItemMultiPreview", "balance_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BalanceCardNavigationSectionItemKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BalanceCardNavigationSectionItem(final java.lang.String str, final java.lang.String str2, androidx.compose.ui.Modifier modifier, java.lang.String str3, java.lang.String str4, com.paypal.pds.components.BadgeStyle badgeStyle, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        java.lang.String str5;
        int i6;
        int i7;
        int i8;
        final androidx.compose.ui.Modifier modifier2;
        final java.lang.String str6;
        final com.paypal.pds.components.BadgeStyle badgeStyle2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final java.lang.String str7;
        final boolean z2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i9;
        androidx.compose.ui.Modifier modifier3;
        java.lang.String str8;
        boolean z3;
        int i10;
        final java.lang.String str9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(560574364);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(str3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    str5 = str4;
                    i3 |= startRestartGroup.changed(str5) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(badgeStyle) ? 131072 : 65536;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(z) ? 1048576 : 524288;
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        str6 = str3;
                        badgeStyle2 = badgeStyle;
                        function02 = function0;
                        str7 = str5;
                        z2 = z;
                    } else {
                        androidx.compose.ui.Modifier modifier4 = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        androidx.compose.ui.Modifier modifier5 = null;
                        java.lang.String str10 = i4 != 0 ? null : str3;
                        java.lang.String str11 = i5 != 0 ? null : str5;
                        com.paypal.pds.components.BadgeStyle badgeStyle3 = i6 != 0 ? com.paypal.pds.components.BadgeStyle.Positive.INSTANCE : badgeStyle;
                        boolean z4 = i7 != 0 ? true : z;
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function03 = i8 != 0 ? null : function0;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(560574364, i3, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItem (BalanceCardNavigationSectionItem.kt:73)");
                        }
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_navigation_item_action_hint, startRestartGroup, 0);
                        startRestartGroup.startReplaceGroup(1841068542);
                        androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null);
                        if (function03 == null) {
                            startRestartGroup.startReplaceGroup(1359092000);
                            startRestartGroup.endReplaceGroup();
                            i9 = i3;
                            modifier3 = modifier4;
                            str8 = stringResource;
                            z3 = true;
                            i10 = 8388608;
                        } else {
                            startRestartGroup.startReplaceGroup(1359092001);
                            i9 = i3;
                            modifier3 = modifier4;
                            str8 = stringResource;
                            z3 = true;
                            i10 = 8388608;
                            modifier5 = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(m1708paddingVpY3zN4$default, null, null, false, null, null, function03, startRestartGroup, 0, 31);
                            startRestartGroup.endReplaceGroup();
                        }
                        if (modifier5 == null) {
                            modifier5 = m1708paddingVpY3zN4$default;
                        }
                        startRestartGroup.endReplaceGroup();
                        boolean z5 = (i9 & 112) == 32 ? z3 : false;
                        if ((i9 & 29360128) == i10) {
                            str9 = str8;
                        } else {
                            str9 = str8;
                            z3 = false;
                        }
                        boolean changed = startRestartGroup.changed(str9);
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((changed | z5 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt.m12158$r8$lambda$iN69OPoFZwrR6UtSHuQkjkppRM(str2, function03, str9, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.ui.Modifier clearAndSetSemantics = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(modifier5, (kotlin.jvm.functions.Function1) rememberedValue);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
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
                        androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
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
                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                        int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        kotlin.jvm.functions.Function0<kotlin.Unit> function04 = function03;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, i9 & 14, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                        if (str11 == null) {
                            startRestartGroup = startRestartGroup;
                            startRestartGroup.startReplaceGroup(-4168367);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup = startRestartGroup;
                            startRestartGroup.startReplaceGroup(-4168366);
                            com.paypal.pds.components.BadgeKt.Badge(str11, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 2, null), badgeStyle3, com.paypal.pds.components.BadgeEmphasis.Default, com.paypal.pds.components.BadgeSize.Small.INSTANCE, null, null, startRestartGroup, ((i9 >> 9) & 896) | 27648, 96);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            startRestartGroup.endReplaceGroup();
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        }
                        startRestartGroup.endNode();
                        if (str10 == null) {
                            startRestartGroup.startReplaceGroup(1985036189);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1985036190);
                            if (!kotlin.text.StringsKt.isBlank(str10)) {
                                startRestartGroup.startReplaceGroup(1338512861);
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str10, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 384, 6, 1018);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(1338696970);
                                startRestartGroup.endReplaceGroup();
                            }
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            startRestartGroup.endReplaceGroup();
                            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                        }
                        startRestartGroup.endNode();
                        if (z4) {
                            startRestartGroup.startReplaceGroup(711148437);
                            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.ChevronRight.INSTANCE, null, null, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, startRestartGroup, 24630, 12);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(711314690);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        str6 = str10;
                        str7 = str11;
                        badgeStyle2 = badgeStyle3;
                        z2 = z4;
                        modifier2 = modifier3;
                        function02 = function04;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt.$r8$lambda$gmnA3PnilGw2Yo8QiZGkfKyYY38(str, str2, modifier2, str6, str7, badgeStyle2, z2, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                str5 = str4;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            str5 = str4;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        str5 = str4;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$BZ0JVcf0_2y9XCAcxcJ-qZGmhlo, reason: not valid java name */
    public static /* synthetic */ boolean m12153$r8$lambda$BZ0JVcf0_2y9XCAcxcJqZGmhlo(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return true;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KsFN6OzcGabygdUPdgjv2fGageo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-578875182);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-578875182, updateChangedFlags, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemMultiPreview (BalanceCardNavigationSectionItem.kt:182)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8());
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_account_routing, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_account_routing, startRestartGroup, 0);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BalanceCardNavigationSectionItem(stringResource, stringResource2, null, null, null, null, false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 12582912, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_label, startRestartGroup, 0);
            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_navigation_item_auto_reload_on_label, startRestartGroup, 0);
            java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_on, startRestartGroup, 0);
            java.lang.String stringResource6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_balance_l2_auto_reload_description, startRestartGroup, 0);
            com.paypal.pds.components.BadgeStyle.Positive positive = com.paypal.pds.components.BadgeStyle.Positive.INSTANCE;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            BalanceCardNavigationSectionItem(stringResource3, stringResource4, null, stringResource6, stringResource5, positive, false, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 12779520, 68);
            java.lang.String stringResource7 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_label, startRestartGroup, 0);
            java.lang.String stringResource8 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_navigation_item_auto_reload_off_label, startRestartGroup, 0);
            java.lang.String stringResource9 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_off, startRestartGroup, 0);
            com.paypal.pds.components.BadgeStyle.Warning warning = com.paypal.pds.components.BadgeStyle.Warning.INSTANCE;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            BalanceCardNavigationSectionItem(stringResource7, stringResource8, null, null, stringResource9, warning, false, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 12779520, 76);
            java.lang.String stringResource10 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_label, startRestartGroup, 0);
            java.lang.String stringResource11 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_navigation_item_auto_reload_on_label, startRestartGroup, 0);
            java.lang.String stringResource12 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_on, startRestartGroup, 0);
            com.paypal.pds.components.BadgeStyle.Positive positive2 = com.paypal.pds.components.BadgeStyle.Positive.INSTANCE;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            BalanceCardNavigationSectionItem(stringResource10, stringResource11, null, null, stringResource12, positive2, false, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 12779520, 76);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt.$r8$lambda$KsFN6OzcGabygdUPdgjv2fGageo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Qc9sxeaEt_CATr-vZMby-vqkRCM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12156$r8$lambda$Qc9sxeaEt_CATrvZMbyvqkRCM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2122832341);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2122832341, updateChangedFlags, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemWithDescriptionPreview (BalanceCardNavigationSectionItem.kt:171)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_label, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_navigation_item_auto_reload_off_label, startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_balance_l2_auto_reload_description, startRestartGroup, 0);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BalanceCardNavigationSectionItem(stringResource, stringResource2, null, stringResource3, null, null, false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 12582912, 116);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt.m12156$r8$lambda$Qc9sxeaEt_CATrvZMbyvqkRCM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YcM5VKRTf56di_hoOjI5DMaMWeg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2050405774);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2050405774, updateChangedFlags, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemWithWarningBadgePreview (BalanceCardNavigationSectionItem.kt:159)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_label, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_navigation_item_auto_reload_off_label, startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_off, startRestartGroup, 0);
            com.paypal.pds.components.BadgeStyle.Warning warning = com.paypal.pds.components.BadgeStyle.Warning.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BalanceCardNavigationSectionItem(stringResource, stringResource2, null, null, stringResource3, warning, false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 12779520, 76);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt.$r8$lambda$YcM5VKRTf56di_hoOjI5DMaMWeg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZHcv7O0kUK7hgkdeAUglQWY-IDM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12157$r8$lambda$ZHcv7O0kUK7hgkdeAUglQWYIDM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(21407079);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(21407079, updateChangedFlags, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemWithPositiveBadgePreview (BalanceCardNavigationSectionItem.kt:147)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_label, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_navigation_item_auto_reload_on_label, startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_on, startRestartGroup, 0);
            com.paypal.pds.components.BadgeStyle.Positive positive = com.paypal.pds.components.BadgeStyle.Positive.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BalanceCardNavigationSectionItem(stringResource, stringResource2, null, null, stringResource3, positive, false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 12779520, 76);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt.m12157$r8$lambda$ZHcv7O0kUK7hgkdeAUglQWYIDM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gmnA3PnilGw2Yo8QiZGkfKyYY38(java.lang.String str, java.lang.String str2, androidx.compose.ui.Modifier modifier, java.lang.String str3, java.lang.String str4, com.paypal.pds.components.BadgeStyle badgeStyle, boolean z, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BalanceCardNavigationSectionItem(str, str2, modifier, str3, str4, badgeStyle, z, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hVWmWKVGG1V1vVpSwcfyK_Esju0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(691084157);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(691084157, updateChangedFlags, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemBasicPreview (BalanceCardNavigationSectionItem.kt:136)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_label, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_navigation_item_auto_reload_off_label, startRestartGroup, 0);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BalanceCardNavigationSectionItem(stringResource, stringResource2, null, null, null, null, true, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 14155776, 60);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt.$r8$lambda$hVWmWKVGG1V1vVpSwcfyK_Esju0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$iN69OPoFZwrR6UtS-HuQkjkppRM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12158$r8$lambda$iN69OPoFZwrR6UtSHuQkjkppRM(java.lang.String str, final kotlin.jvm.functions.Function0 function0, java.lang.String str2, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        if (function0 != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, str2, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.balance.ui.balanceDashboard.components.BalanceCardNavigationSectionItemKt.m12153$r8$lambda$BZ0JVcf0_2y9XCAcxcJqZGmhlo(kotlin.jvm.functions.Function0.this));
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
