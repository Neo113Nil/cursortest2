package com.datadog.android.api.context;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012 \u0010\u001e\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001d0\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u00102J*\u00103\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001d0\u001dHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b5\u00102J\u0010\u00106\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b6\u00102J\u0010\u00107\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b7\u00102J\u0010\u00108\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b8\u00102J\u0010\u00109\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b;\u00102J\u0010\u0010<\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b<\u00102J\u0010\u0010=\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b=\u00102Jâ\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\"\b\u0002\u0010\u001e\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001d0\u001dHÆ\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010B\u001a\u00020A2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bD\u0010:J\u0010\u0010E\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bE\u00102R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007¢\u0006\f\n\u0004\b\u0019\u0010F\u001a\u0004\bG\u0010.R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010H\u001a\u0004\bI\u00102R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bJ\u00102R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\bL\u0010*R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bM\u00102R4\u0010\u001e\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001d0\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010N\u001a\u0004\bO\u00104R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010P\u001a\u0004\bQ\u0010(R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010R\u001a\u0004\bS\u0010&R\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010H\u001a\u0004\bT\u00102R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010H\u001a\u0004\bU\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010V\u001a\u0004\bW\u0010\"R\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bX\u00102R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010Y\u001a\u0004\bZ\u0010$R\u001a\u0010\u001b\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010[\u001a\u0004\b\\\u00100R\u001a\u0010\u0017\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010]\u001a\u0004\b^\u0010,R\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010H\u001a\u0004\b_\u00102R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010H\u001a\u0004\b`\u00102R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010a\u001a\u0004\bb\u0010:"}, d2 = {"Lcom/datadog/android/api/context/DatadogContext;", "", "Lcom/datadog/android/DatadogSite;", com.datadog.trace.api.config.GeneralConfig.SITE, "", "clientToken", "service", "env", "version", "", "versionCode", "variant", "source", "sdkVersion", "Lcom/datadog/android/api/context/TimeInfo;", "time", "Lcom/datadog/android/api/context/ProcessInfo;", "processInfo", "Lcom/datadog/android/api/context/NetworkInfo;", "networkInfo", "Lcom/datadog/android/api/context/DeviceInfo;", "deviceInfo", "Lcom/datadog/android/api/context/UserInfo;", "userInfo", "Lcom/datadog/android/api/context/AccountInfo;", "accountInfo", "Lcom/datadog/android/privacy/TrackingConsent;", "trackingConsent", "appBuildId", "", "featuresContext", "<init>", "(Lcom/datadog/android/DatadogSite;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/api/context/TimeInfo;Lcom/datadog/android/api/context/ProcessInfo;Lcom/datadog/android/api/context/NetworkInfo;Lcom/datadog/android/api/context/DeviceInfo;Lcom/datadog/android/api/context/UserInfo;Lcom/datadog/android/api/context/AccountInfo;Lcom/datadog/android/privacy/TrackingConsent;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Lcom/datadog/android/DatadogSite;", "component10", "()Lcom/datadog/android/api/context/TimeInfo;", "component11", "()Lcom/datadog/android/api/context/ProcessInfo;", "component12", "()Lcom/datadog/android/api/context/NetworkInfo;", "component13", "()Lcom/datadog/android/api/context/DeviceInfo;", "component14", "()Lcom/datadog/android/api/context/UserInfo;", "component15", "()Lcom/datadog/android/api/context/AccountInfo;", "component16", "()Lcom/datadog/android/privacy/TrackingConsent;", "component17", "()Ljava/lang/String;", "component18", "()Ljava/util/Map;", "component2", "component3", "component4", "component5", "component6", "()I", "component7", "component8", "component9", "copy", "(Lcom/datadog/android/DatadogSite;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/api/context/TimeInfo;Lcom/datadog/android/api/context/ProcessInfo;Lcom/datadog/android/api/context/NetworkInfo;Lcom/datadog/android/api/context/DeviceInfo;Lcom/datadog/android/api/context/UserInfo;Lcom/datadog/android/api/context/AccountInfo;Lcom/datadog/android/privacy/TrackingConsent;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/api/context/DatadogContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/datadog/android/api/context/AccountInfo;", "getAccountInfo", "Ljava/lang/String;", "getAppBuildId", "getClientToken", "Lcom/datadog/android/api/context/DeviceInfo;", "getDeviceInfo", "getEnv", "Ljava/util/Map;", "getFeaturesContext", "Lcom/datadog/android/api/context/NetworkInfo;", "getNetworkInfo", "Lcom/datadog/android/api/context/ProcessInfo;", "getProcessInfo", "getSdkVersion", "getService", "Lcom/datadog/android/DatadogSite;", "getSite", "getSource", "Lcom/datadog/android/api/context/TimeInfo;", "getTime", "Lcom/datadog/android/privacy/TrackingConsent;", "getTrackingConsent", "Lcom/datadog/android/api/context/UserInfo;", "getUserInfo", "getVariant", "getVersion", com.visa.cbp.getEncExpo.warmup, "getVersionCode"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DatadogContext {
    private final com.datadog.android.api.context.AccountInfo accountInfo;
    private final java.lang.String appBuildId;
    private final java.lang.String clientToken;
    private final com.datadog.android.api.context.DeviceInfo deviceInfo;
    private final java.lang.String env;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> featuresContext;
    private final com.datadog.android.api.context.NetworkInfo networkInfo;
    private final com.datadog.android.api.context.ProcessInfo processInfo;
    private final java.lang.String sdkVersion;
    private final java.lang.String service;
    private final com.datadog.android.DatadogSite site;
    private final java.lang.String source;
    private final com.datadog.android.api.context.TimeInfo time;
    private final com.datadog.android.privacy.TrackingConsent trackingConsent;
    private final com.datadog.android.api.context.UserInfo userInfo;
    private final java.lang.String variant;
    private final java.lang.String version;
    private final int versionCode;

    /* JADX WARN: Multi-variable type inference failed */
    public DatadogContext(com.datadog.android.DatadogSite datadogSite, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.datadog.android.api.context.TimeInfo timeInfo, com.datadog.android.api.context.ProcessInfo processInfo, com.datadog.android.api.context.NetworkInfo networkInfo, com.datadog.android.api.context.DeviceInfo deviceInfo, com.datadog.android.api.context.UserInfo userInfo, com.datadog.android.api.context.AccountInfo accountInfo, com.datadog.android.privacy.TrackingConsent trackingConsent, java.lang.String str8, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogSite, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingConsent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.site = datadogSite;
        this.clientToken = str;
        this.service = str2;
        this.env = str3;
        this.version = str4;
        this.versionCode = i;
        this.variant = str5;
        this.source = str6;
        this.sdkVersion = str7;
        this.time = timeInfo;
        this.processInfo = processInfo;
        this.networkInfo = networkInfo;
        this.deviceInfo = deviceInfo;
        this.userInfo = userInfo;
        this.accountInfo = accountInfo;
        this.trackingConsent = trackingConsent;
        this.appBuildId = str8;
        this.featuresContext = map;
    }

    public final com.datadog.android.DatadogSite getSite() {
        return this.site;
    }

    public final java.lang.String getClientToken() {
        return this.clientToken;
    }

    public final java.lang.String getService() {
        return this.service;
    }

    public final java.lang.String getEnv() {
        return this.env;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final java.lang.String getVariant() {
        return this.variant;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final java.lang.String getSdkVersion() {
        return this.sdkVersion;
    }

    public final com.datadog.android.api.context.TimeInfo getTime() {
        return this.time;
    }

    public final com.datadog.android.api.context.ProcessInfo getProcessInfo() {
        return this.processInfo;
    }

    public final com.datadog.android.api.context.NetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    public final com.datadog.android.api.context.DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final com.datadog.android.api.context.UserInfo getUserInfo() {
        return this.userInfo;
    }

    public final com.datadog.android.api.context.AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    public final com.datadog.android.privacy.TrackingConsent getTrackingConsent() {
        return this.trackingConsent;
    }

    public final java.lang.String getAppBuildId() {
        return this.appBuildId;
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> getFeaturesContext() {
        return this.featuresContext;
    }

    public final java.lang.String toString() {
        com.datadog.android.DatadogSite datadogSite = this.site;
        java.lang.String str = this.clientToken;
        java.lang.String str2 = this.service;
        java.lang.String str3 = this.env;
        java.lang.String str4 = this.version;
        int i = this.versionCode;
        java.lang.String str5 = this.variant;
        java.lang.String str6 = this.source;
        java.lang.String str7 = this.sdkVersion;
        com.datadog.android.api.context.TimeInfo timeInfo = this.time;
        com.datadog.android.api.context.ProcessInfo processInfo = this.processInfo;
        com.datadog.android.api.context.NetworkInfo networkInfo = this.networkInfo;
        com.datadog.android.api.context.DeviceInfo deviceInfo = this.deviceInfo;
        com.datadog.android.api.context.UserInfo userInfo = this.userInfo;
        com.datadog.android.api.context.AccountInfo accountInfo = this.accountInfo;
        com.datadog.android.privacy.TrackingConsent trackingConsent = this.trackingConsent;
        java.lang.String str8 = this.appBuildId;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map = this.featuresContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DatadogContext(site=");
        sb.append(datadogSite);
        sb.append(", clientToken=");
        sb.append(str);
        sb.append(", service=");
        sb.append(str2);
        sb.append(", env=");
        sb.append(str3);
        sb.append(", version=");
        sb.append(str4);
        sb.append(", versionCode=");
        sb.append(i);
        sb.append(", variant=");
        sb.append(str5);
        sb.append(", source=");
        sb.append(str6);
        sb.append(", sdkVersion=");
        sb.append(str7);
        sb.append(", time=");
        sb.append(timeInfo);
        sb.append(", processInfo=");
        sb.append(processInfo);
        sb.append(", networkInfo=");
        sb.append(networkInfo);
        sb.append(", deviceInfo=");
        sb.append(deviceInfo);
        sb.append(", userInfo=");
        sb.append(userInfo);
        sb.append(", accountInfo=");
        sb.append(accountInfo);
        sb.append(", trackingConsent=");
        sb.append(trackingConsent);
        sb.append(", appBuildId=");
        sb.append(str8);
        sb.append(", featuresContext=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.site.hashCode();
        int hashCode2 = this.clientToken.hashCode();
        int hashCode3 = this.service.hashCode();
        int hashCode4 = this.env.hashCode();
        int hashCode5 = this.version.hashCode();
        int hashCode6 = java.lang.Integer.hashCode(this.versionCode);
        int hashCode7 = this.variant.hashCode();
        int hashCode8 = this.source.hashCode();
        int hashCode9 = this.sdkVersion.hashCode();
        int hashCode10 = this.time.hashCode();
        int hashCode11 = this.processInfo.hashCode();
        int hashCode12 = this.networkInfo.hashCode();
        int hashCode13 = this.deviceInfo.hashCode();
        int hashCode14 = this.userInfo.hashCode();
        com.datadog.android.api.context.AccountInfo accountInfo = this.accountInfo;
        int hashCode15 = accountInfo == null ? 0 : accountInfo.hashCode();
        int hashCode16 = this.trackingConsent.hashCode();
        java.lang.String str = this.appBuildId;
        return (((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.featuresContext.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.api.context.DatadogContext)) {
            return false;
        }
        com.datadog.android.api.context.DatadogContext datadogContext = (com.datadog.android.api.context.DatadogContext) other;
        return this.site == datadogContext.site && kotlin.jvm.internal.Intrinsics.areEqual(this.clientToken, datadogContext.clientToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.service, datadogContext.service) && kotlin.jvm.internal.Intrinsics.areEqual(this.env, datadogContext.env) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, datadogContext.version) && this.versionCode == datadogContext.versionCode && kotlin.jvm.internal.Intrinsics.areEqual(this.variant, datadogContext.variant) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, datadogContext.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkVersion, datadogContext.sdkVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.time, datadogContext.time) && kotlin.jvm.internal.Intrinsics.areEqual(this.processInfo, datadogContext.processInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.networkInfo, datadogContext.networkInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceInfo, datadogContext.deviceInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.userInfo, datadogContext.userInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountInfo, datadogContext.accountInfo) && this.trackingConsent == datadogContext.trackingConsent && kotlin.jvm.internal.Intrinsics.areEqual(this.appBuildId, datadogContext.appBuildId) && kotlin.jvm.internal.Intrinsics.areEqual(this.featuresContext, datadogContext.featuresContext);
    }

    public final com.datadog.android.api.context.DatadogContext copy(com.datadog.android.DatadogSite site, java.lang.String clientToken, java.lang.String service, java.lang.String env, java.lang.String version, int versionCode, java.lang.String variant, java.lang.String source, java.lang.String sdkVersion, com.datadog.android.api.context.TimeInfo time, com.datadog.android.api.context.ProcessInfo processInfo, com.datadog.android.api.context.NetworkInfo networkInfo, com.datadog.android.api.context.DeviceInfo deviceInfo, com.datadog.android.api.context.UserInfo userInfo, com.datadog.android.api.context.AccountInfo accountInfo, com.datadog.android.privacy.TrackingConsent trackingConsent, java.lang.String appBuildId, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> featuresContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(site, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(service, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(env, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingConsent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featuresContext, "");
        return new com.datadog.android.api.context.DatadogContext(site, clientToken, service, env, version, versionCode, variant, source, sdkVersion, time, processInfo, networkInfo, deviceInfo, userInfo, accountInfo, trackingConsent, appBuildId, featuresContext);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getSdkVersion() {
        return this.sdkVersion;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getVariant() {
        return this.variant;
    }

    /* renamed from: component6, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getEnv() {
        return this.env;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getService() {
        return this.service;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getClientToken() {
        return this.clientToken;
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> component18() {
        return this.featuresContext;
    }

    /* renamed from: component17, reason: from getter */
    public final java.lang.String getAppBuildId() {
        return this.appBuildId;
    }

    /* renamed from: component16, reason: from getter */
    public final com.datadog.android.privacy.TrackingConsent getTrackingConsent() {
        return this.trackingConsent;
    }

    /* renamed from: component15, reason: from getter */
    public final com.datadog.android.api.context.AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    /* renamed from: component14, reason: from getter */
    public final com.datadog.android.api.context.UserInfo getUserInfo() {
        return this.userInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final com.datadog.android.api.context.DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final com.datadog.android.api.context.NetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    /* renamed from: component11, reason: from getter */
    public final com.datadog.android.api.context.ProcessInfo getProcessInfo() {
        return this.processInfo;
    }

    /* renamed from: component10, reason: from getter */
    public final com.datadog.android.api.context.TimeInfo getTime() {
        return this.time;
    }

    /* renamed from: component1, reason: from getter */
    public final com.datadog.android.DatadogSite getSite() {
        return this.site;
    }
}
