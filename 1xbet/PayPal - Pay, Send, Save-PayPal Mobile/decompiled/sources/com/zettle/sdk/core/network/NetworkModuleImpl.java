package com.zettle.sdk.core.network;

@kotlin.Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJe\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00120\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020#0-8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u00020#8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00104\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R@\u0010=\u001a.\u0012\b\u0012\u0006*\u00020\u00130\u0013\u0012\b\u0012\u0006*\u00020909*\u0016\u0012\b\u0012\u0006*\u00020\u00130\u0013\u0012\b\u0012\u0006*\u000209090:088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010;\u001a\u00020>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010?R\u0018\u0010A\u001a\u0006*\u00020@0@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010C\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010G"}, d2 = {"Lcom/zettle/sdk/core/network/NetworkModuleImpl;", "Lcom/zettle/sdk/core/network/NetworkModule;", "Lcom/zettle/sdk/core/log/Loggable;", "Lokhttp3/OkHttpClient;", "rootHttpClient", "Landroid/net/ConnectivityManager;", "connectivityManager", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "serviceProvider", "Lcom/izettle/android/auth/BackendEnvironment;", "environment", "<init>", "(Lokhttp3/OkHttpClient;Landroid/net/ConnectivityManager;Lcom/zettle/sdk/core/auth/ServiceProvider;Lcom/izettle/android/auth/BackendEnvironment;)V", "Lcom/zettle/sdk/commons/network/Service;", "url", "Lcom/zettle/sdk/commons/network/Scope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "", "Lkotlin/Pair;", "", "headers", "singleInstanceKey", "", "connectTimeoutSeconds", "readTimeoutSeconds", "writeTimeoutSeconds", "callTimeoutSeconds", "Lcom/zettle/sdk/commons/network/NetworkClient;", "createNetworkClient", "(Lcom/zettle/sdk/commons/network/Service;Lcom/zettle/sdk/commons/network/Scope;Ljava/util/List;Ljava/lang/String;JJJLjava/lang/Long;)Lcom/zettle/sdk/commons/network/NetworkClient;", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "stop", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zettle/sdk/core/network/Connection;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lokhttp3/OkHttpClient$Builder;", "getBuilder", "()Lokhttp3/OkHttpClient$Builder;", "builder", "getClient", "()Lokhttp3/OkHttpClient;", "client", "Lkotlinx/coroutines/flow/Flow;", "getConnected", "()Lkotlinx/coroutines/flow/Flow;", "connected", "getConnection", "()Lcom/zettle/sdk/core/network/Connection;", "connection", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/net/ConnectivityManager;", "getHighSpeedVideoFpsRanges", "Lcom/izettle/android/auth/BackendEnvironment;", "", "Lcom/zettle/sdk/commons/network/ServiceUrl;", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/core/network/NetworkModuleImpl$networkCallback$1;", "Lcom/zettle/sdk/core/network/NetworkModuleImpl$networkCallback$1;", "Landroid/net/NetworkRequest;", "getHighSpeedVideoSizesFor", "Landroid/net/NetworkRequest;", "getOutputMinFrameDuration", "Lokhttp3/OkHttpClient;", "getOutputFormats", "getInputFormats", "Lcom/zettle/sdk/core/auth/ServiceProvider;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkModuleImpl implements com.zettle.sdk.core.network.NetworkModule, com.zettle.sdk.core.log.Loggable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.core.network.NetworkModuleImpl$networkCallback$1 getHighSpeedVideoSizes;
    private final android.net.ConnectivityManager getHighResolutionOutputSizeshNQ4ISI;
    private final com.izettle.android.auth.BackendEnvironment getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.zettle.sdk.core.network.Connection> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.zettle.sdk.commons.network.ServiceUrl> Camera2StreamConfigurationMap;
    private final android.net.NetworkRequest getHighSpeedVideoSizesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.zettle.sdk.core.auth.ServiceProvider getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final okhttp3.OkHttpClient getOutputFormats;

    /* JADX WARN: Type inference failed for: r2v10, types: [com.zettle.sdk.core.network.NetworkModuleImpl$networkCallback$1] */
    public NetworkModuleImpl(okhttp3.OkHttpClient okHttpClient, android.net.ConnectivityManager connectivityManager, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, com.izettle.android.auth.BackendEnvironment backendEnvironment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectivityManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceProvider, "");
        this.getOutputFormats = okHttpClient;
        this.getHighResolutionOutputSizeshNQ4ISI = connectivityManager;
        this.getOutputMinFrameDuration = serviceProvider;
        this.getHighSpeedVideoFpsRanges = backendEnvironment;
        this.Camera2StreamConfigurationMap = java.util.Collections.synchronizedMap(new com.zettle.sdk.core.network.FixedSizeLinkedHashMap());
        this.getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.zettle.sdk.core.network.Connection.Disconnected.INSTANCE);
        this.getHighSpeedVideoSizesFor = new android.net.NetworkRequest.Builder().addCapability(12).addCapability(16).build();
        this.getHighSpeedVideoSizes = new android.net.ConnectivityManager.NetworkCallback() { // from class: com.zettle.sdk.core.network.NetworkModuleImpl$networkCallback$1

            /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
            private final java.util.Map<android.net.Network, android.net.NetworkCapabilities> getHighSpeedVideoSizes = new java.util.LinkedHashMap();

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(android.net.Network network) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
                com.zettle.sdk.core.log.LogKt.log(com.zettle.sdk.core.network.NetworkModuleImpl.this, "[Network] onAvailable ".concat(java.lang.String.valueOf(network)));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkCapabilities, "");
                com.zettle.sdk.core.network.NetworkModuleImpl networkModuleImpl = com.zettle.sdk.core.network.NetworkModuleImpl.this;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("[Network] onCapabilitiesChanged ");
                sb.append(network);
                sb.append(": ");
                sb.append(networkCapabilities);
                com.zettle.sdk.core.log.LogKt.log(networkModuleImpl, sb.toString());
                this.getHighSpeedVideoSizes.put(network, networkCapabilities);
                mutableStateFlow = com.zettle.sdk.core.network.NetworkModuleImpl.this.getHighSpeedVideoFpsRangesFor;
                mutableStateFlow.tryEmit(getHighResolutionOutputSizeshNQ4ISI());
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(android.net.Network network) {
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
                com.zettle.sdk.core.log.LogKt.log(com.zettle.sdk.core.network.NetworkModuleImpl.this, "[Network] onLost ".concat(java.lang.String.valueOf(network)));
                this.getHighSpeedVideoSizes.remove(network);
                mutableStateFlow = com.zettle.sdk.core.network.NetworkModuleImpl.this.getHighSpeedVideoFpsRangesFor;
                mutableStateFlow.tryEmit(getHighResolutionOutputSizeshNQ4ISI());
            }

            private final com.zettle.sdk.core.network.Connection getHighResolutionOutputSizeshNQ4ISI() {
                java.util.Collection<android.net.NetworkCapabilities> values = this.getHighSpeedVideoSizes.values();
                com.zettle.sdk.core.network.NetworkModuleImpl networkModuleImpl = com.zettle.sdk.core.network.NetworkModuleImpl.this;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(values, 10));
                java.util.Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.zettle.sdk.core.network.NetworkModuleImpl.access$getType(networkModuleImpl, (android.net.NetworkCapabilities) it.next()));
                }
                return arrayList.contains(com.zettle.sdk.core.network.Connection.Connected.INSTANCE) ? com.zettle.sdk.core.network.Connection.Connected.INSTANCE : com.zettle.sdk.core.network.Connection.Disconnected.INSTANCE;
            }
        };
    }

    public /* synthetic */ NetworkModuleImpl(okhttp3.OkHttpClient okHttpClient, android.net.ConnectivityManager connectivityManager, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, com.izettle.android.auth.BackendEnvironment backendEnvironment, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(okHttpClient, connectivityManager, serviceProvider, (i & 8) != 0 ? null : backendEnvironment);
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.core.network.NetworkModule
    public final kotlinx.coroutines.flow.Flow<com.zettle.sdk.core.network.Connection> getConnected() {
        return kotlinx.coroutines.flow.FlowKt.asSharedFlow(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // com.zettle.sdk.core.network.NetworkModule
    /* renamed from: getClient, reason: from getter */
    public final okhttp3.OkHttpClient getGetOutputFormats() {
        return this.getOutputFormats;
    }

    @Override // com.zettle.sdk.core.network.NetworkModule
    public final okhttp3.OkHttpClient.Builder getBuilder() {
        return this.getOutputFormats.newBuilder();
    }

    @Override // com.zettle.sdk.core.network.NetworkModule
    public final com.zettle.sdk.core.network.Connection getConnection() {
        return this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    @Override // com.zettle.sdk.core.Module
    public final void start() {
        com.zettle.sdk.core.network.NetworkModule.DefaultImpls.start(this);
        this.getHighResolutionOutputSizeshNQ4ISI.registerNetworkCallback(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes);
    }

    @Override // com.zettle.sdk.core.Module
    public final void stop() {
        com.zettle.sdk.core.network.NetworkModule.DefaultImpls.stop(this);
        this.getHighResolutionOutputSizeshNQ4ISI.unregisterNetworkCallback(this.getHighSpeedVideoSizes);
    }

    @Override // com.zettle.sdk.core.network.NetworkModule
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Old way of calling APIs")
    public final com.zettle.sdk.commons.network.NetworkClient createNetworkClient(com.zettle.sdk.commons.network.Service url, com.zettle.sdk.commons.network.Scope scope, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headers, java.lang.String singleInstanceKey, long connectTimeoutSeconds, long readTimeoutSeconds, long writeTimeoutSeconds, java.lang.Long callTimeoutSeconds) {
        com.zettle.sdk.commons.network.ServiceUrl serviceUrl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        com.zettle.sdk.commons.network.InMemoryCookieJar2 inMemoryCookieJar2 = new com.zettle.sdk.commons.network.InMemoryCookieJar2();
        if (singleInstanceKey == null) {
            serviceUrl = new com.zettle.sdk.commons.network.service.ServiceUrlImpl(url, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, false);
        } else {
            java.util.Map<java.lang.String, com.zettle.sdk.commons.network.ServiceUrl> map = this.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "");
            com.zettle.sdk.commons.network.service.ServiceUrlImpl serviceUrlImpl = map.get(singleInstanceKey);
            if (serviceUrlImpl == null) {
                serviceUrlImpl = new com.zettle.sdk.commons.network.service.ServiceUrlImpl(url, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, true);
                map.put(singleInstanceKey, serviceUrlImpl);
            }
            serviceUrl = serviceUrlImpl;
        }
        okhttp3.OkHttpClient.Builder builder = getBuilder();
        builder.interceptors().add(0, new com.zettle.sdk.interceptors.ScopeInterceptor(scope));
        if (callTimeoutSeconds != null) {
            builder.callTimeout(callTimeoutSeconds.longValue(), java.util.concurrent.TimeUnit.SECONDS);
        }
        com.zettle.sdk.commons.network.InMemoryCookieJar2 inMemoryCookieJar22 = inMemoryCookieJar2;
        return new com.zettle.sdk.commons.network.NetworkClientImpl(serviceUrl, com.izettle.android.auth.okhttp.OkHttpExtKt.asHttpClient(builder.connectTimeout(connectTimeoutSeconds, java.util.concurrent.TimeUnit.SECONDS).readTimeout(readTimeoutSeconds, java.util.concurrent.TimeUnit.SECONDS).writeTimeout(writeTimeoutSeconds, java.util.concurrent.TimeUnit.SECONDS).addInterceptor(new com.zettle.sdk.interceptors.HeadersInterceptor(headers)).cookieJar(inMemoryCookieJar22).build()), inMemoryCookieJar22, singleInstanceKey);
    }

    public static final /* synthetic */ com.zettle.sdk.core.network.Connection access$getType(com.zettle.sdk.core.network.NetworkModuleImpl networkModuleImpl, android.net.NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
            return com.zettle.sdk.core.network.Connection.Connected.INSTANCE;
        }
        return com.zettle.sdk.core.network.Connection.Disconnected.INSTANCE;
    }
}
