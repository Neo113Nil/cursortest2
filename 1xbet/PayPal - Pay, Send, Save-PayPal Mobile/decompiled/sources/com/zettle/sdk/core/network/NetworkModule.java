package com.zettle.sdk.core.network;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 #2\u00020\u0001:\u0001#Jq\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001c8'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Lcom/zettle/sdk/core/network/NetworkModule;", "Lcom/zettle/sdk/core/Module;", "Lcom/zettle/sdk/commons/network/Service;", "url", "Lcom/zettle/sdk/commons/network/Scope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "", "Lkotlin/Pair;", "", "headers", "singleInstanceKey", "", "connectTimeoutSeconds", "readTimeoutSeconds", "writeTimeoutSeconds", "callTimeoutSeconds", "Lcom/zettle/sdk/commons/network/NetworkClient;", "createNetworkClient", "(Lcom/zettle/sdk/commons/network/Service;Lcom/zettle/sdk/commons/network/Scope;Ljava/util/List;Ljava/lang/String;JJJLjava/lang/Long;)Lcom/zettle/sdk/commons/network/NetworkClient;", "Lokhttp3/OkHttpClient$Builder;", "getBuilder", "()Lokhttp3/OkHttpClient$Builder;", "builder", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "client", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zettle/sdk/core/network/Connection;", "getConnected", "()Lkotlinx/coroutines/flow/Flow;", "connected", "getConnection", "()Lcom/zettle/sdk/core/network/Connection;", "connection", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface NetworkModule extends com.zettle.sdk.core.Module {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.network.NetworkModule.Companion INSTANCE = com.zettle.sdk.core.network.NetworkModule.Companion.getHighSpeedVideoSizes;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Old way of calling APIs")
    com.zettle.sdk.commons.network.NetworkClient createNetworkClient(com.zettle.sdk.commons.network.Service url, com.zettle.sdk.commons.network.Scope scope, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headers, java.lang.String singleInstanceKey, long connectTimeoutSeconds, long readTimeoutSeconds, long writeTimeoutSeconds, java.lang.Long callTimeoutSeconds);

    okhttp3.OkHttpClient.Builder getBuilder();

    okhttp3.OkHttpClient getClient();

    kotlinx.coroutines.flow.Flow<com.zettle.sdk.core.network.Connection> getConnected();

    com.zettle.sdk.core.network.Connection getConnection();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void start(com.zettle.sdk.core.network.NetworkModule networkModule) {
            com.zettle.sdk.core.Module.DefaultImpls.start(networkModule);
        }

        public static void stop(com.zettle.sdk.core.network.NetworkModule networkModule) {
            com.zettle.sdk.core.Module.DefaultImpls.stop(networkModule);
        }

        public static /* synthetic */ com.zettle.sdk.commons.network.NetworkClient createNetworkClient$default(com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.commons.network.Service service, com.zettle.sdk.commons.network.Scope scope, java.util.List list, java.lang.String str, long j, long j2, long j3, java.lang.Long l, int i, java.lang.Object obj) {
            if (obj == null) {
                return networkModule.createNetworkClient(service, scope, (i & 4) != 0 ? com.zettle.sdk.core.network.NetworkModuleKt.getAPI_VERSION_HEADERS() : list, (i & 8) != 0 ? null : str, (i & 16) != 0 ? 15L : j, (i & 32) != 0 ? 15L : j2, (i & 64) != 0 ? 15L : j3, (i & 128) != 0 ? null : l);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createNetworkClient");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/core/network/NetworkModule$Companion;", "", "<init>", "()V", "Ljava/lang/Class;", "Lcom/zettle/sdk/core/network/NetworkModule;", "TYPE", "Ljava/lang/Class;", "getTYPE$core_publicRelease", "()Ljava/lang/Class;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.core.network.NetworkModule.Companion getHighSpeedVideoSizes = new com.zettle.sdk.core.network.NetworkModule.Companion();
        private static final java.lang.Class<com.zettle.sdk.core.network.NetworkModule> TYPE = com.zettle.sdk.core.network.NetworkModule.class;

        private Companion() {
        }

        public final java.lang.Class<com.zettle.sdk.core.network.NetworkModule> getTYPE$core_publicRelease() {
            return TYPE;
        }
    }
}
