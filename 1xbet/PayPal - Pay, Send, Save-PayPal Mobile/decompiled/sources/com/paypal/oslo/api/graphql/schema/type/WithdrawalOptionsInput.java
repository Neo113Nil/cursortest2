package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012JZ\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b'\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0015R\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b*\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalOptionsInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalSourceInput;", "source", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalDestinationInput;", "destination", "Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalTransferMethod;", "transferMethod", "Lcom/paypal/oslo/api/graphql/schema/type/CurrencyInput;", "amount", "Lcom/paypal/oslo/api/graphql/schema/type/TransferFlowContextInput;", "transferFlowContext", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalSourceInput;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/CurrencyInput;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalSourceInput;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/CurrencyInput;", "component5", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalSourceInput;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/CurrencyInput;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalOptionsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalSourceInput;", "getSource", "Lcom/apollographql/apollo/api/Optional;", "getDestination", "getTransferMethod", "Lcom/paypal/oslo/api/graphql/schema/type/CurrencyInput;", "getAmount", "getTransferFlowContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class WithdrawalOptionsInput {
    private final com.paypal.oslo.api.graphql.schema.type.CurrencyInput amount;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.WithdrawalDestinationInput> destination;
    private final com.paypal.oslo.api.graphql.schema.type.WithdrawalSourceInput source;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferFlowContextInput> transferFlowContext;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod> transferMethod;

    /* JADX WARN: Multi-variable type inference failed */
    public WithdrawalOptionsInput(com.paypal.oslo.api.graphql.schema.type.WithdrawalSourceInput withdrawalSourceInput, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.WithdrawalDestinationInput> optional, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod> optional2, com.paypal.oslo.api.graphql.schema.type.CurrencyInput currencyInput, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferFlowContextInput> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawalSourceInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.source = withdrawalSourceInput;
        this.destination = optional;
        this.transferMethod = optional2;
        this.amount = currencyInput;
        this.transferFlowContext = optional3;
    }

    public final com.paypal.oslo.api.graphql.schema.type.WithdrawalSourceInput getSource() {
        return this.source;
    }

    public /* synthetic */ WithdrawalOptionsInput(com.paypal.oslo.api.graphql.schema.type.WithdrawalSourceInput withdrawalSourceInput, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.paypal.oslo.api.graphql.schema.type.CurrencyInput currencyInput, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(withdrawalSourceInput, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, currencyInput, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.WithdrawalDestinationInput> getDestination() {
        return this.destination;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod> getTransferMethod() {
        return this.transferMethod;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CurrencyInput getAmount() {
        return this.amount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferFlowContextInput> getTransferFlowContext() {
        return this.transferFlowContext;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.WithdrawalSourceInput withdrawalSourceInput = this.source;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.WithdrawalDestinationInput> optional = this.destination;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod> optional2 = this.transferMethod;
        com.paypal.oslo.api.graphql.schema.type.CurrencyInput currencyInput = this.amount;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferFlowContextInput> optional3 = this.transferFlowContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WithdrawalOptionsInput(source=");
        sb.append(withdrawalSourceInput);
        sb.append(", destination=");
        sb.append(optional);
        sb.append(", transferMethod=");
        sb.append(optional2);
        sb.append(", amount=");
        sb.append(currencyInput);
        sb.append(", transferFlowContext=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.source.hashCode() * 31) + this.destination.hashCode()) * 31) + this.transferMethod.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.transferFlowContext.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.WithdrawalOptionsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.WithdrawalOptionsInput withdrawalOptionsInput = (com.paypal.oslo.api.graphql.schema.type.WithdrawalOptionsInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.source, withdrawalOptionsInput.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, withdrawalOptionsInput.destination) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferMethod, withdrawalOptionsInput.transferMethod) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, withdrawalOptionsInput.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferFlowContext, withdrawalOptionsInput.transferFlowContext);
    }

    public final com.paypal.oslo.api.graphql.schema.type.WithdrawalOptionsInput copy(com.paypal.oslo.api.graphql.schema.type.WithdrawalSourceInput source, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.WithdrawalDestinationInput> destination, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod> transferMethod, com.paypal.oslo.api.graphql.schema.type.CurrencyInput amount, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferFlowContextInput> transferFlowContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferFlowContext, "");
        return new com.paypal.oslo.api.graphql.schema.type.WithdrawalOptionsInput(source, destination, transferMethod, amount, transferFlowContext);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferFlowContextInput> component5() {
        return this.transferFlowContext;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CurrencyInput getAmount() {
        return this.amount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod> component3() {
        return this.transferMethod;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.WithdrawalDestinationInput> component2() {
        return this.destination;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.WithdrawalSourceInput getSource() {
        return this.source;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.WithdrawalOptionsInput copy$default(com.paypal.oslo.api.graphql.schema.type.WithdrawalOptionsInput withdrawalOptionsInput, com.paypal.oslo.api.graphql.schema.type.WithdrawalSourceInput withdrawalSourceInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.paypal.oslo.api.graphql.schema.type.CurrencyInput currencyInput, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            withdrawalSourceInput = withdrawalOptionsInput.source;
        }
        if ((i & 2) != 0) {
            optional = withdrawalOptionsInput.destination;
        }
        com.apollographql.apollo.api.Optional optional4 = optional;
        if ((i & 4) != 0) {
            optional2 = withdrawalOptionsInput.transferMethod;
        }
        com.apollographql.apollo.api.Optional optional5 = optional2;
        if ((i & 8) != 0) {
            currencyInput = withdrawalOptionsInput.amount;
        }
        com.paypal.oslo.api.graphql.schema.type.CurrencyInput currencyInput2 = currencyInput;
        if ((i & 16) != 0) {
            optional3 = withdrawalOptionsInput.transferFlowContext;
        }
        return withdrawalOptionsInput.copy(withdrawalSourceInput, optional4, optional5, currencyInput2, optional3);
    }
}
