package Xb;

import Vb.r;
import Ve.E;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class d extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    private final r f34252a;

    public d(@NonNull r rVar) {
        this.f34252a = rVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        r rVar = this.f34252a;
        rVar.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
        rVar.getClass();
        textPaint.bgColor = E.h(textPaint.getColor(), 25);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f34252a.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
