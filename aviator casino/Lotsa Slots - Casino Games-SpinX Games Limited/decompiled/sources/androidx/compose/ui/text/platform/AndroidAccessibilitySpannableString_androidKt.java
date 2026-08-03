package androidx.compose.ui.text.platform;

/* compiled from: AndroidAccessibilitySpannableString.android.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a$\u0010\f\u001a\u00020\u0002*\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"setSpanStyle", "", "Landroid/text/SpannableString;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "start", "", "end", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "toAccessibilitySpannableString", "Landroidx/compose/ui/text/AnnotatedString;", "urlSpanCache", "Landroidx/compose/ui/text/platform/URLSpanCache;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidAccessibilitySpannableString_androidKt {
    public static final android.text.SpannableString toAccessibilitySpannableString(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, androidx.compose.ui.text.platform.URLSpanCache uRLSpanCache) {
        androidx.compose.ui.text.SpanStyle m3918copyGSF8kmg;
        android.text.SpannableString spannableString = new android.text.SpannableString(annotatedString.getText());
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        if (spanStylesOrNull$ui_text_release != null) {
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle> range = spanStylesOrNull$ui_text_release.get(i);
                androidx.compose.ui.text.SpanStyle component1 = range.component1();
                int start = range.getStart();
                int end = range.getEnd();
                m3918copyGSF8kmg = component1.m3918copyGSF8kmg((r38 & 1) != 0 ? component1.m3923getColor0d7_KjU() : 0L, (r38 & 2) != 0 ? component1.fontSize : 0L, (r38 & 4) != 0 ? component1.fontWeight : null, (r38 & 8) != 0 ? component1.fontStyle : null, (r38 & 16) != 0 ? component1.fontSynthesis : null, (r38 & 32) != 0 ? component1.fontFamily : null, (r38 & 64) != 0 ? component1.fontFeatureSettings : null, (r38 & 128) != 0 ? component1.letterSpacing : 0L, (r38 & 256) != 0 ? component1.baselineShift : null, (r38 & 512) != 0 ? component1.textGeometricTransform : null, (r38 & 1024) != 0 ? component1.localeList : null, (r38 & 2048) != 0 ? component1.background : 0L, (r38 & 4096) != 0 ? component1.textDecoration : null, (r38 & 8192) != 0 ? component1.shadow : null, (r38 & 16384) != 0 ? component1.platformStyle : null, (r38 & 32768) != 0 ? component1.drawStyle : null);
                setSpanStyle(spannableString, m3918copyGSF8kmg, start, end, density, resolver);
            }
        }
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>> ttsAnnotations = annotatedString.getTtsAnnotations(0, annotatedString.length());
        int size2 = ttsAnnotations.size();
        for (int i2 = 0; i2 < size2; i2++) {
            androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation> range2 = ttsAnnotations.get(i2);
            androidx.compose.ui.text.TtsAnnotation component12 = range2.component1();
            spannableString.setSpan(androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt.toSpan(component12), range2.getStart(), range2.getEnd(), 33);
        }
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>> urlAnnotations = annotatedString.getUrlAnnotations(0, annotatedString.length());
        int size3 = urlAnnotations.size();
        for (int i3 = 0; i3 < size3; i3++) {
            androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation> range3 = urlAnnotations.get(i3);
            androidx.compose.ui.text.UrlAnnotation component13 = range3.component1();
            spannableString.setSpan(uRLSpanCache.toURLSpan(component13), range3.getStart(), range3.getEnd(), 33);
        }
        return spannableString;
    }

    private static final void setSpanStyle(android.text.SpannableString spannableString, androidx.compose.ui.text.SpanStyle spanStyle, int i, int i2, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver) {
        android.text.SpannableString spannableString2 = spannableString;
        androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.m4235setColorRPmYEkk(spannableString2, spanStyle.m3923getColor0d7_KjU(), i, i2);
        androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.m4236setFontSizeKmRG4DE(spannableString2, spanStyle.getFontSize(), density, i, i2);
        if (spanStyle.getFontWeight() != null || spanStyle.getFontStyle() != null) {
            androidx.compose.ui.text.font.FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
            }
            androidx.compose.ui.text.font.FontStyle fontStyle = spanStyle.getFontStyle();
            spannableString.setSpan(new android.text.style.StyleSpan(androidx.compose.ui.text.font.AndroidFontUtils_androidKt.m4029getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle != null ? fontStyle.m4079unboximpl() : androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA())), i, i2, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof androidx.compose.ui.text.font.GenericFontFamily) {
                spannableString.setSpan(new android.text.style.TypefaceSpan(((androidx.compose.ui.text.font.GenericFontFamily) spanStyle.getFontFamily()).getName()), i, i2, 33);
            } else if (android.os.Build.VERSION.SDK_INT >= 28) {
                androidx.compose.ui.text.font.FontFamily fontFamily = spanStyle.getFontFamily();
                androidx.compose.ui.text.font.FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
                java.lang.Object value = androidx.compose.ui.text.font.FontFamily.Resolver.CC.m4051resolveDPcqOEQ$default(resolver, fontFamily, null, 0, fontSynthesis != null ? fontSynthesis.getValue() : androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m4093getAllGVVA2EU(), 6, null).getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(androidx.compose.ui.text.platform.Api28Impl.INSTANCE.createTypefaceSpan((android.graphics.Typeface) value), i, i2, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            if (spanStyle.getTextDecoration().contains(androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline())) {
                spannableString.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
            }
            if (spanStyle.getTextDecoration().contains(androidx.compose.ui.text.style.TextDecoration.INSTANCE.getLineThrough())) {
                spannableString.setSpan(new android.text.style.StrikethroughSpan(), i, i2, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new android.text.style.ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i, i2, 33);
        }
        androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setLocaleList(spannableString2, spanStyle.getLocaleList(), i, i2);
        androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.m4233setBackgroundRPmYEkk(spannableString2, spanStyle.getBackground(), i, i2);
    }
}
