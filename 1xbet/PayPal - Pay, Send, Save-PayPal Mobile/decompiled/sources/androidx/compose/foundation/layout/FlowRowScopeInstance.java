package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u0005*\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001c"}, d2 = {"Landroidx/compose/foundation/layout/FlowRowScopeInstance;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/foundation/layout/FlowRowScope;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "", "fraction", "fillMaxRowHeight", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Vertical;", "alignment", "align", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignmentLine", "alignBy", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/HorizontalAlignmentLine;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLineBlock", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "alignByBaseline", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "weight", "", "fill", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlowRowScopeInstance implements androidx.compose.foundation.layout.RowScope, androidx.compose.foundation.layout.FlowRowScope {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.layout.FlowRowScopeInstance INSTANCE = new androidx.compose.foundation.layout.FlowRowScopeInstance();
    private final /* synthetic */ androidx.compose.foundation.layout.RowScopeInstance getHighResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;

    private FlowRowScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.FlowRowScope
    public final androidx.compose.ui.Modifier fillMaxRowHeight(androidx.compose.ui.Modifier modifier, float f) {
        if (f < 0.0f || f > 1.0f) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid fraction ");
            sb.append(f);
            sb.append("; must be >= 0 and <= 1.0");
            androidx.compose.foundation.layout.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        return modifier.then(new androidx.compose.foundation.layout.FillCrossAxisSizeElement(f));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final androidx.compose.ui.Modifier weight(androidx.compose.ui.Modifier modifier, float f, boolean z) {
        return this.getHighResolutionOutputSizeshNQ4ISI.weight(modifier, f, z);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final androidx.compose.ui.Modifier alignByBaseline(androidx.compose.ui.Modifier modifier) {
        return this.getHighResolutionOutputSizeshNQ4ISI.alignByBaseline(modifier);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final androidx.compose.ui.Modifier alignBy(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Measured, java.lang.Integer> function1) {
        return this.getHighResolutionOutputSizeshNQ4ISI.alignBy(modifier, function1);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final androidx.compose.ui.Modifier alignBy(androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.HorizontalAlignmentLine horizontalAlignmentLine) {
        return this.getHighResolutionOutputSizeshNQ4ISI.alignBy(modifier, horizontalAlignmentLine);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final androidx.compose.ui.Modifier align(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment.Vertical vertical) {
        return this.getHighResolutionOutputSizeshNQ4ISI.align(modifier, vertical);
    }
}
