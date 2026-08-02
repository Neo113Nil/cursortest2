package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJF\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLPaymentFundingInstrumentInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPaymentFundingInstrumentBankAccountInput;", "bankAccount", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPaymentFundingInstrumentCardInput;", "card", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPaymentFundingInstrumentBalanceInput;", "balance", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLPaymentFundingInstrumentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getBankAccount", "getCard", "getBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BNPLPaymentFundingInstrumentInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBalanceInput> balance;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBankAccountInput> bankAccount;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentCardInput> card;

    public BNPLPaymentFundingInstrumentInput(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBankAccountInput> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentCardInput> optional2, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBalanceInput> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.bankAccount = optional;
        this.card = optional2;
        this.balance = optional3;
    }

    public /* synthetic */ BNPLPaymentFundingInstrumentInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBankAccountInput> getBankAccount() {
        return this.bankAccount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentCardInput> getCard() {
        return this.card;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBalanceInput> getBalance() {
        return this.balance;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBankAccountInput> optional = this.bankAccount;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentCardInput> optional2 = this.card;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBalanceInput> optional3 = this.balance;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BNPLPaymentFundingInstrumentInput(bankAccount=");
        sb.append(optional);
        sb.append(", card=");
        sb.append(optional2);
        sb.append(", balance=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.bankAccount.hashCode() * 31) + this.card.hashCode()) * 31) + this.balance.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentInput bNPLPaymentFundingInstrumentInput = (com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccount, bNPLPaymentFundingInstrumentInput.bankAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.card, bNPLPaymentFundingInstrumentInput.card) && kotlin.jvm.internal.Intrinsics.areEqual(this.balance, bNPLPaymentFundingInstrumentInput.balance);
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentInput copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBankAccountInput> bankAccount, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentCardInput> card, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBalanceInput> balance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balance, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentInput(bankAccount, card, balance);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBalanceInput> component3() {
        return this.balance;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentCardInput> component2() {
        return this.card;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBankAccountInput> component1() {
        return this.bankAccount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentInput copy$default(com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentInput bNPLPaymentFundingInstrumentInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = bNPLPaymentFundingInstrumentInput.bankAccount;
        }
        if ((i & 2) != 0) {
            optional2 = bNPLPaymentFundingInstrumentInput.card;
        }
        if ((i & 4) != 0) {
            optional3 = bNPLPaymentFundingInstrumentInput.balance;
        }
        return bNPLPaymentFundingInstrumentInput.copy(optional, optional2, optional3);
    }

    public BNPLPaymentFundingInstrumentInput() {
        this(null, null, null, 7, null);
    }
}
