package kotlin.reflect.full;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0005H\u0002J \u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/full/Java8RepeatableContainerLoader;", "", "<init>", "()V", com.datadog.trace.api.DDSpanTypes.CACHE, "Lkotlin/reflect/full/Java8RepeatableContainerLoader$Cache;", "getCache", "()Lkotlin/reflect/full/Java8RepeatableContainerLoader$Cache;", "setCache", "(Lkotlin/reflect/full/Java8RepeatableContainerLoader$Cache;)V", "buildCache", "loadRepeatableContainer", "Ljava/lang/Class;", "", "klass", "Cache", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class Java8RepeatableContainerLoader {
    private static kotlin.reflect.full.Java8RepeatableContainerLoader.Cache Camera2StreamConfigurationMap;
    public static final kotlin.reflect.full.Java8RepeatableContainerLoader getHighSpeedVideoSizes = new kotlin.reflect.full.Java8RepeatableContainerLoader();

    private Java8RepeatableContainerLoader() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR!\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlin/reflect/full/Java8RepeatableContainerLoader$Cache;", "", "Ljava/lang/Class;", "", "repeatableClass", "Ljava/lang/reflect/Method;", "valueMethod", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Method;)V", "Ljava/lang/Class;", "getRepeatableClass", "()Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "getValueMethod", "()Ljava/lang/reflect/Method;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Cache {
        private final java.lang.Class<? extends java.lang.annotation.Annotation> repeatableClass;
        private final java.lang.reflect.Method valueMethod;

        public Cache(java.lang.Class<? extends java.lang.annotation.Annotation> cls, java.lang.reflect.Method method) {
            this.repeatableClass = cls;
            this.valueMethod = method;
        }

        public final java.lang.Class<? extends java.lang.annotation.Annotation> getRepeatableClass() {
            return this.repeatableClass;
        }

        public final java.lang.reflect.Method getValueMethod() {
            return this.valueMethod;
        }
    }

    private static kotlin.reflect.full.Java8RepeatableContainerLoader.Cache getHighResolutionOutputSizeshNQ4ISI() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("java.lang.annotation.Repeatable");
            kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "");
            return new kotlin.reflect.full.Java8RepeatableContainerLoader.Cache(cls, cls.getMethod(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, new java.lang.Class[0]));
        } catch (java.lang.ClassNotFoundException unused) {
            return new kotlin.reflect.full.Java8RepeatableContainerLoader.Cache(null, null);
        }
    }

    public final java.lang.Class<? extends java.lang.annotation.Annotation> getHighSpeedVideoFpsRangesFor(java.lang.Class<? extends java.lang.annotation.Annotation> cls) {
        java.lang.annotation.Annotation annotation;
        java.lang.reflect.Method valueMethod;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.reflect.full.Java8RepeatableContainerLoader.Cache cache = Camera2StreamConfigurationMap;
        if (cache == null) {
            synchronized (this) {
                cache = Camera2StreamConfigurationMap;
                if (cache == null) {
                    cache = getHighResolutionOutputSizeshNQ4ISI();
                    Camera2StreamConfigurationMap = cache;
                }
            }
        }
        java.lang.Class repeatableClass = cache.getRepeatableClass();
        if (repeatableClass == null || (annotation = cls.getAnnotation(repeatableClass)) == null || (valueMethod = cache.getValueMethod()) == null) {
            return null;
        }
        java.lang.Object invoke = valueMethod.invoke(annotation, new java.lang.Object[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
        return (java.lang.Class) invoke;
    }
}
