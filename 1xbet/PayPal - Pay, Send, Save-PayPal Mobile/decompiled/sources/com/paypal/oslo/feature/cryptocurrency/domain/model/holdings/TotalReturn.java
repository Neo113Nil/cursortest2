package com.paypal.oslo.feature.cryptocurrency.domain.model.holdings;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/TotalReturn;", "", "", "fiatAmountValue", "fiatAmountCurrencyCode", "amountMovementPercent", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoGainOrLossStatus;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoGainOrLossStatus;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoGainOrLossStatus;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoGainOrLossStatus;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/TotalReturn;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFiatAmountValue", "getFiatAmountCurrencyCode", "getAmountMovementPercent", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoGainOrLossStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TotalReturn {
    public static final int $stable = 0;
    private final java.lang.String amountMovementPercent;
    private final java.lang.String fiatAmountCurrencyCode;
    private final java.lang.String fiatAmountValue;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus status;

    public TotalReturn(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus cryptoGainOrLossStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.fiatAmountValue = str;
        this.fiatAmountCurrencyCode = str2;
        this.amountMovementPercent = str3;
        this.status = cryptoGainOrLossStatus;
    }

    public final java.lang.String getFiatAmountValue() {
        return this.fiatAmountValue;
    }

    public final java.lang.String getFiatAmountCurrencyCode() {
        return this.fiatAmountCurrencyCode;
    }

    public final java.lang.String getAmountMovementPercent() {
        return this.amountMovementPercent;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus getStatus() {
        return this.status;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.fiatAmountValue;
        java.lang.String str2 = this.fiatAmountCurrencyCode;
        java.lang.String str3 = this.amountMovementPercent;
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus cryptoGainOrLossStatus = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalReturn(fiatAmountValue=");
        sb.append(str);
        sb.append(", fiatAmountCurrencyCode=");
        sb.append(str2);
        sb.append(", amountMovementPercent=");
        sb.append(str3);
        sb.append(", status=");
        sb.append(cryptoGainOrLossStatus);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.fiatAmountValue.hashCode();
        int hashCode2 = this.fiatAmountCurrencyCode.hashCode();
        int hashCode3 = this.amountMovementPercent.hashCode();
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus cryptoGainOrLossStatus = this.status;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (cryptoGainOrLossStatus == null ? 0 : cryptoGainOrLossStatus.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn totalReturn = (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fiatAmountValue, totalReturn.fiatAmountValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiatAmountCurrencyCode, totalReturn.fiatAmountCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountMovementPercent, totalReturn.amountMovementPercent) && this.status == totalReturn.status;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn copy(java.lang.String fiatAmountValue, java.lang.String fiatAmountCurrencyCode, java.lang.String amountMovementPercent, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiatAmountValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiatAmountCurrencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountMovementPercent, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn(fiatAmountValue, fiatAmountCurrencyCode, amountMovementPercent, status);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAmountMovementPercent() {
        return this.amountMovementPercent;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFiatAmountCurrencyCode() {
        return this.fiatAmountCurrencyCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFiatAmountValue() {
        return this.fiatAmountValue;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn totalReturn, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus cryptoGainOrLossStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = totalReturn.fiatAmountValue;
        }
        if ((i & 2) != 0) {
            str2 = totalReturn.fiatAmountCurrencyCode;
        }
        if ((i & 4) != 0) {
            str3 = totalReturn.amountMovementPercent;
        }
        if ((i & 8) != 0) {
            cryptoGainOrLossStatus = totalReturn.status;
        }
        return totalReturn.copy(str, str2, str3, cryptoGainOrLossStatus);
    }
}
