package com.squareup.moshi;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u0007\u0010\n\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u000b¢\u0006\u0004\b\u0007\u0010\f\u001a.\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000e\"\n\b\u0000\u0010\u0000\u0018\u0001*\u00020\r*\b\u0012\u0004\u0012\u00020\r0\u000eH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\"\u0019\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0011*\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"T", "Ljava/lang/reflect/WildcardType;", "subtypeOf", "()Ljava/lang/reflect/WildcardType;", "supertypeOf", "Ljava/lang/reflect/Type;", "Ljava/lang/reflect/GenericArrayType;", "asArrayType", "(Ljava/lang/reflect/Type;)Ljava/lang/reflect/GenericArrayType;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)Ljava/lang/reflect/GenericArrayType;", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/GenericArrayType;", "", "", "nextAnnotations", "(Ljava/util/Set;)Ljava/util/Set;", "Ljava/lang/Class;", "getRawType", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", "rawType"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class _MoshiKotlinTypesExtensionsKt {
    public static final java.lang.Class<?> getRawType(java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        java.lang.Class<?> rawType = com.squareup.moshi.Types.getRawType(type);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rawType, "");
        return rawType;
    }

    public static final /* synthetic */ <T extends java.lang.annotation.Annotation> java.util.Set<java.lang.annotation.Annotation> nextAnnotations(java.util.Set<? extends java.lang.annotation.Annotation> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return com.squareup.moshi.Types.nextAnnotations(set, java.lang.annotation.Annotation.class);
    }

    public static final /* synthetic */ <T> java.lang.reflect.WildcardType subtypeOf() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        java.lang.Class javaType = kotlin.reflect.TypesJVMKt.getJavaType(null);
        if (javaType instanceof java.lang.Class) {
            java.lang.Class boxIfPrimitive = com.squareup.moshi.internal.Util.boxIfPrimitive((java.lang.Class) javaType);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(boxIfPrimitive, "");
            javaType = boxIfPrimitive;
        }
        java.lang.reflect.WildcardType subtypeOf = com.squareup.moshi.Types.subtypeOf(javaType);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(subtypeOf, "");
        return subtypeOf;
    }

    public static final /* synthetic */ <T> java.lang.reflect.WildcardType supertypeOf() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        java.lang.Class javaType = kotlin.reflect.TypesJVMKt.getJavaType(null);
        if (javaType instanceof java.lang.Class) {
            java.lang.Class boxIfPrimitive = com.squareup.moshi.internal.Util.boxIfPrimitive((java.lang.Class) javaType);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(boxIfPrimitive, "");
            javaType = boxIfPrimitive;
        }
        java.lang.reflect.WildcardType supertypeOf = com.squareup.moshi.Types.supertypeOf(javaType);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supertypeOf, "");
        return supertypeOf;
    }

    public static final java.lang.reflect.GenericArrayType asArrayType(kotlin.reflect.KType kType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        return asArrayType(kotlin.reflect.TypesJVMKt.getJavaType(kType));
    }

    public static final java.lang.reflect.GenericArrayType asArrayType(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return asArrayType(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass));
    }

    public static final java.lang.reflect.GenericArrayType asArrayType(java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        java.lang.reflect.GenericArrayType arrayOf = com.squareup.moshi.Types.arrayOf(type);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrayOf, "");
        return arrayOf;
    }
}
