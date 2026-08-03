package androidx.compose.ui.text;

/* compiled from: AndroidTextStyle.android.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u001a\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000\u001a\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f\u001a\u001e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"DefaultIncludeFontPadding", "", "createPlatformTextStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "spanStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "paragraphStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "lerp", "start", "stop", "fraction", "", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTextStyle_androidKt {
    public static final boolean DefaultIncludeFontPadding = false;

    public static final androidx.compose.ui.text.PlatformSpanStyle lerp(androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle2, float f) {
        return platformSpanStyle;
    }

    public static final androidx.compose.ui.text.PlatformTextStyle createPlatformTextStyle(androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle) {
        return new androidx.compose.ui.text.PlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    public static final androidx.compose.ui.text.PlatformParagraphStyle lerp(androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle2, float f) {
        return platformParagraphStyle.getIncludeFontPadding() == platformParagraphStyle2.getIncludeFontPadding() ? platformParagraphStyle : new androidx.compose.ui.text.PlatformParagraphStyle(((androidx.compose.ui.text.EmojiSupportMatch) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(androidx.compose.ui.text.EmojiSupportMatch.m3828boximpl(platformParagraphStyle.getEmojiSupportMatch()), androidx.compose.ui.text.EmojiSupportMatch.m3828boximpl(platformParagraphStyle2.getEmojiSupportMatch()), f)).getValue(), ((java.lang.Boolean) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(java.lang.Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding()), java.lang.Boolean.valueOf(platformParagraphStyle2.getIncludeFontPadding()), f)).booleanValue(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
