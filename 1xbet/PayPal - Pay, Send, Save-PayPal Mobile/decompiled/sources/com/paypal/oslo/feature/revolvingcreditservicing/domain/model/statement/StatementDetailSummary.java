package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0094\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b+\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b1\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b2\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b3\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b4\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b5\u0010\u0014R\u001a\u0010\f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b6\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b7\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b:\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/StatementDetailSummary;", "", "Ljava/time/Instant;", "startDate", "closingDate", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "previousBalance", "totalPaymentCredits", "totalPurchases", "totalInterestFinanceChargesAndFees", "newBalance", "paymentDueDate", "minimumPaymentDue", "avoidInterestMinimumPaymentDue", "", "learnMoreUrl", "apr", "<init>", "(Ljava/time/Instant;Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/time/Instant;", "component2", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Ljava/lang/String;", "component12", "copy", "(Ljava/time/Instant;Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/StatementDetailSummary;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/time/Instant;", "getStartDate", "getClosingDate", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getPreviousBalance", "getTotalPaymentCredits", "getTotalPurchases", "getTotalInterestFinanceChargesAndFees", "getNewBalance", "getPaymentDueDate", "getMinimumPaymentDue", "getAvoidInterestMinimumPaymentDue", "Ljava/lang/String;", "getLearnMoreUrl", "getApr"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class StatementDetailSummary {
    public static final int $stable = 8;
    private final java.lang.String apr;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount avoidInterestMinimumPaymentDue;
    private final java.time.Instant closingDate;
    private final java.lang.String learnMoreUrl;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount minimumPaymentDue;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount newBalance;
    private final java.time.Instant paymentDueDate;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount previousBalance;
    private final java.time.Instant startDate;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount totalInterestFinanceChargesAndFees;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount totalPaymentCredits;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount totalPurchases;

    public StatementDetailSummary(java.time.Instant instant, java.time.Instant instant2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount5, java.time.Instant instant3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount6, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount7, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount6, "");
        this.startDate = instant;
        this.closingDate = instant2;
        this.previousBalance = currencyAmount;
        this.totalPaymentCredits = currencyAmount2;
        this.totalPurchases = currencyAmount3;
        this.totalInterestFinanceChargesAndFees = currencyAmount4;
        this.newBalance = currencyAmount5;
        this.paymentDueDate = instant3;
        this.minimumPaymentDue = currencyAmount6;
        this.avoidInterestMinimumPaymentDue = currencyAmount7;
        this.learnMoreUrl = str;
        this.apr = str2;
    }

    public final java.time.Instant getStartDate() {
        return this.startDate;
    }

    public final java.time.Instant getClosingDate() {
        return this.closingDate;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getPreviousBalance() {
        return this.previousBalance;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getTotalPaymentCredits() {
        return this.totalPaymentCredits;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getTotalPurchases() {
        return this.totalPurchases;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getTotalInterestFinanceChargesAndFees() {
        return this.totalInterestFinanceChargesAndFees;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getNewBalance() {
        return this.newBalance;
    }

    public final java.time.Instant getPaymentDueDate() {
        return this.paymentDueDate;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getMinimumPaymentDue() {
        return this.minimumPaymentDue;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAvoidInterestMinimumPaymentDue() {
        return this.avoidInterestMinimumPaymentDue;
    }

    public final java.lang.String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    public final java.lang.String getApr() {
        return this.apr;
    }

    public final java.lang.String toString() {
        java.time.Instant instant = this.startDate;
        java.time.Instant instant2 = this.closingDate;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.previousBalance;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = this.totalPaymentCredits;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = this.totalPurchases;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount4 = this.totalInterestFinanceChargesAndFees;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount5 = this.newBalance;
        java.time.Instant instant3 = this.paymentDueDate;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount6 = this.minimumPaymentDue;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount7 = this.avoidInterestMinimumPaymentDue;
        java.lang.String str = this.learnMoreUrl;
        java.lang.String str2 = this.apr;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StatementDetailSummary(startDate=");
        sb.append(instant);
        sb.append(", closingDate=");
        sb.append(instant2);
        sb.append(", previousBalance=");
        sb.append(currencyAmount);
        sb.append(", totalPaymentCredits=");
        sb.append(currencyAmount2);
        sb.append(", totalPurchases=");
        sb.append(currencyAmount3);
        sb.append(", totalInterestFinanceChargesAndFees=");
        sb.append(currencyAmount4);
        sb.append(", newBalance=");
        sb.append(currencyAmount5);
        sb.append(", paymentDueDate=");
        sb.append(instant3);
        sb.append(", minimumPaymentDue=");
        sb.append(currencyAmount6);
        sb.append(", avoidInterestMinimumPaymentDue=");
        sb.append(currencyAmount7);
        sb.append(", learnMoreUrl=");
        sb.append(str);
        sb.append(", apr=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.time.Instant instant = this.startDate;
        int hashCode = instant == null ? 0 : instant.hashCode();
        java.time.Instant instant2 = this.closingDate;
        int hashCode2 = instant2 == null ? 0 : instant2.hashCode();
        int hashCode3 = this.previousBalance.hashCode();
        int hashCode4 = this.totalPaymentCredits.hashCode();
        int hashCode5 = this.totalPurchases.hashCode();
        int hashCode6 = this.totalInterestFinanceChargesAndFees.hashCode();
        int hashCode7 = this.newBalance.hashCode();
        java.time.Instant instant3 = this.paymentDueDate;
        int hashCode8 = instant3 == null ? 0 : instant3.hashCode();
        int hashCode9 = this.minimumPaymentDue.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.avoidInterestMinimumPaymentDue;
        int hashCode10 = currencyAmount == null ? 0 : currencyAmount.hashCode();
        java.lang.String str = this.learnMoreUrl;
        int hashCode11 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.apr;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailSummary)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailSummary statementDetailSummary = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailSummary) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, statementDetailSummary.startDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.closingDate, statementDetailSummary.closingDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.previousBalance, statementDetailSummary.previousBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalPaymentCredits, statementDetailSummary.totalPaymentCredits) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalPurchases, statementDetailSummary.totalPurchases) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalInterestFinanceChargesAndFees, statementDetailSummary.totalInterestFinanceChargesAndFees) && kotlin.jvm.internal.Intrinsics.areEqual(this.newBalance, statementDetailSummary.newBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentDueDate, statementDetailSummary.paymentDueDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumPaymentDue, statementDetailSummary.minimumPaymentDue) && kotlin.jvm.internal.Intrinsics.areEqual(this.avoidInterestMinimumPaymentDue, statementDetailSummary.avoidInterestMinimumPaymentDue) && kotlin.jvm.internal.Intrinsics.areEqual(this.learnMoreUrl, statementDetailSummary.learnMoreUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.apr, statementDetailSummary.apr);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailSummary copy(java.time.Instant startDate, java.time.Instant closingDate, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount previousBalance, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount totalPaymentCredits, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount totalPurchases, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount totalInterestFinanceChargesAndFees, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount newBalance, java.time.Instant paymentDueDate, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount minimumPaymentDue, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount avoidInterestMinimumPaymentDue, java.lang.String learnMoreUrl, java.lang.String apr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(previousBalance, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalPaymentCredits, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalPurchases, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalInterestFinanceChargesAndFees, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newBalance, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minimumPaymentDue, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailSummary(startDate, closingDate, previousBalance, totalPaymentCredits, totalPurchases, totalInterestFinanceChargesAndFees, newBalance, paymentDueDate, minimumPaymentDue, avoidInterestMinimumPaymentDue, learnMoreUrl, apr);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getMinimumPaymentDue() {
        return this.minimumPaymentDue;
    }

    /* renamed from: component8, reason: from getter */
    public final java.time.Instant getPaymentDueDate() {
        return this.paymentDueDate;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getNewBalance() {
        return this.newBalance;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getTotalInterestFinanceChargesAndFees() {
        return this.totalInterestFinanceChargesAndFees;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getTotalPurchases() {
        return this.totalPurchases;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getTotalPaymentCredits() {
        return this.totalPaymentCredits;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getPreviousBalance() {
        return this.previousBalance;
    }

    /* renamed from: component2, reason: from getter */
    public final java.time.Instant getClosingDate() {
        return this.closingDate;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getApr() {
        return this.apr;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAvoidInterestMinimumPaymentDue() {
        return this.avoidInterestMinimumPaymentDue;
    }

    /* renamed from: component1, reason: from getter */
    public final java.time.Instant getStartDate() {
        return this.startDate;
    }
}
