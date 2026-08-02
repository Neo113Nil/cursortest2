package kotlin.sequences;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000b\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086@¢\u0006\u0004\b\u000b\u0010\u000fJ\u001e\u0010\u000b\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086@¢\u0006\u0004\b\u000b\u0010\u0012"}, d2 = {"Lkotlin/sequences/SequenceScope;", "T", "", "<init>", "()V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "yield", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "iterator", "yieldAll", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "elements", "(Ljava/lang/Iterable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/sequences/Sequence;", "sequence", "(Lkotlin/sequences/Sequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class SequenceScope<T> {
    public abstract java.lang.Object yield(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    public abstract java.lang.Object yieldAll(java.util.Iterator<? extends T> it, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    public final java.lang.Object yieldAll(java.lang.Iterable<? extends T> iterable, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object yieldAll;
        return (!((iterable instanceof java.util.Collection) && ((java.util.Collection) iterable).isEmpty()) && (yieldAll = yieldAll(iterable.iterator(), continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? yieldAll : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object yieldAll(kotlin.sequences.Sequence<? extends T> sequence, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object yieldAll = yieldAll(sequence.iterator(), continuation);
        return yieldAll == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? yieldAll : kotlin.Unit.INSTANCE;
    }
}
