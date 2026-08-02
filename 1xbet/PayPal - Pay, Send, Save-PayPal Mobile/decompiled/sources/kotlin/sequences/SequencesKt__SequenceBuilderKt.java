package kotlin.sequences;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001aH\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002-\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\t\u0010\n\u001aH\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002-\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\f\u0010\r*\f\b\u0002\u0010\u000f\"\u00020\u000e2\u00020\u000e"}, d2 = {"T", "Lkotlin/Function2;", "Lkotlin/sequences/SequenceScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlin/sequences/Sequence;", "sequence", "(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;", "", "iterator", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "", "State"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes3.dex */
public class SequencesKt__SequenceBuilderKt {
    public static final <T> kotlin.sequences.Sequence<T> sequence(final kotlin.jvm.functions.Function2<? super kotlin.sequences.SequenceScope<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return new kotlin.sequences.Sequence<T>() { // from class: kotlin.sequences.SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<T> iterator() {
                return kotlin.sequences.SequencesKt.iterator(kotlin.jvm.functions.Function2.this);
            }
        };
    }

    public static final <T> java.util.Iterator<T> iterator(kotlin.jvm.functions.Function2<? super kotlin.sequences.SequenceScope<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.sequences.SequenceBuilderIterator sequenceBuilderIterator = new kotlin.sequences.SequenceBuilderIterator();
        sequenceBuilderIterator.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(function2, sequenceBuilderIterator, sequenceBuilderIterator);
        return sequenceBuilderIterator;
    }
}
