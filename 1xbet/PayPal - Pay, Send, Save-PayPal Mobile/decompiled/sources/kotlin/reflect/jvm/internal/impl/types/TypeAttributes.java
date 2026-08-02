package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class TypeAttributes extends kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner<kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?>, kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?>> implements java.lang.Iterable<kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?>>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion Companion = new kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.types.TypeAttributes getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.types.TypeAttributes((java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?>>) kotlin.collections.CollectionsKt.emptyList());

    private TypeAttributes(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?>> list) {
        for (kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?> typeAttribute : list) {
            registerComponent((kotlin.reflect.KClass) typeAttribute.getKey(), (kotlin.reflect.KClass<? extends java.lang.Object>) typeAttribute);
        }
    }

    public static final class Companion extends kotlin.reflect.jvm.internal.impl.util.TypeRegistry<kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?>, kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?>> {
        private Companion() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        public final int customComputeIfAbsent(java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> concurrentHashMap, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Integer> function1) {
            int intValue;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(concurrentHashMap, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            java.lang.Integer num = concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                java.lang.Integer num2 = concurrentHashMap.get(str);
                if (num2 != null) {
                    intValue = num2.intValue();
                } else {
                    java.lang.Integer invoke = function1.invoke(str);
                    concurrentHashMap.putIfAbsent(str, java.lang.Integer.valueOf(invoke.intValue()));
                    intValue = invoke.intValue();
                }
            }
            return intValue;
        }

        public final kotlin.reflect.jvm.internal.impl.types.TypeAttributes getEmpty() {
            return kotlin.reflect.jvm.internal.impl.types.TypeAttributes.getHighSpeedVideoFpsRangesFor;
        }

        public final kotlin.reflect.jvm.internal.impl.types.TypeAttributes create(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?>> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            if (list.isEmpty()) {
                return getEmpty();
            }
            return new kotlin.reflect.jvm.internal.impl.types.TypeAttributes(list, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private TypeAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?> typeAttribute) {
        this((java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?>>) kotlin.collections.CollectionsKt.listOf(typeAttribute));
    }

    public final boolean contains(kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?> typeAttribute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttribute, "");
        return getArrayMap().get(Companion.getId(typeAttribute.getKey())) != null;
    }

    public final kotlin.reflect.jvm.internal.impl.types.TypeAttributes plus(kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?> typeAttribute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttribute, "");
        if (contains(typeAttribute)) {
            return this;
        }
        if (isEmpty()) {
            return new kotlin.reflect.jvm.internal.impl.types.TypeAttributes(typeAttribute);
        }
        return Companion.create(kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?>>) kotlin.collections.CollectionsKt.toList(this), typeAttribute));
    }

    public final kotlin.reflect.jvm.internal.impl.types.TypeAttributes remove(kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?> typeAttribute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttribute, "");
        if (!isEmpty()) {
            kotlin.reflect.jvm.internal.impl.util.ArrayMap<kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?>> arrayMap = getArrayMap();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?> typeAttribute2 : arrayMap) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(typeAttribute2, typeAttribute)) {
                    arrayList.add(typeAttribute2);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            if (arrayList2.size() != getArrayMap().getSize()) {
                return Companion.create(arrayList2);
            }
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    public final kotlin.reflect.jvm.internal.impl.util.TypeRegistry<kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?>, kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?>> getTypeRegistry() {
        return Companion;
    }

    public final kotlin.reflect.jvm.internal.impl.types.TypeAttributes intersect(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        java.lang.Object intersect;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        if (isEmpty() && typeAttributes.isEmpty()) {
            return this;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = Companion.getIndices().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?> typeAttribute = getArrayMap().get(intValue);
            kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?> typeAttribute2 = typeAttributes.getArrayMap().get(intValue);
            if (typeAttribute == null) {
                intersect = typeAttribute2 != null ? typeAttribute2.intersect(typeAttribute) : null;
            } else {
                intersect = typeAttribute.intersect(typeAttribute2);
            }
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, intersect);
        }
        return Companion.create(arrayList);
    }

    public final kotlin.reflect.jvm.internal.impl.types.TypeAttributes add(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        java.lang.Object add;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        if (isEmpty() && typeAttributes.isEmpty()) {
            return this;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = Companion.getIndices().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?> typeAttribute = getArrayMap().get(intValue);
            kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?> typeAttribute2 = typeAttributes.getArrayMap().get(intValue);
            if (typeAttribute == null) {
                add = typeAttribute2 != null ? typeAttribute2.add(typeAttribute) : null;
            } else {
                add = typeAttribute.add(typeAttribute2);
            }
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, add);
        }
        return Companion.create(arrayList);
    }

    public /* synthetic */ TypeAttributes(java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeAttribute<?>>) list);
    }
}
