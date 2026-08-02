package com.datadog.android.core.internal.system;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00138\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0017X\u0097D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010!8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\bR\u001a\u0010,\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\bR\u001a\u0010.\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\bR\u001c\u00102\u001a\u0004\u0018\u00010!8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010)"}, d2 = {"Lcom/datadog/android/core/internal/system/NoOpAndroidInfoProvider;", "Lcom/datadog/android/core/internal/system/AndroidInfoProvider;", "<init>", "()V", "", "architecture", "Ljava/lang/String;", "getArchitecture", "()Ljava/lang/String;", "currentLocale", "getCurrentLocale", "deviceBrand", "getDeviceBrand", "deviceBuildId", "getDeviceBuildId", "deviceModel", "getDeviceModel", "deviceName", "getDeviceName", "Lcom/datadog/android/api/context/DeviceType;", "deviceType", "Lcom/datadog/android/api/context/DeviceType;", "getDeviceType", "()Lcom/datadog/android/api/context/DeviceType;", "", "isLowRam", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "", "locales", "Ljava/util/List;", "getLocales", "()Ljava/util/List;", "", "logicalCpuCount", com.visa.cbp.getEncExpo.warmup, "getLogicalCpuCount", "()I", "numberOfDisplays", "Ljava/lang/Integer;", "getNumberOfDisplays", "()Ljava/lang/Integer;", "osMajorVersion", "getOsMajorVersion", "osName", "getOsName", "osVersion", "getOsVersion", "timeZone", "getTimeZone", "totalRam", "getTotalRam"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpAndroidInfoProvider implements com.datadog.android.core.internal.system.AndroidInfoProvider {
    private final java.lang.Boolean isLowRam;
    private final int logicalCpuCount;
    private final java.lang.Integer numberOfDisplays;
    private final java.lang.Integer totalRam;
    private final java.lang.String deviceName = "";
    private final java.lang.String deviceBrand = "";
    private final java.lang.String deviceModel = "";
    private final com.datadog.android.api.context.DeviceType deviceType = com.datadog.android.api.context.DeviceType.MOBILE;
    private final java.lang.String deviceBuildId = "";
    private final java.lang.String osName = "";
    private final java.lang.String osMajorVersion = "";
    private final java.lang.String osVersion = "";
    private final java.lang.String architecture = "";
    private final java.util.List<java.lang.String> locales = kotlin.collections.CollectionsKt.emptyList();
    private final java.lang.String currentLocale = "";
    private final java.lang.String timeZone = "";

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getDeviceBrand() {
        return this.deviceBrand;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getDeviceModel() {
        return this.deviceModel;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final com.datadog.android.api.context.DeviceType getDeviceType() {
        return this.deviceType;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getDeviceBuildId() {
        return this.deviceBuildId;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getOsName() {
        return this.osName;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getOsMajorVersion() {
        return this.osMajorVersion;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getOsVersion() {
        return this.osVersion;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getArchitecture() {
        return this.architecture;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.Integer getNumberOfDisplays() {
        return this.numberOfDisplays;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.util.List<java.lang.String> getLocales() {
        return this.locales;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getCurrentLocale() {
        return this.currentLocale;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getTimeZone() {
        return this.timeZone;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final int getLogicalCpuCount() {
        return this.logicalCpuCount;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.Integer getTotalRam() {
        return this.totalRam;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    /* renamed from: isLowRam, reason: from getter */
    public final java.lang.Boolean getIsLowRam() {
        return this.isLowRam;
    }
}
