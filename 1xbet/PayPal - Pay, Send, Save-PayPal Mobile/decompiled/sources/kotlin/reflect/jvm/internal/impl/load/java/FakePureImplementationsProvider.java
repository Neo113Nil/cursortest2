package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class FakePureImplementationsProvider {
    public static final kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider();
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.FqName> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.name.ClassId> getHighSpeedVideoFpsRangesFor;

    private FakePureImplementationsProvider() {
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqName getPurelyImplementedInterface(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        return getHighResolutionOutputSizeshNQ4ISI.get(fqName);
    }

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        getHighSpeedVideoFpsRangesFor = linkedHashMap;
        getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.name.StandardClassIds.INSTANCE.getMutableList(), Camera2StreamConfigurationMap("java.util.ArrayList", "java.util.LinkedList"));
        getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.name.StandardClassIds.INSTANCE.getMutableSet(), Camera2StreamConfigurationMap("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.name.StandardClassIds.INSTANCE.getMutableMap(), Camera2StreamConfigurationMap("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName("java.util.function.Function")), Camera2StreamConfigurationMap("java.util.function.UnaryOperator"));
        getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName("java.util.function.BiFunction")), Camera2StreamConfigurationMap("java.util.function.BinaryOperator"));
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(kotlin.TuplesKt.to(((kotlin.reflect.jvm.internal.impl.name.ClassId) entry.getKey()).asSingleFqName(), ((kotlin.reflect.jvm.internal.impl.name.ClassId) entry.getValue()).asSingleFqName()));
        }
        getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.toMap(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.name.ClassId classId, java.util.List<kotlin.reflect.jvm.internal.impl.name.ClassId> list) {
        java.util.Map<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.name.ClassId> map = getHighSpeedVideoFpsRangesFor;
        for (java.lang.Object obj : list) {
            map.put(obj, classId);
        }
    }

    private static java.util.List<kotlin.reflect.jvm.internal.impl.name.ClassId> Camera2StreamConfigurationMap(java.lang.String... strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName(str)));
        }
        return arrayList;
    }
}
