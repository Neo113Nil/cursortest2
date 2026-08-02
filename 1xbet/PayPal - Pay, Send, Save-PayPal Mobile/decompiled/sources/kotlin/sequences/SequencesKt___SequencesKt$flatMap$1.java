package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SequencesKt___SequencesKt$flatMap$1<R> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Iterable<? extends R>, java.util.Iterator<? extends R>> {
    public static final kotlin.sequences.SequencesKt___SequencesKt$flatMap$1 getHighSpeedVideoSizes = new kotlin.sequences.SequencesKt___SequencesKt$flatMap$1();

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public final java.util.Iterator<R> invoke(java.lang.Iterable<? extends R> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return iterable.iterator();
    }

    SequencesKt___SequencesKt$flatMap$1() {
        super(1, java.lang.Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }
}
