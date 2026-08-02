package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J%\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/SerializerCache;", "T", "", "Lkotlin/reflect/KClass;", "key", "Lkotlinx/serialization/KSerializer;", "get", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "", "isStored", "(Lkotlin/reflect/KClass;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SerializerCache<T> {
    kotlinx.serialization.KSerializer<T> get(kotlin.reflect.KClass<java.lang.Object> key);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <T> boolean isStored(kotlinx.serialization.internal.SerializerCache<T> serializerCache, kotlin.reflect.KClass<?> kClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
            return kotlinx.serialization.internal.SerializerCache.super.isStored(kClass);
        }
    }

    default boolean isStored(kotlin.reflect.KClass<?> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return false;
    }
}
