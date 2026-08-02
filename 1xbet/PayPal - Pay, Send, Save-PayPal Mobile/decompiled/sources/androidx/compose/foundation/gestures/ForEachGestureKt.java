package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0007\u001a\u00020\u0003*\u00020\u00002'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0087@¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0003*\u00020\u0000H\u0080@¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\r\u001a\u00020\u0003*\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\r\u0010\u0011\u001a=\u0010\u0012\u001a\u00020\u0003*\u00020\u00002'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0086@¢\u0006\u0004\b\u0012\u0010\b"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "forEachGesture", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "allPointersUp", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)Z", "awaitAllPointersUp", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitEachGesture"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ForEachGestureKt {
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(1:(1:12)(2:24|25))(2:26|27))(3:28|29|17))(1:30)|13|(1:15)(2:22|23)))|37|6|7|(0)(0)|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        if (r9 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        if (kotlinx.coroutines.JobKt.isActive(r7) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        r0.getHighResolutionOutputSizeshNQ4ISI = r2;
        r0.Camera2StreamConfigurationMap = r8;
        r0.getHighSpeedVideoFpsRangesFor = r7;
        r0.getHighSpeedVideoSizes = 3;
        r9 = awaitAllPointersUp(r2, r0);
        r2 = r2;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        throw r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[Catch: CancellationException -> 0x0064, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0064, blocks: (B:15:0x0075, B:17:0x0083, B:27:0x0050, B:29:0x0060), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008f -> B:13:0x006f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a4 -> B:13:0x006f). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(message = "Use awaitEachGesture instead. forEachGesture() can drop events between gestures.", replaceWith = @kotlin.ReplaceWith(expression = "awaitEachGesture(block)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 forEachGestureKt$forEachGesture$1;
        ?? r2;
        kotlin.coroutines.CoroutineContext coroutineContext;
        androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope2;
        if (continuation instanceof androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1) {
            forEachGestureKt$forEachGesture$1 = (androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1) continuation;
            if ((forEachGestureKt$forEachGesture$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                forEachGestureKt$forEachGesture$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = forEachGestureKt$forEachGesture$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = forEachGestureKt$forEachGesture$1.getHighSpeedVideoSizes;
                if (r2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    r2 = pointerInputScope;
                    pointerInputScope = forEachGestureKt$forEachGesture$1.getContext();
                } else if (r2 == 1) {
                    kotlin.coroutines.CoroutineContext coroutineContext2 = (kotlin.coroutines.CoroutineContext) forEachGestureKt$forEachGesture$1.getHighSpeedVideoFpsRangesFor;
                    function2 = (kotlin.jvm.functions.Function2) forEachGestureKt$forEachGesture$1.Camera2StreamConfigurationMap;
                    androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope3 = (androidx.compose.ui.input.pointer.PointerInputScope) forEachGestureKt$forEachGesture$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    pointerInputScope2 = pointerInputScope3;
                    coroutineContext = coroutineContext2;
                    forEachGestureKt$forEachGesture$1.getHighResolutionOutputSizeshNQ4ISI = pointerInputScope2;
                    forEachGestureKt$forEachGesture$1.Camera2StreamConfigurationMap = function2;
                    forEachGestureKt$forEachGesture$1.getHighSpeedVideoFpsRangesFor = coroutineContext;
                    forEachGestureKt$forEachGesture$1.getHighSpeedVideoSizes = 2;
                    java.lang.Object awaitAllPointersUp = awaitAllPointersUp(pointerInputScope2, forEachGestureKt$forEachGesture$1);
                    r2 = pointerInputScope2;
                    pointerInputScope = coroutineContext;
                } else if (r2 == 2) {
                    kotlin.coroutines.CoroutineContext coroutineContext3 = (kotlin.coroutines.CoroutineContext) forEachGestureKt$forEachGesture$1.getHighSpeedVideoFpsRangesFor;
                    function2 = (kotlin.jvm.functions.Function2) forEachGestureKt$forEachGesture$1.Camera2StreamConfigurationMap;
                    androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope4 = (androidx.compose.ui.input.pointer.PointerInputScope) forEachGestureKt$forEachGesture$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    r2 = pointerInputScope4;
                    pointerInputScope = coroutineContext3;
                } else {
                    if (r2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.coroutines.CoroutineContext coroutineContext4 = (kotlin.coroutines.CoroutineContext) forEachGestureKt$forEachGesture$1.getHighSpeedVideoFpsRangesFor;
                    function2 = (kotlin.jvm.functions.Function2) forEachGestureKt$forEachGesture$1.Camera2StreamConfigurationMap;
                    androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope5 = (androidx.compose.ui.input.pointer.PointerInputScope) forEachGestureKt$forEachGesture$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    r2 = pointerInputScope5;
                    pointerInputScope = coroutineContext4;
                }
                if (!kotlinx.coroutines.JobKt.isActive(pointerInputScope)) {
                    forEachGestureKt$forEachGesture$1.getHighResolutionOutputSizeshNQ4ISI = r2;
                    forEachGestureKt$forEachGesture$1.Camera2StreamConfigurationMap = function2;
                    forEachGestureKt$forEachGesture$1.getHighSpeedVideoFpsRangesFor = pointerInputScope;
                    forEachGestureKt$forEachGesture$1.getHighSpeedVideoSizes = 1;
                    java.lang.Object invoke = function2.invoke(r2, forEachGestureKt$forEachGesture$1);
                    pointerInputScope2 = r2;
                    coroutineContext = pointerInputScope;
                } else {
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
        forEachGestureKt$forEachGesture$1 = new androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1(continuation);
        java.lang.Object obj2 = forEachGestureKt$forEachGesture$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = forEachGestureKt$forEachGesture$1.getHighSpeedVideoSizes;
        if (r2 != 0) {
        }
        if (!kotlinx.coroutines.JobKt.isActive(pointerInputScope)) {
        }
    }

    public static final boolean allPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope) {
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (changes.get(i).getPressed()) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    public static final java.lang.Object awaitAllPointersUp(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2(null), continuation);
        return awaitPointerEventScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        if (allPointersUp(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0050 -> B:10:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 forEachGestureKt$awaitAllPointersUp$3;
        int i;
        if (continuation instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) {
            forEachGestureKt$awaitAllPointersUp$3 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) continuation;
            if ((forEachGestureKt$awaitAllPointersUp$3.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                forEachGestureKt$awaitAllPointersUp$3.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = forEachGestureKt$awaitAllPointersUp$3.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = forEachGestureKt$awaitAllPointersUp$3.getHighSpeedVideoFpsRangesFor;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = (androidx.compose.ui.input.pointer.PointerEventPass) forEachGestureKt$awaitAllPointersUp$3.Camera2StreamConfigurationMap;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) forEachGestureKt$awaitAllPointersUp$3.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    pointerEventPass = pointerEventPass2;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = ((androidx.compose.ui.input.pointer.PointerEvent) obj).getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    while (i2 < size) {
                        if (changes.get(i2).getPressed()) {
                            forEachGestureKt$awaitAllPointersUp$3.getHighSpeedVideoSizes = awaitPointerEventScope;
                            forEachGestureKt$awaitAllPointersUp$3.Camera2StreamConfigurationMap = pointerEventPass;
                            forEachGestureKt$awaitAllPointersUp$3.getHighSpeedVideoFpsRangesFor = 1;
                            obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, forEachGestureKt$awaitAllPointersUp$3);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = ((androidx.compose.ui.input.pointer.PointerEvent) obj).getChanges();
                            int size2 = changes2.size();
                            int i22 = 0;
                            while (i22 < size2) {
                            }
                        } else {
                            i22++;
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        }
        forEachGestureKt$awaitAllPointersUp$3 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3(continuation);
        java.lang.Object obj2 = forEachGestureKt$awaitAllPointersUp$3.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = forEachGestureKt$awaitAllPointersUp$3.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
        }
    }

    public static /* synthetic */ java.lang.Object awaitAllPointersUp$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Final;
        }
        return awaitAllPointersUp(awaitPointerEventScope, pointerEventPass, continuation);
    }

    public static final java.lang.Object awaitEachGesture(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2(continuation.getContext(), function2, null), continuation);
        return awaitPointerEventScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : kotlin.Unit.INSTANCE;
    }
}
