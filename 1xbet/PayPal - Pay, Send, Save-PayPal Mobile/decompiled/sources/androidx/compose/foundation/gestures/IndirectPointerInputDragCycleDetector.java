package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001:\u0001YB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010*\u001a\u00020$H\u0002J\b\u0010+\u001a\u00020\u001fH\u0002J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u00020-J3\u00103\u001a\u00020-2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u00020!2\b\b\u0002\u00109\u001a\u00020:H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020-2\u0006\u00106\u001a\u000207H\u0002¢\u0006\u0004\b>\u0010?J\b\u0010@\u001a\u00020-H\u0002J'\u0010A\u001a\u00020-2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u0010#\u001a\u00020$H\u0002¢\u0006\u0004\bB\u0010CJ \u0010D\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010E\u001a\u00020\tH\u0002J \u0010F\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010E\u001a\u00020\u0013H\u0002J \u0010G\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010E\u001a\u00020\u0018H\u0002J \u0010H\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010E\u001a\u00020\u000eH\u0002J1\u0010I\u001a\u00020-2\u0006\u0010J\u001a\u0002052\u0006\u0010K\u001a\u0002052\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010N\u001a\u00020!H\u0002¢\u0006\u0004\bO\u0010PJ)\u0010Q\u001a\u00020-2\u0006\u0010R\u001a\u0002052\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010S\u001a\u00020!H\u0002¢\u0006\u0004\bT\u0010UJ\u001f\u0010V\u001a\u00020-2\u0006\u0010R\u001a\u0002052\b\u0010L\u001a\u0004\u0018\u00010MH\u0002¢\u0006\u0002\bWJ\b\u0010X\u001a\u00020-H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u00020!X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\"¨\u0006Z"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector;", "", "node", "Landroidx/compose/foundation/gestures/DragGestureNode;", "<init>", "(Landroidx/compose/foundation/gestures/DragGestureNode;)V", "getNode", "()Landroidx/compose/foundation/gestures/DragGestureNode;", "_awaitDownState", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;", "awaitDownState", "getAwaitDownState", "()Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;", "_draggingState", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$Dragging;", "draggingState", "getDraggingState", "()Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$Dragging;", "_awaitTouchSlopState", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop;", "awaitTouchSlopState", "getAwaitTouchSlopState", "()Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop;", "_awaitGesturePickupState", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup;", "awaitGesturePickupState", "getAwaitGesturePickupState", "()Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup;", "currentDragState", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState;", "velocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "previousPositionOnScreen", "Landroidx/compose/ui/geometry/Offset;", "J", "touchSlopDetector", "Landroidx/compose/foundation/gestures/TouchSlopDetector;", "touchSmooth", "Landroidx/compose/foundation/gestures/IndirectPointerInputEventSmoother;", "offsetSmoother", "Landroidx/compose/foundation/gestures/OffsetSmoother;", "nodeOffset", "requireTouchSlopDetector", "requireVelocityTracker", "processIndirectPointerInputEvent", "", "indirectPointerInputEvent", "Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "resetDragDetectionState", "moveToAwaitTouchSlopState", "initialDown", "Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "initialTouchSlopPositionChange", "verifyConsumptionInFinalPass", "", "moveToAwaitTouchSlopState-aWI9W7U", "(Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;JJZ)V", "moveToDraggingState", "moveToDraggingState-0FcD4WY", "(J)V", "moveToAwaitDownState", "moveToAwaitGesturePickupState", "moveToAwaitGesturePickupState-rnUCldI", "(Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;JLandroidx/compose/foundation/gestures/TouchSlopDetector;)V", "processInitialDownState", "state", "processAwaitTouchSlop", "processAwaitGesturePickup", "processDraggingState", "sendDragStart", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, "slopTriggerChange", "primaryDirectionalMotionAxis", "Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "overSlopOffset", "sendDragStart-3f7A7Is", "(Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;J)V", "sendDragEvent", "change", "dragAmount", "sendDragEvent-Eu1f8Dk", "(Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;J)V", "sendDragStopped", "sendDragStopped-k92h6UU", "sendDragCancelled", "DragDetectionState", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IndirectPointerInputDragCycleDetector {
    public static final int $stable = 8;
    private androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitGesturePickup Camera2StreamConfigurationMap;
    private androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.Dragging getHighResolutionOutputSizeshNQ4ISI;
    private androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitTouchSlop getHighSpeedVideoFpsRanges;
    private androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState getHighSpeedVideoFpsRangesFor;
    private androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown getHighSpeedVideoSizes;
    private androidx.compose.foundation.gestures.TouchSlopDetector getOutputMinFrameDuration;
    private androidx.compose.ui.input.pointer.util.VelocityTracker getOutputStallDuration;
    private final androidx.compose.foundation.gestures.DragGestureNode node;
    private long getHighSpeedVideoSizesFor = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
    private final androidx.compose.foundation.gestures.IndirectPointerInputEventSmoother getInputSizeshNQ4ISI = new androidx.compose.foundation.gestures.IndirectPointerInputEventSmoother();
    private final androidx.compose.foundation.gestures.OffsetSmoother getInputFormats = new androidx.compose.foundation.gestures.OffsetSmoother();
    private long getOutputFormats = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();

    public IndirectPointerInputDragCycleDetector(androidx.compose.foundation.gestures.DragGestureNode dragGestureNode) {
        this.node = dragGestureNode;
    }

    public final androidx.compose.foundation.gestures.DragGestureNode getNode() {
        return this.node;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown Camera2StreamConfigurationMap() {
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown awaitDown = this.getHighSpeedVideoSizes;
        if (awaitDown != null) {
            return awaitDown;
        }
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown awaitDown2 = new androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown(null, false, 3, 0 == true ? 1 : 0);
        this.getHighSpeedVideoSizes = awaitDown2;
        return awaitDown2;
    }

    private final androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.Dragging getHighSpeedVideoFpsRanges() {
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.Dragging dragging = this.getHighResolutionOutputSizeshNQ4ISI;
        if (dragging != null) {
            return dragging;
        }
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.Dragging dragging2 = new androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.Dragging(0L, 1, null);
        this.getHighResolutionOutputSizeshNQ4ISI = dragging2;
        return dragging2;
    }

    private final androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitTouchSlop getHighResolutionOutputSizeshNQ4ISI() {
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitTouchSlop awaitTouchSlop = this.getHighSpeedVideoFpsRanges;
        if (awaitTouchSlop != null) {
            return awaitTouchSlop;
        }
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitTouchSlop awaitTouchSlop2 = new androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitTouchSlop(null, 0L, false, 7, null);
        this.getHighSpeedVideoFpsRanges = awaitTouchSlop2;
        return awaitTouchSlop2;
    }

    private final androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitGesturePickup getHighSpeedVideoFpsRangesFor() {
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitGesturePickup awaitGesturePickup = this.Camera2StreamConfigurationMap;
        if (awaitGesturePickup != null) {
            return awaitGesturePickup;
        }
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitGesturePickup awaitGesturePickup2 = new androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitGesturePickup(null, 0L, null, 7, null);
        this.Camera2StreamConfigurationMap = awaitGesturePickup2;
        return awaitGesturePickup2;
    }

    private final androidx.compose.foundation.gestures.TouchSlopDetector getInputFormats() {
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector = this.getOutputMinFrameDuration;
        if (touchSlopDetector != null) {
            return touchSlopDetector;
        }
        throw new java.lang.IllegalArgumentException("Touch slop detector not initialized.".toString());
    }

    private final androidx.compose.ui.input.pointer.util.VelocityTracker getOutputMinFrameDuration() {
        androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker = this.getOutputStallDuration;
        if (velocityTracker != null) {
            return velocityTracker;
        }
        throw new java.lang.IllegalArgumentException("Velocity Tracker not initialized.".toString());
    }

    public final void processIndirectPointerInputEvent(androidx.compose.ui.input.indirect.IndirectPointerEvent indirectPointerInputEvent, androidx.compose.ui.input.pointer.PointerEventPass pass) {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap();
        }
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState dragDetectionState = this.getHighSpeedVideoFpsRangesFor;
        if (dragDetectionState == null) {
            throw new java.lang.IllegalArgumentException("currentDragState should not be null".toString());
        }
        if (dragDetectionState instanceof androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown) {
            getHighSpeedVideoFpsRangesFor(indirectPointerInputEvent, pass, (androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown) dragDetectionState);
            return;
        }
        if (dragDetectionState instanceof androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitTouchSlop) {
            getHighSpeedVideoSizes(indirectPointerInputEvent, pass, (androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitTouchSlop) dragDetectionState);
        } else if (dragDetectionState instanceof androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitGesturePickup) {
            getHighSpeedVideoSizes(indirectPointerInputEvent, pass, (androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitGesturePickup) dragDetectionState);
        } else {
            if (!(dragDetectionState instanceof androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.Dragging)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            getHighResolutionOutputSizeshNQ4ISI(indirectPointerInputEvent, pass, (androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.Dragging) dragDetectionState);
        }
    }

    public final void resetDragDetectionState() {
        getHighSpeedVideoSizes();
        if (this.node.getIsListeningForEvents()) {
            getOutputFormats();
        }
        this.getOutputStallDuration = null;
        this.getInputFormats.reset();
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector, androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        indirectPointerInputDragCycleDetector.getHighResolutionOutputSizeshNQ4ISI(indirectPointerInputChange, j, j2, false);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, long j, long j2, boolean z) {
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitTouchSlop highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        highResolutionOutputSizeshNQ4ISI.setInitialDown(indirectPointerInputChange);
        highResolutionOutputSizeshNQ4ISI.m1480setPointerId0FcD4WY(j);
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector = this.getOutputMinFrameDuration;
        if (touchSlopDetector == null) {
            this.getOutputMinFrameDuration = new androidx.compose.foundation.gestures.TouchSlopDetector(this.node.getOrientationLock(), 0L, 2, null);
        } else {
            if (touchSlopDetector != null) {
                touchSlopDetector.setOrientation(this.node.getOrientationLock());
            }
            androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector2 = this.getOutputMinFrameDuration;
            if (touchSlopDetector2 != null) {
                touchSlopDetector2.m1546resetk4lQ0M(j2);
            }
        }
        highResolutionOutputSizeshNQ4ISI.setVerifyConsumptionInFinalPass(false);
        this.getHighSpeedVideoFpsRangesFor = highResolutionOutputSizeshNQ4ISI;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(long j) {
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.Dragging highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        highSpeedVideoFpsRanges.m1482setPointerId0FcD4WY(j);
        this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRanges;
    }

    private final void getHighSpeedVideoSizes() {
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        Camera2StreamConfigurationMap.setAwaitTouchSlop(androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized);
        Camera2StreamConfigurationMap.setConsumedOnInitial(false);
        this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap;
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, long j, androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector) {
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitGesturePickup highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        highSpeedVideoFpsRangesFor.setInitialDown(indirectPointerInputChange);
        highSpeedVideoFpsRangesFor.m1478setPointerId0FcD4WY(j);
        androidx.compose.foundation.gestures.TouchSlopDetector.m1542resetk4lQ0M$default(touchSlopDetector, 0L, 1, null);
        highSpeedVideoFpsRangesFor.setTouchSlopDetector(touchSlopDetector);
        this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor;
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.input.indirect.IndirectPointerEvent indirectPointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown awaitDown) {
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop;
        boolean highSpeedVideoFpsRangesFor;
        if (indirectPointerEvent.getChanges().isEmpty()) {
            return;
        }
        java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt.getHighSpeedVideoFpsRangesFor(changes.get(i));
            if (!highSpeedVideoFpsRangesFor) {
                return;
            }
        }
        androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange = (androidx.compose.ui.input.indirect.IndirectPointerInputChange) kotlin.collections.CollectionsKt.first((java.util.List) indirectPointerEvent.getChanges());
        if (androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.WhenMappings.$EnumSwitchMapping$0[awaitDown.getAwaitTouchSlop().ordinal()] == 1) {
            if (!this.node.getGetHighResolutionOutputSizeshNQ4ISI()) {
                awaitTouchSlop = androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop.Yes;
            } else {
                awaitTouchSlop = androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop.No;
            }
        } else {
            awaitTouchSlop = awaitDown.getAwaitTouchSlop();
        }
        awaitDown.setAwaitTouchSlop(awaitTouchSlop);
        if (pointerEventPass == androidx.compose.ui.input.pointer.PointerEventPass.Initial && awaitTouchSlop == androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop.No) {
            indirectPointerInputChange.consume();
            awaitDown.setConsumedOnInitial(true);
        }
        if (pointerEventPass == androidx.compose.ui.input.pointer.PointerEventPass.Main) {
            if (awaitTouchSlop == androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop.Yes) {
                getHighSpeedVideoFpsRanges(this, indirectPointerInputChange, indirectPointerInputChange.getId(), 0L, 12);
            } else if (awaitDown.getConsumedOnInitial()) {
                Camera2StreamConfigurationMap(indirectPointerInputChange, indirectPointerInputChange, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6754boximpl(indirectPointerEvent.getPrimaryDirectionalMotionAxis()), androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
                getHighResolutionOutputSizeshNQ4ISI(indirectPointerInputChange, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6754boximpl(indirectPointerEvent.getPrimaryDirectionalMotionAxis()), androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
                getHighResolutionOutputSizeshNQ4ISI(indirectPointerInputChange.getId());
            }
        }
    }

    private final void getHighSpeedVideoSizes(androidx.compose.ui.input.indirect.IndirectPointerEvent indirectPointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitTouchSlop awaitTouchSlop) {
        androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange;
        androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange2;
        boolean Camera2StreamConfigurationMap;
        long Camera2StreamConfigurationMap2;
        long highSpeedVideoSizes;
        androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange3;
        if (pointerEventPass != androidx.compose.ui.input.pointer.PointerEventPass.Initial) {
            java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            while (true) {
                indirectPointerInputChange = null;
                if (i >= size) {
                    indirectPointerInputChange2 = null;
                    break;
                }
                indirectPointerInputChange2 = changes.get(i);
                if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(indirectPointerInputChange2.getId(), awaitTouchSlop.getPointerId())) {
                    break;
                } else {
                    i++;
                }
            }
            androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange4 = indirectPointerInputChange2;
            if (indirectPointerInputChange4 == null) {
                java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> changes2 = indirectPointerEvent.getChanges();
                int size2 = changes2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        indirectPointerInputChange3 = null;
                        break;
                    }
                    indirectPointerInputChange3 = changes2.get(i2);
                    if (indirectPointerInputChange3.getPressed()) {
                        break;
                    } else {
                        i2++;
                    }
                }
                indirectPointerInputChange4 = indirectPointerInputChange3;
                if (indirectPointerInputChange4 == null) {
                    getHighSpeedVideoSizes();
                    return;
                }
                awaitTouchSlop.m1480setPointerId0FcD4WY(indirectPointerInputChange4.getId());
            }
            androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange5 = indirectPointerInputChange4;
            if (pointerEventPass == androidx.compose.ui.input.pointer.PointerEventPass.Main) {
                if (!indirectPointerInputChange5.getIsConsumed()) {
                    Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt.Camera2StreamConfigurationMap(indirectPointerInputChange5);
                    if (Camera2StreamConfigurationMap) {
                        java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> changes3 = indirectPointerEvent.getChanges();
                        int size3 = changes3.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size3) {
                                break;
                            }
                            androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange6 = changes3.get(i3);
                            if (indirectPointerInputChange6.getPressed()) {
                                indirectPointerInputChange = indirectPointerInputChange6;
                                break;
                            }
                            i3++;
                        }
                        androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange7 = indirectPointerInputChange;
                        if (indirectPointerInputChange7 == null) {
                            getHighSpeedVideoSizes();
                        } else {
                            awaitTouchSlop.m1480setPointerId0FcD4WY(indirectPointerInputChange7.getId());
                        }
                    } else {
                        float m1469pointerSlopE8SPZFQ = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1469pointerSlopE8SPZFQ((androidx.compose.ui.platform.ViewConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this.node, androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()), androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7306getTouchT8wyACA());
                        androidx.compose.foundation.gestures.TouchSlopDetector inputFormats = getInputFormats();
                        Camera2StreamConfigurationMap2 = androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt.Camera2StreamConfigurationMap(indirectPointerInputChange5, this.node.getOrientationLock(), androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6754boximpl(indirectPointerEvent.getPrimaryDirectionalMotionAxis()));
                        highSpeedVideoSizes = androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt.getHighSpeedVideoSizes(indirectPointerInputChange5, this.node.getOrientationLock(), androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6754boximpl(indirectPointerEvent.getPrimaryDirectionalMotionAxis()));
                        long m1543addPositionsakrDWew = inputFormats.m1543addPositionsakrDWew(Camera2StreamConfigurationMap2, highSpeedVideoSizes, m1469pointerSlopE8SPZFQ);
                        if ((9223372034707292159L & m1543addPositionsakrDWew) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                            indirectPointerInputChange5.consume();
                            androidx.compose.ui.input.indirect.IndirectPointerInputChange initialDown = awaitTouchSlop.getInitialDown();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(initialDown);
                            Camera2StreamConfigurationMap(initialDown, indirectPointerInputChange5, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6754boximpl(indirectPointerEvent.getPrimaryDirectionalMotionAxis()), m1543addPositionsakrDWew);
                            getHighResolutionOutputSizeshNQ4ISI(indirectPointerInputChange5, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6754boximpl(indirectPointerEvent.getPrimaryDirectionalMotionAxis()), m1543addPositionsakrDWew);
                            getHighResolutionOutputSizeshNQ4ISI(indirectPointerInputChange5.getId());
                        } else {
                            awaitTouchSlop.setVerifyConsumptionInFinalPass(true);
                        }
                    }
                } else {
                    androidx.compose.ui.input.indirect.IndirectPointerInputChange initialDown2 = awaitTouchSlop.getInitialDown();
                    if (initialDown2 == null) {
                        throw new java.lang.IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized".toString());
                    }
                    long pointerId = awaitTouchSlop.getPointerId();
                    androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector = this.getOutputMinFrameDuration;
                    if (touchSlopDetector != null) {
                        getHighSpeedVideoFpsRanges(initialDown2, pointerId, touchSlopDetector);
                    } else {
                        throw new java.lang.IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized".toString());
                    }
                }
            }
            if (pointerEventPass == androidx.compose.ui.input.pointer.PointerEventPass.Final && awaitTouchSlop.getVerifyConsumptionInFinalPass()) {
                if (indirectPointerInputChange5.getIsConsumed()) {
                    androidx.compose.ui.input.indirect.IndirectPointerInputChange initialDown3 = awaitTouchSlop.getInitialDown();
                    if (initialDown3 == null) {
                        throw new java.lang.IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized".toString());
                    }
                    long pointerId2 = awaitTouchSlop.getPointerId();
                    androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector2 = this.getOutputMinFrameDuration;
                    if (touchSlopDetector2 != null) {
                        getHighSpeedVideoFpsRanges(initialDown3, pointerId2, touchSlopDetector2);
                        return;
                    }
                    throw new java.lang.IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized".toString());
                }
                awaitTouchSlop.setVerifyConsumptionInFinalPass(false);
            }
        }
    }

    private final void getHighSpeedVideoSizes(androidx.compose.ui.input.indirect.IndirectPointerEvent indirectPointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitGesturePickup awaitGesturePickup) {
        boolean z;
        long Camera2StreamConfigurationMap;
        long Camera2StreamConfigurationMap2;
        if (pointerEventPass == androidx.compose.ui.input.pointer.PointerEventPass.Final) {
            java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = true;
                    break;
                } else {
                    if (changes.get(i2).getIsConsumed()) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
            java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> changes2 = indirectPointerEvent.getChanges();
            int size2 = changes2.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                if (!changes2.get(i).getPressed()) {
                    i++;
                } else if (!indirectPointerEvent.getChanges().isEmpty()) {
                    if (z) {
                        Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt.Camera2StreamConfigurationMap((androidx.compose.ui.input.indirect.IndirectPointerInputChange) kotlin.collections.CollectionsKt.first((java.util.List) indirectPointerEvent.getChanges()), this.node.getOrientationLock(), androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6754boximpl(indirectPointerEvent.getPrimaryDirectionalMotionAxis()));
                        androidx.compose.ui.input.indirect.IndirectPointerInputChange initialDown = awaitGesturePickup.getInitialDown();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(initialDown);
                        Camera2StreamConfigurationMap2 = androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt.Camera2StreamConfigurationMap(initialDown, this.node.getOrientationLock(), androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6754boximpl(indirectPointerEvent.getPrimaryDirectionalMotionAxis()));
                        long m5756minusMKHz9U = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap2);
                        androidx.compose.ui.input.indirect.IndirectPointerInputChange initialDown2 = awaitGesturePickup.getInitialDown();
                        if (initialDown2 != null) {
                            getHighSpeedVideoFpsRanges(this, initialDown2, awaitGesturePickup.getPointerId(), m5756minusMKHz9U, 8);
                            return;
                        }
                        throw new java.lang.IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.".toString());
                    }
                    return;
                }
            }
            getHighSpeedVideoSizes();
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.input.indirect.IndirectPointerEvent indirectPointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.Dragging dragging) {
        androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange;
        androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange2;
        boolean Camera2StreamConfigurationMap;
        long highSpeedVideoFpsRanges;
        long highResolutionOutputSizeshNQ4ISI;
        boolean Camera2StreamConfigurationMap2;
        if (pointerEventPass == androidx.compose.ui.input.pointer.PointerEventPass.Main) {
            long pointerId = dragging.getPointerId();
            java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                indirectPointerInputChange = null;
                if (i2 >= size) {
                    indirectPointerInputChange2 = null;
                    break;
                }
                indirectPointerInputChange2 = changes.get(i2);
                if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(indirectPointerInputChange2.getId(), pointerId)) {
                    break;
                } else {
                    i2++;
                }
            }
            androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange3 = indirectPointerInputChange2;
            if (indirectPointerInputChange3 == null) {
                return;
            }
            Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt.Camera2StreamConfigurationMap(indirectPointerInputChange3);
            if (Camera2StreamConfigurationMap) {
                java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> changes2 = indirectPointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange4 = changes2.get(i);
                    if (indirectPointerInputChange4.getPressed()) {
                        indirectPointerInputChange = indirectPointerInputChange4;
                        break;
                    }
                    i++;
                }
                androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange5 = indirectPointerInputChange;
                if (indirectPointerInputChange5 == null) {
                    if (!indirectPointerInputChange3.getIsConsumed()) {
                        Camera2StreamConfigurationMap2 = androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt.Camera2StreamConfigurationMap(indirectPointerInputChange3);
                        if (Camera2StreamConfigurationMap2) {
                            getHighSpeedVideoFpsRanges(indirectPointerInputChange3, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6754boximpl(indirectPointerEvent.getPrimaryDirectionalMotionAxis()));
                            getHighSpeedVideoSizes();
                            return;
                        }
                    }
                    getOutputFormats();
                    getHighSpeedVideoSizes();
                    return;
                }
                dragging.m1482setPointerId0FcD4WY(indirectPointerInputChange5.getId());
                return;
            }
            if (!indirectPointerInputChange3.getIsConsumed()) {
                highSpeedVideoFpsRanges = androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt.getHighSpeedVideoFpsRanges(indirectPointerInputChange3, this.node.getOrientationLock(), androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6754boximpl(indirectPointerEvent.getPrimaryDirectionalMotionAxis()));
                if (androidx.compose.ui.geometry.Offset.m5750getDistanceimpl(highSpeedVideoFpsRanges) == 0.0f) {
                    return;
                }
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt.getHighResolutionOutputSizeshNQ4ISI(indirectPointerInputChange3, this.node.getOrientationLock(), androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6754boximpl(indirectPointerEvent.getPrimaryDirectionalMotionAxis()));
                getHighResolutionOutputSizeshNQ4ISI(indirectPointerInputChange3, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6754boximpl(indirectPointerEvent.getPrimaryDirectionalMotionAxis()), highResolutionOutputSizeshNQ4ISI);
                indirectPointerInputChange3.consume();
                return;
            }
            getOutputFormats();
        }
    }

    private final void Camera2StreamConfigurationMap(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange2, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, long j) {
        long Camera2StreamConfigurationMap;
        if (this.getOutputStallDuration == null) {
            this.getOutputStallDuration = new androidx.compose.ui.input.pointer.util.VelocityTracker();
        }
        this.getOutputFormats = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt.getHighSpeedVideoFpsRangesFor(getOutputMinFrameDuration(), indirectPointerInputChange, this.node.getOrientationLock(), indirectPointerEventPrimaryDirectionalMotionAxis, this.getInputSizeshNQ4ISI, this.getOutputFormats);
        Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt.Camera2StreamConfigurationMap(indirectPointerInputChange2, this.node.getOrientationLock(), indirectPointerEventPrimaryDirectionalMotionAxis);
        long m5756minusMKHz9U = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(Camera2StreamConfigurationMap, j);
        if (this.node.getCanDrag().invoke(androidx.compose.ui.input.pointer.PointerType.m7297boximpl(androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7306getTouchT8wyACA())).booleanValue()) {
            this.getHighSpeedVideoSizesFor = androidx.compose.ui.layout.LayoutCoordinatesKt.positionOnScreen(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(this.node));
            this.node.onDragEvent(new androidx.compose.foundation.gestures.DragEvent.DragStarted(m5756minusMKHz9U, null));
        }
        this.getInputFormats.reset();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, long j) {
        long positionOnScreen = androidx.compose.ui.layout.LayoutCoordinatesKt.positionOnScreen(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(this.node));
        if (!androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.getHighSpeedVideoSizesFor, androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0()) && !androidx.compose.ui.geometry.Offset.m5749equalsimpl0(positionOnScreen, this.getHighSpeedVideoSizesFor)) {
            this.getOutputFormats = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(this.getOutputFormats, androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(positionOnScreen, this.getHighSpeedVideoSizesFor));
        }
        this.getHighSpeedVideoSizesFor = positionOnScreen;
        androidx.compose.foundation.gestures.Orientation orientationLock = this.node.getOrientationLock();
        kotlin.jvm.internal.Intrinsics.checkNotNull(orientationLock);
        if (java.lang.Math.abs(androidx.compose.foundation.gestures.DraggableKt.m1473toFloat3MmeM6k(j, orientationLock)) > 2.0f) {
            androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt.getHighSpeedVideoFpsRangesFor(getOutputMinFrameDuration(), indirectPointerInputChange, this.node.getOrientationLock(), indirectPointerEventPrimaryDirectionalMotionAxis, this.getInputSizeshNQ4ISI, this.getOutputFormats);
            this.node.onDragEvent(new androidx.compose.foundation.gestures.DragEvent.DragDelta(this.getInputFormats.m1492smoothEventPositionMKHz9U(j), true, null));
        }
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt.getHighSpeedVideoFpsRangesFor(getOutputMinFrameDuration(), indirectPointerInputChange, this.node.getOrientationLock(), indirectPointerEventPrimaryDirectionalMotionAxis, this.getInputSizeshNQ4ISI, this.getOutputFormats);
        float maximumFlingVelocity = ((androidx.compose.ui.platform.ViewConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this.node, androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
        long m7332calculateVelocityAH228Gc = getOutputMinFrameDuration().m7332calculateVelocityAH228Gc(androidx.compose.ui.unit.VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
        getOutputMinFrameDuration().resetTracking();
        this.node.onDragEvent(new androidx.compose.foundation.gestures.DragEvent.DragStopped(androidx.compose.foundation.gestures.DraggableKt.m1474toValidVelocityTH1AsA0(m7332calculateVelocityAH228Gc), true, null));
    }

    private final void getOutputFormats() {
        this.node.onDragEvent(androidx.compose.foundation.gestures.DragEvent.DragCancelled.INSTANCE);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState;", "", "<init>", "()V", "AwaitDown", "AwaitTouchSlop", "AwaitGesturePickup", "Dragging", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$Dragging;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class DragDetectionState {
        public static final int $stable = 0;

        private DragDetectionState() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0012B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;", "awaitTouchSlop", "", "consumedOnInitial", "<init>", "(Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;Z)V", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;", "getAwaitTouchSlop", "()Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;", "setAwaitTouchSlop", "(Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;)V", "Z", "getConsumedOnInitial", "()Z", "setConsumedOnInitial", "(Z)V", "AwaitTouchSlop"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AwaitDown extends androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState {
            public static final int $stable = 8;
            private androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop;
            private boolean consumedOnInitial;

            public AwaitDown(androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop, boolean z) {
                super(null);
                this.awaitTouchSlop = awaitTouchSlop;
                this.consumedOnInitial = z;
            }

            public /* synthetic */ AwaitDown(androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized : awaitTouchSlop, (i & 2) != 0 ? false : z);
            }

            public final androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop getAwaitTouchSlop() {
                return this.awaitTouchSlop;
            }

            public final void setAwaitTouchSlop(androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop) {
                this.awaitTouchSlop = awaitTouchSlop;
            }

            public final boolean getConsumedOnInitial() {
                return this.consumedOnInitial;
            }

            public final void setConsumedOnInitial(boolean z) {
                this.consumedOnInitial = z;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;", "", "<init>", "(Ljava/lang/String;I)V", "Yes", "No", "NotInitialized"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class AwaitTouchSlop {
                private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
                private static final /* synthetic */ androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop[] getHighSpeedVideoFpsRangesFor;
                public static final androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop Yes = new androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop("Yes", 0);
                public static final androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop No = new androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop("No", 1);
                public static final androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop NotInitialized = new androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop("NotInitialized", 2);

                private AwaitTouchSlop(java.lang.String str, int i) {
                }

                static {
                    androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
                    getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap;
                    getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(Camera2StreamConfigurationMap);
                }

                public static androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop[] values() {
                    return (androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop[]) getHighSpeedVideoFpsRangesFor.clone();
                }

                public static androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop valueOf(java.lang.String str) {
                    return (androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop) java.lang.Enum.valueOf(androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop.class, str);
                }

                public static kotlin.enums.EnumEntries<androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop> getEntries() {
                    return getHighSpeedVideoFpsRanges;
                }

                private static final /* synthetic */ androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop[] Camera2StreamConfigurationMap() {
                    return new androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop[]{Yes, No, NotInitialized};
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AwaitDown() {
                this(null, false, 3, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState;", "Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "initialDown", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "", "verifyConsumptionInFinalPass", "<init>", "(Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "getInitialDown", "()Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "setInitialDown", "(Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;)V", "J", "getPointerId-J3iCeTQ", "()J", "setPointerId-0FcD4WY", "(J)V", "Z", "getVerifyConsumptionInFinalPass", "()Z", "setVerifyConsumptionInFinalPass", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AwaitTouchSlop extends androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState {
            public static final int $stable = 8;
            private androidx.compose.ui.input.indirect.IndirectPointerInputChange initialDown;
            private long pointerId;
            private boolean verifyConsumptionInFinalPass;

            private AwaitTouchSlop(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, long j, boolean z) {
                super(null);
                this.initialDown = indirectPointerInputChange;
                this.pointerId = j;
                this.verifyConsumptionInFinalPass = z;
            }

            public final androidx.compose.ui.input.indirect.IndirectPointerInputChange getInitialDown() {
                return this.initialDown;
            }

            public final void setInitialDown(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange) {
                this.initialDown = indirectPointerInputChange;
            }

            public /* synthetic */ AwaitTouchSlop(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, long j, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : indirectPointerInputChange, (i & 2) != 0 ? androidx.compose.ui.input.pointer.PointerId.m7211constructorimpl(Long.MAX_VALUE) : j, (i & 4) != 0 ? false : z, null);
            }

            /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name and from getter */
            public final long getPointerId() {
                return this.pointerId;
            }

            /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
            public final void m1480setPointerId0FcD4WY(long j) {
                this.pointerId = j;
            }

            public final boolean getVerifyConsumptionInFinalPass() {
                return this.verifyConsumptionInFinalPass;
            }

            public final void setVerifyConsumptionInFinalPass(boolean z) {
                this.verifyConsumptionInFinalPass = z;
            }

            public /* synthetic */ AwaitTouchSlop(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, long j, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(indirectPointerInputChange, j, z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState;", "Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "initialDown", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/foundation/gestures/TouchSlopDetector;", "touchSlopDetector", "<init>", "(Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;JLandroidx/compose/foundation/gestures/TouchSlopDetector;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "getInitialDown", "()Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "setInitialDown", "(Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;)V", "J", "getPointerId-J3iCeTQ", "()J", "setPointerId-0FcD4WY", "(J)V", "Landroidx/compose/foundation/gestures/TouchSlopDetector;", "getTouchSlopDetector", "()Landroidx/compose/foundation/gestures/TouchSlopDetector;", "setTouchSlopDetector", "(Landroidx/compose/foundation/gestures/TouchSlopDetector;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AwaitGesturePickup extends androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState {
            public static final int $stable = 8;
            private androidx.compose.ui.input.indirect.IndirectPointerInputChange initialDown;
            private long pointerId;
            private androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector;

            private AwaitGesturePickup(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, long j, androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector) {
                super(null);
                this.initialDown = indirectPointerInputChange;
                this.pointerId = j;
                this.touchSlopDetector = touchSlopDetector;
            }

            public final androidx.compose.ui.input.indirect.IndirectPointerInputChange getInitialDown() {
                return this.initialDown;
            }

            public final void setInitialDown(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange) {
                this.initialDown = indirectPointerInputChange;
            }

            public /* synthetic */ AwaitGesturePickup(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, long j, androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : indirectPointerInputChange, (i & 2) != 0 ? androidx.compose.ui.input.pointer.PointerId.m7211constructorimpl(Long.MAX_VALUE) : j, (i & 4) != 0 ? null : touchSlopDetector, null);
            }

            /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name and from getter */
            public final long getPointerId() {
                return this.pointerId;
            }

            /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
            public final void m1478setPointerId0FcD4WY(long j) {
                this.pointerId = j;
            }

            public final androidx.compose.foundation.gestures.TouchSlopDetector getTouchSlopDetector() {
                return this.touchSlopDetector;
            }

            public final void setTouchSlopDetector(androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector) {
                this.touchSlopDetector = touchSlopDetector;
            }

            public /* synthetic */ AwaitGesturePickup(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, long j, androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(indirectPointerInputChange, j, touchSlopDetector);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$Dragging;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getPointerId-J3iCeTQ", "()J", "setPointerId-0FcD4WY", "(J)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Dragging extends androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState {
            public static final int $stable = 8;
            private long pointerId;

            private Dragging(long j) {
                super(null);
                this.pointerId = j;
            }

            public /* synthetic */ Dragging(long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? androidx.compose.ui.input.pointer.PointerId.m7211constructorimpl(Long.MAX_VALUE) : j, null);
            }

            /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name and from getter */
            public final long getPointerId() {
                return this.pointerId;
            }

            /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
            public final void m1482setPointerId0FcD4WY(long j) {
                this.pointerId = j;
            }

            public /* synthetic */ Dragging(long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(j);
            }
        }

        public /* synthetic */ DragDetectionState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop.values().length];
            try {
                iArr[androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
