package Xb;

import Vb.r;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class i implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    private final r f34263a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34264b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f34265c = h.a();

    /* renamed from: d, reason: collision with root package name */
    private int f34266d;

    public i(@NonNull r rVar, @NonNull String str) {
        this.f34263a = rVar;
        this.f34264b = str;
    }

    public static void a(@NonNull TextView textView, @NonNull Spanned spanned) {
        if (spanned == null) {
            return;
        }
        i[] iVarArr = (i[]) spanned.getSpans(0, spanned.length(), i.class);
        if (iVarArr != null) {
            TextPaint paint = textView.getPaint();
            for (i iVar : iVarArr) {
                iVar.f34266d = (int) (paint.measureText(iVar.f34264b) + 0.5f);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int i18;
        if (z11 && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i16) {
            Paint paint2 = this.f34265c;
            paint2.set(paint);
            r rVar = this.f34263a;
            rVar.c(paint2);
            String str = this.f34264b;
            int measureText = (int) (paint2.measureText(str) + 0.5f);
            int f7 = rVar.f();
            if (measureText > f7) {
                this.f34266d = measureText;
                f7 = measureText;
            } else {
                this.f34266d = 0;
            }
            if (i12 > 0) {
                i18 = ((f7 * i12) + i11) - measureText;
            } else {
                i18 = (f7 - measureText) + (i12 * f7) + i11;
            }
            canvas.drawText(str, i18, i14, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z11) {
        return Math.max(this.f34266d, this.f34263a.f());
    }
}
