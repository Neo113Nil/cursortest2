package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\u001a(\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"DefaultMinLines", "", "heightInLines", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "minLines", "maxLines", "validateMinMaxLines", "", "foundation", "typeface", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HeightInLinesModifierKt {
    public static final int DefaultMinLines = 1;

    public static /* synthetic */ androidx.compose.ui.Modifier heightInLines$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.text.TextStyle textStyle, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 1;
        }
        if ((i3 & 4) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return heightInLines(modifier, textStyle, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier getHighSpeedVideoSizes(int i, int i2, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.runtime.Composer composer, int i3) {
        composer.startReplaceGroup(408240218);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(408240218, i3, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:62)");
        }
        validateMinMaxLines(i, i2);
        if (i == 1 && i2 == Integer.MAX_VALUE) {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return companion;
        }
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        androidx.compose.ui.text.font.FontFamily.Resolver resolver = (androidx.compose.ui.text.font.FontFamily.Resolver) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver());
        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
        boolean changed = composer.changed(textStyle);
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = layoutDirection;
        boolean changed2 = composer.changed(layoutDirection2.ordinal());
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.ui.text.TextStyleKt.resolveDefaults(textStyle, layoutDirection);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.text.TextStyle textStyle2 = (androidx.compose.ui.text.TextStyle) rememberedValue;
        boolean changed3 = composer.changed(resolver);
        boolean changed4 = composer.changed(textStyle2);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed3 | changed4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            androidx.compose.ui.text.font.FontFamily fontFamily = textStyle2.getFontFamily();
            androidx.compose.ui.text.font.FontWeight fontWeight = textStyle2.getFontWeight();
            if (fontWeight == null) {
                fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
            }
            androidx.compose.ui.text.font.FontStyle m8071getFontStyle4Lr2A7w = textStyle2.m8071getFontStyle4Lr2A7w();
            int m8155unboximpl = m8071getFontStyle4Lr2A7w != null ? m8071getFontStyle4Lr2A7w.m8155unboximpl() : androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA();
            androidx.compose.ui.text.font.FontSynthesis m8072getFontSynthesisZQGJjVo = textStyle2.m8072getFontSynthesisZQGJjVo();
            rememberedValue2 = resolver.mo8125resolveDPcqOEQ(fontFamily, fontWeight, m8155unboximpl, m8072getFontSynthesisZQGJjVo != null ? m8072getFontSynthesisZQGJjVo.m8168unboximpl() : androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m8169getAllGVVA2EU());
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.State state = (androidx.compose.runtime.State) rememberedValue2;
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(state);
        boolean changed5 = composer.changed(density);
        boolean changed6 = composer.changed(resolver);
        boolean changed7 = composer.changed(textStyle);
        boolean changed8 = composer.changed(layoutDirection2.ordinal());
        boolean changed9 = composer.changed(highResolutionOutputSizeshNQ4ISI);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if ((changed9 | changed5 | changed6 | changed7 | changed8) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = java.lang.Integer.valueOf((int) (androidx.compose.foundation.text.TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, androidx.compose.foundation.text.TextFieldDelegateKt.getEmptyTextReplacement(), 1) & 4294967295L));
            composer.updateRememberedValue(rememberedValue3);
        }
        int intValue = ((java.lang.Number) rememberedValue3).intValue();
        java.lang.Object highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(state);
        boolean changed10 = composer.changed(density);
        boolean changed11 = composer.changed(resolver);
        boolean changed12 = composer.changed(textStyle);
        boolean changed13 = composer.changed(layoutDirection2.ordinal());
        boolean changed14 = composer.changed(highResolutionOutputSizeshNQ4ISI2);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if ((changed12 | changed10 | changed11 | changed13 | changed14) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(androidx.compose.foundation.text.TextFieldDelegateKt.getEmptyTextReplacement());
            sb.append('\n');
            sb.append(androidx.compose.foundation.text.TextFieldDelegateKt.getEmptyTextReplacement());
            rememberedValue4 = java.lang.Integer.valueOf((int) (androidx.compose.foundation.text.TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, sb.toString(), 2) & 4294967295L));
            composer.updateRememberedValue(rememberedValue4);
        }
        int intValue2 = ((java.lang.Number) rememberedValue4).intValue() - intValue;
        java.lang.Integer valueOf = i == 1 ? null : java.lang.Integer.valueOf(((i - 1) * intValue2) + intValue);
        java.lang.Integer valueOf2 = i2 != Integer.MAX_VALUE ? java.lang.Integer.valueOf(intValue + (intValue2 * (i2 - 1))) : null;
        androidx.compose.ui.Modifier m1727heightInVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m1727heightInVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, valueOf != null ? density.mo1415toDpu2uoSUM(valueOf.intValue()) : androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM(), valueOf2 != null ? density.mo1415toDpu2uoSUM(valueOf2.intValue()) : androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM());
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m1727heightInVpY3zN4;
    }

    public static final void validateMinMaxLines(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("both minLines ");
            sb.append(i);
            sb.append(" and maxLines ");
            sb.append(i2);
            sb.append(" must be greater than zero");
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        if (i <= i2) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("minLines ");
        sb2.append(i);
        sb2.append(" must be less than or equal to maxLines ");
        sb2.append(i2);
        androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb2.toString());
    }

    public static final androidx.compose.ui.Modifier heightInLines(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.text.TextStyle textStyle, final int i, final int i2) {
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("heightInLines");
                inspectorInfo.getProperties().set("minLines", java.lang.Integer.valueOf(i));
                inspectorInfo.getProperties().set("maxLines", java.lang.Integer.valueOf(i2));
                inspectorInfo.getProperties().set("textStyle", textStyle);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                androidx.compose.ui.Modifier highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.text.HeightInLinesModifierKt.getHighSpeedVideoSizes(i, i2, textStyle, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                return highSpeedVideoSizes;
            }
        });
    }

    private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.State<? extends java.lang.Object> state) {
        return state.getValue();
    }
}
