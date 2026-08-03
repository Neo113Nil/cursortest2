package io.appmetrica.analytics.modulesapi.internal.service;

/* loaded from: classes.dex */
public abstract class RemoteConfigExtensionConfiguration<S> {
    public abstract java.util.Map<java.lang.String, java.lang.Integer> getBlocks();

    public abstract java.util.List<java.lang.String> getFeatures();

    public abstract io.appmetrica.analytics.coreapi.internal.data.JsonParser<S> getJsonParser();

    public abstract io.appmetrica.analytics.coreapi.internal.data.Converter<S, byte[]> getProtobufConverter();

    public abstract io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener<S> getRemoteConfigUpdateListener();
}
