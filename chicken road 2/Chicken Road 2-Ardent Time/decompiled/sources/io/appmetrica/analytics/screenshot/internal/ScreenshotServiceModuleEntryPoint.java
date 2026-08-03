package io.appmetrica.analytics.screenshot.internal;

/* loaded from: classes.dex */
public final class ScreenshotServiceModuleEntryPoint extends io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint<io.appmetrica.analytics.screenshot.impl.J> {

    /* renamed from: a, reason: collision with root package name */
    private io.appmetrica.analytics.screenshot.impl.j0 f7602a;

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.screenshot.impl.m0 f7603b = new io.appmetrica.analytics.screenshot.impl.m0();

    /* renamed from: c, reason: collision with root package name */
    private final io.appmetrica.analytics.screenshot.impl.L f7604c = new io.appmetrica.analytics.screenshot.impl.L(null, null, 3, null);

    /* renamed from: d, reason: collision with root package name */
    private final io.appmetrica.analytics.screenshot.impl.K f7605d = new io.appmetrica.analytics.screenshot.impl.K(null, 1, null);

    /* renamed from: e, reason: collision with root package name */
    private final io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$configUpdateListener$1 f7606e = new io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener<io.appmetrica.analytics.screenshot.impl.J>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
        public void onRemoteConfigUpdated(io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig<io.appmetrica.analytics.screenshot.impl.J> moduleRemoteConfig) {
            io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint screenshotServiceModuleEntryPoint = io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint.this;
            io.appmetrica.analytics.screenshot.impl.J featuresConfig = moduleRemoteConfig.getFeaturesConfig();
            screenshotServiceModuleEntryPoint.f7602a = featuresConfig != null ? new io.appmetrica.analytics.screenshot.impl.j0(featuresConfig) : null;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private final java.lang.String f7607f = "screenshot";

    /* renamed from: g, reason: collision with root package name */
    private final io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1 f7608g = new io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration<io.appmetrica.analytics.screenshot.impl.J>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public java.util.Map<java.lang.String, java.lang.Integer> getBlocks() {
            return i1.AbstractC0203v.F(new h1.C0172d("scr", 1));
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public java.util.List<java.lang.String> getFeatures() {
            return u0.AbstractC0995a.q("scr");
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public io.appmetrica.analytics.coreapi.internal.data.JsonParser<io.appmetrica.analytics.screenshot.impl.J> getJsonParser() {
            io.appmetrica.analytics.screenshot.impl.L l2;
            l2 = io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint.this.f7604c;
            return l2;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public io.appmetrica.analytics.coreapi.internal.data.Converter<io.appmetrica.analytics.screenshot.impl.J, byte[]> getProtobufConverter() {
            io.appmetrica.analytics.screenshot.impl.K k2;
            k2 = io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint.this.f7605d;
            return k2;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener<io.appmetrica.analytics.screenshot.impl.J> getRemoteConfigUpdateListener() {
            io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$configUpdateListener$1 screenshotServiceModuleEntryPoint$configUpdateListener$1;
            screenshotServiceModuleEntryPoint$configUpdateListener$1 = io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint.this.f7606e;
            return screenshotServiceModuleEntryPoint$configUpdateListener$1;
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private final io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$clientConfigProvider$1 f7609h = new io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$clientConfigProvider$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider
        public android.os.Bundle getConfigBundleForClient() {
            io.appmetrica.analytics.screenshot.impl.m0 m0Var;
            io.appmetrica.analytics.screenshot.impl.j0 j0Var;
            m0Var = io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint.this.f7603b;
            j0Var = io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint.this.f7602a;
            m0Var.getClass();
            if (j0Var == null) {
                return null;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("config", new io.appmetrica.analytics.screenshot.impl.D(j0Var));
            return bundle;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider getClientConfigProvider() {
        return this.f7609h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public java.lang.String getIdentifier() {
        return this.f7607f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration<io.appmetrica.analytics.screenshot.impl.J> getRemoteConfigExtensionConfiguration() {
        return this.f7608g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(io.appmetrica.analytics.modulesapi.internal.service.ServiceContext serviceContext, io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig<io.appmetrica.analytics.screenshot.impl.J> moduleRemoteConfig) {
        io.appmetrica.analytics.screenshot.impl.J featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        this.f7602a = featuresConfig != null ? new io.appmetrica.analytics.screenshot.impl.j0(featuresConfig) : null;
    }
}
