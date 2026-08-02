package com.paypal.oslo.feature.helpcenter.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u0001¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"BackButtonId", "", "TitleId", "HelpCenterHomeButtonId", "HelpCenterTopBar", "", "onBackClick", "Lkotlin/Function0;", "title", "onHomeClick", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "helpcenter_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HelpCenterTopBarKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HelpCenterTopBar(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final java.lang.String str3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1891287838);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str2 = str;
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function03 = function02;
                i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
                i5 = i3;
                if (!startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    str3 = str2;
                    function04 = function03;
                } else {
                    java.lang.String str4 = i6 != 0 ? "Help Center" : str2;
                    kotlin.jvm.functions.Function0<kotlin.Unit> function05 = i4 != 0 ? null : function03;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1891287838, i5, -1, "com.paypal.oslo.feature.helpcenter.ui.components.HelpCenterTopBar (HelpCenterTopBar.kt:52)");
                    }
                    float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f);
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2)), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 7, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                    androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 2, null);
                    com.paypal.oslo.feature.helpcenter.ui.components.HelpCenterTopBarKt$HelpCenterTopBar$1$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.oslo.feature.helpcenter.ui.components.HelpCenterTopBarKt$HelpCenterTopBar$1$1$1(m8601constructorimpl);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue;
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.ArrowLeft.INSTANCE, function0, androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, "back"), com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, com.knotapi.knot.utilities.Constants.META_BACK_BUTTON, null, false, false, startRestartGroup, ((i5 << 3) & 112) | 224646, 448);
                    com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                    int i7 = i5 >> 3;
                    java.lang.String str5 = str4;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str5, androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, "title"), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, bodyMedium, composer2, (i7 & 14) | 12779568, 6, 844);
                    if (function05 != null) {
                        composer2.startReplaceGroup(1578459354);
                        com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.Lifebuoy.INSTANCE, function05, androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, "home"), com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, "Help Center Home", null, false, false, composer2, (i7 & 112) | 224646, 448);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1578837585);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    str3 = str4;
                    function04 = function05;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.HelpCenterTopBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.helpcenter.ui.components.HelpCenterTopBarKt.m14795$r8$lambda$0IabfND43qYEFZwU8ZnGfHX9YY(kotlin.jvm.functions.Function0.this, str3, function04, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function03 = function02;
            i5 = i3;
            if (!startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str2 = str;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function03 = function02;
        i5 = i3;
        if (!startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$0IabfND43qYEFZwU8ZnGfH-X9YY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14795$r8$lambda$0IabfND43qYEFZwU8ZnGfHX9YY(kotlin.jvm.functions.Function0 function0, java.lang.String str, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        HelpCenterTopBar(function0, str, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
