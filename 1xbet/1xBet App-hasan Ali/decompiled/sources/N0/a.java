package N0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3717a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3718b;

    public /* synthetic */ a(int i, float f) {
        this.f3717a = i;
        this.f3718b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f3717a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f3718b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f3718b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f3717a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f3718b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f3718b);
                break;
        }
    }
}
