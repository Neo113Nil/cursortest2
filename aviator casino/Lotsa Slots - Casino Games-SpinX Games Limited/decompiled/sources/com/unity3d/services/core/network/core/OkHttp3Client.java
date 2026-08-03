package com.unity3d.services.core.network.core;

/* compiled from: OkHttp3Client.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/unity3d/services/core/network/core/OkHttp3Client;", "Lcom/unity3d/services/core/network/core/HttpClient;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "client", "Lokhttp3/OkHttpClient;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lokhttp3/OkHttpClient;)V", "execute", "Lcom/unity3d/services/core/network/model/HttpResponse;", "request", "Lcom/unity3d/services/core/network/model/HttpRequest;", "withInputStream", "", "(Lcom/unity3d/services/core/network/model/HttpRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeBlocking", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OkHttp3Client implements com.unity3d.services.core.network.core.HttpClient {
    public static final java.lang.String MSG_CONNECTION_FAILED = "Network request failed";
    public static final java.lang.String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    public static final java.lang.String NETWORK_CLIENT_OKHTTP = "refactored-okhttp";
    private final okhttp3.OkHttpClient client;
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;

    public OkHttp3Client(com.unity3d.services.core.domain.ISDKDispatchers dispatchers, okhttp3.OkHttpClient client) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public com.unity3d.services.core.network.model.HttpResponse executeBlocking(com.unity3d.services.core.network.model.HttpRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        return (com.unity3d.services.core.network.model.HttpResponse) kotlinx.coroutines.BuildersKt.runBlocking(this.dispatchers.getIo(), new com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1(this, request, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.unity3d.services.core.network.core.HttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object execute(com.unity3d.services.core.network.model.HttpRequest httpRequest, final boolean z, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) {
        com.unity3d.services.core.network.core.OkHttp3Client$execute$1 okHttp3Client$execute$1;
        int i;
        try {
            if (continuation instanceof com.unity3d.services.core.network.core.OkHttp3Client$execute$1) {
                okHttp3Client$execute$1 = (com.unity3d.services.core.network.core.OkHttp3Client$execute$1) continuation;
                if ((okHttp3Client$execute$1.label & Integer.MIN_VALUE) != 0) {
                    okHttp3Client$execute$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = okHttp3Client$execute$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = okHttp3Client$execute$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        okhttp3.Request okHttpProtoRequest = com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(httpRequest);
                        okhttp3.OkHttpClient build = this.client.newBuilder().connectTimeout(httpRequest.getConnectTimeout(), java.util.concurrent.TimeUnit.MILLISECONDS).readTimeout(httpRequest.getReadTimeout(), java.util.concurrent.TimeUnit.MILLISECONDS).writeTimeout(httpRequest.getWriteTimeout(), java.util.concurrent.TimeUnit.MILLISECONDS).build();
                        okHttp3Client$execute$1.L$0 = httpRequest;
                        okHttp3Client$execute$1.L$1 = okHttpProtoRequest;
                        okHttp3Client$execute$1.L$2 = build;
                        okHttp3Client$execute$1.Z$0 = z;
                        okHttp3Client$execute$1.label = 1;
                        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(okHttp3Client$execute$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                        final okhttp3.Call newCall = build.newCall(okHttpProtoRequest);
                        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$execute$2$1
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
                                okhttp3.Call.this.cancel();
                            }
                        });
                        newCall.enqueue(new okhttp3.Callback() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$execute$2$2
                            @Override // okhttp3.Callback
                            public void onResponse(okhttp3.Call call, okhttp3.Response response) {
                                java.io.InputStream bytes;
                                java.lang.Long longOrNull;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
                                okhttp3.ResponseBody body = response.body();
                                if (body == null) {
                                    kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.model.HttpResponse> cancellableContinuation = cancellableContinuationImpl2;
                                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                    cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException("Empty response", null, java.lang.Integer.valueOf(response.code()), null, null, null, com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP, 58, null))));
                                    return;
                                }
                                if (!response.isSuccessful()) {
                                    body.close();
                                    kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.model.HttpResponse> cancellableContinuation2 = cancellableContinuationImpl2;
                                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                    cancellableContinuation2.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException("Network request failed with code " + response.code(), null, java.lang.Integer.valueOf(response.code()), null, null, null, com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP, 58, null))));
                                    return;
                                }
                                try {
                                    if (z) {
                                        java.io.InputStream byteStream = body.byteStream();
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(byteStream, "null cannot be cast to non-null type kotlin.Any");
                                        bytes = byteStream;
                                    } else {
                                        bytes = body.bytes();
                                    }
                                    java.lang.Object responseData = bytes;
                                    kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.model.HttpResponse> cancellableContinuation3 = cancellableContinuationImpl2;
                                    int code = response.code();
                                    java.util.Map<java.lang.String, java.util.List<java.lang.String>> multimap = response.headers().toMultimap();
                                    java.lang.String url = response.request().url().getUrl();
                                    java.lang.String protocol = response.protocol().getProtocol();
                                    java.lang.String header = response.header(com.google.common.net.HttpHeaders.CONTENT_LENGTH);
                                    long longValue = (header == null || (longOrNull = kotlin.text.StringsKt.toLongOrNull(header)) == null) ? -1L : longOrNull.longValue();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(responseData, "responseData");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(multimap, "toMultimap()");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "toString()");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(protocol, "toString()");
                                    com.unity3d.services.core.network.model.HttpResponse httpResponse = new com.unity3d.services.core.network.model.HttpResponse(responseData, code, multimap, url, protocol, com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP, longValue);
                                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                                    cancellableContinuation3.resumeWith(kotlin.Result.m10798constructorimpl(httpResponse));
                                } catch (java.lang.Exception e) {
                                    body.close();
                                    kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.model.HttpResponse> cancellableContinuation4 = cancellableContinuationImpl2;
                                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                                    cancellableContinuation4.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(e)));
                                }
                            }

                            @Override // okhttp3.Callback
                            public void onFailure(okhttp3.Call call, java.io.IOException e) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
                                kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.model.HttpResponse> cancellableContinuation = cancellableContinuationImpl2;
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(e)));
                            }
                        });
                        obj = cancellableContinuationImpl.getResult();
                        if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(okHttp3Client$execute$1);
                        }
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z2 = okHttp3Client$execute$1.Z$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            return obj;
        } catch (java.net.SocketTimeoutException unused) {
            throw new com.unity3d.ads.core.data.model.exception.NetworkTimeoutException(MSG_CONNECTION_TIMEOUT, null, null, httpRequest.getBaseURL(), null, null, NETWORK_CLIENT_OKHTTP, 54, null);
        } catch (java.io.IOException unused2) {
            throw new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException(MSG_CONNECTION_FAILED, null, null, httpRequest.getBaseURL(), null, null, NETWORK_CLIENT_OKHTTP, 54, null);
        }
        okHttp3Client$execute$1 = new com.unity3d.services.core.network.core.OkHttp3Client$execute$1(this, continuation);
        java.lang.Object obj2 = okHttp3Client$execute$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = okHttp3Client$execute$1.label;
    }
}
