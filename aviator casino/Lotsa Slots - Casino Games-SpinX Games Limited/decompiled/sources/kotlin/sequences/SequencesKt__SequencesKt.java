package kotlin.sequences;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\t\"\u0002H\u0002¢\u0006\u0002\u0010\n\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\u0087\b\u001a2\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0004H\u0007\u001a\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a)\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00100\u0001H\u0007¢\u0006\u0002\b\u0011\u001aC\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u00050\u0013H\u0002¢\u0006\u0002\b\u0014\u001a@\u0010\u0015\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u00170\u0016\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0012*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00120\u00160\u0001\u001a\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a&\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001aH\u0007\u001ab\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u001c\"\u0004\b\u0002\u0010\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u001c0\u001f2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u00050\u0013H\u0000\u001a\u001c\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a&\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020#2\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a=\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020#2\b\u0010%\u001a\u0004\u0018\u0001H\u00022\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0013H\u0007¢\u0006\u0002\u0010&\u001a<\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020#2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "asSequence", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "emptySequence", "orEmpty", "ifEmpty", "defaultValue", "flatten", "", "flattenSequenceOfIterable", "R", "Lkotlin/Function1;", "flatten$SequencesKt__SequencesKt", "unzip", "Lkotlin/Pair;", "", "shuffled", "random", "Lkotlin/random/Random;", "flatMapIndexed", "C", "source", "transform", "Lkotlin/Function2;", "", "constrainOnce", "generateSequence", "", "nextFunction", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "seedFunction", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes6.dex */
public class SequencesKt__SequencesKt extends kotlin.sequences.SequencesKt__SequencesJVMKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object flatten$lambda$3$SequencesKt__SequencesKt(java.lang.Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object generateSequence$lambda$5$SequencesKt__SequencesKt(java.lang.Object obj) {
        return obj;
    }

    private static final <T> kotlin.sequences.Sequence<T> Sequence(final kotlin.jvm.functions.Function0<? extends java.util.Iterator<? extends T>> iterator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new kotlin.sequences.Sequence<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$Sequence$1
            @Override // kotlin.sequences.Sequence
            public java.util.Iterator<T> iterator() {
                return iterator.invoke();
            }
        };
    }

    public static final <T> kotlin.sequences.Sequence<T> asSequence(final java.util.Iterator<? extends T> it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "<this>");
        return kotlin.sequences.SequencesKt.constrainOnce(new kotlin.sequences.Sequence<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public java.util.Iterator<T> iterator() {
                return it;
            }
        });
    }

    public static final <T> kotlin.sequences.Sequence<T> sequenceOf(T... elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.ArraysKt.asSequence(elements);
    }

    public static final <T> kotlin.sequences.Sequence<T> emptySequence() {
        return kotlin.sequences.EmptySequence.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> kotlin.sequences.Sequence<T> orEmpty(kotlin.sequences.Sequence<? extends T> sequence) {
        return sequence == 0 ? kotlin.sequences.SequencesKt.emptySequence() : sequence;
    }

    public static final <T> kotlin.sequences.Sequence<T> ifEmpty(kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function0<? extends kotlin.sequences.Sequence<? extends T>> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return kotlin.sequences.SequencesKt.sequence(new kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1(sequence, defaultValue, null));
    }

    public static final <T> kotlin.sequences.Sequence<T> flatten(kotlin.sequences.Sequence<? extends kotlin.sequences.Sequence<? extends T>> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "<this>");
        return flatten$SequencesKt__SequencesKt(sequence, new kotlin.jvm.functions.Function1() { // from class: kotlin.sequences.SequencesKt__SequencesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.Iterator flatten$lambda$1$SequencesKt__SequencesKt;
                flatten$lambda$1$SequencesKt__SequencesKt = kotlin.sequences.SequencesKt__SequencesKt.flatten$lambda$1$SequencesKt__SequencesKt((kotlin.sequences.Sequence) obj);
                return flatten$lambda$1$SequencesKt__SequencesKt;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Iterator flatten$lambda$1$SequencesKt__SequencesKt(kotlin.sequences.Sequence it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Iterator flatten$lambda$2$SequencesKt__SequencesKt(java.lang.Iterable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.iterator();
    }

    public static final <T> kotlin.sequences.Sequence<T> flattenSequenceOfIterable(kotlin.sequences.Sequence<? extends java.lang.Iterable<? extends T>> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "<this>");
        return flatten$SequencesKt__SequencesKt(sequence, new kotlin.jvm.functions.Function1() { // from class: kotlin.sequences.SequencesKt__SequencesKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.Iterator flatten$lambda$2$SequencesKt__SequencesKt;
                flatten$lambda$2$SequencesKt__SequencesKt = kotlin.sequences.SequencesKt__SequencesKt.flatten$lambda$2$SequencesKt__SequencesKt((java.lang.Iterable) obj);
                return flatten$lambda$2$SequencesKt__SequencesKt;
            }
        });
    }

    private static final <T, R> kotlin.sequences.Sequence<R> flatten$SequencesKt__SequencesKt(kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function1<? super T, ? extends java.util.Iterator<? extends R>> function1) {
        if (sequence instanceof kotlin.sequences.TransformingSequence) {
            return ((kotlin.sequences.TransformingSequence) sequence).flatten$kotlin_stdlib(function1);
        }
        return new kotlin.sequences.FlatteningSequence(sequence, new kotlin.jvm.functions.Function1() { // from class: kotlin.sequences.SequencesKt__SequencesKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object flatten$lambda$3$SequencesKt__SequencesKt;
                flatten$lambda$3$SequencesKt__SequencesKt = kotlin.sequences.SequencesKt__SequencesKt.flatten$lambda$3$SequencesKt__SequencesKt(obj);
                return flatten$lambda$3$SequencesKt__SequencesKt;
            }
        }, function1);
    }

    public static final <T, R> kotlin.Pair<java.util.List<T>, java.util.List<R>> unzip(kotlin.sequences.Sequence<? extends kotlin.Pair<? extends T, ? extends R>> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (kotlin.Pair<? extends T, ? extends R> pair : sequence) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return kotlin.TuplesKt.to(arrayList, arrayList2);
    }

    public static final <T> kotlin.sequences.Sequence<T> shuffled(kotlin.sequences.Sequence<? extends T> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "<this>");
        return kotlin.sequences.SequencesKt.shuffled(sequence, kotlin.random.Random.INSTANCE);
    }

    public static final <T> kotlin.sequences.Sequence<T> shuffled(kotlin.sequences.Sequence<? extends T> sequence, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        return kotlin.sequences.SequencesKt.sequence(new kotlin.sequences.SequencesKt__SequencesKt$shuffled$1(sequence, random, null));
    }

    public static final <T, C, R> kotlin.sequences.Sequence<R> flatMapIndexed(kotlin.sequences.Sequence<? extends T> source, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends C> transform, kotlin.jvm.functions.Function1<? super C, ? extends java.util.Iterator<? extends R>> iterator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "transform");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterator, "iterator");
        return kotlin.sequences.SequencesKt.sequence(new kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1(source, transform, iterator, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlin.sequences.Sequence<T> constrainOnce(kotlin.sequences.Sequence<? extends T> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence instanceof kotlin.sequences.ConstrainedOnceSequence ? sequence : new kotlin.sequences.ConstrainedOnceSequence(sequence);
    }

    public static final <T> kotlin.sequences.Sequence<T> generateSequence(final kotlin.jvm.functions.Function0<? extends T> nextFunction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return kotlin.sequences.SequencesKt.constrainOnce(new kotlin.sequences.GeneratorSequence(nextFunction, new kotlin.jvm.functions.Function1() { // from class: kotlin.sequences.SequencesKt__SequencesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object generateSequence$lambda$4$SequencesKt__SequencesKt;
                generateSequence$lambda$4$SequencesKt__SequencesKt = kotlin.sequences.SequencesKt__SequencesKt.generateSequence$lambda$4$SequencesKt__SequencesKt(kotlin.jvm.functions.Function0.this, obj);
                return generateSequence$lambda$4$SequencesKt__SequencesKt;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object generateSequence$lambda$4$SequencesKt__SequencesKt(kotlin.jvm.functions.Function0 function0, java.lang.Object it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return function0.invoke();
    }

    public static final <T> kotlin.sequences.Sequence<T> generateSequence(final T t, kotlin.jvm.functions.Function1<? super T, ? extends T> nextFunction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        if (t == null) {
            return kotlin.sequences.EmptySequence.INSTANCE;
        }
        return new kotlin.sequences.GeneratorSequence(new kotlin.jvm.functions.Function0() { // from class: kotlin.sequences.SequencesKt__SequencesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.Object generateSequence$lambda$5$SequencesKt__SequencesKt;
                generateSequence$lambda$5$SequencesKt__SequencesKt = kotlin.sequences.SequencesKt__SequencesKt.generateSequence$lambda$5$SequencesKt__SequencesKt(t);
                return generateSequence$lambda$5$SequencesKt__SequencesKt;
            }
        }, nextFunction);
    }

    public static final <T> kotlin.sequences.Sequence<T> generateSequence(kotlin.jvm.functions.Function0<? extends T> seedFunction, kotlin.jvm.functions.Function1<? super T, ? extends T> nextFunction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(seedFunction, "seedFunction");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return new kotlin.sequences.GeneratorSequence(seedFunction, nextFunction);
    }
}
