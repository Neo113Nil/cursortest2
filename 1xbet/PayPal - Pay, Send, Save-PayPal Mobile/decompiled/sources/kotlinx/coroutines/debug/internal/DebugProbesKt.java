package kotlinx.coroutines.debug.internal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/coroutines/Continuation;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "", "probeCoroutineResumed", "(Lkotlin/coroutines/Continuation;)V", "probeCoroutineSuspended", "T", "completion", "probeCoroutineCreated", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DebugProbesKt {
    public static final void probeCoroutineResumed(kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.probeCoroutineResumed$kotlinx_coroutines_core(continuation);
    }

    public static final void probeCoroutineSuspended(kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.probeCoroutineSuspended$kotlinx_coroutines_core(continuation);
    }

    public static final <T> kotlin.coroutines.Continuation<T> probeCoroutineCreated(kotlin.coroutines.Continuation<? super T> continuation) {
        return kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.probeCoroutineCreated$kotlinx_coroutines_core(continuation);
    }
}
