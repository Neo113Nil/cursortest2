package io.appmetrica.analytics.modulesapi.internal.service;

/* loaded from: classes.dex */
public interface ModuleRemoteConfig<T> {
    T getFeaturesConfig();

    io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers getIdentifiers();

    io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo getRemoteConfigMetaInfo();
}
