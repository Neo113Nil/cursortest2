package com.paypal.oslo.feature.cryptocurrency.domain.model.trade;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011Jn\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b.\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b/\u0010\u0011R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b0\u0010\u0011R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b1\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeExecution;", "", "", "id", "status", "statusReason", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "amountFulfilled", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/AssetQuantity;", "assetQuantityTruncated", "paymentId", "createTime", "fulfilledTime", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/AssetQuantity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "component5", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/AssetQuantity;", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/AssetQuantity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeExecution;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getStatus", "getStatusReason", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "getAmountFulfilled", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/AssetQuantity;", "getAssetQuantityTruncated", "getPaymentId", "getCreateTime", "getFulfilledTime", "getAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoTradeExecution {
    public static final int $stable = 0;
    private final java.lang.String action;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money amountFulfilled;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.common.AssetQuantity assetQuantityTruncated;
    private final java.lang.String createTime;
    private final java.lang.String fulfilledTime;
    private final java.lang.String id;
    private final java.lang.String paymentId;
    private final java.lang.String status;
    private final java.lang.String statusReason;

    public CryptoTradeExecution(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money, com.paypal.oslo.feature.cryptocurrency.domain.model.common.AssetQuantity assetQuantity, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetQuantity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        this.id = str;
        this.status = str2;
        this.statusReason = str3;
        this.amountFulfilled = money;
        this.assetQuantityTruncated = assetQuantity;
        this.paymentId = str4;
        this.createTime = str5;
        this.fulfilledTime = str6;
        this.action = str7;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getStatus() {
        return this.status;
    }

    public final java.lang.String getStatusReason() {
        return this.statusReason;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money getAmountFulfilled() {
        return this.amountFulfilled;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.AssetQuantity getAssetQuantityTruncated() {
        return this.assetQuantityTruncated;
    }

    public final java.lang.String getPaymentId() {
        return this.paymentId;
    }

    public final java.lang.String getCreateTime() {
        return this.createTime;
    }

    public final java.lang.String getFulfilledTime() {
        return this.fulfilledTime;
    }

    public final java.lang.String getAction() {
        return this.action;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.status;
        java.lang.String str3 = this.statusReason;
        com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money = this.amountFulfilled;
        com.paypal.oslo.feature.cryptocurrency.domain.model.common.AssetQuantity assetQuantity = this.assetQuantityTruncated;
        java.lang.String str4 = this.paymentId;
        java.lang.String str5 = this.createTime;
        java.lang.String str6 = this.fulfilledTime;
        java.lang.String str7 = this.action;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoTradeExecution(id=");
        sb.append(str);
        sb.append(", status=");
        sb.append(str2);
        sb.append(", statusReason=");
        sb.append(str3);
        sb.append(", amountFulfilled=");
        sb.append(money);
        sb.append(", assetQuantityTruncated=");
        sb.append(assetQuantity);
        sb.append(", paymentId=");
        sb.append(str4);
        sb.append(", createTime=");
        sb.append(str5);
        sb.append(", fulfilledTime=");
        sb.append(str6);
        sb.append(", action=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.status.hashCode();
        java.lang.String str = this.statusReason;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = this.amountFulfilled.hashCode();
        int hashCode5 = this.assetQuantityTruncated.hashCode();
        int hashCode6 = this.paymentId.hashCode();
        int hashCode7 = this.createTime.hashCode();
        java.lang.String str2 = this.fulfilledTime;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.action.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution cryptoTradeExecution = (com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, cryptoTradeExecution.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, cryptoTradeExecution.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.statusReason, cryptoTradeExecution.statusReason) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountFulfilled, cryptoTradeExecution.amountFulfilled) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetQuantityTruncated, cryptoTradeExecution.assetQuantityTruncated) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentId, cryptoTradeExecution.paymentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.createTime, cryptoTradeExecution.createTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.fulfilledTime, cryptoTradeExecution.fulfilledTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, cryptoTradeExecution.action);
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution copy(java.lang.String id, java.lang.String status, java.lang.String statusReason, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money amountFulfilled, com.paypal.oslo.feature.cryptocurrency.domain.model.common.AssetQuantity assetQuantityTruncated, java.lang.String paymentId, java.lang.String createTime, java.lang.String fulfilledTime, java.lang.String action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountFulfilled, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetQuantityTruncated, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution(id, status, statusReason, amountFulfilled, assetQuantityTruncated, paymentId, createTime, fulfilledTime, action);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getAction() {
        return this.action;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getFulfilledTime() {
        return this.fulfilledTime;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getPaymentId() {
        return this.paymentId;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.AssetQuantity getAssetQuantityTruncated() {
        return this.assetQuantityTruncated;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money getAmountFulfilled() {
        return this.amountFulfilled;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getStatusReason() {
        return this.statusReason;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
