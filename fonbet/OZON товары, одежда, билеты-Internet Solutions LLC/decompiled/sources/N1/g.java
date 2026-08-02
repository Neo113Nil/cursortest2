package N1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class g implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    private final float f18375a;

    public g(float f7) {
        this.f18375a = f7;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(@NotNull CharSequence charSequence, int i11, int i12, int i13, int i14, @NotNull Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(fontMetricsInt.descent * ((r4 * 1.0f) / r3));
        fontMetricsInt.descent = ceil;
        fontMetricsInt.ascent = ceil - ((int) Math.ceil(this.f18375a));
    }
}
