package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0010H\u0096\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0013\u001a\u00028\u00008\u0017@\u0017X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/runtime/ProduceStateScopeImpl;", "T", "Landroidx/compose/runtime/ProduceStateScope;", "Landroidx/compose/runtime/MutableState;", "p0", "Lkotlin/coroutines/CoroutineContext;", "p1", "<init>", "(Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function0;", "", "", "awaitDispose", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "component1", "()Ljava/lang/Object;", "Lkotlin/Function1;", "component2", "()Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getHighSpeedVideoFpsRangesFor", "getValue", "setValue", "(Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ProduceStateScopeImpl<T> implements androidx.compose.runtime.ProduceStateScope<T>, androidx.compose.runtime.MutableState<T> {
    private final /* synthetic */ androidx.compose.runtime.MutableState<T> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRangesFor;

    public ProduceStateScopeImpl(androidx.compose.runtime.MutableState<T> mutableState, kotlin.coroutines.CoroutineContext coroutineContext) {
        this.Camera2StreamConfigurationMap = mutableState;
        this.getHighSpeedVideoFpsRangesFor = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: getCoroutineContext, reason: from getter */
    public final kotlin.coroutines.CoroutineContext getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.compose.runtime.ProduceStateScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object awaitDispose(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 produceStateScopeImpl$awaitDispose$1;
        int i;
        try {
            if (continuation instanceof androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1) {
                produceStateScopeImpl$awaitDispose$1 = (androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1) continuation;
                if ((produceStateScopeImpl$awaitDispose$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    produceStateScopeImpl$awaitDispose$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = produceStateScopeImpl$awaitDispose$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = produceStateScopeImpl$awaitDispose$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        produceStateScopeImpl$awaitDispose$1.Camera2StreamConfigurationMap = function0;
                        produceStateScopeImpl$awaitDispose$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(produceStateScopeImpl$awaitDispose$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                        java.lang.Object result = cancellableContinuationImpl.getResult();
                        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(produceStateScopeImpl$awaitDispose$1);
                        }
                        if (result == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function0 = (kotlin.jvm.functions.Function0) produceStateScopeImpl$awaitDispose$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    throw new kotlin.KotlinNothingValueException();
                }
            }
            if (i != 0) {
            }
            throw new kotlin.KotlinNothingValueException();
        } catch (java.lang.Throwable th) {
            function0.invoke();
            throw th;
        }
        produceStateScopeImpl$awaitDispose$1 = new androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1(this, continuation);
        java.lang.Object obj2 = produceStateScopeImpl$awaitDispose$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = produceStateScopeImpl$awaitDispose$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.runtime.MutableState
    public final void setValue(T t) {
        this.Camera2StreamConfigurationMap.setValue(t);
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public final T getValue() {
        return this.Camera2StreamConfigurationMap.getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public final kotlin.jvm.functions.Function1<T, kotlin.Unit> component2() {
        return this.Camera2StreamConfigurationMap.component2();
    }

    @Override // androidx.compose.runtime.MutableState
    public final T component1() {
        return this.Camera2StreamConfigurationMap.component1();
    }
}
