package io.ktor.util.converters;

/* compiled from: ConversionServiceJvm.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "value", "Lkotlin/reflect/KClass;", "klass", "", "platformDefaultFromValues", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "convertSimpleTypes", "", "platformDefaultToValues", "(Ljava/lang/Object;)Ljava/util/List;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConversionServiceJvmKt {
    public static final java.lang.Object platformDefaultFromValues(java.lang.String value, kotlin.reflect.KClass<?> klass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "klass");
        java.lang.Object convertSimpleTypes = convertSimpleTypes(value, klass);
        if (convertSimpleTypes != null) {
            return convertSimpleTypes;
        }
        java.lang.Object obj = null;
        if (!kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) klass).isEnum()) {
            return null;
        }
        java.lang.Object[] enumConstants = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) klass).getEnumConstants();
        if (enumConstants != null) {
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                java.lang.Object obj2 = enumConstants[i];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                if (kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.Enum) obj2).name(), value)) {
                    obj = obj2;
                    break;
                }
                i++;
            }
            if (obj != null) {
                return obj;
            }
        }
        throw new io.ktor.util.converters.DataConversionException("Value " + value + " is not a enum member name of " + klass);
    }

    private static final java.lang.Object convertSimpleTypes(java.lang.String str, kotlin.reflect.KClass<?> kClass) {
        java.lang.Object bigInteger;
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.class))) {
            return java.lang.Integer.valueOf(java.lang.Integer.parseInt(str));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Float.class))) {
            return java.lang.Float.valueOf(java.lang.Float.parseFloat(str));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Double.class))) {
            return java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Long.class))) {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(str));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Short.class))) {
            return java.lang.Short.valueOf(java.lang.Short.parseShort(str));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.class))) {
            return java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(str));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class))) {
            return str;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Character.class))) {
            return java.lang.Character.valueOf(str.charAt(0));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.math.BigDecimal.class))) {
            bigInteger = new java.math.BigDecimal(str);
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.math.BigInteger.class))) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.UUID.class))) {
                    return java.util.UUID.fromString(str);
                }
                return null;
            }
            bigInteger = new java.math.BigInteger(str);
        }
        return bigInteger;
    }

    public static final java.util.List<java.lang.String> platformDefaultToValues(java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof java.lang.Enum) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.Enum) value).name());
        }
        if (value instanceof java.lang.Integer) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.Integer) value).toString());
        }
        if (value instanceof java.lang.Float) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.Float) value).toString());
        }
        if (value instanceof java.lang.Double) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.Double) value).toString());
        }
        if (value instanceof java.lang.Long) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.Long) value).toString());
        }
        if (value instanceof java.lang.Boolean) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.Boolean) value).toString());
        }
        if (value instanceof java.lang.Short) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.Short) value).toString());
        }
        if (value instanceof java.lang.String) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.String) value).toString());
        }
        if (value instanceof java.lang.Character) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.Character) value).toString());
        }
        if (value instanceof java.math.BigDecimal) {
            return kotlin.collections.CollectionsKt.listOf(((java.math.BigDecimal) value).toString());
        }
        if (value instanceof java.math.BigInteger) {
            return kotlin.collections.CollectionsKt.listOf(((java.math.BigInteger) value).toString());
        }
        if (value instanceof java.util.UUID) {
            return kotlin.collections.CollectionsKt.listOf(((java.util.UUID) value).toString());
        }
        return null;
    }
}
