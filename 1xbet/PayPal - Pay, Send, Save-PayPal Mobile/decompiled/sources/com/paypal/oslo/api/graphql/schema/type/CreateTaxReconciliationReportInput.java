package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CreateTaxReconciliationReportInput;", "", "fiscalYear", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/CreateTaxReconciliationReportInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getFiscalYear"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateTaxReconciliationReportInput {
    private final java.lang.Object fiscalYear;

    public CreateTaxReconciliationReportInput(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.fiscalYear = obj;
    }

    public final java.lang.Object getFiscalYear() {
        return this.fiscalYear;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.fiscalYear;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateTaxReconciliationReportInput(fiscalYear=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.fiscalYear.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.api.graphql.schema.type.CreateTaxReconciliationReportInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiscalYear, ((com.paypal.oslo.api.graphql.schema.type.CreateTaxReconciliationReportInput) other).fiscalYear);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreateTaxReconciliationReportInput copy(java.lang.Object fiscalYear) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiscalYear, "");
        return new com.paypal.oslo.api.graphql.schema.type.CreateTaxReconciliationReportInput(fiscalYear);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getFiscalYear() {
        return this.fiscalYear;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CreateTaxReconciliationReportInput copy$default(com.paypal.oslo.api.graphql.schema.type.CreateTaxReconciliationReportInput createTaxReconciliationReportInput, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = createTaxReconciliationReportInput.fiscalYear;
        }
        return createTaxReconciliationReportInput.copy(obj);
    }
}
