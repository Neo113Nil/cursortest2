package com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJ\\\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b&\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b'\u0010\u000eR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b(\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;", "", "", "creditAccountId", "incomeAmount", "revisedAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncomePeriod;", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PERIOD, "requestedLimit", "offerId", "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncomePeriod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncomePeriod;", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncomePeriod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "getIncomeAmount", "getRevisedAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncomePeriod;", "getPeriod", "getRequestedLimit", "getOfferId", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RequestCreditLineIncreaseRequest {
    public static final int $stable = 0;
    private final java.lang.String creditAccountId;
    private final java.lang.String currencyCode;
    private final java.lang.String incomeAmount;
    private final java.lang.String offerId;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod period;
    private final java.lang.String requestedLimit;
    private final java.lang.String revisedAmount;

    public RequestCreditLineIncreaseRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod cLIIncomePeriod, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIIncomePeriod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        this.creditAccountId = str;
        this.incomeAmount = str2;
        this.revisedAmount = str3;
        this.period = cLIIncomePeriod;
        this.requestedLimit = str4;
        this.offerId = str5;
        this.currencyCode = str6;
    }

    public /* synthetic */ RequestCreditLineIncreaseRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod cLIIncomePeriod, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, cLIIncomePeriod, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, str6);
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.lang.String getIncomeAmount() {
        return this.incomeAmount;
    }

    public final java.lang.String getRevisedAmount() {
        return this.revisedAmount;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod getPeriod() {
        return this.period;
    }

    public final java.lang.String getRequestedLimit() {
        return this.requestedLimit;
    }

    public final java.lang.String getOfferId() {
        return this.offerId;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.creditAccountId;
        java.lang.String str2 = this.incomeAmount;
        java.lang.String str3 = this.revisedAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod cLIIncomePeriod = this.period;
        java.lang.String str4 = this.requestedLimit;
        java.lang.String str5 = this.offerId;
        java.lang.String str6 = this.currencyCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestCreditLineIncreaseRequest(creditAccountId=");
        sb.append(str);
        sb.append(", incomeAmount=");
        sb.append(str2);
        sb.append(", revisedAmount=");
        sb.append(str3);
        sb.append(", period=");
        sb.append(cLIIncomePeriod);
        sb.append(", requestedLimit=");
        sb.append(str4);
        sb.append(", offerId=");
        sb.append(str5);
        sb.append(", currencyCode=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.creditAccountId.hashCode();
        int hashCode2 = this.incomeAmount.hashCode();
        java.lang.String str = this.revisedAmount;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = this.period.hashCode();
        java.lang.String str2 = this.requestedLimit;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.offerId;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.currencyCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest requestCreditLineIncreaseRequest = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, requestCreditLineIncreaseRequest.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.incomeAmount, requestCreditLineIncreaseRequest.incomeAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.revisedAmount, requestCreditLineIncreaseRequest.revisedAmount) && this.period == requestCreditLineIncreaseRequest.period && kotlin.jvm.internal.Intrinsics.areEqual(this.requestedLimit, requestCreditLineIncreaseRequest.requestedLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerId, requestCreditLineIncreaseRequest.offerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, requestCreditLineIncreaseRequest.currencyCode);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest copy(java.lang.String creditAccountId, java.lang.String incomeAmount, java.lang.String revisedAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod period, java.lang.String requestedLimit, java.lang.String offerId, java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(incomeAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(period, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest(creditAccountId, incomeAmount, revisedAmount, period, requestedLimit, offerId, currencyCode);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getOfferId() {
        return this.offerId;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getRequestedLimit() {
        return this.requestedLimit;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod getPeriod() {
        return this.period;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRevisedAmount() {
        return this.revisedAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getIncomeAmount() {
        return this.incomeAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest requestCreditLineIncreaseRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod cLIIncomePeriod, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = requestCreditLineIncreaseRequest.creditAccountId;
        }
        if ((i & 2) != 0) {
            str2 = requestCreditLineIncreaseRequest.incomeAmount;
        }
        java.lang.String str7 = str2;
        if ((i & 4) != 0) {
            str3 = requestCreditLineIncreaseRequest.revisedAmount;
        }
        java.lang.String str8 = str3;
        if ((i & 8) != 0) {
            cLIIncomePeriod = requestCreditLineIncreaseRequest.period;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod cLIIncomePeriod2 = cLIIncomePeriod;
        if ((i & 16) != 0) {
            str4 = requestCreditLineIncreaseRequest.requestedLimit;
        }
        java.lang.String str9 = str4;
        if ((i & 32) != 0) {
            str5 = requestCreditLineIncreaseRequest.offerId;
        }
        java.lang.String str10 = str5;
        if ((i & 64) != 0) {
            str6 = requestCreditLineIncreaseRequest.currencyCode;
        }
        return requestCreditLineIncreaseRequest.copy(str, str7, str8, cLIIncomePeriod2, str9, str10, str6);
    }
}
