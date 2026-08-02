package L1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;

/* renamed from: L1.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3542f {
    @NotNull
    public static final BoringLayout a(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i11, @NotNull Layout.Alignment alignment, float f7, float f11, @NotNull BoringLayout.Metrics metrics, boolean z11, boolean z12, TextUtils.TruncateAt truncateAt, int i12) {
        return C3541e.a(charSequence, textPaint, i11, alignment, f7, f11, metrics, z11, z12, truncateAt, i12);
    }

    public static final BoringLayout.Metrics b(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, @NotNull TextDirectionHeuristic textDirectionHeuristic) {
        BoringLayout.Metrics isBoring;
        isBoring = BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
        return isBoring;
    }

    public static final boolean c(@NotNull BoringLayout boringLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = boringLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }
}
