package io.appmetrica.analytics.remotepermissions.internal;

import f4.C0430g;
import g4.AbstractC0476u;
import g4.C0471p;
import g4.C0473r;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.remotepermissions.impl.a;
import io.appmetrica.analytics.remotepermissions.impl.b;
import io.appmetrica.analytics.remotepermissions.impl.d;
import io.appmetrica.analytics.remotepermissions.impl.e;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class RemotePermissionsModuleEntryPoint extends ModuleServiceEntryPoint<a> implements AskForPermissionStrategyModuleProvider, RemoteConfigUpdateListener<a> {

    /* renamed from: a, reason: collision with root package name */
    private final d f9949a = new d();

    /* renamed from: b, reason: collision with root package name */
    private final b f9950b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final RemotePermissionsModuleEntryPoint f9951c = this;

    /* renamed from: d, reason: collision with root package name */
    private final e f9952d = new e();

    /* renamed from: e, reason: collision with root package name */
    private final String f9953e = "rp";

    /* renamed from: f, reason: collision with root package name */
    private final RemotePermissionsModuleEntryPoint$remoteConfigExtensionConfiguration$1 f9954f = new RemoteConfigExtensionConfiguration<a>() { // from class: io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Map<String, Integer> getBlocks() {
            return AbstractC0476u.X(new C0430g("permissions", 1));
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public List<String> getFeatures() {
            return C0471p.f5750a;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public JsonParser<a> getJsonParser() {
            JsonParser<a> jsonParser;
            jsonParser = RemotePermissionsModuleEntryPoint.this.f9949a;
            return jsonParser;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Converter<a, byte[]> getProtobufConverter() {
            Converter<a, byte[]> converter;
            converter = RemotePermissionsModuleEntryPoint.this.f9950b;
            return converter;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public RemoteConfigUpdateListener<a> getRemoteConfigUpdateListener() {
            RemoteConfigUpdateListener<a> remoteConfigUpdateListener;
            remoteConfigUpdateListener = RemotePermissionsModuleEntryPoint.this.f9951c;
            return remoteConfigUpdateListener;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public PermissionStrategy getAskForPermissionStrategy() {
        return this.f9952d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.f9953e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<a> getRemoteConfigExtensionConfiguration() {
        return this.f9954f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<a> moduleRemoteConfig) {
        Set set;
        e eVar = this.f9952d;
        a featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        if (featuresConfig == null || (set = featuresConfig.f9940a) == null) {
            set = C0473r.f5752a;
        }
        synchronized (eVar) {
            eVar.f9946a = set;
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
    public void onRemoteConfigUpdated(ModuleRemoteConfig<a> moduleRemoteConfig) {
        Set set;
        e eVar = this.f9952d;
        a featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        if (featuresConfig == null || (set = featuresConfig.f9940a) == null) {
            set = C0473r.f5752a;
        }
        synchronized (eVar) {
            eVar.f9946a = set;
        }
    }
}
