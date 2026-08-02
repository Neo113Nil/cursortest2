package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001aE\u0010\n\u001a\u00028\u0000\"\u0010\b\u0000\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0007\"\u0004\b\u0001\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\t\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0011*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a?\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0017\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0015j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0016¢\u0006\u0004\b\u0013\u0010\u0018\u001a\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\b\u0012\u0004\u0012\u00020\u00190\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u001c*\b\u0012\u0004\u0012\u00020\u001c0\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001d\u001a+\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0011*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001e\u001aI\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fH\u0087\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a=\u0010#\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0017\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0015j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0016H\u0007¢\u0006\u0004\b#\u0010$\u001a\u001b\u0010%\u001a\u0004\u0018\u00010\u0019*\b\u0012\u0004\u0012\u00020\u00190\u0001H\u0007¢\u0006\u0004\b%\u0010\u001b\u001a\u001b\u0010%\u001a\u0004\u0018\u00010\u001c*\b\u0012\u0004\u0012\u00020\u001c0\u0001H\u0007¢\u0006\u0004\b%\u0010\u001d\u001a+\u0010%\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0011*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b%\u0010\u001e\u001aI\u0010&\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fH\u0087\bø\u0001\u0000¢\u0006\u0004\b&\u0010\"\u001a=\u0010'\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0017\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0015j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0016H\u0007¢\u0006\u0004\b'\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "Ljava/lang/Class;", "klass", "", "filterIsInstance", "(Ljava/lang/Iterable;Ljava/lang/Class;)Ljava/util/List;", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "destination", "filterIsInstanceTo", "(Ljava/lang/Iterable;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "T", "", "", "reverse", "(Ljava/util/List;)V", "", "Ljava/util/SortedSet;", "toSortedSet", "(Ljava/lang/Iterable;)Ljava/util/SortedSet;", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "comparator", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/SortedSet;", "", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "(Ljava/lang/Iterable;)Ljava/lang/Double;", "", "(Ljava/lang/Iterable;)Ljava/lang/Float;", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "Lkotlin/Function1;", "selector", "maxBy", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "maxWith", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/lang/Object;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "minBy", "minWith"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
public class CollectionsKt___CollectionsJvmKt extends kotlin.collections.CollectionsKt__ReversedViewsKt {
    public static final <R> java.util.List<R> filterIsInstance(java.lang.Iterable<?> iterable, java.lang.Class<R> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return (java.util.List) kotlin.collections.CollectionsKt.filterIsInstanceTo(iterable, new java.util.ArrayList(), cls);
    }

    @kotlin.IgnorableReturnValue
    public static final <C extends java.util.Collection<? super R>, R> C filterIsInstanceTo(java.lang.Iterable<?> iterable, C c, java.lang.Class<R> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        for (java.lang.Object obj : iterable) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    public static final <T> void reverse(java.util.List<T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.Collections.reverse(list);
    }

    public static final <T extends java.lang.Comparable<? super T>> java.util.SortedSet<T> toSortedSet(java.lang.Iterable<? extends T> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return (java.util.SortedSet) kotlin.collections.CollectionsKt.toCollection(iterable, new java.util.TreeSet());
    }

    public static final <T> java.util.SortedSet<T> toSortedSet(java.lang.Iterable<? extends T> iterable, java.util.Comparator<? super T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        return (java.util.SortedSet) kotlin.collections.CollectionsKt.toCollection(iterable, new java.util.TreeSet(comparator));
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ java.lang.Double m23549max(java.lang.Iterable iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return kotlin.collections.CollectionsKt.maxOrNull(iterable);
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ java.lang.Float m23550max(java.lang.Iterable iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return kotlin.collections.CollectionsKt.maxOrNull(iterable);
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Comparable max(java.lang.Iterable iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return kotlin.collections.CollectionsKt.maxOrNull(iterable);
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Object maxWith(java.lang.Iterable iterable, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        return kotlin.collections.CollectionsKt.maxWithOrNull(iterable, comparator);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ java.lang.Double m23551min(java.lang.Iterable iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return kotlin.collections.CollectionsKt.minOrNull(iterable);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ java.lang.Float m23552min(java.lang.Iterable iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return kotlin.collections.CollectionsKt.minOrNull(iterable);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Comparable min(java.lang.Iterable iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return kotlin.collections.CollectionsKt.minOrNull(iterable);
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Object minWith(java.lang.Iterable iterable, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        return kotlin.collections.CollectionsKt.minWithOrNull(iterable, comparator);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends java.lang.Comparable<? super R>> T maxBy(java.lang.Iterable<? extends T> iterable, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<? extends T> it = iterable.iterator();
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
    public static final /* synthetic */ <T, R extends java.lang.Comparable<? super R>> T minBy(java.lang.Iterable<? extends T> iterable, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<? extends T> it = iterable.iterator();
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
