package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aB\u0010\u000b\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\u0003H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a0\u0010\u0011\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013\u001an\u0010\u001a\u001a\u00020\u0007*\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\"\u0010\r\u001a\u001e\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\u0003H\u0086@¢\u0006\u0004\b\u001a\u0010\u001b\u001a®\u0001\u0010\u001a\u001a\u00020\u0007*\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2/\b\u0002\u0010\u0016\u001a)\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\u001e2\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\f2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\"\u0010\r\u001a\u001e\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\u0003H\u0086@¢\u0006\u0004\b\u001a\u0010 \u001an\u0010!\u001a\u00020\u0007*\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\"\u0010\r\u001a\u001e\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\u0003H\u0086@¢\u0006\u0004\b!\u0010\u001b\u001aB\u0010$\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\"¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\u0003H\u0086@¢\u0006\u0004\b#\u0010\n\u001aJ\u0010*\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010&\u001a\u00020%2\"\u0010'\u001a\u001e\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\"¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\u0003H\u0086@¢\u0006\u0004\b(\u0010)\u001a0\u0010,\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\fH\u0086@¢\u0006\u0004\b+\u0010\u0010\u001a\u001e\u0010.\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b-\u0010\u0013\u001an\u00100\u001a\u00020\u0007*\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\"\u0010/\u001a\u001e\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\"¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\u0003H\u0086@¢\u0006\u0004\b0\u0010\u001b\u001aB\u00102\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\"¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\u0003H\u0086@¢\u0006\u0004\b1\u0010\n\u001aJ\u00104\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010&\u001a\u00020%2\"\u0010'\u001a\u001e\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\"¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\u0003H\u0086@¢\u0006\u0004\b3\u0010)\u001a0\u00106\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\fH\u0086@¢\u0006\u0004\b5\u0010\u0010\u001a\u001e\u00108\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b7\u0010\u0013\u001an\u0010:\u001a\u00020\u0007*\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\"\u00109\u001a\u001e\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\"¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\u0003H\u0086@¢\u0006\u0004\b:\u0010\u001b\u001aP\u0010\u0011\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\f2\b\u0010;\u001a\u0004\u0018\u00010\u001c2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\fH\u0080H¢\u0006\u0004\b=\u0010>\u001aT\u0010B\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010&\u001a\u00020%2\b\u0010;\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010?\u001a\u00020\u00062\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003H\u0080H¢\u0006\u0004\b@\u0010A\u001a&\u0010E\u001a\u00020\u000e*\u00020\u00002\u0006\u0010?\u001a\u00020\u00042\b\b\u0002\u0010D\u001a\u00020CH\u0080@¢\u0006\u0004\bE\u0010F\u001a\u001e\u0010H\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\bG\u0010\u0013\u001a\u001b\u0010K\u001a\u00020\u000e*\u00020I2\u0006\u0010J\u001a\u00020\u0001H\u0002¢\u0006\u0004\bK\u0010L\u001a\u001b\u0010P\u001a\u00020\"*\u00020M2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\bN\u0010O\"\u0014\u0010K\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010R\"\u0014\u0010S\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010R\"\u0014\u0010U\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010R"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/ParameterName;", "Landroidx/compose/ui/geometry/Offset;", "", "onTouchSlopReached", "awaitTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitTouchSlopOrCancellation", "Lkotlin/Function1;", "onDrag", "", "drag-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drag", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "detectDragGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/Orientation;", "orientationLock", "Lkotlin/Function3;", "shouldAwaitTouchSlop", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "", "awaitVerticalTouchSlopOrCancellation-jO51t88", "awaitVerticalTouchSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "onPointerSlopReached", "awaitVerticalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitVerticalPointerSlopOrCancellation", "verticalDrag-jO51t88", "verticalDrag", "awaitVerticalDragOrCancellation-rnUCldI", "awaitVerticalDragOrCancellation", "onVerticalDrag", "detectVerticalDragGestures", "awaitHorizontalTouchSlopOrCancellation-jO51t88", "awaitHorizontalTouchSlopOrCancellation", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "awaitHorizontalPointerSlopOrCancellation", "horizontalDrag-jO51t88", "horizontalDrag", "awaitHorizontalDragOrCancellation-rnUCldI", "awaitHorizontalDragOrCancellation", "onHorizontalDrag", "detectHorizontalDragGestures", "orientation", "motionConsumed", "drag-VnAYq1g", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initialPositionChange", "awaitPointerSlopOrCancellation-6ksA65w", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILandroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "awaitAllPointersUpWithSlopDetection", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitLongPressOrCancellation-rnUCldI", "awaitLongPressOrCancellation", "Landroidx/compose/ui/input/pointer/PointerEvent;", "p0", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "pointerSlop", "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DragGestureDetectorKt {
    private static final float Camera2StreamConfigurationMap;
    private static final float getHighResolutionOutputSizeshNQ4ISI;
    private static final float getHighSpeedVideoFpsRanges;

    public static /* synthetic */ boolean $r8$lambda$1CBhd6pLTC9L9zonHP1qMwSkZLc() {
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$BVUA8IZa3abJ4sNaN2ErAjndOwM() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0199 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x018d -> B:11:0x0193). Please report as a decompilation issue!!! */
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1462awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
        int i;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function22;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
        float f;
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        float f2;
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector2;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes;
        int size;
        int i2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> list;
        java.lang.Object awaitPointerEvent$default;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.getHighSpeedVideoSizesFor;
                int i3 = 1;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    int m7306getTouchT8wyACA = androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7306getTouchT8wyACA();
                    long m5768getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                    if (getHighSpeedVideoFpsRanges(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    float m1469pointerSlopE8SPZFQ = m1469pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m7306getTouchT8wyACA);
                    kotlin.jvm.internal.Ref.LongRef longRef3 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef3.element = j;
                    androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector3 = new androidx.compose.foundation.gestures.TouchSlopDetector(null, m5768getZeroF1C5BW0, null);
                    function22 = function2;
                    longRef = longRef3;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                    f = m1469pointerSlopE8SPZFQ;
                    touchSlopDetector = touchSlopDetector3;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = function22;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighSpeedVideoFpsRanges = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighSpeedVideoSizes = longRef;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.Camera2StreamConfigurationMap = touchSlopDetector;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getOutputFormats = pointerEventPass;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = f;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighSpeedVideoSizesFor = i3;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i3, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    float f3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector4 = (androidx.compose.foundation.gestures.TouchSlopDetector) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.Camera2StreamConfigurationMap;
                    kotlin.jvm.internal.Ref.LongRef longRef4 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.getHighSpeedVideoSizes;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function23 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                    longRef2 = longRef4;
                    f2 = f3;
                    touchSlopDetector2 = touchSlopDetector4;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    function22 = function23;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    changes = pointerEvent.getChanges();
                    size = changes.size();
                    int i4 = 0;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                        }
                        i2++;
                        changes = list;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null) {
                        return null;
                    }
                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = function22;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighSpeedVideoFpsRanges = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighSpeedVideoSizes = longRef;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.Camera2StreamConfigurationMap = touchSlopDetector;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getOutputFormats = pointerEventPass;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = f;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighSpeedVideoSizesFor = i3;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i3, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = (androidx.compose.ui.input.pointer.PointerInputChange) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.getOutputFormats;
                androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector5 = (androidx.compose.foundation.gestures.TouchSlopDetector) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.Camera2StreamConfigurationMap;
                kotlin.jvm.internal.Ref.LongRef longRef5 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.getHighSpeedVideoSizes;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.getHighSpeedVideoFpsRanges;
                kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function24 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                touchSlopDetector = touchSlopDetector5;
                int i5 = 1;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                f = f4;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                char c = 2;
                kotlin.jvm.internal.Ref.LongRef longRef6 = longRef5;
                if (!pointerInputChange4.isConsumed()) {
                    return null;
                }
                i3 = i5;
                function22 = function24;
                pointerEventPass = null;
                longRef = longRef6;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = function22;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighSpeedVideoFpsRanges = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighSpeedVideoSizes = longRef;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.Camera2StreamConfigurationMap = touchSlopDetector;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getOutputFormats = pointerEventPass;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = f;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighSpeedVideoSizesFor = i3;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i3, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
                    longRef2 = longRef;
                    f2 = f;
                    touchSlopDetector2 = touchSlopDetector;
                    obj = awaitPointerEvent$default;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    changes = pointerEvent2.getChanges();
                    size = changes.size();
                    int i42 = 0;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i2);
                        list = changes;
                        if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                            break;
                        }
                        i2++;
                        changes = list;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                        int size2 = changes2.size();
                        while (true) {
                            if (i42 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes2.get(i42);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i42++;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5 = pointerInputChange3;
                        if (pointerInputChange5 == null) {
                            return null;
                        }
                        longRef2.element = pointerInputChange5.getId();
                        longRef = longRef2;
                        touchSlopDetector = touchSlopDetector2;
                        f = f2;
                        i3 = 1;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                        pointerEventPass = null;
                    } else {
                        kotlin.jvm.internal.Ref.LongRef longRef7 = longRef2;
                        long m1543addPositionsakrDWew = touchSlopDetector2.m1543addPositionsakrDWew(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition(), f2);
                        if ((9223372034707292159L & m1543addPositionsakrDWew) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                            function22.invoke(pointerInputChange2, androidx.compose.ui.geometry.Offset.m5741boximpl(m1543addPositionsakrDWew));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            androidx.compose.foundation.gestures.TouchSlopDetector.m1542resetk4lQ0M$default(touchSlopDetector2, 0L, 1, null);
                            longRef = longRef7;
                            touchSlopDetector = touchSlopDetector2;
                            f = f2;
                            i3 = 1;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                            pointerEventPass = null;
                        } else {
                            i5 = 1;
                            androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.getHighSpeedVideoFpsRangesFor = function22;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.getHighSpeedVideoFpsRanges = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.getHighSpeedVideoSizes = longRef7;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.Camera2StreamConfigurationMap = touchSlopDetector2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.getOutputFormats = pointerInputChange2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.getHighResolutionOutputSizeshNQ4ISI = f2;
                            c = 2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.getHighSpeedVideoSizesFor = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitTouchSlopOrCancellation$13) != coroutine_suspended) {
                                function24 = function22;
                                pointerInputChange4 = pointerInputChange2;
                                longRef6 = longRef7;
                                touchSlopDetector = touchSlopDetector2;
                                f = f2;
                                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                                if (!pointerInputChange4.isConsumed()) {
                                }
                            }
                        }
                    }
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = function22;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighSpeedVideoFpsRanges = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighSpeedVideoSizes = longRef;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.Camera2StreamConfigurationMap = touchSlopDetector;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getOutputFormats = pointerEventPass;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = f;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.getHighSpeedVideoSizesFor = i3;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i3, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.getHighSpeedVideoSizesFor;
        int i32 = 1;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass3 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0049 -> B:10:0x004c). Please report as a decompilation issue!!! */
    /* renamed from: drag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1467dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 dragGestureDetectorKt$drag$1;
        int i;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) {
            dragGestureDetectorKt$drag$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) continuation;
            if ((dragGestureDetectorKt$drag$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = dragGestureDetectorKt$drag$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$drag$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$drag$1.getHighSpeedVideoFpsRanges = awaitPointerEventScope;
                    dragGestureDetectorKt$drag$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                    dragGestureDetectorKt$drag$1.Camera2StreamConfigurationMap = 1;
                    obj = m1455awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
                    if (obj == coroutine_suspended) {
                    }
                    pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    if (pointerInputChange == null) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function12 = (kotlin.jvm.functions.Function1) dragGestureDetectorKt$drag$1.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$drag$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    function1 = function12;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    if (pointerInputChange == null) {
                        if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                        }
                        function1.invoke(pointerInputChange);
                        j = pointerInputChange.getId();
                        dragGestureDetectorKt$drag$1.getHighSpeedVideoFpsRanges = awaitPointerEventScope;
                        dragGestureDetectorKt$drag$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                        dragGestureDetectorKt$drag$1.Camera2StreamConfigurationMap = 1;
                        obj = m1455awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                        if (pointerInputChange == null) {
                            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                        }
                    }
                }
            }
        }
        dragGestureDetectorKt$drag$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$drag$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$drag$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0068 -> B:10:0x006d). Please report as a decompilation issue!!! */
    /* renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1455awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1 dragGestureDetectorKt$awaitDragOrCancellation$1;
        int i;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        java.lang.Object awaitPointerEvent$default;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1) {
            dragGestureDetectorKt$awaitDragOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitDragOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitDragOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = dragGestureDetectorKt$awaitDragOrCancellation$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitDragOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.Ref.LongRef longRef2 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitDragOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitDragOrCancellation$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.LongRef longRef3 = longRef2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i3);
                        if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                            break;
                        }
                        i3++;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            while (true) {
                                if (i2 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(i2);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                i2++;
                            }
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                longRef3.element = pointerInputChange4.getId();
                                longRef = longRef3;
                            }
                        }
                        dragGestureDetectorKt$awaitDragOrCancellation$1.getHighSpeedVideoFpsRanges = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitDragOrCancellation$1.getHighSpeedVideoFpsRangesFor = longRef;
                        dragGestureDetectorKt$awaitDragOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kotlin.jvm.internal.Ref.LongRef longRef4 = longRef;
                        obj = awaitPointerEvent$default;
                        longRef3 = longRef4;
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i22 = 0;
                        int i32 = 0;
                        while (true) {
                            if (i32 < size3) {
                            }
                            i32++;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                    if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                        return null;
                    }
                    return pointerInputChange32;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (getHighSpeedVideoFpsRanges(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new kotlin.jvm.internal.Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitDragOrCancellation$1.getHighSpeedVideoFpsRanges = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitDragOrCancellation$1.getHighSpeedVideoFpsRangesFor = longRef;
                dragGestureDetectorKt$awaitDragOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitDragOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitDragOrCancellation$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitDragOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
        }
    }

    public static /* synthetic */ java.lang.Object detectDragGestures$default(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.foundation.gestures.DragGestureDetectorKt.getHighSpeedVideoFpsRanges();
                    return highSpeedVideoFpsRanges;
                }
            };
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.DragGestureDetectorKt.getHighSpeedVideoFpsRangesFor();
                    return highSpeedVideoFpsRangesFor;
                }
            };
        }
        kotlin.jvm.functions.Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.gestures.DragGestureDetectorKt.getHighSpeedVideoSizes();
                    return highSpeedVideoSizes;
                }
            };
        }
        return detectDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes() {
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object detectDragGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object detectDragGestures = detectDragGestures(pointerInputScope, null, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.gestures.DragGestureDetectorKt.getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1.this, (androidx.compose.ui.input.pointer.PointerInputChange) obj2);
                return highSpeedVideoFpsRanges;
            }
        }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.gestures.DragGestureDetectorKt.getHighSpeedVideoSizes(kotlin.jvm.functions.Function0.this);
                return highSpeedVideoSizes;
            }
        }, function02, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.gestures.DragGestureDetectorKt.$r8$lambda$BVUA8IZa3abJ4sNaN2ErAjndOwM());
            }
        }, function2, continuation);
        return detectDragGestures == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectDragGestures : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        function1.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(pointerInputChange.getPosition()));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getOutputMinFrameDuration() {
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object detectDragGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.gestures.Orientation orientation, kotlin.jvm.functions.Function3<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function3, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<java.lang.Boolean> function02, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13(function02, new kotlin.jvm.internal.Ref.LongRef(), orientation, function3, function2, function0, function1, null), continuation);
        return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object detectDragGesturesAfterLongPress$default(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit inputSizeshNQ4ISI;
                    inputSizeshNQ4ISI = androidx.compose.foundation.gestures.DragGestureDetectorKt.getInputSizeshNQ4ISI();
                    return inputSizeshNQ4ISI;
                }
            };
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit highSpeedVideoSizesFor;
                    highSpeedVideoSizesFor = androidx.compose.foundation.gestures.DragGestureDetectorKt.getHighSpeedVideoSizesFor();
                    return highSpeedVideoSizesFor;
                }
            };
        }
        kotlin.jvm.functions.Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit inputFormats;
                    inputFormats = androidx.compose.foundation.gestures.DragGestureDetectorKt.getInputFormats();
                    return inputFormats;
                }
            };
        }
        return detectDragGesturesAfterLongPress(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getInputSizeshNQ4ISI() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizesFor() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getInputFormats() {
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object detectDragGesturesAfterLongPress(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(function1, function0, function02, function2, null), continuation);
        return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0199 -> B:11:0x019f). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1465awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
        int i;
        kotlin.jvm.internal.Ref.LongRef longRef;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function22;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
        float f;
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        float f2;
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector2;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes;
        int size;
        int i2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> list;
        java.lang.Object awaitPointerEvent$default;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.getOutputFormats;
                int i3 = 1;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    int m7306getTouchT8wyACA = androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7306getTouchT8wyACA();
                    androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Vertical;
                    long m5768getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                    if (getHighSpeedVideoFpsRanges(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    float m1469pointerSlopE8SPZFQ = m1469pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m7306getTouchT8wyACA);
                    longRef = new kotlin.jvm.internal.Ref.LongRef();
                    longRef.element = j;
                    androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector3 = new androidx.compose.foundation.gestures.TouchSlopDetector(orientation, m5768getZeroF1C5BW0, null);
                    function22 = function2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                    f = m1469pointerSlopE8SPZFQ;
                    touchSlopDetector = touchSlopDetector3;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getHighSpeedVideoSizes = function22;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.Camera2StreamConfigurationMap = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getHighSpeedVideoFpsRanges = longRef;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getOutputMinFrameDuration = pointerEventPass;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = f;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getOutputFormats = i3;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i3, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    float f3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                    androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector4 = (androidx.compose.foundation.gestures.TouchSlopDetector) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.jvm.internal.Ref.LongRef longRef3 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.getHighSpeedVideoFpsRanges;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.Camera2StreamConfigurationMap;
                    kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function23 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                    longRef2 = longRef3;
                    f2 = f3;
                    touchSlopDetector2 = touchSlopDetector4;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    function22 = function23;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    changes = pointerEvent.getChanges();
                    size = changes.size();
                    int i4 = 0;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                        }
                        i2++;
                        changes = list;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null) {
                        return null;
                    }
                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getHighSpeedVideoSizes = function22;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.Camera2StreamConfigurationMap = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getHighSpeedVideoFpsRanges = longRef;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getOutputMinFrameDuration = pointerEventPass;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = f;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getOutputFormats = i3;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i3, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f4 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = (androidx.compose.ui.input.pointer.PointerInputChange) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.getOutputMinFrameDuration;
                androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector5 = (androidx.compose.foundation.gestures.TouchSlopDetector) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.internal.Ref.LongRef longRef4 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.getHighSpeedVideoFpsRanges;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.Camera2StreamConfigurationMap;
                kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function24 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                touchSlopDetector = touchSlopDetector5;
                int i5 = 1;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                f = f4;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                char c = 2;
                kotlin.jvm.internal.Ref.LongRef longRef5 = longRef4;
                if (!pointerInputChange4.isConsumed()) {
                    return null;
                }
                i3 = i5;
                function22 = function24;
                pointerEventPass = null;
                longRef = longRef5;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getHighSpeedVideoSizes = function22;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.Camera2StreamConfigurationMap = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getHighSpeedVideoFpsRanges = longRef;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = touchSlopDetector;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getOutputMinFrameDuration = pointerEventPass;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = f;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getOutputFormats = i3;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i3, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
                    longRef2 = longRef;
                    f2 = f;
                    touchSlopDetector2 = touchSlopDetector;
                    obj = awaitPointerEvent$default;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    changes = pointerEvent2.getChanges();
                    size = changes.size();
                    int i42 = 0;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i2);
                        list = changes;
                        if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                            break;
                        }
                        i2++;
                        changes = list;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                        int size2 = changes2.size();
                        while (true) {
                            if (i42 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes2.get(i42);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i42++;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5 = pointerInputChange3;
                        if (pointerInputChange5 == null) {
                            return null;
                        }
                        longRef2.element = pointerInputChange5.getId();
                        longRef = longRef2;
                        touchSlopDetector = touchSlopDetector2;
                        f = f2;
                        i3 = 1;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                        pointerEventPass = null;
                    } else {
                        kotlin.jvm.internal.Ref.LongRef longRef6 = longRef2;
                        long m1543addPositionsakrDWew = touchSlopDetector2.m1543addPositionsakrDWew(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition(), f2);
                        if ((9223372034707292159L & m1543addPositionsakrDWew) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                            function22.invoke(pointerInputChange2, kotlin.coroutines.jvm.internal.Boxing.boxFloat(java.lang.Float.intBitsToFloat((int) (m1543addPositionsakrDWew & 4294967295L))));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            androidx.compose.foundation.gestures.TouchSlopDetector.m1542resetk4lQ0M$default(touchSlopDetector2, 0L, 1, null);
                            longRef = longRef6;
                            touchSlopDetector = touchSlopDetector2;
                            f = f2;
                            i3 = 1;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                            pointerEventPass = null;
                        } else {
                            i5 = 1;
                            androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.getHighSpeedVideoSizes = function22;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.Camera2StreamConfigurationMap = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.getHighSpeedVideoFpsRanges = longRef6;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.getHighResolutionOutputSizeshNQ4ISI = touchSlopDetector2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.getOutputMinFrameDuration = pointerInputChange2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.getHighSpeedVideoFpsRangesFor = f2;
                            c = 2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.getOutputFormats = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13) != coroutine_suspended) {
                                function24 = function22;
                                pointerInputChange4 = pointerInputChange2;
                                longRef5 = longRef6;
                                touchSlopDetector = touchSlopDetector2;
                                f = f2;
                                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                                if (!pointerInputChange4.isConsumed()) {
                                }
                            }
                        }
                    }
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getHighSpeedVideoSizes = function22;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.Camera2StreamConfigurationMap = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getHighSpeedVideoFpsRanges = longRef;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getOutputMinFrameDuration = pointerEventPass;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = f;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.getOutputFormats = i3;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i3, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.getOutputFormats;
        int i32 = 1;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass3 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01a3 -> B:11:0x01a9). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1464awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, int i, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
        int i2;
        float m1469pointerSlopE8SPZFQ;
        kotlin.jvm.internal.Ref.LongRef longRef;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function22;
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        float f;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector2;
        int size;
        int i3;
        float f2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        java.lang.Object awaitPointerEvent$default;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoSizesFor;
                int i4 = 1;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Vertical;
                    long m5768getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                    if (getHighSpeedVideoFpsRanges(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m1469pointerSlopE8SPZFQ = m1469pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                    longRef = new kotlin.jvm.internal.Ref.LongRef();
                    longRef.element = j;
                    function22 = function2;
                    touchSlopDetector = new androidx.compose.foundation.gestures.TouchSlopDetector(orientation, m5768getZeroF1C5BW0, null);
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoSizes = function22;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.Camera2StreamConfigurationMap = longRef;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getInputSizeshNQ4ISI = pointerEventPass;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI = m1469pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoSizesFor = i4;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i4, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    float f3 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector3 = (androidx.compose.foundation.gestures.TouchSlopDetector) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.jvm.internal.Ref.LongRef longRef2 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.Camera2StreamConfigurationMap;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function23 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    longRef = longRef2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                    touchSlopDetector2 = touchSlopDetector3;
                    function22 = function23;
                    f = f3;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    int i5 = 0;
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3++;
                        f = f2;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null) {
                        return null;
                    }
                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoSizes = function22;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.Camera2StreamConfigurationMap = longRef;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getInputSizeshNQ4ISI = pointerEventPass;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI = m1469pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoSizesFor = i4;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i4, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = (androidx.compose.ui.input.pointer.PointerInputChange) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getInputSizeshNQ4ISI;
                androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector4 = (androidx.compose.foundation.gestures.TouchSlopDetector) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.internal.Ref.LongRef longRef3 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.Camera2StreamConfigurationMap;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges;
                kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function24 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                float f5 = f4;
                int i6 = 1;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                touchSlopDetector2 = touchSlopDetector4;
                char c = 2;
                kotlin.jvm.internal.Ref.LongRef longRef4 = longRef3;
                if (!pointerInputChange4.isConsumed()) {
                    return null;
                }
                i4 = i6;
                touchSlopDetector = touchSlopDetector2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                m1469pointerSlopE8SPZFQ = f5;
                function22 = function24;
                pointerEventPass = null;
                longRef = longRef4;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoSizes = function22;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.Camera2StreamConfigurationMap = longRef;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor = touchSlopDetector;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getInputSizeshNQ4ISI = pointerEventPass;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI = m1469pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoSizesFor = i4;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i4, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                    touchSlopDetector2 = touchSlopDetector;
                    obj = awaitPointerEvent$default;
                    f = m1469pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    int i52 = 0;
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            f2 = f;
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes2.get(i3);
                        f2 = f;
                        if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                            break;
                        }
                        i3++;
                        f = f2;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        while (true) {
                            if (i52 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes3.get(i52);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i52++;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5 = pointerInputChange3;
                        if (pointerInputChange5 == null) {
                            return null;
                        }
                        longRef.element = pointerInputChange5.getId();
                        i4 = 1;
                        touchSlopDetector = touchSlopDetector2;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                        m1469pointerSlopE8SPZFQ = f2;
                        pointerEventPass = null;
                    } else {
                        long m1543addPositionsakrDWew = touchSlopDetector2.m1543addPositionsakrDWew(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition(), f2);
                        if ((9223372034707292159L & m1543addPositionsakrDWew) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                            function22.invoke(pointerInputChange2, kotlin.coroutines.jvm.internal.Boxing.boxFloat(java.lang.Float.intBitsToFloat((int) (m1543addPositionsakrDWew & 4294967295L))));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            androidx.compose.foundation.gestures.TouchSlopDetector.m1542resetk4lQ0M$default(touchSlopDetector2, 0L, 1, null);
                            i4 = 1;
                            touchSlopDetector = touchSlopDetector2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                            m1469pointerSlopE8SPZFQ = f2;
                            pointerEventPass = null;
                        } else {
                            i6 = 1;
                            androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.getHighSpeedVideoSizes = function22;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.getHighSpeedVideoFpsRanges = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.Camera2StreamConfigurationMap = longRef;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = touchSlopDetector2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.getInputSizeshNQ4ISI = pointerInputChange2;
                            f5 = f2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = f5;
                            c = 2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.getHighSpeedVideoSizesFor = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12) != coroutine_suspended) {
                                kotlin.jvm.internal.Ref.LongRef longRef5 = longRef;
                                function24 = function22;
                                pointerInputChange4 = pointerInputChange2;
                                longRef4 = longRef5;
                                if (!pointerInputChange4.isConsumed()) {
                                }
                            }
                        }
                    }
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoSizes = function22;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.Camera2StreamConfigurationMap = longRef;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getInputSizeshNQ4ISI = pointerEventPass;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI = m1469pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoSizesFor = i4;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i4, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.getHighSpeedVideoSizesFor;
        int i42 = 1;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass3 = null;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
    
        if (r0 == 0.0f) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0084 -> B:10:0x008a). Please report as a decompilation issue!!! */
    /* renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1470verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$1;
        int i;
        long j2;
        androidx.compose.foundation.gestures.Orientation orientation;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$12;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function12;
        androidx.compose.foundation.gestures.Orientation orientation2;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
        kotlin.jvm.internal.Ref.LongRef longRef;
        java.lang.Object awaitPointerEvent$default;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        float intBitsToFloat;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1) {
            dragGestureDetectorKt$verticalDrag$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1) continuation;
            if ((dragGestureDetectorKt$verticalDrag$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$verticalDrag$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = dragGestureDetectorKt$verticalDrag$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$verticalDrag$1.getOutputFormats;
                int i2 = 1;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.gestures.Orientation orientation3 = androidx.compose.foundation.gestures.Orientation.Vertical;
                    j2 = j;
                    if (!getHighSpeedVideoFpsRanges(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        orientation = orientation3;
                        dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        function12 = function1;
                        kotlin.jvm.internal.Ref.LongRef longRef2 = new kotlin.jvm.internal.Ref.LongRef();
                        longRef2.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        orientation2 = orientation;
                        longRef = longRef2;
                        dragGestureDetectorKt$verticalDrag$12.getHighSpeedVideoSizes = function12;
                        dragGestureDetectorKt$verticalDrag$12.Camera2StreamConfigurationMap = awaitPointerEventScope2;
                        dragGestureDetectorKt$verticalDrag$12.getHighSpeedVideoFpsRangesFor = orientation2;
                        dragGestureDetectorKt$verticalDrag$12.getHighResolutionOutputSizeshNQ4ISI = awaitPointerEventScope3;
                        dragGestureDetectorKt$verticalDrag$12.getHighSpeedVideoFpsRanges = longRef;
                        dragGestureDetectorKt$verticalDrag$12.getOutputFormats = i2;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, i2, pointerEventPass);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(pointerEventPass == null);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                longRef = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$verticalDrag$1.getHighSpeedVideoFpsRanges;
                awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.getHighResolutionOutputSizeshNQ4ISI;
                orientation2 = (androidx.compose.foundation.gestures.Orientation) dragGestureDetectorKt$verticalDrag$1.getHighSpeedVideoFpsRangesFor;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.Camera2StreamConfigurationMap;
                kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function13 = (kotlin.jvm.functions.Function1) dragGestureDetectorKt$verticalDrag$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$13 = dragGestureDetectorKt$verticalDrag$1;
                function12 = function13;
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i3);
                    awaitPointerEventScope4 = awaitPointerEventScope3;
                    if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                        break;
                    }
                    i3++;
                    awaitPointerEventScope3 = awaitPointerEventScope4;
                }
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange;
                if (pointerInputChange4 == null) {
                    if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                pointerInputChange2 = null;
                                break;
                            }
                            pointerInputChange2 = changes2.get(i4);
                            if (pointerInputChange2.getPressed()) {
                                break;
                            }
                            i4++;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5 = pointerInputChange2;
                        pointerInputChange3 = pointerInputChange4;
                        if (pointerInputChange5 != null) {
                            longRef.element = pointerInputChange5.getId();
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            awaitPointerEventScope2 = awaitPointerEventScope5;
                            dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$13;
                            i2 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$verticalDrag$12.getHighSpeedVideoSizes = function12;
                            dragGestureDetectorKt$verticalDrag$12.Camera2StreamConfigurationMap = awaitPointerEventScope2;
                            dragGestureDetectorKt$verticalDrag$12.getHighSpeedVideoFpsRangesFor = orientation2;
                            dragGestureDetectorKt$verticalDrag$12.getHighResolutionOutputSizeshNQ4ISI = awaitPointerEventScope3;
                            dragGestureDetectorKt$verticalDrag$12.getHighSpeedVideoFpsRanges = longRef;
                            dragGestureDetectorKt$verticalDrag$12.getOutputFormats = i2;
                            awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, i2, pointerEventPass);
                            if (awaitPointerEvent$default == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$14 = dragGestureDetectorKt$verticalDrag$12;
                            awaitPointerEventScope5 = awaitPointerEventScope2;
                            obj = awaitPointerEvent$default;
                            dragGestureDetectorKt$verticalDrag$13 = dragGestureDetectorKt$verticalDrag$14;
                        }
                    } else {
                        long positionChangeIgnoreConsumed = androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange4);
                        if (orientation2 == null) {
                            intBitsToFloat = androidx.compose.ui.geometry.Offset.m5750getDistanceimpl(positionChangeIgnoreConsumed);
                        } else {
                            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (orientation2 == androidx.compose.foundation.gestures.Orientation.Vertical ? positionChangeIgnoreConsumed & 4294967295L : positionChangeIgnoreConsumed >> 32));
                        }
                        pointerInputChange3 = pointerInputChange4;
                    }
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                    int size3 = changes3.size();
                    int i32 = 0;
                    while (true) {
                        if (i32 < size3) {
                        }
                        i32++;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange42 = pointerInputChange;
                    if (pointerInputChange42 == null) {
                        pointerInputChange3 = 0;
                    }
                }
                if (pointerInputChange3 == 0 || pointerInputChange3.isConsumed()) {
                    pointerEventPass = null;
                } else if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                    pointerEventPass = pointerInputChange3;
                } else {
                    function12.invoke(pointerInputChange3);
                    awaitPointerEventScope2 = awaitPointerEventScope5;
                    dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$13;
                    i2 = 1;
                    pointerEventPass = null;
                    orientation = orientation2;
                    j2 = pointerInputChange3.getId();
                    kotlin.jvm.internal.Ref.LongRef longRef22 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef22.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    orientation2 = orientation;
                    longRef = longRef22;
                    dragGestureDetectorKt$verticalDrag$12.getHighSpeedVideoSizes = function12;
                    dragGestureDetectorKt$verticalDrag$12.Camera2StreamConfigurationMap = awaitPointerEventScope2;
                    dragGestureDetectorKt$verticalDrag$12.getHighSpeedVideoFpsRangesFor = orientation2;
                    dragGestureDetectorKt$verticalDrag$12.getHighResolutionOutputSizeshNQ4ISI = awaitPointerEventScope3;
                    dragGestureDetectorKt$verticalDrag$12.getHighSpeedVideoFpsRanges = longRef;
                    dragGestureDetectorKt$verticalDrag$12.getOutputFormats = i2;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, i2, pointerEventPass);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(pointerEventPass == null);
            }
        }
        dragGestureDetectorKt$verticalDrag$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$verticalDrag$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$verticalDrag$1.getOutputFormats;
        int i22 = 1;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
    
        if (java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11) & 4294967295L)) == 0.0f) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0068 -> B:10:0x006d). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1463awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 dragGestureDetectorKt$awaitVerticalDragOrCancellation$1;
        int i;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        java.lang.Object awaitPointerEvent$default;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.getHighSpeedVideoFpsRanges;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.Ref.LongRef longRef2 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.Camera2StreamConfigurationMap;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.LongRef longRef3 = longRef2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i3);
                        if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                            break;
                        }
                        i3++;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            while (true) {
                                if (i2 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(i2);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                i2++;
                            }
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                longRef3.element = pointerInputChange4.getId();
                                longRef = longRef3;
                            }
                        }
                        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.Camera2StreamConfigurationMap = longRef;
                        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.getHighSpeedVideoFpsRanges = 1;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kotlin.jvm.internal.Ref.LongRef longRef4 = longRef;
                        obj = awaitPointerEvent$default;
                        longRef3 = longRef4;
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i22 = 0;
                        int i32 = 0;
                        while (true) {
                            if (i32 < size3) {
                            }
                            i32++;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                    if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                        return null;
                    }
                    return pointerInputChange32;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (getHighSpeedVideoFpsRanges(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new kotlin.jvm.internal.Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.Camera2StreamConfigurationMap = longRef;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.getHighSpeedVideoFpsRanges = 1;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.getHighSpeedVideoFpsRanges;
        if (i == 0) {
        }
    }

    public static /* synthetic */ java.lang.Object detectVerticalDragGestures$default(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit outputSizeshNQ4ISI;
                    outputSizeshNQ4ISI = androidx.compose.foundation.gestures.DragGestureDetectorKt.getOutputSizeshNQ4ISI();
                    return outputSizeshNQ4ISI;
                }
            };
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit outputStallDurationlomOqCM;
                    outputStallDurationlomOqCM = androidx.compose.foundation.gestures.DragGestureDetectorKt.getOutputStallDurationlomOqCM();
                    return outputStallDurationlomOqCM;
                }
            };
        }
        kotlin.jvm.functions.Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit outputMinFrameDurationlomOqCM;
                    outputMinFrameDurationlomOqCM = androidx.compose.foundation.gestures.DragGestureDetectorKt.getOutputMinFrameDurationlomOqCM();
                    return outputMinFrameDurationlomOqCM;
                }
            };
        }
        return detectVerticalDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getOutputSizeshNQ4ISI() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getOutputStallDurationlomOqCM() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getOutputMinFrameDurationlomOqCM() {
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object detectVerticalDragGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5(function1, function2, function0, function02, null), continuation);
        return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0196 -> B:11:0x019c). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1458awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
        int i;
        kotlin.jvm.internal.Ref.LongRef longRef;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function22;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
        float f;
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        float f2;
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector2;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes;
        int size;
        int i2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> list;
        java.lang.Object awaitPointerEvent$default;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.getHighSpeedVideoSizesFor;
                int i3 = 1;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    int m7306getTouchT8wyACA = androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7306getTouchT8wyACA();
                    androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Horizontal;
                    long m5768getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                    if (getHighSpeedVideoFpsRanges(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    float m1469pointerSlopE8SPZFQ = m1469pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m7306getTouchT8wyACA);
                    longRef = new kotlin.jvm.internal.Ref.LongRef();
                    longRef.element = j;
                    androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector3 = new androidx.compose.foundation.gestures.TouchSlopDetector(orientation, m5768getZeroF1C5BW0, null);
                    function22 = function2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                    f = m1469pointerSlopE8SPZFQ;
                    touchSlopDetector = touchSlopDetector3;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighSpeedVideoSizes = function22;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = longRef;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.Camera2StreamConfigurationMap = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getOutputFormats = pointerEventPass;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighSpeedVideoFpsRanges = f;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighSpeedVideoSizesFor = i3;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i3, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    float f3 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.getHighSpeedVideoFpsRanges;
                    androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector4 = (androidx.compose.foundation.gestures.TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.Camera2StreamConfigurationMap;
                    kotlin.jvm.internal.Ref.LongRef longRef3 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function23 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                    longRef2 = longRef3;
                    f2 = f3;
                    touchSlopDetector2 = touchSlopDetector4;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    function22 = function23;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    changes = pointerEvent.getChanges();
                    size = changes.size();
                    int i4 = 0;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                        }
                        i2++;
                        changes = list;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null) {
                        return null;
                    }
                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighSpeedVideoSizes = function22;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = longRef;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.Camera2StreamConfigurationMap = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getOutputFormats = pointerEventPass;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighSpeedVideoFpsRanges = f;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighSpeedVideoSizesFor = i3;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i3, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f4 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.getHighSpeedVideoFpsRanges;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = (androidx.compose.ui.input.pointer.PointerInputChange) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.getOutputFormats;
                androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector5 = (androidx.compose.foundation.gestures.TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.Camera2StreamConfigurationMap;
                kotlin.jvm.internal.Ref.LongRef longRef4 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function24 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                touchSlopDetector = touchSlopDetector5;
                int i5 = 1;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                f = f4;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                char c = 2;
                kotlin.jvm.internal.Ref.LongRef longRef5 = longRef4;
                if (!pointerInputChange4.isConsumed()) {
                    return null;
                }
                i3 = i5;
                function22 = function24;
                pointerEventPass = null;
                longRef = longRef5;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighSpeedVideoSizes = function22;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = longRef;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.Camera2StreamConfigurationMap = touchSlopDetector;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getOutputFormats = pointerEventPass;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighSpeedVideoFpsRanges = f;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighSpeedVideoSizesFor = i3;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i3, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
                    longRef2 = longRef;
                    f2 = f;
                    touchSlopDetector2 = touchSlopDetector;
                    obj = awaitPointerEvent$default;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    changes = pointerEvent2.getChanges();
                    size = changes.size();
                    int i42 = 0;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i2);
                        list = changes;
                        if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                            break;
                        }
                        i2++;
                        changes = list;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                        int size2 = changes2.size();
                        while (true) {
                            if (i42 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes2.get(i42);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i42++;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5 = pointerInputChange3;
                        if (pointerInputChange5 == null) {
                            return null;
                        }
                        longRef2.element = pointerInputChange5.getId();
                        longRef = longRef2;
                        touchSlopDetector = touchSlopDetector2;
                        f = f2;
                        i3 = 1;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                        pointerEventPass = null;
                    } else {
                        kotlin.jvm.internal.Ref.LongRef longRef6 = longRef2;
                        long m1543addPositionsakrDWew = touchSlopDetector2.m1543addPositionsakrDWew(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition(), f2);
                        if ((9223372034707292159L & m1543addPositionsakrDWew) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                            function22.invoke(pointerInputChange2, kotlin.coroutines.jvm.internal.Boxing.boxFloat(java.lang.Float.intBitsToFloat((int) (m1543addPositionsakrDWew >> 32))));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            androidx.compose.foundation.gestures.TouchSlopDetector.m1542resetk4lQ0M$default(touchSlopDetector2, 0L, 1, null);
                            longRef = longRef6;
                            touchSlopDetector = touchSlopDetector2;
                            f = f2;
                            i3 = 1;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                            pointerEventPass = null;
                        } else {
                            i5 = 1;
                            androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.getHighSpeedVideoSizes = function22;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.getHighResolutionOutputSizeshNQ4ISI = longRef6;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.Camera2StreamConfigurationMap = touchSlopDetector2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.getOutputFormats = pointerInputChange2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.getHighSpeedVideoFpsRanges = f2;
                            c = 2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.getHighSpeedVideoSizesFor = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13) != coroutine_suspended) {
                                function24 = function22;
                                pointerInputChange4 = pointerInputChange2;
                                longRef5 = longRef6;
                                touchSlopDetector = touchSlopDetector2;
                                f = f2;
                                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                                if (!pointerInputChange4.isConsumed()) {
                                }
                            }
                        }
                    }
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighSpeedVideoSizes = function22;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = longRef;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.Camera2StreamConfigurationMap = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getOutputFormats = pointerEventPass;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighSpeedVideoFpsRanges = f;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.getHighSpeedVideoSizesFor = i3;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i3, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.getHighSpeedVideoSizesFor;
        int i32 = 1;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass3 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01a0 -> B:11:0x01a6). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1457awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, int i, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
        int i2;
        float m1469pointerSlopE8SPZFQ;
        kotlin.jvm.internal.Ref.LongRef longRef;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function22;
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        float f;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector2;
        int size;
        int i3;
        float f2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        java.lang.Object awaitPointerEvent$default;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getInputFormats -= 2147483648;
                java.lang.Object obj = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getInputFormats;
                int i4 = 1;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Horizontal;
                    long m5768getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                    if (getHighSpeedVideoFpsRanges(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m1469pointerSlopE8SPZFQ = m1469pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                    longRef = new kotlin.jvm.internal.Ref.LongRef();
                    longRef.element = j;
                    function22 = function2;
                    touchSlopDetector = new androidx.compose.foundation.gestures.TouchSlopDetector(orientation, m5768getZeroF1C5BW0, null);
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor = function22;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.Camera2StreamConfigurationMap = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoSizes = longRef;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getInputSizeshNQ4ISI = pointerEventPass;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI = m1469pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getInputFormats = i4;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i4, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    float f3 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector3 = (androidx.compose.foundation.gestures.TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.internal.Ref.LongRef longRef2 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoSizes;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.Camera2StreamConfigurationMap;
                    kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function23 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    longRef = longRef2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                    touchSlopDetector2 = touchSlopDetector3;
                    function22 = function23;
                    f = f3;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    int i5 = 0;
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3++;
                        f = f2;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null) {
                        return null;
                    }
                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor = function22;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.Camera2StreamConfigurationMap = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoSizes = longRef;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getInputSizeshNQ4ISI = pointerEventPass;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI = m1469pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getInputFormats = i4;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i4, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f4 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = (androidx.compose.ui.input.pointer.PointerInputChange) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getInputSizeshNQ4ISI;
                androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector4 = (androidx.compose.foundation.gestures.TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Ref.LongRef longRef3 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoSizes;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.Camera2StreamConfigurationMap;
                kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function24 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                float f5 = f4;
                int i6 = 1;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                touchSlopDetector2 = touchSlopDetector4;
                char c = 2;
                kotlin.jvm.internal.Ref.LongRef longRef4 = longRef3;
                if (!pointerInputChange4.isConsumed()) {
                    return null;
                }
                i4 = i6;
                touchSlopDetector = touchSlopDetector2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                m1469pointerSlopE8SPZFQ = f5;
                function22 = function24;
                pointerEventPass = null;
                longRef = longRef4;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor = function22;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.Camera2StreamConfigurationMap = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoSizes = longRef;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges = touchSlopDetector;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getInputSizeshNQ4ISI = pointerEventPass;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI = m1469pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getInputFormats = i4;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i4, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                    touchSlopDetector2 = touchSlopDetector;
                    obj = awaitPointerEvent$default;
                    f = m1469pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    int i52 = 0;
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            f2 = f;
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes2.get(i3);
                        f2 = f;
                        if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                            break;
                        }
                        i3++;
                        f = f2;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        while (true) {
                            if (i52 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes3.get(i52);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i52++;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5 = pointerInputChange3;
                        if (pointerInputChange5 == null) {
                            return null;
                        }
                        longRef.element = pointerInputChange5.getId();
                        i4 = 1;
                        touchSlopDetector = touchSlopDetector2;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                        m1469pointerSlopE8SPZFQ = f2;
                        pointerEventPass = null;
                    } else {
                        long m1543addPositionsakrDWew = touchSlopDetector2.m1543addPositionsakrDWew(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition(), f2);
                        if ((9223372034707292159L & m1543addPositionsakrDWew) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                            function22.invoke(pointerInputChange2, kotlin.coroutines.jvm.internal.Boxing.boxFloat(java.lang.Float.intBitsToFloat((int) (m1543addPositionsakrDWew >> 32))));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            androidx.compose.foundation.gestures.TouchSlopDetector.m1542resetk4lQ0M$default(touchSlopDetector2, 0L, 1, null);
                            i4 = 1;
                            touchSlopDetector = touchSlopDetector2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                            m1469pointerSlopE8SPZFQ = f2;
                            pointerEventPass = null;
                        } else {
                            i6 = 1;
                            androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = function22;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.Camera2StreamConfigurationMap = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.getHighSpeedVideoSizes = longRef;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.getHighSpeedVideoFpsRanges = touchSlopDetector2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.getInputSizeshNQ4ISI = pointerInputChange2;
                            f5 = f2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = f5;
                            c = 2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.getInputFormats = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12) != coroutine_suspended) {
                                kotlin.jvm.internal.Ref.LongRef longRef5 = longRef;
                                function24 = function22;
                                pointerInputChange4 = pointerInputChange2;
                                longRef4 = longRef5;
                                if (!pointerInputChange4.isConsumed()) {
                                }
                            }
                        }
                    }
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor = function22;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.Camera2StreamConfigurationMap = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoSizes = longRef;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getInputSizeshNQ4ISI = pointerEventPass;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI = m1469pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getInputFormats = i4;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i4, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.getInputFormats;
        int i42 = 1;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass3 = null;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
    
        if (r0 == 0.0f) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0084 -> B:10:0x008a). Please report as a decompilation issue!!! */
    /* renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1468horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$1;
        int i;
        long j2;
        androidx.compose.foundation.gestures.Orientation orientation;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$12;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function12;
        androidx.compose.foundation.gestures.Orientation orientation2;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
        kotlin.jvm.internal.Ref.LongRef longRef;
        java.lang.Object awaitPointerEvent$default;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        float intBitsToFloat;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1) {
            dragGestureDetectorKt$horizontalDrag$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1) continuation;
            if ((dragGestureDetectorKt$horizontalDrag$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$horizontalDrag$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = dragGestureDetectorKt$horizontalDrag$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$horizontalDrag$1.getOutputMinFrameDuration;
                int i2 = 1;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.gestures.Orientation orientation3 = androidx.compose.foundation.gestures.Orientation.Horizontal;
                    j2 = j;
                    if (!getHighSpeedVideoFpsRanges(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        orientation = orientation3;
                        dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        function12 = function1;
                        kotlin.jvm.internal.Ref.LongRef longRef2 = new kotlin.jvm.internal.Ref.LongRef();
                        longRef2.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        orientation2 = orientation;
                        longRef = longRef2;
                        dragGestureDetectorKt$horizontalDrag$12.getHighResolutionOutputSizeshNQ4ISI = function12;
                        dragGestureDetectorKt$horizontalDrag$12.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope2;
                        dragGestureDetectorKt$horizontalDrag$12.Camera2StreamConfigurationMap = orientation2;
                        dragGestureDetectorKt$horizontalDrag$12.getHighSpeedVideoFpsRanges = awaitPointerEventScope3;
                        dragGestureDetectorKt$horizontalDrag$12.getHighSpeedVideoSizes = longRef;
                        dragGestureDetectorKt$horizontalDrag$12.getOutputMinFrameDuration = i2;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i2, pointerEventPass);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(pointerEventPass == null);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                longRef = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$horizontalDrag$1.getHighSpeedVideoSizes;
                awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.getHighSpeedVideoFpsRanges;
                orientation2 = (androidx.compose.foundation.gestures.Orientation) dragGestureDetectorKt$horizontalDrag$1.Camera2StreamConfigurationMap;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function13 = (kotlin.jvm.functions.Function1) dragGestureDetectorKt$horizontalDrag$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$13 = dragGestureDetectorKt$horizontalDrag$1;
                function12 = function13;
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i3);
                    awaitPointerEventScope4 = awaitPointerEventScope3;
                    if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                        break;
                    }
                    i3++;
                    awaitPointerEventScope3 = awaitPointerEventScope4;
                }
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange;
                if (pointerInputChange4 == null) {
                    if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                pointerInputChange2 = null;
                                break;
                            }
                            pointerInputChange2 = changes2.get(i4);
                            if (pointerInputChange2.getPressed()) {
                                break;
                            }
                            i4++;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5 = pointerInputChange2;
                        pointerInputChange3 = pointerInputChange4;
                        if (pointerInputChange5 != null) {
                            longRef.element = pointerInputChange5.getId();
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            awaitPointerEventScope2 = awaitPointerEventScope5;
                            dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$13;
                            i2 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$horizontalDrag$12.getHighResolutionOutputSizeshNQ4ISI = function12;
                            dragGestureDetectorKt$horizontalDrag$12.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope2;
                            dragGestureDetectorKt$horizontalDrag$12.Camera2StreamConfigurationMap = orientation2;
                            dragGestureDetectorKt$horizontalDrag$12.getHighSpeedVideoFpsRanges = awaitPointerEventScope3;
                            dragGestureDetectorKt$horizontalDrag$12.getHighSpeedVideoSizes = longRef;
                            dragGestureDetectorKt$horizontalDrag$12.getOutputMinFrameDuration = i2;
                            awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i2, pointerEventPass);
                            if (awaitPointerEvent$default == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$14 = dragGestureDetectorKt$horizontalDrag$12;
                            awaitPointerEventScope5 = awaitPointerEventScope2;
                            obj = awaitPointerEvent$default;
                            dragGestureDetectorKt$horizontalDrag$13 = dragGestureDetectorKt$horizontalDrag$14;
                        }
                    } else {
                        long positionChangeIgnoreConsumed = androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange4);
                        if (orientation2 == null) {
                            intBitsToFloat = androidx.compose.ui.geometry.Offset.m5750getDistanceimpl(positionChangeIgnoreConsumed);
                        } else {
                            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (orientation2 == androidx.compose.foundation.gestures.Orientation.Vertical ? positionChangeIgnoreConsumed & 4294967295L : positionChangeIgnoreConsumed >> 32));
                        }
                        pointerInputChange3 = pointerInputChange4;
                    }
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                    int size3 = changes3.size();
                    int i32 = 0;
                    while (true) {
                        if (i32 < size3) {
                        }
                        i32++;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange42 = pointerInputChange;
                    if (pointerInputChange42 == null) {
                        pointerInputChange3 = 0;
                    }
                }
                if (pointerInputChange3 == 0 || pointerInputChange3.isConsumed()) {
                    pointerEventPass = null;
                } else if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                    pointerEventPass = pointerInputChange3;
                } else {
                    function12.invoke(pointerInputChange3);
                    awaitPointerEventScope2 = awaitPointerEventScope5;
                    dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$13;
                    i2 = 1;
                    pointerEventPass = null;
                    orientation = orientation2;
                    j2 = pointerInputChange3.getId();
                    kotlin.jvm.internal.Ref.LongRef longRef22 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef22.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    orientation2 = orientation;
                    longRef = longRef22;
                    dragGestureDetectorKt$horizontalDrag$12.getHighResolutionOutputSizeshNQ4ISI = function12;
                    dragGestureDetectorKt$horizontalDrag$12.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope2;
                    dragGestureDetectorKt$horizontalDrag$12.Camera2StreamConfigurationMap = orientation2;
                    dragGestureDetectorKt$horizontalDrag$12.getHighSpeedVideoFpsRanges = awaitPointerEventScope3;
                    dragGestureDetectorKt$horizontalDrag$12.getHighSpeedVideoSizes = longRef;
                    dragGestureDetectorKt$horizontalDrag$12.getOutputMinFrameDuration = i2;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i2, pointerEventPass);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(pointerEventPass == null);
            }
        }
        dragGestureDetectorKt$horizontalDrag$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$horizontalDrag$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$horizontalDrag$1.getOutputMinFrameDuration;
        int i22 = 1;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00da, code lost:
    
        if (java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11) >> 32)) == 0.0f) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0068 -> B:10:0x006d). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1456awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;
        int i;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        java.lang.Object awaitPointerEvent$default;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.Ref.LongRef longRef2 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.Camera2StreamConfigurationMap;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.LongRef longRef3 = longRef2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i3);
                        if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                            break;
                        }
                        i3++;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            while (true) {
                                if (i2 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(i2);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                i2++;
                            }
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                longRef3.element = pointerInputChange4.getId();
                                longRef = longRef3;
                            }
                        }
                        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.Camera2StreamConfigurationMap = longRef;
                        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.getHighSpeedVideoFpsRangesFor = 1;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kotlin.jvm.internal.Ref.LongRef longRef4 = longRef;
                        obj = awaitPointerEvent$default;
                        longRef3 = longRef4;
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i22 = 0;
                        int i32 = 0;
                        while (true) {
                            if (i32 < size3) {
                            }
                            i32++;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                    if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                        return null;
                    }
                    return pointerInputChange32;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (getHighSpeedVideoFpsRanges(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new kotlin.jvm.internal.Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.Camera2StreamConfigurationMap = longRef;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.getHighSpeedVideoFpsRangesFor = 1;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
        }
    }

    public static /* synthetic */ java.lang.Object detectHorizontalDragGestures$default(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit outputFormats;
                    outputFormats = androidx.compose.foundation.gestures.DragGestureDetectorKt.getOutputFormats();
                    return outputFormats;
                }
            };
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit outputSizes;
                    outputSizes = androidx.compose.foundation.gestures.DragGestureDetectorKt.getOutputSizes();
                    return outputSizes;
                }
            };
        }
        kotlin.jvm.functions.Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit outputStallDuration;
                    outputStallDuration = androidx.compose.foundation.gestures.DragGestureDetectorKt.getOutputStallDuration();
                    return outputStallDuration;
                }
            };
        }
        return detectHorizontalDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getOutputFormats() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getOutputSizes() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getOutputStallDuration() {
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object detectHorizontalDragGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5(function1, function2, function0, function02, null), continuation);
        return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x011d, code lost:
    
        if (r0 == 0.0f) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008e -> B:10:0x0094). Please report as a decompilation issue!!! */
    /* renamed from: drag-VnAYq1g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1466dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function1, androidx.compose.foundation.gestures.Orientation orientation, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function12, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2 dragGestureDetectorKt$drag$2;
        int i;
        long j2;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        androidx.compose.foundation.gestures.Orientation orientation2;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function13;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2 dragGestureDetectorKt$drag$22;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function14;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
        java.lang.Object awaitPointerEvent$default;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        float intBitsToFloat;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        int i2;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2) {
            dragGestureDetectorKt$drag$2 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2) continuation;
            if ((dragGestureDetectorKt$drag$2.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$2.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = dragGestureDetectorKt$drag$2.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$drag$2.getInputSizeshNQ4ISI;
                int i3 = 1;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    j2 = j;
                    if (getHighSpeedVideoFpsRanges(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        return null;
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    orientation2 = orientation;
                    function13 = function12;
                    dragGestureDetectorKt$drag$22 = dragGestureDetectorKt$drag$2;
                    function14 = function1;
                    longRef = new kotlin.jvm.internal.Ref.LongRef();
                    longRef.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.getHighResolutionOutputSizeshNQ4ISI = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.getHighSpeedVideoSizes = function14;
                    dragGestureDetectorKt$drag$22.getHighSpeedVideoFpsRanges = orientation2;
                    dragGestureDetectorKt$drag$22.getHighSpeedVideoFpsRangesFor = function13;
                    dragGestureDetectorKt$drag$22.Camera2StreamConfigurationMap = awaitPointerEventScope3;
                    dragGestureDetectorKt$drag$22.getInputFormats = longRef;
                    dragGestureDetectorKt$drag$22.getInputSizeshNQ4ISI = i3;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$drag$22, i3, pointerEventPass);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.Ref.LongRef longRef2 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$drag$2.getInputFormats;
                    awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$drag$2.Camera2StreamConfigurationMap;
                    kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function15 = (kotlin.jvm.functions.Function1) dragGestureDetectorKt$drag$2.getHighSpeedVideoFpsRangesFor;
                    androidx.compose.foundation.gestures.Orientation orientation3 = (androidx.compose.foundation.gestures.Orientation) dragGestureDetectorKt$drag$2.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function16 = (kotlin.jvm.functions.Function1) dragGestureDetectorKt$drag$2.getHighSpeedVideoSizes;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$drag$2.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$drag$22 = dragGestureDetectorKt$drag$2;
                    function14 = function16;
                    kotlin.jvm.internal.Ref.LongRef longRef3 = longRef2;
                    orientation2 = orientation3;
                    function13 = function15;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i4);
                        i2 = i4;
                        if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                            break;
                        }
                        i4 = i2 + 1;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            long positionChangeIgnoreConsumed = androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange3);
                            if (orientation2 == null) {
                                intBitsToFloat = androidx.compose.ui.geometry.Offset.m5750getDistanceimpl(positionChangeIgnoreConsumed);
                            } else if (orientation2 == androidx.compose.foundation.gestures.Orientation.Vertical) {
                                intBitsToFloat = java.lang.Float.intBitsToFloat((int) (positionChangeIgnoreConsumed & 4294967295L));
                            } else {
                                intBitsToFloat = java.lang.Float.intBitsToFloat((int) (positionChangeIgnoreConsumed >> 32));
                            }
                        } else {
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(i5);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                i5++;
                            }
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                longRef3.element = pointerInputChange4.getId();
                                awaitPointerEventScope2 = awaitPointerEventScope4;
                                i3 = 1;
                                pointerEventPass = null;
                                longRef = longRef3;
                                dragGestureDetectorKt$drag$22.getHighResolutionOutputSizeshNQ4ISI = awaitPointerEventScope2;
                                dragGestureDetectorKt$drag$22.getHighSpeedVideoSizes = function14;
                                dragGestureDetectorKt$drag$22.getHighSpeedVideoFpsRanges = orientation2;
                                dragGestureDetectorKt$drag$22.getHighSpeedVideoFpsRangesFor = function13;
                                dragGestureDetectorKt$drag$22.Camera2StreamConfigurationMap = awaitPointerEventScope3;
                                dragGestureDetectorKt$drag$22.getInputFormats = longRef;
                                dragGestureDetectorKt$drag$22.getInputSizeshNQ4ISI = i3;
                                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$drag$22, i3, pointerEventPass);
                                if (awaitPointerEvent$default == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                kotlin.jvm.internal.Ref.LongRef longRef4 = longRef;
                                awaitPointerEventScope4 = awaitPointerEventScope2;
                                obj = awaitPointerEvent$default;
                                longRef3 = longRef4;
                            }
                        }
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i42 = 0;
                        while (true) {
                            if (i42 < size3) {
                            }
                            i42 = i2 + 1;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                    if (pointerInputChange32 == null || function13.invoke(pointerInputChange32).booleanValue()) {
                        return null;
                    }
                    if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange32)) {
                        return pointerInputChange32;
                    }
                    function14.invoke(pointerInputChange32);
                    j2 = pointerInputChange32.getId();
                    pointerEventPass = null;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    i3 = 1;
                    longRef = new kotlin.jvm.internal.Ref.LongRef();
                    longRef.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.getHighResolutionOutputSizeshNQ4ISI = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.getHighSpeedVideoSizes = function14;
                    dragGestureDetectorKt$drag$22.getHighSpeedVideoFpsRanges = orientation2;
                    dragGestureDetectorKt$drag$22.getHighSpeedVideoFpsRangesFor = function13;
                    dragGestureDetectorKt$drag$22.Camera2StreamConfigurationMap = awaitPointerEventScope3;
                    dragGestureDetectorKt$drag$22.getInputFormats = longRef;
                    dragGestureDetectorKt$drag$22.getInputSizeshNQ4ISI = i3;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$drag$22, i3, pointerEventPass);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                }
            }
        }
        dragGestureDetectorKt$drag$2 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$drag$2.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$drag$2.getInputSizeshNQ4ISI;
        int i32 = 1;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0176, code lost:
    
        if (r11.awaitPointerEvent(r2, r3) == r4) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0176 -> B:11:0x0179). Please report as a decompilation issue!!! */
    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1460awaitPointerSlopOrCancellation6ksA65w(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, int i, androidx.compose.foundation.gestures.Orientation orientation, long j2, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
        int i2;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function22;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
        float f;
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function23;
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector2;
        float f2;
        int size;
        int i3;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        int i4;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        int i5;
        java.lang.Object awaitPointerEvent$default;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getHighSpeedVideoSizesFor;
                int i6 = 1;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (getHighSpeedVideoFpsRanges(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    float m1469pointerSlopE8SPZFQ = m1469pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                    kotlin.jvm.internal.Ref.LongRef longRef2 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef2.element = j;
                    function22 = function2;
                    longRef = longRef2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    f = m1469pointerSlopE8SPZFQ;
                    touchSlopDetector = new androidx.compose.foundation.gestures.TouchSlopDetector(orientation, j2, null);
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighSpeedVideoFpsRanges = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.Camera2StreamConfigurationMap = longRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighSpeedVideoSizes = touchSlopDetector;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getInputSizeshNQ4ISI = null;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = f;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighSpeedVideoSizesFor = i6;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i6, null);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    f2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                    androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector3 = (androidx.compose.foundation.gestures.TouchSlopDetector) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getHighSpeedVideoSizes;
                    kotlin.jvm.internal.Ref.LongRef longRef3 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.Camera2StreamConfigurationMap;
                    kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function24 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope3 = awaitPointerEventScope4;
                    function23 = function24;
                    longRef = longRef3;
                    touchSlopDetector2 = touchSlopDetector3;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3 = i5 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null) {
                        return null;
                    }
                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    f = f2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    i6 = i4;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighSpeedVideoFpsRanges = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.Camera2StreamConfigurationMap = longRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighSpeedVideoSizes = touchSlopDetector;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getInputSizeshNQ4ISI = null;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = f;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighSpeedVideoSizesFor = i6;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i6, null);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getInputSizeshNQ4ISI;
                touchSlopDetector2 = (androidx.compose.foundation.gestures.TouchSlopDetector) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getHighSpeedVideoSizes;
                longRef = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.Camera2StreamConfigurationMap;
                function23 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                char c = 2;
                i4 = 1;
                if (pointerInputChange2.isConsumed()) {
                    return null;
                }
                touchSlopDetector = touchSlopDetector2;
                function22 = function23;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                f = f2;
                awaitPointerEventScope2 = awaitPointerEventScope3;
                i6 = i4;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighSpeedVideoFpsRanges = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = function22;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.Camera2StreamConfigurationMap = longRef;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighSpeedVideoSizes = touchSlopDetector;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getInputSizeshNQ4ISI = null;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = f;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighSpeedVideoSizesFor = i6;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i6, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    f2 = f;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
                    touchSlopDetector2 = touchSlopDetector;
                    obj = awaitPointerEvent$default;
                    function23 = function22;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes2.get(i3);
                        i5 = i3;
                        if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                            break;
                        }
                        i3 = i5 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes3.get(i7);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i7++;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange3;
                        if (pointerInputChange4 == null) {
                            return null;
                        }
                        longRef.element = pointerInputChange4.getId();
                        i4 = 1;
                        touchSlopDetector = touchSlopDetector2;
                        function22 = function23;
                        c = 2;
                    } else {
                        long m1543addPositionsakrDWew = touchSlopDetector2.m1543addPositionsakrDWew(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition(), f2);
                        if ((9223372034707292159L & m1543addPositionsakrDWew) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                            function23.invoke(pointerInputChange2, androidx.compose.ui.geometry.Offset.m5741boximpl(m1543addPositionsakrDWew));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            i4 = 1;
                            androidx.compose.foundation.gestures.TouchSlopDetector.m1542resetk4lQ0M$default(touchSlopDetector2, 0L, 1, null);
                            touchSlopDetector = touchSlopDetector2;
                            function22 = function23;
                            c = 2;
                        } else {
                            i4 = 1;
                            androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges = awaitPointerEventScope3;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI = function23;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.Camera2StreamConfigurationMap = longRef;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getHighSpeedVideoSizes = touchSlopDetector2;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getInputSizeshNQ4ISI = pointerInputChange2;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor = f2;
                            c = 2;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getHighSpeedVideoSizesFor = 2;
                        }
                    }
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    f = f2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    i6 = i4;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighSpeedVideoFpsRanges = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.Camera2StreamConfigurationMap = longRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighSpeedVideoSizes = touchSlopDetector;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getInputSizeshNQ4ISI = null;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = f;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.getHighSpeedVideoSizesFor = i6;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i6, null);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.getHighSpeedVideoSizesFor;
        int i62 = 1;
        if (i2 != 0) {
        }
    }

    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m1461awaitPointerSlopOrCancellation6ksA65w$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, int i, androidx.compose.foundation.gestures.Orientation orientation, long j2, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        long m5768getZeroF1C5BW0 = (i2 & 8) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0() : j2;
        long j3 = j;
        if (getHighSpeedVideoFpsRanges(awaitPointerEventScope.getCurrentEvent(), j3)) {
            return null;
        }
        float m1469pointerSlopE8SPZFQ = m1469pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector = new androidx.compose.foundation.gestures.TouchSlopDetector(orientation, m5768getZeroF1C5BW0, null);
        while (true) {
            androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i4);
                if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange.getId(), j3)) {
                    break;
                }
                i4++;
            }
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i3 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i3);
                    if (pointerInputChange2.getPressed()) {
                        break;
                    }
                    i3++;
                }
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                j3 = pointerInputChange4.getId();
            } else {
                long m1543addPositionsakrDWew = touchSlopDetector.m1543addPositionsakrDWew(pointerInputChange3.getPosition(), pointerInputChange3.getPreviousPosition(), m1469pointerSlopE8SPZFQ);
                if ((9223372034707292159L & m1543addPositionsakrDWew) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                    function2.invoke(pointerInputChange3, androidx.compose.ui.geometry.Offset.m5741boximpl(m1543addPositionsakrDWew));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    androidx.compose.foundation.gestures.TouchSlopDetector.m1542resetk4lQ0M$default(touchSlopDetector, 0L, 1, null);
                } else {
                    awaitPointerEventScope.awaitPointerEvent(androidx.compose.ui.input.pointer.PointerEventPass.Final, continuation);
                    if (pointerInputChange3.isConsumed()) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009e -> B:10:0x00a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitAllPointersUpWithSlopDetection(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
        int i;
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector;
        kotlin.jvm.internal.Ref.LongRef longRef;
        float f;
        int i2;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2;
        java.lang.Object awaitPointerEvent;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        int size;
        int i3;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1) {
            dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1) continuation;
            if ((dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.getOutputMinFrameDuration;
                int i4 = 0;
                int i5 = 1;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f2 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.getHighSpeedVideoSizes;
                    int i6 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.getHighSpeedVideoFpsRangesFor;
                    androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector2 = (androidx.compose.foundation.gestures.TouchSlopDetector) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.getHighSpeedVideoSizesFor;
                    longRef = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.Camera2StreamConfigurationMap;
                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass3 = (androidx.compose.ui.input.pointer.PointerEventPass) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.getHighSpeedVideoFpsRanges;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
                    pointerEventPass2 = pointerEventPass3;
                    androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector3 = touchSlopDetector2;
                    i2 = i6;
                    f = f2;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    int size2 = changes.size();
                    int i7 = i4;
                    while (true) {
                        if (i7 < size2) {
                            pointerInputChange2 = null;
                            break;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5 = changes.get(i7);
                        if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange5.getId(), longRef.element)) {
                            pointerInputChange2 = pointerInputChange5;
                            break;
                        }
                        i7++;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange6 = pointerInputChange2;
                    if (pointerInputChange6 != null || androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange6)) {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                        size = changes2.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                pointerInputChange3 = null;
                                break;
                            }
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange7 = changes2.get(i3);
                            if (pointerInputChange7.getPressed()) {
                                pointerInputChange3 = pointerInputChange7;
                                break;
                            }
                            i3++;
                        }
                        pointerInputChange4 = pointerInputChange3;
                        if (pointerInputChange4 != null) {
                            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(i2 != 0);
                        }
                        longRef.element = pointerInputChange4.getId();
                    } else if ((touchSlopDetector3.m1543addPositionsakrDWew(pointerInputChange6.getPosition(), pointerInputChange6.getPreviousPosition(), f) & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                        i2 = 1;
                    }
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent.getChanges();
                    int size3 = changes3.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        if (changes3.get(i8).getPressed()) {
                            touchSlopDetector = touchSlopDetector3;
                            awaitPointerEventScope2 = awaitPointerEventScope3;
                            i4 = 0;
                            i5 = 1;
                            dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.getHighResolutionOutputSizeshNQ4ISI = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.getHighSpeedVideoFpsRanges = pointerEventPass2;
                            dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.Camera2StreamConfigurationMap = longRef;
                            dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.getHighSpeedVideoSizesFor = touchSlopDetector;
                            dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.getHighSpeedVideoFpsRangesFor = i2;
                            dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.getHighSpeedVideoSizes = f;
                            dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.getOutputMinFrameDuration = i5;
                            awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12);
                            if (awaitPointerEvent != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            awaitPointerEventScope3 = awaitPointerEventScope2;
                            obj = awaitPointerEvent;
                            touchSlopDetector3 = touchSlopDetector;
                            androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes4 = pointerEvent2.getChanges();
                            int size22 = changes4.size();
                            int i72 = i4;
                            while (true) {
                                if (i72 < size22) {
                                }
                                i72++;
                            }
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange62 = pointerInputChange2;
                            if (pointerInputChange62 != null) {
                            }
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes22 = pointerEvent2.getChanges();
                            size = changes22.size();
                            i3 = 0;
                            while (true) {
                                if (i3 < size) {
                                }
                                i3++;
                            }
                            pointerInputChange4 = pointerInputChange3;
                            if (pointerInputChange4 != null) {
                            }
                        }
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(i2 != 0);
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (androidx.compose.foundation.gestures.ForEachGestureKt.allPointersUp(awaitPointerEventScope)) {
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                }
                kotlin.jvm.internal.Ref.LongRef longRef2 = new kotlin.jvm.internal.Ref.LongRef();
                longRef2.element = pointerInputChange.getId();
                float m1469pointerSlopE8SPZFQ = m1469pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), pointerInputChange.getType());
                touchSlopDetector = new androidx.compose.foundation.gestures.TouchSlopDetector(null, 0L, 3, null);
                longRef = longRef2;
                f = m1469pointerSlopE8SPZFQ;
                i2 = 0;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
                pointerEventPass2 = pointerEventPass;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.getHighResolutionOutputSizeshNQ4ISI = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.getHighSpeedVideoFpsRanges = pointerEventPass2;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.Camera2StreamConfigurationMap = longRef;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.getHighSpeedVideoSizesFor = touchSlopDetector;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.getHighSpeedVideoFpsRangesFor = i2;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.getHighSpeedVideoSizes = f;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.getOutputMinFrameDuration = i5;
                awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12);
                if (awaitPointerEvent != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.getOutputMinFrameDuration;
        int i42 = 0;
        int i52 = 1;
        if (i == 0) {
        }
    }

    public static /* synthetic */ java.lang.Object awaitAllPointersUpWithSlopDetection$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Main;
        }
        return awaitAllPointersUpWithSlopDetection(awaitPointerEventScope, pointerInputChange, pointerEventPass, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af A[Catch: PointerEventTimeoutCancellationException -> 0x00b8, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00b8, blocks: (B:11:0x0033, B:12:0x00ab, B:14:0x00af, B:36:0x008f), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1459awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        int i;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        try {
            if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) continuation;
                if ((dragGestureDetectorKt$awaitLongPressOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    dragGestureDetectorKt$awaitLongPressOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = dragGestureDetectorKt$awaitLongPressOrCancellation$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (getHighSpeedVideoFpsRanges(awaitPointerEventScope.getCurrentEvent(), j)) {
                            return null;
                        }
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                        int size = changes.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes.get(i2);
                            if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange.getId(), j)) {
                                break;
                            }
                            i2++;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = pointerInputChange;
                        if (pointerInputChange3 == 0) {
                            return null;
                        }
                        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                        kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                        objectRef2.element = pointerInputChange3;
                        long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                        kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
                        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2(booleanRef2, objectRef2, objectRef, null);
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.getHighSpeedVideoSizes = pointerInputChange3;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.Camera2StreamConfigurationMap = objectRef;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.getHighSpeedVideoFpsRangesFor = booleanRef2;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (awaitPointerEventScope.withTimeout(longPressTimeoutMillis, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        booleanRef = booleanRef2;
                        j = objectRef;
                        pointerInputChange2 = pointerInputChange3;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.jvm.internal.Ref.ObjectRef objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.Camera2StreamConfigurationMap;
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = (androidx.compose.ui.input.pointer.PointerInputChange) dragGestureDetectorKt$awaitLongPressOrCancellation$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        j = objectRef3;
                        pointerInputChange2 = pointerInputChange4;
                    }
                    if (booleanRef.element) {
                        return null;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5 = (androidx.compose.ui.input.pointer.PointerInputChange) j.element;
                    return pointerInputChange5 == null ? pointerInputChange2 : pointerInputChange5;
                }
            }
            if (i != 0) {
            }
            if (booleanRef.element) {
            }
        } catch (androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException unused) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange6 = (androidx.compose.ui.input.pointer.PointerInputChange) j.element;
            return pointerInputChange6 != null ? pointerInputChange6 : pointerInputChange2;
        }
        dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRanges(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, long j) {
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i);
            if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange.getId(), j)) {
                break;
            }
            i++;
        }
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m1469pointerSlopE8SPZFQ(androidx.compose.ui.platform.ViewConfiguration viewConfiguration, int i) {
        return androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(i, androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7304getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * getHighResolutionOutputSizeshNQ4ISI : viewConfiguration.getTouchSlop();
    }

    static {
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.125f);
        getHighSpeedVideoFpsRanges = m8601constructorimpl;
        float m8601constructorimpl2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(18.0f);
        Camera2StreamConfigurationMap = m8601constructorimpl2;
        getHighResolutionOutputSizeshNQ4ISI = m8601constructorimpl / m8601constructorimpl2;
    }
}
