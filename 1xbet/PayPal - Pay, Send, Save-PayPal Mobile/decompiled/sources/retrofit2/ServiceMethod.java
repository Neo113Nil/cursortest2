package retrofit2;

/* loaded from: classes5.dex */
abstract class ServiceMethod<T> {
    @javax.annotation.Nullable
    abstract T getHighSpeedVideoFpsRanges(java.lang.Object obj, java.lang.Object[] objArr);

    ServiceMethod() {
    }

    static <T> retrofit2.ServiceMethod<T> Camera2StreamConfigurationMap(retrofit2.Retrofit retrofit, java.lang.Class<?> cls, java.lang.reflect.Method method) {
        retrofit2.RequestFactory highSpeedVideoFpsRangesFor = retrofit2.RequestFactory.getHighSpeedVideoFpsRangesFor(retrofit, cls, method);
        java.lang.reflect.Type genericReturnType = method.getGenericReturnType();
        if (retrofit2.Utils.getHighSpeedVideoFpsRangesFor(genericReturnType)) {
            throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType == java.lang.Void.TYPE) {
            throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(method, "Service methods cannot return void.", new java.lang.Object[0]);
        }
        return retrofit2.HttpServiceMethod.getHighSpeedVideoFpsRangesFor(retrofit, method, highSpeedVideoFpsRangesFor);
    }
}
