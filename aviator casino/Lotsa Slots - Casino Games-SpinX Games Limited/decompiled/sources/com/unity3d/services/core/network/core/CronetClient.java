package com.unity3d.services.core.network.core;

/* compiled from: CronetClient.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J!\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/unity3d/services/core/network/core/CronetClient;", "Lcom/unity3d/services/core/network/core/HttpClient;", "engine", "Lorg/chromium/net/CronetEngine;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "(Lorg/chromium/net/CronetEngine;Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "buildUrl", "", "request", "Lcom/unity3d/services/core/network/model/HttpRequest;", "execute", "Lcom/unity3d/services/core/network/model/HttpResponse;", "withInputStream", "", "(Lcom/unity3d/services/core/network/model/HttpRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeBlocking", "getContentSize", "", "info", "Lorg/chromium/net/UrlResponseInfo;", "getPriority", "", "priority", "shutdown", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CronetClient implements com.unity3d.services.core.network.core.HttpClient {
    private static final java.lang.String MSG_CONNECTION_FAILED = "Network request failed";
    private static final java.lang.String MSG_CONNECTION_TIMEOUT = "Network request timed out";
    private static final java.lang.String NETWORK_CLIENT_CRONET = "cronet";
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;
    private final org.chromium.net.CronetEngine engine;

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPriority(int priority) {
        if (priority == 0) {
            return 4;
        }
        if (priority != 1) {
            return priority != 2 ? 1 : 2;
        }
        return 3;
    }

    public CronetClient(org.chromium.net.CronetEngine engine, com.unity3d.services.core.domain.ISDKDispatchers dispatchers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(engine, "engine");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.engine = engine;
        this.dispatchers = dispatchers;
    }

    public final void shutdown() {
        this.engine.shutdown();
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public com.unity3d.services.core.network.model.HttpResponse executeBlocking(com.unity3d.services.core.network.model.HttpRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        return (com.unity3d.services.core.network.model.HttpResponse) kotlinx.coroutines.BuildersKt.runBlocking(this.dispatchers.getIo(), new com.unity3d.services.core.network.core.CronetClient$executeBlocking$1(this, request, null));
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public java.lang.Object execute(com.unity3d.services.core.network.model.HttpRequest httpRequest, final boolean z, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) {
        byte[] bArr;
        final java.io.PipedOutputStream pipedOutputStream = z ? new java.io.PipedOutputStream() : null;
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        org.chromium.net.UrlRequest.Builder newUrlRequestBuilder = this.engine.newUrlRequestBuilder(buildUrl(httpRequest), new com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback() { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$callback$1
            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback
            public void onSucceeded(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info, byte[] bodyBytes) {
                long contentSize;
                java.io.PipedOutputStream pipedOutputStream2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyBytes, "bodyBytes");
                if (z && (pipedOutputStream2 = pipedOutputStream) != null) {
                    pipedOutputStream2.close();
                }
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.model.HttpResponse> cancellableContinuation = cancellableContinuationImpl2;
                int httpStatusCode = info.getHttpStatusCode();
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> allHeaders = info.getAllHeaders();
                java.lang.String url = info.getUrl();
                java.lang.String negotiatedProtocol = info.getNegotiatedProtocol();
                contentSize = this.getContentSize(info);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allHeaders, "allHeaders");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "url");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(negotiatedProtocol, "negotiatedProtocol");
                com.unity3d.services.core.network.model.HttpResponse httpResponse = new com.unity3d.services.core.network.model.HttpResponse(bodyBytes, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(httpResponse));
            }

            @Override // org.chromium.net.UrlRequest.Callback
            public void onFailed(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info, org.chromium.net.CronetException error) {
                java.io.PipedOutputStream pipedOutputStream2 = pipedOutputStream;
                if (pipedOutputStream2 != null) {
                    pipedOutputStream2.close();
                }
                org.chromium.net.NetworkException networkException = error instanceof org.chromium.net.NetworkException ? (org.chromium.net.NetworkException) error : null;
                com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException unityAdsNetworkException = new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException(com.unity3d.services.core.network.core.OkHttp3Client.MSG_CONNECTION_FAILED, null, info != null ? java.lang.Integer.valueOf(info.getHttpStatusCode()) : null, info != null ? info.getUrl() : null, info != null ? info.getNegotiatedProtocol() : null, networkException != null ? java.lang.Integer.valueOf(networkException.getCronetInternalErrorCode()) : null, "cronet", 2, null);
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.model.HttpResponse> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(unityAdsNetworkException)));
            }

            @Override // org.chromium.net.UrlRequest.Callback
            public void onCanceled(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info) {
                super.onCanceled(request, info);
                java.io.PipedOutputStream pipedOutputStream2 = pipedOutputStream;
                if (pipedOutputStream2 != null) {
                    pipedOutputStream2.close();
                }
                com.unity3d.ads.core.data.model.exception.NetworkTimeoutException networkTimeoutException = new com.unity3d.ads.core.data.model.exception.NetworkTimeoutException("Network request timed out", null, null, info != null ? info.getUrl() : null, info != null ? info.getNegotiatedProtocol() : null, null, "cronet", 38, null);
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.model.HttpResponse> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(networkTimeoutException)));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onReadCompleted(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info, java.nio.ByteBuffer byteBuffer) {
                long contentSize;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
                if (pipedOutputStream != null) {
                    if (!atomicBoolean.getAndSet(true)) {
                        kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.model.HttpResponse> cancellableContinuation = cancellableContinuationImpl2;
                        int httpStatusCode = info.getHttpStatusCode();
                        java.util.Map<java.lang.String, java.util.List<java.lang.String>> allHeaders = info.getAllHeaders();
                        java.lang.String url = info.getUrl();
                        java.io.PipedInputStream pipedInputStream = new java.io.PipedInputStream(pipedOutputStream);
                        java.lang.String negotiatedProtocol = info.getNegotiatedProtocol();
                        contentSize = this.getContentSize(info);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allHeaders, "allHeaders");
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "url");
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(negotiatedProtocol, "negotiatedProtocol");
                        com.unity3d.services.core.network.model.HttpResponse httpResponse = new com.unity3d.services.core.network.model.HttpResponse(pipedInputStream, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize);
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(httpResponse));
                    }
                    byteBuffer.flip();
                    try {
                        byte[] bArr2 = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr2);
                        pipedOutputStream.write(bArr2);
                    } catch (java.io.IOException e) {
                        com.unity3d.services.core.log.DeviceLog.info("IOException during ByteBuffer read. Details: ", e);
                    }
                    byteBuffer.clear();
                    request.read(byteBuffer);
                    return;
                }
                super.onReadCompleted(request, info, byteBuffer);
            }
        }, kotlinx.coroutines.ExecutorsKt.asExecutor(this.dispatchers.getIo()));
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : httpRequest.getHeaders().entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                newUrlRequestBuilder.addHeader(key, (java.lang.String) it.next());
            }
        }
        if (httpRequest.getMethod() == com.unity3d.services.core.network.model.RequestType.POST) {
            java.lang.Object body = httpRequest.getBody();
            if (body instanceof byte[]) {
                bArr = (byte[]) httpRequest.getBody();
            } else if (body instanceof java.lang.String) {
                bArr = ((java.lang.String) httpRequest.getBody()).getBytes(kotlin.text.Charsets.UTF_8);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArr, "this as java.lang.String).getBytes(charset)");
            } else {
                bArr = new byte[0];
            }
            newUrlRequestBuilder.setUploadDataProvider(org.chromium.net.UploadDataProviders.create(bArr), kotlinx.coroutines.ExecutorsKt.asExecutor(this.dispatchers.getIo()));
        }
        final org.chromium.net.UrlRequest build = newUrlRequestBuilder.setHttpMethod(httpRequest.getMethod().toString()).setPriority(getPriority(httpRequest.getPriority())).build();
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
                org.chromium.net.UrlRequest.this.cancel();
            }
        });
        build.start();
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String buildUrl(com.unity3d.services.core.network.model.HttpRequest request) {
        return kotlin.text.StringsKt.removeSuffix(kotlin.text.StringsKt.trim(request.getBaseURL(), kotlinx.io.files.FileSystemKt.UnixPathSeparator) + kotlinx.io.files.FileSystemKt.UnixPathSeparator + kotlin.text.StringsKt.trim(request.getPath(), kotlinx.io.files.FileSystemKt.UnixPathSeparator), (java.lang.CharSequence) com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getContentSize(org.chromium.net.UrlResponseInfo info) {
        java.lang.String str;
        java.lang.Long longOrNull;
        java.util.List<java.lang.String> list = info.getAllHeaders().get(com.google.common.net.HttpHeaders.CONTENT_LENGTH);
        if (list == null || (str = list.get(0)) == null || (longOrNull = kotlin.text.StringsKt.toLongOrNull(str)) == null) {
            return -1L;
        }
        return longOrNull.longValue();
    }
}
