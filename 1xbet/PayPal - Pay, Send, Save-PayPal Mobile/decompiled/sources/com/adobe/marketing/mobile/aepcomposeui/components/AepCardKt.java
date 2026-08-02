package com.adobe.marketing.mobile.aepcomposeui.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"AepCard", "", "cardStyle", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepCardStyle;", "onClick", "Lkotlin/Function0;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lcom/adobe/marketing/mobile/aepcomposeui/style/AepCardStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "messaging_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AepCardKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AepCard(com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle aepCardStyle, kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle aepCardStyle2;
        com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle aepCardStyle3;
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.ui.Modifier.Companion modifier;
        androidx.compose.ui.graphics.Shape shape;
        androidx.compose.material3.CardColors colors;
        androidx.compose.material3.CardElevation elevation;
        final com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle aepCardStyle4;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1741112006);
        int i4 = i2 & 1;
        int i5 = i4 != 0 ? i | 2 : i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 112) == 0) {
            function02 = function0;
            i5 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i5 |= 384;
            } else if ((i & 896) == 0) {
                i5 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
            }
            if (i4 == 1 || (i5 & 731) != 146 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i4 == 0) {
                        aepCardStyle2 = new com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle(null, null, null, null, null, null, 63, null);
                        i5 &= -15;
                    } else {
                        aepCardStyle2 = aepCardStyle;
                    }
                    if (i6 == 0) {
                        aepCardStyle3 = aepCardStyle2;
                        i3 = i5;
                        function03 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepCardKt$AepCard$1
                            @Override // kotlin.jvm.functions.Function0
                            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                return kotlin.Unit.INSTANCE;
                            }
                        };
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1741112006, i3, -1, "com.adobe.marketing.mobile.aepcomposeui.components.AepCard (AepCard.kt:28)");
                        }
                        modifier = aepCardStyle3.getModifier();
                        if (modifier == null) {
                            modifier = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        androidx.compose.ui.Modifier modifier2 = modifier;
                        java.lang.Boolean enabled = aepCardStyle3.getEnabled();
                        boolean booleanValue = enabled == null ? enabled.booleanValue() : true;
                        shape = aepCardStyle3.getShape();
                        startRestartGroup.startReplaceableGroup(-864021432);
                        if (shape == null) {
                            shape = androidx.compose.material3.CardDefaults.INSTANCE.getShape(startRestartGroup, androidx.compose.material3.CardDefaults.$stable);
                        }
                        androidx.compose.ui.graphics.Shape shape2 = shape;
                        startRestartGroup.endReplaceableGroup();
                        colors = aepCardStyle3.getColors();
                        startRestartGroup.startReplaceableGroup(-864021376);
                        if (colors == null) {
                            colors = androidx.compose.material3.CardDefaults.INSTANCE.cardColors(startRestartGroup, androidx.compose.material3.CardDefaults.$stable);
                        }
                        androidx.compose.material3.CardColors cardColors = colors;
                        startRestartGroup.endReplaceableGroup();
                        elevation = aepCardStyle3.getElevation();
                        startRestartGroup.startReplaceableGroup(-864021309);
                        if (elevation == null) {
                            elevation = androidx.compose.material3.CardDefaults.INSTANCE.m2973elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, androidx.compose.material3.CardDefaults.$stable << 18, 63);
                        }
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.material3.CardKt.Card(function03, modifier2, booleanValue, shape2, cardColors, elevation, aepCardStyle3.getBorder(), null, function3, startRestartGroup, ((i3 >> 3) & 14) | ((i3 << 18) & 234881024), 128);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        aepCardStyle4 = aepCardStyle3;
                        function04 = function03;
                    } else {
                        aepCardStyle3 = aepCardStyle2;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if (i4 != 0) {
                        i5 &= -15;
                    }
                    aepCardStyle3 = aepCardStyle;
                }
                i3 = i5;
                function03 = function02;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier = aepCardStyle3.getModifier();
                if (modifier == null) {
                }
                androidx.compose.ui.Modifier modifier22 = modifier;
                java.lang.Boolean enabled2 = aepCardStyle3.getEnabled();
                if (enabled2 == null) {
                }
                shape = aepCardStyle3.getShape();
                startRestartGroup.startReplaceableGroup(-864021432);
                if (shape == null) {
                }
                androidx.compose.ui.graphics.Shape shape22 = shape;
                startRestartGroup.endReplaceableGroup();
                colors = aepCardStyle3.getColors();
                startRestartGroup.startReplaceableGroup(-864021376);
                if (colors == null) {
                }
                androidx.compose.material3.CardColors cardColors2 = colors;
                startRestartGroup.endReplaceableGroup();
                elevation = aepCardStyle3.getElevation();
                startRestartGroup.startReplaceableGroup(-864021309);
                if (elevation == null) {
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.material3.CardKt.Card(function03, modifier22, booleanValue, shape22, cardColors2, elevation, aepCardStyle3.getBorder(), null, function3, startRestartGroup, ((i3 >> 3) & 14) | ((i3 << 18) & 234881024), 128);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                aepCardStyle4 = aepCardStyle3;
                function04 = function03;
            } else {
                startRestartGroup.skipToGroupEnd();
                aepCardStyle4 = aepCardStyle;
                function04 = function02;
            }
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                return;
            }
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepCardKt$AepCard$2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    com.adobe.marketing.mobile.aepcomposeui.components.AepCardKt.AepCard(com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle.this, function04, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            });
            return;
        }
        function02 = function0;
        if ((i2 & 4) == 0) {
        }
        if (i4 == 1) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i4 == 0) {
        }
        if (i6 == 0) {
        }
    }
}
