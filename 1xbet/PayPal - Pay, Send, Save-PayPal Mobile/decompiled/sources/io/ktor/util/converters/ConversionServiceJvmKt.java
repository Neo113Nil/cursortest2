package io.ktor.util.converters;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/reflect/KClass;", "klass", "", "platformDefaultFromValues", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "platformDefaultToValues", "(Ljava/lang/Object;)Ljava/util/List;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConversionServiceJvmKt {
    public static final java.util.List<java.lang.String> platformDefaultToValues(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof java.lang.Enum) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.Enum) obj).name());
        }
        if (obj instanceof java.lang.Integer) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.Integer) obj).toString());
        }
        if (obj instanceof java.lang.Float) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.Float) obj).toString());
        }
        if (obj instanceof java.lang.Double) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.Double) obj).toString());
        }
        if (obj instanceof java.lang.Long) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.Long) obj).toString());
        }
        if (obj instanceof java.lang.Boolean) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.Boolean) obj).toString());
        }
        if (obj instanceof java.lang.Short) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.Short) obj).toString());
        }
        if (obj instanceof java.lang.String) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.String) obj).toString());
        }
        if (obj instanceof java.lang.Character) {
            return kotlin.collections.CollectionsKt.listOf(((java.lang.Character) obj).toString());
        }
        if (obj instanceof java.math.BigDecimal) {
            return kotlin.collections.CollectionsKt.listOf(((java.math.BigDecimal) obj).toString());
        }
        if (obj instanceof java.math.BigInteger) {
            return kotlin.collections.CollectionsKt.listOf(((java.math.BigInteger) obj).toString());
        }
        if (obj instanceof java.util.UUID) {
            return kotlin.collections.CollectionsKt.listOf(((java.util.UUID) obj).toString());
        }
        return null;
    }

    public static final java.lang.Object platformDefaultFromValues(java.lang.String str, kotlin.reflect.KClass<?> kClass) {
        java.lang.Object fromString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        int i = 0;
        java.lang.Object obj = null;
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.class))) {
            fromString = java.lang.Integer.valueOf(java.lang.Integer.parseInt(str));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Float.class))) {
            fromString = java.lang.Float.valueOf(java.lang.Float.parseFloat(str));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Double.class))) {
            fromString = java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Long.class))) {
            fromString = java.lang.Long.valueOf(java.lang.Long.parseLong(str));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Short.class))) {
            fromString = java.lang.Short.valueOf(java.lang.Short.parseShort(str));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.class))) {
            fromString = java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(str));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class))) {
            fromString = str;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Character.class))) {
            fromString = java.lang.Character.valueOf(str.charAt(0));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.math.BigDecimal.class))) {
            fromString = new java.math.BigDecimal(str);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.math.BigInteger.class))) {
            fromString = new java.math.BigInteger(str);
        } else {
            fromString = kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.UUID.class)) ? java.util.UUID.fromString(str) : null;
        }
        if (fromString != null) {
            return fromString;
        }
        if (!kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass).isEnum()) {
            return null;
        }
        java.lang.Object[] enumConstants = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass).getEnumConstants();
        if (enumConstants != null) {
            int length = enumConstants.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                java.lang.Object obj2 = enumConstants[i];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.Enum) obj2).name(), str)) {
                    obj = obj2;
                    break;
                }
                i++;
            }
            if (obj != null) {
                return obj;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Value ");
        sb.append(str);
        sb.append(" is not a enum member name of ");
        sb.append(kClass);
        throw new io.ktor.util.converters.DataConversionException(sb.toString());
    }
}
