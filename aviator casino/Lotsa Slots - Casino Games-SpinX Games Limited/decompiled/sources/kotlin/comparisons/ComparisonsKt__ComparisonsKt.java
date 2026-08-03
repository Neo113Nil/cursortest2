package kotlin.comparisons;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Comparisons.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0007\u001aY\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u000226\u0010\u0005\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u00070\u0006\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\t\u001aG\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u00022 \u0010\u0005\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u00070\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\t\u001aA\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u00022\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001a]\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u00022\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`\u00112\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000e0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a-\u0010\u0013\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\b2\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0014\u001aY\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u000226\u0010\u0005\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u00070\u0006\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\u0016\u001aC\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a_\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`\u00112\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000e0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001aC\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a_\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`\u00112\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000e0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001aW\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u00112\u001a\b\u0004\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001as\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000e*\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u00112\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`\u00112\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000e0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001aW\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u00112\u001a\b\u0004\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001as\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000e*\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u00112\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`\u00112\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000e0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001au\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u001128\b\u0004\u0010\u001e\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00010\u001fH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\"\u001aT\u0010#\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u00112\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0011H\u0086\u0004¢\u0006\u0002\u0010$\u001aT\u0010%\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u00112\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0011H\u0086\u0004¢\u0006\u0002\u0010$\u001aE\u0010&\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0010j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0011\"\b\b\u0000\u0010\u0002*\u00020'2\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0011¢\u0006\u0002\u0010(\u001a2\u0010&\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0010j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0011\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\bH\u0087\b¢\u0006\u0002\u0010)\u001aE\u0010*\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0010j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0011\"\b\b\u0000\u0010\u0002*\u00020'2\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0011¢\u0006\u0002\u0010(\u001a2\u0010*\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0010j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0011\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\bH\u0087\b¢\u0006\u0002\u0010)\u001a+\u0010+\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b¢\u0006\u0002\u0010)\u001a+\u0010,\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b¢\u0006\u0002\u0010)\u001a5\u0010-\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011¢\u0006\u0002\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006."}, d2 = {"compareValuesBy", "", "T", "a", "b", "selectors", "", "Lkotlin/Function1;", "", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "compareValuesByImpl", "compareValuesByImpl$ComparisonsKt__ComparisonsKt", "selector", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "K", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)I", "compareValues", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "compareBy", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "(Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "(Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "compareByDescending", "thenBy", "(Ljava/util/Comparator;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "thenByDescending", "thenComparator", "comparison", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "(Ljava/util/Comparator;Lkotlin/jvm/functions/Function2;)Ljava/util/Comparator;", "then", "(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;", "thenDescending", "nullsFirst", "", "(Ljava/util/Comparator;)Ljava/util/Comparator;", "()Ljava/util/Comparator;", "nullsLast", "naturalOrder", "reverseOrder", "reversed", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes6.dex */
public class ComparisonsKt__ComparisonsKt {
    public static final <T> int compareValuesBy(T t, T t2, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>>... selectors) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length <= 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        return compareValuesByImpl$ComparisonsKt__ComparisonsKt(t, t2, selectors);
    }

    private static final <T> int compareValuesByImpl$ComparisonsKt__ComparisonsKt(T t, T t2, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>>[] function1Arr) {
        for (kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> function1 : function1Arr) {
            int compareValues = kotlin.comparisons.ComparisonsKt.compareValues(function1.invoke(t), function1.invoke(t2));
            if (compareValues != 0) {
                return compareValues;
            }
        }
        return 0;
    }

    private static final <T> int compareValuesBy(T t, T t2, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        return kotlin.comparisons.ComparisonsKt.compareValues(selector.invoke(t), selector.invoke(t2));
    }

    private static final <T, K> int compareValuesBy(T t, T t2, java.util.Comparator<? super K> comparator, kotlin.jvm.functions.Function1<? super T, ? extends K> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        return comparator.compare(selector.invoke(t), selector.invoke(t2));
    }

    public static final <T extends java.lang.Comparable<?>> int compareValues(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static final <T> java.util.Comparator<T> compareBy(final kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>>... selectors) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length <= 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        return new java.util.Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda3
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int compareBy$lambda$0$ComparisonsKt__ComparisonsKt;
                compareBy$lambda$0$ComparisonsKt__ComparisonsKt = kotlin.comparisons.ComparisonsKt__ComparisonsKt.compareBy$lambda$0$ComparisonsKt__ComparisonsKt(selectors, obj, obj2);
                return compareBy$lambda$0$ComparisonsKt__ComparisonsKt;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int compareBy$lambda$0$ComparisonsKt__ComparisonsKt(kotlin.jvm.functions.Function1[] function1Arr, java.lang.Object obj, java.lang.Object obj2) {
        return compareValuesByImpl$ComparisonsKt__ComparisonsKt(obj, obj2, function1Arr);
    }

    private static final <T> java.util.Comparator<T> compareBy(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        return new kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$2(selector);
    }

    private static final <T, K> java.util.Comparator<T> compareBy(final java.util.Comparator<? super K> comparator, final kotlin.jvm.functions.Function1<? super T, ? extends K> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        return new java.util.Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$3
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                java.util.Comparator<? super K> comparator2 = comparator;
                kotlin.jvm.functions.Function1<T, K> function1 = selector;
                return comparator2.compare(function1.invoke(t), function1.invoke(t2));
            }
        };
    }

    private static final <T> java.util.Comparator<T> compareByDescending(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        return new kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$1(selector);
    }

    private static final <T, K> java.util.Comparator<T> compareByDescending(final java.util.Comparator<? super K> comparator, final kotlin.jvm.functions.Function1<? super T, ? extends K> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        return new java.util.Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$2
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                java.util.Comparator<? super K> comparator2 = comparator;
                kotlin.jvm.functions.Function1<T, K> function1 = selector;
                return comparator2.compare(function1.invoke(t2), function1.invoke(t));
            }
        };
    }

    private static final <T> java.util.Comparator<T> thenBy(final java.util.Comparator<T> comparator, final kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        return new java.util.Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator.compare(t, t2);
                if (compare != 0) {
                    return compare;
                }
                kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> function1 = selector;
                return kotlin.comparisons.ComparisonsKt.compareValues(function1.invoke(t), function1.invoke(t2));
            }
        };
    }

    private static final <T, K> java.util.Comparator<T> thenBy(final java.util.Comparator<T> comparator, final java.util.Comparator<? super K> comparator2, final kotlin.jvm.functions.Function1<? super T, ? extends K> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator2, "comparator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        return new java.util.Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenBy$2
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator.compare(t, t2);
                if (compare != 0) {
                    return compare;
                }
                java.util.Comparator<? super K> comparator3 = comparator2;
                kotlin.jvm.functions.Function1<T, K> function1 = selector;
                return comparator3.compare(function1.invoke(t), function1.invoke(t2));
            }
        };
    }

    private static final <T> java.util.Comparator<T> thenByDescending(final java.util.Comparator<T> comparator, final kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        return new java.util.Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator.compare(t, t2);
                if (compare != 0) {
                    return compare;
                }
                kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> function1 = selector;
                return kotlin.comparisons.ComparisonsKt.compareValues(function1.invoke(t2), function1.invoke(t));
            }
        };
    }

    private static final <T, K> java.util.Comparator<T> thenByDescending(final java.util.Comparator<T> comparator, final java.util.Comparator<? super K> comparator2, final kotlin.jvm.functions.Function1<? super T, ? extends K> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator2, "comparator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        return new java.util.Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenByDescending$2
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator.compare(t, t2);
                if (compare != 0) {
                    return compare;
                }
                java.util.Comparator<? super K> comparator3 = comparator2;
                kotlin.jvm.functions.Function1<T, K> function1 = selector;
                return comparator3.compare(function1.invoke(t2), function1.invoke(t));
            }
        };
    }

    private static final <T> java.util.Comparator<T> thenComparator(final java.util.Comparator<T> comparator, final kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Integer> comparison) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparison, "comparison");
        return new java.util.Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenComparator$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator.compare(t, t2);
                return compare != 0 ? compare : comparison.invoke(t, t2).intValue();
            }
        };
    }

    public static final <T> java.util.Comparator<T> then(final java.util.Comparator<T> comparator, final java.util.Comparator<? super T> comparator2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new java.util.Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda2
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int then$lambda$1$ComparisonsKt__ComparisonsKt;
                then$lambda$1$ComparisonsKt__ComparisonsKt = kotlin.comparisons.ComparisonsKt__ComparisonsKt.then$lambda$1$ComparisonsKt__ComparisonsKt(comparator, comparator2, obj, obj2);
                return then$lambda$1$ComparisonsKt__ComparisonsKt;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int then$lambda$1$ComparisonsKt__ComparisonsKt(java.util.Comparator comparator, java.util.Comparator comparator2, java.lang.Object obj, java.lang.Object obj2) {
        int compare = comparator.compare(obj, obj2);
        return compare != 0 ? compare : comparator2.compare(obj, obj2);
    }

    public static final <T> java.util.Comparator<T> thenDescending(final java.util.Comparator<T> comparator, final java.util.Comparator<? super T> comparator2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new java.util.Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int thenDescending$lambda$2$ComparisonsKt__ComparisonsKt;
                thenDescending$lambda$2$ComparisonsKt__ComparisonsKt = kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(comparator, comparator2, obj, obj2);
                return thenDescending$lambda$2$ComparisonsKt__ComparisonsKt;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(java.util.Comparator comparator, java.util.Comparator comparator2, java.lang.Object obj, java.lang.Object obj2) {
        int compare = comparator.compare(obj, obj2);
        return compare != 0 ? compare : comparator2.compare(obj2, obj);
    }

    public static final <T> java.util.Comparator<T> nullsFirst(final java.util.Comparator<? super T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new java.util.Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda4
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt;
                nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt = kotlin.comparisons.ComparisonsKt__ComparisonsKt.nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt(comparator, obj, obj2);
                return nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt(java.util.Comparator comparator, java.lang.Object obj, java.lang.Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    private static final <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> nullsFirst() {
        return kotlin.comparisons.ComparisonsKt.nullsFirst(kotlin.comparisons.ComparisonsKt.naturalOrder());
    }

    public static final <T> java.util.Comparator<T> nullsLast(final java.util.Comparator<? super T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new java.util.Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int nullsLast$lambda$4$ComparisonsKt__ComparisonsKt;
                nullsLast$lambda$4$ComparisonsKt__ComparisonsKt = kotlin.comparisons.ComparisonsKt__ComparisonsKt.nullsLast$lambda$4$ComparisonsKt__ComparisonsKt(comparator, obj, obj2);
                return nullsLast$lambda$4$ComparisonsKt__ComparisonsKt;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nullsLast$lambda$4$ComparisonsKt__ComparisonsKt(java.util.Comparator comparator, java.lang.Object obj, java.lang.Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    private static final <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> nullsLast() {
        return kotlin.comparisons.ComparisonsKt.nullsLast(kotlin.comparisons.ComparisonsKt.naturalOrder());
    }

    public static final <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> naturalOrder() {
        kotlin.comparisons.NaturalOrderComparator naturalOrderComparator = kotlin.comparisons.NaturalOrderComparator.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(naturalOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return naturalOrderComparator;
    }

    public static final <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> reverseOrder() {
        kotlin.comparisons.ReverseOrderComparator reverseOrderComparator = kotlin.comparisons.ReverseOrderComparator.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(reverseOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return reverseOrderComparator;
    }

    public static final <T> java.util.Comparator<T> reversed(java.util.Comparator<T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "<this>");
        if (comparator instanceof kotlin.comparisons.ReversedComparator) {
            return ((kotlin.comparisons.ReversedComparator) comparator).getComparator();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(comparator, kotlin.comparisons.NaturalOrderComparator.INSTANCE)) {
            kotlin.comparisons.ReverseOrderComparator reverseOrderComparator = kotlin.comparisons.ReverseOrderComparator.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(reverseOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
            return reverseOrderComparator;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(comparator, kotlin.comparisons.ReverseOrderComparator.INSTANCE)) {
            return new kotlin.comparisons.ReversedComparator(comparator);
        }
        kotlin.comparisons.NaturalOrderComparator naturalOrderComparator = kotlin.comparisons.NaturalOrderComparator.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(naturalOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
        return naturalOrderComparator;
    }
}
