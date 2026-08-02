package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/GetPushProvisioningStatusRequest;", "", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "starPayClient", "", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/GetPushProvisioningStatusRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "getStarPayClient", "Ljava/lang/String;", "getProductName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetPushProvisioningStatusRequest {
    public static final int $stable = 8;
    private final java.lang.String productName;
    private final com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient;

    public GetPushProvisioningStatusRequest(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.starPayClient = starPayClient;
        this.productName = str;
    }

    public final com.paypal.oslo.feature.starpay.api.StarPayClient getStarPayClient() {
        return this.starPayClient;
    }

    public final java.lang.String getProductName() {
        return this.productName;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient = this.starPayClient;
        java.lang.String str = this.productName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetPushProvisioningStatusRequest(starPayClient=");
        sb.append(starPayClient);
        sb.append(", productName=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.starPayClient.hashCode() * 31) + this.productName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetPushProvisioningStatusRequest)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetPushProvisioningStatusRequest getPushProvisioningStatusRequest = (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetPushProvisioningStatusRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.starPayClient, getPushProvisioningStatusRequest.starPayClient) && kotlin.jvm.internal.Intrinsics.areEqual(this.productName, getPushProvisioningStatusRequest.productName);
    }

    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetPushProvisioningStatusRequest copy(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, java.lang.String productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetPushProvisioningStatusRequest(starPayClient, productName);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getProductName() {
        return this.productName;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.starpay.api.StarPayClient getStarPayClient() {
        return this.starPayClient;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetPushProvisioningStatusRequest copy$default(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetPushProvisioningStatusRequest getPushProvisioningStatusRequest, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            starPayClient = getPushProvisioningStatusRequest.starPayClient;
        }
        if ((i & 2) != 0) {
            str = getPushProvisioningStatusRequest.productName;
        }
        return getPushProvisioningStatusRequest.copy(starPayClient, str);
    }
}
