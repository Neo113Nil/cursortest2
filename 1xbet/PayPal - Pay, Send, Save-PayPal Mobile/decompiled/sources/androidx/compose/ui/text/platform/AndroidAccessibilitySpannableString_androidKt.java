package androidx.compose.ui.text.platform;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u0012\u001a\u00020\u0011*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014*\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/platform/URLSpanCache;", "urlSpanCache", "Landroid/text/SpannableString;", "toAccessibilitySpannableString", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/text/platform/URLSpanCache;)Landroid/text/SpannableString;", "Landroidx/compose/ui/text/SpanStyle;", "p0", "", "p1", "p2", "p3", "p4", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/text/SpannableString;Landroidx/compose/ui/text/SpanStyle;IILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/text/AnnotatedString$Range;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidAccessibilitySpannableString_androidKt {
    public static final android.text.SpannableString toAccessibilitySpannableString(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, androidx.compose.ui.text.platform.URLSpanCache uRLSpanCache) {
        androidx.compose.ui.text.SpanStyle m7977copyGSF8kmg;
        android.text.SpannableString spannableString = new android.text.SpannableString(annotatedString.getText());
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>> spanStylesOrNull$ui_text = annotatedString.getSpanStylesOrNull$ui_text();
        if (spanStylesOrNull$ui_text != null) {
            int size = spanStylesOrNull$ui_text.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle> range = spanStylesOrNull$ui_text.get(i);
                androidx.compose.ui.text.SpanStyle component1 = range.component1();
                int start = range.getStart();
                int end = range.getEnd();
                m7977copyGSF8kmg = component1.m7977copyGSF8kmg((r38 & 1) != 0 ? component1.m7982getColor0d7_KjU() : 0L, (r38 & 2) != 0 ? component1.fontSize : 0L, (r38 & 4) != 0 ? component1.fontWeight : null, (r38 & 8) != 0 ? component1.fontStyle : null, (r38 & 16) != 0 ? component1.fontSynthesis : null, (r38 & 32) != 0 ? component1.fontFamily : null, (r38 & 64) != 0 ? component1.fontFeatureSettings : null, (r38 & 128) != 0 ? component1.letterSpacing : 0L, (r38 & 256) != 0 ? component1.baselineShift : null, (r38 & 512) != 0 ? component1.textGeometricTransform : null, (r38 & 1024) != 0 ? component1.localeList : null, (r38 & 2048) != 0 ? component1.background : 0L, (r38 & 4096) != 0 ? component1.textDecoration : null, (r38 & 8192) != 0 ? component1.shadow : null, (r38 & 16384) != 0 ? component1.platformStyle : null, (r38 & 32768) != 0 ? component1.drawStyle : null);
                getHighResolutionOutputSizeshNQ4ISI(spannableString, m7977copyGSF8kmg, start, end, density, resolver);
            }
        }
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>> ttsAnnotations = annotatedString.getTtsAnnotations(0, annotatedString.length());
        int size2 = ttsAnnotations.size();
        for (int i2 = 0; i2 < size2; i2++) {
            androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation> range2 = ttsAnnotations.get(i2);
            spannableString.setSpan(androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt.toSpan(range2.component1()), range2.getStart(), range2.getEnd(), 33);
        }
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>> urlAnnotations = annotatedString.getUrlAnnotations(0, annotatedString.length());
        int size3 = urlAnnotations.size();
        for (int i3 = 0; i3 < size3; i3++) {
            androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation> range3 = urlAnnotations.get(i3);
            spannableString.setSpan(uRLSpanCache.toURLSpan(range3.component1()), range3.getStart(), range3.getEnd(), 33);
        }
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>> linkAnnotations = annotatedString.getLinkAnnotations(0, annotatedString.length());
        int size4 = linkAnnotations.size();
        for (int i4 = 0; i4 < size4; i4++) {
            androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation> range4 = linkAnnotations.get(i4);
            if (range4.getStart() != range4.getEnd()) {
                androidx.compose.ui.text.LinkAnnotation item = range4.getItem();
                if ((item instanceof androidx.compose.ui.text.LinkAnnotation.Url) && ((androidx.compose.ui.text.LinkAnnotation.Url) item).getLinkInteractionListener() == null) {
                    spannableString.setSpan(uRLSpanCache.toURLSpan(Camera2StreamConfigurationMap(range4)), range4.getStart(), range4.getEnd(), 33);
                } else {
                    spannableString.setSpan(uRLSpanCache.toClickableSpan(range4), range4.getStart(), range4.getEnd(), 33);
                }
            }
        }
        return spannableString;
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(android.text.SpannableString spannableString, androidx.compose.ui.text.SpanStyle spanStyle, int i, int i2, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver) {
        android.text.SpannableString spannableString2 = spannableString;
        androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.m8299setColorRPmYEkk(spannableString2, spanStyle.m7982getColor0d7_KjU(), i, i2);
        androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.m8300setFontSizeKmRG4DE(spannableString2, spanStyle.getFontSize(), density, i, i2);
        if (spanStyle.getFontWeight() != null || spanStyle.getFontStyle() != null) {
            androidx.compose.ui.text.font.FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
            }
            androidx.compose.ui.text.font.FontStyle fontStyle = spanStyle.getFontStyle();
            spannableString.setSpan(new android.text.style.StyleSpan(androidx.compose.ui.text.font.AndroidFontUtils_androidKt.m8104getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle != null ? fontStyle.m8155unboximpl() : androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA())), i, i2, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof androidx.compose.ui.text.font.GenericFontFamily) {
                spannableString.setSpan(new android.text.style.TypefaceSpan(((androidx.compose.ui.text.font.GenericFontFamily) spanStyle.getFontFamily()).getName()), i, i2, 33);
            } else if (android.os.Build.VERSION.SDK_INT >= 28) {
                androidx.compose.ui.text.font.FontFamily fontFamily = spanStyle.getFontFamily();
                androidx.compose.ui.text.font.FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
                java.lang.Object value = androidx.compose.ui.text.font.FontFamily.Resolver.m8124resolveDPcqOEQ$default(resolver, fontFamily, null, 0, fontSynthesis != null ? fontSynthesis.m8168unboximpl() : androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m8169getAllGVVA2EU(), 6, null).getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
                spannableString.setSpan(androidx.compose.ui.text.platform.Api28Impl.INSTANCE.getHighSpeedVideoFpsRangesFor((android.graphics.Typeface) value), i, i2, 33);
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
        androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.m8298setBackgroundRPmYEkk(spannableString2, spanStyle.getBackground(), i, i2);
    }

    private static final androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation.Url> Camera2StreamConfigurationMap(androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation> range) {
        androidx.compose.ui.text.LinkAnnotation item = range.getItem();
        kotlin.jvm.internal.Intrinsics.checkNotNull(item, "");
        return new androidx.compose.ui.text.AnnotatedString.Range<>((androidx.compose.ui.text.LinkAnnotation.Url) item, range.getStart(), range.getEnd());
    }
}
