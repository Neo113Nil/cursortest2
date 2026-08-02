package androidx.compose.ui.text.android.selection;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinderApi29;", "Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinder;", "", "text", "Landroid/text/TextPaint;", "textPaint", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)V", "", "offset", "previous", "(I)I", io.ktor.http.LinkHeader.Rel.Next, "getHighSpeedVideoFpsRangesFor", "Ljava/lang/CharSequence;", "getHighSpeedVideoFpsRanges", "Landroid/text/TextPaint;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GraphemeClusterSegmentFinderApi29 extends androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder {
    public static final int $stable = 8;
    private final android.text.TextPaint getHighSpeedVideoFpsRanges;
    private final java.lang.CharSequence getHighSpeedVideoFpsRangesFor;

    public GraphemeClusterSegmentFinderApi29(java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        this.getHighSpeedVideoFpsRangesFor = charSequence;
        this.getHighSpeedVideoFpsRanges = textPaint;
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public final int previous(int offset) {
        android.text.TextPaint textPaint = this.getHighSpeedVideoFpsRanges;
        java.lang.CharSequence charSequence = this.getHighSpeedVideoFpsRangesFor;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, offset, 2);
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public final int next(int offset) {
        android.text.TextPaint textPaint = this.getHighSpeedVideoFpsRanges;
        java.lang.CharSequence charSequence = this.getHighSpeedVideoFpsRangesFor;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, offset, 0);
    }
}
