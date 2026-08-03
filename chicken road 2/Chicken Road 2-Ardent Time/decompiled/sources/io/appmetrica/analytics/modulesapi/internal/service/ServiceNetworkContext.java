package io.appmetrica.analytics.modulesapi.internal.service;

/* loaded from: classes.dex */
public interface ServiceNetworkContext {
    io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy getExecutionPolicy();

    io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi getNetworkApi();

    io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider getSslSocketFactoryProvider();

    java.lang.String getUserAgent();
}
