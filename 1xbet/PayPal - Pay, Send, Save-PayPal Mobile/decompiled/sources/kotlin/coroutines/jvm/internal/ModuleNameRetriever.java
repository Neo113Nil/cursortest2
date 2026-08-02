package kotlin.coroutines.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;", "", "<init>", "()V", "Lkotlin/coroutines/Continuation;", "continuation", "", "getModuleName", "(Lkotlin/coroutines/Continuation;)Ljava/lang/String;", "p0", "Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "getHighSpeedVideoFpsRanges", "Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Cache"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ModuleNameRetriever {
    public static final kotlin.coroutines.jvm.internal.ModuleNameRetriever INSTANCE = new kotlin.coroutines.jvm.internal.ModuleNameRetriever();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache getHighResolutionOutputSizeshNQ4ISI = new kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache(null, null, null);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0013\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\f\u0010\t"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "", "Ljava/lang/reflect/Method;", "p0", "p1", "p2", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "Camera2StreamConfigurationMap", "Ljava/lang/reflect/Method;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Cache {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        public final java.lang.reflect.Method getHighSpeedVideoSizes;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        public final java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        public final java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;

        public Cache(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3) {
            this.getHighSpeedVideoSizes = method;
            this.getHighResolutionOutputSizeshNQ4ISI = method2;
            this.getHighSpeedVideoFpsRangesFor = method3;
        }
    }

    private ModuleNameRetriever() {
    }

    public final java.lang.String getModuleName(kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        java.lang.reflect.Method method;
        java.lang.Object invoke;
        java.lang.reflect.Method method2;
        java.lang.Object invoke2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "");
        kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache cache = getHighSpeedVideoSizes;
        if (cache == null) {
            cache = getHighResolutionOutputSizeshNQ4ISI(continuation);
        }
        if (cache != getHighResolutionOutputSizeshNQ4ISI && (method = cache.getHighSpeedVideoSizes) != null && (invoke = method.invoke(continuation.getClass(), new java.lang.Object[0])) != null && (method2 = cache.getHighResolutionOutputSizeshNQ4ISI) != null && (invoke2 = method2.invoke(invoke, new java.lang.Object[0])) != null) {
            java.lang.reflect.Method method3 = cache.getHighSpeedVideoFpsRangesFor;
            java.lang.Object invoke3 = method3 != null ? method3.invoke(invoke2, new java.lang.Object[0]) : null;
            if (invoke3 instanceof java.lang.String) {
                return (java.lang.String) invoke3;
            }
        }
        return null;
    }

    private static kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<java.lang.Object> p0) {
        try {
            kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache cache = new kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache(java.lang.Class.class.getDeclaredMethod("getModule", new java.lang.Class[0]), p0.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new java.lang.Class[0]), p0.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new java.lang.Class[0]));
            getHighSpeedVideoSizes = cache;
            return cache;
        } catch (java.lang.Exception unused) {
            kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache cache2 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoSizes = cache2;
            return cache2;
        }
    }
}
