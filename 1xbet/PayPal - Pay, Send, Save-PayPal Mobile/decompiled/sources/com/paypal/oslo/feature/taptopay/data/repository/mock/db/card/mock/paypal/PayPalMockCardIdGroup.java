package com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockCardIdGroup;", "", "", "digitizedCardId", "payPalCardId", "deviceWalletServiceCardId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockCardIdGroup;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDigitizedCardId", "getPayPalCardId", "getDeviceWalletServiceCardId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PayPalMockCardIdGroup {
    public static final int $stable = 0;
    private final java.lang.String deviceWalletServiceCardId;
    private final java.lang.String digitizedCardId;
    private final java.lang.String payPalCardId;

    public PayPalMockCardIdGroup(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.digitizedCardId = str;
        this.payPalCardId = str2;
        this.deviceWalletServiceCardId = str3;
    }

    public final java.lang.String getDigitizedCardId() {
        return this.digitizedCardId;
    }

    public final java.lang.String getPayPalCardId() {
        return this.payPalCardId;
    }

    public final java.lang.String getDeviceWalletServiceCardId() {
        return this.deviceWalletServiceCardId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.digitizedCardId;
        java.lang.String str2 = this.payPalCardId;
        java.lang.String str3 = this.deviceWalletServiceCardId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayPalMockCardIdGroup(digitizedCardId=");
        sb.append(str);
        sb.append(", payPalCardId=");
        sb.append(str2);
        sb.append(", deviceWalletServiceCardId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.digitizedCardId.hashCode() * 31) + this.payPalCardId.hashCode()) * 31) + this.deviceWalletServiceCardId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup payPalMockCardIdGroup = (com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.digitizedCardId, payPalMockCardIdGroup.digitizedCardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.payPalCardId, payPalMockCardIdGroup.payPalCardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceWalletServiceCardId, payPalMockCardIdGroup.deviceWalletServiceCardId);
    }

    public final com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup copy(java.lang.String digitizedCardId, java.lang.String payPalCardId, java.lang.String deviceWalletServiceCardId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalCardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWalletServiceCardId, "");
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup(digitizedCardId, payPalCardId, deviceWalletServiceCardId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDeviceWalletServiceCardId() {
        return this.deviceWalletServiceCardId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPayPalCardId() {
        return this.payPalCardId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDigitizedCardId() {
        return this.digitizedCardId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup copy$default(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup payPalMockCardIdGroup, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = payPalMockCardIdGroup.digitizedCardId;
        }
        if ((i & 2) != 0) {
            str2 = payPalMockCardIdGroup.payPalCardId;
        }
        if ((i & 4) != 0) {
            str3 = payPalMockCardIdGroup.deviceWalletServiceCardId;
        }
        return payPalMockCardIdGroup.copy(str, str2, str3);
    }
}
