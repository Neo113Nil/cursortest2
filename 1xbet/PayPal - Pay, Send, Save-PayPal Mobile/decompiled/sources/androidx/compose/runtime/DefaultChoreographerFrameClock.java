package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0006*\u00020\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/runtime/DefaultChoreographerFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "p0", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/Choreographer;", "getHighSpeedVideoFpsRanges", "Landroid/view/Choreographer;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultChoreographerFrameClock implements androidx.compose.runtime.MonotonicFrameClock {
    public static final androidx.compose.runtime.DefaultChoreographerFrameClock INSTANCE = new androidx.compose.runtime.DefaultChoreographerFrameClock();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final android.view.Choreographer getHighResolutionOutputSizeshNQ4ISI = (android.view.Choreographer) kotlinx.coroutines.BuildersKt.runBlocking(kotlinx.coroutines.Dispatchers.getMain().getImmediate(), new androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1(null));

    private DefaultChoreographerFrameClock() {
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
        return (R) androidx.compose.runtime.MonotonicFrameClock.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        return (E) androidx.compose.runtime.MonotonicFrameClock.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return androidx.compose.runtime.MonotonicFrameClock.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
        return androidx.compose.runtime.MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final <R> java.lang.Object withFrameNanos(final kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final android.view.Choreographer.FrameCallback frameCallback = new android.view.Choreographer.FrameCallback() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                java.lang.Object m23436constructorimpl;
                kotlin.coroutines.Continuation continuation2 = cancellableContinuationImpl2;
                androidx.compose.runtime.DefaultChoreographerFrameClock defaultChoreographerFrameClock = androidx.compose.runtime.DefaultChoreographerFrameClock.INSTANCE;
                kotlin.jvm.functions.Function1<java.lang.Long, R> function12 = function1;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(function12.invoke(java.lang.Long.valueOf(j)));
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                continuation2.resumeWith(m23436constructorimpl);
            }
        };
        getHighResolutionOutputSizeshNQ4ISI.postFrameCallback(frameCallback);
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                android.view.Choreographer choreographer;
                choreographer = androidx.compose.runtime.DefaultChoreographerFrameClock.getHighResolutionOutputSizeshNQ4ISI;
                choreographer.removeFrameCallback(frameCallback);
                return kotlin.Unit.INSTANCE;
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
