package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementHeaderUiModel;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "statementPeriod", "balanceDateRange", "", "balance", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementHeaderUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getStatementPeriod", "getBalanceDateRange", "Ljava/lang/String;", "getBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class StatementHeaderUiModel {
    public static final int $stable = 0;
    private final java.lang.String balance;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString balanceDateRange;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString statementPeriod;

    public StatementHeaderUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.statementPeriod = uiString;
        this.balanceDateRange = uiString2;
        this.balance = str;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getStatementPeriod() {
        return this.statementPeriod;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getBalanceDateRange() {
        return this.balanceDateRange;
    }

    public final java.lang.String getBalance() {
        return this.balance;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.statementPeriod;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.balanceDateRange;
        java.lang.String str = this.balance;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StatementHeaderUiModel(statementPeriod=");
        sb.append(uiString);
        sb.append(", balanceDateRange=");
        sb.append(uiString2);
        sb.append(", balance=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.statementPeriod.hashCode() * 31) + this.balanceDateRange.hashCode()) * 31) + this.balance.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel statementHeaderUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.statementPeriod, statementHeaderUiModel.statementPeriod) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceDateRange, statementHeaderUiModel.balanceDateRange) && kotlin.jvm.internal.Intrinsics.areEqual(this.balance, statementHeaderUiModel.balance);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString statementPeriod, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString balanceDateRange, java.lang.String balance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementPeriod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceDateRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balance, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel(statementPeriod, balanceDateRange, balance);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBalance() {
        return this.balance;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getBalanceDateRange() {
        return this.balanceDateRange;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getStatementPeriod() {
        return this.statementPeriod;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel statementHeaderUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            uiString = statementHeaderUiModel.statementPeriod;
        }
        if ((i & 2) != 0) {
            uiString2 = statementHeaderUiModel.balanceDateRange;
        }
        if ((i & 4) != 0) {
            str = statementHeaderUiModel.balance;
        }
        return statementHeaderUiModel.copy(uiString, uiString2, str);
    }
}
