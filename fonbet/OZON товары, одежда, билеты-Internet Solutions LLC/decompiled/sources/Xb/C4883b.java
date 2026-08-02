package Xb;

import Vb.r;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* renamed from: Xb.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C4883b implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    private r f34244a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f34245b = h.a();

    /* renamed from: c, reason: collision with root package name */
    private final RectF f34246c = h.c();

    /* renamed from: d, reason: collision with root package name */
    private final Rect f34247d = h.b();

    /* renamed from: e, reason: collision with root package name */
    private final int f34248e;

    public C4883b(@NonNull r rVar, int i11) {
        this.f34244a = rVar;
        this.f34248e = i11;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        Rect rect = this.f34247d;
        if (z11 && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i16) {
            Paint paint2 = this.f34245b;
            paint2.set(paint);
            r rVar = this.f34244a;
            rVar.c(paint2);
            int save = canvas.save();
            try {
                int f7 = rVar.f();
                int h11 = rVar.h((int) ((paint2.descent() - paint2.ascent()) + 0.5f));
                int i18 = (f7 - h11) / 2;
                if (i12 <= 0) {
                    i11 -= f7;
                }
                int i19 = i11 + i18;
                int i21 = i19 + h11;
                int descent = (i14 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (h11 / 2);
                int i22 = h11 + descent;
                int i23 = this.f34248e;
                if (i23 == 0 || i23 == 1) {
                    RectF rectF = this.f34246c;
                    rectF.set(i19, descent, i21, i22);
                    paint2.setStyle(i23 == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(rectF, paint2);
                } else {
                    rect.set(i19, descent, i21, i22);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                }
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z11) {
        return this.f34244a.f();
    }
}
