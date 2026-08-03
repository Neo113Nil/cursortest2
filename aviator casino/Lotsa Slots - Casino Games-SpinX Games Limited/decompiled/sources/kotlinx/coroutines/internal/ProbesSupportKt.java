package kotlinx.coroutines.internal;

/* compiled from: ProbesSupport.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0080\b\u001a\u001d\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0080\b¨\u0006\u0006"}, d2 = {"probeCoroutineCreated", "Lkotlin/coroutines/Continuation;", "T", "completion", "probeCoroutineResumed", "", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProbesSupportKt {
    public static final <T> kotlin.coroutines.Continuation<T> probeCoroutineCreated(kotlin.coroutines.Continuation<? super T> continuation) {
        return kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(continuation);
    }

    public static final <T> void probeCoroutineResumed(kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineResumed(continuation);
    }
}
