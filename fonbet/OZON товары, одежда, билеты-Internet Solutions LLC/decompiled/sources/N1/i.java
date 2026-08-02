package N1;

import Cf0.O;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    private final float f18387a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18388b;

    /* renamed from: c, reason: collision with root package name */
    private final float f18389c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18390d;

    /* renamed from: e, reason: collision with root package name */
    private final float f18391e;

    /* renamed from: f, reason: collision with root package name */
    private final int f18392f;

    /* renamed from: g, reason: collision with root package name */
    private Paint.FontMetricsInt f18393g;

    /* renamed from: h, reason: collision with root package name */
    private int f18394h;

    /* renamed from: i, reason: collision with root package name */
    private int f18395i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18396j;

    public i(float f7, float f11, float f12, int i11, int i12, int i13) {
        this.f18387a = f7;
        this.f18388b = i11;
        this.f18389c = f11;
        this.f18390d = i12;
        this.f18391e = f12;
        this.f18392f = i13;
    }

    @NotNull
    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f18393g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.n("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.f18396j) {
            return this.f18395i;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    public final int c() {
        return this.f18392f;
    }

    public final int d() {
        if (this.f18396j) {
            return this.f18394h;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(@NotNull Canvas canvas, CharSequence charSequence, int i11, int i12, float f7, int i13, int i14, int i15, @NotNull Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public final int getSize(@NotNull Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        float f7;
        int d11;
        this.f18396j = true;
        float textSize = paint.getTextSize();
        this.f18393g = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        float f11 = this.f18391e;
        float f12 = this.f18387a;
        int i13 = this.f18388b;
        if (i13 == 0) {
            f7 = f12 * f11;
        } else {
            if (i13 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f7 = f12 * textSize;
        }
        this.f18394h = O.d(f7);
        float f13 = this.f18389c;
        int i14 = this.f18390d;
        if (i14 == 0) {
            d11 = O.d(f13 * f11);
        } else {
            if (i14 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            d11 = O.d(f13 * textSize);
        }
        this.f18395i = d11;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f18392f) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int b11 = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = b11;
                        fontMetricsInt.descent = b() + b11;
                        break;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown verticalAlign.");
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return d();
    }
}
