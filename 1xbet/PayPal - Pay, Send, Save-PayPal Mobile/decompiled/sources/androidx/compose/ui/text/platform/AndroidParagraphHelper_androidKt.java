package androidx.compose.ui.text.platform;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0089\u0001\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\r\u001a\u00020\f2&\u0010\u0014\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0015*\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"", "text", "", "contextFontSize", "Landroidx/compose/ui/text/TextStyle;", "contextTextStyle", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "annotations", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "", "useEmojiCompat", "", "createCharSequence", "(Ljava/lang/String;FLandroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function4;Z)Ljava/lang/CharSequence;", "isIncludeFontPaddingEnabled", "(Landroidx/compose/ui/text/TextStyle;)Z", "Landroidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt$NoopSpan$1;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt$NoopSpan$1;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidParagraphHelper_androidKt {
    private static final androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1 getHighResolutionOutputSizeshNQ4ISI = new android.text.style.CharacterStyle() { // from class: androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1
        @Override // android.text.style.CharacterStyle
        public final void updateDrawState(android.text.TextPaint p0) {
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.emoji2.text.EmojiCompat] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static final java.lang.CharSequence createCharSequence(java.lang.String str, float f, androidx.compose.ui.text.TextStyle textStyle, java.util.List<? extends androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation>> list, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list2, androidx.compose.ui.unit.Density density, kotlin.jvm.functions.Function4<? super androidx.compose.ui.text.font.FontFamily, ? super androidx.compose.ui.text.font.FontWeight, ? super androidx.compose.ui.text.font.FontStyle, ? super androidx.compose.ui.text.font.FontSynthesis, ? extends android.graphics.Typeface> function4, boolean z) {
        java.lang.String str2;
        android.text.SpannableString spannableString;
        androidx.compose.ui.text.PlatformParagraphStyle paragraphStyle;
        if (z && androidx.emoji2.text.EmojiCompat.isConfigured()) {
            androidx.compose.ui.text.PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
            androidx.compose.ui.text.EmojiSupportMatch m7864boximpl = (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : androidx.compose.ui.text.EmojiSupportMatch.m7864boximpl(paragraphStyle.getEmojiSupportMatch());
            str2 = androidx.emoji2.text.EmojiCompat.get().process(str, 0, str.length(), Integer.MAX_VALUE, m7864boximpl == null ? 0 : androidx.compose.ui.text.EmojiSupportMatch.m7867equalsimpl0(m7864boximpl.getGetHighSpeedVideoFpsRangesFor(), androidx.compose.ui.text.EmojiSupportMatch.INSTANCE.m7871getAll_3YsG6Y()));
            kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
        } else {
            str2 = str;
        }
        if (list.isEmpty() && list2.isEmpty() && kotlin.jvm.internal.Intrinsics.areEqual(textStyle.getTextIndent(), androidx.compose.ui.text.style.TextIndent.INSTANCE.getNone()) && androidx.compose.ui.unit.TextUnit.m8793getRawTypeimpl(textStyle.m8078getLineHeightXSAIIZE()) == 0) {
            return str2;
        }
        if (str2 instanceof android.text.Spannable) {
            spannableString = (android.text.Spannable) str2;
        } else {
            spannableString = new android.text.SpannableString(str2);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(textStyle.getTextDecoration(), androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline())) {
            androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setSpan(spannableString, getHighResolutionOutputSizeshNQ4ISI, 0, str.length());
        }
        if (isIncludeFontPaddingEnabled(textStyle) && textStyle.getLineHeightStyle() == null) {
            androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.m8302setLineHeightr9BaKPg(spannableString, textStyle.m8078getLineHeightXSAIIZE(), f, density);
        } else {
            androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle = textStyle.getLineHeightStyle();
            if (lineHeightStyle == null) {
                lineHeightStyle = androidx.compose.ui.text.style.LineHeightStyle.INSTANCE.getDefault();
            }
            androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.m8301setLineHeightKmRG4DE(spannableString, textStyle.m8078getLineHeightXSAIIZE(), f, density, lineHeightStyle);
        }
        androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setTextIndent(spannableString, textStyle.getTextIndent(), f, density);
        androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setSpanStyles(spannableString, textStyle, list, density, function4);
        androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setBulletSpans(spannableString, list, f, density, textStyle.getTextIndent());
        androidx.compose.ui.text.platform.extensions.PlaceholderExtensions_androidKt.setPlaceholders(spannableString, list2, density);
        return spannableString;
    }

    public static final boolean isIncludeFontPaddingEnabled(androidx.compose.ui.text.TextStyle textStyle) {
        androidx.compose.ui.text.PlatformParagraphStyle paragraphStyle;
        androidx.compose.ui.text.PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) {
            return false;
        }
        return paragraphStyle.getIncludeFontPadding();
    }
}
