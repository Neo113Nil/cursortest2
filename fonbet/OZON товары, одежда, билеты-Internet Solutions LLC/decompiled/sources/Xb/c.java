package Xb;

import Vb.r;
import Ve.E;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class c extends MetricAffectingSpan implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    private final r f34249a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f34250b = h.b();

    /* renamed from: c, reason: collision with root package name */
    private final Paint f34251c = h.a();

    public c(@NonNull r rVar) {
        this.f34249a = rVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int i18;
        Paint paint2 = this.f34251c;
        paint2.setStyle(Paint.Style.FILL);
        this.f34249a.getClass();
        paint2.setColor(E.h(paint.getColor(), 25));
        if (i12 > 0) {
            i18 = canvas.getWidth();
        } else {
            i11 -= canvas.getWidth();
            i18 = i11;
        }
        Rect rect = this.f34250b;
        rect.set(i11, i13, i18, i15);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z11) {
        return this.f34249a.i();
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f34249a.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f34249a.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
