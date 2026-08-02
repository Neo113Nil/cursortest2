package com.paypal.oslo.feature.identity.deviceregistration.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/deviceregistration/domain/model/DeviceRegistrationOutput;", "", "", "deviceId", "", "deviceConfirmed", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/identity/deviceregistration/domain/model/DeviceRegistrationOutput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDeviceId", "Z", "getDeviceConfirmed"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeviceRegistrationOutput {
    public static final int $stable = 0;
    private final boolean deviceConfirmed;
    private final java.lang.String deviceId;

    public DeviceRegistrationOutput(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.deviceId = str;
        this.deviceConfirmed = z;
    }

    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public final boolean getDeviceConfirmed() {
        return this.deviceConfirmed;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.deviceId;
        boolean z = this.deviceConfirmed;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceRegistrationOutput(deviceId=");
        sb.append(str);
        sb.append(", deviceConfirmed=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.deviceId.hashCode() * 31) + java.lang.Boolean.hashCode(this.deviceConfirmed);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationOutput)) {
            return false;
        }
        com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationOutput deviceRegistrationOutput = (com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationOutput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, deviceRegistrationOutput.deviceId) && this.deviceConfirmed == deviceRegistrationOutput.deviceConfirmed;
    }

    public final com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationOutput copy(java.lang.String deviceId, boolean deviceConfirmed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "");
        return new com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationOutput(deviceId, deviceConfirmed);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDeviceConfirmed() {
        return this.deviceConfirmed;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationOutput copy$default(com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationOutput deviceRegistrationOutput, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = deviceRegistrationOutput.deviceId;
        }
        if ((i & 2) != 0) {
            z = deviceRegistrationOutput.deviceConfirmed;
        }
        return deviceRegistrationOutput.copy(str, z);
    }
}
