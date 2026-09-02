package io.appmetrica.analytics.networktasks.internal;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* loaded from: classes.dex */
public class BaseRequestConfig {

    /* renamed from: a, reason: collision with root package name */
    private String f5487a;

    /* renamed from: b, reason: collision with root package name */
    private SdkEnvironment f5488b;

    /* renamed from: c, reason: collision with root package name */
    private SdkIdentifiers f5489c;

    /* renamed from: d, reason: collision with root package name */
    private AppSetId f5490d;

    /* renamed from: e, reason: collision with root package name */
    private RetryPolicyConfig f5491e;

    public static abstract class BaseRequestArguments<I, O> implements ArgumentsMerger<I, O> {
    }

    public static abstract class ComponentLoader<T extends BaseRequestConfig, A extends BaseRequestArguments, D extends DataSource<A>> implements RequestConfigLoader<T, D> {

        /* renamed from: a, reason: collision with root package name */
        final Context f5492a;

        /* renamed from: b, reason: collision with root package name */
        final String f5493b;

        public ComponentLoader(Context context, String str) {
            this.f5492a = context;
            this.f5493b = str;
        }

        public abstract T createBlankConfig();

        public Context getContext() {
            return this.f5492a;
        }

        public String getPackageName() {
            return this.f5493b;
        }

        @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
        public T load(D d2) {
            T createBlankConfig = createBlankConfig();
            createBlankConfig.setSdkIdentifiers(d2.sdkIdentifiers);
            createBlankConfig.setSdkEnvironment(d2.sdkEnvironmentProvider.getSdkEnvironment());
            createBlankConfig.setAppSetId(d2.platformIdentifiers.getAppSetIdProvider().getAppSetId());
            createBlankConfig.setPackageName(this.f5493b);
            return createBlankConfig;
        }
    }

    public static class DataSource<A> {
        public final A componentArguments;
        public final PlatformIdentifiers platformIdentifiers;
        public final SdkEnvironmentProvider sdkEnvironmentProvider;
        public final SdkIdentifiers sdkIdentifiers;

        public DataSource(SdkIdentifiers sdkIdentifiers, SdkEnvironmentProvider sdkEnvironmentProvider, PlatformIdentifiers platformIdentifiers, A a2) {
            this.sdkIdentifiers = sdkIdentifiers;
            this.componentArguments = a2;
            this.sdkEnvironmentProvider = sdkEnvironmentProvider;
            this.platformIdentifiers = platformIdentifiers;
        }
    }

    public interface RequestConfigLoader<T extends BaseRequestConfig, D> {
        T load(D d2);
    }

