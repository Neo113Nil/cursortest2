package androidx.compose.foundation.relocation;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00178\u0017X\u0097D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/relocation/BringIntoViewModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "responder", "<init>", "(Landroidx/compose/foundation/relocation/BringIntoViewResponder;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "onPlaced", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "childCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "boundsProvider", "bringIntoView", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "getResponder", "()Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "setResponder", "", "shouldAutoInvalidate", "Z", "getShouldAutoInvalidate", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BringIntoViewResponderNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.relocation.BringIntoViewModifierNode, androidx.compose.ui.node.LayoutAwareModifierNode {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;
    private androidx.compose.foundation.relocation.BringIntoViewResponder responder;
    private final boolean shouldAutoInvalidate;

    public BringIntoViewResponderNode(androidx.compose.foundation.relocation.BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }

    public final androidx.compose.foundation.relocation.BringIntoViewResponder getResponder() {
        return this.responder;
    }

    public final void setResponder(androidx.compose.foundation.relocation.BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        this.getHighSpeedVideoSizes = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.geometry.Rect getHighSpeedVideoSizes(androidx.compose.foundation.relocation.BringIntoViewResponderNode bringIntoViewResponderNode, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function0) {
        androidx.compose.ui.geometry.Rect invoke;
        androidx.compose.ui.geometry.Rect highSpeedVideoFpsRangesFor;
        if (!bringIntoViewResponderNode.getIsAttached() || !bringIntoViewResponderNode.getHighSpeedVideoSizes) {
            return null;
        }
        androidx.compose.ui.layout.LayoutCoordinates requireLayoutCoordinates = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(bringIntoViewResponderNode);
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates == null || (invoke = function0.invoke()) == null) {
            return null;
        }
        highSpeedVideoFpsRangesFor = androidx.compose.foundation.relocation.BringIntoViewRequesterKt__BringIntoViewResponderKt.getHighSpeedVideoFpsRangesFor(requireLayoutCoordinates, layoutCoordinates, invoke);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.relocation.BringIntoViewResponderNode bringIntoViewResponderNode, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, kotlin.jvm.functions.Function0 function0) {
        androidx.compose.ui.geometry.Rect highSpeedVideoSizes = getHighSpeedVideoSizes(bringIntoViewResponderNode, layoutCoordinates, function0);
        if (highSpeedVideoSizes != null) {
            return bringIntoViewResponderNode.responder.calculateRectForParent(highSpeedVideoSizes);
        }
        return null;
    }

    @Override // androidx.compose.ui.relocation.BringIntoViewModifierNode
    public final java.lang.Object bringIntoView(final androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, final kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2(this, layoutCoordinates, function0, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.compose.ui.geometry.Rect highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.relocation.BringIntoViewResponderNode.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.relocation.BringIntoViewResponderNode.this, layoutCoordinates, function0);
                return highSpeedVideoFpsRangesFor;
            }
        }, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }
}
