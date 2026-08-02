package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class Java16SealedRecordLoader {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader();
    private static kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader.Cache getHighSpeedVideoSizes;

    public static final class Cache {
        private final java.lang.reflect.Method Camera2StreamConfigurationMap;
        private final java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.reflect.Method getHighSpeedVideoFpsRanges;
        private final java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;

        public Cache(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.reflect.Method method4) {
            this.getHighSpeedVideoFpsRanges = method;
            this.Camera2StreamConfigurationMap = method2;
            this.getHighResolutionOutputSizeshNQ4ISI = method3;
            this.getHighSpeedVideoFpsRangesFor = method4;
        }

        public final java.lang.reflect.Method isSealed() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final java.lang.reflect.Method getGetPermittedSubclasses() {
            return this.Camera2StreamConfigurationMap;
        }

        public final java.lang.reflect.Method isRecord() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final java.lang.reflect.Method getGetRecordComponents() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    private Java16SealedRecordLoader() {
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader.Cache getHighSpeedVideoFpsRangesFor() {
        try {
            return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader.Cache(java.lang.Class.class.getMethod("isSealed", new java.lang.Class[0]), java.lang.Class.class.getMethod("getPermittedSubclasses", new java.lang.Class[0]), java.lang.Class.class.getMethod("isRecord", new java.lang.Class[0]), java.lang.Class.class.getMethod("getRecordComponents", new java.lang.Class[0]));
        } catch (java.lang.NoSuchMethodException unused) {
            return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader.Cache(null, null, null, null);
        }
    }

    public final java.lang.Class<?>[] loadGetPermittedSubclasses(java.lang.Class<?> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader.Cache cache = getHighSpeedVideoSizes;
        if (cache == null) {
            cache = getHighSpeedVideoFpsRangesFor();
            getHighSpeedVideoSizes = cache;
        }
        java.lang.reflect.Method getPermittedSubclasses = cache.getGetPermittedSubclasses();
        if (getPermittedSubclasses == null) {
            return null;
        }
        java.lang.Object invoke = getPermittedSubclasses.invoke(cls, new java.lang.Object[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
        return (java.lang.Class[]) invoke;
    }

    public final java.lang.Object[] loadGetRecordComponents(java.lang.Class<?> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader.Cache cache = getHighSpeedVideoSizes;
        if (cache == null) {
            cache = getHighSpeedVideoFpsRangesFor();
            getHighSpeedVideoSizes = cache;
        }
        java.lang.reflect.Method getRecordComponents = cache.getGetRecordComponents();
        if (getRecordComponents == null) {
            return null;
        }
        return (java.lang.Object[]) getRecordComponents.invoke(cls, new java.lang.Object[0]);
    }

    public final java.lang.Boolean loadIsRecord(java.lang.Class<?> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader.Cache cache = getHighSpeedVideoSizes;
        if (cache == null) {
            cache = getHighSpeedVideoFpsRangesFor();
            getHighSpeedVideoSizes = cache;
        }
        java.lang.reflect.Method isRecord = cache.isRecord();
        if (isRecord == null) {
            return null;
        }
        java.lang.Object invoke = isRecord.invoke(cls, new java.lang.Object[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
        return (java.lang.Boolean) invoke;
    }

    public final java.lang.Boolean loadIsSealed(java.lang.Class<?> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader.Cache cache = getHighSpeedVideoSizes;
        if (cache == null) {
            cache = getHighSpeedVideoFpsRangesFor();
            getHighSpeedVideoSizes = cache;
        }
        java.lang.reflect.Method isSealed = cache.isSealed();
        if (isSealed == null) {
            return null;
        }
        java.lang.Object invoke = isSealed.invoke(cls, new java.lang.Object[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
        return (java.lang.Boolean) invoke;
    }
}
