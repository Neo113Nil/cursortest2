package com.google.net.cronet.okhttptransport;

/* loaded from: classes4.dex */
class OkHttpBridgeRequestCallback extends org.chromium.net.UrlRequest.Callback {
    private final long readTimeoutMillis;
    private final com.google.net.cronet.okhttptransport.RedirectStrategy redirectStrategy;
    private volatile org.chromium.net.UrlRequest request;
    private final com.google.common.util.concurrent.SettableFuture bodySourceFuture = com.google.common.util.concurrent.SettableFuture.create();
    private final java.util.concurrent.atomic.AtomicBoolean finished = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean canceled = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.BlockingQueue callbackResults = new java.util.concurrent.ArrayBlockingQueue(2);
    private final com.google.common.util.concurrent.SettableFuture headersFuture = com.google.common.util.concurrent.SettableFuture.create();
    private final java.util.List urlResponseInfoChain = new java.util.ArrayList();

    /* loaded from: classes9.dex */
    enum CallbackStep {
        ON_READ_COMPLETED,
        ON_SUCCESS,
        ON_FAILED,
        ON_CANCELED
    }

    OkHttpBridgeRequestCallback(long j, com.google.net.cronet.okhttptransport.RedirectStrategy redirectStrategy) {
        com.google.common.base.Preconditions.checkArgument(j >= 0);
        if (j == 0) {
            this.readTimeoutMillis = androidx.collection.SieveCacheKt.NodeLinkMask;
        } else {
            this.readTimeoutMillis = j;
        }
        this.redirectStrategy = redirectStrategy;
    }

    com.google.common.util.concurrent.ListenableFuture getUrlResponseInfo() {
        return this.headersFuture;
    }

    com.google.common.util.concurrent.ListenableFuture getBodySource() {
        return this.bodySourceFuture;
    }

