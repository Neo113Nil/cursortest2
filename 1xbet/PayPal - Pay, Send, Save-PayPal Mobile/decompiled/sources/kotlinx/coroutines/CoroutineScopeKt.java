package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aL\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u000bH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u00020\u0014*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0010\u0010\u001d\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u001d\u0010\u001e\"\u001b\u0010 \u001a\u00020\u001f*\u00020\u00008G¢\u0006\f\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b \u0010!"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "plus", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;", "MainScope", "()Lkotlinx/coroutines/CoroutineScope;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "coroutineScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CoroutineScope", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "cause", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Lkotlinx/coroutines/CoroutineScope;Ljava/util/concurrent/CancellationException;)V", "", "message", "", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Ljava/lang/Throwable;)V", "ensureActive", "(Lkotlinx/coroutines/CoroutineScope;)V", "currentCoroutineContext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isActive", "(Lkotlinx/coroutines/CoroutineScope;)Z", "isActive$annotations"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoroutineScopeKt {
    public static /* synthetic */ void isActive$annotations(kotlinx.coroutines.CoroutineScope coroutineScope) {
    }

    public static final kotlinx.coroutines.CoroutineScope plus(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext) {
        return new kotlinx.coroutines.internal.ContextScope(coroutineScope.getCoroutineContext().plus(coroutineContext));
    }

    public static final kotlinx.coroutines.CoroutineScope MainScope() {
        return new kotlinx.coroutines.internal.ContextScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(kotlinx.coroutines.Dispatchers.getMain()));
    }

    public static final boolean isActive(kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) coroutineScope.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    public static final <R> java.lang.Object coroutineScope(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.internal.ScopeCoroutine scopeCoroutine = new kotlinx.coroutines.internal.ScopeCoroutine(continuation.getContext(), continuation);
        java.lang.Object startUndispatchedOrReturn = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(scopeCoroutine, scopeCoroutine, function2);
        if (startUndispatchedOrReturn == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return startUndispatchedOrReturn;
    }

    public static final kotlinx.coroutines.CoroutineScope CoroutineScope(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.CompletableJob Job$default;
        if (coroutineContext.get(kotlinx.coroutines.Job.INSTANCE) == null) {
            Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
            coroutineContext = coroutineContext.plus(Job$default);
        }
        return new kotlinx.coroutines.internal.ContextScope(coroutineContext);
    }

    public static /* synthetic */ void cancel$default(kotlinx.coroutines.CoroutineScope coroutineScope, java.util.concurrent.CancellationException cancellationException, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        cancel(coroutineScope, cancellationException);
    }

    public static final void cancel(kotlinx.coroutines.CoroutineScope coroutineScope, java.util.concurrent.CancellationException cancellationException) {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) coroutineScope.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
        if (job == null) {
            throw new java.lang.IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(java.lang.String.valueOf(coroutineScope)).toString());
        }
        job.cancel(cancellationException);
    }

    public static final void cancel(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.String str, java.lang.Throwable th) {
        cancel(coroutineScope, kotlinx.coroutines.ExceptionsKt.CancellationException(str, th));
    }

    public static /* synthetic */ void cancel$default(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        cancel(coroutineScope, str, th);
    }

    public static final void ensureActive(kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlinx.coroutines.JobKt.ensureActive(coroutineScope.getCoroutineContext());
    }

    public static final java.lang.Object currentCoroutineContext(kotlin.coroutines.Continuation<? super kotlin.coroutines.CoroutineContext> continuation) {
        return continuation.getContext();
    }
}
