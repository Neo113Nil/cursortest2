package com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockDeviceWallet;", "", "", "payPalCardId", "digitizedCardId", "deviceWalletServiceCardId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard$Status;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard$Status;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard$Status;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard$Status;)Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockDeviceWallet;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPayPalCardId", "getDigitizedCardId", "getDeviceWalletServiceCardId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard$Status;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PayPalMockDeviceWallet {
    public static final int $stable = 0;
    private final java.lang.String deviceWalletServiceCardId;
    private final java.lang.String digitizedCardId;
    private final java.lang.String payPalCardId;
    private final com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status;

    public PayPalMockDeviceWallet(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        this.payPalCardId = str;
        this.digitizedCardId = str2;
        this.deviceWalletServiceCardId = str3;
        this.status = status;
    }

    public final java.lang.String getPayPalCardId() {
        return this.payPalCardId;
    }

    public final java.lang.String getDigitizedCardId() {
        return this.digitizedCardId;
    }

    public final java.lang.String getDeviceWalletServiceCardId() {
        return this.deviceWalletServiceCardId;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status getStatus() {
        return this.status;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.payPalCardId;
        java.lang.String str2 = this.digitizedCardId;
        java.lang.String str3 = this.deviceWalletServiceCardId;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayPalMockDeviceWallet(payPalCardId=");
        sb.append(str);
        sb.append(", digitizedCardId=");
        sb.append(str2);
        sb.append(", deviceWalletServiceCardId=");
        sb.append(str3);
        sb.append(", status=");
        sb.append(status);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.payPalCardId.hashCode() * 31) + this.digitizedCardId.hashCode()) * 31) + this.deviceWalletServiceCardId.hashCode()) * 31) + this.status.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockDeviceWallet)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockDeviceWallet payPalMockDeviceWallet = (com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockDeviceWallet) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.payPalCardId, payPalMockDeviceWallet.payPalCardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.digitizedCardId, payPalMockDeviceWallet.digitizedCardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceWalletServiceCardId, payPalMockDeviceWallet.deviceWalletServiceCardId) && this.status == payPalMockDeviceWallet.status;
    }

    public final com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockDeviceWallet copy(java.lang.String payPalCardId, java.lang.String digitizedCardId, java.lang.String deviceWalletServiceCardId, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalCardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWalletServiceCardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockDeviceWallet(payPalCardId, digitizedCardId, deviceWalletServiceCardId, status);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDeviceWalletServiceCardId() {
        return this.deviceWalletServiceCardId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDigitizedCardId() {
        return this.digitizedCardId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPayPalCardId() {
        return this.payPalCardId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockDeviceWallet copy$default(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockDeviceWallet payPalMockDeviceWallet, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = payPalMockDeviceWallet.payPalCardId;
        }
        if ((i & 2) != 0) {
            str2 = payPalMockDeviceWallet.digitizedCardId;
        }
        if ((i & 4) != 0) {
            str3 = payPalMockDeviceWallet.deviceWalletServiceCardId;
        }
        if ((i & 8) != 0) {
            status = payPalMockDeviceWallet.status;
        }
        return payPalMockDeviceWallet.copy(str, str2, str3, status);
    }
}
