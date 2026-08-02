package N1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    private final float f18376a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18377b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18378c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18379d;

    /* renamed from: e, reason: collision with root package name */
    private final float f18380e;

    /* renamed from: f, reason: collision with root package name */
    private int f18381f = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: g, reason: collision with root package name */
    private int f18382g = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: h, reason: collision with root package name */
    private int f18383h = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: i, reason: collision with root package name */
    private int f18384i = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: j, reason: collision with root package name */
    private int f18385j;

    /* renamed from: k, reason: collision with root package name */
    private int f18386k;

    public h(float f7, int i11, boolean z11, boolean z12, float f11) {
        this.f18376a = f7;
        this.f18377b = i11;
        this.f18378c = z11;
        this.f18379d = z12;
        this.f18380e = f11;
        if ((0.0f > f11 || f11 > 1.0f) && f11 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    @NotNull
    public final h a(int i11, boolean z11) {
        return new h(this.f18376a, i11, z11, this.f18379d, this.f18380e);
    }

    public final int b() {
        return this.f18385j;
    }

    public final int c() {
        return this.f18386k;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(@NotNull CharSequence charSequence, int i11, int i12, int i13, int i14, @NotNull Paint.FontMetricsInt fontMetricsInt) {
        int i15 = fontMetricsInt.descent;
        int i16 = fontMetricsInt.ascent;
        if (i15 - i16 <= 0) {
            return;
        }
        boolean z11 = i11 == 0;
        boolean z12 = i12 == this.f18377b;
        boolean z13 = this.f18379d;
        boolean z14 = this.f18378c;
        if (z11 && z12 && z14 && z13) {
            return;
        }
        if (this.f18381f == Integer.MIN_VALUE) {
            int i17 = i15 - i16;
            int ceil = (int) Math.ceil(this.f18376a);
            int i18 = ceil - i17;
            float f7 = this.f18380e;
            if (f7 == -1.0f) {
                f7 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            int ceil2 = (int) (i18 <= 0 ? Math.ceil(i18 * f7) : Math.ceil((1.0f - f7) * i18));
            int i19 = fontMetricsInt.descent;
            int i21 = ceil2 + i19;
            this.f18383h = i21;
            int i22 = i21 - ceil;
            this.f18382g = i22;
            if (z14) {
                i22 = fontMetricsInt.ascent;
            }
            this.f18381f = i22;
            if (z13) {
                i21 = i19;
            }
            this.f18384i = i21;
            this.f18385j = fontMetricsInt.ascent - i22;
            this.f18386k = i21 - i19;
        }
        fontMetricsInt.ascent = z11 ? this.f18381f : this.f18382g;
        fontMetricsInt.descent = z12 ? this.f18384i : this.f18383h;
    }

    public final boolean d() {
        return this.f18379d;
    }
}
