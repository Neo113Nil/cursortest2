package kotlinx.serialization.internal;

/* compiled from: Platform.common.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&J\u0014\u0010\u0007\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/SerializerCache;", "T", "", "get", "Lkotlinx/serialization/KSerializer;", com.ironsource.X3.i.W, "Lkotlin/reflect/KClass;", "isStored", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SerializerCache<T> {
    kotlinx.serialization.KSerializer<T> get(kotlin.reflect.KClass<java.lang.Object> key);

    boolean isStored(kotlin.reflect.KClass<?> key);

    /* compiled from: Platform.common.kt */
    /* renamed from: kotlinx.serialization.internal.SerializerCache$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isStored(kotlinx.serialization.internal.SerializerCache _this, kotlin.reflect.KClass key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            return false;
        }
    }

    /* compiled from: Platform.common.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <T> boolean isStored(kotlinx.serialization.internal.SerializerCache<T> serializerCache, kotlin.reflect.KClass<?> key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            return kotlinx.serialization.internal.SerializerCache.CC.$default$isStored(serializerCache, key);
        }
    }
}
