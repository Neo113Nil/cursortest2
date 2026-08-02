package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a;\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0004\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002,\u0010\u0004\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\bH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "factory", "Lkotlinx/serialization/internal/SerializerCache;", "createCache", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/internal/SerializerCache;", "Lkotlin/Function2;", "", "", "Lkotlin/reflect/KType;", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "createParametrizedCache", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "", "getHighSpeedVideoFpsRanges", "Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CachingKt {
    private static final boolean getHighSpeedVideoFpsRanges;

    static {
        boolean z;
        try {
            java.lang.Class.forName("java.lang.ClassValue");
            z = true;
        } catch (java.lang.Throwable unused) {
            z = false;
        }
        getHighSpeedVideoFpsRanges = z;
    }

    public static final <T> kotlinx.serialization.internal.SerializerCache<T> createCache(kotlin.jvm.functions.Function1<? super kotlin.reflect.KClass<?>, ? extends kotlinx.serialization.KSerializer<T>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return getHighSpeedVideoFpsRanges ? new kotlinx.serialization.internal.ClassValueCache<>(function1) : new kotlinx.serialization.internal.ConcurrentHashMapCache<>(function1);
    }

    public static final <T> kotlinx.serialization.internal.ParametrizedSerializerCache<T> createParametrizedCache(kotlin.jvm.functions.Function2<? super kotlin.reflect.KClass<java.lang.Object>, ? super java.util.List<? extends kotlin.reflect.KType>, ? extends kotlinx.serialization.KSerializer<T>> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return getHighSpeedVideoFpsRanges ? new kotlinx.serialization.internal.ClassValueParametrizedCache<>(function2) : new kotlinx.serialization.internal.ConcurrentHashMapParametrizedCache<>(function2);
    }
}
