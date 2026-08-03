package kotlin.sequences;

/* compiled from: SequenceBuilder.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H¦@¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH¦@¢\u0006\u0002\u0010\fJ\u001c\u0010\t\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\u001c\u0010\t\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/sequences/SequenceScope;", "T", "", "<init>", "()V", "yield", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yieldAll", "iterator", "", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "elements", "", "(Ljava/lang/Iterable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sequence", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
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
