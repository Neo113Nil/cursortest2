package Xb;

import Vb.r;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class f extends MetricAffectingSpan implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    private final r f34253a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f34254b = h.b();

    /* renamed from: c, reason: collision with root package name */
    private final Paint f34255c = h.a();

    /* renamed from: d, reason: collision with root package name */
    private final int f34256d;

    public f(@NonNull r rVar, int i11) {
        this.f34253a = rVar;
        this.f34256d = i11;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int i18;
        int i19 = this.f34256d;
        if ((i19 == 1 || i19 == 2) && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i17) {
            Paint paint2 = this.f34255c;
            paint2.set(paint);
            this.f34253a.a(paint2);
            float strokeWidth = paint2.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i21 = (int) ((i15 - strokeWidth) + 0.5f);
                if (i12 > 0) {
                    i18 = canvas.getWidth();
                } else {
                    i18 = i11;
                    i11 -= canvas.getWidth();
                }
                Rect rect = this.f34254b;
                rect.set(i11, i21, i18, i15);
                canvas.drawRect(rect, paint2);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z11) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f34253a.b(textPaint, this.f34256d);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f34253a.b(textPaint, this.f34256d);
    }
}
