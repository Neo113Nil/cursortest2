package retrofit2;

/* loaded from: classes5.dex */
final class OkHttpCall<T> implements retrofit2.Call<T> {
    private final okhttp3.Call.Factory Camera2StreamConfigurationMap;

    @javax.annotation.Nullable
    private java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Object[] getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private volatile boolean getHighSpeedVideoSizes;
    private final java.lang.Object getInputFormats;
    private final retrofit2.RequestFactory getInputSizeshNQ4ISI;

    @javax.annotation.Nullable
    private okhttp3.Call getOutputFormats;
    private final retrofit2.Converter<okhttp3.ResponseBody, T> getOutputMinFrameDuration;

    OkHttpCall(retrofit2.RequestFactory requestFactory, java.lang.Object obj, java.lang.Object[] objArr, okhttp3.Call.Factory factory, retrofit2.Converter<okhttp3.ResponseBody, T> converter) {
        this.getInputSizeshNQ4ISI = requestFactory;
        this.getInputFormats = obj;
        this.getHighSpeedVideoFpsRanges = objArr;
        this.Camera2StreamConfigurationMap = factory;
        this.getOutputMinFrameDuration = converter;
    }

    @Override // retrofit2.Call
    public final okhttp3.Request request() {
        okhttp3.Request getHighSpeedVideoSizes;
        synchronized (this) {
            try {
                getHighSpeedVideoSizes = Camera2StreamConfigurationMap().getGetHighSpeedVideoSizes();
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException("Unable to create request.", e);
            }
        }
        return getHighSpeedVideoSizes;
    }

    @Override // retrofit2.Call
    public final okio.Timeout timeout() {
        okio.Timeout timeout;
        synchronized (this) {
            try {
                timeout = Camera2StreamConfigurationMap().timeout();
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException("Unable to create call.", e);
            }
        }
        return timeout;
    }

