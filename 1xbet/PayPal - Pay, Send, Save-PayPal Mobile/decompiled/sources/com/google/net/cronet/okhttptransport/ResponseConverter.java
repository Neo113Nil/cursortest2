package com.google.net.cronet.okhttptransport;

/* loaded from: classes4.dex */
final class ResponseConverter {
    private static final com.google.common.collect.ImmutableSet ENCODINGS_HANDLED_BY_CRONET = com.google.common.collect.ImmutableSet.of("br", "deflate", com.statsig.androidsdk.HttpUtils.ENCODING_GZIP, "x-gzip");
    private static final com.google.common.base.Splitter COMMA_SPLITTER = com.google.common.base.Splitter.on(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA).trimResults().omitEmptyStrings();

    ResponseConverter() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: toResponse, reason: merged with bridge method [inline-methods] */
    public final okhttp3.Response lambda$toResponseAsync$0(okhttp3.Request request, com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback okHttpBridgeRequestCallback) throws java.io.IOException {
        org.chromium.net.UrlResponseInfo urlResponseInfo = (org.chromium.net.UrlResponseInfo) getFutureValue(okHttpBridgeRequestCallback.getUrlResponseInfo());
        okhttp3.Response.Builder createResponse = createResponse(request, urlResponseInfo, (okio.Source) getFutureValue(okHttpBridgeRequestCallback.getBodySource()));
        java.util.List urlResponseInfoChain = okHttpBridgeRequestCallback.getUrlResponseInfoChain();
        java.util.List<java.lang.String> urlChain = urlResponseInfo.getUrlChain();
        if (!urlResponseInfoChain.isEmpty()) {
            com.google.common.base.Preconditions.checkArgument(urlChain.size() == urlResponseInfoChain.size() + 1, "The number of redirects should be consistent across URLs and headers!");
            okhttp3.Response response = null;
            for (int i = 0; i < urlResponseInfoChain.size(); i++) {
                response = createResponse(request.newBuilder().url(urlChain.get(i)).build(), (org.chromium.net.UrlResponseInfo) urlResponseInfoChain.get(i), null).priorResponse(response).build();
            }
            createResponse.request(request.newBuilder().url((java.lang.String) com.google.common.collect.Iterables.getLast(urlChain)).build()).priorResponse(response);
        }
        return createResponse.build();
    }

    final com.google.common.util.concurrent.ListenableFuture toResponseAsync(final okhttp3.Request request, final com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback okHttpBridgeRequestCallback) {
        return com.google.common.util.concurrent.Futures.whenAllComplete(okHttpBridgeRequestCallback.getUrlResponseInfo(), okHttpBridgeRequestCallback.getBodySource()).call(new java.util.concurrent.Callable() { // from class: com.google.net.cronet.okhttptransport.ResponseConverter$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                okhttp3.Response lambda$toResponseAsync$0;
                lambda$toResponseAsync$0 = com.google.net.cronet.okhttptransport.ResponseConverter.this.lambda$toResponseAsync$0(request, okHttpBridgeRequestCallback);
                return lambda$toResponseAsync$0;
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
    }

    private static okhttp3.Response.Builder createResponse(okhttp3.Request request, org.chromium.net.UrlResponseInfo urlResponseInfo, @javax.annotation.Nullable okio.Source source) throws java.io.IOException {
        okhttp3.Response.Builder builder = new okhttp3.Response.Builder();
        java.lang.String lastHeaderValue = getLastHeaderValue("Content-Type", urlResponseInfo);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.List) getOrDefault(urlResponseInfo.getAllHeaders(), "Content-Encoding", java.util.Collections.emptyList())).iterator();
        while (it.hasNext()) {
            com.google.common.collect.Iterables.addAll(arrayList, COMMA_SPLITTER.split((java.lang.String) it.next()));
        }
        boolean z = true;
        if (!arrayList.isEmpty() && ENCODINGS_HANDLED_BY_CRONET.containsAll(arrayList)) {
            z = false;
        }
        builder.request(request).code(urlResponseInfo.getHttpStatusCode()).message(urlResponseInfo.getHttpStatusText()).protocol(convertProtocol(urlResponseInfo.getNegotiatedProtocol())).body(source != null ? createResponseBody(request, urlResponseInfo.getHttpStatusCode(), lastHeaderValue, z ? getLastHeaderValue("Content-Length", urlResponseInfo) : null, source) : null);
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : urlResponseInfo.getAllHeadersAsList()) {
            if (z || (!com.google.common.base.Ascii.equalsIgnoreCase(entry.getKey(), "Content-Length") && !com.google.common.base.Ascii.equalsIgnoreCase(entry.getKey(), "Content-Encoding"))) {
                builder.addHeader(entry.getKey(), entry.getValue());
            }
        }
        return builder;
    }

    private static okhttp3.ResponseBody createResponseBody(okhttp3.Request request, int i, @javax.annotation.Nullable java.lang.String str, @javax.annotation.Nullable java.lang.String str2, okio.Source source) throws java.io.IOException {
        long j;
        if (request.method().equals(com.datadog.android.internal.network.HttpSpec.Method.HEAD)) {
            j = 0;
        } else {
            j = -1;
            if (str2 != null) {
                try {
                    j = java.lang.Long.parseLong(str2);
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        if ((i == 204 || i == 205) && j > 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HTTP ".length() + java.lang.String.valueOf(i).length() + " had non-zero Content-Length: ".length() + java.lang.String.valueOf(str2).length());
            sb.append("HTTP ");
            sb.append(i);
            sb.append(" had non-zero Content-Length: ");
            sb.append(str2);
            throw new java.net.ProtocolException(sb.toString());
        }
        return okhttp3.ResponseBody.create(str != null ? okhttp3.MediaType.parse(str) : null, j, okio.Okio.buffer(source));
    }

    private static okhttp3.Protocol convertProtocol(java.lang.String str) {
        if (str.contains("quic")) {
            return okhttp3.Protocol.QUIC;
        }
        if (str.contains("h3")) {
            return okhttp3.Protocol.QUIC;
        }
        if (str.contains("spdy")) {
            return okhttp3.Protocol.HTTP_2;
        }
        if (str.contains("h2")) {
            return okhttp3.Protocol.HTTP_2;
        }
        if (str.contains("http/1.1")) {
            return okhttp3.Protocol.HTTP_1_1;
        }
        return okhttp3.Protocol.HTTP_1_0;
    }

    @javax.annotation.Nullable
    private static java.lang.String getLastHeaderValue(java.lang.String str, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        java.util.List<java.lang.String> list = urlResponseInfo.getAllHeaders().get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (java.lang.String) com.google.common.collect.Iterables.getLast(list);
    }

    private static java.lang.Object getFutureValue(java.util.concurrent.Future future) throws java.io.IOException {
        try {
            return com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(future);
        } catch (java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private static java.lang.Object getOrDefault(java.util.Map map, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = map.get(obj);
        return obj3 == null ? com.google.common.base.Preconditions.checkNotNull(obj2) : obj3;
    }
}
