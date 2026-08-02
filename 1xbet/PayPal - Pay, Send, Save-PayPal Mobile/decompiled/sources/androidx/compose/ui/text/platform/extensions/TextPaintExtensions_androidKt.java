package androidx.compose.ui.text.platform.extensions;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aW\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroidx/compose/ui/text/SpanStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "Landroidx/compose/ui/unit/Density;", "density", "", "requiresLetterSpacing", "applySpanStyle", "(Landroidx/compose/ui/text/platform/AndroidTextPaint;Landroidx/compose/ui/text/SpanStyle;Lkotlin/jvm/functions/Function4;Landroidx/compose/ui/unit/Density;Z)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/unit/TextUnit;", "p0", "p1", "Landroidx/compose/ui/graphics/Color;", "p2", "Landroidx/compose/ui/text/style/BaselineShift;", "p3", "getHighSpeedVideoFpsRanges", "(JZJLandroidx/compose/ui/text/style/BaselineShift;)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "", "setTextMotion", "(Landroidx/compose/ui/text/platform/AndroidTextPaint;Landroidx/compose/ui/text/style/TextMotion;)V", "hasFontAttributes", "(Landroidx/compose/ui/text/SpanStyle;)Z", "", "blurRadius", "correctBlurRadius", "(F)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
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
        long m8794getTypeUIouoOA = androidx.compose.ui.unit.TextUnit.m8794getTypeUIouoOA(spanStyle.getFontSize());
        if (androidx.compose.ui.unit.TextUnitType.m8823equalsimpl0(m8794getTypeUIouoOA, androidx.compose.ui.unit.TextUnitType.INSTANCE.m8828getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo1417toPxR2X_6o(spanStyle.getFontSize()));
        } else if (androidx.compose.ui.unit.TextUnitType.m8823equalsimpl0(m8794getTypeUIouoOA, androidx.compose.ui.unit.TextUnitType.INSTANCE.m8827getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * androidx.compose.ui.unit.TextUnit.m8795getValueimpl(spanStyle.getFontSize()));
        }
        if (hasFontAttributes(spanStyle)) {
            androidx.compose.ui.text.font.FontFamily fontFamily = spanStyle.getFontFamily();
            androidx.compose.ui.text.font.FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
            }
            androidx.compose.ui.text.font.FontStyle fontStyle = spanStyle.getFontStyle();
            androidx.compose.ui.text.font.FontStyle m8149boximpl = androidx.compose.ui.text.font.FontStyle.m8149boximpl(fontStyle != null ? fontStyle.m8155unboximpl() : androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA());
            androidx.compose.ui.text.font.FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
            androidTextPaint.setTypeface(function4.invoke(fontFamily, fontWeight, m8149boximpl, androidx.compose.ui.text.font.FontSynthesis.m8160boximpl(fontSynthesis != null ? fontSynthesis.m8168unboximpl() : androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m8169getAllGVVA2EU())));
        }
        if (spanStyle.getLocaleList() != null && !kotlin.jvm.internal.Intrinsics.areEqual(spanStyle.getLocaleList(), androidx.compose.ui.text.intl.LocaleList.INSTANCE.getCurrent())) {
            androidx.compose.ui.text.platform.extensions.LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !kotlin.jvm.internal.Intrinsics.areEqual(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !kotlin.jvm.internal.Intrinsics.areEqual(spanStyle.getTextGeometricTransform(), androidx.compose.ui.text.style.TextGeometricTransform.INSTANCE.getNone$ui_text())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m8296setColor8_81llA(spanStyle.m7982getColor0d7_KjU());
        androidTextPaint.m8294setBrush12SF9DM(spanStyle.getBrush(), androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (androidx.compose.ui.unit.TextUnitType.m8823equalsimpl0(androidx.compose.ui.unit.TextUnit.m8794getTypeUIouoOA(spanStyle.getLetterSpacing()), androidx.compose.ui.unit.TextUnitType.INSTANCE.m8828getSpUIouoOA()) && androidx.compose.ui.unit.TextUnit.m8795getValueimpl(spanStyle.getLetterSpacing()) != 0.0f) {
            float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
            float mo1417toPxR2X_6o = density.mo1417toPxR2X_6o(spanStyle.getLetterSpacing());
            if (textSize != 0.0f) {
                androidTextPaint.setLetterSpacing(mo1417toPxR2X_6o / textSize);
            }
        } else if (androidx.compose.ui.unit.TextUnitType.m8823equalsimpl0(androidx.compose.ui.unit.TextUnit.m8794getTypeUIouoOA(spanStyle.getLetterSpacing()), androidx.compose.ui.unit.TextUnitType.INSTANCE.m8827getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(androidx.compose.ui.unit.TextUnit.m8795getValueimpl(spanStyle.getLetterSpacing()));
        }
        return getHighSpeedVideoFpsRanges(spanStyle.getLetterSpacing(), z, spanStyle.getBackground(), spanStyle.getBaselineShift());
    }

    private static final androidx.compose.ui.text.SpanStyle getHighSpeedVideoFpsRanges(long j, boolean z, long j2, androidx.compose.ui.text.style.BaselineShift baselineShift) {
        long j3 = j2;
        boolean z2 = false;
        boolean z3 = z && androidx.compose.ui.unit.TextUnitType.m8823equalsimpl0(androidx.compose.ui.unit.TextUnit.m8794getTypeUIouoOA(j), androidx.compose.ui.unit.TextUnitType.INSTANCE.m8828getSpUIouoOA()) && androidx.compose.ui.unit.TextUnit.m8795getValueimpl(j) != 0.0f;
        boolean z4 = (androidx.compose.ui.graphics.Color.m5997equalsimpl0(j3, androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU()) || androidx.compose.ui.graphics.Color.m5997equalsimpl0(j3, androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU())) ? false : true;
        if (baselineShift != null) {
            if (!androidx.compose.ui.text.style.BaselineShift.m8312equalsimpl0(baselineShift.m8315unboximpl(), androidx.compose.ui.text.style.BaselineShift.INSTANCE.m8320getNoney9eOQZs())) {
                z2 = true;
            }
        }
        if (!z3 && !z4 && !z2) {
            return null;
        }
        long m8806getUnspecifiedXSAIIZE = !z3 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j;
        if (!z4) {
            j3 = androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU();
        }
        return new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, m8806getUnspecifiedXSAIIZE, !z2 ? null : baselineShift, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, j3, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 63103, (kotlin.jvm.internal.DefaultConstructorMarker) null);
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
        if (androidx.compose.ui.text.style.TextMotion.Linearity.m8481equalsimpl0(linearity, androidx.compose.ui.text.style.TextMotion.Linearity.INSTANCE.m8486getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (androidx.compose.ui.text.style.TextMotion.Linearity.m8481equalsimpl0(linearity, androidx.compose.ui.text.style.TextMotion.Linearity.INSTANCE.m8485getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (androidx.compose.ui.text.style.TextMotion.Linearity.m8481equalsimpl0(linearity, androidx.compose.ui.text.style.TextMotion.Linearity.INSTANCE.m8487getNone4e0Vf04())) {
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
