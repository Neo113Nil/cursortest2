package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0004J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u000fJ=\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u00102\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0014J8\u0010\u0017\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018J<\u0010\u0017\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001c\u001a\u00020\u001b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001eJ\u001c\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u001fH\u0086\u0002¢\u0006\u0004\b \u0010!J\u001e\u0010\"\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086\u0002¢\u0006\u0004\b\"\u0010#J'\u0010%\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020\u00052\u0010\u0010(\u001a\f0'R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\u00052\u0010\u0010(\u001a\f0'R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b+\u0010*J!\u0010,\u001a\u00020\u00052\u0010\u0010(\u001a\f0'R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b,\u0010*J!\u0010-\u001a\u00020\u00052\u0010\u0010(\u001a\f0'R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b-\u0010*R\u001e\u0010.\u001a\f0'R\b\u0012\u0004\u0012\u00028\u00000\u00008\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00100\u001a\f0'R\b\u0012\u0004\u0012\u00028\u00000\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b0\u0010/R8\u00103\u001a&\u0012\u000e\u0012\f0'R\b\u0012\u0004\u0012\u00028\u00000\u000001j\u0012\u0012\u000e\u0012\f0'R\b\u0012\u0004\u0012\u00028\u00000\u0000`28\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b3\u00104"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree;", "T", "", "<init>", "()V", "", "clear", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "interval", "Landroidx/compose/ui/graphics/Interval;", "findFirstOverlap", "(Lkotlin/ranges/ClosedFloatingPointRange;)Landroidx/compose/ui/graphics/Interval;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "(FF)Landroidx/compose/ui/graphics/Interval;", "", "results", "findOverlaps", "(Lkotlin/ranges/ClosedFloatingPointRange;Ljava/util/List;)Ljava/util/List;", "(FFLjava/util/List;)Ljava/util/List;", "Lkotlin/Function1;", "block", "forEach$ui_graphics", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;)V", "(FFLkotlin/jvm/functions/Function1;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "contains", "(F)Z", "(Lkotlin/ranges/ClosedFloatingPointRange;)Z", "", "iterator", "()Ljava/util/Iterator;", "plusAssign", "(Landroidx/compose/ui/graphics/Interval;)V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "addInterval", "(FFLjava/lang/Object;)V", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "p0", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/graphics/IntervalTree$Node;)V", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "terminator", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "root", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "Ljava/util/ArrayList;", "Node"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntervalTree<T> {
    public static final int $stable = 8;
    public androidx.compose.ui.graphics.IntervalTree<T>.Node root;
    public final java.util.ArrayList<androidx.compose.ui.graphics.IntervalTree<T>.Node> stack;
    public final androidx.compose.ui.graphics.IntervalTree<T>.Node terminator;

    public IntervalTree() {
        androidx.compose.ui.graphics.IntervalTree<T>.Node node = new androidx.compose.ui.graphics.IntervalTree.Node(Float.MAX_VALUE, Float.MIN_VALUE, null, 1);
        this.terminator = node;
        this.root = node;
        this.stack = new java.util.ArrayList<>();
    }

    public final void clear() {
        this.root = this.terminator;
    }

    public final androidx.compose.ui.graphics.Interval<T> findFirstOverlap(kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> interval) {
        return findFirstOverlap(interval.getStart().floatValue(), interval.getEndInclusive().floatValue());
    }

    public static /* synthetic */ androidx.compose.ui.graphics.Interval findFirstOverlap$default(androidx.compose.ui.graphics.IntervalTree intervalTree, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return intervalTree.findFirstOverlap(f, f2);
    }

    public final androidx.compose.ui.graphics.Interval<T> findFirstOverlap(float start, float end) {
        androidx.compose.ui.graphics.IntervalTree<T>.Node node = this.root;
        androidx.compose.ui.graphics.IntervalTree<T>.Node node2 = this.terminator;
        if (node != node2 && node != node2) {
            java.util.ArrayList<androidx.compose.ui.graphics.IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                androidx.compose.ui.graphics.IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(start, end)) {
                    return remove;
                }
                if (remove.getLeft() != this.terminator && remove.getLeft().getMax() >= start) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != this.terminator && remove.getRight().getMin() <= end) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
        androidx.compose.ui.graphics.Interval<T> interval = (androidx.compose.ui.graphics.Interval<T>) androidx.compose.ui.graphics.IntervalTreeKt.getEmptyInterval();
        kotlin.jvm.internal.Intrinsics.checkNotNull(interval, "");
        return interval;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.List findOverlaps$default(androidx.compose.ui.graphics.IntervalTree intervalTree, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = new java.util.ArrayList();
        }
        return intervalTree.findOverlaps(closedFloatingPointRange, list);
    }

    public final java.util.List<androidx.compose.ui.graphics.Interval<T>> findOverlaps(kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> interval, java.util.List<androidx.compose.ui.graphics.Interval<T>> results) {
        return findOverlaps(interval.getStart().floatValue(), interval.getEndInclusive().floatValue(), results);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.List findOverlaps$default(androidx.compose.ui.graphics.IntervalTree intervalTree, float f, float f2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        if ((i & 4) != 0) {
            list = new java.util.ArrayList();
        }
        return intervalTree.findOverlaps(f, f2, list);
    }

    public final void forEach$ui_graphics(kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> interval, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Interval<T>, kotlin.Unit> block) {
        float floatValue = interval.getStart().floatValue();
        float floatValue2 = interval.getEndInclusive().floatValue();
        androidx.compose.ui.graphics.IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            java.util.ArrayList<androidx.compose.ui.graphics.IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                androidx.compose.ui.graphics.IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(floatValue, floatValue2)) {
                    block.invoke(remove);
                }
                if (remove.getLeft() != this.terminator && remove.getLeft().getMax() >= floatValue) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != this.terminator && remove.getRight().getMin() <= floatValue2) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
    }

    public static /* synthetic */ void forEach$ui_graphics$default(androidx.compose.ui.graphics.IntervalTree intervalTree, float f, float f2, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        androidx.compose.ui.graphics.IntervalTree<T>.Node node = intervalTree.root;
        if (node != intervalTree.terminator) {
            java.util.ArrayList<androidx.compose.ui.graphics.IntervalTree<T>.Node> arrayList = intervalTree.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                androidx.compose.ui.graphics.IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(f, f2)) {
                    function1.invoke(remove);
                }
                if (remove.getLeft() != intervalTree.terminator && remove.getLeft().getMax() >= f) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != intervalTree.terminator && remove.getRight().getMin() <= f2) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
    }

    public final void forEach$ui_graphics(float start, float end, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Interval<T>, kotlin.Unit> block) {
        androidx.compose.ui.graphics.IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            java.util.ArrayList<androidx.compose.ui.graphics.IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                androidx.compose.ui.graphics.IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(start, end)) {
                    block.invoke(remove);
                }
                if (remove.getLeft() != this.terminator && remove.getLeft().getMax() >= start) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != this.terminator && remove.getRight().getMin() <= end) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
    }

    public final boolean contains(float value) {
        return findFirstOverlap(value, value) != androidx.compose.ui.graphics.IntervalTreeKt.getEmptyInterval();
    }

    public final boolean contains(kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> interval) {
        return findFirstOverlap(interval.getStart().floatValue(), interval.getEndInclusive().floatValue()) != androidx.compose.ui.graphics.IntervalTreeKt.getEmptyInterval();
    }

    public final java.util.Iterator<androidx.compose.ui.graphics.Interval<T>> iterator() {
        return new androidx.compose.ui.graphics.IntervalTree$iterator$1(this);
    }

    public final void plusAssign(androidx.compose.ui.graphics.Interval<T> interval) {
        addInterval(interval.getStart(), interval.getEnd(), interval.getData());
    }

    public final void addInterval(float start, float end, T data) {
        androidx.compose.ui.graphics.IntervalTree<T>.Node right;
        androidx.compose.ui.graphics.IntervalTree<T>.Node node = new androidx.compose.ui.graphics.IntervalTree.Node(start, end, data, 0);
        androidx.compose.ui.graphics.IntervalTree<T>.Node node2 = this.root;
        androidx.compose.ui.graphics.IntervalTree<T>.Node node3 = this.terminator;
        while (node2 != this.terminator) {
            if (node.getStart() <= node2.getStart()) {
                right = node2.getLeft();
            } else {
                right = node2.getRight();
            }
            androidx.compose.ui.graphics.IntervalTree<T>.Node node4 = right;
            node3 = node2;
            node2 = node4;
        }
        node.setParent(node3);
        if (node3 == this.terminator) {
            this.root = node;
        } else if (node.getStart() <= node3.getStart()) {
            node3.setLeft(node);
        } else {
            node3.setRight(node);
        }
        getHighResolutionOutputSizeshNQ4ISI(node);
        Camera2StreamConfigurationMap(node);
    }

    private final void Camera2StreamConfigurationMap(androidx.compose.ui.graphics.IntervalTree<T>.Node p0) {
        while (p0 != this.root && p0.getParent().getColor() == 0) {
            androidx.compose.ui.graphics.IntervalTree<T>.Node parent = p0.getParent().getParent();
            if (p0.getParent() == parent.getLeft()) {
                androidx.compose.ui.graphics.IntervalTree<T>.Node right = parent.getRight();
                if (right.getColor() == 0) {
                    right.setColor(1);
                    p0.getParent().setColor(1);
                    parent.setColor(0);
                    p0 = parent;
                } else {
                    if (p0 == p0.getParent().getRight()) {
                        p0 = p0.getParent();
                        getHighSpeedVideoSizes(p0);
                    }
                    p0.getParent().setColor(1);
                    parent.setColor(0);
                    getHighSpeedVideoFpsRanges(parent);
                }
            } else {
                androidx.compose.ui.graphics.IntervalTree<T>.Node left = parent.getLeft();
                if (left.getColor() == 0) {
                    left.setColor(1);
                    p0.getParent().setColor(1);
                    parent.setColor(0);
                    p0 = parent;
                } else {
                    if (p0 == p0.getParent().getLeft()) {
                        p0 = p0.getParent();
                        getHighSpeedVideoFpsRanges(p0);
                    }
                    p0.getParent().setColor(1);
                    parent.setColor(0);
                    getHighSpeedVideoSizes(parent);
                }
            }
        }
        this.root.setColor(1);
    }

    private final void getHighSpeedVideoSizes(androidx.compose.ui.graphics.IntervalTree<T>.Node p0) {
        androidx.compose.ui.graphics.IntervalTree<T>.Node right = p0.getRight();
        p0.setRight(right.getLeft());
        if (right.getLeft() != this.terminator) {
            right.getLeft().setParent(p0);
        }
        right.setParent(p0.getParent());
        if (p0.getParent() == this.terminator) {
            this.root = right;
        } else if (p0.getParent().getLeft() == p0) {
            p0.getParent().setLeft(right);
        } else {
            p0.getParent().setRight(right);
        }
        right.setLeft(p0);
        p0.setParent(right);
        getHighResolutionOutputSizeshNQ4ISI(p0);
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.IntervalTree<T>.Node p0) {
        androidx.compose.ui.graphics.IntervalTree<T>.Node left = p0.getLeft();
        p0.setLeft(left.getRight());
        if (left.getRight() != this.terminator) {
            left.getRight().setParent(p0);
        }
        left.setParent(p0.getParent());
        if (p0.getParent() == this.terminator) {
            this.root = left;
        } else if (p0.getParent().getRight() == p0) {
            p0.getParent().setRight(left);
        } else {
            p0.getParent().setLeft(left);
        }
        left.setRight(p0);
        p0.setParent(left);
        getHighResolutionOutputSizeshNQ4ISI(p0);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.IntervalTree<T>.Node p0) {
        while (p0 != this.terminator) {
            p0.setMin(java.lang.Math.min(p0.getStart(), java.lang.Math.min(p0.getLeft().getMin(), p0.getRight().getMin())));
            p0.setMax(java.lang.Math.max(p0.getEnd(), java.lang.Math.max(p0.getLeft().getMax(), p0.getRight().getMax())));
            p0 = p0.getParent();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u000e\u0010\rR&\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R,\u0010\u001d\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R,\u0010\"\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010!R,\u0010%\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010!"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree$Node;", "Landroidx/compose/ui/graphics/Interval;", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Landroidx/compose/ui/graphics/TreeColor;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "<init>", "(Landroidx/compose/ui/graphics/IntervalTree;FFLjava/lang/Object;I)V", "Landroidx/compose/ui/graphics/IntervalTree;", "lowestNode", "()Landroidx/compose/ui/graphics/IntervalTree$Node;", io.ktor.http.LinkHeader.Rel.Next, com.visa.cbp.getEncExpo.warmup, "getColor", "()I", "setColor", "(I)V", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getMin", "()F", "setMin", "(F)V", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "getMax", "setMax", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, "Landroidx/compose/ui/graphics/IntervalTree$Node;", "getLeft", "setLeft", "(Landroidx/compose/ui/graphics/IntervalTree$Node;)V", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "getRight", "setRight", "parent", "getParent", "setParent"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Node extends androidx.compose.ui.graphics.Interval<T> {
        private int color;
        private androidx.compose.ui.graphics.IntervalTree<T>.Node left;
        private float max;
        private float min;
        private androidx.compose.ui.graphics.IntervalTree<T>.Node parent;
        private androidx.compose.ui.graphics.IntervalTree<T>.Node right;

        public Node(float f, float f2, T t, int i) {
            super(f, f2, t);
            this.color = i;
            this.min = f;
            this.max = f2;
            this.left = androidx.compose.ui.graphics.IntervalTree.this.terminator;
            this.right = androidx.compose.ui.graphics.IntervalTree.this.terminator;
            this.parent = androidx.compose.ui.graphics.IntervalTree.this.terminator;
        }

        public final int getColor() {
            return this.color;
        }

        public final void setColor(int i) {
            this.color = i;
        }

        public final float getMin() {
            return this.min;
        }

        public final void setMin(float f) {
            this.min = f;
        }

        public final float getMax() {
            return this.max;
        }

        public final void setMax(float f) {
            this.max = f;
        }

        public final androidx.compose.ui.graphics.IntervalTree<T>.Node getLeft() {
            return this.left;
        }

        public final void setLeft(androidx.compose.ui.graphics.IntervalTree<T>.Node node) {
            this.left = node;
        }

        public final androidx.compose.ui.graphics.IntervalTree<T>.Node getRight() {
            return this.right;
        }

        public final void setRight(androidx.compose.ui.graphics.IntervalTree<T>.Node node) {
            this.right = node;
        }

        public final androidx.compose.ui.graphics.IntervalTree<T>.Node getParent() {
            return this.parent;
        }

        public final void setParent(androidx.compose.ui.graphics.IntervalTree<T>.Node node) {
            this.parent = node;
        }

        public final androidx.compose.ui.graphics.IntervalTree<T>.Node lowestNode() {
            androidx.compose.ui.graphics.IntervalTree.Node node = this;
            while (node.left != androidx.compose.ui.graphics.IntervalTree.this.terminator) {
                node = node.left;
            }
            return node;
        }

        public final androidx.compose.ui.graphics.IntervalTree<T>.Node next() {
            if (this.right != androidx.compose.ui.graphics.IntervalTree.this.terminator) {
                return this.right.lowestNode();
            }
            androidx.compose.ui.graphics.IntervalTree<T>.Node node = this.parent;
            androidx.compose.ui.graphics.IntervalTree.Node node2 = this;
            while (node != androidx.compose.ui.graphics.IntervalTree.this.terminator && node2 == node.right) {
                node2 = node;
                node = node.parent;
            }
            return node;
        }
    }

    public final java.util.List<androidx.compose.ui.graphics.Interval<T>> findOverlaps(float start, float end, java.util.List<androidx.compose.ui.graphics.Interval<T>> results) {
        androidx.compose.ui.graphics.IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            java.util.ArrayList<androidx.compose.ui.graphics.IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                androidx.compose.ui.graphics.IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(start, end)) {
                    results.add(remove);
                }
                if (remove.getLeft() != this.terminator && remove.getLeft().getMax() >= start) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != this.terminator && remove.getRight().getMin() <= end) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
        return results;
    }
}
