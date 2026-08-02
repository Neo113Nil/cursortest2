package N0;

import L0.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i5, int i6, int i7, int i8, CharSequence charSequence, int i9, int i10, boolean z3, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i9)) != layout.getLineCount() - 1) {
            return;
        }
        L0.j jVar = l.f3029a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float A3 = AbstractC2349a.A(layout, lineForOffset, paint) + AbstractC2349a.z(layout, lineForOffset, paint);
            if (A3 == 0.0f) {
                return;
            }
            kotlin.jvm.internal.l.c(canvas);
            canvas.translate(A3, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z3) {
        return 0;
    }
}
