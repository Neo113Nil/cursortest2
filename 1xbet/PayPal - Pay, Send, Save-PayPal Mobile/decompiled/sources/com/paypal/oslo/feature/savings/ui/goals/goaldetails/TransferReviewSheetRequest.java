package com.paypal.oslo.feature.savings.ui.goals.goaldetails;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/TransferReviewSheetRequest;", "", "id", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/TransferReviewSheetRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TransferReviewSheetRequest {
    public static final int $stable = 8;
    private final java.lang.Object id;

    public TransferReviewSheetRequest(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.id = obj;
    }

    public /* synthetic */ TransferReviewSheetRequest(java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.lang.Object() : obj);
    }

    public final java.lang.Object getId() {
        return this.id;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferReviewSheetRequest(id=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.TransferReviewSheetRequest) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.TransferReviewSheetRequest) other).id);
    }

    public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.TransferReviewSheetRequest copy(java.lang.Object id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.TransferReviewSheetRequest(id);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.TransferReviewSheetRequest copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.TransferReviewSheetRequest transferReviewSheetRequest, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = transferReviewSheetRequest.id;
        }
        return transferReviewSheetRequest.copy(obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TransferReviewSheetRequest() {
        this(r0, 1, r0);
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
    }
}
