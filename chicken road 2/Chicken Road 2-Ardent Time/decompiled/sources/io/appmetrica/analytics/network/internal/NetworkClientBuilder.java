package io.appmetrica.analytics.network.internal;

/* loaded from: classes.dex */
public final class NetworkClientBuilder extends io.appmetrica.analytics.networkapi.NetworkClient.Builder {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [io.appmetrica.analytics.networkapi.NetworkClient$Builder] */
    @Override // io.appmetrica.analytics.networkapi.NetworkClient.Builder
    public io.appmetrica.analytics.networkapi.NetworkClient build() {
        io.appmetrica.analytics.networkapi.NetworkClientSettings settings = getSettings();
        android.os.Bundle applicationMetaData = io.appmetrica.analytics.network.internal.NetworkClientServiceLocator.getInstance().getApplicationMetaData();
        io.appmetrica.analytics.network.impl.c cVar = null;
        java.util.Iterator it = i1.AbstractC0191j.I(applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.network.custom") : null, "io.appmetrica.analytics.networkokhttp.internal.OkHttpNetworkClientBuilder", "io.appmetrica.analytics.networklegacy.internal.LegacyNetworkClientBuilder").iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ?? r3 = (io.appmetrica.analytics.networkapi.NetworkClient.Builder) io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor((java.lang.String) it.next(), io.appmetrica.analytics.networkapi.NetworkClient.Builder.class);
            if (r3 != 0) {
                cVar = r3;
                break;
            }
        }
        if (cVar == null) {
            cVar = new io.appmetrica.analytics.network.impl.c();
        }
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.Companion.getAnonymousInstance().info("Created " + cVar, new java.lang.Object[0]);
        return cVar.withSettings(settings).build();
    }
}
