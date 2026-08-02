package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"", "V", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "Lkotlin/reflect/jvm/internal/CacheByClass;", "createCache", "(Lkotlin/jvm/functions/Function1;)Lkotlin/reflect/jvm/internal/CacheByClass;", "", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CacheByClassKt {
    private static final boolean Camera2StreamConfigurationMap;

    static {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.Class.forName("java.lang.ClassValue"));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23442isSuccessimpl(m23436constructorimpl)) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            m23436constructorimpl = java.lang.Boolean.TRUE;
        }
        java.lang.Object m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(m23436constructorimpl);
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl2)) {
            m23436constructorimpl2 = java.lang.Boolean.FALSE;
        }
        Camera2StreamConfigurationMap = ((java.lang.Boolean) m23436constructorimpl2).booleanValue();
    }

    public static final <V> kotlin.reflect.jvm.internal.CacheByClass<V> createCache(kotlin.jvm.functions.Function1<? super java.lang.Class<?>, ? extends V> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return Camera2StreamConfigurationMap ? new kotlin.reflect.jvm.internal.ClassValueCache<>(function1) : new kotlin.reflect.jvm.internal.ConcurrentHashMapCache<>(function1);
    }
}
