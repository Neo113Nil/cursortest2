package com.izettle.android.serialization;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljava/lang/Class;", "Lcom/izettle/android/serialization/JsonElement;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "deserializeFromJsonElement", "(Ljava/lang/Class;Lcom/izettle/android/serialization/JsonElement;)Ljava/lang/Object;", "", "deserializeFromJsonStringValue", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonDeserializerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object deserializeFromJsonStringValue(java.lang.Class<?> cls, java.lang.String str) {
        try {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "null")) {
                return null;
            }
            if (com.izettle.android.serialization.ExtensionsKt.isBigDecimal(cls)) {
                return new java.math.BigDecimal(str);
            }
            if (com.izettle.android.serialization.ExtensionsKt.isBoolean(cls)) {
                return java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(str));
            }
            if (com.izettle.android.serialization.ExtensionsKt.isInt(cls)) {
                return java.lang.Integer.valueOf(java.lang.Integer.parseInt(str));
            }
            if (com.izettle.android.serialization.ExtensionsKt.isLong(cls)) {
                return java.lang.Long.valueOf(java.lang.Long.parseLong(str));
            }
            if (com.izettle.android.serialization.ExtensionsKt.isShort(cls)) {
                return java.lang.Short.valueOf(java.lang.Short.parseShort(str));
            }
            if (com.izettle.android.serialization.ExtensionsKt.isFloat(cls)) {
                return java.lang.Float.valueOf(java.lang.Float.parseFloat(str));
            }
            if (com.izettle.android.serialization.ExtensionsKt.isDouble(cls)) {
                return java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
            }
            if (cls.isEnum()) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "");
                return cls.cast(java.lang.Enum.valueOf(cls, str));
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.KClass.class))) {
                return kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Class.class) ? java.lang.Class.forName(str) : str;
            }
            java.lang.Class<?> cls2 = java.lang.Class.forName(str);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cls2, "");
            return kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls2);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to deserialize ");
            sb.append(str);
            sb.append(" to ");
            sb.append(cls);
            throw new com.izettle.android.serialization.JsonDeserializationException(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object deserializeFromJsonElement(java.lang.Class<?> cls, com.izettle.android.serialization.JsonElement jsonElement) {
        if (jsonElement instanceof com.izettle.android.serialization.JsonNull) {
            return null;
        }
        try {
            if (com.izettle.android.serialization.ExtensionsKt.isBigDecimal(cls)) {
                return jsonElement.asJsonPrimitive().getAsBigDecimal();
            }
            if (com.izettle.android.serialization.ExtensionsKt.isBoolean(cls)) {
                return java.lang.Boolean.valueOf(jsonElement.asJsonPrimitive().getAsBoolean());
            }
            if (com.izettle.android.serialization.ExtensionsKt.isInt(cls)) {
                return java.lang.Integer.valueOf(jsonElement.asJsonPrimitive().getAsInt());
            }
            if (com.izettle.android.serialization.ExtensionsKt.isLong(cls)) {
                return java.lang.Long.valueOf(jsonElement.asJsonPrimitive().getAsLong());
            }
            if (com.izettle.android.serialization.ExtensionsKt.isShort(cls)) {
                return java.lang.Short.valueOf(jsonElement.asJsonPrimitive().getAsShort());
            }
            if (com.izettle.android.serialization.ExtensionsKt.isFloat(cls)) {
                return java.lang.Float.valueOf(jsonElement.asJsonPrimitive().getAsFloat());
            }
            if (com.izettle.android.serialization.ExtensionsKt.isDouble(cls)) {
                return java.lang.Double.valueOf(jsonElement.asJsonPrimitive().getAsDouble());
            }
            if (cls.isEnum()) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "");
                return cls.cast(java.lang.Enum.valueOf(cls, jsonElement.asJsonPrimitive().getAsString()));
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.KClass.class))) {
                return kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Class.class) ? java.lang.Class.forName(jsonElement.asJsonPrimitive().getAsString()) : jsonElement.asJsonPrimitive().getAsString();
            }
            java.lang.Class<?> cls2 = java.lang.Class.forName(jsonElement.asJsonPrimitive().getAsString());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cls2, "");
            return kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls2);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to deserialize ");
            sb.append(jsonElement);
            sb.append(" to ");
            sb.append(cls);
            throw new com.izettle.android.serialization.JsonDeserializationException(sb.toString(), e);
        }
    }
}
