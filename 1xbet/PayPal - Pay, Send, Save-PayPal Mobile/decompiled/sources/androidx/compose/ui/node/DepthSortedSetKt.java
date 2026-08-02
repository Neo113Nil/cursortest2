package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/getOutputStallDuration;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Comparator;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DepthSortedSetKt {
    private static final java.util.Comparator<androidx.compose.ui.node.LayoutNode> getHighSpeedVideoFpsRangesFor = new java.util.Comparator<androidx.compose.ui.node.LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSetKt$DepthComparator$1
        @Override // java.util.Comparator
        public final int compare(androidx.compose.ui.node.LayoutNode a2, androidx.compose.ui.node.LayoutNode b) {
            int compare = kotlin.jvm.internal.Intrinsics.compare(a2.getDepth(), b.getDepth());
            return compare != 0 ? compare : kotlin.jvm.internal.Intrinsics.compare(a2.hashCode(), b.hashCode());
        }
    };
}
