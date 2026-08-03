package androidx.compose.ui.layout;

/* compiled from: AlignmentLine.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0000\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u000b"}, d2 = {"FirstBaseline", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "getFirstBaseline", "()Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "LastBaseline", "getLastBaseline", "merge", "", "Landroidx/compose/ui/layout/AlignmentLine;", "position1", "position2", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    private static final androidx.compose.ui.layout.HorizontalAlignmentLine FirstBaseline = new androidx.compose.ui.layout.HorizontalAlignmentLine(androidx.compose.ui.layout.AlignmentLineKt$FirstBaseline$1.INSTANCE);
    private static final androidx.compose.ui.layout.HorizontalAlignmentLine LastBaseline = new androidx.compose.ui.layout.HorizontalAlignmentLine(androidx.compose.ui.layout.AlignmentLineKt$LastBaseline$1.INSTANCE);

    public static final int merge(androidx.compose.ui.layout.AlignmentLine alignmentLine, int i, int i2) {
        return alignmentLine.getMerger$ui_release().invoke(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)).intValue();
    }

    public static final androidx.compose.ui.layout.HorizontalAlignmentLine getFirstBaseline() {
        return FirstBaseline;
    }

    public static final androidx.compose.ui.layout.HorizontalAlignmentLine getLastBaseline() {
        return LastBaseline;
    }
}
