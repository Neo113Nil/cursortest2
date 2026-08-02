package S1;

import android.text.TextPaint;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class g {
    public static final void a(@NotNull TextPaint textPaint, float f7) {
        if (Float.isNaN(f7)) {
            return;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f7 * 255));
    }
}
