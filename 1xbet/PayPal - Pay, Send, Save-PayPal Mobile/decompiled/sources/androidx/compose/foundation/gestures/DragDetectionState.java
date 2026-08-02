package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b2\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Landroidx/compose/foundation/gestures/DragDetectionState;", "", "<init>", "()V", "AwaitDown", "AwaitTouchSlop", "AwaitGesturePickup", "Dragging", "Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown;", "Landroidx/compose/foundation/gestures/DragDetectionState$AwaitGesturePickup;", "Landroidx/compose/foundation/gestures/DragDetectionState$AwaitTouchSlop;", "Landroidx/compose/foundation/gestures/DragDetectionState$Dragging;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
abstract class DragDetectionState {
    private DragDetectionState() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0012B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown;", "Landroidx/compose/foundation/gestures/DragDetectionState;", "Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown$AwaitTouchSlop;", "awaitTouchSlop", "", "consumedOnInitial", "<init>", "(Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown$AwaitTouchSlop;Z)V", "Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown$AwaitTouchSlop;", "getAwaitTouchSlop", "()Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown$AwaitTouchSlop;", "setAwaitTouchSlop", "(Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown$AwaitTouchSlop;)V", "Z", "getConsumedOnInitial", "()Z", "setConsumedOnInitial", "(Z)V", "AwaitTouchSlop"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AwaitDown extends androidx.compose.foundation.gestures.DragDetectionState {
        public static final int $stable = 8;
        private androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop;
        private boolean consumedOnInitial;

        public AwaitDown(androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop, boolean z) {
            super(null);
            this.awaitTouchSlop = awaitTouchSlop;
            this.consumedOnInitial = z;
        }

