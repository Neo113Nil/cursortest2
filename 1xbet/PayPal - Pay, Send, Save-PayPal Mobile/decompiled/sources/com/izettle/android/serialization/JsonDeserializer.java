package com.izettle.android.serialization;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \f2\u00020\u0001:\u0002\f\rJ/\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&¢\u0006\u0004\b\u0007\u0010\u000b"}, d2 = {"Lcom/izettle/android/serialization/JsonDeserializer;", "", "T", "", "json", "Lcom/izettle/android/serialization/JsonDeserializer$TypeWrapper;", "typeWrapper", "deserialize", "(Ljava/lang/String;Lcom/izettle/android/serialization/JsonDeserializer$TypeWrapper;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "type", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Companion", "TypeWrapper"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface JsonDeserializer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.serialization.JsonDeserializer.Companion INSTANCE = com.izettle.android.serialization.JsonDeserializer.Companion.$$INSTANCE;

    <T> T deserialize(java.lang.String json, com.izettle.android.serialization.JsonDeserializer.TypeWrapper<T> typeWrapper);

    <T> T deserialize(java.lang.String json, kotlin.reflect.KClass<T> type);

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\n\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001f\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t8\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/izettle/android/serialization/JsonDeserializer$TypeWrapper;", "T", "", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "Lkotlin/Pair;", "Ljava/lang/Class;", "", "getRawTypeAndGenericTypeArgsFromType", "(Ljava/lang/reflect/Type;)Lkotlin/Pair;", "genericTypeArguments", "[Ljava/lang/reflect/Type;", "getGenericTypeArguments", "()[Ljava/lang/reflect/Type;", "rawType", "Ljava/lang/Class;", "getRawType", "()Ljava/lang/Class;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static abstract class TypeWrapper<T> {
        private final java.lang.reflect.Type[] genericTypeArguments;
        private final java.lang.Class<?> rawType;

        public TypeWrapper() {
            java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(genericSuperclass, "");
            kotlin.Pair<java.lang.Class<?>, java.lang.reflect.Type[]> rawTypeAndGenericTypeArgsFromType = getRawTypeAndGenericTypeArgsFromType(com.izettle.android.serialization.ExtensionsKt.getGenericTypeArguments(genericSuperclass)[0]);
            java.lang.Class<?> component1 = rawTypeAndGenericTypeArgsFromType.component1();
            java.lang.reflect.Type[] component2 = rawTypeAndGenericTypeArgsFromType.component2();
            this.rawType = component1;
            this.genericTypeArguments = component2;
        }

        public final java.lang.Class<?> getRawType() {
            return this.rawType;
        }

        public final java.lang.reflect.Type[] getGenericTypeArguments() {
            return this.genericTypeArguments;
        }

        private final kotlin.Pair<java.lang.Class<?>, java.lang.reflect.Type[]> getRawTypeAndGenericTypeArgsFromType(java.lang.reflect.Type type) {
            java.lang.reflect.Type rawType;
            if (type instanceof java.lang.reflect.WildcardType) {
                rawType = ((java.lang.reflect.WildcardType) type).getUpperBounds()[0];
            } else {
                rawType = type instanceof java.lang.reflect.ParameterizedType ? ((java.lang.reflect.ParameterizedType) type).getRawType() : type;
            }
            if (rawType instanceof java.lang.reflect.ParameterizedType) {
                rawType = ((java.lang.reflect.ParameterizedType) rawType).getRawType();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(rawType, "");
            return kotlin.TuplesKt.to((java.lang.Class) rawType, type instanceof java.lang.reflect.ParameterizedType ? ((java.lang.reflect.ParameterizedType) type).getActualTypeArguments() : new java.lang.reflect.Type[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00028\u0000\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0086\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/izettle/android/serialization/JsonDeserializer$Companion;", "", "<init>", "()V", "Lcom/izettle/android/serialization/JsonDeserializer;", "create", "()Lcom/izettle/android/serialization/JsonDeserializer;", "T", "", "json", "deserialize", "(Ljava/lang/String;)Ljava/lang/Object;", "Lcom/izettle/android/serialization/JsonDeserializer$TypeWrapper;", "typeWrapper", "()Lcom/izettle/android/serialization/JsonDeserializer$TypeWrapper;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.izettle.android.serialization.JsonDeserializer.Companion $$INSTANCE = new com.izettle.android.serialization.JsonDeserializer.Companion();

        private Companion() {
        }

        public final /* synthetic */ <T> com.izettle.android.serialization.JsonDeserializer.TypeWrapper<T> typeWrapper() {
            kotlin.jvm.internal.Intrinsics.needClassReification();
            return new com.izettle.android.serialization.JsonDeserializer.TypeWrapper<T>() { // from class: com.izettle.android.serialization.JsonDeserializer$Companion$typeWrapper$1
            };
        }

        public final /* synthetic */ <T> T deserialize(java.lang.String json) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
            com.izettle.android.serialization.JsonDeserializer create = create();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            return (T) create.deserialize(json, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        }

        public final com.izettle.android.serialization.JsonDeserializer create() {
            return new com.izettle.android.serialization.JsonDeserializerImpl();
        }
    }
}
