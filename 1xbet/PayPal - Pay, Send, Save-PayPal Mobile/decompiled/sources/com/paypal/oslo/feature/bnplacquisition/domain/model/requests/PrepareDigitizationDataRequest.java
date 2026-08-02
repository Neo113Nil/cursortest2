package com.paypal.oslo.feature.bnplacquisition.domain.model.requests;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/PrepareDigitizationDataRequest;", "", "", "creditAccountId", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/DeviceWallet;", "deviceWallet", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/Device;", "device", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/DeviceWallet;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/Device;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/DeviceWallet;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/Device;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/DeviceWallet;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/Device;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/PrepareDigitizationDataRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/DeviceWallet;", "getDeviceWallet", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/Device;", "getDevice"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PrepareDigitizationDataRequest {
    public static final int $stable = 0;
    private final java.lang.String creditAccountId;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.Device device;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.DeviceWallet deviceWallet;

    public PrepareDigitizationDataRequest(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.DeviceWallet deviceWallet, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWallet, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "");
        this.creditAccountId = str;
        this.deviceWallet = deviceWallet;
        this.device = device;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.DeviceWallet getDeviceWallet() {
        return this.deviceWallet;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.Device getDevice() {
        return this.device;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.creditAccountId;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.DeviceWallet deviceWallet = this.deviceWallet;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.Device device = this.device;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PrepareDigitizationDataRequest(creditAccountId=");
        sb.append(str);
        sb.append(", deviceWallet=");
        sb.append(deviceWallet);
        sb.append(", device=");
        sb.append(device);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.creditAccountId.hashCode() * 31) + this.deviceWallet.hashCode()) * 31) + this.device.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.requests.PrepareDigitizationDataRequest)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.PrepareDigitizationDataRequest prepareDigitizationDataRequest = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.PrepareDigitizationDataRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, prepareDigitizationDataRequest.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceWallet, prepareDigitizationDataRequest.deviceWallet) && kotlin.jvm.internal.Intrinsics.areEqual(this.device, prepareDigitizationDataRequest.device);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.PrepareDigitizationDataRequest copy(java.lang.String creditAccountId, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.DeviceWallet deviceWallet, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWallet, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.PrepareDigitizationDataRequest(creditAccountId, deviceWallet, device);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.Device getDevice() {
        return this.device;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.DeviceWallet getDeviceWallet() {
        return this.deviceWallet;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.PrepareDigitizationDataRequest copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.PrepareDigitizationDataRequest prepareDigitizationDataRequest, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.DeviceWallet deviceWallet, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.Device device, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = prepareDigitizationDataRequest.creditAccountId;
        }
        if ((i & 2) != 0) {
            deviceWallet = prepareDigitizationDataRequest.deviceWallet;
        }
        if ((i & 4) != 0) {
            device = prepareDigitizationDataRequest.device;
        }
        return prepareDigitizationDataRequest.copy(str, deviceWallet, device);
    }
}
