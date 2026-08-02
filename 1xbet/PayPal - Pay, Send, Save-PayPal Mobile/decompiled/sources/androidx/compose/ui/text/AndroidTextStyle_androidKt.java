package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/text/PlatformSpanStyle;", "spanStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "paragraphStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "createPlatformTextStyle", "(Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;)Landroidx/compose/ui/text/PlatformTextStyle;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "", "fraction", "lerp", "(Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;F)Landroidx/compose/ui/text/PlatformParagraphStyle;", "(Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/text/PlatformSpanStyle;F)Landroidx/compose/ui/text/PlatformSpanStyle;", "", "DefaultIncludeFontPadding", "Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidTextStyle_androidKt {
    public static final boolean DefaultIncludeFontPadding = false;

    public static final androidx.compose.ui.text.PlatformSpanStyle lerp(androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle2, float f) {
        return platformSpanStyle;
    }

    public static final androidx.compose.ui.text.PlatformTextStyle createPlatformTextStyle(androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle) {
        return new androidx.compose.ui.text.PlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    public static final androidx.compose.ui.text.PlatformParagraphStyle lerp(androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle2, float f) {
        return platformParagraphStyle.getIncludeFontPadding() == platformParagraphStyle2.getIncludeFontPadding() ? platformParagraphStyle : new androidx.compose.ui.text.PlatformParagraphStyle(((androidx.compose.ui.text.EmojiSupportMatch) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(androidx.compose.ui.text.EmojiSupportMatch.m7864boximpl(platformParagraphStyle.getEmojiSupportMatch()), androidx.compose.ui.text.EmojiSupportMatch.m7864boximpl(platformParagraphStyle2.getEmojiSupportMatch()), f)).getGetHighSpeedVideoFpsRangesFor(), ((java.lang.Boolean) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(java.lang.Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding()), java.lang.Boolean.valueOf(platformParagraphStyle2.getIncludeFontPadding()), f)).booleanValue(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
