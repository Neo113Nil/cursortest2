package kotlin.reflect.jvm.internal.impl.name;

/* loaded from: classes5.dex */
public final class StandardClassIdsKt {
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.ClassId access$annotationId(java.lang.String str) {
        kotlin.reflect.jvm.internal.impl.name.FqName base_annotation_package = kotlin.reflect.jvm.internal.impl.name.StandardClassIds.INSTANCE.getBASE_ANNOTATION_PACKAGE();
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(base_annotation_package, identifier);
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.ClassId access$atomicsId(java.lang.String str) {
        kotlin.reflect.jvm.internal.impl.name.FqName base_concurrent_atomics_package = kotlin.reflect.jvm.internal.impl.name.StandardClassIds.INSTANCE.getBASE_CONCURRENT_ATOMICS_PACKAGE();
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(base_concurrent_atomics_package, identifier);
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.ClassId access$baseId(java.lang.String str) {
        kotlin.reflect.jvm.internal.impl.name.FqName base_kotlin_package = kotlin.reflect.jvm.internal.impl.name.StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE();
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(base_kotlin_package, identifier);
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.ClassId access$collectionsId(java.lang.String str) {
        kotlin.reflect.jvm.internal.impl.name.FqName base_collections_package = kotlin.reflect.jvm.internal.impl.name.StandardClassIds.INSTANCE.getBASE_COLLECTIONS_PACKAGE();
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(base_collections_package, identifier);
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.ClassId access$coroutinesId(java.lang.String str) {
        kotlin.reflect.jvm.internal.impl.name.FqName base_coroutines_package = kotlin.reflect.jvm.internal.impl.name.StandardClassIds.INSTANCE.getBASE_COROUTINES_PACKAGE();
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(base_coroutines_package, identifier);
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.ClassId access$enumsId(java.lang.String str) {
        kotlin.reflect.jvm.internal.impl.name.FqName base_enums_package = kotlin.reflect.jvm.internal.impl.name.StandardClassIds.INSTANCE.getBASE_ENUMS_PACKAGE();
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(base_enums_package, identifier);
    }

    public static final /* synthetic */ java.util.Map access$inverseMap(java.util.Map map) {
        java.util.Set<java.util.Map.Entry> entrySet = map.entrySet();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
        for (java.util.Map.Entry entry : entrySet) {
            kotlin.Pair pair = kotlin.TuplesKt.to(entry.getValue(), entry.getKey());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.ClassId access$primitiveArrayId(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = kotlin.reflect.jvm.internal.impl.name.StandardClassIds.INSTANCE.getArray().getPackageFqName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(name2.getIdentifier());
        sb.append(kotlin.reflect.jvm.internal.impl.name.StandardClassIds.INSTANCE.getArray().getShortClassName().getIdentifier());
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(sb.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(packageFqName, identifier);
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.ClassId access$rangesId(java.lang.String str) {
        kotlin.reflect.jvm.internal.impl.name.FqName base_ranges_package = kotlin.reflect.jvm.internal.impl.name.StandardClassIds.INSTANCE.getBASE_RANGES_PACKAGE();
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(base_ranges_package, identifier);
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.ClassId access$reflectId(java.lang.String str) {
        kotlin.reflect.jvm.internal.impl.name.FqName base_reflect_package = kotlin.reflect.jvm.internal.impl.name.StandardClassIds.INSTANCE.getBASE_REFLECT_PACKAGE();
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(base_reflect_package, identifier);
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.ClassId access$unsignedId(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.reflect.jvm.internal.impl.name.FqName base_kotlin_package = kotlin.reflect.jvm.internal.impl.name.StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY);
        sb.append(classId.getShortClassName().getIdentifier());
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(sb.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(base_kotlin_package, identifier);
    }
}
