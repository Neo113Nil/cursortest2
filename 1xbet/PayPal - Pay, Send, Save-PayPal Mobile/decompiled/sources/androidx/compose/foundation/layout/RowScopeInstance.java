package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0006\u0010\tJ\u001b\u0010\f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u0004*\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0010\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0016¢\u0006\u0004\b\u0010\u0010\u0018"}, d2 = {"Landroidx/compose/foundation/layout/RowScopeInstance;", "Landroidx/compose/foundation/layout/RowScope;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "", "weight", "", "fill", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Vertical;", "alignment", "align", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignmentLine", "alignBy", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/HorizontalAlignmentLine;)Landroidx/compose/ui/Modifier;", "alignByBaseline", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLineBlock", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RowScopeInstance implements androidx.compose.foundation.layout.RowScope {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.layout.RowScopeInstance INSTANCE = new androidx.compose.foundation.layout.RowScopeInstance();

    private RowScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final androidx.compose.ui.Modifier align(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment.Vertical vertical) {
        return modifier.then(new androidx.compose.foundation.layout.VerticalAlignElement(vertical));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final androidx.compose.ui.Modifier alignBy(androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.HorizontalAlignmentLine horizontalAlignmentLine) {
        return modifier.then(new androidx.compose.foundation.layout.WithAlignmentLineElement(horizontalAlignmentLine));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final androidx.compose.ui.Modifier alignByBaseline(androidx.compose.ui.Modifier modifier) {
        return alignBy(modifier, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final androidx.compose.ui.Modifier alignBy(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Measured, java.lang.Integer> function1) {
        return modifier.then(new androidx.compose.foundation.layout.WithAlignmentLineBlockElement(function1));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final androidx.compose.ui.Modifier weight(androidx.compose.ui.Modifier modifier, float f, boolean z) {
        if (f <= 0.0d) {
            androidx.compose.foundation.layout.internal.InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
        }
        return modifier.then(new androidx.compose.foundation.layout.LayoutWeightElement(kotlin.ranges.RangesKt.coerceAtMost(f, Float.MAX_VALUE), z));
    }
}
