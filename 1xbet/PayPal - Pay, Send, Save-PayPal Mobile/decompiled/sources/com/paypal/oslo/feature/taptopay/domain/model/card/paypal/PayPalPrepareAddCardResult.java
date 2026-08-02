package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardResult;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "deviceWalletServiceCardId", "", "encryptedCardInfo", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/RiskDecision;", "riskDecision", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;[BLcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/RiskDecision;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "component2", "()[B", "component3", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/RiskDecision;", "copy", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;[BLcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/RiskDecision;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardResult;", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "getDeviceWalletServiceCardId", "[B", "getEncryptedCardInfo", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/RiskDecision;", "getRiskDecision"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PayPalPrepareAddCardResult {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId;
    private final byte[] encryptedCardInfo;
    private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision riskDecision;

    public PayPalPrepareAddCardResult(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, byte[] bArr, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision riskDecision) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWalletServiceCardId, "");
        this.deviceWalletServiceCardId = deviceWalletServiceCardId;
        this.encryptedCardInfo = bArr;
        this.riskDecision = riskDecision;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId getDeviceWalletServiceCardId() {
        return this.deviceWalletServiceCardId;
    }

    public final byte[] getEncryptedCardInfo() {
        return this.encryptedCardInfo;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision getRiskDecision() {
        return this.riskDecision;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardResult payPalPrepareAddCardResult = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardResult) other;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.deviceWalletServiceCardId, payPalPrepareAddCardResult.deviceWalletServiceCardId)) {
            return false;
        }
        byte[] bArr = this.encryptedCardInfo;
        byte[] bArr2 = payPalPrepareAddCardResult.encryptedCardInfo;
        return (bArr == bArr2 || !(bArr == null || bArr2 == null || !java.util.Arrays.equals(bArr, bArr2))) && kotlin.jvm.internal.Intrinsics.areEqual(this.riskDecision, payPalPrepareAddCardResult.riskDecision);
    }

    public final int hashCode() {
        int hashCode = this.deviceWalletServiceCardId.hashCode();
        byte[] bArr = this.encryptedCardInfo;
        int hashCode2 = bArr != null ? java.util.Arrays.hashCode(bArr) : 0;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision riskDecision = this.riskDecision;
        return (((hashCode * 31) + hashCode2) * 31) + (riskDecision != null ? riskDecision.hashCode() : 0);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId = this.deviceWalletServiceCardId;
        java.lang.String arrays = java.util.Arrays.toString(this.encryptedCardInfo);
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision riskDecision = this.riskDecision;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayPalPrepareAddCardResult(deviceWalletServiceCardId=");
        sb.append(deviceWalletServiceCardId);
        sb.append(", encryptedCardInfo=");
        sb.append(arrays);
        sb.append(", riskDecision=");
        sb.append(riskDecision);
        sb.append(")");
        return sb.toString();
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardResult copy(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, byte[] encryptedCardInfo, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision riskDecision) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWalletServiceCardId, "");
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardResult(deviceWalletServiceCardId, encryptedCardInfo, riskDecision);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision getRiskDecision() {
        return this.riskDecision;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getEncryptedCardInfo() {
        return this.encryptedCardInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId getDeviceWalletServiceCardId() {
        return this.deviceWalletServiceCardId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardResult copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardResult payPalPrepareAddCardResult, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, byte[] bArr, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision riskDecision, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            deviceWalletServiceCardId = payPalPrepareAddCardResult.deviceWalletServiceCardId;
        }
        if ((i & 2) != 0) {
            bArr = payPalPrepareAddCardResult.encryptedCardInfo;
        }
        if ((i & 4) != 0) {
            riskDecision = payPalPrepareAddCardResult.riskDecision;
        }
        return payPalPrepareAddCardResult.copy(deviceWalletServiceCardId, bArr, riskDecision);
    }
}
