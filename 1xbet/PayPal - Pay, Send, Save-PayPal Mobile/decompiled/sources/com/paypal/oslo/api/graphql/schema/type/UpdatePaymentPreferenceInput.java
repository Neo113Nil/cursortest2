package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdatePaymentPreferenceInput;", "", "", "financialInstrumentId", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentPreferenceType;", "preferenceType", "Lcom/apollographql/apollo/api/Optional;", "", "useBalanceFirst", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PaymentPreferenceType;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentPreferenceType;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PaymentPreferenceType;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/UpdatePaymentPreferenceInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFinancialInstrumentId", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentPreferenceType;", "getPreferenceType", "Lcom/apollographql/apollo/api/Optional;", "getUseBalanceFirst"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdatePaymentPreferenceInput {
    private final java.lang.String financialInstrumentId;
    private final com.paypal.oslo.api.graphql.schema.type.PaymentPreferenceType preferenceType;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> useBalanceFirst;

    public UpdatePaymentPreferenceInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.PaymentPreferenceType paymentPreferenceType, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentPreferenceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.financialInstrumentId = str;
        this.preferenceType = paymentPreferenceType;
        this.useBalanceFirst = optional;
    }

    public final java.lang.String getFinancialInstrumentId() {
        return this.financialInstrumentId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PaymentPreferenceType getPreferenceType() {
        return this.preferenceType;
    }

    public /* synthetic */ UpdatePaymentPreferenceInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.PaymentPreferenceType paymentPreferenceType, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, paymentPreferenceType, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getUseBalanceFirst() {
        return this.useBalanceFirst;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.financialInstrumentId;
        com.paypal.oslo.api.graphql.schema.type.PaymentPreferenceType paymentPreferenceType = this.preferenceType;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional = this.useBalanceFirst;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePaymentPreferenceInput(financialInstrumentId=");
        sb.append(str);
        sb.append(", preferenceType=");
        sb.append(paymentPreferenceType);
        sb.append(", useBalanceFirst=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.financialInstrumentId.hashCode() * 31) + this.preferenceType.hashCode()) * 31) + this.useBalanceFirst.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdatePaymentPreferenceInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdatePaymentPreferenceInput updatePaymentPreferenceInput = (com.paypal.oslo.api.graphql.schema.type.UpdatePaymentPreferenceInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentId, updatePaymentPreferenceInput.financialInstrumentId) && this.preferenceType == updatePaymentPreferenceInput.preferenceType && kotlin.jvm.internal.Intrinsics.areEqual(this.useBalanceFirst, updatePaymentPreferenceInput.useBalanceFirst);
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdatePaymentPreferenceInput copy(java.lang.String financialInstrumentId, com.paypal.oslo.api.graphql.schema.type.PaymentPreferenceType preferenceType, com.apollographql.apollo.api.Optional<java.lang.Boolean> useBalanceFirst) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferenceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useBalanceFirst, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdatePaymentPreferenceInput(financialInstrumentId, preferenceType, useBalanceFirst);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component3() {
        return this.useBalanceFirst;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PaymentPreferenceType getPreferenceType() {
        return this.preferenceType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFinancialInstrumentId() {
        return this.financialInstrumentId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdatePaymentPreferenceInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdatePaymentPreferenceInput updatePaymentPreferenceInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.PaymentPreferenceType paymentPreferenceType, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = updatePaymentPreferenceInput.financialInstrumentId;
        }
        if ((i & 2) != 0) {
            paymentPreferenceType = updatePaymentPreferenceInput.preferenceType;
        }
        if ((i & 4) != 0) {
            optional = updatePaymentPreferenceInput.useBalanceFirst;
        }
        return updatePaymentPreferenceInput.copy(str, paymentPreferenceType, optional);
    }
}
