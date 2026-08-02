package N0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    public Paint.FontMetricsInt f3735a;

    /* renamed from: b, reason: collision with root package name */
    public int f3736b;

    /* renamed from: c, reason: collision with root package name */
    public int f3737c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3738d;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f3735a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        l.k("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f3738d) {
            Q0.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f3737c;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i5, Paint.FontMetricsInt fontMetricsInt) {
        this.f3738d = true;
        paint.getTextSize();
        this.f3735a = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            Q0.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f3736b = (int) Math.ceil(0.0f);
        this.f3737c = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.f3738d) {
            Q0.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f3736b;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i5, float f, int i6, int i7, int i8, Paint paint) {
    }
}
