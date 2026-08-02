package com.datadog.android.core.internal.system;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b`\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u001b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0004R\u0014\u0010%\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0004R\u0014\u0010'\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0004R\u0014\u0010)\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0004R\u0016\u0010+\u001a\u0004\u0018\u00010\u001b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010 "}, d2 = {"Lcom/datadog/android/core/internal/system/AndroidInfoProvider;", "", "", "getArchitecture", "()Ljava/lang/String;", "architecture", "getCurrentLocale", "currentLocale", "getDeviceBrand", "deviceBrand", "getDeviceBuildId", "deviceBuildId", "getDeviceModel", "deviceModel", "getDeviceName", "deviceName", "Lcom/datadog/android/api/context/DeviceType;", "getDeviceType", "()Lcom/datadog/android/api/context/DeviceType;", "deviceType", "", "isLowRam", "()Ljava/lang/Boolean;", "", "getLocales", "()Ljava/util/List;", "locales", "", "getLogicalCpuCount", "()I", "logicalCpuCount", "getNumberOfDisplays", "()Ljava/lang/Integer;", "numberOfDisplays", "getOsMajorVersion", "osMajorVersion", "getOsName", "osName", "getOsVersion", "osVersion", "getTimeZone", "timeZone", "getTotalRam", "totalRam"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AndroidInfoProvider {
    java.lang.String getArchitecture();

    java.lang.String getCurrentLocale();

    java.lang.String getDeviceBrand();

    java.lang.String getDeviceBuildId();

    java.lang.String getDeviceModel();

    java.lang.String getDeviceName();

    com.datadog.android.api.context.DeviceType getDeviceType();

    java.util.List<java.lang.String> getLocales();

    int getLogicalCpuCount();

    java.lang.Integer getNumberOfDisplays();

    java.lang.String getOsMajorVersion();

    java.lang.String getOsName();

    java.lang.String getOsVersion();

    java.lang.String getTimeZone();

    java.lang.Integer getTotalRam();

    java.lang.Boolean isLowRam();
}
