package androidx.compose.ui.input.pointer;

/* compiled from: PointerInputEventProcessor.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J-\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "hitPathTracker", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "hitResult", "Landroidx/compose/ui/node/HitTestResult;", "isProcessing", "", "pointerInputChangeEventProducer", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "process", "Landroidx/compose/ui/input/pointer/ProcessResult;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "isInBounds", "process-BIzXfog", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;Z)I", "processCancel", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerInputEventProcessor {
    public static final int $stable = 8;
    private final androidx.compose.ui.input.pointer.HitPathTracker hitPathTracker;
    private boolean isProcessing;
    private final androidx.compose.ui.node.LayoutNode root;
    private final androidx.compose.ui.input.pointer.PointerInputChangeEventProducer pointerInputChangeEventProducer = new androidx.compose.ui.input.pointer.PointerInputChangeEventProducer();
    private final androidx.compose.ui.node.HitTestResult hitResult = new androidx.compose.ui.node.HitTestResult();

    public PointerInputEventProcessor(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.root = layoutNode;
        this.hitPathTracker = new androidx.compose.ui.input.pointer.HitPathTracker(layoutNode.getCoordinates());
    }

    public final androidx.compose.ui.node.LayoutNode getRoot() {
        return this.root;
    }

    /* renamed from: process-BIzXfog$default, reason: not valid java name */
    public static /* synthetic */ int m3296processBIzXfog$default(androidx.compose.ui.input.pointer.PointerInputEventProcessor pointerInputEventProcessor, androidx.compose.ui.input.pointer.PointerInputEvent pointerInputEvent, androidx.compose.ui.input.pointer.PositionCalculator positionCalculator, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return pointerInputEventProcessor.m3297processBIzXfog(pointerInputEvent, positionCalculator, z);
    }

    /* renamed from: process-BIzXfog, reason: not valid java name */
    public final int m3297processBIzXfog(androidx.compose.ui.input.pointer.PointerInputEvent pointerEvent, androidx.compose.ui.input.pointer.PositionCalculator positionCalculator, boolean isInBounds) {
        boolean z;
        if (this.isProcessing) {
            return androidx.compose.ui.input.pointer.PointerInputEventProcessorKt.ProcessResult(false, false);
        }
        boolean z2 = true;
        try {
            this.isProcessing = true;
            androidx.compose.ui.input.pointer.InternalPointerEvent produce = this.pointerInputChangeEventProducer.produce(pointerEvent, positionCalculator);
            int size = produce.getChanges().size();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.input.pointer.PointerInputChange valueAt = produce.getChanges().valueAt(i);
                if (!valueAt.getPressed() && !valueAt.getPreviousPressed()) {
                }
                z = false;
                break;
            }
            z = true;
            int size2 = produce.getChanges().size();
            for (int i2 = 0; i2 < size2; i2++) {
                androidx.compose.ui.input.pointer.PointerInputChange valueAt2 = produce.getChanges().valueAt(i2);
                if (z || androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(valueAt2)) {
                    this.root.m3536hitTestM_7yMNQ$ui_release(valueAt2.getPosition(), this.hitResult, (r12 & 4) != 0 ? false : androidx.compose.ui.input.pointer.PointerType.m3348equalsimpl0(valueAt2.getType(), androidx.compose.ui.input.pointer.PointerType.INSTANCE.m3355getTouchT8wyACA()), (r12 & 8) != 0);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.m3203addHitPathKNwqfcY(valueAt2.getId(), this.hitResult);
                        this.hitResult.clear();
                    }
                }
            }
            this.hitPathTracker.removeDetachedPointerInputFilters();
            boolean dispatchChanges = this.hitPathTracker.dispatchChanges(produce, isInBounds);
            if (!produce.getSuppressMovementConsumption()) {
                int size3 = produce.getChanges().size();
                for (int i3 = 0; i3 < size3; i3++) {
                    androidx.compose.ui.input.pointer.PointerInputChange valueAt3 = produce.getChanges().valueAt(i3);
                    if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(valueAt3) && valueAt3.isConsumed()) {
                        break;
                    }
                }
            }
            z2 = false;
            return androidx.compose.ui.input.pointer.PointerInputEventProcessorKt.ProcessResult(dispatchChanges, z2);
        } finally {
            this.isProcessing = false;
        }
    }

    public final void processCancel() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.clear();
        this.hitPathTracker.processCancel();
    }
}
