package androidx.compose.foundation.gestures;

/* compiled from: TapGestureDetector.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0087@¢\u0006\u0002\u0010\u000e\u001a&\u0010\t\u001a\u00020\n*\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011\u001a\u001c\u0010\u0012\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010\u0014\u001a\u0012\u0010\u0015\u001a\u00020\u0005*\u00020\u000bH\u0082@¢\u0006\u0002\u0010\u0016\u001a[\u0010\u0017\u001a\u00020\u0005*\u00020\u00182/\b\u0002\u0010\u0019\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001¢\u0006\u0002\b\u00072\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001bH\u0080@¢\u0006\u0002\u0010\u001c\u001a\u008b\u0001\u0010\u001d\u001a\u00020\u0005*\u00020\u00182\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001b2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001b2/\b\u0002\u0010\u0019\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001¢\u0006\u0002\b\u00072\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001bH\u0086@¢\u0006\u0002\u0010 \u001a\u0014\u0010!\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0087@¢\u0006\u0002\u0010\u0016\u001a\u001e\u0010!\u001a\u0004\u0018\u00010\n*\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\"\"7\u0010\u0000\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001¢\u0006\u0002\b\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006#"}, d2 = {"NoPressGesture", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function3;", "awaitFirstDown", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "requireUnconsumed", "", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSecondDown", "firstUp", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumeUntilUp", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTapAndPress", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onPress", "onTap", "Lkotlin/Function1;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTapGestures", "onDoubleTap", "onLongPress", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForUpOrCancellation", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TapGestureDetectorKt {
    private static final kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> NoPressGesture = new androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1(null);

    public static /* synthetic */ java.lang.Object detectTapGestures$default(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function1 function13, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        kotlin.jvm.functions.Function1 function14 = (i & 1) != 0 ? null : function1;
        kotlin.jvm.functions.Function1 function15 = (i & 2) != 0 ? null : function12;
        if ((i & 4) != 0) {
            function3 = NoPressGesture;
        }
        return detectTapGestures(pointerInputScope, function14, function15, function3, (i & 8) != 0 ? null : function13, continuation);
    }

    public static final java.lang.Object detectTapGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function12, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.gestures.PressGestureScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function13, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2(pointerInputScope, function3, function12, function1, function13, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
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
    public static final java.lang.Object consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 tapGestureDetectorKt$consumeUntilUp$1;
        int i;
        int size;
        int i2;
        int i3;
        int size2;
        if (continuation instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) {
            tapGestureDetectorKt$consumeUntilUp$1 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) continuation;
            if ((tapGestureDetectorKt$consumeUntilUp$1.label & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$consumeUntilUp$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = tapGestureDetectorKt$consumeUntilUp$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tapGestureDetectorKt$consumeUntilUp$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    tapGestureDetectorKt$consumeUntilUp$1.L$0 = awaitPointerEventScope;
                    tapGestureDetectorKt$consumeUntilUp$1.label = 1;
                    obj = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, tapGestureDetectorKt$consumeUntilUp$1, 1, null);
                    if (obj == coroutine_suspended) {
                    }
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (i3 < size) {
                    }
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                    size2 = changes2.size();
                    while (i2 < size2) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) tapGestureDetectorKt$consumeUntilUp$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                size = changes3.size();
                i2 = 0;
                for (i3 = 0; i3 < size; i3++) {
                    changes3.get(i3).consume();
                }
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes22 = pointerEvent2.getChanges();
                size2 = changes22.size();
                while (i2 < size2) {
                    if (changes22.get(i2).getPressed()) {
                        tapGestureDetectorKt$consumeUntilUp$1.L$0 = awaitPointerEventScope;
                        tapGestureDetectorKt$consumeUntilUp$1.label = 1;
                        obj = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, tapGestureDetectorKt$consumeUntilUp$1, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent22 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes32 = pointerEvent22.getChanges();
                        size = changes32.size();
                        i2 = 0;
                        while (i3 < size) {
                        }
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes222 = pointerEvent22.getChanges();
                        size2 = changes222.size();
                        while (i2 < size2) {
                        }
                    } else {
                        i2++;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        tapGestureDetectorKt$consumeUntilUp$1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1(continuation);
        java.lang.Object obj2 = tapGestureDetectorKt$consumeUntilUp$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tapGestureDetectorKt$consumeUntilUp$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object awaitSecondDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange, null), continuation);
    }

    public static /* synthetic */ java.lang.Object detectTapAndPress$default(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function3 = NoPressGesture;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        return detectTapAndPress(pointerInputScope, function3, function1, continuation);
    }

    public static final java.lang.Object detectTapAndPress(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.gestures.PressGestureScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2(pointerInputScope, function3, function1, new androidx.compose.foundation.gestures.PressGestureScopeImpl(pointerInputScope), null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object awaitFirstDown$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return awaitFirstDown(awaitPointerEventScope, z, continuation);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with PointerEventPass instead.")
    public static final /* synthetic */ java.lang.Object awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, boolean z, kotlin.coroutines.Continuation continuation) {
        return awaitFirstDown(awaitPointerEventScope, z, androidx.compose.ui.input.pointer.PointerEventPass.Main, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004f -> B:10:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, boolean z, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 tapGestureDetectorKt$awaitFirstDown$2;
        int i;
        int size;
        int i2;
        if (continuation instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) {
            tapGestureDetectorKt$awaitFirstDown$2 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) continuation;
            if ((tapGestureDetectorKt$awaitFirstDown$2.label & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$awaitFirstDown$2.label -= Integer.MIN_VALUE;
                java.lang.Object obj = tapGestureDetectorKt$awaitFirstDown$2.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tapGestureDetectorKt$awaitFirstDown$2.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    tapGestureDetectorKt$awaitFirstDown$2.L$0 = awaitPointerEventScope;
                    tapGestureDetectorKt$awaitFirstDown$2.L$1 = pointerEventPass;
                    tapGestureDetectorKt$awaitFirstDown$2.Z$0 = z;
                    tapGestureDetectorKt$awaitFirstDown$2.label = 1;
                    obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, tapGestureDetectorKt$awaitFirstDown$2);
                    if (obj == coroutine_suspended) {
                    }
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return pointerEvent.getChanges().get(0);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z2 = tapGestureDetectorKt$awaitFirstDown$2.Z$0;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = (androidx.compose.ui.input.pointer.PointerEventPass) tapGestureDetectorKt$awaitFirstDown$2.L$1;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) tapGestureDetectorKt$awaitFirstDown$2.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                z = z2;
                awaitPointerEventScope = awaitPointerEventScope2;
                pointerEventPass = pointerEventPass2;
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                size = changes2.size();
                i2 = 0;
                while (i2 < size) {
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes2.get(i2);
                    if (z ? androidx.compose.ui.input.pointer.PointerEventKt.changedToDown(pointerInputChange) : androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                        i2++;
                    } else {
                        tapGestureDetectorKt$awaitFirstDown$2.L$0 = awaitPointerEventScope;
                        tapGestureDetectorKt$awaitFirstDown$2.L$1 = pointerEventPass;
                        tapGestureDetectorKt$awaitFirstDown$2.Z$0 = z;
                        tapGestureDetectorKt$awaitFirstDown$2.label = 1;
                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, tapGestureDetectorKt$awaitFirstDown$2);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent22 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes22 = pointerEvent22.getChanges();
                        size = changes22.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    }
                }
                return pointerEvent22.getChanges().get(0);
            }
        }
        tapGestureDetectorKt$awaitFirstDown$2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2(continuation);
        java.lang.Object obj2 = tapGestureDetectorKt$awaitFirstDown$2.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tapGestureDetectorKt$awaitFirstDown$2.label;
        if (i != 0) {
        }
    }

    public static /* synthetic */ java.lang.Object awaitFirstDown$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, boolean z, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Main;
        }
        return awaitFirstDown(awaitPointerEventScope, z, pointerEventPass, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c1 -> B:11:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$2;
        int i;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$22;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass3;
        int size;
        int i2;
        java.lang.Object awaitPointerEvent;
        if (continuation instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2) {
            tapGestureDetectorKt$waitForUpOrCancellation$2 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2) continuation;
            if ((tapGestureDetectorKt$waitForUpOrCancellation$2.label & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$waitForUpOrCancellation$2.label -= Integer.MIN_VALUE;
                java.lang.Object obj = tapGestureDetectorKt$waitForUpOrCancellation$2.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tapGestureDetectorKt$waitForUpOrCancellation$2.label;
                if (i == 0) {
                    if (i == 1) {
                        pointerEventPass3 = (androidx.compose.ui.input.pointer.PointerEventPass) tapGestureDetectorKt$waitForUpOrCancellation$2.L$1;
                        awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) tapGestureDetectorKt$waitForUpOrCancellation$2.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        while (i2 < size) {
                        }
                        return pointerEvent.getChanges().get(0);
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pointerEventPass3 = (androidx.compose.ui.input.pointer.PointerEventPass) tapGestureDetectorKt$waitForUpOrCancellation$2.L$1;
                    awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) tapGestureDetectorKt$waitForUpOrCancellation$2.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass4 = pointerEventPass3;
                    tapGestureDetectorKt$waitForUpOrCancellation$22 = tapGestureDetectorKt$waitForUpOrCancellation$2;
                    pointerEventPass2 = pointerEventPass4;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = ((androidx.compose.ui.input.pointer.PointerEvent) obj).getChanges();
                    int size2 = changes2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        if (changes2.get(i3).isConsumed()) {
                            return null;
                        }
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    tapGestureDetectorKt$waitForUpOrCancellation$22.L$0 = awaitPointerEventScope2;
                    tapGestureDetectorKt$waitForUpOrCancellation$22.L$1 = pointerEventPass2;
                    tapGestureDetectorKt$waitForUpOrCancellation$22.label = 1;
                    awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$22);
                    if (awaitPointerEvent == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    obj = awaitPointerEvent;
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$23 = tapGestureDetectorKt$waitForUpOrCancellation$22;
                    pointerEventPass3 = pointerEventPass2;
                    tapGestureDetectorKt$waitForUpOrCancellation$2 = tapGestureDetectorKt$waitForUpOrCancellation$23;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                    size = changes3.size();
                    for (i2 = 0; i2 < size; i2++) {
                        if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(changes3.get(i2))) {
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes4 = pointerEvent2.getChanges();
                            int size3 = changes4.size();
                            for (int i4 = 0; i4 < size3; i4++) {
                                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes4.get(i4);
                                if (pointerInputChange.isConsumed() || androidx.compose.ui.input.pointer.PointerEventKt.m3220isOutOfBoundsjwHxaWs(pointerInputChange, awaitPointerEventScope3.mo3173getSizeYbymL2g(), awaitPointerEventScope3.mo3172getExtendedTouchPaddingNHjbRc())) {
                                    break;
                                }
                            }
                            androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass5 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                            tapGestureDetectorKt$waitForUpOrCancellation$2.L$0 = awaitPointerEventScope3;
                            tapGestureDetectorKt$waitForUpOrCancellation$2.L$1 = pointerEventPass3;
                            tapGestureDetectorKt$waitForUpOrCancellation$2.label = 2;
                            obj = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass5, tapGestureDetectorKt$waitForUpOrCancellation$2);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass42 = pointerEventPass3;
                            tapGestureDetectorKt$waitForUpOrCancellation$22 = tapGestureDetectorKt$waitForUpOrCancellation$2;
                            pointerEventPass2 = pointerEventPass42;
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes22 = ((androidx.compose.ui.input.pointer.PointerEvent) obj).getChanges();
                            int size22 = changes22.size();
                            while (i3 < size22) {
                            }
                            awaitPointerEventScope2 = awaitPointerEventScope3;
                            tapGestureDetectorKt$waitForUpOrCancellation$22.L$0 = awaitPointerEventScope2;
                            tapGestureDetectorKt$waitForUpOrCancellation$22.L$1 = pointerEventPass2;
                            tapGestureDetectorKt$waitForUpOrCancellation$22.label = 1;
                            awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$22);
                            if (awaitPointerEvent == coroutine_suspended) {
                            }
                        }
                    }
                    return pointerEvent2.getChanges().get(0);
                }
                kotlin.ResultKt.throwOnFailure(obj);
                awaitPointerEventScope2 = awaitPointerEventScope;
                tapGestureDetectorKt$waitForUpOrCancellation$22 = tapGestureDetectorKt$waitForUpOrCancellation$2;
                pointerEventPass2 = pointerEventPass;
                tapGestureDetectorKt$waitForUpOrCancellation$22.L$0 = awaitPointerEventScope2;
                tapGestureDetectorKt$waitForUpOrCancellation$22.L$1 = pointerEventPass2;
                tapGestureDetectorKt$waitForUpOrCancellation$22.label = 1;
                awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$22);
                if (awaitPointerEvent == coroutine_suspended) {
                }
            }
        }
        tapGestureDetectorKt$waitForUpOrCancellation$2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2(continuation);
        java.lang.Object obj2 = tapGestureDetectorKt$waitForUpOrCancellation$2.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tapGestureDetectorKt$waitForUpOrCancellation$2.label;
        if (i == 0) {
        }
    }

    public static /* synthetic */ java.lang.Object waitForUpOrCancellation$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Main;
        }
        return waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, continuation);
    }
}
