package retrofit2;

/* loaded from: classes5.dex */
public final class Retrofit {
    final okhttp3.Call.Factory Camera2StreamConfigurationMap;
    final java.util.List<retrofit2.Converter.Factory> getHighResolutionOutputSizeshNQ4ISI;
    final java.util.List<retrofit2.CallAdapter.Factory> getHighSpeedVideoFpsRanges;
    final okhttp3.HttpUrl getHighSpeedVideoFpsRangesFor;

    @javax.annotation.Nullable
    final java.util.concurrent.Executor getHighSpeedVideoSizes;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.reflect.Method, java.lang.Object> getHighSpeedVideoSizesFor = new java.util.concurrent.ConcurrentHashMap<>();
    final boolean getInputFormats;
    final int getInputSizeshNQ4ISI;
    final int getOutputMinFrameDuration;

    Retrofit(okhttp3.Call.Factory factory, okhttp3.HttpUrl httpUrl, java.util.List<retrofit2.Converter.Factory> list, int i, java.util.List<retrofit2.CallAdapter.Factory> list2, int i2, @javax.annotation.Nullable java.util.concurrent.Executor executor, boolean z) {
        this.Camera2StreamConfigurationMap = factory;
        this.getHighSpeedVideoFpsRangesFor = httpUrl;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getOutputMinFrameDuration = i;
        this.getHighSpeedVideoFpsRanges = list2;
        this.getInputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoSizes = executor;
        this.getInputFormats = z;
    }

    final retrofit2.ServiceMethod<?> Camera2StreamConfigurationMap(java.lang.Class<?> cls, java.lang.reflect.Method method) {
        while (true) {
            java.lang.Object obj = this.getHighSpeedVideoSizesFor.get(method);
            if (obj instanceof retrofit2.ServiceMethod) {
                return (retrofit2.ServiceMethod) obj;
            }
            if (obj == null) {
                java.lang.Object obj2 = new java.lang.Object();
                synchronized (obj2) {
                    java.lang.Object putIfAbsent = this.getHighSpeedVideoSizesFor.putIfAbsent(method, obj2);
                    if (putIfAbsent == null) {
                        try {
                            retrofit2.ServiceMethod<?> Camera2StreamConfigurationMap = retrofit2.ServiceMethod.Camera2StreamConfigurationMap(this, cls, method);
                            this.getHighSpeedVideoSizesFor.put(method, Camera2StreamConfigurationMap);
                            return Camera2StreamConfigurationMap;
                        } catch (java.lang.Throwable th) {
                            this.getHighSpeedVideoSizesFor.remove(method);
                            throw th;
                        }
                    }
                    obj = putIfAbsent;
                }
            }
            synchronized (obj) {
                java.lang.Object obj3 = this.getHighSpeedVideoSizesFor.get(method);
                if (obj3 != null) {
                    return (retrofit2.ServiceMethod) obj3;
                }
            }
        }
    }

    public final okhttp3.Call.Factory callFactory() {
        return this.Camera2StreamConfigurationMap;
    }

