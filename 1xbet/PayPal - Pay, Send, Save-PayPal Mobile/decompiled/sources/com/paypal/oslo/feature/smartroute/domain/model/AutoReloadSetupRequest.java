package com.paypal.oslo.feature.smartroute.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadSetupRequest;", "", "", "balanceId", "financialInstrumentId", "thresholdAmount", "reloadAmount", "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadSetupRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBalanceId", "getFinancialInstrumentId", "getThresholdAmount", "getReloadAmount", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AutoReloadSetupRequest {
    public static final int $stable = 0;
    private final java.lang.String balanceId;
    private final java.lang.String currencyCode;
    private final java.lang.String financialInstrumentId;
    private final java.lang.String reloadAmount;
    private final java.lang.String thresholdAmount;

    public AutoReloadSetupRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.balanceId = str;
        this.financialInstrumentId = str2;
        this.thresholdAmount = str3;
        this.reloadAmount = str4;
        this.currencyCode = str5;
    }

    public final java.lang.String getBalanceId() {
        return this.balanceId;
    }

    public final java.lang.String getFinancialInstrumentId() {
        return this.financialInstrumentId;
    }

    public final java.lang.String getThresholdAmount() {
        return this.thresholdAmount;
    }

    public final java.lang.String getReloadAmount() {
        return this.reloadAmount;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.balanceId;
        java.lang.String str2 = this.financialInstrumentId;
        java.lang.String str3 = this.thresholdAmount;
        java.lang.String str4 = this.reloadAmount;
        java.lang.String str5 = this.currencyCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoReloadSetupRequest(balanceId=");
        sb.append(str);
        sb.append(", financialInstrumentId=");
        sb.append(str2);
        sb.append(", thresholdAmount=");
        sb.append(str3);
        sb.append(", reloadAmount=");
        sb.append(str4);
        sb.append(", currencyCode=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.balanceId.hashCode() * 31) + this.financialInstrumentId.hashCode()) * 31) + this.thresholdAmount.hashCode()) * 31) + this.reloadAmount.hashCode()) * 31) + this.currencyCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupRequest)) {
            return false;
        }
        com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupRequest autoReloadSetupRequest = (com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.balanceId, autoReloadSetupRequest.balanceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentId, autoReloadSetupRequest.financialInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.thresholdAmount, autoReloadSetupRequest.thresholdAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.reloadAmount, autoReloadSetupRequest.reloadAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, autoReloadSetupRequest.currencyCode);
    }

    public final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupRequest copy(java.lang.String balanceId, java.lang.String financialInstrumentId, java.lang.String thresholdAmount, java.lang.String reloadAmount, java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholdAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupRequest(balanceId, financialInstrumentId, thresholdAmount, reloadAmount, currencyCode);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getReloadAmount() {
        return this.reloadAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getThresholdAmount() {
        return this.thresholdAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFinancialInstrumentId() {
        return this.financialInstrumentId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getBalanceId() {
        return this.balanceId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupRequest copy$default(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupRequest autoReloadSetupRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = autoReloadSetupRequest.balanceId;
        }
        if ((i & 2) != 0) {
            str2 = autoReloadSetupRequest.financialInstrumentId;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = autoReloadSetupRequest.thresholdAmount;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = autoReloadSetupRequest.reloadAmount;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = autoReloadSetupRequest.currencyCode;
        }
        return autoReloadSetupRequest.copy(str, str6, str7, str8, str5);
    }
}
