package androidx.compose.ui.text.android.selection;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000b\u001a\u0006*\u00020\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinderUnderApi29;", "Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinder;", "", "text", "<init>", "(Ljava/lang/CharSequence;)V", "", "offset", "previous", "(I)I", io.ktor.http.LinkHeader.Rel.Next, "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/CharSequence;", "Camera2StreamConfigurationMap", "Ljava/text/BreakIterator;", "getHighSpeedVideoSizes", "Ljava/text/BreakIterator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GraphemeClusterSegmentFinderUnderApi29 extends androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.CharSequence Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.text.BreakIterator getHighResolutionOutputSizeshNQ4ISI;

    public GraphemeClusterSegmentFinderUnderApi29(java.lang.CharSequence charSequence) {
        this.Camera2StreamConfigurationMap = charSequence;
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.getHighResolutionOutputSizeshNQ4ISI = characterInstance;
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public final int previous(int offset) {
        return this.getHighResolutionOutputSizeshNQ4ISI.preceding(offset);
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public final int next(int offset) {
        return this.getHighResolutionOutputSizeshNQ4ISI.following(offset);
    }
}
