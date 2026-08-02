package com.ingo.sdk.kotlin.common.core.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\"\u0010\u0006\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/model/DeviceInfo;", "", "", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "platformVersion", "deviceDetails", "deviceToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ingo/sdk/kotlin/common/core/model/DeviceInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPlatform", "getPlatformVersion", "getDeviceDetails", "getDeviceToken", "setDeviceToken", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DeviceInfo {
    private final java.lang.String deviceDetails;
    private java.lang.String deviceToken;
    private final java.lang.String platform;
    private final java.lang.String platformVersion;

    public DeviceInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.platform = str;
        this.platformVersion = str2;
        this.deviceDetails = str3;
        this.deviceToken = str4;
    }

    public final java.lang.String getPlatform() {
        return this.platform;
    }

    public final java.lang.String getPlatformVersion() {
        return this.platformVersion;
    }

    public final java.lang.String getDeviceDetails() {
        return this.deviceDetails;
    }

    public final java.lang.String getDeviceToken() {
        return this.deviceToken;
    }

    public final void setDeviceToken(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.deviceToken = str;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.platform;
        java.lang.String str2 = this.platformVersion;
        java.lang.String str3 = this.deviceDetails;
        java.lang.String str4 = this.deviceToken;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceInfo(platform=");
        sb.append(str);
        sb.append(", platformVersion=");
        sb.append(str2);
        sb.append(", deviceDetails=");
        sb.append(str3);
        sb.append(", deviceToken=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.platform.hashCode() * 31) + this.platformVersion.hashCode()) * 31) + this.deviceDetails.hashCode()) * 31) + this.deviceToken.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.core.model.DeviceInfo)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.core.model.DeviceInfo deviceInfo = (com.ingo.sdk.kotlin.common.core.model.DeviceInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.platform, deviceInfo.platform) && kotlin.jvm.internal.Intrinsics.areEqual(this.platformVersion, deviceInfo.platformVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceDetails, deviceInfo.deviceDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceToken, deviceInfo.deviceToken);
    }

    public final com.ingo.sdk.kotlin.common.core.model.DeviceInfo copy(java.lang.String platform, java.lang.String platformVersion, java.lang.String deviceDetails, java.lang.String deviceToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceToken, "");
        return new com.ingo.sdk.kotlin.common.core.model.DeviceInfo(platform, platformVersion, deviceDetails, deviceToken);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDeviceToken() {
        return this.deviceToken;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDeviceDetails() {
        return this.deviceDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPlatformVersion() {
        return this.platformVersion;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPlatform() {
        return this.platform;
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.core.model.DeviceInfo copy$default(com.ingo.sdk.kotlin.common.core.model.DeviceInfo deviceInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = deviceInfo.platform;
        }
        if ((i & 2) != 0) {
            str2 = deviceInfo.platformVersion;
        }
        if ((i & 4) != 0) {
            str3 = deviceInfo.deviceDetails;
        }
        if ((i & 8) != 0) {
            str4 = deviceInfo.deviceToken;
        }
        return deviceInfo.copy(str, str2, str3, str4);
    }
}