        public /* synthetic */ AwaitDown(androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized : awaitTouchSlop, (i & 2) != 0 ? false : z);
        }

        public final androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop getAwaitTouchSlop() {
            return this.awaitTouchSlop;
        }

        public final void setAwaitTouchSlop(androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop) {
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
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown$AwaitTouchSlop;", "", "<init>", "(Ljava/lang/String;I)V", "Yes", "No", "NotInitialized"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AwaitTouchSlop {
            private static final /* synthetic */ androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop[] Camera2StreamConfigurationMap;
            private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
            public static final androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop Yes = new androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop("Yes", 0);
            public static final androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop No = new androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop("No", 1);
            public static final androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop NotInitialized = new androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop("NotInitialized", 2);

            private AwaitTouchSlop(java.lang.String str, int i) {
            }

            static {
                androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop[] highSpeedVideoSizes = getHighSpeedVideoSizes();
                Camera2StreamConfigurationMap = highSpeedVideoSizes;
                getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoSizes);
            }

            public static androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop[] values() {
                return (androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop[]) Camera2StreamConfigurationMap.clone();
            }

            public static androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop valueOf(java.lang.String str) {
                return (androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop) java.lang.Enum.valueOf(androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop.class, str);
            }

            public static kotlin.enums.EnumEntries<androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop> getEntries() {
                return getHighSpeedVideoFpsRanges;
            }

            private static final /* synthetic */ androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop[] getHighSpeedVideoSizes() {
                return new androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop[]{Yes, No, NotInitialized};
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AwaitDown() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/foundation/gestures/DragDetectionState$AwaitTouchSlop;", "Landroidx/compose/foundation/gestures/DragDetectionState;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "initialDown", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "", "verifyConsumptionInFinalPass", "<init>", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "getInitialDown", "()Landroidx/compose/ui/input/pointer/PointerInputChange;", "setInitialDown", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "J", "getPointerId-J3iCeTQ", "()J", "setPointerId-0FcD4WY", "(J)V", "Z", "getVerifyConsumptionInFinalPass", "()Z", "setVerifyConsumptionInFinalPass", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AwaitTouchSlop extends androidx.compose.foundation.gestures.DragDetectionState {
        public static final int $stable = 8;
        private androidx.compose.ui.input.pointer.PointerInputChange initialDown;
        private long pointerId;
        private boolean verifyConsumptionInFinalPass;

        private AwaitTouchSlop(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j, boolean z) {
            super(null);
            this.initialDown = pointerInputChange;
            this.pointerId = j;
            this.verifyConsumptionInFinalPass = z;
        }

        public final androidx.compose.ui.input.pointer.PointerInputChange getInitialDown() {
            return this.initialDown;
        }

        public final void setInitialDown(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
            this.initialDown = pointerInputChange;
        }

        public /* synthetic */ AwaitTouchSlop(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : pointerInputChange, (i & 2) != 0 ? androidx.compose.ui.input.pointer.PointerId.m7211constructorimpl(Long.MAX_VALUE) : j, (i & 4) != 0 ? false : z, null);
        }

        /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name and from getter */
        public final long getPointerId() {
            return this.pointerId;
        }

        /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
        public final void m1443setPointerId0FcD4WY(long j) {
            this.pointerId = j;
        }

        public final boolean getVerifyConsumptionInFinalPass() {
            return this.verifyConsumptionInFinalPass;
        }

        public final void setVerifyConsumptionInFinalPass(boolean z) {
            this.verifyConsumptionInFinalPass = z;
        }

        public /* synthetic */ AwaitTouchSlop(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(pointerInputChange, j, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/foundation/gestures/DragDetectionState$AwaitGesturePickup;", "Landroidx/compose/foundation/gestures/DragDetectionState;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "initialDown", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/foundation/gestures/TouchSlopDetector;", "touchSlopDetector", "<init>", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/foundation/gestures/TouchSlopDetector;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "getInitialDown", "()Landroidx/compose/ui/input/pointer/PointerInputChange;", "setInitialDown", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "J", "getPointerId-J3iCeTQ", "()J", "setPointerId-0FcD4WY", "(J)V", "Landroidx/compose/foundation/gestures/TouchSlopDetector;", "getTouchSlopDetector", "()Landroidx/compose/foundation/gestures/TouchSlopDetector;", "setTouchSlopDetector", "(Landroidx/compose/foundation/gestures/TouchSlopDetector;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AwaitGesturePickup extends androidx.compose.foundation.gestures.DragDetectionState {
        public static final int $stable = 8;
        private androidx.compose.ui.input.pointer.PointerInputChange initialDown;
        private long pointerId;
        private androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector;

        private AwaitGesturePickup(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j, androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector) {
            super(null);
            this.initialDown = pointerInputChange;
            this.pointerId = j;
            this.touchSlopDetector = touchSlopDetector;
        }

        public final androidx.compose.ui.input.pointer.PointerInputChange getInitialDown() {
            return this.initialDown;
        }

        public final void setInitialDown(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
            this.initialDown = pointerInputChange;
        }

        public /* synthetic */ AwaitGesturePickup(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j, androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : pointerInputChange, (i & 2) != 0 ? androidx.compose.ui.input.pointer.PointerId.m7211constructorimpl(Long.MAX_VALUE) : j, (i & 4) != 0 ? null : touchSlopDetector, null);
        }

        /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name and from getter */
        public final long getPointerId() {
            return this.pointerId;
        }

        /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
        public final void m1441setPointerId0FcD4WY(long j) {
            this.pointerId = j;
        }

        public final androidx.compose.foundation.gestures.TouchSlopDetector getTouchSlopDetector() {
            return this.touchSlopDetector;
        }

        public final void setTouchSlopDetector(androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector) {
            this.touchSlopDetector = touchSlopDetector;
        }

        public /* synthetic */ AwaitGesturePickup(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j, androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(pointerInputChange, j, touchSlopDetector);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/gestures/DragDetectionState$Dragging;", "Landroidx/compose/foundation/gestures/DragDetectionState;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getPointerId-J3iCeTQ", "()J", "setPointerId-0FcD4WY", "(J)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Dragging extends androidx.compose.foundation.gestures.DragDetectionState {
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
        public final void m1445setPointerId0FcD4WY(long j) {
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
