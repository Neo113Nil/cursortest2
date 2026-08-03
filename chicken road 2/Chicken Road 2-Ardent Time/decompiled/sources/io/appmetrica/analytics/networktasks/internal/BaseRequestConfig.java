package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public class BaseRequestConfig {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f7377a;

    /* renamed from: b, reason: collision with root package name */
    private io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment f7378b;

    /* renamed from: c, reason: collision with root package name */
    private io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers f7379c;

    /* renamed from: d, reason: collision with root package name */
    private io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId f7380d;

    /* renamed from: e, reason: collision with root package name */
    private io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig f7381e;

    public static abstract class BaseRequestArguments<I, O> implements io.appmetrica.analytics.networktasks.internal.ArgumentsMerger<I, O> {
    }

    public static abstract class ComponentLoader<T extends io.appmetrica.analytics.networktasks.internal.BaseRequestConfig, A extends io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.BaseRequestArguments, D extends io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.DataSource<A>> implements io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader<T, D> {

        /* renamed from: a, reason: collision with root package name */
        final android.content.Context f7382a;

        /* renamed from: b, reason: collision with root package name */
        final java.lang.String f7383b;

        public ComponentLoader(android.content.Context context, java.lang.String str) {
            this.f7382a = context;
            this.f7383b = str;
        }

        public abstract T createBlankConfig();

        public android.content.Context getContext() {
            return this.f7382a;
        }

        public java.lang.String getPackageName() {
            return this.f7383b;
        }

        @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
        public T load(D d2) {
            T createBlankConfig = createBlankConfig();
            createBlankConfig.setSdkIdentifiers(d2.sdkIdentifiers);
            createBlankConfig.setSdkEnvironment(d2.sdkEnvironmentProvider.getSdkEnvironment());
            createBlankConfig.setAppSetId(d2.platformIdentifiers.getAppSetIdProvider().getAppSetId());
            createBlankConfig.setPackageName(this.f7383b);
            return createBlankConfig;
        }
    }

    public static class DataSource<A> {
        public final A componentArguments;
        public final io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers platformIdentifiers;
        public final io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider sdkEnvironmentProvider;
        public final io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers;

        public DataSource(io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers, io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider sdkEnvironmentProvider, io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers platformIdentifiers, A a2) {
            this.sdkIdentifiers = sdkIdentifiers;
            this.componentArguments = a2;
            this.sdkEnvironmentProvider = sdkEnvironmentProvider;
            this.platformIdentifiers = platformIdentifiers;
        }
    }

    public interface RequestConfigLoader<T extends io.appmetrica.analytics.networktasks.internal.BaseRequestConfig, D> {
        T load(D d2);
    }

    public java.lang.String getAnalyticsSdkBuildNumber() {
        io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment sdkEnvironment = this.f7378b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildNumber();
    }

    public java.lang.String getAnalyticsSdkBuildType() {
        io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment sdkEnvironment = this.f7378b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildType();
    }

    public java.lang.String getAnalyticsSdkVersionName() {
        io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment sdkEnvironment = this.f7378b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkVersionName();
    }

    public java.lang.String getAppBuildNumber() {
        io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment sdkEnvironment = this.f7378b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppBuildNumber();
    }

    public java.lang.String getAppFramework() {
        io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment sdkEnvironment = this.f7378b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppFramework();
    }

    public java.lang.String getAppPlatform() {
        return io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo.APP_PLATFORM;
    }

    public synchronized java.lang.String getAppSetId() {
        io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId appSetId;
        try {
            appSetId = this.f7380d;
        } finally {
        }
        return (appSetId == null || appSetId.getId() == null) ? "" : this.f7380d.getId();
    }

    public synchronized java.lang.String getAppSetIdScope() {
        io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId appSetId;
        try {
            appSetId = this.f7380d;
        } finally {
        }
        return appSetId == null ? "" : appSetId.getScope().getValue();
    }

    public java.lang.String getAppVersion() {
        io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment sdkEnvironment = this.f7378b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppVersionName();
    }

    public synchronized java.lang.String getDeviceIDHash() {
        java.lang.String str;
        str = "";
        io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers = this.f7379c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceIdHash() != null) {
            str = this.f7379c.getDeviceIdHash();
        }
        return str;
    }

    public synchronized java.lang.String getDeviceId() {
        java.lang.String str;
        str = "";
        io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers = this.f7379c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceId() != null) {
            str = this.f7379c.getDeviceId();
        }
        return str;
    }

    public java.lang.String getDeviceRootStatus() {
        return io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo.DEVICE_ROOT_STATUS;
    }

    public java.lang.String getDeviceType() {
        io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment sdkEnvironment = this.f7378b;
        return sdkEnvironment != null ? sdkEnvironment.getDeviceType() : "phone";
    }

    public java.lang.String getLocale() {
        java.lang.String str;
        io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment sdkEnvironment = this.f7378b;
        return (sdkEnvironment == null || (str = (java.lang.String) io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getFirstOrNull(sdkEnvironment.getLocales())) == null) ? "" : str;
    }

    public java.lang.String getManufacturer() {
        return (java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo.MANUFACTURER, "");
    }

    public java.lang.String getModel() {
        return io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo.MODEL;
    }

    public int getOsApiLevel() {
        return io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo.OS_API_LEVEL;
    }

    public java.lang.String getOsVersion() {
        return io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo.OS_VERSION;
    }

    public java.lang.String getPackageName() {
        return this.f7377a;
    }

    public java.lang.String getProtocolVersion() {
        return "2";
    }

    public io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig getRetryPolicyConfig() {
        return this.f7381e;
    }

    public float getScaleFactor() {
        io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment sdkEnvironment = this.f7378b;
        if (sdkEnvironment == null) {
            return 0.0f;
        }
        return sdkEnvironment.getScreenInfo().getScaleFactor();
    }

    public int getScreenDpi() {
        io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment sdkEnvironment = this.f7378b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getDpi();
    }

    public int getScreenHeight() {
        io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment sdkEnvironment = this.f7378b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getHeight();
    }

    public int getScreenWidth() {
        io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment sdkEnvironment = this.f7378b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getWidth();
    }

    public synchronized java.lang.String getUuid() {
        java.lang.String str;
        str = "";
        io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers = this.f7379c;
        if (sdkIdentifiers != null && sdkIdentifiers.getUuid() != null) {
            str = this.f7379c.getUuid();
        }
        return str;
    }

    public synchronized boolean isIdentifiersValid() {
        boolean z2;
        java.lang.String uuid;
        java.lang.String deviceId;
        java.lang.String deviceIdHash;
        io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers = this.f7379c;
        if (sdkIdentifiers != null && (uuid = sdkIdentifiers.getUuid()) != null && uuid.length() != 0 && (deviceId = sdkIdentifiers.getDeviceId()) != null && deviceId.length() != 0 && (deviceIdHash = sdkIdentifiers.getDeviceIdHash()) != null) {
            z2 = deviceIdHash.length() != 0;
        }
        return z2;
    }

    public void setAppSetId(io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId appSetId) {
        this.f7380d = appSetId;
    }

    public void setPackageName(java.lang.String str) {
        this.f7377a = str;
    }

    public void setRetryPolicyConfig(io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig retryPolicyConfig) {
        this.f7381e = retryPolicyConfig;
    }

    public void setSdkEnvironment(io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment sdkEnvironment) {
        this.f7378b = sdkEnvironment;
    }

    public void setSdkIdentifiers(io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers) {
        this.f7379c = sdkIdentifiers;
    }

    public java.lang.String toString() {
        return "BaseRequestConfig{mPackageName='" + this.f7377a + "', sdkEnvironment=" + this.f7378b + ", mProtocolVersion='2', sdkIdentifiers=" + this.f7379c + ", retryPolicyConfig=" + this.f7381e + '}';
    }
}
