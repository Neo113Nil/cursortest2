package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/EnrollInRevolvingCreditPaymentSecurityInput;", "", "creditAccountId", "", "enroll", "<init>", "(Ljava/lang/Object;Z)V", "component1", "()Ljava/lang/Object;", "component2", "()Z", "copy", "(Ljava/lang/Object;Z)Lcom/paypal/oslo/api/graphql/schema/type/EnrollInRevolvingCreditPaymentSecurityInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCreditAccountId", "Z", "getEnroll"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EnrollInRevolvingCreditPaymentSecurityInput {
    private final java.lang.Object creditAccountId;
    private final boolean enroll;

    public EnrollInRevolvingCreditPaymentSecurityInput(java.lang.Object obj, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.creditAccountId = obj;
        this.enroll = z;
    }

    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public final boolean getEnroll() {
        return this.enroll;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.creditAccountId;
        boolean z = this.enroll;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EnrollInRevolvingCreditPaymentSecurityInput(creditAccountId=");
        sb.append(obj);
        sb.append(", enroll=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.creditAccountId.hashCode() * 31) + java.lang.Boolean.hashCode(this.enroll);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.EnrollInRevolvingCreditPaymentSecurityInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.EnrollInRevolvingCreditPaymentSecurityInput enrollInRevolvingCreditPaymentSecurityInput = (com.paypal.oslo.api.graphql.schema.type.EnrollInRevolvingCreditPaymentSecurityInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, enrollInRevolvingCreditPaymentSecurityInput.creditAccountId) && this.enroll == enrollInRevolvingCreditPaymentSecurityInput.enroll;
    }

    public final com.paypal.oslo.api.graphql.schema.type.EnrollInRevolvingCreditPaymentSecurityInput copy(java.lang.Object creditAccountId, boolean enroll) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        return new com.paypal.oslo.api.graphql.schema.type.EnrollInRevolvingCreditPaymentSecurityInput(creditAccountId, enroll);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnroll() {
        return this.enroll;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.EnrollInRevolvingCreditPaymentSecurityInput copy$default(com.paypal.oslo.api.graphql.schema.type.EnrollInRevolvingCreditPaymentSecurityInput enrollInRevolvingCreditPaymentSecurityInput, java.lang.Object obj, boolean z, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = enrollInRevolvingCreditPaymentSecurityInput.creditAccountId;
        }
        if ((i & 2) != 0) {
            z = enrollInRevolvingCreditPaymentSecurityInput.enroll;
        }
        return enrollInRevolvingCreditPaymentSecurityInput.copy(obj, z);
    }
}
