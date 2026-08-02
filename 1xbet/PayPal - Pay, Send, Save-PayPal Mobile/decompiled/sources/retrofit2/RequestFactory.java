package retrofit2;

/* loaded from: classes5.dex */
final class RequestFactory {

    @javax.annotation.Nullable
    final okhttp3.Headers Camera2StreamConfigurationMap;
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final okhttp3.HttpUrl getHighSpeedVideoFpsRanges;

    @javax.annotation.Nullable
    final okhttp3.MediaType getHighSpeedVideoFpsRangesFor;
    final java.lang.String getHighSpeedVideoSizes;
    final java.lang.reflect.Method getHighSpeedVideoSizesFor;
    final boolean getInputFormats;
    final boolean getInputSizeshNQ4ISI;
    final retrofit2.ParameterHandler<?>[] getOutputFormats;
    final boolean getOutputMinFrameDuration;

    @javax.annotation.Nullable
    final java.lang.String getOutputSizes;
    final java.lang.Class<?> getOutputSizeshNQ4ISI;

    static retrofit2.RequestFactory getHighSpeedVideoFpsRangesFor(retrofit2.Retrofit retrofit, java.lang.Class<?> cls, java.lang.reflect.Method method) {
        retrofit2.RequestFactory.Builder builder = new retrofit2.RequestFactory.Builder(retrofit, cls, method);
        for (java.lang.annotation.Annotation annotation : builder.isOutputSupportedFor) {
            if (annotation instanceof retrofit2.http.DELETE) {
                builder.getHighSpeedVideoSizes(com.datadog.android.internal.network.HttpSpec.Method.DELETE, ((retrofit2.http.DELETE) annotation).value(), false);
            } else if (annotation instanceof retrofit2.http.GET) {
                builder.getHighSpeedVideoSizes("GET", ((retrofit2.http.GET) annotation).value(), false);
            } else if (annotation instanceof retrofit2.http.HEAD) {
                builder.getHighSpeedVideoSizes(com.datadog.android.internal.network.HttpSpec.Method.HEAD, ((retrofit2.http.HEAD) annotation).value(), false);
            } else if (annotation instanceof retrofit2.http.PATCH) {
                builder.getHighSpeedVideoSizes("PATCH", ((retrofit2.http.PATCH) annotation).value(), true);
            } else if (annotation instanceof retrofit2.http.POST) {
                builder.getHighSpeedVideoSizes("POST", ((retrofit2.http.POST) annotation).value(), true);
            } else if (annotation instanceof retrofit2.http.PUT) {
                builder.getHighSpeedVideoSizes(com.datadog.android.internal.network.HttpSpec.Method.PUT, ((retrofit2.http.PUT) annotation).value(), true);
            } else if (annotation instanceof retrofit2.http.OPTIONS) {
                builder.getHighSpeedVideoSizes("OPTIONS", ((retrofit2.http.OPTIONS) annotation).value(), false);
            } else if (annotation instanceof retrofit2.http.HTTP) {
                retrofit2.http.HTTP http = (retrofit2.http.HTTP) annotation;
                builder.getHighSpeedVideoSizes(http.method(), http.path(), http.hasBody());
            } else if (annotation instanceof retrofit2.http.Headers) {
                retrofit2.http.Headers headers = (retrofit2.http.Headers) annotation;
                java.lang.String[] value = headers.value();
                if (value.length == 0) {
                    throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(builder.getValidOutputFormatsForInputhNQ4ISI, "@Headers annotation is empty.", new java.lang.Object[0]);
                }
                builder.getOutputSizeshNQ4ISI = builder.Camera2StreamConfigurationMap(value, headers.allowUnsafeNonAsciiValues());
            } else if (annotation instanceof retrofit2.http.Multipart) {
                if (builder.getOutputStallDuration) {
                    throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(builder.getValidOutputFormatsForInputhNQ4ISI, "Only one encoding annotation is allowed.", new java.lang.Object[0]);
                }
                builder.getOutputSizes = true;
            } else if (!(annotation instanceof retrofit2.http.FormUrlEncoded)) {
                continue;
            } else {
                if (builder.getOutputSizes) {
                    throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(builder.getValidOutputFormatsForInputhNQ4ISI, "Only one encoding annotation is allowed.", new java.lang.Object[0]);
                }
                builder.getOutputStallDuration = true;
            }
        }
        if (builder.getOutputMinFrameDurationlomOqCM == null) {
            throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(builder.getValidOutputFormatsForInputhNQ4ISI, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new java.lang.Object[0]);
        }
        if (!builder.getInputSizeshNQ4ISI) {
            if (builder.getOutputSizes) {
                throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(builder.getValidOutputFormatsForInputhNQ4ISI, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new java.lang.Object[0]);
            }
            if (builder.getOutputStallDuration) {
                throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(builder.getValidOutputFormatsForInputhNQ4ISI, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new java.lang.Object[0]);
            }
        }
        int length = builder.unwrapAs.length;
        builder.toString = new retrofit2.ParameterHandler[length];
        int i = 0;
        while (i < length) {
            builder.toString[i] = builder.getHighSpeedVideoFpsRangesFor(i, builder.isOutputSupportedForhNQ4ISI[i], builder.unwrapAs[i], i == length + (-1));
            i++;
        }
        if (builder.CoroutineDebuggingKt == null && !builder.getHighSpeedVideoSizesFor) {
            throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(builder.getValidOutputFormatsForInputhNQ4ISI, "Missing either @%s URL or @Url parameter.", builder.getOutputMinFrameDurationlomOqCM);
        }
        boolean z = builder.getOutputStallDuration;
        if (!z && !builder.getOutputSizes && !builder.getInputSizeshNQ4ISI && builder.Camera2StreamConfigurationMap) {
            throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(builder.getValidOutputFormatsForInputhNQ4ISI, "Non-body HTTP method cannot contain @Body.", new java.lang.Object[0]);
        }
        if (z && !builder.getHighResolutionOutputSizeshNQ4ISI) {
            throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(builder.getValidOutputFormatsForInputhNQ4ISI, "Form-encoded method must contain at least one @Field.", new java.lang.Object[0]);
        }
        if (builder.getOutputSizes && !builder.getHighSpeedVideoFpsRangesFor) {
            throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(builder.getValidOutputFormatsForInputhNQ4ISI, "Multipart method must contain at least one @Part.", new java.lang.Object[0]);
        }
        return new retrofit2.RequestFactory(builder);
    }

