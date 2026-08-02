package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\u001a¥\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032b\u0010\f\u001a^\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00018\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00020\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a¹\u0001\u0010\u0013\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0011*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0012\u001a\u00028\u00032b\u0010\f\u001a^\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00018\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00020\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aÆ\u0001\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000326\u0010\u0016\u001a2\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u00152K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aÚ\u0001\u0010\u001a\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0011*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0012\u001a\u00028\u000326\u0010\u0016\u001a2\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u00152K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0081\u0001\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u001c\u001a\u00028\u000226\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001d\u001a\u0095\u0001\u0010\u001a\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0011*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0012\u001a\u00028\u00032\u0006\u0010\u001c\u001a\u00028\u000226\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001e\u001a\u0092\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u001f\"\b\b\u0001\u0010\u0000*\u00028\u0000\"\u0004\b\u0002\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a¦\u0001\u0010\"\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u001f\"\b\b\u0001\u0010\u0000*\u00028\u0000\"\u0004\b\u0002\u0010\u0001\"\u0016\b\u0003\u0010\u0011*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u0010*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u00032K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001aI\u0010%\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0016\b\u0002\u0010\u0011*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00020$0\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0012\u001a\u00028\u0002¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "K", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/collections/Grouping;", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "key", "accumulator", "element", "", "first", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "", "aggregate", "(Lkotlin/collections/Grouping;Lkotlin/jvm/functions/Function4;)Ljava/util/Map;", "", "M", "destination", "aggregateTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function4;)Ljava/util/Map;", "Lkotlin/Function2;", "initialValueSelector", "Lkotlin/Function3;", "fold", "(Lkotlin/collections/Grouping;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "foldTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "initialValue", "(Lkotlin/collections/Grouping;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "(Lkotlin/collections/Grouping;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "S", "reduce", "(Lkotlin/collections/Grouping;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "reduceTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "", "eachCountTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;)Ljava/util/Map;"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/GroupingKt")
/* loaded from: classes17.dex */
class GroupingKt__GroupingKt extends kotlin.collections.GroupingKt__GroupingJVMKt {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T, K, R> java.util.Map<K, R> aggregate(kotlin.collections.Grouping<T, ? extends K> grouping, kotlin.jvm.functions.Function4<? super K, ? super R, ? super T, ? super java.lang.Boolean, ? extends R> function4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function4, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<T> sourceIterator = grouping.sourceIterator();
        while (sourceIterator.hasNext()) {
            ?? next = sourceIterator.next();
            java.lang.Object keyOf = grouping.keyOf(next);
            a.d dVar = (java.lang.Object) linkedHashMap.get(keyOf);
            linkedHashMap.put(keyOf, function4.invoke(keyOf, dVar, next, java.lang.Boolean.valueOf(dVar == null && !linkedHashMap.containsKey(keyOf))));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    public static final <T, K, R, M extends java.util.Map<? super K, R>> M aggregateTo(kotlin.collections.Grouping<T, ? extends K> grouping, M m, kotlin.jvm.functions.Function4<? super K, ? super R, ? super T, ? super java.lang.Boolean, ? extends R> function4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function4, "");
        java.util.Iterator<T> sourceIterator = grouping.sourceIterator();
        while (sourceIterator.hasNext()) {
            ?? next = sourceIterator.next();
            java.lang.Object keyOf = grouping.keyOf(next);
            a.d dVar = (java.lang.Object) m.get(keyOf);
            m.put(keyOf, function4.invoke(keyOf, dVar, next, java.lang.Boolean.valueOf(dVar == null && !m.containsKey(keyOf))));
        }
        return m;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T, K, R> java.util.Map<K, R> fold(kotlin.collections.Grouping<T, ? extends K> grouping, kotlin.jvm.functions.Function2<? super K, ? super T, ? extends R> function2, kotlin.jvm.functions.Function3<? super K, ? super R, ? super T, ? extends R> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<T> sourceIterator = grouping.sourceIterator();
        while (sourceIterator.hasNext()) {
            ?? next = sourceIterator.next();
            java.lang.Object keyOf = grouping.keyOf(next);
            R r = (java.lang.Object) linkedHashMap.get(keyOf);
            if (r == null && !linkedHashMap.containsKey(keyOf)) {
                r = function2.invoke(keyOf, next);
            }
            linkedHashMap.put(keyOf, function3.invoke(keyOf, r, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    public static final <T, K, R, M extends java.util.Map<? super K, R>> M foldTo(kotlin.collections.Grouping<T, ? extends K> grouping, M m, kotlin.jvm.functions.Function2<? super K, ? super T, ? extends R> function2, kotlin.jvm.functions.Function3<? super K, ? super R, ? super T, ? extends R> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        java.util.Iterator<T> sourceIterator = grouping.sourceIterator();
        while (sourceIterator.hasNext()) {
            ?? next = sourceIterator.next();
            java.lang.Object keyOf = grouping.keyOf(next);
            R r = (java.lang.Object) m.get(keyOf);
            if (r == null && !m.containsKey(keyOf)) {
                r = function2.invoke(keyOf, next);
            }
            m.put(keyOf, function3.invoke(keyOf, r, next));
        }
        return m;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T, K, R> java.util.Map<K, R> fold(kotlin.collections.Grouping<T, ? extends K> grouping, R r, kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<T> sourceIterator = grouping.sourceIterator();
        while (sourceIterator.hasNext()) {
            ?? next = sourceIterator.next();
            K keyOf = grouping.keyOf(next);
            amex.AMEXKernel aMEXKernel = (java.lang.Object) linkedHashMap.get(keyOf);
            if (aMEXKernel == null && !linkedHashMap.containsKey(keyOf)) {
                aMEXKernel = (java.lang.Object) r;
            }
            linkedHashMap.put(keyOf, function2.invoke(aMEXKernel, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    public static final <T, K, R, M extends java.util.Map<? super K, R>> M foldTo(kotlin.collections.Grouping<T, ? extends K> grouping, M m, R r, kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.util.Iterator<T> sourceIterator = grouping.sourceIterator();
        while (sourceIterator.hasNext()) {
            ?? next = sourceIterator.next();
            K keyOf = grouping.keyOf(next);
            amex.AMEXKernel aMEXKernel = (java.lang.Object) m.get(keyOf);
            if (aMEXKernel == null && !m.containsKey(keyOf)) {
                aMEXKernel = (java.lang.Object) r;
            }
            m.put(keyOf, function2.invoke(aMEXKernel, next));
        }
        return m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <S, T extends S, K> java.util.Map<K, S> reduce(kotlin.collections.Grouping<T, ? extends K> grouping, kotlin.jvm.functions.Function3<? super K, ? super S, ? super T, ? extends S> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator sourceIterator = grouping.sourceIterator();
        while (sourceIterator.hasNext()) {
            S s = (java.lang.Object) sourceIterator.next();
            java.lang.Object keyOf = grouping.keyOf(s);
            a.d dVar = (java.lang.Object) linkedHashMap.get(keyOf);
            if (dVar != null || linkedHashMap.containsKey(keyOf)) {
                s = function3.invoke(keyOf, dVar, s);
            }
            linkedHashMap.put(keyOf, s);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <S, T extends S, K, M extends java.util.Map<? super K, S>> M reduceTo(kotlin.collections.Grouping<T, ? extends K> grouping, M m, kotlin.jvm.functions.Function3<? super K, ? super S, ? super T, ? extends S> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        java.util.Iterator sourceIterator = grouping.sourceIterator();
        while (sourceIterator.hasNext()) {
            S s = (java.lang.Object) sourceIterator.next();
            java.lang.Object keyOf = grouping.keyOf(s);
            a.d dVar = (java.lang.Object) m.get(keyOf);
            if (dVar != null || m.containsKey(keyOf)) {
                s = function3.invoke(keyOf, dVar, s);
            }
            m.put(keyOf, s);
        }
        return m;
    }

    public static final <T, K, M extends java.util.Map<? super K, java.lang.Integer>> M eachCountTo(kotlin.collections.Grouping<T, ? extends K> grouping, M m) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "");
        java.util.Iterator<T> sourceIterator = grouping.sourceIterator();
        while (sourceIterator.hasNext()) {
            K keyOf = grouping.keyOf(sourceIterator.next());
            java.lang.Object obj = m.get(keyOf);
            if (obj == null && !m.containsKey(keyOf)) {
                obj = 0;
            }
            m.put(keyOf, java.lang.Integer.valueOf(((java.lang.Number) obj).intValue() + 1));
        }
        return m;
    }
}
