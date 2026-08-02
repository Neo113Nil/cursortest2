package Xb;

import Gl.C3124a;
import Vb.r;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class m implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    private final r f34268a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f34269b = h.b();

    /* renamed from: c, reason: collision with root package name */
    private final Paint f34270c = h.a();

    public m(@NonNull r rVar) {
        this.f34268a = rVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int i18;
        int a11 = C3124a.a(i15, i13, 2, i13);
        Paint paint2 = this.f34270c;
        paint2.set(paint);
        this.f34268a.d(paint2);
        int strokeWidth = (int) ((((int) (paint2.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i12 > 0) {
            i18 = canvas.getWidth();
        } else {
            i18 = i11;
            i11 -= canvas.getWidth();
        }
        int i19 = a11 - strokeWidth;
        int i21 = a11 + strokeWidth;
        Rect rect = this.f34269b;
        rect.set(i11, i19, i18, i21);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z11) {
        return 0;
    }
}
