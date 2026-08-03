package kotlinx.serialization;

@kotlin.Metadata(d1 = {"kotlinx/serialization/SerializersKt__SerializersJvmKt", "kotlinx/serialization/SerializersKt__SerializersKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SerializersKt {
    public static final kotlinx.serialization.KSerializer<?> moduleThenPolymorphic(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KClass<?> kClass) {
        return kotlinx.serialization.SerializersKt__SerializersKt.moduleThenPolymorphic(serializersModule, kClass);
    }

    public static final kotlinx.serialization.KSerializer<?> moduleThenPolymorphic(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KClass<?> kClass, kotlinx.serialization.KSerializer<?>[] kSerializerArr) {
        return kotlinx.serialization.SerializersKt__SerializersKt.moduleThenPolymorphic(serializersModule, kClass, kSerializerArr);
    }

    public static final kotlinx.serialization.KSerializer<?> noCompiledSerializer(java.lang.String str) {
        return kotlinx.serialization.SerializersKt__SerializersKt.noCompiledSerializer(str);
    }

    public static final kotlinx.serialization.KSerializer<?> noCompiledSerializer(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KClass<?> kClass) {
        return kotlinx.serialization.SerializersKt__SerializersKt.noCompiledSerializer(serializersModule, kClass);
    }

    public static final kotlinx.serialization.KSerializer<?> noCompiledSerializer(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KClass<?> kClass, kotlinx.serialization.KSerializer<?>[] kSerializerArr) {
        return kotlinx.serialization.SerializersKt__SerializersKt.noCompiledSerializer(serializersModule, kClass, kSerializerArr);
    }

    public static final kotlinx.serialization.KSerializer<? extends java.lang.Object> parametrizedSerializerOrNull(kotlin.reflect.KClass<java.lang.Object> kClass, java.util.List<? extends kotlinx.serialization.KSerializer<java.lang.Object>> list, kotlin.jvm.functions.Function0<? extends kotlin.reflect.KClassifier> function0) {
        return kotlinx.serialization.SerializersKt__SerializersKt.parametrizedSerializerOrNull(kClass, list, function0);
    }

    public static final /* synthetic */ <T> kotlinx.serialization.KSerializer<T> serializer() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return (kotlinx.serialization.KSerializer<T>) serializer((kotlin.reflect.KType) null);
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(java.lang.reflect.Type type) {
        return kotlinx.serialization.SerializersKt__SerializersJvmKt.serializer(type);
    }

    @kotlinx.serialization.InternalSerializationApi
    public static final <T> kotlinx.serialization.KSerializer<T> serializer(kotlin.reflect.KClass<T> kClass) {
        return kotlinx.serialization.SerializersKt__SerializersKt.serializer(kClass);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(kotlin.reflect.KClass<?> kClass, java.util.List<? extends kotlinx.serialization.KSerializer<?>> list, boolean z) {
        return kotlinx.serialization.SerializersKt__SerializersKt.serializer(kClass, list, z);
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(kotlin.reflect.KType kType) {
        return kotlinx.serialization.SerializersKt__SerializersKt.serializer(kType);
    }

    public static final /* synthetic */ <T> kotlinx.serialization.KSerializer<T> serializer(kotlinx.serialization.modules.SerializersModule serializersModule) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (kotlinx.serialization.KSerializer<T>) serializer(serializersModule, (kotlin.reflect.KType) null);
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(kotlinx.serialization.modules.SerializersModule serializersModule, java.lang.reflect.Type type) {
        return kotlinx.serialization.SerializersKt__SerializersJvmKt.serializer(serializersModule, type);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KClass<?> kClass, java.util.List<? extends kotlinx.serialization.KSerializer<?>> list, boolean z) {
        return kotlinx.serialization.SerializersKt__SerializersKt.serializer(serializersModule, kClass, list, z);
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KType kType) {
        return kotlinx.serialization.SerializersKt__SerializersKt.serializer(serializersModule, kType);
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull(java.lang.reflect.Type type) {
        return kotlinx.serialization.SerializersKt__SerializersJvmKt.serializerOrNull(type);
    }

    @kotlinx.serialization.InternalSerializationApi
    public static final <T> kotlinx.serialization.KSerializer<T> serializerOrNull(kotlin.reflect.KClass<T> kClass) {
        return kotlinx.serialization.SerializersKt__SerializersKt.serializerOrNull(kClass);
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull(kotlin.reflect.KType kType) {
        return kotlinx.serialization.SerializersKt__SerializersKt.serializerOrNull(kType);
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull(kotlinx.serialization.modules.SerializersModule serializersModule, java.lang.reflect.Type type) {
        return kotlinx.serialization.SerializersKt__SerializersJvmKt.serializerOrNull(serializersModule, type);
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KType kType) {
        return kotlinx.serialization.SerializersKt__SerializersKt.serializerOrNull(serializersModule, kType);
    }

    public static final java.util.List<kotlinx.serialization.KSerializer<java.lang.Object>> serializersForParameters(kotlinx.serialization.modules.SerializersModule serializersModule, java.util.List<? extends kotlin.reflect.KType> list, boolean z) {
        return kotlinx.serialization.SerializersKt__SerializersKt.serializersForParameters(serializersModule, list, z);
    }
}
