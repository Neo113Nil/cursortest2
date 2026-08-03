package com.vungle.ads.internal.network;

/* compiled from: OkHttpCall.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u0018*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003\u0018\u0019\u001aB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u0010\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/vungle/ads/internal/network/OkHttpCall;", "T", "Lcom/vungle/ads/internal/network/Call;", "rawCall", "Lokhttp3/Call;", "responseConverter", "Lcom/vungle/ads/internal/network/converters/Converter;", "Lokhttp3/ResponseBody;", "(Lokhttp3/Call;Lcom/vungle/ads/internal/network/converters/Converter;)V", "canceled", "", "buffer", "body", "cancel", "", "enqueue", "callback", "Lcom/vungle/ads/internal/network/Callback;", "execute", "Lcom/vungle/ads/internal/network/Response;", "isCanceled", "parseResponse", "rawResp", "Lokhttp3/Response;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ExceptionCatchingResponseBody", "NoContentResponseBody", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class OkHttpCall<T> implements com.vungle.ads.internal.network.Call<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.internal.network.OkHttpCall.Companion INSTANCE = new com.vungle.ads.internal.network.OkHttpCall.Companion(null);
    private static final java.lang.String TAG = "OkHttpCall";
    private volatile boolean canceled;
    private final okhttp3.Call rawCall;
    private final com.vungle.ads.internal.network.converters.Converter<okhttp3.ResponseBody, T> responseConverter;

    public OkHttpCall(okhttp3.Call rawCall, com.vungle.ads.internal.network.converters.Converter<okhttp3.ResponseBody, T> responseConverter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawCall, "rawCall");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseConverter, "responseConverter");
        this.rawCall = rawCall;
        this.responseConverter = responseConverter;
    }

    @Override // com.vungle.ads.internal.network.Call
    public void enqueue(final com.vungle.ads.internal.network.Callback<T> callback) {
        okhttp3.Call call;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        java.util.Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            call = this.rawCall;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (this.canceled) {
            call.cancel();
        }
        call.enqueue(new okhttp3.Callback(this) { // from class: com.vungle.ads.internal.network.OkHttpCall$enqueue$2
            final /* synthetic */ com.vungle.ads.internal.network.OkHttpCall<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call2, okhttp3.Response response) {
                com.vungle.ads.internal.network.Response parseResponse;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call2, "call");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
                try {
                    parseResponse = this.this$0.parseResponse(response);
                    try {
                        callback.onResponse(this.this$0, parseResponse);
                    } catch (java.lang.Throwable th) {
                        com.vungle.ads.internal.network.OkHttpCall.INSTANCE.throwIfFatal(th);
                        com.vungle.ads.internal.util.Logger.INSTANCE.e("OkHttpCall", "Cannot pass response to callback", th);
                    }
                } catch (java.lang.Throwable th2) {
                    com.vungle.ads.internal.util.Logger.INSTANCE.e("OkHttpCall", "[enqueue] Failed to parse response: " + th2.getLocalizedMessage());
                    com.vungle.ads.internal.network.OkHttpCall.INSTANCE.throwIfFatal(th2);
                    callFailure(th2);
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call2, java.io.IOException e) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call2, "call");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
                callFailure(e);
            }

            private final void callFailure(java.lang.Throwable e) {
                try {
                    callback.onFailure(this.this$0, e);
                } catch (java.lang.Throwable th) {
                    com.vungle.ads.internal.network.OkHttpCall.INSTANCE.throwIfFatal(th);
                    com.vungle.ads.internal.util.Logger.INSTANCE.e("OkHttpCall", "Cannot pass failure to callback", th);
                }
            }
        });
    }

    @Override // com.vungle.ads.internal.network.Call
    public com.vungle.ads.internal.network.Response<T> execute() {
        okhttp3.Call call;
        java.lang.Object m10798constructorimpl;
        synchronized (this) {
            call = this.rawCall;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (this.canceled) {
            call.cancel();
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.network.OkHttpCall<T> okHttpCall = this;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(parseResponse(call.execute()));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl != null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "[execute] Failed to parse response:  " + m10801exceptionOrNullimpl.getLocalizedMessage());
        }
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            m10798constructorimpl = null;
        }
        return (com.vungle.ads.internal.network.Response) m10798constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.network.Response<T> parseResponse(okhttp3.Response rawResp) throws java.io.IOException {
        okhttp3.ResponseBody body = rawResp.body();
        if (body == null) {
            return null;
        }
        okhttp3.Response build = rawResp.newBuilder().body(new com.vungle.ads.internal.network.OkHttpCall.NoContentResponseBody(body.getContentType(), body.getContentLength())).build();
        int code = build.code();
        if (code >= 200 && code < 300) {
            if (code == 204 || code == 205) {
                body.close();
                return com.vungle.ads.internal.network.Response.INSTANCE.success(null, build);
            }
            com.vungle.ads.internal.network.OkHttpCall.ExceptionCatchingResponseBody exceptionCatchingResponseBody = new com.vungle.ads.internal.network.OkHttpCall.ExceptionCatchingResponseBody(body);
            try {
                return com.vungle.ads.internal.network.Response.INSTANCE.success(this.responseConverter.convert(exceptionCatchingResponseBody), build);
            } catch (java.lang.Throwable th) {
                exceptionCatchingResponseBody.throwIfCaught();
                throw th;
            }
        }
        okhttp3.ResponseBody responseBody = body;
        try {
            com.vungle.ads.internal.network.Response<T> error = com.vungle.ads.internal.network.Response.INSTANCE.error(buffer(responseBody), build);
            kotlin.io.CloseableKt.closeFinally(responseBody, null);
            return error;
        } finally {
        }
    }

    private final okhttp3.ResponseBody buffer(okhttp3.ResponseBody body) throws java.io.IOException {
        okio.Buffer buffer = new okio.Buffer();
        body.getDelegateSource().readAll(buffer);
        return okhttp3.ResponseBody.INSTANCE.create(buffer, body.getContentType(), body.getContentLength());
    }

    @Override // com.vungle.ads.internal.network.Call
    public void cancel() {
        okhttp3.Call call;
        this.canceled = true;
        synchronized (this) {
            call = this.rawCall;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        call.cancel();
    }

    @Override // com.vungle.ads.internal.network.Call
    public boolean isCanceled() {
        boolean canceled;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            canceled = this.rawCall.getCanceled();
        }
        return canceled;
    }

    /* compiled from: OkHttpCall.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/network/OkHttpCall$NoContentResponseBody;", "Lokhttp3/ResponseBody;", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "Lokhttp3/MediaType;", "contentLength", "", "(Lokhttp3/MediaType;J)V", "source", "Lokio/BufferedSource;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class NoContentResponseBody extends okhttp3.ResponseBody {
        private final long contentLength;
        private final okhttp3.MediaType contentType;

        public NoContentResponseBody(okhttp3.MediaType mediaType, long j) {
            this.contentType = mediaType;
            this.contentLength = j;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType, reason: from getter */
        public okhttp3.MediaType getContentType() {
            return this.contentType;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength, reason: from getter */
        public long getContentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source */
        public okio.BufferedSource getDelegateSource() {
            throw new java.lang.IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* compiled from: OkHttpCall.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\u0006\u0010\u0013\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/network/OkHttpCall$ExceptionCatchingResponseBody;", "Lokhttp3/ResponseBody;", "delegate", "(Lokhttp3/ResponseBody;)V", "delegateSource", "Lokio/BufferedSource;", "thrownException", "Ljava/io/IOException;", "getThrownException", "()Ljava/io/IOException;", "setThrownException", "(Ljava/io/IOException;)V", "close", "", "contentLength", "", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "Lokhttp3/MediaType;", "source", "throwIfCaught", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ExceptionCatchingResponseBody extends okhttp3.ResponseBody {
        private final okhttp3.ResponseBody delegate;
        private final okio.BufferedSource delegateSource;
        private java.io.IOException thrownException;

        public ExceptionCatchingResponseBody(okhttp3.ResponseBody delegate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.delegate = delegate;
            this.delegateSource = okio.Okio.buffer(new okio.ForwardingSource(delegate.getDelegateSource()) { // from class: com.vungle.ads.internal.network.OkHttpCall.ExceptionCatchingResponseBody.1
                {
                    super(r2);
                }

                @Override // okio.ForwardingSource, okio.Source
                public long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
                    try {
                        return super.read(sink, byteCount);
                    } catch (java.io.IOException e) {
                        com.vungle.ads.internal.network.OkHttpCall.ExceptionCatchingResponseBody.this.setThrownException(e);
                        throw e;
                    }
                }
            });
        }

        public final java.io.IOException getThrownException() {
            return this.thrownException;
        }

        public final void setThrownException(java.io.IOException iOException) {
            this.thrownException = iOException;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public okhttp3.MediaType getContentType() {
            return this.delegate.getContentType();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public long getContentLength() {
            return this.delegate.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source, reason: from getter */
        public okio.BufferedSource getDelegateSource() {
            return this.delegateSource;
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        public final void throwIfCaught() throws java.io.IOException {
            java.io.IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* compiled from: OkHttpCall.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/network/OkHttpCall$Companion;", "", "()V", "TAG", "", "throwIfFatal", "", "t", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void throwIfFatal(java.lang.Throwable t) {
            if (t instanceof java.lang.ThreadDeath) {
                throw t;
            }
            if (t instanceof java.lang.LinkageError) {
                throw t;
            }
        }
    }
}
