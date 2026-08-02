package kotlin.sequences;

@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\"\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\n\u001a\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0002¢\u0006\u0004\b\u0014\u0010\u0012\u001aE\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001aG\u0010\u001c\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001b0\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0015*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a0\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001e\u0010\u0012\u001a+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001e\u0010!\u001ai\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\"\"\u0004\b\u0002\u0010\u00152\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$2\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00010\u0016H\u0000¢\u0006\u0004\b(\u0010)\u001a#\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b*\u0010\u0012\u001a-\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020+2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r¢\u0006\u0004\b-\u0010.\u001a=\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020+2\b\u0010/\u001a\u0004\u0018\u00018\u00002\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0016¢\u0006\u0004\b-\u00100\u001aC\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020+2\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r2\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0016¢\u0006\u0004\b-\u00102"}, d2 = {"T", "", "Lkotlin/sequences/Sequence;", "asSequence", "(Ljava/util/Iterator;)Lkotlin/sequences/Sequence;", "", "elements", "sequenceOf", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "element", "(Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "emptySequence", "()Lkotlin/sequences/Sequence;", "Lkotlin/Function0;", "defaultValue", "ifEmpty", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;", "flatten", "(Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;", "", "flattenSequenceOfIterable", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "p0", "Camera2StreamConfigurationMap", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "Lkotlin/Pair;", "", "unzip", "(Lkotlin/sequences/Sequence;)Lkotlin/Pair;", "shuffled", "Lkotlin/random/Random;", "random", "(Lkotlin/sequences/Sequence;Lkotlin/random/Random;)Lkotlin/sequences/Sequence;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "source", "Lkotlin/Function2;", "", "transform", "iterator", "flatMapIndexed", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "constrainOnce", "", "nextFunction", "generateSequence", "(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "seedFunction", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes3.dex */
public class SequencesKt__SequencesKt extends kotlin.sequences.SequencesKt__SequencesJVMKt {
    /* renamed from: $r8$lambda$cseudtdU4zbCeV6Mg-lp-bs1JX0, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m23905$r8$lambda$cseudtdU4zbCeV6Mglpbs1JX0(java.lang.Object obj) {
        return obj;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$eiRiKARCOo2Ht_MuMlAffn7d6hs(java.lang.Object obj) {
        return obj;
    }

    public static final <T> kotlin.sequences.Sequence<T> asSequence(final java.util.Iterator<? extends T> it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "");
        return kotlin.sequences.SequencesKt.constrainOnce(new kotlin.sequences.Sequence<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<T> iterator() {
                return it;
            }
        });
    }

    public static final <T> kotlin.sequences.Sequence<T> sequenceOf(T... tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return kotlin.collections.ArraysKt.asSequence(tArr);
    }

    public static final <T> kotlin.sequences.Sequence<T> sequenceOf(final T t) {
        return new kotlin.sequences.Sequence<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$sequenceOf$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<T> iterator() {
                return new kotlin.sequences.SequencesKt__SequencesKt$sequenceOf$1$1(t);
            }
        };
    }

    public static final <T> kotlin.sequences.Sequence<T> emptySequence() {
        return kotlin.sequences.EmptySequence.INSTANCE;
    }

    public static final <T> kotlin.sequences.Sequence<T> ifEmpty(kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function0<? extends kotlin.sequences.Sequence<? extends T>> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return kotlin.sequences.SequencesKt.sequence(new kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1(sequence, function0, null));
    }

    public static final <T> kotlin.sequences.Sequence<T> flatten(kotlin.sequences.Sequence<? extends kotlin.sequences.Sequence<? extends T>> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return Camera2StreamConfigurationMap(sequence, new kotlin.jvm.functions.Function1() { // from class: kotlin.sequences.SequencesKt__SequencesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.sequences.SequencesKt__SequencesKt.$r8$lambda$hPordbPC5Xw5w6MUApwugbNlZ1I((kotlin.sequences.Sequence) obj);
            }
        });
    }

    public static final <T> kotlin.sequences.Sequence<T> flattenSequenceOfIterable(kotlin.sequences.Sequence<? extends java.lang.Iterable<? extends T>> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return Camera2StreamConfigurationMap(sequence, new kotlin.jvm.functions.Function1() { // from class: kotlin.sequences.SequencesKt__SequencesKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.sequences.SequencesKt__SequencesKt.$r8$lambda$nt0hwWaA4ppGj455MJPoEqIa3SU((java.lang.Iterable) obj);
            }
        });
    }

    private static final <T, R> kotlin.sequences.Sequence<R> Camera2StreamConfigurationMap(kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function1<? super T, ? extends java.util.Iterator<? extends R>> function1) {
        if (sequence instanceof kotlin.sequences.TransformingSequence) {
            return ((kotlin.sequences.TransformingSequence) sequence).flatten$kotlin_stdlib(function1);
        }
        return new kotlin.sequences.FlatteningSequence(sequence, new kotlin.jvm.functions.Function1() { // from class: kotlin.sequences.SequencesKt__SequencesKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.sequences.SequencesKt__SequencesKt.m23905$r8$lambda$cseudtdU4zbCeV6Mglpbs1JX0(obj);
            }
        }, function1);
    }

    public static final <T, R> kotlin.Pair<java.util.List<T>, java.util.List<R>> unzip(kotlin.sequences.Sequence<? extends kotlin.Pair<? extends T, ? extends R>> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (kotlin.Pair<? extends T, ? extends R> pair : sequence) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return kotlin.TuplesKt.to(arrayList, arrayList2);
    }

    public static final <T> kotlin.sequences.Sequence<T> shuffled(kotlin.sequences.Sequence<? extends T> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return kotlin.sequences.SequencesKt.shuffled(sequence, kotlin.random.Random.INSTANCE);
    }

    public static final <T> kotlin.sequences.Sequence<T> shuffled(kotlin.sequences.Sequence<? extends T> sequence, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        return kotlin.sequences.SequencesKt.sequence(new kotlin.sequences.SequencesKt__SequencesKt$shuffled$1(sequence, random, null));
    }

    public static final <T, C, R> kotlin.sequences.Sequence<R> flatMapIndexed(kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends C> function2, kotlin.jvm.functions.Function1<? super C, ? extends java.util.Iterator<? extends R>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return kotlin.sequences.SequencesKt.sequence(new kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1(sequence, function2, function1, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlin.sequences.Sequence<T> constrainOnce(kotlin.sequences.Sequence<? extends T> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return sequence instanceof kotlin.sequences.ConstrainedOnceSequence ? sequence : new kotlin.sequences.ConstrainedOnceSequence(sequence);
    }

    public static final <T> kotlin.sequences.Sequence<T> generateSequence(final kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return kotlin.sequences.SequencesKt.constrainOnce(new kotlin.sequences.GeneratorSequence(function0, new kotlin.jvm.functions.Function1() { // from class: kotlin.sequences.SequencesKt__SequencesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.sequences.SequencesKt__SequencesKt.m23904$r8$lambda$8HblPkoO8vEXEU8raYk3YnY_qE(kotlin.jvm.functions.Function0.this, obj);
            }
        }));
    }

    public static final <T> kotlin.sequences.Sequence<T> generateSequence(final T t, kotlin.jvm.functions.Function1<? super T, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (t == null) {
            return kotlin.sequences.EmptySequence.INSTANCE;
        }
        return new kotlin.sequences.GeneratorSequence(new kotlin.jvm.functions.Function0() { // from class: kotlin.sequences.SequencesKt__SequencesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kotlin.sequences.SequencesKt__SequencesKt.$r8$lambda$eiRiKARCOo2Ht_MuMlAffn7d6hs(t);
            }
        }, function1);
    }

    public static final <T> kotlin.sequences.Sequence<T> generateSequence(kotlin.jvm.functions.Function0<? extends T> function0, kotlin.jvm.functions.Function1<? super T, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new kotlin.sequences.GeneratorSequence(function0, function1);
    }

    /* renamed from: $r8$lambda$8HblPkoO8vE-XEU8raYk3YnY_qE, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m23904$r8$lambda$8HblPkoO8vEXEU8raYk3YnY_qE(kotlin.jvm.functions.Function0 function0, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        return function0.invoke();
    }

    public static /* synthetic */ java.util.Iterator $r8$lambda$hPordbPC5Xw5w6MUApwugbNlZ1I(kotlin.sequences.Sequence sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return sequence.iterator();
    }

    public static /* synthetic */ java.util.Iterator $r8$lambda$nt0hwWaA4ppGj455MJPoEqIa3SU(java.lang.Iterable iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return iterable.iterator();
    }
}
