package kotlin.sequences;

@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aE\u0010\t\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\b\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0012\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0010j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0011¢\u0006\u0004\b\u000e\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\b\u0012\u0004\u0012\u00020\u00140\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u0017*\b\u0012\u0004\u0012\u00020\u00170\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0018\u001a+\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0019\u001aI\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a=\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0012\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0010j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0011H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010 \u001a\u0004\u0018\u00010\u0014*\b\u0012\u0004\u0012\u00020\u00140\u0001H\u0007¢\u0006\u0004\b \u0010\u0016\u001a\u001b\u0010 \u001a\u0004\u0018\u00010\u0017*\b\u0012\u0004\u0012\u00020\u00170\u0001H\u0007¢\u0006\u0004\b \u0010\u0018\u001a+\u0010 \u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b \u0010\u0019\u001aI\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0087\bø\u0001\u0000¢\u0006\u0004\b!\u0010\u001d\u001a=\u0010\"\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0012\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0010j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0011H\u0007¢\u0006\u0004\b\"\u0010\u001f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/sequences/Sequence;", "Ljava/lang/Class;", "klass", "filterIsInstance", "(Lkotlin/sequences/Sequence;Ljava/lang/Class;)Lkotlin/sequences/Sequence;", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "destination", "filterIsInstanceTo", "(Lkotlin/sequences/Sequence;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "", "T", "Ljava/util/SortedSet;", "toSortedSet", "(Lkotlin/sequences/Sequence;)Ljava/util/SortedSet;", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "comparator", "(Lkotlin/sequences/Sequence;Ljava/util/Comparator;)Ljava/util/SortedSet;", "", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "(Lkotlin/sequences/Sequence;)Ljava/lang/Double;", "", "(Lkotlin/sequences/Sequence;)Ljava/lang/Float;", "(Lkotlin/sequences/Sequence;)Ljava/lang/Comparable;", "Lkotlin/Function1;", "selector", "maxBy", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "maxWith", "(Lkotlin/sequences/Sequence;Ljava/util/Comparator;)Ljava/lang/Object;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "minBy", "minWith"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes3.dex */
class SequencesKt___SequencesJvmKt extends kotlin.sequences.SequencesKt__SequencesKt {
    public static final <R> kotlin.sequences.Sequence<R> filterIsInstance(kotlin.sequences.Sequence<?> sequence, final java.lang.Class<R> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.sequences.Sequence<R> filter = kotlin.sequences.SequencesKt.filter(sequence, new kotlin.jvm.functions.Function1() { // from class: kotlin.sequences.SequencesKt___SequencesJvmKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean isInstance;
                isInstance = cls.isInstance(obj);
                return java.lang.Boolean.valueOf(isInstance);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNull(filter, "");
        return filter;
    }

    @kotlin.IgnorableReturnValue
    public static final <C extends java.util.Collection<? super R>, R> C filterIsInstanceTo(kotlin.sequences.Sequence<?> sequence, C c, java.lang.Class<R> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        for (java.lang.Object obj : sequence) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    public static final <T extends java.lang.Comparable<? super T>> java.util.SortedSet<T> toSortedSet(kotlin.sequences.Sequence<? extends T> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return (java.util.SortedSet) kotlin.sequences.SequencesKt.toCollection(sequence, new java.util.TreeSet());
    }

    public static final <T> java.util.SortedSet<T> toSortedSet(kotlin.sequences.Sequence<? extends T> sequence, java.util.Comparator<? super T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        return (java.util.SortedSet) kotlin.sequences.SequencesKt.toCollection(sequence, new java.util.TreeSet(comparator));
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ java.lang.Double m23906max(kotlin.sequences.Sequence sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return kotlin.sequences.SequencesKt.maxOrNull(sequence);
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ java.lang.Float m23907max(kotlin.sequences.Sequence sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return kotlin.sequences.SequencesKt.maxOrNull(sequence);
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Comparable max(kotlin.sequences.Sequence sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return kotlin.sequences.SequencesKt.maxOrNull(sequence);
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Object maxWith(kotlin.sequences.Sequence sequence, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        return kotlin.sequences.SequencesKt.maxWithOrNull(sequence, comparator);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ java.lang.Double m23908min(kotlin.sequences.Sequence sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return kotlin.sequences.SequencesKt.minOrNull(sequence);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ java.lang.Float m23909min(kotlin.sequences.Sequence sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return kotlin.sequences.SequencesKt.minOrNull(sequence);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Comparable min(kotlin.sequences.Sequence sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return kotlin.sequences.SequencesKt.minOrNull(sequence);
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Object minWith(kotlin.sequences.Sequence sequence, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        return kotlin.sequences.SequencesKt.minWithOrNull(sequence, comparator);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends java.lang.Comparable<? super R>> T maxBy(kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R invoke = function1.invoke(next);
        do {
            T next2 = it.next();
            R invoke2 = function1.invoke(next2);
            next = next;
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends java.lang.Comparable<? super R>> T minBy(kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R invoke = function1.invoke(next);
        do {
            T next2 = it.next();
            R invoke2 = function1.invoke(next2);
            next = next;
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }
}
