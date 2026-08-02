package com.paypal.oslo.feature.cryptocurrency.domain.model.funding;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingOption;", "", "", "id", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "totalAmount", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource;", "fundingSources", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;Ljava/util/List;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingOption;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "getTotalAmount", "Ljava/util/List;", "getFundingSources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FundingOption {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource> fundingSources;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money totalAmount;

    /* JADX WARN: Multi-variable type inference failed */
    public FundingOption(java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money, java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.id = str;
        this.totalAmount = money;
        this.fundingSources = list;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money getTotalAmount() {
        return this.totalAmount;
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource> getFundingSources() {
        return this.fundingSources;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money = this.totalAmount;
        java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource> list = this.fundingSources;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingOption(id=");
        sb.append(str);
        sb.append(", totalAmount=");
        sb.append(money);
        sb.append(", fundingSources=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.totalAmount.hashCode()) * 31) + this.fundingSources.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption fundingOption = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, fundingOption.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmount, fundingOption.totalAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSources, fundingOption.fundingSources);
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption copy(java.lang.String id, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money totalAmount, java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource> fundingSources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSources, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption(id, totalAmount, fundingSources);
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource> component3() {
        return this.fundingSources;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money getTotalAmount() {
        return this.totalAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption fundingOption, java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fundingOption.id;
        }
        if ((i & 2) != 0) {
            money = fundingOption.totalAmount;
        }
        if ((i & 4) != 0) {
            list = fundingOption.fundingSources;
        }
        return fundingOption.copy(str, money, list);
    }
}
