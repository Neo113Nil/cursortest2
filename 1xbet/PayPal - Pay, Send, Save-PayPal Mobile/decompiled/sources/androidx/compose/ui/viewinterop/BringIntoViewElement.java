package androidx.compose.ui.viewinterop;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012,\u0010\b\u001a(\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003j\u0004\u0018\u0001`\u0006\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0005*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R7\u0010\u0017\u001a(\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003j\u0004\u0018\u0001`\u0006\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00078\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/viewinterop/BringIntoViewElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/viewinterop/BringIntoViewNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Rect;", "", "Landroidx/compose/ui/viewinterop/BringIntoViewRequester;", "Landroidx/compose/ui/viewinterop/OnRequesterReady;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BringIntoViewElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.viewinterop.BringIntoViewNode> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, kotlin.Unit>, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public BringIntoViewElement(kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, kotlin.Unit>, kotlin.Unit> function1) {
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ void update(androidx.compose.ui.viewinterop.BringIntoViewNode bringIntoViewNode) {
        androidx.compose.ui.viewinterop.BringIntoViewNode bringIntoViewNode2 = bringIntoViewNode;
        kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, kotlin.Unit>, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
        bringIntoViewNode2.getHighSpeedVideoFpsRangesFor = function1;
        if (bringIntoViewNode2.getIsAttached()) {
            function1.invoke(bringIntoViewNode2.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this != p0) {
            return (p0 instanceof androidx.compose.ui.viewinterop.BringIntoViewElement) && this.getHighResolutionOutputSizeshNQ4ISI == ((androidx.compose.ui.viewinterop.BringIntoViewElement) p0).getHighResolutionOutputSizeshNQ4ISI;
        }
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("requestRectangleBringIntoViewBridge");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.ui.viewinterop.BringIntoViewNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.ui.viewinterop.BringIntoViewNode(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
