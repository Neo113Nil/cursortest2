package androidx.compose.foundation.gestures;

/* compiled from: DragGestureDetector.kt */
@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0015\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u0017H\u0082Hø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001b\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0014\u001aa\u0010\u001d\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f26\u0010 \u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\r¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0!H\u0080@ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aY\u0010)\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u001226\u0010*\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\r¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0!H\u0086@ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a!\u0010-\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b.\u0010\u0014\u001aK\u0010/\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u00012\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020&0!H\u0080Hø\u0001\u0000¢\u0006\u0004\b2\u00103\u001aY\u00104\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u001226\u0010*\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0!H\u0086@ø\u0001\u0000¢\u0006\u0004\b5\u0010,\u001a!\u00106\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b7\u0010\u0014\u001aa\u00108\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f26\u0010*\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\r¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0!H\u0080@ø\u0001\u0000¢\u0006\u0004\b9\u0010(\u001aY\u0010:\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u001226\u0010*\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\r¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0!H\u0086@ø\u0001\u0000¢\u0006\u0004\b;\u0010,\u001a\u0080\u0001\u0010<\u001a\u00020&*\u00020=2\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020&0\u00172\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020&0@2\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020&0@26\u0010B\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020&0!H\u0086@¢\u0006\u0002\u0010D\u001a\u0080\u0001\u0010E\u001a\u00020&*\u00020=2\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020&0\u00172\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020&0@2\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020&0@26\u0010B\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020&0!H\u0086@¢\u0006\u0002\u0010D\u001a\u0080\u0001\u0010F\u001a\u00020&*\u00020=2\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020&0\u00172\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020&0@2\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020&0@26\u0010G\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\r¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020&0!H\u0086@¢\u0006\u0002\u0010D\u001a\u0080\u0001\u0010H\u001a\u00020&*\u00020=2\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020&0\u00172\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020&0@2\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020&0@26\u0010I\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\r¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020&0!H\u0086@¢\u0006\u0002\u0010D\u001a3\u0010J\u001a\u00020\u0018*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020&0\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\bK\u0010\u001a\u001a]\u0010J\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020&0\u00172\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u0017H\u0080Hø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a3\u0010O\u001a\u00020\u0018*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020&0\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\bP\u0010\u001a\u001a\u001e\u0010Q\u001a\u00020\u0018*\u00020R2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001a\u001e\u0010U\u001a\u00020\r*\u00020V2\u0006\u0010\u001e\u001a\u00020\u001fH\u0000ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a\f\u0010Y\u001a\u00020\u0001*\u00020ZH\u0000\u001a3\u0010[\u001a\u00020\u0018*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020&0\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\\\u0010\u001a\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n\"\u0010\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n\"\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006]"}, d2 = {"BidirectionalPointerDirectionConfig", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "getBidirectionalPointerDirectionConfig", "()Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "HorizontalPointerDirectionConfig", "getHorizontalPointerDirectionConfig", "VerticalPointerDirectionConfig", "getVerticalPointerDirectionConfig", "defaultTouchSlop", "Landroidx/compose/ui/unit/Dp;", "F", "mouseSlop", "mouseToTouchSlopRatio", "", "awaitDragOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrUp", "hasDragged", "Lkotlin/Function1;", "", "awaitDragOrUp-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalDragOrCancellation", "awaitHorizontalDragOrCancellation-rnUCldI", "awaitHorizontalPointerSlopOrCancellation", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "onPointerSlopReached", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "change", "overSlop", "", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalTouchSlopOrCancellation", "onTouchSlopReached", "awaitHorizontalTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitLongPressOrCancellation", "awaitLongPressOrCancellation-rnUCldI", "awaitPointerSlopOrCancellation", "pointerDirectionConfig", "Landroidx/compose/ui/geometry/Offset;", "awaitPointerSlopOrCancellation-pn7EDYM", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILandroidx/compose/foundation/gestures/PointerDirectionConfig;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitTouchSlopOrCancellation", "awaitTouchSlopOrCancellation-jO51t88", "awaitVerticalDragOrCancellation", "awaitVerticalDragOrCancellation-rnUCldI", "awaitVerticalPointerSlopOrCancellation", "awaitVerticalPointerSlopOrCancellation-gDDlDlE", "awaitVerticalTouchSlopOrCancellation", "awaitVerticalTouchSlopOrCancellation-jO51t88", "detectDragGestures", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "onDragEnd", "Lkotlin/Function0;", "onDragCancel", "onDrag", "dragAmount", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "detectHorizontalDragGestures", "onHorizontalDrag", "detectVerticalDragGestures", "onVerticalDrag", "drag", "drag-jO51t88", "motionConsumed", "drag-VnAYq1g", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "horizontalDrag", "horizontalDrag-jO51t88", "isPointerUp", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "pointerSlop", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "toPointerDirectionConfig", "Landroidx/compose/foundation/gestures/Orientation;", "verticalDrag", "verticalDrag-jO51t88", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;
    private static final androidx.compose.foundation.gestures.PointerDirectionConfig HorizontalPointerDirectionConfig = new androidx.compose.foundation.gestures.PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$HorizontalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculateDeltaChange-k-4lQ0M */
        public float mo355calculateDeltaChangek4lQ0M(long offset) {
            return java.lang.Math.abs(androidx.compose.ui.geometry.Offset.m1871getXimpl(offset));
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculatePostSlopOffset-8S9VItk */
        public long mo356calculatePostSlopOffset8S9VItk(long totalPositionChange, float touchSlop) {
            return androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Offset.m1871getXimpl(totalPositionChange) - (java.lang.Math.signum(androidx.compose.ui.geometry.Offset.m1871getXimpl(totalPositionChange)) * touchSlop), androidx.compose.ui.geometry.Offset.m1872getYimpl(totalPositionChange));
        }
    };
    private static final androidx.compose.foundation.gestures.PointerDirectionConfig VerticalPointerDirectionConfig = new androidx.compose.foundation.gestures.PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$VerticalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculateDeltaChange-k-4lQ0M */
        public float mo355calculateDeltaChangek4lQ0M(long offset) {
            return java.lang.Math.abs(androidx.compose.ui.geometry.Offset.m1872getYimpl(offset));
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculatePostSlopOffset-8S9VItk */
        public long mo356calculatePostSlopOffset8S9VItk(long totalPositionChange, float touchSlop) {
            return androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Offset.m1871getXimpl(totalPositionChange), androidx.compose.ui.geometry.Offset.m1872getYimpl(totalPositionChange) - (java.lang.Math.signum(androidx.compose.ui.geometry.Offset.m1872getYimpl(totalPositionChange)) * touchSlop));
        }
    };
    private static final androidx.compose.foundation.gestures.PointerDirectionConfig BidirectionalPointerDirectionConfig = new androidx.compose.foundation.gestures.PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$BidirectionalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculateDeltaChange-k-4lQ0M, reason: not valid java name */
        public float mo355calculateDeltaChangek4lQ0M(long offset) {
            return androidx.compose.ui.geometry.Offset.m1869getDistanceimpl(offset);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculatePostSlopOffset-8S9VItk, reason: not valid java name */
        public long mo356calculatePostSlopOffset8S9VItk(long totalPositionChange, float touchSlop) {
            return androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(totalPositionChange, androidx.compose.ui.geometry.Offset.m1878timestuRUvjQ(androidx.compose.ui.geometry.Offset.m1866divtuRUvjQ(totalPositionChange, mo355calculateDeltaChangek4lQ0M(totalPositionChange)), touchSlop));
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:15:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0139 -> B:18:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x017d -> B:11:0x0184). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01a6 -> B:17:0x018d). Please report as a decompilation issue!!! */
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m344awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
        int i;
        androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig;
        kotlin.jvm.internal.Ref.LongRef longRef;
        float f;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
        long m1887getZeroF1C5BW0;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function22;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig2;
        long j2;
        int size;
        int i2;
        long j3;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        int i3;
        java.lang.Object awaitPointerEvent$default;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
                int i4 = 1;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i == 0) {
                    if (i == 1) {
                        long j4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.J$0;
                        f = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
                        kotlin.jvm.internal.Ref.LongRef longRef3 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
                        pointerDirectionConfig2 = (androidx.compose.foundation.gestures.PointerDirectionConfig) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
                        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function23 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        longRef2 = longRef3;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        j2 = j4;
                        function22 = function23;
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        int i5 = 0;
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                            }
                            i2 = i3 + 1;
                            j2 = j3;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null) {
                            if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                        }
                        return null;
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j5 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.J$0;
                    f = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
                    pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4;
                    kotlin.jvm.internal.Ref.LongRef longRef4 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
                    androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig3 = (androidx.compose.foundation.gestures.PointerDirectionConfig) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
                    kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function24 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                    m1887getZeroF1C5BW0 = j5;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    function22 = function24;
                    longRef = longRef4;
                    pointerDirectionConfig = pointerDirectionConfig3;
                    if (!pointerInputChange2.isConsumed()) {
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                        i4 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = longRef;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i4, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        long j6 = m1887getZeroF1C5BW0;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
                        obj = awaitPointerEvent$default;
                        longRef2 = longRef;
                        pointerDirectionConfig2 = pointerDirectionConfig;
                        j2 = j6;
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                        size = changes2.size();
                        int i52 = 0;
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                j3 = j2;
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes2.get(i2);
                            j3 = j2;
                            i3 = i2;
                            if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                                break;
                            }
                            i2 = i3 + 1;
                            j2 = j3;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
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
                                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange3;
                                if (pointerInputChange4 != null) {
                                    longRef2.element = pointerInputChange4.getId();
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                                    pointerDirectionConfig = pointerDirectionConfig2;
                                    longRef = longRef2;
                                    i4 = 1;
                                    pointerEventPass = null;
                                    m1887getZeroF1C5BW0 = j3;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = longRef;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
                                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i4, pointerEventPass);
                                    if (awaitPointerEvent$default != coroutine_suspended) {
                                    }
                                }
                            } else {
                                long m1876plusMKHz9U = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(j3, androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition()));
                                if (pointerDirectionConfig2.mo355calculateDeltaChangek4lQ0M(m1876plusMKHz9U) < f) {
                                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0 = function22;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1 = pointerDirectionConfig2;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3 = longRef2;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4 = pointerInputChange2;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0 = f;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.J$0 = m1876plusMKHz9U;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitTouchSlopOrCancellation$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pointerDirectionConfig = pointerDirectionConfig2;
                                    longRef = longRef2;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                                    m1887getZeroF1C5BW0 = m1876plusMKHz9U;
                                    if (!pointerInputChange2.isConsumed()) {
                                    }
                                } else {
                                    function22.invoke(pointerInputChange2, androidx.compose.ui.geometry.Offset.m1860boximpl(pointerDirectionConfig2.mo356calculatePostSlopOffset8S9VItk(m1876plusMKHz9U, f)));
                                    if (pointerInputChange2.isConsumed()) {
                                        return pointerInputChange2;
                                    }
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                                    m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                                    pointerDirectionConfig = pointerDirectionConfig2;
                                    longRef = longRef2;
                                    i4 = 1;
                                    pointerEventPass = null;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = longRef;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
                                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i4, pointerEventPass);
                                    if (awaitPointerEvent$default != coroutine_suspended) {
                                    }
                                }
                            }
                        }
                    }
                    return null;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                int m3355getTouchT8wyACA = androidx.compose.ui.input.pointer.PointerType.INSTANCE.m3355getTouchT8wyACA();
                androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig4 = BidirectionalPointerDirectionConfig;
                if (m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m353pointerSlopE8SPZFQ = m353pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m3355getTouchT8wyACA);
                kotlin.jvm.internal.Ref.LongRef longRef5 = new kotlin.jvm.internal.Ref.LongRef();
                longRef5.element = j;
                pointerDirectionConfig = pointerDirectionConfig4;
                longRef = longRef5;
                f = m353pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = longRef;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i4, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
        int i42 = 1;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass3 = null;
        if (i == 0) {
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
    public static final java.lang.Object m350dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 dragGestureDetectorKt$drag$1;
        int i;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) {
            dragGestureDetectorKt$drag$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) continuation;
            if ((dragGestureDetectorKt$drag$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = dragGestureDetectorKt$drag$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$drag$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$drag$1.L$0 = awaitPointerEventScope;
                    dragGestureDetectorKt$drag$1.L$1 = function1;
                    dragGestureDetectorKt$drag$1.label = 1;
                    obj = m336awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
                    if (obj == coroutine_suspended) {
                    }
                    pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    if (pointerInputChange == null) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function12 = (kotlin.jvm.functions.Function1) dragGestureDetectorKt$drag$1.L$1;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$drag$1.L$0;
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
                        dragGestureDetectorKt$drag$1.L$0 = awaitPointerEventScope;
                        dragGestureDetectorKt$drag$1.L$1 = function1;
                        dragGestureDetectorKt$drag$1.label = 1;
                        obj = m336awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
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
        java.lang.Object obj2 = dragGestureDetectorKt$drag$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$drag$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0068 -> B:10:0x006d). Please report as a decompilation issue!!! */
    /* renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m336awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1 dragGestureDetectorKt$awaitDragOrCancellation$1;
        int i;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        java.lang.Object awaitPointerEvent$default;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1) {
            dragGestureDetectorKt$awaitDragOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitDragOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitDragOrCancellation$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.Ref.LongRef longRef2 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitDragOrCancellation$1.L$1;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitDragOrCancellation$1.L$0;
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
                        if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
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
                        dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = longRef;
                        dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
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
                if (m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new kotlin.jvm.internal.Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitDragOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    public static /* synthetic */ java.lang.Object detectDragGestures$default(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$2
                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m357invokek4lQ0M(long j) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                    m357invokek4lQ0M(offset.getPackedValue());
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.functions.Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        return detectDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    public static final java.lang.Object detectDragGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5(function1, function2, function02, function0, null), continuation);
        return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object detectDragGesturesAfterLongPress$default(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$2
                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m358invokek4lQ0M(long j) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                    m358invokek4lQ0M(offset.getPackedValue());
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.functions.Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        return detectDragGesturesAfterLongPress(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    public static final java.lang.Object detectDragGesturesAfterLongPress(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(function1, function0, function02, function2, null), continuation);
        return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0139 -> B:18:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x017d -> B:11:0x0184). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01aa -> B:17:0x018d). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m347awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
        int i;
        androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig;
        kotlin.jvm.internal.Ref.LongRef longRef;
        float f;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
        long m1887getZeroF1C5BW0;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function22;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig2;
        long j2;
        int size;
        int i2;
        long j3;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        int i3;
        java.lang.Object awaitPointerEvent$default;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
                int i4 = 1;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i == 0) {
                    if (i == 1) {
                        long j4 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.J$0;
                        f = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                        kotlin.jvm.internal.Ref.LongRef longRef3 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                        pointerDirectionConfig2 = (androidx.compose.foundation.gestures.PointerDirectionConfig) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function23 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        longRef2 = longRef3;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        j2 = j4;
                        function22 = function23;
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        int i5 = 0;
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                            }
                            i2 = i3 + 1;
                            j2 = j3;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null) {
                            if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                        }
                        return null;
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j5 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.J$0;
                    f = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                    pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$4;
                    kotlin.jvm.internal.Ref.LongRef longRef4 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                    androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig3 = (androidx.compose.foundation.gestures.PointerDirectionConfig) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                    kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function24 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                    m1887getZeroF1C5BW0 = j5;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    function22 = function24;
                    longRef = longRef4;
                    pointerDirectionConfig = pointerDirectionConfig3;
                    if (!pointerInputChange2.isConsumed()) {
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                        i4 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = longRef;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        long j6 = m1887getZeroF1C5BW0;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
                        obj = awaitPointerEvent$default;
                        longRef2 = longRef;
                        pointerDirectionConfig2 = pointerDirectionConfig;
                        j2 = j6;
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                        size = changes2.size();
                        int i52 = 0;
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                j3 = j2;
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes2.get(i2);
                            j3 = j2;
                            i3 = i2;
                            if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                                break;
                            }
                            i2 = i3 + 1;
                            j2 = j3;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
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
                                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange3;
                                if (pointerInputChange4 != null) {
                                    longRef2.element = pointerInputChange4.getId();
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                                    pointerDirectionConfig = pointerDirectionConfig2;
                                    longRef = longRef2;
                                    i4 = 1;
                                    pointerEventPass = null;
                                    m1887getZeroF1C5BW0 = j3;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = longRef;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass);
                                    if (awaitPointerEvent$default != coroutine_suspended) {
                                    }
                                }
                            } else {
                                long m1876plusMKHz9U = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(j3, androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition()));
                                if (pointerDirectionConfig2.mo355calculateDeltaChangek4lQ0M(m1876plusMKHz9U) >= f) {
                                    function22.invoke(pointerInputChange2, kotlin.coroutines.jvm.internal.Boxing.boxFloat(androidx.compose.ui.geometry.Offset.m1872getYimpl(pointerDirectionConfig2.mo356calculatePostSlopOffset8S9VItk(m1876plusMKHz9U, f))));
                                    if (pointerInputChange2.isConsumed()) {
                                        return pointerInputChange2;
                                    }
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                                    m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                                    pointerDirectionConfig = pointerDirectionConfig2;
                                    longRef = longRef2;
                                    i4 = 1;
                                    pointerEventPass = null;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = longRef;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass);
                                    if (awaitPointerEvent$default != coroutine_suspended) {
                                    }
                                } else {
                                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0 = function22;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1 = pointerDirectionConfig2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3 = longRef2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$4 = pointerInputChange2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0 = f;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.J$0 = m1876plusMKHz9U;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pointerDirectionConfig = pointerDirectionConfig2;
                                    longRef = longRef2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                                    m1887getZeroF1C5BW0 = m1876plusMKHz9U;
                                    if (!pointerInputChange2.isConsumed()) {
                                    }
                                }
                            }
                        }
                    }
                    return null;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                int m3355getTouchT8wyACA = androidx.compose.ui.input.pointer.PointerType.INSTANCE.m3355getTouchT8wyACA();
                androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig4 = VerticalPointerDirectionConfig;
                if (m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m353pointerSlopE8SPZFQ = m353pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m3355getTouchT8wyACA);
                kotlin.jvm.internal.Ref.LongRef longRef5 = new kotlin.jvm.internal.Ref.LongRef();
                longRef5.element = j;
                pointerDirectionConfig = pointerDirectionConfig4;
                longRef = longRef5;
                f = m353pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = longRef;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
        int i42 = 1;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass3 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x013b -> B:18:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x017f -> B:11:0x0186). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01ac -> B:17:0x018f). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m346awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, int i, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
        int i2;
        float f;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
        long m1887getZeroF1C5BW0;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function22;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        float f2;
        long j2;
        int size;
        int i3;
        long j3;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        int i4;
        java.lang.Object awaitPointerEvent$default;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
                int i5 = 1;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i2 == 0) {
                    if (i2 == 1) {
                        long j4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.J$0;
                        float f3 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                        kotlin.jvm.internal.Ref.LongRef longRef3 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                        androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig2 = (androidx.compose.foundation.gestures.PointerDirectionConfig) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function23 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        f2 = f3;
                        pointerDirectionConfig = pointerDirectionConfig2;
                        longRef2 = longRef3;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        j2 = j4;
                        function22 = function23;
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        int i6 = 0;
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                            }
                            i3 = i4 + 1;
                            j2 = j3;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null) {
                            if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                        }
                        return null;
                    }
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j5 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.J$0;
                    float f4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                    pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4;
                    kotlin.jvm.internal.Ref.LongRef longRef4 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                    androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig3 = (androidx.compose.foundation.gestures.PointerDirectionConfig) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                    kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function24 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                    m1887getZeroF1C5BW0 = j5;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    function22 = function24;
                    longRef = longRef4;
                    f = f4;
                    pointerDirectionConfig = pointerDirectionConfig3;
                    if (!pointerInputChange2.isConsumed()) {
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
                        i5 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = longRef;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i5;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i5, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        long j6 = m1887getZeroF1C5BW0;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                        obj = awaitPointerEvent$default;
                        longRef2 = longRef;
                        f2 = f;
                        j2 = j6;
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                        size = changes2.size();
                        int i62 = 0;
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                j3 = j2;
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes2.get(i3);
                            j3 = j2;
                            i4 = i3;
                            if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                                break;
                            }
                            i3 = i4 + 1;
                            j2 = j3;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                            if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                                int size2 = changes3.size();
                                while (true) {
                                    if (i62 >= size2) {
                                        pointerInputChange3 = null;
                                        break;
                                    }
                                    pointerInputChange3 = changes3.get(i62);
                                    if (pointerInputChange3.getPressed()) {
                                        break;
                                    }
                                    i62++;
                                }
                                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange3;
                                if (pointerInputChange4 != null) {
                                    longRef2.element = pointerInputChange4.getId();
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                                    f = f2;
                                    longRef = longRef2;
                                    i5 = 1;
                                    pointerEventPass = null;
                                    m1887getZeroF1C5BW0 = j3;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = longRef;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i5;
                                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i5, pointerEventPass);
                                    if (awaitPointerEvent$default != coroutine_suspended) {
                                    }
                                }
                            } else {
                                long m1876plusMKHz9U = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(j3, androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition()));
                                if (pointerDirectionConfig.mo355calculateDeltaChangek4lQ0M(m1876plusMKHz9U) >= f2) {
                                    function22.invoke(pointerInputChange2, kotlin.coroutines.jvm.internal.Boxing.boxFloat(androidx.compose.ui.geometry.Offset.m1872getYimpl(pointerDirectionConfig.mo356calculatePostSlopOffset8S9VItk(m1876plusMKHz9U, f2))));
                                    if (pointerInputChange2.isConsumed()) {
                                        return pointerInputChange2;
                                    }
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                                    m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                                    f = f2;
                                    longRef = longRef2;
                                    i5 = 1;
                                    pointerEventPass = null;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = longRef;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i5;
                                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i5, pointerEventPass);
                                    if (awaitPointerEvent$default != coroutine_suspended) {
                                    }
                                } else {
                                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function22;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = pointerDirectionConfig;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = longRef2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = pointerInputChange2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = f2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.J$0 = m1876plusMKHz9U;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    f = f2;
                                    longRef = longRef2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                                    m1887getZeroF1C5BW0 = m1876plusMKHz9U;
                                    if (!pointerInputChange2.isConsumed()) {
                                    }
                                }
                            }
                        }
                    }
                    return null;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig4 = VerticalPointerDirectionConfig;
                if (m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m353pointerSlopE8SPZFQ = m353pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                kotlin.jvm.internal.Ref.LongRef longRef5 = new kotlin.jvm.internal.Ref.LongRef();
                longRef5.element = j;
                f = m353pointerSlopE8SPZFQ;
                longRef = longRef5;
                pointerDirectionConfig = pointerDirectionConfig4;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = longRef;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i5;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i5, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
        int i52 = 1;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass3 = null;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00eb, code lost:
    
        if ((!r0) != false) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x007a -> B:10:0x007f). Please report as a decompilation issue!!! */
    /* renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m354verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$1;
        int i;
        long j2;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$12;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function12;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
        java.lang.Object awaitPointerEvent$default;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1) {
            dragGestureDetectorKt$verticalDrag$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1) continuation;
            if ((dragGestureDetectorKt$verticalDrag$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$verticalDrag$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = dragGestureDetectorKt$verticalDrag$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$verticalDrag$1.label;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    j2 = j;
                    if (!m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                        function12 = function1;
                        longRef = new kotlin.jvm.internal.Ref.LongRef();
                        longRef.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                        dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$verticalDrag$12.L$2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$verticalDrag$12.L$3 = longRef;
                        dragGestureDetectorKt$verticalDrag$12.label = 1;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, 1, pointerEventPass);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(pointerEventPass == null);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.jvm.internal.Ref.LongRef longRef2 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$verticalDrag$1.L$3;
                awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.L$2;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.L$1;
                kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function13 = (kotlin.jvm.functions.Function1) dragGestureDetectorKt$verticalDrag$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                function12 = function13;
                longRef = longRef2;
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i2);
                    if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                        break;
                    }
                    i2++;
                }
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange;
                if (pointerInputChange4 == null) {
                    if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        int i3 = 0;
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
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5 = pointerInputChange2;
                        pointerInputChange3 = pointerInputChange4;
                        if (pointerInputChange5 != null) {
                            longRef.element = pointerInputChange5.getId();
                            awaitPointerEventScope2 = awaitPointerEventScope4;
                            pointerEventPass = null;
                            dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                            dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$verticalDrag$12.L$2 = awaitPointerEventScope3;
                            dragGestureDetectorKt$verticalDrag$12.L$3 = longRef;
                            dragGestureDetectorKt$verticalDrag$12.label = 1;
                            awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, 1, pointerEventPass);
                            if (awaitPointerEvent$default == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            awaitPointerEventScope4 = awaitPointerEventScope2;
                            obj = awaitPointerEvent$default;
                        }
                    } else {
                        boolean z = androidx.compose.ui.geometry.Offset.m1872getYimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange4)) == 0.0f;
                        pointerInputChange3 = pointerInputChange4;
                    }
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                    int size3 = changes3.size();
                    int i22 = 0;
                    while (true) {
                        if (i22 < size3) {
                        }
                        i22++;
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
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    j2 = pointerInputChange3.getId();
                    pointerEventPass = null;
                    longRef = new kotlin.jvm.internal.Ref.LongRef();
                    longRef.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                    dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$verticalDrag$12.L$2 = awaitPointerEventScope3;
                    dragGestureDetectorKt$verticalDrag$12.L$3 = longRef;
                    dragGestureDetectorKt$verticalDrag$12.label = 1;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, 1, pointerEventPass);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(pointerEventPass == null);
            }
        }
        dragGestureDetectorKt$verticalDrag$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$verticalDrag$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$verticalDrag$1.label;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
    
        if (((androidx.compose.ui.geometry.Offset.m1872getYimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)) == 0.0f ? 1 : 0) ^ 1) != 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0068 -> B:10:0x006d). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m345awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 dragGestureDetectorKt$awaitVerticalDragOrCancellation$1;
        int i;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        java.lang.Object awaitPointerEvent$default;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.Ref.LongRef longRef2 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.LongRef longRef3 = longRef2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i2);
                        if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                            break;
                        }
                        i2++;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            while (true) {
                                if (r9 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(r9);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                r9++;
                            }
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                longRef3.element = pointerInputChange4.getId();
                                longRef = longRef3;
                            }
                        }
                        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = longRef;
                        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
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
                        while (true) {
                            if (i22 < size3) {
                            }
                            i22++;
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
                if (m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new kotlin.jvm.internal.Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    public static /* synthetic */ java.lang.Object detectVerticalDragGestures$default(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$2
                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m360invokek4lQ0M(long j) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                    m360invokek4lQ0M(offset.getPackedValue());
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.functions.Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        return detectVerticalDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    public static final java.lang.Object detectVerticalDragGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5(function1, function2, function0, function02, null), continuation);
        return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0139 -> B:18:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x017d -> B:11:0x0184). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01aa -> B:17:0x018d). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m340awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
        int i;
        androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig;
        kotlin.jvm.internal.Ref.LongRef longRef;
        float f;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
        long m1887getZeroF1C5BW0;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function22;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig2;
        long j2;
        int size;
        int i2;
        long j3;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        int i3;
        java.lang.Object awaitPointerEvent$default;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
                int i4 = 1;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i == 0) {
                    if (i == 1) {
                        long j4 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.J$0;
                        f = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                        kotlin.jvm.internal.Ref.LongRef longRef3 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3;
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                        pointerDirectionConfig2 = (androidx.compose.foundation.gestures.PointerDirectionConfig) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function23 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        longRef2 = longRef3;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        j2 = j4;
                        function22 = function23;
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        int i5 = 0;
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                            }
                            i2 = i3 + 1;
                            j2 = j3;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null) {
                            if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                        }
                        return null;
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j5 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.J$0;
                    f = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                    pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$4;
                    kotlin.jvm.internal.Ref.LongRef longRef4 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                    androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig3 = (androidx.compose.foundation.gestures.PointerDirectionConfig) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                    kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function24 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                    m1887getZeroF1C5BW0 = j5;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    function22 = function24;
                    longRef = longRef4;
                    pointerDirectionConfig = pointerDirectionConfig3;
                    if (!pointerInputChange2.isConsumed()) {
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                        i4 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = longRef;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        long j6 = m1887getZeroF1C5BW0;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
                        obj = awaitPointerEvent$default;
                        longRef2 = longRef;
                        pointerDirectionConfig2 = pointerDirectionConfig;
                        j2 = j6;
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                        size = changes2.size();
                        int i52 = 0;
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                j3 = j2;
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes2.get(i2);
                            j3 = j2;
                            i3 = i2;
                            if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                                break;
                            }
                            i2 = i3 + 1;
                            j2 = j3;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
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
                                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange3;
                                if (pointerInputChange4 != null) {
                                    longRef2.element = pointerInputChange4.getId();
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                                    pointerDirectionConfig = pointerDirectionConfig2;
                                    longRef = longRef2;
                                    i4 = 1;
                                    pointerEventPass = null;
                                    m1887getZeroF1C5BW0 = j3;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = longRef;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass);
                                    if (awaitPointerEvent$default != coroutine_suspended) {
                                    }
                                }
                            } else {
                                long m1876plusMKHz9U = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(j3, androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition()));
                                if (pointerDirectionConfig2.mo355calculateDeltaChangek4lQ0M(m1876plusMKHz9U) >= f) {
                                    function22.invoke(pointerInputChange2, kotlin.coroutines.jvm.internal.Boxing.boxFloat(androidx.compose.ui.geometry.Offset.m1871getXimpl(pointerDirectionConfig2.mo356calculatePostSlopOffset8S9VItk(m1876plusMKHz9U, f))));
                                    if (pointerInputChange2.isConsumed()) {
                                        return pointerInputChange2;
                                    }
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                                    m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                                    pointerDirectionConfig = pointerDirectionConfig2;
                                    longRef = longRef2;
                                    i4 = 1;
                                    pointerEventPass = null;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = longRef;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass);
                                    if (awaitPointerEvent$default != coroutine_suspended) {
                                    }
                                } else {
                                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0 = function22;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1 = pointerDirectionConfig2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3 = longRef2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$4 = pointerInputChange2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0 = f;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.J$0 = m1876plusMKHz9U;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pointerDirectionConfig = pointerDirectionConfig2;
                                    longRef = longRef2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                                    m1887getZeroF1C5BW0 = m1876plusMKHz9U;
                                    if (!pointerInputChange2.isConsumed()) {
                                    }
                                }
                            }
                        }
                    }
                    return null;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                int m3355getTouchT8wyACA = androidx.compose.ui.input.pointer.PointerType.INSTANCE.m3355getTouchT8wyACA();
                androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig4 = HorizontalPointerDirectionConfig;
                if (m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m353pointerSlopE8SPZFQ = m353pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m3355getTouchT8wyACA);
                kotlin.jvm.internal.Ref.LongRef longRef5 = new kotlin.jvm.internal.Ref.LongRef();
                longRef5.element = j;
                pointerDirectionConfig = pointerDirectionConfig4;
                longRef = longRef5;
                f = m353pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = longRef;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
        int i42 = 1;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass3 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x013b -> B:18:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x017f -> B:11:0x0186). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01ac -> B:17:0x018f). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m339awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, int i, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
        int i2;
        float f;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
        long m1887getZeroF1C5BW0;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function22;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        float f2;
        long j2;
        int size;
        int i3;
        long j3;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        int i4;
        java.lang.Object awaitPointerEvent$default;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
                int i5 = 1;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i2 == 0) {
                    if (i2 == 1) {
                        long j4 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.J$0;
                        float f3 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                        kotlin.jvm.internal.Ref.LongRef longRef3 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                        androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig2 = (androidx.compose.foundation.gestures.PointerDirectionConfig) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function23 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        f2 = f3;
                        pointerDirectionConfig = pointerDirectionConfig2;
                        longRef2 = longRef3;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        j2 = j4;
                        function22 = function23;
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        int i6 = 0;
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                            }
                            i3 = i4 + 1;
                            j2 = j3;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null) {
                            if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                        }
                        return null;
                    }
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j5 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.J$0;
                    float f4 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                    pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4;
                    kotlin.jvm.internal.Ref.LongRef longRef4 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                    androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig3 = (androidx.compose.foundation.gestures.PointerDirectionConfig) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                    kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function24 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                    m1887getZeroF1C5BW0 = j5;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    function22 = function24;
                    longRef = longRef4;
                    f = f4;
                    pointerDirectionConfig = pointerDirectionConfig3;
                    if (!pointerInputChange2.isConsumed()) {
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
                        i5 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = longRef;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i5;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i5, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        long j6 = m1887getZeroF1C5BW0;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                        obj = awaitPointerEvent$default;
                        longRef2 = longRef;
                        f2 = f;
                        j2 = j6;
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                        size = changes2.size();
                        int i62 = 0;
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                j3 = j2;
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes2.get(i3);
                            j3 = j2;
                            i4 = i3;
                            if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                                break;
                            }
                            i3 = i4 + 1;
                            j2 = j3;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                            if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                                int size2 = changes3.size();
                                while (true) {
                                    if (i62 >= size2) {
                                        pointerInputChange3 = null;
                                        break;
                                    }
                                    pointerInputChange3 = changes3.get(i62);
                                    if (pointerInputChange3.getPressed()) {
                                        break;
                                    }
                                    i62++;
                                }
                                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange3;
                                if (pointerInputChange4 != null) {
                                    longRef2.element = pointerInputChange4.getId();
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                                    f = f2;
                                    longRef = longRef2;
                                    i5 = 1;
                                    pointerEventPass = null;
                                    m1887getZeroF1C5BW0 = j3;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = longRef;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i5;
                                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i5, pointerEventPass);
                                    if (awaitPointerEvent$default != coroutine_suspended) {
                                    }
                                }
                            } else {
                                long m1876plusMKHz9U = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(j3, androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition()));
                                if (pointerDirectionConfig.mo355calculateDeltaChangek4lQ0M(m1876plusMKHz9U) >= f2) {
                                    function22.invoke(pointerInputChange2, kotlin.coroutines.jvm.internal.Boxing.boxFloat(androidx.compose.ui.geometry.Offset.m1871getXimpl(pointerDirectionConfig.mo356calculatePostSlopOffset8S9VItk(m1876plusMKHz9U, f2))));
                                    if (pointerInputChange2.isConsumed()) {
                                        return pointerInputChange2;
                                    }
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                                    m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                                    f = f2;
                                    longRef = longRef2;
                                    i5 = 1;
                                    pointerEventPass = null;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = longRef;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i5;
                                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i5, pointerEventPass);
                                    if (awaitPointerEvent$default != coroutine_suspended) {
                                    }
                                } else {
                                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = pointerDirectionConfig;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = longRef2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = pointerInputChange2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = f2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.J$0 = m1876plusMKHz9U;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    f = f2;
                                    longRef = longRef2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                                    m1887getZeroF1C5BW0 = m1876plusMKHz9U;
                                    if (!pointerInputChange2.isConsumed()) {
                                    }
                                }
                            }
                        }
                    }
                    return null;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig4 = HorizontalPointerDirectionConfig;
                if (m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m353pointerSlopE8SPZFQ = m353pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                kotlin.jvm.internal.Ref.LongRef longRef5 = new kotlin.jvm.internal.Ref.LongRef();
                longRef5.element = j;
                f = m353pointerSlopE8SPZFQ;
                longRef = longRef5;
                pointerDirectionConfig = pointerDirectionConfig4;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = longRef;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i5;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i5, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
        int i52 = 1;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass3 = null;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00eb, code lost:
    
        if ((!r0) != false) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x007a -> B:10:0x007f). Please report as a decompilation issue!!! */
    /* renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m351horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$1;
        int i;
        long j2;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$12;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function12;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
        java.lang.Object awaitPointerEvent$default;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1) {
            dragGestureDetectorKt$horizontalDrag$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1) continuation;
            if ((dragGestureDetectorKt$horizontalDrag$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$horizontalDrag$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = dragGestureDetectorKt$horizontalDrag$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$horizontalDrag$1.label;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    j2 = j;
                    if (!m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                        function12 = function1;
                        longRef = new kotlin.jvm.internal.Ref.LongRef();
                        longRef.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                        dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$horizontalDrag$12.L$2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$horizontalDrag$12.L$3 = longRef;
                        dragGestureDetectorKt$horizontalDrag$12.label = 1;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, 1, pointerEventPass);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(pointerEventPass == null);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.jvm.internal.Ref.LongRef longRef2 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$horizontalDrag$1.L$3;
                awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$2;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$1;
                kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function13 = (kotlin.jvm.functions.Function1) dragGestureDetectorKt$horizontalDrag$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                function12 = function13;
                longRef = longRef2;
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i2);
                    if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                        break;
                    }
                    i2++;
                }
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange;
                if (pointerInputChange4 == null) {
                    if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        int i3 = 0;
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
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5 = pointerInputChange2;
                        pointerInputChange3 = pointerInputChange4;
                        if (pointerInputChange5 != null) {
                            longRef.element = pointerInputChange5.getId();
                            awaitPointerEventScope2 = awaitPointerEventScope4;
                            pointerEventPass = null;
                            dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                            dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$horizontalDrag$12.L$2 = awaitPointerEventScope3;
                            dragGestureDetectorKt$horizontalDrag$12.L$3 = longRef;
                            dragGestureDetectorKt$horizontalDrag$12.label = 1;
                            awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, 1, pointerEventPass);
                            if (awaitPointerEvent$default == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            awaitPointerEventScope4 = awaitPointerEventScope2;
                            obj = awaitPointerEvent$default;
                        }
                    } else {
                        boolean z = androidx.compose.ui.geometry.Offset.m1871getXimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange4)) == 0.0f;
                        pointerInputChange3 = pointerInputChange4;
                    }
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                    int size3 = changes3.size();
                    int i22 = 0;
                    while (true) {
                        if (i22 < size3) {
                        }
                        i22++;
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
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    j2 = pointerInputChange3.getId();
                    pointerEventPass = null;
                    longRef = new kotlin.jvm.internal.Ref.LongRef();
                    longRef.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                    dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$horizontalDrag$12.L$2 = awaitPointerEventScope3;
                    dragGestureDetectorKt$horizontalDrag$12.L$3 = longRef;
                    dragGestureDetectorKt$horizontalDrag$12.label = 1;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, 1, pointerEventPass);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(pointerEventPass == null);
            }
        }
        dragGestureDetectorKt$horizontalDrag$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$horizontalDrag$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$horizontalDrag$1.label;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
    
        if (((androidx.compose.ui.geometry.Offset.m1871getXimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)) == 0.0f ? 1 : 0) ^ 1) != 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0068 -> B:10:0x006d). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m338awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;
        int i;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        java.lang.Object awaitPointerEvent$default;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.Ref.LongRef longRef2 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.LongRef longRef3 = longRef2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i2);
                        if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                            break;
                        }
                        i2++;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            while (true) {
                                if (r9 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(r9);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                r9++;
                            }
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                longRef3.element = pointerInputChange4.getId();
                                longRef = longRef3;
                            }
                        }
                        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1 = longRef;
                        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = 1;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
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
                        while (true) {
                            if (i22 < size3) {
                            }
                            i22++;
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
                if (m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new kotlin.jvm.internal.Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    public static /* synthetic */ java.lang.Object detectHorizontalDragGestures$default(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$2
                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m359invokek4lQ0M(long j) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                    m359invokek4lQ0M(offset.getPackedValue());
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.functions.Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        return detectHorizontalDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    public static final java.lang.Object detectHorizontalDragGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5(function1, function2, function0, function02, null), continuation);
        return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fd, code lost:
    
        if (r3.invoke(r15).booleanValue() != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008e -> B:10:0x0094). Please report as a decompilation issue!!! */
    /* renamed from: drag-VnAYq1g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m348dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function12, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function13, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2 dragGestureDetectorKt$drag$2;
        int i;
        long j2;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function14;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function15;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2 dragGestureDetectorKt$drag$22;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function16;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
        java.lang.Object awaitPointerEvent$default;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        int i2;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2) {
            dragGestureDetectorKt$drag$2 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2) continuation;
            if ((dragGestureDetectorKt$drag$2.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$2.label -= Integer.MIN_VALUE;
                java.lang.Object obj = dragGestureDetectorKt$drag$2.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$drag$2.label;
                int i3 = 1;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    j2 = j;
                    if (m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        return null;
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    function14 = function12;
                    function15 = function13;
                    dragGestureDetectorKt$drag$22 = dragGestureDetectorKt$drag$2;
                    function16 = function1;
                    longRef = new kotlin.jvm.internal.Ref.LongRef();
                    longRef.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$1 = function16;
                    dragGestureDetectorKt$drag$22.L$2 = function14;
                    dragGestureDetectorKt$drag$22.L$3 = function15;
                    dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                    dragGestureDetectorKt$drag$22.L$5 = longRef;
                    dragGestureDetectorKt$drag$22.label = i3;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$drag$22, i3, pointerEventPass);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.Ref.LongRef longRef2 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$drag$2.L$5;
                    awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$drag$2.L$4;
                    kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function17 = (kotlin.jvm.functions.Function1) dragGestureDetectorKt$drag$2.L$3;
                    kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function18 = (kotlin.jvm.functions.Function1) dragGestureDetectorKt$drag$2.L$2;
                    kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function19 = (kotlin.jvm.functions.Function1) dragGestureDetectorKt$drag$2.L$1;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$drag$2.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$drag$22 = dragGestureDetectorKt$drag$2;
                    function16 = function19;
                    kotlin.jvm.internal.Ref.LongRef longRef3 = longRef2;
                    function14 = function18;
                    function15 = function17;
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
                        if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                            break;
                        }
                        i4 = i2 + 1;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
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
                                pointerEventPass = null;
                                awaitPointerEventScope2 = awaitPointerEventScope4;
                                i3 = 1;
                                longRef = longRef3;
                                dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                                dragGestureDetectorKt$drag$22.L$1 = function16;
                                dragGestureDetectorKt$drag$22.L$2 = function14;
                                dragGestureDetectorKt$drag$22.L$3 = function15;
                                dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                                dragGestureDetectorKt$drag$22.L$5 = longRef;
                                dragGestureDetectorKt$drag$22.label = i3;
                                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$drag$22, i3, pointerEventPass);
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
                    if (pointerInputChange32 == null || function15.invoke(pointerInputChange32).booleanValue()) {
                        return null;
                    }
                    if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange32)) {
                        return pointerInputChange32;
                    }
                    function16.invoke(pointerInputChange32);
                    j2 = pointerInputChange32.getId();
                    pointerEventPass = null;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    i3 = 1;
                    longRef = new kotlin.jvm.internal.Ref.LongRef();
                    longRef.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$1 = function16;
                    dragGestureDetectorKt$drag$22.L$2 = function14;
                    dragGestureDetectorKt$drag$22.L$3 = function15;
                    dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                    dragGestureDetectorKt$drag$22.L$5 = longRef;
                    dragGestureDetectorKt$drag$22.label = i3;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$drag$22, i3, pointerEventPass);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                }
            }
        }
        dragGestureDetectorKt$drag$2 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$drag$2.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$drag$2.label;
        int i32 = 1;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = null;
        if (i != 0) {
        }
    }

    /* renamed from: drag-VnAYq1g$$forInline, reason: not valid java name */
    private static final java.lang.Object m349dragVnAYq1g$$forInline(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function12, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function13, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        long j2 = j;
        if (m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        while (true) {
            kotlin.jvm.internal.Ref.LongRef longRef = new kotlin.jvm.internal.Ref.LongRef();
            longRef.element = j2;
            while (true) {
                int i = 0;
                kotlin.jvm.internal.InlineMarker.mark(0);
                java.lang.Object awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
                kotlin.jvm.internal.InlineMarker.mark(1);
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent$default;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i2);
                    if (java.lang.Boolean.valueOf(androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                        break;
                    }
                    i2++;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 == null) {
                    pointerInputChange2 = null;
                    break;
                }
                if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes2.get(i);
                        if (java.lang.Boolean.valueOf(pointerInputChange3.getPressed()).booleanValue()) {
                            break;
                        }
                        i++;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        break;
                    }
                    longRef.element = pointerInputChange4.getId();
                } else if (function12.invoke(pointerInputChange2).booleanValue()) {
                    break;
                }
            }
            if (pointerInputChange2 == null || function13.invoke(pointerInputChange2).booleanValue()) {
                return null;
            }
            if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                return pointerInputChange2;
            }
            function1.invoke(pointerInputChange2);
            j2 = pointerInputChange2.getId();
        }
    }

    /* renamed from: awaitDragOrUp-jO51t88, reason: not valid java name */
    private static final java.lang.Object m337awaitDragOrUpjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        kotlin.jvm.internal.Ref.LongRef longRef = new kotlin.jvm.internal.Ref.LongRef();
        longRef.element = j;
        while (true) {
            int i = 0;
            kotlin.jvm.internal.InlineMarker.mark(0);
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = null;
            java.lang.Object awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            kotlin.jvm.internal.InlineMarker.mark(1);
            androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent$default;
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                if (java.lang.Boolean.valueOf(androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                    break;
                }
                i2++;
            }
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                return null;
            }
            if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = changes2.get(i);
                    if (java.lang.Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                        pointerInputChange2 = pointerInputChange4;
                        break;
                    }
                    i++;
                }
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5 = pointerInputChange2;
                if (pointerInputChange5 == null) {
                    return pointerInputChange3;
                }
                longRef.element = pointerInputChange5.getId();
            } else if (function1.invoke(pointerInputChange3).booleanValue()) {
                return pointerInputChange3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0187 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x017a -> B:11:0x0180). Please report as a decompilation issue!!! */
    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m342awaitPointerSlopOrCancellationpn7EDYM(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, int i, androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
        int i2;
        long m1887getZeroF1C5BW0;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig2;
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
        float f;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function22;
        long j2;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function23;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes;
        int size;
        int i3;
        java.lang.Object obj;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        java.lang.Object obj2;
        int i4;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> list;
        int i5;
        java.lang.Object awaitPointerEvent$default;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj3 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label;
                int i6 = 1;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    if (m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    float m353pointerSlopE8SPZFQ = m353pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                    kotlin.jvm.internal.Ref.LongRef longRef3 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef3.element = j;
                    m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                    longRef = longRef3;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    pointerDirectionConfig2 = pointerDirectionConfig;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    f = m353pointerSlopE8SPZFQ;
                    function22 = function2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = longRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i6;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i6, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                } else if (i2 == 1) {
                    long j3 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.J$0;
                    float f2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0;
                    longRef2 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3;
                    function23 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2;
                    androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig3 = (androidx.compose.foundation.gestures.PointerDirectionConfig) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    f = f2;
                    pointerDirectionConfig2 = pointerDirectionConfig3;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    j2 = j3;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj3;
                    changes = pointerEvent.getChanges();
                    size = changes.size();
                    int i7 = 0;
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3 = i4 + 1;
                        changes = list;
                        size = i5;
                    }
                    pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        return pointerEventPass;
                    }
                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    }
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = longRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i6;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i6, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j4 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.J$0;
                    float f3 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0;
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$4;
                    kotlin.jvm.internal.Ref.LongRef longRef4 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3;
                    kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function24 = (kotlin.jvm.functions.Function2) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2;
                    androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig4 = (androidx.compose.foundation.gestures.PointerDirectionConfig) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    long j5 = j4;
                    pointerDirectionConfig2 = pointerDirectionConfig4;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    f = f3;
                    longRef = longRef4;
                    function23 = function24;
                    if (!pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    pointerEventPass = null;
                    function22 = function23;
                    m1887getZeroF1C5BW0 = j5;
                    i6 = 1;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = longRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i6;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i6, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    long j6 = m1887getZeroF1C5BW0;
                    function23 = function22;
                    longRef2 = longRef;
                    obj3 = awaitPointerEvent$default;
                    j2 = j6;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj3;
                    changes = pointerEvent2.getChanges();
                    size = changes.size();
                    int i72 = 0;
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            obj = pointerEventPass;
                            break;
                        }
                        obj = changes.get(i3);
                        i4 = i3;
                        list = changes;
                        i5 = size;
                        if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(((androidx.compose.ui.input.pointer.PointerInputChange) obj).getId(), longRef2.element)) {
                            break;
                        }
                        i3 = i4 + 1;
                        changes = list;
                        size = i5;
                    }
                    pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    if (pointerInputChange != null || pointerInputChange.isConsumed()) {
                        return pointerEventPass;
                    }
                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                        int size2 = changes2.size();
                        while (true) {
                            if (i72 >= size2) {
                                obj2 = pointerEventPass;
                                break;
                            }
                            obj2 = changes2.get(i72);
                            if (((androidx.compose.ui.input.pointer.PointerInputChange) obj2).getPressed()) {
                                break;
                            }
                            i72++;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = (androidx.compose.ui.input.pointer.PointerInputChange) obj2;
                        if (pointerInputChange3 == null) {
                            return pointerEventPass;
                        }
                        longRef2.element = pointerInputChange3.getId();
                        function22 = function23;
                        i6 = 1;
                        long j7 = j2;
                        longRef = longRef2;
                        m1887getZeroF1C5BW0 = j7;
                    } else {
                        kotlin.jvm.internal.Ref.LongRef longRef5 = longRef2;
                        long m1876plusMKHz9U = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(j2, androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition()));
                        if (pointerDirectionConfig2.mo355calculateDeltaChangek4lQ0M(m1876plusMKHz9U) < f) {
                            androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig2;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = function23;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = longRef5;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = pointerInputChange;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.J$0 = m1876plusMKHz9U;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            longRef = longRef5;
                            pointerInputChange2 = pointerInputChange;
                            j5 = m1876plusMKHz9U;
                            if (!pointerInputChange2.isConsumed()) {
                            }
                        } else {
                            function23.invoke(pointerInputChange, androidx.compose.ui.geometry.Offset.m1860boximpl(pointerDirectionConfig2.mo356calculatePostSlopOffset8S9VItk(m1876plusMKHz9U, f)));
                            if (pointerInputChange.isConsumed()) {
                                return pointerInputChange;
                            }
                            longRef = longRef5;
                            i6 = 1;
                            pointerEventPass = null;
                            function22 = function23;
                            m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                        }
                    }
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = longRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.J$0 = m1887getZeroF1C5BW0;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i6;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i6, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
            }
        }
        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(continuation);
        java.lang.Object obj32 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label;
        int i62 = 1;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass3 = null;
        if (i2 != 0) {
        }
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM$$forInline, reason: not valid java name */
    private static final java.lang.Object m343awaitPointerSlopOrCancellationpn7EDYM$$forInline(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, int i, androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        long m1887getZeroF1C5BW0;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        if (m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float m353pointerSlopE8SPZFQ = m353pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        kotlin.jvm.internal.Ref.LongRef longRef = new kotlin.jvm.internal.Ref.LongRef();
        longRef.element = j;
        long m1887getZeroF1C5BW02 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
        while (true) {
            kotlin.jvm.internal.InlineMarker.mark(0);
            java.lang.Object awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            kotlin.jvm.internal.InlineMarker.mark(1);
            androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent$default;
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> list = changes;
                int i3 = size;
                if (java.lang.Boolean.valueOf(androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                    break;
                }
                i2++;
                changes = list;
                size = i3;
            }
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i4);
                    if (java.lang.Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i4++;
                }
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                longRef.element = pointerInputChange4.getId();
            } else {
                m1887getZeroF1C5BW02 = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(m1887getZeroF1C5BW02, androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(pointerInputChange3.getPosition(), pointerInputChange3.getPreviousPosition()));
                if (pointerDirectionConfig.mo355calculateDeltaChangek4lQ0M(m1887getZeroF1C5BW02) < m353pointerSlopE8SPZFQ) {
                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                    kotlin.jvm.internal.InlineMarker.mark(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
                    kotlin.jvm.internal.InlineMarker.mark(1);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                } else {
                    function2.invoke(pointerInputChange3, androidx.compose.ui.geometry.Offset.m1860boximpl(pointerDirectionConfig.mo356calculatePostSlopOffset8S9VItk(m1887getZeroF1C5BW02, m353pointerSlopE8SPZFQ)));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                    m1887getZeroF1C5BW02 = m1887getZeroF1C5BW0;
                }
            }
            m1887getZeroF1C5BW0 = m1887getZeroF1C5BW02;
            m1887getZeroF1C5BW02 = m1887getZeroF1C5BW0;
        }
    }

    static {
        float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl((float) 0.125d);
        mouseSlop = m4478constructorimpl;
        float m4478constructorimpl2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(18);
        defaultTouchSlop = m4478constructorimpl2;
        mouseToTouchSlopRatio = m4478constructorimpl / m4478constructorimpl2;
    }

    public static final androidx.compose.foundation.gestures.PointerDirectionConfig getHorizontalPointerDirectionConfig() {
        return HorizontalPointerDirectionConfig;
    }

    public static final androidx.compose.foundation.gestures.PointerDirectionConfig getVerticalPointerDirectionConfig() {
        return VerticalPointerDirectionConfig;
    }

    public static final androidx.compose.foundation.gestures.PointerDirectionConfig getBidirectionalPointerDirectionConfig() {
        return BidirectionalPointerDirectionConfig;
    }

    public static final androidx.compose.foundation.gestures.PointerDirectionConfig toPointerDirectionConfig(androidx.compose.foundation.gestures.Orientation orientation) {
        return orientation == androidx.compose.foundation.gestures.Orientation.Vertical ? VerticalPointerDirectionConfig : HorizontalPointerDirectionConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m341awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        int i;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitLongPressOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
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
                        if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange.getId(), j)) {
                            break;
                        }
                        i2++;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == 0) {
                        return null;
                    }
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef3.element = pointerInputChange3;
                    long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                    try {
                        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2(objectRef3, objectRef2, null);
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0 = pointerInputChange3;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1 = objectRef2;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = 1;
                        if (awaitPointerEventScope.withTimeout(longPressTimeoutMillis, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return null;
                    } catch (androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException unused) {
                        objectRef = objectRef2;
                        pointerInputChange2 = pointerInputChange3;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1;
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = (androidx.compose.ui.input.pointer.PointerInputChange) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return null;
                    } catch (androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException unused2) {
                        pointerInputChange2 = pointerInputChange4;
                    }
                }
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5 = (androidx.compose.ui.input.pointer.PointerInputChange) objectRef.element;
                return pointerInputChange5 != null ? pointerInputChange2 : pointerInputChange5;
            }
        }
        dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
        if (i != 0) {
        }
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange52 = (androidx.compose.ui.input.pointer.PointerInputChange) objectRef.element;
        if (pointerInputChange52 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m352isPointerUpDmW0f2w(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, long j) {
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
            if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange.getId(), j)) {
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
    public static final float m353pointerSlopE8SPZFQ(androidx.compose.ui.platform.ViewConfiguration viewConfiguration, int i) {
        return androidx.compose.ui.input.pointer.PointerType.m3348equalsimpl0(i, androidx.compose.ui.input.pointer.PointerType.INSTANCE.m3353getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }
}
