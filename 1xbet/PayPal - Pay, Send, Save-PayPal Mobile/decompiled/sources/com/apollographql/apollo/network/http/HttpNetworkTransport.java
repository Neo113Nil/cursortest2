package com.apollographql.apollo.network.http;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 12\u00020\u0001:\u00042341B/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0011\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0011\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0013\u0010\u0019J5\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u0005\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010$\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010-\u001a\u00060/R\u00020\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u00100"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport;", "Lcom/apollographql/apollo/network/NetworkTransport;", "Lcom/apollographql/apollo/api/http/HttpRequestComposer;", "p0", "Lcom/apollographql/apollo/network/http/HttpEngine;", "p1", "", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "p2", "", "p3", "<init>", "(Lcom/apollographql/apollo/api/http/HttpRequestComposer;Lcom/apollographql/apollo/network/http/HttpEngine;Ljava/util/List;Z)V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "execute", "(Lcom/apollographql/apollo/api/ApolloRequest;)Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/http/HttpRequest;", "httpRequest", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "(Lcom/apollographql/apollo/api/ApolloRequest;Lcom/apollographql/apollo/api/http/HttpRequest;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/Operation;", "", "Camera2StreamConfigurationMap", "(Lcom/apollographql/apollo/api/Operation;Ljava/lang/Throwable;)Lcom/apollographql/apollo/api/ApolloResponse;", "", "dispose", "()V", "Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;", "newBuilder", "()Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/api/http/HttpRequestComposer;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/network/http/HttpEngine;", "interceptors", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Z", "Lcom/apollographql/apollo/network/http/HttpNetworkTransport$EngineInterceptor;", "Lcom/apollographql/apollo/network/http/HttpNetworkTransport$EngineInterceptor;", "Companion", coil3.intercept.EngineInterceptor.TAG, "Builder", "TransportHeadersInterceptor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpNetworkTransport implements com.apollographql.apollo.network.NetworkTransport {
    private static final com.apollographql.apollo.network.http.HttpNetworkTransport.Companion Companion = new com.apollographql.apollo.network.http.HttpNetworkTransport.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.http.HttpNetworkTransport.EngineInterceptor getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.http.HttpEngine Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.http.HttpRequestComposer getHighSpeedVideoFpsRanges;
    private final java.util.List<com.apollographql.apollo.network.http.HttpInterceptor> interceptors;

    /* JADX WARN: Multi-variable type inference failed */
    private HttpNetworkTransport(com.apollographql.apollo.api.http.HttpRequestComposer httpRequestComposer, com.apollographql.apollo.network.http.HttpEngine httpEngine, java.util.List<? extends com.apollographql.apollo.network.http.HttpInterceptor> list, boolean z) {
        this.getHighSpeedVideoFpsRanges = httpRequestComposer;
        this.Camera2StreamConfigurationMap = httpEngine;
        this.interceptors = list;
        this.getHighSpeedVideoSizes = z;
        this.getHighResolutionOutputSizeshNQ4ISI = new com.apollographql.apollo.network.http.HttpNetworkTransport.EngineInterceptor();
    }

    public final java.util.List<com.apollographql.apollo.network.http.HttpInterceptor> getInterceptors() {
        return this.interceptors;
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> execute(com.apollographql.apollo.api.ApolloRequest<D> request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        com.apollographql.apollo.api.ExecutionContext.Element element = request.getExecutionContext().get(com.apollographql.apollo.api.CustomScalarAdapters.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(element);
        return execute(request, this.getHighSpeedVideoFpsRanges.compose(request), (com.apollographql.apollo.api.CustomScalarAdapters) element);
    }

    public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> execute(com.apollographql.apollo.api.ApolloRequest<D> request, com.apollographql.apollo.api.http.HttpRequest httpRequest, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1(this, httpRequest, request, customScalarAdapters, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloResponse<D> Camera2StreamConfigurationMap(com.apollographql.apollo.api.Operation<D> p0, java.lang.Throwable p1) {
        com.apollographql.apollo.exception.ApolloNetworkException apolloNetworkException;
        if (p1 instanceof com.apollographql.apollo.exception.ApolloException) {
            apolloNetworkException = (com.apollographql.apollo.exception.ApolloException) p1;
        } else {
            apolloNetworkException = new com.apollographql.apollo.exception.ApolloNetworkException("Error while reading JSON response", p1);
        }
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "");
        return new com.apollographql.apollo.api.ApolloResponse.Builder(p0, randomUUID).exception(apolloNetworkException).isLast(true).build();
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport$EngineInterceptor;", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "<init>", "(Lcom/apollographql/apollo/network/http/HttpNetworkTransport;)V", "Lcom/apollographql/apollo/api/http/HttpRequest;", "request", "Lcom/apollographql/apollo/network/http/HttpInterceptorChain;", "chain", "Lcom/apollographql/apollo/api/http/HttpResponse;", "intercept", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lcom/apollographql/apollo/network/http/HttpInterceptorChain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class EngineInterceptor implements com.apollographql.apollo.network.http.HttpInterceptor {
        public EngineInterceptor() {
        }

        @Override // com.apollographql.apollo.network.http.HttpInterceptor
        public final java.lang.Object intercept(com.apollographql.apollo.api.http.HttpRequest httpRequest, com.apollographql.apollo.network.http.HttpInterceptorChain httpInterceptorChain, kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.http.HttpResponse> continuation) {
            return com.apollographql.apollo.network.http.HttpNetworkTransport.this.Camera2StreamConfigurationMap.execute(httpRequest, continuation);
        }
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public final void dispose() {
        java.util.Iterator<T> it = this.interceptors.iterator();
        while (it.hasNext()) {
            ((com.apollographql.apollo.network.http.HttpInterceptor) it.next()).dispose();
        }
        this.Camera2StreamConfigurationMap.close();
    }

    public final com.apollographql.apollo.network.http.HttpNetworkTransport.Builder newBuilder() {
        return new com.apollographql.apollo.network.http.HttpNetworkTransport.Builder().httpEngine(this.Camera2StreamConfigurationMap).interceptors(this.interceptors).httpRequestComposer(this.getHighSpeedVideoFpsRanges).exposeErrorBody(this.getHighSpeedVideoSizes);
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011¢\u0006\u0004\b\u001a\u0010\u0015J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010*"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/http/HttpRequestComposer;", "httpRequestComposer", "(Lcom/apollographql/apollo/api/http/HttpRequestComposer;)Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;", "", "serverUrl", "(Ljava/lang/String;)Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;", "", "exposeErrorBody", "(Z)Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addHttpHeader", "(Ljava/lang/String;Ljava/lang/String;)Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "headers", "httpHeaders", "(Ljava/util/List;)Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;", "Lcom/apollographql/apollo/network/http/HttpEngine;", "httpEngine", "(Lcom/apollographql/apollo/network/http/HttpEngine;)Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "interceptors", "interceptor", "addInterceptor", "(Lcom/apollographql/apollo/network/http/HttpInterceptor;)Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;", "Lcom/apollographql/apollo/network/http/HttpNetworkTransport;", "build", "()Lcom/apollographql/apollo/network/http/HttpNetworkTransport;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/api/http/HttpRequestComposer;", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/network/http/HttpEngine;", "getHighSpeedVideoSizes", "", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Z", "getInputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private com.apollographql.apollo.api.http.HttpRequestComposer getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private com.apollographql.apollo.network.http.HttpEngine getHighSpeedVideoSizes;
        private boolean getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.util.List<com.apollographql.apollo.network.http.HttpInterceptor> Camera2StreamConfigurationMap = new java.util.ArrayList();

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.util.List<com.apollographql.apollo.api.http.HttpHeader> getInputFormats = new java.util.ArrayList();

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        public final com.apollographql.apollo.network.http.HttpNetworkTransport.Builder httpRequestComposer(com.apollographql.apollo.api.http.HttpRequestComposer httpRequestComposer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestComposer, "");
            this.getHighSpeedVideoFpsRangesFor = httpRequestComposer;
            return this;
        }

        public final com.apollographql.apollo.network.http.HttpNetworkTransport.Builder serverUrl(java.lang.String serverUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverUrl, "");
            this.getHighResolutionOutputSizeshNQ4ISI = serverUrl;
            return this;
        }

        public final com.apollographql.apollo.network.http.HttpNetworkTransport.Builder exposeErrorBody(boolean exposeErrorBody) {
            this.getHighSpeedVideoFpsRanges = exposeErrorBody;
            return this;
        }

        @kotlin.Deprecated(message = "Use ApolloClient.Builder.addHttpHeader() instead")
        public final com.apollographql.apollo.network.http.HttpNetworkTransport.Builder addHttpHeader(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.getInputFormats.add(new com.apollographql.apollo.api.http.HttpHeader(name2, value));
            return this;
        }

        @kotlin.Deprecated(message = "Use ApolloClient.Builder.httpHeader() instead")
        public final com.apollographql.apollo.network.http.HttpNetworkTransport.Builder httpHeaders(java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            kotlin.collections.CollectionsKt.removeAll((java.util.List) this.Camera2StreamConfigurationMap, new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.network.http.HttpNetworkTransport$Builder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(com.apollographql.apollo.network.http.HttpNetworkTransport.Builder.$r8$lambda$C3KPniO8Owo7RXNtD5km8sPs5IU((com.apollographql.apollo.network.http.HttpInterceptor) obj));
                }
            });
            this.getInputFormats.clear();
            this.getInputFormats.addAll(headers);
            return this;
        }

        public final com.apollographql.apollo.network.http.HttpNetworkTransport.Builder httpEngine(com.apollographql.apollo.network.http.HttpEngine httpEngine) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpEngine, "");
            this.getHighSpeedVideoSizes = httpEngine;
            return this;
        }

        public final com.apollographql.apollo.network.http.HttpNetworkTransport.Builder interceptors(java.util.List<? extends com.apollographql.apollo.network.http.HttpInterceptor> interceptors) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptors, "");
            this.Camera2StreamConfigurationMap.clear();
            this.Camera2StreamConfigurationMap.addAll(interceptors);
            return this;
        }

        public final com.apollographql.apollo.network.http.HttpNetworkTransport.Builder addInterceptor(com.apollographql.apollo.network.http.HttpInterceptor interceptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptor, "");
            this.Camera2StreamConfigurationMap.add(interceptor);
            return this;
        }

        public final com.apollographql.apollo.network.http.HttpNetworkTransport build() {
            com.apollographql.apollo.api.http.DefaultHttpRequestComposer defaultHttpRequestComposer = this.getHighSpeedVideoFpsRangesFor;
            if (defaultHttpRequestComposer != null && this.getHighResolutionOutputSizeshNQ4ISI != null) {
                throw new java.lang.IllegalStateException("It is an error to set both 'httpRequestComposer' and 'serverUrl'".toString());
            }
            if (defaultHttpRequestComposer == null) {
                java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
                com.apollographql.apollo.api.http.DefaultHttpRequestComposer defaultHttpRequestComposer2 = str != null ? new com.apollographql.apollo.api.http.DefaultHttpRequestComposer(str) : null;
                if (defaultHttpRequestComposer2 != null) {
                    defaultHttpRequestComposer = defaultHttpRequestComposer2;
                } else {
                    throw new java.lang.IllegalStateException("No HttpRequestComposer found. Use 'httpRequestComposer' or 'serverUrl'".toString());
                }
            }
            com.apollographql.apollo.api.http.HttpRequestComposer httpRequestComposer = defaultHttpRequestComposer;
            if (!this.getInputFormats.isEmpty()) {
                this.Camera2StreamConfigurationMap.add(new com.apollographql.apollo.network.http.HttpNetworkTransport.TransportHeadersInterceptor(this.getInputFormats));
            }
            com.apollographql.apollo.network.http.HttpEngine httpEngine = this.getHighSpeedVideoSizes;
            if (httpEngine == null) {
                httpEngine = com.apollographql.apollo.network.http.DefaultHttpEngine.DefaultHttpEngine$default(0L, 1, null);
            }
            return new com.apollographql.apollo.network.http.HttpNetworkTransport(httpRequestComposer, httpEngine, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, null);
        }

        public static /* synthetic */ boolean $r8$lambda$C3KPniO8Owo7RXNtD5km8sPs5IU(com.apollographql.apollo.network.http.HttpInterceptor httpInterceptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpInterceptor, "");
            return httpInterceptor instanceof com.apollographql.apollo.network.http.HttpNetworkTransport.TransportHeadersInterceptor;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport$TransportHeadersInterceptor;", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "p0", "<init>", "(Ljava/util/List;)V", "Lcom/apollographql/apollo/api/http/HttpRequest;", "Lcom/apollographql/apollo/network/http/HttpInterceptorChain;", "p1", "Lcom/apollographql/apollo/api/http/HttpResponse;", "intercept", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lcom/apollographql/apollo/network/http/HttpInterceptorChain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class TransportHeadersInterceptor implements com.apollographql.apollo.network.http.HttpInterceptor {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.util.List<com.apollographql.apollo.api.http.HttpHeader> getHighSpeedVideoFpsRangesFor;

        public TransportHeadersInterceptor(java.util.List<com.apollographql.apollo.api.http.HttpHeader> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.getHighSpeedVideoFpsRangesFor = list;
        }

        @Override // com.apollographql.apollo.network.http.HttpInterceptor
        public final java.lang.Object intercept(com.apollographql.apollo.api.http.HttpRequest httpRequest, com.apollographql.apollo.network.http.HttpInterceptorChain httpInterceptorChain, kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.http.HttpResponse> continuation) {
            return httpInterceptorChain.proceed(com.apollographql.apollo.api.http.HttpRequest.newBuilder$default(httpRequest, null, null, 3, null).addHeaders(this.getHighSpeedVideoFpsRangesFor).build(), continuation);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Companion;", "", "<init>", "()V", "Kind"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Companion$Kind;", "", "<init>", "(Ljava/lang/String;I)V", "EMPTY", com.zettle.sdk.commons.network.JsonKt.KEY_PAYLOAD, "OTHER"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class Kind {
            private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
            public static final com.apollographql.apollo.network.http.HttpNetworkTransport.Companion.Kind EMPTY;
            public static final com.apollographql.apollo.network.http.HttpNetworkTransport.Companion.Kind OTHER;
            public static final com.apollographql.apollo.network.http.HttpNetworkTransport.Companion.Kind PAYLOAD;
            private static final /* synthetic */ com.apollographql.apollo.network.http.HttpNetworkTransport.Companion.Kind[] getHighSpeedVideoFpsRangesFor;

            private Kind(java.lang.String str, int i) {
            }

            static {
                com.apollographql.apollo.network.http.HttpNetworkTransport.Companion.Kind kind = new com.apollographql.apollo.network.http.HttpNetworkTransport.Companion.Kind("EMPTY", 0);
                EMPTY = kind;
                com.apollographql.apollo.network.http.HttpNetworkTransport.Companion.Kind kind2 = new com.apollographql.apollo.network.http.HttpNetworkTransport.Companion.Kind(com.zettle.sdk.commons.network.JsonKt.KEY_PAYLOAD, 1);
                PAYLOAD = kind2;
                com.apollographql.apollo.network.http.HttpNetworkTransport.Companion.Kind kind3 = new com.apollographql.apollo.network.http.HttpNetworkTransport.Companion.Kind("OTHER", 2);
                OTHER = kind3;
                com.apollographql.apollo.network.http.HttpNetworkTransport.Companion.Kind[] kindArr = {kind, kind2, kind3};
                getHighSpeedVideoFpsRangesFor = kindArr;
                Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(kindArr);
            }

            public static com.apollographql.apollo.network.http.HttpNetworkTransport.Companion.Kind valueOf(java.lang.String str) {
                return (com.apollographql.apollo.network.http.HttpNetworkTransport.Companion.Kind) java.lang.Enum.valueOf(com.apollographql.apollo.network.http.HttpNetworkTransport.Companion.Kind.class, str);
            }

            public static com.apollographql.apollo.network.http.HttpNetworkTransport.Companion.Kind[] values() {
                return (com.apollographql.apollo.network.http.HttpNetworkTransport.Companion.Kind[]) getHighSpeedVideoFpsRangesFor.clone();
            }

            public static kotlin.enums.EnumEntries<com.apollographql.apollo.network.http.HttpNetworkTransport.Companion.Kind> getEntries() {
                return Camera2StreamConfigurationMap;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.Flow access$errorResponse(com.apollographql.apollo.network.http.HttpNetworkTransport httpNetworkTransport, com.apollographql.apollo.api.Operation operation, com.apollographql.apollo.api.http.HttpResponse httpResponse) {
        okio.BufferedSource bufferedSource;
        if (httpNetworkTransport.getHighSpeedVideoSizes) {
            bufferedSource = httpResponse.getBody();
        } else {
            okio.BufferedSource body = httpResponse.getBody();
            if (body != null) {
                body.close();
            }
            bufferedSource = null;
        }
        okio.BufferedSource bufferedSource2 = bufferedSource;
        int statusCode = httpResponse.getStatusCode();
        java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers = httpResponse.getHeaders();
        int statusCode2 = httpResponse.getStatusCode();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Http request failed with status code `");
        sb.append(statusCode2);
        sb.append("`");
        return kotlinx.coroutines.flow.FlowKt.flowOf(Camera2StreamConfigurationMap(operation, new com.apollographql.apollo.exception.ApolloHttpException(statusCode, headers, bufferedSource2, sb.toString(), null, 16, null)));
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.Flow access$multipleResponses(final com.apollographql.apollo.network.http.HttpNetworkTransport httpNetworkTransport, final com.apollographql.apollo.api.Operation operation, final com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.apollographql.apollo.api.http.HttpResponse httpResponse) {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        final kotlinx.coroutines.flow.Flow<okio.BufferedSource> multipartBodyFlow = com.apollographql.apollo.internal.MultipartKt.multipartBodyFlow(httpResponse);
        return kotlinx.coroutines.flow.FlowKt.m24097catch(new kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>>() { // from class: com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1.AnonymousClass2(flowCollector, operation, customScalarAdapters, httpNetworkTransport, objectRef), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;
                final /* synthetic */ com.apollographql.apollo.api.Operation getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef getHighSpeedVideoFpsRanges;
                final /* synthetic */ com.apollographql.apollo.api.CustomScalarAdapters getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ com.apollographql.apollo.network.http.HttpNetworkTransport getHighSpeedVideoSizes;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoSizes -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoSizes;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                okio.BufferedSource bufferedSource = (okio.BufferedSource) obj;
                                com.apollographql.apollo.api.ApolloResponse apolloResponse = null;
                                if (this.getHighResolutionOutputSizeshNQ4ISI instanceof com.apollographql.apollo.api.Subscription) {
                                    com.apollographql.apollo.api.json.JsonReader jsonReader = com.apollographql.apollo.api.json.JsonReaders.jsonReader(bufferedSource);
                                    jsonReader.beginObject();
                                    java.util.List<com.apollographql.apollo.api.Error> list = null;
                                    com.apollographql.apollo.api.ApolloResponse apolloResponse2 = null;
                                    while (jsonReader.hasNext()) {
                                        java.lang.String nextName = jsonReader.nextName();
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(nextName, "payload")) {
                                            if (jsonReader.getCamera2StreamConfigurationMap() == com.apollographql.apollo.api.json.JsonReader.Token.NULL) {
                                                jsonReader.skipValue();
                                            } else {
                                                apolloResponse2 = com.apollographql.apollo.api.Operations.parseResponse$default(jsonReader, this.getHighResolutionOutputSizeshNQ4ISI, (java.util.UUID) null, this.getHighSpeedVideoFpsRangesFor, (java.util.Set) null, 2, (java.lang.Object) null);
                                            }
                                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(nextName, com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY)) {
                                            if (jsonReader.getCamera2StreamConfigurationMap() == com.apollographql.apollo.api.json.JsonReader.Token.NULL) {
                                                jsonReader.skipValue();
                                            } else {
                                                list = com.apollographql.apollo.api.internal.ResponseParserKt.readErrors(jsonReader);
                                            }
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    }
                                    jsonReader.endObject();
                                    if (list != null) {
                                        com.apollographql.apollo.network.http.HttpNetworkTransport httpNetworkTransport = this.getHighSpeedVideoSizes;
                                        apolloResponse = com.apollographql.apollo.network.http.HttpNetworkTransport.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, new com.apollographql.apollo.exception.RouterError(list));
                                    } else if (apolloResponse2 != null) {
                                        apolloResponse = apolloResponse2;
                                    }
                                } else {
                                    if (this.getHighSpeedVideoFpsRanges.element == null) {
                                        this.getHighSpeedVideoFpsRanges.element = (T) new com.apollographql.apollo.internal.DeferredJsonMerger();
                                    }
                                    java.util.Map<java.lang.String, java.lang.Object> merge = ((com.apollographql.apollo.internal.DeferredJsonMerger) this.getHighSpeedVideoFpsRanges.element).merge(bufferedSource);
                                    java.util.Set<com.apollographql.apollo.api.DeferredFragmentIdentifier> mergedFragmentIds = ((com.apollographql.apollo.internal.DeferredJsonMerger) this.getHighSpeedVideoFpsRanges.element).getMergedFragmentIds();
                                    boolean hasNext = ((com.apollographql.apollo.internal.DeferredJsonMerger) this.getHighSpeedVideoFpsRanges.element).getHasNext();
                                    if (!((com.apollographql.apollo.internal.DeferredJsonMerger) this.getHighSpeedVideoFpsRanges.element).getIsEmptyPayload()) {
                                        apolloResponse = com.apollographql.apollo.api.Operations.toApolloResponse$default(com.apollographql.apollo.api.json.JsonReaders.jsonReader((java.util.Map<java.lang.String, ? extends java.lang.Object>) merge), this.getHighResolutionOutputSizeshNQ4ISI, null, this.getHighSpeedVideoFpsRangesFor, mergedFragmentIds, 2, null).newBuilder().isLast(!hasNext).build();
                                    }
                                }
                                if (apolloResponse != null) {
                                    anonymousClass1.getHighSpeedVideoSizes = 1;
                                    if (flowCollector.emit(apolloResponse, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoSizes;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2", f = "HttpNetworkTransport.kt", i = {}, l = {112}, m = "emit", n = {}, s = {})
                /* renamed from: com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighResolutionOutputSizeshNQ4ISI = obj;
                        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
                        return com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.apollographql.apollo.api.Operation operation, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.apollographql.apollo.network.http.HttpNetworkTransport httpNetworkTransport, kotlin.jvm.internal.Ref.ObjectRef objectRef) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                    this.getHighResolutionOutputSizeshNQ4ISI = operation;
                    this.getHighSpeedVideoFpsRangesFor = customScalarAdapters;
                    this.getHighSpeedVideoSizes = httpNetworkTransport;
                    this.getHighSpeedVideoFpsRanges = objectRef;
                }
            }
        }, new com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$2(operation, httpNetworkTransport, null));
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.Flow access$singleResponse(com.apollographql.apollo.network.http.HttpNetworkTransport httpNetworkTransport, com.apollographql.apollo.api.Operation operation, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.apollographql.apollo.api.http.HttpResponse httpResponse) {
        okio.BufferedSource body = httpResponse.getBody();
        kotlin.jvm.internal.Intrinsics.checkNotNull(body);
        return kotlinx.coroutines.flow.FlowKt.flowOf(com.apollographql.apollo.api.Operations.toApolloResponse$default(com.apollographql.apollo.api.json.JsonReaders.jsonReader(body), operation, null, customScalarAdapters, null, 2, null).newBuilder().isLast(true).build());
    }

    public static final /* synthetic */ com.apollographql.apollo.api.ApolloResponse access$withHttpInfo(com.apollographql.apollo.network.http.HttpNetworkTransport httpNetworkTransport, com.apollographql.apollo.api.ApolloResponse apolloResponse, java.util.UUID uuid, com.apollographql.apollo.api.http.HttpResponse httpResponse, long j) {
        com.apollographql.apollo.api.ApolloResponse.Builder requestUuid = apolloResponse.newBuilder().requestUuid(uuid);
        if (httpResponse != null) {
            requestUuid.addExecutionContext(new com.apollographql.apollo.network.http.HttpInfo(j, com.apollographql.apollo.mpp.UtilsKt.currentTimeMillis(), httpResponse.getStatusCode(), httpResponse.getHeaders()));
        }
        return requestUuid.build();
    }

    public static final /* synthetic */ com.apollographql.apollo.exception.ApolloException access$wrapIfNeeded(com.apollographql.apollo.network.http.HttpNetworkTransport httpNetworkTransport, java.lang.Throwable th) {
        if (th instanceof com.apollographql.apollo.exception.ApolloException) {
            return (com.apollographql.apollo.exception.ApolloException) th;
        }
        return new com.apollographql.apollo.exception.ApolloNetworkException("Error while reading response", th);
    }

    public /* synthetic */ HttpNetworkTransport(com.apollographql.apollo.api.http.HttpRequestComposer httpRequestComposer, com.apollographql.apollo.network.http.HttpEngine httpEngine, java.util.List list, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(httpRequestComposer, httpEngine, list, z);
    }
}
