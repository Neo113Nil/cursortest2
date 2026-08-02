package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0016\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\u001a\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J!\u0010\u001e\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u00101R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00103\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00105\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010 \u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u00108R\u0016\u00109\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00108"}, d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "Landroidx/compose/ui/Modifier$Node;", "modifierNode", "<init>", "(Landroidx/compose/ui/Modifier$Node;)V", "", "pointerIdValue", "Landroidx/collection/MutableObjectList;", "hitNodes", "", "removeInvalidPointerIdsAndChanges", "(JLandroidx/collection/MutableObjectList;)V", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "", "isInBounds", "dispatchMainEventPass", "(Landroidx/collection/LongSparseArray;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/input/pointer/InternalPointerEvent;Z)Z", "dispatchFinalEventPass", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)Z", "buildCache", "Landroidx/compose/ui/input/pointer/PointerEvent;", "p0", "p1", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "getHighSpeedVideoFpsRanges", "()V", "dispatchCancel", "markIsIn", "cleanUpHits", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/Modifier$Node;", "getModifierNode", "()Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "pointerIds", "Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "getPointerIds", "()Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "Landroidx/collection/LongSparseArray;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/input/pointer/PointerEvent;", "getOutputMinFrameDuration", "Z", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Node extends androidx.compose.ui.input.pointer.NodeParent {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.input.pointer.PointerEvent getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.layout.LayoutCoordinates getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;
    private final androidx.compose.ui.Modifier.Node modifierNode;
    private final androidx.compose.ui.input.pointer.util.PointerIdArray pointerIds = new androidx.compose.ui.input.pointer.util.PointerIdArray();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> getHighResolutionOutputSizeshNQ4ISI = new androidx.collection.LongSparseArray<>(2);
    private boolean getHighSpeedVideoFpsRanges = true;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor = true;

    public Node(androidx.compose.ui.Modifier.Node node) {
        this.modifierNode = node;
    }

    public final androidx.compose.ui.Modifier.Node getModifierNode() {
        return this.modifierNode;
    }

    public final androidx.compose.ui.input.pointer.util.PointerIdArray getPointerIds() {
        return this.pointerIds;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public final void removeInvalidPointerIdsAndChanges(long pointerIdValue, androidx.collection.MutableObjectList<androidx.compose.ui.input.pointer.Node> hitNodes) {
        if (this.pointerIds.contains(pointerIdValue) && !hitNodes.contains(this)) {
            this.pointerIds.remove(pointerIdValue);
            this.getHighResolutionOutputSizeshNQ4ISI.remove(pointerIdValue);
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> children = getChildren();
        androidx.compose.ui.input.pointer.Node[] nodeArr = children.content;
        int size = children.getSize();
        for (int i = 0; i < size; i++) {
            nodeArr[i].removeInvalidPointerIdsAndChanges(pointerIdValue, hitNodes);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v30, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public final boolean buildCache(androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> changes, androidx.compose.ui.layout.LayoutCoordinates parentCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        boolean z;
        boolean z2;
        int m7185getExit7fucELk;
        boolean z3;
        int i;
        int i2;
        androidx.compose.ui.input.pointer.PointerInputChange m7226copyOHpmEuE;
        java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> list;
        boolean buildCache = super.buildCache(changes, parentCoordinates, internalPointerEvent, isInBounds);
        if (!this.modifierNode.getIsAttached()) {
            return true;
        }
        androidx.compose.ui.node.DelegatingNode delegatingNode = this.modifierNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(16);
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof androidx.compose.ui.node.PointerInputModifierNode) {
                this.getHighSpeedVideoSizes = androidx.compose.ui.node.PointerInputModifierNodeKt.getLayoutCoordinates((androidx.compose.ui.node.PointerInputModifierNode) delegatingNode);
            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                int i3 = 0;
                delegatingNode = delegatingNode;
                while (delegate != null) {
                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                        i3++;
                        if (i3 == 1) {
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
                if (i3 != 1) {
                }
            }
            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
        }
        if (this.getHighSpeedVideoSizes == null) {
            return true;
        }
        int size = changes.size();
        int i4 = 0;
        while (i4 < size) {
            long keyAt = changes.keyAt(i4);
            androidx.compose.ui.input.pointer.PointerInputChange valueAt = changes.valueAt(i4);
            if (this.pointerIds.contains(keyAt)) {
                long previousPosition = valueAt.getPreviousPosition();
                i2 = i4;
                long position = valueAt.getPosition();
                if ((((previousPosition & 9223372034707292159L) + androidx.compose.ui.geometry.InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0 && (((position & 9223372034707292159L) + androidx.compose.ui.geometry.InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(valueAt.getHistorical().size());
                    java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> historical = valueAt.getHistorical();
                    int size2 = historical.size();
                    i = size;
                    int i5 = 0;
                    while (i5 < size2) {
                        androidx.compose.ui.input.pointer.HistoricalChange historicalChange = historical.get(i5);
                        boolean z4 = buildCache;
                        long position2 = historicalChange.getPosition();
                        if ((((position2 & 9223372034707292159L) + androidx.compose.ui.geometry.InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0) {
                            long uptimeMillis = historicalChange.getUptimeMillis();
                            list = historical;
                            androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.getHighSpeedVideoSizes;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates);
                            arrayList.add(new androidx.compose.ui.input.pointer.HistoricalChange(uptimeMillis, layoutCoordinates.mo7362localPositionOfR5De75A(parentCoordinates, position2), historicalChange.getOriginalEventPosition(), null));
                        } else {
                            list = historical;
                        }
                        i5++;
                        historical = list;
                        buildCache = z4;
                    }
                    z3 = buildCache;
                    androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> longSparseArray = this.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = this.getHighSpeedVideoSizes;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates2);
                    long mo7362localPositionOfR5De75A = layoutCoordinates2.mo7362localPositionOfR5De75A(parentCoordinates, previousPosition);
                    androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates3 = this.getHighSpeedVideoSizes;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates3);
                    m7226copyOHpmEuE = valueAt.m7226copyOHpmEuE((r34 & 1) != 0 ? valueAt.id : 0L, (r34 & 2) != 0 ? valueAt.uptimeMillis : 0L, (r34 & 4) != 0 ? valueAt.position : layoutCoordinates3.mo7362localPositionOfR5De75A(parentCoordinates, position), (r34 & 8) != 0 ? valueAt.pressed : false, (r34 & 16) != 0 ? valueAt.previousUptimeMillis : 0L, (r34 & 32) != 0 ? valueAt.previousPosition : mo7362localPositionOfR5De75A, (r34 & 64) != 0 ? valueAt.previousPressed : false, (r34 & 128) != 0 ? valueAt.type : 0, arrayList, (r34 & 512) != 0 ? valueAt.scrollDelta : 0L);
                    longSparseArray.put(keyAt, m7226copyOHpmEuE);
                } else {
                    z3 = buildCache;
                    i = size;
                }
            } else {
                z3 = buildCache;
                i = size;
                i2 = i4;
            }
            i4 = i2 + 1;
            size = i;
            buildCache = z3;
        }
        boolean z5 = buildCache;
        if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
            this.pointerIds.clear();
            getChildren().clear();
            return true;
        }
        for (int size3 = this.pointerIds.getSize() - 1; size3 >= 0; size3--) {
            if (!changes.containsKey(this.pointerIds.m7327get_I2yYro(size3))) {
                this.pointerIds.removeAt(size3);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.getHighResolutionOutputSizeshNQ4ISI.size());
        int size4 = this.getHighResolutionOutputSizeshNQ4ISI.size();
        for (int i6 = 0; i6 < size4; i6++) {
            arrayList2.add(this.getHighResolutionOutputSizeshNQ4ISI.valueAt(i6));
        }
        androidx.compose.ui.input.pointer.PointerEvent pointerEvent = new androidx.compose.ui.input.pointer.PointerEvent(arrayList2, internalPointerEvent);
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
        int size5 = changes2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                pointerInputChange = null;
                break;
            }
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = changes2.get(i7);
            if (internalPointerEvent.m7161activeHoverEvent0FcD4WY(pointerInputChange2.getId())) {
                pointerInputChange = pointerInputChange2;
                break;
            }
            i7++;
        }
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = pointerInputChange;
        if (pointerInputChange3 != null) {
            if (!isInBounds) {
                z = false;
                this.getHighSpeedVideoFpsRanges = false;
            } else {
                z = false;
                if (!this.getHighSpeedVideoFpsRanges && (pointerInputChange3.getPressed() || pointerInputChange3.getPreviousPressed())) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(this.getHighSpeedVideoSizes);
                    z2 = true;
                    this.getHighSpeedVideoFpsRanges = !androidx.compose.ui.input.pointer.PointerEventKt.m7176isOutOfBoundsO0kMr_c(pointerInputChange3, r3.mo7361getSizeYbymL2g());
                    if (this.getHighSpeedVideoFpsRanges == this.Camera2StreamConfigurationMap && (androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7186getMove7fucELk()) || androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7184getEnter7fucELk()) || androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7185getExit7fucELk()))) {
                        if (this.getHighSpeedVideoFpsRanges) {
                            m7185getExit7fucELk = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7184getEnter7fucELk();
                        } else {
                            m7185getExit7fucELk = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7185getExit7fucELk();
                        }
                        pointerEvent.m7175setTypeEhbLWgg$ui(m7185getExit7fucELk);
                    } else if (!androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7184getEnter7fucELk()) && this.Camera2StreamConfigurationMap && !this.getHighSpeedVideoSizesFor) {
                        pointerEvent.m7175setTypeEhbLWgg$ui(androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7186getMove7fucELk());
                    } else if (androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7185getExit7fucELk()) && this.getHighSpeedVideoFpsRanges && pointerInputChange3.getPressed()) {
                        pointerEvent.m7175setTypeEhbLWgg$ui(androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7186getMove7fucELk());
                    }
                }
            }
            z2 = true;
            if (this.getHighSpeedVideoFpsRanges == this.Camera2StreamConfigurationMap) {
            }
            if (!androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7184getEnter7fucELk())) {
            }
            if (androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7185getExit7fucELk())) {
                pointerEvent.m7175setTypeEhbLWgg$ui(androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7186getMove7fucELk());
            }
        } else {
            z = false;
            z2 = true;
        }
        boolean z6 = (z5 || !androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7186getMove7fucELk()) || getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, pointerEvent)) ? z2 : z;
        this.getHighSpeedVideoFpsRangesFor = pointerEvent;
        return z6;
    }

    private static boolean getHighSpeedVideoSizes(androidx.compose.ui.input.pointer.PointerEvent p0, androidx.compose.ui.input.pointer.PointerEvent p1) {
        if (p0 == null || p0.getChanges().size() != p1.getChanges().size()) {
            return true;
        }
        int size = p1.getChanges().size();
        for (int i = 0; i < size; i++) {
            if (!androidx.compose.ui.geometry.Offset.m5749equalsimpl0(p0.getChanges().get(i).getPosition(), p1.getChanges().get(i).getPosition())) {
                return true;
            }
        }
        return false;
    }

    private final void getHighSpeedVideoFpsRanges() {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        this.getHighSpeedVideoSizes = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public final void dispatchCancel() {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> children = getChildren();
        androidx.compose.ui.input.pointer.Node[] nodeArr = children.content;
        int size = children.getSize();
        for (int i = 0; i < size; i++) {
            nodeArr[i].dispatchCancel();
        }
        androidx.compose.ui.node.DelegatingNode delegatingNode = this.modifierNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(16);
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof androidx.compose.ui.node.PointerInputModifierNode) {
                ((androidx.compose.ui.node.PointerInputModifierNode) delegatingNode).onCancelPointerInput();
            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                int i2 = 0;
                delegatingNode = delegatingNode;
                while (delegate != null) {
                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
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
                if (i2 != 1) {
                }
            }
            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
        }
    }

    public final void markIsIn() {
        this.getHighSpeedVideoFpsRanges = true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public final void cleanUpHits(androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent) {
        super.cleanUpHits(internalPointerEvent);
        androidx.compose.ui.input.pointer.PointerEvent pointerEvent = this.getHighSpeedVideoFpsRangesFor;
        if (pointerEvent == null) {
            return;
        }
        this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes.get(i);
            boolean pressed = pointerInputChange.getPressed();
            boolean m7161activeHoverEvent0FcD4WY = internalPointerEvent.m7161activeHoverEvent0FcD4WY(pointerInputChange.getId());
            boolean z = this.getHighSpeedVideoFpsRanges;
            if ((!pressed && !m7161activeHoverEvent0FcD4WY) || (!pressed && !z)) {
                this.pointerIds.remove(pointerInputChange.getId());
            }
        }
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoSizesFor = androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7185getExit7fucELk());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Node(modifierNode=");
        sb.append(this.modifierNode);
        sb.append(", children=");
        sb.append(getChildren());
        sb.append(", pointerIds=");
        sb.append(this.pointerIds);
        sb.append(')');
        return sb.toString();
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
    public final boolean dispatchMainEventPass(androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> changes, androidx.compose.ui.layout.LayoutCoordinates parentCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty() || !this.modifierNode.getIsAttached()) {
            return false;
        }
        androidx.compose.ui.input.pointer.PointerEvent pointerEvent = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(pointerEvent);
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates);
        long mo7361getSizeYbymL2g = layoutCoordinates.mo7361getSizeYbymL2g();
        androidx.compose.ui.node.DelegatingNode delegatingNode = this.modifierNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(16);
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof androidx.compose.ui.node.PointerInputModifierNode) {
                ((androidx.compose.ui.node.PointerInputModifierNode) delegatingNode).mo1262onPointerEventH0pRuoY(pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass.Initial, mo7361getSizeYbymL2g);
            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                int i = 0;
                delegatingNode = delegatingNode;
                while (delegate != null) {
                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
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
                if (i != 1) {
                }
            }
            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
        }
        if (this.modifierNode.getIsAttached()) {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> children = getChildren();
            androidx.compose.ui.input.pointer.Node[] nodeArr = children.content;
            int size = children.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                androidx.compose.ui.input.pointer.Node node = nodeArr[i2];
                androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> longSparseArray = this.getHighResolutionOutputSizeshNQ4ISI;
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = this.getHighSpeedVideoSizes;
                kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates2);
                node.dispatchMainEventPass(longSparseArray, layoutCoordinates2, internalPointerEvent, isInBounds);
            }
        }
        if (this.modifierNode.getIsAttached()) {
            androidx.compose.ui.node.DelegatingNode delegatingNode2 = this.modifierNode;
            int m7621constructorimpl2 = androidx.compose.ui.node.NodeKind.m7621constructorimpl(16);
            androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
            while (delegatingNode2 != 0) {
                if (delegatingNode2 instanceof androidx.compose.ui.node.PointerInputModifierNode) {
                    ((androidx.compose.ui.node.PointerInputModifierNode) delegatingNode2).mo1262onPointerEventH0pRuoY(pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass.Main, mo7361getSizeYbymL2g);
                } else if ((delegatingNode2.getKindSet() & m7621constructorimpl2) != 0 && (delegatingNode2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                    androidx.compose.ui.Modifier.Node delegate2 = delegatingNode2.getDelegate();
                    int i3 = 0;
                    delegatingNode2 = delegatingNode2;
                    while (delegate2 != null) {
                        if ((delegate2.getKindSet() & m7621constructorimpl2) != 0) {
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
                    if (i3 != 1) {
                    }
                }
                delegatingNode2 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
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
    public final boolean dispatchFinalEventPass(androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent) {
        boolean z = false;
        z = false;
        if (!this.getHighResolutionOutputSizeshNQ4ISI.isEmpty() && this.modifierNode.getIsAttached()) {
            androidx.compose.ui.input.pointer.PointerEvent pointerEvent = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(pointerEvent);
            androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates);
            long mo7361getSizeYbymL2g = layoutCoordinates.mo7361getSizeYbymL2g();
            androidx.compose.ui.node.DelegatingNode delegatingNode = this.modifierNode;
            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(16);
            androidx.compose.runtime.collection.MutableVector mutableVector = null;
            while (delegatingNode != 0) {
                if (delegatingNode instanceof androidx.compose.ui.node.PointerInputModifierNode) {
                    ((androidx.compose.ui.node.PointerInputModifierNode) delegatingNode).mo1262onPointerEventH0pRuoY(pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass.Final, mo7361getSizeYbymL2g);
                } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                    androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                    int i = 0;
                    delegatingNode = delegatingNode;
                    while (delegate != null) {
                        if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
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
                    if (i != 1) {
                    }
                }
                delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
            }
            if (this.modifierNode.getIsAttached()) {
                androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> children = getChildren();
                androidx.compose.ui.input.pointer.Node[] nodeArr = children.content;
                int size = children.getSize();
                for (int i2 = 0; i2 < size; i2++) {
                    nodeArr[i2].dispatchFinalEventPass(internalPointerEvent);
                }
            }
            z = true;
        }
        cleanUpHits(internalPointerEvent);
        getHighSpeedVideoFpsRanges();
        return z;
    }
}
