package com.adobe.marketing.mobile.aepcomposeui.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"AepButton", "", "model", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepButton;", "onClick", "Lkotlin/Function0;", "buttonStyle", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepButtonStyle;", "(Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepButton;Lkotlin/jvm/functions/Function0;Lcom/adobe/marketing/mobile/aepcomposeui/style/AepButtonStyle;Landroidx/compose/runtime/Composer;II)V", "AepButtonComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "messaging_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AepButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AepButton(final com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton aepButton, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.adobe.marketing.mobile.aepcomposeui.style.AepButtonStyle aepButtonStyle, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final com.adobe.marketing.mobile.aepcomposeui.style.AepButtonStyle aepButtonStyle2;
        androidx.compose.ui.Modifier.Companion modifier;
        androidx.compose.ui.graphics.Shape shape;
        androidx.compose.material3.ButtonColors colors;
        androidx.compose.material3.ButtonElevation elevation;
        androidx.compose.foundation.layout.PaddingValues contentPadding;
        androidx.compose.foundation.interaction.MutableInteractionSource interactionSource;
        androidx.compose.runtime.Composer composer2;
        final com.adobe.marketing.mobile.aepcomposeui.style.AepButtonStyle aepButtonStyle3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aepButton, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1500280925);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (startRestartGroup.changed(aepButton) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 128;
        }
        if (i5 != 4 || (i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if (i5 != 0) {
                    i3 &= -897;
                }
            } else if (i5 != 0) {
                i4 = i3 & (-897);
                aepButtonStyle2 = new com.adobe.marketing.mobile.aepcomposeui.style.AepButtonStyle(null, null, null, null, null, null, null, null, null, 511, null);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1500280925, i4, -1, "com.adobe.marketing.mobile.aepcomposeui.components.AepButton (AepButton.kt:33)");
                }
                modifier = aepButtonStyle2.getModifier();
                if (modifier == null) {
                    modifier = androidx.compose.ui.Modifier.INSTANCE;
                }
                java.lang.Boolean enabled = aepButtonStyle2.getEnabled();
                boolean booleanValue = enabled == null ? enabled.booleanValue() : true;
                shape = aepButtonStyle2.getShape();
                startRestartGroup.startReplaceableGroup(-1709876809);
                if (shape == null) {
                    shape = androidx.compose.material3.ButtonDefaults.INSTANCE.getShape(startRestartGroup, androidx.compose.material3.ButtonDefaults.$stable);
                }
                androidx.compose.ui.graphics.Shape shape2 = shape;
                startRestartGroup.endReplaceableGroup();
                colors = aepButtonStyle2.getColors();
                startRestartGroup.startReplaceableGroup(-1709876749);
                if (colors == null) {
                    colors = androidx.compose.material3.ButtonDefaults.INSTANCE.buttonColors(startRestartGroup, androidx.compose.material3.ButtonDefaults.$stable);
                }
                androidx.compose.material3.ButtonColors buttonColors = colors;
                startRestartGroup.endReplaceableGroup();
                elevation = aepButtonStyle2.getElevation();
                startRestartGroup.startReplaceableGroup(-1709876676);
                if (elevation == null) {
                    elevation = androidx.compose.material3.ButtonDefaults.INSTANCE.m2949buttonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, androidx.compose.material3.ButtonDefaults.$stable << 15, 31);
                }
                androidx.compose.material3.ButtonElevation buttonElevation = elevation;
                startRestartGroup.endReplaceableGroup();
                androidx.compose.foundation.BorderStroke border = aepButtonStyle2.getBorder();
                contentPadding = aepButtonStyle2.getContentPadding();
                if (contentPadding == null) {
                    contentPadding = androidx.compose.material3.ButtonDefaults.INSTANCE.getContentPadding();
                }
                androidx.compose.foundation.layout.PaddingValues paddingValues = contentPadding;
                interactionSource = aepButtonStyle2.getInteractionSource();
                startRestartGroup.startReplaceableGroup(-1709876466);
                if (interactionSource == null) {
                    startRestartGroup.startReplaceableGroup(-492369756);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    interactionSource = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.ui.Modifier modifier2 = modifier;
                boolean z = booleanValue;
                com.adobe.marketing.mobile.aepcomposeui.style.AepButtonStyle aepButtonStyle4 = aepButtonStyle2;
                composer2 = startRestartGroup;
                androidx.compose.material3.ButtonKt.Button(function0, modifier2, z, shape2, buttonColors, buttonElevation, border, paddingValues, interactionSource, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 900408941, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepButtonKt$AepButton$2
                    @Override // kotlin.jvm.functions.Function3
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                        androidx.compose.runtime.Composer composer4 = composer3;
                        int intValue = num.intValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rowScope, "");
                        if ((intValue & 81) != 16 || !composer4.getSkipping()) {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(900408941, intValue, -1, "com.adobe.marketing.mobile.aepcomposeui.components.AepButton.<anonymous> (AepButton.kt:48)");
                            }
                            com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText text = com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton.this.getText();
                            com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle textStyle = aepButtonStyle2.getTextStyle();
                            if (textStyle == null) {
                                textStyle = new com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle(null, null, null, null, null, null, 63, null);
                            }
                            com.adobe.marketing.mobile.aepcomposeui.components.AepTextKt.AepText(text, textStyle, composer4, 64, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer4.skipToGroupEnd();
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }
                }), startRestartGroup, ((i4 >> 3) & 14) | 805306368, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                aepButtonStyle3 = aepButtonStyle4;
            }
            aepButtonStyle2 = aepButtonStyle;
            i4 = i3;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            modifier = aepButtonStyle2.getModifier();
            if (modifier == null) {
            }
            java.lang.Boolean enabled2 = aepButtonStyle2.getEnabled();
            if (enabled2 == null) {
            }
            shape = aepButtonStyle2.getShape();
            startRestartGroup.startReplaceableGroup(-1709876809);
            if (shape == null) {
            }
            androidx.compose.ui.graphics.Shape shape22 = shape;
            startRestartGroup.endReplaceableGroup();
            colors = aepButtonStyle2.getColors();
            startRestartGroup.startReplaceableGroup(-1709876749);
            if (colors == null) {
            }
            androidx.compose.material3.ButtonColors buttonColors2 = colors;
            startRestartGroup.endReplaceableGroup();
            elevation = aepButtonStyle2.getElevation();
            startRestartGroup.startReplaceableGroup(-1709876676);
            if (elevation == null) {
            }
            androidx.compose.material3.ButtonElevation buttonElevation2 = elevation;
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.BorderStroke border2 = aepButtonStyle2.getBorder();
            contentPadding = aepButtonStyle2.getContentPadding();
            if (contentPadding == null) {
            }
            androidx.compose.foundation.layout.PaddingValues paddingValues2 = contentPadding;
            interactionSource = aepButtonStyle2.getInteractionSource();
            startRestartGroup.startReplaceableGroup(-1709876466);
            if (interactionSource == null) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.Modifier modifier22 = modifier;
            boolean z2 = booleanValue;
            com.adobe.marketing.mobile.aepcomposeui.style.AepButtonStyle aepButtonStyle42 = aepButtonStyle2;
            composer2 = startRestartGroup;
            androidx.compose.material3.ButtonKt.Button(function0, modifier22, z2, shape22, buttonColors2, buttonElevation2, border2, paddingValues2, interactionSource, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 900408941, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepButtonKt$AepButton$2
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue = num.intValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rowScope, "");
                    if ((intValue & 81) != 16 || !composer4.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(900408941, intValue, -1, "com.adobe.marketing.mobile.aepcomposeui.components.AepButton.<anonymous> (AepButton.kt:48)");
                        }
                        com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText text = com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton.this.getText();
                        com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle textStyle = aepButtonStyle2.getTextStyle();
                        if (textStyle == null) {
                            textStyle = new com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle(null, null, null, null, null, null, 63, null);
                        }
                        com.adobe.marketing.mobile.aepcomposeui.components.AepTextKt.AepText(text, textStyle, composer4, 64, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer4.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }
            }), startRestartGroup, ((i4 >> 3) & 14) | 805306368, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            aepButtonStyle3 = aepButtonStyle42;
        } else {
            startRestartGroup.skipToGroupEnd();
            aepButtonStyle3 = aepButtonStyle;
            composer2 = startRestartGroup;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepButtonKt$AepButton$3
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                com.adobe.marketing.mobile.aepcomposeui.components.AepButtonKt.AepButton(com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton.this, function0, aepButtonStyle3, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
    }

    public static final void AepButtonComposablePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(955666701);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(955666701, i, -1, "com.adobe.marketing.mobile.aepcomposeui.components.AepButtonComposablePreview (AepButton.kt:63)");
            }
            AepButton(new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton("button1", "https://www.adobe.com", new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText("Click Me")), new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepButtonKt$AepButtonComposablePreview$1
                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    return kotlin.Unit.INSTANCE;
                }
            }, null, startRestartGroup, 48, 4);
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
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepButtonKt$AepButtonComposablePreview$2
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.adobe.marketing.mobile.aepcomposeui.components.AepButtonKt.AepButtonComposablePreview(composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
    }
}
