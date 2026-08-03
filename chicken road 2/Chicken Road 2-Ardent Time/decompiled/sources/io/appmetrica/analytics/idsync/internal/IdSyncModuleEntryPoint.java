package io.appmetrica.analytics.idsync.internal;

/* loaded from: classes.dex */
public final class IdSyncModuleEntryPoint extends io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint<io.appmetrica.analytics.idsync.internal.model.IdSyncConfig> implements io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener<io.appmetrica.analytics.idsync.internal.model.IdSyncConfig> {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.idsync.impl.C0209d f3982a;

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.idsync.impl.C0208c f3983b;

    /* renamed from: c, reason: collision with root package name */
    private io.appmetrica.analytics.idsync.impl.h f3984c;

    /* renamed from: d, reason: collision with root package name */
    private final java.lang.String f3985d;

    /* renamed from: e, reason: collision with root package name */
    private final io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint$remoteConfigExtensionConfiguration$1 f3986e;

    /* JADX WARN: Type inference failed for: r0v2, types: [io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint$remoteConfigExtensionConfiguration$1] */
    public IdSyncModuleEntryPoint() {
        io.appmetrica.analytics.idsync.impl.C0210e c0210e = new io.appmetrica.analytics.idsync.impl.C0210e();
        this.f3982a = new io.appmetrica.analytics.idsync.impl.C0209d(c0210e);
        this.f3983b = new io.appmetrica.analytics.idsync.impl.C0208c(c0210e);
        this.f3985d = "id-sync";
        this.f3986e = new io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration<io.appmetrica.analytics.idsync.internal.model.IdSyncConfig>() { // from class: io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint$remoteConfigExtensionConfiguration$1
            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public java.util.Map<java.lang.String, java.lang.Integer> getBlocks() {
                return i1.AbstractC0203v.F(new h1.C0172d("is", 1));
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public java.util.List<java.lang.String> getFeatures() {
                return u0.AbstractC0995a.q("is");
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public io.appmetrica.analytics.coreapi.internal.data.JsonParser<io.appmetrica.analytics.idsync.internal.model.IdSyncConfig> getJsonParser() {
                io.appmetrica.analytics.idsync.impl.C0208c c0208c;
                c0208c = io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint.this.f3983b;
                return c0208c;
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public io.appmetrica.analytics.coreapi.internal.data.Converter<io.appmetrica.analytics.idsync.internal.model.IdSyncConfig, byte[]> getProtobufConverter() {
                io.appmetrica.analytics.idsync.impl.C0209d c0209d;
                c0209d = io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint.this.f3982a;
                return c0209d;
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener<io.appmetrica.analytics.idsync.internal.model.IdSyncConfig> getRemoteConfigUpdateListener() {
                return io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint.this;
            }
        };
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public java.lang.String getIdentifier() {
        return this.f3985d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration<io.appmetrica.analytics.idsync.internal.model.IdSyncConfig> getRemoteConfigExtensionConfiguration() {
        return this.f3986e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(io.appmetrica.analytics.modulesapi.internal.service.ServiceContext serviceContext, io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig<io.appmetrica.analytics.idsync.internal.model.IdSyncConfig> moduleRemoteConfig) {
        synchronized (this) {
            if (this.f3984c == null) {
                io.appmetrica.analytics.idsync.impl.h hVar = new io.appmetrica.analytics.idsync.impl.h(serviceContext, moduleRemoteConfig.getIdentifiers());
                this.f3984c = hVar;
                io.appmetrica.analytics.idsync.internal.model.IdSyncConfig featuresConfig = moduleRemoteConfig.getFeaturesConfig();
                if (featuresConfig != null) {
                    hVar.a(featuresConfig, moduleRemoteConfig.getIdentifiers());
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
    public synchronized void onRemoteConfigUpdated(io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig<io.appmetrica.analytics.idsync.internal.model.IdSyncConfig> moduleRemoteConfig) {
        io.appmetrica.analytics.idsync.impl.h hVar;
        io.appmetrica.analytics.idsync.internal.model.IdSyncConfig featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        if (featuresConfig != null && (hVar = this.f3984c) != null) {
            hVar.a(featuresConfig, moduleRemoteConfig.getIdentifiers());
        }
    }
}