    private okhttp3.Call Camera2StreamConfigurationMap() throws java.io.IOException {
        okhttp3.Call call = this.getOutputFormats;
        if (call != null) {
            return call;
        }
        java.lang.Throwable th = this.getHighResolutionOutputSizeshNQ4ISI;
        if (th != null) {
            if (th instanceof java.io.IOException) {
                throw ((java.io.IOException) th);
            }
            if (th instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) th);
            }
            throw ((java.lang.Error) th);
        }
        try {
            okhttp3.Call highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            this.getOutputFormats = highSpeedVideoFpsRanges;
            return highSpeedVideoFpsRanges;
        } catch (java.io.IOException | java.lang.Error | java.lang.RuntimeException e) {
            retrofit2.Utils.getHighSpeedVideoFpsRangesFor(e);
            this.getHighResolutionOutputSizeshNQ4ISI = e;
            throw e;
        }
    }

    @Override // retrofit2.Call
    public final void enqueue(final retrofit2.Callback<T> callback) {
        okhttp3.Call call;
        java.lang.Throwable th;
        java.util.Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                throw new java.lang.IllegalStateException("Already executed.");
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            call = this.getOutputFormats;
            th = this.getHighResolutionOutputSizeshNQ4ISI;
            if (call == null && th == null) {
                try {
                    okhttp3.Call highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
                    this.getOutputFormats = highSpeedVideoFpsRanges;
                    call = highSpeedVideoFpsRanges;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    retrofit2.Utils.getHighSpeedVideoFpsRangesFor(th);
                    this.getHighResolutionOutputSizeshNQ4ISI = th;
                }
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.getHighSpeedVideoSizes) {
            call.cancel();
        }
        call.enqueue(new okhttp3.Callback() { // from class: retrofit2.OkHttpCall.1
            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call2, okhttp3.Response response) {
                try {
                    try {
                        callback.onResponse(retrofit2.OkHttpCall.this, retrofit2.OkHttpCall.this.Camera2StreamConfigurationMap(response));
                    } catch (java.lang.Throwable th3) {
                        retrofit2.Utils.getHighSpeedVideoFpsRangesFor(th3);
                        th3.printStackTrace();
                    }
                } catch (java.lang.Throwable th4) {
                    retrofit2.Utils.getHighSpeedVideoFpsRangesFor(th4);
                    try {
                        callback.onFailure(retrofit2.OkHttpCall.this, th4);
                    } catch (java.lang.Throwable th5) {
                        retrofit2.Utils.getHighSpeedVideoFpsRangesFor(th5);
                        th5.printStackTrace();
                    }
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call2, java.io.IOException iOException) {
                try {
                    callback.onFailure(retrofit2.OkHttpCall.this, iOException);
                } catch (java.lang.Throwable th3) {
                    retrofit2.Utils.getHighSpeedVideoFpsRangesFor(th3);
                    th3.printStackTrace();
                }
            }
        });
    }

    @Override // retrofit2.Call
    public final boolean isExecuted() {
        boolean z;
        synchronized (this) {
            z = this.getHighSpeedVideoFpsRangesFor;
        }
        return z;
    }

    @Override // retrofit2.Call
    public final retrofit2.Response<T> execute() throws java.io.IOException {
        okhttp3.Call Camera2StreamConfigurationMap;
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                throw new java.lang.IllegalStateException("Already executed.");
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        }
        if (this.getHighSpeedVideoSizes) {
            Camera2StreamConfigurationMap.cancel();
        }
        return Camera2StreamConfigurationMap(Camera2StreamConfigurationMap.execute());
    }

    private okhttp3.Call getHighSpeedVideoFpsRanges() throws java.io.IOException {
        okhttp3.HttpUrl resolve;
        okhttp3.Call.Factory factory = this.Camera2StreamConfigurationMap;
        retrofit2.RequestFactory requestFactory = this.getInputSizeshNQ4ISI;
        java.lang.Object obj = this.getInputFormats;
        java.lang.Object[] objArr = this.getHighSpeedVideoFpsRanges;
        retrofit2.ParameterHandler<?>[] parameterHandlerArr = requestFactory.getOutputFormats;
        int length = objArr.length;
        if (length != parameterHandlerArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Argument count (");
            sb.append(length);
            sb.append(") doesn't match expected count (");
            sb.append(parameterHandlerArr.length);
            sb.append(")");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        retrofit2.RequestBuilder requestBuilder = new retrofit2.RequestBuilder(requestFactory.getHighSpeedVideoSizes, requestFactory.getHighSpeedVideoFpsRanges, requestFactory.getOutputSizes, requestFactory.Camera2StreamConfigurationMap, requestFactory.getHighSpeedVideoFpsRangesFor, requestFactory.getHighResolutionOutputSizeshNQ4ISI, requestFactory.getOutputMinFrameDuration, requestFactory.getInputSizeshNQ4ISI);
        if (requestFactory.getInputFormats) {
            length--;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            parameterHandlerArr[i].Camera2StreamConfigurationMap(requestBuilder, objArr[i]);
        }
        okhttp3.HttpUrl.Builder builder = requestBuilder.getOutputStallDuration;
        if (builder != null) {
            resolve = builder.build();
        } else {
            resolve = requestBuilder.getHighSpeedVideoFpsRangesFor.resolve(requestBuilder.getInputSizeshNQ4ISI);
            if (resolve == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Malformed URL. Base: ");
                sb2.append(requestBuilder.getHighSpeedVideoFpsRangesFor);
                sb2.append(", Relative: ");
                sb2.append(requestBuilder.getInputSizeshNQ4ISI);
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
        }
        okhttp3.RequestBody requestBody = requestBuilder.getHighResolutionOutputSizeshNQ4ISI;
        if (requestBody == null) {
            okhttp3.FormBody.Builder builder2 = requestBuilder.Camera2StreamConfigurationMap;
            if (builder2 != null) {
                requestBody = builder2.build();
            } else {
                okhttp3.MultipartBody.Builder builder3 = requestBuilder.getOutputFormats;
                if (builder3 != null) {
                    requestBody = builder3.build();
                } else if (requestBuilder.getOutputMinFrameDuration) {
                    requestBody = okhttp3.RequestBody.create((okhttp3.MediaType) null, new byte[0]);
                }
            }
        }
        okhttp3.MediaType mediaType = requestBuilder.getHighSpeedVideoFpsRanges;
        if (mediaType != null) {
            if (requestBody != null) {
                requestBody = new retrofit2.RequestBuilder.ContentTypeOverridingRequestBody(requestBody, mediaType);
            } else {
                requestBuilder.getHighSpeedVideoSizesFor.add("Content-Type", mediaType.toString());
            }
        }
        okhttp3.Call newCall = factory.newCall(requestBuilder.getOutputMinFrameDurationlomOqCM.url(resolve).headers(requestBuilder.getHighSpeedVideoSizesFor.build()).method(requestBuilder.getInputFormats, requestBody).tag((java.lang.Class<? super java.lang.Class<? super T>>) retrofit2.Invocation.class, (java.lang.Class<? super T>) new retrofit2.Invocation(requestFactory.getOutputSizeshNQ4ISI, obj, requestFactory.getHighSpeedVideoSizesFor, arrayList)).build());
        if (newCall != null) {
            return newCall;
        }
        throw new java.lang.NullPointerException("Call.Factory returned null.");
    }

    final retrofit2.Response<T> Camera2StreamConfigurationMap(okhttp3.Response response) throws java.io.IOException {
        okhttp3.ResponseBody body = response.body();
        okhttp3.Response build = response.newBuilder().body(new retrofit2.OkHttpCall.NoContentResponseBody(body.getGetHighSpeedVideoFpsRangesFor(), body.getGetHighSpeedVideoFpsRanges())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                return retrofit2.Response.error(retrofit2.Utils.getHighSpeedVideoFpsRangesFor(body), build);
            } finally {
                body.close();
            }
        }
        if (code == 204 || code == 205) {
            body.close();
            return retrofit2.Response.success((java.lang.Object) null, build);
        }
        retrofit2.OkHttpCall.ExceptionCatchingResponseBody exceptionCatchingResponseBody = new retrofit2.OkHttpCall.ExceptionCatchingResponseBody(body);
        try {
            return retrofit2.Response.success(this.getOutputMinFrameDuration.convert(exceptionCatchingResponseBody), build);
        } catch (java.lang.RuntimeException e) {
            java.io.IOException iOException = exceptionCatchingResponseBody.Camera2StreamConfigurationMap;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // retrofit2.Call
    public final void cancel() {
        okhttp3.Call call;
        this.getHighSpeedVideoSizes = true;
        synchronized (this) {
            call = this.getOutputFormats;
        }
        if (call != null) {
            call.cancel();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000f, code lost:
    
        if (r0.isCanceled() != false) goto L12;
     */
    @Override // retrofit2.Call
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isCanceled() {
        boolean z = true;
        if (this.getHighSpeedVideoSizes) {
            return true;
        }
        synchronized (this) {
            okhttp3.Call call = this.getOutputFormats;
            if (call != null) {
            }
            z = false;
        }
        return z;
    }

    static final class NoContentResponseBody extends okhttp3.ResponseBody {
        private final long getHighSpeedVideoFpsRangesFor;

        @javax.annotation.Nullable
        private final okhttp3.MediaType getHighSpeedVideoSizes;

        NoContentResponseBody(@javax.annotation.Nullable okhttp3.MediaType mediaType, long j) {
            this.getHighSpeedVideoSizes = mediaType;
            this.getHighSpeedVideoFpsRangesFor = j;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public final okhttp3.MediaType getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public final long getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source */
        public final okio.BufferedSource getGetHighResolutionOutputSizeshNQ4ISI() {
            throw new java.lang.IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    static final class ExceptionCatchingResponseBody extends okhttp3.ResponseBody {

        @javax.annotation.Nullable
        java.io.IOException Camera2StreamConfigurationMap;
        private final okhttp3.ResponseBody getHighResolutionOutputSizeshNQ4ISI;
        private final okio.BufferedSource getHighSpeedVideoFpsRanges;

        ExceptionCatchingResponseBody(okhttp3.ResponseBody responseBody) {
            this.getHighResolutionOutputSizeshNQ4ISI = responseBody;
            this.getHighSpeedVideoFpsRanges = okio.Okio.buffer(new okio.ForwardingSource(responseBody.getGetHighResolutionOutputSizeshNQ4ISI()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // okio.ForwardingSource, okio.Source
                public long read(okio.Buffer buffer, long j) throws java.io.IOException {
                    try {
                        return super.read(buffer, j);
                    } catch (java.io.IOException e) {
                        retrofit2.OkHttpCall.ExceptionCatchingResponseBody.this.Camera2StreamConfigurationMap = e;
                        throw e;
                    }
                }
            });
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public final okhttp3.MediaType getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getGetHighSpeedVideoFpsRangesFor();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public final long getGetHighSpeedVideoFpsRanges() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getGetHighSpeedVideoFpsRanges();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source */
        public final okio.BufferedSource getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.getHighResolutionOutputSizeshNQ4ISI.close();
        }
    }

    public final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return new retrofit2.OkHttpCall(this.getInputSizeshNQ4ISI, this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration);
    }

    @Override // retrofit2.Call
    public final /* synthetic */ retrofit2.Call clone() {
        return new retrofit2.OkHttpCall(this.getInputSizeshNQ4ISI, this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration);
    }
}
