package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher;", "", "<init>", "()V", "", "isNotEmpty", "()Z", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "onNodePositioned", "(Landroidx/compose/ui/node/LayoutNode;)V", "remove", "rootNode", "onRootNodePositioned", "dispatch", "p0", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/collection/MutableVector;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/collection/MutableVector;", "getHighSpeedVideoSizes", "", "Camera2StreamConfigurationMap", "[Landroidx/compose/ui/node/LayoutNode;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnPositionedDispatcher {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.node.LayoutNode[] getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> getHighSpeedVideoSizes = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.node.LayoutNode[16], 0);
    public static final int $stable = 8;

    public final boolean isNotEmpty() {
        return this.getHighSpeedVideoSizes.getSize() != 0;
    }

    public final void onNodePositioned(androidx.compose.ui.node.LayoutNode node) {
        if (node.getGloballyPositionedObservers() > 0) {
            this.getHighSpeedVideoSizes.add(node);
            node.setNeedsOnGloballyPositionedDispatch$ui(true);
        }
    }

    public final void remove(androidx.compose.ui.node.LayoutNode node) {
        this.getHighSpeedVideoSizes.remove(node);
    }

    public final void onRootNodePositioned(androidx.compose.ui.node.LayoutNode rootNode) {
        if (rootNode.getGloballyPositionedObservers() > 0) {
            this.getHighSpeedVideoSizes.clear();
            this.getHighSpeedVideoSizes.add(rootNode);
            rootNode.setNeedsOnGloballyPositionedDispatch$ui(true);
        }
    }

    public final void dispatch() {
        this.getHighSpeedVideoSizes.sortWith(androidx.compose.ui.node.OnPositionedDispatcher.Companion.DepthComparator.INSTANCE);
        int size = this.getHighSpeedVideoSizes.getSize();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (layoutNodeArr == null || layoutNodeArr.length < size) {
            layoutNodeArr = new androidx.compose.ui.node.LayoutNode[java.lang.Math.max(16, this.getHighSpeedVideoSizes.getSize())];
        }
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        for (int i = 0; i < size; i++) {
            layoutNodeArr[i] = this.getHighSpeedVideoSizes.content[i];
        }
        this.getHighSpeedVideoSizes.clear();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            androidx.compose.ui.node.LayoutNode layoutNode = layoutNodeArr[i2];
            kotlin.jvm.internal.Intrinsics.checkNotNull(layoutNode);
            if (layoutNode.getNeedsOnGloballyPositionedDispatch()) {
                getHighSpeedVideoFpsRangesFor(layoutNode);
            }
            layoutNodeArr[i2] = null;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = layoutNodeArr;
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.LayoutNode p0) {
        if (p0.getGloballyPositionedObservers() > 0) {
            p0.dispatchOnPositionedCallbacks$ui();
            p0.setNeedsOnGloballyPositionedDispatch$ui(false);
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = p0.get_children$ui();
            androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                getHighSpeedVideoFpsRangesFor(layoutNodeArr[i]);
            }
        }
    }
}
