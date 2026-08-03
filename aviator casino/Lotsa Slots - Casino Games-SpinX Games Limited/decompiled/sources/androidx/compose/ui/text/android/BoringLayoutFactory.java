package androidx.compose.ui.text.android;

/* compiled from: BoringLayoutFactory.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JZ\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0004J \u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/android/BoringLayoutFactory;", "", "()V", "create", "Landroid/text/BoringLayout;", "text", "", "paint", "Landroid/text/TextPaint;", "width", "", "metrics", "Landroid/text/BoringLayout$Metrics;", "alignment", "Landroid/text/Layout$Alignment;", "includePadding", "", "useFallbackLineSpacing", com.helpshift.proactive.InAppViewConstants.ELLIPSIZE, "Landroid/text/TextUtils$TruncateAt;", "ellipsizedWidth", "isFallbackLineSpacingEnabled", "layout", "measure", "textDir", "Landroid/text/TextDirectionHeuristic;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BoringLayoutFactory {
    public static final int $stable = 0;
    public static final androidx.compose.ui.text.android.BoringLayoutFactory INSTANCE = new androidx.compose.ui.text.android.BoringLayoutFactory();

    private BoringLayoutFactory() {
    }

    public final android.text.BoringLayout.Metrics measure(java.lang.CharSequence text, android.text.TextPaint paint, android.text.TextDirectionHeuristic textDir) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.compose.ui.text.android.BoringLayoutFactory33.isBoring(text, paint, textDir);
        }
        return androidx.compose.ui.text.android.BoringLayoutFactoryDefault.isBoring(text, paint, textDir);
    }

    public final android.text.BoringLayout create(java.lang.CharSequence text, android.text.TextPaint paint, int width, android.text.BoringLayout.Metrics metrics, android.text.Layout.Alignment alignment, boolean includePadding, boolean useFallbackLineSpacing, android.text.TextUtils.TruncateAt ellipsize, int ellipsizedWidth) {
        if (width < 0) {
            throw new java.lang.IllegalArgumentException("negative width".toString());
        }
        if (ellipsizedWidth < 0) {
            throw new java.lang.IllegalArgumentException("negative ellipsized width".toString());
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.compose.ui.text.android.BoringLayoutFactory33.create(text, paint, width, alignment, 1.0f, 0.0f, metrics, includePadding, useFallbackLineSpacing, ellipsize, ellipsizedWidth);
        }
        return androidx.compose.ui.text.android.BoringLayoutFactoryDefault.create(text, paint, width, alignment, 1.0f, 0.0f, metrics, includePadding, ellipsize, ellipsizedWidth);
    }

    public final boolean isFallbackLineSpacingEnabled(android.text.BoringLayout layout) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.compose.ui.text.android.BoringLayoutFactory33.INSTANCE.isFallbackLineSpacingEnabled(layout);
        }
        return false;
    }
}
