package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: _Sequences.kt */
@kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"kotlin/sequences/SequencesKt___SequencesKt$minus$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SequencesKt___SequencesKt$minus$1<T> implements kotlin.sequences.Sequence<T> {
    final /* synthetic */ T $element;
    final /* synthetic */ kotlin.sequences.Sequence<T> $this_minus;

    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$minus$1(kotlin.sequences.Sequence<? extends T> sequence, T t) {
        this.$this_minus = sequence;
        this.$element = t;
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<T> iterator() {
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        kotlin.sequences.Sequence<T> sequence = this.$this_minus;
        final T t = this.$element;
        return kotlin.sequences.SequencesKt.filter(sequence, new kotlin.jvm.functions.Function1() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean iterator$lambda$0;
                iterator$lambda$0 = kotlin.sequences.SequencesKt___SequencesKt$minus$1.iterator$lambda$0(kotlin.jvm.internal.Ref.BooleanRef.this, t, obj);
                return java.lang.Boolean.valueOf(iterator$lambda$0);
            }
        }).iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean iterator$lambda$0(kotlin.jvm.internal.Ref.BooleanRef booleanRef, java.lang.Object obj, java.lang.Object obj2) {
        if (booleanRef.element || !kotlin.jvm.internal.Intrinsics.areEqual(obj2, obj)) {
            return true;
        }
        booleanRef.element = true;
        return false;
    }
}
