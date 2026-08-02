package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a=\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001ac\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0007*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022$\u0010\u000b\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n0\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001ac\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0007*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022$\u0010\u000b\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000e0\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\r\u001aw\u0010\u0013\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0007\"\u0010\b\u0003\u0010\u0011*\n\u0012\u0006\b\u0000\u0012\u00028\u00020\u0010*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0012\u001a\u00028\u00032$\u0010\u000b\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n0\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aw\u0010\u0015\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0007\"\u0010\b\u0003\u0010\u0011*\n\u0012\u0006\b\u0000\u0012\u00028\u00020\u0010*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0012\u001a\u00028\u00032$\u0010\u000b\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000e0\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a]\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0007*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0004\u0012\u00028\u00020\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\r\u001ac\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0007*\u00020\u0017*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022 \u0010\u000b\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0012\u0004\u0018\u00018\u00020\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\r\u001aw\u0010\u0019\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0007*\u00020\u0017\"\u0010\b\u0003\u0010\u0011*\n\u0012\u0006\b\u0000\u0012\u00028\u00020\u0010*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0012\u001a\u00028\u00032 \u0010\u000b\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0012\u0004\u0018\u00018\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0014\u001aq\u0010\u001a\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0007\"\u0010\b\u0003\u0010\u0011*\n\u0012\u0006\b\u0000\u0012\u00028\u00020\u0010*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0012\u001a\u00028\u00032\u001e\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0004\u0012\u00028\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0014\u001aQ\u0010\u001d\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010\u001c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0004\u0012\u00020\u001b0\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001f\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u001f\u0010 \u001aQ\u0010\u001f\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010\u001c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0004\u0012\u00020\u001b0\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001e\u001aQ\u0010\"\u001a\u00020!\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010\u001c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0004\u0012\u00020\u001b0\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001aQ\u0010&\u001a\u00020$\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010%\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0004\u0012\u00020$0\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a+\u0010(\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b(\u0010 \u001aQ\u0010(\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010\u001c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0004\u0012\u00020\u001b0\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u001e\u001a[\u0010*\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0016\b\u0002\u0010)*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002*\u00028\u00022\u001e\u0010%\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0004\u0012\u00020$0\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001ap\u00100\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0016\b\u0002\u0010)*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002*\u00028\u000223\u0010%\u001a/\u0012\u0013\u0012\u00110!¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0004\u0012\u00020$0,H\u0086\bø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a=\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\u000e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"K", "V", "", "", "Lkotlin/Pair;", "toList", "(Ljava/util/Map;)Ljava/util/List;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "", "", "transform", "flatMap", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Lkotlin/sequences/Sequence;", "flatMapSequence", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "destination", "flatMapTo", "(Ljava/util/Map;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "flatMapSequenceTo", "map", "", "mapNotNull", "mapNotNullTo", "mapTo", "", "predicate", "all", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Z", "any", "(Ljava/util/Map;)Z", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)I", "", "action", "forEach", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "none", "M", "onEach", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "index", "onEachIndexed", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "asSequence", "(Ljava/util/Map;)Lkotlin/sequences/Sequence;"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
/* loaded from: classes3.dex */
public class MapsKt___MapsKt extends kotlin.collections.MapsKt___MapsJvmKt {
    public static final <K, V> java.util.List<kotlin.Pair<K, V>> toList(java.util.Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        if (map.size() == 0) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return kotlin.collections.CollectionsKt.listOf(new kotlin.Pair(next.getKey(), next.getValue()));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        arrayList.add(new kotlin.Pair(next.getKey(), next.getValue()));
        do {
            java.util.Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new kotlin.Pair(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static final <K, V, R> java.util.List<R> flatMap(java.util.Map<? extends K, ? extends V> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends java.lang.Iterable<? extends R>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, function1.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <K, V, R> java.util.List<R> flatMapSequence(java.util.Map<? extends K, ? extends V> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends kotlin.sequences.Sequence<? extends R>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, function1.invoke(it.next()));
        }
        return arrayList;
    }

    @kotlin.IgnorableReturnValue
    public static final <K, V, R, C extends java.util.Collection<? super R>> C flatMapTo(java.util.Map<? extends K, ? extends V> map, C c, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends java.lang.Iterable<? extends R>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(c, function1.invoke(it.next()));
        }
        return c;
    }

    @kotlin.IgnorableReturnValue
    public static final <K, V, R, C extends java.util.Collection<? super R>> C flatMapSequenceTo(java.util.Map<? extends K, ? extends V> map, C c, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends kotlin.sequences.Sequence<? extends R>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(c, function1.invoke(it.next()));
        }
        return c;
    }

    public static final <K, V, R> java.util.List<R> map(java.util.Map<? extends K, ? extends V> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(function1.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <K, V, R> java.util.List<R> mapNotNull(java.util.Map<? extends K, ? extends V> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R invoke = function1.invoke(it.next());
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @kotlin.IgnorableReturnValue
    public static final <K, V, R, C extends java.util.Collection<? super R>> C mapTo(java.util.Map<? extends K, ? extends V> map, C c, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            c.add(function1.invoke(it.next()));
        }
        return c;
    }

    public static final <K, V> boolean all(java.util.Map<? extends K, ? extends V> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (map.isEmpty()) {
            return true;
        }
        java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!function1.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V> boolean any(java.util.Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return !map.isEmpty();
    }

    public static final <K, V> boolean any(java.util.Map<? extends K, ? extends V> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (map.isEmpty()) {
            return false;
        }
        java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <K, V> int count(java.util.Map<? extends K, ? extends V> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        int i = 0;
        if (map.isEmpty()) {
            return 0;
        }
        java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    public static final <K, V> void forEach(java.util.Map<? extends K, ? extends V> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
    }

    public static final <K, V> boolean none(java.util.Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return map.isEmpty();
    }

    public static final <K, V> boolean none(java.util.Map<? extends K, ? extends V> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (map.isEmpty()) {
            return true;
        }
        java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V, M extends java.util.Map<? extends K, ? extends V>> M onEach(M m, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<java.util.Map.Entry<K, V>> it = m.entrySet().iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
        return m;
    }

    public static final <K, V, M extends java.util.Map<? extends K, ? extends V>> M onEachIndexed(M m, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.util.Map.Entry<? extends K, ? extends V>, kotlin.Unit> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.util.Iterator<T> it = m.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            amex.AMEXKernel aMEXKernel = (java.lang.Object) it.next();
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            function2.invoke(java.lang.Integer.valueOf(i), aMEXKernel);
            i++;
        }
        return m;
    }

    public static final <K, V> kotlin.sequences.Sequence<java.util.Map.Entry<K, V>> asSequence(java.util.Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return kotlin.collections.CollectionsKt.asSequence(map.entrySet());
    }

    @kotlin.IgnorableReturnValue
    public static final <K, V, R, C extends java.util.Collection<? super R>> C mapNotNullTo(java.util.Map<? extends K, ? extends V> map, C c, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R invoke = function1.invoke(it.next());
            if (invoke != null) {
                c.add(invoke);
            }
        }
        return c;
    }
}
