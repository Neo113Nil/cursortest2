package io.appmetrica.analytics.idsync.internal;

import K1.b;
import f4.C0430g;
import g4.AbstractC0476u;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.idsync.impl.c;
import io.appmetrica.analytics.idsync.impl.d;
import io.appmetrica.analytics.idsync.impl.e;
import io.appmetrica.analytics.idsync.impl.h;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class IdSyncModuleEntryPoint extends ModuleServiceEntryPoint<IdSyncConfig> implements RemoteConfigUpdateListener<IdSyncConfig> {

    /* renamed from: a, reason: collision with root package name */
    private final d f6462a;

    /* renamed from: b, reason: collision with root package name */
    private final c f6463b;

    /* renamed from: c, reason: collision with root package name */
    private h f6464c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6465d;

    /* renamed from: e, reason: collision with root package name */
    private final IdSyncModuleEntryPoint$remoteConfigExtensionConfiguration$1 f6466e;

    /* JADX WARN: Type inference failed for: r0v2, types: [io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint$remoteConfigExtensionConfiguration$1] */
    public IdSyncModuleEntryPoint() {
        e eVar = new e();
        this.f6462a = new d(eVar);
        this.f6463b = new c(eVar);
        this.f6465d = "id-sync";
        this.f6466e = new RemoteConfigExtensionConfiguration<IdSyncConfig>() { // from class: io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint$remoteConfigExtensionConfiguration$1
            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public Map<String, Integer> getBlocks() {
                return AbstractC0476u.X(new C0430g("is", 1));
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public List<String> getFeatures() {
                return b.W("is");
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public JsonParser<IdSyncConfig> getJsonParser() {
                c cVar;
                cVar = IdSyncModuleEntryPoint.this.f6463b;
                return cVar;
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public Converter<IdSyncConfig, byte[]> getProtobufConverter() {
                d dVar;
                dVar = IdSyncModuleEntryPoint.this.f6462a;
                return dVar;
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public RemoteConfigUpdateListener<IdSyncConfig> getRemoteConfigUpdateListener() {
                return IdSyncModuleEntryPoint.this;
            }
        };
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.f6465d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<IdSyncConfig> getRemoteConfigExtensionConfiguration() {
        return this.f6466e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<IdSyncConfig> moduleRemoteConfig) {
        synchronized (this) {
            if (this.f6464c == null) {
                h hVar = new h(serviceContext);
                this.f6464c = hVar;
                IdSyncConfig featuresConfig = moduleRemoteConfig.getFeaturesConfig();
                if (featuresConfig != null) {
                    hVar.b(featuresConfig);
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
    public synchronized void onRemoteConfigUpdated(ModuleRemoteConfig<IdSyncConfig> moduleRemoteConfig) {
        h hVar;
        IdSyncConfig featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        if (featuresConfig != null && (hVar = this.f6464c) != null) {
            hVar.b(featuresConfig);
        }
    }
}
