package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0006\u0010\tJ\u001b\u0010\f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0010\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0016¢\u0006\u0004\b\u0010\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/layout/ColumnScopeInstance;", "Landroidx/compose/foundation/layout/ColumnScope;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "", "weight", "", "fill", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "align", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/VerticalAlignmentLine;", "alignmentLine", "alignBy", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/VerticalAlignmentLine;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLineBlock", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColumnScopeInstance implements androidx.compose.foundation.layout.ColumnScope {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.layout.ColumnScopeInstance INSTANCE = new androidx.compose.foundation.layout.ColumnScopeInstance();

    private ColumnScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final androidx.compose.ui.Modifier align(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment.Horizontal horizontal) {
        return modifier.then(new androidx.compose.foundation.layout.HorizontalAlignElement(horizontal));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final androidx.compose.ui.Modifier alignBy(androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.VerticalAlignmentLine verticalAlignmentLine) {
        return modifier.then(new androidx.compose.foundation.layout.WithAlignmentLineElement(verticalAlignmentLine));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final androidx.compose.ui.Modifier alignBy(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Measured, java.lang.Integer> function1) {
        return modifier.then(new androidx.compose.foundation.layout.WithAlignmentLineBlockElement(function1));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final androidx.compose.ui.Modifier weight(androidx.compose.ui.Modifier modifier, float f, boolean z) {
        if (f <= 0.0d) {
            androidx.compose.foundation.layout.internal.InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
        }
        return modifier.then(new androidx.compose.foundation.layout.LayoutWeightElement(kotlin.ranges.RangesKt.coerceAtMost(f, Float.MAX_VALUE), z));
    }
}
