package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJa\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/ui/text/android/BoringLayoutFactory;", "", "<init>", "()V", "", "text", "Landroid/text/TextPaint;", "paint", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/BoringLayout$Metrics;", "measure", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;)Landroid/text/BoringLayout$Metrics;", "", "width", com.datadog.android.trace.internal.domain.event.SpanEventSerializer.METRICS_KEY_PREFIX, "Landroid/text/Layout$Alignment;", "alignment", "", "includePadding", "useFallbackLineSpacing", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "Landroid/text/BoringLayout;", "create", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/BoringLayout$Metrics;Landroid/text/Layout$Alignment;ZZLandroid/text/TextUtils$TruncateAt;I)Landroid/text/BoringLayout;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "isFallbackLineSpacingEnabled", "(Landroid/text/BoringLayout;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BoringLayoutFactory {
    public static final int $stable = 0;
    public static final androidx.compose.ui.text.android.BoringLayoutFactory INSTANCE = new androidx.compose.ui.text.android.BoringLayoutFactory();

    private BoringLayoutFactory() {
    }

    public final android.text.BoringLayout.Metrics measure(java.lang.CharSequence text, android.text.TextPaint paint, android.text.TextDirectionHeuristic textDir) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.compose.ui.text.android.BoringLayoutFactory33.getHighSpeedVideoFpsRangesFor(text, paint, textDir);
        }
        return androidx.compose.ui.text.android.BoringLayoutFactoryDefault.getHighSpeedVideoFpsRanges(text, paint, textDir);
    }

    public final boolean isFallbackLineSpacingEnabled(android.text.BoringLayout layout) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.compose.ui.text.android.BoringLayoutFactory33.getHighSpeedVideoFpsRangesFor(layout);
        }
        return false;
    }

    public final android.text.BoringLayout create(java.lang.CharSequence text, android.text.TextPaint paint, int width, android.text.BoringLayout.Metrics metrics, android.text.Layout.Alignment alignment, boolean includePadding, boolean useFallbackLineSpacing, android.text.TextUtils.TruncateAt ellipsize, int ellipsizedWidth) {
        if (width < 0) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("negative width");
        }
        if (ellipsizedWidth < 0) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("negative ellipsized width");
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.compose.ui.text.android.BoringLayoutFactory33.getHighSpeedVideoFpsRangesFor(text, paint, width, alignment, metrics, includePadding, useFallbackLineSpacing, ellipsize, ellipsizedWidth);
        }
        return androidx.compose.ui.text.android.BoringLayoutFactoryDefault.getHighResolutionOutputSizeshNQ4ISI(text, paint, width, alignment, metrics, includePadding, ellipsize, ellipsizedWidth);
    }
}
