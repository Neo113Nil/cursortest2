package com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/ProvisionedToken;", "", "", "referenceId", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/WalletProviderType;", "walletType", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceType;", "deviceType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/WalletProviderType;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/WalletProviderType;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/WalletProviderType;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceType;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/ProvisionedToken;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReferenceId", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/WalletProviderType;", "getWalletType", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceType;", "getDeviceType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProvisionedToken {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType deviceType;
    private final java.lang.String referenceId;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType walletType;

    public ProvisionedToken(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType walletProviderType, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType deviceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletProviderType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        this.referenceId = str;
        this.walletType = walletProviderType;
        this.deviceType = deviceType;
    }

    public /* synthetic */ ProvisionedToken(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType walletProviderType, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType deviceType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, walletProviderType, deviceType);
    }

    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType getWalletType() {
        return this.walletType;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType getDeviceType() {
        return this.deviceType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.referenceId;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType walletProviderType = this.walletType;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType deviceType = this.deviceType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionedToken(referenceId=");
        sb.append(str);
        sb.append(", walletType=");
        sb.append(walletProviderType);
        sb.append(", deviceType=");
        sb.append(deviceType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.referenceId;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.walletType.hashCode()) * 31) + this.deviceType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken provisionedToken = (com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, provisionedToken.referenceId) && this.walletType == provisionedToken.walletType && this.deviceType == provisionedToken.deviceType;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken copy(java.lang.String referenceId, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType walletType, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType deviceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken(referenceId, walletType, deviceType);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType getWalletType() {
        return this.walletType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken provisionedToken, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType walletProviderType, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType deviceType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = provisionedToken.referenceId;
        }
        if ((i & 2) != 0) {
            walletProviderType = provisionedToken.walletType;
        }
        if ((i & 4) != 0) {
            deviceType = provisionedToken.deviceType;
        }
        return provisionedToken.copy(str, walletProviderType, deviceType);
    }
}
