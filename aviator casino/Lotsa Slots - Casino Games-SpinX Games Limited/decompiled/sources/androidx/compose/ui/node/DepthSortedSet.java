package androidx.compose.ui.node;

/* compiled from: DepthSortedSet.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0007J\u0006\u0010\u0016\u001a\u00020\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u0086\bJ\u0006\u0010\u0018\u001a\u00020\u0007J\u001f\u0010\u0019\u001a\u00020\u00132\u0014\b\u0004\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u001bH\u0086\bJ\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0007J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "extraAssertions", "", "(Z)V", "DepthComparator", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "mapOfOriginalDepth", "", "", "getMapOfOriginalDepth", "()Ljava/util/Map;", "mapOfOriginalDepth$delegate", "Lkotlin/Lazy;", "set", "Landroidx/compose/ui/node/TreeSet;", "add", "", "node", "contains", "isEmpty", "isNotEmpty", "pop", "popEach", "block", "Lkotlin/Function1;", "remove", "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DepthSortedSet {
    public static final int $stable = 8;
    private final java.util.Comparator<androidx.compose.ui.node.LayoutNode> DepthComparator;
    private final boolean extraAssertions;

    /* renamed from: mapOfOriginalDepth$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy mapOfOriginalDepth = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.util.Map<androidx.compose.ui.node.LayoutNode, java.lang.Integer>>() { // from class: androidx.compose.ui.node.DepthSortedSet$mapOfOriginalDepth$2
        @Override // kotlin.jvm.functions.Function0
        public final java.util.Map<androidx.compose.ui.node.LayoutNode, java.lang.Integer> invoke() {
            return new java.util.LinkedHashMap();
        }
    });
    private final androidx.compose.ui.node.TreeSet<androidx.compose.ui.node.LayoutNode> set;

    public DepthSortedSet(boolean z) {
        this.extraAssertions = z;
        java.util.Comparator<androidx.compose.ui.node.LayoutNode> comparator = new java.util.Comparator<androidx.compose.ui.node.LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSet$DepthComparator$1
            @Override // java.util.Comparator
            public int compare(androidx.compose.ui.node.LayoutNode l1, androidx.compose.ui.node.LayoutNode l2) {
                int compare = kotlin.jvm.internal.Intrinsics.compare(l1.getDepth(), l2.getDepth());
                return compare != 0 ? compare : kotlin.jvm.internal.Intrinsics.compare(l1.hashCode(), l2.hashCode());
            }
        };
        this.DepthComparator = comparator;
        this.set = new androidx.compose.ui.node.TreeSet<>(comparator);
    }

    private final java.util.Map<androidx.compose.ui.node.LayoutNode, java.lang.Integer> getMapOfOriginalDepth() {
        return (java.util.Map) this.mapOfOriginalDepth.getValue();
    }

    public final boolean contains(androidx.compose.ui.node.LayoutNode node) {
        boolean contains = this.set.contains(node);
        if (!this.extraAssertions || contains == getMapOfOriginalDepth().containsKey(node)) {
            return contains;
        }
        throw new java.lang.IllegalStateException("inconsistency in TreeSet".toString());
    }

    public final void add(androidx.compose.ui.node.LayoutNode node) {
        if (!node.isAttached()) {
            throw new java.lang.IllegalStateException("DepthSortedSet.add called on an unattached node".toString());
        }
        if (this.extraAssertions) {
            java.lang.Integer num = getMapOfOriginalDepth().get(node);
            if (num == null) {
                getMapOfOriginalDepth().put(node, java.lang.Integer.valueOf(node.getDepth()));
            } else {
                if (num.intValue() != node.getDepth()) {
                    throw new java.lang.IllegalStateException("invalid node depth".toString());
                }
            }
        }
        this.set.add(node);
    }

    public final boolean remove(androidx.compose.ui.node.LayoutNode node) {
        if (!node.isAttached()) {
            throw new java.lang.IllegalStateException("DepthSortedSet.remove called on an unattached node".toString());
        }
        boolean remove = this.set.remove(node);
        if (this.extraAssertions) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(getMapOfOriginalDepth().remove(node), remove ? java.lang.Integer.valueOf(node.getDepth()) : null)) {
                throw new java.lang.IllegalStateException("invalid node depth".toString());
            }
        }
        return remove;
    }

    public final androidx.compose.ui.node.LayoutNode pop() {
        androidx.compose.ui.node.LayoutNode first = this.set.first();
        remove(first);
        return first;
    }

    public final boolean isEmpty() {
        return this.set.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public java.lang.String toString() {
        return this.set.toString();
    }

    public final void popEach(kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.LayoutNode, kotlin.Unit> block) {
        while (!isEmpty()) {
            block.invoke(pop());
        }
    }
}
