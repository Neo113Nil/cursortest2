package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/SequencesKt___SequencesKt$minus$3;", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SequencesKt___SequencesKt$minus$3<T> implements kotlin.sequences.Sequence<T> {
    final /* synthetic */ java.lang.Iterable<T> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.sequences.Sequence<T> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$minus$3(java.lang.Iterable<? extends T> iterable, kotlin.sequences.Sequence<? extends T> sequence) {
        this.getHighSpeedVideoFpsRanges = iterable;
        this.getHighSpeedVideoFpsRangesFor = sequence;
    }

    @Override // kotlin.sequences.Sequence
    public final java.util.Iterator<T> iterator() {
        final java.util.Collection convertToListIfNotCollection = kotlin.collections.CollectionsKt.convertToListIfNotCollection(this.getHighSpeedVideoFpsRanges);
        if (convertToListIfNotCollection.isEmpty()) {
            return this.getHighSpeedVideoFpsRangesFor.iterator();
        }
        return kotlin.sequences.SequencesKt.filterNot(this.getHighSpeedVideoFpsRangesFor, new kotlin.jvm.functions.Function1() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean contains;
                contains = convertToListIfNotCollection.contains(obj);
                return java.lang.Boolean.valueOf(contains);
            }
        }).iterator();
    }
}
