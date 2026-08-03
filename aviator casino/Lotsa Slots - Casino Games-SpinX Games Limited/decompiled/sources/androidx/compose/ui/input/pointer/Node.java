package androidx.compose.ui.input.pointer;

/* compiled from: HitPathTracker.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u001b\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\bH\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0017\u0010&\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0(H\u0082\bJ.\u0010)\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\bH\u0016J\u001a\u0010*\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\r2\u0006\u0010,\u001a\u00020\rH\u0002J\u0006\u0010-\u001a\u00020\"J\b\u0010.\u001a\u00020/H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "modifierNode", "Landroidx/compose/ui/Modifier$Node;", "(Landroidx/compose/ui/Modifier$Node;)V", com.ironsource.Y3.f, "Landroidx/compose/ui/layout/LayoutCoordinates;", "hasExited", "", "isIn", "getModifierNode", "()Landroidx/compose/ui/Modifier$Node;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerIds", "Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "getPointerIds", "()Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "relevantChanges", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "vec", "Landroidx/compose/runtime/collection/MutableVector;", "", "getVec", "()Landroidx/compose/runtime/collection/MutableVector;", "wasIn", "buildCache", "changes", "parentCoordinates", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "isInBounds", "cleanUpHits", "", "clearCache", "dispatchCancel", "dispatchFinalEventPass", "dispatchIfNeeded", "block", "Lkotlin/Function0;", "dispatchMainEventPass", "hasPositionChanged", "oldEvent", "newEvent", "markIsIn", "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Node extends androidx.compose.ui.input.pointer.NodeParent {
    public static final int $stable = 8;
    private androidx.compose.ui.layout.LayoutCoordinates coordinates;
    private final androidx.compose.ui.Modifier.Node modifierNode;
    private androidx.compose.ui.input.pointer.PointerEvent pointerEvent;
    private boolean wasIn;
    private final androidx.compose.ui.input.pointer.util.PointerIdArray pointerIds = new androidx.compose.ui.input.pointer.util.PointerIdArray();
    private final androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> relevantChanges = new androidx.collection.LongSparseArray<>(2);
    private boolean isIn = true;
    private boolean hasExited = true;
    private final androidx.compose.runtime.collection.MutableVector<java.lang.Long> vec = new androidx.compose.runtime.collection.MutableVector<>(new java.lang.Long[16], 0);

    public Node(androidx.compose.ui.Modifier.Node node) {
        this.modifierNode = node;
    }

    public final androidx.compose.ui.Modifier.Node getModifierNode() {
        return this.modifierNode;
    }

    public final androidx.compose.ui.input.pointer.util.PointerIdArray getPointerIds() {
        return this.pointerIds;
    }

    public final androidx.compose.runtime.collection.MutableVector<java.lang.Long> getVec() {
        return this.vec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean buildCache(androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> changes, androidx.compose.ui.layout.LayoutCoordinates parentCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        int m3229getExit7fucELk;
        boolean z;
        int i;
        androidx.compose.ui.input.pointer.PointerInputChange m3271copyOHpmEuE;
        boolean buildCache = super.buildCache(changes, parentCoordinates, internalPointerEvent, isInBounds);
        if (!this.modifierNode.getIsAttached()) {
            return true;
        }
        androidx.compose.ui.node.DelegatingNode delegatingNode = this.modifierNode;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(16);
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof androidx.compose.ui.node.PointerInputModifierNode) {
                this.coordinates = androidx.compose.ui.node.PointerInputModifierNodeKt.getLayoutCoordinates((androidx.compose.ui.node.PointerInputModifierNode) delegatingNode);
            } else if ((delegatingNode.getKindSet() & m3613constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                int i2 = 0;
                delegatingNode = delegatingNode;
                while (delegate != null) {
                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                        i2++;
                        if (i2 == 1) {
                            delegatingNode = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                            }
                            if (delegatingNode != 0) {
                                if (mutableVector != null) {
                                    mutableVector.add(delegatingNode);
                                }
                                delegatingNode = 0;
                            }
                            if (mutableVector != null) {
                                mutableVector.add(delegate);
                            }
                        }
                    }
                    delegate = delegate.getChild();
                    delegatingNode = delegatingNode;
                }
                if (i2 == 1) {
                }
            }
            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
        }
        int size = changes.size();
        int i3 = 0;
        while (i3 < size) {
            long keyAt = changes.keyAt(i3);
            androidx.compose.ui.input.pointer.PointerInputChange valueAt = changes.valueAt(i3);
            if (this.pointerIds.contains(keyAt)) {
                java.util.ArrayList arrayList = new java.util.ArrayList(valueAt.getHistorical().size());
                java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> historical = valueAt.getHistorical();
                int size2 = historical.size();
                int i4 = 0;
                while (i4 < size2) {
                    androidx.compose.ui.input.pointer.HistoricalChange historicalChange = historical.get(i4);
                    long uptimeMillis = historicalChange.getUptimeMillis();
                    androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.coordinates;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates);
                    arrayList.add(new androidx.compose.ui.input.pointer.HistoricalChange(uptimeMillis, layoutCoordinates.mo3410localPositionOfR5De75A(parentCoordinates, historicalChange.getPosition()), historicalChange.getOriginalEventPosition(), null));
                    i4++;
                    buildCache = buildCache;
                    size = size;
                }
                z = buildCache;
                i = size;
                androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> longSparseArray = this.relevantChanges;
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = this.coordinates;
                kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates2);
                long mo3410localPositionOfR5De75A = layoutCoordinates2.mo3410localPositionOfR5De75A(parentCoordinates, valueAt.getPreviousPosition());
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates3 = this.coordinates;
                kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates3);
                m3271copyOHpmEuE = valueAt.m3271copyOHpmEuE((r34 & 1) != 0 ? valueAt.id : 0L, (r34 & 2) != 0 ? valueAt.uptimeMillis : 0L, (r34 & 4) != 0 ? valueAt.position : layoutCoordinates3.mo3410localPositionOfR5De75A(parentCoordinates, valueAt.getPosition()), (r34 & 8) != 0 ? valueAt.pressed : false, (r34 & 16) != 0 ? valueAt.previousUptimeMillis : 0L, (r34 & 32) != 0 ? valueAt.previousPosition : mo3410localPositionOfR5De75A, (r34 & 64) != 0 ? valueAt.previousPressed : false, (r34 & 128) != 0 ? valueAt.type : 0, arrayList, (r34 & 512) != 0 ? valueAt.scrollDelta : 0L);
                longSparseArray.put(keyAt, m3271copyOHpmEuE);
            } else {
                z = buildCache;
                i = size;
            }
            i3++;
            buildCache = z;
            size = i;
        }
        boolean z2 = buildCache;
        if (this.relevantChanges.isEmpty()) {
            this.pointerIds.clear();
            getChildren().clear();
            return true;
        }
        for (int size3 = this.pointerIds.getSize() - 1; -1 < size3; size3--) {
            if (!changes.containsKey(this.pointerIds.m3371get_I2yYro(size3))) {
                this.pointerIds.removeAt(size3);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.relevantChanges.size());
        int size4 = this.relevantChanges.size();
        for (int i5 = 0; i5 < size4; i5++) {
            arrayList2.add(this.relevantChanges.valueAt(i5));
        }
        androidx.compose.ui.input.pointer.PointerEvent pointerEvent = new androidx.compose.ui.input.pointer.PointerEvent(arrayList2, internalPointerEvent);
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
        int size5 = changes2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size5) {
                pointerInputChange = null;
                break;
            }
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = changes2.get(i6);
            if (internalPointerEvent.m3204issuesEnterExitEvent0FcD4WY(pointerInputChange2.getId())) {
                pointerInputChange = pointerInputChange2;
                break;
            }
            i6++;
        }
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = pointerInputChange;
        if (pointerInputChange3 != null) {
            if (!isInBounds) {
                this.isIn = false;
            } else if (!this.isIn && (pointerInputChange3.getPressed() || pointerInputChange3.getPreviousPressed())) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(this.coordinates);
                this.isIn = !androidx.compose.ui.input.pointer.PointerEventKt.m3219isOutOfBoundsO0kMr_c(pointerInputChange3, r3.mo3409getSizeYbymL2g());
                if (this.isIn == this.wasIn && (androidx.compose.ui.input.pointer.PointerEventType.m3224equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3230getMove7fucELk()) || androidx.compose.ui.input.pointer.PointerEventType.m3224equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3228getEnter7fucELk()) || androidx.compose.ui.input.pointer.PointerEventType.m3224equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3229getExit7fucELk()))) {
                    if (this.isIn) {
                        m3229getExit7fucELk = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3228getEnter7fucELk();
                    } else {
                        m3229getExit7fucELk = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3229getExit7fucELk();
                    }
                    pointerEvent.m3218setTypeEhbLWgg$ui_release(m3229getExit7fucELk);
                } else if (!androidx.compose.ui.input.pointer.PointerEventType.m3224equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3228getEnter7fucELk()) && this.wasIn && !this.hasExited) {
                    pointerEvent.m3218setTypeEhbLWgg$ui_release(androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3230getMove7fucELk());
                } else if (androidx.compose.ui.input.pointer.PointerEventType.m3224equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3229getExit7fucELk()) && this.isIn && pointerInputChange3.getPressed()) {
                    pointerEvent.m3218setTypeEhbLWgg$ui_release(androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3230getMove7fucELk());
                }
            }
            if (this.isIn == this.wasIn) {
            }
            if (!androidx.compose.ui.input.pointer.PointerEventType.m3224equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3228getEnter7fucELk())) {
            }
            if (androidx.compose.ui.input.pointer.PointerEventType.m3224equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3229getExit7fucELk())) {
                pointerEvent.m3218setTypeEhbLWgg$ui_release(androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3230getMove7fucELk());
            }
        }
        boolean z3 = z2 || !androidx.compose.ui.input.pointer.PointerEventType.m3224equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3230getMove7fucELk()) || hasPositionChanged(this.pointerEvent, pointerEvent);
        this.pointerEvent = pointerEvent;
        return z3;
    }

    private final boolean hasPositionChanged(androidx.compose.ui.input.pointer.PointerEvent oldEvent, androidx.compose.ui.input.pointer.PointerEvent newEvent) {
        if (oldEvent == null || oldEvent.getChanges().size() != newEvent.getChanges().size()) {
            return true;
        }
        int size = newEvent.getChanges().size();
        for (int i = 0; i < size; i++) {
            if (!androidx.compose.ui.geometry.Offset.m1868equalsimpl0(oldEvent.getChanges().get(i).getPosition(), newEvent.getChanges().get(i).getPosition())) {
                return true;
            }
        }
        return false;
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        if (this.relevantChanges.isEmpty() || !this.modifierNode.getIsAttached()) {
            return false;
        }
        block.invoke();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> children = getChildren();
        int size = children.getSize();
        if (size > 0) {
            androidx.compose.ui.input.pointer.Node[] content = children.getContent();
            int i = 0;
            do {
                content[i].dispatchCancel();
                i++;
            } while (i < size);
        }
        androidx.compose.ui.node.DelegatingNode delegatingNode = this.modifierNode;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(16);
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof androidx.compose.ui.node.PointerInputModifierNode) {
                ((androidx.compose.ui.node.PointerInputModifierNode) delegatingNode).onCancelPointerInput();
            } else if ((delegatingNode.getKindSet() & m3613constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                int i2 = 0;
                delegatingNode = delegatingNode;
                while (delegate != null) {
                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                        i2++;
                        if (i2 == 1) {
                            delegatingNode = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                            }
                            if (delegatingNode != 0) {
                                if (mutableVector != null) {
                                    mutableVector.add(delegatingNode);
                                }
                                delegatingNode = 0;
                            }
                            if (mutableVector != null) {
                                mutableVector.add(delegate);
                            }
                        }
                    }
                    delegate = delegate.getChild();
                    delegatingNode = delegatingNode;
                }
                if (i2 == 1) {
                }
            }
            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
        }
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void cleanUpHits(androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent) {
        super.cleanUpHits(internalPointerEvent);
        androidx.compose.ui.input.pointer.PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes.get(i);
            if (!pointerInputChange.getPressed() && (!internalPointerEvent.m3204issuesEnterExitEvent0FcD4WY(pointerInputChange.getId()) || !this.isIn)) {
                this.pointerIds.m3372remove0FcD4WY(pointerInputChange.getId());
            }
        }
        this.isIn = false;
        this.hasExited = androidx.compose.ui.input.pointer.PointerEventType.m3224equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3229getExit7fucELk());
    }

    public java.lang.String toString() {
        return "Node(pointerInputFilter=" + this.modifierNode + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> changes, androidx.compose.ui.layout.LayoutCoordinates parentCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> children;
        int size;
        if (this.relevantChanges.isEmpty() || !this.modifierNode.getIsAttached()) {
            return false;
        }
        androidx.compose.ui.input.pointer.PointerEvent pointerEvent = this.pointerEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNull(pointerEvent);
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.coordinates;
        kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates);
        long mo3409getSizeYbymL2g = layoutCoordinates.mo3409getSizeYbymL2g();
        androidx.compose.ui.node.DelegatingNode delegatingNode = this.modifierNode;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(16);
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof androidx.compose.ui.node.PointerInputModifierNode) {
                ((androidx.compose.ui.node.PointerInputModifierNode) delegatingNode).mo181onPointerEventH0pRuoY(pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass.Initial, mo3409getSizeYbymL2g);
            } else if ((delegatingNode.getKindSet() & m3613constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                int i = 0;
                delegatingNode = delegatingNode;
                while (delegate != null) {
                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            delegatingNode = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                            }
                            if (delegatingNode != 0) {
                                if (mutableVector != null) {
                                    mutableVector.add(delegatingNode);
                                }
                                delegatingNode = 0;
                            }
                            if (mutableVector != null) {
                                mutableVector.add(delegate);
                            }
                        }
                    }
                    delegate = delegate.getChild();
                    delegatingNode = delegatingNode;
                }
                if (i == 1) {
                }
            }
            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
        }
        if (this.modifierNode.getIsAttached() && (size = (children = getChildren()).getSize()) > 0) {
            androidx.compose.ui.input.pointer.Node[] content = children.getContent();
            int i2 = 0;
            do {
                androidx.compose.ui.input.pointer.Node node = content[i2];
                androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> longSparseArray = this.relevantChanges;
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = this.coordinates;
                kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates2);
                node.dispatchMainEventPass(longSparseArray, layoutCoordinates2, internalPointerEvent, isInBounds);
                i2++;
            } while (i2 < size);
        }
        if (this.modifierNode.getIsAttached()) {
            androidx.compose.ui.node.DelegatingNode delegatingNode2 = this.modifierNode;
            int m3613constructorimpl2 = androidx.compose.ui.node.NodeKind.m3613constructorimpl(16);
            androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
            while (delegatingNode2 != 0) {
                if (delegatingNode2 instanceof androidx.compose.ui.node.PointerInputModifierNode) {
                    ((androidx.compose.ui.node.PointerInputModifierNode) delegatingNode2).mo181onPointerEventH0pRuoY(pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass.Main, mo3409getSizeYbymL2g);
                } else if ((delegatingNode2.getKindSet() & m3613constructorimpl2) != 0 && (delegatingNode2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                    androidx.compose.ui.Modifier.Node delegate2 = delegatingNode2.getDelegate();
                    int i3 = 0;
                    delegatingNode2 = delegatingNode2;
                    while (delegate2 != null) {
                        if ((delegate2.getKindSet() & m3613constructorimpl2) != 0) {
                            i3++;
                            if (i3 == 1) {
                                delegatingNode2 = delegate2;
                            } else {
                                if (mutableVector2 == null) {
                                    mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                }
                                if (delegatingNode2 != 0) {
                                    if (mutableVector2 != null) {
                                        mutableVector2.add(delegatingNode2);
                                    }
                                    delegatingNode2 = 0;
                                }
                                if (mutableVector2 != null) {
                                    mutableVector2.add(delegate2);
                                }
                            }
                        }
                        delegate2 = delegate2.getChild();
                        delegatingNode2 = delegatingNode2;
                    }
                    if (i3 == 1) {
                    }
                }
                delegatingNode2 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector2);
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> children;
        int size;
        boolean z = false;
        int i = 0;
        z = false;
        if (!this.relevantChanges.isEmpty() && this.modifierNode.getIsAttached()) {
            androidx.compose.ui.input.pointer.PointerEvent pointerEvent = this.pointerEvent;
            kotlin.jvm.internal.Intrinsics.checkNotNull(pointerEvent);
            androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.coordinates;
            kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates);
            long mo3409getSizeYbymL2g = layoutCoordinates.mo3409getSizeYbymL2g();
            androidx.compose.ui.node.DelegatingNode delegatingNode = this.modifierNode;
            int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(16);
            androidx.compose.runtime.collection.MutableVector mutableVector = null;
            while (delegatingNode != 0) {
                if (delegatingNode instanceof androidx.compose.ui.node.PointerInputModifierNode) {
                    ((androidx.compose.ui.node.PointerInputModifierNode) delegatingNode).mo181onPointerEventH0pRuoY(pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass.Final, mo3409getSizeYbymL2g);
                } else if ((delegatingNode.getKindSet() & m3613constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                    androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                    int i2 = 0;
                    delegatingNode = delegatingNode;
                    while (delegate != null) {
                        if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                            i2++;
                            if (i2 == 1) {
                                delegatingNode = delegate;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                }
                                if (delegatingNode != 0) {
                                    if (mutableVector != null) {
                                        mutableVector.add(delegatingNode);
                                    }
                                    delegatingNode = 0;
                                }
                                if (mutableVector != null) {
                                    mutableVector.add(delegate);
                                }
                            }
                        }
                        delegate = delegate.getChild();
                        delegatingNode = delegatingNode;
                    }
                    if (i2 == 1) {
                    }
                }
                delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
            }
            if (this.modifierNode.getIsAttached() && (size = (children = getChildren()).getSize()) > 0) {
                androidx.compose.ui.input.pointer.Node[] content = children.getContent();
                do {
                    content[i].dispatchFinalEventPass(internalPointerEvent);
                    i++;
                } while (i < size);
            }
            z = true;
        }
        cleanUpHits(internalPointerEvent);
        clearCache();
        return z;
    }
}
