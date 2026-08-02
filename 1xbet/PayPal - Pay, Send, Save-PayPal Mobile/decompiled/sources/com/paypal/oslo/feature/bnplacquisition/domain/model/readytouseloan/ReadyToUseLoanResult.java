package com.paypal.oslo.feature.bnplacquisition.domain.model.readytouseloan;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/readytouseloan/ReadyToUseLoanResult;", "", "", "hasActiveLoan", "", "creditAccountId", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/readytouseloan/ReadyToUseLoanResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getHasActiveLoan", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ReadyToUseLoanResult {
    public static final int $stable = 0;
    private final java.lang.String creditAccountId;
    private final boolean hasActiveLoan;

    public ReadyToUseLoanResult(boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.hasActiveLoan = z;
        this.creditAccountId = str;
    }

    public final boolean getHasActiveLoan() {
        return this.hasActiveLoan;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.lang.String toString() {
        boolean z = this.hasActiveLoan;
        java.lang.String str = this.creditAccountId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadyToUseLoanResult(hasActiveLoan=");
        sb.append(z);
        sb.append(", creditAccountId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.hasActiveLoan) * 31) + this.creditAccountId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.readytouseloan.ReadyToUseLoanResult)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.readytouseloan.ReadyToUseLoanResult readyToUseLoanResult = (com.paypal.oslo.feature.bnplacquisition.domain.model.readytouseloan.ReadyToUseLoanResult) other;
        return this.hasActiveLoan == readyToUseLoanResult.hasActiveLoan && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, readyToUseLoanResult.creditAccountId);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.readytouseloan.ReadyToUseLoanResult copy(boolean hasActiveLoan, java.lang.String creditAccountId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.readytouseloan.ReadyToUseLoanResult(hasActiveLoan, creditAccountId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasActiveLoan() {
        return this.hasActiveLoan;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.readytouseloan.ReadyToUseLoanResult copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.readytouseloan.ReadyToUseLoanResult readyToUseLoanResult, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = readyToUseLoanResult.hasActiveLoan;
        }
        if ((i & 2) != 0) {
            str = readyToUseLoanResult.creditAccountId;
        }
        return readyToUseLoanResult.copy(z, str);
    }
}
