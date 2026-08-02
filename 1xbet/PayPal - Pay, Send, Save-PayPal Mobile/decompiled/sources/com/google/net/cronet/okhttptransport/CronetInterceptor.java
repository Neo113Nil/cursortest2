package com.google.net.cronet.okhttptransport;

/* loaded from: classes4.dex */
public final class CronetInterceptor implements okhttp3.Interceptor, java.lang.AutoCloseable {
    private final java.util.Map activeCalls;
    private final com.google.net.cronet.okhttptransport.RequestResponseConverter converter;
    private final java.util.concurrent.ScheduledExecutorService scheduledExecutor;

    private CronetInterceptor(com.google.net.cronet.okhttptransport.RequestResponseConverter requestResponseConverter) {
        this.activeCalls = new java.util.concurrent.ConcurrentHashMap();
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1);
        this.scheduledExecutor = scheduledThreadPoolExecutor;
        this.converter = (com.google.net.cronet.okhttptransport.RequestResponseConverter) com.google.common.base.Preconditions.checkNotNull(requestResponseConverter);
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new java.lang.Runnable() { // from class: com.google.net.cronet.okhttptransport.CronetInterceptor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.net.cronet.okhttptransport.CronetInterceptor.this.lambda$new$0();
            }
        }, 500L, 500L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        java.util.Iterator it = this.activeCalls.entrySet().iterator();
        while (it.hasNext()) {
            try {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (((okhttp3.Call) entry.getKey()).getCanceled()) {
                    it.remove();
                    ((org.chromium.net.UrlRequest) entry.getValue()).cancel();
                }
            } catch (java.lang.RuntimeException unused) {
            }
        }
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        if (chain.call().getCanceled()) {
            throw new java.io.IOException("Canceled");
        }
        com.google.net.cronet.okhttptransport.RequestResponseConverter.CronetRequestAndOkHttpResponse convert = this.converter.convert(chain.request(), chain.readTimeoutMillis(), chain.writeTimeoutMillis());
        this.activeCalls.put(chain.call(), convert.getRequest());
        try {
            convert.getRequest().start();
            return toInterceptorResponse(convert.getResponse(), chain.call());
        } catch (java.io.IOException | java.lang.RuntimeException e) {
            this.activeCalls.remove(chain.call());
            throw e;
        }
    }

    public static com.google.net.cronet.okhttptransport.CronetInterceptor.Builder newBuilder(org.chromium.net.CronetEngine cronetEngine) {
        return new com.google.net.cronet.okhttptransport.CronetInterceptor.Builder(cronetEngine);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.scheduledExecutor.shutdown();
    }

    public static final class Builder extends com.google.net.cronet.okhttptransport.RequestResponseConverterBasedBuilder<com.google.net.cronet.okhttptransport.CronetInterceptor.Builder, com.google.net.cronet.okhttptransport.CronetInterceptor> {
        Builder(org.chromium.net.CronetEngine cronetEngine) {
            super(cronetEngine, com.google.net.cronet.okhttptransport.CronetInterceptor.Builder.class);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.net.cronet.okhttptransport.RequestResponseConverterBasedBuilder
        public final com.google.net.cronet.okhttptransport.CronetInterceptor build(com.google.net.cronet.okhttptransport.RequestResponseConverter requestResponseConverter) {
            return new com.google.net.cronet.okhttptransport.CronetInterceptor(requestResponseConverter, null);
        }
    }

    private okhttp3.Response toInterceptorResponse(okhttp3.Response response, okhttp3.Call call) {
        com.google.common.base.Preconditions.checkNotNull(response.body());
        return response.body() instanceof com.google.net.cronet.okhttptransport.CronetInterceptor.CronetInterceptorResponseBody ? response : response.newBuilder().body(new com.google.net.cronet.okhttptransport.CronetInterceptor.CronetInterceptorResponseBody(this, response.body(), call, null)).build();
    }

    class CronetInterceptorResponseBody extends com.google.net.cronet.okhttptransport.CronetTransportResponseBody {
        private final okhttp3.Call call;
        final /* synthetic */ com.google.net.cronet.okhttptransport.CronetInterceptor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private CronetInterceptorResponseBody(com.google.net.cronet.okhttptransport.CronetInterceptor cronetInterceptor, okhttp3.ResponseBody responseBody, okhttp3.Call call) {
            super(responseBody);
            java.util.Objects.requireNonNull(cronetInterceptor);
            this.this$0 = cronetInterceptor;
            this.call = call;
        }

        @Override // com.google.net.cronet.okhttptransport.CronetTransportResponseBody
        void customCloseHook() {
            this.this$0.com$google$net$cronet$okhttptransportCronetInterceptor$activeCalls$ar$desugaring_accessor().remove(this.call);
        }

        /* synthetic */ CronetInterceptorResponseBody(com.google.net.cronet.okhttptransport.CronetInterceptor cronetInterceptor, okhttp3.ResponseBody responseBody, okhttp3.Call call, byte[] bArr) {
            this(cronetInterceptor, responseBody, call);
        }
    }

    final /* synthetic */ java.util.Map com$google$net$cronet$okhttptransportCronetInterceptor$activeCalls$ar$desugaring_accessor() {
        return this.activeCalls;
    }

    /* synthetic */ CronetInterceptor(com.google.net.cronet.okhttptransport.RequestResponseConverter requestResponseConverter, byte[] bArr) {
        this(requestResponseConverter);
    }
}
