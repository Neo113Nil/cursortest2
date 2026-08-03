package androidx.compose.ui.text.platform.extensions;

/* compiled from: TextPaintExtensions.android.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a6\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aP\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042&\u0010\u0012\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\f\u0010\u001b\u001a\u00020\b*\u00020\u0004H\u0000\u001a\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"correctBlurRadius", "", "blurRadius", "generateFallbackSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "requiresLetterSpacing", "", com.helpshift.proactive.InAppViewConstants.BACKGROUND, "Landroidx/compose/ui/graphics/Color;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "generateFallbackSpanStyle-62GTOB8", "(JZJLandroidx/compose/ui/text/style/BaselineShift;)Landroidx/compose/ui/text/SpanStyle;", "applySpanStyle", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "style", "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "density", "Landroidx/compose/ui/unit/Density;", "hasFontAttributes", "setTextMotion", "", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextPaintExtensions_androidKt {
    public static final float correctBlurRadius(float f) {
        if (f == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    public static /* synthetic */ androidx.compose.ui.text.SpanStyle applySpanStyle$default(androidx.compose.ui.text.platform.AndroidTextPaint androidTextPaint, androidx.compose.ui.text.SpanStyle spanStyle, kotlin.jvm.functions.Function4 function4, androidx.compose.ui.unit.Density density, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, function4, density, z);
    }

    public static final androidx.compose.ui.text.SpanStyle applySpanStyle(androidx.compose.ui.text.platform.AndroidTextPaint androidTextPaint, androidx.compose.ui.text.SpanStyle spanStyle, kotlin.jvm.functions.Function4<? super androidx.compose.ui.text.font.FontFamily, ? super androidx.compose.ui.text.font.FontWeight, ? super androidx.compose.ui.text.font.FontStyle, ? super androidx.compose.ui.text.font.FontSynthesis, ? extends android.graphics.Typeface> function4, androidx.compose.ui.unit.Density density, boolean z) {
        androidx.compose.ui.text.intl.Locale locale;
        long m4672getTypeUIouoOA = androidx.compose.ui.unit.TextUnit.m4672getTypeUIouoOA(spanStyle.getFontSize());
        if (androidx.compose.ui.unit.TextUnitType.m4701equalsimpl0(m4672getTypeUIouoOA, androidx.compose.ui.unit.TextUnitType.INSTANCE.m4706getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo314toPxR2X_6o(spanStyle.getFontSize()));
        } else if (androidx.compose.ui.unit.TextUnitType.m4701equalsimpl0(m4672getTypeUIouoOA, androidx.compose.ui.unit.TextUnitType.INSTANCE.m4705getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * androidx.compose.ui.unit.TextUnit.m4673getValueimpl(spanStyle.getFontSize()));
        }
        if (hasFontAttributes(spanStyle)) {
            androidx.compose.ui.text.font.FontFamily fontFamily = spanStyle.getFontFamily();
            androidx.compose.ui.text.font.FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
            }
            androidx.compose.ui.text.font.FontStyle fontStyle = spanStyle.getFontStyle();
            androidx.compose.ui.text.font.FontStyle m4073boximpl = androidx.compose.ui.text.font.FontStyle.m4073boximpl(fontStyle != null ? fontStyle.m4079unboximpl() : androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA());
            androidx.compose.ui.text.font.FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
            androidTextPaint.setTypeface(function4.invoke(fontFamily, fontWeight, m4073boximpl, androidx.compose.ui.text.font.FontSynthesis.m4084boximpl(fontSynthesis != null ? fontSynthesis.getValue() : androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m4093getAllGVVA2EU())));
        }
        if (spanStyle.getLocaleList() != null && !kotlin.jvm.internal.Intrinsics.areEqual(spanStyle.getLocaleList(), androidx.compose.ui.text.intl.LocaleList.INSTANCE.getCurrent())) {
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                androidx.compose.ui.text.platform.extensions.LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
            } else {
                if (spanStyle.getLocaleList().isEmpty()) {
                    locale = androidx.compose.ui.text.intl.Locale.INSTANCE.getCurrent();
                } else {
                    locale = spanStyle.getLocaleList().get(0);
                }
                androidTextPaint.setTextLocale(androidx.compose.ui.text.platform.extensions.LocaleExtensions_androidKt.toJavaLocale(locale));
            }
        }
        if (spanStyle.getFontFeatureSettings() != null && !kotlin.jvm.internal.Intrinsics.areEqual(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !kotlin.jvm.internal.Intrinsics.areEqual(spanStyle.getTextGeometricTransform(), androidx.compose.ui.text.style.TextGeometricTransform.INSTANCE.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m4225setColor8_81llA(spanStyle.m3923getColor0d7_KjU());
        androidTextPaint.m4224setBrush12SF9DM(spanStyle.getBrush(), androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (androidx.compose.ui.unit.TextUnitType.m4701equalsimpl0(androidx.compose.ui.unit.TextUnit.m4672getTypeUIouoOA(spanStyle.getLetterSpacing()), androidx.compose.ui.unit.TextUnitType.INSTANCE.m4706getSpUIouoOA()) && androidx.compose.ui.unit.TextUnit.m4673getValueimpl(spanStyle.getLetterSpacing()) != 0.0f) {
            float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
            float mo314toPxR2X_6o = density.mo314toPxR2X_6o(spanStyle.getLetterSpacing());
            if (textSize != 0.0f) {
                androidTextPaint.setLetterSpacing(mo314toPxR2X_6o / textSize);
            }
        } else if (androidx.compose.ui.unit.TextUnitType.m4701equalsimpl0(androidx.compose.ui.unit.TextUnit.m4672getTypeUIouoOA(spanStyle.getLetterSpacing()), androidx.compose.ui.unit.TextUnitType.INSTANCE.m4705getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(androidx.compose.ui.unit.TextUnit.m4673getValueimpl(spanStyle.getLetterSpacing()));
        }
        return m4239generateFallbackSpanStyle62GTOB8(spanStyle.getLetterSpacing(), z, spanStyle.getBackground(), spanStyle.getBaselineShift());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (androidx.compose.ui.text.style.BaselineShift.m4247equalsimpl0(r36.m4250unboximpl(), androidx.compose.ui.text.style.BaselineShift.INSTANCE.m4254getNoney9eOQZs()) == false) goto L22;
     */
    /* renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final androidx.compose.ui.text.SpanStyle m4239generateFallbackSpanStyle62GTOB8(long j, boolean z, long j2, androidx.compose.ui.text.style.BaselineShift baselineShift) {
        long j3 = j2;
        boolean z2 = true;
        boolean z3 = z && androidx.compose.ui.unit.TextUnitType.m4701equalsimpl0(androidx.compose.ui.unit.TextUnit.m4672getTypeUIouoOA(j), androidx.compose.ui.unit.TextUnitType.INSTANCE.m4706getSpUIouoOA()) && androidx.compose.ui.unit.TextUnit.m4673getValueimpl(j) != 0.0f;
        boolean z4 = (androidx.compose.ui.graphics.Color.m2114equalsimpl0(j3, androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) || androidx.compose.ui.graphics.Color.m2114equalsimpl0(j3, androidx.compose.ui.graphics.Color.INSTANCE.m2148getTransparent0d7_KjU())) ? false : true;
        if (baselineShift != null) {
        }
        z2 = false;
        if (!z3 && !z4 && !z2) {
            return null;
        }
        long m4684getUnspecifiedXSAIIZE = z3 ? j : androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE();
        if (!z4) {
            j3 = androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU();
        }
        return new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, m4684getUnspecifiedXSAIIZE, z2 ? baselineShift : null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, j3, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 63103, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final void setTextMotion(androidx.compose.ui.text.platform.AndroidTextPaint androidTextPaint, androidx.compose.ui.text.style.TextMotion textMotion) {
        int flags;
        if (textMotion == null) {
            textMotion = androidx.compose.ui.text.style.TextMotion.INSTANCE.getStatic();
        }
        if (textMotion.getSubpixelTextPositioning()) {
            flags = androidTextPaint.getFlags() | 128;
        } else {
            flags = androidTextPaint.getFlags() & (-129);
        }
        androidTextPaint.setFlags(flags);
        int linearity = textMotion.getLinearity();
        if (androidx.compose.ui.text.style.TextMotion.Linearity.m4392equalsimpl0(linearity, androidx.compose.ui.text.style.TextMotion.Linearity.INSTANCE.m4397getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (androidx.compose.ui.text.style.TextMotion.Linearity.m4392equalsimpl0(linearity, androidx.compose.ui.text.style.TextMotion.Linearity.INSTANCE.m4396getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (androidx.compose.ui.text.style.TextMotion.Linearity.m4392equalsimpl0(linearity, androidx.compose.ui.text.style.TextMotion.Linearity.INSTANCE.m4398getNone4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        } else {
            androidTextPaint.getFlags();
        }
    }

    public static final boolean hasFontAttributes(androidx.compose.ui.text.SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.getFontStyle() == null && spanStyle.getFontWeight() == null) ? false : true;
    }
}
