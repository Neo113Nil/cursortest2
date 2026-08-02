package N0;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3719a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3720b;

    public /* synthetic */ b(int i, Object obj) {
        this.f3719a = i;
        this.f3720b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f3719a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f3720b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f3720b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f3719a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f3720b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f3720b);
                break;
        }
    }
}
