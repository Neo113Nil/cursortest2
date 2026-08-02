package bc;

import Gl.C3124a;
import Vb.r;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* renamed from: bc.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5632h extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    private final r f55879a;

    /* renamed from: b, reason: collision with root package name */
    private final C5625a f55880b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f55881c;

    public C5632h(@NonNull r rVar, @NonNull C5625a c5625a, boolean z11) {
        this.f55879a = rVar;
        this.f55880b = c5625a;
        this.f55881c = z11;
    }

    @NonNull
    public final C5625a a() {
        return this.f55880b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(@NonNull Canvas canvas, CharSequence charSequence, int i11, int i12, float f7, int i13, int i14, int i15, @NonNull Paint paint) {
        int width;
        C5625a c5625a;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Xb.k[] kVarArr = (Xb.k[]) spanned.getSpans(0, spanned.length(), Xb.k.class);
            if (kVarArr != null && kVarArr.length > 0) {
                kVarArr[0].getClass();
                throw null;
            }
            TextView b11 = Xb.l.b(spanned);
            if (b11 != null) {
                width = (b11.getWidth() - b11.getPaddingLeft()) - b11.getPaddingRight();
                float textSize = paint.getTextSize();
                c5625a = this.f55880b;
                c5625a.d(textSize, width);
                if (!c5625a.b()) {
                    int i16 = i15 - c5625a.getBounds().bottom;
                    int save = canvas.save();
                    try {
                        canvas.translate(f7, i16);
                        c5625a.draw(canvas);
                        return;
                    } finally {
                        canvas.restoreToCount(save);
                    }
                }
                float a11 = (int) (C3124a.a(i15, i13, 2, i13) - (((paint.ascent() + paint.descent()) / 2.0f) + 0.5f));
                if (this.f55881c) {
                    this.f55879a.getClass();
                    paint.setUnderlineText(true);
                    if (paint instanceof TextPaint) {
                        paint.setColor(((TextPaint) paint).linkColor);
                    }
                }
                canvas.drawText(charSequence, i11, i12, f7, a11, paint);
                return;
            }
        }
        width = canvas.getWidth();
        float textSize2 = paint.getTextSize();
        c5625a = this.f55880b;
        c5625a.d(textSize2, width);
        if (!c5625a.b()) {
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@NonNull Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        C5625a c5625a = this.f55880b;
        if (!c5625a.b()) {
            if (this.f55881c) {
                this.f55879a.getClass();
                paint.setUnderlineText(true);
                if (paint instanceof TextPaint) {
                    paint.setColor(((TextPaint) paint).linkColor);
                }
            }
            return (int) (paint.measureText(charSequence, i11, i12) + 0.5f);
        }
        Rect bounds = c5625a.getBounds();
        if (fontMetricsInt != null) {
            int i13 = -bounds.bottom;
            fontMetricsInt.ascent = i13;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i13;
            fontMetricsInt.bottom = 0;
        }
        return bounds.right;
    }
}
