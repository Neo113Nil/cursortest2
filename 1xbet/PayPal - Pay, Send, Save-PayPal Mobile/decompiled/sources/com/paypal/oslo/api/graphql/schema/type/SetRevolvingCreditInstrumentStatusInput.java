package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b!\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SetRevolvingCreditInstrumentStatusInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "creditProductIdentifier", "creditAccountId", "creditInstrumentId", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentStatus;", "status", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "component2", "()Ljava/lang/Object;", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentStatus;)Lcom/paypal/oslo/api/graphql/schema/type/SetRevolvingCreditInstrumentStatusInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/lang/Object;", "getCreditAccountId", "getCreditInstrumentId", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SetRevolvingCreditInstrumentStatusInput {
    private final java.lang.Object creditAccountId;
    private final java.lang.Object creditInstrumentId;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus status;

    public SetRevolvingCreditInstrumentStatusInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus revolvingCreditInstrumentStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditInstrumentStatus, "");
        this.creditProductIdentifier = revolvingCreditProductIdentifier;
        this.creditAccountId = obj;
        this.creditInstrumentId = obj2;
        this.status = revolvingCreditInstrumentStatus;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.lang.Object getCreditInstrumentId() {
        return this.creditInstrumentId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus getStatus() {
        return this.status;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier = this.creditProductIdentifier;
        java.lang.Object obj = this.creditAccountId;
        java.lang.Object obj2 = this.creditInstrumentId;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus revolvingCreditInstrumentStatus = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SetRevolvingCreditInstrumentStatusInput(creditProductIdentifier=");
        sb.append(revolvingCreditProductIdentifier);
        sb.append(", creditAccountId=");
        sb.append(obj);
        sb.append(", creditInstrumentId=");
        sb.append(obj2);
        sb.append(", status=");
        sb.append(revolvingCreditInstrumentStatus);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.creditProductIdentifier.hashCode() * 31) + this.creditAccountId.hashCode()) * 31) + this.creditInstrumentId.hashCode()) * 31) + this.status.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.SetRevolvingCreditInstrumentStatusInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.SetRevolvingCreditInstrumentStatusInput setRevolvingCreditInstrumentStatusInput = (com.paypal.oslo.api.graphql.schema.type.SetRevolvingCreditInstrumentStatusInput) other;
        return this.creditProductIdentifier == setRevolvingCreditInstrumentStatusInput.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, setRevolvingCreditInstrumentStatusInput.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditInstrumentId, setRevolvingCreditInstrumentStatusInput.creditInstrumentId) && this.status == setRevolvingCreditInstrumentStatusInput.status;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SetRevolvingCreditInstrumentStatusInput copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier, java.lang.Object creditAccountId, java.lang.Object creditInstrumentId, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditInstrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.api.graphql.schema.type.SetRevolvingCreditInstrumentStatusInput(creditProductIdentifier, creditAccountId, creditInstrumentId, status);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getCreditInstrumentId() {
        return this.creditInstrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.SetRevolvingCreditInstrumentStatusInput copy$default(com.paypal.oslo.api.graphql.schema.type.SetRevolvingCreditInstrumentStatusInput setRevolvingCreditInstrumentStatusInput, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus revolvingCreditInstrumentStatus, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            revolvingCreditProductIdentifier = setRevolvingCreditInstrumentStatusInput.creditProductIdentifier;
        }
        if ((i & 2) != 0) {
            obj = setRevolvingCreditInstrumentStatusInput.creditAccountId;
        }
        if ((i & 4) != 0) {
            obj2 = setRevolvingCreditInstrumentStatusInput.creditInstrumentId;
        }
        if ((i & 8) != 0) {
            revolvingCreditInstrumentStatus = setRevolvingCreditInstrumentStatusInput.status;
        }
        return setRevolvingCreditInstrumentStatusInput.copy(revolvingCreditProductIdentifier, obj, obj2, revolvingCreditInstrumentStatus);
    }
}
