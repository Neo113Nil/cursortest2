package com.datadog.android.api.context;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b1\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0018J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0018J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0018J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u0018J¢\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b0\u0010\u001eJ\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b5\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b6\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b7\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b\u0014\u0010!R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\b>\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\bA\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\bB\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\bC\u0010\u0018R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\bD\u0010\u001a"}, d2 = {"Lcom/datadog/android/api/context/DeviceInfo;", "", "", "deviceName", "deviceBrand", "deviceModel", "Lcom/datadog/android/api/context/DeviceType;", "deviceType", "deviceBuildId", "osName", "osMajorVersion", "osVersion", "architecture", "", "numberOfDisplays", "Lcom/datadog/android/api/context/LocaleInfo;", "localeInfo", "logicalCpuCount", "totalRam", "", "isLowRam", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/api/context/DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/datadog/android/api/context/LocaleInfo;ILjava/lang/Integer;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component10", "()Ljava/lang/Integer;", "component11", "()Lcom/datadog/android/api/context/LocaleInfo;", "component12", "()I", "component13", "component14", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "()Lcom/datadog/android/api/context/DeviceType;", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/api/context/DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/datadog/android/api/context/LocaleInfo;ILjava/lang/Integer;Ljava/lang/Boolean;)Lcom/datadog/android/api/context/DeviceInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getArchitecture", "getDeviceBrand", "getDeviceBuildId", "getDeviceModel", "getDeviceName", "Lcom/datadog/android/api/context/DeviceType;", "getDeviceType", "Ljava/lang/Boolean;", "Lcom/datadog/android/api/context/LocaleInfo;", "getLocaleInfo", com.visa.cbp.getEncExpo.warmup, "getLogicalCpuCount", "Ljava/lang/Integer;", "getNumberOfDisplays", "getOsMajorVersion", "getOsName", "getOsVersion", "getTotalRam"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeviceInfo {
    private final java.lang.String architecture;
    private final java.lang.String deviceBrand;
    private final java.lang.String deviceBuildId;
    private final java.lang.String deviceModel;
    private final java.lang.String deviceName;
    private final com.datadog.android.api.context.DeviceType deviceType;
    private final java.lang.Boolean isLowRam;
    private final com.datadog.android.api.context.LocaleInfo localeInfo;
    private final int logicalCpuCount;
    private final java.lang.Integer numberOfDisplays;
    private final java.lang.String osMajorVersion;
    private final java.lang.String osName;
    private final java.lang.String osVersion;
    private final java.lang.Integer totalRam;

    public DeviceInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, com.datadog.android.api.context.DeviceType deviceType, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.Integer num, com.datadog.android.api.context.LocaleInfo localeInfo, int i, java.lang.Integer num2, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInfo, "");
        this.deviceName = str;
        this.deviceBrand = str2;
        this.deviceModel = str3;
        this.deviceType = deviceType;
        this.deviceBuildId = str4;
        this.osName = str5;
        this.osMajorVersion = str6;
        this.osVersion = str7;
        this.architecture = str8;
        this.numberOfDisplays = num;
        this.localeInfo = localeInfo;
        this.logicalCpuCount = i;
        this.totalRam = num2;
        this.isLowRam = bool;
    }

    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    public final java.lang.String getDeviceBrand() {
        return this.deviceBrand;
    }

    public final java.lang.String getDeviceModel() {
        return this.deviceModel;
    }

    public final com.datadog.android.api.context.DeviceType getDeviceType() {
        return this.deviceType;
    }

    public final java.lang.String getDeviceBuildId() {
        return this.deviceBuildId;
    }

    public final java.lang.String getOsName() {
        return this.osName;
    }

    public final java.lang.String getOsMajorVersion() {
        return this.osMajorVersion;
    }

    public final java.lang.String getOsVersion() {
        return this.osVersion;
    }

    public final java.lang.String getArchitecture() {
        return this.architecture;
    }

    public final java.lang.Integer getNumberOfDisplays() {
        return this.numberOfDisplays;
    }

    public final com.datadog.android.api.context.LocaleInfo getLocaleInfo() {
        return this.localeInfo;
    }

    public final int getLogicalCpuCount() {
        return this.logicalCpuCount;
    }

    public final java.lang.Integer getTotalRam() {
        return this.totalRam;
    }

    public final java.lang.Boolean isLowRam() {
        return this.isLowRam;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.deviceName;
        java.lang.String str2 = this.deviceBrand;
        java.lang.String str3 = this.deviceModel;
        com.datadog.android.api.context.DeviceType deviceType = this.deviceType;
        java.lang.String str4 = this.deviceBuildId;
        java.lang.String str5 = this.osName;
        java.lang.String str6 = this.osMajorVersion;
        java.lang.String str7 = this.osVersion;
        java.lang.String str8 = this.architecture;
        java.lang.Integer num = this.numberOfDisplays;
        com.datadog.android.api.context.LocaleInfo localeInfo = this.localeInfo;
        int i = this.logicalCpuCount;
        java.lang.Integer num2 = this.totalRam;
        java.lang.Boolean bool = this.isLowRam;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceInfo(deviceName=");
        sb.append(str);
        sb.append(", deviceBrand=");
        sb.append(str2);
        sb.append(", deviceModel=");
        sb.append(str3);
        sb.append(", deviceType=");
        sb.append(deviceType);
        sb.append(", deviceBuildId=");
        sb.append(str4);
        sb.append(", osName=");
        sb.append(str5);
        sb.append(", osMajorVersion=");
        sb.append(str6);
        sb.append(", osVersion=");
        sb.append(str7);
        sb.append(", architecture=");
        sb.append(str8);
        sb.append(", numberOfDisplays=");
        sb.append(num);
        sb.append(", localeInfo=");
        sb.append(localeInfo);
        sb.append(", logicalCpuCount=");
        sb.append(i);
        sb.append(", totalRam=");
        sb.append(num2);
        sb.append(", isLowRam=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.deviceName.hashCode();
        int hashCode2 = this.deviceBrand.hashCode();
        int hashCode3 = this.deviceModel.hashCode();
        int hashCode4 = this.deviceType.hashCode();
        int hashCode5 = this.deviceBuildId.hashCode();
        int hashCode6 = this.osName.hashCode();
        int hashCode7 = this.osMajorVersion.hashCode();
        int hashCode8 = this.osVersion.hashCode();
        int hashCode9 = this.architecture.hashCode();
        java.lang.Integer num = this.numberOfDisplays;
        int hashCode10 = num == null ? 0 : num.hashCode();
        int hashCode11 = this.localeInfo.hashCode();
        int hashCode12 = java.lang.Integer.hashCode(this.logicalCpuCount);
        java.lang.Integer num2 = this.totalRam;
        int hashCode13 = num2 == null ? 0 : num2.hashCode();
        java.lang.Boolean bool = this.isLowRam;
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.api.context.DeviceInfo)) {
            return false;
        }
        com.datadog.android.api.context.DeviceInfo deviceInfo = (com.datadog.android.api.context.DeviceInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceName, deviceInfo.deviceName) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceBrand, deviceInfo.deviceBrand) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceModel, deviceInfo.deviceModel) && this.deviceType == deviceInfo.deviceType && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceBuildId, deviceInfo.deviceBuildId) && kotlin.jvm.internal.Intrinsics.areEqual(this.osName, deviceInfo.osName) && kotlin.jvm.internal.Intrinsics.areEqual(this.osMajorVersion, deviceInfo.osMajorVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.osVersion, deviceInfo.osVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.architecture, deviceInfo.architecture) && kotlin.jvm.internal.Intrinsics.areEqual(this.numberOfDisplays, deviceInfo.numberOfDisplays) && kotlin.jvm.internal.Intrinsics.areEqual(this.localeInfo, deviceInfo.localeInfo) && this.logicalCpuCount == deviceInfo.logicalCpuCount && kotlin.jvm.internal.Intrinsics.areEqual(this.totalRam, deviceInfo.totalRam) && kotlin.jvm.internal.Intrinsics.areEqual(this.isLowRam, deviceInfo.isLowRam);
    }

    public final com.datadog.android.api.context.DeviceInfo copy(java.lang.String deviceName, java.lang.String deviceBrand, java.lang.String deviceModel, com.datadog.android.api.context.DeviceType deviceType, java.lang.String deviceBuildId, java.lang.String osName, java.lang.String osMajorVersion, java.lang.String osVersion, java.lang.String architecture, java.lang.Integer numberOfDisplays, com.datadog.android.api.context.LocaleInfo localeInfo, int logicalCpuCount, java.lang.Integer totalRam, java.lang.Boolean isLowRam) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBrand, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBuildId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(osName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(osMajorVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(osVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(architecture, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInfo, "");
        return new com.datadog.android.api.context.DeviceInfo(deviceName, deviceBrand, deviceModel, deviceType, deviceBuildId, osName, osMajorVersion, osVersion, architecture, numberOfDisplays, localeInfo, logicalCpuCount, totalRam, isLowRam);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getArchitecture() {
        return this.architecture;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getOsMajorVersion() {
        return this.osMajorVersion;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getOsName() {
        return this.osName;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getDeviceBuildId() {
        return this.deviceBuildId;
    }

    /* renamed from: component4, reason: from getter */
    public final com.datadog.android.api.context.DeviceType getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDeviceModel() {
        return this.deviceModel;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDeviceBrand() {
        return this.deviceBrand;
    }

    /* renamed from: component14, reason: from getter */
    public final java.lang.Boolean getIsLowRam() {
        return this.isLowRam;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.Integer getTotalRam() {
        return this.totalRam;
    }

    /* renamed from: component12, reason: from getter */
    public final int getLogicalCpuCount() {
        return this.logicalCpuCount;
    }

    /* renamed from: component11, reason: from getter */
    public final com.datadog.android.api.context.LocaleInfo getLocaleInfo() {
        return this.localeInfo;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.Integer getNumberOfDisplays() {
        return this.numberOfDisplays;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }
}
