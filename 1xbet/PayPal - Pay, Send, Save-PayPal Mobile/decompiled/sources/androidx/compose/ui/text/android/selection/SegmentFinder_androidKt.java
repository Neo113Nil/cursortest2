package androidx.compose.ui.text.android.selection;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "text", "Landroid/text/TextPaint;", "textPaint", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "createGraphemeClusterSegmentFinder", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Landroidx/compose/ui/text/android/selection/SegmentFinder;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SegmentFinder_androidKt {
    public static final androidx.compose.ui.text.android.selection.SegmentFinder createGraphemeClusterSegmentFinder(java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return new androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinderApi29(charSequence, textPaint);
        }
        return new androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinderUnderApi29(charSequence);
    }
}
