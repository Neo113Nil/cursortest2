package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/utils/FromDateSelectionResult;", "", "Ljava/time/LocalDate;", "fromDate", "toDate", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "component1", "()Ljava/time/LocalDate;", "component2", "copy", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/utils/FromDateSelectionResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDate;", "getFromDate", "getToDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FromDateSelectionResult {
    public static final int $stable = 8;
    private final java.time.LocalDate fromDate;
    private final java.time.LocalDate toDate;

    public FromDateSelectionResult(java.time.LocalDate localDate, java.time.LocalDate localDate2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate2, "");
        this.fromDate = localDate;
        this.toDate = localDate2;
    }

    public final java.time.LocalDate getFromDate() {
        return this.fromDate;
    }

    public final java.time.LocalDate getToDate() {
        return this.toDate;
    }

    public final java.lang.String toString() {
        java.time.LocalDate localDate = this.fromDate;
        java.time.LocalDate localDate2 = this.toDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FromDateSelectionResult(fromDate=");
        sb.append(localDate);
        sb.append(", toDate=");
        sb.append(localDate2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.fromDate.hashCode() * 31) + this.toDate.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.FromDateSelectionResult)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.FromDateSelectionResult fromDateSelectionResult = (com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.FromDateSelectionResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fromDate, fromDateSelectionResult.fromDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.toDate, fromDateSelectionResult.toDate);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.FromDateSelectionResult copy(java.time.LocalDate fromDate, java.time.LocalDate toDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fromDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toDate, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.FromDateSelectionResult(fromDate, toDate);
    }

    /* renamed from: component2, reason: from getter */
    public final java.time.LocalDate getToDate() {
        return this.toDate;
    }

    /* renamed from: component1, reason: from getter */
    public final java.time.LocalDate getFromDate() {
        return this.fromDate;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.FromDateSelectionResult copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.FromDateSelectionResult fromDateSelectionResult, java.time.LocalDate localDate, java.time.LocalDate localDate2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            localDate = fromDateSelectionResult.fromDate;
        }
        if ((i & 2) != 0) {
            localDate2 = fromDateSelectionResult.toDate;
        }
        return fromDateSelectionResult.copy(localDate, localDate2);
    }
}
