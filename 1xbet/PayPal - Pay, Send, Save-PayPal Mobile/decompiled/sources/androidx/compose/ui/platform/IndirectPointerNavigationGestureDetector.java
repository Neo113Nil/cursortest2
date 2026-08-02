package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u00020\u00158\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/ui/platform/IndirectPointerNavigationGestureDetector;", "", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", "", "onMoveFocus", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "indirectPointerEvent", "", "isConsumed", "onIndirectPointerEvent", "(Landroidx/compose/ui/input/indirect/IndirectPointerEvent;Z)Z", "cancelCurrentEventStream", "()V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "primaryDirectionalMotionAxis", com.visa.cbp.getEncExpo.warmup, "getPrimaryDirectionalMotionAxis-nZO2Niw", "()I", "setPrimaryDirectionalMotionAxis-WQKaTuc", "(I)V", "Z", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/view/GestureDetector;", "getHighSpeedVideoFpsRangesFor", "Landroid/view/GestureDetector;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IndirectPointerNavigationGestureDetector {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private final android.view.GestureDetector getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusDirection, kotlin.Unit> getHighSpeedVideoFpsRanges;
    private int primaryDirectionalMotionAxis = androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m6760getNonenZO2Niw();

    /* JADX WARN: Multi-variable type inference failed */
    public IndirectPointerNavigationGestureDetector(android.content.Context context, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusDirection, kotlin.Unit> function1) {
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoFpsRangesFor = new android.view.GestureDetector(context, new android.view.GestureDetector.OnGestureListener() { // from class: androidx.compose.ui.platform.IndirectPointerNavigationGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(android.view.MotionEvent e) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(android.view.MotionEvent e) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(android.view.MotionEvent e1, android.view.MotionEvent e2, float distanceX, float distanceY) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(android.view.MotionEvent e) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(android.view.MotionEvent e) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(android.view.MotionEvent e1, android.view.MotionEvent e2, float velocityX, float velocityY) {
                boolean z;
                kotlin.jvm.functions.Function1 function12;
                kotlin.jvm.functions.Function1 function13;
                z = androidx.compose.ui.platform.IndirectPointerNavigationGestureDetector.this.getHighResolutionOutputSizeshNQ4ISI;
                if (z) {
                    return true;
                }
                if (androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6756equalsimpl0(androidx.compose.ui.platform.IndirectPointerNavigationGestureDetector.this.getPrimaryDirectionalMotionAxis(), androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m6761getXnZO2Niw())) {
                    if (java.lang.Math.abs(velocityX) > java.lang.Math.abs(velocityY)) {
                        int m5653getNextdhqQ8s = velocityX > 0.0f ? androidx.compose.ui.focus.FocusDirection.INSTANCE.m5653getNextdhqQ8s() : androidx.compose.ui.focus.FocusDirection.INSTANCE.m5654getPreviousdhqQ8s();
                        function13 = androidx.compose.ui.platform.IndirectPointerNavigationGestureDetector.this.getHighSpeedVideoFpsRanges;
                        function13.invoke(androidx.compose.ui.focus.FocusDirection.m5642boximpl(m5653getNextdhqQ8s));
                    }
                } else if (androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6756equalsimpl0(androidx.compose.ui.platform.IndirectPointerNavigationGestureDetector.this.getPrimaryDirectionalMotionAxis(), androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m6762getYnZO2Niw()) && java.lang.Math.abs(velocityY) > java.lang.Math.abs(velocityX)) {
                    int m5653getNextdhqQ8s2 = velocityY > 0.0f ? androidx.compose.ui.focus.FocusDirection.INSTANCE.m5653getNextdhqQ8s() : androidx.compose.ui.focus.FocusDirection.INSTANCE.m5654getPreviousdhqQ8s();
                    function12 = androidx.compose.ui.platform.IndirectPointerNavigationGestureDetector.this.getHighSpeedVideoFpsRanges;
                    function12.invoke(androidx.compose.ui.focus.FocusDirection.m5642boximpl(m5653getNextdhqQ8s2));
                }
                return true;
            }
        });
    }

    /* renamed from: getPrimaryDirectionalMotionAxis-nZO2Niw, reason: not valid java name and from getter */
    public final int getPrimaryDirectionalMotionAxis() {
        return this.primaryDirectionalMotionAxis;
    }

    /* renamed from: setPrimaryDirectionalMotionAxis-WQKaTuc, reason: not valid java name */
    public final void m7759setPrimaryDirectionalMotionAxisWQKaTuc(int i) {
        this.primaryDirectionalMotionAxis = i;
    }

    public final boolean onIndirectPointerEvent(androidx.compose.ui.input.indirect.IndirectPointerEvent indirectPointerEvent, boolean isConsumed) {
        android.view.MotionEvent nativeEvent = androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent_androidKt.getNativeEvent(indirectPointerEvent);
        int action = nativeEvent.getAction();
        if (action == 0) {
            this.primaryDirectionalMotionAxis = indirectPointerEvent.getPrimaryDirectionalMotionAxis();
            this.getHighResolutionOutputSizeshNQ4ISI = false;
        } else if ((action == 1 || action == 2) && isConsumed) {
            cancelCurrentEventStream();
        }
        return this.getHighSpeedVideoFpsRangesFor.onTouchEvent(nativeEvent);
    }

    public final void cancelCurrentEventStream() {
        this.primaryDirectionalMotionAxis = androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m6760getNonenZO2Niw();
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }
}
