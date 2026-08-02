package com.paypal.oslo.feature.balance.domain.model.autoreload;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJh\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b(\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b)\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b+\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/CreateAutoReloadRequest;", "", "", "scheduleType", "balanceId", "financialInstrumentId", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "amount", "thresholdAmount", "recurrence", "startDate", "startDay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/CreateAutoReloadRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getScheduleType", "getBalanceId", "getFinancialInstrumentId", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getAmount", "getThresholdAmount", "getRecurrence", "getStartDate", "getStartDay"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CreateAutoReloadRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.balance.domain.model.Money amount;
    private final java.lang.String balanceId;
    private final java.lang.String financialInstrumentId;
    private final java.lang.String recurrence;
    private final java.lang.String scheduleType;
    private final java.lang.String startDate;
    private final java.lang.String startDay;
    private final com.paypal.oslo.feature.balance.domain.model.Money thresholdAmount;

    public CreateAutoReloadRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        this.scheduleType = str;
        this.balanceId = str2;
        this.financialInstrumentId = str3;
        this.amount = money;
        this.thresholdAmount = money2;
        this.recurrence = str4;
        this.startDate = str5;
        this.startDay = str6;
    }

    public /* synthetic */ CreateAutoReloadRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, money, (i & 16) != 0 ? null : money2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6);
    }

    public final java.lang.String getScheduleType() {
        return this.scheduleType;
    }

    public final java.lang.String getBalanceId() {
        return this.balanceId;
    }

    public final java.lang.String getFinancialInstrumentId() {
        return this.financialInstrumentId;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getAmount() {
        return this.amount;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getThresholdAmount() {
        return this.thresholdAmount;
    }

    public final java.lang.String getRecurrence() {
        return this.recurrence;
    }

    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    public final java.lang.String getStartDay() {
        return this.startDay;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.scheduleType;
        java.lang.String str2 = this.balanceId;
        java.lang.String str3 = this.financialInstrumentId;
        com.paypal.oslo.feature.balance.domain.model.Money money = this.amount;
        com.paypal.oslo.feature.balance.domain.model.Money money2 = this.thresholdAmount;
        java.lang.String str4 = this.recurrence;
        java.lang.String str5 = this.startDate;
        java.lang.String str6 = this.startDay;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateAutoReloadRequest(scheduleType=");
        sb.append(str);
        sb.append(", balanceId=");
        sb.append(str2);
        sb.append(", financialInstrumentId=");
        sb.append(str3);
        sb.append(", amount=");
        sb.append(money);
        sb.append(", thresholdAmount=");
        sb.append(money2);
        sb.append(", recurrence=");
        sb.append(str4);
        sb.append(", startDate=");
        sb.append(str5);
        sb.append(", startDay=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.scheduleType.hashCode();
        int hashCode2 = this.balanceId.hashCode();
        int hashCode3 = this.financialInstrumentId.hashCode();
        int hashCode4 = this.amount.hashCode();
        com.paypal.oslo.feature.balance.domain.model.Money money = this.thresholdAmount;
        int hashCode5 = money == null ? 0 : money.hashCode();
        java.lang.String str = this.recurrence;
        int hashCode6 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.startDate;
        int hashCode7 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.startDay;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadRequest)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadRequest createAutoReloadRequest = (com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.scheduleType, createAutoReloadRequest.scheduleType) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceId, createAutoReloadRequest.balanceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentId, createAutoReloadRequest.financialInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, createAutoReloadRequest.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.thresholdAmount, createAutoReloadRequest.thresholdAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.recurrence, createAutoReloadRequest.recurrence) && kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, createAutoReloadRequest.startDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.startDay, createAutoReloadRequest.startDay);
    }

    public final com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadRequest copy(java.lang.String scheduleType, java.lang.String balanceId, java.lang.String financialInstrumentId, com.paypal.oslo.feature.balance.domain.model.Money amount, com.paypal.oslo.feature.balance.domain.model.Money thresholdAmount, java.lang.String recurrence, java.lang.String startDate, java.lang.String startDay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduleType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadRequest(scheduleType, balanceId, financialInstrumentId, amount, thresholdAmount, recurrence, startDate, startDay);
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getStartDay() {
        return this.startDay;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getRecurrence() {
        return this.recurrence;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getThresholdAmount() {
        return this.thresholdAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFinancialInstrumentId() {
        return this.financialInstrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBalanceId() {
        return this.balanceId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getScheduleType() {
        return this.scheduleType;
    }
}
