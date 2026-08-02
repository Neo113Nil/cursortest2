package com.paypal.oslo.feature.balance.domain.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0010\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JF\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b'\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/TaxHoldPolicy;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PolicyStatus;", "policyStatus", "Lcom/paypal/oslo/api/graphql/schema/type/ProcessStatus;", "Lcom/paypal/oslo/feature/balance/graphql/type/ProcessStatus;", "processStatus", "", "taxRate", "nextWithholdingDate", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "amountThreshold", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PolicyStatus;Lcom/paypal/oslo/api/graphql/schema/type/ProcessStatus;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PolicyStatus;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ProcessStatus;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PolicyStatus;Lcom/paypal/oslo/api/graphql/schema/type/ProcessStatus;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;)Lcom/paypal/oslo/feature/balance/domain/model/TaxHoldPolicy;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PolicyStatus;", "getPolicyStatus", "Lcom/paypal/oslo/api/graphql/schema/type/ProcessStatus;", "getProcessStatus", "Ljava/lang/String;", "getTaxRate", "getNextWithholdingDate", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getAmountThreshold"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TaxHoldPolicy {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.balance.domain.model.Money amountThreshold;
    private final java.lang.String nextWithholdingDate;
    private final com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus;
    private final com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus;
    private final java.lang.String taxRate;

    public TaxHoldPolicy(com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus, com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.domain.model.Money money) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(policyStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        this.policyStatus = policyStatus;
        this.processStatus = processStatus;
        this.taxRate = str;
        this.nextWithholdingDate = str2;
        this.amountThreshold = money;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PolicyStatus getPolicyStatus() {
        return this.policyStatus;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ProcessStatus getProcessStatus() {
        return this.processStatus;
    }

    public final java.lang.String getTaxRate() {
        return this.taxRate;
    }

    public final java.lang.String getNextWithholdingDate() {
        return this.nextWithholdingDate;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getAmountThreshold() {
        return this.amountThreshold;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus = this.policyStatus;
        com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus = this.processStatus;
        java.lang.String str = this.taxRate;
        java.lang.String str2 = this.nextWithholdingDate;
        com.paypal.oslo.feature.balance.domain.model.Money money = this.amountThreshold;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxHoldPolicy(policyStatus=");
        sb.append(policyStatus);
        sb.append(", processStatus=");
        sb.append(processStatus);
        sb.append(", taxRate=");
        sb.append(str);
        sb.append(", nextWithholdingDate=");
        sb.append(str2);
        sb.append(", amountThreshold=");
        sb.append(money);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.policyStatus.hashCode() * 31) + this.processStatus.hashCode()) * 31) + this.taxRate.hashCode()) * 31) + this.nextWithholdingDate.hashCode()) * 31) + this.amountThreshold.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy = (com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy) other;
        return this.policyStatus == taxHoldPolicy.policyStatus && this.processStatus == taxHoldPolicy.processStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.taxRate, taxHoldPolicy.taxRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.nextWithholdingDate, taxHoldPolicy.nextWithholdingDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountThreshold, taxHoldPolicy.amountThreshold);
    }

    public final com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy copy(com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus, com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus, java.lang.String taxRate, java.lang.String nextWithholdingDate, com.paypal.oslo.feature.balance.domain.model.Money amountThreshold) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(policyStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxRate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextWithholdingDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountThreshold, "");
        return new com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy(policyStatus, processStatus, taxRate, nextWithholdingDate, amountThreshold);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getAmountThreshold() {
        return this.amountThreshold;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getNextWithholdingDate() {
        return this.nextWithholdingDate;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTaxRate() {
        return this.taxRate;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ProcessStatus getProcessStatus() {
        return this.processStatus;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PolicyStatus getPolicyStatus() {
        return this.policyStatus;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy copy$default(com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy, com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus, com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.domain.model.Money money, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            policyStatus = taxHoldPolicy.policyStatus;
        }
        if ((i & 2) != 0) {
            processStatus = taxHoldPolicy.processStatus;
        }
        com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus2 = processStatus;
        if ((i & 4) != 0) {
            str = taxHoldPolicy.taxRate;
        }
        java.lang.String str3 = str;
        if ((i & 8) != 0) {
            str2 = taxHoldPolicy.nextWithholdingDate;
        }
        java.lang.String str4 = str2;
        if ((i & 16) != 0) {
            money = taxHoldPolicy.amountThreshold;
        }
        return taxHoldPolicy.copy(policyStatus, processStatus2, str3, str4, money);
    }
}
