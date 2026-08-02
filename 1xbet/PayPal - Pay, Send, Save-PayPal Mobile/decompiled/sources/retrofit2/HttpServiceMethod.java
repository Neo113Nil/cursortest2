package retrofit2;

/* loaded from: classes5.dex */
abstract class HttpServiceMethod<ResponseT, ReturnT> extends retrofit2.ServiceMethod<ReturnT> {
    private final retrofit2.RequestFactory Camera2StreamConfigurationMap;
    private final retrofit2.Converter<okhttp3.ResponseBody, ResponseT> getHighResolutionOutputSizeshNQ4ISI;
    private final okhttp3.Call.Factory getHighSpeedVideoSizes;

    @javax.annotation.Nullable
    protected abstract ReturnT getHighSpeedVideoFpsRanges(retrofit2.Call<ResponseT> call, java.lang.Object[] objArr);

    static <ResponseT, ReturnT> retrofit2.HttpServiceMethod<ResponseT, ReturnT> getHighSpeedVideoFpsRangesFor(retrofit2.Retrofit retrofit, java.lang.reflect.Method method, retrofit2.RequestFactory requestFactory) {
        java.lang.reflect.Type genericReturnType;
        boolean z;
        boolean z2;
        boolean highResolutionOutputSizeshNQ4ISI;
        boolean z3 = requestFactory.getInputFormats;
        java.lang.annotation.Annotation[] annotations = method.getAnnotations();
        if (z3) {
            java.lang.reflect.Type[] genericParameterTypes = method.getGenericParameterTypes();
            z = true;
            java.lang.reflect.Type highSpeedVideoSizes = retrofit2.Utils.getHighSpeedVideoSizes((java.lang.reflect.ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (retrofit2.Utils.Camera2StreamConfigurationMap(highSpeedVideoSizes) == retrofit2.Response.class && (highSpeedVideoSizes instanceof java.lang.reflect.ParameterizedType)) {
                highSpeedVideoSizes = retrofit2.Utils.Camera2StreamConfigurationMap(0, (java.lang.reflect.ParameterizedType) highSpeedVideoSizes);
                highResolutionOutputSizeshNQ4ISI = false;
            } else {
                if (retrofit2.Utils.Camera2StreamConfigurationMap(highSpeedVideoSizes) == retrofit2.Call.class) {
                    throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", retrofit2.Utils.Camera2StreamConfigurationMap(0, (java.lang.reflect.ParameterizedType) highSpeedVideoSizes));
                }
                highResolutionOutputSizeshNQ4ISI = retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
                z = false;
            }
            genericReturnType = new retrofit2.Utils.ParameterizedTypeImpl(null, retrofit2.Call.class, highSpeedVideoSizes);
            annotations = retrofit2.SkipCallbackExecutorImpl.getHighSpeedVideoFpsRangesFor(annotations);
            z2 = highResolutionOutputSizeshNQ4ISI;
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
            z2 = false;
        }
        retrofit2.CallAdapter Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(retrofit, method, genericReturnType, annotations);
        java.lang.reflect.Type getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap.getGetHighResolutionOutputSizeshNQ4ISI();
        if (getHighResolutionOutputSizeshNQ4ISI == okhttp3.Response.class) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
            sb.append(retrofit2.Utils.Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI).getName());
            sb.append("' is not a valid response body type. Did you mean ResponseBody?");
            throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(method, sb.toString(), new java.lang.Object[0]);
        }
        if (getHighResolutionOutputSizeshNQ4ISI == retrofit2.Response.class) {
            throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(method, "Response must include generic type (e.g., Response<String>)", new java.lang.Object[0]);
        }
        if (requestFactory.getHighSpeedVideoSizes.equals(com.datadog.android.internal.network.HttpSpec.Method.HEAD) && !java.lang.Void.class.equals(getHighResolutionOutputSizeshNQ4ISI) && !retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI)) {
            throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(method, "HEAD method must use Void or Unit as response type.", new java.lang.Object[0]);
        }
        retrofit2.Converter Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(retrofit, method, getHighResolutionOutputSizeshNQ4ISI);
        okhttp3.Call.Factory factory = retrofit.Camera2StreamConfigurationMap;
        if (!z3) {
            return new retrofit2.HttpServiceMethod.CallAdapted(requestFactory, factory, Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap);
        }
        if (z) {
            return new retrofit2.HttpServiceMethod.SuspendForResponse(requestFactory, factory, Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap);
        }
        return new retrofit2.HttpServiceMethod.SuspendForBody(requestFactory, factory, Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap, z2);
    }

    private static <ResponseT, ReturnT> retrofit2.CallAdapter<ResponseT, ReturnT> Camera2StreamConfigurationMap(retrofit2.Retrofit retrofit, java.lang.reflect.Method method, java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr) {
        try {
            return (retrofit2.CallAdapter<ResponseT, ReturnT>) retrofit.callAdapter(type, annotationArr);
        } catch (java.lang.RuntimeException e) {
            throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(method, e, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> retrofit2.Converter<okhttp3.ResponseBody, ResponseT> Camera2StreamConfigurationMap(retrofit2.Retrofit retrofit, java.lang.reflect.Method method, java.lang.reflect.Type type) {
        try {
            return retrofit.responseBodyConverter(type, method.getAnnotations());
        } catch (java.lang.RuntimeException e) {
            throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(method, e, "Unable to create converter for %s", type);
        }
    }

    HttpServiceMethod(retrofit2.RequestFactory requestFactory, okhttp3.Call.Factory factory, retrofit2.Converter<okhttp3.ResponseBody, ResponseT> converter) {
        this.Camera2StreamConfigurationMap = requestFactory;
        this.getHighSpeedVideoSizes = factory;
        this.getHighResolutionOutputSizeshNQ4ISI = converter;
    }

    @Override // retrofit2.ServiceMethod
    @javax.annotation.Nullable
    final ReturnT getHighSpeedVideoFpsRanges(java.lang.Object obj, java.lang.Object[] objArr) {
        return getHighSpeedVideoFpsRanges((retrofit2.Call) new retrofit2.OkHttpCall(this.Camera2StreamConfigurationMap, obj, objArr, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI), objArr);
    }

    static final class CallAdapted<ResponseT, ReturnT> extends retrofit2.HttpServiceMethod<ResponseT, ReturnT> {
        private final retrofit2.CallAdapter<ResponseT, ReturnT> getHighSpeedVideoSizes;

        CallAdapted(retrofit2.RequestFactory requestFactory, okhttp3.Call.Factory factory, retrofit2.Converter<okhttp3.ResponseBody, ResponseT> converter, retrofit2.CallAdapter<ResponseT, ReturnT> callAdapter) {
            super(requestFactory, factory, converter);
            this.getHighSpeedVideoSizes = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        protected final ReturnT getHighSpeedVideoFpsRanges(retrofit2.Call<ResponseT> call, java.lang.Object[] objArr) {
            return this.getHighSpeedVideoSizes.adapt(call);
        }
    }

    static final class SuspendForResponse<ResponseT> extends retrofit2.HttpServiceMethod<ResponseT, java.lang.Object> {
        private final retrofit2.CallAdapter<ResponseT, retrofit2.Call<ResponseT>> getHighSpeedVideoSizes;

        SuspendForResponse(retrofit2.RequestFactory requestFactory, okhttp3.Call.Factory factory, retrofit2.Converter<okhttp3.ResponseBody, ResponseT> converter, retrofit2.CallAdapter<ResponseT, retrofit2.Call<ResponseT>> callAdapter) {
            super(requestFactory, factory, converter);
            this.getHighSpeedVideoSizes = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        protected final java.lang.Object getHighSpeedVideoFpsRanges(retrofit2.Call<ResponseT> call, java.lang.Object[] objArr) {
            retrofit2.Call<ResponseT> adapt = this.getHighSpeedVideoSizes.adapt(call);
            kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) objArr[objArr.length - 1];
            try {
                return retrofit2.KotlinExtensions.awaitResponse(adapt, continuation);
            } catch (java.lang.Exception e) {
                return retrofit2.KotlinExtensions.suspendAndThrow(e, continuation);
            }
        }
    }

    static final class SuspendForBody<ResponseT> extends retrofit2.HttpServiceMethod<ResponseT, java.lang.Object> {
        private final boolean Camera2StreamConfigurationMap;
        private final boolean getHighSpeedVideoFpsRanges;
        private final retrofit2.CallAdapter<ResponseT, retrofit2.Call<ResponseT>> getHighSpeedVideoSizes;

        SuspendForBody(retrofit2.RequestFactory requestFactory, okhttp3.Call.Factory factory, retrofit2.Converter<okhttp3.ResponseBody, ResponseT> converter, retrofit2.CallAdapter<ResponseT, retrofit2.Call<ResponseT>> callAdapter, boolean z) {
            super(requestFactory, factory, converter);
            this.getHighSpeedVideoSizes = callAdapter;
            this.getHighSpeedVideoFpsRanges = false;
            this.Camera2StreamConfigurationMap = z;
        }

        @Override // retrofit2.HttpServiceMethod
        protected final java.lang.Object getHighSpeedVideoFpsRanges(retrofit2.Call<ResponseT> call, java.lang.Object[] objArr) {
            retrofit2.Call<ResponseT> adapt = this.getHighSpeedVideoSizes.adapt(call);
            kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) objArr[objArr.length - 1];
            try {
                if (this.Camera2StreamConfigurationMap) {
                    return retrofit2.KotlinExtensions.awaitUnit(adapt, continuation);
                }
                if (this.getHighSpeedVideoFpsRanges) {
                    return retrofit2.KotlinExtensions.awaitNullable(adapt, continuation);
                }
                return retrofit2.KotlinExtensions.await(adapt, continuation);
            } catch (java.lang.LinkageError e) {
                throw e;
            } catch (java.lang.ThreadDeath e2) {
                throw e2;
            } catch (java.lang.VirtualMachineError e3) {
                throw e3;
            } catch (java.lang.Throwable th) {
                return retrofit2.KotlinExtensions.suspendAndThrow(th, continuation);
            }
        }
    }
}
