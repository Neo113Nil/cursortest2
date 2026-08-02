package N1;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class m extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Typeface f18404a;

    public m(@NotNull Typeface typeface) {
        this.f18404a = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@NotNull TextPaint textPaint) {
        textPaint.setTypeface(this.f18404a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@NotNull TextPaint textPaint) {
        textPaint.setTypeface(this.f18404a);
    }
}
