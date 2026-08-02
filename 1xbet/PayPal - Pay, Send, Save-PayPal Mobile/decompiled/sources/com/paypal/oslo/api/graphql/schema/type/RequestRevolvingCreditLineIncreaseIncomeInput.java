package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RequestRevolvingCreditLineIncreaseIncomeInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "amount", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditIncomePeriod;", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PERIOD, "Lcom/apollographql/apollo/api/Optional;", "revisedAmount", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditIncomePeriod;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditIncomePeriod;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditIncomePeriod;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/RequestRevolvingCreditLineIncreaseIncomeInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "getAmount", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditIncomePeriod;", "getPeriod", "Lcom/apollographql/apollo/api/Optional;", "getRevisedAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RequestRevolvingCreditLineIncreaseIncomeInput {
    private final com.paypal.oslo.api.graphql.schema.type.MoneyInput amount;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditIncomePeriod period;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> revisedAmount;

    public RequestRevolvingCreditLineIncreaseIncomeInput(com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditIncomePeriod revolvingCreditIncomePeriod, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditIncomePeriod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.amount = moneyInput;
        this.period = revolvingCreditIncomePeriod;
        this.revisedAmount = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MoneyInput getAmount() {
        return this.amount;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditIncomePeriod getPeriod() {
        return this.period;
    }

    public /* synthetic */ RequestRevolvingCreditLineIncreaseIncomeInput(com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditIncomePeriod revolvingCreditIncomePeriod, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(moneyInput, revolvingCreditIncomePeriod, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getRevisedAmount() {
        return this.revisedAmount;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput = this.amount;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditIncomePeriod revolvingCreditIncomePeriod = this.period;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional = this.revisedAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestRevolvingCreditLineIncreaseIncomeInput(amount=");
        sb.append(moneyInput);
        sb.append(", period=");
        sb.append(revolvingCreditIncomePeriod);
        sb.append(", revisedAmount=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.amount.hashCode() * 31) + this.period.hashCode()) * 31) + this.revisedAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RequestRevolvingCreditLineIncreaseIncomeInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RequestRevolvingCreditLineIncreaseIncomeInput requestRevolvingCreditLineIncreaseIncomeInput = (com.paypal.oslo.api.graphql.schema.type.RequestRevolvingCreditLineIncreaseIncomeInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, requestRevolvingCreditLineIncreaseIncomeInput.amount) && this.period == requestRevolvingCreditLineIncreaseIncomeInput.period && kotlin.jvm.internal.Intrinsics.areEqual(this.revisedAmount, requestRevolvingCreditLineIncreaseIncomeInput.revisedAmount);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RequestRevolvingCreditLineIncreaseIncomeInput copy(com.paypal.oslo.api.graphql.schema.type.MoneyInput amount, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditIncomePeriod period, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> revisedAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(period, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revisedAmount, "");
        return new com.paypal.oslo.api.graphql.schema.type.RequestRevolvingCreditLineIncreaseIncomeInput(amount, period, revisedAmount);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component3() {
        return this.revisedAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditIncomePeriod getPeriod() {
        return this.period;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MoneyInput getAmount() {
        return this.amount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RequestRevolvingCreditLineIncreaseIncomeInput copy$default(com.paypal.oslo.api.graphql.schema.type.RequestRevolvingCreditLineIncreaseIncomeInput requestRevolvingCreditLineIncreaseIncomeInput, com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditIncomePeriod revolvingCreditIncomePeriod, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            moneyInput = requestRevolvingCreditLineIncreaseIncomeInput.amount;
        }
        if ((i & 2) != 0) {
            revolvingCreditIncomePeriod = requestRevolvingCreditLineIncreaseIncomeInput.period;
        }
        if ((i & 4) != 0) {
            optional = requestRevolvingCreditLineIncreaseIncomeInput.revisedAmount;
        }
        return requestRevolvingCreditLineIncreaseIncomeInput.copy(moneyInput, revolvingCreditIncomePeriod, optional);
    }
}
