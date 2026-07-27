package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\r\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u000fH\u0082Hø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0013\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\f\u001ag\u0010\u0015\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u001726\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019H\u0080@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a_\u0010!\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n26\u0010\"\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010%\u001a\u0004\u0018\u00010\u0007*\u00020&2\u0006\u0010'\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(\u001a]\u0010)\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001e0\u00192\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00050\u000fH\u0082Hø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001ag\u0010)\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u001726\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110+¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019H\u0080@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010 \u001a_\u0010/\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n26\u0010\"\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110+¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u0010$\u001a'\u00101\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u0010\f\u001ag\u00103\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u001726\u0010\"\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019H\u0080@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u0010 \u001a_\u00105\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n26\u0010\"\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u0010$\u001a\u0086\u0001\u00107\u001a\u00020\u001e*\u00020&2\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001e0\u000f2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\u001e0:2\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001e0:26\u0010<\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110+¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010>\u001a\u0086\u0001\u0010?\u001a\u00020\u001e*\u00020&2\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001e0\u000f2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\u001e0:2\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001e0:26\u0010<\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110+¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010>\u001a\u0086\u0001\u0010@\u001a\u00020\u001e*\u00020&2\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001e0\u000f2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\u001e0:2\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001e0:26\u0010A\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010>\u001a\u0086\u0001\u0010B\u001a\u00020\u001e*\u00020&2\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001e0\u000f2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\u001e0:2\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001e0:26\u0010C\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010>\u001a9\u0010D\u001a\u00020\u0010*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u000fH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010\u0012\u001aa\u0010D\u001a\u00020\u0010*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u000f2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000f2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u000fH\u0082Hø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010I\u001a9\u0010J\u001a\u00020\u0010*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u000fH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bK\u0010\u0012\u001a!\u0010L\u001a\u00020\u0010*\u00020M2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010O\u001a!\u0010P\u001a\u00020\u0005*\u00020Q2\u0006\u0010\u0016\u001a\u00020\u0017H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bR\u0010S\u001a9\u0010T\u001a\u00020\u0010*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u000fH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bU\u0010\u0012\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006V"}, d2 = {"defaultTouchSlop", "Landroidx/compose/ui/unit/Dp;", "F", "mouseSlop", "mouseToTouchSlopRatio", "", "awaitDragOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrUp", "hasDragged", "Lkotlin/Function1;", "", "awaitDragOrUp-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalDragOrCancellation", "awaitHorizontalDragOrCancellation-rnUCldI", "awaitHorizontalPointerSlopOrCancellation", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "onPointerSlopReached", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "change", "overSlop", "", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalTouchSlopOrCancellation", "onTouchSlopReached", "awaitHorizontalTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitLongPressOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "initialDown", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "getDragDirectionValue", "Landroidx/compose/ui/geometry/Offset;", "awaitPointerSlopOrCancellation-pn7EDYM", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation-gDDlDlE", "awaitTouchSlopOrCancellation", "awaitTouchSlopOrCancellation-jO51t88", "awaitVerticalDragOrCancellation", "awaitVerticalDragOrCancellation-rnUCldI", "awaitVerticalPointerSlopOrCancellation", "awaitVerticalPointerSlopOrCancellation-gDDlDlE", "awaitVerticalTouchSlopOrCancellation", "awaitVerticalTouchSlopOrCancellation-jO51t88", "detectDragGestures", "onDragStart", "onDragEnd", "Lkotlin/Function0;", "onDragCancel", "onDrag", "dragAmount", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "detectHorizontalDragGestures", "onHorizontalDrag", "detectVerticalDragGestures", "onVerticalDrag", "drag", "drag-jO51t88", "motionFromChange", "motionConsumed", "drag-VnAYq1g", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "horizontalDrag", "horizontalDrag-jO51t88", "isPointerUp", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "pointerSlop", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "verticalDrag", "verticalDrag-jO51t88", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    /* renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    public static final Object m260awaitTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        return m258awaitPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, j, PointerType.INSTANCE.m3072getTouchT8wyACA(), function2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0115 -> B:16:0x017d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x016e -> B:11:0x0174). Please report as a decompilation issue!!! */
    /* renamed from: awaitPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m258awaitPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
        int i2;
        long m1408getZeroF1C5BW0;
        float m268pointerSlopE8SPZFQ;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Offset, Unit> function22;
        DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
        long j2;
        Ref.LongRef longRef2;
        float f;
        int size;
        int i3;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        boolean z;
        PointerInputChange pointerInputChange3;
        int i4;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label;
                int i5 = 1;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (m267isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m1408getZeroF1C5BW0 = Offset.INSTANCE.m1408getZeroF1C5BW0();
                    m268pointerSlopE8SPZFQ = m268pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                    longRef = new Ref.LongRef();
                    longRef.element = j;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    function22 = function2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1 = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2 = longRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3 = null;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.J$0 = m1408getZeroF1C5BW0;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0 = m268pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$1, i5, null);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                } else if (i2 == 1) {
                    float f2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0;
                    long j3 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.J$0;
                    Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2;
                    Function2<? super PointerInputChange, ? super Offset, Unit> function23 = (Function2) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    f = f2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    j2 = j3;
                    longRef2 = longRef3;
                    function22 = function23;
                    DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3 = i4 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null) {
                        return null;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                } else if (i2 == 2) {
                    float f3 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0;
                    m1408getZeroF1C5BW0 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.J$0;
                    PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3;
                    longRef = (Ref.LongRef) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2;
                    Function2<? super PointerInputChange, ? super Offset, Unit> function24 = (Function2) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    m268pointerSlopE8SPZFQ = f3;
                    char c = 2;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    if (!pointerInputChange4.isConsumed()) {
                        return null;
                    }
                    function22 = function24;
                    i5 = 1;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1 = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2 = longRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3 = null;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.J$0 = m1408getZeroF1C5BW0;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0 = m268pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$1, i5, null);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    f = m268pointerSlopE8SPZFQ;
                    obj = awaitPointerEvent$default;
                    j2 = m1408getZeroF1C5BW0;
                    longRef2 = longRef;
                    DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$132 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes2.get(i3);
                        i4 = i3;
                        if (PointerId.m2981equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                            break;
                        }
                        i3 = i4 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes3.get(i6);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i6++;
                        }
                        PointerInputChange pointerInputChange5 = pointerInputChange3;
                        if (pointerInputChange5 == null) {
                            return null;
                        }
                        longRef2.element = pointerInputChange5.getId();
                        m268pointerSlopE8SPZFQ = f;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$132;
                        longRef = longRef2;
                        m1408getZeroF1C5BW0 = j2;
                        i5 = 1;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1 = function22;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2 = longRef;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3 = null;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.J$0 = m1408getZeroF1C5BW0;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0 = m268pointerSlopE8SPZFQ;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label = i5;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$1, i5, null);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    } else {
                        long m1397plusMKHz9U = Offset.m1397plusMKHz9U(j2, PointerEventKt.positionChange(pointerInputChange2));
                        float m1390getDistanceimpl = Offset.m1390getDistanceimpl(m1397plusMKHz9U);
                        if (m1390getDistanceimpl >= f) {
                            function22.invoke(pointerInputChange2, Offset.m1381boximpl(Offset.m1396minusMKHz9U(m1397plusMKHz9U, Offset.m1399timestuRUvjQ(Offset.m1387divtuRUvjQ(m1397plusMKHz9U, m1390getDistanceimpl), f))));
                            if (pointerInputChange2.isConsumed()) {
                                z = true;
                                if (!z) {
                                    return pointerInputChange2;
                                }
                                PointerEventPass pointerEventPass = PointerEventPass.Final;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$132.L$0 = awaitPointerEventScope2;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$132.L$1 = function22;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$132.L$2 = longRef2;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$132.L$3 = pointerInputChange2;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$132.J$0 = m1397plusMKHz9U;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$132.F$0 = f;
                                c = 2;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$132.label = 2;
                                if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, dragGestureDetectorKt$awaitPointerSlopOrCancellation$132) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                m268pointerSlopE8SPZFQ = f;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$132;
                                longRef = longRef2;
                                m1408getZeroF1C5BW0 = m1397plusMKHz9U;
                                function24 = function22;
                                pointerInputChange4 = pointerInputChange2;
                                if (!pointerInputChange4.isConsumed()) {
                                }
                            } else {
                                m1397plusMKHz9U = Offset.INSTANCE.m1408getZeroF1C5BW0();
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label;
        int i52 = 1;
        if (i2 != 0) {
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
    public static final Object m265dragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        DragGestureDetectorKt$drag$1 dragGestureDetectorKt$drag$1;
        int i;
        PointerInputChange pointerInputChange;
        if (continuation instanceof DragGestureDetectorKt$drag$1) {
            dragGestureDetectorKt$drag$1 = (DragGestureDetectorKt$drag$1) continuation;
            if ((dragGestureDetectorKt$drag$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$drag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$drag$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$drag$1.L$0 = awaitPointerEventScope;
                    dragGestureDetectorKt$drag$1.L$1 = function1;
                    dragGestureDetectorKt$drag$1.label = 1;
                    obj = m253awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
                    if (obj == coroutine_suspended) {
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == null) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Function1<? super PointerInputChange, Unit> function12 = (Function1) dragGestureDetectorKt$drag$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    function1 = function12;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            return Boxing.boxBoolean(true);
                        }
                        function1.invoke(pointerInputChange);
                        j = pointerInputChange.getId();
                        dragGestureDetectorKt$drag$1.L$0 = awaitPointerEventScope;
                        dragGestureDetectorKt$drag$1.L$1 = function1;
                        dragGestureDetectorKt$drag$1.label = 1;
                        obj = m253awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange == null) {
                            return Boxing.boxBoolean(false);
                        }
                    }
                }
            }
        }
        dragGestureDetectorKt$drag$1 = new DragGestureDetectorKt$drag$1(continuation);
        Object obj2 = dragGestureDetectorKt$drag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
    public static final Object m253awaitDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitDragOrCancellation$1 dragGestureDetectorKt$awaitDragOrCancellation$1;
        int i;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object awaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitDragOrCancellation$1) {
            dragGestureDetectorKt$awaitDragOrCancellation$1 = (DragGestureDetectorKt$awaitDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitDragOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitDragOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
                if (i == 0) {
                    if (i == 1) {
                        Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitDragOrCancellation$1.L$1;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitDragOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        Ref.LongRef longRef3 = longRef2;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        PointerEvent pointerEvent = (PointerEvent) obj;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        int size = changes.size();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes.get(i3);
                            if (PointerId.m2981equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                                break;
                            }
                            i3++;
                        }
                        PointerInputChange pointerInputChange3 = pointerInputChange;
                        if (pointerInputChange3 == null) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                                List<PointerInputChange> changes2 = pointerEvent.getChanges();
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
                                PointerInputChange pointerInputChange4 = pointerInputChange2;
                                if (pointerInputChange4 != null) {
                                    longRef3.element = pointerInputChange4.getId();
                                    longRef = longRef3;
                                }
                            }
                            dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = longRef;
                            dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Ref.LongRef longRef4 = longRef;
                            obj = awaitPointerEvent$default;
                            longRef3 = longRef4;
                            PointerEvent pointerEvent2 = (PointerEvent) obj;
                            List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                            int size3 = changes3.size();
                            int i22 = 0;
                            int i32 = 0;
                            while (true) {
                                if (i32 < size3) {
                                }
                                i32++;
                            }
                            PointerInputChange pointerInputChange32 = pointerInputChange;
                            if (pointerInputChange32 == null) {
                                pointerInputChange32 = null;
                            }
                        }
                        if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                            return null;
                        }
                        return pointerInputChange32;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (m267isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitDragOrCancellation$1 = new DragGestureDetectorKt$awaitDragOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$2
                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m270invokek4lQ0M(long j) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m270invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }
            };
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        return detectDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$5(function1, function2, function02, function0, null), continuation);
        return forEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? forEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$2
                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m272invokek4lQ0M(long j) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m272invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }
            };
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        return detectDragGesturesAfterLongPress(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    public static final Object detectDragGesturesAfterLongPress(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(function1, function02, function0, function2, null), continuation);
        return forEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? forEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0120 -> B:17:0x016a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x015e -> B:11:0x0160). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0184 -> B:17:0x016a). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m263awaitVerticalTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
        int i;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        Ref.LongRef longRef;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
        float f;
        float f2;
        Ref.LongRef longRef2;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
        float f3;
        float f4;
        int size;
        int i2;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
                int i3 = 1;
                PointerEventPass pointerEventPass = null;
                if (i == 0) {
                    if (i == 1) {
                        float f5 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$1;
                        float f6 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                        Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                        Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$14 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                        f4 = f5;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$14;
                        f3 = f6;
                        function22 = function23;
                        longRef2 = longRef3;
                        PointerEvent pointerEvent = (PointerEvent) obj;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        int i4 = 0;
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                            }
                            i2++;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                            i3 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i3;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i3, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                        return null;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f7 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$1;
                    float f8 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
                    Ref.LongRef longRef4 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    f2 = f7;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    longRef2 = longRef4;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                    f = f8;
                    function22 = function24;
                    if (!pointerInputChange4.isConsumed()) {
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                        longRef = longRef2;
                        i3 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = pointerEventPass;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$1 = f2;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i3;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i3, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        float f9 = f;
                        f4 = f2;
                        obj = awaitPointerEvent$default;
                        longRef2 = longRef;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
                        f3 = f9;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                        size = changes2.size();
                        int i42 = 0;
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes2.get(i2);
                            if (PointerId.m2981equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                                break;
                            }
                            i2++;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                                int size2 = changes3.size();
                                while (true) {
                                    if (i42 >= size2) {
                                        pointerInputChange3 = null;
                                        break;
                                    }
                                    pointerInputChange3 = changes3.get(i42);
                                    if (pointerInputChange3.getPressed()) {
                                        break;
                                    }
                                    i42++;
                                }
                                PointerInputChange pointerInputChange5 = pointerInputChange3;
                                if (pointerInputChange5 != null) {
                                    longRef2.element = pointerInputChange5.getId();
                                    f2 = f4;
                                    f = f3;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                                    longRef = longRef2;
                                }
                            } else {
                                f2 = (Offset.m1393getYimpl(pointerInputChange2.getPosition()) - Offset.m1393getYimpl(pointerInputChange2.getPreviousPosition())) + f4;
                                if (Math.abs(f2) < f3) {
                                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$0 = function22;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$2 = longRef2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$3 = pointerInputChange2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.F$0 = f3;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.F$1 = f2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    f = f3;
                                    pointerInputChange4 = pointerInputChange2;
                                    if (!pointerInputChange4.isConsumed()) {
                                    }
                                } else {
                                    function22.invoke(pointerInputChange2, Boxing.boxFloat(f2 - (Math.signum(f2) * f3)));
                                    if (pointerInputChange2.isConsumed()) {
                                        return pointerInputChange2;
                                    }
                                    f = f3;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                                    longRef = longRef2;
                                    f2 = 0.0f;
                                }
                            }
                            i3 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i3;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i3, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                int m3072getTouchT8wyACA = PointerType.INSTANCE.m3072getTouchT8wyACA();
                if (m267isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m268pointerSlopE8SPZFQ = m268pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m3072getTouchT8wyACA);
                Ref.LongRef longRef5 = new Ref.LongRef();
                longRef5.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                longRef = longRef5;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                f = m268pointerSlopE8SPZFQ;
                f2 = 0.0f;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = pointerEventPass;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$1 = f2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i3;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i3, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
        int i32 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x011c -> B:17:0x0166). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x015a -> B:11:0x015c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0180 -> B:17:0x0166). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m262awaitVerticalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
        int i2;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        Ref.LongRef longRef;
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
        float f;
        float f2;
        Ref.LongRef longRef2;
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
        float f3;
        float f4;
        int size;
        int i3;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
                int i4 = 1;
                PointerEventPass pointerEventPass = null;
                if (i2 == 0) {
                    if (i2 == 1) {
                        float f5 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$1;
                        float f6 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                        Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                        Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$14 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                        f4 = f5;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$14;
                        f3 = f6;
                        function22 = function23;
                        longRef2 = longRef3;
                        PointerEvent pointerEvent = (PointerEvent) obj;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        int i5 = 0;
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                            }
                            i3++;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                            i4 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i4;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i4, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                        return null;
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f7 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$1;
                    float f8 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                    Ref.LongRef longRef4 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    f2 = f7;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    longRef2 = longRef4;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                    f = f8;
                    function22 = function24;
                    if (!pointerInputChange4.isConsumed()) {
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
                        longRef = longRef2;
                        i4 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = longRef;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$1 = f2;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i4;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i4, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        float f9 = f;
                        f4 = f2;
                        obj = awaitPointerEvent$default;
                        longRef2 = longRef;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                        f3 = f9;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                        size = changes2.size();
                        int i52 = 0;
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes2.get(i3);
                            if (PointerId.m2981equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                                break;
                            }
                            i3++;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
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
                                PointerInputChange pointerInputChange5 = pointerInputChange3;
                                if (pointerInputChange5 != null) {
                                    longRef2.element = pointerInputChange5.getId();
                                    f2 = f4;
                                    f = f3;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
                                    longRef = longRef2;
                                }
                            } else {
                                f2 = (Offset.m1393getYimpl(pointerInputChange2.getPosition()) - Offset.m1393getYimpl(pointerInputChange2.getPreviousPosition())) + f4;
                                if (Math.abs(f2) < f3) {
                                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.L$0 = function22;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.L$2 = longRef2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.L$3 = pointerInputChange2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.F$0 = f3;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.F$1 = f2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    f = f3;
                                    pointerInputChange4 = pointerInputChange2;
                                    if (!pointerInputChange4.isConsumed()) {
                                    }
                                } else {
                                    function22.invoke(pointerInputChange2, Boxing.boxFloat(f2 - (Math.signum(f2) * f3)));
                                    if (pointerInputChange2.isConsumed()) {
                                        return pointerInputChange2;
                                    }
                                    f = f3;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
                                    longRef = longRef2;
                                    f2 = 0.0f;
                                }
                            }
                            i4 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i4;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i4, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                if (m267isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m268pointerSlopE8SPZFQ = m268pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                Ref.LongRef longRef5 = new Ref.LongRef();
                longRef5.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                longRef = longRef5;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                f = m268pointerSlopE8SPZFQ;
                f2 = 0.0f;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = longRef;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$1 = f2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i4, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
        int i42 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        if ((androidx.compose.ui.geometry.Offset.m1393getYimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r13)) == 0.0f) == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x007f -> B:10:0x0084). Please report as a decompilation issue!!! */
    /* renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m269verticalDragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$1;
        int i;
        long j2;
        AwaitPointerEventScope awaitPointerEventScope2;
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$12;
        Function1<? super PointerInputChange, Unit> function12;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object awaitPointerEvent$default;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$verticalDrag$1) {
            dragGestureDetectorKt$verticalDrag$1 = (DragGestureDetectorKt$verticalDrag$1) continuation;
            if ((dragGestureDetectorKt$verticalDrag$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$verticalDrag$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$verticalDrag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$verticalDrag$1.label;
                int i2 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    j2 = j;
                    if (m267isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        return Boxing.boxBoolean(false);
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                    function12 = function1;
                    longRef = new Ref.LongRef();
                    longRef.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                    dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$verticalDrag$12.L$2 = awaitPointerEventScope3;
                    dragGestureDetectorKt$verticalDrag$12.L$3 = longRef;
                    dragGestureDetectorKt$verticalDrag$12.label = i2;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$verticalDrag$12, i2, null);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                } else if (i == 1) {
                    Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$verticalDrag$1.L$3;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.L$1;
                    Function1<? super PointerInputChange, Unit> function13 = (Function1) dragGestureDetectorKt$verticalDrag$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                    function12 = function13;
                    longRef = longRef2;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
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
                        if (PointerId.m2981equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                            break;
                        }
                        i3++;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
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
                            PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                longRef.element = pointerInputChange4.getId();
                                awaitPointerEventScope3 = awaitPointerEventScope4;
                                i2 = 1;
                                awaitPointerEventScope2 = awaitPointerEventScope5;
                                dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                                dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                                dragGestureDetectorKt$verticalDrag$12.L$2 = awaitPointerEventScope3;
                                dragGestureDetectorKt$verticalDrag$12.L$3 = longRef;
                                dragGestureDetectorKt$verticalDrag$12.label = i2;
                                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$verticalDrag$12, i2, null);
                                if (awaitPointerEvent$default == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                awaitPointerEventScope5 = awaitPointerEventScope2;
                                obj = awaitPointerEvent$default;
                            }
                        }
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i32 = 0;
                        while (true) {
                            if (i32 < size3) {
                            }
                            i32++;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                        }
                        PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                    if (pointerInputChange32 != null) {
                        if (pointerInputChange32.isConsumed()) {
                            return Boxing.boxBoolean(false);
                        }
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange32)) {
                            return Boxing.boxBoolean(true);
                        }
                        function12.invoke(pointerInputChange32);
                        i2 = 1;
                        awaitPointerEventScope2 = awaitPointerEventScope5;
                        j2 = pointerInputChange32.getId();
                        longRef = new Ref.LongRef();
                        longRef.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                        dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$verticalDrag$12.L$2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$verticalDrag$12.L$3 = longRef;
                        dragGestureDetectorKt$verticalDrag$12.label = i2;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$verticalDrag$12, i2, null);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    } else {
                        return Boxing.boxBoolean(false);
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        dragGestureDetectorKt$verticalDrag$1 = new DragGestureDetectorKt$verticalDrag$1(continuation);
        Object obj2 = dragGestureDetectorKt$verticalDrag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$verticalDrag$1.label;
        int i22 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
    
        if ((androidx.compose.ui.geometry.Offset.m1393getYimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0068 -> B:10:0x006d). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m261awaitVerticalDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 dragGestureDetectorKt$awaitVerticalDragOrCancellation$1;
        int i;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object awaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
                if (i == 0) {
                    if (i == 1) {
                        Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        Ref.LongRef longRef3 = longRef2;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        PointerEvent pointerEvent = (PointerEvent) obj;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        int size = changes.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes.get(i2);
                            if (PointerId.m2981equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                                break;
                            }
                            i2++;
                        }
                        PointerInputChange pointerInputChange3 = pointerInputChange;
                        if (pointerInputChange3 == null) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                                List<PointerInputChange> changes2 = pointerEvent.getChanges();
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
                                PointerInputChange pointerInputChange4 = pointerInputChange2;
                                if (pointerInputChange4 != null) {
                                    longRef3.element = pointerInputChange4.getId();
                                    longRef = longRef3;
                                }
                            }
                            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = longRef;
                            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Ref.LongRef longRef4 = longRef;
                            obj = awaitPointerEvent$default;
                            longRef3 = longRef4;
                            PointerEvent pointerEvent2 = (PointerEvent) obj;
                            List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                            int size3 = changes3.size();
                            int i22 = 0;
                            while (true) {
                                if (i22 < size3) {
                                }
                                i22++;
                            }
                            PointerInputChange pointerInputChange32 = pointerInputChange;
                            if (pointerInputChange32 == null) {
                                pointerInputChange32 = null;
                            }
                        }
                        if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                            return null;
                        }
                        return pointerInputChange32;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (m267isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$2
                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m274invokek4lQ0M(long j) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m274invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }
            };
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        return detectVerticalDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    public static final Object detectVerticalDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new DragGestureDetectorKt$detectVerticalDragGestures$5(function1, function2, function0, function02, null), continuation);
        return forEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? forEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0120 -> B:17:0x016a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x015e -> B:11:0x0160). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0184 -> B:17:0x016a). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m257awaitHorizontalTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
        int i;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        Ref.LongRef longRef;
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
        float f;
        float f2;
        Ref.LongRef longRef2;
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
        float f3;
        float f4;
        int size;
        int i2;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
                int i3 = 1;
                PointerEventPass pointerEventPass = null;
                if (i == 0) {
                    if (i == 1) {
                        float f5 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$1;
                        float f6 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                        Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                        Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$14 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                        f4 = f5;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$14;
                        f3 = f6;
                        function22 = function23;
                        longRef2 = longRef3;
                        PointerEvent pointerEvent = (PointerEvent) obj;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        int i4 = 0;
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                            }
                            i2++;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                            i3 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i3;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i3, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                        return null;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f7 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$1;
                    float f8 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3;
                    Ref.LongRef longRef4 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    f2 = f7;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    longRef2 = longRef4;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                    f = f8;
                    function22 = function24;
                    if (!pointerInputChange4.isConsumed()) {
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                        longRef = longRef2;
                        i3 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = longRef;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = pointerEventPass;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$1 = f2;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i3;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i3, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        float f9 = f;
                        f4 = f2;
                        obj = awaitPointerEvent$default;
                        longRef2 = longRef;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
                        f3 = f9;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                        size = changes2.size();
                        int i42 = 0;
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes2.get(i2);
                            if (PointerId.m2981equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                                break;
                            }
                            i2++;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                                int size2 = changes3.size();
                                while (true) {
                                    if (i42 >= size2) {
                                        pointerInputChange3 = null;
                                        break;
                                    }
                                    pointerInputChange3 = changes3.get(i42);
                                    if (pointerInputChange3.getPressed()) {
                                        break;
                                    }
                                    i42++;
                                }
                                PointerInputChange pointerInputChange5 = pointerInputChange3;
                                if (pointerInputChange5 != null) {
                                    longRef2.element = pointerInputChange5.getId();
                                    f2 = f4;
                                    f = f3;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                                    longRef = longRef2;
                                }
                            } else {
                                f2 = (Offset.m1392getXimpl(pointerInputChange2.getPosition()) - Offset.m1392getXimpl(pointerInputChange2.getPreviousPosition())) + f4;
                                if (Math.abs(f2) < f3) {
                                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$0 = function22;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$2 = longRef2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$3 = pointerInputChange2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.F$0 = f3;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.F$1 = f2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    f = f3;
                                    pointerInputChange4 = pointerInputChange2;
                                    if (!pointerInputChange4.isConsumed()) {
                                    }
                                } else {
                                    function22.invoke(pointerInputChange2, Boxing.boxFloat(f2 - (Math.signum(f2) * f3)));
                                    if (pointerInputChange2.isConsumed()) {
                                        return pointerInputChange2;
                                    }
                                    f = f3;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                                    longRef = longRef2;
                                    f2 = 0.0f;
                                }
                            }
                            i3 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i3;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i3, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                int m3072getTouchT8wyACA = PointerType.INSTANCE.m3072getTouchT8wyACA();
                if (m267isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m268pointerSlopE8SPZFQ = m268pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m3072getTouchT8wyACA);
                Ref.LongRef longRef5 = new Ref.LongRef();
                longRef5.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                longRef = longRef5;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                f = m268pointerSlopE8SPZFQ;
                f2 = 0.0f;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = longRef;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = pointerEventPass;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$1 = f2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i3;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i3, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
        int i32 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x011c -> B:17:0x0166). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x015a -> B:11:0x015c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0180 -> B:17:0x0166). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m256awaitHorizontalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
        int i2;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        Ref.LongRef longRef;
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
        float f;
        float f2;
        Ref.LongRef longRef2;
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
        float f3;
        float f4;
        int size;
        int i3;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
                int i4 = 1;
                PointerEventPass pointerEventPass = null;
                if (i2 == 0) {
                    if (i2 == 1) {
                        float f5 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$1;
                        float f6 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                        Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                        Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$14 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                        f4 = f5;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$14;
                        f3 = f6;
                        function22 = function23;
                        longRef2 = longRef3;
                        PointerEvent pointerEvent = (PointerEvent) obj;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        int i5 = 0;
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                            }
                            i3++;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                            i4 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i4;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i4, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                        return null;
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f7 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$1;
                    float f8 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                    Ref.LongRef longRef4 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    f2 = f7;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    longRef2 = longRef4;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                    f = f8;
                    function22 = function24;
                    if (!pointerInputChange4.isConsumed()) {
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
                        longRef = longRef2;
                        i4 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = longRef;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i4;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i4, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        float f9 = f;
                        f4 = f2;
                        obj = awaitPointerEvent$default;
                        longRef2 = longRef;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                        f3 = f9;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                        size = changes2.size();
                        int i52 = 0;
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes2.get(i3);
                            if (PointerId.m2981equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                                break;
                            }
                            i3++;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
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
                                PointerInputChange pointerInputChange5 = pointerInputChange3;
                                if (pointerInputChange5 != null) {
                                    longRef2.element = pointerInputChange5.getId();
                                    f2 = f4;
                                    f = f3;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
                                    longRef = longRef2;
                                }
                            } else {
                                f2 = (Offset.m1392getXimpl(pointerInputChange2.getPosition()) - Offset.m1392getXimpl(pointerInputChange2.getPreviousPosition())) + f4;
                                if (Math.abs(f2) < f3) {
                                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.L$0 = function22;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.L$2 = longRef2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.L$3 = pointerInputChange2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.F$0 = f3;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.F$1 = f2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    f = f3;
                                    pointerInputChange4 = pointerInputChange2;
                                    if (!pointerInputChange4.isConsumed()) {
                                    }
                                } else {
                                    function22.invoke(pointerInputChange2, Boxing.boxFloat(f2 - (Math.signum(f2) * f3)));
                                    if (pointerInputChange2.isConsumed()) {
                                        return pointerInputChange2;
                                    }
                                    f = f3;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
                                    longRef = longRef2;
                                    f2 = 0.0f;
                                }
                            }
                            i4 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i4;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i4, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                if (m267isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m268pointerSlopE8SPZFQ = m268pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                Ref.LongRef longRef5 = new Ref.LongRef();
                longRef5.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                longRef = longRef5;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                f = m268pointerSlopE8SPZFQ;
                f2 = 0.0f;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = longRef;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i4, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
        int i42 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        if ((androidx.compose.ui.geometry.Offset.m1392getXimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r13)) == 0.0f) == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x007f -> B:10:0x0084). Please report as a decompilation issue!!! */
    /* renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m266horizontalDragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$1;
        int i;
        long j2;
        AwaitPointerEventScope awaitPointerEventScope2;
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$12;
        Function1<? super PointerInputChange, Unit> function12;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object awaitPointerEvent$default;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$horizontalDrag$1) {
            dragGestureDetectorKt$horizontalDrag$1 = (DragGestureDetectorKt$horizontalDrag$1) continuation;
            if ((dragGestureDetectorKt$horizontalDrag$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$horizontalDrag$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$horizontalDrag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$horizontalDrag$1.label;
                int i2 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    j2 = j;
                    if (m267isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        return Boxing.boxBoolean(false);
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                    function12 = function1;
                    longRef = new Ref.LongRef();
                    longRef.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                    dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$horizontalDrag$12.L$2 = awaitPointerEventScope3;
                    dragGestureDetectorKt$horizontalDrag$12.L$3 = longRef;
                    dragGestureDetectorKt$horizontalDrag$12.label = i2;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$horizontalDrag$12, i2, null);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                } else if (i == 1) {
                    Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$horizontalDrag$1.L$3;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$1;
                    Function1<? super PointerInputChange, Unit> function13 = (Function1) dragGestureDetectorKt$horizontalDrag$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                    function12 = function13;
                    longRef = longRef2;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
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
                        if (PointerId.m2981equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                            break;
                        }
                        i3++;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
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
                            PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                longRef.element = pointerInputChange4.getId();
                                awaitPointerEventScope3 = awaitPointerEventScope4;
                                i2 = 1;
                                awaitPointerEventScope2 = awaitPointerEventScope5;
                                dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                                dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                                dragGestureDetectorKt$horizontalDrag$12.L$2 = awaitPointerEventScope3;
                                dragGestureDetectorKt$horizontalDrag$12.L$3 = longRef;
                                dragGestureDetectorKt$horizontalDrag$12.label = i2;
                                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$horizontalDrag$12, i2, null);
                                if (awaitPointerEvent$default == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                awaitPointerEventScope5 = awaitPointerEventScope2;
                                obj = awaitPointerEvent$default;
                            }
                        }
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i32 = 0;
                        while (true) {
                            if (i32 < size3) {
                            }
                            i32++;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                        }
                        PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                    if (pointerInputChange32 != null) {
                        if (pointerInputChange32.isConsumed()) {
                            return Boxing.boxBoolean(false);
                        }
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange32)) {
                            return Boxing.boxBoolean(true);
                        }
                        function12.invoke(pointerInputChange32);
                        i2 = 1;
                        awaitPointerEventScope2 = awaitPointerEventScope5;
                        j2 = pointerInputChange32.getId();
                        longRef = new Ref.LongRef();
                        longRef.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                        dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$horizontalDrag$12.L$2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$horizontalDrag$12.L$3 = longRef;
                        dragGestureDetectorKt$horizontalDrag$12.label = i2;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$horizontalDrag$12, i2, null);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    } else {
                        return Boxing.boxBoolean(false);
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        dragGestureDetectorKt$horizontalDrag$1 = new DragGestureDetectorKt$horizontalDrag$1(continuation);
        Object obj2 = dragGestureDetectorKt$horizontalDrag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$horizontalDrag$1.label;
        int i22 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
    
        if ((androidx.compose.ui.geometry.Offset.m1392getXimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0068 -> B:10:0x006d). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m255awaitHorizontalDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;
        int i;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object awaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
                if (i == 0) {
                    if (i == 1) {
                        Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        Ref.LongRef longRef3 = longRef2;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        PointerEvent pointerEvent = (PointerEvent) obj;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        int size = changes.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes.get(i2);
                            if (PointerId.m2981equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                                break;
                            }
                            i2++;
                        }
                        PointerInputChange pointerInputChange3 = pointerInputChange;
                        if (pointerInputChange3 == null) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                                List<PointerInputChange> changes2 = pointerEvent.getChanges();
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
                                PointerInputChange pointerInputChange4 = pointerInputChange2;
                                if (pointerInputChange4 != null) {
                                    longRef3.element = pointerInputChange4.getId();
                                    longRef = longRef3;
                                }
                            }
                            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1 = longRef;
                            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = 1;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Ref.LongRef longRef4 = longRef;
                            obj = awaitPointerEvent$default;
                            longRef3 = longRef4;
                            PointerEvent pointerEvent2 = (PointerEvent) obj;
                            List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                            int size3 = changes3.size();
                            int i22 = 0;
                            while (true) {
                                if (i22 < size3) {
                                }
                                i22++;
                            }
                            PointerInputChange pointerInputChange32 = pointerInputChange;
                            if (pointerInputChange32 == null) {
                                pointerInputChange32 = null;
                            }
                        }
                        if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                            return null;
                        }
                        return pointerInputChange32;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (m267isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$2
                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m273invokek4lQ0M(long j) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m273invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }
            };
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        return detectHorizontalDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    public static final Object detectHorizontalDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new DragGestureDetectorKt$detectHorizontalDragGestures$5(function1, function2, function0, function02, null), continuation);
        return forEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? forEachGesture : Unit.INSTANCE;
    }

    /* renamed from: drag-VnAYq1g, reason: not valid java name */
    private static final Object m264dragVnAYq1g(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Function1<? super PointerInputChange, Float> function12, Function1<? super PointerInputChange, Boolean> function13, Continuation<? super Boolean> continuation) {
        PointerInputChange pointerInputChange;
        long j2 = j;
        if (m267isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return false;
        }
        while (true) {
            InlineMarker.mark(0);
            PointerInputChange pointerInputChange2 = null;
            Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            InlineMarker.mark(1);
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i);
                if (PointerId.m2981equalsimpl0(pointerInputChange.getId(), j2)) {
                    break;
                }
                i++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 != null) {
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            break;
                        }
                        PointerInputChange pointerInputChange4 = changes2.get(i2);
                        if (pointerInputChange4.getPressed()) {
                            pointerInputChange2 = pointerInputChange4;
                            break;
                        }
                        i2++;
                    }
                    PointerInputChange pointerInputChange5 = pointerInputChange2;
                    if (pointerInputChange5 == null) {
                        pointerInputChange2 = pointerInputChange3;
                    } else {
                        j2 = pointerInputChange5.getId();
                    }
                } else {
                    if (function12.invoke(pointerInputChange3).floatValue() == 0.0f) {
                        continue;
                    } else {
                        pointerInputChange2 = pointerInputChange3;
                    }
                }
            }
            if (pointerInputChange2 == null || function13.invoke(pointerInputChange2).booleanValue()) {
                return false;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                return true;
            }
            function1.invoke(pointerInputChange2);
            j2 = pointerInputChange2.getId();
        }
    }

    /* renamed from: awaitDragOrUp-jO51t88, reason: not valid java name */
    private static final Object m254awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Boolean> function1, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        while (true) {
            int i = 0;
            InlineMarker.mark(0);
            PointerInputChange pointerInputChange2 = null;
            Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            InlineMarker.mark(1);
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                if (PointerId.m2981equalsimpl0(pointerInputChange.getId(), j)) {
                    break;
                }
                i2++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    PointerInputChange pointerInputChange4 = changes2.get(i);
                    if (pointerInputChange4.getPressed()) {
                        pointerInputChange2 = pointerInputChange4;
                        break;
                    }
                    i++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange2;
                if (pointerInputChange5 == null) {
                    return pointerInputChange3;
                }
                j = pointerInputChange5.getId();
            } else if (function1.invoke(pointerInputChange3).booleanValue()) {
                return pointerInputChange3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cc, code lost:
    
        r21.invoke(r15, java.lang.Float.valueOf(r8 - (java.lang.Math.signum(r8) * r3)));
     */
    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Object m259awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function1<? super Offset, Float> function1, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        long j2 = j;
        if (m267isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        float m268pointerSlopE8SPZFQ = m268pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        do {
            float f = 0.0f;
            while (true) {
                InlineMarker.mark(0);
                Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
                InlineMarker.mark(1);
                PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i2);
                    if (PointerId.m2981equalsimpl0(pointerInputChange.getId(), j2)) {
                        break;
                    }
                    i2++;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes2.get(i3);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i3++;
                        }
                        PointerInputChange pointerInputChange4 = pointerInputChange3;
                        if (pointerInputChange4 == null) {
                            return null;
                        }
                        j2 = pointerInputChange4.getId();
                    } else {
                        f += function1.invoke(Offset.m1381boximpl(pointerInputChange2.getPosition())).floatValue() - function1.invoke(Offset.m1381boximpl(pointerInputChange2.getPreviousPosition())).floatValue();
                        if (Math.abs(f) >= m268pointerSlopE8SPZFQ) {
                            break;
                        }
                        PointerEventPass pointerEventPass = PointerEventPass.Final;
                        InlineMarker.mark(0);
                        awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
                        InlineMarker.mark(1);
                        if (pointerInputChange2.isConsumed()) {
                            return null;
                        }
                    }
                } else {
                    return null;
                }
            }
        } while (!pointerInputChange2.isConsumed());
        return pointerInputChange2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6, types: [androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitLongPressOrCancellation(PointerInputScope pointerInputScope, PointerInputChange pointerInputChange, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        int i;
        Ref.ObjectRef objectRef;
        if (continuation instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitLongPressOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    objectRef3.element = pointerInputChange;
                    long longPressTimeoutMillis = pointerInputScope.getViewConfiguration().getLongPressTimeoutMillis();
                    try {
                        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(pointerInputScope, objectRef3, objectRef2, null);
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0 = pointerInputChange;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1 = objectRef2;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = 1;
                        if (TimeoutKt.withTimeout(longPressTimeoutMillis, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                        pointerInputChange = pointerInputChange;
                    } catch (TimeoutCancellationException unused) {
                        objectRef = objectRef2;
                        PointerInputChange pointerInputChange2 = (PointerInputChange) objectRef.element;
                        if (pointerInputChange2 != null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1;
                    pointerInputChange = (PointerInputChange) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        pointerInputChange = pointerInputChange;
                    } catch (TimeoutCancellationException unused2) {
                        PointerInputChange pointerInputChange22 = (PointerInputChange) objectRef.element;
                        return pointerInputChange22 != null ? pointerInputChange : pointerInputChange22;
                    }
                }
                return null;
            }
        }
        dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
        if (i != 0) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m267isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i);
            if (PointerId.m2981equalsimpl0(pointerInputChange.getId(), j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m268pointerSlopE8SPZFQ(ViewConfiguration pointerSlop, int i) {
        Intrinsics.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        return PointerType.m3065equalsimpl0(i, PointerType.INSTANCE.m3070getMouseT8wyACA()) ? pointerSlop.getTouchSlop() * mouseToTouchSlopRatio : pointerSlop.getTouchSlop();
    }

    static {
        float m3840constructorimpl = Dp.m3840constructorimpl((float) 0.125d);
        mouseSlop = m3840constructorimpl;
        float m3840constructorimpl2 = Dp.m3840constructorimpl(18);
        defaultTouchSlop = m3840constructorimpl2;
        mouseToTouchSlopRatio = m3840constructorimpl / m3840constructorimpl2;
    }
}
