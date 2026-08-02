package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "", "isInBounds", "Landroidx/compose/ui/input/pointer/ProcessResult;", "process-BIzXfog", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;Z)I", "process", "", "processCancel", "()V", "clearPreviouslyHitModifierNodes", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "Landroidx/compose/ui/node/HitTestResult;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/node/HitTestResult;", "Camera2StreamConfigurationMap", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerInputEventProcessor {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.input.pointer.HitPathTracker getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.ui.node.LayoutNode root;
    private final androidx.compose.ui.input.pointer.PointerInputChangeEventProducer getHighSpeedVideoSizes = new androidx.compose.ui.input.pointer.PointerInputChangeEventProducer();
    private final androidx.compose.ui.node.HitTestResult getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.ui.node.HitTestResult();

    public PointerInputEventProcessor(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.root = layoutNode;
        this.getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.input.pointer.HitPathTracker(layoutNode.getCoordinates());
    }

    public final androidx.compose.ui.node.LayoutNode getRoot() {
        return this.root;
    }

    /* renamed from: process-BIzXfog$default, reason: not valid java name */
    public static /* synthetic */ int m7250processBIzXfog$default(androidx.compose.ui.input.pointer.PointerInputEventProcessor pointerInputEventProcessor, androidx.compose.ui.input.pointer.PointerInputEvent pointerInputEvent, androidx.compose.ui.input.pointer.PositionCalculator positionCalculator, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return pointerInputEventProcessor.m7251processBIzXfog(pointerInputEvent, positionCalculator, z);
    }

    /* renamed from: process-BIzXfog, reason: not valid java name */
    public final int m7251processBIzXfog(androidx.compose.ui.input.pointer.PointerInputEvent pointerEvent, androidx.compose.ui.input.pointer.PositionCalculator positionCalculator, boolean isInBounds) {
        boolean z;
        boolean z2;
        if (this.getHighSpeedVideoFpsRanges) {
            return androidx.compose.ui.input.pointer.PointerInputEventProcessorKt.ProcessResult(false, false, false);
        }
        boolean z3 = true;
        try {
            this.getHighSpeedVideoFpsRanges = true;
            androidx.compose.ui.input.pointer.InternalPointerEvent highSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(pointerEvent, positionCalculator);
            int size = highSpeedVideoFpsRangesFor.getChanges().size();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.input.pointer.PointerInputChange valueAt = highSpeedVideoFpsRangesFor.getChanges().valueAt(i);
                if (!valueAt.getPressed() && !valueAt.getPreviousPressed()) {
                }
                z = false;
                break;
            }
            z = true;
            int size2 = highSpeedVideoFpsRangesFor.getChanges().size();
            for (int i2 = 0; i2 < size2; i2++) {
                androidx.compose.ui.input.pointer.PointerInputChange valueAt2 = highSpeedVideoFpsRangesFor.getChanges().valueAt(i2);
                if (z || androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(valueAt2)) {
                    androidx.compose.ui.node.LayoutNode.m7550hitTest6fMxITs$ui$default(this.root, valueAt2.getPosition(), this.getHighResolutionOutputSizeshNQ4ISI, valueAt2.getType(), false, 8, null);
                    if (!this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                        this.getHighSpeedVideoFpsRangesFor.m7159addHitPathQJqDSyo(valueAt2.getId(), this.getHighResolutionOutputSizeshNQ4ISI, androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(valueAt2));
                        this.getHighResolutionOutputSizeshNQ4ISI.clear();
                    }
                }
            }
            boolean dispatchChanges = this.getHighSpeedVideoFpsRangesFor.dispatchChanges(highSpeedVideoFpsRangesFor, isInBounds);
            if (!highSpeedVideoFpsRangesFor.getSuppressMovementConsumption()) {
                int size3 = highSpeedVideoFpsRangesFor.getChanges().size();
                for (int i3 = 0; i3 < size3; i3++) {
                    androidx.compose.ui.input.pointer.PointerInputChange valueAt3 = highSpeedVideoFpsRangesFor.getChanges().valueAt(i3);
                    if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(valueAt3) && valueAt3.isConsumed()) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            int size4 = highSpeedVideoFpsRangesFor.getChanges().size();
            int i4 = 0;
            while (true) {
                if (i4 >= size4) {
                    z3 = false;
                    break;
                }
                if (highSpeedVideoFpsRangesFor.getChanges().valueAt(i4).isConsumed()) {
                    break;
                }
                i4++;
            }
            return androidx.compose.ui.input.pointer.PointerInputEventProcessorKt.ProcessResult(dispatchChanges, z2, z3);
        } finally {
            this.getHighSpeedVideoFpsRanges = false;
        }
    }

    public final void processCancel() {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI();
        this.getHighSpeedVideoFpsRangesFor.processCancel();
    }

    public final void clearPreviouslyHitModifierNodes() {
        this.getHighSpeedVideoFpsRangesFor.clearPreviouslyHitModifierNodeCache();
    }
}
