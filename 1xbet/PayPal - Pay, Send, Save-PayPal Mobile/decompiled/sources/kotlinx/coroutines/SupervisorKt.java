package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0005\u001aL\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\u0002\b\u000bH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/coroutines/Job;", "parent", "Lkotlinx/coroutines/CompletableJob;", "SupervisorJob", "(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/CompletableJob;", "(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/Job;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "supervisorScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SupervisorKt {
    public static /* synthetic */ kotlinx.coroutines.CompletableJob SupervisorJob$default(kotlinx.coroutines.Job job, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return SupervisorJob(job);
    }

    public static final kotlinx.coroutines.CompletableJob SupervisorJob(kotlinx.coroutines.Job job) {
        return new kotlinx.coroutines.SupervisorJobImpl(job);
    }

    /* renamed from: SupervisorJob$default, reason: collision with other method in class */
    public static /* synthetic */ kotlinx.coroutines.Job m24065SupervisorJob$default(kotlinx.coroutines.Job job, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return m24064SupervisorJob(job);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* renamed from: SupervisorJob, reason: collision with other method in class */
    public static final /* synthetic */ kotlinx.coroutines.Job m24064SupervisorJob(kotlinx.coroutines.Job job) {
        return SupervisorJob(job);
    }

    public static final <R> java.lang.Object supervisorScope(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.SupervisorCoroutine supervisorCoroutine = new kotlinx.coroutines.SupervisorCoroutine(continuation.getContext(), continuation);
        java.lang.Object startUndispatchedOrReturn = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(supervisorCoroutine, supervisorCoroutine, function2);
        if (startUndispatchedOrReturn == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return startUndispatchedOrReturn;
    }
}
