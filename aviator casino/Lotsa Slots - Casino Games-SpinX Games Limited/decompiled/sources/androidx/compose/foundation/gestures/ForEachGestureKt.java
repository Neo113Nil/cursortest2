package androidx.compose.foundation.gestures;

/* compiled from: ForEachGesture.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080@¢\u0006\u0002\u0010\u0005\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u0006H\u0080@¢\u0006\u0002\u0010\u0007\u001a;\u0010\b\u001a\u00020\u0004*\u00020\u00062'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0086@¢\u0006\u0002\u0010\u000e\u001a;\u0010\u000f\u001a\u00020\u0004*\u00020\u00062'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0087@¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"allPointersUp", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "awaitAllPointersUp", "", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitEachGesture", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forEachGesture", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ForEachGestureKt {
    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(4:(1:(1:12)(2:37|38))(2:39|40)|13|14|(3:19|20|(1:22)(6:23|24|(1:26)|13|14|(2:16|17)(0)))(0))(7:41|42|24|(0)|13|14|(0)(0)))(3:43|14|(0)(0))))|45|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0066, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0092 -> B:13:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ac -> B:13:0x0053). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(message = "Use awaitEachGesture instead. forEachGesture() can drop events between gestures.", replaceWith = @kotlin.ReplaceWith(expression = "awaitEachGesture(block)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 forEachGestureKt$forEachGesture$1;
        ?? r2;
        java.lang.Object awaitAllPointersUp;
        kotlin.coroutines.CoroutineContext coroutineContext;
        androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope2;
        kotlin.coroutines.CoroutineContext coroutineContext2;
        androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope3;
        if (continuation instanceof androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1) {
            forEachGestureKt$forEachGesture$1 = (androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1) continuation;
            if ((forEachGestureKt$forEachGesture$1.label & Integer.MIN_VALUE) != 0) {
                forEachGestureKt$forEachGesture$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = forEachGestureKt$forEachGesture$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = forEachGestureKt$forEachGesture$1.label;
                if (r2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    coroutineContext = forEachGestureKt$forEachGesture$1.get$context();
                    pointerInputScope2 = pointerInputScope;
                    if (kotlinx.coroutines.JobKt.isActive(coroutineContext)) {
                    }
                } else if (r2 != 1) {
                    if (r2 == 2) {
                        kotlin.coroutines.CoroutineContext coroutineContext3 = (kotlin.coroutines.CoroutineContext) forEachGestureKt$forEachGesture$1.L$2;
                        function2 = (kotlin.jvm.functions.Function2) forEachGestureKt$forEachGesture$1.L$1;
                        androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope4 = (androidx.compose.ui.input.pointer.PointerInputScope) forEachGestureKt$forEachGesture$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        pointerInputScope3 = pointerInputScope4;
                        coroutineContext2 = coroutineContext3;
                    } else {
                        if (r2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.coroutines.CoroutineContext coroutineContext4 = (kotlin.coroutines.CoroutineContext) forEachGestureKt$forEachGesture$1.L$2;
                        function2 = (kotlin.jvm.functions.Function2) forEachGestureKt$forEachGesture$1.L$1;
                        androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope5 = (androidx.compose.ui.input.pointer.PointerInputScope) forEachGestureKt$forEachGesture$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        pointerInputScope3 = pointerInputScope5;
                        coroutineContext2 = coroutineContext4;
                    }
                    coroutineContext = coroutineContext2;
                    pointerInputScope2 = pointerInputScope3;
                    if (kotlinx.coroutines.JobKt.isActive(coroutineContext)) {
                        try {
                        } catch (java.util.concurrent.CancellationException e) {
                            r2 = pointerInputScope2;
                            pointerInputScope = coroutineContext;
                            e = e;
                            if (!kotlinx.coroutines.JobKt.isActive(pointerInputScope)) {
                                forEachGestureKt$forEachGesture$1.L$0 = r2;
                                forEachGestureKt$forEachGesture$1.L$1 = function2;
                                forEachGestureKt$forEachGesture$1.L$2 = pointerInputScope;
                                forEachGestureKt$forEachGesture$1.label = 3;
                                java.lang.Object awaitAllPointersUp2 = awaitAllPointersUp((androidx.compose.ui.input.pointer.PointerInputScope) r2, forEachGestureKt$forEachGesture$1);
                                pointerInputScope3 = r2;
                                coroutineContext2 = pointerInputScope;
                                if (awaitAllPointersUp2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                coroutineContext = coroutineContext2;
                                pointerInputScope2 = pointerInputScope3;
                                if (kotlinx.coroutines.JobKt.isActive(coroutineContext)) {
                                }
                            } else {
                                throw e;
                            }
                        }
                        forEachGestureKt$forEachGesture$1.L$0 = pointerInputScope2;
                        forEachGestureKt$forEachGesture$1.L$1 = function2;
                        forEachGestureKt$forEachGesture$1.L$2 = coroutineContext;
                        forEachGestureKt$forEachGesture$1.label = 1;
                        if (function2.invoke(pointerInputScope2, forEachGestureKt$forEachGesture$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r2 = pointerInputScope2;
                        pointerInputScope = coroutineContext;
                        forEachGestureKt$forEachGesture$1.L$0 = r2;
                        forEachGestureKt$forEachGesture$1.L$1 = function2;
                        forEachGestureKt$forEachGesture$1.L$2 = pointerInputScope;
                        forEachGestureKt$forEachGesture$1.label = 2;
                        awaitAllPointersUp = awaitAllPointersUp((androidx.compose.ui.input.pointer.PointerInputScope) r2, forEachGestureKt$forEachGesture$1);
                        pointerInputScope3 = r2;
                        coroutineContext2 = pointerInputScope;
                        if (awaitAllPointersUp == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineContext = coroutineContext2;
                        pointerInputScope2 = pointerInputScope3;
                        if (kotlinx.coroutines.JobKt.isActive(coroutineContext)) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                } else {
                    kotlin.coroutines.CoroutineContext coroutineContext5 = (kotlin.coroutines.CoroutineContext) forEachGestureKt$forEachGesture$1.L$2;
                    function2 = (kotlin.jvm.functions.Function2) forEachGestureKt$forEachGesture$1.L$1;
                    androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope6 = (androidx.compose.ui.input.pointer.PointerInputScope) forEachGestureKt$forEachGesture$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    r2 = pointerInputScope6;
                    pointerInputScope = coroutineContext5;
                    forEachGestureKt$forEachGesture$1.L$0 = r2;
                    forEachGestureKt$forEachGesture$1.L$1 = function2;
                    forEachGestureKt$forEachGesture$1.L$2 = pointerInputScope;
                    forEachGestureKt$forEachGesture$1.label = 2;
                    awaitAllPointersUp = awaitAllPointersUp((androidx.compose.ui.input.pointer.PointerInputScope) r2, forEachGestureKt$forEachGesture$1);
                    pointerInputScope3 = r2;
                    coroutineContext2 = pointerInputScope;
                    if (awaitAllPointersUp == coroutine_suspended) {
                    }
                    coroutineContext = coroutineContext2;
                    pointerInputScope2 = pointerInputScope3;
                    if (kotlinx.coroutines.JobKt.isActive(coroutineContext)) {
                    }
                }
            }
        }
        forEachGestureKt$forEachGesture$1 = new androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1(continuation);
        java.lang.Object obj2 = forEachGestureKt$forEachGesture$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = forEachGestureKt$forEachGesture$1.label;
        if (r2 != 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (allPointersUp(r6) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:10:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 forEachGestureKt$awaitAllPointersUp$3;
        int i;
        if (continuation instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) {
            forEachGestureKt$awaitAllPointersUp$3 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) continuation;
            if ((forEachGestureKt$awaitAllPointersUp$3.label & Integer.MIN_VALUE) != 0) {
                forEachGestureKt$awaitAllPointersUp$3.label -= Integer.MIN_VALUE;
                java.lang.Object obj = forEachGestureKt$awaitAllPointersUp$3.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = forEachGestureKt$awaitAllPointersUp$3.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) forEachGestureKt$awaitAllPointersUp$3.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = ((androidx.compose.ui.input.pointer.PointerEvent) obj).getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    while (i2 < size) {
                        if (changes.get(i2).getPressed()) {
                            androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                            forEachGestureKt$awaitAllPointersUp$3.L$0 = awaitPointerEventScope;
                            forEachGestureKt$awaitAllPointersUp$3.label = 1;
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
        java.lang.Object obj2 = forEachGestureKt$awaitAllPointersUp$3.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = forEachGestureKt$awaitAllPointersUp$3.label;
        if (i == 0) {
        }
    }

    public static final java.lang.Object awaitEachGesture(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2(continuation.get$context(), function2, null), continuation);
        return awaitPointerEventScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : kotlin.Unit.INSTANCE;
    }
}
