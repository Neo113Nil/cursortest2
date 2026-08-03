package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: _Sequences.kt */
@kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"kotlin/sequences/SequencesKt___SequencesKt$minus$3", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SequencesKt___SequencesKt$minus$3<T> implements kotlin.sequences.Sequence<T> {
    final /* synthetic */ java.lang.Iterable<T> $elements;
    final /* synthetic */ kotlin.sequences.Sequence<T> $this_minus;

    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$minus$3(java.lang.Iterable<? extends T> iterable, kotlin.sequences.Sequence<? extends T> sequence) {
        this.$elements = iterable;
        this.$this_minus = sequence;
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<T> iterator() {
        final java.util.Collection convertToListIfNotCollection = kotlin.collections.CollectionsKt.convertToListIfNotCollection(this.$elements);
        if (convertToListIfNotCollection.isEmpty()) {
            return this.$this_minus.iterator();
        }
        return kotlin.sequences.SequencesKt.filterNot(this.$this_minus, new kotlin.jvm.functions.Function1() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean contains;
                contains = convertToListIfNotCollection.contains(obj);
                return java.lang.Boolean.valueOf(contains);
            }
        }).iterator();
    }
}
