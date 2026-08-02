package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class TypeSignatureMappingKt {
    public static final <T> T boxTypeIfNeeded(kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory<T> jvmTypeFactory, T t, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmTypeFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        return z ? jvmTypeFactory.boxType(t) : t;
    }

    public static final <T> T mapBuiltInType(kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext typeSystemCommonBackendContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory<T> jvmTypeFactory, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmTypeFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeMappingMode, "");
        kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor = typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker);
        if (!typeSystemCommonBackendContext.isClassTypeConstructor(typeConstructor)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType = typeSystemCommonBackendContext.getPrimitiveType(typeConstructor);
        if (primitiveType != null) {
            return (T) boxTypeIfNeeded(jvmTypeFactory, jvmTypeFactory.createPrimitiveType(primitiveType), typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker) || kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt.hasEnhancedNullability(typeSystemCommonBackendContext, kotlinTypeMarker));
        }
        kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveArrayType = typeSystemCommonBackendContext.getPrimitiveArrayType(typeConstructor);
        if (primitiveArrayType != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.get(primitiveArrayType).getDesc());
            return jvmTypeFactory.createFromString(sb.toString());
        }
        if (typeSystemCommonBackendContext.isUnderKotlinPackage(typeConstructor)) {
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe classFqNameUnsafe = typeSystemCommonBackendContext.getClassFqNameUnsafe(typeConstructor);
            kotlin.reflect.jvm.internal.impl.name.ClassId mapKotlinToJava = classFqNameUnsafe != null ? kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(classFqNameUnsafe) : null;
            if (mapKotlinToJava != null) {
                if (!typeMappingMode.getKotlinCollectionsToJavaCollections()) {
                    java.util.List<kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping> mutabilityMappings = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.getMutabilityMappings();
                    if (!(mutabilityMappings instanceof java.util.Collection) || !mutabilityMappings.isEmpty()) {
                        java.util.Iterator<T> it = mutabilityMappings.iterator();
                        while (it.hasNext()) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping) it.next()).getJavaClass(), mapKotlinToJava)) {
                                return null;
                            }
                        }
                    }
                }
                java.lang.String internalNameByClassId = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.internalNameByClassId(mapKotlinToJava);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(internalNameByClassId, "");
                return jvmTypeFactory.createObjectType(internalNameByClassId);
            }
        }
        return null;
    }
}
