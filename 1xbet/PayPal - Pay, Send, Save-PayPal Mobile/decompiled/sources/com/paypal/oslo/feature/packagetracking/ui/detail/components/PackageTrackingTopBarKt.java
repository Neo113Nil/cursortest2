package com.paypal.oslo.feature.packagetracking.ui.detail.components;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"PackageTrackingTopBar", "", "title", "", "shouldShowBackIcon", "", "onBackClick", "Lkotlin/Function0;", "endIcon", "Lcom/paypal/pds/core/Icon;", "onEndIconClick", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/paypal/pds/core/Icon;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PackageTrackingTopBarPreview", "(Landroidx/compose/runtime/Composer;I)V", "package-tracking_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageTrackingTopBarKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PackageTrackingTopBar(final java.lang.String str, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.pds.core.Icon icon, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i5;
        com.paypal.pds.core.Icon icon2;
        int i6;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        int i7;
        final boolean z3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        final com.paypal.pds.core.Icon icon3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        float f;
        int i8;
        int i9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1495321497);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function03 = function0;
                i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    icon2 = icon;
                    i3 |= startRestartGroup.changed(icon2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function04 = function02;
                        i3 |= startRestartGroup.changedInstance(function04) ? 16384 : 8192;
                        i7 = i3;
                        if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            z3 = z2;
                            function05 = function03;
                            icon3 = icon2;
                            function06 = function04;
                        } else {
                            boolean z4 = i10 != 0 ? false : z2;
                            kotlin.jvm.functions.Function0<kotlin.Unit> function07 = i4 != 0 ? null : function03;
                            com.paypal.pds.core.Icon icon4 = i5 != 0 ? null : icon2;
                            kotlin.jvm.functions.Function0<kotlin.Unit> function08 = i6 != 0 ? null : function04;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1495321497, i7, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingTopBar (PackageTrackingTopBar.kt:42)");
                            }
                            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                            androidx.compose.ui.Modifier wrapContentHeight$default = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 5, null), null, false, 3, null);
                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), centerVertically, startRestartGroup, 54);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
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
                            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            if (function07 != null && z4) {
                                startRestartGroup.startReplaceGroup(579696780);
                                com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                                com.paypal.pds.core.Icon.ArrowLeft arrowLeft = com.paypal.pds.core.Icon.ArrowLeft.INSTANCE;
                                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(boxScopeInstance.align(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), androidx.compose.ui.Alignment.INSTANCE.getCenterStart()), com.paypal.oslo.feature.packagetracking.PTTestConstants.PACKAGE_TRACKING_TOP_BAR_BACK_BUTTON);
                                f = 0.0f;
                                i8 = i7;
                                i9 = 2;
                                com.paypal.pds.components.IconButtonKt.IconButton(arrowLeft, function07, testTag, tertiary, null, null, null, false, false, startRestartGroup, ((i7 >> 3) & 112) | 3078, 496);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                f = 0.0f;
                                i8 = i7;
                                i9 = 2;
                                startRestartGroup.startReplaceGroup(580097951);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endNode();
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 2.0f, false, 2, null), com.paypal.pds.core.ConstantsKt.getSpacing8(), f, i9, null), com.paypal.oslo.feature.packagetracking.PTTestConstants.PACKAGE_TRACKING_TOP_BAR_TITLE), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, startRestartGroup, (i8 & 14) | 12779520, 6, 844);
                            androidx.compose.ui.Modifier weight$default2 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                            startRestartGroup = startRestartGroup;
                            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2);
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
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            if (icon4 != null && function08 != null) {
                                startRestartGroup.startReplaceGroup(120693724);
                                int i11 = i8 >> 9;
                                com.paypal.pds.components.IconButtonKt.IconButton(icon4, function08, androidx.compose.ui.platform.TestTagKt.testTag(boxScopeInstance2.align(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), androidx.compose.ui.Alignment.INSTANCE.getCenterEnd()), com.paypal.oslo.feature.packagetracking.PTTestConstants.PACKAGE_TRACKING_TOP_BAR_END_BUTTON), com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, null, null, null, false, false, startRestartGroup, (i11 & 14) | 3072 | (i11 & 112), 496);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(121088168);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endNode();
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            z3 = z4;
                            function05 = function07;
                            icon3 = icon4;
                            function06 = function08;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingTopBarKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingTopBarKt.$r8$lambda$AhgDMaPeZ6c_vp3qBm43LMma54U(str, z3, function05, icon3, function06, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function04 = function02;
                    i7 = i3;
                    if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                icon2 = icon;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function04 = function02;
                i7 = i3;
                if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function03 = function0;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            icon2 = icon;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function04 = function02;
            i7 = i3;
            if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function03 = function0;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        icon2 = icon;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function04 = function02;
        i7 = i3;
        if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void PackageTrackingTopBarPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1166396457);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1166396457, i, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingTopBarPreview (PackageTrackingTopBar.kt:95)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingTopBarKt$$ExternalSyntheticLambda1
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
            com.paypal.pds.core.Icon.XMark xMark = com.paypal.pds.core.Icon.XMark.INSTANCE;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingTopBarKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PackageTrackingTopBar("Package tracking", true, function0, xMark, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 28086, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingTopBarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingTopBarKt.$r8$lambda$aTsuyhwpjWRN_uygudJGuaiIO9g(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AhgDMaPeZ6c_vp3qBm43LMma54U(java.lang.String str, boolean z, kotlin.jvm.functions.Function0 function0, com.paypal.pds.core.Icon icon, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PackageTrackingTopBar(str, z, function0, icon, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aTsuyhwpjWRN_uygudJGuaiIO9g(int i, androidx.compose.runtime.Composer composer, int i2) {
        PackageTrackingTopBarPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
