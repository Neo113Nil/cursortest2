package androidx.compose.ui.text.android.selection;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordSegmentFinder;", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "", "text", "Landroidx/compose/ui/text/android/selection/WordIterator;", "wordIterator", "<init>", "(Ljava/lang/CharSequence;Landroidx/compose/ui/text/android/selection/WordIterator;)V", "", "offset", "previousStartBoundary", "(I)I", "previousEndBoundary", "nextStartBoundary", "nextEndBoundary", "Camera2StreamConfigurationMap", "Ljava/lang/CharSequence;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/text/android/selection/WordIterator;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WordSegmentFinder implements androidx.compose.ui.text.android.selection.SegmentFinder {
    public static final int $stable = 8;
    private final java.lang.CharSequence Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.text.android.selection.WordIterator getHighSpeedVideoFpsRangesFor;

    public WordSegmentFinder(java.lang.CharSequence charSequence, androidx.compose.ui.text.android.selection.WordIterator wordIterator) {
        this.Camera2StreamConfigurationMap = charSequence;
        this.getHighSpeedVideoFpsRangesFor = wordIterator;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int previousStartBoundary(int offset) {
        do {
            offset = this.getHighSpeedVideoFpsRangesFor.prevBoundary(offset);
            if (offset == -1) {
                return -1;
            }
        } while (java.lang.Character.isWhitespace(this.Camera2StreamConfigurationMap.charAt(offset)));
        return offset;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int previousEndBoundary(int offset) {
        do {
            offset = this.getHighSpeedVideoFpsRangesFor.prevBoundary(offset);
            if (offset == -1 || offset == 0) {
                return -1;
            }
        } while (java.lang.Character.isWhitespace(this.Camera2StreamConfigurationMap.charAt(offset - 1)));
        return offset;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int nextStartBoundary(int offset) {
        do {
            offset = this.getHighSpeedVideoFpsRangesFor.nextBoundary(offset);
            if (offset == -1 || offset == this.Camera2StreamConfigurationMap.length()) {
                return -1;
            }
        } while (java.lang.Character.isWhitespace(this.Camera2StreamConfigurationMap.charAt(offset)));
        return offset;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int nextEndBoundary(int offset) {
        do {
            offset = this.getHighSpeedVideoFpsRangesFor.nextBoundary(offset);
            if (offset == -1) {
                return -1;
            }
        } while (java.lang.Character.isWhitespace(this.Camera2StreamConfigurationMap.charAt(offset - 1)));
        return offset;
    }
}
