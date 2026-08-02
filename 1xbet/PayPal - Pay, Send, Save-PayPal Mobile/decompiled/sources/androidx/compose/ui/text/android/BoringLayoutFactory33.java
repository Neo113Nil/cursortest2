package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJi\u0010\u000b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000b\u0010\u001bJ\u0017\u0010\u000b\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u000b\u0010\u001c"}, d2 = {"Landroidx/compose/ui/text/android/BoringLayoutFactory33;", "", "<init>", "()V", "", "p0", "Landroid/text/TextPaint;", "p1", "Landroid/text/TextDirectionHeuristic;", "p2", "Landroid/text/BoringLayout$Metrics;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;)Landroid/text/BoringLayout$Metrics;", "", "Landroid/text/Layout$Alignment;", "p3", "", "p4", "p5", "p6", "", "p7", "p8", "Landroid/text/TextUtils$TruncateAt;", "p9", "p10", "Landroid/text/BoringLayout;", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;Landroid/text/BoringLayout$Metrics;ZZLandroid/text/TextUtils$TruncateAt;I)Landroid/text/BoringLayout;", "(Landroid/text/BoringLayout;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BoringLayoutFactory33 {
    public static final androidx.compose.ui.text.android.BoringLayoutFactory33 INSTANCE = new androidx.compose.ui.text.android.BoringLayoutFactory33();

    private BoringLayoutFactory33() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.text.BoringLayout.Metrics getHighSpeedVideoFpsRangesFor(java.lang.CharSequence p0, android.text.TextPaint p1, android.text.TextDirectionHeuristic p2) {
        return android.text.BoringLayout.isBoring(p0, p1, p2, true, null);
    }

    @kotlin.jvm.JvmStatic
    public static final android.text.BoringLayout getHighSpeedVideoFpsRangesFor(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i, android.text.Layout.Alignment alignment, android.text.BoringLayout.Metrics metrics, boolean z, boolean z2, android.text.TextUtils.TruncateAt truncateAt, int i2) {
        return new android.text.BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2, z2);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getHighSpeedVideoFpsRangesFor(android.text.BoringLayout p0) {
        return p0.isFallbackLineSpacingEnabled();
    }
}