    public String getAnalyticsSdkBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f5488b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildNumber();
    }

    public String getAnalyticsSdkBuildType() {
        SdkEnvironment sdkEnvironment = this.f5488b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildType();
    }

    public String getAnalyticsSdkVersionName() {
        SdkEnvironment sdkEnvironment = this.f5488b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkVersionName();
    }

    public String getAppBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f5488b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppBuildNumber();
    }

    public String getAppFramework() {
        SdkEnvironment sdkEnvironment = this.f5488b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppFramework();
    }

    public String getAppPlatform() {
        return ConstantDeviceInfo.APP_PLATFORM;
    }

    public synchronized String getAppSetId() {
        AppSetId appSetId;
        try {
            appSetId = this.f5490d;
        } finally {
        }
        return (appSetId == null || appSetId.getId() == null) ? "" : this.f5490d.getId();
    }

    public synchronized String getAppSetIdScope() {
        AppSetId appSetId;
        try {
            appSetId = this.f5490d;
        } finally {
        }
        return appSetId == null ? "" : appSetId.getScope().getValue();
    }

    public String getAppVersion() {
        SdkEnvironment sdkEnvironment = this.f5488b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppVersionName();
    }

    public synchronized String getDeviceIDHash() {
        String str;
        str = "";
        SdkIdentifiers sdkIdentifiers = this.f5489c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceIdHash() != null) {
            str = this.f5489c.getDeviceIdHash();
        }
        return str;
    }

    public synchronized String getDeviceId() {
        String str;
        str = "";
        SdkIdentifiers sdkIdentifiers = this.f5489c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceId() != null) {
            str = this.f5489c.getDeviceId();
        }
        return str;
    }

    public String getDeviceRootStatus() {
        return ConstantDeviceInfo.DEVICE_ROOT_STATUS;
    }

    public String getDeviceType() {
        SdkEnvironment sdkEnvironment = this.f5488b;
        return sdkEnvironment != null ? sdkEnvironment.getDeviceType() : "phone";
    }

    public String getLocale() {
        String str;
        SdkEnvironment sdkEnvironment = this.f5488b;
        return (sdkEnvironment == null || (str = (String) CollectionUtils.getFirstOrNull(sdkEnvironment.getLocales())) == null) ? "" : str;
    }

    public String getManufacturer() {
        return (String) WrapUtils.getOrDefault(ConstantDeviceInfo.MANUFACTURER, "");
    }

    public String getModel() {
        return ConstantDeviceInfo.MODEL;
    }

    public int getOsApiLevel() {
        return ConstantDeviceInfo.OS_API_LEVEL;
    }

    public String getOsVersion() {
        return ConstantDeviceInfo.OS_VERSION;
    }

    public String getPackageName() {
        return this.f5487a;
    }

    public String getProtocolVersion() {
        return "2";
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f5491e;
    }

    public float getScaleFactor() {
        SdkEnvironment sdkEnvironment = this.f5488b;
        if (sdkEnvironment == null) {
            return 0.0f;
        }
        return sdkEnvironment.getScreenInfo().getScaleFactor();
    }

    public int getScreenDpi() {
        SdkEnvironment sdkEnvironment = this.f5488b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getDpi();
    }

    public int getScreenHeight() {
        SdkEnvironment sdkEnvironment = this.f5488b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getHeight();
    }

    public int getScreenWidth() {
        SdkEnvironment sdkEnvironment = this.f5488b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getWidth();
    }

    public synchronized String getUuid() {
        String str;
        str = "";
        SdkIdentifiers sdkIdentifiers = this.f5489c;
        if (sdkIdentifiers != null && sdkIdentifiers.getUuid() != null) {
            str = this.f5489c.getUuid();
        }
        return str;
    }

    public synchronized boolean isIdentifiersValid() {
        boolean z2;
        String uuid;
        String deviceId;
        String deviceIdHash;
        SdkIdentifiers sdkIdentifiers = this.f5489c;
        if (sdkIdentifiers != null && (uuid = sdkIdentifiers.getUuid()) != null && uuid.length() != 0 && (deviceId = sdkIdentifiers.getDeviceId()) != null && deviceId.length() != 0 && (deviceIdHash = sdkIdentifiers.getDeviceIdHash()) != null) {
            z2 = deviceIdHash.length() != 0;
        }
        return z2;
    }

    public void setAppSetId(AppSetId appSetId) {
        this.f5490d = appSetId;
    }

    public void setPackageName(String str) {
        this.f5487a = str;
    }

    public void setRetryPolicyConfig(RetryPolicyConfig retryPolicyConfig) {
        this.f5491e = retryPolicyConfig;
    }

    public void setSdkEnvironment(SdkEnvironment sdkEnvironment) {
        this.f5488b = sdkEnvironment;
    }

    public void setSdkIdentifiers(SdkIdentifiers sdkIdentifiers) {
        this.f5489c = sdkIdentifiers;
    }

    public String toString() {
        return "BaseRequestConfig{mPackageName='" + this.f5487a + "', sdkEnvironment=" + this.f5488b + ", mProtocolVersion='2', sdkIdentifiers=" + this.f5489c + ", retryPolicyConfig=" + this.f5491e + '}';
    }
}
