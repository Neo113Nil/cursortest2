package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\tJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0012\u001a\u00020\n2\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0010H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "contains", "(Landroidx/compose/ui/node/LayoutNode;)Z", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Landroidx/compose/ui/node/LayoutNode;)V", "remove", "pop", "()Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "block", "popEach", "(Lkotlin/jvm/functions/Function1;)V", "isEmpty", "()Z", "isNotEmpty", "Landroidx/collection/MutableObjectIntMap;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/collection/MutableObjectIntMap;", "", "toString", "()Ljava/lang/String;", "Z", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/node/SortedSet;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/node/SortedSet;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DepthSortedSet {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.node.SortedSet<androidx.compose.ui.node.LayoutNode> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;
    private androidx.collection.MutableObjectIntMap<androidx.compose.ui.node.LayoutNode> getHighSpeedVideoSizes;

    public DepthSortedSet(boolean z) {
        java.util.Comparator comparator;
        this.Camera2StreamConfigurationMap = z;
        comparator = androidx.compose.ui.node.DepthSortedSetKt.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = new androidx.compose.ui.node.SortedSet<>(comparator);
    }

    public final boolean contains(androidx.compose.ui.node.LayoutNode node) {
        boolean contains = this.getHighSpeedVideoFpsRanges.contains(node);
        if (this.Camera2StreamConfigurationMap && contains != getHighSpeedVideoFpsRangesFor().containsKey(node)) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("inconsistency in TreeSet");
        }
        return contains;
    }

    public final void add(androidx.compose.ui.node.LayoutNode node) {
        if (!node.isAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.add called on an unattached node");
        }
        if (this.Camera2StreamConfigurationMap) {
            androidx.collection.MutableObjectIntMap<androidx.compose.ui.node.LayoutNode> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            int orDefault = highSpeedVideoFpsRangesFor.getOrDefault(node, Integer.MAX_VALUE);
            if (orDefault == Integer.MAX_VALUE) {
                highSpeedVideoFpsRangesFor.set(node, node.getDepth());
            } else if (orDefault != node.getDepth()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("invalid node depth");
            }
        }
        this.getHighSpeedVideoFpsRanges.add(node);
    }

    public final boolean remove(androidx.compose.ui.node.LayoutNode node) {
        if (!node.isAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.remove called on an unattached node");
        }
        boolean remove = this.getHighSpeedVideoFpsRanges.remove(node);
        if (this.Camera2StreamConfigurationMap) {
            androidx.collection.MutableObjectIntMap<androidx.compose.ui.node.LayoutNode> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            if (highSpeedVideoFpsRangesFor.containsKey(node)) {
                int i = highSpeedVideoFpsRangesFor.get(node);
                highSpeedVideoFpsRangesFor.remove(node);
                if (i != (remove ? node.getDepth() : Integer.MAX_VALUE)) {
                    androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("invalid node depth");
                }
            }
        }
        return remove;
    }

    public final androidx.compose.ui.node.LayoutNode pop() {
        androidx.compose.ui.node.LayoutNode first = this.getHighSpeedVideoFpsRanges.first();
        remove(first);
        return first;
    }

    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRanges.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    private final androidx.collection.MutableObjectIntMap<androidx.compose.ui.node.LayoutNode> getHighSpeedVideoFpsRangesFor() {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = androidx.collection.ObjectIntMapKt.mutableObjectIntMapOf();
        }
        androidx.collection.MutableObjectIntMap<androidx.compose.ui.node.LayoutNode> mutableObjectIntMap = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableObjectIntMap);
        return mutableObjectIntMap;
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRanges.toString();
    }

    public final void popEach(kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.LayoutNode, kotlin.Unit> block) {
        while (!isEmpty()) {
            block.invoke(pop());
        }
    }
}
