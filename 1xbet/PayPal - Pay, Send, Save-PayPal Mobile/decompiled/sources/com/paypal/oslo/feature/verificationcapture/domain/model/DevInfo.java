package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DevInfo;", "", "", "clientOs", "deviceName", "deviceType", "deviceId", "appVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/DevInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getClientOs", "getDeviceName", "getDeviceType", "getDeviceId", "getAppVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DevInfo {
    public static final int $stable = 0;
    private final java.lang.String appVersion;
    private final java.lang.String clientOs;
    private final java.lang.String deviceId;
    private final java.lang.String deviceName;
    private final java.lang.String deviceType;

    public DevInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.clientOs = str;
        this.deviceName = str2;
        this.deviceType = str3;
        this.deviceId = str4;
        this.appVersion = str5;
    }

    public final java.lang.String getClientOs() {
        return this.clientOs;
    }

    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    public final java.lang.String getDeviceType() {
        return this.deviceType;
    }

    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.clientOs;
        java.lang.String str2 = this.deviceName;
        java.lang.String str3 = this.deviceType;
        java.lang.String str4 = this.deviceId;
        java.lang.String str5 = this.appVersion;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DevInfo(clientOs=");
        sb.append(str);
        sb.append(", deviceName=");
        sb.append(str2);
        sb.append(", deviceType=");
        sb.append(str3);
        sb.append(", deviceId=");
        sb.append(str4);
        sb.append(", appVersion=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.clientOs.hashCode() * 31) + this.deviceName.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.appVersion.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.DevInfo)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.DevInfo devInfo = (com.paypal.oslo.feature.verificationcapture.domain.model.DevInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.clientOs, devInfo.clientOs) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceName, devInfo.deviceName) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceType, devInfo.deviceType) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, devInfo.deviceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.appVersion, devInfo.appVersion);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.DevInfo copy(java.lang.String clientOs, java.lang.String deviceName, java.lang.String deviceType, java.lang.String deviceId, java.lang.String appVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientOs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appVersion, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.DevInfo(clientOs, deviceName, deviceType, deviceId, appVersion);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getClientOs() {
        return this.clientOs;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.DevInfo copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.DevInfo devInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = devInfo.clientOs;
        }
        if ((i & 2) != 0) {
            str2 = devInfo.deviceName;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = devInfo.deviceType;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = devInfo.deviceId;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = devInfo.appVersion;
        }
        return devInfo.copy(str, str6, str7, str8, str5);
    }
}
