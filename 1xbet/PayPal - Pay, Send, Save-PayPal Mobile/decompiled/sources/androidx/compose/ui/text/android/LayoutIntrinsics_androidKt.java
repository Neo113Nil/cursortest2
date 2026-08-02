package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0002\u0010\u000b"}, d2 = {"", "p0", "Camera2StreamConfigurationMap", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "p1", "Landroid/text/TextPaint;", "p2", "", "getHighSpeedVideoFpsRangesFor", "(FLjava/lang/CharSequence;Landroid/text/TextPaint;)Z", "Z", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LayoutIntrinsics_androidKt {
    private static final boolean Camera2StreamConfigurationMap = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence Camera2StreamConfigurationMap(java.lang.CharSequence charSequence) {
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            if (androidx.compose.ui.text.android.SpannedExtensions_androidKt.hasSpan(spanned, android.text.style.CharacterStyle.class)) {
                android.text.style.CharacterStyle[] characterStyleArr = (android.text.style.CharacterStyle[]) spanned.getSpans(0, charSequence.length(), android.text.style.CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    android.text.SpannableString spannableString = null;
                    for (android.text.style.CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof android.text.style.MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new android.text.SpannableString(charSequence);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        return spannableString;
                    }
                }
            }
        }
        return charSequence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRangesFor(float f, java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        if (f == 0.0f) {
            return false;
        }
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            if (androidx.compose.ui.text.android.SpannedExtensions_androidKt.hasSpan(spanned, androidx.compose.ui.text.android.style.LetterSpacingSpanPx.class) || androidx.compose.ui.text.android.SpannedExtensions_androidKt.hasSpan(spanned, androidx.compose.ui.text.android.style.LetterSpacingSpanEm.class)) {
                return true;
            }
        }
        return textPaint.getLetterSpacing() != 0.0f;
    }
}
