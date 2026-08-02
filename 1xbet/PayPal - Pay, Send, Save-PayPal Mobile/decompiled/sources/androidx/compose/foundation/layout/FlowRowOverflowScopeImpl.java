package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000e\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u000e\u001a\u00020\u0007*\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u0007*\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0019\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001eR\u0014\u0010!\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\u00128WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020\u00128WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%"}, d2 = {"Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl;", "Landroidx/compose/foundation/layout/FlowRowScope;", "Landroidx/compose/foundation/layout/FlowRowOverflowScope;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "state", "<init>", "(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Vertical;", "alignment", "align", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignmentLine", "alignBy", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/HorizontalAlignmentLine;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLineBlock", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "alignByBaseline", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "fraction", "fillMaxRowHeight", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "weight", "", "fill", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "getHighResolutionOutputSizeshNQ4ISI", "totalItemCount$delegate", "Lkotlin/Lazy;", "getTotalItemCount", "()I", "totalItemCount", "shownItemCount$delegate", "getShownItemCount", "shownItemCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FlowRowOverflowScopeImpl implements androidx.compose.foundation.layout.FlowRowScope, androidx.compose.foundation.layout.FlowRowOverflowScope {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.FlowLayoutOverflowState getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: shownItemCount$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy shownItemCount;
    private final /* synthetic */ androidx.compose.foundation.layout.FlowRowScopeInstance getHighResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.FlowRowScopeInstance.INSTANCE;

    /* renamed from: totalItemCount$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy totalItemCount = androidx.compose.foundation.layout.FlowLayoutOverflowKt.lazyInt$default(null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.layout.FlowRowOverflowScopeImpl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            int highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.FlowRowOverflowScopeImpl.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.layout.FlowRowOverflowScopeImpl.this);
            return java.lang.Integer.valueOf(highResolutionOutputSizeshNQ4ISI);
        }
    }, 1, null);

    public FlowRowOverflowScopeImpl(androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState) {
        this.getHighResolutionOutputSizeshNQ4ISI = flowLayoutOverflowState;
        this.shownItemCount = androidx.compose.foundation.layout.FlowLayoutOverflowKt.lazyInt(flowLayoutOverflowState.getShownItemLazyErrorMessage(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.layout.FlowRowOverflowScopeImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                int highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.layout.FlowRowOverflowScopeImpl.getHighSpeedVideoSizes(androidx.compose.foundation.layout.FlowRowOverflowScopeImpl.this);
                return java.lang.Integer.valueOf(highSpeedVideoSizes);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.layout.FlowRowOverflowScopeImpl flowRowOverflowScopeImpl) {
        return flowRowOverflowScopeImpl.getHighResolutionOutputSizeshNQ4ISI.getItemCount();
    }

    @Override // androidx.compose.foundation.layout.FlowRowOverflowScope
    public final int getTotalItemCount() {
        return ((java.lang.Number) this.totalItemCount.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoSizes(androidx.compose.foundation.layout.FlowRowOverflowScopeImpl flowRowOverflowScopeImpl) {
        return flowRowOverflowScopeImpl.getHighResolutionOutputSizeshNQ4ISI.getItemShown();
    }

    @Override // androidx.compose.foundation.layout.FlowRowOverflowScope
    public final int getShownItemCount() {
        return ((java.lang.Number) this.shownItemCount.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final androidx.compose.ui.Modifier weight(androidx.compose.ui.Modifier modifier, float f, boolean z) {
        return this.getHighResolutionOutputSizeshNQ4ISI.weight(modifier, f, z);
    }

    @Override // androidx.compose.foundation.layout.FlowRowScope
    public final androidx.compose.ui.Modifier fillMaxRowHeight(androidx.compose.ui.Modifier modifier, float f) {
        return this.getHighResolutionOutputSizeshNQ4ISI.fillMaxRowHeight(modifier, f);
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
