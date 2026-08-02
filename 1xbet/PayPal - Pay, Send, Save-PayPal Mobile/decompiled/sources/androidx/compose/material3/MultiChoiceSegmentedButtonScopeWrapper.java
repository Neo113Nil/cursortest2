package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u0006*\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0016\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/material3/MultiChoiceSegmentedButtonScopeWrapper;", "Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;", "Landroidx/compose/foundation/layout/RowScope;", "p0", "<init>", "(Landroidx/compose/foundation/layout/RowScope;)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Vertical;", "align", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignBy", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/HorizontalAlignmentLine;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "alignByBaseline", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "", "p1", "weight", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class MultiChoiceSegmentedButtonScopeWrapper implements androidx.compose.material3.MultiChoiceSegmentedButtonRowScope, androidx.compose.foundation.layout.RowScope {
    private final /* synthetic */ androidx.compose.foundation.layout.RowScope getHighResolutionOutputSizeshNQ4ISI;

    public MultiChoiceSegmentedButtonScopeWrapper(androidx.compose.foundation.layout.RowScope rowScope) {
        this.getHighResolutionOutputSizeshNQ4ISI = rowScope;
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
