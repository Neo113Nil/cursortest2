package io.appmetrica.analytics.screenshot.internal;

/* loaded from: classes.dex */
public final class ScreenshotClientModuleEntryPoint extends io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint<io.appmetrica.analytics.screenshot.impl.D> {

    /* renamed from: a, reason: collision with root package name */
    private io.appmetrica.analytics.screenshot.impl.C0896l f7594a;

    /* renamed from: d, reason: collision with root package name */
    private io.appmetrica.analytics.screenshot.impl.V f7597d;

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.screenshot.impl.C0892h f7595b = new io.appmetrica.analytics.screenshot.impl.C0892h();

    /* renamed from: c, reason: collision with root package name */
    private final io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$configUpdateListener$1 f7596c = new io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener<io.appmetrica.analytics.screenshot.impl.D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener
        public void onServiceConfigUpdated(io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig<io.appmetrica.analytics.screenshot.impl.D> moduleServiceConfig) {
            io.appmetrica.analytics.screenshot.impl.C0896l c0896l;
            io.appmetrica.analytics.screenshot.impl.V v2;
            io.appmetrica.analytics.screenshot.impl.V v3;
            io.appmetrica.analytics.screenshot.impl.C0896l c0896l2;
            io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint = io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint.this;
            synchronized (screenshotClientModuleEntryPoint) {
                try {
                    io.appmetrica.analytics.screenshot.impl.D featuresConfig = moduleServiceConfig.getFeaturesConfig();
                    if (featuresConfig != null) {
                        boolean b2 = featuresConfig.b();
                        io.appmetrica.analytics.screenshot.impl.F a2 = featuresConfig.a();
                        c0896l = new io.appmetrica.analytics.screenshot.impl.C0896l(b2, a2 != null ? new io.appmetrica.analytics.screenshot.impl.C0897m(a2) : null);
                    } else {
                        c0896l = null;
                    }
                    screenshotClientModuleEntryPoint.f7594a = c0896l;
                    v2 = screenshotClientModuleEntryPoint.f7597d;
                    if (v2 != null) {
                        v3 = screenshotClientModuleEntryPoint.f7597d;
                        if (v3 == null) {
                            kotlin.jvm.internal.i.i("screenshotCaptorsController");
                            throw null;
                        }
                        c0896l2 = screenshotClientModuleEntryPoint.f7594a;
                        v3.a(c0896l2);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.String f7598e = "screenshot";

    /* renamed from: f, reason: collision with root package name */
    private final io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1 f7599f = new io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration<io.appmetrica.analytics.screenshot.impl.D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter<io.appmetrica.analytics.screenshot.impl.D> getBundleConverter() {
            io.appmetrica.analytics.screenshot.impl.C0892h c0892h;
            c0892h = io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint.this.f7595b;
            return c0892h;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener<io.appmetrica.analytics.screenshot.impl.D> getServiceConfigUpdateListener() {
            io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$configUpdateListener$1 screenshotClientModuleEntryPoint$configUpdateListener$1;
            screenshotClientModuleEntryPoint$configUpdateListener$1 = io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint.this.f7596c;
            return screenshotClientModuleEntryPoint$configUpdateListener$1;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public java.lang.String getIdentifier() {
        return this.f7598e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration<io.appmetrica.analytics.screenshot.impl.D> getServiceConfigExtensionConfiguration() {
        return this.f7599f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
        synchronized (this) {
            try {
                io.appmetrica.analytics.screenshot.impl.C0907x c0907x = new io.appmetrica.analytics.screenshot.impl.C0907x(clientContext);
                this.f7597d = new io.appmetrica.analytics.screenshot.impl.V(io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(34) ? new io.appmetrica.analytics.screenshot.impl.C0906w(clientContext, c0907x) : new io.appmetrica.analytics.screenshot.impl.I(clientContext, c0907x));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        synchronized (this) {
            try {
                io.appmetrica.analytics.screenshot.impl.V v2 = this.f7597d;
                if (v2 != null) {
                    io.appmetrica.analytics.screenshot.impl.C0896l c0896l = this.f7594a;
                    java.util.Iterator it = v2.f7523a.iterator();
                    while (it.hasNext()) {
                        ((io.appmetrica.analytics.screenshot.impl.T) it.next()).a();
                    }
                    v2.a(c0896l);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
