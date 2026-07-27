package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\t\u001a\u00020\n*\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a%\u0010\u000f\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u0005*\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001aa\u0010\u0018\u001a\u00020\u0005*\u00020\u00192/\b\u0002\u0010\u001a\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001¢\u0006\u0002\b\u00072\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001cH\u0080@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a\u0091\u0001\u0010\u001e\u001a\u00020\u0005*\u00020\u00192\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001c2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001c2/\b\u0002\u0010\u001a\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001¢\u0006\u0002\b\u00072\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001cH\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010!\u001a\u0017\u0010\"\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0017\"=\u0010\u0000\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001¢\u0006\u0002\b\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"NoPressGesture", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function3;", "awaitFirstDown", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "requireUnconsumed", "", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFirstDownOnPass", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSecondDown", "firstUp", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumeUntilUp", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTapAndPress", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onPress", "onTap", "Lkotlin/Function1;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTapGestures", "onDoubleTap", "onLongPress", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForUpOrCancellation", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TapGestureDetectorKt {
    private static final Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> NoPressGesture = new TapGestureDetectorKt$NoPressGesture$1(null);

    public static /* synthetic */ Object detectTapGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function1 function12, Function3 function3, Function1 function13, Continuation continuation, int i, Object obj) {
        Function1 function14 = (i & 1) != 0 ? null : function1;
        Function1 function15 = (i & 2) != 0 ? null : function12;
        if ((i & 4) != 0) {
            function3 = NoPressGesture;
        }
        return detectTapGestures(pointerInputScope, function14, function15, function3, (i & 8) != 0 ? null : function13, continuation);
    }

    public static final Object detectTapGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function13, Continuation<? super Unit> continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new TapGestureDetectorKt$detectTapGestures$2(pointerInputScope, function3, function12, function1, function13, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[LOOP:0: B:11:0x0051->B:12:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object consumeUntilUp(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        TapGestureDetectorKt$consumeUntilUp$1 tapGestureDetectorKt$consumeUntilUp$1;
        int i;
        int size;
        int i2;
        int i3;
        int size2;
        if (continuation instanceof TapGestureDetectorKt$consumeUntilUp$1) {
            tapGestureDetectorKt$consumeUntilUp$1 = (TapGestureDetectorKt$consumeUntilUp$1) continuation;
            if ((tapGestureDetectorKt$consumeUntilUp$1.label & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$consumeUntilUp$1.label -= Integer.MIN_VALUE;
                Object obj = tapGestureDetectorKt$consumeUntilUp$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tapGestureDetectorKt$consumeUntilUp$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    tapGestureDetectorKt$consumeUntilUp$1.L$0 = awaitPointerEventScope;
                    tapGestureDetectorKt$consumeUntilUp$1.label = 1;
                    obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, tapGestureDetectorKt$consumeUntilUp$1, 1, null);
                    if (obj == coroutine_suspended) {
                    }
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (i3 < size) {
                    }
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    size2 = changes2.size();
                    while (i2 < size2) {
                    }
                    return Unit.INSTANCE;
                }
                if (i == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) tapGestureDetectorKt$consumeUntilUp$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                    size = changes3.size();
                    i2 = 0;
                    for (i3 = 0; i3 < size; i3++) {
                        changes3.get(i3).consume();
                    }
                    List<PointerInputChange> changes22 = pointerEvent2.getChanges();
                    size2 = changes22.size();
                    while (i2 < size2) {
                        if (changes22.get(i2).getPressed()) {
                            tapGestureDetectorKt$consumeUntilUp$1.L$0 = awaitPointerEventScope;
                            tapGestureDetectorKt$consumeUntilUp$1.label = 1;
                            obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, tapGestureDetectorKt$consumeUntilUp$1, 1, null);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            PointerEvent pointerEvent22 = (PointerEvent) obj;
                            List<PointerInputChange> changes32 = pointerEvent22.getChanges();
                            size = changes32.size();
                            i2 = 0;
                            while (i3 < size) {
                            }
                            List<PointerInputChange> changes222 = pointerEvent22.getChanges();
                            size2 = changes222.size();
                            while (i2 < size2) {
                            }
                        } else {
                            i2++;
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        tapGestureDetectorKt$consumeUntilUp$1 = new TapGestureDetectorKt$consumeUntilUp$1(continuation);
        Object obj2 = tapGestureDetectorKt$consumeUntilUp$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tapGestureDetectorKt$consumeUntilUp$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitSecondDown(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, Continuation<? super PointerInputChange> continuation) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange, null), continuation);
    }

    public static /* synthetic */ Object detectTapAndPress$default(PointerInputScope pointerInputScope, Function3 function3, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function3 = NoPressGesture;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        return detectTapAndPress(pointerInputScope, function3, function1, continuation);
    }

    public static final Object detectTapAndPress(PointerInputScope pointerInputScope, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function1, Continuation<? super Unit> continuation) {
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new TapGestureDetectorKt$detectTapAndPress$2(new PressGestureScopeImpl(pointerInputScope), function3, function1, null), continuation);
        return forEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? forEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return awaitFirstDown(awaitPointerEventScope, z, continuation);
    }

    public static final Object awaitFirstDown(AwaitPointerEventScope awaitPointerEventScope, boolean z, Continuation<? super PointerInputChange> continuation) {
        return awaitFirstDownOnPass(awaitPointerEventScope, PointerEventPass.Main, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004e -> B:10:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitFirstDownOnPass(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, boolean z, Continuation<? super PointerInputChange> continuation) {
        TapGestureDetectorKt$awaitFirstDownOnPass$1 tapGestureDetectorKt$awaitFirstDownOnPass$1;
        int i;
        int size;
        int i2;
        if (continuation instanceof TapGestureDetectorKt$awaitFirstDownOnPass$1) {
            tapGestureDetectorKt$awaitFirstDownOnPass$1 = (TapGestureDetectorKt$awaitFirstDownOnPass$1) continuation;
            if ((tapGestureDetectorKt$awaitFirstDownOnPass$1.label & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$awaitFirstDownOnPass$1.label -= Integer.MIN_VALUE;
                Object obj = tapGestureDetectorKt$awaitFirstDownOnPass$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tapGestureDetectorKt$awaitFirstDownOnPass$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    tapGestureDetectorKt$awaitFirstDownOnPass$1.L$0 = awaitPointerEventScope;
                    tapGestureDetectorKt$awaitFirstDownOnPass$1.L$1 = pointerEventPass;
                    tapGestureDetectorKt$awaitFirstDownOnPass$1.Z$0 = z;
                    tapGestureDetectorKt$awaitFirstDownOnPass$1.label = 1;
                    obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, tapGestureDetectorKt$awaitFirstDownOnPass$1);
                    if (obj == coroutine_suspended) {
                    }
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return pointerEvent.getChanges().get(0);
                }
                if (i == 1) {
                    boolean z2 = tapGestureDetectorKt$awaitFirstDownOnPass$1.Z$0;
                    pointerEventPass = (PointerEventPass) tapGestureDetectorKt$awaitFirstDownOnPass$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) tapGestureDetectorKt$awaitFirstDownOnPass$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    z = z2;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i2 = 0;
                    while (i2 < size) {
                        PointerInputChange pointerInputChange = changes2.get(i2);
                        if (z ? PointerEventKt.changedToDown(pointerInputChange) : PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                            i2++;
                        } else {
                            tapGestureDetectorKt$awaitFirstDownOnPass$1.L$0 = awaitPointerEventScope;
                            tapGestureDetectorKt$awaitFirstDownOnPass$1.L$1 = pointerEventPass;
                            tapGestureDetectorKt$awaitFirstDownOnPass$1.Z$0 = z;
                            tapGestureDetectorKt$awaitFirstDownOnPass$1.label = 1;
                            obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, tapGestureDetectorKt$awaitFirstDownOnPass$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            PointerEvent pointerEvent22 = (PointerEvent) obj;
                            List<PointerInputChange> changes22 = pointerEvent22.getChanges();
                            size = changes22.size();
                            i2 = 0;
                            while (i2 < size) {
                            }
                        }
                    }
                    return pointerEvent22.getChanges().get(0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        tapGestureDetectorKt$awaitFirstDownOnPass$1 = new TapGestureDetectorKt$awaitFirstDownOnPass$1(continuation);
        Object obj2 = tapGestureDetectorKt$awaitFirstDownOnPass$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tapGestureDetectorKt$awaitFirstDownOnPass$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a1 -> B:11:0x00a4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object waitForUpOrCancellation(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super PointerInputChange> continuation) {
        TapGestureDetectorKt$waitForUpOrCancellation$1 tapGestureDetectorKt$waitForUpOrCancellation$1;
        int i;
        int size;
        int i2;
        if (continuation instanceof TapGestureDetectorKt$waitForUpOrCancellation$1) {
            tapGestureDetectorKt$waitForUpOrCancellation$1 = (TapGestureDetectorKt$waitForUpOrCancellation$1) continuation;
            if ((tapGestureDetectorKt$waitForUpOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$waitForUpOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = tapGestureDetectorKt$waitForUpOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tapGestureDetectorKt$waitForUpOrCancellation$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerEventPass pointerEventPass = PointerEventPass.Main;
                    tapGestureDetectorKt$waitForUpOrCancellation$1.L$0 = awaitPointerEventScope;
                    tapGestureDetectorKt$waitForUpOrCancellation$1.label = 1;
                    obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, tapGestureDetectorKt$waitForUpOrCancellation$1);
                    if (obj == coroutine_suspended) {
                    }
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return pointerEvent.getChanges().get(0);
                }
                if (i == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) tapGestureDetectorKt$waitForUpOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return pointerEvent2.getChanges().get(0);
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                awaitPointerEventScope = (AwaitPointerEventScope) tapGestureDetectorKt$waitForUpOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj);
                List<PointerInputChange> changes3 = ((PointerEvent) obj).getChanges();
                int size2 = changes3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (changes3.get(i3).isConsumed()) {
                        return null;
                    }
                }
                PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                tapGestureDetectorKt$waitForUpOrCancellation$1.L$0 = awaitPointerEventScope;
                tapGestureDetectorKt$waitForUpOrCancellation$1.label = 1;
                obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                PointerEvent pointerEvent22 = (PointerEvent) obj;
                List<PointerInputChange> changes22 = pointerEvent22.getChanges();
                size = changes22.size();
                i2 = 0;
                while (i2 < size) {
                    if (PointerEventKt.changedToUp(changes22.get(i2))) {
                        i2++;
                    } else {
                        List<PointerInputChange> changes4 = pointerEvent22.getChanges();
                        int size3 = changes4.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            PointerInputChange pointerInputChange = changes4.get(i4);
                            if (pointerInputChange.isConsumed() || PointerEventKt.m2944isOutOfBoundsjwHxaWs(pointerInputChange, awaitPointerEventScope.mo2912getSizeYbymL2g(), awaitPointerEventScope.mo2911getExtendedTouchPaddingNHjbRc())) {
                                break;
                            }
                        }
                        PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                        tapGestureDetectorKt$waitForUpOrCancellation$1.L$0 = awaitPointerEventScope;
                        tapGestureDetectorKt$waitForUpOrCancellation$1.label = 2;
                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass3, tapGestureDetectorKt$waitForUpOrCancellation$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        List<PointerInputChange> changes32 = ((PointerEvent) obj).getChanges();
                        int size22 = changes32.size();
                        while (i3 < size22) {
                        }
                        PointerEventPass pointerEventPass22 = PointerEventPass.Main;
                        tapGestureDetectorKt$waitForUpOrCancellation$1.L$0 = awaitPointerEventScope;
                        tapGestureDetectorKt$waitForUpOrCancellation$1.label = 1;
                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass22, tapGestureDetectorKt$waitForUpOrCancellation$1);
                        if (obj == coroutine_suspended) {
                        }
                        PointerEvent pointerEvent222 = (PointerEvent) obj;
                        List<PointerInputChange> changes222 = pointerEvent222.getChanges();
                        size = changes222.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    }
                }
                return pointerEvent222.getChanges().get(0);
            }
        }
        tapGestureDetectorKt$waitForUpOrCancellation$1 = new TapGestureDetectorKt$waitForUpOrCancellation$1(continuation);
        Object obj2 = tapGestureDetectorKt$waitForUpOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tapGestureDetectorKt$waitForUpOrCancellation$1.label;
        if (i != 0) {
        }
    }
}
