package com.adobe.marketing.mobile.aepcomposeui.components;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"AepText", "", "model", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepText;", "textStyle", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepTextStyle;", "(Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepText;Lcom/adobe/marketing/mobile/aepcomposeui/style/AepTextStyle;Landroidx/compose/runtime/Composer;II)V", "AepTextComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "messaging_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AepTextKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AepText(final com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText aepText, com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle aepTextStyle, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle aepTextStyle2;
        androidx.compose.runtime.Composer composer2;
        final com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle aepTextStyle3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aepText, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1665358787);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(aepText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 16;
        }
        if (i4 != 2 || (i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
            } else if (i4 != 0) {
                aepTextStyle2 = new com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle(null, null, null, null, null, null, 63, null);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1665358787, i, -1, "com.adobe.marketing.mobile.aepcomposeui.components.AepText (AepText.kt:34)");
                }
                if (!kotlin.text.StringsKt.isBlank(aepText.getContent())) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepTextKt$AepText$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                com.adobe.marketing.mobile.aepcomposeui.components.AepTextKt.AepText(com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText.this, aepTextStyle2, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                        return;
                    }
                    return;
                }
                java.lang.String content = aepText.getContent();
                androidx.compose.ui.text.TextStyle textStyle = aepTextStyle2.getTextStyle();
                if (textStyle == null) {
                    textStyle = new androidx.compose.ui.text.TextStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, 0L, (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, (androidx.compose.ui.text.style.LineHeightStyle) null, 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 16777215, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                }
                androidx.compose.ui.text.TextStyle textStyle2 = textStyle;
                androidx.compose.ui.Modifier.Companion modifier = aepTextStyle2.getModifier();
                if (modifier == null) {
                    modifier = androidx.compose.ui.Modifier.INSTANCE;
                }
                androidx.compose.ui.Modifier modifier2 = modifier;
                androidx.compose.ui.text.style.TextOverflow overflow = aepTextStyle2.getOverflow();
                int camera2StreamConfigurationMap = overflow != null ? overflow.getCamera2StreamConfigurationMap() : androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8();
                java.lang.Boolean softWrap = aepTextStyle2.getSoftWrap();
                boolean booleanValue = softWrap != null ? softWrap.booleanValue() : true;
                java.lang.Integer maxLines = aepTextStyle2.getMaxLines();
                int intValue = maxLines != null ? maxLines.intValue() : Integer.MAX_VALUE;
                java.lang.Integer minLines = aepTextStyle2.getMinLines();
                com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle aepTextStyle4 = aepTextStyle2;
                composer2 = startRestartGroup;
                androidx.compose.material3.TextKt.m3983Text4IGK_g(content, modifier2, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, camera2StreamConfigurationMap, booleanValue, intValue, minLines != null ? minLines.intValue() : 1, (kotlin.jvm.functions.Function1) null, textStyle2, composer2, 0, 0, 34812);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                aepTextStyle3 = aepTextStyle4;
            }
            aepTextStyle2 = aepTextStyle;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            if (!kotlin.text.StringsKt.isBlank(aepText.getContent())) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            aepTextStyle3 = aepTextStyle;
            composer2 = startRestartGroup;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
        if (endRestartGroup2 == null) {
            return;
        }
        endRestartGroup2.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepTextKt$AepText$2
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                com.adobe.marketing.mobile.aepcomposeui.components.AepTextKt.AepText(com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText.this, aepTextStyle3, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
    }

    public static final void AepTextComposablePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1609124717);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1609124717, i, -1, "com.adobe.marketing.mobile.aepcomposeui.components.AepTextComposablePreview (AepText.kt:63)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f));
            startRestartGroup.startReplaceableGroup(-483455358);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m1706padding3ABfNKs);
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
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Basic Text"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Red Text"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Green Text"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Blue Text"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Invalid Color"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Left Aligned"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Center Aligned"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Right Aligned"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Invalid Alignment"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Large Text"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Small Text"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Bold Text"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Italic Text"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Bold Italic Text"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Complex Styling"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Empty String"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText(kotlin.text.StringsKt.repeat("Very Long Text ", 20)), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Special Characters: !@#$%^&*()_+{}[]|\\:;\"'<>,.?/"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Multi\nLine\nText"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Null Color"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Null Alignment"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Null Font"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Tiny Text"), null, startRestartGroup, 0, 2);
            AepText(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Huge Text"), null, startRestartGroup, 0, 2);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepTextKt$AepTextComposablePreview$2
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.adobe.marketing.mobile.aepcomposeui.components.AepTextKt.AepTextComposablePreview(composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
    }
}
