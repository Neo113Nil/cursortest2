package com.google.net.cronet.okhttptransport;

/* loaded from: classes4.dex */
final class RequestResponseConverter {
    private final org.chromium.net.CronetEngine cronetEngine;
    private final com.google.net.cronet.okhttptransport.RedirectStrategy redirectStrategy;
    private final com.google.net.cronet.okhttptransport.RequestBodyConverter requestBodyConverter;
    private final com.google.net.cronet.okhttptransport.ResponseConverter responseConverter;
    private final java.util.concurrent.Executor uploadDataProviderExecutor;

    interface ResponseSupplier {
        okhttp3.Response getResponse() throws java.io.IOException;

        com.google.common.util.concurrent.ListenableFuture getResponseFuture();
    }

    RequestResponseConverter(org.chromium.net.CronetEngine cronetEngine, java.util.concurrent.Executor executor, com.google.net.cronet.okhttptransport.RequestBodyConverter requestBodyConverter, com.google.net.cronet.okhttptransport.ResponseConverter responseConverter, com.google.net.cronet.okhttptransport.RedirectStrategy redirectStrategy) {
        this.cronetEngine = cronetEngine;
        this.uploadDataProviderExecutor = executor;
        this.requestBodyConverter = requestBodyConverter;
        this.responseConverter = responseConverter;
        this.redirectStrategy = redirectStrategy;
    }

    final com.google.net.cronet.okhttptransport.RequestResponseConverter.CronetRequestAndOkHttpResponse convert(okhttp3.Request request, int i, int i2) throws java.io.IOException {
        com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback okHttpBridgeRequestCallback = new com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback(i, this.redirectStrategy);
        org.chromium.net.UrlRequest.Builder allowDirectExecutor = this.cronetEngine.newUrlRequestBuilder(request.url().toString(), okHttpBridgeRequestCallback, com.google.common.util.concurrent.MoreExecutors.directExecutor()).allowDirectExecutor();
        allowDirectExecutor.setHttpMethod(request.method());
        for (int i3 = 0; i3 < request.headers().size(); i3++) {
            allowDirectExecutor.addHeader(request.headers().name(i3), request.headers().value(i3));
        }
        okhttp3.RequestBody body = request.body();
        if (body != null) {
            okhttp3.MediaType contentType = body.getContentType();
            if (contentType != null) {
                allowDirectExecutor.addHeader("Content-Type", contentType.toString());
            }
            if (request.header("Content-Length") == null && body.getContentLength() != -1) {
                allowDirectExecutor.addHeader("Content-Length", java.lang.String.valueOf(body.getContentLength()));
            }
            if (body.getContentLength() != 0) {
                java.lang.String header = request.header("Content-Type");
                if (contentType == null && (header == null || header.trim().isEmpty())) {
                    allowDirectExecutor.addHeader("Content-Type", com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.MIME_TYPE_OCTET_STREAM);
                }
                allowDirectExecutor.setUploadDataProvider(this.requestBodyConverter.convertRequestBody(body, i2), this.uploadDataProviderExecutor);
            }
        }
        return new com.google.net.cronet.okhttptransport.RequestResponseConverter.CronetRequestAndOkHttpResponse(allowDirectExecutor.build(), createResponseSupplier(request, okHttpBridgeRequestCallback));
    }

    private com.google.net.cronet.okhttptransport.RequestResponseConverter.ResponseSupplier createResponseSupplier(final okhttp3.Request request, final com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback okHttpBridgeRequestCallback) {
        return new com.google.net.cronet.okhttptransport.RequestResponseConverter.ResponseSupplier(this) { // from class: com.google.net.cronet.okhttptransport.RequestResponseConverter.1
            final /* synthetic */ com.google.net.cronet.okhttptransport.RequestResponseConverter this$0;

            {
                java.util.Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // com.google.net.cronet.okhttptransport.RequestResponseConverter.ResponseSupplier
            public okhttp3.Response getResponse() throws java.io.IOException {
                return this.this$0.com$google$net$cronet$okhttptransportRequestResponseConverter$responseConverter$ar$desugaring_accessor().lambda$toResponseAsync$0(request, okHttpBridgeRequestCallback);
            }

            @Override // com.google.net.cronet.okhttptransport.RequestResponseConverter.ResponseSupplier
            public com.google.common.util.concurrent.ListenableFuture getResponseFuture() {
                return this.this$0.com$google$net$cronet$okhttptransportRequestResponseConverter$responseConverter$ar$desugaring_accessor().toResponseAsync(request, okHttpBridgeRequestCallback);
            }
        };
    }

    static final class CronetRequestAndOkHttpResponse {
        private final org.chromium.net.UrlRequest request;
        private final com.google.net.cronet.okhttptransport.RequestResponseConverter.ResponseSupplier responseSupplier;

        CronetRequestAndOkHttpResponse(org.chromium.net.UrlRequest urlRequest, com.google.net.cronet.okhttptransport.RequestResponseConverter.ResponseSupplier responseSupplier) {
            this.request = urlRequest;
            this.responseSupplier = responseSupplier;
        }

        public final org.chromium.net.UrlRequest getRequest() {
            return this.request;
        }

        public final okhttp3.Response getResponse() throws java.io.IOException {
            return this.responseSupplier.getResponse();
        }

        public final com.google.common.util.concurrent.ListenableFuture getResponseAsync() {
            return this.responseSupplier.getResponseFuture();
        }
    }

    final /* synthetic */ com.google.net.cronet.okhttptransport.ResponseConverter com$google$net$cronet$okhttptransportRequestResponseConverter$responseConverter$ar$desugaring_accessor() {
        return this.responseConverter;
    }
}
