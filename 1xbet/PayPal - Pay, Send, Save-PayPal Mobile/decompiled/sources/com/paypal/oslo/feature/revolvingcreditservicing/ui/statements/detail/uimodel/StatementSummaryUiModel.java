package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementSummaryUiModel;", "", "", "previousBalance", "totalPaymentCredits", "totalPurchases", "totalInterestFinanceChargesAndFees", "newBalance", "closingDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementSummaryUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPreviousBalance", "getTotalPaymentCredits", "getTotalPurchases", "getTotalInterestFinanceChargesAndFees", "getNewBalance", "getClosingDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class StatementSummaryUiModel {
    public static final int $stable = 0;
    private final java.lang.String closingDate;
    private final java.lang.String newBalance;
    private final java.lang.String previousBalance;
    private final java.lang.String totalInterestFinanceChargesAndFees;
    private final java.lang.String totalPaymentCredits;
    private final java.lang.String totalPurchases;

    public StatementSummaryUiModel(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        this.previousBalance = str;
        this.totalPaymentCredits = str2;
        this.totalPurchases = str3;
        this.totalInterestFinanceChargesAndFees = str4;
        this.newBalance = str5;
        this.closingDate = str6;
    }

    public final java.lang.String getPreviousBalance() {
        return this.previousBalance;
    }

    public final java.lang.String getTotalPaymentCredits() {
        return this.totalPaymentCredits;
    }

    public final java.lang.String getTotalPurchases() {
        return this.totalPurchases;
    }

    public final java.lang.String getTotalInterestFinanceChargesAndFees() {
        return this.totalInterestFinanceChargesAndFees;
    }

    public final java.lang.String getNewBalance() {
        return this.newBalance;
    }

    public final java.lang.String getClosingDate() {
        return this.closingDate;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.previousBalance;
        java.lang.String str2 = this.totalPaymentCredits;
        java.lang.String str3 = this.totalPurchases;
        java.lang.String str4 = this.totalInterestFinanceChargesAndFees;
        java.lang.String str5 = this.newBalance;
        java.lang.String str6 = this.closingDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StatementSummaryUiModel(previousBalance=");
        sb.append(str);
        sb.append(", totalPaymentCredits=");
        sb.append(str2);
        sb.append(", totalPurchases=");
        sb.append(str3);
        sb.append(", totalInterestFinanceChargesAndFees=");
        sb.append(str4);
        sb.append(", newBalance=");
        sb.append(str5);
        sb.append(", closingDate=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.previousBalance.hashCode() * 31) + this.totalPaymentCredits.hashCode()) * 31) + this.totalPurchases.hashCode()) * 31) + this.totalInterestFinanceChargesAndFees.hashCode()) * 31) + this.newBalance.hashCode()) * 31) + this.closingDate.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel statementSummaryUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.previousBalance, statementSummaryUiModel.previousBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalPaymentCredits, statementSummaryUiModel.totalPaymentCredits) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalPurchases, statementSummaryUiModel.totalPurchases) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalInterestFinanceChargesAndFees, statementSummaryUiModel.totalInterestFinanceChargesAndFees) && kotlin.jvm.internal.Intrinsics.areEqual(this.newBalance, statementSummaryUiModel.newBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.closingDate, statementSummaryUiModel.closingDate);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel copy(java.lang.String previousBalance, java.lang.String totalPaymentCredits, java.lang.String totalPurchases, java.lang.String totalInterestFinanceChargesAndFees, java.lang.String newBalance, java.lang.String closingDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(previousBalance, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalPaymentCredits, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalPurchases, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalInterestFinanceChargesAndFees, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newBalance, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closingDate, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel(previousBalance, totalPaymentCredits, totalPurchases, totalInterestFinanceChargesAndFees, newBalance, closingDate);
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getClosingDate() {
        return this.closingDate;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getNewBalance() {
        return this.newBalance;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getTotalInterestFinanceChargesAndFees() {
        return this.totalInterestFinanceChargesAndFees;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTotalPurchases() {
        return this.totalPurchases;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTotalPaymentCredits() {
        return this.totalPaymentCredits;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPreviousBalance() {
        return this.previousBalance;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel statementSummaryUiModel, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = statementSummaryUiModel.previousBalance;
        }
        if ((i & 2) != 0) {
            str2 = statementSummaryUiModel.totalPaymentCredits;
        }
        java.lang.String str7 = str2;
        if ((i & 4) != 0) {
            str3 = statementSummaryUiModel.totalPurchases;
        }
        java.lang.String str8 = str3;
        if ((i & 8) != 0) {
            str4 = statementSummaryUiModel.totalInterestFinanceChargesAndFees;
        }
        java.lang.String str9 = str4;
        if ((i & 16) != 0) {
            str5 = statementSummaryUiModel.newBalance;
        }
        java.lang.String str10 = str5;
        if ((i & 32) != 0) {
            str6 = statementSummaryUiModel.closingDate;
        }
        return statementSummaryUiModel.copy(str, str7, str8, str9, str10, str6);
    }
}
