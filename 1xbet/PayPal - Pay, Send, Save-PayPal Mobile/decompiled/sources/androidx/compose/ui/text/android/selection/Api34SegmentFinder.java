package androidx.compose.ui.text.android.selection;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/text/android/selection/Api34SegmentFinder;", "", "<init>", "()V", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "Landroid/text/SegmentFinder;", "toAndroidSegmentFinder$ui_text", "(Landroidx/compose/ui/text/android/selection/SegmentFinder;)Landroid/text/SegmentFinder;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Api34SegmentFinder {
    public static final int $stable = 0;
    public static final androidx.compose.ui.text.android.selection.Api34SegmentFinder INSTANCE = new androidx.compose.ui.text.android.selection.Api34SegmentFinder();

    private Api34SegmentFinder() {
    }

    public final android.text.SegmentFinder toAndroidSegmentFinder$ui_text(final androidx.compose.ui.text.android.selection.SegmentFinder segmentFinder) {
        return new android.text.SegmentFinder() { // from class: androidx.compose.ui.text.android.selection.Api34SegmentFinder$toAndroidSegmentFinder$1
            @Override // android.text.SegmentFinder
            public final int previousStartBoundary(int offset) {
                return androidx.compose.ui.text.android.selection.SegmentFinder.this.previousStartBoundary(offset);
            }

            @Override // android.text.SegmentFinder
            public final int previousEndBoundary(int offset) {
                return androidx.compose.ui.text.android.selection.SegmentFinder.this.previousEndBoundary(offset);
            }

            @Override // android.text.SegmentFinder
            public final int nextStartBoundary(int offset) {
                return androidx.compose.ui.text.android.selection.SegmentFinder.this.nextStartBoundary(offset);
            }

            @Override // android.text.SegmentFinder
            public final int nextEndBoundary(int offset) {
                return androidx.compose.ui.text.android.selection.SegmentFinder.this.nextEndBoundary(offset);
            }
        };
    }
}
