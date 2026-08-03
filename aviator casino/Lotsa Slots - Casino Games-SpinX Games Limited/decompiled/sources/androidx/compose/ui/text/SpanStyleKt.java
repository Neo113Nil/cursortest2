package androidx.compose.ui.text;

/* compiled from: SpanStyle.kt */
@kotlin.Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f\u001a+\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u0002H\u000e2\u0006\u0010\u0010\u001a\u0002H\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0011\u001a&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\t\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a*\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0000\u001aÀ\u0001\u0010\u001a\u001a\u00020\b*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u00012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u00010\u00132\b\u00107\u001a\u0004\u0018\u000108H\u0000ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\u0018\u0010;\u001a\u0004\u0018\u00010\u0013*\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u0013H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"DefaultBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "J", "DefaultColor", "DefaultFontSize", "Landroidx/compose/ui/unit/TextUnit;", "DefaultLetterSpacing", "lerp", "Landroidx/compose/ui/text/SpanStyle;", "start", "stop", "fraction", "", "lerpDiscrete", "T", "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "lerpTextUnitInheritable", "t", "lerpTextUnitInheritable-C3pnCVY", "(JJF)J", "resolveSpanStyleDefaults", "style", "fastMerge", "color", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "fontSize", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", com.helpshift.proactive.InAppViewConstants.BACKGROUND, "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "platformStyle", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "fastMerge-dSHsh3o", "(Landroidx/compose/ui/text/SpanStyle;JLandroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "mergePlatformStyle", "other", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpanStyleKt {
    private static final long DefaultFontSize = androidx.compose.ui.unit.TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = androidx.compose.ui.unit.TextUnitKt.getSp(0);
    private static final long DefaultBackgroundColor = androidx.compose.ui.graphics.Color.INSTANCE.m2148getTransparent0d7_KjU();
    private static final long DefaultColor = androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU();

    public static final <T> T lerpDiscrete(T t, T t2, float f) {
        return ((double) f) < 0.5d ? t : t2;
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m3929lerpTextUnitInheritableC3pnCVY(long j, long j2, float f) {
        if (androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j) || androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j2)) {
            return ((androidx.compose.ui.unit.TextUnit) lerpDiscrete(androidx.compose.ui.unit.TextUnit.m4663boximpl(j), androidx.compose.ui.unit.TextUnit.m4663boximpl(j2), f)).getPackedValue();
        }
        return androidx.compose.ui.unit.TextUnitKt.m4693lerpC3pnCVY(j, j2, f);
    }

    public static final androidx.compose.ui.text.SpanStyle lerp(androidx.compose.ui.text.SpanStyle spanStyle, androidx.compose.ui.text.SpanStyle spanStyle2, float f) {
        androidx.compose.ui.text.style.TextForegroundStyle lerp = androidx.compose.ui.text.style.TextDrawStyleKt.lerp(spanStyle.getTextForegroundStyle(), spanStyle2.getTextForegroundStyle(), f);
        androidx.compose.ui.text.font.FontFamily fontFamily = (androidx.compose.ui.text.font.FontFamily) lerpDiscrete(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f);
        long m3929lerpTextUnitInheritableC3pnCVY = m3929lerpTextUnitInheritableC3pnCVY(spanStyle.getFontSize(), spanStyle2.getFontSize(), f);
        androidx.compose.ui.text.font.FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        androidx.compose.ui.text.font.FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        androidx.compose.ui.text.font.FontWeight lerp2 = androidx.compose.ui.text.font.FontWeightKt.lerp(fontWeight, fontWeight2, f);
        androidx.compose.ui.text.font.FontStyle fontStyle = (androidx.compose.ui.text.font.FontStyle) lerpDiscrete(spanStyle.getFontStyle(), spanStyle2.getFontStyle(), f);
        androidx.compose.ui.text.font.FontSynthesis fontSynthesis = (androidx.compose.ui.text.font.FontSynthesis) lerpDiscrete(spanStyle.getFontSynthesis(), spanStyle2.getFontSynthesis(), f);
        java.lang.String str = (java.lang.String) lerpDiscrete(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f);
        long m3929lerpTextUnitInheritableC3pnCVY2 = m3929lerpTextUnitInheritableC3pnCVY(spanStyle.getLetterSpacing(), spanStyle2.getLetterSpacing(), f);
        androidx.compose.ui.text.style.BaselineShift baselineShift = spanStyle.getBaselineShift();
        float m4250unboximpl = baselineShift != null ? baselineShift.m4250unboximpl() : androidx.compose.ui.text.style.BaselineShift.m4245constructorimpl(0.0f);
        androidx.compose.ui.text.style.BaselineShift baselineShift2 = spanStyle2.getBaselineShift();
        float m4257lerpjWV1Mfo = androidx.compose.ui.text.style.BaselineShiftKt.m4257lerpjWV1Mfo(m4250unboximpl, baselineShift2 != null ? baselineShift2.m4250unboximpl() : androidx.compose.ui.text.style.BaselineShift.m4245constructorimpl(0.0f), f);
        androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = androidx.compose.ui.text.style.TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = androidx.compose.ui.text.style.TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        androidx.compose.ui.text.style.TextGeometricTransform lerp3 = androidx.compose.ui.text.style.TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f);
        androidx.compose.ui.text.intl.LocaleList localeList = (androidx.compose.ui.text.intl.LocaleList) lerpDiscrete(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f);
        long m2164lerpjxsXWHM = androidx.compose.ui.graphics.ColorKt.m2164lerpjxsXWHM(spanStyle.getBackground(), spanStyle2.getBackground(), f);
        androidx.compose.ui.text.style.TextDecoration textDecoration = (androidx.compose.ui.text.style.TextDecoration) lerpDiscrete(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f);
        androidx.compose.ui.graphics.Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = new androidx.compose.ui.graphics.Shadow(0L, 0L, 0.0f, 7, null);
        }
        androidx.compose.ui.graphics.Shadow shadow2 = spanStyle2.getShadow();
        if (shadow2 == null) {
            shadow2 = new androidx.compose.ui.graphics.Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new androidx.compose.ui.text.SpanStyle(lerp, m3929lerpTextUnitInheritableC3pnCVY, lerp2, fontStyle, fontSynthesis, fontFamily, str, m3929lerpTextUnitInheritableC3pnCVY2, androidx.compose.ui.text.style.BaselineShift.m4244boximpl(m4257lerpjWV1Mfo), lerp3, localeList, m2164lerpjxsXWHM, textDecoration, androidx.compose.ui.graphics.ShadowKt.lerp(shadow, shadow2, f), lerpPlatformStyle(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f), (androidx.compose.ui.graphics.drawscope.DrawStyle) lerpDiscrete(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private static final androidx.compose.ui.text.PlatformSpanStyle lerpPlatformStyle(androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle2, float f) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = androidx.compose.ui.text.PlatformSpanStyle.INSTANCE.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = androidx.compose.ui.text.PlatformSpanStyle.INSTANCE.getDefault();
        }
        return androidx.compose.ui.text.AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f);
    }

    public static final androidx.compose.ui.text.SpanStyle resolveSpanStyleDefaults(androidx.compose.ui.text.SpanStyle spanStyle) {
        long letterSpacing;
        androidx.compose.ui.text.style.TextForegroundStyle takeOrElse = spanStyle.getTextForegroundStyle().takeOrElse(new kotlin.jvm.functions.Function0<androidx.compose.ui.text.style.TextForegroundStyle>() { // from class: androidx.compose.ui.text.SpanStyleKt$resolveSpanStyleDefaults$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.ui.text.style.TextForegroundStyle invoke() {
                long j;
                androidx.compose.ui.text.style.TextForegroundStyle.Companion companion = androidx.compose.ui.text.style.TextForegroundStyle.INSTANCE;
                j = androidx.compose.ui.text.SpanStyleKt.DefaultColor;
                return companion.m4381from8_81llA(j);
            }
        });
        long fontSize = androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(spanStyle.getFontSize()) ? DefaultFontSize : spanStyle.getFontSize();
        androidx.compose.ui.text.font.FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        androidx.compose.ui.text.font.FontWeight fontWeight2 = fontWeight;
        androidx.compose.ui.text.font.FontStyle fontStyle = spanStyle.getFontStyle();
        androidx.compose.ui.text.font.FontStyle m4073boximpl = androidx.compose.ui.text.font.FontStyle.m4073boximpl(fontStyle != null ? fontStyle.m4079unboximpl() : androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA());
        androidx.compose.ui.text.font.FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
        androidx.compose.ui.text.font.FontSynthesis m4084boximpl = androidx.compose.ui.text.font.FontSynthesis.m4084boximpl(fontSynthesis != null ? fontSynthesis.getValue() : androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m4093getAllGVVA2EU());
        androidx.compose.ui.text.font.SystemFontFamily fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = androidx.compose.ui.text.font.FontFamily.INSTANCE.getDefault();
        }
        androidx.compose.ui.text.font.FontFamily fontFamily2 = fontFamily;
        java.lang.String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        java.lang.String str = fontFeatureSettings;
        if (androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(spanStyle.getLetterSpacing())) {
            letterSpacing = DefaultLetterSpacing;
        } else {
            letterSpacing = spanStyle.getLetterSpacing();
        }
        long j = letterSpacing;
        androidx.compose.ui.text.style.BaselineShift baselineShift = spanStyle.getBaselineShift();
        androidx.compose.ui.text.style.BaselineShift m4244boximpl = androidx.compose.ui.text.style.BaselineShift.m4244boximpl(baselineShift != null ? baselineShift.m4250unboximpl() : androidx.compose.ui.text.style.BaselineShift.INSTANCE.m4254getNoney9eOQZs());
        androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = androidx.compose.ui.text.style.TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        androidx.compose.ui.text.intl.LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = androidx.compose.ui.text.intl.LocaleList.INSTANCE.getCurrent();
        }
        androidx.compose.ui.text.intl.LocaleList localeList2 = localeList;
        long background = spanStyle.getBackground();
        if (background == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
            background = DefaultBackgroundColor;
        }
        long j2 = background;
        androidx.compose.ui.text.style.TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = androidx.compose.ui.text.style.TextDecoration.INSTANCE.getNone();
        }
        androidx.compose.ui.text.style.TextDecoration textDecoration2 = textDecoration;
        androidx.compose.ui.graphics.Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = androidx.compose.ui.graphics.Shadow.INSTANCE.getNone();
        }
        androidx.compose.ui.graphics.Shadow shadow2 = shadow;
        androidx.compose.ui.text.PlatformSpanStyle platformStyle = spanStyle.getPlatformStyle();
        androidx.compose.ui.graphics.drawscope.Fill drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = androidx.compose.ui.graphics.drawscope.Fill.INSTANCE;
        }
        return new androidx.compose.ui.text.SpanStyle(takeOrElse, fontSize, fontWeight2, m4073boximpl, m4084boximpl, fontFamily2, str, j, m4244boximpl, textGeometricTransform2, localeList2, j2, textDecoration2, shadow2, platformStyle, drawStyle, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private static final androidx.compose.ui.text.PlatformSpanStyle mergePlatformStyle(androidx.compose.ui.text.SpanStyle spanStyle, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle) {
        if (spanStyle.getPlatformStyle() == null) {
            return platformSpanStyle;
        }
        if (platformSpanStyle == null) {
            return spanStyle.getPlatformStyle();
        }
        return spanStyle.getPlatformStyle().merge(platformSpanStyle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m4670equalsimpl0(r26, r21.getFontSize()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0059, code lost:
    
        if (androidx.compose.ui.graphics.Color.m2114equalsimpl0(r22, r21.getTextForegroundStyle().mo4258getColor0d7_KjU()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0065, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, r21.getFontStyle()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0071, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5, r21.getFontWeight()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0079, code lost:
    
        if (r31 != r21.getFontFamily()) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x008d, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m4670equalsimpl0(r33, r21.getLetterSpacing()) == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156  */
    /* renamed from: fastMerge-dSHsh3o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.text.SpanStyle m3928fastMergedSHsh3o(androidx.compose.ui.text.SpanStyle spanStyle, long j, androidx.compose.ui.graphics.Brush brush, float f, long j2, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j3, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j4, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle) {
        androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform2;
        androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle2;
        androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle2;
        androidx.compose.ui.text.SpanStyle spanStyle2;
        androidx.compose.ui.text.style.TextForegroundStyle m4381from8_81llA;
        androidx.compose.ui.text.font.FontWeight fontWeight2 = fontWeight;
        androidx.compose.ui.text.font.FontStyle fontStyle2 = fontStyle;
        androidx.compose.ui.text.font.FontSynthesis fontSynthesis2 = fontSynthesis;
        java.lang.String str2 = str;
        androidx.compose.ui.text.style.BaselineShift baselineShift2 = baselineShift;
        if (!(!androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j2))) {
        }
        if (brush == null) {
            if (j != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
            }
        }
        if (fontStyle2 != null) {
        }
        if (fontWeight2 != null) {
        }
        if (fontFamily != null) {
        }
        if (!(!androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j3))) {
        }
        if ((textDecoration == null || kotlin.jvm.internal.Intrinsics.areEqual(textDecoration, spanStyle.getTextDecoration())) && kotlin.jvm.internal.Intrinsics.areEqual(brush, spanStyle.getTextForegroundStyle().getBrush()) && ((brush == null || f == spanStyle.getTextForegroundStyle().getAlpha()) && ((fontSynthesis2 == null || kotlin.jvm.internal.Intrinsics.areEqual(fontSynthesis2, spanStyle.getFontSynthesis())) && ((str2 == null || kotlin.jvm.internal.Intrinsics.areEqual(str2, spanStyle.getFontFeatureSettings())) && (baselineShift2 == null || kotlin.jvm.internal.Intrinsics.areEqual(baselineShift2, spanStyle.getBaselineShift())))))) {
            textGeometricTransform2 = textGeometricTransform;
            if ((textGeometricTransform2 == null || kotlin.jvm.internal.Intrinsics.areEqual(textGeometricTransform2, spanStyle.getTextGeometricTransform())) && (localeList == null || kotlin.jvm.internal.Intrinsics.areEqual(localeList, spanStyle.getLocaleList()))) {
                if ((j4 == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU() || androidx.compose.ui.graphics.Color.m2114equalsimpl0(j4, spanStyle.getBackground())) && (shadow == null || kotlin.jvm.internal.Intrinsics.areEqual(shadow, spanStyle.getShadow()))) {
                    platformSpanStyle2 = platformSpanStyle;
                    if (platformSpanStyle2 == null || kotlin.jvm.internal.Intrinsics.areEqual(platformSpanStyle2, spanStyle.getPlatformStyle())) {
                        drawStyle2 = drawStyle;
                        if (drawStyle2 == null || kotlin.jvm.internal.Intrinsics.areEqual(drawStyle2, spanStyle.getDrawStyle())) {
                            return spanStyle;
                        }
                        spanStyle2 = spanStyle;
                        if (brush != null) {
                            m4381from8_81llA = androidx.compose.ui.text.style.TextForegroundStyle.INSTANCE.from(brush, f);
                        } else {
                            m4381from8_81llA = androidx.compose.ui.text.style.TextForegroundStyle.INSTANCE.m4381from8_81llA(j);
                        }
                        androidx.compose.ui.text.style.TextForegroundStyle merge = spanStyle.getTextForegroundStyle().merge(m4381from8_81llA);
                        androidx.compose.ui.text.font.FontFamily fontFamily2 = fontFamily == null ? spanStyle.getFontFamily() : fontFamily;
                        long fontSize = !androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j2) ? j2 : spanStyle.getFontSize();
                        if (fontWeight2 == null) {
                            fontWeight2 = spanStyle.getFontWeight();
                        }
                        if (fontStyle2 == null) {
                            fontStyle2 = spanStyle.getFontStyle();
                        }
                        if (fontSynthesis2 == null) {
                            fontSynthesis2 = spanStyle.getFontSynthesis();
                        }
                        if (str2 == null) {
                            str2 = spanStyle.getFontFeatureSettings();
                        }
                        long letterSpacing = !androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j3) ? j3 : spanStyle.getLetterSpacing();
                        if (baselineShift2 == null) {
                            baselineShift2 = spanStyle.getBaselineShift();
                        }
                        if (textGeometricTransform2 == null) {
                            textGeometricTransform2 = spanStyle.getTextGeometricTransform();
                        }
                        androidx.compose.ui.text.intl.LocaleList localeList2 = localeList == null ? spanStyle.getLocaleList() : localeList;
                        long background = j4 != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU() ? j4 : spanStyle.getBackground();
                        androidx.compose.ui.text.style.TextDecoration textDecoration2 = textDecoration == null ? spanStyle.getTextDecoration() : textDecoration;
                        androidx.compose.ui.graphics.Shadow shadow2 = shadow == null ? spanStyle.getShadow() : shadow;
                        androidx.compose.ui.text.PlatformSpanStyle mergePlatformStyle = mergePlatformStyle(spanStyle2, platformSpanStyle2);
                        if (drawStyle2 == null) {
                            drawStyle2 = spanStyle.getDrawStyle();
                        }
                        return new androidx.compose.ui.text.SpanStyle(merge, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration2, shadow2, mergePlatformStyle, drawStyle2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    }
                    spanStyle2 = spanStyle;
                    drawStyle2 = drawStyle;
                    if (brush != null) {
                    }
                    androidx.compose.ui.text.style.TextForegroundStyle merge2 = spanStyle.getTextForegroundStyle().merge(m4381from8_81llA);
                    if (fontFamily == null) {
                    }
                    if (!androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j2)) {
                    }
                    if (fontWeight2 == null) {
                    }
                    if (fontStyle2 == null) {
                    }
                    if (fontSynthesis2 == null) {
                    }
                    if (str2 == null) {
                    }
                    if (!androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j3)) {
                    }
                    if (baselineShift2 == null) {
                    }
                    if (textGeometricTransform2 == null) {
                    }
                    if (localeList == null) {
                    }
                    if (j4 != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                    }
                    if (textDecoration == null) {
                    }
                    if (shadow == null) {
                    }
                    androidx.compose.ui.text.PlatformSpanStyle mergePlatformStyle2 = mergePlatformStyle(spanStyle2, platformSpanStyle2);
                    if (drawStyle2 == null) {
                    }
                    return new androidx.compose.ui.text.SpanStyle(merge2, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration2, shadow2, mergePlatformStyle2, drawStyle2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                }
                spanStyle2 = spanStyle;
                platformSpanStyle2 = platformSpanStyle;
                drawStyle2 = drawStyle;
                if (brush != null) {
                }
                androidx.compose.ui.text.style.TextForegroundStyle merge22 = spanStyle.getTextForegroundStyle().merge(m4381from8_81llA);
                if (fontFamily == null) {
                }
                if (!androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j2)) {
                }
                if (fontWeight2 == null) {
                }
                if (fontStyle2 == null) {
                }
                if (fontSynthesis2 == null) {
                }
                if (str2 == null) {
                }
                if (!androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j3)) {
                }
                if (baselineShift2 == null) {
                }
                if (textGeometricTransform2 == null) {
                }
                if (localeList == null) {
                }
                if (j4 != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                }
                if (textDecoration == null) {
                }
                if (shadow == null) {
                }
                androidx.compose.ui.text.PlatformSpanStyle mergePlatformStyle22 = mergePlatformStyle(spanStyle2, platformSpanStyle2);
                if (drawStyle2 == null) {
                }
                return new androidx.compose.ui.text.SpanStyle(merge22, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration2, shadow2, mergePlatformStyle22, drawStyle2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }
            spanStyle2 = spanStyle;
            platformSpanStyle2 = platformSpanStyle;
            drawStyle2 = drawStyle;
            if (brush != null) {
            }
            androidx.compose.ui.text.style.TextForegroundStyle merge222 = spanStyle.getTextForegroundStyle().merge(m4381from8_81llA);
            if (fontFamily == null) {
            }
            if (!androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j2)) {
            }
            if (fontWeight2 == null) {
            }
            if (fontStyle2 == null) {
            }
            if (fontSynthesis2 == null) {
            }
            if (str2 == null) {
            }
            if (!androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j3)) {
            }
            if (baselineShift2 == null) {
            }
            if (textGeometricTransform2 == null) {
            }
            if (localeList == null) {
            }
            if (j4 != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
            }
            if (textDecoration == null) {
            }
            if (shadow == null) {
            }
            androidx.compose.ui.text.PlatformSpanStyle mergePlatformStyle222 = mergePlatformStyle(spanStyle2, platformSpanStyle2);
            if (drawStyle2 == null) {
            }
            return new androidx.compose.ui.text.SpanStyle(merge222, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration2, shadow2, mergePlatformStyle222, drawStyle2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        spanStyle2 = spanStyle;
        textGeometricTransform2 = textGeometricTransform;
        platformSpanStyle2 = platformSpanStyle;
        drawStyle2 = drawStyle;
        if (brush != null) {
        }
        androidx.compose.ui.text.style.TextForegroundStyle merge2222 = spanStyle.getTextForegroundStyle().merge(m4381from8_81llA);
        if (fontFamily == null) {
        }
        if (!androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j2)) {
        }
        if (fontWeight2 == null) {
        }
        if (fontStyle2 == null) {
        }
        if (fontSynthesis2 == null) {
        }
        if (str2 == null) {
        }
        if (!androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j3)) {
        }
        if (baselineShift2 == null) {
        }
        if (textGeometricTransform2 == null) {
        }
        if (localeList == null) {
        }
        if (j4 != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
        }
        if (textDecoration == null) {
        }
        if (shadow == null) {
        }
        androidx.compose.ui.text.PlatformSpanStyle mergePlatformStyle2222 = mergePlatformStyle(spanStyle2, platformSpanStyle2);
        if (drawStyle2 == null) {
        }
        return new androidx.compose.ui.text.SpanStyle(merge2222, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration2, shadow2, mergePlatformStyle2222, drawStyle2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
