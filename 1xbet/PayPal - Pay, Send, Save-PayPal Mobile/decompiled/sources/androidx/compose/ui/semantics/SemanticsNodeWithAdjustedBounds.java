package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNodeWithAdjustedBounds;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "Landroidx/compose/ui/unit/IntRect;", "adjustedBounds", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/unit/IntRect;)V", "Landroidx/compose/ui/semantics/SemanticsNode;", "getSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "Landroidx/compose/ui/unit/IntRect;", "getAdjustedBounds", "()Landroidx/compose/ui/unit/IntRect;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsNodeWithAdjustedBounds {
    public static final int $stable = 8;
    private final androidx.compose.ui.unit.IntRect adjustedBounds;
    private final androidx.compose.ui.semantics.SemanticsNode semanticsNode;

    public SemanticsNodeWithAdjustedBounds(androidx.compose.ui.semantics.SemanticsNode semanticsNode, androidx.compose.ui.unit.IntRect intRect) {
        this.semanticsNode = semanticsNode;
        this.adjustedBounds = intRect;
    }

    public final androidx.compose.ui.semantics.SemanticsNode getSemanticsNode() {
        return this.semanticsNode;
    }

    public final androidx.compose.ui.unit.IntRect getAdjustedBounds() {
        return this.adjustedBounds;
    }
}