    java.util.List getUrlResponseInfoChain() {
        return java.util.Collections.unmodifiableList(this.urlResponseInfoChain);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
        if (!this.redirectStrategy.followRedirects()) {
            com.google.common.base.Preconditions.checkState(this.headersFuture.set(urlResponseInfo));
            com.google.common.base.Preconditions.checkState(this.bodySourceFuture.set(new okio.Buffer()));
            urlRequest.cancel();
            return;
        }
        this.urlResponseInfoChain.add(urlResponseInfo);
        if (urlResponseInfo.getUrlChain().size() <= this.redirectStrategy.numberOfRedirectsToFollow()) {
            urlRequest.followRedirect();
            return;
        }
        urlRequest.cancel();
        int numberOfRedirectsToFollow = this.redirectStrategy.numberOfRedirectsToFollow() + 1;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Too many follow-up requests: ".length() + java.lang.String.valueOf(numberOfRedirectsToFollow).length());
        sb.append("Too many follow-up requests: ");
        sb.append(numberOfRedirectsToFollow);
        java.net.ProtocolException protocolException = new java.net.ProtocolException(sb.toString());
        this.headersFuture.setException(protocolException);
        this.bodySourceFuture.setException(protocolException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onResponseStarted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        this.request = urlRequest;
        com.google.common.base.Preconditions.checkState(this.headersFuture.set(urlResponseInfo));
        com.google.common.base.Preconditions.checkState(this.bodySourceFuture.set(new com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback.CronetBodySource(this, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer) {
        this.callbackResults.add(new com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback.CallbackResult(com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback.CallbackStep.ON_READ_COMPLETED, null, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.chromium.net.UrlRequest.Callback
    public void onSucceeded(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        this.callbackResults.add(new com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback.CallbackResult(com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback.CallbackStep.ON_SUCCESS, null, 0 == true ? 1 : 0));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onFailed(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
        if (this.headersFuture.setException(cronetException) && this.bodySourceFuture.setException(cronetException)) {
            return;
        }
        this.callbackResults.add(new com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback.CallbackResult(com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback.CallbackStep.ON_FAILED, cronetException, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.chromium.net.UrlRequest.Callback
    public void onCanceled(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        this.canceled.set(true);
        this.callbackResults.add(new com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback.CallbackResult(com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback.CallbackStep.ON_CANCELED, null, 0 == true ? 1 : 0));
        java.io.IOException iOException = new java.io.IOException("The request was canceled!");
        this.headersFuture.setException(iOException);
        this.bodySourceFuture.setException(iOException);
    }

    /* loaded from: classes9.dex */
    class CronetBodySource implements okio.Source {
        private java.nio.ByteBuffer buffer;
        private volatile boolean closed;
        final /* synthetic */ com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback this$0;

        private CronetBodySource(com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback okHttpBridgeRequestCallback) {
            java.util.Objects.requireNonNull(okHttpBridgeRequestCallback);
            this.this$0 = okHttpBridgeRequestCallback;
            this.buffer = java.nio.ByteBuffer.allocateDirect(32768);
            this.closed = false;
        }

        @Override // okio.Source
        public long read(okio.Buffer buffer, long j) throws java.io.IOException {
            if (this.this$0.com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$canceled$ar$desugaring_accessor().get()) {
                throw new java.io.IOException("The request was canceled!");
            }
            com.google.common.base.Preconditions.checkArgument(buffer != null, "sink == null");
            com.google.common.base.Preconditions.checkArgument(j >= 0, "byteCount < 0: %s", j);
            com.google.common.base.Preconditions.checkState(!this.closed, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            if (this.this$0.com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$finished$ar$desugaring_accessor().get()) {
                return -1L;
            }
            if (j == 0) {
                return 0L;
            }
            if (this.buffer.position() == 0) {
                if (!fillBuffer()) {
                    return -1L;
                }
                this.buffer.flip();
                com.google.common.base.Preconditions.checkState(this.buffer.hasRemaining(), "Buffer should have remaining bytes after flip");
            }
            int copyByteBufferToOkioBuffer = copyByteBufferToOkioBuffer(this.buffer, buffer, j);
            com.google.common.base.Preconditions.checkState(copyByteBufferToOkioBuffer > 0, "Bytes written should be positive");
            if (!this.buffer.hasRemaining()) {
                this.buffer.clear();
            }
            return copyByteBufferToOkioBuffer;
        }

        private boolean fillBuffer() throws java.io.IOException {
            com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback.CallbackResult callbackResult;
            com.google.common.base.Preconditions.checkState(this.buffer.position() == 0, "Buffer position is not 0");
            com.google.common.base.Preconditions.checkState(this.buffer.limit() == this.buffer.capacity(), "Buffer limit is not capacity");
            this.this$0.com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$request$ar$desugaring_accessor().read(this.buffer);
            try {
                callbackResult = (com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback.CallbackResult) this.this$0.com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$callbackResults$ar$desugaring_accessor().poll(this.this$0.com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$readTimeoutMillis$ar$desugaring_accessor(), java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                callbackResult = null;
            }
            if (callbackResult == null) {
                this.this$0.com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$request$ar$desugaring_accessor().cancel();
                throw new com.google.net.cronet.okhttptransport.CronetTimeoutException();
            }
            int ordinal = callbackResult.com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$CallbackResult$callbackStep$ar$desugaring_accessor().ordinal();
            if (ordinal == 0) {
                return true;
            }
            if (ordinal == 1) {
                this.this$0.com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$finished$ar$desugaring_accessor().set(true);
                this.buffer = null;
                return false;
            }
            if (ordinal == 2) {
                this.this$0.com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$finished$ar$desugaring_accessor().set(true);
                this.buffer = null;
                throw new java.io.IOException(callbackResult.com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$CallbackResult$exception$ar$desugaring_accessor());
            }
            if (ordinal == 3) {
                this.buffer = null;
                throw new java.io.IOException("The request was canceled!");
            }
            throw new java.lang.AssertionError("The switch block above is exhaustive!");
        }

        private static int copyByteBufferToOkioBuffer(java.nio.ByteBuffer byteBuffer, okio.Buffer buffer, long j) throws java.io.IOException {
            if (byteBuffer.remaining() <= j) {
                return buffer.write(byteBuffer);
            }
            int limit = byteBuffer.limit();
            try {
                byteBuffer.limit(byteBuffer.position() + ((int) j));
                return buffer.write(byteBuffer);
            } finally {
                byteBuffer.limit(limit);
            }
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public okio.Timeout getCamera2StreamConfigurationMap() {
            return okio.Timeout.NONE;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (this.this$0.com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$finished$ar$desugaring_accessor().get()) {
                return;
            }
            this.this$0.com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$request$ar$desugaring_accessor().cancel();
        }

        /* synthetic */ CronetBodySource(com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback okHttpBridgeRequestCallback, byte[] bArr) {
            this(okHttpBridgeRequestCallback);
        }
    }

    /* loaded from: classes9.dex */
    static class CallbackResult {
        private final com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback.CallbackStep callbackStep;

        @javax.annotation.Nullable
        private final org.chromium.net.CronetException exception;

        private CallbackResult(com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback.CallbackStep callbackStep, @javax.annotation.Nullable org.chromium.net.CronetException cronetException) {
            this.callbackStep = callbackStep;
            this.exception = cronetException;
        }

        /* synthetic */ org.chromium.net.CronetException com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$CallbackResult$exception$ar$desugaring_accessor() {
            return this.exception;
        }

        /* synthetic */ com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback.CallbackStep com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$CallbackResult$callbackStep$ar$desugaring_accessor() {
            return this.callbackStep;
        }

        /* synthetic */ CallbackResult(com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback.CallbackStep callbackStep, org.chromium.net.CronetException cronetException, byte[] bArr) {
            this(callbackStep, cronetException);
        }
    }

    /* synthetic */ org.chromium.net.UrlRequest com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$request$ar$desugaring_accessor() {
        return this.request;
    }

    /* synthetic */ long com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$readTimeoutMillis$ar$desugaring_accessor() {
        return this.readTimeoutMillis;
    }

    /* synthetic */ java.util.concurrent.atomic.AtomicBoolean com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$finished$ar$desugaring_accessor() {
        return this.finished;
    }

    /* synthetic */ java.util.concurrent.atomic.AtomicBoolean com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$canceled$ar$desugaring_accessor() {
        return this.canceled;
    }

    /* synthetic */ java.util.concurrent.BlockingQueue com$google$net$cronet$okhttptransportOkHttpBridgeRequestCallback$callbackResults$ar$desugaring_accessor() {
        return this.callbackResults;
    }
}