    public final okhttp3.HttpUrl baseUrl() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.util.List<retrofit2.CallAdapter.Factory> callAdapterFactories() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final retrofit2.CallAdapter<?, ?> callAdapter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr) {
        return nextCallAdapter(null, type, annotationArr);
    }

    public final retrofit2.CallAdapter<?, ?> nextCallAdapter(@javax.annotation.Nullable retrofit2.CallAdapter.Factory factory, java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr) {
        java.util.Objects.requireNonNull(type, "returnType == null");
        java.util.Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.getHighSpeedVideoFpsRanges.indexOf(factory) + 1;
        int size = this.getHighSpeedVideoFpsRanges.size();
        for (int i = indexOf; i < size; i++) {
            retrofit2.CallAdapter<?, ?> callAdapter = this.getHighSpeedVideoFpsRanges.get(i).get(type, annotationArr, this);
            if (callAdapter != null) {
                return callAdapter;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.getHighSpeedVideoFpsRanges.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.getHighSpeedVideoFpsRanges.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.getHighSpeedVideoFpsRanges.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final java.util.List<retrofit2.Converter.Factory> converterFactories() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final <T> retrofit2.Converter<T, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, java.lang.annotation.Annotation[] annotationArr2) {
        return nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
    }

    public final <T> retrofit2.Converter<T, okhttp3.RequestBody> nextRequestBodyConverter(@javax.annotation.Nullable retrofit2.Converter.Factory factory, java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, java.lang.annotation.Annotation[] annotationArr2) {
        java.util.Objects.requireNonNull(type, "type == null");
        java.util.Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        java.util.Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.getHighResolutionOutputSizeshNQ4ISI.indexOf(factory) + 1;
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        for (int i = indexOf; i < size; i++) {
            retrofit2.Converter<T, okhttp3.RequestBody> converter = (retrofit2.Converter<T, okhttp3.RequestBody>) this.getHighResolutionOutputSizeshNQ4ISI.get(i).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (converter != null) {
                return converter;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.getHighResolutionOutputSizeshNQ4ISI.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final <T> retrofit2.Converter<okhttp3.ResponseBody, T> responseBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr) {
        return nextResponseBodyConverter(null, type, annotationArr);
    }

    public final <T> retrofit2.Converter<okhttp3.ResponseBody, T> nextResponseBodyConverter(@javax.annotation.Nullable retrofit2.Converter.Factory factory, java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr) {
        java.util.Objects.requireNonNull(type, "type == null");
        java.util.Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.getHighResolutionOutputSizeshNQ4ISI.indexOf(factory) + 1;
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        for (int i = indexOf; i < size; i++) {
            retrofit2.Converter<okhttp3.ResponseBody, T> converter = (retrofit2.Converter<okhttp3.ResponseBody, T>) this.getHighResolutionOutputSizeshNQ4ISI.get(i).responseBodyConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.getHighResolutionOutputSizeshNQ4ISI.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final <T> retrofit2.Converter<T, java.lang.String> stringConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr) {
        java.util.Objects.requireNonNull(type, "type == null");
        java.util.Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        for (int i = 0; i < size; i++) {
            retrofit2.Converter<T, java.lang.String> converter = (retrofit2.Converter<T, java.lang.String>) this.getHighResolutionOutputSizeshNQ4ISI.get(i).stringConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        return retrofit2.BuiltInConverters.ToStringConverter.getHighResolutionOutputSizeshNQ4ISI;
    }

    @javax.annotation.Nullable
    public final java.util.concurrent.Executor callbackExecutor() {
        return this.getHighSpeedVideoSizes;
    }

    public final retrofit2.Retrofit.Builder newBuilder() {
        return new retrofit2.Retrofit.Builder(this);
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private okhttp3.HttpUrl Camera2StreamConfigurationMap;

        @javax.annotation.Nullable
        private okhttp3.Call.Factory getHighSpeedVideoFpsRanges;

        @javax.annotation.Nullable
        private java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;
        private boolean getHighSpeedVideoSizesFor;
        private final java.util.List<retrofit2.Converter.Factory> getHighSpeedVideoSizes = new java.util.ArrayList();
        private final java.util.List<retrofit2.CallAdapter.Factory> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();

        public Builder() {
        }

        Builder(retrofit2.Retrofit retrofit) {
            this.getHighSpeedVideoFpsRanges = retrofit.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = retrofit.getHighSpeedVideoFpsRangesFor;
            int size = retrofit.getHighResolutionOutputSizeshNQ4ISI.size();
            int i = retrofit.getOutputMinFrameDuration;
            for (int i2 = 1; i2 < size - i; i2++) {
                this.getHighSpeedVideoSizes.add(retrofit.getHighResolutionOutputSizeshNQ4ISI.get(i2));
            }
            int size2 = retrofit.getHighSpeedVideoFpsRanges.size();
            int i3 = retrofit.getInputSizeshNQ4ISI;
            for (int i4 = 0; i4 < size2 - i3; i4++) {
                this.getHighResolutionOutputSizeshNQ4ISI.add(retrofit.getHighSpeedVideoFpsRanges.get(i4));
            }
            this.getHighSpeedVideoFpsRangesFor = retrofit.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizesFor = retrofit.getInputFormats;
        }

        public final retrofit2.Retrofit.Builder client(okhttp3.OkHttpClient okHttpClient) {
            return callFactory((okhttp3.Call.Factory) java.util.Objects.requireNonNull(okHttpClient, "client == null"));
        }

        public final retrofit2.Retrofit.Builder callFactory(okhttp3.Call.Factory factory) {
            this.getHighSpeedVideoFpsRanges = (okhttp3.Call.Factory) java.util.Objects.requireNonNull(factory, "factory == null");
            return this;
        }

        public final retrofit2.Retrofit.Builder baseUrl(java.net.URL url) {
            java.util.Objects.requireNonNull(url, "baseUrl == null");
            return baseUrl(okhttp3.HttpUrl.get(url.toString()));
        }

        public final retrofit2.Retrofit.Builder baseUrl(java.lang.String str) {
            java.util.Objects.requireNonNull(str, "baseUrl == null");
            return baseUrl(okhttp3.HttpUrl.get(str));
        }

        public final retrofit2.Retrofit.Builder baseUrl(okhttp3.HttpUrl httpUrl) {
            java.util.Objects.requireNonNull(httpUrl, "baseUrl == null");
            if (!"".equals(httpUrl.pathSegments().get(r0.size() - 1))) {
                throw new java.lang.IllegalArgumentException("baseUrl must end in /: ".concat(java.lang.String.valueOf(httpUrl)));
            }
            this.Camera2StreamConfigurationMap = httpUrl;
            return this;
        }

        public final retrofit2.Retrofit.Builder addConverterFactory(retrofit2.Converter.Factory factory) {
            this.getHighSpeedVideoSizes.add((retrofit2.Converter.Factory) java.util.Objects.requireNonNull(factory, "factory == null"));
            return this;
        }

        public final retrofit2.Retrofit.Builder addCallAdapterFactory(retrofit2.CallAdapter.Factory factory) {
            this.getHighResolutionOutputSizeshNQ4ISI.add((retrofit2.CallAdapter.Factory) java.util.Objects.requireNonNull(factory, "factory == null"));
            return this;
        }

        public final retrofit2.Retrofit.Builder callbackExecutor(java.util.concurrent.Executor executor) {
            this.getHighSpeedVideoFpsRangesFor = (java.util.concurrent.Executor) java.util.Objects.requireNonNull(executor, "executor == null");
            return this;
        }

        public final java.util.List<retrofit2.CallAdapter.Factory> callAdapterFactories() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final java.util.List<retrofit2.Converter.Factory> converterFactories() {
            return this.getHighSpeedVideoSizes;
        }

        public final retrofit2.Retrofit.Builder validateEagerly(boolean z) {
            this.getHighSpeedVideoSizesFor = z;
            return this;
        }

        public final retrofit2.Retrofit build() {
            if (this.Camera2StreamConfigurationMap == null) {
                throw new java.lang.IllegalStateException("Base URL required.");
            }
            okhttp3.Call.Factory factory = this.getHighSpeedVideoFpsRanges;
            if (factory == null) {
                factory = new okhttp3.OkHttpClient();
            }
            okhttp3.Call.Factory factory2 = factory;
            java.util.concurrent.Executor executor = this.getHighSpeedVideoFpsRangesFor;
            if (executor == null) {
                executor = retrofit2.Platform.getHighResolutionOutputSizeshNQ4ISI;
            }
            java.util.concurrent.Executor executor2 = executor;
            retrofit2.BuiltInFactories builtInFactories = retrofit2.Platform.Camera2StreamConfigurationMap;
            java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighResolutionOutputSizeshNQ4ISI);
            java.util.List<? extends retrofit2.CallAdapter.Factory> Camera2StreamConfigurationMap = builtInFactories.Camera2StreamConfigurationMap(executor2);
            arrayList.addAll(Camera2StreamConfigurationMap);
            java.util.List<? extends retrofit2.Converter.Factory> highSpeedVideoSizes = builtInFactories.getHighSpeedVideoSizes();
            int size = highSpeedVideoSizes.size();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(this.getHighSpeedVideoSizes.size() + 1 + size);
            arrayList2.add(new retrofit2.BuiltInConverters());
            arrayList2.addAll(this.getHighSpeedVideoSizes);
            arrayList2.addAll(highSpeedVideoSizes);
            return new retrofit2.Retrofit(factory2, this.Camera2StreamConfigurationMap, java.util.Collections.unmodifiableList(arrayList2), size, java.util.Collections.unmodifiableList(arrayList), Camera2StreamConfigurationMap.size(), executor2, this.getHighSpeedVideoSizesFor);
        }
    }

    public final <T> T create(final java.lang.Class<T> cls) {
        if (!cls.isInterface()) {
            throw new java.lang.IllegalArgumentException("API declarations must be interfaces.");
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            java.lang.Class<T> cls2 = (java.lang.Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            java.util.Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.getInputFormats) {
            retrofit2.Reflection reflection = retrofit2.Platform.getHighSpeedVideoSizes;
            for (java.lang.reflect.Method method : cls.getDeclaredMethods()) {
                if (!reflection.Camera2StreamConfigurationMap(method) && !java.lang.reflect.Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    Camera2StreamConfigurationMap(cls, method);
                }
            }
        }
        return (T) java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, new java.lang.reflect.InvocationHandler() { // from class: retrofit2.Retrofit.1
            private final java.lang.Object[] getHighSpeedVideoSizes = new java.lang.Object[0];

            @Override // java.lang.reflect.InvocationHandler
            @javax.annotation.Nullable
            public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method2, @javax.annotation.Nullable java.lang.Object[] objArr) throws java.lang.Throwable {
                if (method2.getDeclaringClass() == java.lang.Object.class) {
                    return method2.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = this.getHighSpeedVideoSizes;
                }
                retrofit2.Reflection reflection2 = retrofit2.Platform.getHighSpeedVideoSizes;
                if (reflection2.Camera2StreamConfigurationMap(method2)) {
                    return reflection2.getHighSpeedVideoSizes(method2, cls, obj, objArr);
                }
                return retrofit2.Retrofit.this.Camera2StreamConfigurationMap(cls, method2).getHighSpeedVideoFpsRanges(obj, objArr);
            }
        });
    }
}
