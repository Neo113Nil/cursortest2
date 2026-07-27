package com.onesignal.debug.internal.logging.otel.android;

import a.AbstractC0169a;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.OneSignalWrapper;
import com.onesignal.core.internal.features.IFeatureManager;
import com.onesignal.core.internal.http.OneSignalService;
import com.onesignal.debug.internal.crash.AnrConstants;
import com.onesignal.otel.IOtelPlatformProvider;
import f4.InterfaceC0428e;
import g4.C0471p;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import io.appmetrica.analytics.impl.C0872oa;
import io.appmetrica.analytics.impl.H2;
import java.util.Iterator;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OtelPlatformProvider implements IOtelPlatformProvider {
    private final String apiBaseUrl;
    private final InterfaceC0428e appId$delegate;
    private final String appPackageId;
    private final String appVersion;
    private final Context context;
    private final InterfaceC0428e crashStoragePath$delegate;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final InterfaceC1430a featureManagerProvider;
    private final InterfaceC1430a getIsInForeground;
    private final OtelIdResolver idResolver;
    private final boolean isOtelExporterLoggingEnabled;
    private final InterfaceC0428e isRemoteLoggingEnabled$delegate;
    private final long minFileAgeForReadMillis;
    private final InterfaceC0428e onesignalId$delegate;
    private final String osBuildId;
    private final String osName;
    private final String osVersion;
    private final InterfaceC0428e pushSubscriptionId$delegate;
    private final InterfaceC0428e remoteLogLevel$delegate;
    private final String sdkBase;
    private final String sdkBaseVersion;
    private final String sdkWrapper;
    private final String sdkWrapperVersion;

    public OtelPlatformProvider(OtelPlatformProviderConfig config, InterfaceC1430a featureManagerProvider) {
        i.e(config, "config");
        i.e(featureManagerProvider, "featureManagerProvider");
        this.featureManagerProvider = featureManagerProvider;
        this.appPackageId = config.getAppPackageId();
        this.appVersion = config.getAppVersion();
        Context context = config.getContext();
        this.context = context;
        this.getIsInForeground = config.getGetIsInForeground();
        this.idResolver = new OtelIdResolver(context);
        this.sdkBase = "android";
        this.sdkBaseVersion = OneSignalUtils.INSTANCE.getSdkVersion();
        String MANUFACTURER = Build.MANUFACTURER;
        i.d(MANUFACTURER, "MANUFACTURER");
        this.deviceManufacturer = MANUFACTURER;
        String MODEL = Build.MODEL;
        i.d(MODEL, "MODEL");
        this.deviceModel = MODEL;
        this.osName = "Android";
        String RELEASE = Build.VERSION.RELEASE;
        i.d(RELEASE, "RELEASE");
        this.osVersion = RELEASE;
        String ID = Build.ID;
        i.d(ID, "ID");
        this.osBuildId = ID;
        this.sdkWrapper = OneSignalWrapper.getSdkType();
        this.sdkWrapperVersion = OneSignalWrapper.getSdkVersion();
        this.appId$delegate = AbstractC0169a.A(new OtelPlatformProvider$appId$2(this));
        this.onesignalId$delegate = AbstractC0169a.A(new OtelPlatformProvider$onesignalId$2(this));
        this.pushSubscriptionId$delegate = AbstractC0169a.A(new OtelPlatformProvider$pushSubscriptionId$2(this));
        this.crashStoragePath$delegate = AbstractC0169a.A(new OtelPlatformProvider$crashStoragePath$2(config));
        this.minFileAgeForReadMillis = AnrConstants.DEFAULT_ANR_THRESHOLD_MS;
        this.isRemoteLoggingEnabled$delegate = AbstractC0169a.A(new OtelPlatformProvider$isRemoteLoggingEnabled$2(this));
        this.remoteLogLevel$delegate = AbstractC0169a.A(new OtelPlatformProvider$remoteLogLevel$2(this));
        this.apiBaseUrl = OneSignalService.ONESIGNAL_API_BASE_URL;
    }

    public static /* synthetic */ void getEnabledFeatureFlags$annotations() {
    }

    public static /* synthetic */ void getRemoteLogLevel$annotations() {
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getApiBaseUrl() {
        return this.apiBaseUrl;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getAppId() {
        return (String) this.appId$delegate.getValue();
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getAppIdForHeaders() {
        String appId = getAppId();
        return appId == null ? "" : appId;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getAppPackageId() {
        return this.appPackageId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (r5.intValue() == 200) goto L42;
     */
    @Override // com.onesignal.otel.IOtelPlatformProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getAppState() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        Object obj;
        Boolean bool;
        try {
            InterfaceC1430a interfaceC1430a = this.getIsInForeground;
            String str = H2.f6853g;
            if (interfaceC1430a == null || (bool = (Boolean) interfaceC1430a.invoke()) == null) {
                Context context = this.context;
                if (context == null) {
                    return CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
                }
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) obj).pid == Process.myPid()) {
                            break;
                        }
                    }
                    runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                } else {
                    runningAppProcessInfo = null;
                }
                Integer valueOf = runningAppProcessInfo != null ? Integer.valueOf(runningAppProcessInfo.importance) : null;
                if (valueOf != null && valueOf.intValue() == 100) {
                    return C0872oa.f8919g;
                }
            } else if (bool.booleanValue()) {
                str = C0872oa.f8919g;
            }
            return str;
        } catch (Exception unused) {
            return CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
        }
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getAppVersion() {
        return this.appVersion;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getCrashStoragePath() {
        return (String) this.crashStoragePath$delegate.getValue();
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getCurrentThreadName() {
        String name = Thread.currentThread().getName();
        i.d(name, "getName(...)");
        return name;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getDeviceModel() {
        return this.deviceModel;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public List<String> getEnabledFeatureFlags() {
        try {
            return ((IFeatureManager) this.featureManagerProvider.invoke()).enabledFeatureKeys();
        } catch (Throwable unused) {
            return C0471p.f5750a;
        }
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public Object getInstallId(InterfaceC1218d interfaceC1218d) {
        return this.idResolver.resolveInstallId();
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public long getMinFileAgeForReadMillis() {
        return this.minFileAgeForReadMillis;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getOnesignalId() {
        return (String) this.onesignalId$delegate.getValue();
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getOsBuildId() {
        return this.osBuildId;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getOsName() {
        return this.osName;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getOsVersion() {
        return this.osVersion;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public long getProcessUptime() {
        return SystemClock.uptimeMillis() - Process.getStartUptimeMillis();
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getPushSubscriptionId() {
        return (String) this.pushSubscriptionId$delegate.getValue();
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getRemoteLogLevel() {
        return (String) this.remoteLogLevel$delegate.getValue();
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getSdkBase() {
        return this.sdkBase;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getSdkBaseVersion() {
        return this.sdkBaseVersion;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getSdkWrapper() {
        return this.sdkWrapper;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public String getSdkWrapperVersion() {
        return this.sdkWrapperVersion;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public boolean isOtelExporterLoggingEnabled() {
        return this.isOtelExporterLoggingEnabled;
    }

    @Override // com.onesignal.otel.IOtelPlatformProvider
    public boolean isRemoteLoggingEnabled() {
        return ((Boolean) this.isRemoteLoggingEnabled$delegate.getValue()).booleanValue();
    }
}
