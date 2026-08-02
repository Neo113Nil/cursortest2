package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\r¢\u0006\u0004\b!\u0010 R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u0012\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010&R\u0016\u0010\u0018\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u00100"}, d2 = {"Landroidx/compose/ui/input/pointer/HitPathTracker;", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "rootCoordinates", "<init>", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "", "Landroidx/compose/ui/Modifier$Node;", "pointerInputNodes", "", "prunePointerIdsAndChangesNotInNodesList", "", "addHitPath-QJqDSyo", "(JLjava/util/List;Z)V", "addHitPath", "p0", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/Modifier$Node;)V", "", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/input/pointer/Node;", "p1", "Camera2StreamConfigurationMap", "(JLandroidx/collection/MutableObjectList;)V", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "isInBounds", "dispatchChanges", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;Z)Z", "clearPreviouslyHitModifierNodeCache", "()V", "processCancel", "getOutputFormats", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoSizesFor", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/input/pointer/NodeParent;", "root", "Landroidx/compose/ui/input/pointer/NodeParent;", "getRoot$ui", "()Landroidx/compose/ui/input/pointer/NodeParent;", "Landroidx/collection/MutableLongObjectMap;", "Landroidx/collection/MutableLongObjectMap;", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HitPathTracker {
    public static final int $stable = 8;
    private boolean Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.LayoutCoordinates getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.collection.MutableObjectList<androidx.compose.ui.Modifier.Node> getOutputFormats = new androidx.collection.MutableObjectList<>(0, 1, null);
    private final androidx.compose.ui.input.pointer.NodeParent root = new androidx.compose.ui.input.pointer.NodeParent();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.collection.MutableLongObjectMap<androidx.collection.MutableObjectList<androidx.compose.ui.input.pointer.Node>> getInputSizeshNQ4ISI = new androidx.collection.MutableLongObjectMap<>(10);

    public HitPathTracker(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.getHighSpeedVideoSizes = layoutCoordinates;
    }

    /* renamed from: getRoot$ui, reason: from getter */
    public final androidx.compose.ui.input.pointer.NodeParent getRoot() {
        return this.root;
    }

    /* renamed from: addHitPath-QJqDSyo$default, reason: not valid java name */
    public static /* synthetic */ void m7158addHitPathQJqDSyo$default(androidx.compose.ui.input.pointer.HitPathTracker hitPathTracker, long j, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        hitPathTracker.m7159addHitPathQJqDSyo(j, list, z);
    }

    /* renamed from: addHitPath-QJqDSyo, reason: not valid java name */
    public final void m7159addHitPathQJqDSyo(long pointerId, java.util.List<? extends androidx.compose.ui.Modifier.Node> pointerInputNodes, boolean prunePointerIdsAndChangesNotInNodesList) {
        androidx.compose.ui.input.pointer.Node node;
        androidx.compose.ui.input.pointer.Node node2 = this.root;
        int size = pointerInputNodes.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            final androidx.compose.ui.Modifier.Node node3 = pointerInputNodes.get(i);
            if (node3.getIsAttached()) {
                node3.setDetachedListener$ui(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.input.pointer.HitPathTracker$addHitPath$1
                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ kotlin.Unit invoke() {
                        getHighSpeedVideoFpsRangesFor();
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoFpsRangesFor() {
                        androidx.compose.ui.input.pointer.HitPathTracker.this.getHighSpeedVideoFpsRanges(node3);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                });
                if (z) {
                    androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> children = node2.getChildren();
                    androidx.compose.ui.input.pointer.Node[] nodeArr = children.content;
                    int size2 = children.getSize();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            node = null;
                            break;
                        }
                        node = nodeArr[i2];
                        if (kotlin.jvm.internal.Intrinsics.areEqual(node.getModifierNode(), node3)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    androidx.compose.ui.input.pointer.Node node4 = node;
                    if (node4 != null) {
                        node4.markIsIn();
                        node4.getPointerIds().add(pointerId);
                        if (prunePointerIdsAndChangesNotInNodesList) {
                            androidx.collection.MutableLongObjectMap<androidx.collection.MutableObjectList<androidx.compose.ui.input.pointer.Node>> mutableLongObjectMap = this.getInputSizeshNQ4ISI;
                            androidx.collection.MutableObjectList<androidx.compose.ui.input.pointer.Node> mutableObjectList = mutableLongObjectMap.get(pointerId);
                            if (mutableObjectList == null) {
                                mutableObjectList = new androidx.collection.MutableObjectList<>(0, 1, null);
                                mutableLongObjectMap.set(pointerId, mutableObjectList);
                            }
                            mutableObjectList.add(node4);
                        }
                        node2 = node4;
                    } else {
                        z = false;
                    }
                }
                androidx.compose.ui.input.pointer.Node node5 = new androidx.compose.ui.input.pointer.Node(node3);
                node5.getPointerIds().add(pointerId);
                if (prunePointerIdsAndChangesNotInNodesList) {
                    androidx.collection.MutableLongObjectMap<androidx.collection.MutableObjectList<androidx.compose.ui.input.pointer.Node>> mutableLongObjectMap2 = this.getInputSizeshNQ4ISI;
                    androidx.collection.MutableObjectList<androidx.compose.ui.input.pointer.Node> mutableObjectList2 = mutableLongObjectMap2.get(pointerId);
                    if (mutableObjectList2 == null) {
                        mutableObjectList2 = new androidx.collection.MutableObjectList<>(0, 1, null);
                        mutableLongObjectMap2.set(pointerId, mutableObjectList2);
                    }
                    mutableObjectList2.add(node5);
                }
                node2.getChildren().add(node5);
                node2 = node5;
            }
        }
        if (prunePointerIdsAndChangesNotInNodesList) {
            androidx.collection.MutableLongObjectMap<androidx.collection.MutableObjectList<androidx.compose.ui.input.pointer.Node>> mutableLongObjectMap3 = this.getInputSizeshNQ4ISI;
            long[] jArr = mutableLongObjectMap3.keys;
            java.lang.Object[] objArr = mutableLongObjectMap3.values;
            long[] jArr2 = mutableLongObjectMap3.metadata;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr2[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Camera2StreamConfigurationMap(jArr[i6], (androidx.collection.MutableObjectList) objArr[i6]);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.getInputSizeshNQ4ISI.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier.Node p0) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getOutputFormats.add(p0);
        } else {
            this.root.removePointerInputModifierNode(p0);
        }
    }

    private final void Camera2StreamConfigurationMap(long p0, androidx.collection.MutableObjectList<androidx.compose.ui.input.pointer.Node> p1) {
        this.root.removeInvalidPointerIdsAndChanges(p0, p1);
    }

    public static /* synthetic */ boolean dispatchChanges$default(androidx.compose.ui.input.pointer.HitPathTracker hitPathTracker, androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return hitPathTracker.dispatchChanges(internalPointerEvent, z);
    }

    public final boolean dispatchChanges(androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        if (!this.root.buildCache(internalPointerEvent.getChanges(), this.getHighSpeedVideoSizes, internalPointerEvent, isInBounds)) {
            return false;
        }
        boolean z = true;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        boolean dispatchMainEventPass = this.root.dispatchMainEventPass(internalPointerEvent.getChanges(), this.getHighSpeedVideoSizes, internalPointerEvent, isInBounds);
        if (!this.root.dispatchFinalEventPass(internalPointerEvent) && !dispatchMainEventPass) {
            z = false;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        if (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRangesFor = false;
            int size = this.getOutputFormats.getSize();
            for (int i = 0; i < size; i++) {
                getHighSpeedVideoFpsRanges(this.getOutputFormats.get(i));
            }
            this.getOutputFormats.clear();
        }
        if (this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRanges = false;
            processCancel();
        }
        if (this.Camera2StreamConfigurationMap) {
            this.Camera2StreamConfigurationMap = false;
            clearPreviouslyHitModifierNodeCache();
        }
        return z;
    }

    public final void clearPreviouslyHitModifierNodeCache() {
        if (this.Camera2StreamConfigurationMap) {
            this.Camera2StreamConfigurationMap = true;
        } else {
            this.root.clear();
        }
    }

    public final void processCancel() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRanges = true;
        } else {
            this.root.dispatchCancel();
            clearPreviouslyHitModifierNodeCache();
        }
    }
}
