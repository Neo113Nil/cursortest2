package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$2<R> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.sequences.Sequence<? extends R>, java.util.Iterator<? extends R>> {
    public static final kotlin.sequences.SequencesKt___SequencesKt$flatMapIndexed$2 getHighSpeedVideoFpsRanges = new kotlin.sequences.SequencesKt___SequencesKt$flatMapIndexed$2();

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public final java.util.Iterator<R> invoke(kotlin.sequences.Sequence<? extends R> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return sequence.iterator();
    }

    SequencesKt___SequencesKt$flatMapIndexed$2() {
        super(1, kotlin.sequences.Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }
}
