package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdateRevolvingCreditLineIncreaseOfferStatusInput;", "", "creditAccountId", "offerId", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditLineIncreaseOfferUpdateStatus;", "offerStatus", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditLineIncreaseOfferUpdateStatus;)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditLineIncreaseOfferUpdateStatus;", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditLineIncreaseOfferUpdateStatus;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateRevolvingCreditLineIncreaseOfferStatusInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCreditAccountId", "getOfferId", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditLineIncreaseOfferUpdateStatus;", "getOfferStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateRevolvingCreditLineIncreaseOfferStatusInput {
    private final java.lang.Object creditAccountId;
    private final java.lang.Object offerId;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferUpdateStatus offerStatus;

    public UpdateRevolvingCreditLineIncreaseOfferStatusInput(java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferUpdateStatus revolvingCreditLineIncreaseOfferUpdateStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditLineIncreaseOfferUpdateStatus, "");
        this.creditAccountId = obj;
        this.offerId = obj2;
        this.offerStatus = revolvingCreditLineIncreaseOfferUpdateStatus;
    }

    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.lang.Object getOfferId() {
        return this.offerId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferUpdateStatus getOfferStatus() {
        return this.offerStatus;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.creditAccountId;
        java.lang.Object obj2 = this.offerId;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferUpdateStatus revolvingCreditLineIncreaseOfferUpdateStatus = this.offerStatus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateRevolvingCreditLineIncreaseOfferStatusInput(creditAccountId=");
        sb.append(obj);
        sb.append(", offerId=");
        sb.append(obj2);
        sb.append(", offerStatus=");
        sb.append(revolvingCreditLineIncreaseOfferUpdateStatus);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.creditAccountId.hashCode() * 31) + this.offerId.hashCode()) * 31) + this.offerStatus.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditLineIncreaseOfferStatusInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditLineIncreaseOfferStatusInput updateRevolvingCreditLineIncreaseOfferStatusInput = (com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditLineIncreaseOfferStatusInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, updateRevolvingCreditLineIncreaseOfferStatusInput.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerId, updateRevolvingCreditLineIncreaseOfferStatusInput.offerId) && this.offerStatus == updateRevolvingCreditLineIncreaseOfferStatusInput.offerStatus;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditLineIncreaseOfferStatusInput copy(java.lang.Object creditAccountId, java.lang.Object offerId, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferUpdateStatus offerStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerStatus, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditLineIncreaseOfferStatusInput(creditAccountId, offerId, offerStatus);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferUpdateStatus getOfferStatus() {
        return this.offerStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getOfferId() {
        return this.offerId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditLineIncreaseOfferStatusInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditLineIncreaseOfferStatusInput updateRevolvingCreditLineIncreaseOfferStatusInput, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferUpdateStatus revolvingCreditLineIncreaseOfferUpdateStatus, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            obj = updateRevolvingCreditLineIncreaseOfferStatusInput.creditAccountId;
        }
        if ((i & 2) != 0) {
            obj2 = updateRevolvingCreditLineIncreaseOfferStatusInput.offerId;
        }
        if ((i & 4) != 0) {
            revolvingCreditLineIncreaseOfferUpdateStatus = updateRevolvingCreditLineIncreaseOfferStatusInput.offerStatus;
        }
        return updateRevolvingCreditLineIncreaseOfferStatusInput.copy(obj, obj2, revolvingCreditLineIncreaseOfferUpdateStatus);
    }
}
