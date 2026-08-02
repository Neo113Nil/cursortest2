package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class BuiltinSpecialProperties {
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, java.util.List<kotlin.reflect.jvm.internal.impl.name.Name>> Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties();
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getHighSpeedVideoFpsRanges;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getHighSpeedVideoFpsRangesFor;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.Name> getHighSpeedVideoSizes;

    private BuiltinSpecialProperties() {
    }

    public final java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.Name> getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP() {
        return getHighSpeedVideoSizes;
    }

    static {
        java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.Name> mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialPropertiesKt.access$childSafe(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames._enum, "name"), kotlin.reflect.jvm.internal.impl.builtins.StandardNames.NAME), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialPropertiesKt.access$childSafe(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames._enum, "ordinal"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("ordinal")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialPropertiesKt.access$child(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.collection, io.ktor.http.ContentDisposition.Parameters.Size), kotlin.reflect.jvm.internal.impl.name.Name.identifier(io.ktor.http.ContentDisposition.Parameters.Size)), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialPropertiesKt.access$child(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.map, io.ktor.http.ContentDisposition.Parameters.Size), kotlin.reflect.jvm.internal.impl.name.Name.identifier(io.ktor.http.ContentDisposition.Parameters.Size)), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialPropertiesKt.access$childSafe(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.charSequence, "length"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("length")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialPropertiesKt.access$child(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.map, org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME), kotlin.reflect.jvm.internal.impl.name.Name.identifier("keySet")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialPropertiesKt.access$child(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.map, "values"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("values")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialPropertiesKt.access$child(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.map, "entries"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("entrySet")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialPropertiesKt.access$child(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.atomicIntArray, io.ktor.http.ContentDisposition.Parameters.Size), kotlin.reflect.jvm.internal.impl.name.Name.identifier("length")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialPropertiesKt.access$child(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.atomicLongArray, io.ktor.http.ContentDisposition.Parameters.Size), kotlin.reflect.jvm.internal.impl.name.Name.identifier("length")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialPropertiesKt.access$child(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.atomicArray, io.ktor.http.ContentDisposition.Parameters.Size), kotlin.reflect.jvm.internal.impl.name.Name.identifier("length")));
        getHighSpeedVideoSizes = mapOf;
        java.util.Set<java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.Name>> entrySet = mapOf.entrySet();
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entrySet, 10));
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            arrayList.add(new kotlin.Pair(((kotlin.reflect.jvm.internal.impl.name.FqName) entry.getKey()).shortName(), entry.getValue()));
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (kotlin.Pair pair : arrayList) {
            kotlin.reflect.jvm.internal.impl.name.Name name2 = (kotlin.reflect.jvm.internal.impl.name.Name) pair.getSecond();
            java.lang.Object obj = linkedHashMap.get(name2);
            if (obj == null) {
                obj = (java.util.List) new java.util.ArrayList();
                linkedHashMap.put(name2, obj);
            }
            ((java.util.List) obj).add((kotlin.reflect.jvm.internal.impl.name.Name) pair.getFirst());
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), kotlin.collections.CollectionsKt.distinct((java.lang.Iterable) entry2.getValue()));
        }
        Camera2StreamConfigurationMap = linkedHashMap2;
        java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.Name> map = getHighSpeedVideoSizes;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.Name> entry3 : map.entrySet()) {
            kotlin.reflect.jvm.internal.impl.name.ClassId mapKotlinToJava = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(entry3.getKey().parent().toUnsafe());
            kotlin.jvm.internal.Intrinsics.checkNotNull(mapKotlinToJava);
            linkedHashSet.add(mapKotlinToJava.asSingleFqName().child(entry3.getValue()));
        }
        getHighResolutionOutputSizeshNQ4ISI = linkedHashSet;
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> keySet = getHighSpeedVideoSizes.keySet();
        getHighSpeedVideoFpsRanges = keySet;
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> set = keySet;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
        java.util.Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((kotlin.reflect.jvm.internal.impl.name.FqName) it2.next()).shortName());
        }
        getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.toSet(arrayList2);
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getSPECIAL_FQ_NAMES() {
        return getHighSpeedVideoFpsRanges;
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getSPECIAL_SHORT_NAMES() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> getPropertyNameCandidatesBySpecialGetterName(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> list = Camera2StreamConfigurationMap.get(name2);
        return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
    }
}
