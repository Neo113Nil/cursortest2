package io.appmetrica.analytics.billing.internal;

/* loaded from: classes.dex */
public final class BillingServiceModuleEntryPoint extends io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint<io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig> {

    /* renamed from: a, reason: collision with root package name */
    private io.appmetrica.analytics.billing.impl.m f3532a;

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.billing.impl.q f3533b = new io.appmetrica.analytics.billing.impl.q(null, null, 3, null);

    /* renamed from: c, reason: collision with root package name */
    private final io.appmetrica.analytics.billing.impl.p f3534c = new io.appmetrica.analytics.billing.impl.p(null, 1, null);

    /* renamed from: d, reason: collision with root package name */
    private final io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint$configUpdateListener$1 f3535d = new io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener<io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig>() { // from class: io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
        public void onRemoteConfigUpdated(io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig<io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig> moduleRemoteConfig) {
            io.appmetrica.analytics.billing.impl.m mVar;
            mVar = io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint.this.f3532a;
            if (mVar != null) {
                io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig featuresConfig = moduleRemoteConfig.getFeaturesConfig();
                mVar.a(featuresConfig != null ? new io.appmetrica.analytics.billing.impl.B(featuresConfig.getEnabled(), new io.appmetrica.analytics.billing.impl.A(featuresConfig.getConfig())) : null);
            }
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.String f3536e = "billing";

    /* renamed from: f, reason: collision with root package name */
    private final io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1 f3537f = new io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration<io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig>() { // from class: io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public java.util.Map<java.lang.String, java.lang.Integer> getBlocks() {
            return i1.AbstractC0203v.F(new h1.C0172d("aic", 1));
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public java.util.List<java.lang.String> getFeatures() {
            return i1.C0199r.f3325a;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public io.appmetrica.analytics.coreapi.internal.data.JsonParser<io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig> getJsonParser() {
            io.appmetrica.analytics.billing.impl.q qVar;
            qVar = io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint.this.f3533b;
            return qVar;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public io.appmetrica.analytics.coreapi.internal.data.Converter<io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig, byte[]> getProtobufConverter() {
            io.appmetrica.analytics.billing.impl.p pVar;
            pVar = io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint.this.f3534c;
            return pVar;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener<io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig> getRemoteConfigUpdateListener() {
            io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint$configUpdateListener$1 billingServiceModuleEntryPoint$configUpdateListener$1;
            billingServiceModuleEntryPoint$configUpdateListener$1 = io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint.this.f3535d;
            return billingServiceModuleEntryPoint$configUpdateListener$1;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public java.lang.String getIdentifier() {
        return this.f3536e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration<io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig> getRemoteConfigExtensionConfiguration() {
        return this.f3537f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(io.appmetrica.analytics.modulesapi.internal.service.ServiceContext serviceContext, io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig<io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig> moduleRemoteConfig) {
        io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        io.appmetrica.analytics.billing.impl.m mVar = new io.appmetrica.analytics.billing.impl.m(serviceContext, featuresConfig != null ? new io.appmetrica.analytics.billing.impl.B(featuresConfig.getEnabled(), new io.appmetrica.analytics.billing.impl.A(featuresConfig.getConfig())) : null);
        serviceContext.getServiceModuleReporterComponentLifecycle().subscribe(mVar);
        this.f3532a = mVar;
    }
}
