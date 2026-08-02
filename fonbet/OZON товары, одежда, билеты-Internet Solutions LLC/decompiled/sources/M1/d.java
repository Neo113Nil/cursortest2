package M1;

import android.text.TextPaint;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CharSequence f17233a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final TextPaint f17234b;

    public d(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint) {
        this.f17233a = charSequence;
        this.f17234b = textPaint;
    }

    @Override // M1.b
    public final int r(int i11) {
        int textRunCursor;
        CharSequence charSequence = this.f17233a;
        textRunCursor = this.f17234b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i11, 0);
        return textRunCursor;
    }

    @Override // M1.b
    public final int s(int i11) {
        int textRunCursor;
        CharSequence charSequence = this.f17233a;
        textRunCursor = this.f17234b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i11, 2);
        return textRunCursor;
    }
}
