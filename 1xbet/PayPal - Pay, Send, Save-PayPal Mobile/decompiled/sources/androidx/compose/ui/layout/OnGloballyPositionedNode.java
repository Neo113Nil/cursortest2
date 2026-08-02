package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR(\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnGloballyPositionedNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.GlobalPositionAwareModifierNode {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    public OnGloballyPositionedNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> function1) {
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> function1) {
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates p0) {
        this.getHighSpeedVideoFpsRangesFor.invoke(p0);
    }
}
