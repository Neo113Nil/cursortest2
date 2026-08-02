package com.paypal.android.threeds.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"ProgressDialogView", "", "status", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "three-ds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ProgressDialogViewKt {
    public static final void ProgressDialogView(java.lang.String str, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final java.lang.String str2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1847027053);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 6) == 0) {
            str2 = str;
            i3 = (startRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            java.lang.String str3 = i4 != 0 ? null : str2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1847027053, i3, -1, "com.paypal.android.threeds.ui.ProgressDialogView (ProgressDialogView.kt:40)");
            }
            com.paypal.android.threeds.ui.customization.UICustomization uiCustomization = com.paypal.android.threeds.init.ThreeDsService.INSTANCE.getUiCustomization();
            androidx.compose.ui.Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU(), null, 2, null), 0.8f);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth);
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
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(hashCode))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(hashCode));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11017getThree_ds_margin_24D9Ej5fM());
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(hashCode2))) {
                m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(hashCode2));
                m5299constructorimpl2.apply(java.lang.Integer.valueOf(hashCode2), setCompositeKeyHash2);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.material.ProgressIndicatorKt.m2701CircularProgressIndicatorLxG7B9w(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11019getThree_ds_margin_32D9Ej5fM()), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11022getThree_ds_margin_44D9Ej5fM()), androidx.compose.ui.graphics.Color.INSTANCE.m6026getGray0d7_KjU(), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11024getThree_ds_margin_5D9Ej5fM(), 0L, 0, startRestartGroup, 438, 24);
            androidx.compose.foundation.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.android.threeds.init.ThreeDsService.INSTANCE.getLogo(), startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.android.threeds.R.string.progress_dialog, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11013getThree_ds_margin_16D9Ej5fM(), 7, null), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11026getThree_ds_margin_56D9Ej5fM()), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11010getThree_ds_margin_128D9Ej5fM()), (androidx.compose.ui.Alignment) null, (androidx.compose.ui.layout.ContentScale) null, 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, startRestartGroup, 384, 120);
            java.lang.String str4 = str3;
            if (str4 != null && !kotlin.text.StringsKt.isBlank(str4)) {
                startRestartGroup.startReplaceGroup(1440530029);
                com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.LabelView(str3, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11013getThree_ds_margin_16D9Ej5fM()), uiCustomization.getGetHighSpeedVideoFpsRangesFor(), startRestartGroup, (i3 & 14) | 48, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1440756825);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            str2 = str3;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.ProgressDialogViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.android.threeds.ui.ProgressDialogViewKt.m10992$r8$lambda$ZuXF_xUP9Jr8N56HBZfli4sDI(str2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$ZuXF_xUP9Jr8N56-H-BZfli4sDI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10992$r8$lambda$ZuXF_xUP9Jr8N56HBZfli4sDI(java.lang.String str, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ProgressDialogView(str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
