package io.ktor.util;

/* compiled from: StringValues.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u001c\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u001aO\u0010\b\u001a\u00020\u000726\u0010\u0004\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u00010\u0000\"\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\f\u001a-\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u000e\u001a\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u000f\u001a1\u0010\b\u001a\u00020\u00072\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0013\u001a#\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0010*\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\u0003*\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u001b\u001a\u00020\u0019*\u00020\u00072\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001c\u001a5\u0010\u001f\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00052\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0004\b\u001f\u0010 \u001a=\u0010#\u001a\u00020\u0019*\u00020!2\u0006\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00052\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0004\b#\u0010$\u001a\u0019\u0010&\u001a\u00020!*\u00020!2\u0006\u0010%\u001a\u00020!¢\u0006\u0004\b&\u0010'\u001a!\u0010(\u001a\u00020!*\u00020!2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)\u001a!\u0010*\u001a\u00020!*\u00020!2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b*\u0010)\u001a=\u0010&\u001a\u00020!*\u00020!2*\u0010\r\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b&\u0010+\u001aK\u0010&\u001a\u00020!*\u00020!26\u0010\r\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00010\u0000\"\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u0001H\u0007¢\u0006\u0004\b,\u0010+\u001a-\u0010&\u001a\u00020!*\u00020!2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u0010H\u0007¢\u0006\u0004\b,\u0010-\u001a%\u0010&\u001a\u00020!*\u00020!2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b&\u0010-\u001aO\u00102\u001a\u00020\u00052\u001e\u00100\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030/0.2\u001e\u00101\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030/0.H\u0002¢\u0006\u0004\b2\u00103\u001a7\u00107\u001a\u0002052\u001e\u00104\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030/0.2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108¨\u00069"}, d2 = {"", "Lkotlin/Pair;", "", "", "pairs", "", "caseInsensitiveKey", "Lio/ktor/util/StringValues;", "valuesOf", "([Lkotlin/Pair;Z)Lio/ktor/util/StringValues;", "name", "value", "(Ljava/lang/String;Ljava/lang/String;Z)Lio/ktor/util/StringValues;", "values", "(Ljava/lang/String;Ljava/util/List;Z)Lio/ktor/util/StringValues;", "()Lio/ktor/util/StringValues;", "", "", "map", "(Ljava/util/Map;Z)Lio/ktor/util/StringValues;", "toMap", "(Lio/ktor/util/StringValues;)Ljava/util/Map;", "flattenEntries", "(Lio/ktor/util/StringValues;)Ljava/util/List;", "Lkotlin/Function2;", "", "block", "flattenForEach", "(Lio/ktor/util/StringValues;Lkotlin/jvm/functions/Function2;)V", "keepEmpty", "predicate", "filter", "(Lio/ktor/util/StringValues;ZLkotlin/jvm/functions/Function2;)Lio/ktor/util/StringValues;", "Lio/ktor/util/StringValuesBuilder;", "source", "appendFiltered", "(Lio/ktor/util/StringValuesBuilder;Lio/ktor/util/StringValues;ZLkotlin/jvm/functions/Function2;)V", "builder", "appendAll", "(Lio/ktor/util/StringValuesBuilder;Lio/ktor/util/StringValuesBuilder;)Lio/ktor/util/StringValuesBuilder;", "appendIfNameAbsent", "(Lio/ktor/util/StringValuesBuilder;Ljava/lang/String;Ljava/lang/String;)Lio/ktor/util/StringValuesBuilder;", "appendIfNameAndValueAbsent", "(Lio/ktor/util/StringValuesBuilder;[Lkotlin/Pair;)Lio/ktor/util/StringValuesBuilder;", "appendAllIterable", "(Lio/ktor/util/StringValuesBuilder;Ljava/util/Map;)Lio/ktor/util/StringValuesBuilder;", "", "", "a", "b", "entriesEquals", "(Ljava/util/Set;Ljava/util/Set;)Z", com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "seed", "entriesHashCode", "(Ljava/util/Set;I)I", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StringValuesKt {
    public static /* synthetic */ io.ktor.util.StringValues valuesOf$default(kotlin.Pair[] pairArr, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return valuesOf((kotlin.Pair<java.lang.String, ? extends java.util.List<java.lang.String>>[]) pairArr, z);
    }

    public static final io.ktor.util.StringValues valuesOf(kotlin.Pair<java.lang.String, ? extends java.util.List<java.lang.String>>[] pairs, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "pairs");
        return new io.ktor.util.StringValuesImpl(z, kotlin.collections.MapsKt.toMap(kotlin.collections.ArraysKt.asList(pairs)));
    }

    public static /* synthetic */ io.ktor.util.StringValues valuesOf$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return valuesOf(str, str2, z);
    }

    public static final io.ktor.util.StringValues valuesOf(java.lang.String name, java.lang.String value, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        return new io.ktor.util.StringValuesSingleImpl(z, name, kotlin.collections.CollectionsKt.listOf(value));
    }

    public static /* synthetic */ io.ktor.util.StringValues valuesOf$default(java.lang.String str, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return valuesOf(str, (java.util.List<java.lang.String>) list, z);
    }

    public static final io.ktor.util.StringValues valuesOf(java.lang.String name, java.util.List<java.lang.String> values, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        return new io.ktor.util.StringValuesSingleImpl(z, name, values);
    }

    public static final io.ktor.util.StringValues valuesOf() {
        return io.ktor.util.StringValues.INSTANCE.getEmpty();
    }

    public static /* synthetic */ io.ktor.util.StringValues valuesOf$default(java.util.Map map, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return valuesOf((java.util.Map<java.lang.String, ? extends java.lang.Iterable<java.lang.String>>) map, z);
    }

    public static final io.ktor.util.StringValues valuesOf(java.util.Map<java.lang.String, ? extends java.lang.Iterable<java.lang.String>> map, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "map");
        int size = map.size();
        if (size == 1) {
            java.util.Map.Entry entry = (java.util.Map.Entry) kotlin.collections.CollectionsKt.single(map.entrySet());
            return new io.ktor.util.StringValuesSingleImpl(z, (java.lang.String) entry.getKey(), kotlin.collections.CollectionsKt.toList((java.lang.Iterable) entry.getValue()));
        }
        java.util.LinkedHashMap caseInsensitiveMap = z ? io.ktor.util.CollectionsKt.caseInsensitiveMap() : new java.util.LinkedHashMap(size);
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            caseInsensitiveMap.put(entry2.getKey(), kotlin.collections.CollectionsKt.toList((java.lang.Iterable) entry2.getValue()));
        }
        return new io.ktor.util.StringValuesImpl(z, caseInsensitiveMap);
    }

    public static final java.util.Map<java.lang.String, java.util.List<java.lang.String>> toMap(io.ktor.util.StringValues stringValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValues, "<this>");
        java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entries = stringValues.entries();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put((java.lang.String) entry.getKey(), kotlin.collections.CollectionsKt.toList((java.lang.Iterable) entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> flattenEntries(io.ktor.util.StringValues stringValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValues, "<this>");
        java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entries = stringValues.entries();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
            java.util.Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(kotlin.TuplesKt.to(entry.getKey(), (java.lang.String) it2.next()));
            }
            kotlin.collections.CollectionsKt.addAll(arrayList, arrayList2);
        }
        return arrayList;
    }

    public static final void flattenForEach(io.ktor.util.StringValues stringValues, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValues, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        stringValues.forEach(new kotlin.jvm.functions.Function2() { // from class: io.ktor.util.StringValuesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit flattenForEach$lambda$6;
                flattenForEach$lambda$6 = io.ktor.util.StringValuesKt.flattenForEach$lambda$6(kotlin.jvm.functions.Function2.this, (java.lang.String) obj, (java.util.List) obj2);
                return flattenForEach$lambda$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit flattenForEach$lambda$6(kotlin.jvm.functions.Function2 function2, java.lang.String name, java.util.List items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "items");
        java.util.Iterator it = items.iterator();
        while (it.hasNext()) {
            function2.invoke(name, (java.lang.String) it.next());
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ io.ktor.util.StringValues filter$default(io.ktor.util.StringValues stringValues, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return filter(stringValues, z, function2);
    }

    public static final io.ktor.util.StringValues filter(io.ktor.util.StringValues stringValues, boolean z, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValues, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entries = stringValues.entries();
        java.util.LinkedHashMap caseInsensitiveMap = stringValues.getCaseInsensitiveName() ? io.ktor.util.CollectionsKt.caseInsensitiveMap() : new java.util.LinkedHashMap(entries.size());
        java.util.Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList(((java.util.List) entry.getValue()).size());
            for (java.lang.Object obj : iterable) {
                if (predicate.invoke(entry.getKey(), (java.lang.String) obj).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            if (z || (!arrayList2.isEmpty())) {
                caseInsensitiveMap.put(entry.getKey(), arrayList2);
            }
        }
        return new io.ktor.util.StringValuesImpl(stringValues.getCaseInsensitiveName(), caseInsensitiveMap);
    }

    public static /* synthetic */ void appendFiltered$default(io.ktor.util.StringValuesBuilder stringValuesBuilder, io.ktor.util.StringValues stringValues, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        appendFiltered(stringValuesBuilder, stringValues, z, function2);
    }

    public static final void appendFiltered(final io.ktor.util.StringValuesBuilder stringValuesBuilder, io.ktor.util.StringValues source, final boolean z, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValuesBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        source.forEach(new kotlin.jvm.functions.Function2() { // from class: io.ktor.util.StringValuesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit appendFiltered$lambda$10;
                appendFiltered$lambda$10 = io.ktor.util.StringValuesKt.appendFiltered$lambda$10(z, stringValuesBuilder, predicate, (java.lang.String) obj, (java.util.List) obj2);
                return appendFiltered$lambda$10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit appendFiltered$lambda$10(boolean z, io.ktor.util.StringValuesBuilder stringValuesBuilder, kotlin.jvm.functions.Function2 function2, java.lang.String name, java.util.List value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.util.ArrayList arrayList = new java.util.ArrayList(value.size());
        for (java.lang.Object obj : value) {
            if (((java.lang.Boolean) function2.invoke(name, (java.lang.String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (z || (!arrayList2.isEmpty())) {
            stringValuesBuilder.appendAll(name, arrayList2);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final io.ktor.util.StringValuesBuilder appendAll(io.ktor.util.StringValuesBuilder stringValuesBuilder, io.ktor.util.StringValuesBuilder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValuesBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        java.util.Iterator<T> it = builder.entries().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            stringValuesBuilder.appendAll((java.lang.String) entry.getKey(), (java.util.List) entry.getValue());
        }
        return stringValuesBuilder;
    }

    public static final io.ktor.util.StringValuesBuilder appendIfNameAbsent(io.ktor.util.StringValuesBuilder stringValuesBuilder, java.lang.String name, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValuesBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        if (!stringValuesBuilder.contains(name)) {
            stringValuesBuilder.append(name, value);
        }
        return stringValuesBuilder;
    }

    public static final io.ktor.util.StringValuesBuilder appendIfNameAndValueAbsent(io.ktor.util.StringValuesBuilder stringValuesBuilder, java.lang.String name, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValuesBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        if (!stringValuesBuilder.contains(name, value)) {
            stringValuesBuilder.append(name, value);
        }
        return stringValuesBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean entriesEquals(java.util.Set<? extends java.util.Map.Entry<java.lang.String, ? extends java.util.List<java.lang.String>>> set, java.util.Set<? extends java.util.Map.Entry<java.lang.String, ? extends java.util.List<java.lang.String>>> set2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(set, set2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int entriesHashCode(java.util.Set<? extends java.util.Map.Entry<java.lang.String, ? extends java.util.List<java.lang.String>>> set, int i) {
        return (i * 31) + set.hashCode();
    }

    public static final io.ktor.util.StringValuesBuilder appendAll(io.ktor.util.StringValuesBuilder stringValuesBuilder, kotlin.Pair<java.lang.String, java.lang.String>... values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValuesBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        for (kotlin.Pair<java.lang.String, java.lang.String> pair : values) {
            stringValuesBuilder.append(pair.component1(), pair.component2());
        }
        return stringValuesBuilder;
    }

    public static final io.ktor.util.StringValuesBuilder appendAllIterable(io.ktor.util.StringValuesBuilder stringValuesBuilder, kotlin.Pair<java.lang.String, ? extends java.lang.Iterable<java.lang.String>>... values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValuesBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        for (kotlin.Pair<java.lang.String, ? extends java.lang.Iterable<java.lang.String>> pair : values) {
            stringValuesBuilder.appendAll(pair.component1(), pair.component2());
        }
        return stringValuesBuilder;
    }

    public static final io.ktor.util.StringValuesBuilder appendAllIterable(io.ktor.util.StringValuesBuilder stringValuesBuilder, java.util.Map<java.lang.String, ? extends java.lang.Iterable<java.lang.String>> values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValuesBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Iterable<java.lang.String>> entry : values.entrySet()) {
            stringValuesBuilder.appendAll(entry.getKey(), entry.getValue());
        }
        return stringValuesBuilder;
    }

    public static final io.ktor.util.StringValuesBuilder appendAll(io.ktor.util.StringValuesBuilder stringValuesBuilder, java.util.Map<java.lang.String, java.lang.String> values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValuesBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : values.entrySet()) {
            stringValuesBuilder.append(entry.getKey(), entry.getValue());
        }
        return stringValuesBuilder;
    }
}
