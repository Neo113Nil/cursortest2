package com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/prequalifiedamount/PrequalificationAmount;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "spendingPower", "", "preQualificationEligible", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/prequalifiedamount/Faq;", "faqs", "", "legalMessage", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;ZLjava/util/List;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "component2", "()Z", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;ZLjava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/prequalifiedamount/PrequalificationAmount;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "getSpendingPower", "Z", "getPreQualificationEligible", "Ljava/util/List;", "getFaqs", "Ljava/lang/String;", "getLegalMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PrequalificationAmount {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq> faqs;
    private final java.lang.String legalMessage;
    private final boolean preQualificationEligible;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money spendingPower;

    public PrequalificationAmount(com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, boolean z, java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq> list, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.spendingPower = money;
        this.preQualificationEligible = z;
        this.faqs = list;
        this.legalMessage = str;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getSpendingPower() {
        return this.spendingPower;
    }

    public final boolean getPreQualificationEligible() {
        return this.preQualificationEligible;
    }

    public /* synthetic */ PrequalificationAmount(com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, boolean z, java.util.List list, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? false : z, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str);
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq> getFaqs() {
        return this.faqs;
    }

    public final java.lang.String getLegalMessage() {
        return this.legalMessage;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.spendingPower;
        boolean z = this.preQualificationEligible;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq> list = this.faqs;
        java.lang.String str = this.legalMessage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PrequalificationAmount(spendingPower=");
        sb.append(money);
        sb.append(", preQualificationEligible=");
        sb.append(z);
        sb.append(", faqs=");
        sb.append(list);
        sb.append(", legalMessage=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.spendingPower;
        int hashCode = money == null ? 0 : money.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.preQualificationEligible);
        int hashCode3 = this.faqs.hashCode();
        java.lang.String str = this.legalMessage;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount prequalificationAmount = (com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.spendingPower, prequalificationAmount.spendingPower) && this.preQualificationEligible == prequalificationAmount.preQualificationEligible && kotlin.jvm.internal.Intrinsics.areEqual(this.faqs, prequalificationAmount.faqs) && kotlin.jvm.internal.Intrinsics.areEqual(this.legalMessage, prequalificationAmount.legalMessage);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount copy(com.paypal.oslo.feature.bnplservicing.domain.model.common.Money spendingPower, boolean preQualificationEligible, java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq> faqs, java.lang.String legalMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faqs, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount(spendingPower, preQualificationEligible, faqs, legalMessage);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLegalMessage() {
        return this.legalMessage;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq> component3() {
        return this.faqs;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getPreQualificationEligible() {
        return this.preQualificationEligible;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getSpendingPower() {
        return this.spendingPower;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount prequalificationAmount, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, boolean z, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            money = prequalificationAmount.spendingPower;
        }
        if ((i & 2) != 0) {
            z = prequalificationAmount.preQualificationEligible;
        }
        if ((i & 4) != 0) {
            list = prequalificationAmount.faqs;
        }
        if ((i & 8) != 0) {
            str = prequalificationAmount.legalMessage;
        }
        return prequalificationAmount.copy(money, z, list, str);
    }

    public PrequalificationAmount() {
        this(null, false, null, null, 15, null);
    }
}
