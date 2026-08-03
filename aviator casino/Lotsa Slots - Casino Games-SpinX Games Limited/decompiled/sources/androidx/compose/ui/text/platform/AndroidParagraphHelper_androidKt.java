package androidx.compose.ui.text.platform;

/* compiled from: AndroidParagraphHelper.android.kt */
@kotlin.Metadata(d1 = {"\u0000]\n\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0001\u001a\u0080\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\f2\u0006\u0010\u0011\u001a\u00020\u00122&\u0010\u0013\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0000\u001a\f\u0010\u001c\u001a\u00020\u001b*\u00020\nH\u0000\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u001d"}, d2 = {"NoopSpan", "androidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt$NoopSpan$1", "Landroidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt$NoopSpan$1;", "createCharSequence", "", "text", "", "contextFontSize", "", "contextTextStyle", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "useEmojiCompat", "", "isIncludeFontPaddingEnabled", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidParagraphHelper_androidKt {
    private static final androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1 NoopSpan = new android.text.style.CharacterStyle() { // from class: androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1
        @Override // android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint p0) {
        }
    };

    public static final java.lang.CharSequence createCharSequence(java.lang.String str, float f, androidx.compose.ui.text.TextStyle textStyle, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>> list, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list2, androidx.compose.ui.unit.Density density, kotlin.jvm.functions.Function4<? super androidx.compose.ui.text.font.FontFamily, ? super androidx.compose.ui.text.font.FontWeight, ? super androidx.compose.ui.text.font.FontStyle, ? super androidx.compose.ui.text.font.FontSynthesis, ? extends android.graphics.Typeface> function4, boolean z) {
        java.lang.String str2;
        android.text.SpannableString spannableString;
        if (z && androidx.emoji2.text.EmojiCompat.isConfigured()) {
            str2 = androidx.emoji2.text.EmojiCompat.get().process(str);
            kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
        } else {
            str2 = str;
        }
        if (list.isEmpty() && list2.isEmpty() && kotlin.jvm.internal.Intrinsics.areEqual(textStyle.getTextIndent(), androidx.compose.ui.text.style.TextIndent.INSTANCE.getNone()) && androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(textStyle.m4003getLineHeightXSAIIZE())) {
            return str2;
        }
        if (str2 instanceof android.text.Spannable) {
            spannableString = (android.text.Spannable) str2;
        } else {
            spannableString = new android.text.SpannableString(str2);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(textStyle.getTextDecoration(), androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline())) {
            androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setSpan(spannableString, NoopSpan, 0, str.length());
        }
        if (isIncludeFontPaddingEnabled(textStyle) && textStyle.getLineHeightStyle() == null) {
            androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.m4238setLineHeightr9BaKPg(spannableString, textStyle.m4003getLineHeightXSAIIZE(), f, density);
        } else {
            androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle = textStyle.getLineHeightStyle();
            if (lineHeightStyle == null) {
                lineHeightStyle = androidx.compose.ui.text.style.LineHeightStyle.INSTANCE.getDefault();
            }
            android.text.Spannable spannable = spannableString;
            androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.m4237setLineHeightKmRG4DE(spannable, textStyle.m4003getLineHeightXSAIIZE(), f, density, lineHeightStyle);
        }
        androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setTextIndent(spannableString, textStyle.getTextIndent(), f, density);
        androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setSpanStyles(spannableString, textStyle, list, density, function4);
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
