package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CancelRevolvingCreditPaymentInput;", "", "creditAccountId", "creditPaymentId", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "creditProductIdentifier", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;)Lcom/paypal/oslo/api/graphql/schema/type/CancelRevolvingCreditPaymentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCreditAccountId", "getCreditPaymentId", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "getCreditProductIdentifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CancelRevolvingCreditPaymentInput {
    private final java.lang.Object creditAccountId;
    private final java.lang.Object creditPaymentId;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier;

    public CancelRevolvingCreditPaymentInput(java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditProductIdentifier, "");
        this.creditAccountId = obj;
        this.creditPaymentId = obj2;
        this.creditProductIdentifier = revolvingCreditProductIdentifier;
    }

    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.lang.Object getCreditPaymentId() {
        return this.creditPaymentId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.creditAccountId;
        java.lang.Object obj2 = this.creditPaymentId;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier = this.creditProductIdentifier;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelRevolvingCreditPaymentInput(creditAccountId=");
        sb.append(obj);
        sb.append(", creditPaymentId=");
        sb.append(obj2);
        sb.append(", creditProductIdentifier=");
        sb.append(revolvingCreditProductIdentifier);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.creditAccountId.hashCode() * 31) + this.creditPaymentId.hashCode()) * 31) + this.creditProductIdentifier.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CancelRevolvingCreditPaymentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CancelRevolvingCreditPaymentInput cancelRevolvingCreditPaymentInput = (com.paypal.oslo.api.graphql.schema.type.CancelRevolvingCreditPaymentInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, cancelRevolvingCreditPaymentInput.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditPaymentId, cancelRevolvingCreditPaymentInput.creditPaymentId) && this.creditProductIdentifier == cancelRevolvingCreditPaymentInput.creditProductIdentifier;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CancelRevolvingCreditPaymentInput copy(java.lang.Object creditAccountId, java.lang.Object creditPaymentId, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditPaymentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        return new com.paypal.oslo.api.graphql.schema.type.CancelRevolvingCreditPaymentInput(creditAccountId, creditPaymentId, creditProductIdentifier);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getCreditPaymentId() {
        return this.creditPaymentId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CancelRevolvingCreditPaymentInput copy$default(com.paypal.oslo.api.graphql.schema.type.CancelRevolvingCreditPaymentInput cancelRevolvingCreditPaymentInput, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            obj = cancelRevolvingCreditPaymentInput.creditAccountId;
        }
        if ((i & 2) != 0) {
            obj2 = cancelRevolvingCreditPaymentInput.creditPaymentId;
        }
        if ((i & 4) != 0) {
            revolvingCreditProductIdentifier = cancelRevolvingCreditPaymentInput.creditProductIdentifier;
        }
        return cancelRevolvingCreditPaymentInput.copy(obj, obj2, revolvingCreditProductIdentifier);
    }
}
