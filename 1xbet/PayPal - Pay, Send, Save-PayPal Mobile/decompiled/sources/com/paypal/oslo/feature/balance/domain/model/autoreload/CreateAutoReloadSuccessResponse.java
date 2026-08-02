package com.paypal.oslo.feature.balance.domain.model.autoreload;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/CreateAutoReloadSuccessResponse;", "", "", "balanceId", "financialInstrumentId", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "reloadAmount", "thresholdAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/CreateAutoReloadSuccessResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBalanceId", "getFinancialInstrumentId", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getReloadAmount", "getThresholdAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CreateAutoReloadSuccessResponse {
    public static final int $stable = 0;
    private final java.lang.String balanceId;
    private final java.lang.String financialInstrumentId;
    private final com.paypal.oslo.feature.balance.domain.model.Money reloadAmount;
    private final com.paypal.oslo.feature.balance.domain.model.Money thresholdAmount;

    public CreateAutoReloadSuccessResponse(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2) {
        this.balanceId = str;
        this.financialInstrumentId = str2;
        this.reloadAmount = money;
        this.thresholdAmount = money2;
    }

    public final java.lang.String getBalanceId() {
        return this.balanceId;
    }

    public final java.lang.String getFinancialInstrumentId() {
        return this.financialInstrumentId;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getReloadAmount() {
        return this.reloadAmount;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getThresholdAmount() {
        return this.thresholdAmount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.balanceId;
        java.lang.String str2 = this.financialInstrumentId;
        com.paypal.oslo.feature.balance.domain.model.Money money = this.reloadAmount;
        com.paypal.oslo.feature.balance.domain.model.Money money2 = this.thresholdAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateAutoReloadSuccessResponse(balanceId=");
        sb.append(str);
        sb.append(", financialInstrumentId=");
        sb.append(str2);
        sb.append(", reloadAmount=");
        sb.append(money);
        sb.append(", thresholdAmount=");
        sb.append(money2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.balanceId;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.financialInstrumentId;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.balance.domain.model.Money money = this.reloadAmount;
        int hashCode3 = money == null ? 0 : money.hashCode();
        com.paypal.oslo.feature.balance.domain.model.Money money2 = this.thresholdAmount;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (money2 != null ? money2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse createAutoReloadSuccessResponse = (com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.balanceId, createAutoReloadSuccessResponse.balanceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentId, createAutoReloadSuccessResponse.financialInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.reloadAmount, createAutoReloadSuccessResponse.reloadAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.thresholdAmount, createAutoReloadSuccessResponse.thresholdAmount);
    }

    public final com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse copy(java.lang.String balanceId, java.lang.String financialInstrumentId, com.paypal.oslo.feature.balance.domain.model.Money reloadAmount, com.paypal.oslo.feature.balance.domain.model.Money thresholdAmount) {
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse(balanceId, financialInstrumentId, reloadAmount, thresholdAmount);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getThresholdAmount() {
        return this.thresholdAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getReloadAmount() {
        return this.reloadAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFinancialInstrumentId() {
        return this.financialInstrumentId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getBalanceId() {
        return this.balanceId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse copy$default(com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse createAutoReloadSuccessResponse, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = createAutoReloadSuccessResponse.balanceId;
        }
        if ((i & 2) != 0) {
            str2 = createAutoReloadSuccessResponse.financialInstrumentId;
        }
        if ((i & 4) != 0) {
            money = createAutoReloadSuccessResponse.reloadAmount;
        }
        if ((i & 8) != 0) {
            money2 = createAutoReloadSuccessResponse.thresholdAmount;
        }
        return createAutoReloadSuccessResponse.copy(str, str2, money, money2);
    }
}
