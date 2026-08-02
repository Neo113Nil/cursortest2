package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000e\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u000e\u001a\u00020\u0007*\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u0014J\u001c\u0010\u0017\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00128\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00128\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010!"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowColumnOverflowScopeImpl;", "Landroidx/compose/foundation/layout/FlowColumnOverflowScope;", "Landroidx/compose/foundation/layout/ContextualFlowColumnOverflowScope;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "state", "<init>", "(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "align", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/VerticalAlignmentLine;", "alignmentLine", "alignBy", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/VerticalAlignmentLine;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLineBlock", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "", "fraction", "fillMaxColumnWidth", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "weight", "", "fill", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "getHighSpeedVideoFpsRanges", "getShownItemCount", "()I", "shownItemCount", "getTotalItemCount", "totalItemCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContextualFlowColumnOverflowScopeImpl implements androidx.compose.foundation.layout.FlowColumnOverflowScope, androidx.compose.foundation.layout.ContextualFlowColumnOverflowScope {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.FlowLayoutOverflowState getHighSpeedVideoFpsRanges;
    private final /* synthetic */ androidx.compose.foundation.layout.FlowColumnOverflowScopeImpl getHighResolutionOutputSizeshNQ4ISI;

    public ContextualFlowColumnOverflowScopeImpl(androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState) {
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.foundation.layout.FlowColumnOverflowScopeImpl(flowLayoutOverflowState);
        this.getHighSpeedVideoFpsRanges = flowLayoutOverflowState;
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final androidx.compose.ui.Modifier weight(androidx.compose.ui.Modifier modifier, float f, boolean z) {
        return this.getHighResolutionOutputSizeshNQ4ISI.weight(modifier, f, z);
    }

    @Override // androidx.compose.foundation.layout.FlowColumnOverflowScope
    public final int getTotalItemCount() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getTotalItemCount();
    }

    @Override // androidx.compose.foundation.layout.FlowColumnOverflowScope
    public final int getShownItemCount() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getShownItemCount();
    }

    @Override // androidx.compose.foundation.layout.FlowColumnScope
    public final androidx.compose.ui.Modifier fillMaxColumnWidth(androidx.compose.ui.Modifier modifier, float f) {
        return this.getHighResolutionOutputSizeshNQ4ISI.fillMaxColumnWidth(modifier, f);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final androidx.compose.ui.Modifier alignBy(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Measured, java.lang.Integer> function1) {
        return this.getHighResolutionOutputSizeshNQ4ISI.alignBy(modifier, function1);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final androidx.compose.ui.Modifier alignBy(androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.VerticalAlignmentLine verticalAlignmentLine) {
        return this.getHighResolutionOutputSizeshNQ4ISI.alignBy(modifier, verticalAlignmentLine);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final androidx.compose.ui.Modifier align(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment.Horizontal horizontal) {
        return this.getHighResolutionOutputSizeshNQ4ISI.align(modifier, horizontal);
    }
}
