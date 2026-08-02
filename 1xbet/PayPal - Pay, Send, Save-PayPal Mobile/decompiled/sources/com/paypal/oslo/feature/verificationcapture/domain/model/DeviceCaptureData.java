package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b#\u0010$Jf\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001eR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010 R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010\"R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/SdkInfo;", "sdkInfo", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceInfo;", "deviceInfo", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureDeviceInfo;", "captureDeviceInfo", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureInfo;", "captureInfo", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/SensorData;", "sensorData", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/BatteryInfo;", "batteryInfo", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/MediaDeviceInfo;", "mediaDeviceInfo", "", "appVersion", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/SdkInfo;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceInfo;Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureDeviceInfo;Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureInfo;Lcom/paypal/oslo/feature/verificationcapture/domain/model/SensorData;Lcom/paypal/oslo/feature/verificationcapture/domain/model/BatteryInfo;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/SdkInfo;", "component2", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceInfo;", "component3", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureDeviceInfo;", "component4", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureInfo;", "component5", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/SensorData;", "component6", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/BatteryInfo;", "component7", "()Ljava/util/List;", "component8", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/SdkInfo;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceInfo;Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureDeviceInfo;Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureInfo;Lcom/paypal/oslo/feature/verificationcapture/domain/model/SensorData;Lcom/paypal/oslo/feature/verificationcapture/domain/model/BatteryInfo;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/SdkInfo;", "getSdkInfo", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceInfo;", "getDeviceInfo", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureDeviceInfo;", "getCaptureDeviceInfo", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureInfo;", "getCaptureInfo", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/SensorData;", "getSensorData", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/BatteryInfo;", "getBatteryInfo", "Ljava/util/List;", "getMediaDeviceInfo", "Ljava/lang/String;", "getAppVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeviceCaptureData {
    public static final int $stable = 8;
    private final java.lang.String appVersion;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.BatteryInfo batteryInfo;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDeviceInfo captureDeviceInfo;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureInfo captureInfo;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.DeviceInfo deviceInfo;
    private final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo> mediaDeviceInfo;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo sdkInfo;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.SensorData sensorData;

    public DeviceCaptureData(com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo sdkInfo, com.paypal.oslo.feature.verificationcapture.domain.model.DeviceInfo deviceInfo, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDeviceInfo captureDeviceInfo, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureInfo captureInfo, com.paypal.oslo.feature.verificationcapture.domain.model.SensorData sensorData, com.paypal.oslo.feature.verificationcapture.domain.model.BatteryInfo batteryInfo, java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo> list, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureDeviceInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sensorData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.sdkInfo = sdkInfo;
        this.deviceInfo = deviceInfo;
        this.captureDeviceInfo = captureDeviceInfo;
        this.captureInfo = captureInfo;
        this.sensorData = sensorData;
        this.batteryInfo = batteryInfo;
        this.mediaDeviceInfo = list;
        this.appVersion = str;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo getSdkInfo() {
        return this.sdkInfo;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDeviceInfo getCaptureDeviceInfo() {
        return this.captureDeviceInfo;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureInfo getCaptureInfo() {
        return this.captureInfo;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.SensorData getSensorData() {
        return this.sensorData;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.BatteryInfo getBatteryInfo() {
        return this.batteryInfo;
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo> getMediaDeviceInfo() {
        return this.mediaDeviceInfo;
    }

    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo sdkInfo = this.sdkInfo;
        com.paypal.oslo.feature.verificationcapture.domain.model.DeviceInfo deviceInfo = this.deviceInfo;
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDeviceInfo captureDeviceInfo = this.captureDeviceInfo;
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureInfo captureInfo = this.captureInfo;
        com.paypal.oslo.feature.verificationcapture.domain.model.SensorData sensorData = this.sensorData;
        com.paypal.oslo.feature.verificationcapture.domain.model.BatteryInfo batteryInfo = this.batteryInfo;
        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo> list = this.mediaDeviceInfo;
        java.lang.String str = this.appVersion;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceCaptureData(sdkInfo=");
        sb.append(sdkInfo);
        sb.append(", deviceInfo=");
        sb.append(deviceInfo);
        sb.append(", captureDeviceInfo=");
        sb.append(captureDeviceInfo);
        sb.append(", captureInfo=");
        sb.append(captureInfo);
        sb.append(", sensorData=");
        sb.append(sensorData);
        sb.append(", batteryInfo=");
        sb.append(batteryInfo);
        sb.append(", mediaDeviceInfo=");
        sb.append(list);
        sb.append(", appVersion=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((this.sdkInfo.hashCode() * 31) + this.deviceInfo.hashCode()) * 31) + this.captureDeviceInfo.hashCode()) * 31) + this.captureInfo.hashCode()) * 31) + this.sensorData.hashCode()) * 31) + this.batteryInfo.hashCode()) * 31) + this.mediaDeviceInfo.hashCode()) * 31) + this.appVersion.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData deviceCaptureData = (com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sdkInfo, deviceCaptureData.sdkInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceInfo, deviceCaptureData.deviceInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.captureDeviceInfo, deviceCaptureData.captureDeviceInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.captureInfo, deviceCaptureData.captureInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.sensorData, deviceCaptureData.sensorData) && kotlin.jvm.internal.Intrinsics.areEqual(this.batteryInfo, deviceCaptureData.batteryInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.mediaDeviceInfo, deviceCaptureData.mediaDeviceInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.appVersion, deviceCaptureData.appVersion);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData copy(com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo sdkInfo, com.paypal.oslo.feature.verificationcapture.domain.model.DeviceInfo deviceInfo, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDeviceInfo captureDeviceInfo, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureInfo captureInfo, com.paypal.oslo.feature.verificationcapture.domain.model.SensorData sensorData, com.paypal.oslo.feature.verificationcapture.domain.model.BatteryInfo batteryInfo, java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo> mediaDeviceInfo, java.lang.String appVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureDeviceInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sensorData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaDeviceInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appVersion, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData(sdkInfo, deviceInfo, captureDeviceInfo, captureInfo, sensorData, batteryInfo, mediaDeviceInfo, appVersion);
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo> component7() {
        return this.mediaDeviceInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.BatteryInfo getBatteryInfo() {
        return this.batteryInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.SensorData getSensorData() {
        return this.sensorData;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureInfo getCaptureInfo() {
        return this.captureInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDeviceInfo getCaptureDeviceInfo() {
        return this.captureDeviceInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo getSdkInfo() {
        return this.sdkInfo;
    }
}
