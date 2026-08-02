package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001OBH\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012'\u0010\u000b\u001a#\b\u0001\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\n*\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J=\u0010$\u001a\u00020\n*\u00020\u00022'\u0010#\u001a#\b\u0001\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0002\b\"H\u0082@¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010)J\u001b\u0010\u001b\u001a\u0004\u0018\u00010+*\b\u0012\u0004\u0012\u00020+0*H\u0002¢\u0006\u0004\b\u001b\u0010,J\u001a\u0010-\u001a\u00020+*\b\u0012\u0004\u0012\u00020+0*H\u0082@¢\u0006\u0004\b-\u0010.J+\u0010(\u001a\b\u0012\u0004\u0012\u00028\u000001\"\u0004\b\u0000\u0010/2\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u000000H\u0002¢\u0006\u0004\b(\u00102J\u001b\u0010$\u001a\u00020'*\u00020\u00022\u0006\u0010#\u001a\u000203H\u0002¢\u0006\u0004\b$\u00104J\u0017\u00105\u001a\u00020\n2\u0006\u0010#\u001a\u00020+H\u0002¢\u0006\u0004\b5\u00106J,\u0010(\u001a\u00020\n*\u00020\u00022\u0006\u0010#\u001a\u00020+2\u0006\u0010&\u001a\u0002072\u0006\u00108\u001a\u000207H\u0082@¢\u0006\u0004\b(\u00109JQ\u0010-\u001a\u00020\n*\u00020!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020;0:2\u0006\u0010&\u001a\u0002072\u0006\u00108\u001a\u00020<2\u0017\u0010>\u001a\u0013\u0012\t\u0012\u000707¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020'0=H\u0082@¢\u0006\u0004\b-\u0010?J\u001b\u0010-\u001a\u000207*\u00020!2\u0006\u0010#\u001a\u000207H\u0002¢\u0006\u0004\b-\u0010@R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010CR5\u00105\u001a#\b\u0001\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010DR\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010ER\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010FR\u0016\u0010H\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010A\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010N"}, d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;", "", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollConfig;", "mouseWheelScrollConfig", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Velocity;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "onScrollStopped", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/unit/Density;)V", "updateDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/input/pointer/PointerEvent;)V", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "startReceivingMouseWheelEvents", "(Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/compose/foundation/gestures/NestedScrollScope;", "Lkotlin/ExtensionFunctionType;", "p0", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p1", "", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "(Lkotlinx/coroutines/channels/Channel;)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "getHighSpeedVideoFpsRangesFor", "(Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E", "Lkotlin/Function0;", "Lkotlin/sequences/Sequence;", "(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/foundation/gestures/ScrollingLogic;J)Z", "getHighSpeedVideoSizes", "(Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;)V", "", "p2", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "Landroidx/compose/animation/core/AnimationVector1D;", "", "Lkotlin/Function1;", "p3", "(Landroidx/compose/foundation/gestures/NestedScrollScope;Landroidx/compose/animation/core/AnimationState;FILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/compose/foundation/gestures/NestedScrollScope;F)F", "getInputFormats", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "Landroidx/compose/foundation/gestures/ScrollConfig;", "Lkotlin/jvm/functions/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlinx/coroutines/channels/Channel;", "Z", "getOutputMinFrameDuration", "Lkotlinx/coroutines/Job;", "getOutputFormats", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizesFor", "Landroidx/compose/foundation/gestures/MouseWheelVelocityTracker;", "Landroidx/compose/foundation/gestures/MouseWheelVelocityTracker;", "MouseWheelScrollDelta"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MouseWheelScrollingLogic {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getOutputMinFrameDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.unit.Density Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Velocity, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.ScrollConfig getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.ScrollingLogic getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighSpeedVideoSizesFor;
    private final kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta> getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.channels.ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.MouseWheelVelocityTracker getInputFormats = new androidx.compose.foundation.gestures.MouseWheelVelocityTracker();

    /* JADX WARN: Multi-variable type inference failed */
    public MouseWheelScrollingLogic(androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, androidx.compose.foundation.gestures.ScrollConfig scrollConfig, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.ui.unit.Density density) {
        this.getHighSpeedVideoFpsRanges = scrollingLogic;
        this.getHighResolutionOutputSizeshNQ4ISI = scrollConfig;
        this.getHighSpeedVideoSizes = function2;
        this.Camera2StreamConfigurationMap = density;
    }

    public final void updateDensity(androidx.compose.ui.unit.Density density) {
        this.Camera2StreamConfigurationMap = density;
    }

    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void m1489onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, long bounds) {
        int i = 0;
        if (androidx.compose.foundation.ComposeFoundationFlags.isMouseWheel1DAxisLockingEnabled) {
            if (androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7189getScroll7fucELk())) {
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                while (i < size) {
                    if (changes.get(i).isConsumed()) {
                        return;
                    } else {
                        i++;
                    }
                }
                if (pass == androidx.compose.ui.input.pointer.PointerEventPass.Initial && this.getOutputMinFrameDuration) {
                    Camera2StreamConfigurationMap(pointerEvent, bounds);
                    getHighResolutionOutputSizeshNQ4ISI(pointerEvent);
                }
                if (pass == androidx.compose.ui.input.pointer.PointerEventPass.Main && !this.getOutputMinFrameDuration && Camera2StreamConfigurationMap(pointerEvent, bounds)) {
                    getHighResolutionOutputSizeshNQ4ISI(pointerEvent);
                    return;
                }
                return;
            }
            return;
        }
        if (pass == androidx.compose.ui.input.pointer.PointerEventPass.Main && androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7189getScroll7fucELk())) {
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
            int size2 = changes2.size();
            while (i < size2) {
                if (changes2.get(i).isConsumed()) {
                    return;
                } else {
                    i++;
                }
            }
            if (Camera2StreamConfigurationMap(pointerEvent, bounds)) {
                getHighResolutionOutputSizeshNQ4ISI(pointerEvent);
            }
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.input.pointer.PointerEvent pointerEvent) {
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            changes.get(i).consume();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0086\u0002J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J.\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/geometry/Offset;", "timeMillis", "", "shouldApplyImmediately", "", "<init>", "(JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getValue-F1C5BW0", "()J", "J", "getTimeMillis", "getShouldApplyImmediately", "()Z", "plus", "other", "component1", "component1-F1C5BW0", "component2", "component3", "copy", "copy-9KIMszo", "(JJZ)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "equals", "hashCode", "", "toString", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class MouseWheelScrollDelta {
        private final long getHighSpeedVideoFpsRanges;
        private final boolean getHighSpeedVideoFpsRangesFor;
        private final long getHighSpeedVideoSizes;

        private MouseWheelScrollDelta(long j, long j2, boolean z) {
            this.getHighSpeedVideoSizes = j;
            this.getHighSpeedVideoFpsRanges = j2;
            this.getHighSpeedVideoFpsRangesFor = z;
        }

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
        public final long getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
        public final long getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
        public final boolean getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta) {
            return new androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta(androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(this.getHighSpeedVideoSizes, mouseWheelScrollDelta.getHighSpeedVideoSizes), java.lang.Math.max(this.getHighSpeedVideoFpsRanges, mouseWheelScrollDelta.getHighSpeedVideoFpsRanges), this.getHighSpeedVideoFpsRangesFor, null);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MouseWheelScrollDelta(value=");
            sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.getHighSpeedVideoSizes));
            sb.append(", timeMillis=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(", shouldApplyImmediately=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.getHighSpeedVideoSizes) * 31) + java.lang.Long.hashCode(this.getHighSpeedVideoFpsRanges)) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRangesFor);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta)) {
                return false;
            }
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) other;
            return androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.getHighSpeedVideoSizes, mouseWheelScrollDelta.getHighSpeedVideoSizes) && this.getHighSpeedVideoFpsRanges == mouseWheelScrollDelta.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoFpsRangesFor == mouseWheelScrollDelta.getHighSpeedVideoFpsRangesFor;
        }

        private static androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta Camera2StreamConfigurationMap(long j, long j2, boolean z) {
            return new androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta(j, j2, z, null);
        }

        public static /* synthetic */ androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta getHighSpeedVideoSizes(androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta, boolean z) {
            return Camera2StreamConfigurationMap(mouseWheelScrollDelta.getHighSpeedVideoSizes, mouseWheelScrollDelta.getHighSpeedVideoFpsRanges, z);
        }

        public /* synthetic */ MouseWheelScrollDelta(long j, long j2, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z);
        }
    }

    public final void startReceivingMouseWheelEvents(kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlinx.coroutines.Job launch$default;
        if (this.getHighSpeedVideoSizesFor == null) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(this, null), 3, null);
            this.getHighSpeedVideoSizesFor = launch$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.NestedScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 mouseWheelScrollingLogic$userScroll$1;
        int i;
        if (continuation instanceof androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1) {
            mouseWheelScrollingLogic$userScroll$1 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1) continuation;
            if ((mouseWheelScrollingLogic$userScroll$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$userScroll$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = mouseWheelScrollingLogic$userScroll$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mouseWheelScrollingLogic$userScroll$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getOutputMinFrameDuration = true;
                    androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2 mouseWheelScrollingLogic$userScroll$2 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2(scrollingLogic, function2, null);
                    mouseWheelScrollingLogic$userScroll$1.getHighSpeedVideoSizes = 1;
                    if (kotlinx.coroutines.SupervisorKt.supervisorScope(mouseWheelScrollingLogic$userScroll$2, mouseWheelScrollingLogic$userScroll$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.getOutputMinFrameDuration = false;
                return kotlin.Unit.INSTANCE;
            }
        }
        mouseWheelScrollingLogic$userScroll$1 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1(this, continuation);
        java.lang.Object obj2 = mouseWheelScrollingLogic$userScroll$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mouseWheelScrollingLogic$userScroll$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        this.getOutputMinFrameDuration = false;
        return kotlin.Unit.INSTANCE;
    }

    private final boolean Camera2StreamConfigurationMap(androidx.compose.ui.input.pointer.PointerEvent p0, long p1) {
        long mo1431calculateMouseWheelScroll8xgXZGE = this.getHighResolutionOutputSizeshNQ4ISI.mo1431calculateMouseWheelScroll8xgXZGE(this.Camera2StreamConfigurationMap, p0, p1);
        if (getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, mo1431calculateMouseWheelScroll8xgXZGE)) {
            return kotlinx.coroutines.channels.ChannelResult.m24089isSuccessimpl(this.getHighSpeedVideoFpsRangesFor.mo9266trySendJP2dKIU(new androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta(mo1431calculateMouseWheelScroll8xgXZGE, ((androidx.compose.ui.input.pointer.PointerInputChange) kotlin.collections.CollectionsKt.first((java.util.List) p0.getChanges())).getUptimeMillis(), !this.getHighResolutionOutputSizeshNQ4ISI.isSmoothScrollingEnabled() || this.getHighResolutionOutputSizeshNQ4ISI.isPreciseWheelScroll(p0), null)));
        }
        return this.getOutputMinFrameDuration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta getHighResolutionOutputSizeshNQ4ISI(final kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta> channel) {
        androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta = null;
        for (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta2 : Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.channels.Channel.this);
                return highSpeedVideoFpsRangesFor;
            }
        })) {
            mouseWheelScrollDelta = mouseWheelScrollDelta == null ? mouseWheelScrollDelta2 : mouseWheelScrollDelta.getHighResolutionOutputSizeshNQ4ISI(mouseWheelScrollDelta2);
        }
        return mouseWheelScrollDelta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.channels.Channel channel) {
        return (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(channel.mo24073tryReceivePtdJZtk());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Object getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta> channel, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2(channel, null), continuation);
    }

    private static <E> kotlin.sequences.Sequence<E> Camera2StreamConfigurationMap(kotlin.jvm.functions.Function0<? extends E> p0) {
        return kotlin.sequences.SequencesKt.sequence(new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1(p0, null));
    }

    private static boolean getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, long j) {
        float m1537toFloatk4lQ0M;
        if (androidx.compose.foundation.ComposeFoundationFlags.isMouseWheel1DAxisLockingEnabled) {
            m1537toFloatk4lQ0M = scrollingLogic.m1539toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.m1535reverseIfNeededMKHz9U(j));
        } else {
            m1537toFloatk4lQ0M = scrollingLogic.m1537toFloatk4lQ0M(scrollingLogic.m1535reverseIfNeededMKHz9U(j));
        }
        if (m1537toFloatk4lQ0M == 0.0f) {
            return false;
        }
        if (m1537toFloatk4lQ0M > 0.0f) {
            return scrollingLogic.getScrollableState().getCanScrollForward();
        }
        return scrollingLogic.getScrollableState().getCanScrollBackward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes(androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta p0) {
        this.getInputFormats.getHighSpeedVideoFpsRanges(p0.getGetHighSpeedVideoFpsRanges(), p0.getGetHighSpeedVideoSizes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0115, code lost:
    
        if (r0.invoke(r1, r11) != r12) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta, float f, float f2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        int i;
        boolean Camera2StreamConfigurationMap;
        float f3;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        long highResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic2 = scrollingLogic;
        if (continuation instanceof androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) continuation;
            if ((mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.getHighSpeedVideoSizes -= 2147483648;
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$12 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
                java.lang.Object obj = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef.element = mouseWheelScrollDelta;
                    getHighSpeedVideoSizes(mouseWheelScrollDelta);
                    androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
                    if (highResolutionOutputSizeshNQ4ISI2 != null) {
                        getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI2);
                        objectRef.element = ((androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) objectRef.element).getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI2);
                    }
                    kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                    floatRef2.element = scrollingLogic2.m1537toFloatk4lQ0M(scrollingLogic2.m1535reverseIfNeededMKHz9U(((androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) objectRef.element).getGetHighSpeedVideoSizes()));
                    Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.MouseWheelScrollableKt.Camera2StreamConfigurationMap(floatRef2.element);
                    if (Camera2StreamConfigurationMap) {
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef2.element = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
                    kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.NestedScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(floatRef2, objectRef2, objectRef, f, this, f2, scrollingLogic, null);
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.getHighSpeedVideoFpsRangesFor = scrollingLogic2;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.getHighResolutionOutputSizeshNQ4ISI = floatRef2;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.Camera2StreamConfigurationMap = f2;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.getHighSpeedVideoSizes = 1;
                    if (getHighSpeedVideoFpsRanges(scrollingLogic2, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3, mouseWheelScrollingLogic$dispatchMouseWheelScroll$12) != coroutine_suspended) {
                        f3 = f2;
                        floatRef = floatRef2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                f3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.Camera2StreamConfigurationMap;
                floatRef = (kotlin.jvm.internal.Ref.FloatRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.getHighResolutionOutputSizeshNQ4ISI;
                androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic3 = (androidx.compose.foundation.gestures.ScrollingLogic) mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                scrollingLogic2 = scrollingLogic3;
                highResolutionOutputSizeshNQ4ISI = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI();
                if (androidx.compose.ui.unit.Velocity.m8838equalsimpl0(highResolutionOutputSizeshNQ4ISI, androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M())) {
                    highResolutionOutputSizeshNQ4ISI = scrollingLogic2.m1540toVelocityadjELrA(scrollingLogic2.reverseIfNeeded(java.lang.Math.signum(floatRef.element)) * java.lang.Math.min(java.lang.Math.abs(floatRef.element) / 100.0f, f3) * 1000.0f);
                }
                kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Velocity, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighSpeedVideoSizes;
                androidx.compose.ui.unit.Velocity m8830boximpl = androidx.compose.ui.unit.Velocity.m8830boximpl(highResolutionOutputSizeshNQ4ISI);
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.getHighSpeedVideoFpsRangesFor = null;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.getHighResolutionOutputSizeshNQ4ISI = null;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.getHighSpeedVideoSizes = 2;
            }
        }
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(this, continuation);
        androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$122 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        java.lang.Object obj2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        highResolutionOutputSizeshNQ4ISI = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI();
        if (androidx.compose.ui.unit.Velocity.m8838equalsimpl0(highResolutionOutputSizeshNQ4ISI, androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M())) {
        }
        kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Velocity, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function22 = this.getHighSpeedVideoSizes;
        androidx.compose.ui.unit.Velocity m8830boximpl2 = androidx.compose.ui.unit.Velocity.m8830boximpl(highResolutionOutputSizeshNQ4ISI);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.getHighSpeedVideoFpsRangesFor = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.getHighResolutionOutputSizeshNQ4ISI = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.getHighSpeedVideoSizes = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getHighSpeedVideoSizes(androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic, kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta> objectRef, kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> objectRef2, long j, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;
        int i;
        kotlin.jvm.internal.Ref.FloatRef floatRef2;
        androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic2;
        kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> objectRef3;
        kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta> objectRef4;
        androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta;
        float m1537toFloatk4lQ0M;
        boolean Camera2StreamConfigurationMap;
        androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic2 = mouseWheelScrollingLogic;
        if (continuation instanceof androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) continuation;
            if ((mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.getInputFormats -= 2147483648;
                java.lang.Object obj = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.getInputFormats;
                boolean z = false;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (j < 0) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                    }
                    androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2(mouseWheelScrollingLogic2, null);
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.getHighSpeedVideoFpsRangesFor = mouseWheelScrollingLogic2;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.getHighSpeedVideoFpsRanges = objectRef;
                    floatRef2 = floatRef;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.getHighResolutionOutputSizeshNQ4ISI = floatRef2;
                    scrollingLogic2 = scrollingLogic;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.Camera2StreamConfigurationMap = scrollingLogic2;
                    objectRef3 = objectRef2;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.getHighSpeedVideoSizes = objectRef3;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.getInputFormats = 1;
                    obj = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(j, mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2, mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef4 = objectRef;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.getHighSpeedVideoSizes;
                    androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic3 = (androidx.compose.foundation.gestures.ScrollingLogic) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.Camera2StreamConfigurationMap;
                    kotlin.jvm.internal.Ref.FloatRef floatRef3 = (kotlin.jvm.internal.Ref.FloatRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.getHighResolutionOutputSizeshNQ4ISI;
                    objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.getHighSpeedVideoFpsRanges;
                    androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic3 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef3 = objectRef5;
                    scrollingLogic2 = scrollingLogic3;
                    floatRef2 = floatRef3;
                    mouseWheelScrollingLogic2 = mouseWheelScrollingLogic3;
                }
                mouseWheelScrollDelta = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) obj;
                if (mouseWheelScrollDelta != null) {
                    objectRef4.element = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta.getHighSpeedVideoSizes(mouseWheelScrollDelta, objectRef4.element.getGetHighSpeedVideoFpsRangesFor());
                    if (androidx.compose.foundation.ComposeFoundationFlags.isMouseWheel1DAxisLockingEnabled) {
                        m1537toFloatk4lQ0M = scrollingLogic2.m1539toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic2.m1535reverseIfNeededMKHz9U(objectRef4.element.getGetHighSpeedVideoSizes()));
                    } else {
                        m1537toFloatk4lQ0M = scrollingLogic2.m1537toFloatk4lQ0M(scrollingLogic2.m1535reverseIfNeededMKHz9U(objectRef4.element.getGetHighSpeedVideoSizes()));
                    }
                    floatRef2.element = m1537toFloatk4lQ0M;
                    objectRef3.element = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
                    mouseWheelScrollingLogic2.getHighSpeedVideoSizes(mouseWheelScrollDelta);
                    Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.MouseWheelScrollableKt.Camera2StreamConfigurationMap(floatRef2.element);
                    z = !Camera2StreamConfigurationMap;
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            }
        }
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1(continuation);
        java.lang.Object obj2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.getInputFormats;
        boolean z2 = false;
        if (i != 0) {
        }
        mouseWheelScrollDelta = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) obj2;
        if (mouseWheelScrollDelta != null) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(final androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationState, float f, int i, final kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
        floatRef.element = animationState.getValue().floatValue();
        java.lang.Object animateTo = androidx.compose.animation.core.SuspendAnimationKt.animateTo(animationState, kotlin.coroutines.jvm.internal.Boxing.boxFloat(f), androidx.compose.animation.core.AnimationSpecKt.tween$default(i, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), true, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.internal.Ref.FloatRef.this, this, nestedScrollScope, function1, (androidx.compose.animation.core.AnimationScope) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, continuation);
        return animateTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic, androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope, kotlin.jvm.functions.Function1 function1, androidx.compose.animation.core.AnimationScope animationScope) {
        boolean Camera2StreamConfigurationMap;
        boolean Camera2StreamConfigurationMap2;
        float floatValue = ((java.lang.Number) animationScope.getValue()).floatValue() - floatRef.element;
        Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.MouseWheelScrollableKt.Camera2StreamConfigurationMap(floatValue);
        if (!Camera2StreamConfigurationMap) {
            Camera2StreamConfigurationMap2 = androidx.compose.foundation.gestures.MouseWheelScrollableKt.Camera2StreamConfigurationMap(floatValue - mouseWheelScrollingLogic.getHighSpeedVideoFpsRangesFor(nestedScrollScope, floatValue));
            if (!Camera2StreamConfigurationMap2) {
                animationScope.cancelAnimation();
                return kotlin.Unit.INSTANCE;
            }
            floatRef.element += floatValue;
        }
        if (((java.lang.Boolean) function1.invoke(java.lang.Float.valueOf(floatRef.element))).booleanValue()) {
            animationScope.cancelAnimation();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope, float f) {
        androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic = this.getHighSpeedVideoFpsRanges;
        return scrollingLogic.m1537toFloatk4lQ0M(scrollingLogic.m1535reverseIfNeededMKHz9U(nestedScrollScope.mo1490scrollByOzD1aCk(scrollingLogic.m1538toOffsettuRUvjQ(scrollingLogic.reverseIfNeeded(f)), androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())));
    }
}
