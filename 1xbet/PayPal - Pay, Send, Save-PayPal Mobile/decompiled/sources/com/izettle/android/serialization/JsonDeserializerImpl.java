package com.izettle.android.serialization;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\n\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/izettle/android/serialization/JsonDeserializerImpl;", "Lcom/izettle/android/serialization/JsonDeserializer;", "<init>", "()V", "", "T", "", "json", "Lcom/izettle/android/serialization/JsonDeserializer$TypeWrapper;", "typeWrapper", "deserialize", "(Ljava/lang/String;Lcom/izettle/android/serialization/JsonDeserializer$TypeWrapper;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "type", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Lcom/izettle/android/serialization/JsonParser;", "parser", "Lcom/izettle/android/serialization/JsonParser;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonDeserializerImpl implements com.izettle.android.serialization.JsonDeserializer {
    private final com.izettle.android.serialization.JsonParser parser = new com.izettle.android.serialization.JsonParser();

    @Override // com.izettle.android.serialization.JsonDeserializer
    public final <T> T deserialize(java.lang.String json, com.izettle.android.serialization.JsonDeserializer.TypeWrapper<T> typeWrapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeWrapper, "");
        java.lang.Class<?> rawType = typeWrapper.getRawType();
        java.lang.reflect.Type[] genericTypeArguments = typeWrapper.getGenericTypeArguments();
        com.izettle.android.serialization.GenericJsonDeserializerContext genericJsonDeserializerContext = new com.izettle.android.serialization.GenericJsonDeserializerContext(rawType, (java.lang.reflect.Type[]) java.util.Arrays.copyOf(genericTypeArguments, genericTypeArguments.length));
        this.parser.parse(json, genericJsonDeserializerContext);
        T t = (T) genericJsonDeserializerContext.getDeserializedObject();
        kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
        return t;
    }

    @Override // com.izettle.android.serialization.JsonDeserializer
    public final <T> T deserialize(java.lang.String json, kotlin.reflect.KClass<T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        if (com.izettle.android.serialization.ExtensionsKt.isJsonElement(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) type))) {
            com.izettle.android.serialization.JsonElementDeserializerContext jsonElementDeserializerContext = new com.izettle.android.serialization.JsonElementDeserializerContext();
            this.parser.parse(json, jsonElementDeserializerContext);
            T t = (T) kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) type).cast(jsonElementDeserializerContext.getDeserializedObject());
            kotlin.jvm.internal.Intrinsics.checkNotNull(t);
            return t;
        }
        com.izettle.android.serialization.GenericJsonDeserializerContext genericJsonDeserializerContext = new com.izettle.android.serialization.GenericJsonDeserializerContext(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) type), new java.lang.reflect.Type[0]);
        this.parser.parse(json, genericJsonDeserializerContext);
        T t2 = (T) kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) type).cast(genericJsonDeserializerContext.getDeserializedObject());
        kotlin.jvm.internal.Intrinsics.checkNotNull(t2);
        return t2;
    }
}
