package com.paypal.oslo.feature.bnplservicing.domain.model.snooze.input;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJd\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b,\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\u0011R\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b.\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b/\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/input/SnoozePreContractInput;", "", "", "planId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "enrollmentFee", "merchantName", "newMaturityDate", "adjustedTotalAmount", "originalBalance", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstrument", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "component4", "component5", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/input/SnoozePreContractInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPlanId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCpi", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "getEnrollmentFee", "getMerchantName", "getNewMaturityDate", "getAdjustedTotalAmount", "getOriginalBalance", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "getFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SnoozePreContractInput {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money adjustedTotalAmount;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier cpi;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money enrollmentFee;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument;
    private final java.lang.String merchantName;
    private final java.lang.String newMaturityDate;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money originalBalance;
    private final java.lang.String planId;

    public SnoozePreContractInput(java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money3, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money2, "");
        this.planId = str;
        this.cpi = creditProductIdentifier;
        this.enrollmentFee = money;
        this.merchantName = str2;
        this.newMaturityDate = str3;
        this.adjustedTotalAmount = money2;
        this.originalBalance = money3;
        this.fundingInstrument = fundingInstrument;
    }

    public /* synthetic */ SnoozePreContractInput(java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money3, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, creditProductIdentifier, money, str2, str3, money2, (i & 64) != 0 ? null : money3, (i & 128) != 0 ? null : fundingInstrument);
    }

    public final java.lang.String getPlanId() {
        return this.planId;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCpi() {
        return this.cpi;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getEnrollmentFee() {
        return this.enrollmentFee;
    }

    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public final java.lang.String getNewMaturityDate() {
        return this.newMaturityDate;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getAdjustedTotalAmount() {
        return this.adjustedTotalAmount;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getOriginalBalance() {
        return this.originalBalance;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument() {
        return this.fundingInstrument;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.planId;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = this.cpi;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.enrollmentFee;
        java.lang.String str2 = this.merchantName;
        java.lang.String str3 = this.newMaturityDate;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2 = this.adjustedTotalAmount;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money3 = this.originalBalance;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = this.fundingInstrument;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SnoozePreContractInput(planId=");
        sb.append(str);
        sb.append(", cpi=");
        sb.append(creditProductIdentifier);
        sb.append(", enrollmentFee=");
        sb.append(money);
        sb.append(", merchantName=");
        sb.append(str2);
        sb.append(", newMaturityDate=");
        sb.append(str3);
        sb.append(", adjustedTotalAmount=");
        sb.append(money2);
        sb.append(", originalBalance=");
        sb.append(money3);
        sb.append(", fundingInstrument=");
        sb.append(fundingInstrument);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.planId.hashCode();
        int hashCode2 = this.cpi.hashCode();
        int hashCode3 = this.enrollmentFee.hashCode();
        int hashCode4 = this.merchantName.hashCode();
        int hashCode5 = this.newMaturityDate.hashCode();
        int hashCode6 = this.adjustedTotalAmount.hashCode();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.originalBalance;
        int hashCode7 = money == null ? 0 : money.hashCode();
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = this.fundingInstrument;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (fundingInstrument != null ? fundingInstrument.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.snooze.input.SnoozePreContractInput)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.snooze.input.SnoozePreContractInput snoozePreContractInput = (com.paypal.oslo.feature.bnplservicing.domain.model.snooze.input.SnoozePreContractInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.planId, snoozePreContractInput.planId) && this.cpi == snoozePreContractInput.cpi && kotlin.jvm.internal.Intrinsics.areEqual(this.enrollmentFee, snoozePreContractInput.enrollmentFee) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, snoozePreContractInput.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.newMaturityDate, snoozePreContractInput.newMaturityDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.adjustedTotalAmount, snoozePreContractInput.adjustedTotalAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.originalBalance, snoozePreContractInput.originalBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrument, snoozePreContractInput.fundingInstrument);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.snooze.input.SnoozePreContractInput copy(java.lang.String planId, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier cpi, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money enrollmentFee, java.lang.String merchantName, java.lang.String newMaturityDate, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money adjustedTotalAmount, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money originalBalance, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollmentFee, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newMaturityDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adjustedTotalAmount, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.snooze.input.SnoozePreContractInput(planId, cpi, enrollmentFee, merchantName, newMaturityDate, adjustedTotalAmount, originalBalance, fundingInstrument);
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument() {
        return this.fundingInstrument;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getOriginalBalance() {
        return this.originalBalance;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getAdjustedTotalAmount() {
        return this.adjustedTotalAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getNewMaturityDate() {
        return this.newMaturityDate;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getEnrollmentFee() {
        return this.enrollmentFee;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCpi() {
        return this.cpi;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPlanId() {
        return this.planId;
    }
}
