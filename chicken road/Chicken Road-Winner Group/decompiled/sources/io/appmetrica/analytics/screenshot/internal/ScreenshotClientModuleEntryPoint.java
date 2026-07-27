package io.appmetrica.analytics.screenshot.internal;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.screenshot.impl.C1027h;
import io.appmetrica.analytics.screenshot.impl.C1031l;
import io.appmetrica.analytics.screenshot.impl.C1032m;
import io.appmetrica.analytics.screenshot.impl.C1041w;
import io.appmetrica.analytics.screenshot.impl.C1042x;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.F;
import io.appmetrica.analytics.screenshot.impl.I;
import io.appmetrica.analytics.screenshot.impl.T;
import io.appmetrica.analytics.screenshot.impl.V;
import java.util.Iterator;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class ScreenshotClientModuleEntryPoint extends ModuleClientEntryPoint<D> {

    /* renamed from: a, reason: collision with root package name */
    private C1031l f9080a;

    /* renamed from: d, reason: collision with root package name */
    private V f9083d;

    /* renamed from: b, reason: collision with root package name */
    private final C1027h f9081b = new C1027h();

    /* renamed from: c, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$configUpdateListener$1 f9082c = new ServiceConfigUpdateListener<D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener
        public void onServiceConfigUpdated(ModuleServiceConfig<D> moduleServiceConfig) {
            C1031l c1031l;
            V v3;
            V v4;
            C1031l c1031l2;
            ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint = ScreenshotClientModuleEntryPoint.this;
            synchronized (screenshotClientModuleEntryPoint) {
                try {
                    D featuresConfig = moduleServiceConfig.getFeaturesConfig();
                    if (featuresConfig != null) {
                        boolean b3 = featuresConfig.b();
                        F a3 = featuresConfig.a();
                        c1031l = new C1031l(b3, a3 != null ? new C1032m(a3) : null);
                    } else {
                        c1031l = null;
                    }
                    screenshotClientModuleEntryPoint.f9080a = c1031l;
                    v3 = screenshotClientModuleEntryPoint.f9083d;
                    if (v3 != null) {
                        v4 = screenshotClientModuleEntryPoint.f9083d;
                        if (v4 == null) {
                            j.g("screenshotCaptorsController");
                            throw null;
                        }
                        c1031l2 = screenshotClientModuleEntryPoint.f9080a;
                        v4.a(c1031l2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final String f9084e = "screenshot";
    private final ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1 f = new ServiceConfigExtensionConfiguration<D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public BundleToServiceConfigConverter<D> getBundleConverter() {
            C1027h c1027h;
            c1027h = ScreenshotClientModuleEntryPoint.this.f9081b;
            return c1027h;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public ServiceConfigUpdateListener<D> getServiceConfigUpdateListener() {
            ScreenshotClientModuleEntryPoint$configUpdateListener$1 screenshotClientModuleEntryPoint$configUpdateListener$1;
            screenshotClientModuleEntryPoint$configUpdateListener$1 = ScreenshotClientModuleEntryPoint.this.f9082c;
            return screenshotClientModuleEntryPoint$configUpdateListener$1;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public String getIdentifier() {
        return this.f9084e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public ServiceConfigExtensionConfiguration<D> getServiceConfigExtensionConfiguration() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(ClientContext clientContext) {
        synchronized (this) {
            try {
                C1042x c1042x = new C1042x(clientContext);
                this.f9083d = new V(AndroidUtils.isApiAchieved(34) ? new C1041w(clientContext, c1042x) : new I(clientContext, c1042x));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        synchronized (this) {
            try {
                V v3 = this.f9083d;
                if (v3 != null) {
                    C1031l c1031l = this.f9080a;
                    Iterator it = v3.f9010a.iterator();
                    while (it.hasNext()) {
                        ((T) it.next()).a();
                    }
                    v3.a(c1031l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
