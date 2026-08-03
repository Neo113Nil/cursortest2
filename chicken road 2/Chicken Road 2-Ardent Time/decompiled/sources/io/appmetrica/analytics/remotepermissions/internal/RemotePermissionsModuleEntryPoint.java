package io.appmetrica.analytics.remotepermissions.internal;

/* loaded from: classes.dex */
public final class RemotePermissionsModuleEntryPoint extends io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint<io.appmetrica.analytics.remotepermissions.impl.a> implements io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider, io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener<io.appmetrica.analytics.remotepermissions.impl.a> {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.remotepermissions.impl.d f7481a = new io.appmetrica.analytics.remotepermissions.impl.d();

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.remotepermissions.impl.b f7482b = new io.appmetrica.analytics.remotepermissions.impl.b();

    /* renamed from: c, reason: collision with root package name */
    private final io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint f7483c = this;

    /* renamed from: d, reason: collision with root package name */
    private final io.appmetrica.analytics.remotepermissions.impl.e f7484d = new io.appmetrica.analytics.remotepermissions.impl.e();

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.String f7485e = "rp";

    /* renamed from: f, reason: collision with root package name */
    private final io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint$remoteConfigExtensionConfiguration$1 f7486f = new io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration<io.appmetrica.analytics.remotepermissions.impl.a>() { // from class: io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public java.util.Map<java.lang.String, java.lang.Integer> getBlocks() {
            return i1.AbstractC0203v.F(new h1.C0172d("permissions", 1));
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public java.util.List<java.lang.String> getFeatures() {
            return i1.C0199r.f3325a;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public io.appmetrica.analytics.coreapi.internal.data.JsonParser<io.appmetrica.analytics.remotepermissions.impl.a> getJsonParser() {
            io.appmetrica.analytics.coreapi.internal.data.JsonParser<io.appmetrica.analytics.remotepermissions.impl.a> jsonParser;
            jsonParser = io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint.this.f7481a;
            return jsonParser;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public io.appmetrica.analytics.coreapi.internal.data.Converter<io.appmetrica.analytics.remotepermissions.impl.a, byte[]> getProtobufConverter() {
            io.appmetrica.analytics.coreapi.internal.data.Converter<io.appmetrica.analytics.remotepermissions.impl.a, byte[]> converter;
            converter = io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint.this.f7482b;
            return converter;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener<io.appmetrica.analytics.remotepermissions.impl.a> getRemoteConfigUpdateListener() {
            io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener<io.appmetrica.analytics.remotepermissions.impl.a> remoteConfigUpdateListener;
            remoteConfigUpdateListener = io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint.this.f7483c;
            return remoteConfigUpdateListener;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy getAskForPermissionStrategy() {
        return this.f7484d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public java.lang.String getIdentifier() {
        return this.f7485e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration<io.appmetrica.analytics.remotepermissions.impl.a> getRemoteConfigExtensionConfiguration() {
        return this.f7486f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(io.appmetrica.analytics.modulesapi.internal.service.ServiceContext serviceContext, io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig<io.appmetrica.analytics.remotepermissions.impl.a> moduleRemoteConfig) {
        java.util.Set set;
        io.appmetrica.analytics.remotepermissions.impl.e eVar = this.f7484d;
        io.appmetrica.analytics.remotepermissions.impl.a featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        if (featuresConfig == null || (set = featuresConfig.f7472a) == null) {
            set = i1.C0201t.f3327a;
        }
        synchronized (eVar) {
            eVar.f7478a = set;
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
    public void onRemoteConfigUpdated(io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig<io.appmetrica.analytics.remotepermissions.impl.a> moduleRemoteConfig) {
        java.util.Set set;
        io.appmetrica.analytics.remotepermissions.impl.e eVar = this.f7484d;
        io.appmetrica.analytics.remotepermissions.impl.a featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        if (featuresConfig == null || (set = featuresConfig.f7472a) == null) {
            set = i1.C0201t.f3327a;
        }
        synchronized (eVar) {
            eVar.f7478a = set;
        }
    }
}
