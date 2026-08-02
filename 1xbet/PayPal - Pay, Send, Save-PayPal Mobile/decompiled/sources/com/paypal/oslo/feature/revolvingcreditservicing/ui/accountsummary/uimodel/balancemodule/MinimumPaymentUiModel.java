package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/MinimumPaymentUiModel;", "", "", "amount", "dueDate", "amountToAvoidInterest", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;", "avoidInterestOnNextStatementGuide", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/MinimumPaymentUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount", "getDueDate", "getAmountToAvoidInterest", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;", "getAvoidInterestOnNextStatementGuide"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MinimumPaymentUiModel {
    public static final int $stable = 8;
    private final java.lang.String amount;
    private final java.lang.String amountToAvoidInterest;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl avoidInterestOnNextStatementGuide;
    private final java.lang.String dueDate;

    public MinimumPaymentUiModel(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.amount = str;
        this.dueDate = str2;
        this.amountToAvoidInterest = str3;
        this.avoidInterestOnNextStatementGuide = contentUrl;
    }

    public /* synthetic */ MinimumPaymentUiModel(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : contentUrl);
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final java.lang.String getDueDate() {
        return this.dueDate;
    }

    public final java.lang.String getAmountToAvoidInterest() {
        return this.amountToAvoidInterest;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl getAvoidInterestOnNextStatementGuide() {
        return this.avoidInterestOnNextStatementGuide;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.amount;
        java.lang.String str2 = this.dueDate;
        java.lang.String str3 = this.amountToAvoidInterest;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl = this.avoidInterestOnNextStatementGuide;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MinimumPaymentUiModel(amount=");
        sb.append(str);
        sb.append(", dueDate=");
        sb.append(str2);
        sb.append(", amountToAvoidInterest=");
        sb.append(str3);
        sb.append(", avoidInterestOnNextStatementGuide=");
        sb.append(contentUrl);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.amount.hashCode();
        int hashCode2 = this.dueDate.hashCode();
        java.lang.String str = this.amountToAvoidInterest;
        int hashCode3 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl = this.avoidInterestOnNextStatementGuide;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (contentUrl != null ? contentUrl.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel minimumPaymentUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, minimumPaymentUiModel.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.dueDate, minimumPaymentUiModel.dueDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountToAvoidInterest, minimumPaymentUiModel.amountToAvoidInterest) && kotlin.jvm.internal.Intrinsics.areEqual(this.avoidInterestOnNextStatementGuide, minimumPaymentUiModel.avoidInterestOnNextStatementGuide);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel copy(java.lang.String amount, java.lang.String dueDate, java.lang.String amountToAvoidInterest, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl avoidInterestOnNextStatementGuide) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dueDate, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel(amount, dueDate, amountToAvoidInterest, avoidInterestOnNextStatementGuide);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl getAvoidInterestOnNextStatementGuide() {
        return this.avoidInterestOnNextStatementGuide;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAmountToAvoidInterest() {
        return this.amountToAvoidInterest;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDueDate() {
        return this.dueDate;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel minimumPaymentUiModel, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = minimumPaymentUiModel.amount;
        }
        if ((i & 2) != 0) {
            str2 = minimumPaymentUiModel.dueDate;
        }
        if ((i & 4) != 0) {
            str3 = minimumPaymentUiModel.amountToAvoidInterest;
        }
        if ((i & 8) != 0) {
            contentUrl = minimumPaymentUiModel.avoidInterestOnNextStatementGuide;
        }
        return minimumPaymentUiModel.copy(str, str2, str3, contentUrl);
    }
}
