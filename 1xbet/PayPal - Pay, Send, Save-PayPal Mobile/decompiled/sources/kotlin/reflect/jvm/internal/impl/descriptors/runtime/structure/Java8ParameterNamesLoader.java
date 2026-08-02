package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
final class Java8ParameterNamesLoader {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java8ParameterNamesLoader Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java8ParameterNamesLoader();
    private static kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java8ParameterNamesLoader.Cache getHighSpeedVideoFpsRangesFor;

    public static final class Cache {
        private final java.lang.reflect.Method Camera2StreamConfigurationMap;
        private final java.lang.reflect.Method getHighSpeedVideoSizes;

        public Cache(java.lang.reflect.Method method, java.lang.reflect.Method method2) {
            this.getHighSpeedVideoSizes = method;
            this.Camera2StreamConfigurationMap = method2;
        }

        public final java.lang.reflect.Method getGetName() {
            return this.Camera2StreamConfigurationMap;
        }

        public final java.lang.reflect.Method getGetParameters() {
            return this.getHighSpeedVideoSizes;
        }
    }

    private Java8ParameterNamesLoader() {
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java8ParameterNamesLoader.Cache getHighSpeedVideoFpsRangesFor(java.lang.reflect.Member member) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(member, "");
        java.lang.Class<?> cls = member.getClass();
        try {
            return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java8ParameterNamesLoader.Cache(cls.getMethod("getParameters", new java.lang.Class[0]), kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getSafeClassLoader(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new java.lang.Class[0]));
        } catch (java.lang.NoSuchMethodException unused) {
            return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java8ParameterNamesLoader.Cache(null, null);
        }
    }

    public final java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI(java.lang.reflect.Member member) {
        java.lang.reflect.Method getName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(member, "");
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java8ParameterNamesLoader.Cache cache = getHighSpeedVideoFpsRangesFor;
        if (cache == null) {
            synchronized (this) {
                cache = getHighSpeedVideoFpsRangesFor;
                if (cache == null) {
                    cache = getHighSpeedVideoFpsRangesFor(member);
                    getHighSpeedVideoFpsRangesFor = cache;
                }
            }
        }
        java.lang.reflect.Method getParameters = cache.getGetParameters();
        if (getParameters == null || (getName = cache.getGetName()) == null) {
            return null;
        }
        java.lang.Object invoke = getParameters.invoke(member, new java.lang.Object[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
        java.lang.Object[] objArr = (java.lang.Object[]) invoke;
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            java.lang.Object invoke2 = getName.invoke(obj, new java.lang.Object[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNull(invoke2, "");
            arrayList.add((java.lang.String) invoke2);
        }
        return arrayList;
    }
}
