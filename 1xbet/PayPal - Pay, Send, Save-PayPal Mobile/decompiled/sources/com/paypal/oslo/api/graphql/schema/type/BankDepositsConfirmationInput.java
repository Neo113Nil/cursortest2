package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankDepositsConfirmationInput;", "", "", "depositAmount1", "depositAmount2", "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/BankDepositsConfirmationInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDepositAmount1", "getDepositAmount2", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BankDepositsConfirmationInput {
    private final java.lang.Object currencyCode;
    private final java.lang.String depositAmount1;
    private final java.lang.String depositAmount2;

    public BankDepositsConfirmationInput(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.depositAmount1 = str;
        this.depositAmount2 = str2;
        this.currencyCode = obj;
    }

    public final java.lang.String getDepositAmount1() {
        return this.depositAmount1;
    }

    public final java.lang.String getDepositAmount2() {
        return this.depositAmount2;
    }

    public final java.lang.Object getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.depositAmount1;
        java.lang.String str2 = this.depositAmount2;
        java.lang.Object obj = this.currencyCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BankDepositsConfirmationInput(depositAmount1=");
        sb.append(str);
        sb.append(", depositAmount2=");
        sb.append(str2);
        sb.append(", currencyCode=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.depositAmount1.hashCode() * 31) + this.depositAmount2.hashCode()) * 31) + this.currencyCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BankDepositsConfirmationInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BankDepositsConfirmationInput bankDepositsConfirmationInput = (com.paypal.oslo.api.graphql.schema.type.BankDepositsConfirmationInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.depositAmount1, bankDepositsConfirmationInput.depositAmount1) && kotlin.jvm.internal.Intrinsics.areEqual(this.depositAmount2, bankDepositsConfirmationInput.depositAmount2) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, bankDepositsConfirmationInput.currencyCode);
    }

    public final com.paypal.oslo.api.graphql.schema.type.BankDepositsConfirmationInput copy(java.lang.String depositAmount1, java.lang.String depositAmount2, java.lang.Object currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositAmount1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositAmount2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.api.graphql.schema.type.BankDepositsConfirmationInput(depositAmount1, depositAmount2, currencyCode);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDepositAmount2() {
        return this.depositAmount2;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDepositAmount1() {
        return this.depositAmount1;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BankDepositsConfirmationInput copy$default(com.paypal.oslo.api.graphql.schema.type.BankDepositsConfirmationInput bankDepositsConfirmationInput, java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = bankDepositsConfirmationInput.depositAmount1;
        }
        if ((i & 2) != 0) {
            str2 = bankDepositsConfirmationInput.depositAmount2;
        }
        if ((i & 4) != 0) {
            obj = bankDepositsConfirmationInput.currencyCode;
        }
        return bankDepositsConfirmationInput.copy(str, str2, obj);
    }
}
