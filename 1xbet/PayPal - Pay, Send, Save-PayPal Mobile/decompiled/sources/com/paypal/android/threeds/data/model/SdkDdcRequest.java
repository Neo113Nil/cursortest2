package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/android/threeds/data/model/SdkDdcRequest;", "", "Lcom/paypal/android/threeds/data/model/TenantData;", "tenantData", "", "cardNumber", "cardNetwork", "Lcom/paypal/android/threeds/data/model/SdkData;", "sdkData", "<init>", "(Lcom/paypal/android/threeds/data/model/TenantData;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/android/threeds/data/model/SdkData;)V", "component1", "()Lcom/paypal/android/threeds/data/model/TenantData;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/paypal/android/threeds/data/model/SdkData;", "copy", "(Lcom/paypal/android/threeds/data/model/TenantData;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/android/threeds/data/model/SdkData;)Lcom/paypal/android/threeds/data/model/SdkDdcRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/android/threeds/data/model/TenantData;", "getTenantData", "Ljava/lang/String;", "getCardNumber", "getCardNetwork", "Lcom/paypal/android/threeds/data/model/SdkData;", "getSdkData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SdkDdcRequest {
    public static final int $stable = 8;

    @com.google.gson.annotations.SerializedName("card_network")
    private final java.lang.String cardNetwork;

    @com.google.gson.annotations.SerializedName(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.CARD_DETAILS_CARD_NUMBER)
    private final java.lang.String cardNumber;

    @com.google.gson.annotations.SerializedName("sdk_data")
    private final com.paypal.android.threeds.data.model.SdkData sdkData;

    @com.google.gson.annotations.SerializedName("tenant_data")
    private final com.paypal.android.threeds.data.model.TenantData tenantData;

    public SdkDdcRequest(com.paypal.android.threeds.data.model.TenantData tenantData, java.lang.String str, java.lang.String str2, com.paypal.android.threeds.data.model.SdkData sdkData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tenantData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkData, "");
        this.tenantData = tenantData;
        this.cardNumber = str;
        this.cardNetwork = str2;
        this.sdkData = sdkData;
    }

    public final com.paypal.android.threeds.data.model.TenantData getTenantData() {
        return this.tenantData;
    }

    public final java.lang.String getCardNumber() {
        return this.cardNumber;
    }

    public final java.lang.String getCardNetwork() {
        return this.cardNetwork;
    }

    public final com.paypal.android.threeds.data.model.SdkData getSdkData() {
        return this.sdkData;
    }

    public final java.lang.String toString() {
        com.paypal.android.threeds.data.model.TenantData tenantData = this.tenantData;
        java.lang.String str = this.cardNumber;
        java.lang.String str2 = this.cardNetwork;
        com.paypal.android.threeds.data.model.SdkData sdkData = this.sdkData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SdkDdcRequest(tenantData=");
        sb.append(tenantData);
        sb.append(", cardNumber=");
        sb.append(str);
        sb.append(", cardNetwork=");
        sb.append(str2);
        sb.append(", sdkData=");
        sb.append(sdkData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.tenantData.hashCode() * 31) + this.cardNumber.hashCode()) * 31) + this.cardNetwork.hashCode()) * 31) + this.sdkData.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.data.model.SdkDdcRequest)) {
            return false;
        }
        com.paypal.android.threeds.data.model.SdkDdcRequest sdkDdcRequest = (com.paypal.android.threeds.data.model.SdkDdcRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.tenantData, sdkDdcRequest.tenantData) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNumber, sdkDdcRequest.cardNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNetwork, sdkDdcRequest.cardNetwork) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkData, sdkDdcRequest.sdkData);
    }

    public final com.paypal.android.threeds.data.model.SdkDdcRequest copy(com.paypal.android.threeds.data.model.TenantData tenantData, java.lang.String cardNumber, java.lang.String cardNetwork, com.paypal.android.threeds.data.model.SdkData sdkData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tenantData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNetwork, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkData, "");
        return new com.paypal.android.threeds.data.model.SdkDdcRequest(tenantData, cardNumber, cardNetwork, sdkData);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.android.threeds.data.model.SdkData getSdkData() {
        return this.sdkData;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCardNetwork() {
        return this.cardNetwork;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.android.threeds.data.model.TenantData getTenantData() {
        return this.tenantData;
    }

    public static /* synthetic */ com.paypal.android.threeds.data.model.SdkDdcRequest copy$default(com.paypal.android.threeds.data.model.SdkDdcRequest sdkDdcRequest, com.paypal.android.threeds.data.model.TenantData tenantData, java.lang.String str, java.lang.String str2, com.paypal.android.threeds.data.model.SdkData sdkData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tenantData = sdkDdcRequest.tenantData;
        }
        if ((i & 2) != 0) {
            str = sdkDdcRequest.cardNumber;
        }
        if ((i & 4) != 0) {
            str2 = sdkDdcRequest.cardNetwork;
        }
        if ((i & 8) != 0) {
            sdkData = sdkDdcRequest.sdkData;
        }
        return sdkDdcRequest.copy(tenantData, str, str2, sdkData);
    }
}
