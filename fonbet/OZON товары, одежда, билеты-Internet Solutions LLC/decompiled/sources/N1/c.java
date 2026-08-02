package N1;

import L1.Y;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i16)) != layout.getLineCount() - 1) {
            return;
        }
        int i18 = Y.f16186c;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float b11 = d.b(layout, lineForOffset, paint) + d.a(layout, lineForOffset, paint);
            if (b11 == 0.0f) {
                return;
            }
            Intrinsics.f(canvas);
            canvas.translate(b11, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z11) {
        return 0;
    }
}
