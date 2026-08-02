package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a/\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\n\u0010\b\u001a-\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/geometry/Offset;", "offset", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "block", "toMotionEventScope-d-4ec7I", "(Landroidx/compose/ui/input/pointer/PointerEvent;JLkotlin/jvm/functions/Function1;)V", "toMotionEventScope", "toCancelMotionEventScope-d-4ec7I", "toCancelMotionEventScope", "", "nowMillis", "emptyCancelMotionEventScope", "(JLkotlin/jvm/functions/Function1;)V", "p0", "p1", "", "p2", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/input/pointer/PointerEvent;JLkotlin/jvm/functions/Function1;Z)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PointerInteropUtils_androidKt {
    /* renamed from: toMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m7289toMotionEventScoped4ec7I(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, long j, kotlin.jvm.functions.Function1<? super android.view.MotionEvent, kotlin.Unit> function1) {
        getHighSpeedVideoFpsRangesFor(pointerEvent, j, function1, false);
    }

    /* renamed from: toCancelMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m7288toCancelMotionEventScoped4ec7I(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, long j, kotlin.jvm.functions.Function1<? super android.view.MotionEvent, kotlin.Unit> function1) {
        getHighSpeedVideoFpsRangesFor(pointerEvent, j, function1, true);
    }

    public static /* synthetic */ void emptyCancelMotionEventScope$default(long j, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = android.os.SystemClock.uptimeMillis();
        }
        emptyCancelMotionEventScope(j, function1);
    }

    public static final void emptyCancelMotionEventScope(long j, kotlin.jvm.functions.Function1<? super android.view.MotionEvent, kotlin.Unit> function1) {
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(j, j, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        function1.invoke(obtain);
        obtain.recycle();
    }

    private static final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, long j, kotlin.jvm.functions.Function1<? super android.view.MotionEvent, kotlin.Unit> function1, boolean z) {
        android.view.MotionEvent motionEvent = pointerEvent.getMotionEvent();
        if (motionEvent == null) {
            throw new java.lang.IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
        }
        int action = motionEvent.getAction();
        if (z) {
            motionEvent.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEvent.offsetLocation(-java.lang.Float.intBitsToFloat(i), -java.lang.Float.intBitsToFloat(i2));
        function1.invoke(motionEvent);
        motionEvent.offsetLocation(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2));
        motionEvent.setAction(action);
    }
}
