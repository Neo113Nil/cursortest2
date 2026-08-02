package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLPaymentFundingInstrumentBankAccountInput;", "", "", "bankAccountId", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "type", "name", "lastNChars", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "component3", "component4", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLPaymentFundingInstrumentBankAccountInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBankAccountId", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "getType", "getName", "Ljava/lang/Object;", "getLastNChars"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BNPLPaymentFundingInstrumentBankAccountInput {
    private final java.lang.String bankAccountId;
    private final java.lang.Object lastNChars;
    private final java.lang.String name;
    private final com.paypal.oslo.api.graphql.schema.type.BankAccountType type;

    public BNPLPaymentFundingInstrumentBankAccountInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, java.lang.String str2, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.bankAccountId = str;
        this.type = bankAccountType;
        this.name = str2;
        this.lastNChars = obj;
    }

    public final java.lang.String getBankAccountId() {
        return this.bankAccountId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
        return this.type;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.Object getLastNChars() {
        return this.lastNChars;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.bankAccountId;
        com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = this.type;
        java.lang.String str2 = this.name;
        java.lang.Object obj = this.lastNChars;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BNPLPaymentFundingInstrumentBankAccountInput(bankAccountId=");
        sb.append(str);
        sb.append(", type=");
        sb.append(bankAccountType);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", lastNChars=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.bankAccountId.hashCode() * 31) + this.type.hashCode()) * 31) + this.name.hashCode()) * 31) + this.lastNChars.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBankAccountInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBankAccountInput bNPLPaymentFundingInstrumentBankAccountInput = (com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBankAccountInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountId, bNPLPaymentFundingInstrumentBankAccountInput.bankAccountId) && this.type == bNPLPaymentFundingInstrumentBankAccountInput.type && kotlin.jvm.internal.Intrinsics.areEqual(this.name, bNPLPaymentFundingInstrumentBankAccountInput.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, bNPLPaymentFundingInstrumentBankAccountInput.lastNChars);
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBankAccountInput copy(java.lang.String bankAccountId, com.paypal.oslo.api.graphql.schema.type.BankAccountType type, java.lang.String name2, java.lang.Object lastNChars) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBankAccountInput(bankAccountId, type, name2, lastNChars);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Object getLastNChars() {
        return this.lastNChars;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getBankAccountId() {
        return this.bankAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBankAccountInput copy$default(com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBankAccountInput bNPLPaymentFundingInstrumentBankAccountInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, java.lang.String str2, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = bNPLPaymentFundingInstrumentBankAccountInput.bankAccountId;
        }
        if ((i & 2) != 0) {
            bankAccountType = bNPLPaymentFundingInstrumentBankAccountInput.type;
        }
        if ((i & 4) != 0) {
            str2 = bNPLPaymentFundingInstrumentBankAccountInput.name;
        }
        if ((i & 8) != 0) {
            obj = bNPLPaymentFundingInstrumentBankAccountInput.lastNChars;
        }
        return bNPLPaymentFundingInstrumentBankAccountInput.copy(str, bankAccountType, str2, obj);
    }
}
