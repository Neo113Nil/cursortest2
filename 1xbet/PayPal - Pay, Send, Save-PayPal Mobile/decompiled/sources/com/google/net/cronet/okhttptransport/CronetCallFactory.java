package com.google.net.cronet.okhttptransport;

/* loaded from: classes9.dex */
public final class CronetCallFactory implements okhttp3.Call.Factory {
    private final int callTimeoutMillis;
    private final com.google.net.cronet.okhttptransport.RequestResponseConverter converter;
    private final int readTimeoutMillis;
    private final java.util.concurrent.ExecutorService responseCallbackExecutor;
    private final int writeTimeoutMillis;

    private CronetCallFactory(com.google.net.cronet.okhttptransport.RequestResponseConverter requestResponseConverter, java.util.concurrent.ExecutorService executorService, int i, int i2, int i3) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "Read timeout mustn't be negative!");
        com.google.common.base.Preconditions.checkArgument(i2 >= 0, "Write timeout mustn't be negative!");
        com.google.common.base.Preconditions.checkArgument(i3 >= 0, "Call timeout mustn't be negative!");
        this.converter = requestResponseConverter;
        this.responseCallbackExecutor = executorService;
        this.readTimeoutMillis = i;
        this.writeTimeoutMillis = i2;
        this.callTimeoutMillis = i3;
    }

    public static com.google.net.cronet.okhttptransport.CronetCallFactory.Builder newBuilder(org.chromium.net.CronetEngine cronetEngine) {
        return new com.google.net.cronet.okhttptransport.CronetCallFactory.Builder(cronetEngine);
    }

    @Override // okhttp3.Call.Factory
    public final okhttp3.Call newCall(okhttp3.Request request) {
        return new com.google.net.cronet.okhttptransport.CronetCallFactory.CronetCall(request, this, this.converter, this.responseCallbackExecutor, null);
    }

    static class CronetCall implements okhttp3.Call {
        private final java.util.concurrent.atomic.AtomicBoolean canceled;
        private final java.util.concurrent.atomic.AtomicReference convertedRequestAndResponse;
        private final com.google.net.cronet.okhttptransport.RequestResponseConverter converter;
        private final java.util.concurrent.atomic.AtomicBoolean executed;
        private final com.google.net.cronet.okhttptransport.CronetCallFactory motherFactory;
        private final okhttp3.Request okHttpRequest;
        private final java.util.concurrent.ExecutorService responseCallbackExecutor;
        private final okio.AsyncTimeout timeout;

        private CronetCall(okhttp3.Request request, com.google.net.cronet.okhttptransport.CronetCallFactory cronetCallFactory, com.google.net.cronet.okhttptransport.RequestResponseConverter requestResponseConverter, java.util.concurrent.ExecutorService executorService) {
            this.executed = new java.util.concurrent.atomic.AtomicBoolean();
            this.canceled = new java.util.concurrent.atomic.AtomicBoolean();
            this.convertedRequestAndResponse = new java.util.concurrent.atomic.AtomicReference();
            this.okHttpRequest = request;
            this.motherFactory = cronetCallFactory;
            this.converter = requestResponseConverter;
            this.responseCallbackExecutor = executorService;
            okio.AsyncTimeout asyncTimeout = new okio.AsyncTimeout(this) { // from class: com.google.net.cronet.okhttptransport.CronetCallFactory.CronetCall.1
                final /* synthetic */ com.google.net.cronet.okhttptransport.CronetCallFactory.CronetCall this$0;

                {
                    java.util.Objects.requireNonNull(this);
                    this.this$0 = this;
                }

                @Override // okio.AsyncTimeout
                public void timedOut() {
                    this.this$0.cancel();
                }
            };
            this.timeout = asyncTimeout;
            asyncTimeout.timeout(cronetCallFactory.com$google$net$cronet$okhttptransportCronetCallFactory$callTimeoutMillis$ar$desugaring_accessor(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }

        @Override // okhttp3.Call
        /* renamed from: request */
        public okhttp3.Request getGetHighSpeedVideoSizes() {
            return this.okHttpRequest;
        }

        @Override // okhttp3.Call
        public okhttp3.Response execute() throws java.io.IOException {
            evaluateExecutionPreconditions();
            try {
                this.timeout.enter();
                com.google.net.cronet.okhttptransport.RequestResponseConverter.CronetRequestAndOkHttpResponse convert = this.converter.convert(getGetHighSpeedVideoSizes(), this.motherFactory.com$google$net$cronet$okhttptransportCronetCallFactory$readTimeoutMillis$ar$desugaring_accessor(), this.motherFactory.com$google$net$cronet$okhttptransportCronetCallFactory$writeTimeoutMillis$ar$desugaring_accessor());
                this.convertedRequestAndResponse.set(convert);
                startRequestIfNotCanceled();
                return com.google.net.cronet.okhttptransport.CronetCallFactory.toCronetCallFactoryResponse(this, convert.getResponse());
            } catch (java.io.IOException | java.lang.RuntimeException e) {
                this.timeout.exit();
                throw e;
            }
        }

        @Override // okhttp3.Call
        public void enqueue(final okhttp3.Callback callback) {
            try {
                this.timeout.enter();
                evaluateExecutionPreconditions();
                com.google.net.cronet.okhttptransport.RequestResponseConverter.CronetRequestAndOkHttpResponse convert = this.converter.convert(getGetHighSpeedVideoSizes(), this.motherFactory.com$google$net$cronet$okhttptransportCronetCallFactory$readTimeoutMillis$ar$desugaring_accessor(), this.motherFactory.com$google$net$cronet$okhttptransportCronetCallFactory$writeTimeoutMillis$ar$desugaring_accessor());
                this.convertedRequestAndResponse.set(convert);
                com.google.common.util.concurrent.Futures.addCallback(convert.getResponseAsync(), new com.google.common.util.concurrent.FutureCallback(this) { // from class: com.google.net.cronet.okhttptransport.CronetCallFactory.CronetCall.2
                    final /* synthetic */ com.google.net.cronet.okhttptransport.CronetCallFactory.CronetCall this$0;

                    {
                        java.util.Objects.requireNonNull(this);
                        this.this$0 = this;
                    }

                    @Override // com.google.common.util.concurrent.FutureCallback
                    public void onSuccess(okhttp3.Response response) {
                        try {
                            okhttp3.Callback callback2 = callback;
                            com.google.net.cronet.okhttptransport.CronetCallFactory.CronetCall cronetCall = this;
                            callback2.onResponse(cronetCall, com.google.net.cronet.okhttptransport.CronetCallFactory.toCronetCallFactoryResponse(cronetCall, response));
                        } catch (java.io.IOException unused) {
                            this.this$0.com$google$net$cronet$okhttptransportCronetCallFactory$CronetCall$toLoggableString$ar$desugaring_accessor();
                        }
                    }

                    @Override // com.google.common.util.concurrent.FutureCallback
                    public void onFailure(java.lang.Throwable th) {
                        if (th instanceof java.io.IOException) {
                            callback.onFailure(this, (java.io.IOException) th);
                        } else {
                            callback.onFailure(this, new java.io.IOException(th));
                        }
                    }
                }, this.responseCallbackExecutor);
                startRequestIfNotCanceled();
            } catch (java.io.IOException e) {
                this.timeout.exit();
                callback.onFailure(this, e);
            }
        }

        @Override // okhttp3.Call
        public okhttp3.Call clone() {
            return this.motherFactory.newCall(getGetHighSpeedVideoSizes());
        }

        @Override // okhttp3.Call
        public void cancel() {
            com.google.net.cronet.okhttptransport.RequestResponseConverter.CronetRequestAndOkHttpResponse cronetRequestAndOkHttpResponse;
            if (this.canceled.getAndSet(true) || (cronetRequestAndOkHttpResponse = (com.google.net.cronet.okhttptransport.RequestResponseConverter.CronetRequestAndOkHttpResponse) this.convertedRequestAndResponse.get()) == null) {
                return;
            }
            cronetRequestAndOkHttpResponse.getRequest().cancel();
        }

        @Override // okhttp3.Call
        public boolean isExecuted() {
            return this.executed.get();
        }

        @Override // okhttp3.Call
        /* renamed from: isCanceled */
        public boolean getCanceled() {
            return this.canceled.get();
        }

        @Override // okhttp3.Call
        public okio.Timeout timeout() {
            return this.timeout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: toLoggableString, reason: merged with bridge method [inline-methods] */
        public java.lang.String com$google$net$cronet$okhttptransportCronetCallFactory$CronetCall$toLoggableString$ar$desugaring_accessor() {
            java.lang.String redact = getGetHighSpeedVideoSizes().url().redact();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("call to ".length() + java.lang.String.valueOf(redact).length());
            sb.append("call to ");
            sb.append(redact);
            return sb.toString();
        }

        private void evaluateExecutionPreconditions() throws java.io.IOException {
            if (this.canceled.get()) {
                throw new java.io.IOException("Can't execute canceled requests");
            }
            com.google.common.base.Preconditions.checkState(!this.executed.getAndSet(true), "Already Executed");
        }

        private void startRequestIfNotCanceled() {
            com.google.net.cronet.okhttptransport.RequestResponseConverter.CronetRequestAndOkHttpResponse cronetRequestAndOkHttpResponse = (com.google.net.cronet.okhttptransport.RequestResponseConverter.CronetRequestAndOkHttpResponse) this.convertedRequestAndResponse.get();
            com.google.common.base.Preconditions.checkState(cronetRequestAndOkHttpResponse != null, "convertedRequestAndResponse must be set!");
            if (this.canceled.get()) {
                cronetRequestAndOkHttpResponse.getRequest().cancel();
            } else {
                cronetRequestAndOkHttpResponse.getRequest().start();
            }
        }

        /* synthetic */ okio.AsyncTimeout com$google$net$cronet$okhttptransportCronetCallFactory$CronetCall$timeout$ar$desugaring_accessor() {
            return this.timeout;
        }

        /* synthetic */ CronetCall(okhttp3.Request request, com.google.net.cronet.okhttptransport.CronetCallFactory cronetCallFactory, com.google.net.cronet.okhttptransport.RequestResponseConverter requestResponseConverter, java.util.concurrent.ExecutorService executorService, byte[] bArr) {
            this(request, cronetCallFactory, requestResponseConverter, executorService);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static okhttp3.Response toCronetCallFactoryResponse(final com.google.net.cronet.okhttptransport.CronetCallFactory.CronetCall cronetCall, okhttp3.Response response) {
        com.google.common.base.Preconditions.checkNotNull(response.body());
        return response.newBuilder().body(new com.google.net.cronet.okhttptransport.CronetTransportResponseBody(response.body()) { // from class: com.google.net.cronet.okhttptransport.CronetCallFactory.1
            @Override // com.google.net.cronet.okhttptransport.CronetTransportResponseBody
            void customCloseHook() {
                cronetCall.com$google$net$cronet$okhttptransportCronetCallFactory$CronetCall$timeout$ar$desugaring_accessor().exit();
            }
        }).build();
    }

    public static final class Builder extends com.google.net.cronet.okhttptransport.RequestResponseConverterBasedBuilder<com.google.net.cronet.okhttptransport.CronetCallFactory.Builder, com.google.net.cronet.okhttptransport.CronetCallFactory> {
        private int callTimeoutMillis;
        private java.util.concurrent.ExecutorService callbackExecutorService;
        private int readTimeoutMillis;
        private int writeTimeoutMillis;

        Builder(org.chromium.net.CronetEngine cronetEngine) {
            super(cronetEngine, com.google.net.cronet.okhttptransport.CronetCallFactory.Builder.class);
            this.readTimeoutMillis = 10000;
            this.writeTimeoutMillis = 10000;
            this.callTimeoutMillis = 0;
            this.callbackExecutorService = null;
        }

        public final com.google.net.cronet.okhttptransport.CronetCallFactory.Builder setReadTimeoutMillis(int i) {
            com.google.common.base.Preconditions.checkArgument(i >= 0, "Read timeout mustn't be negative!");
            this.readTimeoutMillis = i;
            return this;
        }

        public final com.google.net.cronet.okhttptransport.CronetCallFactory.Builder setWriteTimeoutMillis(int i) {
            com.google.common.base.Preconditions.checkArgument(i >= 0, "Write timeout mustn't be negative!");
            this.writeTimeoutMillis = i;
            return this;
        }

        public final com.google.net.cronet.okhttptransport.CronetCallFactory.Builder setCallbackExecutorService(java.util.concurrent.ExecutorService executorService) {
            com.google.common.base.Preconditions.checkNotNull(executorService);
            this.callbackExecutorService = executorService;
            return this;
        }

        public final com.google.net.cronet.okhttptransport.CronetCallFactory.Builder setCallTimeoutMillis(int i) {
            com.google.common.base.Preconditions.checkArgument(i >= 0, "Call timeout mustn't be negative!");
            this.callTimeoutMillis = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.net.cronet.okhttptransport.RequestResponseConverterBasedBuilder
        public final com.google.net.cronet.okhttptransport.CronetCallFactory build(com.google.net.cronet.okhttptransport.RequestResponseConverter requestResponseConverter) {
            java.util.concurrent.ExecutorService executorService = this.callbackExecutorService;
            if (executorService == null) {
                executorService = java.util.concurrent.Executors.newCachedThreadPool();
            }
            return new com.google.net.cronet.okhttptransport.CronetCallFactory(requestResponseConverter, executorService, this.readTimeoutMillis, this.writeTimeoutMillis, this.callTimeoutMillis, null);
        }
    }

    final /* synthetic */ int com$google$net$cronet$okhttptransportCronetCallFactory$writeTimeoutMillis$ar$desugaring_accessor() {
        return this.writeTimeoutMillis;
    }

    final /* synthetic */ int com$google$net$cronet$okhttptransportCronetCallFactory$readTimeoutMillis$ar$desugaring_accessor() {
        return this.readTimeoutMillis;
    }

    final /* synthetic */ int com$google$net$cronet$okhttptransportCronetCallFactory$callTimeoutMillis$ar$desugaring_accessor() {
        return this.callTimeoutMillis;
    }

    /* synthetic */ CronetCallFactory(com.google.net.cronet.okhttptransport.RequestResponseConverter requestResponseConverter, java.util.concurrent.ExecutorService executorService, int i, int i2, int i3, byte[] bArr) {
        this(requestResponseConverter, executorService, i, i2, i3);
    }
}
