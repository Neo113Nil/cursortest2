package androidx.compose.ui.text.android.style;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/text/android/style/LetterSpacingSpanPx;", "Landroid/text/style/MetricAffectingSpan;", "", "letterSpacing", "<init>", "(F)V", "Landroid/text/TextPaint;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/text/TextPaint;)V", "textPaint", "updateDrawState", "updateMeasureState", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getLetterSpacing", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LetterSpacingSpanPx extends android.text.style.MetricAffectingSpan {
    public static final int $stable = 8;
    private final float letterSpacing;

    public LetterSpacingSpanPx(float f) {
        this.letterSpacing = f;
    }

    public final float getLetterSpacing() {
        return this.letterSpacing;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(android.text.TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.letterSpacing / textSize);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        getHighResolutionOutputSizeshNQ4ISI(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint textPaint) {
        getHighResolutionOutputSizeshNQ4ISI(textPaint);
    }
}
