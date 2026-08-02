package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public abstract class p extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final w f42731b;

    /* renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f42730a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    private short f42732c = -1;

    /* renamed from: d, reason: collision with root package name */
    private float f42733d = 1.0f;

    p(@NonNull w wVar) {
        x2.i.e(wVar, "rasterizer cannot be null");
        this.f42731b = wVar;
    }

    @NonNull
    public final w a() {
        return this.f42731b;
    }

    final int b() {
        return this.f42732c;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@NonNull Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f42730a;
        paint.getFontMetricsInt(fontMetricsInt2);
        w wVar = this.f42731b;
        this.f42733d = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / wVar.e();
        wVar.e();
        short i13 = (short) (wVar.i() * this.f42733d);
        this.f42732c = i13;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return i13;
    }
}
