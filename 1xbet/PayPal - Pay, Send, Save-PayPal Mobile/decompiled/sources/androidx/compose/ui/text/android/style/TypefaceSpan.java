package androidx.compose.ui.text.android.style;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/text/android/style/TypefaceSpan;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/graphics/Typeface;", "typeface", "<init>", "(Landroid/graphics/Typeface;)V", "Landroid/text/TextPaint;", "ds", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "paint", "updateMeasureState", "Landroid/graphics/Paint;", "p0", "getHighSpeedVideoFpsRangesFor", "(Landroid/graphics/Paint;)V", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TypefaceSpan extends android.text.style.MetricAffectingSpan {
    public static final int $stable = 8;
    private final android.graphics.Typeface typeface;

    public TypefaceSpan(android.graphics.Typeface typeface) {
        this.typeface = typeface;
    }

    public final android.graphics.Typeface getTypeface() {
        return this.typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint ds) {
        getHighSpeedVideoFpsRangesFor(ds);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint paint) {
        getHighSpeedVideoFpsRangesFor(paint);
    }

    private final void getHighSpeedVideoFpsRangesFor(android.graphics.Paint p0) {
        p0.setTypeface(this.typeface);
    }
}
