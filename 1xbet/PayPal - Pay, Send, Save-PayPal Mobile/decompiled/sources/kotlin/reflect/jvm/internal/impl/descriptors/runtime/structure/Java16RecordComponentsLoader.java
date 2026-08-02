package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
final class Java16RecordComponentsLoader {
    static kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader.Cache getHighResolutionOutputSizeshNQ4ISI;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader();

    public static final class Cache {
        private final java.lang.reflect.Method Camera2StreamConfigurationMap;
        private final java.lang.reflect.Method getHighSpeedVideoFpsRanges;

        public Cache(java.lang.reflect.Method method, java.lang.reflect.Method method2) {
            this.Camera2StreamConfigurationMap = method;
            this.getHighSpeedVideoFpsRanges = method2;
        }

        public final java.lang.reflect.Method getGetType() {
            return this.Camera2StreamConfigurationMap;
        }

        public final java.lang.reflect.Method getGetAccessor() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    private Java16RecordComponentsLoader() {
    }

    static kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader.Cache getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
        java.lang.Class<?> cls = obj.getClass();
        try {
            return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader.Cache(cls.getMethod("getType", new java.lang.Class[0]), cls.getMethod("getAccessor", new java.lang.Class[0]));
        } catch (java.lang.NoSuchMethodException unused) {
            return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader.Cache(null, null);
        }
    }
}
