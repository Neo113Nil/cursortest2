package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n"}, d2 = {"Landroidx/compose/ui/layout/AlignmentLine;", "", "position1", "position2", "merge", "(Landroidx/compose/ui/layout/AlignmentLine;II)I", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "FirstBaseline", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "getFirstBaseline", "()Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "LastBaseline", "getLastBaseline"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    private static final androidx.compose.ui.layout.HorizontalAlignmentLine FirstBaseline = new androidx.compose.ui.layout.HorizontalAlignmentLine(androidx.compose.ui.layout.AlignmentLineKt$FirstBaseline$1.getHighSpeedVideoSizes);
    private static final androidx.compose.ui.layout.HorizontalAlignmentLine LastBaseline = new androidx.compose.ui.layout.HorizontalAlignmentLine(androidx.compose.ui.layout.AlignmentLineKt$LastBaseline$1.getHighSpeedVideoFpsRangesFor);

    public static final int merge(androidx.compose.ui.layout.AlignmentLine alignmentLine, int i, int i2) {
        return alignmentLine.getMerger$ui().invoke(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)).intValue();
    }

    public static final androidx.compose.ui.layout.HorizontalAlignmentLine getFirstBaseline() {
        return FirstBaseline;
    }

    public static final androidx.compose.ui.layout.HorizontalAlignmentLine getLastBaseline() {
        return LastBaseline;
    }
}
