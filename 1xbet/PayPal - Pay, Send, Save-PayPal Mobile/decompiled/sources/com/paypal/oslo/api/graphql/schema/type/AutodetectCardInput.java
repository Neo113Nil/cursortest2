package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J$\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AutodetectCardInput;", "", "cardNumber", "userCountryCode", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/AutodetectCardInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCardNumber", "getUserCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AutodetectCardInput {
    private final java.lang.Object cardNumber;
    private final java.lang.Object userCountryCode;

    public AutodetectCardInput(java.lang.Object obj, java.lang.Object obj2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        this.cardNumber = obj;
        this.userCountryCode = obj2;
    }

    public final java.lang.Object getCardNumber() {
        return this.cardNumber;
    }

    public final java.lang.Object getUserCountryCode() {
        return this.userCountryCode;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.cardNumber;
        java.lang.Object obj2 = this.userCountryCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutodetectCardInput(cardNumber=");
        sb.append(obj);
        sb.append(", userCountryCode=");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.cardNumber.hashCode() * 31) + this.userCountryCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.AutodetectCardInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.AutodetectCardInput autodetectCardInput = (com.paypal.oslo.api.graphql.schema.type.AutodetectCardInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cardNumber, autodetectCardInput.cardNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.userCountryCode, autodetectCardInput.userCountryCode);
    }

    public final com.paypal.oslo.api.graphql.schema.type.AutodetectCardInput copy(java.lang.Object cardNumber, java.lang.Object userCountryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userCountryCode, "");
        return new com.paypal.oslo.api.graphql.schema.type.AutodetectCardInput(cardNumber, userCountryCode);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getUserCountryCode() {
        return this.userCountryCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getCardNumber() {
        return this.cardNumber;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AutodetectCardInput copy$default(com.paypal.oslo.api.graphql.schema.type.AutodetectCardInput autodetectCardInput, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            obj = autodetectCardInput.cardNumber;
        }
        if ((i & 2) != 0) {
            obj2 = autodetectCardInput.userCountryCode;
        }
        return autodetectCardInput.copy(obj, obj2);
    }
}
