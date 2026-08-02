package N0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f3725a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3726b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3727c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3728d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3729e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public int f3730g = Integer.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public int f3731h = Integer.MIN_VALUE;
    public int i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public int f3732j = Integer.MIN_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public int f3733k;

    /* renamed from: l, reason: collision with root package name */
    public int f3734l;

    public h(float f, int i, boolean z3, boolean z5, float f5, boolean z6) {
        this.f3725a = f;
        this.f3726b = i;
        this.f3727c = z3;
        this.f3728d = z5;
        this.f3729e = f5;
        this.f = z6;
        if ((0.0f > f5 || f5 > 1.0f) && f5 != -1.0f) {
            Q0.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i5, int i6, int i7, Paint.FontMetricsInt fontMetricsInt) {
        int i8 = fontMetricsInt.descent;
        int i9 = fontMetricsInt.ascent;
        if (i8 - i9 <= 0) {
            return;
        }
        boolean z3 = i == 0;
        boolean z5 = i5 == this.f3726b;
        boolean z6 = this.f3728d;
        boolean z7 = this.f3727c;
        if (z3 && z5 && z7 && z6) {
            return;
        }
        if (this.f3730g == Integer.MIN_VALUE) {
            int i10 = i8 - i9;
            int ceil = (int) Math.ceil(this.f3725a);
            int i11 = ceil - i10;
            if (!this.f || i11 > 0) {
                float f = this.f3729e;
                if (f == -1.0f) {
                    f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i11 <= 0 ? Math.ceil(i11 * f) : Math.ceil((1.0f - f) * i11));
                int i12 = fontMetricsInt.descent;
                int i13 = ceil2 + i12;
                this.i = i13;
                int i14 = i13 - ceil;
                this.f3731h = i14;
                if (z7) {
                    i14 = fontMetricsInt.ascent;
                }
                this.f3730g = i14;
                if (z6) {
                    i13 = i12;
                }
                this.f3732j = i13;
                this.f3733k = fontMetricsInt.ascent - i14;
                this.f3734l = i13 - i12;
            } else {
                int i15 = fontMetricsInt.ascent;
                this.f3731h = i15;
                int i16 = fontMetricsInt.descent;
                this.i = i16;
                this.f3730g = i15;
                this.f3732j = i16;
                this.f3733k = 0;
                this.f3734l = 0;
            }
        }
        fontMetricsInt.ascent = z3 ? this.f3730g : this.f3731h;
        fontMetricsInt.descent = z5 ? this.f3732j : this.i;
    }
}