    private RequestFactory(retrofit2.RequestFactory.Builder builder) {
        this.getOutputSizeshNQ4ISI = builder.accessartificialFrame;
        this.getHighSpeedVideoSizesFor = builder.getValidOutputFormatsForInputhNQ4ISI;
        this.getHighSpeedVideoFpsRanges = builder.coroutineCreation.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = builder.getOutputMinFrameDurationlomOqCM;
        this.getOutputSizes = builder.CoroutineDebuggingKt;
        this.Camera2StreamConfigurationMap = builder.getOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = builder.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = builder.getInputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = builder.getOutputStallDuration;
        this.getInputSizeshNQ4ISI = builder.getOutputSizes;
        this.getOutputFormats = builder.toString;
        this.getInputFormats = builder.getOutputStallDurationlomOqCM;
    }

    static final class Builder {
        boolean Camera2StreamConfigurationMap;

        @javax.annotation.Nullable
        java.lang.String CoroutineDebuggingKt;
        final java.lang.Class<?> accessartificialFrame;

        @javax.annotation.Nullable
        java.util.Set<java.lang.String> coroutineBoundary;
        final retrofit2.Retrofit coroutineCreation;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;

        @javax.annotation.Nullable
        okhttp3.MediaType getHighSpeedVideoSizes;
        boolean getHighSpeedVideoSizesFor;
        boolean getInputFormats;
        boolean getInputSizeshNQ4ISI;
        boolean getOutputFormats;
        boolean getOutputMinFrameDuration;

        @javax.annotation.Nullable
        java.lang.String getOutputMinFrameDurationlomOqCM;
        boolean getOutputSizes;

        @javax.annotation.Nullable
        okhttp3.Headers getOutputSizeshNQ4ISI;
        boolean getOutputStallDuration;
        boolean getOutputStallDurationlomOqCM;
        final java.lang.reflect.Method getValidOutputFormatsForInputhNQ4ISI;
        final java.lang.annotation.Annotation[] isOutputSupportedFor;
        final java.lang.reflect.Type[] isOutputSupportedForhNQ4ISI;

        @javax.annotation.Nullable
        retrofit2.ParameterHandler<?>[] toString;
        final java.lang.annotation.Annotation[][] unwrapAs;

        /* renamed from: a, reason: collision with root package name */
        private static final java.util.regex.Pattern f7064a = java.util.regex.Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final java.util.regex.Pattern ArtificialStackFrames = java.util.regex.Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        Builder(retrofit2.Retrofit retrofit, java.lang.Class<?> cls, java.lang.reflect.Method method) {
            this.coroutineCreation = retrofit;
            this.accessartificialFrame = cls;
            this.getValidOutputFormatsForInputhNQ4ISI = method;
            this.isOutputSupportedFor = method.getAnnotations();
            this.isOutputSupportedForhNQ4ISI = method.getGenericParameterTypes();
            this.unwrapAs = method.getParameterAnnotations();
        }

        final void getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, boolean z) {
            java.lang.String str3 = this.getOutputMinFrameDurationlomOqCM;
            if (str3 != null) {
                throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(this.getValidOutputFormatsForInputhNQ4ISI, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.getOutputMinFrameDurationlomOqCM = str;
            this.getInputSizeshNQ4ISI = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                java.lang.String substring = str2.substring(indexOf + 1);
                if (f7064a.matcher(substring).find()) {
                    throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(this.getValidOutputFormatsForInputhNQ4ISI, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.CoroutineDebuggingKt = str2;
            this.coroutineBoundary = Camera2StreamConfigurationMap(str2);
        }

        final okhttp3.Headers Camera2StreamConfigurationMap(java.lang.String[] strArr, boolean z) {
            okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
            for (java.lang.String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(this.getValidOutputFormatsForInputhNQ4ISI, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                java.lang.String substring = str.substring(0, indexOf);
                java.lang.String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.getHighSpeedVideoSizes = okhttp3.MediaType.get(trim);
                    } catch (java.lang.IllegalArgumentException e) {
                        throw retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(this.getValidOutputFormatsForInputhNQ4ISI, e, "Malformed content type: %s", trim);
                    }
                } else if (z) {
                    builder.addUnsafeNonAscii(substring, trim);
                } else {
                    builder.add(substring, trim);
                }
            }
            return builder.build();
        }

        @javax.annotation.Nullable
        final retrofit2.ParameterHandler<?> getHighSpeedVideoFpsRangesFor(int i, java.lang.reflect.Type type, @javax.annotation.Nullable java.lang.annotation.Annotation[] annotationArr, boolean z) {
            retrofit2.ParameterHandler<?> parameterHandler;
            if (annotationArr != null) {
                parameterHandler = null;
                for (java.lang.annotation.Annotation annotation : annotationArr) {
                    retrofit2.ParameterHandler<?> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i, type, annotationArr, annotation);
                    if (highSpeedVideoFpsRangesFor != null) {
                        if (parameterHandler != null) {
                            throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "Multiple Retrofit annotations found, only one allowed.", new java.lang.Object[0]);
                        }
                        parameterHandler = highSpeedVideoFpsRangesFor;
                    }
                }
            } else {
                parameterHandler = null;
            }
            if (parameterHandler != null) {
                return parameterHandler;
            }
            if (z) {
                try {
                    if (retrofit2.Utils.Camera2StreamConfigurationMap(type) == kotlin.coroutines.Continuation.class) {
                        this.getOutputStallDurationlomOqCM = true;
                        return null;
                    }
                } catch (java.lang.NoClassDefFoundError unused) {
                }
            }
            throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "No Retrofit annotation found.", new java.lang.Object[0]);
        }

