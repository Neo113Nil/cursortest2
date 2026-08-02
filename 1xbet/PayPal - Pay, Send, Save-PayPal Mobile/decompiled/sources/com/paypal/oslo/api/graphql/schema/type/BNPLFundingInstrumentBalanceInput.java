package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLFundingInstrumentBalanceInput;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLFundingInstrumentType;", "fundingInstrumentType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BNPLFundingInstrumentType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLFundingInstrumentType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BNPLFundingInstrumentType;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLFundingInstrumentBalanceInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLFundingInstrumentType;", "getFundingInstrumentType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BNPLFundingInstrumentBalanceInput {
    private final com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentType fundingInstrumentType;
    private final java.lang.String id;

    public BNPLFundingInstrumentBalanceInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentType bNPLFundingInstrumentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLFundingInstrumentType, "");
        this.id = str;
        this.fundingInstrumentType = bNPLFundingInstrumentType;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentType getFundingInstrumentType() {
        return this.fundingInstrumentType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentType bNPLFundingInstrumentType = this.fundingInstrumentType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BNPLFundingInstrumentBalanceInput(id=");
        sb.append(str);
        sb.append(", fundingInstrumentType=");
        sb.append(bNPLFundingInstrumentType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.id.hashCode() * 31) + this.fundingInstrumentType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentBalanceInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentBalanceInput bNPLFundingInstrumentBalanceInput = (com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentBalanceInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, bNPLFundingInstrumentBalanceInput.id) && this.fundingInstrumentType == bNPLFundingInstrumentBalanceInput.fundingInstrumentType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentBalanceInput copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentType fundingInstrumentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentBalanceInput(id, fundingInstrumentType);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentType getFundingInstrumentType() {
        return this.fundingInstrumentType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentBalanceInput copy$default(com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentBalanceInput bNPLFundingInstrumentBalanceInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentType bNPLFundingInstrumentType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bNPLFundingInstrumentBalanceInput.id;
        }
        if ((i & 2) != 0) {
            bNPLFundingInstrumentType = bNPLFundingInstrumentBalanceInput.fundingInstrumentType;
        }
        return bNPLFundingInstrumentBalanceInput.copy(str, bNPLFundingInstrumentType);
    }
}
