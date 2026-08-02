package kotlinx.coroutines;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aN\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\f\u0010\r\u001aZ\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u0010\u0010\u0011\u001aT\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e*\u00020\u00142)\b\b\u0010\u0002\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086J¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "p0", "Lkotlinx/coroutines/CoroutineStart;", "p1", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "p2", "Lkotlinx/coroutines/Job;", "launch", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "T", "Lkotlinx/coroutines/Deferred;", "async", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Deferred;", "withContext", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineDispatcher;", "invoke", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
/* loaded from: classes5.dex */
public final /* synthetic */ class BuildersKt__Builders_commonKt {
    public static /* synthetic */ kotlinx.coroutines.Job launch$default(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = kotlinx.coroutines.CoroutineStart.DEFAULT;
        }
        return kotlinx.coroutines.BuildersKt.launch(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final kotlinx.coroutines.Job launch(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlinx.coroutines.LazyStandaloneCoroutine standaloneCoroutine;
        kotlin.coroutines.CoroutineContext newCoroutineContext = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext);
        if (coroutineStart.isLazy()) {
            standaloneCoroutine = new kotlinx.coroutines.LazyStandaloneCoroutine(newCoroutineContext, function2);
        } else {
            standaloneCoroutine = new kotlinx.coroutines.StandaloneCoroutine(newCoroutineContext, true);
        }
        standaloneCoroutine.start(coroutineStart, standaloneCoroutine, function2);
        return standaloneCoroutine;
    }

    public static /* synthetic */ kotlinx.coroutines.Deferred async$default(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = kotlinx.coroutines.CoroutineStart.DEFAULT;
        }
        return kotlinx.coroutines.BuildersKt.async(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final <T> kotlinx.coroutines.Deferred<T> async(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        kotlinx.coroutines.LazyDeferredCoroutine deferredCoroutine;
        kotlin.coroutines.CoroutineContext newCoroutineContext = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext);
        if (coroutineStart.isLazy()) {
            deferredCoroutine = new kotlinx.coroutines.LazyDeferredCoroutine(newCoroutineContext, function2);
        } else {
            deferredCoroutine = new kotlinx.coroutines.DeferredCoroutine(newCoroutineContext, true);
        }
        deferredCoroutine.start(coroutineStart, deferredCoroutine, function2);
        return deferredCoroutine;
    }

    public static final <T> java.lang.Object withContext(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        java.lang.Object result$kotlinx_coroutines_core;
        kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes = continuation.getGetHighSpeedVideoSizes();
        kotlin.coroutines.CoroutineContext newCoroutineContext = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(getHighSpeedVideoSizes, coroutineContext);
        kotlinx.coroutines.JobKt.ensureActive(newCoroutineContext);
        if (newCoroutineContext == getHighSpeedVideoSizes) {
            kotlinx.coroutines.internal.ScopeCoroutine scopeCoroutine = new kotlinx.coroutines.internal.ScopeCoroutine(newCoroutineContext, continuation);
            result$kotlinx_coroutines_core = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(scopeCoroutine, scopeCoroutine, function2);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(newCoroutineContext.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE), getHighSpeedVideoSizes.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE))) {
            kotlinx.coroutines.UndispatchedCoroutine undispatchedCoroutine = new kotlinx.coroutines.UndispatchedCoroutine(newCoroutineContext, continuation);
            kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes2 = undispatchedCoroutine.getGetHighSpeedVideoSizes();
            java.lang.Object updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(getHighSpeedVideoSizes2, null);
            try {
                java.lang.Object startUndispatchedOrReturn = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(undispatchedCoroutine, undispatchedCoroutine, function2);
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(getHighSpeedVideoSizes2, updateThreadContext);
                result$kotlinx_coroutines_core = startUndispatchedOrReturn;
            } catch (java.lang.Throwable th) {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(getHighSpeedVideoSizes2, updateThreadContext);
                throw th;
            }
        } else {
            kotlinx.coroutines.DispatchedCoroutine dispatchedCoroutine = new kotlinx.coroutines.DispatchedCoroutine(newCoroutineContext, continuation);
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(function2, dispatchedCoroutine, dispatchedCoroutine);
            result$kotlinx_coroutines_core = dispatchedCoroutine.getResult$kotlinx_coroutines_core();
        }
        if (result$kotlinx_coroutines_core == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result$kotlinx_coroutines_core;
    }

    public static final <T> java.lang.Object invoke(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, function2, continuation);
    }
}
