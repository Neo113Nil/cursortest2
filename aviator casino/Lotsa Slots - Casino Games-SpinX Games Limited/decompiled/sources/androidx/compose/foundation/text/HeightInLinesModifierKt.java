package androidx.compose.foundation.text;

/* compiled from: HeightInLinesModifier.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a(\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"DefaultMinLines", "", "validateMinMaxLines", "", "minLines", com.helpshift.proactive.InAppViewConstants.MAX_LINES, "heightInLines", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "foundation_release", "typeface", ""}, k = 2, mv = {1, 8, 0}, xi = 48)
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

    public static final void validateMinMaxLines(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new java.lang.IllegalArgumentException(("both minLines " + i + " and maxLines " + i2 + " must be greater than zero").toString());
        }
        if (i <= i2) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("minLines " + i + " must be less than or equal to maxLines " + i2).toString());
    }

    public static final androidx.compose.ui.Modifier heightInLines(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.text.TextStyle textStyle, final int i, final int i2) {
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("heightInLines");
                inspectorInfo.getProperties().set("minLines", java.lang.Integer.valueOf(i));
                inspectorInfo.getProperties().set(com.helpshift.proactive.InAppViewConstants.MAX_LINES, java.lang.Integer.valueOf(i2));
                inspectorInfo.getProperties().set("textStyle", textStyle);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, int i3) {
                composer.startReplaceableGroup(408240218);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C62@2391L7,63@2452L7,64@2507L7,68@2678L96,71@2795L312,80@3135L366,96@3533L428:HeightInLinesModifier.kt#423gt5");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(408240218, i3, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
                }
                androidx.compose.foundation.text.HeightInLinesModifierKt.validateMinMaxLines(i, i2);
                if (i == 1 && i2 == Integer.MAX_VALUE) {
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceableGroup();
                    return companion;
                }
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume = composer.consume(localDensity);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.FontFamily.Resolver> localFontFamilyResolver = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume2 = composer.consume(localFontFamilyResolver);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
                androidx.compose.ui.text.font.FontFamily.Resolver resolver = (androidx.compose.ui.text.font.FontFamily.Resolver) consume2;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume3 = composer.consume(localLayoutDirection);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume3;
                androidx.compose.ui.text.TextStyle textStyle2 = textStyle;
                composer.startReplaceableGroup(511388516);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed = composer.changed(textStyle2) | composer.changed(layoutDirection);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.ui.text.TextStyleKt.resolveDefaults(textStyle2, layoutDirection);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                androidx.compose.ui.text.TextStyle textStyle3 = (androidx.compose.ui.text.TextStyle) rememberedValue;
                composer.startReplaceableGroup(511388516);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed2 = composer.changed(resolver) | composer.changed(textStyle3);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    androidx.compose.ui.text.font.FontFamily fontFamily = textStyle3.getFontFamily();
                    androidx.compose.ui.text.font.FontWeight fontWeight = textStyle3.getFontWeight();
                    if (fontWeight == null) {
                        fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
                    }
                    androidx.compose.ui.text.font.FontStyle m3996getFontStyle4Lr2A7w = textStyle3.m3996getFontStyle4Lr2A7w();
                    int m4079unboximpl = m3996getFontStyle4Lr2A7w != null ? m3996getFontStyle4Lr2A7w.m4079unboximpl() : androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA();
                    androidx.compose.ui.text.font.FontSynthesis m3997getFontSynthesisZQGJjVo = textStyle3.m3997getFontSynthesisZQGJjVo();
                    rememberedValue2 = resolver.mo4050resolveDPcqOEQ(fontFamily, fontWeight, m4079unboximpl, m3997getFontSynthesisZQGJjVo != null ? m3997getFontSynthesisZQGJjVo.getValue() : androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m4093getAllGVVA2EU());
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                androidx.compose.runtime.State state = (androidx.compose.runtime.State) rememberedValue2;
                java.lang.Object[] objArr = {density, resolver, textStyle, layoutDirection, state.getValue()};
                composer.startReplaceableGroup(-568225417);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean z = false;
                for (int i4 = 0; i4 < 5; i4++) {
                    z |= composer.changed(objArr[i4]);
                }
                java.lang.Object rememberedValue3 = composer.rememberedValue();
                if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = java.lang.Integer.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(androidx.compose.foundation.text.TextFieldDelegateKt.computeSizeForDefaultText(textStyle3, density, resolver, androidx.compose.foundation.text.TextFieldDelegateKt.getEmptyTextReplacement(), 1)));
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceableGroup();
                int intValue = ((java.lang.Number) rememberedValue3).intValue();
                java.lang.Object[] objArr2 = {density, resolver, textStyle, layoutDirection, state.getValue()};
                composer.startReplaceableGroup(-568225417);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean z2 = false;
                for (int i5 = 0; i5 < 5; i5++) {
                    z2 |= composer.changed(objArr2[i5]);
                }
                java.lang.Object rememberedValue4 = composer.rememberedValue();
                if (z2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = java.lang.Integer.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(androidx.compose.foundation.text.TextFieldDelegateKt.computeSizeForDefaultText(textStyle3, density, resolver, androidx.compose.foundation.text.TextFieldDelegateKt.getEmptyTextReplacement() + '\n' + androidx.compose.foundation.text.TextFieldDelegateKt.getEmptyTextReplacement(), 2)));
                    composer.updateRememberedValue(rememberedValue4);
                }
                composer.endReplaceableGroup();
                int intValue2 = ((java.lang.Number) rememberedValue4).intValue() - intValue;
                int i6 = i;
                java.lang.Integer valueOf = i6 == 1 ? null : java.lang.Integer.valueOf(((i6 - 1) * intValue2) + intValue);
                int i7 = i2;
                java.lang.Integer valueOf2 = i7 != Integer.MAX_VALUE ? java.lang.Integer.valueOf(intValue + (intValue2 * (i7 - 1))) : null;
                androidx.compose.ui.Modifier m604heightInVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m604heightInVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, valueOf != null ? density.mo312toDpu2uoSUM(valueOf.intValue()) : androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM(), valueOf2 != null ? density.mo312toDpu2uoSUM(valueOf2.intValue()) : androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM());
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return m604heightInVpY3zN4;
            }
        });
    }
}