        @javax.annotation.Nullable
        private retrofit2.ParameterHandler<?> getHighSpeedVideoFpsRangesFor(int i, java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, java.lang.annotation.Annotation annotation) {
            if (annotation instanceof retrofit2.http.Url) {
                getHighResolutionOutputSizeshNQ4ISI(i, type);
                if (this.getHighSpeedVideoSizesFor) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "Multiple @Url method annotations found.", new java.lang.Object[0]);
                }
                if (this.getHighSpeedVideoFpsRanges) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@Path parameters may not be used with @Url.", new java.lang.Object[0]);
                }
                if (this.getOutputMinFrameDuration) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "A @Url parameter must not come after a @Query.", new java.lang.Object[0]);
                }
                if (this.getInputFormats) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "A @Url parameter must not come after a @QueryName.", new java.lang.Object[0]);
                }
                if (this.getOutputFormats) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "A @Url parameter must not come after a @QueryMap.", new java.lang.Object[0]);
                }
                if (this.CoroutineDebuggingKt != null) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@Url cannot be used with @%s URL", this.getOutputMinFrameDurationlomOqCM);
                }
                this.getHighSpeedVideoSizesFor = true;
                if (type == okhttp3.HttpUrl.class || type == java.lang.String.class || type == java.net.URI.class || ((type instanceof java.lang.Class) && "android.net.Uri".equals(((java.lang.Class) type).getName()))) {
                    return new retrofit2.ParameterHandler.RelativeUrl(this.getValidOutputFormatsForInputhNQ4ISI, i);
                }
                throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new java.lang.Object[0]);
            }
            if (annotation instanceof retrofit2.http.Path) {
                getHighResolutionOutputSizeshNQ4ISI(i, type);
                if (this.getOutputMinFrameDuration) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "A @Path parameter must not come after a @Query.", new java.lang.Object[0]);
                }
                if (this.getInputFormats) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "A @Path parameter must not come after a @QueryName.", new java.lang.Object[0]);
                }
                if (this.getOutputFormats) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "A @Path parameter must not come after a @QueryMap.", new java.lang.Object[0]);
                }
                if (this.getHighSpeedVideoSizesFor) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@Path parameters may not be used with @Url.", new java.lang.Object[0]);
                }
                if (this.CoroutineDebuggingKt == null) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@Path can only be used with relative url on @%s", this.getOutputMinFrameDurationlomOqCM);
                }
                this.getHighSpeedVideoFpsRanges = true;
                retrofit2.http.Path path = (retrofit2.http.Path) annotation;
                java.lang.String value = path.value();
                if (!ArtificialStackFrames.matcher(value).matches()) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@Path parameter name must match %s. Found: %s", f7064a.pattern(), value);
                }
                if (this.coroutineBoundary.contains(value)) {
                    return new retrofit2.ParameterHandler.Path(this.getValidOutputFormatsForInputhNQ4ISI, i, value, this.coroutineCreation.stringConverter(type, annotationArr), path.encoded());
                }
                throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "URL \"%s\" does not contain \"{%s}\".", this.CoroutineDebuggingKt, value);
            }
            if (annotation instanceof retrofit2.http.Query) {
                getHighResolutionOutputSizeshNQ4ISI(i, type);
                retrofit2.http.Query query = (retrofit2.http.Query) annotation;
                java.lang.String value2 = query.value();
                boolean encoded = query.encoded();
                java.lang.Class<?> Camera2StreamConfigurationMap = retrofit2.Utils.Camera2StreamConfigurationMap(type);
                this.getOutputMinFrameDuration = true;
                if (java.lang.Iterable.class.isAssignableFrom(Camera2StreamConfigurationMap)) {
                    if (!(type instanceof java.lang.reflect.ParameterizedType)) {
                        java.lang.reflect.Method method = this.getValidOutputFormatsForInputhNQ4ISI;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(Camera2StreamConfigurationMap.getSimpleName());
                        sb.append(" must include generic type (e.g., ");
                        sb.append(Camera2StreamConfigurationMap.getSimpleName());
                        sb.append("<String>)");
                        throw retrofit2.Utils.getHighSpeedVideoSizes(method, i, sb.toString(), new java.lang.Object[0]);
                    }
                    final retrofit2.ParameterHandler.Query query2 = new retrofit2.ParameterHandler.Query(value2, this.coroutineCreation.stringConverter(retrofit2.Utils.Camera2StreamConfigurationMap(0, (java.lang.reflect.ParameterizedType) type), annotationArr), encoded);
                    return new retrofit2.ParameterHandler<java.lang.Iterable<T>>() { // from class: retrofit2.ParameterHandler.1
                        @Override // retrofit2.ParameterHandler
                        final /* synthetic */ void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
                            java.lang.Iterable iterable = (java.lang.Iterable) obj;
                            if (iterable != null) {
                                java.util.Iterator<T> it = iterable.iterator();
                                while (it.hasNext()) {
                                    retrofit2.ParameterHandler.this.Camera2StreamConfigurationMap(requestBuilder, it.next());
                                }
                            }
                        }
                    };
                }
                if (Camera2StreamConfigurationMap.isArray()) {
                    final retrofit2.ParameterHandler.Query query3 = new retrofit2.ParameterHandler.Query(value2, this.coroutineCreation.stringConverter(getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap.getComponentType()), annotationArr), encoded);
                    return new retrofit2.ParameterHandler<java.lang.Object>() { // from class: retrofit2.ParameterHandler.2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // retrofit2.ParameterHandler
                        final void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
                            if (obj != null) {
                                int length = java.lang.reflect.Array.getLength(obj);
                                for (int i2 = 0; i2 < length; i2++) {
                                    retrofit2.ParameterHandler.this.Camera2StreamConfigurationMap(requestBuilder, java.lang.reflect.Array.get(obj, i2));
                                }
                            }
                        }
                    };
                }
                return new retrofit2.ParameterHandler.Query(value2, this.coroutineCreation.stringConverter(type, annotationArr), encoded);
            }
            if (annotation instanceof retrofit2.http.QueryName) {
                getHighResolutionOutputSizeshNQ4ISI(i, type);
                boolean encoded2 = ((retrofit2.http.QueryName) annotation).encoded();
                java.lang.Class<?> Camera2StreamConfigurationMap2 = retrofit2.Utils.Camera2StreamConfigurationMap(type);
                this.getInputFormats = true;
                if (java.lang.Iterable.class.isAssignableFrom(Camera2StreamConfigurationMap2)) {
                    if (!(type instanceof java.lang.reflect.ParameterizedType)) {
                        java.lang.reflect.Method method2 = this.getValidOutputFormatsForInputhNQ4ISI;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(Camera2StreamConfigurationMap2.getSimpleName());
                        sb2.append(" must include generic type (e.g., ");
                        sb2.append(Camera2StreamConfigurationMap2.getSimpleName());
                        sb2.append("<String>)");
                        throw retrofit2.Utils.getHighSpeedVideoSizes(method2, i, sb2.toString(), new java.lang.Object[0]);
                    }
                    final retrofit2.ParameterHandler.QueryName queryName = new retrofit2.ParameterHandler.QueryName(this.coroutineCreation.stringConverter(retrofit2.Utils.Camera2StreamConfigurationMap(0, (java.lang.reflect.ParameterizedType) type), annotationArr), encoded2);
                    return new retrofit2.ParameterHandler<java.lang.Iterable<T>>() { // from class: retrofit2.ParameterHandler.1
                        @Override // retrofit2.ParameterHandler
                        final /* synthetic */ void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
                            java.lang.Iterable iterable = (java.lang.Iterable) obj;
                            if (iterable != null) {
                                java.util.Iterator<T> it = iterable.iterator();
                                while (it.hasNext()) {
                                    retrofit2.ParameterHandler.this.Camera2StreamConfigurationMap(requestBuilder, it.next());
                                }
                            }
                        }
                    };
                }
                if (Camera2StreamConfigurationMap2.isArray()) {
                    final retrofit2.ParameterHandler.QueryName queryName2 = new retrofit2.ParameterHandler.QueryName(this.coroutineCreation.stringConverter(getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap2.getComponentType()), annotationArr), encoded2);
                    return new retrofit2.ParameterHandler<java.lang.Object>() { // from class: retrofit2.ParameterHandler.2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // retrofit2.ParameterHandler
                        final void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
                            if (obj != null) {
                                int length = java.lang.reflect.Array.getLength(obj);
                                for (int i2 = 0; i2 < length; i2++) {
                                    retrofit2.ParameterHandler.this.Camera2StreamConfigurationMap(requestBuilder, java.lang.reflect.Array.get(obj, i2));
                                }
                            }
                        }
                    };
                }
                return new retrofit2.ParameterHandler.QueryName(this.coroutineCreation.stringConverter(type, annotationArr), encoded2);
            }
            if (annotation instanceof retrofit2.http.QueryMap) {
                getHighResolutionOutputSizeshNQ4ISI(i, type);
                java.lang.Class<?> Camera2StreamConfigurationMap3 = retrofit2.Utils.Camera2StreamConfigurationMap(type);
                this.getOutputFormats = true;
                if (!java.util.Map.class.isAssignableFrom(Camera2StreamConfigurationMap3)) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@QueryMap parameter type must be Map.", new java.lang.Object[0]);
                }
                java.lang.reflect.Type highResolutionOutputSizeshNQ4ISI = retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(type, Camera2StreamConfigurationMap3, (java.lang.Class<?>) java.util.Map.class);
                if (!(highResolutionOutputSizeshNQ4ISI instanceof java.lang.reflect.ParameterizedType)) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "Map must include generic types (e.g., Map<String, String>)", new java.lang.Object[0]);
                }
                java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) highResolutionOutputSizeshNQ4ISI;
                java.lang.reflect.Type Camera2StreamConfigurationMap4 = retrofit2.Utils.Camera2StreamConfigurationMap(0, parameterizedType);
                if (java.lang.String.class != Camera2StreamConfigurationMap4) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@QueryMap keys must be of type String: ".concat(java.lang.String.valueOf(Camera2StreamConfigurationMap4)), new java.lang.Object[0]);
                }
                return new retrofit2.ParameterHandler.QueryMap(this.getValidOutputFormatsForInputhNQ4ISI, i, this.coroutineCreation.stringConverter(retrofit2.Utils.Camera2StreamConfigurationMap(1, parameterizedType), annotationArr), ((retrofit2.http.QueryMap) annotation).encoded());
            }
            if (annotation instanceof retrofit2.http.Header) {
                getHighResolutionOutputSizeshNQ4ISI(i, type);
                retrofit2.http.Header header = (retrofit2.http.Header) annotation;
                java.lang.String value3 = header.value();
                java.lang.Class<?> Camera2StreamConfigurationMap5 = retrofit2.Utils.Camera2StreamConfigurationMap(type);
                if (java.lang.Iterable.class.isAssignableFrom(Camera2StreamConfigurationMap5)) {
                    if (!(type instanceof java.lang.reflect.ParameterizedType)) {
                        java.lang.reflect.Method method3 = this.getValidOutputFormatsForInputhNQ4ISI;
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(Camera2StreamConfigurationMap5.getSimpleName());
                        sb3.append(" must include generic type (e.g., ");
                        sb3.append(Camera2StreamConfigurationMap5.getSimpleName());
                        sb3.append("<String>)");
                        throw retrofit2.Utils.getHighSpeedVideoSizes(method3, i, sb3.toString(), new java.lang.Object[0]);
                    }
                    final retrofit2.ParameterHandler.Header header2 = new retrofit2.ParameterHandler.Header(value3, this.coroutineCreation.stringConverter(retrofit2.Utils.Camera2StreamConfigurationMap(0, (java.lang.reflect.ParameterizedType) type), annotationArr), header.allowUnsafeNonAsciiValues());
                    return new retrofit2.ParameterHandler<java.lang.Iterable<T>>() { // from class: retrofit2.ParameterHandler.1
                        @Override // retrofit2.ParameterHandler
                        final /* synthetic */ void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
                            java.lang.Iterable iterable = (java.lang.Iterable) obj;
                            if (iterable != null) {
                                java.util.Iterator<T> it = iterable.iterator();
                                while (it.hasNext()) {
                                    retrofit2.ParameterHandler.this.Camera2StreamConfigurationMap(requestBuilder, it.next());
                                }
                            }
                        }
                    };
                }
                if (Camera2StreamConfigurationMap5.isArray()) {
                    final retrofit2.ParameterHandler.Header header3 = new retrofit2.ParameterHandler.Header(value3, this.coroutineCreation.stringConverter(getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap5.getComponentType()), annotationArr), header.allowUnsafeNonAsciiValues());
                    return new retrofit2.ParameterHandler<java.lang.Object>() { // from class: retrofit2.ParameterHandler.2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // retrofit2.ParameterHandler
                        final void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
                            if (obj != null) {
                                int length = java.lang.reflect.Array.getLength(obj);
                                for (int i2 = 0; i2 < length; i2++) {
                                    retrofit2.ParameterHandler.this.Camera2StreamConfigurationMap(requestBuilder, java.lang.reflect.Array.get(obj, i2));
                                }
                            }
                        }
                    };
                }
                return new retrofit2.ParameterHandler.Header(value3, this.coroutineCreation.stringConverter(type, annotationArr), header.allowUnsafeNonAsciiValues());
            }
            if (annotation instanceof retrofit2.http.HeaderMap) {
                if (type == okhttp3.Headers.class) {
                    return new retrofit2.ParameterHandler.Headers(this.getValidOutputFormatsForInputhNQ4ISI, i);
                }
                getHighResolutionOutputSizeshNQ4ISI(i, type);
                java.lang.Class<?> Camera2StreamConfigurationMap6 = retrofit2.Utils.Camera2StreamConfigurationMap(type);
                if (!java.util.Map.class.isAssignableFrom(Camera2StreamConfigurationMap6)) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@HeaderMap parameter type must be Map or Headers.", new java.lang.Object[0]);
                }
                java.lang.reflect.Type highResolutionOutputSizeshNQ4ISI2 = retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(type, Camera2StreamConfigurationMap6, (java.lang.Class<?>) java.util.Map.class);
                if (!(highResolutionOutputSizeshNQ4ISI2 instanceof java.lang.reflect.ParameterizedType)) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "Map must include generic types (e.g., Map<String, String>)", new java.lang.Object[0]);
                }
                java.lang.reflect.ParameterizedType parameterizedType2 = (java.lang.reflect.ParameterizedType) highResolutionOutputSizeshNQ4ISI2;
                java.lang.reflect.Type Camera2StreamConfigurationMap7 = retrofit2.Utils.Camera2StreamConfigurationMap(0, parameterizedType2);
                if (java.lang.String.class != Camera2StreamConfigurationMap7) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@HeaderMap keys must be of type String: ".concat(java.lang.String.valueOf(Camera2StreamConfigurationMap7)), new java.lang.Object[0]);
                }
                return new retrofit2.ParameterHandler.HeaderMap(this.getValidOutputFormatsForInputhNQ4ISI, i, this.coroutineCreation.stringConverter(retrofit2.Utils.Camera2StreamConfigurationMap(1, parameterizedType2), annotationArr), ((retrofit2.http.HeaderMap) annotation).allowUnsafeNonAsciiValues());
            }
            if (annotation instanceof retrofit2.http.Field) {
                getHighResolutionOutputSizeshNQ4ISI(i, type);
                if (!this.getOutputStallDuration) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@Field parameters can only be used with form encoding.", new java.lang.Object[0]);
                }
                retrofit2.http.Field field = (retrofit2.http.Field) annotation;
                java.lang.String value4 = field.value();
                boolean encoded3 = field.encoded();
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                java.lang.Class<?> Camera2StreamConfigurationMap8 = retrofit2.Utils.Camera2StreamConfigurationMap(type);
                if (java.lang.Iterable.class.isAssignableFrom(Camera2StreamConfigurationMap8)) {
                    if (!(type instanceof java.lang.reflect.ParameterizedType)) {
                        java.lang.reflect.Method method4 = this.getValidOutputFormatsForInputhNQ4ISI;
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append(Camera2StreamConfigurationMap8.getSimpleName());
                        sb4.append(" must include generic type (e.g., ");
                        sb4.append(Camera2StreamConfigurationMap8.getSimpleName());
                        sb4.append("<String>)");
                        throw retrofit2.Utils.getHighSpeedVideoSizes(method4, i, sb4.toString(), new java.lang.Object[0]);
                    }
                    final retrofit2.ParameterHandler.Field field2 = new retrofit2.ParameterHandler.Field(value4, this.coroutineCreation.stringConverter(retrofit2.Utils.Camera2StreamConfigurationMap(0, (java.lang.reflect.ParameterizedType) type), annotationArr), encoded3);
                    return new retrofit2.ParameterHandler<java.lang.Iterable<T>>() { // from class: retrofit2.ParameterHandler.1
                        @Override // retrofit2.ParameterHandler
                        final /* synthetic */ void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
                            java.lang.Iterable iterable = (java.lang.Iterable) obj;
                            if (iterable != null) {
                                java.util.Iterator<T> it = iterable.iterator();
                                while (it.hasNext()) {
                                    retrofit2.ParameterHandler.this.Camera2StreamConfigurationMap(requestBuilder, it.next());
                                }
                            }
                        }
                    };
                }
                if (Camera2StreamConfigurationMap8.isArray()) {
                    final retrofit2.ParameterHandler.Field field3 = new retrofit2.ParameterHandler.Field(value4, this.coroutineCreation.stringConverter(getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap8.getComponentType()), annotationArr), encoded3);
                    return new retrofit2.ParameterHandler<java.lang.Object>() { // from class: retrofit2.ParameterHandler.2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // retrofit2.ParameterHandler
                        final void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
                            if (obj != null) {
                                int length = java.lang.reflect.Array.getLength(obj);
                                for (int i2 = 0; i2 < length; i2++) {
                                    retrofit2.ParameterHandler.this.Camera2StreamConfigurationMap(requestBuilder, java.lang.reflect.Array.get(obj, i2));
                                }
                            }
                        }
                    };
                }
                return new retrofit2.ParameterHandler.Field(value4, this.coroutineCreation.stringConverter(type, annotationArr), encoded3);
            }
            if (annotation instanceof retrofit2.http.FieldMap) {
                getHighResolutionOutputSizeshNQ4ISI(i, type);
                if (!this.getOutputStallDuration) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@FieldMap parameters can only be used with form encoding.", new java.lang.Object[0]);
                }
                java.lang.Class<?> Camera2StreamConfigurationMap9 = retrofit2.Utils.Camera2StreamConfigurationMap(type);
                if (!java.util.Map.class.isAssignableFrom(Camera2StreamConfigurationMap9)) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@FieldMap parameter type must be Map.", new java.lang.Object[0]);
                }
                java.lang.reflect.Type highResolutionOutputSizeshNQ4ISI3 = retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(type, Camera2StreamConfigurationMap9, (java.lang.Class<?>) java.util.Map.class);
                if (!(highResolutionOutputSizeshNQ4ISI3 instanceof java.lang.reflect.ParameterizedType)) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "Map must include generic types (e.g., Map<String, String>)", new java.lang.Object[0]);
                }
                java.lang.reflect.ParameterizedType parameterizedType3 = (java.lang.reflect.ParameterizedType) highResolutionOutputSizeshNQ4ISI3;
                java.lang.reflect.Type Camera2StreamConfigurationMap10 = retrofit2.Utils.Camera2StreamConfigurationMap(0, parameterizedType3);
                if (java.lang.String.class != Camera2StreamConfigurationMap10) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@FieldMap keys must be of type String: ".concat(java.lang.String.valueOf(Camera2StreamConfigurationMap10)), new java.lang.Object[0]);
                }
                retrofit2.Converter stringConverter = this.coroutineCreation.stringConverter(retrofit2.Utils.Camera2StreamConfigurationMap(1, parameterizedType3), annotationArr);
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                return new retrofit2.ParameterHandler.FieldMap(this.getValidOutputFormatsForInputhNQ4ISI, i, stringConverter, ((retrofit2.http.FieldMap) annotation).encoded());
            }
            if (annotation instanceof retrofit2.http.Part) {
                getHighResolutionOutputSizeshNQ4ISI(i, type);
                if (!this.getOutputSizes) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@Part parameters can only be used with multipart encoding.", new java.lang.Object[0]);
                }
                retrofit2.http.Part part = (retrofit2.http.Part) annotation;
                this.getHighSpeedVideoFpsRangesFor = true;
                java.lang.String value5 = part.value();
                java.lang.Class<?> Camera2StreamConfigurationMap11 = retrofit2.Utils.Camera2StreamConfigurationMap(type);
                if (value5.isEmpty()) {
                    if (java.lang.Iterable.class.isAssignableFrom(Camera2StreamConfigurationMap11)) {
                        if (!(type instanceof java.lang.reflect.ParameterizedType)) {
                            java.lang.reflect.Method method5 = this.getValidOutputFormatsForInputhNQ4ISI;
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                            sb5.append(Camera2StreamConfigurationMap11.getSimpleName());
                            sb5.append(" must include generic type (e.g., ");
                            sb5.append(Camera2StreamConfigurationMap11.getSimpleName());
                            sb5.append("<String>)");
                            throw retrofit2.Utils.getHighSpeedVideoSizes(method5, i, sb5.toString(), new java.lang.Object[0]);
                        }
                        if (!okhttp3.MultipartBody.Part.class.isAssignableFrom(retrofit2.Utils.Camera2StreamConfigurationMap(retrofit2.Utils.Camera2StreamConfigurationMap(0, (java.lang.reflect.ParameterizedType) type)))) {
                            throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new java.lang.Object[0]);
                        }
                        final retrofit2.ParameterHandler.RawPart rawPart = retrofit2.ParameterHandler.RawPart.getHighResolutionOutputSizeshNQ4ISI;
                        return new retrofit2.ParameterHandler<java.lang.Iterable<T>>() { // from class: retrofit2.ParameterHandler.1
                            @Override // retrofit2.ParameterHandler
                            final /* synthetic */ void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
                                java.lang.Iterable iterable = (java.lang.Iterable) obj;
                                if (iterable != null) {
                                    java.util.Iterator<T> it = iterable.iterator();
                                    while (it.hasNext()) {
                                        retrofit2.ParameterHandler.this.Camera2StreamConfigurationMap(requestBuilder, it.next());
                                    }
                                }
                            }
                        };
                    }
                    if (Camera2StreamConfigurationMap11.isArray()) {
                        if (!okhttp3.MultipartBody.Part.class.isAssignableFrom(Camera2StreamConfigurationMap11.getComponentType())) {
                            throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new java.lang.Object[0]);
                        }
                        final retrofit2.ParameterHandler.RawPart rawPart2 = retrofit2.ParameterHandler.RawPart.getHighResolutionOutputSizeshNQ4ISI;
                        return new retrofit2.ParameterHandler<java.lang.Object>() { // from class: retrofit2.ParameterHandler.2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // retrofit2.ParameterHandler
                            final void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
                                if (obj != null) {
                                    int length = java.lang.reflect.Array.getLength(obj);
                                    for (int i2 = 0; i2 < length; i2++) {
                                        retrofit2.ParameterHandler.this.Camera2StreamConfigurationMap(requestBuilder, java.lang.reflect.Array.get(obj, i2));
                                    }
                                }
                            }
                        };
                    }
                    if (okhttp3.MultipartBody.Part.class.isAssignableFrom(Camera2StreamConfigurationMap11)) {
                        return retrofit2.ParameterHandler.RawPart.getHighResolutionOutputSizeshNQ4ISI;
                    }
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new java.lang.Object[0]);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("form-data; name=\"");
                sb6.append(value5);
                sb6.append("\"");
                okhttp3.Headers of = okhttp3.Headers.of("Content-Disposition", sb6.toString(), "Content-Transfer-Encoding", part.encoding());
                if (java.lang.Iterable.class.isAssignableFrom(Camera2StreamConfigurationMap11)) {
                    if (!(type instanceof java.lang.reflect.ParameterizedType)) {
                        java.lang.reflect.Method method6 = this.getValidOutputFormatsForInputhNQ4ISI;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(Camera2StreamConfigurationMap11.getSimpleName());
                        sb7.append(" must include generic type (e.g., ");
                        sb7.append(Camera2StreamConfigurationMap11.getSimpleName());
                        sb7.append("<String>)");
                        throw retrofit2.Utils.getHighSpeedVideoSizes(method6, i, sb7.toString(), new java.lang.Object[0]);
                    }
                    java.lang.reflect.Type Camera2StreamConfigurationMap12 = retrofit2.Utils.Camera2StreamConfigurationMap(0, (java.lang.reflect.ParameterizedType) type);
                    if (okhttp3.MultipartBody.Part.class.isAssignableFrom(retrofit2.Utils.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap12))) {
                        throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new java.lang.Object[0]);
                    }
                    final retrofit2.ParameterHandler.Part part2 = new retrofit2.ParameterHandler.Part(this.getValidOutputFormatsForInputhNQ4ISI, i, of, this.coroutineCreation.requestBodyConverter(Camera2StreamConfigurationMap12, annotationArr, this.isOutputSupportedFor));
                    return new retrofit2.ParameterHandler<java.lang.Iterable<T>>() { // from class: retrofit2.ParameterHandler.1
                        @Override // retrofit2.ParameterHandler
                        final /* synthetic */ void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
                            java.lang.Iterable iterable = (java.lang.Iterable) obj;
                            if (iterable != null) {
                                java.util.Iterator<T> it = iterable.iterator();
                                while (it.hasNext()) {
                                    retrofit2.ParameterHandler.this.Camera2StreamConfigurationMap(requestBuilder, it.next());
                                }
                            }
                        }
                    };
                }
                if (Camera2StreamConfigurationMap11.isArray()) {
                    java.lang.Class<?> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap11.getComponentType());
                    if (okhttp3.MultipartBody.Part.class.isAssignableFrom(highSpeedVideoFpsRanges)) {
                        throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new java.lang.Object[0]);
                    }
                    final retrofit2.ParameterHandler.Part part3 = new retrofit2.ParameterHandler.Part(this.getValidOutputFormatsForInputhNQ4ISI, i, of, this.coroutineCreation.requestBodyConverter(highSpeedVideoFpsRanges, annotationArr, this.isOutputSupportedFor));
                    return new retrofit2.ParameterHandler<java.lang.Object>() { // from class: retrofit2.ParameterHandler.2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // retrofit2.ParameterHandler
                        final void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
                            if (obj != null) {
                                int length = java.lang.reflect.Array.getLength(obj);
                                for (int i2 = 0; i2 < length; i2++) {
                                    retrofit2.ParameterHandler.this.Camera2StreamConfigurationMap(requestBuilder, java.lang.reflect.Array.get(obj, i2));
                                }
                            }
                        }
                    };
                }
                if (okhttp3.MultipartBody.Part.class.isAssignableFrom(Camera2StreamConfigurationMap11)) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new java.lang.Object[0]);
                }
                return new retrofit2.ParameterHandler.Part(this.getValidOutputFormatsForInputhNQ4ISI, i, of, this.coroutineCreation.requestBodyConverter(type, annotationArr, this.isOutputSupportedFor));
            }
            if (annotation instanceof retrofit2.http.PartMap) {
                getHighResolutionOutputSizeshNQ4ISI(i, type);
                if (!this.getOutputSizes) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@PartMap parameters can only be used with multipart encoding.", new java.lang.Object[0]);
                }
                this.getHighSpeedVideoFpsRangesFor = true;
                java.lang.Class<?> Camera2StreamConfigurationMap13 = retrofit2.Utils.Camera2StreamConfigurationMap(type);
                if (!java.util.Map.class.isAssignableFrom(Camera2StreamConfigurationMap13)) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@PartMap parameter type must be Map.", new java.lang.Object[0]);
                }
                java.lang.reflect.Type highResolutionOutputSizeshNQ4ISI4 = retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(type, Camera2StreamConfigurationMap13, (java.lang.Class<?>) java.util.Map.class);
                if (!(highResolutionOutputSizeshNQ4ISI4 instanceof java.lang.reflect.ParameterizedType)) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "Map must include generic types (e.g., Map<String, String>)", new java.lang.Object[0]);
                }
                java.lang.reflect.ParameterizedType parameterizedType4 = (java.lang.reflect.ParameterizedType) highResolutionOutputSizeshNQ4ISI4;
                java.lang.reflect.Type Camera2StreamConfigurationMap14 = retrofit2.Utils.Camera2StreamConfigurationMap(0, parameterizedType4);
                if (java.lang.String.class != Camera2StreamConfigurationMap14) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@PartMap keys must be of type String: ".concat(java.lang.String.valueOf(Camera2StreamConfigurationMap14)), new java.lang.Object[0]);
                }
                java.lang.reflect.Type Camera2StreamConfigurationMap15 = retrofit2.Utils.Camera2StreamConfigurationMap(1, parameterizedType4);
                if (okhttp3.MultipartBody.Part.class.isAssignableFrom(retrofit2.Utils.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap15))) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new java.lang.Object[0]);
                }
                return new retrofit2.ParameterHandler.PartMap(this.getValidOutputFormatsForInputhNQ4ISI, i, this.coroutineCreation.requestBodyConverter(Camera2StreamConfigurationMap15, annotationArr, this.isOutputSupportedFor), ((retrofit2.http.PartMap) annotation).encoding());
            }
            if (annotation instanceof retrofit2.http.Body) {
                getHighResolutionOutputSizeshNQ4ISI(i, type);
                if (this.getOutputStallDuration || this.getOutputSizes) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "@Body parameters cannot be used with form or multi-part encoding.", new java.lang.Object[0]);
                }
                if (this.Camera2StreamConfigurationMap) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "Multiple @Body method annotations found.", new java.lang.Object[0]);
                }
                try {
                    retrofit2.Converter requestBodyConverter = this.coroutineCreation.requestBodyConverter(type, annotationArr, this.isOutputSupportedFor);
                    this.Camera2StreamConfigurationMap = true;
                    return new retrofit2.ParameterHandler.Body(this.getValidOutputFormatsForInputhNQ4ISI, i, requestBodyConverter);
                } catch (java.lang.RuntimeException e) {
                    throw retrofit2.Utils.getHighSpeedVideoFpsRanges(this.getValidOutputFormatsForInputhNQ4ISI, e, i, "Unable to create @Body converter for %s", type);
                }
            }
            if (!(annotation instanceof retrofit2.http.Tag)) {
                return null;
            }
            getHighResolutionOutputSizeshNQ4ISI(i, type);
            java.lang.Class<?> highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(retrofit2.Utils.Camera2StreamConfigurationMap(type));
            for (int i2 = i - 1; i2 >= 0; i2--) {
                retrofit2.ParameterHandler<?> parameterHandler = this.toString[i2];
                if ((parameterHandler instanceof retrofit2.ParameterHandler.Tag) && ((retrofit2.ParameterHandler.Tag) parameterHandler).Camera2StreamConfigurationMap.equals(highSpeedVideoFpsRanges2)) {
                    java.lang.reflect.Method method7 = this.getValidOutputFormatsForInputhNQ4ISI;
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("@Tag type ");
                    sb8.append(highSpeedVideoFpsRanges2.getName());
                    sb8.append(" is duplicate of ");
                    sb8.append(retrofit2.Platform.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(this.getValidOutputFormatsForInputhNQ4ISI, i2));
                    sb8.append(" and would always overwrite its value.");
                    throw retrofit2.Utils.getHighSpeedVideoSizes(method7, i, sb8.toString(), new java.lang.Object[0]);
                }
            }
            return new retrofit2.ParameterHandler.Tag(highSpeedVideoFpsRanges2);
        }

        private void getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.reflect.Type type) {
            if (retrofit2.Utils.getHighSpeedVideoFpsRangesFor(type)) {
                throw retrofit2.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        private static java.util.Set<java.lang.String> Camera2StreamConfigurationMap(java.lang.String str) {
            java.util.regex.Matcher matcher = f7064a.matcher(str);
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private static java.lang.Class<?> getHighSpeedVideoFpsRanges(java.lang.Class<?> cls) {
            return java.lang.Boolean.TYPE == cls ? java.lang.Boolean.class : java.lang.Byte.TYPE == cls ? java.lang.Byte.class : java.lang.Character.TYPE == cls ? java.lang.Character.class : java.lang.Double.TYPE == cls ? java.lang.Double.class : java.lang.Float.TYPE == cls ? java.lang.Float.class : java.lang.Integer.TYPE == cls ? java.lang.Integer.class : java.lang.Long.TYPE == cls ? java.lang.Long.class : java.lang.Short.TYPE == cls ? java.lang.Short.class : cls;
        }
    }
}
